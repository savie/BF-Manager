package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.᩵᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G6MH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20911 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6741 f66922;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f66923;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9153 f66924;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9153 f66925;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f66926;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f66927;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f66928;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f66929;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f66930;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Picture f66931;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1752 f66932;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized long m47774() {
        long jM24287;
        C6741 c6741;
        jM24287 = this.f66924.m24287();
        c6741 = this.f66922;
        return jM24287 + (c6741 == null ? 0L : c6741.m18845());
    }

    public C20911(C1752 c1752, Picture picture, int i, int i2, int i3, C9153 c9153, C6741 c6741) {
        this.f66932 = c1752;
        this.f66928 = c1752 != null;
        this.f66931 = picture;
        this.f66926 = i;
        this.f66930 = i2;
        this.f66923 = i3;
        this.f66924 = c9153;
        this.f66922 = c6741;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47772() {
        return this.f66928;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m47775() {
        return this.f66923;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47773(Canvas canvas) {
        Picture picture = this.f66931;
        if (picture == null || this.f66929) {
            return false;
        }
        canvas.drawPicture(picture);
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m47771((C9153) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47771(C9153 c9153) {
        synchronized (this) {
            if (this.f66929) {
                return;
            }
            this.f66929 = true;
            this.f66925 = c9153;
            Picture picture = this.f66931;
            this.f66931 = null;
            if (!this.f66927 && picture == null) {
                m47769();
            }
            if (picture != null) {
                try {
                    picture.beginRecording(1, 1);
                    picture.endRecording();
                    synchronized (this) {
                        m47769();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        m47769();
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m47769() {
        this.f66932 = null;
        C6741 c6741 = this.f66922;
        if (c6741 != null) {
            c6741.close();
            this.f66922 = null;
        }
        this.f66924.close();
        C9153 c9153 = this.f66925;
        if (c9153 != null) {
            c9153.close();
            this.f66925 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8299 m47770(RectF rectF, float f, C2442 c2442, long j, C17532 c17532) throws Throwable {
        C1752 c1752;
        C9153 c9153M8242;
        C9153 c9153M8243;
        if (c17532.mo924()) {
            throw new InterruptedIOException("SVG raster cancelled");
        }
        if (rectF == null || rectF.width() <= 0.0f || rectF.height() <= 0.0f || f <= 0.0f || !m47768(rectF.left) || !m47768(rectF.top) || !m47768(rectF.right) || !m47768(rectF.bottom) || !m47768(f)) {
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
        if (j3 <= 0 || j3 > j / ((long) this.f66923)) {
            throw new C18740("SVG raster workspace exceeds budget");
        }
        synchronized (this) {
            if (this.f66929 || (c1752 = this.f66932) == null) {
                throw new InterruptedIOException("SVG document is closed");
            }
            if (this.f66927) {
                throw new IOException("SVG raster requests must be serialized");
            }
            this.f66927 = true;
        }
        Bitmap bitmap = null;
        try {
            c9153M8243 = c2442.m8242(j3);
            if (c9153M8243 == null) {
                throw new C18740("SVG raster reservation exceeds budget");
            }
            try {
                c9153M8242 = c2442.m8242(((long) (this.f66923 - 1)) * j3);
                if (c9153M8242 == null) {
                    throw new C18740("SVG raster reservation exceeds budget");
                }
                try {
                    if (c17532.mo924()) {
                        throw new InterruptedIOException("SVG raster cancelled");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.scale(iMax / rectF.width(), iMax2 / rectF.height());
                        canvas.translate(-rectF.left, -rectF.top);
                        c1752.m6187(canvas, new RectF(0.0f, 0.0f, this.f66926, this.f66930));
                        if (c17532.mo924()) {
                            throw new InterruptedIOException("SVG raster cancelled");
                        }
                        synchronized (this) {
                            if (this.f66929) {
                                throw new InterruptedIOException("SVG document was closed while rendering");
                            }
                            if (bitmapCreateBitmap.getAllocationByteCount() > j3 || !c9153M8243.m24288(bitmapCreateBitmap.getAllocationByteCount())) {
                                throw new C18740("SVG raster allocation exceeds estimate");
                            }
                            C8299 c8299 = new C8299(bitmapCreateBitmap, c9153M8243, 1);
                            c9153M8242.close();
                            synchronized (this) {
                                this.f66927 = false;
                                if (this.f66929) {
                                    m47769();
                                }
                            }
                            return c8299;
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
                c9153M8242 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            c9153M8242 = null;
            c9153M8243 = null;
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (c9153M8243 != null) {
            c9153M8243.close();
        }
        if (c9153M8242 != null) {
            c9153M8242.close();
        }
        synchronized (this) {
            this.f66927 = false;
            if (this.f66929) {
                m47769();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47768(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }
}
