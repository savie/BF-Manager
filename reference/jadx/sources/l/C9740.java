package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: l.ۡ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 58YR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9740 extends ReplacementSpan {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12724 f31421;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15421 f31422;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f31423;

    public C9740(C15421 c15421, C12724 c12724, boolean z) {
        this.f31422 = c15421;
        this.f31421 = c12724;
        this.f31423 = z;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C12724 c12724 = this.f31421;
        if (c12724.m31538()) {
            Rect bounds = c12724.getBounds();
            if (fontMetricsInt != null) {
                int i3 = -bounds.bottom;
                fontMetricsInt.ascent = i3;
                fontMetricsInt.descent = 0;
                fontMetricsInt.top = i3;
                fontMetricsInt.bottom = 0;
            }
            return bounds.right;
        }
        if (this.f31423) {
            this.f31422.m36934(paint);
        }
        return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iM40212 = AbstractC17076.m40212(canvas, charSequence);
        float textSize = paint.getTextSize();
        C12724 c12724 = this.f31421;
        c12724.m31535(textSize, iM40212);
        if (c12724.m31538()) {
            int i6 = i5 - c12724.getBounds().bottom;
            int iSave = canvas.save();
            try {
                canvas.translate(f, i6);
                c12724.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        float fM18182 = (int) (C6421.m18182(i5, i3, 2, i3) - (((paint.ascent() + paint.descent()) / 2.0f) + 0.5f));
        if (this.f31423) {
            this.f31422.m36934(paint);
        }
        canvas.drawText(charSequence, i, i2, f, fM18182, paint);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12724 m25369() {
        return this.f31421;
    }
}
