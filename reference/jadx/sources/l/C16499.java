package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16499 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f53007;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f53008;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f53009;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f53010;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f53011;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12266 f53012;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f53013;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f53014;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53015;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f53016;

    public C16499(C12266 c12266, int i, int i2) {
        this.f53012 = c12266;
        this.f53010 = i;
        this.f53009 = i2;
        m38775();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m38771() {
        return ((this.f53015 - this.f53011) + 1) * ((this.f53013 - this.f53016) + 1) * ((this.f53008 - this.f53007) + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38772() {
        return (this.f53009 + 1) - this.f53010 > 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38775() {
        C12266 c12266 = this.f53012;
        int[] iArr = c12266.f41026;
        int[] iArr2 = c12266.f41028;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = this.f53010; i8 <= this.f53009; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i4) {
                i4 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i5) {
                i5 = i11;
            }
            if (i11 < i2) {
                i2 = i11;
            }
            if (i12 > i6) {
                i6 = i12;
            }
            if (i12 < i3) {
                i3 = i12;
            }
        }
        this.f53007 = i;
        this.f53008 = i4;
        this.f53016 = i2;
        this.f53013 = i5;
        this.f53011 = i3;
        this.f53015 = i6;
        this.f53014 = i7;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16499 m38773() {
        int i;
        if (!m38772()) {
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
        int i2 = this.f53008 - this.f53007;
        int i3 = this.f53013 - this.f53016;
        int i4 = this.f53015 - this.f53011;
        if (i2 < i3 || i2 < i4) {
            i = (i3 < i2 || i3 < i4) ? -1 : -2;
        } else {
            i = -3;
        }
        C12266 c12266 = this.f53012;
        int[] iArr = c12266.f41026;
        int[] iArr2 = c12266.f41028;
        int i5 = this.f53009;
        int iMin = this.f53010;
        C12266.m30491(i, iMin, i5, iArr);
        Arrays.sort(iArr, iMin, this.f53009 + 1);
        C12266.m30491(i, iMin, this.f53009, iArr);
        int i6 = this.f53014 / 2;
        int i7 = 0;
        int i8 = iMin;
        while (true) {
            int i9 = this.f53009;
            if (i8 > i9) {
                break;
            }
            i7 += iArr2[iArr[i8]];
            if (i7 >= i6) {
                iMin = Math.min(i9 - 1, i8);
                break;
            }
            i8++;
        }
        C16499 c16499 = new C16499(c12266, iMin + 1, this.f53009);
        this.f53009 = iMin;
        m38775();
        return c16499;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23555 m38774() {
        C12266 c12266 = this.f53012;
        int[] iArr = c12266.f41026;
        int[] iArr2 = c12266.f41028;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.f53010; i5 <= this.f53009; i5++) {
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            i2 += i7;
            i += ((i6 >> 10) & 31) * i7;
            i3 += ((i6 >> 5) & 31) * i7;
            i4 += i7 * (i6 & 31);
        }
        float f = i2;
        return new C23555(C12266.m30490(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
    }
}
