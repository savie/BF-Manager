package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBB2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4255 extends AbstractC15546 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 f15368;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15369;

    public C4255(C12723 c12723, C11312 c11312, C0727 c0727, ArrayList arrayList, AbstractC9901 abstractC9901) {
        super(c12723, c11312, null, c0727);
        if (c12723.m31577() != 1) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c12723.m31577());
        }
        this.f15369 = arrayList;
        this.f15368 = abstractC9901;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC14093 mo6700() {
        return C9672.f32573;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList m12018() {
        return this.f15369;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 m12019() {
        return this.f15368;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final void mo6699(InterfaceC23307 interfaceC23307) {
        interfaceC23307.mo8604(this);
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15546 mo6697(C3320 c3320) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15546 mo6698(C16251 c16251, C0727 c0727) {
        return new C4255(m37181(), m37183(), c0727, this.f15369, this.f15368);
    }
}
