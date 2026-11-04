package l;

import com.alipay.sdk.m.o.b;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩷᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4ET */
/* JADX INFO: loaded from: classes.dex */
public class C22411 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C22411 f72586 = new C5257();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f72587;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f72588;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72589;

    /* JADX INFO: renamed from: ᩷ */
    public C22411 mo15814(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j < 0) {
            throw new IllegalArgumentException(C24770.m55292(j, "timeout < 0: "));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f72588 = timeUnit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long mo50551() {
        return this.f72588;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean mo50553() {
        return this.f72589;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long mo50550() {
        if (!this.f72589) {
            throw new IllegalStateException("No deadline");
        }
        return this.f72587;
    }

    /* JADX INFO: renamed from: ۙ */
    public C22411 mo15812(long j) {
        this.f72589 = true;
        this.f72587 = j;
        return this;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22411 mo50552() {
        this.f72588 = 0L;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22411 mo50548() {
        this.f72589 = false;
        return this;
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo15813() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f72589 && this.f72587 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50549(Object obj) throws InterruptedIOException {
        try {
            boolean zMo50553 = mo50553();
            long jMo50551 = mo50551();
            long jNanoTime = 0;
            if (!zMo50553 && jMo50551 == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zMo50553 && jMo50551 != 0) {
                jMo50551 = Math.min(jMo50551, mo50550() - jNanoTime2);
            } else if (zMo50553) {
                jMo50551 = mo50550() - jNanoTime2;
            }
            if (jMo50551 > 0) {
                long j = jMo50551 / 1000000;
                Long.signum(j);
                obj.wait(j, (int) (jMo50551 - (1000000 * j)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jMo50551) {
                throw new InterruptedIOException(b.n0);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
