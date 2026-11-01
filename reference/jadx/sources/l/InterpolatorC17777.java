package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ᩳۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9R5 */
/* JADX INFO: loaded from: classes4.dex */
public final class InterpolatorC17777 implements Interpolator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final float f56368;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final float f56369;

    static {
        float fM41338 = 1.0f / m41338(1.0f);
        f56368 = fM41338;
        f56369 = 1.0f - (fM41338 * m41338(1.0f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m41338(float f) {
        float f2 = f * 8.0f;
        if (f2 < 1.0f) {
            return f2 - (1.0f - ((float) Math.exp(-f2)));
        }
        return C0280.m1792(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float fM41338 = f56368 * m41338(f);
        return fM41338 > 0.0f ? fM41338 + f56369 : fM41338;
    }
}
