package l;

/* JADX INFO: renamed from: l.᩸ܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21658 extends EnumC19730 {
    public /* synthetic */ C21658(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("X", 46, "--help-extra -X", "opt.X", enumC19024, enumC18318);
    }

    public C21658(String str, int i, String str2, String str3, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2367(AbstractC10558 abstractC10558, String str) {
        C20414 c20414Mo12004 = abstractC10558.mo12004();
        EnumC19730.m44872(c20414Mo12004, EnumC19024.EXTENDED);
        EnumC16181 enumC16181 = EnumC16181.STDOUT;
        c20414Mo12004.m46169(enumC16181).println();
        C20414.m46162(c20414Mo12004.m46169(enumC16181), c20414Mo12004.m46171(EnumC21119.JAVAC, "msg.usage.nonstandard.footer", new Object[0]));
        super.mo2367(abstractC10558, str);
    }
}
