package l;

/* JADX INFO: renamed from: l.ܰܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C13898 extends EnumC19730 {
    public /* synthetic */ C13898(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("SOURCE", 36, "--source -source", "opt.arg.release", "opt.source", enumC19024, enumC18318);
    }

    public C13898(String str, int i, String str2, String str3, String str4, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, str4, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2368(AbstractC10558 abstractC10558, String str, String str2) throws C21846 {
        if (EnumC11909.m29705(str2) == null) {
            C5909 c5909 = C23879.f77204;
            throw abstractC10558.m26710(new C5909("compiler", "invalid.source", str2));
        }
        super.mo2368(abstractC10558, str, str2);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo15008(C20414 c20414) {
        C0231 c0231 = new C0231(", ");
        for (EnumC11909 enumC11909 : EnumC11909.values()) {
            if (enumC11909.m29709()) {
                c0231.add(enumC11909.f39974);
            }
        }
        super.m44883(c20414, c20414.m46171(EnumC21119.JAVAC, this.f63409, c0231.toString()));
    }
}
