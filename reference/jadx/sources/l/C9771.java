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

/* JADX INFO: renamed from: l.ۢ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9771 implements InterfaceC15670, InterfaceC9480 {

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f31491 = C6382.f21569.m49876(".media");

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f31492 = new AtomicInteger();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile int f31493;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public IOException f31494;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f31496;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC18722 f31497;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C16281 f31498;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC14984 f31500;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 f31502;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f31503;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f31504;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f31505;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C0823 f31506;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f31507;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f31508;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final String f31509;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f31499 = new AtomicInteger();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f31495 = new HashMap();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public EnumC0077 f31501 = EnumC0077.UNKNOWN;

    public C9771(ActivityC7135 activityC7135, AbstractC7629 abstractC7629, C0823 c0823, EnumC18722 enumC18722, C16281 c16281) {
        this.f31505 = activityC7135;
        this.f31502 = abstractC7629;
        this.f31506 = c0823;
        this.f31497 = enumC18722;
        this.f31498 = c16281;
        if (abstractC7629 instanceof C11969) {
            this.f31508 = null;
            this.f31509 = "local";
            return;
        }
        MessageDigest messageDigestM36174 = C15022.m36174();
        abstractC7629.mo20833(messageDigestM36174);
        String strSubstring = C15022.m36182(messageDigestM36174.digest()).substring(0, 8);
        this.f31509 = strSubstring;
        AbstractC22044 abstractC22044M49876 = f31491.m49876(strSubstring);
        if (abstractC7629 instanceof AbstractC18881) {
            this.f31508 = abstractC22044M49876;
            return;
        }
        this.f31508 = abstractC22044M49876.m49876(Integer.toHexString(f31492.incrementAndGet()) + "-" + Long.toHexString(System.nanoTime()));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 m25481() {
        return this.f31502;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25473(InterfaceC14984 interfaceC14984) {
        this.f31500 = interfaceC14984;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25480() {
        int i = this.f31507;
        this.f31507 = this.f31499.incrementAndGet();
        m25445(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean m25465(int i) {
        return (i == 0 || this.f31503 || i != this.f31507) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25445(int i) {
        if (i == 0 || this.f31493 != i) {
            return;
        }
        this.f31493 = 0;
        InterfaceC14984 interfaceC14984 = this.f31500;
        if (interfaceC14984 != null) {
            C21576.m49068(new RunnableC5470(3, this, interfaceC14984));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25451(C9771 c9771, InterfaceC14984 interfaceC14984) {
        if (c9771.f31493 == 0) {
            interfaceC14984.accept(-2);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m25463(final C9771 c9771, final int i) {
        if (!c9771.m25465(i) || c9771.f31493 == i) {
            return;
        }
        c9771.f31493 = i;
        final InterfaceC14984 interfaceC14984 = c9771.f31500;
        if (interfaceC14984 != null) {
            C21576.m49068(new Runnable() { // from class: l.ܶ֨ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C9771.m25448(this.f51176, i, interfaceC14984);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25448(C9771 c9771, int i, InterfaceC14984 interfaceC14984) {
        if (c9771.f31493 == i) {
            interfaceC14984.accept(-1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25447(final C9771 c9771, final int i, final int i2) {
        final InterfaceC14984 interfaceC14984;
        if (c9771.m25465(i) && (interfaceC14984 = c9771.f31500) != null) {
            C21576.m49068(new Runnable() { // from class: l.ܽ֨ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C9771.m25449(this.f56152, i, interfaceC14984, i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25449(C9771 c9771, int i, InterfaceC14984 interfaceC14984, int i2) {
        if (c9771.m25465(i)) {
            interfaceC14984.accept(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.ۢ֨ۚ] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [l.۟֨ۚ] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [l.۟ۘܳ] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25475(InterfaceC2386 interfaceC2386) throws Throwable {
        ?? r1;
        ?? r14;
        boolean z;
        boolean z2;
        IOException iOException;
        if (this.f31508 == null) {
            return;
        }
        String strM25461 = m25461(interfaceC2386);
        AbstractC22044 abstractC22044M49876 = this.f31508.m49876(strM25461);
        if (this.f31502 instanceof AbstractC18881) {
            if (m25452(interfaceC2386, abstractC22044M49876)) {
                m25458(interfaceC2386, strM25461);
                return;
            } else if (m25453(interfaceC2386, false)) {
                return;
            }
        }
        AbstractActivityC17204 abstractActivityC17204 = this.f31505;
        if (abstractActivityC17204 != null && (abstractActivityC17204.isFinishing() || this.f31505.isDestroyed())) {
            return;
        }
        synchronized (this) {
            C7535 c7535M25440 = m25440(abstractC22044M49876, interfaceC2386, strM25461);
            if (c7535M25440 == null) {
                return;
            }
            if (abstractC22044M49876.mo2934()) {
                abstractC22044M49876.mo4287();
            }
            int i = this.f31507;
            int iIncrementAndGet = this.f31499.incrementAndGet();
            this.f31507 = iIncrementAndGet;
            m25445(i);
            long jUptimeMillis = SystemClock.uptimeMillis();
            boolean[] zArr = {false};
            try {
                r1 = this.f31502;
                AbstractActivityC17204 abstractActivityC17205 = this.f31505;
                InputStream inputStreamMo20829 = r1.mo20829(abstractActivityC17205, interfaceC2386);
                try {
                    if (inputStreamMo20829 == null) {
                        throw new C21706(interfaceC2386.getName());
                    }
                    try {
                        try {
                            abstractC22044M49876.m49841(inputStreamMo20829, interfaceC2386.getSize(), new C23198(this, jUptimeMillis, iIncrementAndGet, zArr));
                            if (zArr[0] || !m25465(iIncrementAndGet)) {
                                throw new C10517(interfaceC2386.getName());
                            }
                            try {
                                inputStreamMo20829.close();
                                if (zArr[0] || !m25465(iIncrementAndGet)) {
                                    z2 = true;
                                    iOException = null;
                                } else {
                                    iOException = null;
                                    z2 = false;
                                }
                                m25446(strM25461, c7535M25440, iOException, z2);
                                m25445(iIncrementAndGet);
                            } catch (IOException e) {
                                e = e;
                                r1 = c7535M25440;
                                r14 = e;
                                try {
                                    abstractC22044M49876.mo4287();
                                    throw r14;
                                } catch (Throwable th) {
                                    th = th;
                                    if (zArr[0] && m25465(iIncrementAndGet)) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    m25446(strM25461, r1, r14, z);
                                    m25445(iIncrementAndGet);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r1 = c7535M25440;
                                abstractActivityC17205 = null;
                                r14 = abstractActivityC17205;
                                if (zArr[0]) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                m25446(strM25461, r1, r14, z);
                                m25445(iIncrementAndGet);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r1 = c7535M25440;
                            abstractActivityC17205 = null;
                            Throwable th4 = th;
                            if (inputStreamMo20829 == null) {
                                throw th4;
                            }
                            try {
                                inputStreamMo20829.close();
                                throw th4;
                            } catch (Throwable th5) {
                                try {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                } catch (IOException e2) {
                                    e = e2;
                                    r14 = e;
                                    abstractC22044M49876.mo4287();
                                    throw r14;
                                } catch (Throwable th6) {
                                    th = th6;
                                    r14 = abstractActivityC17205;
                                    if (zArr[0]) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    m25446(strM25461, r1, r14, z);
                                    m25445(iIncrementAndGet);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        r1 = c7535M25440;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (IOException e3) {
                e = e3;
                r1 = c7535M25440;
            } catch (Throwable th9) {
                th = th9;
                r1 = c7535M25440;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0025 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C7535 m25440(l.AbstractC22044 r9, l.InterfaceC2386 r10, java.lang.String r11) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            boolean r2 = r8.f31503
            if (r2 != 0) goto Lbd
            java.util.HashMap r2 = r8.f31495
            java.lang.Object r2 = r2.get(r11)
            l.۟֨ۚ r2 = (l.C7535) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L93
            boolean r5 = r2.f24863
            if (r5 == 0) goto L3c
            int r1 = r2.f24861
            int r1 = r1 + r4
            r2.f24861 = r1
            r8.wait()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L27
            int r1 = r2.f24861
            int r1 = r1 - r4
            r2.f24861 = r1
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
            int r10 = r2.f24861
            int r10 = r10 - r4
            r2.f24861 = r10
            throw r9
        L3c:
            boolean r4 = r2.f24860
            if (r4 == 0) goto L4d
            boolean r1 = r8.m25452(r10, r9)
            if (r1 == 0) goto L47
            return r3
        L47:
            java.util.HashMap r1 = r8.f31495
            r1.remove(r11)
            goto L1
        L4d:
            java.io.IOException r3 = r2.f24862
            if (r3 == 0) goto L68
            if (r1 != 0) goto L5e
            int r1 = r2.f24861
            if (r1 <= 0) goto L58
            goto L5e
        L58:
            java.util.HashMap r1 = r8.f31495
            r1.remove(r11)
            goto L1
        L5e:
            int r9 = r2.f24861
            if (r9 != 0) goto L67
            java.util.HashMap r9 = r8.f31495
            r9.remove(r11)
        L67:
            throw r3
        L68:
            boolean r3 = r2.f24859
            if (r3 == 0) goto L8c
            if (r1 != 0) goto L79
            int r1 = r2.f24861
            if (r1 <= 0) goto L73
            goto L79
        L73:
            java.util.HashMap r1 = r8.f31495
            r1.remove(r11)
            goto L1
        L79:
            int r9 = r2.f24861
            if (r9 != 0) goto L82
            java.util.HashMap r9 = r8.f31495
            r9.remove(r11)
        L82:
            l.ۤ֨ۚ r9 = new l.ۤ֨ۚ
            java.lang.String r10 = r10.getName()
            r9.<init>(r10)
            throw r9
        L8c:
            java.util.HashMap r1 = r8.f31495
            r1.remove(r11)
            goto L1
        L93:
            long r1 = r10.getSize()
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto Lb0
            boolean r9 = r8.m25452(r10, r9)
            if (r9 == 0) goto Lb0
            l.۟֨ۚ r9 = new l.۟֨ۚ
            r9.<init>(r0)
            r9.f24860 = r4
            java.util.HashMap r10 = r8.f31495
            r10.put(r11, r9)
            return r3
        Lb0:
            l.۟֨ۚ r9 = new l.۟֨ۚ
            r9.<init>(r0)
            r9.f24863 = r4
            java.util.HashMap r10 = r8.f31495
            r10.put(r11, r9)
            return r9
        Lbd:
            l.ۤ֨ۚ r9 = new l.ۤ֨ۚ
            java.lang.String r10 = r10.getName()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9771.m25440(l.᩷ۨᩴ, l.ۖۗܳ, java.lang.String):l.۟֨ۚ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25446(String str, C7535 c7535, IOException iOException, boolean z) {
        synchronized (this) {
            if (((C7535) this.f31495.get(str)) == c7535) {
                c7535.f24863 = false;
                if (this.f31503 || z || (iOException instanceof C10517)) {
                    c7535.f24859 = true;
                    c7535.f24862 = null;
                    c7535.f24860 = false;
                } else if (iOException != null) {
                    c7535.f24862 = iOException;
                    c7535.f24859 = false;
                    c7535.f24860 = false;
                } else {
                    c7535.f24860 = true;
                    c7535.f24862 = null;
                    c7535.f24859 = false;
                }
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m25459(C9771 c9771, InterfaceC2386 interfaceC2386) throws IOException {
        if (c9771.f31508 == null) {
            return false;
        }
        AbstractC22044 abstractC22044M49876 = c9771.f31508.m49876(m25461(interfaceC2386));
        synchronized (c9771) {
            if (abstractC22044M49876.mo2934()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC7629 abstractC7629 = c9771.f31502;
                if ((abstractC7629 instanceof AbstractC18881) && ((AbstractC18881) abstractC7629).mo35568()) {
                    return true;
                }
            }
            try {
                InputStream inputStreamMo20829 = c9771.f31502.mo20829(c9771.f31505, interfaceC2386);
                try {
                    if (inputStreamMo20829 == null) {
                        throw new C21706(interfaceC2386.getName());
                    }
                    abstractC22044M49876.m49841(inputStreamMo20829, interfaceC2386.getSize(), (InterfaceC23711) null);
                    inputStreamMo20829.close();
                    return false;
                } catch (Throwable th) {
                    if (inputStreamMo20829 != null) {
                        try {
                            inputStreamMo20829.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                abstractC22044M49876.mo4287();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m25467(C9771 c9771, InterfaceC2386 interfaceC2386) {
        return c9771.m25453(interfaceC2386, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m25453(InterfaceC2386 interfaceC2386, boolean z) throws IOException {
        EnumC0077 enumC0077;
        boolean zMo35568 = false;
        if (z || Build.VERSION.SDK_INT >= 23) {
            AbstractC7629 abstractC7629 = this.f31502;
            if (abstractC7629 instanceof AbstractC18881) {
                AbstractC18881 abstractC18881 = (AbstractC18881) abstractC7629;
                synchronized (this) {
                    while (!this.f31503) {
                        EnumC0077 enumC0078 = this.f31501;
                        if (enumC0078 == EnumC0077.RANGE_SUPPORTED) {
                            return true;
                        }
                        if (enumC0078 == EnumC0077.RANGE_UNSUPPORTED) {
                            return false;
                        }
                        if (enumC0078 == EnumC0077.ERROR) {
                            IOException iOException = this.f31494;
                            if (iOException == null) {
                                throw new IOException("Network range support probe failed");
                            }
                            throw iOException;
                        }
                        EnumC0077 enumC0079 = EnumC0077.PROBING;
                        if (enumC0078 == enumC0079) {
                            try {
                                wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException("Interrupted while probing network range support");
                            }
                        } else {
                            this.f31501 = enumC0079;
                            try {
                                zMo35568 = abstractC18881.mo35568();
                                e = null;
                            } catch (IOException e) {
                                e = e;
                            }
                            synchronized (this) {
                                if (this.f31503) {
                                    this.f31501 = EnumC0077.UNKNOWN;
                                    this.f31494 = null;
                                    notifyAll();
                                    throw new C10517(interfaceC2386.getName());
                                }
                                this.f31494 = e;
                                if (e != null) {
                                    enumC0077 = EnumC0077.ERROR;
                                } else {
                                    enumC0077 = zMo35568 ? EnumC0077.RANGE_SUPPORTED : EnumC0077.RANGE_UNSUPPORTED;
                                }
                                this.f31501 = enumC0077;
                                notifyAll();
                            }
                            if (e == null) {
                                return zMo35568;
                            }
                            throw e;
                        }
                    }
                    throw new C10517(interfaceC2386.getName());
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25450(C9771 c9771, InterfaceC2386 interfaceC2386) throws C9634 {
        if ((c9771.f31502 instanceof AbstractC18881) && !c9771.m25453(interfaceC2386, true)) {
            throw new C9634("Network storage does not support HLS range requests");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IOException m25439(C9771 c9771, IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if (cause instanceof C2218) {
                synchronized (c9771) {
                    c9771.f31501 = EnumC0077.RANGE_UNSUPPORTED;
                    c9771.f31494 = null;
                    c9771.notifyAll();
                }
                return new C9634("Network storage does not support HLS range requests", iOException);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m25461(InterfaceC2386 interfaceC2386) {
        MessageDigest messageDigestM36174 = C15022.m36174();
        C15022.m36176(messageDigestM36174, interfaceC2386.getPath());
        messageDigestM36174.update((byte) 58);
        messageDigestM36174.update(String.valueOf(interfaceC2386.getSize()).getBytes());
        messageDigestM36174.update((byte) 58);
        messageDigestM36174.update(String.valueOf(interfaceC2386.getTime()).getBytes());
        return C15022.m36182(messageDigestM36174.digest()).substring(0, 24);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6044 m25471(InterfaceC2386 interfaceC2386) {
        if (this.f31508 == null) {
            return C6044.m17540(interfaceC2386.mo8093(), C6044.m17541(interfaceC2386.getPath()));
        }
        if (!(this.f31502 instanceof AbstractC18881)) {
            return m25460(interfaceC2386);
        }
        String strM25461 = m25461(interfaceC2386);
        AbstractC22044 abstractC22044M49876 = this.f31508.m49876(strM25461);
        synchronized (this) {
            if (!m25452(interfaceC2386, abstractC22044M49876)) {
                if (this.f31503) {
                    return C6044.f20672;
                }
                C7535 c7535 = (C7535) this.f31495.get(strM25461);
                if (c7535 != null) {
                    if (c7535.f24863) {
                        return C6044.f20672;
                    }
                    if (c7535.f24860) {
                        this.f31495.remove(strM25461);
                    } else if (c7535.f24862 != null || c7535.f24859) {
                        return C6044.f20674;
                    }
                }
                C16281 c16281 = this.f31498;
                if (c16281 != null && c16281.m38630()) {
                    String strM11683 = C3603.m11683(this.f31502, interfaceC2386, this.f31498.m38631());
                    if ((interfaceC2386.getSize() >= 0 && this.f31498.m38629() != null && this.f31498.m38629().m22524(strM11683, 0L, interfaceC2386.getSize())) || this.f31501 == EnumC0077.RANGE_SUPPORTED) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            return C6044.m17539(new C20960(this, interfaceC2386, strM25461, strM11683));
                        }
                    }
                } else if (this.f31501 == EnumC0077.RANGE_SUPPORTED && Build.VERSION.SDK_INT >= 23) {
                    return C6044.m17539(new C20960(this, interfaceC2386, strM25461, "network:" + this.f31509 + ":" + strM25461));
                }
                if (this.f31501 == EnumC0077.ERROR) {
                    return C6044.f20674;
                }
                return C6044.f20672;
            }
            if (strM25461.equals(this.f31504)) {
                this.f31504 = null;
            }
            interfaceC2386.mo8110(R.id.MT_Protector, null);
            return C6044.m17540(abstractC22044M49876, C6044.m17541(interfaceC2386.getPath()));
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private C6044 m25460(InterfaceC2386 interfaceC2386) {
        String strM25461 = m25461(interfaceC2386);
        AbstractC22044 abstractC22044M49876 = this.f31508.m49876(strM25461);
        synchronized (this) {
            if (this.f31503) {
                return C6044.f20672;
            }
            C7535 c7535 = (C7535) this.f31495.get(strM25461);
            if (c7535 != null) {
                if (c7535.f24863) {
                    return C6044.f20672;
                }
                if (c7535.f24860) {
                    if (m25452(interfaceC2386, abstractC22044M49876)) {
                        return C6044.m17540(abstractC22044M49876, C6044.m17541(interfaceC2386.getPath()));
                    }
                    this.f31495.remove(strM25461);
                }
            }
            if (interfaceC2386.getSize() > 0 && m25452(interfaceC2386, abstractC22044M49876)) {
                C7535 c7536 = new C7535(0);
                c7536.f24860 = true;
                this.f31495.put(strM25461, c7536);
                return C6044.m17540(abstractC22044M49876, C6044.m17541(interfaceC2386.getPath()));
            }
            return C6044.f20672;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m25476() {
        synchronized (this) {
            if (this.f31503) {
                return;
            }
            this.f31503 = true;
            int i = this.f31507;
            this.f31507 = this.f31499.incrementAndGet();
            m25445(i);
            for (C7535 c7535 : this.f31495.values()) {
                if (c7535.f24863) {
                    c7535.f24863 = false;
                    c7535.f24859 = true;
                    c7535.f24862 = null;
                    c7535.f24860 = false;
                }
            }
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25474() {
        AbstractC22044 abstractC22044;
        synchronized (this) {
            if (!this.f31496 && (abstractC22044 = this.f31508) != null && !(this.f31502 instanceof AbstractC18881)) {
                this.f31496 = true;
                abstractC22044.mo4296();
            }
        }
    }

    @Override // l.InterfaceC15670
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13433 mo3996() {
        return this.f31497 == EnumC18722.HLS_DIRECT ? new C20214(this) : new C23944(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m25469(C25368 c25368, C16281 c16281) throws IOException {
        return C3603.m11683(this.f31502, m25478(c25368.f81907), c16281.m38631());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1278 m25470(Uri uri) throws IOException {
        InterfaceC2386 interfaceC2386M25478 = m25478(uri);
        AbstractC22044 abstractC22044 = this.f31508;
        if (abstractC22044 == null) {
            return new C3060(interfaceC2386M25478.mo8093());
        }
        String strM25461 = m25461(interfaceC2386M25478);
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(strM25461);
        if (m25452(interfaceC2386M25478, abstractC22044M49876)) {
            m25458(interfaceC2386M25478, strM25461);
            return new C3060(abstractC22044M49876);
        }
        if (this.f31502 instanceof AbstractC18881) {
            try {
                if (m25453(interfaceC2386M25478, false)) {
                    return new C14246(m25441(interfaceC2386M25478, strM25461, false));
                }
            } catch (IOException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 m25478(Uri uri) throws IOException {
        C14902 c14902M3296;
        C0823 c0823 = this.f31506;
        c0823.getClass();
        InterfaceC2386 interfaceC2386M3293 = (uri == null || (c14902M3296 = c0823.m3296(uri.getPath())) == null) ? null : C0823.m3293(c14902M3296);
        if (interfaceC2386M3293 != null) {
            return interfaceC2386M3293;
        }
        String path = uri != null ? uri.getPath() : null;
        if (path == null) {
            throw new IOException("Media path is null");
        }
        InterfaceC2386 interfaceC2386Mo20831 = this.f31502.mo20831(path);
        if (interfaceC2386Mo20831 == null || !((C13352) interfaceC2386Mo20831).mo8090()) {
            throw new IOException("Media item not found: ".concat(path));
        }
        return interfaceC2386Mo20831;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13961 m25479(InterfaceC2386 interfaceC2386) {
        AbstractC22044 abstractC22044 = this.f31508;
        if (abstractC22044 == null) {
            return interfaceC2386.mo8093().m49855("r");
        }
        String strM25461 = m25461(interfaceC2386);
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(strM25461);
        if (!m25452(interfaceC2386, abstractC22044M49876)) {
            if (m25453(interfaceC2386, false)) {
                return C11746.m29495(m25441(interfaceC2386, strM25461, true).m22476());
            }
            return abstractC22044M49876.m49855("r");
        }
        m25458(interfaceC2386, strM25461);
        return abstractC22044M49876.m49855("r");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m25444(C9771 c9771, String str) {
        return c9771.f31508.m49876(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m25452(InterfaceC2386 interfaceC2386, AbstractC22044 abstractC22044) {
        boolean z;
        if (!abstractC22044.mo2934()) {
            return false;
        }
        if (interfaceC2386.getSize() > 0 && abstractC22044.mo4285() != interfaceC2386.getSize()) {
            return false;
        }
        if (this.f31502 instanceof AbstractC18881) {
            long size = interfaceC2386.getSize();
            if (!abstractC22044.mo2934() || abstractC22044.mo4285() < 12) {
                z = false;
            } else {
                try {
                    C13961 c13961M49855 = abstractC22044.m49855("r");
                    try {
                        z = c13961M49855.readInt() == 358818181 && c13961M49855.readLong() == size;
                        c13961M49855.close();
                    } catch (Throwable th) {
                        try {
                            c13961M49855.close();
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
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8351 m25441(InterfaceC2386 interfaceC2386, String str, boolean z) throws IOException {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC7629 abstractC7629 = this.f31502;
            if (abstractC7629 instanceof AbstractC18881) {
                AbstractC18881 abstractC18881 = (AbstractC18881) abstractC7629;
                synchronized (this) {
                    if (this.f31503) {
                        throw new C10517(interfaceC2386.getName());
                    }
                    if (this.f31501 != EnumC0077.RANGE_SUPPORTED) {
                        IOException iOException = this.f31494;
                        if (iOException == null) {
                            throw new IOException("Network range cache is not ready");
                        }
                        throw iOException;
                    }
                    Object objMo8097 = interfaceC2386.mo8097(R.id.MT_Protector);
                    if (objMo8097 instanceof WeakReference) {
                        Object obj = ((WeakReference) objMo8097).get();
                        if (obj instanceof C8351) {
                            C8351 c8351 = (C8351) obj;
                            if (c8351.m22474()) {
                                if (z) {
                                    this.f31504 = str;
                                }
                                return c8351;
                            }
                            interfaceC2386.mo8110(R.id.MT_Protector, null);
                        }
                    }
                    C8351 c8352 = new C8351(new C13660(abstractC18881, interfaceC2386), interfaceC2386.getName(), interfaceC2386.getSize(), this.f31508.m49876(str + ".page"));
                    interfaceC2386.mo8110(R.id.MT_Protector, new WeakReference(c8352));
                    if (z) {
                        this.f31504 = str;
                    }
                    return c8352;
                }
            }
        }
        throw new IOException("Network range cache is not available");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m25482(InterfaceC2386 interfaceC2386) {
        String strM25461 = m25461(interfaceC2386);
        synchronized (this) {
            if (strM25461.equals(this.f31504)) {
                Object objMo8097 = interfaceC2386.mo8097(R.id.MT_Protector);
                if (objMo8097 instanceof WeakReference) {
                    Object obj = ((WeakReference) objMo8097).get();
                    if (obj instanceof C8351) {
                        C8351 c8351 = (C8351) obj;
                        try {
                            c8351.m22475();
                        } catch (IllegalStateException unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m25458(InterfaceC2386 interfaceC2386, String str) {
        synchronized (this) {
            if (str.equals(this.f31504)) {
                this.f31504 = null;
            }
            interfaceC2386.mo8110(R.id.MT_Protector, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17976 m25472(InterfaceC2386 interfaceC2386, String str) throws IOException {
        if (Build.VERSION.SDK_INT < 23) {
            throw new IOException("Network preview data source is not available");
        }
        C16281 c16281 = this.f31498;
        if (c16281 != null && c16281.m38630()) {
            return new C17976(new C10797(m25456(interfaceC2386)));
        }
        C8351 c8351M25441 = m25441(interfaceC2386, str, false);
        try {
            return new C17976(c8351M25441.m22470());
        } catch (RuntimeException e) {
            c8351M25441.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC1278 m25477(InterfaceC2386 interfaceC2386, String str) {
        C16281 c16281 = this.f31498;
        if (c16281 != null && c16281.m38630()) {
            return m25456(interfaceC2386);
        }
        return new C14246(m25441(interfaceC2386, str, false));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C8889 m25456(InterfaceC2386 interfaceC2386) throws IOException {
        C20870 c20870;
        C16281 c16281 = this.f31498;
        if (c16281 == null || !c16281.m38630() || interfaceC2386.getSize() < 0) {
            throw new IOException("Unified preview cache is not available");
        }
        String strM11683 = C3603.m11683(this.f31502, interfaceC2386, c16281.m38631());
        boolean z = false;
        boolean z2 = c16281.m38629() != null && c16281.m38629().m22524(strM11683, 0L, interfaceC2386.getSize());
        C16484 c16484 = new C16484(this);
        if (!z2 && this.f31501 == EnumC0077.RANGE_SUPPORTED) {
            z = true;
        }
        C17115 c17115 = new C17115(c16281, new C20845(c16281, c16484, new C11398(6, strM11683)), strM11683, z);
        C14902 c14902M3296 = this.f31506.m3296(interfaceC2386.getPath());
        Uri uri = (c14902M3296 == null || (c20870 = c14902M3296.f48681) == null) ? null : c20870.f66802;
        if (uri == null) {
            throw new IOException("Media URI is missing");
        }
        return new C8889(c17115, uri, strM11683, interfaceC2386.getSize());
    }
}
