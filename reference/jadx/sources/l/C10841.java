package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۧۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10841 implements InterfaceC4968 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f36900;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0690 f36901;

    public C10841(C0690 c0690, Drawable drawable) {
        this.f36901 = c0690;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(RunnableC23541.f76236, RunnableC23541.f76236, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawable.copyBounds();
        drawable.setBounds(RunnableC23541.f76239, RunnableC23541.f76239, RunnableC23541.f76236, RunnableC23541.f76236);
        drawable.draw(canvas);
        drawable.setBounds(rectCopyBounds);
        this.f36900 = bitmapCreateBitmap;
    }

    @Override // l.InterfaceC4968
    public final Object get() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(RunnableC23541.f76236, RunnableC23541.f76236, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        synchronized (RunnableC23541.f76234) {
            canvas.drawBitmap(this.f36901.f2943.m35072(), 0.0f, 0.0f, RunnableC23541.f76234);
            if (C20368.m45991() && C2641.m8154(this.f36900)) {
                RunnableC23541.f76234.setColorFilter(RunnableC23541.f76247);
                canvas.drawBitmap(this.f36900, 0.0f, 0.0f, RunnableC23541.f76234);
                RunnableC23541.f76234.setColorFilter(null);
            } else {
                canvas.drawBitmap(this.f36900, 0.0f, 0.0f, RunnableC23541.f76234);
            }
        }
        return bitmapCreateBitmap;
    }
}
