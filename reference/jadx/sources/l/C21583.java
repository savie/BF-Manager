package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩸۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q917 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21583 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f70034;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17474 f70035;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f70036;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Paint f70037 = AbstractC15234.m36487();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC0540 f70038;

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.f70037;
            paint2.set(paint);
            C17474 c17474 = this.f70035;
            c17474.m40668(paint2);
            float fMeasureText = paint2.measureText("8");
            float fMeasureText2 = paint2.measureText(".");
            float fMeasureText3 = paint2.measureText(" ");
            int length = (int) ((this.f70034.length() * fMeasureText) + fMeasureText2 + fMeasureText3 + 0.5f);
            int length2 = (int) ((String.valueOf(this.f70038.mo2549()).length() * fMeasureText) + fMeasureText2 + fMeasureText3 + 0.5f);
            int iM40662 = c17474.m40662();
            if (length2 > iM40662) {
                this.f70036 = length2;
            } else {
                this.f70036 = 0;
                length2 = iM40662;
            }
            int i8 = i2 > 0 ? ((length2 * i2) + i) - length : (length2 - length) + (length2 * i2) + i;
            Paint.Align textAlign = paint2.getTextAlign();
            paint2.setTextAlign(Paint.Align.CENTER);
            float f = fMeasureText / 2.0f;
            float f2 = i8 + f;
            int i9 = 0;
            for (int length3 = r5.length(); i9 < length3; length3 = length3) {
                int i10 = i9 + 1;
                canvas.drawText(this.f70034, i9, i10, f2, i4, paint2);
                f2 += fMeasureText;
                i9 = i10;
            }
            canvas.drawText(".", (fMeasureText2 / 2.0f) + (f2 - f), i4, paint2);
            paint2.setTextAlign(textAlign);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48296(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        C21583[] c21583Arr = (C21583[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C21583.class);
        if (c21583Arr != null) {
            TextPaint paint = textView.getPaint();
            float fMeasureText = paint.measureText("8");
            float fMeasureText2 = paint.measureText(".");
            float fMeasureText3 = paint.measureText(" ");
            for (C21583 c21583 : c21583Arr) {
                c21583.f70036 = (int) ((String.valueOf(c21583.f70038.mo2549()).length() * fMeasureText) + fMeasureText2 + fMeasureText3 + 0.5f);
            }
        }
    }

    public C21583(C17474 c17474, String str, InterfaceC0540 interfaceC0540) {
        this.f70035 = c17474;
        this.f70034 = str;
        this.f70038 = interfaceC0540;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.f70036, this.f70035.m40662());
    }
}
