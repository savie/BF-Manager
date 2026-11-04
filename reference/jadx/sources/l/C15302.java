package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܳۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4EU */
/* JADX INFO: loaded from: classes5.dex */
public class C15302 extends C22411 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final long f50023;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final long f50024;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15302 f50025;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f50026;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15302 f50027;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f50028;

    /* JADX INFO: renamed from: ֫ */
    public void mo5606() {
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f50024 = millis;
        f50023 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m36749() {
        C15302 c15302;
        if (this.f50028) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jMo50551 = mo50551();
        boolean zMo50553 = mo50553();
        if (jMo50551 != 0 || zMo50553) {
            this.f50028 = true;
            synchronized (C15302.class) {
                if (f50025 == null) {
                    f50025 = new C15302();
                    C19778 c19778 = new C19778("Okio Watchdog");
                    c19778.setDaemon(true);
                    c19778.start();
                }
                long jNanoTime = System.nanoTime();
                if (jMo50551 != 0 && zMo50553) {
                    this.f50026 = Math.min(jMo50551, mo50550() - jNanoTime) + jNanoTime;
                } else if (jMo50551 != 0) {
                    this.f50026 = jMo50551 + jNanoTime;
                } else {
                    if (!zMo50553) {
                        throw new AssertionError();
                    }
                    this.f50026 = mo50550();
                }
                long j = this.f50026 - jNanoTime;
                C15302 c15303 = f50025;
                while (true) {
                    c15302 = c15303.f50027;
                    if (c15302 == null || j < c15302.f50026 - jNanoTime) {
                        break;
                        break;
                    }
                    c15303 = c15302;
                }
                this.f50027 = c15302;
                c15303.f50027 = this;
                if (c15303 == f50025) {
                    C15302.class.notify();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m36748() {
        if (!this.f50028) {
            return false;
        }
        this.f50028 = false;
        synchronized (C15302.class) {
            C15302 c15302 = f50025;
            while (c15302 != null) {
                C15302 c15303 = c15302.f50027;
                if (c15303 == this) {
                    c15302.f50027 = this.f50027;
                    this.f50027 = null;
                    return false;
                }
                c15302 = c15303;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36747(boolean z) throws IOException {
        if (m36748() && z) {
            throw mo5607((IOException) null);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public IOException mo5607(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(b.n0);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15302 m36746() throws InterruptedException {
        C15302 c15302 = f50025.f50027;
        if (c15302 == null) {
            long jNanoTime = System.nanoTime();
            C15302.class.wait(f50024);
            if (f50025.f50027 != null || System.nanoTime() - jNanoTime < f50023) {
                return null;
            }
            return f50025;
        }
        long jNanoTime2 = c15302.f50026 - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            C15302.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        f50025.f50027 = c15302.f50027;
        c15302.f50027 = null;
        return c15302;
    }
}
