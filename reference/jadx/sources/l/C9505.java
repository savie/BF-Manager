package l;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Looper;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۢۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 06MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9505 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InputStream f32154;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2164 f32155;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C20502 f32156;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Thread f32157 = Thread.currentThread();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f32158;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20937 f32159;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC1886 f32160;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final BitmapRegionDecoder f32161;

    public C9505(AbstractC1886 abstractC1886, C20937 c20937, InputStream inputStream, BitmapRegionDecoder bitmapRegionDecoder) {
        this.f32160 = abstractC1886;
        this.f32159 = c20937;
        this.f32154 = inputStream;
        this.f32161 = bitmapRegionDecoder;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.֡ܳ۬] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9505 m24339(AbstractC1886 abstractC1886, C20937 c20937) throws Throwable {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        InputStream inputStream;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Tile decoder must be opened on a worker thread");
        }
        ?? r0 = C0475.f2151;
        C16704.m39179(abstractC1886, c20937, (C0475) r0);
        C14588 c14588 = c20937.f68245;
        if (!m24341(c20937.f68249)) {
            throw new C1742("Image format does not support region decoding");
        }
        BitmapRegionDecoder bitmapRegionDecoder = null;
        try {
            try {
                if (abstractC1886.mo6139() != null) {
                    InputStream inputStreamMo5285 = abstractC1886.mo5285();
                    if (!(inputStreamMo5285 instanceof FileInputStream)) {
                        throw new IOException("Local source requires a file stream");
                    }
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(((FileInputStream) inputStreamMo5285).getFD(), false);
                    inputStream = inputStreamMo5285;
                } else {
                    C7531 c7531M39177 = C16704.m39177(abstractC1886, (C0475) r0);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance((InputStream) c7531M39177, false);
                    c7531M39177.m20055();
                    inputStream = c7531M39177;
                }
                abstractC1886.m6137(c14588);
                if (bitmapRegionDecoderNewInstance == null) {
                    throw new C1742("Platform rejected region decoding");
                }
                if (bitmapRegionDecoderNewInstance.getWidth() != c20937.f68250 || bitmapRegionDecoderNewInstance.getHeight() != c20937.f68251) {
                    throw new C23760("Region decoder dimensions changed");
                }
                return new C9505(abstractC1886, c20937, inputStream, bitmapRegionDecoderNewInstance);
            } catch (IOException e) {
                e = e;
                try {
                    abstractC1886.m6137(c14588);
                    if (!(e instanceof C23760) && !(e instanceof C1742)) {
                        throw new C1742("Platform could not open a region decoder", e);
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (bitmapRegionDecoder != null) {
                        bitmapRegionDecoder.recycle();
                    }
                    if (r0 != 0) {
                        r0.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r0 = r0;
                bitmapRegionDecoder = null;
                if (bitmapRegionDecoder != null) {
                    bitmapRegionDecoder.recycle();
                }
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            r0 = 0;
        } catch (Throwable th3) {
            th = th3;
            r0 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9505 m24340(AbstractC1886 abstractC1886, C20937 c20937, C0745 c0745, InterfaceC5614 interfaceC5614) {
        C16704.m39179(abstractC1886, c20937, C0475.f2151);
        C11338 c11338 = c20937.f68252;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("TGA decoder requires a worker");
        }
        if (abstractC1886.mo6139() == null) {
            throw new C1742("TGA regions require a prepared local file");
        }
        C20502 c20502M3239 = c0745.m3239(c11338.m28419(true));
        if (c20502M3239 == null) {
            throw new C10354("TGA index exceeds bitmap budget");
        }
        C2164 c2164 = null;
        try {
            C2164 c2164M6734 = C2164.m6734(abstractC1886.mo6139(), c11338, interfaceC5614);
            try {
                abstractC1886.m6137(c20937.f68245);
                C9505 c9505 = new C9505(abstractC1886, c20937, null, null);
                c9505.f32155 = c2164M6734;
                c9505.f32156 = c20502M3239;
                return c9505;
            } catch (Throwable th) {
                th = th;
                c2164 = c2164M6734;
                if (c2164 != null) {
                    try {
                        c2164.close();
                    } finally {
                        c20502M3239.close();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [l.֡᩻۬] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [l.᩶᩻۬] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [l.᩶᩻۬] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20232 m24342(Rect rect, int i, C0745 c0745, InterfaceC5614 interfaceC5614) throws Throwable {
        C20502 c20502M3239;
        if (Thread.currentThread() == this.f32157) {
            if (this.f32158) {
                throw new IOException("Tile decoder is closed");
            }
            if (!rect.isEmpty() && rect.left >= 0 && rect.top >= 0) {
                int i2 = rect.right;
                C20937 c20937 = this.f32159;
                int i3 = c20937.f68250;
                C14588 c14588 = c20937.f68245;
                if (i2 <= i3 && rect.bottom <= c20937.f68251 && i > 0 && ((i - 1) & i) == 0) {
                    AbstractC1886 abstractC1886 = this.f32160;
                    abstractC1886.m6137(c14588);
                    C20502 c20502M32310 = c0745.m3239(C16704.m39174(rect.width(), rect.height(), i));
                    if (c20502M32310 == null) {
                        throw new C10354("Tile reservation exceeds bitmap budget");
                    }
                    Bitmap bitmap = null;
                    try {
                        try {
                            if (this.f32155 != null) {
                                c20502M3239 = c0745.m3239(C16704.m39173(rect.width(), i) * 4);
                                if (c20502M3239 == null) {
                                    c0745 = c20502M3239;
                                    throw new C10354("TGA row exceeds bitmap budget");
                                }
                            } else {
                                c0745 = 0;
                            }
                            c0745 = c20502M3239;
                            C2164 c2164 = this.f32155;
                            Bitmap bitmapDecodeRegion = c2164 == null ? this.f32161.decodeRegion(rect, C16704.m39176(i)) : c2164.m6742(rect, i, interfaceC5614);
                            try {
                                AbstractC1886.m6135(interfaceC5614);
                                InputStream inputStream = this.f32154;
                                if (inputStream instanceof C7531) {
                                    ((C7531) inputStream).m20055();
                                }
                                abstractC1886.m6137(c14588);
                                if (bitmapDecodeRegion == null) {
                                    throw new IOException("Image region could not be decoded");
                                }
                                if (!c20502M32310.m46302(bitmapDecodeRegion.getAllocationByteCount())) {
                                    throw new C10354("Tile allocation exceeds bitmap budget");
                                }
                                C20232 c20232 = new C20232(bitmapDecodeRegion, c20502M32310, i);
                                if (c0745 != 0) {
                                    c0745.close();
                                }
                                return c20232;
                            } catch (Throwable th) {
                                bitmap = bitmapDecodeRegion;
                                th = th;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                c20502M32310.close();
                                if (c0745 != 0) {
                                    c0745.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c0745 = 0;
                    }
                }
            }
            throw new IllegalArgumentException("Invalid region or sample size");
        }
        throw new IllegalStateException("Tile decoder must stay on its opening worker thread");
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f32154;
        if (Thread.currentThread() != this.f32157) {
            throw new IllegalStateException("Tile decoder must stay on its opening worker thread");
        }
        if (this.f32158) {
            return;
        }
        this.f32158 = true;
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.f32161;
            if (bitmapRegionDecoder != null) {
                bitmapRegionDecoder.recycle();
            }
            C2164 c2164 = this.f32155;
            if (c2164 != null) {
                c2164.close();
            }
        } finally {
            C20502 c20502 = this.f32156;
            if (c20502 != null) {
                c20502.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24341(String str) {
        return "image/x-tga".equals(str) || "image/jpeg".equals(str) || "image/png".equals(str) || "image/webp".equals(str);
    }
}
