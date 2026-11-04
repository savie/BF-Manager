package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۢۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9937 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9191 f31875;

    public C9937(C9191 c9191) {
        this.f31875 = c9191;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C9191 c9191 = this.f31875;
        if (c9191.f29987 != null) {
            c9191.f29987.setVisibility(0);
            c9191.f29987.setTranslationX(c9191.f29987.getWidth());
            c9191.f29987.scrollTo(c9191.f29987.getWidth(), 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C9191 c9191 = this.f31875;
        if (c9191.f29998 != null) {
            c9191.f29998.setVisibility(4);
        }
    }
}
