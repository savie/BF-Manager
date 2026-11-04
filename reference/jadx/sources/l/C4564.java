package l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ۙ֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D5XC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4564 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22464 f16238;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10529 f16239;

    public C4564(C22464 c22464, C10529 c10529) {
        this.f16238 = c22464;
        this.f16239 = c10529;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C10529 c10529 = this.f16239;
        C22464.m50651(fFloatValue, c10529);
        C22464 c22464 = this.f16238;
        c22464.m50654(fFloatValue, c10529, false);
        c22464.invalidateSelf();
    }
}
