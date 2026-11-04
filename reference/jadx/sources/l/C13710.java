package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: l.۬۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K6UK */
/* JADX INFO: loaded from: classes4.dex */
public final class C13710 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f43512;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f43513;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C10046 f43514;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public RunnableC10309 f43515;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f43516;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f43517;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21981 f43519;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f43520;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f43521;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Throwable f43522;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile C3598 f43523;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7745 f43524;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Thread f43525;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f43526;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f43528;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f43529;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f43530;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f43531;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f43532;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8490 f43533;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C9300 f43534;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public FutureC23690 f43535;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f43527 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 f43518 = new FutureC23690();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C9235 m33514(C3598 c3598, C10046 c10046) {
        C9235 c9235;
        if (this.f43531 || this.f43522 != null || this.f43525 != Thread.currentThread() || c3598.m11662() < this.f43516 || c3598.m11662() < this.f43523.m11662()) {
            throw new IllegalStateException("Recovery generation cannot replace current writer");
        }
        c9235 = new C9235(this, c3598, c10046);
        c10046.m25972();
        return c9235;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized FutureC23690 m33516(final C21981 c21981, boolean z) {
        if (this.f43531) {
            return m33512(new IllegalStateException("Persistence coordinator is closed"));
        }
        Throwable th = this.f43522;
        if (th != null) {
            return m33512(th);
        }
        FutureC23690 futureC23690 = this.f43535;
        if (futureC23690 == null) {
            this.f43519 = c21981;
            this.f43512 = z;
            this.f43535 = new FutureC23690();
            m33510();
            return this.f43535;
        }
        if (z) {
            return FutureC23690.m52928(-1L);
        }
        if (!this.f43512) {
            return futureC23690;
        }
        return futureC23690.m52943(new InterfaceC25138() { // from class: l.֨۟᩸
            @Override // l.InterfaceC25138
            public final Object apply(Object obj) {
                FutureC23690 futureC23690M33516;
                C13710 c13710 = this.f3747;
                C21981 c21982 = c21981;
                Long l2 = (Long) obj;
                if (l2.longValue() >= 0) {
                    return FutureC23690.m52928(l2);
                }
                synchronized (c13710) {
                    futureC23690M33516 = c13710.m33516(c21982, false);
                }
                return futureC23690M33516;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33518(Throwable th) {
        this.f43522 = th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33520(RunnableC10309 runnableC10309) {
        if (!this.f43531 && this.f43522 == null) {
            this.f43515 = runnableC10309;
            m33510();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33521() {
        if (this.f43531) {
            throw new IllegalStateException("Persistence coordinator is closed");
        }
        if (this.f43522 != null) {
            throw new IllegalStateException("Persistence requires reopening", this.f43522);
        }
        this.f43530 = true;
        this.f43526 = false;
        m33510();
    }

    public C13710(C3598 c3598, C10046 c10046, C9300 c9300, C8490 c8490) {
        this.f43523 = c3598;
        this.f43514 = c10046;
        this.f43533 = c8490;
        this.f43534 = c9300;
        try {
            c10046.m25972();
            this.f43516 = c3598.m11662();
        } catch (RuntimeException e) {
            c9300.close();
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r5 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m33519(l.C7745 r12, long r13) {
        /*
            r11 = this;
            r1 = 0
            r2 = 0
            r0 = r11
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L69
            boolean r3 = r11.f43531     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L5e
            java.lang.Throwable r3 = r11.f43522     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L54
            long r3 = r12.f25504     // Catch: java.lang.Throwable -> L66
            long r5 = r11.f43516     // Catch: java.lang.Throwable -> L66
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L4c
            r3 = 0
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 < 0) goto L4c
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L66
            l.۟۟᩸ r5 = r11.f43524     // Catch: java.lang.Throwable -> L66
            if (r5 != 0) goto L24
            r11.f43528 = r3     // Catch: java.lang.Throwable -> L66
        L24:
            r11.f43521 = r3     // Catch: java.lang.Throwable -> L66
            long r3 = r11.f43532     // Catch: java.lang.Throwable -> L66
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r6 - r3
            int r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r10 <= 0) goto L34
            goto L36
        L34:
            long r6 = r3 + r13
        L36:
            r11.f43532 = r6     // Catch: java.lang.Throwable -> L66
            r11.f43524 = r12     // Catch: java.lang.Throwable -> L49
            long r13 = r12.f25504     // Catch: java.lang.Throwable -> L49
            r11.f43516 = r13     // Catch: java.lang.Throwable -> L49
            r2 = 1
            r11.m33510()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L48
            r5.close()
        L48:
            return
        L49:
            r13 = move-exception
            r1 = r5
            goto L67
        L4c:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L66
            java.lang.String r14 = "Invalid persistence request"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L66
            throw r13     // Catch: java.lang.Throwable -> L66
        L54:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L66
            java.lang.String r14 = "Persistence requires reopening"
            java.lang.Throwable r3 = r11.f43522     // Catch: java.lang.Throwable -> L66
            r13.<init>(r14, r3)     // Catch: java.lang.Throwable -> L66
            throw r13     // Catch: java.lang.Throwable -> L66
        L5e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L66
            java.lang.String r14 = "Persistence coordinator is closed"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L66
            throw r13     // Catch: java.lang.Throwable -> L66
        L66:
            r13 = move-exception
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L66
            throw r13     // Catch: java.lang.Throwable -> L69
        L69:
            r13 = move-exception
            if (r1 == 0) goto L6f
            r1.close()
        L6f:
            if (r2 != 0) goto L74
            r12.close()
        L74:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13710.m33519(l.۟۟᩸, long):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m33515(long j) {
        synchronized (this) {
            Throwable th = this.f43522;
            if (th != null) {
                return m33512(th);
            }
            if (j >= 0 && j <= this.f43516) {
                long jM11662 = this.f43523.m11662();
                if (j <= jM11662) {
                    return FutureC23690.m52928(Long.valueOf(jM11662));
                }
                if (this.f43531) {
                    return m33512(new IllegalStateException("Persistence coordinator is closed"));
                }
                C1170.removeIf(this.f43527, new C9981());
                if (this.f43527.size() >= this.f43533.f27784) {
                    return m33512(new RejectedExecutionException("Persistence waiter limit reached"));
                }
                FutureC23690 futureC23690 = new FutureC23690();
                this.f43527.add(new C6999(j, futureC23690));
                this.f43530 = true;
                this.f43526 = false;
                m33510();
                return futureC23690;
            }
            return m33512(new IllegalArgumentException("Unknown session revision"));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m33522() {
        return this.f43523.m11662();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m33523() {
        return this.f43518;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ᩳ۟᩸] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m33510() {
        if (this.f43531 || this.f43529 || this.f43522 != null) {
            return;
        }
        if (this.f43519 == null && this.f43515 == null && (this.f43526 || this.f43524 == null)) {
            return;
        }
        long jNanoTime = System.nanoTime();
        long jMax = 0;
        if (this.f43519 == null && this.f43515 == null && !this.f43530) {
            long j = this.f43532;
            C8490 c8490 = this.f43533;
            if (j < c8490.f27783) {
                jMax = Math.max(0L, Math.min(c8490.f27781 - (jNanoTime - this.f43521), c8490.f27782 - (jNanoTime - this.f43528)));
            }
        }
        ScheduledFuture scheduledFuture = this.f43517;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        final long j2 = this.f43520 + 1;
        this.f43520 = j2;
        this.f43517 = this.f43534.m24528(new Runnable() { // from class: l.ᩳ۟᩸
            @Override // java.lang.Runnable
            public final void run() {
                C13710.m33507(this.f61412, j2);
            }
        }, jMax);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33507(C13710 c13710, long j) {
        C7745 c7745;
        RunnableC10309 runnableC10309;
        Error error;
        synchronized (c13710) {
            if (!c13710.f43531 && !c13710.f43529 && c13710.f43522 == null && j == c13710.f43520 && ((c7745 = c13710.f43524) != null || c13710.f43519 != null || c13710.f43515 != null)) {
                C7745 c7746 = null;
                c13710.f43517 = null;
                c13710.f43529 = true;
                C21981 c21981 = (!c13710.f43512 || c7745 == null || c13710.f43526) ? c13710.f43519 : null;
                boolean z = false;
                if (c21981 != null) {
                    c13710.f43519 = null;
                    c13710.f43525 = Thread.currentThread();
                    c7745 = null;
                    runnableC10309 = null;
                } else {
                    runnableC10309 = c13710.f43515;
                    if (runnableC10309 != null && (c7745 == null || c13710.f43526 || !c13710.f43530)) {
                        c13710.f43515 = null;
                        c7745 = null;
                    } else {
                        c13710.f43524 = null;
                        c13710.f43532 = 0L;
                        c13710.f43530 = false;
                        runnableC10309 = null;
                    }
                }
                if (c21981 != null) {
                    c13710.m33506(c21981);
                    return;
                }
                if (runnableC10309 != null) {
                    c13710.m33505((Runnable) runnableC10309);
                    return;
                }
                try {
                    c13710.f43523.m11665(c7745.f25502, c7745.f25501.f40313, c7745.f25503, c7745.f25505, c7745.f25504);
                    error = null;
                } catch (Throwable th) {
                    error = th;
                }
                ArrayList<C6999> arrayList = new ArrayList();
                long jM11662 = c13710.f43523.m11662();
                synchronized (c13710) {
                    c13710.f43529 = false;
                    if (error == null || c13710.f43531) {
                        c7746 = c7745;
                    } else {
                        c13710.f43526 = true;
                        if (c13710.f43524 == null) {
                            c13710.f43524 = c7745;
                            long jNanoTime = System.nanoTime();
                            c13710.f43521 = jNanoTime;
                            c13710.f43528 = jNanoTime;
                        } else {
                            c7746 = c7745;
                        }
                    }
                    Iterator it = c13710.f43527.iterator();
                    while (it.hasNext()) {
                        C6999 c6999 = (C6999) it.next();
                        if (error != null || c6999.f23094 <= jM11662) {
                            arrayList.add(c6999);
                            it.remove();
                        }
                    }
                    c13710.m33510();
                    if (c13710.f43531 && !c13710.f43513) {
                        z = true;
                    }
                    if (z) {
                        c13710.f43513 = true;
                    }
                }
                if (c7746 != null) {
                    try {
                        c7746.close();
                    } catch (Throwable th2) {
                        if (z) {
                            c13710.m33511();
                        }
                        for (C6999 c69910 : arrayList) {
                            if (error == null) {
                                c69910.f23093.m52935(Long.valueOf(jM11662));
                            } else {
                                c69910.f23093.m52937((Throwable) error);
                            }
                        }
                        throw th2;
                    }
                }
                if (z) {
                    c13710.m33511();
                }
                for (C6999 c69911 : arrayList) {
                    if (error == null) {
                        c69911.f23093.m52935(Long.valueOf(jM11662));
                    } else {
                        c69911.f23093.m52937((Throwable) error);
                    }
                }
                if (error instanceof Error) {
                    throw error;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33505(Runnable runnable) {
        boolean z = false;
        try {
            runnable.run();
            synchronized (this) {
                this.f43529 = false;
                m33510();
                if (this.f43531 && !this.f43513) {
                    z = true;
                }
                if (z) {
                    this.f43513 = true;
                }
            }
        } finally {
            synchronized (this) {
                this.f43529 = false;
                m33510();
                if (this.f43531 && !this.f43513) {
                    z = true;
                }
                if (z) {
                    this.f43513 = true;
                }
                if (z) {
                    m33511();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33506(InterfaceC2524 interfaceC2524) {
        long jRun;
        Error error;
        FutureC23690 futureC23690;
        Throwable th;
        boolean z;
        C7745 c7745 = null;
        try {
            jRun = interfaceC2524.run();
            error = null;
        } catch (Throwable th2) {
            jRun = -1;
            error = th2;
        }
        ArrayList<C6999> arrayList = new ArrayList();
        long jM11662 = this.f43523.m11662();
        synchronized (this) {
            this.f43529 = false;
            this.f43525 = null;
            futureC23690 = this.f43535;
            this.f43535 = null;
            th = this.f43522;
            C7745 c7746 = this.f43524;
            if (c7746 != null && c7746.f25504 <= jM11662) {
                this.f43524 = null;
                this.f43532 = 0L;
                this.f43530 = false;
                c7745 = c7746;
            }
            Iterator it = this.f43527.iterator();
            while (it.hasNext()) {
                C6999 c6999 = (C6999) it.next();
                if (th != null || c6999.f23094 <= jM11662) {
                    arrayList.add(c6999);
                    it.remove();
                }
            }
            m33510();
            z = this.f43531 && !this.f43513;
            if (z) {
                this.f43513 = true;
            }
        }
        if (c7745 != null) {
            try {
                c7745.close();
            } catch (Throwable th3) {
                if (z) {
                    m33511();
                }
                for (C6999 c69910 : arrayList) {
                    if (th == null) {
                        c69910.f23093.m52935(Long.valueOf(jM11662));
                    } else {
                        c69910.f23093.m52937(th);
                    }
                }
                if (error == null) {
                    futureC23690.m52935(Long.valueOf(jRun));
                    throw th3;
                }
                futureC23690.m52937((Throwable) error);
                throw th3;
            }
        }
        if (z) {
            m33511();
        }
        for (C6999 c69911 : arrayList) {
            if (th == null) {
                c69911.f23093.m52935(Long.valueOf(jM11662));
            } else {
                c69911.f23093.m52937(th);
            }
        }
        if (error == null) {
            futureC23690.m52935(Long.valueOf(jRun));
        } else {
            futureC23690.m52937((Throwable) error);
        }
        if (error instanceof Error) {
            throw error;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33517() {
        synchronized (this) {
            if (this.f43531) {
                return;
            }
            this.f43531 = true;
            ScheduledFuture scheduledFuture = this.f43517;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f43517 = null;
            this.f43520++;
            C7745 c7745 = this.f43524;
            this.f43524 = null;
            ArrayList arrayList = new ArrayList(this.f43527);
            this.f43527.clear();
            FutureC23690 futureC23690 = this.f43519 != null ? this.f43535 : null;
            this.f43519 = null;
            this.f43515 = null;
            if (futureC23690 != null) {
                this.f43535 = null;
            }
            boolean z = this.f43529;
            if (!z) {
                this.f43513 = true;
            }
            if (c7745 != null) {
                try {
                    c7745.close();
                } finally {
                    if (!z) {
                        m33511();
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C6999) it.next()).f23093.m52937((Throwable) new CancellationException("Persistence session abandoned"));
                    }
                    if (futureC23690 != null) {
                        futureC23690.m52937((Throwable) new CancellationException("Persistence session abandoned"));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m33511() {
        C9300 c9300 = this.f43534;
        try {
            this.f43514.m25975();
            c9300.close();
            th = null;
        } catch (Throwable th) {
            th = th;
            c9300.close();
        }
        FutureC23690 futureC23690 = this.f43518;
        if (th == null) {
            futureC23690.m52935((Object) null);
        } else {
            futureC23690.m52937(th);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static FutureC23690 m33512(Throwable th) {
        FutureC23690 futureC23690 = new FutureC23690();
        futureC23690.m52937(th);
        return futureC23690;
    }
}
