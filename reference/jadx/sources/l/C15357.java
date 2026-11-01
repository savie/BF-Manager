package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ܶܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15357 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f50034 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18178 f50035;

    public C15357(C18178 c18178) {
        this.f50035 = c18178;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f50034) {
            this.f50034 = false;
            return;
        }
        C18178 c18178 = this.f50035;
        if (((Float) c18178.f58089.getAnimatedValue()).floatValue() == 0.0f) {
            c18178.f58082 = 0;
            c18178.m42300(0);
        } else {
            c18178.f58082 = 2;
            c18178.m42299();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f50034 = true;
    }
}
