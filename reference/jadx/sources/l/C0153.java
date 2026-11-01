package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0153 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10738 f1203;

    public C0153(C10738 c10738) {
        this.f1203 = c10738;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C10738 c10738 = this.f1203;
        c10738.f36604 = null;
        c10738.f36601 = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C10738 c10738 = this.f1203;
        c10738.f36604 = null;
        c10738.f36601 = false;
    }
}
