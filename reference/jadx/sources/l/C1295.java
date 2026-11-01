package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֨ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6SG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1295 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile IOException f5545;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22463 f5547;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f5548;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f5549;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f5550;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Executor f5551;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10428 f5552;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f5553;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1254 f5554;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final UUID f5555;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C13312 f5556;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C9742 f5557;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22463 f5558;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final FutureC12075 f5544 = new FutureC12075();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f5546 = -1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 m4632() {
        return this.f5548;
    }

    public C1295(C1254 c1254, InterfaceC3800 interfaceC3800, C10428 c10428, Executor executor) {
        this.f5554 = c1254;
        this.f5555 = c1254.m4527();
        C13638.requireNonNull(interfaceC3800);
        this.f5548 = interfaceC3800;
        C13638.requireNonNull(c10428);
        this.f5552 = c10428;
        C13638.requireNonNull(executor);
        this.f5551 = executor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m4634(C17523 c17523) {
        return m4626(c17523, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m4637(C17523 c17523) {
        return m4626(c17523, true);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final IOException m4636() {
        return this.f5545;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m4638() throws Throwable {
        synchronized (this) {
            if (!m4630()) {
                throw new IllegalStateException("Attachment collection requires a drained queue");
            }
        }
        try {
            C14641 c14641M19278 = C7235.m19278(this.f5555, this.f5554.m4549());
            if (c14641M19278 != null) {
                InterfaceC3800 interfaceC3800 = this.f5548;
                UUID uuid = this.f5555;
                Object[] objArr = {c14641M19278};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                C13638.requireNonNull(obj);
                arrayList.add(obj);
                C14641.m35150(interfaceC3800, uuid, C0561.unmodifiableList(arrayList));
            }
            this.f5545 = null;
        } catch (IOException e) {
            this.f5545 = e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4635(C1254 c1254) {
        return this.f5554 == c1254;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private FutureC12075 m4626(C17523 c17523, boolean z) {
        boolean z2;
        Throwable illegalStateException;
        boolean z3;
        C22463 c22463;
        Throwable illegalStateException2;
        C22463 c22464;
        C13638.requireNonNull(c17523);
        C22463 c22465 = new C22463(c17523, z);
        synchronized (this) {
            C22463 c22466 = this.f5547;
            z2 = true;
            illegalStateException = null;
            z3 = false;
            if ((c22466 != null && c22466.f73332 == c17523) || ((c22463 = this.f5558) != null && c22463.f73332 == c17523)) {
                illegalStateException = new IllegalStateException("Checkpoint is already queued");
                c22464 = null;
            } else {
                if (this.f5550) {
                    illegalStateException2 = new IllegalStateException("Checkpoint queue is closed");
                } else if (!this.f5555.equals(c17523.m40789())) {
                    illegalStateException2 = new IllegalArgumentException("Checkpoint belongs to another session");
                } else if (c17523.m40791() <= this.f5546) {
                    illegalStateException2 = new IllegalArgumentException("Checkpoint is out of order");
                } else {
                    this.f5546 = c17523.m40791();
                    if (this.f5547 == null) {
                        this.f5547 = c22465;
                        z2 = false;
                        z3 = true;
                        c22464 = null;
                    } else {
                        c22464 = this.f5558;
                        this.f5558 = c22465;
                        if (c22464 != null) {
                            this.f5553++;
                        }
                        z2 = false;
                    }
                }
                illegalStateException = illegalStateException2;
                c22464 = null;
                z2 = false;
            }
        }
        if (illegalStateException != null) {
            if (!z2) {
                c17523.close();
            }
            c22465.f73334.m30021(illegalStateException);
        }
        if (c22464 != null) {
            m4628(c22464);
            c22464.f73334.m30021((Throwable) new CancellationException("Checkpoint was superseded or discarded"));
        }
        if (z3) {
            m4631(c22465);
        }
        return c22465.f73334.m30032((InterfaceC15954) new C12278(3));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m4631(final C22463 c22463) {
        synchronized (this) {
            if (!this.f5550 && this.f5547 == c22463) {
                try {
                    this.f5551.execute(new Runnable() { // from class: l.ۖᩴۖ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1295.m4627(this.f10411, c22463);
                        }
                    });
                } catch (RuntimeException e) {
                    m4629(c22463, e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4627(C1295 c1295, C22463 c22463) {
        Throwable th;
        Long lValueOf;
        Throwable th2;
        Long l2;
        C22463 c22464;
        boolean zM4630;
        synchronized (c1295) {
            if (!c1295.f5550 && c1295.f5547 == c22463) {
                c22463.f73331 = true;
                try {
                    long jM40785 = c22463.f73332.m40785(c1295.f5548, c1295.f5552);
                    lValueOf = Long.valueOf(jM40785);
                    try {
                        if (c1295.f5557 != null) {
                            c1295.f5554.m4551(jM40785).m30027();
                            c1295.f5557.m24716(c1295.f5549, c22463.f73332.m40787(), c22463.f73332.m40792(), c22463.f73332.m40783(), c22463.f73332.m40788());
                        }
                        if (c22463.f73333) {
                            c1295.f5554.m4551(jM40785).m30027();
                            C17523 c17523 = c22463.f73332;
                            try {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(c17523.m40786());
                                C14641 c14641M19278 = C7235.m19278(c1295.f5555, c1295.f5554.m4549());
                                if (c14641M19278 != null) {
                                    arrayList.add(c14641M19278);
                                }
                                C14641.m35150(c1295.f5548, c1295.f5555, arrayList);
                                c1295.f5545 = null;
                            } catch (IOException e) {
                                c1295.f5545 = e;
                            }
                        }
                        c22463.f73332.close();
                        l2 = lValueOf;
                        th2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                        c22463.f73332.close();
                        th2 = th;
                        l2 = lValueOf;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    lValueOf = null;
                }
                synchronized (c1295) {
                    c22464 = c1295.f5558;
                    c1295.f5558 = null;
                    c1295.f5547 = c22464;
                    zM4630 = c1295.m4630();
                }
                if (zM4630) {
                    c1295.f5544.m30019((Object) null);
                }
                if (th2 == null) {
                    c22463.f73334.m30019(l2);
                } else {
                    c22463.f73334.m30021(th2);
                }
                if (c22464 != null) {
                    c1295.m4631(c22464);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4629(C22463 c22463, RuntimeException runtimeException) {
        synchronized (this) {
            C22463 c22464 = this.f5547;
            if (c22464 != c22463) {
                return;
            }
            C22463 c22465 = this.f5558;
            this.f5558 = null;
            this.f5547 = null;
            this.f5553 = 1 + (c22465 == null ? 0 : 1) + this.f5553;
            m4628(c22464);
            if (c22465 != null) {
                m4628(c22465);
            }
            c22464.f73334.m30021((Throwable) runtimeException);
            if (c22465 != null) {
                c22465.f73334.m30021((Throwable) runtimeException);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m4633() {
        C22463 c22463;
        C22463 c22464;
        C22463 c22465;
        boolean zM4630;
        synchronized (this) {
            this.f5550 = true;
            c22463 = this.f5547;
            c22464 = this.f5558;
            this.f5558 = null;
            if (c22463 == null || c22463.f73331) {
                c22465 = c22463;
                c22463 = null;
            } else {
                this.f5547 = null;
                c22465 = null;
            }
            this.f5553 = (c22463 == null ? 0 : 1) + (c22464 == null ? 0 : 1) + this.f5553;
        }
        if (c22463 != null) {
            m4628(c22463);
        }
        if (c22464 != null) {
            m4628(c22464);
        }
        if (c22465 != null) {
            c22465.f73332.close();
        }
        synchronized (this) {
            zM4630 = m4630();
        }
        if (zM4630) {
            this.f5544.m30019((Object) null);
        }
        if (c22463 != null) {
            this.f5544.m30014((Runnable) new RunnableC5529(0, c22463));
        }
        if (c22464 != null) {
            this.f5544.m30014((Runnable) new RunnableC5529(0, c22464));
        }
        return this.f5544.m30032((InterfaceC15954) new C9023());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m4630() {
        return this.f5550 && this.f5547 == null && this.f5558 == null && this.f5553 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m4628(C22463 c22463) {
        boolean zM4630;
        c22463.f73332.close();
        synchronized (this) {
            this.f5553--;
            zM4630 = m4630();
        }
        if (zM4630) {
            this.f5544.m30019((Object) null);
        }
    }
}
