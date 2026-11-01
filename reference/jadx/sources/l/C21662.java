package l;

/* JADX INFO: renamed from: l.᩸ܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74I */
/* JADX INFO: loaded from: classes4.dex */
public final class C21662 implements CharSequence {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char[] f70252 = new char[64];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f70253;

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f70253;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i >= 0 && i < this.f70253) {
            return this.f70252[i];
        }
        StringBuilder sbM40153 = C17214.m40153(i, "index = ", ", length = ");
        sbM40153.append(this.f70253);
        throw new IndexOutOfBoundsException(sbM40153.toString());
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i >= 0 && i2 <= this.f70253 && i <= i2) {
            return new String(this.f70252, i, i2 - i);
        }
        StringBuilder sbM2791 = C0589.m2791("start = ", i, ", end = ", ", length = ", i2);
        sbM2791.append(this.f70253);
        throw new IndexOutOfBoundsException(sbM2791.toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f70252, 0, this.f70253);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48389(int i, int i2, int i3, String str) {
        int i4 = i2 - i;
        char[] cArr = this.f70252;
        if (cArr.length < i4) {
            int length = cArr.length;
            while (length < i4) {
                length *= 2;
            }
            this.f70252 = new char[length];
        }
        for (int i5 = 0; i5 < i4; i5++) {
            this.f70252[i5] = C18134.m42206(str.charAt(i + i5), i3);
        }
        this.f70253 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48390(int i, int i2, String str) {
        int i3 = i2 - i;
        int i4 = i3 + 2;
        char[] cArr = this.f70252;
        if (cArr.length < i4) {
            int length = cArr.length;
            while (length < i4) {
                length *= 2;
            }
            this.f70252 = new char[length];
        }
        char[] cArr2 = this.f70252;
        cArr2[0] = 'L';
        str.getChars(i, i2, cArr2, 1);
        this.f70252[i3 + 1] = ';';
        this.f70253 = i4;
    }
}
