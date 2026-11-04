package l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۘۛ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: RAHU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3965 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18881 f13551;

    public C3965(AbstractC18881 abstractC18881) {
        this.f13551 = abstractC18881;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12710(String str, AbstractC22044 abstractC22044, InterfaceC23711 interfaceC23711) throws IOException {
        InterfaceC2386 interfaceC2386Mo20831 = this.f13551.mo20831(str);
        if (interfaceC2386Mo20831 == null) {
            throw new FileNotFoundException(str);
        }
        m12711(interfaceC2386Mo20831, abstractC22044, true, interfaceC23711);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12711(InterfaceC2386 interfaceC2386, AbstractC22044 abstractC22044, boolean z, InterfaceC23711 interfaceC23711) throws IOException {
        String path = interfaceC2386.getPath();
        if (interfaceC2386.isDirectory()) {
            throw new IOException(C14442.m34865("File ", path, " is a directory"));
        }
        long size = interfaceC2386.getSize();
        C21777 c21777 = new C21777(this.f13551, interfaceC23711);
        c21777.m49384(interfaceC2386.getName(), path, abstractC22044, size, interfaceC2386.getTime(), null, null, false, false);
        final AtomicReference atomicReference = new AtomicReference();
        c21777.m49385(new InterfaceC14162() { // from class: l.᩺ۛ۫
            @Override // l.InterfaceC14162
            /* JADX INFO: renamed from: ۙ */
            public final void mo34399(C15063 c15063, boolean z2) {
                Exception exc;
                AtomicReference atomicReference2;
                if (z2 || (exc = (Exception) c15063.f49180.get()) == null) {
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
            c21777.m49387();
            Exception exc = (Exception) atomicReference.get();
            if (exc != null) {
                if (!(exc instanceof IOException)) {
                    throw new IOException(exc);
                }
                IOException iOException = (IOException) exc;
                C22327.m50389(iOException);
                throw iOException;
            }
            if (interfaceC23711.mo924()) {
                abstractC22044.mo4287();
            } else if (!z && abstractC22044.mo2945() && C21576.m49078()) {
                abstractC22044.mo2942(interfaceC2386.getTime());
            }
        } catch (Exception e) {
            if (!(e instanceof IOException)) {
                throw new IOException(e);
            }
            throw ((IOException) e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12712(AbstractC7629 abstractC7629, String str, String str2, boolean z, InterfaceC23711 interfaceC23711) throws IOException {
        String str3;
        InterfaceC2386 interfaceC2386Mo20831 = this.f13551.mo20831(str2);
        InterfaceC2386 interfaceC2386M20843 = abstractC7629.m20843(str);
        if (interfaceC2386Mo20831 != null) {
            C13352 c13352 = (C13352) interfaceC2386Mo20831;
            if (c13352.isDirectory()) {
                throw new IOException(C14442.m34865("File ", str2, " is a directory"));
            }
            String strM28556 = C11293.m28556(str2);
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
            if (strM28556 != null) {
                string = C14483.m34972(strM28556, string);
            }
            synchronized (this) {
                if (interfaceC23711.mo924()) {
                    return;
                }
                final InputStream inputStreamMo20829 = abstractC7629.mo20829((AbstractActivityC17204) null, interfaceC2386M20843);
                if (inputStreamMo20829 == null) {
                    if (interfaceC23711 instanceof InterfaceC18696) {
                        ((InterfaceC18696) interfaceC23711).cancel();
                    }
                    return;
                }
                if (abstractC7629 instanceof AbstractC18881) {
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    final AtomicReference atomicReference = new AtomicReference();
                    final C0387 c0387 = new C0387(5242880L);
                    C5261.f18540.submit(new Runnable() { // from class: l.ۛۛ۫
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3965.m12706(inputStreamMo20829, c0387, atomicBoolean, atomicReference);
                        }
                    });
                    try {
                        InputStream inputStreamMo4183 = C14556.m35108(c0387.m2194()).mo4183();
                        try {
                            m12705(inputStreamMo4183, this.f13551.mo35584(((C13352) interfaceC2386M20843).getSize(), string), interfaceC2386M20843, interfaceC23711);
                            inputStreamMo4183.close();
                            atomicBoolean.set(true);
                            IOException iOException = (IOException) atomicReference.get();
                            if (iOException != null) {
                                C22327.m50389(iOException);
                                throw iOException;
                            }
                        } catch (Throwable th) {
                            try {
                                inputStreamMo4183.close();
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
                        m12705(inputStreamMo20829, this.f13551.mo35584(((C13352) interfaceC2386M20843).getSize(), string), interfaceC2386M20843, interfaceC23711);
                        inputStreamMo20829.close();
                    } catch (Throwable th4) {
                        try {
                            inputStreamMo20829.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                }
                if (interfaceC23711.mo924()) {
                    this.f13551.m43791(string, false);
                } else {
                    if (!z || c13352.getSize() <= 0) {
                        m12708(this.f13551, str2);
                    } else {
                        String strConcat = str2.concat(".bak");
                        InterfaceC2386 interfaceC2386Mo20832 = this.f13551.mo20831(strConcat);
                        if (interfaceC2386Mo20832 == null) {
                            m12709(this.f13551, str2, strConcat);
                        } else if (((C13352) interfaceC2386Mo20832).isDirectory()) {
                            m12708(this.f13551, str2);
                        } else {
                            m12708(this.f13551, strConcat);
                            m12709(this.f13551, str2, strConcat);
                        }
                    }
                    this.f13551.mo35571(string, str2);
                    if (interfaceC23711.mo924()) {
                        return;
                    }
                    if (interfaceC2386Mo20831.mo5155() != null) {
                        AbstractC18881 abstractC18881 = this.f13551;
                        int iM24243 = interfaceC2386Mo20831.mo5155().m24243();
                        if (abstractC18881.mo35583()) {
                            try {
                                abstractC18881.mo43669(iM24243, str2);
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
            }
        } else {
            synchronized (this) {
                if (interfaceC23711.mo924()) {
                    return;
                }
                InputStream inputStreamMo208210 = abstractC7629.mo20829((AbstractActivityC17204) null, interfaceC2386M20843);
                if (inputStreamMo208210 == null) {
                    if (interfaceC23711 instanceof InterfaceC18696) {
                        ((InterfaceC18696) interfaceC23711).cancel();
                    }
                    return;
                }
                try {
                    m12705(inputStreamMo208210, this.f13551.mo35584(((C13352) interfaceC2386M20843).getSize(), str2), interfaceC2386M20843, interfaceC23711);
                    inputStreamMo208210.close();
                    if (interfaceC23711.mo924()) {
                        this.f13551.m43791(str2, false);
                    }
                } catch (Throwable th6) {
                    try {
                        inputStreamMo208210.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            }
        }
        if (!interfaceC23711.mo924() && C21576.m49078() && this.f13551.mo35574()) {
            try {
                this.f13551.mo43668(((C13352) interfaceC2386M20843).getTime(), str2);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12706(InputStream inputStream, C0387 c0387, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        try {
            try {
                m12707(inputStream, c0387.m2193(), atomicBoolean);
                C20244.m46520(c0387.m2193());
            } catch (Throwable th) {
                C20244.m46520(c0387.m2193());
                throw th;
            }
        } catch (IOException e) {
            atomicReference.set(e);
            C20244.m46520(c0387.m2193());
        } catch (Throwable th2) {
            atomicReference.set(new IOException(th2));
            C20244.m46520(c0387.m2193());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12705(InputStream inputStream, OutputStream outputStream, InterfaceC2386 interfaceC2386, InterfaceC23711 interfaceC23711) throws Throwable {
        Throwable th;
        Throwable e;
        Throwable th2 = null;
        try {
            C21298.m48534(inputStream, outputStream, interfaceC2386.getSize(), interfaceC23711);
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
    public static void m12707(InputStream inputStream, InterfaceC7099 interfaceC7099, AtomicBoolean atomicBoolean) throws IOException {
        InterfaceC25000 interfaceC25000M35108 = C14556.m35108(C14556.m35107(inputStream));
        try {
            InterfaceC11573 interfaceC11573M35106 = C14556.m35106(interfaceC7099);
            while (!interfaceC25000M35108.mo4182() && !atomicBoolean.get() && interfaceC25000M35108.mo4186(interfaceC11573M35106.mo29106(), 8192L) != -1) {
                try {
                    interfaceC11573M35106.flush();
                } catch (Throwable th) {
                    try {
                        interfaceC11573M35106.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            interfaceC11573M35106.close();
            interfaceC25000M35108.close();
        } catch (Throwable th3) {
            try {
                interfaceC25000M35108.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12708(AbstractC18881 abstractC18881, String str) throws IOException {
        try {
            abstractC18881.mo35575(str, false);
        } catch (IOException e) {
            try {
                String strM28556 = C11293.m28556(str);
                if (strM28556 != null) {
                    abstractC18881.mo35576(strM28556);
                }
                if (abstractC18881.mo35586(str)) {
                    throw e;
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12709(AbstractC18881 abstractC18881, String str, String str2) throws IOException {
        try {
            abstractC18881.mo35571(str, str2);
        } catch (IOException e) {
            try {
                String strM28556 = C11293.m28556(str);
                if (strM28556 != null) {
                    abstractC18881.mo35576(strM28556);
                }
                if (abstractC18881.mo35586(str)) {
                    throw e;
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }
}
