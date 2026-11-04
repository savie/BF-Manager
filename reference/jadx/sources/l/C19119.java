package l;

/* JADX INFO: renamed from: l.ᩳܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8YO */
/* JADX INFO: loaded from: classes5.dex */
public final class C19119 extends AbstractC2297 {
    @Override // l.InterfaceC6772
    /* JADX INFO: renamed from: ۙ */
    public final C1220 mo13215(C5147 c5147, InterfaceC13483 interfaceC13483) {
        char cCharAt;
        int iMo14654 = c5147.mo14654();
        if (!C10168.m26279((InterfaceC4753) c5147, iMo14654)) {
            return null;
        }
        int iMo14650 = c5147.mo14650() + c5147.mo14651();
        int i = iMo14650 + 1;
        CharSequence charSequenceM34537 = c5147.getLine().m34537();
        int i2 = iMo14654 + 1;
        if (i2 < charSequenceM34537.length() && ((cCharAt = charSequenceM34537.charAt(i2)) == '\t' || cCharAt == ' ')) {
            i = iMo14650 + 2;
        }
        C1220 c1220 = new C1220(new C10168());
        c1220.m4435(i);
        return c1220;
    }
}
