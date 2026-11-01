package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩺᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes.dex */
public final class C23276 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16386 f75504;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7753 f75505;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f75506;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f75507;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f75508;

    public C23276(ViewGroup viewGroup, View view, boolean z, C16386 c16386, C7753 c7753) {
        this.f75508 = viewGroup;
        this.f75506 = view;
        this.f75507 = z;
        this.f75504 = c16386;
        this.f75505 = c7753;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f75508;
        View view = this.f75506;
        viewGroup.endViewTransition(view);
        boolean z = this.f75507;
        C16386 c16386 = this.f75504;
        if (z) {
            c16386.m38577().m1255(view);
        }
        this.f75505.m47610();
        if (AbstractC8894.m23060(2)) {
            C13638.toString(c16386);
        }
    }
}
