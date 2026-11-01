package l;

/* JADX INFO: renamed from: l.ᩴܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18836 extends EnumC19730 {
    public /* synthetic */ C18836(EnumC19024 enumC19024, EnumC18318 enumC18318, EnumC7029 enumC7029) {
        this("J", 48, "-J", "opt.arg.flag", "opt.J", enumC19024, enumC18318, enumC7029);
    }

    public C18836(String str, int i, String str2, String str3, String str4, EnumC19024 enumC19024, EnumC18318 enumC18318, EnumC7029 enumC7029) {
        super(str, i, str2, str3, str4, enumC19024, enumC18318, enumC7029, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2367(AbstractC10558 abstractC10558, String str) {
        throw new AssertionError("the -J flag should be caught by the launcher.");
    }
}
