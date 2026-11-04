package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96NV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9891 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31801;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15334 f31804;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31805;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f31802 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f31803 = {-1, -1};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float[] f31806 = new float[2];

    public C9891(C15334 c15334) {
        this.f31804 = c15334;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9891 m25701(C15334 c15334) {
        C9891 c9891 = new C9891(c15334);
        c9891.f31801 = true;
        c9891.m25707(0);
        return c9891;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25706(int i) {
        int i2 = i / 64;
        if (!m25704(i2)) {
            throw new IllegalStateException("Unmeasured line width");
        }
        m25702(i2, i2 + 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m25707(int i) {
        boolean z;
        int size = (int) ((((long) this.f31804.size()) + 63) / 64);
        int i2 = this.f31802;
        if (size <= i2) {
            z = false;
        } else {
            while (i2 < size) {
                i2 <<= 1;
            }
            int i3 = i2 * 2;
            int[] iArr = new int[i3];
            float[] fArr = new float[i3];
            Arrays.fill(iArr, -1);
            System.arraycopy(this.f31803, this.f31802, iArr, i2, this.f31805);
            System.arraycopy(this.f31806, this.f31802, fArr, i2, this.f31805);
            this.f31803 = iArr;
            this.f31806 = fArr;
            this.f31802 = i2;
            z = true;
        }
        int i4 = i / 64;
        int iMax = Math.max(this.f31805, size);
        for (int i5 = i4; i5 < iMax; i5++) {
            if (i5 < size) {
                if (!m25704(i5)) {
                    return false;
                }
            } else {
                int[] iArr2 = this.f31803;
                int i6 = this.f31802;
                iArr2[i6 + i5] = -1;
                this.f31806[i6 + i5] = 0.0f;
            }
        }
        this.f31805 = size;
        if (z) {
            for (int i7 = this.f31802 - 1; i7 > 0; i7--) {
                m25703(i7);
            }
        } else if (i4 < iMax) {
            m25702(i4, iMax);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25705() {
        return Math.max(0, this.f31803[1]);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m25704(int i) {
        int i2 = i * 64;
        C15334 c15334 = this.f31804;
        int iMin = Math.min(64, c15334.size() - i2) + i2;
        int i3 = i2;
        float f = -1.0f;
        while (i2 < iMin) {
            float f2 = c15334.getFloat(i2);
            if (f2 < 0.0f) {
                if (!this.f31801) {
                    return false;
                }
            } else if (f2 > f) {
                i3 = i2;
                f = f2;
            }
            i2++;
        }
        int[] iArr = this.f31803;
        int i4 = this.f31802 + i;
        iArr[i4] = i3;
        this.f31806[i4] = f;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25702(int i, int i2) {
        int i3 = this.f31802;
        int i4 = (i + i3) >> 1;
        int i5 = ((i3 + i2) - 1) >> 1;
        while (i4 > 0) {
            for (int i6 = i4; i6 <= i5; i6++) {
                m25703(i6);
            }
            i4 >>= 1;
            i5 >>= 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m25703(int i) {
        int i2 = i * 2;
        int i3 = i2 + 1;
        int[] iArr = this.f31803;
        if (iArr[i2] < 0) {
            i2 = i3;
        } else if (iArr[i3] >= 0) {
            float[] fArr = this.f31806;
            if (fArr[i2] < fArr[i3]) {
                i2 = i3;
            }
        }
        iArr[i] = iArr[i2];
        float[] fArr2 = this.f31806;
        fArr2[i] = fArr2[i2];
    }
}
