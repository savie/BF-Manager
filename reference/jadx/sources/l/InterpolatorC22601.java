package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.᩸ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC22601 implements Interpolator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12573 f73056;

    public InterpolatorC22601(C12573 c12573) {
        this.f73056 = c12573;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.f73056.mo31288(f);
    }
}
