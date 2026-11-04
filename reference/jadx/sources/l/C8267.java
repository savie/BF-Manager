package l;

/* JADX INFO: renamed from: l.۠֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBDW */
/* JADX INFO: loaded from: classes4.dex */
public final class C8267 extends AbstractC12741 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 f27206;

    public C8267(C18708 c18708, C9012 c9012, C0063 c0063, InterfaceC11050 interfaceC11050, AbstractC13487 abstractC13487) {
        super(c18708, c9012, null, c0063, abstractC13487);
        if (c18708.m43508() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c18708.m43508());
        }
        if (interfaceC11050 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f27206 = interfaceC11050;
    }

    @Override // l.AbstractC12741, l.AbstractC17216
    /* JADX INFO: renamed from: ᩸ */
    public final String mo7782() {
        AbstractC13487 abstractC13487M31552 = m31552();
        String strMo1843 = abstractC13487M31552.mo1843();
        if (abstractC13487M31552 instanceof C9976) {
            strMo1843 = ((C9976) abstractC13487M31552).m25818();
        }
        StringBuilder sbM10405 = C3188.m10405(strMo1843, " ");
        sbM10405.append(C6776.m18898(this.f27206));
        return sbM10405.toString();
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC11050 mo7781() {
        return this.f27206;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final void mo7779(InterfaceC16470 interfaceC16470) {
        interfaceC16470.mo38987(this);
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17216 mo7777(C5085 c5085) {
        return new C8267(m40434(), m40433(), m40438(), this.f27206.mo1038(c5085), m31552());
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17216 mo7778(C20946 c20946, C0063 c0063) {
        return new C8267(m40434(), m40433(), c0063, this.f27206, m31552());
    }
}
