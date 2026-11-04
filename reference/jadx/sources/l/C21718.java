package l;

import android.animation.Animator;

/* JADX INFO: renamed from: l.᩷֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D5XC */
/* JADX INFO: loaded from: classes.dex */
public final class C21718 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22464 f69307;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10529 f69308;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    public C21718(C22464 c22464, C10529 c10529) {
        this.f69307 = c22464;
        this.f69308 = c10529;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f69307.f72700 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C22464 c22464 = this.f69307;
        C10529 c10529 = this.f69308;
        c22464.m50654(1.0f, c10529, true);
        c10529.f33483 = c10529.f33479;
        c10529.f33493 = c10529.f33498;
        c10529.f33486 = c10529.f33489;
        c10529.m26978((c10529.f33482 + 1) % c10529.f33478.length);
        if (c22464.f72701) {
            c22464.f72701 = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (c10529.f33496) {
                c10529.f33496 = false;
                return;
            }
            return;
        }
        c22464.f72700 += 1.0f;
    }
}
