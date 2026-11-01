package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.᩸ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U53B */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractInterpolatorC21407 implements Interpolator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f69593;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float[] f69594;

    public AbstractInterpolatorC21407(float[] fArr) {
        this.f69594 = fArr;
        this.f69593 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f69594;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f69593;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return C0280.m1792(fArr[iMin + 1], f4, f3, f4);
    }
}
