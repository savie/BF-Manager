package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5CY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13448 extends AnimatorListenerAdapter implements InterfaceC24031 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f44494 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f44495;

    @Override // l.InterfaceC24031
    public final void onTransitionCancel(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766) {
        throw null;
    }

    @Override // l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766, boolean z) {
    }

    @Override // l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766) {
        throw null;
    }

    @Override // l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766, boolean z) {
    }

    public C13448(View view) {
        this.f44495 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f44495;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f44494 = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f44494;
        View view = this.f44495;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C16000.m37977(view, 1.0f);
        C16000.m37976();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C16000.m37977(this.f44495, 1.0f);
    }

    @Override // l.InterfaceC24031
    public final void onTransitionPause(AbstractC11766 abstractC11766) {
        View view = this.f44495;
        view.setTag(R.id.MT_Protector, Float.valueOf(view.getVisibility() == 0 ? C16000.m37975(view) : 0.0f));
    }

    @Override // l.InterfaceC24031
    public final void onTransitionResume(AbstractC11766 abstractC11766) {
        this.f44495.setTag(R.id.MT_Protector, null);
    }
}
