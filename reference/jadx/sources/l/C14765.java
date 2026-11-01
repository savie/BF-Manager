package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܳ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14765 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C23937 f48284;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f48285;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19455 f48286;

    public C14765(C19455 c19455, C23937 c23937, int i) {
        this.f48286 = c19455;
        this.f48284 = c23937;
        this.f48285 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14765 m35385(C1254 c1254, InterfaceC4076 interfaceC4076, C10428 c10428, int i, InterfaceC5614 interfaceC5614) throws Throwable {
        C6297 c6297M35383 = m35383(interfaceC4076, c10428, i, interfaceC5614);
        try {
            try {
                C19455 c19455M44509 = C19455.m44509(c1254, c6297M35383.f21317, C22037.m48953(c6297M35383.f21316));
                try {
                    m35386(interfaceC5614);
                    return new C14765(c19455M44509, c6297M35383.f21317, c6297M35383.f21316);
                } catch (Error e) {
                    e = e;
                    c19455M44509.m44522();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    c19455M44509.m44522();
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    c6297M35383.f21317.close();
                } catch (IOException e4) {
                    e.addSuppressed(e4);
                }
                throw e;
            }
        } catch (Error e5) {
            e = e5;
            c6297M35383.f21317.close();
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            c6297M35383.f21317.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17586 m35387(InterfaceC4076 interfaceC4076, C10428 c10428, int i, InterfaceC5614 interfaceC5614) throws Throwable {
        C6297 c6297M35383 = m35383(interfaceC4076, c10428, i, interfaceC5614);
        try {
            return new C17586(new C7584(c6297M35383.f21317.mo6416(), C22037.m48953(c6297M35383.f21316), c10428), c6297M35383.f21316);
        } catch (IOException | Error | RuntimeException e) {
            try {
                c6297M35383.f21317.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6297 m35383(InterfaceC4076 interfaceC4076, C10428 c10428, int i, InterfaceC5614 interfaceC5614) throws Throwable {
        if (interfaceC5614 instanceof C4513) {
            interfaceC4076 = new C2000(interfaceC4076, interfaceC5614);
        }
        m35386(interfaceC5614);
        C13250 c13250Identity = interfaceC4076.identity();
        C9017 c9017M26333 = c10428.m26333(33024L);
        InputStream inputStream = null;
        inputStream = null;
        C9017 c9017 = null;
        inputStream = null;
        inputStream = null;
        try {
            try {
                byte[] bArr = new byte[32768];
                m35386(interfaceC5614);
                InputStream inputStreamMo6416 = interfaceC4076.mo6416();
                int i2 = 0;
                while (i2 < 32768) {
                    try {
                        m35386(interfaceC5614);
                        int iMin = Math.min(1024, 32768 - i2);
                        int i3 = inputStreamMo6416.read(bArr, i2, iMin);
                        if (i3 == -1) {
                            break;
                        }
                        if (i3 <= 0 || i3 > iMin) {
                            throw new IOException("Text input made invalid progress");
                        }
                        i2 += i3;
                    } catch (IOException | Error | RuntimeException e) {
                        inputStream = inputStreamMo6416;
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
                m35386(interfaceC5614);
                if (i2 == 0) {
                    i = C22037.f71424;
                } else if (i == -1) {
                    String strM29552 = C11859.m29552(i2, bArr);
                    i = strM29552 == null ? -1 : C22037.m48951(strM29552);
                    if (i == -1) {
                        i = C22037.m48954(i2, bArr);
                    }
                }
                try {
                    return new C6297(new C23937(c13250Identity, new C11237(inputStreamMo6416, bArr, i2, c9017M26333)), i);
                } catch (IOException e3) {
                    e = e3;
                    c9017M26333 = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw e;
                } catch (Error e4) {
                    e = e4;
                    c9017M26333 = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw e;
                } catch (RuntimeException e5) {
                    e = e5;
                    c9017M26333 = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (c9017 != null) {
                        c9017.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c9017 = c9017M26333;
                if (c9017 != null) {
                    c9017.close();
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
    public static C14765 m35384(C1254 c1254, InterfaceC4076 interfaceC4076, int i) {
        return new C14765(C19455.m44508(c1254, interfaceC4076), null, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35386(InterfaceC5614 interfaceC5614) {
        if (interfaceC5614.mo2357()) {
            throw new CancellationException("Text loading is canceled");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2063 m35390() {
        return new C2063(0, this.f48285, false, 0, null, null, null);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8996 m35391() {
        return this.f48286.m44523();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m35389() {
        return this.f48286.m44518();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C18749 m35388() {
        C19455 c19455 = this.f48286;
        return c19455.m44523().m23296() == 0 ? c19455.m44517() : c19455.m44519(65536);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f48286.m44522();
        C23937 c23937 = this.f48284;
        if (c23937 != null) {
            c23937.close();
        }
    }
}
