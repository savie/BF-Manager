package l;

/* JADX INFO: renamed from: l.ۛ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V6NC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6648 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f22178;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public char f22179;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f22180;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f22181;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f22182;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18588(char c) {
        char c2 = this.f22179;
        if (c2 != 0) {
            this.f22179 = (char) 0;
            if (Character.isLowSurrogate(c)) {
                m18586(Character.toCodePoint(c2, c));
                return;
            }
            m18586((int) c2);
        }
        if (Character.isHighSurrogate(c)) {
            this.f22179 = c;
        } else {
            m18586((int) c);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18586(int i) {
        boolean zIsLetterOrDigit;
        int i2 = C18446.f60051;
        boolean z = false;
        if (i > 127) {
            zIsLetterOrDigit = Character.isLetterOrDigit(i);
        } else {
            zIsLetterOrDigit = (97 <= i && i <= 122) || (65 <= i && i <= 90) || (48 <= i && i <= 57);
        }
        boolean z2 = C18446.m42976(i) == 6;
        boolean z3 = i == 95 || zIsLetterOrDigit || (z2 && this.f22178);
        boolean z4 = Character.isLetter(i) || (i >= 48 && i <= 57);
        if (this.f22182 && !z4) {
            if (!z3) {
                this.f22181++;
            }
            this.f22182 = false;
        }
        if (z4 && !this.f22180) {
            this.f22182 = true;
        }
        boolean z5 = i <= 65535 && (zIsLetterOrDigit || (z2 && this.f22178));
        this.f22178 = z5;
        if (i == 95 || zIsLetterOrDigit || (z2 && z5)) {
            z = true;
        }
        this.f22180 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m18587() {
        return this.f22181 + (this.f22182 ? 1L : 0L);
    }
}
