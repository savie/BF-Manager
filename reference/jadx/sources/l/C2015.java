package l;

/* JADX INFO: renamed from: l.֫ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2015 extends AbstractC11709 implements InterfaceC18422 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC5744 f6717;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12455 f6718;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC3506 f6719;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15867 f6720;

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo6935() {
        InterfaceC12455 interfaceC12455 = this.f6718;
        String strMo18733 = interfaceC12455.mo30930().mo18733();
        int i = C21406.f68189;
        C14692 c14692 = new C14692(strMo18733);
        c14692.next();
        if ((c14692.hasNext() ? ((Integer) c14692.next()).intValue() : -1) >= 0) {
            return 1000;
        }
        return interfaceC12455.mo30930().length();
    }

    public C2015(InterfaceC12455 interfaceC12455, EnumC5744 enumC5744, AbstractC3506 abstractC3506, C15867 c15867) {
        this.f6718 = interfaceC12455;
        this.f6717 = enumC5744;
        this.f6719 = abstractC3506;
        this.f6720 = c15867;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC3506 m6936() {
        return this.f6719;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15867 m6931() {
        return this.f6720;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2015 m6930(InterfaceC12455 interfaceC12455, EnumC5744 enumC5744, AbstractC3506 abstractC3506, C15867 c15867) {
        return new C2015(interfaceC12455, enumC5744, abstractC3506, c15867);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC12455 m6939() {
        return this.f6718;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC5744 m6937() {
        return this.f6717;
    }

    @Override // l.InterfaceC18422
    /* JADX INFO: renamed from: ۙ */
    public final void mo2485(C25136 c25136) {
        c25136.m56044(this);
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo6932() {
        return this.f6718.mo30930().mo18733();
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2346 mo6938() {
        Integer numValueOf = Integer.valueOf(this.f6718.mo30930().getIndex());
        return C2346.m7908(numValueOf, numValueOf).m7916(AbstractC11709.f37886);
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15438 mo6933(InterfaceC8770 interfaceC8770, C15438 c15438) {
        return c15438.m36959(c15438.f50284 + mo6935());
    }

    @Override // l.AbstractC11709
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6934(C11338 c11338) {
        c11338.m28631(m29384(), this.f6718.mo30930().mo18733());
    }

    public final String toString() {
        C3179 c3179M46714 = C20333.m46714(this);
        c3179M46714.m10379(this.f6718, "token");
        c3179M46714.m10379(this.f6717, "realOrImaginary");
        c3179M46714.m10379(this.f6719, "plusIndentCommentsBefore");
        return c3179M46714.toString();
    }
}
