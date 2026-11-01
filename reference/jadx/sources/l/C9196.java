package l;

/* JADX INFO: renamed from: l.ۡ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BEJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9196 extends AbstractC22601 {
    public C9196(C12723 c12723, C11312 c11312, C16251 c16251, C0727 c0727, AbstractC9901 abstractC9901) {
        super(c12723, c11312, c16251, c0727, abstractC9901);
        if (c12723.m31577() == 1) {
            return;
        }
        throw new IllegalArgumentException("opcode with invalid branchingness: " + c12723.m31577());
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC14093 mo6700() {
        return C9672.f32573;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final void mo6699(InterfaceC23307 interfaceC23307) {
        interfaceC23307.mo8605(this);
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15546 mo6697(C3320 c3320) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15546 mo6698(C16251 c16251, C0727 c0727) {
        return new C9196(m37181(), m37183(), c16251, c0727, m50100());
    }
}
