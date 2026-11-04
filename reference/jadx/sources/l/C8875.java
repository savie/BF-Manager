package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۠᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7TB */
/* JADX INFO: loaded from: classes4.dex */
public final class C8875 implements InterfaceC17958 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f28996 = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // l.InterfaceC17958
    /* JADX INFO: renamed from: ۙ */
    public final C2076 mo2196(C3655 c3655) {
        C0805 c0805M11850 = c3655.m11850();
        c0805M11850.m3240();
        char cM3234 = c0805M11850.m3234();
        if (cM3234 == '\n') {
            c0805M11850.m3240();
            return new C2076(new C0584(), c0805M11850.m3237());
        }
        if (!f28996.matcher(String.valueOf(cM3234)).matches()) {
            return new C2076(new C24672("\\"), c0805M11850.m3237());
        }
        c0805M11850.m3240();
        return new C2076(new C24672(String.valueOf(cM3234)), c0805M11850.m3237());
    }
}
