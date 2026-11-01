package l;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.ܺ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16198 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float f52300;

    public C16198(float f) {
        this.f52300 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f52300);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f52300);
    }
}
