package l;

/* JADX INFO: renamed from: l.۫᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V742 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12650 implements InterfaceC20723 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC20723 f42254;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC10140 f42255;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC16178 f42256;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f42258;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f42259;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C4888 f42257 = new C4888();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC14767 f42252 = InterfaceC14767.f48289;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f42253 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31436(C15327 c15327) {
        this.f42256 = c15327;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31434(C0654 c0654) {
        this.f42255 = c0654;
        this.f42259 = c0654 == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31435(InterfaceC14767 interfaceC14767) {
        this.f42252 = interfaceC14767;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31437(InterfaceC20723 interfaceC20723) {
        this.f42254 = interfaceC20723;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31433(int i) {
        this.f42258 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31438() {
        this.f42253 = false;
    }

    @Override // l.InterfaceC20723
    /* JADX INFO: renamed from: ۙ */
    public final C17588 mo4000() {
        InterfaceC20723 interfaceC20723 = this.f42254;
        C16883 c16883M2971 = null;
        InterfaceC15785 interfaceC15785Mo4000 = interfaceC20723 != null ? interfaceC20723.mo4000() : null;
        int i = this.f42258;
        InterfaceC16178 interfaceC16178 = this.f42256;
        interfaceC16178.getClass();
        if (!this.f42259 && interfaceC15785Mo4000 != null) {
            InterfaceC10140 interfaceC10140 = this.f42255;
            if (interfaceC10140 == null) {
                C0654 c0654 = new C0654();
                c0654.m2972(interfaceC16178);
                c16883M2971 = c0654.m2971();
            } else {
                c16883M2971 = ((C0654) interfaceC10140).m2971();
            }
        }
        return new C17588(interfaceC16178, interfaceC15785Mo4000, this.f42257.mo4000(), c16883M2971, this.f42252, i, this.f42253);
    }
}
