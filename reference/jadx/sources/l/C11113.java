package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: l.ۧܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6UK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11113 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f37702;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f37703;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f37704;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public RunnableC15928 f37705;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f37706;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C23689 f37707;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C0548 f37708;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f37709;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f37710;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f37711;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f37713;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f37714;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Thread f37715;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Throwable f37716;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C20990 f37717;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17462 f37718;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f37719;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f37720;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C16072 f37721;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f37722;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile C22983 f37723;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public FutureC12075 f37724;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f37701 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 f37712 = new FutureC12075();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized FutureC12075 m28022(final C23689 c23689, boolean z) {
        if (this.f37714) {
            return m28017(new IllegalStateException("Persistence coordinator is closed"));
        }
        Throwable th = this.f37716;
        if (th != null) {
            return m28017(th);
        }
        FutureC12075 futureC12075 = this.f37724;
        if (futureC12075 == null) {
            this.f37707 = c23689;
            this.f37704 = z;
            this.f37724 = new FutureC12075();
            m28019();
            return this.f37724;
        }
        if (z) {
            return FutureC12075.m30001(-1L);
        }
        if (!this.f37704) {
            return futureC12075;
        }
        return futureC12075.m30028(new InterfaceC15954() { // from class: l.֡ܽۖ
            @Override // l.InterfaceC15954
            public final Object apply(Object obj) {
                FutureC12075 futureC12075M28022;
                C11113 c11113 = this.f2220;
                C23689 c236810 = c23689;
                Long l2 = (Long) obj;
                if (l2.longValue() >= 0) {
                    return FutureC12075.m30001(l2);
                }
                synchronized (c11113) {
                    futureC12075M28022 = c11113.m28022(c236810, false);
                }
                return futureC12075M28022;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C16757 m28023(C22983 c22983, C16072 c16072) {
        C16757 c16757;
        if (this.f37714 || this.f37716 != null || this.f37715 != Thread.currentThread() || c22983.m50849() < this.f37713 || c22983.m50849() < this.f37723.m50849()) {
            throw new IllegalStateException("Recovery generation cannot replace current writer");
        }
        c16757 = new C16757(this, c22983, c16072);
        c16072.m38089();
        return c16757;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28025(Throwable th) {
        this.f37716 = th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28026(RunnableC15928 runnableC15928) {
        if (!this.f37714 && this.f37716 == null) {
            this.f37705 = runnableC15928;
            m28019();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28028() {
        if (this.f37714) {
            throw new IllegalStateException("Persistence coordinator is closed");
        }
        if (this.f37716 != null) {
            throw new IllegalStateException("Persistence requires reopening", this.f37716);
        }
        this.f37720 = true;
        this.f37722 = false;
        m28019();
    }

    public C11113(C22983 c22983, C16072 c16072, C0548 c0548, C17462 c17462) {
        this.f37723 = c22983;
        this.f37721 = c16072;
        this.f37718 = c17462;
        this.f37708 = c0548;
        try {
            c16072.m38089();
            this.f37713 = c22983.m50849();
        } catch (RuntimeException e) {
            c0548.close();
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
    public final void m28027(l.C20990 r12, long r13) {
        /*
            r11 = this;
            r1 = 0
            r2 = 0
            r0 = r11
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L69
            boolean r3 = r11.f37714     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L5e
            java.lang.Throwable r3 = r11.f37716     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L54
            long r3 = r12.f68348     // Catch: java.lang.Throwable -> L66
            long r5 = r11.f37713     // Catch: java.lang.Throwable -> L66
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L4c
            r3 = 0
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 < 0) goto L4c
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L66
            l.᩷ܽۖ r5 = r11.f37717     // Catch: java.lang.Throwable -> L66
            if (r5 != 0) goto L24
            r11.f37706 = r3     // Catch: java.lang.Throwable -> L66
        L24:
            r11.f37702 = r3     // Catch: java.lang.Throwable -> L66
            long r3 = r11.f37703     // Catch: java.lang.Throwable -> L66
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r6 - r3
            int r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r10 <= 0) goto L34
            goto L36
        L34:
            long r6 = r3 + r13
        L36:
            r11.f37703 = r6     // Catch: java.lang.Throwable -> L66
            r11.f37717 = r12     // Catch: java.lang.Throwable -> L49
            long r13 = r12.f68348     // Catch: java.lang.Throwable -> L49
            r11.f37713 = r13     // Catch: java.lang.Throwable -> L49
            r2 = 1
            r11.m28019()     // Catch: java.lang.Throwable -> L49
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
            java.lang.Throwable r3 = r11.f37716     // Catch: java.lang.Throwable -> L66
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
        throw new UnsupportedOperationException("Method not decompiled: l.C11113.m28027(l.᩷ܽۖ, long):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m28021(long j) {
        synchronized (this) {
            Throwable th = this.f37716;
            if (th != null) {
                return m28017(th);
            }
            if (j >= 0 && j <= this.f37713) {
                long jM50849 = this.f37723.m50849();
                if (j <= jM50849) {
                    return FutureC12075.m30001(Long.valueOf(jM50849));
                }
                if (this.f37714) {
                    return m28017(new IllegalStateException("Persistence coordinator is closed"));
                }
                C9030.removeIf(this.f37701, new C20285());
                if (this.f37701.size() >= this.f37718.f55566) {
                    return m28017(new RejectedExecutionException("Persistence waiter limit reached"));
                }
                FutureC12075 futureC12075 = new FutureC12075();
                this.f37701.add(new C6173(j, futureC12075));
                this.f37720 = true;
                this.f37722 = false;
                m28019();
                return futureC12075;
            }
            return m28017(new IllegalArgumentException("Unknown session revision"));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m28029() {
        return this.f37723.m50849();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m28020() {
        return this.f37712;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ܺܽۖ] */
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
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m28019() {
        if (this.f37714 || this.f37719 || this.f37716 != null) {
            return;
        }
        if (this.f37707 == null && this.f37705 == null && (this.f37722 || this.f37717 == null)) {
            return;
        }
        long jNanoTime = System.nanoTime();
        long jMax = 0;
        if (this.f37707 == null && this.f37705 == null && !this.f37720) {
            long j = this.f37703;
            C17462 c17462 = this.f37718;
            if (j < c17462.f55569) {
                jMax = Math.max(0L, Math.min(c17462.f55567 - (jNanoTime - this.f37702), c17462.f55568 - (jNanoTime - this.f37706)));
            }
        }
        ScheduledFuture scheduledFuture = this.f37711;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        final long j2 = this.f37710 + 1;
        this.f37710 = j2;
        this.f37711 = this.f37708.m2559(new Runnable() { // from class: l.ܺܽۖ
            @Override // java.lang.Runnable
            public final void run() {
                C11113.m28012(this.f51940, j2);
            }
        }, jMax);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28012(C11113 c11113, long j) {
        C20990 c20990;
        RunnableC15928 runnableC15928;
        Error error;
        synchronized (c11113) {
            if (!c11113.f37714 && !c11113.f37719 && c11113.f37716 == null && j == c11113.f37710 && ((c20990 = c11113.f37717) != null || c11113.f37707 != null || c11113.f37705 != null)) {
                C20990 c20991 = null;
                c11113.f37711 = null;
                c11113.f37719 = true;
                C23689 c23689 = (!c11113.f37704 || c20990 == null || c11113.f37722) ? c11113.f37707 : null;
                boolean z = false;
                if (c23689 != null) {
                    c11113.f37707 = null;
                    c11113.f37715 = Thread.currentThread();
                    c20990 = null;
                    runnableC15928 = null;
                } else {
                    runnableC15928 = c11113.f37705;
                    if (runnableC15928 != null && (c20990 == null || c11113.f37722 || !c11113.f37720)) {
                        c11113.f37705 = null;
                        c20990 = null;
                    } else {
                        c11113.f37717 = null;
                        c11113.f37703 = 0L;
                        c11113.f37720 = false;
                        runnableC15928 = null;
                    }
                }
                if (c23689 != null) {
                    c11113.m28015(c23689);
                    return;
                }
                if (runnableC15928 != null) {
                    c11113.m28011((Runnable) runnableC15928);
                    return;
                }
                try {
                    c11113.f37723.m50852(c20990.f68349, c20990.f68351.f70014, c20990.f68350, c20990.f68352, c20990.f68348);
                    error = null;
                } catch (Throwable th) {
                    error = th;
                }
                ArrayList<C6173> arrayList = new ArrayList();
                long jM50849 = c11113.f37723.m50849();
                synchronized (c11113) {
                    c11113.f37719 = false;
                    if (error == null || c11113.f37714) {
                        c20991 = c20990;
                    } else {
                        c11113.f37722 = true;
                        if (c11113.f37717 == null) {
                            c11113.f37717 = c20990;
                            long jNanoTime = System.nanoTime();
                            c11113.f37702 = jNanoTime;
                            c11113.f37706 = jNanoTime;
                        } else {
                            c20991 = c20990;
                        }
                    }
                    Iterator it = c11113.f37701.iterator();
                    while (it.hasNext()) {
                        C6173 c6173 = (C6173) it.next();
                        if (error != null || c6173.f21032 <= jM50849) {
                            arrayList.add(c6173);
                            it.remove();
                        }
                    }
                    c11113.m28019();
                    if (c11113.f37714 && !c11113.f37709) {
                        z = true;
                    }
                    if (z) {
                        c11113.f37709 = true;
                    }
                }
                if (c20991 != null) {
                    try {
                        c20991.close();
                    } catch (Throwable th2) {
                        if (z) {
                            c11113.m28016();
                        }
                        for (C6173 c6174 : arrayList) {
                            if (error == null) {
                                c6174.f21031.m30019(Long.valueOf(jM50849));
                            } else {
                                c6174.f21031.m30021((Throwable) error);
                            }
                        }
                        throw th2;
                    }
                }
                if (z) {
                    c11113.m28016();
                }
                for (C6173 c6175 : arrayList) {
                    if (error == null) {
                        c6175.f21031.m30019(Long.valueOf(jM50849));
                    } else {
                        c6175.f21031.m30021((Throwable) error);
                    }
                }
                if (error instanceof Error) {
                    throw error;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28011(Runnable runnable) {
        boolean z = false;
        try {
            runnable.run();
            synchronized (this) {
                this.f37719 = false;
                m28019();
                if (this.f37714 && !this.f37709) {
                    z = true;
                }
                if (z) {
                    this.f37709 = true;
                }
            }
        } finally {
            synchronized (this) {
                this.f37719 = false;
                m28019();
                if (this.f37714 && !this.f37709) {
                    z = true;
                }
                if (z) {
                    this.f37709 = true;
                }
                if (z) {
                    m28016();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28015(InterfaceC12524 interfaceC12524) {
        long jRun;
        Error error;
        FutureC12075 futureC12075;
        Throwable th;
        boolean z;
        C20990 c20990 = null;
        try {
            jRun = interfaceC12524.run();
            error = null;
        } catch (Throwable th2) {
            jRun = -1;
            error = th2;
        }
        ArrayList<C6173> arrayList = new ArrayList();
        long jM50849 = this.f37723.m50849();
        synchronized (this) {
            this.f37719 = false;
            this.f37715 = null;
            futureC12075 = this.f37724;
            this.f37724 = null;
            th = this.f37716;
            C20990 c20991 = this.f37717;
            if (c20991 != null && c20991.f68348 <= jM50849) {
                this.f37717 = null;
                this.f37703 = 0L;
                this.f37720 = false;
                c20990 = c20991;
            }
            Iterator it = this.f37701.iterator();
            while (it.hasNext()) {
                C6173 c6173 = (C6173) it.next();
                if (th != null || c6173.f21032 <= jM50849) {
                    arrayList.add(c6173);
                    it.remove();
                }
            }
            m28019();
            z = this.f37714 && !this.f37709;
            if (z) {
                this.f37709 = true;
            }
        }
        if (c20990 != null) {
            try {
                c20990.close();
            } catch (Throwable th3) {
                if (z) {
                    m28016();
                }
                for (C6173 c6174 : arrayList) {
                    if (th == null) {
                        c6174.f21031.m30019(Long.valueOf(jM50849));
                    } else {
                        c6174.f21031.m30021(th);
                    }
                }
                if (error == null) {
                    futureC12075.m30019(Long.valueOf(jRun));
                    throw th3;
                }
                futureC12075.m30021((Throwable) error);
                throw th3;
            }
        }
        if (z) {
            m28016();
        }
        for (C6173 c6175 : arrayList) {
            if (th == null) {
                c6175.f21031.m30019(Long.valueOf(jM50849));
            } else {
                c6175.f21031.m30021(th);
            }
        }
        if (error == null) {
            futureC12075.m30019(Long.valueOf(jRun));
        } else {
            futureC12075.m30021((Throwable) error);
        }
        if (error instanceof Error) {
            throw error;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28024() {
        synchronized (this) {
            if (this.f37714) {
                return;
            }
            this.f37714 = true;
            ScheduledFuture scheduledFuture = this.f37711;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f37711 = null;
            this.f37710++;
            C20990 c20990 = this.f37717;
            this.f37717 = null;
            ArrayList arrayList = new ArrayList(this.f37701);
            this.f37701.clear();
            FutureC12075 futureC12075 = this.f37707 != null ? this.f37724 : null;
            this.f37707 = null;
            this.f37705 = null;
            if (futureC12075 != null) {
                this.f37724 = null;
            }
            boolean z = this.f37719;
            if (!z) {
                this.f37709 = true;
            }
            if (c20990 != null) {
                try {
                    c20990.close();
                } finally {
                    if (!z) {
                        m28016();
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C6173) it.next()).f21031.m30021((Throwable) new CancellationException("Persistence session abandoned"));
                    }
                    if (futureC12075 != null) {
                        futureC12075.m30021((Throwable) new CancellationException("Persistence session abandoned"));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m28016() {
        C0548 c0548 = this.f37708;
        try {
            this.f37721.m38088();
            c0548.close();
            th = null;
        } catch (Throwable th) {
            th = th;
            c0548.close();
        }
        FutureC12075 futureC12075 = this.f37712;
        if (th == null) {
            futureC12075.m30019((Object) null);
        } else {
            futureC12075.m30021(th);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static FutureC12075 m28017(Throwable th) {
        FutureC12075 futureC12075 = new FutureC12075();
        futureC12075.m30021(th);
        return futureC12075;
    }
}
