package l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ܳܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes4.dex */
public final class C14651 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1949 f47913;

    public C14651(C1949 c1949) {
        this.f47913 = c1949;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f47913.m6310(valueAnimator.getAnimatedFraction());
    }
}
