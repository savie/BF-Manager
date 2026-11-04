package l;

/* JADX INFO: renamed from: l.ܳܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74I */
/* JADX INFO: loaded from: classes4.dex */
public final class C15453 implements CharSequence {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f50309 = new char[64];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50310;

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f50310;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i >= 0 && i < this.f50310) {
            return this.f50309[i];
        }
        StringBuilder sbM12235 = C3769.m12235(i, "index = ", ", length = ");
        sbM12235.append(this.f50310);
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i >= 0 && i2 <= this.f50310 && i <= i2) {
            return new String(this.f50309, i, i2 - i);
        }
        StringBuilder sbM5126 = C1402.m5126("start = ", i, ", end = ", ", length = ", i2);
        sbM5126.append(this.f50310);
        throw new IndexOutOfBoundsException(sbM5126.toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f50309, 0, this.f50310);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37005(int i, int i2, int i3, String str) {
        int i4 = i2 - i;
        char[] cArr = this.f50309;
        if (cArr.length < i4) {
            int length = cArr.length;
            while (length < i4) {
                length *= 2;
            }
            this.f50309 = new char[length];
        }
        for (int i5 = 0; i5 < i4; i5++) {
            this.f50309[i5] = C13216.m32733(str.charAt(i + i5), i3);
        }
        this.f50310 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37006(int i, int i2, String str) {
        int i3 = i2 - i;
        int i4 = i3 + 2;
        char[] cArr = this.f50309;
        if (cArr.length < i4) {
            int length = cArr.length;
            while (length < i4) {
                length *= 2;
            }
            this.f50309 = new char[length];
        }
        char[] cArr2 = this.f50309;
        cArr2[0] = 'L';
        str.getChars(i, i2, cArr2, 1);
        this.f50309[i3 + 1] = ';';
        this.f50310 = i4;
    }
}
