package l;

/* JADX INFO: renamed from: l.ۖۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C2640 extends EnumC7687 {
    public /* synthetic */ C2640(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("XDOCLINT_CUSTOM", 6, "-Xdoclint:", "opt.Xdoclint.subopts", "opt.Xdoclint.custom", enumC18128, enumC21112);
    }

    public C2640(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo8770(String str) {
        return AbstractC2483.m8339().mo8340(str.replace(EnumC7687.f25352.f25368, "-Xmsgs:"));
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo4242(AbstractC9923 abstractC9923, String str, String str2) {
        EnumC7687 enumC7687 = EnumC7687.f25352;
        String strMo12199 = abstractC9923.mo12199(enumC7687);
        if (strMo12199 != null) {
            str2 = C20196.m46451(strMo12199, " ", str2);
        }
        abstractC9923.mo12200(enumC7687.f25368, str2);
    }
}
