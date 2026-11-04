package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes.dex */
public final class C25381 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f81942;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f81943;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f81944;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f81945;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17175 f81946;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f81947;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f81948;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f81949;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f81950;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f81951;

    public C25381(C17175 c17175, int i, int i2) {
        this.f81946 = c17175;
        this.f81943 = i;
        this.f81942 = i2;
        m56745();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m56746() {
        return ((this.f81950 - this.f81949) + 1) * ((this.f81945 - this.f81948) + 1) * ((this.f81951 - this.f81947) + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m56742() {
        return (this.f81942 + 1) - this.f81943 > 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56745() {
        C17175 c17175 = this.f81946;
        int[] iArr = c17175.f55985;
        int[] iArr2 = c17175.f55986;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = this.f81943; i8 <= this.f81942; i8++) {
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
        this.f81947 = i;
        this.f81951 = i4;
        this.f81948 = i2;
        this.f81945 = i5;
        this.f81949 = i3;
        this.f81950 = i6;
        this.f81944 = i7;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C25381 m56744() {
        int i;
        if (!m56742()) {
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
        int i2 = this.f81951 - this.f81947;
        int i3 = this.f81945 - this.f81948;
        int i4 = this.f81950 - this.f81949;
        if (i2 < i3 || i2 < i4) {
            i = (i3 < i2 || i3 < i4) ? -1 : -2;
        } else {
            i = -3;
        }
        C17175 c17175 = this.f81946;
        int[] iArr = c17175.f55985;
        int[] iArr2 = c17175.f55986;
        int i5 = this.f81942;
        int iMin = this.f81943;
        C17175.m40341(i, iMin, i5, iArr);
        Arrays.sort(iArr, iMin, this.f81942 + 1);
        C17175.m40341(i, iMin, this.f81942, iArr);
        int i6 = this.f81944 / 2;
        int i7 = 0;
        int i8 = iMin;
        while (true) {
            int i9 = this.f81942;
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
        C25381 c25381 = new C25381(c17175, iMin + 1, this.f81942);
        this.f81942 = iMin;
        m56745();
        return c25381;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3751 m56743() {
        C17175 c17175 = this.f81946;
        int[] iArr = c17175.f55985;
        int[] iArr2 = c17175.f55986;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.f81943; i5 <= this.f81942; i5++) {
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            i2 += i7;
            i += ((i6 >> 10) & 31) * i7;
            i3 += ((i6 >> 5) & 31) * i7;
            i4 += i7 * (i6 & 31);
        }
        float f = i2;
        return new C3751(C17175.m40340(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
    }
}
