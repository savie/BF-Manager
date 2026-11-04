package l;

/* JADX INFO: renamed from: l.᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 21AZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20778 extends C12573 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public double f66560;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public double f66561;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f66562;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double f66563;

    public C20778(String str) {
        this.f40369 = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f66563 = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i);
        this.f66561 = Double.parseDouble(str.substring(i, iIndexOf3).trim());
        int i2 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i2);
        this.f66562 = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
        int i3 = iIndexOf4 + 1;
        this.f66560 = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private double m47533(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.f66562 * d5) + (this.f66563 * d4) + (d * d * d);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private double m47534(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.f66560 * d5) + (this.f66561 * d4) + (d * d * d);
    }

    @Override // l.C12573
    /* JADX INFO: renamed from: ᩷ */
    public final double mo31289(double d) {
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 1.0E-4d) {
            d2 *= 0.5d;
            d3 = m47533(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        return (m47534(d5) - m47534(d4)) / (m47533(d5) - m47533(d4));
    }

    @Override // l.C12573
    /* JADX INFO: renamed from: ۙ */
    public final double mo31288(double d) {
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
            d3 = m47533(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double dM47533 = m47533(d4);
        double d5 = d3 + d2;
        double dM47534 = m47533(d5);
        double dM47535 = m47534(d4);
        return (((d - dM47533) * (m47534(d5) - dM47535)) / (dM47534 - dM47533)) + dM47535;
    }
}
