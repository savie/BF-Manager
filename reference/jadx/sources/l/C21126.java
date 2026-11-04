package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.᩶ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21126 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9191 f67497;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12921 f67498;

    public C21126(C9191 c9191, C12921 c12921) {
        this.f67497 = c9191;
        this.f67498 = c12921;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f67497.m24317(3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C9191 c9191 = this.f67497;
        c9191.m24317(1);
        if (c9191.f29996) {
            this.f67498.post(c9191.f29993);
            c9191.f29996 = false;
        }
    }
}
