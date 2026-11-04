package l;

/* JADX INFO: renamed from: l.֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1102 implements InterfaceC5252, InterfaceC0685 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7068 f3919;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC0685 f3920;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC6323 f3921;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC8585 f3922;

    public C1102(C7068 c7068, AbstractC8585 abstractC8585, AbstractC6323 abstractC6323) {
        C15243.m36590(abstractC6323, "onBackPressedCallback");
        this.f3919 = c7068;
        this.f3922 = abstractC8585;
        this.f3921 = abstractC6323;
        abstractC8585.mo23077(this);
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_START) {
            this.f3920 = this.f3919.m19400(this.f3921);
            return;
        }
        if (enumC9330 == EnumC9330.ON_STOP) {
            InterfaceC0685 interfaceC0685 = this.f3920;
            if (interfaceC0685 != null) {
                ((C9304) interfaceC0685).cancel();
                return;
            }
            return;
        }
        if (enumC9330 == EnumC9330.ON_DESTROY) {
            cancel();
        }
    }

    @Override // l.InterfaceC0685
    public final void cancel() {
        this.f3922.mo23078(this);
        this.f3921.m18047(this);
        InterfaceC0685 interfaceC0685 = this.f3920;
        if (interfaceC0685 != null) {
            ((C9304) interfaceC0685).cancel();
        }
        this.f3920 = null;
    }
}
