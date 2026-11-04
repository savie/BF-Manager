package l;

/* JADX INFO: renamed from: l.ۚ֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C5277 extends EnumC15717 {
    public /* synthetic */ C5277() {
        this("InHeadNoscript", 4);
    }

    public C5277(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        if (abstractC0802.m3215()) {
            c4310.m13755(this);
            return true;
        }
        if (abstractC0802.m3217() && ((C7514) abstractC0802).f60787.equals("html")) {
            EnumC15717 enumC15717 = EnumC15717.f51053;
            c4310.f24102 = abstractC0802;
            return enumC15717.mo2666(abstractC0802, c4310);
        }
        if (abstractC0802.m3218() && ((C0056) abstractC0802).f60787.equals("noscript")) {
            c4310.m13770();
            c4310.m13765(EnumC15717.f51073);
            return true;
        }
        if (EnumC15717.m37586(abstractC0802) || abstractC0802.m3220() || (abstractC0802.m3217() && C0669.m2903(((C7514) abstractC0802).f60787, C17209.f56086))) {
            EnumC15717 enumC15718 = EnumC15717.f51073;
            c4310.f24102 = abstractC0802;
            return enumC15718.mo2666(abstractC0802, c4310);
        }
        if (abstractC0802.m3218() && ((C0056) abstractC0802).f60787.equals("br")) {
            return m15865(abstractC0802, c4310);
        }
        if ((!abstractC0802.m3217() || !C0669.m2903(((C7514) abstractC0802).f60787, C17209.f56095)) && !abstractC0802.m3218()) {
            return m15865(abstractC0802, c4310);
        }
        c4310.m13755(this);
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m15865(AbstractC0802 abstractC0802, C4310 c4310) {
        c4310.m13755(this);
        C3785 c3785 = new C3785();
        c3785.m12294(abstractC0802.toString());
        c4310.m13750(c3785);
        return true;
    }
}
