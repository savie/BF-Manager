package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۛۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6370 extends EnumC7687 {
    public /* synthetic */ C6370(EnumC18128 enumC18128, EnumC21112 enumC21112, EnumC6196 enumC6196) {
        this("A", 44, "-A", "opt.arg.key.equals.value", "opt.A", enumC18128, enumC21112, enumC6196);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo18110() {
        return false;
    }

    public C6370(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112, EnumC6196 enumC6196) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, enumC6196, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public boolean mo8770(String str) {
        return str.startsWith("-A");
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo2207(AbstractC9923 abstractC9923, String str) throws C14398 {
        int length = str.length();
        if (length == 2) {
            throw abstractC9923.m25755(C22843.f74184);
        }
        int iIndexOf = str.indexOf(61);
        if (iIndexOf != -1) {
            length = iIndexOf;
        }
        String strSubstring = str.substring(2, length);
        Pattern pattern = C18808.f61088;
        for (String str2 : strSubstring.split("\\.", -1)) {
            if (!EnumC21704.m49266(str2)) {
                C11040 c11040 = C22843.f74058;
                throw abstractC9923.m25755(new C11040("compiler", "invalid.A.key", str));
            }
        }
        abstractC9923.mo12200(str, str);
    }
}
