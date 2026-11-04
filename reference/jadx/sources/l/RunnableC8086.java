package l;

/* JADX INFO: renamed from: l.۟ᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54FG */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8086 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19273 f26747;

    public RunnableC8086(C19273 c19273) {
        this.f26747 = c19273;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            long jM44615 = this.f26747.m44615(System.nanoTime());
            if (jM44615 == -1) {
                return;
            }
            if (jM44615 > 0) {
                long j = jM44615 / 1000000;
                long j2 = jM44615 - (1000000 * j);
                synchronized (this.f26747) {
                    try {
                        this.f26747.wait(j, (int) j2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
