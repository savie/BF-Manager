package l;

/* JADX INFO: renamed from: l.֫᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBBP */
/* JADX INFO: loaded from: classes3.dex */
public final class C2138 extends AbstractC15546 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 f7807;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m6695(InterfaceC14093 interfaceC14093) {
        StringBuilder sbM40152 = C17214.m40152(100, "catch");
        int size = interfaceC14093.size();
        for (int i = 0; i < size; i++) {
            sbM40152.append(" ");
            sbM40152.append(interfaceC14093.getType(i).mo2376());
        }
        return sbM40152.toString();
    }

    public C2138(C12723 c12723, C11312 c11312, C0727 c0727, InterfaceC14093 interfaceC14093) {
        super(c12723, c11312, null, c0727);
        if (c12723.m31577() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c12723.m31577());
        }
        if (interfaceC14093 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f7807 = interfaceC14093;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo6696() {
        return m6695(this.f7807);
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 mo6700() {
        return this.f7807;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6699(InterfaceC23307 interfaceC23307) {
        interfaceC23307.mo8603(this);
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15546 mo6697(C3320 c3320) {
        return new C2138(m37181(), m37183(), m37186(), this.f7807.mo3156(c3320));
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15546 mo6698(C16251 c16251, C0727 c0727) {
        return new C2138(m37181(), m37183(), c0727, this.f7807);
    }
}
