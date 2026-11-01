package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.ۘ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08Y1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3943 extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f14666;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17474 f14667;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Rect f14665 = AbstractC15234.m36489();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Paint f14668 = AbstractC15234.m36487();

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public C3943(C17474 c17474, int i) {
        this.f14667 = c17474;
        this.f14666 = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f14667.m40666(textPaint, this.f14666);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f14667.m40666(textPaint, this.f14666);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = this.f14666;
        if ((i8 == 1 || i8 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i7) {
            Paint paint2 = this.f14668;
            paint2.set(paint);
            this.f14667.m40664(paint2);
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i9 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                Rect rect = this.f14665;
                rect.set(i, i9, width, i5);
                canvas.drawRect(rect, paint2);
            }
        }
    }
}
