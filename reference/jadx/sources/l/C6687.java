package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۛ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6687 extends AbstractC24587 implements Serializable {
    public static final long serialVersionUID = -2870572449815403710L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f22278;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f22279;

    @Override // l.AbstractC24587
    public final double getX() {
        return this.f22278;
    }

    @Override // l.AbstractC24587
    public final double getY() {
        return this.f22279;
    }

    @Override // l.AbstractC24587
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18708(double d, double d2) {
        this.f22278 = (float) d;
        this.f22279 = (float) d2;
    }

    public final String toString() {
        return "Point2D.Float[" + this.f22278 + ", " + this.f22279 + "]";
    }
}
