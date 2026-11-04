package l;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.᩺ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 18XN */
/* JADX INFO: loaded from: classes.dex */
public final class C24373 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15421 f79085;

    public C24373(C15421 c15421) {
        this.f79085 = c15421;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C15421 c15421 = this.f79085;
        c15421.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
        c15421.getClass();
        textPaint.bgColor = AbstractC4279.m13638(textPaint.getColor(), 25);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f79085.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
