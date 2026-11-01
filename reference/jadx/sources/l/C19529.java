package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: l.᩵ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58YR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19529 extends ReplacementSpan {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17474 f62792;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5417 f62793;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f62794;

    public C19529(C17474 c17474, C5417 c5417, boolean z) {
        this.f62792 = c17474;
        this.f62793 = c5417;
        this.f62794 = z;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C5417 c5417 = this.f62793;
        if (c5417.m14994()) {
            Rect bounds = c5417.getBounds();
            if (fontMetricsInt != null) {
                int i3 = -bounds.bottom;
                fontMetricsInt.ascent = i3;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = i3;
                fontMetricsInt.bottom = 0;
            }
            return bounds.right;
        }
        if (this.f62794) {
            this.f62792.m40670(paint);
        }
        return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iM27238 = AbstractC10872.m27238(canvas, charSequence);
        float textSize = paint.getTextSize();
        C5417 c5417 = this.f62793;
        c5417.m14991(textSize, iM27238);
        if (c5417.m14994()) {
            int i6 = i5 - c5417.getBounds().bottom;
            int iSave = canvas.save();
            try {
                canvas.translate(f, i6);
                c5417.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        float fM9602 = (int) (C3184.m9602(i5, i3, 2, i3) - (((paint.ascent() + paint.descent()) / 2.0f) + 0.5f));
        if (this.f62794) {
            this.f62792.m40670(paint);
        }
        canvas.drawText(charSequence, i, i2, f, fM9602, paint);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5417 m44610() {
        return this.f62793;
    }
}
