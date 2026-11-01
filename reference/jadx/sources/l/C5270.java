package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۚۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: G6MH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5270 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f18255;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f18256;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f18257;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Picture f18258;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f18259;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f18260;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C20502 f18261;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f18262;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11644 f18263;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20502 f18264;

    public C5270(C11644 c11644, Picture picture, int i, int i2, int i3, C20502 c20502) {
        this.f18263 = c11644;
        this.f18262 = c11644 != null;
        this.f18258 = picture;
        this.f18259 = i;
        this.f18255 = i2;
        this.f18256 = i3;
        this.f18264 = c20502;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14553() {
        return this.f18262;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m14555() {
        return this.f18256;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14554(Canvas canvas) {
        Picture picture = this.f18258;
        if (picture == null || this.f18260) {
            return false;
        }
        canvas.drawPicture(picture);
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m14552((C20502) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14552(C20502 c20502) {
        synchronized (this) {
            if (this.f18260) {
                return;
            }
            this.f18260 = true;
            this.f18261 = c20502;
            Picture picture = this.f18258;
            this.f18258 = null;
            if (!this.f18257 && picture == null) {
                m14549();
            }
            if (picture != null) {
                try {
                    picture.beginRecording(1, 1);
                    picture.endRecording();
                    synchronized (this) {
                        m14549();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        m14549();
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m14549() {
        this.f18263 = null;
        this.f18264.close();
        C20502 c20502 = this.f18261;
        if (c20502 != null) {
            c20502.close();
            this.f18261 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20232 m14551(RectF rectF, float f, C0745 c0745, long j, C11393 c11393) throws Throwable {
        C11644 c11644;
        C20502 c20502M3239;
        C20502 c20502M32310;
        if (c11393.mo2357()) {
            throw new InterruptedIOException("SVG raster cancelled");
        }
        if (rectF == null || rectF.width() <= 0.0f || rectF.height() <= 0.0f || f <= 0.0f || !m14550(rectF.left) || !m14550(rectF.top) || !m14550(rectF.right) || !m14550(rectF.bottom) || !m14550(f)) {
            throw new IOException("Invalid SVG raster region");
        }
        double d = f;
        double dCeil = Math.ceil(((double) rectF.width()) * d);
        double dCeil2 = Math.ceil(((double) rectF.height()) * d);
        if (dCeil > 2.147483647E9d || dCeil2 > 2.147483647E9d) {
            throw new IOException("SVG raster dimensions exceed limit");
        }
        int iMax = Math.max(1, (int) dCeil);
        int iMax2 = Math.max(1, (int) dCeil2);
        long j2 = ((long) iMax) * ((long) iMax2);
        if (j2 > 2305843009213693951L) {
            throw new IOException("SVG raster dimensions overflow");
        }
        long j3 = j2 * 4;
        if (j3 <= 0 || j3 > j / ((long) this.f18256)) {
            throw new C10354("SVG raster workspace exceeds budget");
        }
        synchronized (this) {
            if (this.f18260 || (c11644 = this.f18263) == null) {
                throw new InterruptedIOException("SVG document is closed");
            }
            if (this.f18257) {
                throw new IOException("SVG raster requests must be serialized");
            }
            this.f18257 = true;
        }
        Bitmap bitmap = null;
        try {
            c20502M32310 = c0745.m3239(j3);
            if (c20502M32310 == null) {
                throw new C10354("SVG raster reservation exceeds budget");
            }
            try {
                c20502M3239 = c0745.m3239(((long) (this.f18256 - 1)) * j3);
                if (c20502M3239 == null) {
                    throw new C10354("SVG raster reservation exceeds budget");
                }
                try {
                    if (c11393.mo2357()) {
                        throw new InterruptedIOException("SVG raster cancelled");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.scale(iMax / rectF.width(), iMax2 / rectF.height());
                        canvas.translate(-rectF.left, -rectF.top);
                        c11644.m29091(canvas, new RectF(0.0f, 0.0f, this.f18259, this.f18255));
                        if (c11393.mo2357()) {
                            throw new InterruptedIOException("SVG raster cancelled");
                        }
                        synchronized (this) {
                            if (this.f18260) {
                                throw new InterruptedIOException("SVG document was closed while rendering");
                            }
                            if (bitmapCreateBitmap.getAllocationByteCount() > j3 || !c20502M32310.m46302(bitmapCreateBitmap.getAllocationByteCount())) {
                                throw new C10354("SVG raster allocation exceeds estimate");
                            }
                            C20232 c20232 = new C20232(bitmapCreateBitmap, c20502M32310, 1);
                            c20502M3239.close();
                            synchronized (this) {
                                this.f18257 = false;
                                if (this.f18260) {
                                    m14549();
                                }
                            }
                            return c20232;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapCreateBitmap;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                c20502M3239 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            c20502M3239 = null;
            c20502M32310 = null;
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (c20502M32310 != null) {
            c20502M32310.close();
        }
        if (c20502M3239 != null) {
            c20502M3239.close();
        }
        synchronized (this) {
            this.f18257 = false;
            if (this.f18260) {
                m14549();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14550(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }
}
