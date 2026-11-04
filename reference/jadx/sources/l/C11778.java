package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ۧܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11778 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20729 f38050;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11800 f38051;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f38052;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f38053;

    public C11778(View view, ViewPropertyAnimator viewPropertyAnimator, C20729 c20729, AbstractC11800 abstractC11800) {
        this.f38050 = c20729;
        this.f38051 = abstractC11800;
        this.f38052 = viewPropertyAnimator;
        this.f38053 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f38050.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f38052.setListener(null);
        this.f38053.setAlpha(1.0f);
        C20729 c20729 = this.f38050;
        AbstractC11800 abstractC11800 = this.f38051;
        c20729.m10755(abstractC11800);
        c20729.f66425.remove(abstractC11800);
        c20729.m47415();
    }
}
