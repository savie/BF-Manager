package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.᩺ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L5RE */
/* JADX INFO: loaded from: classes.dex */
public class C23083 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f74996;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Path f74997;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f74998;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Paint f74999;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f75000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f75001;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51078(boolean z) {
        this.f74998 = z;
    }

    public C23083(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74996 = 0;
        this.f75000 = true;
        if (isInEditMode()) {
            return;
        }
        this.f74997 = new Path();
        Paint paint = new Paint();
        this.f74999 = paint;
        paint.setAntiAlias(true);
    }

    public C23083(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f74996 = 0;
        this.f75000 = true;
        if (isInEditMode()) {
            return;
        }
        this.f74997 = new Path();
        Paint paint = new Paint();
        this.f74999 = paint;
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f75000) {
            this.f74997.reset();
            int measuredWidth = getMeasuredWidth();
            float f = this.f75001 / this.f74996;
            this.f74997.lineTo(0.0f, 0.0f);
            if (f < 0.5f) {
                i = this.f75001;
            } else {
                i = this.f74996 - this.f75001;
            }
            float f2 = measuredWidth;
            if (!this.f74998) {
                f = 1.0f - f;
            }
            this.f74997.quadTo(f * f2, i, f2, 0.0f);
            this.f74997.lineTo(f2, 0.0f);
            canvas.drawPath(this.f74997, this.f74999);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51079(int i) {
        this.f74996 = i * 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51077(int i) {
        this.f75001 = i;
    }
}
