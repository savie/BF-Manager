package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܰܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14765 implements InterfaceC21941 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f48326;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20613 f48327;

    public C14765(C20613 c20613, Drawable drawable) {
        this.f48327 = c20613;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(RunnableC21479.f68680, RunnableC21479.f68680, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(RunnableC21479.f68675, RunnableC21479.f68675, RunnableC21479.f68680, RunnableC21479.f68680);
        drawable.draw(canvas);
        drawable.setBounds(rectCopyBounds);
        this.f48326 = bitmapCreateBitmap;
    }

    @Override // l.InterfaceC21941
    public final Object get() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(RunnableC21479.f68680, RunnableC21479.f68680, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        synchronized (RunnableC21479.f68682) {
            canvas.drawBitmap(this.f48327.f66114.m30078(), 0.0f, 0.0f, RunnableC21479.f68682);
            if (C3296.m10878() && C16973.m40023(this.f48326)) {
                RunnableC21479.f68682.setColorFilter(RunnableC21479.f68685);
                canvas.drawBitmap(this.f48326, 0.0f, 0.0f, RunnableC21479.f68682);
                RunnableC21479.f68682.setColorFilter(null);
            } else {
                canvas.drawBitmap(this.f48326, 0.0f, 0.0f, RunnableC21479.f68682);
            }
        }
        return bitmapCreateBitmap;
    }
}
