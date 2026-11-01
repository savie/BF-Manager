package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۙ۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4503 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3797 f16012;

    public C4503(C3797 c3797) {
        this.f16012 = c3797;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C3797 c3797 = this.f16012;
        if (c3797.f13683 != null) {
            c3797.f13683.setVisibility(0);
        }
        if (c3797.f13680 != null) {
            c3797.f13680.setVisibility(0);
        }
        if (c3797.f13687 != null) {
            c3797.f13687.setVisibility(c3797.f13700 ? 0 : 4);
        }
        if (!(c3797.f13698 instanceof C3134) || c3797.f13700) {
            return;
        }
        ((C3134) c3797.f13698).m9499();
    }
}
