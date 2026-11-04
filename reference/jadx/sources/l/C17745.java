package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ܽܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17745 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20729 f58287;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f58288;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23713 f58289;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f58290;

    public C17745(C20729 c20729, C23713 c23713, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f58287 = c20729;
        this.f58289 = c23713;
        this.f58288 = viewPropertyAnimator;
        this.f58290 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC11800 abstractC11800 = this.f58289.f76846;
        this.f58287.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f58288.setListener(null);
        View view = this.f58290;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C23713 c23713 = this.f58289;
        AbstractC11800 abstractC11800 = c23713.f76846;
        C20729 c20729 = this.f58287;
        c20729.m10755(abstractC11800);
        c20729.f66424.remove(c23713.f76846);
        c20729.m47415();
    }
}
