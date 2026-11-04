package l;

/* JADX INFO: renamed from: l.᩵ܺۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2SQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20674 extends C16198 implements InterfaceC1702, InterfaceC21839 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C3630 f66288;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12469 f66289;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3630 f66290;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C21530 f66291;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20674(C12469 c12469, InterfaceC1702 interfaceC1702) {
        super(c12469, interfaceC1702);
        this.f66289 = c12469;
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ۙ */
    public final int mo6062() {
        return ((InterfaceC1702) this.f52580).mo6062();
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC22759 mo6063() {
        C3630 c3630 = this.f66290;
        return c3630 != null ? c3630 : ((InterfaceC1702) this.f52580).mo6063();
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC19775 mo6065() {
        C21530 c21530 = this.f66291;
        if (c21530 != null) {
            return c21530;
        }
        InterfaceC19775 interfaceC19775Mo6065 = ((InterfaceC1702) this.f52580).mo6065();
        if (interfaceC19775Mo6065 == null) {
            return null;
        }
        return new C8762(this.f66289.f40053.m54589(), interfaceC19775Mo6065);
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC22759 mo6064() {
        C3630 c3630 = this.f66288;
        return c3630 != null ? c3630 : ((InterfaceC1702) this.f52580).mo6064();
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        InterfaceC19775 interfaceC19775Mo6065 = mo6065();
        if (interfaceC19775Mo6065 != null) {
            this.f66291 = c8850.f74939.m35671(interfaceC19775Mo6065.getType());
        }
        InterfaceC22759 interfaceC22759Mo6063 = mo6063();
        if (interfaceC22759Mo6063 != null) {
            this.f66290 = c8850.m23719(interfaceC22759Mo6063.getString());
        }
        InterfaceC22759 interfaceC22759Mo6064 = mo6064();
        if (interfaceC22759Mo6064 != null) {
            this.f66288 = c8850.m23719(interfaceC22759Mo6064.getString());
        }
    }
}
