package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G64W */
/* JADX INFO: loaded from: classes3.dex */
public final class C9650 extends AnimatorListenerAdapter implements InterfaceC24031 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final View f32451;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f32452 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4337 f32453;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final View f32454;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f32455;

    @Override // l.InterfaceC24031
    public final void onTransitionPause(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public final void onTransitionResume(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766) {
        throw null;
    }

    @Override // l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766, boolean z) {
    }

    public C9650(AbstractC4337 abstractC4337, ViewGroup viewGroup, View view, View view2) {
        this.f32453 = abstractC4337;
        this.f32455 = viewGroup;
        this.f32454 = view;
        this.f32451 = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f32455.getOverlay().remove(this.f32454);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f32454;
        if (view.getParent() == null) {
            this.f32455.getOverlay().add(view);
        } else {
            this.f32453.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f32451;
            View view2 = this.f32454;
            view.setTag(R.id.MT_Protector, view2);
            this.f32455.getOverlay().add(view2);
            this.f32452 = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m24546();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m24546();
    }

    @Override // l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766) {
        abstractC11766.removeListener(this);
    }

    @Override // l.InterfaceC24031
    public final void onTransitionCancel(AbstractC11766 abstractC11766) {
        if (this.f32452) {
            m24546();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24546() {
        this.f32451.setTag(R.id.MT_Protector, null);
        this.f32455.getOverlay().remove(this.f32454);
        this.f32452 = false;
    }

    @Override // l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766, boolean z) {
        onTransitionEnd(abstractC11766);
    }
}
