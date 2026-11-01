package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11CW */
/* JADX INFO: loaded from: classes4.dex */
public final class InterpolatorC14412 implements Interpolator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23188 f47247;

    public InterpolatorC14412(C23188 c23188) {
        this.f47247 = c23188;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.f47247.mo18708(f);
    }
}
