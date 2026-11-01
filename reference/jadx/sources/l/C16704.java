package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܽܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16704 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0475 f53500;

    public C16704() {
        C0475 c0475 = C0475.f2151;
        C13638.requireNonNull(c0475);
        this.f53500 = c0475;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20937 m39183(AbstractC1886 abstractC1886, C14588 c14588, BitmapFactory.Options options) {
        int i;
        long j;
        int i2;
        abstractC1886.m6137(c14588);
        C0475 c0475 = this.f53500;
        m39180(c14588, c0475);
        BitmapFactory.Options optionsM39181 = options == null ? m39181(abstractC1886, c0475) : options;
        abstractC1886.m6137(c14588);
        int i3 = optionsM39181.outWidth;
        if (i3 <= 0 || (i = optionsM39181.outHeight) <= 0) {
            C7531 c7531M39177 = m39177(abstractC1886, c0475);
            try {
                C11338 c11338M6735 = C2164.m6735(c7531M39177);
                c7531M39177.m20055();
                c0475.m2343(c11338M6735.f38258, c11338M6735.f38250);
                abstractC1886.m6137(c14588);
                C20937 c20937 = new C20937(abstractC1886.mo5281(), c11338M6735.f38258, c11338M6735.f38250, c14588, c11338M6735);
                c7531M39177.close();
                return c20937;
            } catch (Throwable th) {
                try {
                    c7531M39177.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        c0475.m2343(i3, i);
        String str = optionsM39181.outMimeType;
        int i4 = 1;
        long jLongValue = -1;
        if ("image/jpeg".equals(str) || "image/png".equals(str) || "image/webp".equals(str)) {
            C7531 c7531M39178 = m39177(abstractC1886, c0475);
            try {
                try {
                    C3021 c3021 = new C3021(c7531M39178, 0);
                    int iM9015 = c3021.m9015();
                    if (iM9015 >= 1 && iM9015 <= 8) {
                        i4 = iM9015;
                    }
                    Long lM14996 = C5422.m14996(c3021);
                    if (lM14996 != null) {
                        jLongValue = lM14996.longValue();
                    }
                } catch (Throwable th3) {
                    try {
                        c7531M39178.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException | RuntimeException unused) {
            }
            c7531M39178.m20055();
            c7531M39178.close();
            abstractC1886.m6137(c14588);
            j = jLongValue;
            i2 = i4;
        } else {
            j = -1;
            i2 = 1;
        }
        return new C20937(abstractC1886.mo5281(), optionsM39181.outWidth, optionsM39181.outHeight, i2, optionsM39181.outMimeType, c14588, j);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f6 A[PHI: r16
      0x00f6: PHI (r16v3 l.֡ܳ۬) = (r16v0 l.֡ܳ۬), (r16v5 l.֡ܳ۬), (r16v0 l.֡ܳ۬) binds: [B:56:0x00f3, B:44:0x00d4, B:23:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9 A[PHI: r16
      0x00f9: PHI (r16v1 l.֡ܳ۬) = (r16v0 l.֡ܳ۬), (r16v0 l.֡ܳ۬), (r16v5 l.֡ܳ۬), (r16v5 l.֡ܳ۬), (r16v0 l.֡ܳ۬), (r16v0 l.֡ܳ۬) binds: [B:54:0x00ef, B:56:0x00f3, B:42:0x00d0, B:44:0x00d4, B:22:0x0073, B:23:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20232 m39182(AbstractC1886 abstractC1886, C20937 c20937, C0745 c0745, long j) throws C10354 {
        if (j <= 0) {
            throw new IllegalArgumentException("Preview byte limit must be positive");
        }
        C0475 c0475 = this.f53500;
        m39179(abstractC1886, c20937, c0475);
        C14588 c14588 = c20937.f68245;
        int i = c20937.f68251;
        int i2 = c20937.f68250;
        if (c20937.f68252 != null) {
            return C3858.m11179(abstractC1886, c20937, c0745, j, null, new C14681(), this.f53500);
        }
        long jMin = Math.min(j, c0745.m3238());
        int i3 = 1;
        while (i3 > 0) {
            long jM39173 = m39173(i2, i3);
            long jM39174 = m39173(i, i3);
            long jM39175 = m39174(i2, i, i3);
            C0475 c0476 = c0475;
            long j2 = 2048;
            if (jM39173 <= j2 && jM39174 <= j2 && jM39173 * jM39174 <= 4194304 && jM39175 <= jMin) {
                C20502 c20502M3239 = c0745.m3239(jM39175);
                if (c20502M3239 != null) {
                    Bitmap bitmap = null;
                    try {
                        abstractC1886.m6137(c14588);
                        Bitmap bitmapM39175 = m39175(abstractC1886, m39176(i3), c0476);
                        abstractC1886.m6137(c14588);
                        if (bitmapM39175 == null) {
                            throw new IOException("Image preview could not be decoded");
                        }
                        long allocationByteCount = bitmapM39175.getAllocationByteCount();
                        if (bitmapM39175.getWidth() > 2048 || bitmapM39175.getHeight() > 2048) {
                            c0476 = c0476;
                        } else if (((long) bitmapM39175.getWidth()) * ((long) bitmapM39175.getHeight()) <= 4194304 && allocationByteCount <= jMin && c20502M3239.m46302(allocationByteCount)) {
                            c0476 = c0476;
                            return new C20232(bitmapM39175, c20502M3239, i3);
                        }
                        c0476 = c0476;
                        c0476 = c0476;
                        c0476 = c0476;
                        bitmapM39175.recycle();
                        c20502M3239.close();
                        if (i3 >= Math.max(i2, i) || i3 >= 1073741824) {
                            i3 = 0;
                        } else {
                            i3 *= 2;
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        c20502M3239.close();
                        throw th;
                    }
                } else if (i3 >= Math.max(i2, i) || i3 >= 1073741824) {
                    i3 = 0;
                } else {
                    i3 *= 2;
                }
            } else if (i3 >= Math.max(i2, i) || i3 >= 1073741824) {
                i3 = 0;
            } else {
                i3 *= 2;
            }
            c0475 = c0476;
        }
        throw new C10354("No safe preview allocation fits the bitmap budget");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39179(AbstractC1886 abstractC1886, C20937 c20937, C0475 c0475) {
        String strMo5281 = abstractC1886.mo5281();
        String str = c20937.f68248;
        C14588 c14588 = c20937.f68245;
        if (!strMo5281.equals(str)) {
            throw new C23760("Metadata belongs to another image source");
        }
        c0475.m2343(c20937.f68250, c20937.f68251);
        m39180(c14588, c0475);
        abstractC1886.m6137(c14588);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39180(C14588 c14588, C0475 c0475) throws C10354 {
        long j = c14588.f47739;
        c0475.getClass();
        if (j > 268435456) {
            throw new C10354("Image input exceeds byte limit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static BitmapFactory.Options m39176(int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inScaled = false;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return options;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m39175(AbstractC1886 abstractC1886, BitmapFactory.Options options, C0475 c0475) {
        Bitmap bitmap = null;
        if (abstractC1886.mo6139() != null) {
            try {
                InputStream inputStreamMo5285 = abstractC1886.mo5285();
                try {
                    if (!(inputStreamMo5285 instanceof FileInputStream)) {
                        throw new IOException("Local source requires a file stream");
                    }
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(((FileInputStream) inputStreamMo5285).getFD(), null, options);
                    inputStreamMo5285.close();
                    return bitmapDecodeFileDescriptor;
                } catch (Throwable th) {
                    if (inputStreamMo5285 != null) {
                        try {
                            inputStreamMo5285.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                if (0 != 0) {
                    bitmap.recycle();
                }
                throw e;
            }
        }
        try {
            C7531 c7531M39177 = m39177(abstractC1886, c0475);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c7531M39177, null, options);
                c7531M39177.m20055();
                c7531M39177.close();
                return bitmapDecodeStream;
            } catch (Throwable th3) {
                try {
                    c7531M39177.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException | Error | RuntimeException e2) {
            if (0 != 0) {
                bitmap.recycle();
            }
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7531 m39177(AbstractC1886 abstractC1886, C0475 c0475) {
        InputStream inputStreamMo5285 = abstractC1886.mo5285();
        c0475.getClass();
        return new C7531(inputStreamMo5285);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m39173(int i, int i2) {
        long j = i;
        long j2 = i2;
        return ((j + j2) - 1) / j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m39174(int i, int i2, int i3) {
        return m39173(i, i3) * m39173(i2, i3) * 4;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static BitmapFactory.Options m39181(AbstractC1886 abstractC1886, C0475 c0475) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        m39175(abstractC1886, options, c0475);
        return options;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20232 m39178(C20232 c20232, C20502 c20502, long j) throws Throwable {
        Bitmap bitmap;
        Bitmap bitmapCreateScaledBitmap;
        int i = 1;
        while (true) {
            bitmap = c20232.f65655;
            if (m39174(bitmap.getWidth(), bitmap.getHeight(), i) <= j) {
                break;
            }
            i *= 2;
        }
        if (i == 1) {
            c20502.close();
            return c20232.m45735();
        }
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) m39173(bitmap.getWidth(), i), (int) m39173(bitmap.getHeight(), i), true);
            try {
                if (!c20502.m46302(bitmapCreateScaledBitmap.getAllocationByteCount())) {
                    throw new C10354("Scaled preview exceeded its budget");
                }
                return new C20232(bitmapCreateScaledBitmap, c20502, c20232.f65654 * i);
            } catch (Throwable th) {
                th = th;
                if (bitmapCreateScaledBitmap != null) {
                    bitmapCreateScaledBitmap.recycle();
                }
                c20502.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmapCreateScaledBitmap = null;
        }
    }
}
