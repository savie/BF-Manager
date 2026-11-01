package l;

/* JADX INFO: renamed from: l.᩹ܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes.dex */
public final enum C22364 extends EnumC19730 {
    public /* synthetic */ C22364(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("PROFILE", 40, "-profile", "opt.arg.profile", "opt.profile", enumC19024, enumC18318);
    }

    public C22364(String str, int i, String str2, String str3, String str4, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, str4, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2368(AbstractC10558 abstractC10558, String str, String str2) throws C21846 {
        if (EnumC23528.m51834(str2) == null) {
            C5909 c5909 = C23879.f77204;
            throw abstractC10558.m26710(new C5909("compiler", "invalid.profile", str2));
        }
        super.mo2368(abstractC10558, str, str2);
    }
}
