package l;

/* JADX INFO: renamed from: l.᩸ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21313 extends AbstractC17785 implements InterfaceC5791 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC7202 f69356;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC14964 f69357;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11521 f69358;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f69359;

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۨ */
    public final int mo10845() {
        InterfaceC15670 interfaceC15670 = this.f69359;
        String strMo37426 = interfaceC15670.mo37335().mo37426();
        int i = C17080.f54498;
        C12142 c12142 = new C12142(strMo37426);
        c12142.next();
        if ((c12142.hasNext() ? ((Integer) c12142.next()).intValue() : -1) >= 0) {
            return 1000;
        }
        return interfaceC15670.mo37335().length();
    }

    public C21313(InterfaceC15670 interfaceC15670, EnumC14964 enumC14964, AbstractC7202 abstractC7202, C11521 c11521) {
        this.f69359 = interfaceC15670;
        this.f69357 = enumC14964;
        this.f69356 = abstractC7202;
        this.f69358 = c11521;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC7202 m47808() {
        return this.f69356;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C11521 m47807() {
        return this.f69358;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21313 m47806(InterfaceC15670 interfaceC15670, EnumC14964 enumC14964, AbstractC7202 abstractC7202, C11521 c11521) {
        return new C21313(interfaceC15670, enumC14964, abstractC7202, c11521);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 m47810() {
        return this.f69359;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final EnumC14964 m47809() {
        return this.f69357;
    }

    @Override // l.InterfaceC5791
    /* JADX INFO: renamed from: ۙ */
    public final void mo9550(C18491 c18491) {
        c18491.m42886(this);
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۙ */
    public final String mo10842() {
        return this.f69359.mo37335().mo37426();
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ܰ */
    public final C9548 mo10846() {
        Integer numValueOf = Integer.valueOf(this.f69359.mo37335().getIndex());
        return C9548.m24395(numValueOf, numValueOf).m24403(AbstractC17785.f56393);
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۙ */
    public final C6496 mo10843(InterfaceC13553 interfaceC13553, C6496 c6496) {
        return c6496.m17699(c6496.f21907 + mo10845());
    }

    @Override // l.AbstractC17785
    /* JADX INFO: renamed from: ۙ */
    public final void mo10844(C18806 c18806) {
        c18806.m43377(m41374(), this.f69359.mo37335().mo37426());
    }

    public final String toString() {
        C23244 c23244M37072 = C15483.m37072(this);
        c23244M37072.m51284(this.f69359, "token");
        c23244M37072.m51284(this.f69357, "realOrImaginary");
        c23244M37072.m51284(this.f69356, "plusIndentCommentsBefore");
        return c23244M37072.toString();
    }
}
