package l;

/* JADX INFO: renamed from: l.۟᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48Z0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8130 extends AbstractC2297 {
    @Override // l.InterfaceC6772
    /* JADX INFO: renamed from: ۙ */
    public final C1220 mo13215(C5147 c5147, InterfaceC13483 interfaceC13483) {
        if (c5147.mo14650() >= 4) {
            return null;
        }
        CharSequence charSequenceM34537 = c5147.getLine().m34537();
        int length = charSequenceM34537.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int iMo14654 = c5147.mo14654(); iMo14654 < length; iMo14654++) {
            char cCharAt = charSequenceM34537.charAt(iMo14654);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i3++;
                } else if (cCharAt == '-') {
                    i++;
                } else {
                    if (cCharAt != '_') {
                        return null;
                    }
                    i2++;
                }
            }
        }
        if ((i < 3 || i2 != 0 || i3 != 0) && ((i2 < 3 || i != 0 || i3 != 0) && (i3 < 3 || i != 0 || i2 != 0))) {
            return null;
        }
        String.valueOf(charSequenceM34537.subSequence(c5147.getIndex(), charSequenceM34537.length()));
        C1220 c1220 = new C1220(new C19317());
        c1220.m4440(charSequenceM34537.length());
        return c1220;
    }
}
