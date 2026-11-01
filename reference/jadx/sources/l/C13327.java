package l;

/* JADX INFO: renamed from: l.۬᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 48Z0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13327 extends AbstractC15175 {
    @Override // l.InterfaceC17996
    /* JADX INFO: renamed from: ۙ */
    public final C3822 mo3830(C8057 c8057, InterfaceC18702 interfaceC18702) {
        if (c8057.mo21201() >= 4) {
            return null;
        }
        CharSequence charSequenceM29102 = c8057.getLine().m29102();
        int length = charSequenceM29102.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int iMo21197 = c8057.mo21197(); iMo21197 < length; iMo21197++) {
            char cCharAt = charSequenceM29102.charAt(iMo21197);
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
        String.valueOf(charSequenceM29102.subSequence(c8057.getIndex(), charSequenceM29102.length()));
        C3822 c3822 = new C3822(new C4153());
        c3822.m11116(charSequenceM29102.length());
        return c3822;
    }
}
