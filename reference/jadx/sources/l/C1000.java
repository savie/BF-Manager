package l;

/* JADX INFO: renamed from: l.֨۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J8YO */
/* JADX INFO: loaded from: classes3.dex */
public final class C1000 extends AbstractC15175 {
    @Override // l.InterfaceC17996
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3822 mo3830(C8057 c8057, InterfaceC18702 interfaceC18702) {
        char cCharAt;
        int iMo21197 = c8057.mo21197();
        if (!C12996.m32137((InterfaceC8119) c8057, iMo21197)) {
            return null;
        }
        int iMo21201 = c8057.mo21201() + c8057.mo21202();
        int i = iMo21201 + 1;
        CharSequence charSequenceM29102 = c8057.getLine().m29102();
        int i2 = iMo21197 + 1;
        if (i2 < charSequenceM29102.length() && ((cCharAt = charSequenceM29102.charAt(i2)) == '\t' || cCharAt == ' ')) {
            i = iMo21201 + 2;
        }
        C3822 c3822 = new C3822(new C12996());
        c3822.m11111(i);
        return c3822;
    }
}
