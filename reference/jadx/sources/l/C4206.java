package l;

/* JADX INFO: renamed from: l.ۘ᩸۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4206 extends EnumC19730 {
    public /* synthetic */ C4206(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("XBOOTCLASSPATH", 21, "-Xbootclasspath:", "opt.arg.path", "opt.bootclasspath", enumC19024, enumC18318);
    }

    public C4206(String str, int i, String str2, String str3, String str4, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, str4, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2368(AbstractC10558 abstractC10558, String str, String str2) {
        abstractC10558.mo12010("-Xbootclasspath/p:");
        abstractC10558.mo12010("-Xbootclasspath/a:");
        super.mo2368(abstractC10558, "-bootclasspath", str2);
    }
}
