package l;

/* JADX INFO: renamed from: l.ܽ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: VANM */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17847 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Runnable f58539;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16355 f58540;

    public RunnableC17847(C16355 c16355, Runnable runnable) {
        this.f58540 = c16355;
        this.f58539 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.f58539.run();
            } catch (Throwable th) {
                C9254.m24437(th, C24963.f80840);
            }
            C16355 c16355 = this.f58540;
            Runnable runnableM38852 = c16355.m38852();
            if (runnableM38852 == null) {
                return;
            }
            this.f58539 = runnableM38852;
            i++;
            if (i >= 16 && c16355.f53101.mo42813()) {
                c16355.f53101.mo11210(c16355, this);
                return;
            }
        }
    }
}
