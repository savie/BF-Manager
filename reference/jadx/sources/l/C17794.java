package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A1CD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17794 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static double[] f58388 = new double[91];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double f58389;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public double f58390;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f58391;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double[] f58392;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public double f58393;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f58394;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public double f58395;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public double f58396;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public double f58397;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f58398;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double f58399;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public double f58400;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f58401;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public double f58402;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f58403;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double f58404;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public double f58405;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f58406;

    public C17794(int i, double d, double d2, double d3, double d4, double d5, double d6) {
        double[] dArr;
        double dHypot;
        double d7 = d3;
        this.f58391 = false;
        boolean z = i == 1;
        this.f58398 = z;
        this.f58394 = d;
        this.f58406 = d2;
        double d8 = d2 - d;
        double d9 = 1.0d / d8;
        this.f58389 = d9;
        if (3 == i) {
            this.f58391 = true;
        }
        double d10 = d5 - d7;
        double d11 = d6 - d4;
        if (this.f58391 || Math.abs(d10) < 0.001d || Math.abs(d11) < 0.001d) {
            this.f58391 = true;
            this.f58405 = d7;
            this.f58390 = d5;
            this.f58402 = d4;
            this.f58395 = d6;
            double dHypot2 = Math.hypot(d11, d10);
            this.f58403 = dHypot2;
            this.f58393 = dHypot2 * d9;
            this.f58397 = d10 / d8;
            this.f58396 = d11 / d8;
            return;
        }
        double[] dArr2 = new double[101];
        this.f58392 = dArr2;
        this.f58404 = ((double) (z ? -1 : 1)) * d10;
        this.f58401 = d11 * ((double) (z ? 1 : -1));
        this.f58397 = z ? d5 : d7;
        this.f58396 = z ? d4 : d6;
        double d12 = d4 - d6;
        int i2 = 0;
        double d13 = 0.0d;
        double d14 = 0.0d;
        double d15 = 0.0d;
        while (true) {
            dArr = f58388;
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
        this.f58403 = d13;
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
        this.f58393 = this.f58403 * this.f58389;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41650(double d) {
        double d2 = (this.f58398 ? this.f58406 - d : d - this.f58394) * this.f58389;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            d3 = 1.0d;
            if (d2 < 1.0d) {
                double[] dArr = this.f58392;
                double length = d2 * ((double) (dArr.length - 1));
                int i = (int) length;
                double d4 = dArr[i];
                d3 = ((dArr[i + 1] - d4) * (length - ((double) i))) + d4;
            }
        }
        double d5 = d3 * 1.5707963267948966d;
        this.f58400 = Math.sin(d5);
        this.f58399 = Math.cos(d5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m41648() {
        double d = this.f58404 * this.f58399;
        double dHypot = this.f58393 / Math.hypot(d, (-this.f58401) * this.f58400);
        return this.f58398 ? (-d) * dHypot : d * dHypot;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m41649(double d) {
        double d2 = (d - this.f58394) * this.f58389;
        double d3 = this.f58390;
        double d4 = this.f58405;
        return ((d3 - d4) * d2) + d4;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final double m41651(double d) {
        double d2 = (d - this.f58394) * this.f58389;
        double d3 = this.f58395;
        double d4 = this.f58402;
        return ((d3 - d4) * d2) + d4;
    }
}
