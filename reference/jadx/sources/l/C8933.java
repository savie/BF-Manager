package l;

/* JADX INFO: renamed from: l.ۡܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L79Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C8933 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f30622;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30623;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public CharSequence f30624 = "";

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f30625;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f30626;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23223(CharSequence charSequence) {
        this.f30624 = charSequence;
        this.f30622 = 0;
        this.f30626 = 0;
        this.f30625 = 0;
        this.f30623 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19516 m23222(int i) {
        int iMax = Math.max(0, Math.min(i, this.f30624.length()));
        if (iMax < this.f30622) {
            m23223(this.f30624);
        }
        while (true) {
            int i2 = this.f30622;
            if (i2 < iMax) {
                char cCharAt = this.f30624.charAt(i2);
                if (cCharAt == '\n') {
                    int i3 = this.f30622 + 1;
                    this.f30622 = i3;
                    this.f30626++;
                    this.f30625 = i3;
                    this.f30623 = 0;
                } else {
                    int i4 = this.f30622;
                    if (!Character.isLowSurrogate(cCharAt) || i4 <= this.f30625 || !Character.isHighSurrogate(this.f30624.charAt(i4 - 1))) {
                        this.f30623++;
                    }
                    this.f30622++;
                }
            } else {
                return new C19516(this.f30626, this.f30623);
            }
        }
    }
}
