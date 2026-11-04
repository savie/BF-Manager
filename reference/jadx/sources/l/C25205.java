package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.᩻ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes.dex */
public final class C25205 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20729 f81439;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11800 f81440;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f81441;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f81442;

    public C25205(View view, ViewPropertyAnimator viewPropertyAnimator, C20729 c20729, AbstractC11800 abstractC11800) {
        this.f81439 = c20729;
        this.f81440 = abstractC11800;
        this.f81442 = view;
        this.f81441 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f81439.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f81442.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f81441.setListener(null);
        C20729 c20729 = this.f81439;
        AbstractC11800 abstractC11800 = this.f81440;
        c20729.m10755(abstractC11800);
        c20729.f66423.remove(abstractC11800);
        c20729.m47415();
    }
}
