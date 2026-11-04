package l;

import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.᩺ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96RH */
/* JADX INFO: loaded from: classes2.dex */
public final class C24238 extends C13378 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f78496 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final C8950 f78497;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C17505 f78498;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f78499;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C1863 f78500;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f78501;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 f78502;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19459 f78503;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f78504;

    @Override // l.C13378, l.InterfaceC19106
    /* JADX INFO: renamed from: ܰۙ */
    public final boolean mo11042() {
        return true;
    }

    public C24238(C17505 c17505, AbstractC22044 abstractC22044, InterfaceC24329 interfaceC24329, C8950 c8950) {
        super(c17505);
        this.f78502 = new FutureC23690();
        this.f78503 = InterfaceC19459.f62864;
        this.f78497 = c8950;
        this.f78498 = c17505;
        this.f78499 = abstractC22044;
        this.f78501 = interfaceC24329;
        if (c17505.m41116() == 0) {
            c17505.m41122(16777216L);
        }
        this.f78500 = new C1863(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC24329 m54224(AbstractC22044 abstractC22044) {
        return C6429.of(abstractC22044.mo4294() + ".editable2", new String[0]).toAbsolutePath().normalize();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54228(AbstractC22044 abstractC22044) {
        return this.f78501.equals(m54224(abstractC22044));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C24238 m54226(AbstractC22044 abstractC22044) {
        C17505 c17505M41054;
        InterfaceC24329 interfaceC24329M54224 = m54224(abstractC22044);
        ConcurrentMapC17249 concurrentMapC17249 = f78496;
        C24238 c24238 = (C24238) concurrentMapC17249.get(interfaceC24329M54224);
        if (c24238 != null) {
            if (!c24238.f78504) {
                throw new IOException("Text storage is already in use");
            }
            m54222(c24238.f78502);
        }
        C8950 c8950M23922 = C8950.m23922(interfaceC24329M54224);
        try {
            m54222(c8950M23922.m23934());
            C3445.createDirectories(interfaceC24329M54224.getParent(), new InterfaceC13885[0]);
            if (C3445.exists(interfaceC24329M54224, new EnumC20599[0])) {
                C24965 c24965M41079 = C17505.m41079(interfaceC24329M54224, C19304.m44676(), C19304.m44677());
                try {
                    c17505M41054 = c24965M41079.m55769();
                    try {
                        c24965M41079.close();
                    } catch (IOException e) {
                        e = e;
                        try {
                            if (c17505M41054 != null) {
                                try {
                                    c17505M41054.close();
                                } catch (IOException e2) {
                                    e.addSuppressed(e2);
                                }
                            }
                            throw e;
                        } finally {
                            c8950M23922.m23931((Throwable) null);
                        }
                    } catch (Error e3) {
                        e = e3;
                        if (c17505M41054 != null) {
                            c17505M41054.close();
                        }
                        throw e;
                    } catch (RuntimeException e4) {
                        e = e4;
                        if (c17505M41054 != null) {
                            c17505M41054.close();
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        c24965M41079.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                c17505M41054 = C17505.m41054(interfaceC24329M54224, C19304.m44676(), C19304.m44677());
            }
            C24238 c24239 = new C24238(c17505M41054, abstractC22044, interfaceC24329M54224, c8950M23922);
            concurrentMapC17249.put(interfaceC24329M54224, c24239);
            return c24239;
        } catch (IOException | Error | RuntimeException e5) {
            e = e5;
            c17505M41054 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24238 m54221(C20348 c20348, InterfaceC19459 interfaceC19459) {
        if (c20348.readInt() != -500018348) {
            throw new IllegalArgumentException("Invalid stored text magic");
        }
        if (interfaceC19459 == null) {
            interfaceC19459 = InterfaceC19459.f62864;
        }
        try {
            AbstractC22044 abstractC22044Mo19331 = interfaceC19459.mo19331(c20348.m46756());
            if (!C3445.isDirectory(m54224(abstractC22044Mo19331), new EnumC20599[0])) {
                throw new IOException("Text storage is missing");
            }
            C24238 c24238M54226 = m54226(abstractC22044Mo19331);
            c24238M54226.f78503 = interfaceC19459;
            return c24238M54226;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54220(C20348 c20348, AbstractC22044 abstractC22044) {
        if (c20348.readInt() != -500018348) {
            throw new IllegalArgumentException("Invalid stored text magic");
        }
        String strM46756 = c20348.m46756();
        if (abstractC22044 == null) {
            abstractC22044 = InterfaceC19459.f62864.mo19331(strM46756);
        }
        InterfaceC24329 interfaceC24329M54224 = m54224(abstractC22044);
        C24238 c24238 = (C24238) f78496.get(interfaceC24329M54224);
        if (c24238 != null && !c24238.f78504) {
            C7305 c7305M15346 = c24238.m15346();
            try {
                String string = c7305M15346.toString();
                c7305M15346.close();
                return string;
            } catch (Throwable th) {
                try {
                    c7305M15346.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C8950 c8950M23922 = C8950.m23922(interfaceC24329M54224);
        try {
            try {
                m54222(c8950M23922.m23934());
                C24965 c24965M41079 = C17505.m41079(interfaceC24329M54224, C19304.m44676(), C19304.m44677());
                try {
                    C7305 c7305M55767 = c24965M41079.m55767();
                    try {
                        String string2 = c7305M55767.toString();
                        c7305M55767.close();
                        c24965M41079.close();
                        c8950M23922.m23931((Throwable) null);
                        return string2;
                    } catch (Throwable th3) {
                        try {
                            c7305M55767.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c24965M41079.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                c8950M23922.m23931((Throwable) null);
                throw th7;
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // l.C13378, l.InterfaceC19106
    /* JADX INFO: renamed from: ۙ */
    public final void mo11038(InterfaceC19459 interfaceC19459) {
        if (interfaceC19459 == null) {
            interfaceC19459 = InterfaceC19459.f62864;
        }
        this.f78503 = interfaceC19459;
    }

    @Override // l.C13378, l.InterfaceC19106
    /* JADX INFO: renamed from: ۙ */
    public final void mo11037(C6178 c6178) {
        m54229();
        c6178.writeInt(-500018348);
        c6178.m17786((CharSequence) this.f78503.mo19330(this.f78499));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m54229() {
        try {
            C17505 c17505 = this.f78498;
            m54222(c17505.m41117(c17505.m41105()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // l.C13378, l.InterfaceC19106
    /* JADX INFO: renamed from: ܺ᩷ */
    public final void mo11045() {
        this.f78498.m41114();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m54227() {
        this.f78504 = true;
        this.f78500.close();
    }

    @Override // l.C13378, l.C5068, java.lang.AutoCloseable
    public final void close() {
        m54227();
        super.close();
    }

    @Override // l.C13378
    /* JADX INFO: renamed from: ܶ */
    public final void mo32985() {
        super.mo32985();
        this.f78498.m41124().m52931((InterfaceC2017) new C13809(1, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m54223(C24238 c24238, Throwable th) {
        FutureC23690 futureC23690 = c24238.f78502;
        f78496.remove(c24238.f78501, c24238);
        c24238.f78497.m23931(th);
        if (th == null) {
            futureC23690.m52935((Object) null);
        } else {
            futureC23690.m52937(th);
        }
    }

    @Override // l.C5068, l.InterfaceC19106
    /* JADX INFO: renamed from: ۙ */
    public final void mo11039(boolean z) {
        close();
        if (z) {
            try {
                m54222(this.f78502);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    @Override // l.C13378, l.InterfaceC19106
    /* JADX INFO: renamed from: ᩶ۙ */
    public final void mo11049() {
        close();
        m54222(this.f78502);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static FutureC23690 m54225(AbstractC22044 abstractC22044) {
        InterfaceC24329 interfaceC24329M54224 = m54224(abstractC22044);
        C8950 c8950M23922 = C8950.m23922(interfaceC24329M54224);
        return c8950M23922.m23934().m52948(new RunnableC5470(2, interfaceC24329M54224, abstractC22044), C5261.f18538).m52931((InterfaceC2017) new C6338(c8950M23922));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54222(FutureC23690 futureC23690) throws IOException {
        try {
            futureC23690.m52947();
        } catch (C3552 e) {
            throw new IOException("Text storage persistence failed", e.getCause());
        }
    }
}
