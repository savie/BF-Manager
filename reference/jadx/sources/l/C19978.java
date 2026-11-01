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

/* JADX INFO: renamed from: l.᩶ۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7AX */
/* JADX INFO: loaded from: classes4.dex */
public class C19978 extends View {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final long f63954;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final long f63955;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f63956;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f63957;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f63958;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f63959;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f63960;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RectF f63961;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f63962;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Paint f63963;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f63964;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Paint f63965;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f63954 = timeUnit.toMillis(15L);
        f63955 = timeUnit.toMillis(7L);
    }

    public C19978(Context context, AttributeSet attributeSet) {
        int iM26299;
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f63965 = paint;
        Paint paint2 = new Paint(1);
        this.f63963 = paint2;
        this.f63961 = new RectF();
        this.f63957 = 1.0f;
        float f = getResources().getDisplayMetrics().density;
        float f2 = 1.6f * f;
        this.f63958 = f2;
        this.f63956 = Math.round(f * 14.0f);
        int i = C20368.f65970;
        this.f63962 = i;
        this.f63964 = C20368.f65998;
        this.f63960 = C20368.f65966;
        this.f63959 = i;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                iM26299 = C10405.m26299(context, i2);
            } else {
                iM26299 = typedValue.data;
            }
        } else {
            iM26299 = -7829368;
        }
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(f2);
        paint.setColor(iM26299);
        paint.setAlpha(44);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(f2);
        paint2.setColor(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45271(long j, long j2) {
        int i;
        float fMax = Math.max(0.0f, Math.min(1.0f, j2 > 0 ? j / j2 : 0.0f));
        if (j > 0 && j < f63955) {
            i = this.f63960;
        } else if (j > 0 && j <= f63954) {
            i = this.f63964;
        } else {
            i = this.f63962;
        }
        if (this.f63957 == fMax && this.f63959 == i) {
            return;
        }
        this.f63957 = fMax;
        this.f63959 = i;
        this.f63963.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f63956;
        setMeasuredDimension(View.resolveSize(i3, i), View.resolveSize(i3, i2));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f63958 / 2.0f;
        float width = getWidth() - f;
        float height = getHeight() - f;
        RectF rectF = this.f63961;
        rectF.set(f, f, width, height);
        canvas.drawOval(rectF, this.f63965);
        canvas.drawArc(rectF, -90.0f, this.f63957 * 360.0f, false, this.f63963);
    }
}
