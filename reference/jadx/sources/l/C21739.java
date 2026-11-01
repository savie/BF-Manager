package l;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: renamed from: l.᩸ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q983 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21739 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f70465;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f70466;

    public C21739(int i, int i2) {
        this.f70466 = i;
        this.f70465 = i2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f70466);
        int i = this.f70465;
        if (((-16777216) & i) != 0) {
            textPaint.bgColor = i;
        }
    }
}
