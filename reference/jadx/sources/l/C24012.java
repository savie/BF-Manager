package l;

/* JADX INFO: renamed from: l.᩻᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBDA */
/* JADX INFO: loaded from: classes.dex */
public final class C24012 extends AbstractC15546 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C4129 f77807;

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo37182(AbstractC15546 abstractC15546) {
        return false;
    }

    public C24012(C12723 c12723, C11312 c11312, C16251 c16251, C0727 c0727, C4129 c4129) {
        super(c12723, c11312, c16251, c0727);
        if (c12723.m31577() != 5) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (c4129 == null) {
            throw new NullPointerException("cases == null");
        }
        this.f77807 = c4129;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۖ */
    public final String mo6696() {
        return this.f77807.toString();
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC14093 mo6700() {
        return C9672.f32573;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final void mo6699(InterfaceC23307 interfaceC23307) {
        interfaceC23307.mo8609(this);
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15546 mo6697(C3320 c3320) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15546 mo6698(C16251 c16251, C0727 c0727) {
        return new C24012(m37181(), m37183(), c16251, c0727, this.f77807);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C4129 m52843() {
        return this.f77807;
    }
}
