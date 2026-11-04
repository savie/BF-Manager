package l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ۡܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9540 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2829 f30890;

    public C9540(C2829 c2829) {
        this.f30890 = c2829;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C2829 c2829 = this.f30890;
        c2829.f9312.setAlpha(iFloatValue);
        c2829.f9313.setAlpha(iFloatValue);
        c2829.m9311();
    }
}
