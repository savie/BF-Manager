package l;

/* JADX INFO: renamed from: l.ۘܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4018 extends EnumC19730 {
    public /* synthetic */ C4018(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("HELP", 43, "--help -help -?", "opt.help", enumC19024, enumC18318);
    }

    public C4018(String str, int i, String str2, String str3, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2367(AbstractC10558 abstractC10558, String str) {
        C20414 c20414Mo12004 = abstractC10558.mo12004();
        String strMo12009 = abstractC10558.mo12009();
        EnumC16181 enumC16181 = EnumC16181.STDOUT;
        C20414.m46162(c20414Mo12004.m46169(enumC16181), c20414Mo12004.m46171(EnumC21119.JAVAC, "msg.usage.header", strMo12009));
        EnumC19730.m44872(c20414Mo12004, EnumC19024.STANDARD);
        c20414Mo12004.m46169(enumC16181).println();
        super.mo2367(abstractC10558, str);
    }
}
