package l;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: l.᩶ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: GB1W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19873 extends ReplacementSpan {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C4432 f63718;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Paint.FontMetricsInt f63717 = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public short f63719 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f63720 = 1.0f;

    public AbstractC19873(C4432 c4432) {
        C9535.m24383(c4432, "rasterizer cannot be null");
        this.f63718 = c4432;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f63717;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C4432 c4432 = this.f63718;
        this.f63720 = fAbs / c4432.m12373();
        c4432.m12373();
        short sM12376 = (short) (c4432.m12376() * this.f63720);
        this.f63719 = sM12376;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return sM12376;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4432 m45120() {
        return this.f63718;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m45121() {
        return this.f63719;
    }
}
