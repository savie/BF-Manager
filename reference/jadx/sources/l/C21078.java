package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37HW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21078 extends ReplacementSpan {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Drawable f67344;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f67347 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f67346 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f67345 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f67343 = -1;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        m48138(paint);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return (this.f67343 * 2) + this.f67344.getBounds().width();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        m48138(paint);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.ascent;
        int iRound = Math.round(paint.getTextSize() * 0.06f) + (((fontMetricsInt.descent - i6) - this.f67344.getBounds().height()) / 2) + i4 + i6;
        canvas.save();
        canvas.translate(f + this.f67343, iRound);
        this.f67344.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48138(Paint paint) {
        int color = paint.getColor();
        int iMax = Math.max(1, Math.round(paint.getTextSize() * 0.95f));
        int iMax2 = Math.max(1, Math.round(iMax * 1.4f));
        int iMax3 = Math.max(1, Math.round(paint.getTextSize() * 0.1f));
        if (this.f67344 != null && this.f67347 == iMax2 && this.f67346 == iMax && this.f67345 == color && this.f67343 == iMax3) {
            return;
        }
        Drawable drawableMutate = C21576.m49058(R.drawable.MT_Protector).mutate();
        this.f67344 = drawableMutate;
        drawableMutate.setTint(color);
        this.f67344.setBounds(0, 0, iMax2, iMax);
        this.f67347 = iMax2;
        this.f67346 = iMax;
        this.f67345 = color;
        this.f67343 = iMax3;
    }
}
