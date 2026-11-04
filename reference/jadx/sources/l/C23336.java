package l;

import android.os.ParcelFileDescriptor;
import bin.mt.plus.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.concurrent.Semaphore;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J72H */
/* JADX INFO: loaded from: classes.dex */
public final class C23336 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashSet f75580;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f75581;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 f75582;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C16503 f75583;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f75584;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f75585;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Object f75586;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object f75587;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f75588;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile int f75589;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Semaphore f75590;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f75591;

    public C23336(ActivityC3846 activityC3846, AbstractC7629 abstractC7629, String str, boolean z) {
        this.f75583 = ConcurrentMapC17249.newKeySet();
        this.f75586 = new Object();
        this.f75580 = new HashSet();
        this.f75590 = new Semaphore(2, true);
        this.f75588 = new WeakReference(activityC3846);
        this.f75582 = abstractC7629;
        this.f75587 = abstractC7629 instanceof C17036 ? new Object() : abstractC7629;
        this.f75585 = str;
        this.f75584 = z;
        this.f75581 = null;
    }

    public C23336(ActivityC3846 activityC3846, AbstractC22044 abstractC22044) {
        this.f75583 = ConcurrentMapC17249.newKeySet();
        this.f75586 = new Object();
        this.f75580 = new HashSet();
        this.f75590 = new Semaphore(2, true);
        this.f75588 = new WeakReference(activityC3846);
        this.f75582 = null;
        this.f75587 = new Object();
        this.f75585 = null;
        this.f75584 = true;
        this.f75581 = abstractC22044;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0071  */
    /* JADX WARN: Code duplicated, block: B:64:0x0081  */
    /* JADX WARN: Code duplicated, block: B:77:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x006c: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:53:0x006c */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ParcelFileDescriptor m52487(final C23336 c23336) throws Throwable {
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        final ParcelFileDescriptor parcelFileDescriptor;
        boolean z;
        boolean z2;
        ParcelFileDescriptor parcelFileDescriptor2;
        final int i = c23336.f75589;
        if (c23336.f75591) {
            throw new FileNotFoundException("HTML preview session is closed");
        }
        if (!c23336.f75590.tryAcquire()) {
            throw new FileNotFoundException("Too many open HTML preview streams");
        }
        try {
            try {
                parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                try {
                    parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[1];
                    try {
                        synchronized (c23336.f75586) {
                            if (c23336.f75591 || i != c23336.f75589) {
                                throw new FileNotFoundException("HTML preview session is closed");
                            }
                            c23336.f75583.add(parcelFileDescriptor);
                        }
                        C5261.f18538.submit(new Runnable() { // from class: l.᩻ۚܳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C23336.m52484(this.f80315, parcelFileDescriptor, i);
                            }
                        });
                        try {
                            return parcelFileDescriptorArrCreatePipe[0];
                        } catch (IOException e) {
                            e = e;
                            FileNotFoundException fileNotFoundException = new FileNotFoundException(e.getMessage());
                            fileNotFoundException.initCause(e);
                            throw fileNotFoundException;
                        } catch (RuntimeException e2) {
                            e = e2;
                            FileNotFoundException fileNotFoundException2 = new FileNotFoundException(e.getMessage());
                            fileNotFoundException2.initCause(e);
                            throw fileNotFoundException2;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        FileNotFoundException fileNotFoundException3 = new FileNotFoundException(e.getMessage());
                        fileNotFoundException3.initCause(e);
                        throw fileNotFoundException3;
                    } catch (RuntimeException e4) {
                        e = e4;
                        FileNotFoundException fileNotFoundException4 = new FileNotFoundException(e.getMessage());
                        fileNotFoundException4.initCause(e);
                        throw fileNotFoundException4;
                    } catch (Throwable th) {
                        th = th;
                        z2 = false;
                        if (!z2) {
                            if (parcelFileDescriptor != null) {
                                c23336.f75583.remove(parcelFileDescriptor);
                            }
                            if (parcelFileDescriptor != null) {
                                try {
                                    parcelFileDescriptor.close();
                                } catch (IOException unused) {
                                }
                            }
                            parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe != null ? parcelFileDescriptorArrCreatePipe[0] : null;
                            if (parcelFileDescriptor2 != null) {
                                try {
                                    parcelFileDescriptor2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            c23336.f75590.release();
                        }
                        throw th;
                    }
                } catch (IOException e5) {
                    e = e5;
                    FileNotFoundException fileNotFoundException5 = new FileNotFoundException(e.getMessage());
                    fileNotFoundException5.initCause(e);
                    throw fileNotFoundException5;
                } catch (RuntimeException e6) {
                    e = e6;
                    FileNotFoundException fileNotFoundException6 = new FileNotFoundException(e.getMessage());
                    fileNotFoundException6.initCause(e);
                    throw fileNotFoundException6;
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptor = null;
                }
            } catch (Throwable th3) {
                th = th3;
                z2 = z;
                if (!z2) {
                    if (parcelFileDescriptor != null) {
                        c23336.f75583.remove(parcelFileDescriptor);
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    if (parcelFileDescriptorArrCreatePipe != null) {
                    }
                    if (parcelFileDescriptor2 != null) {
                        parcelFileDescriptor2.close();
                    }
                    c23336.f75590.release();
                }
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            FileNotFoundException fileNotFoundException7 = new FileNotFoundException(e.getMessage());
            fileNotFoundException7.initCause(e);
            throw fileNotFoundException7;
        } catch (RuntimeException e8) {
            e = e8;
            FileNotFoundException fileNotFoundException8 = new FileNotFoundException(e.getMessage());
            fileNotFoundException8.initCause(e);
            throw fileNotFoundException8;
        } catch (Throwable th4) {
            th = th4;
            parcelFileDescriptorArrCreatePipe = null;
            parcelFileDescriptor = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52484(final C23336 c23336, ParcelFileDescriptor parcelFileDescriptor, final int i) {
        final AbstractActivityC17204 abstractActivityC17204;
        try {
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                try {
                    C23226 c23226M52488 = c23336.m52488(i);
                    try {
                        byte[] bArr = new byte[65536];
                        while (!c23336.f75591 && i == c23336.f75589) {
                            try {
                                int i2 = c23226M52488.read(bArr);
                                if (i2 == -1) {
                                    break;
                                } else {
                                    autoCloseOutputStream.write(bArr, 0, i2);
                                }
                            } catch (IOException e) {
                                e = e;
                                if ((c23336.f75582 instanceof AbstractC18881) && (abstractActivityC17204 = (AbstractActivityC17204) c23336.f75588.get()) != null) {
                                    abstractActivityC17204.runOnUiThread(new Runnable() { // from class: l.ܶۚܳ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C23336.m52483(this.f51617, i, abstractActivityC17204);
                                        }
                                    });
                                }
                                throw e;
                            } catch (RuntimeException e2) {
                                e = e2;
                                if (c23336.f75582 instanceof AbstractC18881) {
                                    abstractActivityC17204.runOnUiThread(new Runnable() { // from class: l.ܶۚܳ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C23336.m52483(this.f51617, i, abstractActivityC17204);
                                        }
                                    });
                                }
                                throw e;
                            }
                        }
                        c23226M52488.close();
                        autoCloseOutputStream.close();
                        c23336.f75583.remove(parcelFileDescriptor);
                        c23336.f75590.release();
                    } catch (Throwable th) {
                        try {
                            c23226M52488.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        autoCloseOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException | RuntimeException unused) {
            }
        } catch (Throwable th5) {
            c23336.f75583.remove(parcelFileDescriptor);
            c23336.f75590.release();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52483(C23336 c23336, int i, AbstractActivityC17204 abstractActivityC17204) {
        if (c23336.f75591 || i != c23336.f75589 || abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) {
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C23226 m52488(final int i) throws IOException {
        C23226 c23226;
        if (this.f75582 instanceof AbstractC18881) {
            c23226 = new C23226(new InterfaceC15766() { // from class: l.ܺۚܳ
                @Override // l.InterfaceC15766
                /* JADX INFO: renamed from: ۙ */
                public final InputStream mo25529() {
                    return this.f53749.m52480(i);
                }
            }, new Consumer() { // from class: l.ܽۚܳ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C23336.m52485(this.f56509, (C23226) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            });
        } else {
            c23226 = new C23226(m52480(i), new Consumer() { // from class: l.ܽۚܳ
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C23336.m52485(this.f56509, (C23226) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }
            });
        }
        C23226 c23227 = c23226;
        synchronized (this.f75586) {
            if (!this.f75591 && i == this.f75589) {
                this.f75580.add(c23227);
                return c23227;
            }
            c23227.close();
            throw new IOException("HTML preview request was cancelled");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52485(C23336 c23336, C23226 c23226) {
        synchronized (c23336.f75586) {
            c23336.f75580.remove(c23226);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream m52480(int i) throws IOException {
        InterfaceC2386 interfaceC2386Mo20831;
        InputStream inputStreamMo20829;
        AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) this.f75588.get();
        if (this.f75591 || i != this.f75589 || abstractActivityC17204 == null || abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) {
            throw new IOException("HTML preview owner is unavailable");
        }
        AbstractC22044 abstractC22044 = this.f75581;
        if (abstractC22044 != null) {
            return abstractC22044.mo4290();
        }
        if (this.f75582 == null || this.f75585 == null) {
            throw new IOException("MHTML source is unavailable");
        }
        synchronized (this.f75587) {
            synchronized (this.f75582) {
                if (this.f75591 || i != this.f75589 || abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed()) {
                    throw new IOException("HTML preview owner is unavailable");
                }
                AbstractC7629 abstractC7629 = this.f75582;
                boolean z = abstractC7629 instanceof AbstractC18881;
                if (z) {
                    abstractC7629.mo20837(false);
                }
                interfaceC2386Mo20831 = this.f75582.mo20831(this.f75585);
                if (interfaceC2386Mo20831 != null) {
                    C13352 c13352 = (C13352) interfaceC2386Mo20831;
                    if (c13352.mo8090() && ((!this.f75584 && !z) || !c13352.mo8107())) {
                    }
                }
                throw new IOException("MHTML source is unavailable");
            }
            inputStreamMo20829 = this.f75582.mo20829(abstractActivityC17204, interfaceC2386Mo20831);
            if (inputStreamMo20829 == null) {
                throw new IOException("MHTML source was not opened");
            }
        }
        return inputStreamMo20829;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m52486(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m52486(boolean z) {
        int i;
        C23226[] c23226Arr;
        ParcelFileDescriptor[] parcelFileDescriptorArr;
        synchronized (this.f75586) {
            this.f75591 = z | this.f75591;
            this.f75589++;
            c23226Arr = (C23226[]) this.f75580.toArray(new C23226[0]);
            this.f75580.clear();
            parcelFileDescriptorArr = (ParcelFileDescriptor[]) this.f75583.toArray(new ParcelFileDescriptor[0]);
        }
        for (C23226 c23226 : c23226Arr) {
            c23226.close();
        }
        for (ParcelFileDescriptor parcelFileDescriptor : parcelFileDescriptorArr) {
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            this.f75583.remove(parcelFileDescriptor);
        }
    }
}
