package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ۛ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5708 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f19454;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2885 f19455;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12554 f19456;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f19457;

    public C5708(View view, ViewPropertyAnimator viewPropertyAnimator, C2885 c2885, AbstractC12554 abstractC12554) {
        this.f19455 = c2885;
        this.f19456 = abstractC12554;
        this.f19454 = view;
        this.f19457 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f19455.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f19454.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f19457.setListener(null);
        C2885 c2885 = this.f19455;
        AbstractC12554 abstractC12554 = this.f19456;
        c2885.m5955(abstractC12554);
        c2885.f10877.remove(abstractC12554);
        c2885.m8685();
    }
}
