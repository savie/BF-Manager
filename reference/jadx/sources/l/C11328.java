package l;

/* JADX INFO: renamed from: l.ۧ᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final enum C11328 extends EnumC13880 {
    public /* synthetic */ C11328(EnumC8112 enumC8112) {
        this("LOWER", 1, enumC8112);
    }

    public C11328(String str, int i, EnumC8112 enumC8112) {
        super(str, i, enumC8112, 0);
    }

    @Override // l.EnumC13880
    /* JADX INFO: renamed from: ۨ */
    public AbstractC16579 mo6718(C10229 c10229, C19524 c19524) {
        C13174 c13174 = c19524.f62774;
        C21825 c21825M33721 = m33721(c10229, c19524);
        AbstractC16579 abstractC16579M52397 = c21825M33721.f70877.f70877 == null ? (AbstractC16579) c21825M33721.f70876 : c13174.f43867.m52397(c21825M33721);
        if (!abstractC16579M52397.mo9481() && !abstractC16579M52397.m39001(EnumC6617.ERROR)) {
            return abstractC16579M52397;
        }
        C23549 c23549 = c13174.f43858;
        AbstractC16579 abstractC16579 = c10229.f53121;
        C14377 c14377 = C14707.f48054;
        throw C13174.m32568(c23549.m51910(new C14377("compiler", "no.unique.minimal.instance.exists", abstractC16579, c21825M33721)));
    }
}
