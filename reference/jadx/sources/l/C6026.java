package l;

/* JADX INFO: renamed from: l.ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6026 implements InterfaceC16672 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC19432 f20491;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14494 f20492;

    public C6026(C14494 c14494, AbstractC19432 abstractC19432) {
        C13465.m32966(abstractC19432, "onBackPressedCallback");
        this.f20492 = c14494;
        this.f20491 = abstractC19432;
    }

    @Override // l.InterfaceC16672
    public final void cancel() {
        C14494 c14494 = this.f20492;
        C14378 c14378 = c14494.f47480;
        AbstractC19432 abstractC19432 = this.f20491;
        c14378.remove(abstractC19432);
        if (C13465.m32965(c14494.f47481, abstractC19432)) {
            abstractC19432.getClass();
            c14494.f47481 = null;
        }
        abstractC19432.m44477(this);
        InterfaceC4871 interfaceC4871M44472 = abstractC19432.m44472();
        if (interfaceC4871M44472 != null) {
            interfaceC4871M44472.mo3788();
        }
        abstractC19432.m44473((InterfaceC4871) null);
    }
}
