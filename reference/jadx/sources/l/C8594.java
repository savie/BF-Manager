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

/* JADX INFO: renamed from: l.۠ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8594 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int[] f28085;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f28086;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long[] f28087;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f28088;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10085 f28089;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long[] f28090;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1137 f28091;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1137 m23099(long j, InputStream inputStream) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("Pixel limit must be positive");
        }
        byte[] bArr = new byte[18];
        for (int i = 0; i < 18; i++) {
            int i2 = inputStream.read();
            if (i2 < 0) {
                throw new EOFException("Truncated TGA header");
            }
            bArr[i] = (byte) i2;
        }
        return new C1137(j, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8594 m23101(File file, C1137 c1137, long j, InterfaceC7509 interfaceC7509) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            if (C19853.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size() > j) {
                throw new C9339("TGA input exceeds byte limit");
            }
            c1137.m4213(m23099(c1137.f4216, fileInputStream));
            C8594 c8594 = new C8594(c1137, new C10085(j, fileInputStream), true);
            c8594.m23104((int[]) null, (Rect) null, 1, interfaceC7509);
            return c8594;
        } catch (IOException | Error | RuntimeException e) {
            fileInputStream.close();
            throw e;
        }
    }

    public C8594(C1137 c1137, C10085 c10085, boolean z) throws IOException {
        this.f28091 = c1137;
        this.f28089 = c10085;
        long j = c1137.f4226;
        for (long j2 = 0; j2 < j; j2++) {
            c10085.m26042();
        }
        this.f28085 = new int[c1137.f4221];
        int i = 0;
        while (true) {
            int[] iArr = this.f28085;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = m23097(c10085, (c1137.f4222 + 7) / 8, c1137.f4222 == 32);
            i++;
        }
        this.f28086 = c10085.f32328;
        long[] jArr = (z && C1137.m4205(c1137)) ? new long[c1137.f4220] : null;
        this.f28090 = jArr;
        this.f28087 = jArr != null ? new long[c1137.f4220] : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Bitmap m23098(InputStream inputStream, C1137 c1137, Rect rect, int i, long j, InterfaceC7509 interfaceC7509) throws IOException {
        m23102(c1137, rect, i);
        m23103(interfaceC7509);
        int iM23095 = m23095(rect.width(), i);
        int iM23096 = m23095(rect.height(), i);
        int[] iArr = new int[iM23095 * iM23096];
        C8594 c8594 = new C8594(c1137, new C10085(j, inputStream), false);
        c8594.m23104(iArr, rect, i, interfaceC7509);
        if (c8594.f28088) {
            for (int i2 = 0; i2 < iM23096; i2++) {
                m23103(interfaceC7509);
                int iM4208 = C1137.m4208(c1137, (i2 * i) + rect.top);
                if (iM4208 >= 0 && iM4208 < c1137.f4220) {
                    for (int i3 = 0; i3 < iM23095; i3++) {
                        int iM4196 = C1137.m4196(c1137, (i3 * i) + rect.left);
                        if (iM4196 >= 0 && iM4196 < c1137.f4230) {
                            int i4 = (i2 * iM23095) + i3;
                            iArr[i4] = iArr[i4] | (-16777216);
                        }
                    }
                }
            }
        }
        m23103(interfaceC7509);
        return Bitmap.createBitmap(iArr, iM23095, iM23096, Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap m23107(Rect rect, int i, InterfaceC7509 interfaceC7509) throws Throwable {
        Bitmap bitmap;
        C2628 c2628;
        C1137 c1137 = this.f28091;
        m23102(c1137, rect, i);
        m23103(interfaceC7509);
        int iM23095 = m23095(rect.width(), i);
        int iM23096 = m23095(rect.height(), i);
        int[] iArr = new int[iM23095];
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM23095, iM23096, Bitmap.Config.ARGB_8888);
        int i2 = 0;
        int i3 = 0;
        while (i3 < iM23096) {
            try {
                m23103(interfaceC7509);
                Arrays.fill(iArr, i2);
                int iM4208 = C1137.m4208(c1137, (i3 * i) + rect.top);
                if (iM4208 < 0 || iM4208 >= c1137.f4220) {
                    i3 = i3;
                    iM23096 = iM23096;
                    iArr = iArr;
                    bitmap = bitmapCreateBitmap;
                } else {
                    int iM4196 = C1137.m4196(c1137, rect.left);
                    int iM4197 = C1137.m4196(c1137, ((iM23095 - 1) * i) + rect.left);
                    int iMax = Math.max(i2, Math.min(iM4196, iM4197));
                    int iMin = Math.min(c1137.f4230 - 1, Math.max(iM4196, iM4197));
                    if (iMax <= iMin) {
                        long j = ((long) iM4208) * ((long) c1137.f4230);
                        boolean zM4205 = C1137.m4205(c1137);
                        C10085 c10085 = this.f28089;
                        if (zM4205) {
                            c10085.m26043(this.f28090[iM4208]);
                            long j2 = this.f28087[iM4208];
                            c2628 = new C2628(this, j2);
                            bitmap = bitmapCreateBitmap;
                            long j3 = (j + ((long) iMax)) - j2;
                            for (long j4 = 0; j4 < j3; j4++) {
                                if ((j4 & 1023) == 0) {
                                    try {
                                        m23103(interfaceC7509);
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
                                c2628.m8769();
                            }
                        } else {
                            bitmap = bitmapCreateBitmap;
                            long j5 = j + ((long) iMax);
                            c10085.m26043((((long) C1137.m4204(c1137)) * j5) + this.f28086);
                            c2628 = new C2628(this, j5);
                        }
                        while (iMax <= iMin) {
                            if ((iMax & 1023) == 0) {
                                m23103(interfaceC7509);
                            }
                            int iM8769 = c2628.m8769();
                            int iM4199 = C1137.m4199(c1137, iMax) - rect.left;
                            if (iM4199 >= 0 && iM4199 % i == 0 && iM4199 / i < iM23095) {
                                int i4 = iM4199 / i;
                                if (this.f28088) {
                                    iM8769 |= -16777216;
                                }
                                iArr[i4] = iM8769;
                            }
                            iMax++;
                        }
                    } else {
                        i3 = i3;
                        iM23096 = iM23096;
                        iArr = iArr;
                        bitmap = bitmapCreateBitmap;
                    }
                }
                int i5 = i3;
                bitmap.setPixels(iArr, 0, iM23095, 0, i3, iM23095, 1);
                i3 = i5 + 1;
                i2 = 0;
                iM23096 = iM23096;
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
    private void m23104(int[] iArr, Rect rect, int i, InterfaceC7509 interfaceC7509) throws IOException {
        int i2;
        C1137 c1137;
        int i3;
        C1137 c1138;
        boolean z;
        int i4;
        boolean z2;
        C1137 c1139;
        int i5;
        C1137 c11310 = this.f28091;
        long j = ((long) c11310.f4230) * ((long) c11310.f4220);
        int iM23095 = rect == null ? 0 : m23095(rect.width(), i);
        long j2 = 0;
        boolean z3 = true;
        boolean z4 = true;
        int i6 = 0;
        while (j2 < j) {
            m23103(interfaceC7509);
            C10085 c10085 = this.f28089;
            long j3 = c10085.f32328;
            int iM26042 = C1137.m4205(c11310) ? c10085.m26042() : 0;
            int iMin = C1137.m4205(c11310) ? (iM26042 & 127) + 1 : (int) Math.min(128L, j - j2);
            long j4 = iMin;
            if (j4 > j - j2) {
                throw new IOException("TGA packet exceeds frame bounds");
            }
            long[] jArr = this.f28090;
            if (jArr != null) {
                int i7 = i6;
                while (true) {
                    if (i7 >= c11310.f4220) {
                        i2 = iMin;
                        c1137 = c11310;
                        i3 = iM23095;
                        break;
                    }
                    i3 = iM23095;
                    i2 = iMin;
                    c1137 = c11310;
                    if (((long) c11310.f4230) * ((long) i7) >= j2 + j4) {
                        break;
                    }
                    jArr[i7] = j3;
                    this.f28087[i7] = j2;
                    i7++;
                    iM23095 = i3;
                    iMin = i2;
                    c11310 = c1137;
                }
                i6 = i7;
            } else {
                i2 = iMin;
                c1137 = c11310;
                i3 = iM23095;
            }
            boolean z5 = C1137.m4205(c1137) && (iM26042 & 128) != 0;
            int iM23094 = z5 ? m23094() : 0;
            if (z5 && iArr == null) {
                int i8 = iM23094 >>> 24;
                boolean z6 = (i8 == 0) & z3;
                j2 += j4;
                z4 = (i8 == 255) & z4;
                z3 = z6;
                c1138 = c1137;
            } else {
                int i9 = 0;
                int i10 = i2;
                while (i9 < i10) {
                    int iM23096 = z5 ? iM23094 : m23094();
                    int i11 = iM23096 >>> 24;
                    z3 &= i11 == 0;
                    boolean z7 = z4 & (i11 == 255);
                    if (iArr != null) {
                        long j5 = ((long) i9) + j2;
                        boolean z8 = z5;
                        i4 = iM23094;
                        int i12 = (int) (j5 % ((long) c1137.f4230));
                        c1139 = c1137;
                        i5 = i10;
                        int iM4199 = C1137.m4199(c1139, i12) - rect.left;
                        z = z8;
                        z2 = z7;
                        int iM4210 = C1137.m4210(c1139, (int) (j5 / ((long) c1139.f4230))) - rect.top;
                        if (iM4199 >= 0 && iM4210 >= 0 && iM4199 < rect.width() && iM4210 < rect.height() && iM4199 % i == 0 && iM4210 % i == 0) {
                            iArr[(iM4199 / i) + ((iM4210 / i) * i3)] = iM23096;
                        }
                    } else {
                        z = z5;
                        i4 = iM23094;
                        z2 = z7;
                        c1139 = c1137;
                        i5 = i10;
                    }
                    i9++;
                    iM23094 = i4;
                    i10 = i5;
                    z4 = z2;
                    c1137 = c1139;
                    z5 = z;
                }
                c1138 = c1137;
                j2 += j4;
                z4 = z4;
            }
            c11310 = c1138;
            i6 = i6;
            j = j;
            iM23095 = i3;
        }
        C1137 c11311 = c11310;
        this.f28088 = C1137.m4203(c11311) && (C1137.m4204(c11311) == 2 || C1137.m4204(c11311) == 4) && (!C1137.m4211(c11311) ? !(z3 || z4) : !z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m23094() throws IOException {
        C1137 c1137 = this.f28091;
        int i = c1137.f4224;
        C10085 c10085 = this.f28089;
        boolean z = true;
        if (i == 1 || c1137.f4224 == 9) {
            int iM26042 = c10085.m26042();
            if (c1137.f4217 == 16) {
                iM26042 |= c10085.m26042() << 8;
            }
            int i2 = iM26042 - c1137.f4218;
            if (i2 < 0) {
                return -16777216;
            }
            int[] iArr = this.f28085;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -16777216;
        }
        if (c1137.f4224 == 3 || c1137.f4224 == 11) {
            int iM26043 = c10085.m26042();
            return ((C1137.m4211(c1137) ? c1137.f4217 == 16 ? c10085.m26042() : 255 : 255) << 24) | (iM26043 << 16) | (iM26043 << 8) | iM26043;
        }
        int iM4204 = C1137.m4204(c1137);
        if (c1137.f4217 != 32 && !C1137.m4211(c1137)) {
            z = false;
        }
        return m23097(c10085, iM4204, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23097(C10085 c10085, int i, boolean z) throws IOException {
        int iM26042 = c10085.m26042();
        int iM26043 = c10085.m26042();
        if (i != 2) {
            return ((z ? i == 4 ? c10085.m26042() : 255 : 255) << 24) | (c10085.m26042() << 16) | (iM26043 << 8) | iM26042;
        }
        int i2 = (iM26043 << 8) | iM26042;
        int i3 = (i2 >> 10) & 31;
        int i4 = (i2 >> 5) & 31;
        int i5 = i2 & 31;
        return ((z && (i2 & 32768) == 0) ? 0 : -16777216) | (((i3 >> 2) | (i3 << 3)) << 16) | (((i4 << 3) | (i4 >> 2)) << 8) | (i5 << 3) | (i5 >> 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23102(C1137 c1137, Rect rect, int i) {
        if (rect.isEmpty() || rect.left < 0 || rect.top < 0 || rect.right > c1137.f4225 || rect.bottom > c1137.f4228 || i <= 0) {
            throw new IllegalArgumentException("Invalid TGA region or sample");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23095(int i, int i2) {
        long j = i;
        long j2 = i2;
        return (int) (((j + j2) - 1) / j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23096(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23103(InterfaceC7509 interfaceC7509) throws InterruptedIOException {
        if (interfaceC7509.mo924()) {
            throw new InterruptedIOException("TGA decoding canceled");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f28089.f32325.close();
    }
}
