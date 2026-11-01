package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܽۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4EU */
/* JADX INFO: loaded from: classes4.dex */
public class C16627 extends C20591 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final long f53345;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C16627 f53346;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final long f53347;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f53348;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f53349;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16627 f53350;

    /* JADX INFO: renamed from: ۘ */
    public void mo3458() {
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f53347 = millis;
        f53345 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m39092() {
        C16627 c16627;
        if (this.f53349) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jMo9655 = mo9655();
        boolean zMo9647 = mo9647();
        if (jMo9655 != 0 || zMo9647) {
            this.f53349 = true;
            synchronized (C16627.class) {
                if (f53346 == null) {
                    f53346 = new C16627();
                    C0398 c0398 = new C0398("Okio Watchdog");
                    c0398.setDaemon(true);
                    c0398.start();
                }
                long jNanoTime = System.nanoTime();
                if (jMo9655 != 0 && zMo9647) {
                    this.f53348 = Math.min(jMo9655, mo9651() - jNanoTime) + jNanoTime;
                } else if (jMo9655 != 0) {
                    this.f53348 = jMo9655 + jNanoTime;
                } else {
                    if (!zMo9647) {
                        throw new AssertionError();
                    }
                    this.f53348 = mo9651();
                }
                long j = this.f53348 - jNanoTime;
                C16627 c16628 = f53346;
                while (true) {
                    c16627 = c16628.f53350;
                    if (c16627 == null || j < c16627.f53348 - jNanoTime) {
                        break;
                        break;
                    }
                    c16628 = c16627;
                }
                this.f53350 = c16627;
                c16628.f53350 = this;
                if (c16628 == f53346) {
                    C16627.class.notify();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m39094() {
        if (!this.f53349) {
            return false;
        }
        this.f53349 = false;
        synchronized (C16627.class) {
            C16627 c16627 = f53346;
            while (c16627 != null) {
                C16627 c16628 = c16627.f53350;
                if (c16628 == this) {
                    c16627.f53350 = this.f53350;
                    this.f53350 = null;
                    return false;
                }
                c16627 = c16628;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39093(boolean z) throws IOException {
        if (m39094() && z) {
            throw mo16598((IOException) null);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public IOException mo16598(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(b.n0);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C16627 m39091() throws InterruptedException {
        C16627 c16627 = f53346.f53350;
        if (c16627 == null) {
            long jNanoTime = System.nanoTime();
            C16627.class.wait(f53347);
            if (f53346.f53350 != null || System.nanoTime() - jNanoTime < f53345) {
                return null;
            }
            return f53346;
        }
        long jNanoTime2 = c16627.f53348 - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            C16627.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        f53346.f53350 = c16627.f53350;
        c16627.f53350 = null;
        return c16627;
    }
}
