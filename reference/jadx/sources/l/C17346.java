package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ܽۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YIPT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17346 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15854 f56458;

    public C17346(C15854 c15854) {
        this.f56458 = c15854;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C15854 c15854 = this.f56458;
        c15854.f51555 = null;
        if (c15854.f51557) {
            return;
        }
        c15854.setVisibility(8);
    }
}
