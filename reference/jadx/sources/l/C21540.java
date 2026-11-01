package l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.᩸ۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5XC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21540 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8135 f69973;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18718 f69974;

    public C21540(C8135 c8135, C18718 c18718) {
        this.f69973 = c8135;
        this.f69974 = c18718;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C18718 c18718 = this.f69974;
        C8135.m21438(fFloatValue, c18718);
        C8135 c8135 = this.f69973;
        c8135.m21441(fFloatValue, c18718, false);
        c8135.invalidateSelf();
    }
}
