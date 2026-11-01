package l;

/* JADX INFO: renamed from: l.۬۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J8YO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12996 extends AbstractC22936 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2036 f43334 = new C2036();

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC14738 mo1823() {
        return this.f43334;
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final C22168 mo1821(InterfaceC8119 interfaceC8119) {
        char cCharAt;
        int iMo21197 = interfaceC8119.mo21197();
        if (!m32137(interfaceC8119, iMo21197)) {
            return null;
        }
        int iMo21201 = interfaceC8119.mo21201() + interfaceC8119.mo21202();
        int i = iMo21201 + 1;
        CharSequence charSequenceM29102 = interfaceC8119.getLine().m29102();
        int i2 = iMo21197 + 1;
        if (i2 < charSequenceM29102.length() && ((cCharAt = charSequenceM29102.charAt(i2)) == '\t' || cCharAt == ' ')) {
            i = iMo21201 + 2;
        }
        return new C22168(-1, i, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32137(InterfaceC8119 interfaceC8119, int i) {
        CharSequence charSequenceM29102 = interfaceC8119.getLine().m29102();
        return interfaceC8119.mo21201() < 4 && i < charSequenceM29102.length() && charSequenceM29102.charAt(i) == '>';
    }
}
