package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96NV */
/* JADX INFO: loaded from: classes3.dex */
public final class C11425 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38468;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C10982 f38469;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38471;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f38470 = 1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f38472 = {-1, -1};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float[] f38467 = new float[2];

    public C11425(C10982 c10982) {
        this.f38469 = c10982;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11425 m28537(C10982 c10982) {
        C11425 c11425 = new C11425(c10982);
        c11425.f38468 = true;
        c11425.m28542(0);
        return c11425;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28541(int i) {
        int i2 = i / 64;
        if (!m28536(i2)) {
            throw new IllegalStateException("Unmeasured line width");
        }
        m28538(i2, i2 + 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m28542(int i) {
        boolean z;
        int size = (int) ((((long) this.f38469.size()) + 63) / 64);
        int i2 = this.f38470;
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
            System.arraycopy(this.f38472, this.f38470, iArr, i2, this.f38471);
            System.arraycopy(this.f38467, this.f38470, fArr, i2, this.f38471);
            this.f38472 = iArr;
            this.f38467 = fArr;
            this.f38470 = i2;
            z = true;
        }
        int i4 = i / 64;
        int iMax = Math.max(this.f38471, size);
        for (int i5 = i4; i5 < iMax; i5++) {
            if (i5 < size) {
                if (!m28536(i5)) {
                    return false;
                }
            } else {
                int[] iArr2 = this.f38472;
                int i6 = this.f38470;
                iArr2[i6 + i5] = -1;
                this.f38467[i6 + i5] = 0.0f;
            }
        }
        this.f38471 = size;
        if (z) {
            for (int i7 = this.f38470 - 1; i7 > 0; i7--) {
                m28539(i7);
            }
        } else if (i4 < iMax) {
            m28538(i4, iMax);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28540() {
        return Math.max(0, this.f38472[1]);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m28536(int i) {
        int i2 = i * 64;
        C10982 c10982 = this.f38469;
        int iMin = Math.min(64, c10982.size() - i2) + i2;
        int i3 = i2;
        float f = -1.0f;
        while (i2 < iMin) {
            float f2 = c10982.getFloat(i2);
            if (f2 < 0.0f) {
                if (!this.f38468) {
                    return false;
                }
            } else if (f2 > f) {
                i3 = i2;
                f = f2;
            }
            i2++;
        }
        int[] iArr = this.f38472;
        int i4 = this.f38470 + i;
        iArr[i4] = i3;
        this.f38467[i4] = f;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28538(int i, int i2) {
        int i3 = this.f38470;
        int i4 = (i + i3) >> 1;
        int i5 = ((i3 + i2) - 1) >> 1;
        while (i4 > 0) {
            for (int i6 = i4; i6 <= i5; i6++) {
                m28539(i6);
            }
            i4 >>= 1;
            i5 >>= 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m28539(int i) {
        int i2 = i * 2;
        int i3 = i2 + 1;
        int[] iArr = this.f38472;
        if (iArr[i2] < 0) {
            i2 = i3;
        } else if (iArr[i3] >= 0) {
            float[] fArr = this.f38467;
            if (fArr[i2] < fArr[i3]) {
                i2 = i3;
            }
        }
        iArr[i] = iArr[i2];
        float[] fArr2 = this.f38467;
        fArr2[i] = fArr2[i2];
    }
}
