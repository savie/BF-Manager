package l;

import android.animation.Animator;

/* JADX INFO: renamed from: l.ᩳۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5XC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18012 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8135 f57609;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18718 f57610;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    public C18012(C8135 c8135, C18718 c18718) {
        this.f57609 = c8135;
        this.f57610 = c18718;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f57609.f28483 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C8135 c8135 = this.f57609;
        C18718 c18718 = this.f57610;
        c8135.m21441(1.0f, c18718, true);
        c18718.f60713 = c18718.f60711;
        c18718.f60720 = c18718.f60724;
        c18718.f60712 = c18718.f60718;
        c18718.m43253((c18718.f60715 + 1) % c18718.f60706.length);
        if (c8135.f28484) {
            c8135.f28484 = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (c18718.f60719) {
                c18718.f60719 = false;
                return;
            }
            return;
        }
        c8135.f28483 += 1.0f;
    }
}
