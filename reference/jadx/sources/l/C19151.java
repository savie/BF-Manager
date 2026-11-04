package l;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.ᩳܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 98XI */
/* JADX INFO: loaded from: classes5.dex */
public final class C19151 extends MetricAffectingSpan {
    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }
}
