package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.᩻֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes.dex */
public final class C23348 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f75647;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2885 f75648;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f75649;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1474 f75650;

    public C23348(C2885 c2885, C1474 c1474, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f75648 = c2885;
        this.f75650 = c1474;
        this.f75649 = viewPropertyAnimator;
        this.f75647 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC12554 abstractC12554 = this.f75650.f5998;
        this.f75648.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f75649.setListener(null);
        View view = this.f75647;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C1474 c1474 = this.f75650;
        AbstractC12554 abstractC12554 = c1474.f5998;
        C2885 c2885 = this.f75648;
        c2885.m5955(abstractC12554);
        c2885.f10874.remove(c1474.f5998);
        c2885.m8685();
    }
}
