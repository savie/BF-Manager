package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۜܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6841 extends EnumC19730 {
    public /* synthetic */ C6841(EnumC19024 enumC19024, EnumC18318 enumC18318, EnumC7029 enumC7029) {
        this("A", 44, "-A", "opt.arg.key.equals.value", "opt.A", enumC19024, enumC18318, enumC7029);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean mo18447() {
        return false;
    }

    public C6841(String str, int i, String str2, String str3, String str4, EnumC19024 enumC19024, EnumC18318 enumC18318, EnumC7029 enumC7029) {
        super(str, i, str2, str3, str4, enumC19024, enumC18318, enumC7029, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2369(String str) {
        return str.startsWith("-A");
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ */
    public void mo2367(AbstractC10558 abstractC10558, String str) throws C21846 {
        int length = str.length();
        if (length == 2) {
            throw abstractC10558.m26710(C23879.f77277);
        }
        int iIndexOf = str.indexOf(61);
        if (iIndexOf != -1) {
            length = iIndexOf;
        }
        String strSubstring = str.substring(2, length);
        Pattern pattern = C10474.f35828;
        for (String str2 : strSubstring.split("\\.", -1)) {
            if (!EnumC12508.m31065(str2)) {
                C5909 c5909 = C23879.f77204;
                throw abstractC10558.m26710(new C5909("compiler", "invalid.A.key", str));
            }
        }
        abstractC10558.mo12006(str, str);
    }
}
