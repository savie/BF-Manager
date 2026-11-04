package l;

/* JADX INFO: renamed from: l.ܺ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17119 implements InterfaceC0073 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f55857;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f55858;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC0361 f55859;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f55860;

    public C17119(RunnableC0361 runnableC0361, DialogInterfaceC8327 dialogInterfaceC8327, AbstractActivityC17204 abstractActivityC17204, C23255 c23255) {
        this.f55859 = runnableC0361;
        this.f55860 = dialogInterfaceC8327;
        this.f55858 = abstractActivityC17204;
        this.f55857 = c23255;
    }

    @Override // l.InterfaceC0073
    /* JADX INFO: renamed from: ۙ */
    public final void mo1128(String str) {
        this.f55859.run();
        if (this.f55860.m22434()) {
            AbstractActivityC17204 abstractActivityC17204 = this.f55858;
            if (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) {
                return;
            }
            if (str.length() > 1 && str.endsWith("/")) {
                str = C1402.m5124(1, 0, str);
            }
            C23255 c23255 = this.f55857;
            c23255.mo52335((CharSequence) str);
            c23255.mo52339(c23255.m54099());
        }
    }

    @Override // l.InterfaceC0073
    /* JADX INFO: renamed from: ۙ */
    public final void mo1127() {
        this.f55859.run();
    }
}
