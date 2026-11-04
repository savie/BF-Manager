package l;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;

/* JADX INFO: renamed from: l.ۛ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6651 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f22184;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Rect f22185;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Paint f22186 = new Paint();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18589(int i, Rect rect) {
        if (rect.equals(this.f22185) && i == this.f22184) {
            return;
        }
        this.f22185 = rect;
        this.f22184 = i;
        float f = rect.left;
        int i2 = rect.top;
        this.f22186.setShader(new LinearGradient(f, i2, rect.right, i2, i & 16777215, i | (-16777216), Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18590(Canvas canvas) {
        canvas.drawRect(this.f22185, this.f22186);
    }
}
