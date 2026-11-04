package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9165 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f29745;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29746;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f29747;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f29748;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2454 f29749;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f29750;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f29751;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f29752;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f29753;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f29754;

    public C9165(C2454 c2454, int i, int i2) {
        this.f29749 = c2454;
        this.f29746 = i;
        this.f29745 = i2;
        m24295();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m24296() {
        return ((this.f29753 - this.f29752) + 1) * ((this.f29748 - this.f29751) + 1) * ((this.f29754 - this.f29750) + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24292() {
        return (this.f29745 + 1) - this.f29746 > 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24295() {
        C2454 c2454 = this.f29749;
        int[] iArr = c2454.f7875;
        int[] iArr2 = c2454.f7877;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = this.f29746; i8 <= this.f29745; i8++) {
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
        this.f29750 = i;
        this.f29754 = i4;
        this.f29751 = i2;
        this.f29748 = i5;
        this.f29752 = i3;
        this.f29753 = i6;
        this.f29747 = i7;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9165 m24294() {
        int i;
        if (!m24292()) {
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
        int i2 = this.f29754 - this.f29750;
        int i3 = this.f29748 - this.f29751;
        int i4 = this.f29753 - this.f29752;
        if (i2 < i3 || i2 < i4) {
            i = (i3 < i2 || i3 < i4) ? -1 : -2;
        } else {
            i = -3;
        }
        C2454 c2454 = this.f29749;
        int[] iArr = c2454.f7875;
        int[] iArr2 = c2454.f7877;
        int i5 = this.f29745;
        int iMin = this.f29746;
        C2454.m8277(i, iMin, i5, iArr);
        Arrays.sort(iArr, iMin, this.f29745 + 1);
        C2454.m8277(i, iMin, this.f29745, iArr);
        int i6 = this.f29747 / 2;
        int i7 = 0;
        int i8 = iMin;
        while (true) {
            int i9 = this.f29745;
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
        C9165 c9165 = new C9165(c2454, iMin + 1, this.f29745);
        this.f29745 = iMin;
        m24295();
        return c9165;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3751 m24293() {
        C2454 c2454 = this.f29749;
        int[] iArr = c2454.f7875;
        int[] iArr2 = c2454.f7877;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.f29746; i5 <= this.f29745; i5++) {
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            i2 += i7;
            i += ((i6 >> 10) & 31) * i7;
            i3 += ((i6 >> 5) & 31) * i7;
            i4 += i7 * (i6 & 31);
        }
        float f = i2;
        return new C3751(C2454.m8276(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
    }
}
