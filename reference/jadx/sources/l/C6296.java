package l;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 08FX */
/* JADX INFO: loaded from: classes2.dex */
public final class C6296 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17379(C7226 c7226, C10049 c10049, AbstractC20745 abstractC20745, InterfaceC17585 interfaceC17585) throws Throwable {
        m17378(c7226, c10049, abstractC20745, false, interfaceC17585);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17380(C10755 c10755, C10049 c10049, AbstractC20745 abstractC20745, InterfaceC17585 interfaceC17585) throws Throwable {
        m17378(c10755, c10049, abstractC20745, true, interfaceC17585);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17378(Closeable closeable, C10049 c10049, AbstractC20745 abstractC20745, boolean z, InterfaceC17585 interfaceC17585) throws Throwable {
        AutoCloseable autoCloseable;
        InputStream inputStreamM27057;
        AutoCloseable autoCloseable2 = null;
        try {
            if (closeable instanceof C10755) {
                inputStreamM27057 = ((C10755) closeable).m27057(c10049);
            } else {
                if (!(closeable instanceof C7226)) {
                    throw new AssertionError(closeable.getClass());
                }
                inputStreamM27057 = (C7226) closeable;
            }
            try {
                OutputStream outputStreamMo33976 = abstractC20745.mo33976(false);
                try {
                    byte[] bArr = new byte[4096];
                    long jM25417 = c10049.m25417();
                    long j = 0;
                    do {
                        int i = inputStreamM27057.read(bArr);
                        if (i > 0) {
                            outputStreamMo33976.write(bArr, 0, i);
                            j += (long) i;
                            if (jM25417 > 0) {
                                interfaceC17585.mo3897(j, jM25417);
                            }
                        } else {
                            outputStreamMo33976.close();
                            if (!z && C16737.m39280()) {
                                abstractC20745.mo32855(c10049.m25429().getTime());
                            }
                            if (inputStreamM27057 != closeable) {
                                C19431.m44468(inputStreamM27057);
                                return;
                            }
                            return;
                        }
                    } while (!interfaceC17585.mo2357());
                    C19431.m44468(outputStreamMo33976);
                    abstractC20745.mo24647();
                    if (inputStreamM27057 != closeable) {
                        C19431.m44468(inputStreamM27057);
                    }
                } catch (Throwable th) {
                    th = th;
                    autoCloseable2 = outputStreamMo33976;
                    InputStream inputStream = inputStreamM27057;
                    autoCloseable = autoCloseable2;
                    autoCloseable2 = inputStream;
                    if (autoCloseable2 != closeable) {
                        C19431.m44468(autoCloseable2);
                    }
                    C19431.m44468(autoCloseable);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            autoCloseable = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m17374(BufferedInputStream bufferedInputStream) {
        return m17376(bufferedInputStream, new C10176(bufferedInputStream), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m17375(BufferedInputStream bufferedInputStream, InterfaceC4968 interfaceC4968) {
        return m17376(bufferedInputStream, interfaceC4968, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m17377(BufferedInputStream bufferedInputStream, C10176 c10176) {
        return m17376(bufferedInputStream, c10176, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m17376(BufferedInputStream bufferedInputStream, InterfaceC4968 interfaceC4968, boolean z) throws IOException {
        if (!bufferedInputStream.markSupported()) {
            throw new IllegalArgumentException();
        }
        byte[] bArrM36612 = EnumC15300.m36612();
        bufferedInputStream.mark(bArrM36612.length);
        int iM45293 = C20010.m45293(bufferedInputStream, bArrM36612, bArrM36612.length);
        bufferedInputStream.reset();
        InputStream inputStream = null;
        try {
            for (EnumC15300 enumC15300 : EnumC15300.values()) {
                if (enumC15300.m36616(bArrM36612, iM45293)) {
                    InputStream inputStream2 = (InputStream) interfaceC4968.get();
                    try {
                        return z ? enumC15300.m36617(inputStream2) : enumC15300.m36614(inputStream2);
                    } catch (IOException e) {
                        e = e;
                        inputStream = inputStream2;
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw e;
            }
            return null;
        } catch (IOException e2) {
            e = e2;
        }
    }
}
