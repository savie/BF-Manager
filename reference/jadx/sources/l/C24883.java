package l;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.᩻۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: JAJI */
/* JADX INFO: loaded from: classes.dex */
public final class C24883 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f80518;

    public C24883(float f) {
        this.f80518 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f80518);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f80518);
    }
}
