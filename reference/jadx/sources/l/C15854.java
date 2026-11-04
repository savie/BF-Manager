package l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.ܶۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YIPT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15854 extends FrameLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f51554;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f51555;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f51556;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f51557;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37805(C15854 c15854, ValueAnimator valueAnimator) {
        c15854.getClass();
        c15854.f51556 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c15854.requestLayout();
    }

    public C15854(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51556 = 1.0f;
        this.f51557 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m37813() {
        return this.f51557;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m37809() {
        return this.f51556;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37810(int i) {
        m37807();
        setVisibility(0);
        measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(1, getRootView().getHeight()), Integer.MIN_VALUE));
        return Math.max(1, this.f51554);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37811(float f) {
        this.f51556 = Math.max(0.0f, Math.min(1.0f, f));
        requestLayout();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37812(boolean z, boolean z2) {
        float f = z ? 1.0f : 0.0f;
        if (this.f51557 == z) {
            if (z2 && this.f51555 != null) {
                return;
            }
            if (this.f51555 == null && this.f51556 == f) {
                return;
            }
        }
        this.f51557 = z;
        m37807();
        if (!z2 || !isAttachedToWindow() || this.f51556 == f) {
            this.f51556 = f;
            setVisibility(z ? 0 : 8);
            requestLayout();
            return;
        }
        setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f51556, f);
        this.f51555 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(Math.max(1, Math.round(Math.abs(f - this.f51556) * 200.0f)));
        this.f51555.setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator());
        this.f51555.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܺۙܳ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C15854.m37805(this.f53704, valueAnimator);
            }
        });
        this.f51555.addListener(new C17346(this));
        this.f51555.start();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m37807() {
        ValueAnimator valueAnimator = this.f51555;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.removeAllListeners();
        this.f51555.removeAllUpdateListeners();
        this.f51555.cancel();
        this.f51555 = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f51554 = getMeasuredHeight();
        setMeasuredDimension(getMeasuredWidth(), Math.round(this.f51554 * this.f51556));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m37807();
        boolean z = this.f51557;
        this.f51556 = z ? 1.0f : 0.0f;
        setVisibility(z ? 0 : 8);
        super.onDetachedFromWindow();
    }
}
