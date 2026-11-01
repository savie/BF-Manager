package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: l.ۤܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C10383 extends ReplacementSpan {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f35558;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Paint f35559;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f35560;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f35561;

    public C10383(int i, int i2, int i3) {
        Paint paint = new Paint(1);
        this.f35559 = paint;
        this.f35561 = i;
        this.f35560 = i2;
        this.f35558 = i3;
        paint.setColor(C20368.f65970);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return this.f35560 + this.f35561 + this.f35558;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f2 = f + this.f35560;
        int i6 = this.f35561;
        canvas.drawCircle((i6 / 2.0f) + f2, ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i4, i6 / 2.0f, this.f35559);
    }
}
