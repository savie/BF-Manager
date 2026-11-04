package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: l.ۨܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Z90A */
/* JADX INFO: loaded from: classes3.dex */
public final class C12438 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final boolean f39982;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C15421 f39984;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f39987;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Paint f39986 = AbstractC0506.m2473();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RectF f39985 = AbstractC0506.m2474();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Rect f39983 = AbstractC0506.m2475();

    static {
        int i = Build.VERSION.SDK_INT;
        f39982 = 24 == i || 25 == i;
    }

    public C12438(C15421 c15421, int i) {
        this.f39984 = c15421;
        this.f39987 = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f39984.m36926();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iMin;
        int iMax;
        Paint.Style style;
        RectF rectF = this.f39985;
        Rect rect = this.f39983;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f39986;
            paint2.set(paint);
            C15421 c15421 = this.f39984;
            c15421.m36932(paint2);
            int iSave = canvas.save();
            try {
                int iM36926 = c15421.m36926();
                int iM36927 = c15421.m36927((int) ((paint2.descent() - paint2.ascent()) + 0.5f));
                int iM36931 = (iM36926 - iM36927) / c15421.m36931();
                boolean z2 = f39982;
                int i8 = this.f39987;
                if (z2) {
                    int width = i2 < 0 ? i - (layout.getWidth() - (iM36926 * i8)) : (iM36926 * i8) - i;
                    int i9 = (iM36931 * i2) + i;
                    int i10 = (i2 * iM36927) + i9;
                    int i11 = i2 * width;
                    iMin = Math.min(i9, i10) + i11;
                    iMax = Math.max(i9, i10) + i11;
                } else {
                    if (i2 <= 0) {
                        i -= iM36926;
                    }
                    iMin = i + iM36931;
                    iMax = iMin + iM36927;
                }
                int iDescent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iM36927 / 2);
                int i12 = iM36927 + iDescent;
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
