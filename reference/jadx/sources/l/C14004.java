package l;

/* JADX INFO: renamed from: l.۬ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14004 extends EnumC15717 {
    public /* synthetic */ C14004() {
        this("AfterFrameset", 20);
    }

    public C14004(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        EnumC15717 enumC15717;
        if (EnumC15717.m37586(abstractC0802)) {
            abstractC0802.getClass();
            c4310.m13750((C3785) abstractC0802);
            return true;
        }
        if (abstractC0802.m3220()) {
            c4310.m13752((C14225) abstractC0802);
            return true;
        }
        if (abstractC0802.m3215()) {
            c4310.m13755(this);
            return false;
        }
        if (abstractC0802.m3217() && ((C7514) abstractC0802).f60787.equals("html")) {
            enumC15717 = EnumC15717.f51053;
        } else {
            if (abstractC0802.m3218() && ((C0056) abstractC0802).f60787.equals("html")) {
                c4310.m13765(EnumC15717.f51069);
                return true;
            }
            if (abstractC0802.m3217() && ((C7514) abstractC0802).f60787.equals("noframes")) {
                enumC15717 = EnumC15717.f51073;
            } else {
                if (abstractC0802.m3221()) {
                    return true;
                }
                c4310.m13755(this);
                return false;
            }
        }
        c4310.f24102 = abstractC0802;
        return enumC15717.mo2666(abstractC0802, c4310);
    }
}
