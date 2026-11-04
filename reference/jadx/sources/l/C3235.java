package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۗۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6JD */
/* JADX INFO: loaded from: classes2.dex */
public final class C3235 extends Drawable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f10539;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Rect f10540;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Paint f10541;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final PorterDuffColorFilter f10542;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C3235(Bitmap bitmap, int i, PorterDuffColorFilter porterDuffColorFilter) {
        Paint paint = new Paint(2);
        this.f10541 = paint;
        this.f10539 = bitmap;
        this.f10542 = porterDuffColorFilter;
        paint.setColorFilter(porterDuffColorFilter);
        int height = bitmap.getHeight();
        this.f10540 = new Rect(i * height, 0, (i + 1) * height, height);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawBitmap(this.f10539, this.f10540, getBounds(), this.f10541);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f10541.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == null) {
            colorFilter = this.f10542;
        }
        this.f10541.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
