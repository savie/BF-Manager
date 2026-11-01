package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩷֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: VBK3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20532 extends AbstractC15594 implements Serializable {
    public static final long serialVersionUID = -2870572449815403710L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f66514;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f66515;

    @Override // l.AbstractC15594
    public final double getX() {
        return this.f66514;
    }

    @Override // l.AbstractC15594
    public final double getY() {
        return this.f66515;
    }

    @Override // l.AbstractC15594
    /* JADX INFO: renamed from: ۙ */
    public final void mo19028(double d, double d2) {
        this.f66514 = (float) d;
        this.f66515 = (float) d2;
    }

    public final String toString() {
        return "Point2D.Float[" + this.f66514 + ", " + this.f66515 + "]";
    }
}
