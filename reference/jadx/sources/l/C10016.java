package l;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08FX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10016 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25868(C14161 c14161, C7450 c7450, AbstractC22044 abstractC22044, InterfaceC18967 interfaceC18967) throws Throwable {
        m25866(c14161, c7450, abstractC22044, false, interfaceC18967);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25867(C5368 c5368, C7450 c7450, AbstractC22044 abstractC22044, InterfaceC18967 interfaceC18967) throws Throwable {
        m25866(c5368, c7450, abstractC22044, true, interfaceC18967);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25866(Closeable closeable, C7450 c7450, AbstractC22044 abstractC22044, boolean z, InterfaceC18967 interfaceC18967) throws Throwable {
        AutoCloseable autoCloseable;
        InputStream inputStreamM16032;
        AutoCloseable autoCloseable2 = null;
        try {
            if (closeable instanceof C5368) {
                inputStreamM16032 = ((C5368) closeable).m16032(c7450);
            } else {
                if (!(closeable instanceof C14161)) {
                    throw new AssertionError(closeable.getClass());
                }
                inputStreamM16032 = (C14161) closeable;
            }
            try {
                OutputStream outputStreamMo4289 = abstractC22044.mo4289(false);
                try {
                    byte[] bArr = new byte[4096];
                    long jM20449 = c7450.m20449();
                    long j = 0;
                    do {
                        int i = inputStreamM16032.read(bArr);
                        if (i > 0) {
                            outputStreamMo4289.write(bArr, 0, i);
                            j += (long) i;
                            if (jM20449 > 0) {
                                interfaceC18967.mo36403(j, jM20449);
                            }
                        } else {
                            outputStreamMo4289.close();
                            if (!z && C21576.m49078()) {
                                abstractC22044.mo2942(c7450.m20445().getTime());
                            }
                            if (inputStreamM16032 != closeable) {
                                C20244.m46520(inputStreamM16032);
                                return;
                            }
                            return;
                        }
                    } while (!interfaceC18967.mo924());
                    C20244.m46520(outputStreamMo4289);
                    abstractC22044.mo4296();
                    if (inputStreamM16032 != closeable) {
                        C20244.m46520(inputStreamM16032);
                    }
                } catch (Throwable th) {
                    th = th;
                    autoCloseable2 = outputStreamMo4289;
                    InputStream inputStream = inputStreamM16032;
                    autoCloseable = autoCloseable2;
                    autoCloseable2 = inputStream;
                    if (autoCloseable2 != closeable) {
                        C20244.m46520(autoCloseable2);
                    }
                    C20244.m46520(autoCloseable);
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
    public static InputStream m25862(BufferedInputStream bufferedInputStream) {
        return m25865(bufferedInputStream, new C17214(bufferedInputStream), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m25864(BufferedInputStream bufferedInputStream, InterfaceC21941 interfaceC21941) {
        return m25865(bufferedInputStream, interfaceC21941, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m25863(BufferedInputStream bufferedInputStream, C17214 c17214) {
        return m25865(bufferedInputStream, c17214, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m25865(BufferedInputStream bufferedInputStream, InterfaceC21941 interfaceC21941, boolean z) throws IOException {
        if (!bufferedInputStream.markSupported()) {
            throw new IllegalArgumentException();
        }
        byte[] bArrM55973 = EnumC25110.m55973();
        bufferedInputStream.mark(bArrM55973.length);
        int iM15487 = C5125.m15487(bufferedInputStream, bArrM55973, 0, bArrM55973.length);
        bufferedInputStream.reset();
        InputStream inputStream = null;
        try {
            for (EnumC25110 enumC25110 : EnumC25110.values()) {
                if (enumC25110.m55977(bArrM55973, iM15487)) {
                    InputStream inputStream2 = (InputStream) interfaceC21941.get();
                    try {
                        return z ? enumC25110.m55978(inputStream2) : enumC25110.m55975(inputStream2);
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
