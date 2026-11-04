package l;

/* JADX INFO: renamed from: l.ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C10094 extends AbstractInterpolatorC0400 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f32341;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21855 f32343;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f32342 = 0.0f;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f32340 = 0.0f;

    public C10094(C21855 c21855) {
        this.f32343 = c21855;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.f32342;
        C21855 c21855 = this.f32343;
        if (f2 > 0.0f) {
            float f3 = this.f32341;
            if (f2 / f3 < f) {
                f = f2 / f3;
            }
            c21855.f69665 = f2 - (f3 * f);
            return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.f32340;
        }
        float f4 = this.f32341;
        if ((-f2) / f4 < f) {
            f = (-f2) / f4;
        }
        c21855.f69665 = (f4 * f) + f2;
        return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.f32340;
    }

    @Override // l.AbstractInterpolatorC0400
    /* JADX INFO: renamed from: ۙ */
    public final float mo2206() {
        return this.f32343.f69665;
    }
}
