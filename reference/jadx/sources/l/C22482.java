package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A1CD */
/* JADX INFO: loaded from: classes.dex */
public final class C22482 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static double[] f73382 = new double[91];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public double f73383;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public double f73384;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f73385;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f73386;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f73387;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f73388;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public double f73389;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public double f73390;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public double f73391;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public double[] f73392;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public double f73393;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public double f73394;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f73395;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f73396;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public double f73397;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double f73398;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public double f73399;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public double f73400;

    public C22482(int i, double d, double d2, double d3, double d4, double d5, double d6) {
        double[] dArr;
        double dHypot;
        double d7 = d3;
        this.f73386 = false;
        boolean z = i == 1;
        this.f73395 = z;
        this.f73388 = d;
        this.f73400 = d2;
        double d8 = d2 - d;
        double d9 = 1.0d / d8;
        this.f73385 = d9;
        if (3 == i) {
            this.f73386 = true;
        }
        double d10 = d5 - d7;
        double d11 = d6 - d4;
        if (this.f73386 || Math.abs(d10) < 0.001d || Math.abs(d11) < 0.001d) {
            this.f73386 = true;
            this.f73396 = d7;
            this.f73389 = d5;
            this.f73397 = d4;
            this.f73390 = d6;
            double dHypot2 = Math.hypot(d11, d10);
            this.f73393 = dHypot2;
            this.f73391 = dHypot2 * d9;
            this.f73399 = d10 / d8;
            this.f73383 = d11 / d8;
            return;
        }
        double[] dArr2 = new double[101];
        this.f73392 = dArr2;
        this.f73384 = ((double) (z ? -1 : 1)) * d10;
        this.f73387 = d11 * ((double) (z ? 1 : -1));
        this.f73399 = z ? d5 : d7;
        this.f73383 = z ? d4 : d6;
        double d12 = d4 - d6;
        int i2 = 0;
        double d13 = 0.0d;
        double d14 = 0.0d;
        double d15 = 0.0d;
        while (true) {
            dArr = f73382;
            if (i2 >= 91) {
                break;
            }
            double d16 = d13;
            double radians = Math.toRadians((((double) i2) * 90.0d) / ((double) 90));
            double dSin = Math.sin(radians) * d10;
            double dCos = Math.cos(radians) * d12;
            if (i2 > 0) {
                dHypot = d16 + Math.hypot(dSin - d14, dCos - d15);
                dArr[i2] = dHypot;
            } else {
                dHypot = d16;
            }
            i2++;
            d15 = dCos;
            d13 = dHypot;
            d14 = dSin;
        }
        this.f73393 = d13;
        for (int i3 = 0; i3 < 91; i3++) {
            dArr[i3] = dArr[i3] / d13;
        }
        for (int i4 = 0; i4 < 101; i4++) {
            double d17 = ((double) i4) / ((double) 100);
            int iBinarySearch = Arrays.binarySearch(dArr, d17);
            if (iBinarySearch >= 0) {
                dArr2[i4] = iBinarySearch / 90;
            } else if (iBinarySearch == -1) {
                dArr2[i4] = 0.0d;
            } else {
                int i5 = -iBinarySearch;
                int i6 = i5 - 2;
                double d18 = dArr[i6];
                dArr2[i4] = (((d17 - d18) / (dArr[i5 - 1] - d18)) + ((double) i6)) / ((double) 90);
            }
        }
        this.f73391 = this.f73393 * this.f73385;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m49986(double d) {
        double d2 = (this.f73395 ? this.f73400 - d : d - this.f73388) * this.f73385;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            d3 = 1.0d;
            if (d2 < 1.0d) {
                double[] dArr = this.f73392;
                double length = d2 * ((double) (dArr.length - 1));
                int i = (int) length;
                double d4 = dArr[i];
                d3 = ((dArr[i + 1] - d4) * (length - ((double) i))) + d4;
            }
        }
        double d5 = d3 * 1.5707963267948966d;
        this.f73398 = Math.sin(d5);
        this.f73394 = Math.cos(d5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m49984() {
        double d = this.f73384 * this.f73394;
        double dHypot = this.f73391 / Math.hypot(d, (-this.f73387) * this.f73398);
        return this.f73395 ? (-d) * dHypot : d * dHypot;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m49985(double d) {
        double d2 = (d - this.f73388) * this.f73385;
        double d3 = this.f73389;
        double d4 = this.f73396;
        return ((d3 - d4) * d2) + d4;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final double m49987(double d) {
        double d2 = (d - this.f73388) * this.f73385;
        double d3 = this.f73390;
        double d4 = this.f73397;
        return ((d3 - d4) * d2) + d4;
    }
}
