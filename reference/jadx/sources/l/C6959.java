package l;

/* JADX INFO: renamed from: l.ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 21AZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6959 extends C23188 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public double f23392;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public double f23393;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f23394;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public double f23395;

    public C6959(String str) {
        this.f75245 = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f23393 = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i);
        this.f23395 = Double.parseDouble(str.substring(i, iIndexOf3).trim());
        int i2 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i2);
        this.f23394 = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
        int i3 = iIndexOf4 + 1;
        this.f23392 = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private double m18707(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.f23394 * d5) + (this.f23393 * d4) + (d * d * d);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private double m18706(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.f23392 * d5) + (this.f23395 * d4) + (d * d * d);
    }

    @Override // l.C23188
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final double mo18709(double d) {
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 1.0E-4d) {
            d2 *= 0.5d;
            d3 = m18707(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        return (m18706(d5) - m18706(d4)) / (m18707(d5) - m18707(d4));
    }

    @Override // l.C23188
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double mo18708(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 0.01d) {
            d2 *= 0.5d;
            d3 = m18707(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double dM18707 = m18707(d4);
        double d5 = d3 + d2;
        double dM18708 = m18707(d5);
        double dM18706 = m18706(d4);
        return (((d - dM18707) * (m18706(d5) - dM18706)) / (dM18708 - dM18707)) + dM18706;
    }
}
