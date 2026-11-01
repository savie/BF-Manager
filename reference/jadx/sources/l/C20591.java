package l;

import com.alipay.sdk.m.o.b;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩷ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4ET */
/* JADX INFO: loaded from: classes4.dex */
public class C20591 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C20591 f67091 = new C7185();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f67092;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f67093;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f67094;

    /* JADX INFO: renamed from: ܰ */
    public C20591 mo9654(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j < 0) {
            throw new IllegalArgumentException(C15489.m37074(j, "timeout < 0: "));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f67093 = timeUnit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: ᩹ */
    public long mo9655() {
        return this.f67093;
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo9647() {
        return this.f67094;
    }

    /* JADX INFO: renamed from: ۨ */
    public long mo9651() {
        if (!this.f67094) {
            throw new IllegalStateException("No deadline");
        }
        return this.f67092;
    }

    /* JADX INFO: renamed from: ۙ */
    public C20591 mo9649(long j) {
        this.f67094 = true;
        this.f67092 = j;
        return this;
    }

    /* JADX INFO: renamed from: ܰ */
    public C20591 mo9653() {
        this.f67093 = 0L;
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public C20591 mo9648() {
        this.f67094 = false;
        return this;
    }

    /* JADX INFO: renamed from: ۚ */
    public void mo9650() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f67094 && this.f67092 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46454(Object obj) throws InterruptedIOException {
        try {
            boolean zMo9647 = mo9647();
            long jMo9655 = mo9655();
            long jNanoTime = 0;
            if (!zMo9647 && jMo9655 == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zMo9647 && jMo9655 != 0) {
                jMo9655 = Math.min(jMo9655, mo9651() - jNanoTime2);
            } else if (zMo9647) {
                jMo9655 = mo9651() - jNanoTime2;
            }
            if (jMo9655 > 0) {
                long j = jMo9655 / 1000000;
                Long.signum(j);
                obj.wait(j, (int) (jMo9655 - (1000000 * j)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jMo9655) {
                throw new InterruptedIOException(b.n0);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
