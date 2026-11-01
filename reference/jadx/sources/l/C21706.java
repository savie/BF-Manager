package l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.᩸ܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes4.dex */
public final class C21706 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18178 f70397;

    public C21706(C18178 c18178) {
        this.f70397 = c18178;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C18178 c18178 = this.f70397;
        c18178.f58078.setAlpha(iFloatValue);
        c18178.f58097.setAlpha(iFloatValue);
        c18178.m42299();
    }
}
