package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B6JQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23325 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f75598;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f75599;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double[] f75600;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f75601;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f75602;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[] f75603;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public double f75604;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final double[] f75605;

    public C23325(int i) {
        this.f75603 = new int[i];
        this.f75599 = new int[i];
        this.f75600 = new double[i];
        this.f75605 = new double[i + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51401() {
        return this.f75603.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51402(double d) {
        int[] iArr = this.f75603;
        int i = 0;
        double d2 = 0.0d;
        for (int iHighestOneBit = Integer.highestOneBit(iArr.length); iHighestOneBit != 0; iHighestOneBit >>= 1) {
            int i2 = i + iHighestOneBit;
            if (i2 <= iArr.length) {
                double d3 = this.f75605[i2];
                if (d2 + d3 <= d) {
                    d2 += d3;
                    i = i2;
                }
            }
        }
        return Math.min(iArr.length - 1, i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final double m51408() {
        return Math.max(0.0d, m51410(this.f75603.length) - this.f75604);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m51400(int i) {
        return this.f75603[i] > 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m51399(int i) {
        return this.f75603[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51403(int i) {
        return this.f75599[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51404(int i, float f, int i2) {
        this.f75598 = i;
        this.f75602 = i2;
        this.f75604 = 2.0f * f;
        this.f75601 = Math.max(f * 48.0f, ((double) i2) / 24.0d);
        double[] dArr = this.f75605;
        Arrays.fill(dArr, 0.0d);
        int i3 = 0;
        while (i3 < this.f75603.length) {
            double dM51398 = m51398(i3);
            double[] dArr2 = this.f75600;
            dArr2[i3] = dM51398;
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
    public final void m51405(int i, int i2, int i3) {
        this.f75603[i] = i2;
        this.f75599[i] = i3;
        double dM51398 = m51398(i);
        double[] dArr = this.f75600;
        double d = dM51398 - dArr[i];
        dArr[i] = dM51398;
        int i4 = i + 1;
        while (true) {
            double[] dArr2 = this.f75605;
            if (i4 >= dArr2.length) {
                return;
            }
            dArr2[i4] = dArr2[i4] + d;
            i4 += (-i4) & i4;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private double m51398(int i) {
        return (m51400(i) ? Math.max(this.f75601, ((double) this.f75599[i]) * m51406(i)) : Math.max(1, this.f75602)) + this.f75604;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final double m51406(int i) {
        if (m51400(i)) {
            return Math.min(4.0d, ((double) this.f75598) / ((double) this.f75603[i]));
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final double m51407(int i) {
        return this.f75600[i] - this.f75604;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final double m51409(int i) {
        return (m51407(i) - (((double) this.f75599[i]) * m51406(i))) / 2.0d;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final double m51410(int i) {
        double d = 0.0d;
        while (i > 0) {
            d += this.f75605[i];
            i -= (-i) & i;
        }
        return d;
    }
}
