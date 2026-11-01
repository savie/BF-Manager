package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: l.ۚ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z90A */
/* JADX INFO: loaded from: classes2.dex */
public final class C5355 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final boolean f18498;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C17474 f18500;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f18503;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Paint f18499 = AbstractC15234.m36487();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RectF f18501 = AbstractC15234.m36488();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Rect f18502 = AbstractC15234.m36489();

    static {
        int i = Build.VERSION.SDK_INT;
        f18498 = 24 == i || 25 == i;
    }

    public C5355(C17474 c17474, int i) {
        this.f18500 = c17474;
        this.f18503 = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f18500.m40662();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iMin;
        int iMax;
        Paint.Style style;
        RectF rectF = this.f18501;
        Rect rect = this.f18502;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f18499;
            paint2.set(paint);
            C17474 c17474 = this.f18500;
            c17474.m40668(paint2);
            int iSave = canvas.save();
            try {
                int iM40662 = c17474.m40662();
                int iM40663 = c17474.m40663((int) ((paint2.descent() - paint2.ascent()) + 0.5f));
                int iM40667 = (iM40662 - iM40663) / c17474.m40667();
                boolean z2 = f18498;
                int i8 = this.f18503;
                if (z2) {
                    int width = i2 < 0 ? i - (layout.getWidth() - (iM40662 * i8)) : (iM40662 * i8) - i;
                    int i9 = (iM40667 * i2) + i;
                    int i10 = (i2 * iM40663) + i9;
                    int i11 = i2 * width;
                    iMin = Math.min(i9, i10) + i11;
                    iMax = Math.max(i9, i10) + i11;
                } else {
                    if (i2 <= 0) {
                        i -= iM40662;
                    }
                    iMin = i + iM40667;
                    iMax = iMin + iM40663;
                }
                int iDescent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iM40663 / 2);
                int i12 = iM40663 + iDescent;
                if (i8 == 0 || i8 == 1) {
                    rectF.set(iMin, iDescent, iMax, i12);
                    if (i8 == 0) {
                        style = Paint.Style.FILL;
                    } else {
                        style = Paint.Style.STROKE;
                    }
                    paint2.setStyle(style);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(iMin, iDescent, iMax, i12);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }
}
