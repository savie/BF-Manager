package l;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.ᩳ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98XI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18055 extends MetricAffectingSpan {
    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }
}
