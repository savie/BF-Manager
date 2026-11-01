package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ܳ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C14176 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f46526;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2885 f46527;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f46528;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1474 f46529;

    public C14176(C2885 c2885, C1474 c1474, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f46527 = c2885;
        this.f46529 = c1474;
        this.f46526 = viewPropertyAnimator;
        this.f46528 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC12554 abstractC12554 = this.f46529.f6001;
        this.f46527.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f46526.setListener(null);
        View view = this.f46528;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C1474 c1474 = this.f46529;
        AbstractC12554 abstractC12554 = c1474.f6001;
        C2885 c2885 = this.f46527;
        c2885.m5955(abstractC12554);
        c2885.f10874.remove(c1474.f6001);
        c2885.m8685();
    }
}
