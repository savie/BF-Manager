package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.᩸۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L5RE */
/* JADX INFO: loaded from: classes.dex */
public class C22665 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Paint f73597;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Path f73598;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f73599;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f73600;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f73601;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f73602;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51076(boolean z) {
        this.f73599 = z;
    }

    public C22665(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73600 = 0;
        this.f73601 = true;
        if (isInEditMode()) {
            return;
        }
        this.f73598 = new Path();
        Paint paint = new Paint();
        this.f73597 = paint;
        paint.setAntiAlias(true);
    }

    public C22665(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f73600 = 0;
        this.f73601 = true;
        if (isInEditMode()) {
            return;
        }
        this.f73598 = new Path();
        Paint paint = new Paint();
        this.f73597 = paint;
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f73601) {
            this.f73598.reset();
            int measuredWidth = getMeasuredWidth();
            float f = this.f73602 / this.f73600;
            this.f73598.lineTo(0.0f, 0.0f);
            if (f < 0.5f) {
                i = this.f73602;
            } else {
                i = this.f73600 - this.f73602;
            }
            float f2 = measuredWidth;
            if (!this.f73599) {
                f = 1.0f - f;
            }
            this.f73598.quadTo(f * f2, i, f2, 0.0f);
            this.f73598.lineTo(f2, 0.0f);
            canvas.drawPath(this.f73598, this.f73597);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51077(int i) {
        this.f73600 = i * 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51075(int i) {
        this.f73602 = i;
    }
}
