package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩺ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G64W */
/* JADX INFO: loaded from: classes.dex */
public final class C24000 extends AnimatorListenerAdapter implements InterfaceC12261 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f77646;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final View f77647;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f77649;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ViewGroup f77650;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77645 = false;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f77648 = true;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // l.InterfaceC12261
    public final void onTransitionCancel(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329) {
        throw null;
    }

    @Override // l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329, boolean z) {
    }

    public C24000(int i, View view) {
        this.f77647 = view;
        this.f77649 = i;
        this.f77650 = (ViewGroup) view.getParent();
        m53553(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f77645 = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            C11319.m28606(this.f77647, 0);
            ViewGroup viewGroup = this.f77650;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329) {
        abstractC0329.removeListener(this);
    }

    @Override // l.InterfaceC12261
    public final void onTransitionPause(AbstractC0329 abstractC0329) {
        m53553(false);
        if (this.f77645) {
            return;
        }
        C11319.m28606(this.f77647, this.f77649);
    }

    @Override // l.InterfaceC12261
    public final void onTransitionResume(AbstractC0329 abstractC0329) {
        m53553(true);
        if (this.f77645) {
            return;
        }
        C11319.m28606(this.f77647, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f77645) {
            C11319.m28606(this.f77647, this.f77649);
            ViewGroup viewGroup = this.f77650;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m53553(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f77645) {
            C11319.m28606(this.f77647, this.f77649);
            ViewGroup viewGroup = this.f77650;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m53553(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53553(boolean z) {
        ViewGroup viewGroup;
        if (!this.f77648 || this.f77646 == z || (viewGroup = this.f77650) == null) {
            return;
        }
        this.f77646 = z;
        C12811.m31773(viewGroup, z);
    }

    @Override // l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329, boolean z) {
        onTransitionEnd(abstractC0329);
    }
}
