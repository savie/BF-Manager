package l;

/* JADX INFO: renamed from: l.᩷᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F925 */
/* JADX INFO: loaded from: classes.dex */
public final class C22301 extends AbstractC2297 {
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    @Override // l.InterfaceC6772
    /* JADX INFO: renamed from: ۙ */
    public final C1220 mo13215(C5147 c5147, InterfaceC13483 interfaceC13483) {
        C11112 c11112;
        int iMo14650 = c5147.mo14650();
        if (iMo14650 >= 4) {
            return null;
        }
        int iMo14654 = c5147.mo14654();
        CharSequence charSequenceM34537 = c5147.getLine().m34537();
        int length = charSequenceM34537.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = iMo14654; i3 < length; i3++) {
            char cCharAt = charSequenceM34537.charAt(i3);
            if (cCharAt == '`') {
                i++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i2++;
            }
        }
        if (i < 3 || i2 != 0) {
            if (i2 < 3 || i != 0) {
                c11112 = null;
            } else {
                c11112 = new C11112('~', i2, iMo14650);
            }
        } else if (C6790.m18955('`', charSequenceM34537, iMo14654 + i) != -1) {
            c11112 = null;
        } else {
            c11112 = new C11112('`', i, iMo14650);
        }
        if (c11112 == null) {
            return null;
        }
        C1220 c1220 = new C1220(c11112);
        c1220.m4440(c11112.f35032.m43074().intValue() + iMo14654);
        return c1220;
    }
}
