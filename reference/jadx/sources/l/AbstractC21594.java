package l;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: l.᩶᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: GB1W */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21594 extends ReplacementSpan {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5098 f68990;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Paint.FontMetricsInt f68991 = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public short f68989 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f68992 = 1.0f;

    public AbstractC21594(C5098 c5098) {
        C11293.m28552(c5098, "rasterizer cannot be null");
        this.f68990 = c5098;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f68991;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C5098 c5098 = this.f68990;
        this.f68992 = fAbs / c5098.m15415();
        c5098.m15415();
        short sM15417 = (short) (c5098.m15417() * this.f68992);
        this.f68989 = sM15417;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return sM15417;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5098 m49128() {
        return this.f68990;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m49129() {
        return this.f68989;
    }
}
