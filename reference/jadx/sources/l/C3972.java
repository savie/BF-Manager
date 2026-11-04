package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۘۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3972 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9191 f13611;

    public C3972(C9191 c9191) {
        this.f13611 = c9191;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C9191 c9191 = this.f13611;
        if (!(c9191.f29994 instanceof C4146) || c9191.f30000) {
            return;
        }
        ((C4146) c9191.f29994).m13290();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C9191 c9191 = this.f13611;
        if (c9191.f29995 != null) {
            c9191.f29995.setVisibility(4);
        }
        if (c9191.f29999 != null) {
            c9191.f29999.setVisibility(4);
        }
        if (c9191.f29977 != null) {
            c9191.f29977.setVisibility(4);
        }
    }
}
