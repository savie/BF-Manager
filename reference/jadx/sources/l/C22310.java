package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩷᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes.dex */
public final class C22310 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f72225;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5156 f72226;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C14784 f72227;

    public C22310(C14784 c14784, C5156 c5156, int i) {
        this.f72227 = c14784;
        this.f72226 = c5156;
        this.f72225 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22310 m50364(C17505 c17505, InterfaceC23473 interfaceC23473, C0352 c0352, int i, InterfaceC7509 interfaceC7509) throws Throwable {
        C7195 c7195M50362 = m50362(interfaceC23473, c0352, i, interfaceC7509);
        try {
            try {
                C14784 c14784M35613 = C14784.m35613(c17505, c7195M50362.f23749, C2448.m8272(c7195M50362.f23748));
                try {
                    m50365(interfaceC7509);
                    return new C22310(c14784M35613, c7195M50362.f23749, c7195M50362.f23748);
                } catch (Error e) {
                    e = e;
                    c14784M35613.m35628();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    c14784M35613.m35628();
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    c7195M50362.f23749.close();
                } catch (IOException e4) {
                    e.addSuppressed(e4);
                }
                throw e;
            }
        } catch (Error e5) {
            e = e5;
            c7195M50362.f23749.close();
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            c7195M50362.f23749.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C8686 m50366(InterfaceC23473 interfaceC23473, C0352 c0352, int i, InterfaceC7509 interfaceC7509) throws Throwable {
        C7195 c7195M50362 = m50362(interfaceC23473, c0352, i, interfaceC7509);
        try {
            return new C8686(new C0287(c7195M50362.f23749.mo5931(), C2448.m8272(c7195M50362.f23748), c0352), c7195M50362.f23748);
        } catch (IOException | Error | RuntimeException e) {
            try {
                c7195M50362.f23749.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7195 m50362(InterfaceC23473 interfaceC23473, C0352 c0352, int i, InterfaceC7509 interfaceC7509) throws Throwable {
        if (interfaceC7509 instanceof C16563) {
            interfaceC23473 = new C1648(interfaceC23473, interfaceC7509);
        }
        m50365(interfaceC7509);
        C16013 c16013Identity = interfaceC23473.identity();
        C18251 c18251M2112 = c0352.m2112(33024L);
        InputStream inputStream = null;
        inputStream = null;
        C18251 c18251 = null;
        inputStream = null;
        inputStream = null;
        try {
            try {
                byte[] bArr = new byte[32768];
                m50365(interfaceC7509);
                InputStream inputStreamMo5931 = interfaceC23473.mo5931();
                int i2 = 0;
                while (i2 < 32768) {
                    try {
                        m50365(interfaceC7509);
                        int iMin = Math.min(1024, 32768 - i2);
                        int i3 = inputStreamMo5931.read(bArr, i2, iMin);
                        if (i3 == -1) {
                            break;
                        }
                        if (i3 <= 0 || i3 > iMin) {
                            throw new IOException("Text input made invalid progress");
                        }
                        i2 += i3;
                    } catch (IOException | Error | RuntimeException e) {
                        inputStream = inputStreamMo5931;
                        e = e;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                e.addSuppressed(e2);
                            }
                        }
                        throw e;
                    }
                }
                m50365(interfaceC7509);
                if (i2 == 0) {
                    i = C2448.f7850;
                } else if (i == -1) {
                    String strM15228 = C5002.m15228(i2, bArr);
                    i = strM15228 == null ? -1 : C2448.m8270(strM15228);
                    if (i == -1) {
                        i = C2448.m8273(i2, bArr);
                    }
                }
                try {
                    return new C7195(new C5156(c16013Identity, new C13906(inputStreamMo5931, bArr, i2, c18251M2112)), i);
                } catch (IOException e3) {
                    e = e3;
                    c18251M2112 = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw e;
                } catch (Error e4) {
                    e = e4;
                    c18251M2112 = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw e;
                } catch (RuntimeException e5) {
                    e = e5;
                    c18251M2112 = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (c18251 != null) {
                        c18251.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c18251 = c18251M2112;
                if (c18251 != null) {
                    c18251.close();
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (Error e7) {
            e = e7;
        } catch (RuntimeException e8) {
            e = e8;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22310 m50363(C17505 c17505, InterfaceC23473 interfaceC23473, int i) {
        return new C22310(C14784.m35612(c17505, interfaceC23473), null, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50365(InterfaceC7509 interfaceC7509) {
        if (interfaceC7509.mo924()) {
            throw new CancellationException("Text loading is canceled");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23056 m50370() {
        return new C23056(0, this.f72225, false, 0, null, null, null);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21170 m50369() {
        return this.f72227.m35624();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m50367() {
        return this.f72227.m35625();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24482 m50368() {
        C14784 c14784 = this.f72227;
        return c14784.m35624().m48290() == 0 ? c14784.m35626() : c14784.m35621(65536);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f72227.m35628();
        C5156 c5156 = this.f72226;
        if (c5156 != null) {
            c5156.close();
        }
    }
}
