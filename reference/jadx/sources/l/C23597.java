package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.᩻ۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8GL */
/* JADX INFO: loaded from: classes.dex */
public final class C23597 extends FrameLayout {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f76445 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f76446;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RunnableC10897 f76447;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f76448;

    public C23597(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f76448 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1981.f7428, 0, 0);
            try {
                this.f76448 = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f76447 = new RunnableC10897(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52025(float f) {
        if (this.f76446 != f) {
            this.f76446 = f;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m52024() {
        return this.f76448;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52026(int i) {
        if (this.f76448 != i) {
            this.f76448 = i;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f76446 <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.f76446 / f5) - 1.0f;
        float fAbs = Math.abs(f6);
        RunnableC10897 runnableC10897 = this.f76447;
        if (fAbs <= 0.01f) {
            runnableC10897.m27304(this.f76446, f5, false);
            return;
        }
        int i3 = this.f76448;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f76446;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.f76446;
                    } else {
                        f2 = this.f76446;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f76446;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.f76446;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f76446;
            measuredWidth = (int) (f4 * f);
        }
        runnableC10897.m27304(this.f76446, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
