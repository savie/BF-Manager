package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ۖۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9R5 */
/* JADX INFO: loaded from: classes2.dex */
public final class InterpolatorC2604 implements Interpolator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final float f8368;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final float f8369;

    static {
        float fM8733 = 1.0f / m8733(1.0f);
        f8368 = fM8733;
        f8369 = 1.0f - (fM8733 * m8733(1.0f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m8733(float f) {
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) Math.exp(-f2)));
        }
        return C19967.m45884(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float fM8733 = f8368 * m8733(f);
        return fM8733 > 0.0f ? fM8733 + f8369 : fM8733;
    }
}
