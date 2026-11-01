package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.֨۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0975 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3797 f3810;

    public C0975(C3797 c3797) {
        this.f3810 = c3797;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C3797 c3797 = this.f3810;
        if (c3797.f13679 != null) {
            c3797.f13679.setVisibility(0);
            c3797.f13679.setTranslationX(c3797.f13679.getWidth());
            c3797.f13679.scrollTo(c3797.f13679.getWidth(), 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3797 c3797 = this.f3810;
        if (c3797.f13694 != null) {
            c3797.f13694.setVisibility(4);
        }
    }
}
