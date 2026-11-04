package l;

/* JADX INFO: renamed from: l.᩷֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes.dex */
public final enum C21685 extends EnumC15717 {
    public /* synthetic */ C21685() {
        this("AfterAfterFrameset", 22);
    }

    public C21685(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        if (abstractC0802.m3220()) {
            c4310.m13752((C14225) abstractC0802);
            return true;
        }
        if (abstractC0802.m3215() || EnumC15717.m37586(abstractC0802) || (abstractC0802.m3217() && ((C7514) abstractC0802).f60787.equals("html"))) {
            EnumC15717 enumC15717 = EnumC15717.f51053;
            c4310.f24102 = abstractC0802;
            return enumC15717.mo2666(abstractC0802, c4310);
        }
        if (abstractC0802.m3221()) {
            return true;
        }
        if (abstractC0802.m3217() && ((C7514) abstractC0802).f60787.equals("noframes")) {
            EnumC15717 enumC15718 = EnumC15717.f51073;
            c4310.f24102 = abstractC0802;
            return enumC15718.mo2666(abstractC0802, c4310);
        }
        c4310.m13755(this);
        return false;
    }
}
