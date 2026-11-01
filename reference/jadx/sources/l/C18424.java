package l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ᩴ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C18424 extends AbstractRunnableC17718 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f58741;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile Thread f58742 = Thread.currentThread();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f58743;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f58744;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f58745;

    public C18424(long j, long j2, boolean z) {
        this.f58741 = z;
        this.f58743 = j;
        this.f58745 = j2;
    }

    @Override // l.AbstractRunnableC17718
    /* JADX INFO: renamed from: ۙ */
    public final FutureC12075 mo1013(int i) {
        Thread thread = this.f58742;
        if (thread != null) {
            this.f58742 = null;
            LockSupport.unpark(thread);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f A[RETURN] */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m42746() {
        if (Thread.interrupted()) {
            this.f58744 = true;
        }
        if (!this.f58744 || !this.f58741) {
            long j = this.f58745;
            if (j == 0) {
                if (this.f58742 == null) {
                    return false;
                }
            } else if (this.f58743 > 0) {
                long jNanoTime = j - System.nanoTime();
                this.f58743 = jNanoTime;
                if (jNanoTime > 0) {
                    if (this.f58742 == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // l.AbstractRunnableC17718
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo25178() {
        return this.f58742 != null;
    }
}
