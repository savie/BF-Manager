package l;

import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.᩶ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21286 extends EnumC7687 {

    /* JADX INFO: renamed from: ۗۤ, reason: not valid java name and contains not printable characters */
    public final String f67876;

    public /* synthetic */ C21286(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("HELP_LINT", 47, "--help-lint", "opt.help.lint", enumC18128, enumC21112);
    }

    public C21286(String str, int i, String str2, String str3, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, enumC18128, enumC21112, 0);
        this.f67876 = "    %-20s %s";
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo2207(AbstractC9923 abstractC9923, String str) {
        C7312 c7312Mo25754 = abstractC9923.mo25754();
        EnumC8803 enumC8803 = EnumC8803.STDOUT;
        EnumC2837 enumC2837 = EnumC2837.JAVAC;
        c7312Mo25754.m20037(enumC8803, c7312Mo25754.m20032(enumC2837, "opt.help.lint.header", new Object[0]));
        c7312Mo25754.m20037(enumC8803, String.format(this.f67876, ProviderConfigurationPermission.ALL_STR, c7312Mo25754.m20032(enumC2837, "opt.Xlint.all", new Object[0])));
        for (EnumC19876 enumC19876 : EnumC19876.values()) {
            c7312Mo25754.m20037(EnumC8803.STDOUT, String.format(this.f67876, enumC19876.f63945, c7312Mo25754.m20032(EnumC2837.JAVAC, "opt.Xlint.desc." + enumC19876.f63945, new Object[0])));
        }
        c7312Mo25754.m20037(EnumC8803.STDOUT, String.format(this.f67876, "none", c7312Mo25754.m20032(EnumC2837.JAVAC, "opt.Xlint.none", new Object[0])));
        super.mo2207(abstractC9923, str);
    }
}
