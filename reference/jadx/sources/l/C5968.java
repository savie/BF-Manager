package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۚ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6SG */
/* JADX INFO: loaded from: classes3.dex */
public final class C5968 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13425 f20446;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Executor f20447;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f20448;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f20449;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13950 f20451;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C17505 f20452;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f20453;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19304 f20454;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f20455;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0352 f20456;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile IOException f20457;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final UUID f20458;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13425 f20459;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final FutureC23690 f20450 = new FutureC23690();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f20445 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 m17389() {
        return this.f20455;
    }

    public C5968(C17505 c17505, InterfaceC24329 interfaceC24329, C0352 c0352, Executor executor) {
        this.f20452 = c17505;
        this.f20458 = c17505.m41108();
        C17359.requireNonNull(interfaceC24329);
        this.f20455 = interfaceC24329;
        C17359.requireNonNull(c0352);
        this.f20456 = c0352;
        C17359.requireNonNull(executor);
        this.f20447 = executor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m17384(C4631 c4631) {
        return m17377(c4631, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m17387(C4631 c4631) {
        return m17377(c4631, true);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final IOException m17386() {
        return this.f20457;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17388() {
        synchronized (this) {
            if (!m17381()) {
                throw new IllegalStateException("Attachment collection requires a drained queue");
            }
        }
        try {
            C5090 c5090M29072 = C11557.m29072(this.f20458, this.f20452.m41104());
            if (c5090M29072 != null) {
                InterfaceC24329 interfaceC24329 = this.f20455;
                UUID uuid = this.f20458;
                Object[] objArr = {c5090M29072};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                C17359.requireNonNull(obj);
                arrayList.add(obj);
                C5090.m15391(interfaceC24329, uuid, C4681.unmodifiableList(arrayList));
            }
            this.f20457 = null;
        } catch (IOException e) {
            this.f20457 = e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17385(C17505 c17505) {
        return this.f20452 == c17505;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private FutureC23690 m17377(C4631 c4631, boolean z) {
        boolean z2;
        Throwable illegalStateException;
        boolean z3;
        C13425 c13425;
        Throwable illegalStateException2;
        C13425 c13426;
        C17359.requireNonNull(c4631);
        C13425 c13427 = new C13425(c4631, z);
        synchronized (this) {
            C13425 c13428 = this.f20446;
            z2 = true;
            illegalStateException = null;
            z3 = false;
            if ((c13428 != null && c13428.f42754 == c4631) || ((c13425 = this.f20459) != null && c13425.f42754 == c4631)) {
                illegalStateException = new IllegalStateException("Checkpoint is already queued");
                c13426 = null;
            } else {
                if (this.f20448) {
                    illegalStateException2 = new IllegalStateException("Checkpoint queue is closed");
                } else if (!this.f20458.equals(c4631.m14454())) {
                    illegalStateException2 = new IllegalArgumentException("Checkpoint belongs to another session");
                } else if (c4631.m14455() <= this.f20445) {
                    illegalStateException2 = new IllegalArgumentException("Checkpoint is out of order");
                } else {
                    this.f20445 = c4631.m14455();
                    if (this.f20446 == null) {
                        this.f20446 = c13427;
                        z2 = false;
                        z3 = true;
                        c13426 = null;
                    } else {
                        c13426 = this.f20459;
                        this.f20459 = c13427;
                        if (c13426 != null) {
                            this.f20453++;
                        }
                        z2 = false;
                    }
                }
                illegalStateException = illegalStateException2;
                c13426 = null;
                z2 = false;
            }
        }
        if (illegalStateException != null) {
            if (!z2) {
                c4631.close();
            }
            c13427.f42756.m52937(illegalStateException);
        }
        if (c13426 != null) {
            m17379(c13426);
            c13426.f42756.m52937((Throwable) new CancellationException("Checkpoint was superseded or discarded"));
        }
        if (z3) {
            m17382(c13427);
        }
        return c13427.f42756.m52949((InterfaceC25138) new C20138(0));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m17382(final C13425 c13425) {
        synchronized (this) {
            if (!this.f20448 && this.f20446 == c13425) {
                try {
                    this.f20447.execute(new Runnable() { // from class: l.ܳ᩹᩸
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5968.m17378(this.f50926, c13425);
                        }
                    });
                } catch (RuntimeException e) {
                    m17380(c13425, e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17378(C5968 c5968, C13425 c13425) {
        Throwable th;
        Long lValueOf;
        Throwable th2;
        Long l2;
        C13425 c13426;
        boolean zM17381;
        synchronized (c5968) {
            if (!c5968.f20448 && c5968.f20446 == c13425) {
                c13425.f42757 = true;
                try {
                    long jM14448 = c13425.f42754.m14448(c5968.f20455, c5968.f20456);
                    lValueOf = Long.valueOf(jM14448);
                    try {
                        if (c5968.f20451 != null) {
                            c5968.f20452.m41117(jM14448).m52947();
                            c5968.f20451.m34013(c5968.f20449, c13425.f42754.m14456(), c13425.f42754.m14453(), c13425.f42754.m14452(), c13425.f42754.m14450());
                        }
                        if (c13425.f42755) {
                            c5968.f20452.m41117(jM14448).m52947();
                            C4631 c4631 = c13425.f42754;
                            try {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(c4631.m14449());
                                C5090 c5090M29072 = C11557.m29072(c5968.f20458, c5968.f20452.m41104());
                                if (c5090M29072 != null) {
                                    arrayList.add(c5090M29072);
                                }
                                C5090.m15391(c5968.f20455, c5968.f20458, arrayList);
                                c5968.f20457 = null;
                            } catch (IOException e) {
                                c5968.f20457 = e;
                            }
                        }
                        c13425.f42754.close();
                        l2 = lValueOf;
                        th2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                        c13425.f42754.close();
                        th2 = th;
                        l2 = lValueOf;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    lValueOf = null;
                }
                synchronized (c5968) {
                    c13426 = c5968.f20459;
                    c5968.f20459 = null;
                    c5968.f20446 = c13426;
                    zM17381 = c5968.m17381();
                }
                if (zM17381) {
                    c5968.f20450.m52935((Object) null);
                }
                if (th2 == null) {
                    c13425.f42756.m52935(l2);
                } else {
                    c13425.f42756.m52937(th2);
                }
                if (c13426 != null) {
                    c5968.m17382(c13426);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17380(C13425 c13425, RuntimeException runtimeException) {
        synchronized (this) {
            C13425 c13426 = this.f20446;
            if (c13426 != c13425) {
                return;
            }
            C13425 c13427 = this.f20459;
            this.f20459 = null;
            this.f20446 = null;
            this.f20453 = 1 + (c13427 == null ? 0 : 1) + this.f20453;
            m17379(c13426);
            if (c13427 != null) {
                m17379(c13427);
            }
            c13426.f42756.m52937((Throwable) runtimeException);
            if (c13427 != null) {
                c13427.f42756.m52937((Throwable) runtimeException);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m17383() {
        C13425 c13425;
        C13425 c13426;
        C13425 c13427;
        boolean zM17381;
        synchronized (this) {
            this.f20448 = true;
            c13425 = this.f20446;
            c13426 = this.f20459;
            this.f20459 = null;
            if (c13425 == null || c13425.f42757) {
                c13427 = c13425;
                c13425 = null;
            } else {
                this.f20446 = null;
                c13427 = null;
            }
            this.f20453 = (c13425 == null ? 0 : 1) + (c13426 == null ? 0 : 1) + this.f20453;
        }
        if (c13425 != null) {
            m17379(c13425);
        }
        if (c13426 != null) {
            m17379(c13426);
        }
        if (c13427 != null) {
            c13427.f42754.close();
        }
        synchronized (this) {
            zM17381 = m17381();
        }
        if (zM17381) {
            this.f20450.m52935((Object) null);
        }
        if (c13425 != null) {
            this.f20450.m52930((Runnable) new RunnableC19635(1, c13425));
        }
        if (c13426 != null) {
            this.f20450.m52930((Runnable) new RunnableC19635(1, c13426));
        }
        return this.f20450.m52949((InterfaceC25138) new C2764(0));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m17381() {
        return this.f20448 && this.f20446 == null && this.f20459 == null && this.f20453 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17379(C13425 c13425) {
        boolean zM17381;
        c13425.f42754.close();
        synchronized (this) {
            this.f20453--;
            zM17381 = m17381();
        }
        if (zM17381) {
            this.f20450.m52935((Object) null);
        }
    }
}
