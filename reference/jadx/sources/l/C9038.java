package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P5CY */
/* JADX INFO: loaded from: classes4.dex */
public final class C9038 extends AnimatorListenerAdapter implements InterfaceC12261 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f29400 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View f29401;

    @Override // l.InterfaceC12261
    public final void onTransitionCancel(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329) {
        throw null;
    }

    @Override // l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329, boolean z) {
    }

    @Override // l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329) {
        throw null;
    }

    @Override // l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329, boolean z) {
    }

    public C9038(View view) {
        this.f29401 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f29401;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f29400 = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.f29400;
        View view = this.f29401;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C11319.m28605(view, 1.0f);
        C11319.m28604();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C11319.m28605(this.f29401, 1.0f);
    }

    @Override // l.InterfaceC12261
    public final void onTransitionPause(AbstractC0329 abstractC0329) {
        View view = this.f29401;
        view.setTag(R.id.MT_Protector, Float.valueOf(view.getVisibility() == 0 ? C11319.m28603(view) : 0.0f));
    }

    @Override // l.InterfaceC12261
    public final void onTransitionResume(AbstractC0329 abstractC0329) {
        this.f29401.setTag(R.id.MT_Protector, null);
    }
}
