package l;

/* JADX INFO: renamed from: l.ۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9304 implements InterfaceC0685 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC6323 f30237;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7068 f30238;

    public C9304(C7068 c7068, AbstractC6323 abstractC6323) {
        C15243.m36590(abstractC6323, "onBackPressedCallback");
        this.f30238 = c7068;
        this.f30237 = abstractC6323;
    }

    @Override // l.InterfaceC0685
    public final void cancel() {
        C7068 c7068 = this.f30238;
        C14454 c14454 = c7068.f23284;
        AbstractC6323 abstractC6323 = this.f30237;
        c14454.remove(abstractC6323);
        if (C15243.m36589(c7068.f23288, abstractC6323)) {
            abstractC6323.getClass();
            c7068.f23288 = null;
        }
        abstractC6323.m18047(this);
        InterfaceC19479 interfaceC19479M18042 = abstractC6323.m18042();
        if (interfaceC19479M18042 != null) {
            interfaceC19479M18042.mo4064();
        }
        abstractC6323.m18044((InterfaceC19479) null);
    }
}
