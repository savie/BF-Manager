package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6SW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4991 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] f17370;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9017 f17371;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f17372;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f17373;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f17374;

    public C4991(ArrayList arrayList, int i, int i2, C9017 c9017) {
        this.f17374 = arrayList;
        this.f17371 = c9017;
        C11018 c11018 = new C11018(20);
        c11018.writeInt(1295139155);
        c11018.writeInt(i2 < 0 ? 1 : 2);
        c11018.writeInt(i);
        if (i2 >= 0) {
            c11018.writeInt(i2);
        }
        c11018.writeInt(arrayList.size());
        byte[] bArrM27773 = c11018.m27773();
        this.f17370 = bArrM27773;
        long length = bArrM27773.length;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C11342 c11342 = (C11342) it.next();
            C6402 c6402 = c11342.f38274;
            length += (c6402 == null ? c11342.f38272.length : c6402.m17551()) + 12;
        }
        if (length > 2147483647L) {
            throw new IllegalArgumentException("Legacy app state exceeds size limit");
        }
        this.f17373 = length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4991 m13819(C22631 c22631, int i, int i2, byte[] bArr, C10428 c10428) {
        if (i2 < 0 || ((long) i) + ((long) i2) > 2147483647L) {
            throw new IllegalArgumentException("Invalid legacy page length");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Invalid legacy page prefix");
        }
        C9017 c9017M26333 = c10428.m26333(((long) (bArr == null ? 0 : bArr.length)) + 16384);
        try {
            return m13818(c22631, i, i2, bArr, c9017M26333);
        } catch (Error | RuntimeException e) {
            c9017M26333.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4991 m13818(C22631 c22631, int i, int i2, byte[] bArr, C9017 c9017) {
        C6402 c6402M50168;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C11342(256, c22631.m50171()));
        for (int i3 = 1; i3 < 255; i3++) {
            if (i3 != 3 && (c6402M50168 = c22631.m50168(i3)) != null) {
                arrayList.add(new C11342(i3, c6402M50168));
            }
        }
        if (c22631.m50167() != null) {
            arrayList.add(new C11342(259, c22631.m50167()));
        }
        if (c22631.m50175() != null) {
            arrayList.add(new C11342(260, c22631.m50175()));
        }
        arrayList.add(new C11342(257, c22631.m50172()));
        arrayList.add(new C11342(258, c22631.m50174()));
        if (bArr != null) {
            arrayList.add(new C11342((byte[]) bArr.clone()));
        }
        return new C4991(arrayList, i, i2, c9017);
    }

    public final long length() {
        return this.f17373;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m13824() {
        if (this.f17372) {
            throw new IllegalStateException("Legacy app state source is closed");
        }
        return new C4285(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13820(InputStream inputStream, long j, C10428 c10428, InterfaceC2168 interfaceC2168) throws Throwable {
        try {
            C9017 c9017M26333 = c10428.m26333(16384L);
            try {
                if (j >= 16) {
                    try {
                        if (j <= 2147483647L) {
                            try {
                                C13459 c13459 = new C13459(j, inputStream);
                                if (c13459.m32944() != 1295139155) {
                                    throw new IOException("Unsupported legacy app state");
                                }
                                int iM32944 = c13459.m32944();
                                int i = 1;
                                if (iM32944 != 1 && iM32944 != 2) {
                                    throw new IOException("Unsupported legacy app state");
                                }
                                int iM32945 = c13459.m32944();
                                int iM32946 = iM32944 == 2 ? c13459.m32944() : -1;
                                int iM32947 = c13459.m32944();
                                if (iM32945 >= 0) {
                                    int i2 = 3;
                                    if (iM32947 >= 3 && iM32947 <= 259 && ((long) iM32947) * 12 <= c13459.f44520) {
                                        if (iM32944 == 2 && (iM32946 < 0 || ((long) iM32945) + ((long) iM32946) > 2147483647L)) {
                                            throw new IOException("Invalid legacy app page range");
                                        }
                                        interfaceC2168.mo6754(iM32945, iM32946);
                                        boolean[] zArr = new boolean[262];
                                        byte[] bArr = new byte[8192];
                                        int i3 = 0;
                                        while (i3 < iM32947) {
                                            int iM32948 = c13459.m32944();
                                            int i4 = i3;
                                            long j2 = c13459.m32945(8).readLong();
                                            if (iM32948 < i || iM32948 > 261 || iM32948 == i2 || iM32948 == 255 || zArr[iM32948] || j2 < 0 || j2 > c13459.f44520) {
                                                throw new IOException("Invalid legacy app state field");
                                            }
                                            zArr[iM32948] = true;
                                            C13459 c134510 = new C13459(j2, c13459);
                                            try {
                                                interfaceC2168.mo6755(iM32948, j2, c134510);
                                                c134510.f44521 = false;
                                                for (long j3 = c134510.f44520; j3 != 0; j3 -= (long) c13459.read(bArr, 0, (int) Math.min(j3, 8192))) {
                                                }
                                                i3 = i4 + 1;
                                                i = 1;
                                                i2 = 3;
                                            } catch (Throwable th) {
                                                c134510.f44521 = false;
                                                throw th;
                                            }
                                        }
                                        if (!zArr[256] || !zArr[257] || !zArr[258] || c13459.f44520 != 0 || inputStream.read() != -1) {
                                            throw new IOException("Incomplete or trailing legacy app state fields");
                                        }
                                        c9017M26333.close();
                                        inputStream.close();
                                        return;
                                    }
                                }
                                throw new IOException("Invalid legacy app state header");
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            Throwable th3 = th;
                            try {
                                c9017M26333.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        Throwable th6 = th;
                        try {
                            inputStream.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                }
                throw new IOException("Invalid legacy app state length");
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f17372) {
            return;
        }
        this.f17372 = true;
        this.f17371.close();
    }
}
