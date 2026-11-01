package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: l.ܿ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16997 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f54342;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2885 f54343;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12554 f54344;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f54345;

    public C16997(View view, ViewPropertyAnimator viewPropertyAnimator, C2885 c2885, AbstractC12554 abstractC12554) {
        this.f54343 = c2885;
        this.f54344 = abstractC12554;
        this.f54345 = viewPropertyAnimator;
        this.f54342 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f54343.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f54345.setListener(null);
        this.f54342.setAlpha(1.0f);
        C2885 c2885 = this.f54343;
        AbstractC12554 abstractC12554 = this.f54344;
        c2885.m5955(abstractC12554);
        c2885.f10876.remove(abstractC12554);
        c2885.m8685();
    }
}
