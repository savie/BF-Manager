package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ܿܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes4.dex */
public final class InterpolatorC17472 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return f * f * f * f * f;
    }
}
