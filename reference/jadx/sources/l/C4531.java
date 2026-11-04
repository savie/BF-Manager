package l;

/* JADX INFO: renamed from: l.ۙ֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4531 extends EnumC15717 {
    public /* synthetic */ C4531() {
        this("AfterAfterBody", 21);
    }

    public C4531(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        if (abstractC0802.m3220()) {
            c4310.m13752((C14225) abstractC0802);
            return true;
        }
        if (abstractC0802.m3215() || (abstractC0802.m3217() && ((C7514) abstractC0802).f60787.equals("html"))) {
            EnumC15717 enumC15717 = EnumC15717.f51053;
            c4310.f24102 = abstractC0802;
            return enumC15717.mo2666(abstractC0802, c4310);
        }
        if (EnumC15717.m37586(abstractC0802)) {
            c4310.m13750((C3785) abstractC0802);
            return true;
        }
        if (abstractC0802.m3221()) {
            return true;
        }
        c4310.m13755(this);
        c4310.m13744();
        return c4310.mo13758(abstractC0802);
    }
}
