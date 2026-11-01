package l;

/* JADX INFO: renamed from: l.ۨۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes4.dex */
public final class C11599 implements InterfaceC13320 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16579 f38968;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3836 f38969;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13320 f38970;

    public C11599(C3836 c3836, InterfaceC13320 interfaceC13320, AbstractC16579 abstractC16579) {
        this.f38969 = c3836;
        this.f38970 = interfaceC13320;
        this.f38968 = abstractC16579;
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public final void mo1179(AbstractC23903 abstractC23903) {
        C3836 c3836 = this.f38969;
        C22492 c22492 = c3836.f14240;
        try {
            this.f38970.mo1179(abstractC23903);
        } catch (C4146 unused) {
            abstractC23903.f77447 |= 1;
            ((C0309) abstractC23903.f77449).f1654 = c3836.f14275;
            AbstractC11242 abstractC11242 = c3836.f14246.f77616;
            AbstractC16579 abstractC16579 = this.f38968;
            abstractC23903.mo20272().mo24224(new C18258(9L, abstractC11242, new C13757(C21825.of((Object) abstractC16579), abstractC23903.f77449, C21825.m48588(), c22492), abstractC23903));
            abstractC23903.mo20272().mo24224(new C18258(1L, abstractC16579.f53222.f77453.m28211(c3836.f14246.f77570), new C13757(C21825.m48588(), abstractC16579, C21825.m48588(), c22492), abstractC23903));
        }
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo1180() {
        return this.f38970.mo1180();
    }
}
