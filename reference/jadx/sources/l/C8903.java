package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۠᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S708 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8903 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f29088 = C7412.f24420;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f29089;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7412 m23813(int i) {
        int[] iArr = this.f29088;
        if (iArr == null) {
            throw new IllegalStateException("Search match builder is already built");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Negative search text length");
        }
        int i2 = this.f29089;
        if (i2 != 0 && iArr[((i2 - 1) << 1) + 1] > i) {
            throw new IllegalArgumentException("Search match is outside the text");
        }
        C7412 c7412 = new C7412(i2, i, iArr);
        this.f29088 = null;
        return c7412;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23814(int i, int i2) {
        int[] iArr = this.f29088;
        if (iArr == null) {
            throw new IllegalStateException("Search match builder is already built");
        }
        if (i < 0 || i2 <= i) {
            throw new IllegalArgumentException("Invalid search match range");
        }
        int i3 = this.f29089;
        if (i3 != 0 && i < iArr[((i3 - 1) << 1) + 1]) {
            throw new IllegalArgumentException("Search matches overlap or are out of order");
        }
        long j = ((long) i3) + ((long) 1);
        long j2 = (int) j;
        if (j != j2) {
            throw new ArithmeticException();
        }
        long j3 = j2 * ((long) 2);
        int i4 = (int) j3;
        if (j3 != i4) {
            throw new ArithmeticException();
        }
        if (iArr.length < i4) {
            int length = iArr.length == 0 ? 16 : iArr.length;
            while (true) {
                if (length >= i4) {
                    i4 = length;
                    break;
                }
                int i5 = length << 1;
                if (i5 <= length) {
                    break;
                } else {
                    length = i5;
                }
            }
            this.f29088 = Arrays.copyOf(this.f29088, i4);
        }
        int[] iArr2 = this.f29088;
        int i6 = this.f29089;
        int i7 = i6 << 1;
        iArr2[i7] = i;
        iArr2[i7 + 1] = i2;
        this.f29089 = i6 + 1;
    }
}
