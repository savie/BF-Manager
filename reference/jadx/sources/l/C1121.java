package l;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.֨۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18XN */
/* JADX INFO: loaded from: classes2.dex */
public final class C1121 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17474 f5047;

    public C1121(C17474 c17474) {
        this.f5047 = c17474;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C17474 c17474 = this.f5047;
        c17474.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
        c17474.getClass();
        textPaint.bgColor = AbstractC12807.m31802(textPaint.getColor(), 25);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f5047.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
