package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 37HW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12666 extends ReplacementSpan {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Drawable f42298;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42301 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f42297 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f42299 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f42300 = -1;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        m31499(paint);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return (this.f42300 * 2) + this.f42298.getBounds().width();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        m31499(paint);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.ascent;
        int iRound = Math.round(paint.getTextSize() * 0.06f) + (((fontMetricsInt.descent - i6) - this.f42298.getBounds().height()) / 2) + i4 + i6;
        canvas.save();
        canvas.translate(f + this.f42300, iRound);
        this.f42298.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31499(Paint paint) {
        int color = paint.getColor();
        int iMax = Math.max(1, Math.round(paint.getTextSize() * 0.95f));
        int iMax2 = Math.max(1, Math.round(iMax * 1.4f));
        int iMax3 = Math.max(1, Math.round(paint.getTextSize() * 0.1f));
        if (this.f42298 != null && this.f42301 == iMax2 && this.f42297 == iMax && this.f42299 == color && this.f42300 == iMax3) {
            return;
        }
        Drawable drawableMutate = C16737.m39263(R.drawable.MT_Protector).mutate();
        this.f42298 = drawableMutate;
        drawableMutate.setTint(color);
        this.f42298.setBounds(0, 0, iMax2, iMax);
        this.f42301 = iMax2;
        this.f42297 = iMax;
        this.f42299 = color;
        this.f42300 = iMax3;
    }
}
