package l;

/* JADX INFO: renamed from: l.ۜۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FG */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6677 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22906 f22536;

    public RunnableC6677(C22906 c22906) {
        this.f22536 = c22906;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            long jM50685 = this.f22536.m50685(System.nanoTime());
            if (jM50685 == -1) {
                return;
            }
            if (jM50685 > 0) {
                long j = jM50685 / 1000000;
                long j2 = jM50685 - (1000000 * j);
                synchronized (this.f22536) {
                    try {
                        this.f22536.wait(j, (int) j2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
