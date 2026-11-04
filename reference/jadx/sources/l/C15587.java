package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܳ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y90G */
/* JADX INFO: loaded from: classes5.dex */
public final class C15587 extends AbstractC2297 {
    @Override // l.InterfaceC6772
    /* JADX INFO: renamed from: ۙ */
    public final C1220 mo13215(C5147 c5147, InterfaceC13483 interfaceC13483) {
        int iMo14654 = c5147.mo14654();
        CharSequence charSequenceM34537 = c5147.getLine().m34537();
        if (c5147.mo14650() >= 4 || charSequenceM34537.charAt(iMo14654) != '<') {
            return null;
        }
        for (int i = 1; i <= 7; i++) {
            if (i != 7 || (!(((C7186) interfaceC13483).mo19759().mo7447() instanceof C14974) && !c5147.mo14652().mo22279())) {
                Pattern pattern = C13350.f42566[i][0];
                Pattern pattern2 = C13350.f42566[i][1];
                if (pattern.matcher(charSequenceM34537.subSequence(iMo14654, charSequenceM34537.length())).find()) {
                    C1220 c1220 = new C1220(new C13350(pattern2));
                    c1220.m4440(c5147.getIndex());
                    return c1220;
                }
            }
        }
        return null;
    }
}
