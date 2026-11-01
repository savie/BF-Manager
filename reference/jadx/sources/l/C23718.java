package l;

/* JADX INFO: renamed from: l.᩻۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91H5 */
/* JADX INFO: loaded from: classes.dex */
public final class C23718 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12429 f76755;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f76756;

    public C23718(C12429 c12429, int i) {
        this.f76755 = c12429;
        this.f76756 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m52234() {
        return this.f76756;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m52232(int i) {
        this.f76756 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte m52231() {
        byte bM30897 = this.f76755.m30897(this.f76756);
        this.f76756++;
        return bM30897;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m52236() {
        int iM30895 = this.f76755.m30895(this.f76756);
        this.f76756++;
        return iM30895;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final short m52230() {
        short sM30889 = this.f76755.m30889(this.f76756);
        this.f76756 += 2;
        return sM30889;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m52224() {
        int iM30898 = this.f76755.m30898(this.f76756);
        this.f76756 += 2;
        return iM30898;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m52225() {
        int iM30896 = this.f76755.m30896(this.f76756);
        this.f76756 += 4;
        return iM30896;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m52229(int i) {
        int[] iArrM30894 = this.f76755.m30894(this.f76756, i);
        this.f76756 = (i * 4) + this.f76756;
        return iArrM30894;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m52235(int i) {
        int i2 = this.f76756;
        StringBuilder sb = new StringBuilder(16);
        int i3 = i;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                break;
            }
            char cM30889 = (char) this.f76755.m30889(i2);
            i2 += 2;
            if (cM30889 == 0) {
                break;
            }
            sb.append(cM30889);
            i3 = i4;
        }
        String string = sb.toString();
        this.f76756 = (i * 2) + this.f76756;
        return string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52228(byte[] bArr) {
        this.f76755.m30891(this.f76756, bArr);
        this.f76756 += bArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52227() {
        return this.f76755.m30890(this.f76756);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m52233() {
        this.f76756 += 4;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m52226(int i) {
        this.f76756 += i;
    }
}
