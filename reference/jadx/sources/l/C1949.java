package l;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.֫ܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes2.dex */
public class C1949 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float f7337;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f7338;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float f7339;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f7340;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ValueAnimator f7342;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f7343;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float f7344;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f7346;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f7347;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f7348;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC12554 f7349;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f7341 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f7345 = false;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C1949(AbstractC12554 abstractC12554, int i, float f, float f2, float f3, float f4) {
        this.f7340 = i;
        this.f7349 = abstractC12554;
        this.f7348 = f;
        this.f7337 = f2;
        this.f7344 = f3;
        this.f7339 = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7342 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C14651(this));
        valueAnimatorOfFloat.setTarget(abstractC12554.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.f7343 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7343 = 1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6310(float f) {
        this.f7343 = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6309() {
        AbstractC12554 abstractC12554 = this.f7349;
        float f = this.f7348;
        float f2 = this.f7344;
        if (f == f2) {
            this.f7346 = abstractC12554.itemView.getTranslationX();
        } else {
            this.f7346 = C0280.m1792(f2, f, this.f7343, f);
        }
        float f3 = this.f7337;
        float f4 = this.f7339;
        if (f3 == f4) {
            this.f7347 = abstractC12554.itemView.getTranslationY();
        } else {
            this.f7347 = C0280.m1792(f4, f3, this.f7343, f3);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f7345) {
            this.f7349.setIsRecyclable(true);
        }
        this.f7345 = true;
    }
}
