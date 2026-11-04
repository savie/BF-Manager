package l;

/* JADX INFO: renamed from: l.᩻ۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35M1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24801 extends AbstractC16113 implements InterfaceC1702, InterfaceC21839 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC22759 f80250;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC19775 f80251;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f80252;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC22759 f80253;

    @Override // l.InterfaceC10650
    /* JADX INFO: renamed from: ۤ */
    public final int mo4171() {
        return 3;
    }

    public C24801(int i, InterfaceC22759 interfaceC22759, InterfaceC19775 interfaceC19775, InterfaceC22759 interfaceC227510) {
        this.f80252 = i;
        this.f80253 = interfaceC22759;
        this.f80251 = interfaceC19775;
        this.f80250 = interfaceC227510;
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ۙ */
    public final int mo6062() {
        return this.f80252;
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC22759 mo6063() {
        return this.f80253;
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC19775 mo6065() {
        return this.f80251;
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC22759 mo6064() {
        return this.f80250;
    }

    @Override // l.InterfaceC15125
    public final String getName() {
        InterfaceC22759 interfaceC22759 = this.f80253;
        if (interfaceC22759 == null) {
            return null;
        }
        return interfaceC22759.getString();
    }

    @Override // l.InterfaceC15125
    public final String getType() {
        InterfaceC19775 interfaceC19775 = this.f80251;
        if (interfaceC19775 == null) {
            return null;
        }
        return interfaceC19775.getType();
    }

    @Override // l.InterfaceC15125
    public final String getSignature() {
        InterfaceC22759 interfaceC22759 = this.f80250;
        if (interfaceC22759 == null) {
            return null;
        }
        return interfaceC22759.getString();
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ */
    public final void mo2770(C8850 c8850) {
        InterfaceC22759 interfaceC22759 = this.f80253;
        if (interfaceC22759 != null) {
            this.f80253 = c8850.m23719(interfaceC22759.getString());
        }
        InterfaceC19775 interfaceC19775 = this.f80251;
        if (interfaceC19775 != null) {
            this.f80251 = c8850.f74939.m35671(interfaceC19775.getType());
        }
        InterfaceC22759 interfaceC227510 = this.f80250;
        if (interfaceC227510 != null) {
            this.f80250 = c8850.m23719(interfaceC227510.getString());
        }
    }
}
