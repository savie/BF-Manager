package l;

/* JADX INFO: renamed from: l.֫֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C1548 extends EnumC15717 {
    public /* synthetic */ C1548() {
        this("AfterHead", 5);
    }

    public C1548(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
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
            return true;
        }
        if (!abstractC0802.m3217()) {
            if (abstractC0802.m3218()) {
                String str = ((C0056) abstractC0802).f60787;
                if (C0669.m2903(str, C17209.f56071)) {
                    m5479(abstractC0802, c4310);
                    return true;
                }
                if (str.equals("template")) {
                    c4310.m13749(abstractC0802, EnumC15717.f51073);
                    return true;
                }
                c4310.m13755(this);
                return false;
            }
            m5479(abstractC0802, c4310);
            return true;
        }
        C7514 c7514 = (C7514) abstractC0802;
        String str2 = c7514.f60787;
        if (str2.equals("html")) {
            EnumC15717 enumC15717 = EnumC15717.f51053;
            c4310.f24102 = abstractC0802;
            return enumC15717.mo2666(abstractC0802, c4310);
        }
        if (str2.equals("body")) {
            c4310.m13746(c7514);
            c4310.m13757(false);
            c4310.m13765(EnumC15717.f51053);
            return true;
        }
        if (str2.equals("frameset")) {
            c4310.m13746(c7514);
            c4310.m13765(EnumC15717.f51054);
            return true;
        }
        if (C0669.m2903(str2, C17209.f56088)) {
            c4310.m13755(this);
            C15496 c15496M13800 = c4310.m13800();
            c4310.f24093.add(c15496M13800);
            c4310.m13749(abstractC0802, EnumC15717.f51073);
            c4310.m13768(c15496M13800);
            return true;
        }
        if (str2.equals("head")) {
            c4310.m13755(this);
            return false;
        }
        m5479(abstractC0802, c4310);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m5479(AbstractC0802 abstractC0802, C4310 c4310) {
        c4310.m20067("body");
        c4310.m13757(true);
        return c4310.mo13758(abstractC0802);
    }
}
