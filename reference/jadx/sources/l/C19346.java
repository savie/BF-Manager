package l;

/* JADX INFO: renamed from: l.᩵۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F925 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19346 extends AbstractC15175 {
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    @Override // l.InterfaceC17996
    /* JADX INFO: renamed from: ۙ */
    public final C3822 mo3830(C8057 c8057, InterfaceC18702 interfaceC18702) {
        C8763 c8763;
        int iMo21201 = c8057.mo21201();
        if (iMo21201 >= 4) {
            return null;
        }
        int iMo21197 = c8057.mo21197();
        CharSequence charSequenceM29102 = c8057.getLine().m29102();
        int length = charSequenceM29102.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = iMo21197; i3 < length; i3++) {
            char cCharAt = charSequenceM29102.charAt(i3);
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
                c8763 = null;
            } else {
                c8763 = new C8763('~', i2, iMo21201);
            }
        } else if (C22851.m50576('`', charSequenceM29102, iMo21197 + i) != -1) {
            c8763 = null;
        } else {
            c8763 = new C8763('`', i, iMo21201);
        }
        if (c8763 == null) {
            return null;
        }
        C3822 c3822 = new C3822(c8763);
        c3822.m11116(c8763.f30124.m49228().intValue() + iMo21197);
        return c3822;
    }
}
