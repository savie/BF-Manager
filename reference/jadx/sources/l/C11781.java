package l;

/* JADX INFO: renamed from: l.ۨܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C11781 extends EnumC19730 {
    public /* synthetic */ C11781(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("TARGET", 37, "--target -target", "opt.arg.release", "opt.target", enumC19024, enumC18318);
    }

    public C11781(String str, int i, String str2, String str3, String str4, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, str4, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2368(AbstractC10558 abstractC10558, String str, String str2) throws C21846 {
        if (EnumC14128.m34158(str2) == null) {
            C5909 c5909 = C23879.f77204;
            throw abstractC10558.m26710(new C5909("compiler", "invalid.target", str2));
        }
        super.mo2368(abstractC10558, str, str2);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo15008(C20414 c20414) {
        C0231 c0231 = new C0231(", ");
        for (EnumC14128 enumC14128 : EnumC14128.values()) {
            if (enumC14128.m34171()) {
                c0231.add(enumC14128.f46387);
            }
        }
        super.m44883(c20414, c20414.m46171(EnumC21119.JAVAC, this.f63409, c0231.toString()));
    }
}
