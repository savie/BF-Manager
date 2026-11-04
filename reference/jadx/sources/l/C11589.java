package l;

/* JADX INFO: renamed from: l.ۧۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C11589 extends EnumC7687 {
    public /* synthetic */ C11589(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("SOURCE", 36, "--source -source", "opt.arg.release", "opt.source", enumC18128, enumC21112);
    }

    public C11589(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo4242(AbstractC9923 abstractC9923, String str, String str2) throws C14398 {
        if (EnumC20820.m47624(str2) == null) {
            C11040 c11040 = C22843.f74058;
            throw abstractC9923.m25755(new C11040("compiler", "invalid.source", str2));
        }
        super.mo4242(abstractC9923, str, str2);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo20952(C7312 c7312) {
        C4571 c4571 = new C4571(", ");
        for (EnumC20820 enumC20820 : EnumC20820.values()) {
            if (enumC20820.m47629()) {
                c4571.add(enumC20820.f66685);
            }
        }
        super.m20953(c7312, c7312.m20032(EnumC2837.JAVAC, this.f25367, c4571.toString()));
    }
}
