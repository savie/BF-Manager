package l;

/* JADX INFO: renamed from: l.᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20761 extends AbstractInterpolatorC8767 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10884 f67557;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f67559;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f67560 = 0.0f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f67558 = 0.0f;

    public C20761(C10884 c10884) {
        this.f67557 = c10884;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.f67560;
        C10884 c10884 = this.f67557;
        if (f2 > 0.0f) {
            float f3 = this.f67559;
            if (f2 / f3 < f) {
                f = f2 / f3;
            }
            c10884.f37037 = f2 - (f3 * f);
            return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.f67558;
        }
        float f4 = this.f67559;
        if ((-f2) / f4 < f) {
            f = (-f2) / f4;
        }
        c10884.f37037 = (f4 * f) + f2;
        return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.f67558;
    }

    @Override // l.AbstractInterpolatorC8767
    /* JADX INFO: renamed from: ۙ */
    public final float mo22816() {
        return this.f67557.f37037;
    }
}
