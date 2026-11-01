package l;

/* JADX INFO: renamed from: l.ۖ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: VANM */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2858 extends AbstractC12405 implements Runnable, InterfaceC5493 {
    public volatile int runningWorkers;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5493 f10792;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Object f10793;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f10794;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12405 f10795;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7092 f10796;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC2858(AbstractC12405 abstractC12405, int i) {
        this.f10795 = abstractC12405;
        this.f10794 = i;
        InterfaceC5493 interfaceC5493 = abstractC12405 instanceof InterfaceC5493 ? (InterfaceC5493) abstractC12405 : null;
        this.f10792 = interfaceC5493 == null ? C2670.m8215() : interfaceC5493;
        this.f10796 = new C7092();
        this.f10793 = new Object();
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            int i = 0;
            while (true) {
                Runnable runnable = (Runnable) this.f10796.m18964();
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        C23694.m52151(th, C1218.f5350);
                    }
                    i++;
                    if (i >= 16 && this.f10795.mo30859()) {
                        this.f10795.mo8623(this, this);
                        return;
                    }
                }
            }
            synchronized (this.f10793) {
                this.runningWorkers--;
                if (this.f10796.m18965() == 0) {
                    return;
                }
                this.runningWorkers++;
                C7321 c7321 = C7321.f24318;
            }
        }
    }

    @Override // l.AbstractC12405
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8623(InterfaceC22386 interfaceC22386, Runnable runnable) {
        this.f10796.m18963(runnable);
        if (this.runningWorkers >= this.f10794) {
            return;
        }
        synchronized (this.f10793) {
            if (this.runningWorkers >= this.f10794) {
                return;
            }
            this.runningWorkers++;
            this.f10795.mo8623(this, this);
        }
    }
}
