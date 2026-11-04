package l;

/* JADX INFO: renamed from: l.ۗ۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3293 extends C17370 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0310 f10719;

    public C3293(C0310 c0310) {
        this.f10719 = c0310;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5853(C5887 c5887, Object obj) {
        return this.f10719.f1707.m49775((C5887) null, (C3168) obj, c5887.f20169, C22114.f71272);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5891(C23041 c23041, Object obj) {
        C3168 c3168 = (C3168) obj;
        AbstractC22295 abstractC22295 = c23041.f74776;
        AbstractC11781 abstractC11781 = (AbstractC11781) (abstractC22295 == null ? null : abstractC22295.mo2282(this, c3168));
        EnumC13603 enumC13603 = abstractC11781.f38066;
        if (enumC13603 == EnumC13603.f43208 || enumC13603 == EnumC13603.f43210 || enumC13603 == EnumC13603.f43206) {
            return abstractC11781;
        }
        AbstractC19728 abstractC19728 = c23041.f74774;
        EnumC13603 enumC13604 = EnumC13603.f43219;
        C0310 c0310 = this.f10719;
        if (enumC13603 == enumC13604) {
            c3168.f10275.f61858 = (C14106) abstractC11781;
            return c0310.f1707.m49782((C23041) null, c3168, (AbstractC22970) abstractC11781, abstractC19728, C22114.f71272);
        }
        c3168.f10279.f26345 = (C24550) abstractC11781;
        return c0310.f1707.m49795(c3168, abstractC11781.f38067, abstractC19728, (AbstractC22970) abstractC11781);
    }
}
