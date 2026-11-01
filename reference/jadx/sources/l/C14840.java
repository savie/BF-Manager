package l;

/* JADX INFO: renamed from: l.ܳ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBDW */
/* JADX INFO: loaded from: classes5.dex */
public final class C14840 extends AbstractC22601 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 f48487;

    public C14840(C12723 c12723, C11312 c11312, C0727 c0727, InterfaceC14093 interfaceC14093, AbstractC9901 abstractC9901) {
        super(c12723, c11312, null, c0727, abstractC9901);
        if (c12723.m31577() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c12723.m31577());
        }
        if (interfaceC14093 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f48487 = interfaceC14093;
    }

    @Override // l.AbstractC22601, l.AbstractC15546
    /* JADX INFO: renamed from: ۖ */
    public final String mo6696() {
        AbstractC9901 abstractC9901M50100 = m50100();
        String strMo2376 = abstractC9901M50100.mo2376();
        if (abstractC9901M50100 instanceof C17432) {
            strMo2376 = ((C17432) abstractC9901M50100).m40637();
        }
        StringBuilder sbM8976 = C3012.m8976(strMo2376, " ");
        sbM8976.append(C2138.m6695(this.f48487));
        return sbM8976.toString();
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC14093 mo6700() {
        return this.f48487;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final void mo6699(InterfaceC23307 interfaceC23307) {
        interfaceC23307.mo8607(this);
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15546 mo6697(C3320 c3320) {
        return new C14840(m37181(), m37183(), m37186(), this.f48487.mo3156(c3320), m50100());
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15546 mo6698(C16251 c16251, C0727 c0727) {
        return new C14840(m37181(), m37183(), c0727, this.f48487, m50100());
    }
}
