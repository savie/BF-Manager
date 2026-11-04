package l;

/* JADX INFO: renamed from: l.᩵ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20366 extends EnumC7687 {
    public /* synthetic */ C20366(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("BOOT_CLASS_PATH", 18, "--boot-class-path -bootclasspath", "opt.arg.path", "opt.bootclasspath", enumC18128, enumC21112);
    }

    public C20366(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo4242(AbstractC9923 abstractC9923, String str, String str2) {
        abstractC9923.mo12202("-Xbootclasspath/p:");
        abstractC9923.mo12202("-Xbootclasspath/a:");
        super.mo4242(abstractC9923, str, str2);
    }
}
