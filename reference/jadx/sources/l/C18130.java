package l;

import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ᩳܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18130 extends EnumC19730 {

    /* JADX INFO: renamed from: ۠ۨ, reason: not valid java name and contains not printable characters */
    public final String f57973;

    public /* synthetic */ C18130(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("HELP_LINT", 47, "--help-lint", "opt.help.lint", enumC19024, enumC18318);
    }

    public C18130(String str, int i, String str2, String str3, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, enumC19024, enumC18318, 0);
        this.f57973 = "    %-20s %s";
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2367(AbstractC10558 abstractC10558, String str) {
        C20414 c20414Mo12004 = abstractC10558.mo12004();
        EnumC16181 enumC16181 = EnumC16181.STDOUT;
        EnumC21119 enumC21119 = EnumC21119.JAVAC;
        c20414Mo12004.m46177(enumC16181, c20414Mo12004.m46171(enumC21119, "opt.help.lint.header", new Object[0]));
        c20414Mo12004.m46177(enumC16181, String.format(this.f57973, ProviderConfigurationPermission.ALL_STR, c20414Mo12004.m46171(enumC21119, "opt.Xlint.all", new Object[0])));
        for (EnumC0597 enumC0597 : EnumC0597.values()) {
            c20414Mo12004.m46177(EnumC16181.STDOUT, String.format(this.f57973, enumC0597.f2616, c20414Mo12004.m46171(EnumC21119.JAVAC, "opt.Xlint.desc." + enumC0597.f2616, new Object[0])));
        }
        c20414Mo12004.m46177(EnumC16181.STDOUT, String.format(this.f57973, "none", c20414Mo12004.m46171(EnumC21119.JAVAC, "opt.Xlint.none", new Object[0])));
        super.mo2367(abstractC10558, str);
    }
}
