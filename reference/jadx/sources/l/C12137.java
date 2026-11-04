package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B6JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double[] f39032;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f39033;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f39034;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f39035;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double[] f39036;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f39037;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f39038;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f39039;

    public C12137(int i) {
        this.f39033 = new int[i];
        this.f39039 = new int[i];
        this.f39032 = new double[i];
        this.f39036 = new double[i + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30336() {
        return this.f39033.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30337(double d) {
        int[] iArr = this.f39033;
        int i = 0;
        double d2 = 0.0d;
        for (int iHighestOneBit = Integer.highestOneBit(iArr.length); iHighestOneBit != 0; iHighestOneBit >>= 1) {
            int i2 = i + iHighestOneBit;
            if (i2 <= iArr.length) {
                double d3 = this.f39036[i2];
                if (d2 + d3 <= d) {
                    d2 += d3;
                    i = i2;
                }
            }
        }
        return Math.min(iArr.length - 1, i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final double m30345() {
        return Math.max(0.0d, m30343(this.f39033.length) - this.f39038);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m30347(int i) {
        return this.f39033[i] > 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m30342(int i) {
        return this.f39033[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30338(int i) {
        return this.f39039[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30339(int i, float f, int i2) {
        this.f39035 = i;
        this.f39034 = i2;
        this.f39038 = 2.0f * f;
        this.f39037 = Math.max(f * 48.0f, ((double) i2) / 24.0d);
        double[] dArr = this.f39036;
        Arrays.fill(dArr, 0.0d);
        int i3 = 0;
        while (i3 < this.f39033.length) {
            double dM30335 = m30335(i3);
            double[] dArr2 = this.f39032;
            dArr2[i3] = dM30335;
            int i4 = i3 + 1;
            double d = dArr[i4] + dArr2[i3];
            dArr[i4] = d;
            int i5 = ((-i4) & i4) + i4;
            if (i5 < dArr.length) {
                dArr[i5] = dArr[i5] + d;
            }
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30340(int i, int i2, int i3) {
        this.f39033[i] = i2;
        this.f39039[i] = i3;
        double dM30335 = m30335(i);
        double[] dArr = this.f39032;
        double d = dM30335 - dArr[i];
        dArr[i] = dM30335;
        int i4 = i + 1;
        while (true) {
            double[] dArr2 = this.f39036;
            if (i4 >= dArr2.length) {
                return;
            }
            dArr2[i4] = dArr2[i4] + d;
            i4 += (-i4) & i4;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private double m30335(int i) {
        return (m30347(i) ? Math.max(this.f39037, ((double) this.f39039[i]) * m30344(i)) : Math.max(1, this.f39034)) + this.f39038;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final double m30344(int i) {
        if (m30347(i)) {
            return Math.min(4.0d, ((double) this.f39035) / ((double) this.f39033[i]));
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final double m30341(int i) {
        return this.f39032[i] - this.f39038;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final double m30346(int i) {
        return (m30341(i) - (((double) this.f39039[i]) * m30344(i))) / 2.0d;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m30343(int i) {
        double d = 0.0d;
        while (i > 0) {
            d += this.f39036[i];
            i -= (-i) & i;
        }
        return d;
    }
}
