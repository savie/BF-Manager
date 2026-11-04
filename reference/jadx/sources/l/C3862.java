package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G64W */
/* JADX INFO: loaded from: classes3.dex */
public final class C3862 extends AnimatorListenerAdapter implements InterfaceC12261 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13175 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View f13176;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21016 f13177;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ViewGroup f13178;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f13179;

    @Override // l.InterfaceC12261
    public final void onTransitionPause(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public final void onTransitionResume(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329) {
        throw null;
    }

    @Override // l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329, boolean z) {
    }

    public C3862(AbstractC21016 abstractC21016, ViewGroup viewGroup, View view, View view2) {
        this.f13177 = abstractC21016;
        this.f13178 = viewGroup;
        this.f13176 = view;
        this.f13179 = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f13178.getOverlay().remove(this.f13176);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f13176;
        if (view.getParent() == null) {
            this.f13178.getOverlay().add(view);
        } else {
            this.f13177.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f13179;
            View view2 = this.f13176;
            view.setTag(R.id.MT_Protector, view2);
            this.f13178.getOverlay().add(view2);
            this.f13175 = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m12494();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m12494();
    }

    @Override // l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329) {
        abstractC0329.removeListener(this);
    }

    @Override // l.InterfaceC12261
    public final void onTransitionCancel(AbstractC0329 abstractC0329) {
        if (this.f13175) {
            m12494();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12494() {
        this.f13179.setTag(R.id.MT_Protector, null);
        this.f13178.getOverlay().remove(this.f13176);
        this.f13175 = false;
    }

    @Override // l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329, boolean z) {
        onTransitionEnd(abstractC0329);
    }
}
