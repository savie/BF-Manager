package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۬֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes4.dex */
public final class C13519 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6808 f42977;

    public C13519() {
        C6808 c6808 = C6808.f22671;
        C17359.requireNonNull(c6808);
        this.f42977 = c6808;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9044 m33215(AbstractC13057 abstractC13057, C15294 c15294, C7753 c7753) {
        int i;
        long j;
        abstractC13057.m32544(c15294);
        C6808 c6808 = this.f42977;
        c6808.getClass();
        C6808 c6809 = c6808 == C6808.f22671 ? C6808.f22672 : c6808;
        long j2 = c15294.f50004;
        m33209(j2, c6809);
        boolean zM33211 = c7753.f25518;
        String str = c7753.f25516;
        if ("image/jpeg".equals(str)) {
            C0841 c0841M33207 = m33207(abstractC13057, c6809);
            try {
                zM33211 = m33211(c0841M33207);
                c0841M33207.close();
                abstractC13057.m32544(c15294);
            } catch (Throwable th) {
                try {
                    c0841M33207.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        C6808 c6808M18988 = c6808.m18988(str, zM33211);
        if (c7753.f25517 == EnumC0295.TGA) {
            C6808 c6808M18989 = c6808.m18988("image/x-tga", false);
            m33209(j2, c6808M18989);
            C0841 c0841M33208 = m33207(abstractC13057, c6808M18989);
            try {
                C1137 c1137M23099 = C8594.m23099(c6808M18989.f22674, c0841M33208);
                c0841M33208.m3343();
                c6808M18989.m18989(c1137M23099.f4225, c1137M23099.f4228);
                abstractC13057.m32544(c15294);
                C9044 c9044 = new C9044(abstractC13057.mo17426(), c1137M23099.f4225, c1137M23099.f4228, 1, "image/x-tga", c15294, -1L, c1137M23099, false, 0);
                c0841M33208.close();
                return c9044;
            } catch (Throwable th3) {
                try {
                    c0841M33208.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        m33209(j2, c6808M18988);
        BitmapFactory.Options optionsM33213 = c7753.f25515;
        if (optionsM33213 == null) {
            optionsM33213 = m33213(abstractC13057, c6808M18988);
        }
        abstractC13057.m32544(c15294);
        boolean zEquals = zM33211 & C17359.equals(str, optionsM33213.outMimeType);
        C6808 c6808M189810 = c6808.m18988(optionsM33213.outMimeType, zEquals);
        m33209(j2, c6808M189810);
        c6808M189810.m18989(optionsM33213.outWidth, optionsM33213.outHeight);
        String str2 = optionsM33213.outMimeType;
        int i2 = 1;
        long jLongValue = -1;
        if ("image/jpeg".equals(str2) || "image/png".equals(str2) || "image/webp".equals(str2)) {
            C0841 c0841M33209 = m33207(abstractC13057, c6808M189810);
            try {
                try {
                    C8826 c8826 = new C8826(c0841M33209, 0);
                    int iM23690 = c8826.m23690(1, "Orientation");
                    if (iM23690 >= 1 && iM23690 <= 8) {
                        i2 = iM23690;
                    }
                    Long lM37477 = C15701.m37477(c8826);
                    if (lM37477 != null) {
                        jLongValue = lM37477.longValue();
                    }
                } catch (IOException | RuntimeException unused) {
                }
                c0841M33209.m3343();
                c0841M33209.close();
                abstractC13057.m32544(c15294);
                i = i2;
                j = jLongValue;
            } catch (Throwable th5) {
                try {
                    c0841M33209.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } else {
            j = -1;
            i = 1;
        }
        return new C9044(abstractC13057.mo17426(), optionsM33213.outWidth, optionsM33213.outHeight, i, optionsM33213.outMimeType, c15294, j, null, zEquals, 0);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0107 A[PHI: r15 r16
      0x0107: PHI (r15v3 l.ܳۧ֫) = (r15v0 l.ܳۧ֫), (r15v7 l.ܳۧ֫) binds: [B:59:0x0104, B:47:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r16v3 l.ۜ֫֫) = (r16v0 l.ۜ֫֫), (r16v6 l.ۜ֫֫) binds: [B:59:0x0104, B:47:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x010a A[PHI: r15 r16
      0x010a: PHI (r15v1 l.ܳۧ֫) = (r15v0 l.ܳۧ֫), (r15v0 l.ܳۧ֫), (r15v7 l.ܳۧ֫), (r15v7 l.ܳۧ֫) binds: [B:57:0x0100, B:59:0x0104, B:45:0x00e0, B:47:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r16v1 l.ۜ֫֫) = (r16v0 l.ۜ֫֫), (r16v0 l.ۜ֫֫), (r16v6 l.ۜ֫֫), (r16v6 l.ۜ֫֫) binds: [B:57:0x0100, B:59:0x0104, B:45:0x00e0, B:47:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8299 m33214(AbstractC13057 abstractC13057, C9044 c9044, C2442 c2442, long j) throws C18740 {
        C15294 c15294;
        if (j <= 0) {
            throw new IllegalArgumentException("Preview byte limit must be positive");
        }
        String str = c9044.f29436;
        C15294 c15295 = c9044.f29430;
        int i = c9044.f29431;
        int i2 = c9044.f29428;
        C6808 c6808M18988 = this.f42977.m18988(str, c9044.f29435);
        m33210(abstractC13057, c9044, c6808M18988);
        if (c9044.f29432 != null) {
            return C21657.m49196(abstractC13057, c9044, c2442, j, null, new C8730(), c6808M18988);
        }
        long jMin = Math.min(j, c2442.m8241());
        int i3 = 1;
        AbstractC13057 abstractC13058 = abstractC13057;
        while (i3 > 0) {
            long jM33203 = m33203(i2, i3);
            long jM33204 = m33203(i, i3);
            long jM33205 = m33204(i2, i, i3);
            C6808 c6808 = c6808M18988;
            long j2 = 2048;
            if (jM33203 <= j2 && jM33204 <= j2 && jM33203 * jM33204 <= 4194304 && jM33205 <= jMin) {
                C9153 c9153M8242 = c2442.m8242(jM33205);
                if (c9153M8242 != null) {
                    Bitmap bitmap = null;
                    try {
                        abstractC13058.m32544(c15295);
                        Bitmap bitmapM33205 = m33205(abstractC13058, m33206(i3), c6808);
                        abstractC13058.m32544(c15295);
                        if (bitmapM33205 == null) {
                            throw new IOException("Image preview could not be decoded");
                        }
                        C15294 c15296 = c15295;
                        long allocationByteCount = bitmapM33205.getAllocationByteCount();
                        if (bitmapM33205.getWidth() > 2048 || bitmapM33205.getHeight() > 2048) {
                            c15294 = c15296;
                            c6808 = c6808;
                        } else {
                            c15294 = c15296;
                            if (((long) bitmapM33205.getWidth()) * ((long) bitmapM33205.getHeight()) <= 4194304 && allocationByteCount <= jMin && c9153M8242.m24288(allocationByteCount)) {
                                c6808 = c6808;
                                return new C8299(bitmapM33205, c9153M8242, i3);
                            }
                        }
                        c6808 = c6808;
                        c6808 = c6808;
                        c6808 = c6808;
                        bitmapM33205.recycle();
                        c9153M8242.close();
                        if (i3 >= Math.max(i2, i) || i3 >= 1073741824) {
                            i3 = 0;
                        } else {
                            i3 *= 2;
                        }
                        abstractC13058 = abstractC13057;
                    } catch (Throwable th) {
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        c9153M8242.close();
                        throw th;
                    }
                } else {
                    i3 = (i3 >= Math.max(i2, i) || i3 >= 1073741824) ? 0 : i3 * 2;
                    c15294 = c15295;
                }
            } else {
                c15294 = c15295;
                if (i3 >= Math.max(i2, i) || i3 >= 1073741824) {
                    i3 = 0;
                } else {
                    i3 *= 2;
                }
                abstractC13058 = abstractC13057;
            }
            c15295 = c15294;
            c6808M18988 = c6808;
        }
        throw new C18740("No safe preview allocation fits the bitmap budget");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33210(AbstractC13057 abstractC13057, C9044 c9044, C6808 c6808) {
        String str = c9044.f29436;
        C15294 c15294 = c9044.f29430;
        C6808 c6808M18988 = c6808.m18988(str, c9044.f29435);
        if (!abstractC13057.mo17426().equals(c9044.f29433)) {
            throw new C19770("Metadata belongs to another image source");
        }
        c6808M18988.m18989(c9044.f29428, c9044.f29431);
        m33209(c15294.f50004, c6808M18988);
        abstractC13057.m32544(c15294);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33209(long j, C6808 c6808) {
        if (j > c6808.f22673) {
            throw new C9789("Image input exceeds byte limit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static BitmapFactory.Options m33206(int i) {
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
    public static Bitmap m33205(AbstractC13057 abstractC13057, BitmapFactory.Options options, C6808 c6808) {
        Bitmap bitmapDecodeStream = null;
        if (abstractC13057.mo17424() != null) {
            try {
                InputStream inputStreamMo17428 = abstractC13057.mo17428();
                try {
                    if (!(inputStreamMo17428 instanceof FileInputStream)) {
                        throw new IOException("Local source requires a file stream");
                    }
                    m33209(C19853.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) inputStreamMo17428).getChannel()).size(), c6808);
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(((FileInputStream) inputStreamMo17428).getFD(), null, options);
                    inputStreamMo17428.close();
                    return bitmapDecodeFileDescriptor;
                } catch (Throwable th) {
                    if (inputStreamMo17428 != null) {
                        try {
                            inputStreamMo17428.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                if (0 != 0) {
                    bitmapDecodeStream.recycle();
                }
                throw e;
            }
        }
        try {
            C0841 c0841M33207 = m33207(abstractC13057, c6808);
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(c0841M33207, null, options);
                c0841M33207.m3343();
                c0841M33207.close();
                return bitmapDecodeStream;
            } catch (Throwable th3) {
                try {
                    c0841M33207.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException | Error | RuntimeException e2) {
            if (bitmapDecodeStream != null) {
                bitmapDecodeStream.recycle();
            }
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0841 m33207(AbstractC13057 abstractC13057, C6808 c6808) {
        InputStream inputStreamMo17428 = abstractC13057.mo17428();
        try {
            if (inputStreamMo17428 instanceof FileInputStream) {
                m33209(C19853.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) inputStreamMo17428).getChannel()).size(), c6808);
            }
            return new C0841(c6808.f22673, inputStreamMo17428);
        } catch (IOException | Error | RuntimeException e) {
            try {
                inputStreamMo17428.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m33203(int i, int i2) {
        long j = i;
        long j2 = i2;
        return ((j + j2) - 1) / j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m33204(int i, int i2, int i3) {
        return m33203(i, i3) * m33203(i2, i3) * 4;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static BitmapFactory.Options m33213(AbstractC13057 abstractC13057, C6808 c6808) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        m33205(abstractC13057, options, c6808);
        return options;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33211(InputStream inputStream) throws IOException {
        int i;
        int i2;
        int i3;
        if (inputStream.read() == 255 && inputStream.read() == 216) {
            byte[] bArr = new byte[4096];
            int i4 = 1048574;
            int[] iArr = null;
            loop0: while (i4 >= 4 && inputStream.read() == 255) {
                int i5 = i4 - 1;
                while (true) {
                    i = i5 - 1;
                    if (i5 <= 0) {
                        break loop0;
                    }
                    i2 = inputStream.read();
                    if (i2 != 255) {
                        break;
                    }
                    i5 = i;
                }
                if (i < 2 || i2 < 0 || !(i2 == 192 || i2 == 218 || i2 == 196 || i2 == 219 || i2 == 221 || i2 == 254 || (i2 >= 224 && i2 <= 239))) {
                    break;
                }
                int i6 = inputStream.read();
                int i7 = inputStream.read();
                if (i6 < 0 || i7 < 0) {
                    break;
                }
                int i8 = (i6 << 8) | i7;
                int i9 = i8 - 2;
                int i10 = i5 - 3;
                if (i9 < 0 || i9 > i10) {
                    break;
                }
                i4 = i10 - i9;
                if (i2 != 192 && i2 != 218) {
                    while (i9 > 0) {
                        int iMin = Math.min(4096, i9);
                        if (!m33212(inputStream, bArr, iMin)) {
                            break loop0;
                        }
                        i9 -= iMin;
                    }
                } else {
                    if (i9 > 4096 || !m33212(inputStream, bArr, i9)) {
                        break;
                    }
                    if (i2 == 192) {
                        if (iArr != null || i9 < 6 || bArr[0] != 8 || (((i3 = bArr[5] & 255) != 1 && i3 != 3) || i9 != (i3 * 3) + 6)) {
                            break;
                        }
                        int[] iArr2 = new int[i3];
                        for (int i11 = 0; i11 < i3; i11++) {
                            iArr2[i11] = bArr[(i11 * 3) + 6] & 255;
                            for (int i12 = 0; i12 < i11; i12++) {
                                if (iArr2[i12] == iArr2[i11]) {
                                    break loop0;
                                }
                            }
                        }
                        iArr = iArr2;
                    } else {
                        if (iArr == null || i9 != (iArr.length * 2) + 4 || (bArr[0] & 255) != iArr.length) {
                            break;
                            break;
                            break;
                        }
                        int i13 = 0;
                        for (int i14 = 0; i14 < iArr.length; i14++) {
                            int i15 = 0;
                            for (int i16 = 0; i16 < iArr.length; i16++) {
                                if ((bArr[(i14 * 2) + 1] & 255) == iArr[i16]) {
                                    i15 = 1 << i16;
                                }
                            }
                            if (i15 == 0 || (i13 & i15) != 0) {
                                break;
                            }
                            i13 |= i15;
                        }
                        if (bArr[i8 - 5] != 0 || bArr[i8 - 4] != 63 || bArr[i8 - 3] != 0) {
                            break;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33212(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 >= 0) {
                if (i3 == 0) {
                    int i4 = inputStream.read();
                    if (i4 >= 0) {
                        bArr[i2] = (byte) i4;
                        i2++;
                    }
                } else {
                    i2 += i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8299 m33208(C8299 c8299, C9153 c9153, long j) throws Throwable {
        Bitmap bitmap;
        Bitmap bitmapCreateScaledBitmap;
        int i = 1;
        while (true) {
            bitmap = c8299.f27263;
            if (m33204(bitmap.getWidth(), bitmap.getHeight(), i) <= j) {
                break;
            }
            i *= 2;
        }
        if (i == 1) {
            c9153.close();
            return c8299.m22388();
        }
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) m33203(bitmap.getWidth(), i), (int) m33203(bitmap.getHeight(), i), true);
            try {
                if (!c9153.m24288(bitmapCreateScaledBitmap.getAllocationByteCount())) {
                    throw new C18740("Scaled preview exceeded its budget");
                }
                return new C8299(bitmapCreateScaledBitmap, c9153, c8299.f27262 * i);
            } catch (Throwable th) {
                th = th;
                if (bitmapCreateScaledBitmap != null) {
                    bitmapCreateScaledBitmap.recycle();
                }
                c9153.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmapCreateScaledBitmap = null;
        }
    }
}
