package l;

/* JADX INFO: renamed from: l.ۜۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7115 extends EnumC7687 {
    public /* synthetic */ C7115(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("XD", 71, "-XD", null, enumC18128, enumC21112);
    }

    public C7115(String str, int i, String str2, String str3, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public boolean mo8770(String str) {
        return str.startsWith(this.f25368);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo2207(AbstractC9923 abstractC9923, String str) {
        mo4242(abstractC9923, str, str.substring(this.f25368.length()));
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo4242(AbstractC9923 abstractC9923, String str, String str2) {
        int iIndexOf = str2.indexOf(61);
        String strSubstring = iIndexOf < 0 ? str2 : str2.substring(0, iIndexOf);
        if (iIndexOf >= 0) {
            str2 = str2.substring(iIndexOf + 1);
        }
        abstractC9923.mo12200(strSubstring, str2);
    }
}
