package l;

/* JADX INFO: renamed from: l.ܿۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17315 implements InterfaceC5657, InterfaceC16672 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC19432 f55092;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC16672 f55093;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14494 f55094;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC3062 f55095;

    public C17315(C14494 c14494, AbstractC3062 abstractC3062, AbstractC19432 abstractC19432) {
        C13465.m32966(abstractC19432, "onBackPressedCallback");
        this.f55094 = c14494;
        this.f55095 = abstractC3062;
        this.f55092 = abstractC19432;
        abstractC3062.mo9171(this);
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_START) {
            this.f55093 = this.f55094.m34905(this.f55092);
            return;
        }
        if (enumC1651 == EnumC1651.ON_STOP) {
            InterfaceC16672 interfaceC16672 = this.f55093;
            if (interfaceC16672 != null) {
                ((C6026) interfaceC16672).cancel();
                return;
            }
            return;
        }
        if (enumC1651 == EnumC1651.ON_DESTROY) {
            cancel();
        }
    }

    @Override // l.InterfaceC16672
    public final void cancel() {
        this.f55095.mo9172(this);
        this.f55092.m44477(this);
        InterfaceC16672 interfaceC16672 = this.f55093;
        if (interfaceC16672 != null) {
            ((C6026) interfaceC16672).cancel();
        }
        this.f55093 = null;
    }
}
