package l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.᩸ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes.dex */
public final class C22944 extends AbstractRunnableC11009 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f74548;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f74549;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f74550;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f74551;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile Thread f74552 = Thread.currentThread();

    public C22944(long j, long j2, boolean z) {
        this.f74550 = z;
        this.f74549 = j;
        this.f74551 = j2;
    }

    @Override // l.AbstractRunnableC11009
    /* JADX INFO: renamed from: ۙ */
    public final FutureC23690 mo7115(int i) {
        Thread thread = this.f74552;
        if (thread != null) {
            this.f74552 = null;
            LockSupport.unpark(thread);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f A[RETURN] */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m51750() {
        if (Thread.interrupted()) {
            this.f74548 = true;
        }
        if (!this.f74548 || !this.f74550) {
            long j = this.f74551;
            if (j == 0) {
                if (this.f74552 == null) {
                    return false;
                }
            } else if (this.f74549 > 0) {
                long jNanoTime = j - System.nanoTime();
                this.f74549 = jNanoTime;
                if (jNanoTime > 0) {
                    if (this.f74552 == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // l.AbstractRunnableC11009
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo16890() {
        return this.f74552 != null;
    }
}
