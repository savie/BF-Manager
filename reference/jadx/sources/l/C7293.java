package l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: RAHU */
/* JADX INFO: loaded from: classes3.dex */
public final class C7293 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12233 f24222;

    public C7293(AbstractC12233 abstractC12233) {
        this.f24222 = abstractC12233;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19442(String str, AbstractC20745 abstractC20745, InterfaceC8978 interfaceC8978) throws IOException {
        InterfaceC2557 interfaceC2557Mo10264 = this.f24222.mo10264(str);
        if (interfaceC2557Mo10264 == null) {
            throw new FileNotFoundException(str);
        }
        m19443(interfaceC2557Mo10264, abstractC20745, true, interfaceC8978);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19443(InterfaceC2557 interfaceC2557, AbstractC20745 abstractC20745, boolean z, InterfaceC8978 interfaceC8978) throws IOException {
        String path = interfaceC2557.getPath();
        if (interfaceC2557.isDirectory()) {
            throw new IOException(C16523.m38890("File ", path, " is a directory"));
        }
        long size = interfaceC2557.getSize();
        C3599 c3599 = new C3599(this.f24222, interfaceC8978);
        c3599.m10681(interfaceC2557.getName(), path, abstractC20745, size, interfaceC2557.getTime(), null, null, false, false);
        final AtomicReference atomicReference = new AtomicReference();
        c3599.m10682(new InterfaceC0777() { // from class: l.ۤۜ֨
            @Override // l.InterfaceC0777
            /* JADX INFO: renamed from: ۙ */
            public final void mo3329(C21239 c21239, boolean z2) {
                Exception exc;
                AtomicReference atomicReference2;
                if (z2 || (exc = (Exception) c21239.f69172.get()) == null) {
                    return;
                }
                do {
                    atomicReference2 = atomicReference;
                    if (atomicReference2.compareAndSet(null, exc)) {
                        return;
                    }
                } while (atomicReference2.get() == null);
            }
        });
        try {
            c3599.m10684();
            Exception exc = (Exception) atomicReference.get();
            if (exc != null) {
                if (!(exc instanceof IOException)) {
                    throw new IOException(exc);
                }
                throw ((IOException) exc);
            }
            if (interfaceC8978.mo2357()) {
                abstractC20745.mo24644();
            } else if (!z && abstractC20745.mo8448() && C16737.m39280()) {
                abstractC20745.mo32855(interfaceC2557.getTime());
            }
        } catch (Exception e) {
            if (!(e instanceof IOException)) {
                throw new IOException(e);
            }
            throw ((IOException) e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19444(AbstractC9677 abstractC9677, String str, String str2, boolean z, InterfaceC8978 interfaceC8978) throws IOException {
        String str3;
        InterfaceC2557 interfaceC2557Mo10264 = this.f24222.mo10264(str2);
        InterfaceC2557 interfaceC2557M24620 = abstractC9677.m24620(str);
        if (interfaceC2557Mo10264 != null) {
            C15404 c15404 = (C15404) interfaceC2557Mo10264;
            if (c15404.isDirectory()) {
                throw new IOException(C16523.m38890("File ", str2, " is a directory"));
            }
            String strM18172 = C6730.m18172(str2);
            StringBuilder sb = new StringBuilder();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis == 0) {
                str3 = "0";
            } else if (jCurrentTimeMillis > 0) {
                str3 = Long.toString(jCurrentTimeMillis, 16);
            } else {
                int i = 64;
                char[] cArr = new char[64];
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(16);
                do {
                    i--;
                    cArr[i] = Character.forDigit(((int) jCurrentTimeMillis) & 15, 16);
                    jCurrentTimeMillis >>>= iNumberOfTrailingZeros;
                } while (jCurrentTimeMillis != 0);
                str3 = new String(cArr, i, 64 - i);
            }
            sb.append(str3);
            sb.append(Long.toString(((long) str2.hashCode()) & 4294967295L, 16));
            sb.append(".tmp");
            String string = sb.toString();
            if (strM18172 != null) {
                string = C15489.m37076(strM18172, string);
            }
            synchronized (this) {
                if (interfaceC8978.mo2357()) {
                    return;
                }
                final InputStream inputStreamMo15073 = abstractC9677.mo15073((AbstractActivityC12483) null, interfaceC2557M24620);
                if (inputStreamMo15073 == null) {
                    if (interfaceC8978 instanceof InterfaceC22548) {
                        ((InterfaceC22548) interfaceC8978).cancel();
                    }
                    return;
                }
                if (abstractC9677 instanceof AbstractC12233) {
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    final AtomicReference atomicReference = new AtomicReference();
                    final C6479 c6479 = new C6479(5242880L);
                    C4716.f16636.submit(new Runnable() { // from class: l.ۡۜ֨
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7293.m19438(inputStreamMo15073, c6479, atomicBoolean, atomicReference);
                        }
                    });
                    try {
                        InputStream inputStreamMo16433 = C0834.m3437(c6479.m17674()).mo16433();
                        try {
                            m19437(inputStreamMo16433, this.f24222.mo10273(((C15404) interfaceC2557M24620).getSize(), string), interfaceC2557M24620, interfaceC8978);
                            inputStreamMo16433.close();
                            atomicBoolean.set(true);
                            IOException iOException = (IOException) atomicReference.get();
                            if (iOException != null) {
                                throw iOException;
                            }
                        } catch (Throwable th) {
                            try {
                                inputStreamMo16433.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        atomicBoolean.set(true);
                        throw th3;
                    }
                } else {
                    try {
                        m19437(inputStreamMo15073, this.f24222.mo10273(((C15404) interfaceC2557M24620).getSize(), string), interfaceC2557M24620, interfaceC8978);
                        inputStreamMo15073.close();
                    } catch (Throwable th4) {
                        try {
                            inputStreamMo15073.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                }
                if (interfaceC8978.mo2357()) {
                    this.f24222.m30348(string, false);
                } else {
                    if (!z || c15404.getSize() <= 0) {
                        m19440(this.f24222, str2);
                    } else {
                        String strConcat = str2.concat(".bak");
                        InterfaceC2557 interfaceC2557Mo10265 = this.f24222.mo10264(strConcat);
                        if (interfaceC2557Mo10265 == null) {
                            m19441(this.f24222, str2, strConcat);
                        } else if (((C15404) interfaceC2557Mo10265).isDirectory()) {
                            m19440(this.f24222, str2);
                        } else {
                            m19440(this.f24222, strConcat);
                            m19441(this.f24222, str2, strConcat);
                        }
                    }
                    this.f24222.mo10265(string, str2);
                    if (interfaceC8978.mo2357()) {
                        return;
                    }
                    if (interfaceC2557Mo10264.mo7971() != null) {
                        AbstractC12233 abstractC12233 = this.f24222;
                        int iM29318 = interfaceC2557Mo10264.mo7971().m29318();
                        if (abstractC12233.mo10277()) {
                            try {
                                abstractC12233.mo30346(iM29318, str2);
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
            }
        } else {
            synchronized (this) {
                if (interfaceC8978.mo2357()) {
                    return;
                }
                InputStream inputStreamMo15074 = abstractC9677.mo15073((AbstractActivityC12483) null, interfaceC2557M24620);
                if (inputStreamMo15074 == null) {
                    if (interfaceC8978 instanceof InterfaceC22548) {
                        ((InterfaceC22548) interfaceC8978).cancel();
                    }
                    return;
                }
                try {
                    m19437(inputStreamMo15074, this.f24222.mo10273(((C15404) interfaceC2557M24620).getSize(), str2), interfaceC2557M24620, interfaceC8978);
                    inputStreamMo15074.close();
                    if (interfaceC8978.mo2357()) {
                        this.f24222.m30348(str2, false);
                    }
                } catch (Throwable th6) {
                    try {
                        inputStreamMo15074.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            }
        }
        if (!interfaceC8978.mo2357() && C16737.m39280() && this.f24222.mo10271()) {
            try {
                this.f24222.mo30344(((C15404) interfaceC2557M24620).getTime(), str2);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19438(InputStream inputStream, C6479 c6479, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        try {
            try {
                m19439(inputStream, c6479.m17673(), atomicBoolean);
                C19431.m44468(c6479.m17673());
            } catch (Throwable th) {
                C19431.m44468(c6479.m17673());
                throw th;
            }
        } catch (IOException e) {
            atomicReference.set(e);
            C19431.m44468(c6479.m17673());
        } catch (Throwable th2) {
            atomicReference.set(new IOException(th2));
            C19431.m44468(c6479.m17673());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19437(InputStream inputStream, OutputStream outputStream, InterfaceC2557 interfaceC2557, InterfaceC8978 interfaceC8978) throws Throwable {
        Throwable th;
        Throwable e;
        Throwable th2 = null;
        try {
            C22487.m49992(inputStream, outputStream, interfaceC2557.getSize(), interfaceC8978);
            try {
                outputStream.close();
            } catch (IOException | Error | RuntimeException e2) {
                th2 = e2;
            }
            if (th2 != null) {
                if (th2 instanceof IOException) {
                    throw ((IOException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            }
        } catch (IOException e3) {
            e = e3;
            try {
                throw e;
            } catch (Throwable th3) {
                th = th3;
                try {
                    outputStream.close();
                } catch (IOException | Error | RuntimeException e4) {
                    th2 = e4;
                    if (e != null) {
                        e.addSuppressed(th2);
                    }
                }
                if (e != null || th2 == null) {
                    throw th;
                }
                if (th2 instanceof IOException) {
                    throw ((IOException) th2);
                }
                if (!(th2 instanceof RuntimeException)) {
                    throw ((Error) th2);
                }
                throw ((RuntimeException) th2);
            }
        } catch (Error e5) {
            e = e5;
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            throw e;
        } catch (Throwable th4) {
            th = th4;
            e = null;
            outputStream.close();
            if (e != null) {
                throw th;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19439(InputStream inputStream, InterfaceC8597 interfaceC8597, AtomicBoolean atomicBoolean) throws IOException {
        InterfaceC23683 interfaceC23683M3437 = C0834.m3437(C0834.m3435(inputStream));
        try {
            InterfaceC10983 interfaceC10983M3436 = C0834.m3436(interfaceC8597);
            while (!interfaceC23683M3437.mo16415() && !atomicBoolean.get() && interfaceC23683M3437.mo2293(interfaceC10983M3436.mo16399(), 8192L) != -1) {
                try {
                    interfaceC10983M3436.flush();
                } catch (Throwable th) {
                    try {
                        interfaceC10983M3436.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            interfaceC10983M3436.close();
            interfaceC23683M3437.close();
        } catch (Throwable th3) {
            try {
                interfaceC23683M3437.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19440(AbstractC12233 abstractC12233, String str) throws IOException {
        try {
            abstractC12233.mo10270(str, false);
        } catch (IOException e) {
            try {
                String strM18172 = C6730.m18172(str);
                if (strM18172 != null) {
                    abstractC12233.mo10269(strM18172);
                }
                if (abstractC12233.mo10261(str)) {
                    throw e;
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19441(AbstractC12233 abstractC12233, String str, String str2) throws IOException {
        try {
            abstractC12233.mo10265(str, str2);
        } catch (IOException e) {
            try {
                String strM18172 = C6730.m18172(str);
                if (strM18172 != null) {
                    abstractC12233.mo10269(strM18172);
                }
                if (abstractC12233.mo10261(str)) {
                    throw e;
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }
}
