package l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֫᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2164 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C6398 f7860;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long[] f7861;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f7862;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f7863;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f7864;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long[] f7865;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11338 f7866;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11338 m6735(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[18];
        for (int i = 0; i < 18; i++) {
            int i2 = inputStream.read();
            if (i2 < 0) {
                throw new EOFException("Truncated TGA header");
            }
            bArr[i] = (byte) i2;
        }
        return new C11338(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2164 m6734(File file, C11338 c11338, InterfaceC5614 interfaceC5614) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            if (C6001.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size() > 268435456) {
                throw new C24038("TGA input exceeds byte limit");
            }
            c11338.m28420(m6735(fileInputStream));
            C2164 c2164 = new C2164(c11338, new C6398(fileInputStream), true);
            c2164.m6739(null, null, 1, interfaceC5614);
            return c2164;
        } catch (IOException | Error | RuntimeException e) {
            fileInputStream.close();
            throw e;
        }
    }

    public C2164(C11338 c11338, C6398 c6398, boolean z) throws IOException {
        this.f7866 = c11338;
        this.f7860 = c6398;
        long j = c11338.f38253;
        for (long j2 = 0; j2 < j; j2++) {
            c6398.m17545();
        }
        this.f7864 = new int[c11338.f38249];
        int i = 0;
        while (true) {
            int[] iArr = this.f7864;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = m6732(c6398, (c11338.f38261 + 7) / 8, c11338.f38261 == 32);
            i++;
        }
        this.f7862 = c6398.f21712;
        long[] jArr = (z && C11338.m28415(c11338)) ? new long[c11338.f38251] : null;
        this.f7865 = jArr;
        this.f7861 = jArr != null ? new long[c11338.f38251] : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m6733(InputStream inputStream, C11338 c11338, Rect rect, int i, InterfaceC5614 interfaceC5614) throws IOException {
        m6738(c11338, rect, i);
        m6737(interfaceC5614);
        int iM6730 = m6730(rect.width(), i);
        int iM6731 = m6730(rect.height(), i);
        int[] iArr = new int[iM6730 * iM6731];
        C2164 c2164 = new C2164(c11338, new C6398(inputStream), false);
        c2164.m6739(iArr, rect, i, interfaceC5614);
        if (c2164.f7863) {
            for (int i2 = 0; i2 < iM6731; i2++) {
                m6737(interfaceC5614);
                int iM28414 = C11338.m28414(c11338, (i2 * i) + rect.top);
                if (iM28414 >= 0 && iM28414 < c11338.f38251) {
                    for (int i3 = 0; i3 < iM6730; i3++) {
                        int iM28407 = C11338.m28407(c11338, (i3 * i) + rect.left);
                        if (iM28407 >= 0 && iM28407 < c11338.f38254) {
                            int i4 = (i2 * iM6730) + i3;
                            iArr[i4] = iArr[i4] | (-16777216);
                        }
                    }
                }
            }
        }
        m6737(interfaceC5614);
        return Bitmap.createBitmap(iArr, iM6730, iM6731, Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap m6742(Rect rect, int i, InterfaceC5614 interfaceC5614) throws Throwable {
        Bitmap bitmap;
        C14866 c14866;
        C11338 c11338 = this.f7866;
        m6738(c11338, rect, i);
        m6737(interfaceC5614);
        int iM6730 = m6730(rect.width(), i);
        int iM6731 = m6730(rect.height(), i);
        int[] iArr = new int[iM6730];
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM6730, iM6731, Bitmap.Config.ARGB_8888);
        int i2 = 0;
        int i3 = 0;
        while (i3 < iM6731) {
            try {
                m6737(interfaceC5614);
                Arrays.fill(iArr, i2);
                int iM28414 = C11338.m28414(c11338, (i3 * i) + rect.top);
                if (iM28414 < 0 || iM28414 >= c11338.f38251) {
                    i3 = i3;
                    iM6731 = iM6731;
                    iArr = iArr;
                    bitmap = bitmapCreateBitmap;
                } else {
                    int iM28407 = C11338.m28407(c11338, rect.left);
                    int iM28408 = C11338.m28407(c11338, ((iM6730 - 1) * i) + rect.left);
                    int iMax = Math.max(i2, Math.min(iM28407, iM28408));
                    int iMin = Math.min(c11338.f38254 - 1, Math.max(iM28407, iM28408));
                    if (iMax <= iMin) {
                        long j = ((long) iM28414) * ((long) c11338.f38254);
                        boolean zM28415 = C11338.m28415(c11338);
                        C6398 c6398 = this.f7860;
                        if (zM28415) {
                            c6398.m17546(this.f7865[iM28414]);
                            long j2 = this.f7861[iM28414];
                            c14866 = new C14866(this, j2);
                            bitmap = bitmapCreateBitmap;
                            long j3 = (j + ((long) iMax)) - j2;
                            for (long j4 = 0; j4 < j3; j4++) {
                                if ((j4 & 1023) == 0) {
                                    try {
                                        m6737(interfaceC5614);
                                    } catch (IOException e) {
                                        e = e;
                                        bitmap.recycle();
                                        throw e;
                                    } catch (Error e2) {
                                        e = e2;
                                        bitmap.recycle();
                                        throw e;
                                    } catch (RuntimeException e3) {
                                        e = e3;
                                        bitmap.recycle();
                                        throw e;
                                    }
                                }
                                c14866.m35546();
                            }
                        } else {
                            bitmap = bitmapCreateBitmap;
                            long j5 = j + ((long) iMax);
                            c6398.m17546((((long) C11338.m28418(c11338)) * j5) + this.f7862);
                            c14866 = new C14866(this, j5);
                        }
                        while (iMax <= iMin) {
                            if ((iMax & 1023) == 0) {
                                m6737(interfaceC5614);
                            }
                            int iM35546 = c14866.m35546();
                            int iM28411 = C11338.m28411(c11338, iMax) - rect.left;
                            if (iM28411 >= 0 && iM28411 % i == 0 && iM28411 / i < iM6730) {
                                int i4 = iM28411 / i;
                                if (this.f7863) {
                                    iM35546 |= -16777216;
                                }
                                iArr[i4] = iM35546;
                            }
                            iMax++;
                        }
                    } else {
                        i3 = i3;
                        iM6731 = iM6731;
                        iArr = iArr;
                        bitmap = bitmapCreateBitmap;
                    }
                }
                int i5 = i3;
                bitmap.setPixels(iArr, 0, iM6730, 0, i3, iM6730, 1);
                i3 = i5 + 1;
                i2 = 0;
                iM6731 = iM6731;
                iArr = iArr;
                bitmapCreateBitmap = bitmap;
            } catch (IOException e4) {
                e = e4;
                bitmap = bitmapCreateBitmap;
                bitmap.recycle();
                throw e;
            } catch (Error e5) {
                e = e5;
                bitmap = bitmapCreateBitmap;
                bitmap.recycle();
                throw e;
            } catch (RuntimeException e6) {
                e = e6;
                bitmap = bitmapCreateBitmap;
                bitmap.recycle();
                throw e;
            }
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6739(int[] iArr, Rect rect, int i, InterfaceC5614 interfaceC5614) throws IOException {
        int i2;
        C11338 c11338;
        int i3;
        C11338 c11339;
        boolean z;
        int i4;
        boolean z2;
        C11338 c113310;
        int i5;
        C11338 c113311 = this.f7866;
        long j = ((long) c113311.f38254) * ((long) c113311.f38251);
        int iM6730 = rect == null ? 0 : m6730(rect.width(), i);
        long j2 = 0;
        boolean z3 = true;
        boolean z4 = true;
        int i6 = 0;
        while (j2 < j) {
            m6737(interfaceC5614);
            C6398 c6398 = this.f7860;
            long j3 = c6398.f21712;
            int iM17545 = C11338.m28415(c113311) ? c6398.m17545() : 0;
            int iMin = C11338.m28415(c113311) ? (iM17545 & 127) + 1 : (int) Math.min(128L, j - j2);
            long j4 = iMin;
            if (j4 > j - j2) {
                throw new IOException("TGA packet exceeds frame bounds");
            }
            long[] jArr = this.f7865;
            if (jArr != null) {
                int i7 = i6;
                while (true) {
                    if (i7 >= c113311.f38251) {
                        i2 = iMin;
                        c11338 = c113311;
                        i3 = iM6730;
                        break;
                    }
                    i3 = iM6730;
                    i2 = iMin;
                    c11338 = c113311;
                    if (((long) c113311.f38254) * ((long) i7) >= j2 + j4) {
                        break;
                    }
                    jArr[i7] = j3;
                    this.f7861[i7] = j2;
                    i7++;
                    iM6730 = i3;
                    iMin = i2;
                    c113311 = c11338;
                }
                i6 = i7;
            } else {
                i2 = iMin;
                c11338 = c113311;
                i3 = iM6730;
            }
            boolean z5 = C11338.m28415(c11338) && (iM17545 & 128) != 0;
            int iM6729 = z5 ? m6729() : 0;
            if (z5 && iArr == null) {
                int i8 = iM6729 >>> 24;
                boolean z6 = (i8 == 0) & z3;
                j2 += j4;
                z4 = (i8 == 255) & z4;
                z3 = z6;
                c11339 = c11338;
            } else {
                int i9 = 0;
                int i10 = i2;
                while (i9 < i10) {
                    int iM67210 = z5 ? iM6729 : m6729();
                    int i11 = iM67210 >>> 24;
                    z3 &= i11 == 0;
                    boolean z7 = z4 & (i11 == 255);
                    if (iArr != null) {
                        long j5 = ((long) i9) + j2;
                        boolean z8 = z5;
                        i4 = iM6729;
                        int i12 = (int) (j5 % ((long) c11338.f38254));
                        c113310 = c11338;
                        i5 = i10;
                        int iM28411 = C11338.m28411(c113310, i12) - rect.left;
                        z = z8;
                        z2 = z7;
                        int iM28405 = C11338.m28405(c113310, (int) (j5 / ((long) c113310.f38254))) - rect.top;
                        if (iM28411 >= 0 && iM28405 >= 0 && iM28411 < rect.width() && iM28405 < rect.height() && iM28411 % i == 0 && iM28405 % i == 0) {
                            iArr[(iM28411 / i) + ((iM28405 / i) * i3)] = iM67210;
                        }
                    } else {
                        z = z5;
                        i4 = iM6729;
                        z2 = z7;
                        c113310 = c11338;
                        i5 = i10;
                    }
                    i9++;
                    iM6729 = i4;
                    i10 = i5;
                    z4 = z2;
                    c11338 = c113310;
                    z5 = z;
                }
                c11339 = c11338;
                j2 += j4;
                z4 = z4;
            }
            c113311 = c11339;
            i6 = i6;
            j = j;
            iM6730 = i3;
        }
        C11338 c113312 = c113311;
        this.f7863 = C11338.m28416(c113312) && (C11338.m28418(c113312) == 2 || C11338.m28418(c113312) == 4) && (!C11338.m28409(c113312) ? !(z3 || z4) : !z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m6729() throws IOException {
        C11338 c11338 = this.f7866;
        int i = c11338.f38262;
        C6398 c6398 = this.f7860;
        boolean z = true;
        if (i == 1 || c11338.f38262 == 9) {
            int iM17545 = c6398.m17545();
            if (c11338.f38252 == 16) {
                iM17545 |= c6398.m17545() << 8;
            }
            int i2 = iM17545 - c11338.f38256;
            if (i2 < 0) {
                return -16777216;
            }
            int[] iArr = this.f7864;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -16777216;
        }
        if (c11338.f38262 == 3 || c11338.f38262 == 11) {
            int iM17546 = c6398.m17545();
            return ((C11338.m28409(c11338) ? c11338.f38252 == 16 ? c6398.m17545() : 255 : 255) << 24) | (iM17546 << 16) | (iM17546 << 8) | iM17546;
        }
        int iM28418 = C11338.m28418(c11338);
        if (c11338.f38252 != 32 && !C11338.m28409(c11338)) {
            z = false;
        }
        return m6732(c6398, iM28418, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6732(C6398 c6398, int i, boolean z) throws IOException {
        int iM17545 = c6398.m17545();
        int iM17546 = c6398.m17545();
        if (i != 2) {
            return ((z ? i == 4 ? c6398.m17545() : 255 : 255) << 24) | (c6398.m17545() << 16) | (iM17546 << 8) | iM17545;
        }
        int i2 = (iM17546 << 8) | iM17545;
        int i3 = (i2 >> 10) & 31;
        int i4 = (i2 >> 5) & 31;
        int i5 = i2 & 31;
        return ((z && (i2 & 32768) == 0) ? 0 : -16777216) | (((i3 >> 2) | (i3 << 3)) << 16) | (((i4 << 3) | (i4 >> 2)) << 8) | (i5 << 3) | (i5 >> 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6738(C11338 c11338, Rect rect, int i) {
        if (rect.isEmpty() || rect.left < 0 || rect.top < 0 || rect.right > c11338.f38258 || rect.bottom > c11338.f38250 || i <= 0) {
            throw new IllegalArgumentException("Invalid TGA region or sample");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6730(int i, int i2) {
        long j = i;
        long j2 = i2;
        return (int) (((j + j2) - 1) / j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6731(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6737(InterfaceC5614 interfaceC5614) throws InterruptedIOException {
        if (interfaceC5614.mo2357()) {
            throw new InterruptedIOException("TGA decoding canceled");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7860.f21711.close();
    }
}
