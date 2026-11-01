package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۟֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: VBK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7126 extends AbstractC15594 implements Serializable {
    public static final long serialVersionUID = 6150783262733311327L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double f23829;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public double f23830;

    public C7126(double d, double d2) {
        this.f23829 = d;
        this.f23830 = d2;
    }

    @Override // l.AbstractC15594
    public final double getX() {
        return this.f23829;
    }

    @Override // l.AbstractC15594
    public final double getY() {
        return this.f23830;
    }

    @Override // l.AbstractC15594
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19028(double d, double d2) {
        this.f23829 = d;
        this.f23830 = d2;
    }

    public final String toString() {
        return "Point2D.Double[" + this.f23829 + ", " + this.f23830 + "]";
    }
}
