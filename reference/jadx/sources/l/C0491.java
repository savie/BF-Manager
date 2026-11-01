package l;

/* JADX INFO: renamed from: l.֡ܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes2.dex */
public final enum C0491 extends EnumC19730 {
    public /* synthetic */ C0491(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("XD", 71, "-XD", null, enumC19024, enumC18318);
    }

    public C0491(String str, int i, String str2, String str3, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo2369(String str) {
        return str.startsWith(this.f63414);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2367(AbstractC10558 abstractC10558, String str) {
        mo2368(abstractC10558, str, str.substring(this.f63414.length()));
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2368(AbstractC10558 abstractC10558, String str, String str2) {
        int iIndexOf = str2.indexOf(61);
        String strSubstring = iIndexOf < 0 ? str2 : str2.substring(0, iIndexOf);
        if (iIndexOf >= 0) {
            str2 = str2.substring(iIndexOf + 1);
        }
        abstractC10558.mo12006(strSubstring, str2);
    }
}
