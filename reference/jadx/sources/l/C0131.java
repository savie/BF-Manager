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

/* JADX INFO: renamed from: l.֡ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J72H */
/* JADX INFO: loaded from: classes2.dex */
public final class C0131 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile int f1120;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f1121;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Object f1122;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C4609 f1123;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f1124;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f1125;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 f1126;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final WeakReference f1127;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashSet f1128;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Semaphore f1129;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f1130;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object f1131;

    public C0131(ActivityC10181 activityC10181, AbstractC9677 abstractC9677, String str, boolean z) {
        this.f1123 = ConcurrentMapC13783.newKeySet();
        this.f1131 = new Object();
        this.f1128 = new HashSet();
        this.f1129 = new Semaphore(2, true);
        this.f1127 = new WeakReference(activityC10181);
        this.f1126 = abstractC9677;
        this.f1122 = abstractC9677 instanceof C21920 ? new Object() : abstractC9677;
        this.f1121 = str;
        this.f1125 = z;
        this.f1124 = null;
    }

    public C0131(ActivityC10181 activityC10181, AbstractC20745 abstractC20745) {
        this.f1123 = ConcurrentMapC13783.newKeySet();
        this.f1131 = new Object();
        this.f1128 = new HashSet();
        this.f1129 = new Semaphore(2, true);
        this.f1127 = new WeakReference(activityC10181);
        this.f1126 = null;
        this.f1122 = new Object();
        this.f1121 = null;
        this.f1125 = true;
        this.f1124 = abstractC20745;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0071  */
    /* JADX WARN: Code duplicated, block: B:64:0x0081  */
    /* JADX WARN: Code duplicated, block: B:77:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x006c: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:53:0x006c */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ParcelFileDescriptor m1205(final C0131 c0131) throws Throwable {
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        final ParcelFileDescriptor parcelFileDescriptor;
        boolean z;
        boolean z2;
        ParcelFileDescriptor parcelFileDescriptor2;
        final int i = c0131.f1120;
        if (c0131.f1130) {
            throw new FileNotFoundException("HTML preview session is closed");
        }
        if (!c0131.f1129.tryAcquire()) {
            throw new FileNotFoundException("Too many open HTML preview streams");
        }
        try {
            try {
                parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                try {
                    parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[1];
                    try {
                        synchronized (c0131.f1131) {
                            if (c0131.f1130 || i != c0131.f1120) {
                                throw new FileNotFoundException("HTML preview session is closed");
                            }
                            c0131.f1123.add(parcelFileDescriptor);
                        }
                        C4716.f16635.submit(new Runnable() { // from class: l.۟ۖ᩹
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0131.m1202(this.f23983, parcelFileDescriptor, i);
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
                                c0131.f1123.remove(parcelFileDescriptor);
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
                            c0131.f1129.release();
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
                        c0131.f1123.remove(parcelFileDescriptor);
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    if (parcelFileDescriptorArrCreatePipe != null) {
                    }
                    if (parcelFileDescriptor2 != null) {
                        parcelFileDescriptor2.close();
                    }
                    c0131.f1129.release();
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
    public static void m1202(final C0131 c0131, ParcelFileDescriptor parcelFileDescriptor, final int i) {
        final AbstractActivityC12483 abstractActivityC12483;
        try {
            try {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                try {
                    C1542 c1542M1206 = c0131.m1206(i);
                    try {
                        byte[] bArr = new byte[65536];
                        while (!c0131.f1130 && i == c0131.f1120) {
                            try {
                                int i2 = c1542M1206.read(bArr);
                                if (i2 == -1) {
                                    break;
                                } else {
                                    autoCloseOutputStream.write(bArr, 0, i2);
                                }
                            } catch (IOException e) {
                                e = e;
                                if ((c0131.f1126 instanceof AbstractC12233) && (abstractActivityC12483 = (AbstractActivityC12483) c0131.f1127.get()) != null) {
                                    abstractActivityC12483.runOnUiThread(new Runnable() { // from class: l.᩶ۖ᩹
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C0131.m1201(this.f63758, i, abstractActivityC12483);
                                        }
                                    });
                                }
                                throw e;
                            } catch (RuntimeException e2) {
                                e = e2;
                                if (c0131.f1126 instanceof AbstractC12233) {
                                    abstractActivityC12483.runOnUiThread(new Runnable() { // from class: l.᩶ۖ᩹
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C0131.m1201(this.f63758, i, abstractActivityC12483);
                                        }
                                    });
                                }
                                throw e;
                            }
                        }
                        c1542M1206.close();
                        autoCloseOutputStream.close();
                        c0131.f1123.remove(parcelFileDescriptor);
                        c0131.f1129.release();
                    } catch (Throwable th) {
                        try {
                            c1542M1206.close();
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
            c0131.f1123.remove(parcelFileDescriptor);
            c0131.f1129.release();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1201(C0131 c0131, int i, AbstractActivityC12483 abstractActivityC12483) {
        if (c0131.f1130 || i != c0131.f1120 || abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed()) {
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C1542 m1206(final int i) throws IOException {
        C1542 c1542;
        if (this.f1126 instanceof AbstractC12233) {
            c1542 = new C1542(new InterfaceC14244() { // from class: l.᩷ۖ᩹
                @Override // l.InterfaceC14244
                /* JADX INFO: renamed from: ۙ */
                public final InputStream mo34378() {
                    return this.f67095.m1198(i);
                }
            }, new Consumer() { // from class: l.ܺۖ᩹
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C0131.m1203(this.f50853, (C1542) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            });
        } else {
            c1542 = new C1542(m1198(i), new Consumer() { // from class: l.ܺۖ᩹
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C0131.m1203(this.f50853, (C1542) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }
            });
        }
        C1542 c1543 = c1542;
        synchronized (this.f1131) {
            if (!this.f1130 && i == this.f1120) {
                this.f1128.add(c1543);
                return c1543;
            }
            c1543.close();
            throw new IOException("HTML preview request was cancelled");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1203(C0131 c0131, C1542 c1542) {
        synchronized (c0131.f1131) {
            c0131.f1128.remove(c1542);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream m1198(int i) throws IOException {
        InterfaceC2557 interfaceC2557Mo10264;
        InputStream inputStreamMo15073;
        AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) this.f1127.get();
        if (this.f1130 || i != this.f1120 || abstractActivityC12483 == null || abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed()) {
            throw new IOException("HTML preview owner is unavailable");
        }
        AbstractC20745 abstractC20745 = this.f1124;
        if (abstractC20745 != null) {
            return abstractC20745.mo33970();
        }
        if (this.f1126 == null || this.f1121 == null) {
            throw new IOException("MHTML source is unavailable");
        }
        synchronized (this.f1122) {
            synchronized (this.f1126) {
                if (this.f1130 || i != this.f1120 || abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed()) {
                    throw new IOException("HTML preview owner is unavailable");
                }
                AbstractC9677 abstractC9677 = this.f1126;
                boolean z = abstractC9677 instanceof AbstractC12233;
                if (z) {
                    abstractC9677.mo10267(false);
                }
                interfaceC2557Mo10264 = this.f1126.mo10264(this.f1121);
                if (interfaceC2557Mo10264 != null) {
                    C15404 c15404 = (C15404) interfaceC2557Mo10264;
                    if (c15404.mo7985() && ((!this.f1125 && !z) || !c15404.mo7986())) {
                    }
                }
                throw new IOException("MHTML source is unavailable");
            }
            inputStreamMo15073 = this.f1126.mo15073(abstractActivityC12483, interfaceC2557Mo10264);
            if (inputStreamMo15073 == null) {
                throw new IOException("MHTML source was not opened");
            }
        }
        return inputStreamMo15073;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m1204(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m1204(boolean z) {
        int i;
        C1542[] c1542Arr;
        ParcelFileDescriptor[] parcelFileDescriptorArr;
        synchronized (this.f1131) {
            this.f1130 = z | this.f1130;
            this.f1120++;
            c1542Arr = (C1542[]) this.f1128.toArray(new C1542[0]);
            this.f1128.clear();
            parcelFileDescriptorArr = (ParcelFileDescriptor[]) this.f1123.toArray(new ParcelFileDescriptor[0]);
        }
        for (C1542 c1542 : c1542Arr) {
            c1542.close();
        }
        for (ParcelFileDescriptor parcelFileDescriptor : parcelFileDescriptorArr) {
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            this.f1123.remove(parcelFileDescriptor);
        }
    }
}
