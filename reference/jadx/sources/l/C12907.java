package l;

/* JADX INFO: renamed from: l.۫ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12907 extends EnumC7687 {
    public /* synthetic */ C12907(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("XDOCLINT_PACKAGE", 7, "-Xdoclint/package:", "opt.Xdoclint.package.args", "opt.Xdoclint.package.desc", enumC18128, enumC21112);
    }

    public C12907(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public boolean mo8770(String str) {
        return AbstractC2483.m8339().mo8340(str.replace(EnumC7687.f25313.f25368, "-XcheckPackage:"));
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo4242(AbstractC9923 abstractC9923, String str, String str2) {
        EnumC7687 enumC7687 = EnumC7687.f25313;
        String strMo12199 = abstractC9923.mo12199(enumC7687);
        if (strMo12199 != null) {
            str2 = C20196.m46451(strMo12199, ",", str2);
        }
        abstractC9923.mo12200(enumC7687.f25368, str2);
    }
}
