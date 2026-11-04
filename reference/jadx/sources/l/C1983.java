package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֫ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1983 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12423 f6640;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f6641;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f6642;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f6643;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20981 f6644;

    public C1983(ViewGroup viewGroup, View view, boolean z, C20981 c20981, C12423 c12423) {
        this.f6643 = viewGroup;
        this.f6642 = view;
        this.f6641 = z;
        this.f6644 = c20981;
        this.f6640 = c12423;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f6643;
        View view = this.f6642;
        viewGroup.endViewTransition(view);
        boolean z = this.f6641;
        C20981 c20981 = this.f6644;
        if (z) {
            c20981.m47959().m34601(view);
        }
        this.f6640.m18238();
        if (AbstractC3191.m10427(2)) {
            C17359.toString(c20981);
        }
    }
}
