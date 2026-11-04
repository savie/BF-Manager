package l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ܶ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes4.dex */
public final class C15728 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23188 f51164;

    public C15728(C23188 c23188) {
        this.f51164 = c23188;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f51164.m52113(valueAnimator.getAnimatedFraction());
    }
}
