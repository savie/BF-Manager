package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ܺܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16999 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20729 f55541;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55542;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f55543;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11800 f55544;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f55545;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f55546;

    public C16999(C20729 c20729, AbstractC11800 abstractC11800, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f55541 = c20729;
        this.f55544 = abstractC11800;
        this.f55542 = i;
        this.f55543 = view;
        this.f55546 = i2;
        this.f55545 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f55541.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f55542;
        View view = this.f55543;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f55546 != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f55545.setListener(null);
        C20729 c20729 = this.f55541;
        AbstractC11800 abstractC11800 = this.f55544;
        c20729.m10755(abstractC11800);
        c20729.f66427.remove(abstractC11800);
        c20729.m47415();
    }
}
