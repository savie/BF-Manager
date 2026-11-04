package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: l.֡ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: OIRX */
/* JADX INFO: loaded from: classes3.dex */
public final class C0532 implements InterfaceC4854 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f2241;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f2242;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RectF f2243;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f2244;

    @Override // l.InterfaceC4854
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo2501() {
        return 1;
    }

    @Override // l.InterfaceC4854
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2503(RectF rectF, float f, boolean z) {
    }

    public C0532(Bitmap bitmap) {
        this.f2241 = bitmap;
        int width = bitmap.getWidth();
        this.f2244 = width;
        int height = bitmap.getHeight();
        this.f2242 = height;
        this.f2243 = new RectF(0.0f, 0.0f, width, height);
    }

    @Override // l.InterfaceC4854
    public final int getWidth() {
        return this.f2244;
    }

    @Override // l.InterfaceC4854
    public final int getHeight() {
        return this.f2242;
    }

    @Override // l.InterfaceC4854
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2502(Canvas canvas, Paint paint) {
        Bitmap bitmap = this.f2241;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f2241, (Rect) null, this.f2243, paint);
    }

    @Override // l.InterfaceC4854
    public final void close() {
        this.f2241 = null;
    }
}
