package l;

/* JADX INFO: renamed from: l.ۡ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F925 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8763 extends AbstractC22936 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f30123;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22189 f30124;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public StringBuilder f30125;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f30126;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char f30127;

    public C8763(char c, int i, int i2) {
        C22189 c22189 = new C22189();
        this.f30124 = c22189;
        this.f30125 = new StringBuilder();
        this.f30127 = c;
        this.f30123 = i;
        String.valueOf(c);
        c22189.m49226(Integer.valueOf(i));
        c22189.m49222(i2);
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۚ */
    public final AbstractC14738 mo1823() {
        return this.f30124;
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final C22168 mo1821(InterfaceC8119 interfaceC8119) {
        int iMo21197 = interfaceC8119.mo21197();
        int index = interfaceC8119.getIndex();
        CharSequence charSequenceM29102 = interfaceC8119.getLine().m29102();
        int iMo21201 = interfaceC8119.mo21201();
        C22189 c22189 = this.f30124;
        if (iMo21201 < 4 && iMo21197 < charSequenceM29102.length()) {
            int length = charSequenceM29102.length();
            for (int i = iMo21197; i < length; i++) {
                if (charSequenceM29102.charAt(i) != this.f30127) {
                    length = i;
                    break;
                }
            }
            int i2 = length - iMo21197;
            if (i2 >= this.f30123 && C22851.m50577(iMo21197 + i2, charSequenceM29102.length(), charSequenceM29102) == charSequenceM29102.length()) {
                c22189.m49223(Integer.valueOf(i2));
                return new C22168(-1, -1, true);
            }
        }
        int length2 = charSequenceM29102.length();
        for (int iM49221 = c22189.m49221(); iM49221 > 0 && index < length2 && charSequenceM29102.charAt(index) == ' '; iM49221--) {
            index++;
        }
        return C22168.m49178(index);
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۙ */
    public final void mo1822(C11647 c11647) {
        if (this.f30126 == null) {
            this.f30126 = c11647.m29102().toString();
            return;
        }
        CharSequence charSequenceM29102 = c11647.m29102();
        StringBuilder sb = this.f30125;
        sb.append(charSequenceM29102);
        sb.append('\n');
    }

    @Override // l.AbstractC22936, l.InterfaceC21524
    /* JADX INFO: renamed from: ۬ */
    public final void mo1824() {
        String strM17350 = C6270.m17350(this.f30126.trim());
        C22189 c22189 = this.f30124;
        c22189.m49224(strM17350);
        c22189.m49227(this.f30125.toString());
    }
}
