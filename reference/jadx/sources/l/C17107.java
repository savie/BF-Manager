package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: renamed from: l.ܿۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17107 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f54573;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Rect f54574;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39927(Rect rect) {
        if (rect.equals(this.f54574)) {
            return;
        }
        this.f54574 = rect;
        Bitmap bitmap = this.f54573;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f54573 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        int iWidth = (int) (rect.width() + 0.5f);
        int[] iArr = new int[iWidth];
        for (int i = 0; i < iWidth; i++) {
            iArr[i] = Color.HSVToColor(new float[]{(i * 360.0f) / iWidth, 1.0f, 1.0f});
        }
        Paint paint = new Paint();
        paint.setStrokeWidth(0.0f);
        int iHeight = rect.height();
        Canvas canvas = new Canvas(this.f54573);
        for (int i2 = 0; i2 < iWidth; i2++) {
            paint.setColor(iArr[i2]);
            float f = i2;
            canvas.drawLine(f, 0.0f, f, iHeight, paint);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39926(Canvas canvas) {
        canvas.drawBitmap(this.f54573, (Rect) null, this.f54574, (Paint) null);
    }
}
