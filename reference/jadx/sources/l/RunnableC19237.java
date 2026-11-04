package l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ᩳܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC19237 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2829 f62238;

    public RunnableC19237(C2829 c2829) {
        this.f62238 = c2829;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2829 c2829 = this.f62238;
        ValueAnimator valueAnimator = c2829.f9300;
        int i = c2829.f9298;
        if (i == 1) {
            valueAnimator.cancel();
        } else if (i != 2) {
            return;
        }
        c2829.f9298 = 3;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        valueAnimator.setDuration(500);
        valueAnimator.start();
    }
}
