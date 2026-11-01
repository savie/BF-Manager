package l;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۨۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11601 implements InterfaceC20723, InterfaceC4377 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f38973;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final String f38975;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f38976;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f38977;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumC13718 f38979;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public IOException f38980;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 f38981;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1263 f38982;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f38983;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f38985;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile int f38986;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2427 f38987;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f38988;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC23537 f38989;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 f38972 = C11904.f39942.m46690(".media");

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f38971 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f38974 = new AtomicInteger();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f38984 = new HashMap();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public EnumC3442 f38978 = EnumC3442.UNKNOWN;

    public C11601(ActivityC10957 activityC10957, AbstractC9677 abstractC9677, C2427 c2427, EnumC13718 enumC13718, C1263 c1263) {
        this.f38973 = activityC10957;
        this.f38981 = abstractC9677;
        this.f38987 = c2427;
        this.f38979 = enumC13718;
        this.f38982 = c1263;
        if (abstractC9677 instanceof C21611) {
            this.f38983 = null;
            this.f38975 = "local";
            return;
        }
        MessageDigest messageDigestM49416 = C22253.m49416();
        abstractC9677.mo15074(messageDigestM49416);
        String strSubstring = C22253.m49424(messageDigestM49416.digest()).substring(0, 8);
        this.f38975 = strSubstring;
        AbstractC20745 abstractC20745M46690 = f38972.m46690(strSubstring);
        if (abstractC9677 instanceof AbstractC12233) {
            this.f38983 = abstractC20745M46690;
            return;
        }
        this.f38983 = abstractC20745M46690.m46690(Integer.toHexString(f38971.incrementAndGet()) + "-" + Long.toHexString(System.nanoTime()));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC9677 m28920() {
        return this.f38981;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28926(InterfaceC23537 interfaceC23537) {
        this.f38989 = interfaceC23537;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28933() {
        int i = this.f38988;
        this.f38988 = this.f38974.incrementAndGet();
        m28898(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m28916(int i) {
        return (i == 0 || this.f38976 || i != this.f38988) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28898(int i) {
        if (i == 0 || this.f38986 != i) {
            return;
        }
        this.f38986 = 0;
        InterfaceC23537 interfaceC23537 = this.f38989;
        if (interfaceC23537 != null) {
            C16737.m39273(new RunnableC9534(1, this, interfaceC23537));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28904(C11601 c11601, InterfaceC23537 interfaceC23537) {
        if (c11601.f38986 == 0) {
            interfaceC23537.accept(-2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m28914(final C11601 c11601, final int i) {
        if (!c11601.m28916(i) || c11601.f38986 == i) {
            return;
        }
        c11601.f38986 = i;
        final InterfaceC23537 interfaceC23537 = c11601.f38989;
        if (interfaceC23537 != null) {
            C16737.m39273(new Runnable() { // from class: l.᩶᩵۬
                @Override // java.lang.Runnable
                public final void run() {
                    C11601.m28901(this.f66048, i, interfaceC23537);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28901(C11601 c11601, int i, InterfaceC23537 interfaceC23537) {
        if (c11601.f38986 == i) {
            interfaceC23537.accept(-1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28900(final C11601 c11601, final int i, final int i2) {
        final InterfaceC23537 interfaceC23537;
        if (c11601.m28916(i) && (interfaceC23537 = c11601.f38989) != null) {
            C16737.m39273(new Runnable() { // from class: l.ܺ᩵۬
                @Override // java.lang.Runnable
                public final void run() {
                    C11601.m28902(this.f52157, i, interfaceC23537, i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28902(C11601 c11601, int i, InterfaceC23537 interfaceC23537, int i2) {
        if (c11601.m28916(i)) {
            interfaceC23537.accept(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.ۨۡ۬] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [l.ۙۡ۬] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [l.ۢܶ᩹] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m28929(InterfaceC2557 interfaceC2557) throws Throwable {
        ?? r1;
        ?? r14;
        boolean z;
        boolean z2;
        IOException iOException;
        if (this.f38983 == null) {
            return;
        }
        String strM28919 = m28919(interfaceC2557);
        AbstractC20745 abstractC20745M46690 = this.f38983.m46690(strM28919);
        if (this.f38981 instanceof AbstractC12233) {
            if (m28905(interfaceC2557, abstractC20745M46690)) {
                m28911(interfaceC2557, strM28919);
                return;
            } else if (m28906(interfaceC2557, false)) {
                return;
            }
        }
        AbstractActivityC12483 abstractActivityC12483 = this.f38973;
        if (abstractActivityC12483 != null && (abstractActivityC12483.isFinishing() || this.f38973.isDestroyed())) {
            return;
        }
        synchronized (this) {
            C4544 c4544M28893 = m28893(abstractC20745M46690, interfaceC2557, strM28919);
            if (c4544M28893 == null) {
                return;
            }
            if (abstractC20745M46690.mo33975()) {
                abstractC20745M46690.mo24644();
            }
            int i = this.f38988;
            int iIncrementAndGet = this.f38974.incrementAndGet();
            this.f38988 = iIncrementAndGet;
            m28898(i);
            long jUptimeMillis = SystemClock.uptimeMillis();
            boolean[] zArr = {false};
            try {
                r1 = this.f38981;
                AbstractActivityC12483 abstractActivityC12484 = this.f38973;
                InputStream inputStreamMo15073 = r1.mo15073(abstractActivityC12484, interfaceC2557);
                try {
                    if (inputStreamMo15073 == null) {
                        throw new C21788(interfaceC2557.getName());
                    }
                    try {
                        try {
                            abstractC20745M46690.m46695(inputStreamMo15073, interfaceC2557.getSize(), new C0620(this, jUptimeMillis, iIncrementAndGet, zArr));
                            if (zArr[0] || !m28916(iIncrementAndGet)) {
                                throw new C18260(interfaceC2557.getName());
                            }
                            try {
                                inputStreamMo15073.close();
                                if (zArr[0] || !m28916(iIncrementAndGet)) {
                                    z2 = true;
                                    iOException = null;
                                } else {
                                    iOException = null;
                                    z2 = false;
                                }
                                m28899(strM28919, c4544M28893, iOException, z2);
                                m28898(iIncrementAndGet);
                            } catch (IOException e) {
                                e = e;
                                r1 = c4544M28893;
                                r14 = e;
                                try {
                                    abstractC20745M46690.mo24644();
                                    throw r14;
                                } catch (Throwable th) {
                                    th = th;
                                    if (zArr[0] && m28916(iIncrementAndGet)) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    m28899(strM28919, r1, r14, z);
                                    m28898(iIncrementAndGet);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r1 = c4544M28893;
                                abstractActivityC12484 = null;
                                r14 = abstractActivityC12484;
                                if (zArr[0]) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                m28899(strM28919, r1, r14, z);
                                m28898(iIncrementAndGet);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r1 = c4544M28893;
                            abstractActivityC12484 = null;
                            Throwable th4 = th;
                            if (inputStreamMo15073 == null) {
                                throw th4;
                            }
                            try {
                                inputStreamMo15073.close();
                                throw th4;
                            } catch (Throwable th5) {
                                try {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                } catch (IOException e2) {
                                    e = e2;
                                    r14 = e;
                                    abstractC20745M46690.mo24644();
                                    throw r14;
                                } catch (Throwable th6) {
                                    th = th6;
                                    r14 = abstractActivityC12484;
                                    if (zArr[0]) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    m28899(strM28919, r1, r14, z);
                                    m28898(iIncrementAndGet);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        r1 = c4544M28893;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (IOException e3) {
                e = e3;
                r1 = c4544M28893;
            } catch (Throwable th9) {
                th = th9;
                r1 = c4544M28893;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0025 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C4544 m28893(l.AbstractC20745 r9, l.InterfaceC2557 r10, java.lang.String r11) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            boolean r2 = r8.f38976
            if (r2 != 0) goto Lbd
            java.util.HashMap r2 = r8.f38984
            java.lang.Object r2 = r2.get(r11)
            l.ۙۡ۬ r2 = (l.C4544) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L93
            boolean r5 = r2.f16153
            if (r5 == 0) goto L3c
            int r1 = r2.f16155
            int r1 = r1 + r4
            r2.f16155 = r1
            r8.wait()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L27
            int r1 = r2.f16155
            int r1 = r1 - r4
            r2.f16155 = r1
            r1 = 1
            goto L2
        L25:
            r9 = move-exception
            goto L36
        L27:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L25
            r9.interrupt()     // Catch: java.lang.Throwable -> L25
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L25
            java.lang.String r10 = "Interrupted while waiting for media cache"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L36:
            int r10 = r2.f16155
            int r10 = r10 - r4
            r2.f16155 = r10
            throw r9
        L3c:
            boolean r4 = r2.f16156
            if (r4 == 0) goto L4d
            boolean r1 = r8.m28905(r10, r9)
            if (r1 == 0) goto L47
            return r3
        L47:
            java.util.HashMap r1 = r8.f38984
            r1.remove(r11)
            goto L1
        L4d:
            java.io.IOException r3 = r2.f16157
            if (r3 == 0) goto L68
            if (r1 != 0) goto L5e
            int r1 = r2.f16155
            if (r1 <= 0) goto L58
            goto L5e
        L58:
            java.util.HashMap r1 = r8.f38984
            r1.remove(r11)
            goto L1
        L5e:
            int r9 = r2.f16155
            if (r9 != 0) goto L67
            java.util.HashMap r9 = r8.f38984
            r9.remove(r11)
        L67:
            throw r3
        L68:
            boolean r3 = r2.f16154
            if (r3 == 0) goto L8c
            if (r1 != 0) goto L79
            int r1 = r2.f16155
            if (r1 <= 0) goto L73
            goto L79
        L73:
            java.util.HashMap r1 = r8.f38984
            r1.remove(r11)
            goto L1
        L79:
            int r9 = r2.f16155
            if (r9 != 0) goto L82
            java.util.HashMap r9 = r8.f38984
            r9.remove(r11)
        L82:
            l.ᩳ᩵۬ r9 = new l.ᩳ᩵۬
            java.lang.String r10 = r10.getName()
            r9.<init>(r10)
            throw r9
        L8c:
            java.util.HashMap r1 = r8.f38984
            r1.remove(r11)
            goto L1
        L93:
            long r1 = r10.getSize()
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto Lb0
            boolean r9 = r8.m28905(r10, r9)
            if (r9 == 0) goto Lb0
            l.ۙۡ۬ r9 = new l.ۙۡ۬
            r9.<init>(r0)
            r9.f16156 = r4
            java.util.HashMap r10 = r8.f38984
            r10.put(r11, r9)
            return r3
        Lb0:
            l.ۙۡ۬ r9 = new l.ۙۡ۬
            r9.<init>(r0)
            r9.f16153 = r4
            java.util.HashMap r10 = r8.f38984
            r10.put(r11, r9)
            return r9
        Lbd:
            l.ᩳ᩵۬ r9 = new l.ᩳ᩵۬
            java.lang.String r10 = r10.getName()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11601.m28893(l.᩷۠ۚ, l.ۖ۬᩹, java.lang.String):l.ۙۡ۬");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28899(String str, C4544 c4544, IOException iOException, boolean z) {
        synchronized (this) {
            if (((C4544) this.f38984.get(str)) == c4544) {
                c4544.f16153 = false;
                if (this.f38976 || z || (iOException instanceof C18260)) {
                    c4544.f16154 = true;
                    c4544.f16157 = null;
                    c4544.f16156 = false;
                } else if (iOException != null) {
                    c4544.f16157 = iOException;
                    c4544.f16154 = false;
                    c4544.f16156 = false;
                } else {
                    c4544.f16156 = true;
                    c4544.f16157 = null;
                    c4544.f16154 = false;
                }
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m28912(C11601 c11601, InterfaceC2557 interfaceC2557) throws IOException {
        if (c11601.f38983 == null) {
            return false;
        }
        AbstractC20745 abstractC20745M46690 = c11601.f38983.m46690(m28919(interfaceC2557));
        synchronized (c11601) {
            if (abstractC20745M46690.mo33975()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC9677 abstractC9677 = c11601.f38981;
                if ((abstractC9677 instanceof AbstractC12233) && ((AbstractC12233) abstractC9677).mo19632()) {
                    return true;
                }
            }
            try {
                InputStream inputStreamMo15073 = c11601.f38981.mo15073(c11601.f38973, interfaceC2557);
                try {
                    if (inputStreamMo15073 == null) {
                        throw new C21788(interfaceC2557.getName());
                    }
                    abstractC20745M46690.m46695(inputStreamMo15073, interfaceC2557.getSize(), (InterfaceC8978) null);
                    inputStreamMo15073.close();
                    return false;
                } catch (Throwable th) {
                    if (inputStreamMo15073 != null) {
                        try {
                            inputStreamMo15073.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                abstractC20745M46690.mo24644();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m28918(C11601 c11601, InterfaceC2557 interfaceC2557) {
        return c11601.m28906(interfaceC2557, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28906(InterfaceC2557 interfaceC2557, boolean z) throws IOException {
        EnumC3442 enumC3442;
        boolean zMo19632 = false;
        if (z || Build.VERSION.SDK_INT >= 23) {
            AbstractC9677 abstractC9677 = this.f38981;
            if (abstractC9677 instanceof AbstractC12233) {
                AbstractC12233 abstractC12233 = (AbstractC12233) abstractC9677;
                synchronized (this) {
                    while (!this.f38976) {
                        EnumC3442 enumC3443 = this.f38978;
                        if (enumC3443 == EnumC3442.RANGE_SUPPORTED) {
                            return true;
                        }
                        if (enumC3443 == EnumC3442.RANGE_UNSUPPORTED) {
                            return false;
                        }
                        if (enumC3443 == EnumC3442.ERROR) {
                            IOException iOException = this.f38980;
                            if (iOException == null) {
                                throw new IOException("Network range support probe failed");
                            }
                            throw iOException;
                        }
                        EnumC3442 enumC3444 = EnumC3442.PROBING;
                        if (enumC3443 == enumC3444) {
                            try {
                                wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException("Interrupted while probing network range support");
                            }
                        } else {
                            this.f38978 = enumC3444;
                            try {
                                zMo19632 = abstractC12233.mo19632();
                                e = null;
                            } catch (IOException e) {
                                e = e;
                            }
                            synchronized (this) {
                                if (this.f38976) {
                                    this.f38978 = EnumC3442.UNKNOWN;
                                    this.f38980 = null;
                                    notifyAll();
                                    throw new C18260(interfaceC2557.getName());
                                }
                                this.f38980 = e;
                                if (e != null) {
                                    enumC3442 = EnumC3442.ERROR;
                                } else {
                                    enumC3442 = zMo19632 ? EnumC3442.RANGE_SUPPORTED : EnumC3442.RANGE_UNSUPPORTED;
                                }
                                this.f38978 = enumC3442;
                                notifyAll();
                            }
                            if (e == null) {
                                return zMo19632;
                            }
                            throw e;
                        }
                    }
                    throw new C18260(interfaceC2557.getName());
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28903(C11601 c11601, InterfaceC2557 interfaceC2557) throws C19819 {
        if ((c11601.f38981 instanceof AbstractC12233) && !c11601.m28906(interfaceC2557, true)) {
            throw new C19819("Network storage does not support HLS range requests");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IOException m28892(C11601 c11601, IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if (cause instanceof C23929) {
                synchronized (c11601) {
                    c11601.f38978 = EnumC3442.RANGE_UNSUPPORTED;
                    c11601.f38980 = null;
                    c11601.notifyAll();
                }
                return new C19819("Network storage does not support HLS range requests", iOException);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m28919(InterfaceC2557 interfaceC2557) {
        MessageDigest messageDigestM49416 = C22253.m49416();
        C22253.m49418(messageDigestM49416, interfaceC2557.getPath());
        messageDigestM49416.update((byte) 58);
        messageDigestM49416.update(String.valueOf(interfaceC2557.getSize()).getBytes());
        messageDigestM49416.update((byte) 58);
        messageDigestM49416.update(String.valueOf(interfaceC2557.getTime()).getBytes());
        return C22253.m49424(messageDigestM49416.digest()).substring(0, 24);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6265 m28924(InterfaceC2557 interfaceC2557) {
        if (this.f38983 == null) {
            return C6265.m17336(interfaceC2557.mo7989(), C6265.m17337(interfaceC2557.getPath()));
        }
        if (!(this.f38981 instanceof AbstractC12233)) {
            return m28890(interfaceC2557);
        }
        String strM28919 = m28919(interfaceC2557);
        AbstractC20745 abstractC20745M46690 = this.f38983.m46690(strM28919);
        synchronized (this) {
            if (!m28905(interfaceC2557, abstractC20745M46690)) {
                if (this.f38976) {
                    return C6265.f21233;
                }
                C4544 c4544 = (C4544) this.f38984.get(strM28919);
                if (c4544 != null) {
                    if (c4544.f16153) {
                        return C6265.f21233;
                    }
                    if (c4544.f16156) {
                        this.f38984.remove(strM28919);
                    } else if (c4544.f16157 != null || c4544.f16154) {
                        return C6265.f21232;
                    }
                }
                C1263 c1263 = this.f38982;
                if (c1263 != null && c1263.m4582()) {
                    String strM11620 = C4085.m11620(this.f38981, interfaceC2557, this.f38982.m4586());
                    if ((interfaceC2557.getSize() >= 0 && this.f38982.m4583() != null && this.f38982.m4583().m36710(strM11620, 0L, interfaceC2557.getSize())) || this.f38978 == EnumC3442.RANGE_SUPPORTED) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            return C6265.m17335(new C2031(this, interfaceC2557, strM28919, strM11620));
                        }
                    }
                } else if (this.f38978 == EnumC3442.RANGE_SUPPORTED && Build.VERSION.SDK_INT >= 23) {
                    return C6265.m17335(new C2031(this, interfaceC2557, strM28919, "network:" + this.f38975 + ":" + strM28919));
                }
                if (this.f38978 == EnumC3442.ERROR) {
                    return C6265.f21232;
                }
                return C6265.f21233;
            }
            if (strM28919.equals(this.f38985)) {
                this.f38985 = null;
            }
            interfaceC2557.mo7976(R.id.MT_Protector, null);
            return C6265.m17336(abstractC20745M46690, C6265.m17337(interfaceC2557.getPath()));
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C6265 m28890(InterfaceC2557 interfaceC2557) {
        String strM28919 = m28919(interfaceC2557);
        AbstractC20745 abstractC20745M46690 = this.f38983.m46690(strM28919);
        synchronized (this) {
            if (this.f38976) {
                return C6265.f21233;
            }
            C4544 c4544 = (C4544) this.f38984.get(strM28919);
            if (c4544 != null) {
                if (c4544.f16153) {
                    return C6265.f21233;
                }
                if (c4544.f16156) {
                    if (m28905(interfaceC2557, abstractC20745M46690)) {
                        return C6265.m17336(abstractC20745M46690, C6265.m17337(interfaceC2557.getPath()));
                    }
                    this.f38984.remove(strM28919);
                }
            }
            if (interfaceC2557.getSize() > 0 && m28905(interfaceC2557, abstractC20745M46690)) {
                C4544 c4545 = new C4544(0);
                c4545.f16156 = true;
                this.f38984.put(strM28919, c4545);
                return C6265.m17336(abstractC20745M46690, C6265.m17337(interfaceC2557.getPath()));
            }
            return C6265.f21233;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m28927() {
        synchronized (this) {
            if (this.f38976) {
                return;
            }
            this.f38976 = true;
            int i = this.f38988;
            this.f38988 = this.f38974.incrementAndGet();
            m28898(i);
            for (C4544 c4544 : this.f38984.values()) {
                if (c4544.f16153) {
                    c4544.f16153 = false;
                    c4544.f16154 = true;
                    c4544.f16157 = null;
                    c4544.f16156 = false;
                }
            }
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m28928() {
        AbstractC20745 abstractC20745;
        synchronized (this) {
            if (!this.f38977 && (abstractC20745 = this.f38983) != null && !(this.f38981 instanceof AbstractC12233)) {
                this.f38977 = true;
                abstractC20745.mo24647();
            }
        }
    }

    @Override // l.InterfaceC20723
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15785 mo4000() {
        return this.f38979 == EnumC13718.HLS_DIRECT ? new C12616(this) : new C11205(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m28922(C12257 c12257, C1263 c1263) throws IOException {
        return C4085.m11620(this.f38981, m28931(c12257.f41015), c1263.m4586());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3153 m28923(Uri uri) throws IOException {
        InterfaceC2557 interfaceC2557M28931 = m28931(uri);
        AbstractC20745 abstractC20745 = this.f38983;
        if (abstractC20745 == null) {
            return new C16849(interfaceC2557M28931.mo7989());
        }
        String strM28919 = m28919(interfaceC2557M28931);
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(strM28919);
        if (m28905(interfaceC2557M28931, abstractC20745M46690)) {
            m28911(interfaceC2557M28931, strM28919);
            return new C16849(abstractC20745M46690);
        }
        if (this.f38981 instanceof AbstractC12233) {
            try {
                if (m28906(interfaceC2557M28931, false)) {
                    return new C14733(m28894(interfaceC2557M28931, strM28919, false));
                }
            } catch (IOException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 m28931(Uri uri) throws IOException {
        C13689 c13689M7406;
        C2427 c2427 = this.f38987;
        c2427.getClass();
        InterfaceC2557 interfaceC2557M7401 = (uri == null || (c13689M7406 = c2427.m7406(uri.getPath())) == null) ? null : C2427.m7401(c13689M7406);
        if (interfaceC2557M7401 != null) {
            return interfaceC2557M7401;
        }
        String path = uri != null ? uri.getPath() : null;
        if (path == null) {
            throw new IOException("Media path is null");
        }
        InterfaceC2557 interfaceC2557Mo10264 = this.f38981.mo10264(path);
        if (interfaceC2557Mo10264 == null || !((C15404) interfaceC2557Mo10264).mo7985()) {
            throw new IOException("Media item not found: ".concat(path));
        }
        return interfaceC2557Mo10264;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1388 m28930(InterfaceC2557 interfaceC2557) {
        AbstractC20745 abstractC20745 = this.f38983;
        if (abstractC20745 == null) {
            return interfaceC2557.mo7989().m46710("r");
        }
        String strM28919 = m28919(interfaceC2557);
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(strM28919);
        if (!m28905(interfaceC2557, abstractC20745M46690)) {
            if (m28906(interfaceC2557, false)) {
                return C19734.m44887(m28894(interfaceC2557, strM28919, true).m23777());
            }
            return abstractC20745M46690.m46710("r");
        }
        m28911(interfaceC2557, strM28919);
        return abstractC20745M46690.m46710("r");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m28896(C11601 c11601, String str) {
        return c11601.f38983.m46690(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m28905(InterfaceC2557 interfaceC2557, AbstractC20745 abstractC20745) {
        boolean z;
        if (!abstractC20745.mo33975()) {
            return false;
        }
        if (interfaceC2557.getSize() > 0 && abstractC20745.mo33964() != interfaceC2557.getSize()) {
            return false;
        }
        if (this.f38981 instanceof AbstractC12233) {
            long size = interfaceC2557.getSize();
            if (!abstractC20745.mo33975() || abstractC20745.mo33964() < 12) {
                z = false;
            } else {
                try {
                    C1388 c1388M46710 = abstractC20745.m46710("r");
                    try {
                        z = c1388M46710.readInt() == 358818181 && c1388M46710.readLong() == size;
                        c1388M46710.close();
                    } catch (Throwable th) {
                        try {
                            c1388M46710.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException unused) {
                    z = false;
                }
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.᩷᩵۬] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9246 m28894(final InterfaceC2557 interfaceC2557, String str, boolean z) throws IOException {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC9677 abstractC9677 = this.f38981;
            if (abstractC9677 instanceof AbstractC12233) {
                final AbstractC12233 abstractC12233 = (AbstractC12233) abstractC9677;
                synchronized (this) {
                    if (this.f38976) {
                        throw new C18260(interfaceC2557.getName());
                    }
                    if (this.f38978 != EnumC3442.RANGE_SUPPORTED) {
                        IOException iOException = this.f38980;
                        if (iOException == null) {
                            throw new IOException("Network range cache is not ready");
                        }
                        throw iOException;
                    }
                    Object objMo7974 = interfaceC2557.mo7974(R.id.MT_Protector);
                    if (objMo7974 instanceof WeakReference) {
                        Object obj = ((WeakReference) objMo7974).get();
                        if (obj instanceof C9246) {
                            C9246 c9246 = (C9246) obj;
                            if (c9246.m23772()) {
                                if (z) {
                                    this.f38985 = str;
                                }
                                return c9246;
                            }
                            interfaceC2557.mo7976(R.id.MT_Protector, null);
                        }
                    }
                    C9246 c9247 = new C9246(new InterfaceC1483() { // from class: l.᩷᩵۬
                        @Override // l.InterfaceC1483
                        /* JADX INFO: renamed from: ۙ */
                        public final InputStream mo5129(long j) {
                            return abstractC12233.mo10262(j, interfaceC2557.getPath());
                        }
                    }, interfaceC2557.getName(), interfaceC2557.getSize(), this.f38983.m46690(str + ".page"));
                    interfaceC2557.mo7976(R.id.MT_Protector, new WeakReference(c9247));
                    if (z) {
                        this.f38985 = str;
                    }
                    return c9247;
                }
            }
        }
        throw new IOException("Network range cache is not available");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m28921(InterfaceC2557 interfaceC2557) {
        String strM28919 = m28919(interfaceC2557);
        synchronized (this) {
            if (strM28919.equals(this.f38985)) {
                Object objMo7974 = interfaceC2557.mo7974(R.id.MT_Protector);
                if (objMo7974 instanceof WeakReference) {
                    Object obj = ((WeakReference) objMo7974).get();
                    if (obj instanceof C9246) {
                        C9246 c9246 = (C9246) obj;
                        try {
                            c9246.m23778();
                        } catch (IllegalStateException unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m28911(InterfaceC2557 interfaceC2557, String str) {
        synchronized (this) {
            if (str.equals(this.f38985)) {
                this.f38985 = null;
            }
            interfaceC2557.mo7976(R.id.MT_Protector, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9794 m28925(InterfaceC2557 interfaceC2557, String str) throws IOException {
        if (Build.VERSION.SDK_INT < 23) {
            throw new IOException("Network preview data source is not available");
        }
        C1263 c1263 = this.f38982;
        if (c1263 != null && c1263.m4582()) {
            return new C9794(new C23347(m28913(interfaceC2557)));
        }
        C9246 c9246M28894 = m28894(interfaceC2557, str, false);
        try {
            return new C9794(c9246M28894.m23774());
        } catch (RuntimeException e) {
            c9246M28894.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3153 m28932(InterfaceC2557 interfaceC2557, String str) {
        C1263 c1263 = this.f38982;
        if (c1263 != null && c1263.m4582()) {
            return m28913(interfaceC2557);
        }
        return new C14733(m28894(interfaceC2557, str, false));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private C16291 m28913(InterfaceC2557 interfaceC2557) throws IOException {
        C14704 c14704;
        C1263 c1263 = this.f38982;
        if (c1263 == null || !c1263.m4582() || interfaceC2557.getSize() < 0) {
            throw new IOException("Unified preview cache is not available");
        }
        String strM11620 = C4085.m11620(this.f38981, interfaceC2557, c1263.m4586());
        boolean z = false;
        boolean z2 = c1263.m4583() != null && c1263.m4583().m36710(strM11620, 0L, interfaceC2557.getSize());
        C22536 c22536 = new C22536(this);
        if (!z2 && this.f38978 == EnumC3442.RANGE_SUPPORTED) {
            z = true;
        }
        C5352 c5352 = new C5352(c1263, new C6763(c1263, c22536, new C13217(strM11620)), strM11620, z);
        C13689 c13689M7406 = this.f38987.m7406(interfaceC2557.getPath());
        Uri uri = (c13689M7406 == null || (c14704 = c13689M7406.f45157) == null) ? null : c14704.f48029;
        if (uri == null) {
            throw new IOException("Media URI is missing");
        }
        return new C16291(c5352, uri, strM11620, interfaceC2557.getSize());
    }
}
