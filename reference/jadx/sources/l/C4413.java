package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: renamed from: l.ۘ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4413 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f15843;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Rect f15844;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14032(Rect rect) {
        if (rect.equals(this.f15844)) {
            return;
        }
        this.f15844 = rect;
        Bitmap bitmap = this.f15843;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f15843 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        int iWidth = (int) (rect.width() + 0.5f);
        int[] iArr = new int[iWidth];
        for (int i = 0; i < iWidth; i++) {
            iArr[i] = Color.HSVToColor(new float[]{(i * 360.0f) / iWidth, 1.0f, 1.0f});
        }
        Paint paint = new Paint();
        paint.setStrokeWidth(0.0f);
        int iHeight = rect.height();
        Canvas canvas = new Canvas(this.f15843);
        for (int i2 = 0; i2 < iWidth; i2++) {
            paint.setColor(iArr[i2]);
            float f = i2;
            canvas.drawLine(f, 0.0f, f, iHeight, paint);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14031(Canvas canvas) {
        canvas.drawBitmap(this.f15843, (Rect) null, this.f15844, (Paint) null);
    }
}
