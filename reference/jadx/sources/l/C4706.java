package l;

/* JADX INFO: renamed from: l.ۙܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4706 extends EnumC13880 {
    public /* synthetic */ C4706(EnumC8112 enumC8112) {
        this("CAPTURED", 5, enumC8112);
    }

    public C4706(String str, int i, EnumC8112 enumC8112) {
        super(str, i, enumC8112, 0);
    }

    @Override // l.EnumC13880
    /* JADX INFO: renamed from: ۙ */
    public boolean mo6717(C10229 c10229, C19524 c19524) {
        return c10229.m26018() && !c19524.m44601(c10229.m26012(EnumC8112.f28427, EnumC8112.f28425));
    }

    @Override // l.EnumC13880
    /* JADX INFO: renamed from: ۨ */
    public AbstractC16579 mo6718(C10229 c10229, C19524 c19524) {
        AbstractC16579 abstractC16579Mo6718;
        AbstractC16579 abstractC16579Mo6719;
        C13174 c13174 = c19524.f62774;
        EnumC13880 enumC13880 = EnumC13880.f45735;
        if (enumC13880.m33721(c10229, c19524).m48595()) {
            abstractC16579Mo6718 = enumC13880.mo6718(c10229, c19524);
        } else {
            abstractC16579Mo6718 = c13174.f43868.f14275;
        }
        AbstractC16579 abstractC16579 = abstractC16579Mo6718;
        EnumC13880 enumC13881 = EnumC13880.f45737;
        if (enumC13881.m33721(c10229, c19524).m48595()) {
            abstractC16579Mo6719 = enumC13881.mo6718(c10229, c19524);
        } else {
            abstractC16579Mo6719 = c13174.f43868.f14228;
        }
        C20771 c20771 = (C20771) c10229.f53121;
        AbstractC0618 abstractC0618 = c20771.f53222;
        return new C20771(abstractC0618.f77453, abstractC0618.f77448, abstractC16579, abstractC16579Mo6719, c20771.f67572);
    }
}
