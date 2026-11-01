package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.֡᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0746 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11766 f3051;

    public C0746(AbstractC11766 abstractC11766) {
        this.f3051 = abstractC11766;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3051.end();
        animator.removeListener(this);
    }
}
