package l;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.᩹֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes.dex */
public class C23188 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float f75138;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f75139;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float f75140;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f75141;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ValueAnimator f75142;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f75143;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f75144;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f75145;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f75146;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f75147 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f75148 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f75149;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC11800 f75150;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C23188(AbstractC11800 abstractC11800, int i, float f, float f2, float f3, float f4) {
        this.f75139 = i;
        this.f75150 = abstractC11800;
        this.f75144 = f;
        this.f75143 = f2;
        this.f75140 = f3;
        this.f75138 = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f75142 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C15728(this));
        valueAnimatorOfFloat.setTarget(abstractC11800.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.f75141 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f75141 = 1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52113(float f) {
        this.f75141 = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52112() {
        AbstractC11800 abstractC11800 = this.f75150;
        float f = this.f75144;
        float f2 = this.f75140;
        if (f == f2) {
            this.f75145 = abstractC11800.itemView.getTranslationX();
        } else {
            this.f75145 = C19967.m45884(f2, f, this.f75141, f);
        }
        float f3 = this.f75143;
        float f4 = this.f75138;
        if (f3 == f4) {
            this.f75146 = abstractC11800.itemView.getTranslationY();
        } else {
            this.f75146 = C19967.m45884(f4, f3, this.f75141, f3);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f75148) {
            this.f75150.setIsRecyclable(true);
        }
        this.f75148 = true;
    }
}
