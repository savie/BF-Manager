package l;

/* JADX INFO: renamed from: l.᩸ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6NC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21674 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f70294;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f70295;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f70296;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public char f70297;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f70298;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48407(char c) {
        char c2 = this.f70297;
        if (c2 != 0) {
            this.f70297 = (char) 0;
            if (Character.isLowSurrogate(c)) {
                m48405(Character.toCodePoint(c2, c));
                return;
            }
            m48405((int) c2);
        }
        if (Character.isHighSurrogate(c)) {
            this.f70297 = c;
        } else {
            m48405((int) c);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48405(int i) {
        boolean zIsLetterOrDigit;
        int i2 = C4312.f15487;
        boolean z = false;
        if (i > 127) {
            zIsLetterOrDigit = Character.isLetterOrDigit(i);
        } else {
            zIsLetterOrDigit = (97 <= i && i <= 122) || (65 <= i && i <= 90) || (48 <= i && i <= 57);
        }
        boolean z2 = C4312.m12113(i) == 6;
        boolean z3 = i == 95 || zIsLetterOrDigit || (z2 && this.f70295);
        boolean z4 = Character.isLetter(i) || (i >= 48 && i <= 57);
        if (this.f70294 && !z4) {
            if (!z3) {
                this.f70298++;
            }
            this.f70294 = false;
        }
        if (z4 && !this.f70296) {
            this.f70294 = true;
        }
        boolean z5 = i <= 65535 && (zIsLetterOrDigit || (z2 && this.f70295));
        this.f70295 = z5;
        if (i == 95 || zIsLetterOrDigit || (z2 && z5)) {
            z = true;
        }
        this.f70296 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m48406() {
        return this.f70298 + (this.f70294 ? 1L : 0L);
    }
}
