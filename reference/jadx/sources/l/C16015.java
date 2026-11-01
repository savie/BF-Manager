package l;

/* JADX INFO: renamed from: l.ܺܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public final enum C16015 extends EnumC19730 {
    public /* synthetic */ C16015(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("XDOCLINT_CUSTOM", 6, "-Xdoclint:", "opt.Xdoclint.subopts", "opt.Xdoclint.custom", enumC19024, enumC18318);
    }

    public C16015(String str, int i, String str2, String str3, String str4, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, str4, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2369(String str) {
        return AbstractC10561.m26714().mo23473(str.replace(EnumC19730.f63369.f63414, "-Xmsgs:"));
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2368(AbstractC10558 abstractC10558, String str, String str2) {
        EnumC19730 enumC19730 = EnumC19730.f63369;
        String strMo12003 = abstractC10558.mo12003(enumC19730);
        if (strMo12003 != null) {
            str2 = C1679.m5594(strMo12003, " ", str2);
        }
        abstractC10558.mo12006(enumC19730.f63414, str2);
    }
}
