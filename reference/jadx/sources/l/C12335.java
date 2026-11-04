package l;

/* JADX INFO: renamed from: l.ۨۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12335 extends EnumC7687 {
    public /* synthetic */ C12335(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("HELP", 43, "--help -help -?", "opt.help", enumC18128, enumC21112);
    }

    public C12335(String str, int i, String str2, String str3, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo2207(AbstractC9923 abstractC9923, String str) {
        C7312 c7312Mo25754 = abstractC9923.mo25754();
        String strMo25758 = abstractC9923.mo25758();
        EnumC8803 enumC8803 = EnumC8803.STDOUT;
        C7312.m20024(c7312Mo25754.m20031(enumC8803), c7312Mo25754.m20032(EnumC2837.JAVAC, "msg.usage.header", strMo25758));
        EnumC7687.m20945(c7312Mo25754, EnumC18128.STANDARD);
        c7312Mo25754.m20031(enumC8803).println();
        super.mo2207(abstractC9923, str);
    }
}
