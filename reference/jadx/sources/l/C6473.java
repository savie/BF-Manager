package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.ۛܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V8Y4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6473 extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15421 f21770;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Rect f21771 = AbstractC0506.m2475();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Paint f21769 = AbstractC0506.m2473();

    public C6473(C15421 c15421) {
        this.f21770 = c15421;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f21770.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f21770.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f21770.m36935();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.f21769;
        paint2.setStyle(style);
        this.f21770.getClass();
        paint2.setColor(AbstractC4279.m13638(paint.getColor(), 25));
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            width = i;
        }
        Rect rect = this.f21771;
        rect.set(i, i3, width, i5);
        canvas.drawRect(rect, paint2);
    }
}
