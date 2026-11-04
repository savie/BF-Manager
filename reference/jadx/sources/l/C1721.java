package l;

/* JADX INFO: renamed from: l.֫ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C1721 extends EnumC7687 {
    public /* synthetic */ C1721(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("DEPRECATION", 10, "-deprecation", "opt.deprecation", enumC18128, enumC21112);
    }

    public C1721(String str, int i, String str2, String str3, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo2207(AbstractC9923 abstractC9923, String str) {
        abstractC9923.mo12200("-Xlint:deprecation", str);
    }
}
