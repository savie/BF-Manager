package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.᩻ۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U53B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC24995 implements Interpolator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f80932;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float[] f80933;

    public AbstractInterpolatorC24995(float[] fArr) {
        this.f80933 = fArr;
        this.f80932 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f80933;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f80932;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return C19967.m45884(fArr[iMin + 1], f4, f3, f4);
    }
}
