package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۟ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Q917 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7964 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Paint f26444 = AbstractC0506.m2473();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C15421 f26445;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f26446;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f26447;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC10946 f26448;

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f26444;
            paint2.set(paint);
            C15421 c15421 = this.f26445;
            c15421.m36932(paint2);
            float fMeasureText = paint2.measureText("8");
            float fMeasureText2 = paint2.measureText(".");
            float fMeasureText3 = paint2.measureText(" ");
            int length = (int) ((this.f26447.length() * fMeasureText) + fMeasureText2 + fMeasureText3 + 0.5f);
            int length2 = (int) ((String.valueOf(this.f26448.mo7733()).length() * fMeasureText) + fMeasureText2 + fMeasureText3 + 0.5f);
            int iM36926 = c15421.m36926();
            if (length2 > iM36926) {
                this.f26446 = length2;
            } else {
                this.f26446 = 0;
                length2 = iM36926;
            }
            int i8 = i2 > 0 ? ((length2 * i2) + i) - length : (length2 - length) + (length2 * i2) + i;
            Paint.Align textAlign = paint2.getTextAlign();
            paint2.setTextAlign(Paint.Align.CENTER);
            float f = fMeasureText / 2.0f;
            float f2 = i8 + f;
            int i9 = 0;
            for (int length3 = r5.length(); i9 < length3; length3 = length3) {
                int i10 = i9 + 1;
                canvas.drawText(this.f26447, i9, i10, f2, i4, paint2);
                f2 += fMeasureText;
                i9 = i10;
            }
            canvas.drawText(".", (fMeasureText2 / 2.0f) + (f2 - f), i4, paint2);
            paint2.setTextAlign(textAlign);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21665(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        C7964[] c7964Arr = (C7964[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C7964.class);
        if (c7964Arr != null) {
            TextPaint paint = textView.getPaint();
            float fMeasureText = paint.measureText("8");
            float fMeasureText2 = paint.measureText(".");
            float fMeasureText3 = paint.measureText(" ");
            for (C7964 c7964 : c7964Arr) {
                c7964.f26446 = (int) ((String.valueOf(c7964.f26448.mo7733()).length() * fMeasureText) + fMeasureText2 + fMeasureText3 + 0.5f);
            }
        }
    }

    public C7964(C15421 c15421, String str, InterfaceC10946 interfaceC10946) {
        this.f26445 = c15421;
        this.f26447 = str;
        this.f26448 = interfaceC10946;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.f26446, this.f26445.m36926());
    }
}
