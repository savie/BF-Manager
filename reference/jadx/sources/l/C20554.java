package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.᩵ۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20554 extends FrameLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65795 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RunnableC3400 f65796;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f65797;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65798;

    public C20554(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65798 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C12445.f39997, 0, 0);
            try {
                this.f65798 = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f65796 = new RunnableC3400(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47120(float f) {
        if (this.f65797 != f) {
            this.f65797 = f;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47119() {
        return this.f65798;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47121(int i) {
        if (this.f65798 != i) {
            this.f65798 = i;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f65797 <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.f65797 / f5) - 1.0f;
        float fAbs = Math.abs(f6);
        RunnableC3400 runnableC3400 = this.f65796;
        if (fAbs <= 0.01f) {
            runnableC3400.m11139(this.f65797, f5, false);
            return;
        }
        int i3 = this.f65798;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f65797;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.f65797;
                    } else {
                        f2 = this.f65797;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f65797;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.f65797;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f65797;
            measuredWidth = (int) (f4 * f);
        }
        runnableC3400.m11139(this.f65797, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
