package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۨ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12652 extends AbstractC24587 implements Serializable {
    public static final long serialVersionUID = 6150783262733311327L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public double f40565;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public double f40566;

    public C12652(double d, double d2) {
        this.f40565 = d;
        this.f40566 = d2;
    }

    @Override // l.AbstractC24587
    public final double getX() {
        return this.f40565;
    }

    @Override // l.AbstractC24587
    public final double getY() {
        return this.f40566;
    }

    @Override // l.AbstractC24587
    /* JADX INFO: renamed from: ۙ */
    public final void mo18708(double d, double d2) {
        this.f40565 = d;
        this.f40566 = d2;
    }

    public final String toString() {
        return "Point2D.Double[" + this.f40565 + ", " + this.f40566 + "]";
    }
}
