package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֫ܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G64W */
/* JADX INFO: loaded from: classes2.dex */
public final class C1887 extends AnimatorListenerAdapter implements InterfaceC24031 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f7126;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f7127 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f7128 = true;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f7129;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f7130;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final View f7131;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // l.InterfaceC24031
    public final void onTransitionCancel(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766) {
        throw null;
    }

    @Override // l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766, boolean z) {
    }

    public C1887(int i, View view) {
        this.f7131 = view;
        this.f7130 = i;
        this.f7126 = (ViewGroup) view.getParent();
        m6143(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7127 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            C16000.m37978(this.f7131, 0);
            ViewGroup viewGroup = this.f7126;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766) {
        abstractC11766.removeListener(this);
    }

    @Override // l.InterfaceC24031
    public final void onTransitionPause(AbstractC11766 abstractC11766) {
        m6143(false);
        if (this.f7127) {
            return;
        }
        C16000.m37978(this.f7131, this.f7130);
    }

    @Override // l.InterfaceC24031
    public final void onTransitionResume(AbstractC11766 abstractC11766) {
        m6143(true);
        if (this.f7127) {
            return;
        }
        C16000.m37978(this.f7131, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f7127) {
            C16000.m37978(this.f7131, this.f7130);
            ViewGroup viewGroup = this.f7126;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m6143(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f7127) {
            C16000.m37978(this.f7131, this.f7130);
            ViewGroup viewGroup = this.f7126;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m6143(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6143(boolean z) {
        ViewGroup viewGroup;
        if (!this.f7128 || this.f7129 == z || (viewGroup = this.f7126) == null) {
            return;
        }
        this.f7129 = z;
        C10355.m26251(viewGroup, z);
    }

    @Override // l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766, boolean z) {
        onTransitionEnd(abstractC11766);
    }
}
