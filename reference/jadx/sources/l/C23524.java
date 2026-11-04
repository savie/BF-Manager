package l;

/* JADX INFO: renamed from: l.᩹ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes.dex */
public final enum C23524 extends EnumC7687 {
    public /* synthetic */ C23524(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("PROFILE", 40, "-profile", "opt.arg.profile", "opt.profile", enumC18128, enumC21112);
    }

    public C23524(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo4242(AbstractC9923 abstractC9923, String str, String str2) throws C14398 {
        if (EnumC5865.m17069(str2) == null) {
            C11040 c11040 = C22843.f74058;
            throw abstractC9923.m25755(new C11040("compiler", "invalid.profile", str2));
        }
        super.mo4242(abstractC9923, str, str2);
    }
}
