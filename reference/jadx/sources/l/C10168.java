package l;

/* JADX INFO: renamed from: l.ۢܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8YO */
/* JADX INFO: loaded from: classes4.dex */
public final class C10168 extends AbstractC9008 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3567 f32556 = new C3567();

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC23705 mo7447() {
        return this.f32556;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final C7932 mo7444(InterfaceC4753 interfaceC4753) {
        char cCharAt;
        int iMo14654 = interfaceC4753.mo14654();
        if (!m26279(interfaceC4753, iMo14654)) {
            return null;
        }
        int iMo14650 = interfaceC4753.mo14650() + interfaceC4753.mo14651();
        int i = iMo14650 + 1;
        CharSequence charSequenceM34537 = interfaceC4753.getLine().m34537();
        int i2 = iMo14654 + 1;
        if (i2 < charSequenceM34537.length() && ((cCharAt = charSequenceM34537.charAt(i2)) == '\t' || cCharAt == ' ')) {
            i = iMo14650 + 2;
        }
        return new C7932(-1, i, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26279(InterfaceC4753 interfaceC4753, int i) {
        CharSequence charSequenceM34537 = interfaceC4753.getLine().m34537();
        return interfaceC4753.mo14650() < 4 && i < charSequenceM34537.length() && charSequenceM34537.charAt(i) == '>';
    }
}
