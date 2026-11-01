package l;

/* JADX INFO: renamed from: l.ᩴۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6P4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18567 implements InterfaceC1623 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f59060;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence f59061;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f59062;

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۙ */
    public final int mo11328() {
        return -1;
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۨ */
    public final void mo11331(int i) {
    }

    public C18567(CharSequence charSequence) {
        this.f59061 = charSequence;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final char m42976(int i) {
        return this.f59061.charAt(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m42975() {
        if (Thread.currentThread().isInterrupted()) {
            throw new C17861();
        }
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ܰ */
    public final void mo11333() {
        if (this.f59060 >= this.f59061.length()) {
            throw new IllegalStateException("Cannot consume EOF");
        }
        int i = this.f59060 + 1;
        this.f59060 = i;
        if ((i & 1023) == 0) {
            m42975();
        }
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ܰ */
    public final int mo11332(int i) {
        int i2 = this.f59062 + 1;
        this.f59062 = i2;
        if ((i2 & 1023) == 0) {
            m42975();
        }
        if (i == 0) {
            return 0;
        }
        int i3 = this.f59060;
        if (i > 0) {
            i--;
        }
        int i4 = i3 + i;
        if (i4 < 0) {
            return -1;
        }
        CharSequence charSequence = this.f59061;
        if (i4 >= charSequence.length()) {
            return -1;
        }
        return charSequence.charAt(i4);
    }

    @Override // l.InterfaceC22583
    public final int index() {
        return this.f59060;
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۙ */
    public final void mo11329(int i) {
        this.f59060 = i;
    }

    @Override // l.InterfaceC22583
    public final int size() {
        return this.f59061.length();
    }

    @Override // l.InterfaceC1623
    /* JADX INFO: renamed from: ۙ */
    public final String mo5499(C22043 c22043) {
        int i = c22043.f71443;
        CharSequence charSequence = this.f59061;
        return C21460.m48081(i, Math.min(charSequence.length(), c22043.f71444 + 1), charSequence);
    }
}
