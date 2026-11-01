package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۗۤܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3175 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3797 f11933;

    public C3175(C3797 c3797) {
        this.f11933 = c3797;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C3797 c3797 = this.f11933;
        if (!(c3797.f13698 instanceof C3134) || c3797.f13700) {
            return;
        }
        ((C3134) c3797.f13698).m9507();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3797 c3797 = this.f11933;
        if (c3797.f13683 != null) {
            c3797.f13683.setVisibility(4);
        }
        if (c3797.f13680 != null) {
            c3797.f13680.setVisibility(4);
        }
        if (c3797.f13687 != null) {
            c3797.f13687.setVisibility(4);
        }
    }
}
