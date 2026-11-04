package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ܶܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16253 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20729 f52809;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f52810;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23713 f52811;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f52812;

    public C16253(C20729 c20729, C23713 c23713, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f52809 = c20729;
        this.f52811 = c23713;
        this.f52812 = viewPropertyAnimator;
        this.f52810 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC11800 abstractC11800 = this.f52811.f76842;
        this.f52809.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f52812.setListener(null);
        View view = this.f52810;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C23713 c23713 = this.f52811;
        AbstractC11800 abstractC11800 = c23713.f76842;
        C20729 c20729 = this.f52809;
        c20729.m10755(abstractC11800);
        c20729.f66424.remove(c23713.f76842);
        c20729.m47415();
    }
}
