package l;

/* JADX INFO: renamed from: l.ܳ֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C14971 extends EnumC15717 {
    public /* synthetic */ C14971() {
        this("BeforeHead", 2);
    }

    public C14971(String str, int i) {
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
            return false;
        }
        if (abstractC0802.m3217() && ((C7514) abstractC0802).f60787.equals("html")) {
            return EnumC15717.f51053.mo2666(abstractC0802, c4310);
        }
        if (abstractC0802.m3217()) {
            C7514 c7514 = (C7514) abstractC0802;
            if (c7514.f60787.equals("head")) {
                c4310.m13801(c4310.m13746(c7514));
                c4310.m13765(EnumC15717.f51073);
                return true;
            }
        }
        if (abstractC0802.m3218() && C0669.m2903(((C0056) abstractC0802).f60787, C17209.f56096)) {
            c4310.m20067("head");
            return c4310.mo13758(abstractC0802);
        }
        if (abstractC0802.m3218()) {
            c4310.m13755(this);
            return false;
        }
        c4310.m20067("head");
        return c4310.mo13758(abstractC0802);
    }
}
