package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.֨ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes2.dex */
public final class C1338 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f4789 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2829 f4790;

    public C1338(C2829 c2829) {
        this.f4790 = c2829;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f4789) {
            this.f4789 = false;
            return;
        }
        C2829 c2829 = this.f4790;
        if (((Float) c2829.f9300.getAnimatedValue()).floatValue() == 0.0f) {
            c2829.f9298 = 0;
            c2829.m9312(0);
        } else {
            c2829.f9298 = 2;
            c2829.m9311();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4789 = true;
    }
}
