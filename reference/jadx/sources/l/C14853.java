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

/* JADX INFO: renamed from: l.ܰ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14853 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f48555;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f48556;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public LinearGradient f48557;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Rect f48558;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Canvas f48559;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Paint f48560 = new Paint();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35781(Rect rect, float f) {
        if (!rect.equals(this.f48558)) {
            this.f48558 = rect;
            Bitmap bitmap = this.f48555;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f48555 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            this.f48559 = new Canvas(this.f48555);
            this.f48557 = new LinearGradient(0.0f, 0.0f, 0.0f, rect.height(), -1, -16777216, Shader.TileMode.CLAMP);
        } else if (f == this.f48556) {
            return;
        }
        this.f48556 = f;
        ComposeShader composeShader = new ComposeShader(this.f48557, new LinearGradient(0.0f, 0.0f, rect.width(), 0.0f, -1, Color.HSVToColor(new float[]{f, 1.0f, 1.0f}), Shader.TileMode.CLAMP), PorterDuff.Mode.MULTIPLY);
        Paint paint = this.f48560;
        paint.setShader(composeShader);
        this.f48559.drawRect(0.0f, 0.0f, rect.width(), rect.height(), paint);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35780(Canvas canvas) {
        canvas.drawBitmap(this.f48555, (Rect) null, this.f48558, (Paint) null);
    }
}
