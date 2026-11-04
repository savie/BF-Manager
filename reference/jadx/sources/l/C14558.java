package l;

/* JADX INFO: renamed from: l.ܰۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes5.dex */
public final class C14558 implements InterfaceC4753 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8263 f45865;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f45866;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f45867;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14228 f45868;

    public C14558(String str, InterfaceC8263 interfaceC8263) {
        this.f45868 = C14228.m34536(str, (C5280) null);
        this.f45865 = interfaceC8263;
    }

    @Override // l.InterfaceC4753
    public final C14228 getLine() {
        return this.f45868;
    }

    @Override // l.InterfaceC4753
    public final int getIndex() {
        return this.f45866;
    }

    @Override // l.InterfaceC4753
    /* JADX INFO: renamed from: ۤ */
    public final int mo14651() {
        return this.f45867;
    }

    @Override // l.InterfaceC4753
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC8263 mo14652() {
        return this.f45865;
    }

    @Override // l.InterfaceC4753
    /* JADX INFO: renamed from: ᩸ */
    public final int mo14654() {
        int i = this.f45866;
        CharSequence charSequenceM34537 = this.f45868.m34537();
        while (i < charSequenceM34537.length() && (charSequenceM34537.charAt(i) == ' ' || charSequenceM34537.charAt(i) == '\t')) {
            i++;
        }
        return i;
    }

    @Override // l.InterfaceC4753
    /* JADX INFO: renamed from: ۙ */
    public final int mo14650() {
        int iMo14654 = mo14654();
        int i = this.f45867;
        for (int i2 = this.f45866; i2 < iMo14654; i2++) {
            i += this.f45868.m34537().charAt(i2) == '\t' ? 4 - (i % 4) : 1;
        }
        return i - this.f45867;
    }

    @Override // l.InterfaceC4753
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo14653() {
        return mo14654() == this.f45868.m34537().length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35111(C7932 c7932) {
        int iM21507 = c7932.m21507();
        int iM21505 = c7932.m21505();
        while (true) {
            int i = this.f45866;
            C14228 c14228 = this.f45868;
            if (i >= c14228.m34537().length()) {
                return;
            }
            if (iM21507 >= 0) {
                if (this.f45866 >= iM21507) {
                    return;
                }
            } else if (this.f45867 >= iM21505) {
                return;
            }
            int i2 = c14228.m34537().charAt(this.f45866) == '\t' ? 4 - (this.f45867 % 4) : 1;
            if (iM21507 < 0 && this.f45867 + i2 > iM21505) {
                this.f45867 = iM21505;
                return;
            } else {
                this.f45867 += i2;
                this.f45866++;
            }
        }
    }
}
