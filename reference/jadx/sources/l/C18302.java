package l;

/* JADX INFO: renamed from: l.ܿۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18302 extends EnumC7687 {
    public /* synthetic */ C18302(EnumC18128 enumC18128, EnumC21112 enumC21112, EnumC6196 enumC6196) {
        this("J", 48, "-J", "opt.arg.flag", "opt.J", enumC18128, enumC21112, enumC6196);
    }

    public C18302(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112, EnumC6196 enumC6196) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, enumC6196, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo2207(AbstractC9923 abstractC9923, String str) {
        throw new AssertionError("the -J flag should be caught by the launcher.");
    }
}
