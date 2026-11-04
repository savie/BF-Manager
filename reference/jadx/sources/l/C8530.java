package l;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۠ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7AX */
/* JADX INFO: loaded from: classes3.dex */
public class C8530 extends View {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final long f27863;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final long f27864;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f27865;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float f27866;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f27867;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f27868;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Paint f27869;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f27870;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RectF f27871;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f27872;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Paint f27873;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f27874;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f27864 = timeUnit.toMillis(15L);
        f27863 = timeUnit.toMillis(7L);
    }

    public C8530(Context context, AttributeSet attributeSet) {
        int iM20558;
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f27869 = paint;
        Paint paint2 = new Paint(1);
        this.f27873 = paint2;
        this.f27871 = new RectF();
        this.f27870 = 1.0f;
        float f = getResources().getDisplayMetrics().density;
        float f2 = 1.6f * f;
        this.f27866 = f2;
        this.f27872 = Math.round(f * 14.0f);
        int i = C3296.f10738;
        this.f27865 = i;
        this.f27874 = C3296.f10760;
        this.f27867 = C3296.f10774;
        this.f27868 = i;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                iM20558 = C7508.m20558(context, i2);
            } else {
                iM20558 = typedValue.data;
            }
        } else {
            iM20558 = -7829368;
        }
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(f2);
        paint.setColor(iM20558);
        paint.setAlpha(44);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(f2);
        paint2.setColor(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22845(long j, long j2) {
        int i;
        float fMax = Math.max(0.0f, Math.min(1.0f, j2 > 0 ? j / j2 : 0.0f));
        if (j > 0 && j < f27863) {
            i = this.f27867;
        } else if (j > 0 && j <= f27864) {
            i = this.f27874;
        } else {
            i = this.f27865;
        }
        if (this.f27870 == fMax && this.f27868 == i) {
            return;
        }
        this.f27870 = fMax;
        this.f27868 = i;
        this.f27873.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f27872;
        setMeasuredDimension(View.resolveSize(i3, i), View.resolveSize(i3, i2));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f27866 / 2.0f;
        float width = getWidth() - f;
        float height = getHeight() - f;
        RectF rectF = this.f27871;
        rectF.set(f, f, width, height);
        canvas.drawOval(rectF, this.f27869);
        canvas.drawArc(rectF, -90.0f, this.f27870 * 360.0f, false, this.f27873);
    }
}
