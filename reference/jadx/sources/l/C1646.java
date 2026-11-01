package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֫ۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1646 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f6575;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f6576;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f6577;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f6578;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f6579;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9409 f6580;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f6581;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f6582;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f6583;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f6584;

    public C1646(C9409 c9409, int i, int i2) {
        this.f6580 = c9409;
        this.f6578 = i;
        this.f6577 = i2;
        m5540();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m5536() {
        return ((this.f6583 - this.f6579) + 1) * ((this.f6581 - this.f6584) + 1) * ((this.f6576 - this.f6575) + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5537() {
        return (this.f6577 + 1) - this.f6578 > 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5540() {
        C9409 c9409 = this.f6580;
        int[] iArr = c9409.f31890;
        int[] iArr2 = c9409.f31892;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = this.f6578; i8 <= this.f6577; i8++) {
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
        this.f6575 = i;
        this.f6576 = i4;
        this.f6584 = i2;
        this.f6581 = i5;
        this.f6579 = i3;
        this.f6583 = i6;
        this.f6582 = i7;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1646 m5538() {
        int i;
        if (!m5537()) {
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
        int i2 = this.f6576 - this.f6575;
        int i3 = this.f6581 - this.f6584;
        int i4 = this.f6583 - this.f6579;
        if (i2 < i3 || i2 < i4) {
            i = (i3 < i2 || i3 < i4) ? -1 : -2;
        } else {
            i = -3;
        }
        C9409 c9409 = this.f6580;
        int[] iArr = c9409.f31890;
        int[] iArr2 = c9409.f31892;
        int i5 = this.f6577;
        int iMin = this.f6578;
        C9409.m24153(i, iMin, i5, iArr);
        Arrays.sort(iArr, iMin, this.f6577 + 1);
        C9409.m24153(i, iMin, this.f6577, iArr);
        int i6 = this.f6582 / 2;
        int i7 = 0;
        int i8 = iMin;
        while (true) {
            int i9 = this.f6577;
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
        C1646 c1646 = new C1646(c9409, iMin + 1, this.f6577);
        this.f6577 = iMin;
        m5540();
        return c1646;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23555 m5539() {
        C9409 c9409 = this.f6580;
        int[] iArr = c9409.f31890;
        int[] iArr2 = c9409.f31892;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.f6578; i5 <= this.f6577; i5++) {
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            i2 += i7;
            i += ((i6 >> 10) & 31) * i7;
            i3 += ((i6 >> 5) & 31) * i7;
            i4 += i7 * (i6 & 31);
        }
        float f = i2;
        return new C23555(C9409.m24152(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
    }
}
