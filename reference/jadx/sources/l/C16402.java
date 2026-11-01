package l;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;

/* JADX INFO: renamed from: l.ܽۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16402 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52769;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Rect f52770;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Paint f52771 = new Paint();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38606(int i, Rect rect) {
        if (rect.equals(this.f52770) && i == this.f52769) {
            return;
        }
        this.f52770 = rect;
        this.f52769 = i;
        float f = rect.left;
        int i2 = rect.top;
        this.f52771.setShader(new LinearGradient(f, i2, rect.right, i2, i & 16777215, i | (-16777216), Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38607(Canvas canvas) {
        canvas.drawRect(this.f52770, this.f52771);
    }
}
