package l;

/* JADX INFO: renamed from: l.ܺۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15738 implements InterfaceC8119 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11647 f51036;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21524 f51037;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f51038;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f51039;

    public C15738(String str, InterfaceC21524 interfaceC21524) {
        this.f51036 = C11647.m29101(str, (C0316) null);
        this.f51037 = interfaceC21524;
    }

    @Override // l.InterfaceC8119
    public final C11647 getLine() {
        return this.f51036;
    }

    @Override // l.InterfaceC8119
    public final int getIndex() {
        return this.f51038;
    }

    @Override // l.InterfaceC8119
    /* JADX INFO: renamed from: ܰ */
    public final int mo21202() {
        return this.f51039;
    }

    @Override // l.InterfaceC8119
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC21524 mo21200() {
        return this.f51037;
    }

    @Override // l.InterfaceC8119
    /* JADX INFO: renamed from: ۖ */
    public final int mo21197() {
        int i = this.f51038;
        CharSequence charSequenceM29102 = this.f51036.m29102();
        while (i < charSequenceM29102.length() && (charSequenceM29102.charAt(i) == ' ' || charSequenceM29102.charAt(i) == '\t')) {
            i++;
        }
        return i;
    }

    @Override // l.InterfaceC8119
    /* JADX INFO: renamed from: ۨ */
    public final int mo21201() {
        int iMo21197 = mo21197();
        int i = this.f51039;
        for (int i2 = this.f51038; i2 < iMo21197; i2++) {
            i += this.f51036.m29102().charAt(i2) == '\t' ? 4 - (i % 4) : 1;
        }
        return i - this.f51039;
    }

    @Override // l.InterfaceC8119
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21199() {
        return mo21197() == this.f51036.m29102().length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37461(C22168 c22168) {
        int iM49181 = c22168.m49181();
        int iM49179 = c22168.m49179();
        while (true) {
            int i = this.f51038;
            C11647 c11647 = this.f51036;
            if (i >= c11647.m29102().length()) {
                return;
            }
            if (iM49181 >= 0) {
                if (this.f51038 >= iM49181) {
                    return;
                }
            } else if (this.f51039 >= iM49179) {
                return;
            }
            int i2 = c11647.m29102().charAt(this.f51038) == '\t' ? 4 - (this.f51039 % 4) : 1;
            if (iM49181 < 0 && this.f51039 + i2 > iM49179) {
                this.f51039 = iM49179;
                return;
            } else {
                this.f51039 += i2;
                this.f51038++;
            }
        }
    }
}
