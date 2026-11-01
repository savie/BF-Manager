package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ۧ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10648 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36327;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2885 f36328;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12554 f36329;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36330;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f36331;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f36332;

    public C10648(C2885 c2885, AbstractC12554 abstractC12554, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f36328 = c2885;
        this.f36329 = abstractC12554;
        this.f36330 = i;
        this.f36332 = view;
        this.f36327 = i2;
        this.f36331 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f36328.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f36330;
        View view = this.f36332;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f36327 != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f36331.setListener(null);
        C2885 c2885 = this.f36328;
        AbstractC12554 abstractC12554 = this.f36329;
        c2885.m5955(abstractC12554);
        c2885.f10878.remove(abstractC12554);
        c2885.m8685();
    }
}
