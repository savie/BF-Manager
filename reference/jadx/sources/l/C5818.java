package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;

/* JADX INFO: renamed from: l.ۛۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5818 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Paint f19766 = new Paint();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f19767;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Rect f19768;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f19769;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Canvas f19770;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public LinearGradient f19771;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16000(Rect rect, float f) {
        if (!rect.equals(this.f19768)) {
            this.f19768 = rect;
            Bitmap bitmap = this.f19767;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f19767 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            this.f19770 = new Canvas(this.f19767);
            this.f19771 = new LinearGradient(0.0f, 0.0f, 0.0f, rect.height(), -1, -16777216, Shader.TileMode.CLAMP);
        } else if (f == this.f19769) {
            return;
        }
        this.f19769 = f;
        ComposeShader composeShader = new ComposeShader(this.f19771, new LinearGradient(0.0f, 0.0f, rect.width(), 0.0f, -1, Color.HSVToColor(new float[]{f, 1.0f, 1.0f}), Shader.TileMode.CLAMP), PorterDuff.Mode.MULTIPLY);
        Paint paint = this.f19766;
        paint.setShader(composeShader);
        this.f19770.drawRect(0.0f, 0.0f, rect.width(), rect.height(), paint);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15999(Canvas canvas) {
        canvas.drawBitmap(this.f19767, (Rect) null, this.f19768, (Paint) null);
    }
}
