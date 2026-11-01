package l;

import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.᩻ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96RH */
/* JADX INFO: loaded from: classes2.dex */
public final class C23464 extends C19186 {

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f75976 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final C20346 f75977;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final C1254 f75978;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final C10058 f75979;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f75980;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3453 f75981;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 f75982;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f75983;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f75984;

    @Override // l.C19186, l.InterfaceC2916
    /* JADX INFO: renamed from: ܺۙ */
    public final boolean mo8731() {
        return true;
    }

    public C23464(C1254 c1254, AbstractC20745 abstractC20745, InterfaceC3800 interfaceC3800, C20346 c20346) {
        super(c1254);
        this.f75982 = new FutureC12075();
        this.f75981 = InterfaceC3453.f12707;
        this.f75977 = c20346;
        this.f75978 = c1254;
        this.f75980 = abstractC20745;
        this.f75983 = interfaceC3800;
        if (c1254.m4561() == 0) {
            c1254.m4524(16777216L);
        }
        this.f75979 = new C10058(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3800 m51709(AbstractC20745 abstractC20745) {
        return C12974.of(abstractC20745.mo33986() + ".editable2", new String[0]).toAbsolutePath().normalize();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51711(AbstractC20745 abstractC20745) {
        return this.f75983.equals(m51709(abstractC20745));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C23464 m51704(AbstractC20745 abstractC20745) {
        C1254 c1254M4495;
        InterfaceC3800 interfaceC3800M51709 = m51709(abstractC20745);
        ConcurrentMapC13783 concurrentMapC13783 = f75976;
        C23464 c23464 = (C23464) concurrentMapC13783.get(interfaceC3800M51709);
        if (c23464 != null) {
            if (!c23464.f75984) {
                throw new IOException("Text storage is already in use");
            }
            m51707(c23464.f75982);
        }
        C20346 c20346M45910 = C20346.m45910(interfaceC3800M51709);
        try {
            m51707(c20346M45910.m45913());
            C5212.createDirectories(interfaceC3800M51709.getParent(), new InterfaceC20030[0]);
            if (C5212.exists(interfaceC3800M51709, new EnumC22146[0])) {
                C5488 c5488M4516 = C1254.m4516(interfaceC3800M51709, C13312.m32819(), C13312.m32820());
                try {
                    c1254M4495 = c5488M4516.m15175();
                    try {
                        c5488M4516.close();
                    } catch (IOException e) {
                        e = e;
                        try {
                            if (c1254M4495 != null) {
                                try {
                                    c1254M4495.close();
                                } catch (IOException e2) {
                                    e.addSuppressed(e2);
                                }
                            }
                            throw e;
                        } finally {
                            c20346M45910.m45914((Throwable) null);
                        }
                    } catch (Error e3) {
                        e = e3;
                        if (c1254M4495 != null) {
                            c1254M4495.close();
                        }
                        throw e;
                    } catch (RuntimeException e4) {
                        e = e4;
                        if (c1254M4495 != null) {
                            c1254M4495.close();
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        c5488M4516.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                c1254M4495 = C1254.m4495(interfaceC3800M51709, C13312.m32819(), C13312.m32820());
            }
            C23464 c23465 = new C23464(c1254M4495, abstractC20745, interfaceC3800M51709, c20346M45910);
            concurrentMapC13783.put(interfaceC3800M51709, c23465);
            return c23465;
        } catch (IOException | Error | RuntimeException e5) {
            e = e5;
            c1254M4495 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23464 m51706(C17367 c17367, InterfaceC3453 interfaceC3453) {
        if (c17367.readInt() != -500018348) {
            throw new IllegalArgumentException("Invalid stored text magic");
        }
        if (interfaceC3453 == null) {
            interfaceC3453 = InterfaceC3453.f12707;
        }
        try {
            AbstractC20745 abstractC20745Mo4306 = interfaceC3453.mo4306(c17367.m40442());
            if (!C5212.isDirectory(m51709(abstractC20745Mo4306), new EnumC22146[0])) {
                throw new IOException("Text storage is missing");
            }
            C23464 c23464M51704 = m51704(abstractC20745Mo4306);
            c23464M51704.f75981 = interfaceC3453;
            return c23464M51704;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m51705(C17367 c17367, AbstractC20745 abstractC20745) {
        if (c17367.readInt() != -500018348) {
            throw new IllegalArgumentException("Invalid stored text magic");
        }
        String strM40442 = c17367.m40442();
        if (abstractC20745 == null) {
            abstractC20745 = InterfaceC3453.f12707.mo4306(strM40442);
        }
        InterfaceC3800 interfaceC3800M51709 = m51709(abstractC20745);
        C23464 c23464 = (C23464) f75976.get(interfaceC3800M51709);
        if (c23464 != null && !c23464.f75984) {
            C6276 c6276M27989 = c23464.m27989();
            try {
                String string = c6276M27989.toString();
                c6276M27989.close();
                return string;
            } catch (Throwable th) {
                try {
                    c6276M27989.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C20346 c20346M45910 = C20346.m45910(interfaceC3800M51709);
        try {
            try {
                m51707(c20346M45910.m45913());
                C5488 c5488M4516 = C1254.m4516(interfaceC3800M51709, C13312.m32819(), C13312.m32820());
                try {
                    C6276 c6276M15172 = c5488M4516.m15172();
                    try {
                        String string2 = c6276M15172.toString();
                        c6276M15172.close();
                        c5488M4516.close();
                        c20346M45910.m45914((Throwable) null);
                        return string2;
                    } catch (Throwable th3) {
                        try {
                            c6276M15172.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c5488M4516.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                c20346M45910.m45914((Throwable) null);
                throw th7;
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // l.C19186, l.InterfaceC2916
    /* JADX INFO: renamed from: ۙ */
    public final void mo8721(InterfaceC3453 interfaceC3453) {
        if (interfaceC3453 == null) {
            interfaceC3453 = InterfaceC3453.f12707;
        }
        this.f75981 = interfaceC3453;
    }

    @Override // l.C19186, l.InterfaceC2916
    /* JADX INFO: renamed from: ۙ */
    public final void mo8722(C11018 c11018) {
        m51713();
        c11018.writeInt(-500018348);
        c11018.m27782((CharSequence) this.f75981.mo4305(this.f75980));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m51713() {
        try {
            C1254 c1254 = this.f75978;
            m51707(c1254.m4551(c1254.m4523()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // l.C19186, l.InterfaceC2916
    /* JADX INFO: renamed from: ܶܰ */
    public final void mo8730() {
        this.f75978.m4557();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m51712() {
        this.f75984 = true;
        this.f75979.close();
    }

    @Override // l.C19186, l.C11092, java.lang.AutoCloseable
    public final void close() {
        m51712();
        super.close();
    }

    @Override // l.C19186
    /* JADX INFO: renamed from: ᩳ */
    public final void mo44047() {
        super.mo44047();
        this.f75978.m4559().m30016(new InterfaceC7486() { // from class: l.ܿۙۚ
            @Override // l.InterfaceC7486
            /* JADX INFO: renamed from: ܰ */
            public final void mo2142(Object obj, Throwable th) {
                C23464.m51708(this.f54581, th);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51708(C23464 c23464, Throwable th) {
        FutureC12075 futureC12075 = c23464.f75982;
        f75976.remove(c23464.f75983, c23464);
        c23464.f75977.m45914(th);
        if (th == null) {
            futureC12075.m30019((Object) null);
        } else {
            futureC12075.m30021(th);
        }
    }

    @Override // l.C11092, l.InterfaceC2916
    /* JADX INFO: renamed from: ۙ */
    public final void mo8723(boolean z) {
        close();
        if (z) {
            try {
                m51707(this.f75982);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    @Override // l.C19186, l.InterfaceC2916
    /* JADX INFO: renamed from: ᩶ۙ */
    public final void mo8734() {
        close();
        m51707(this.f75982);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static FutureC12075 m51710(AbstractC20745 abstractC20745) {
        InterfaceC3800 interfaceC3800M51709 = m51709(abstractC20745);
        final C20346 c20346M45910 = C20346.m45910(interfaceC3800M51709);
        return c20346M45910.m45913().m30031(new RunnableC5824(0, interfaceC3800M51709, abstractC20745), C4716.f16635).m30016(new InterfaceC7486() { // from class: l.ۧۙۚ
            @Override // l.InterfaceC7486
            /* JADX INFO: renamed from: ܰ */
            public final void mo2142(Object obj, Throwable th) {
                c20346M45910.m45914(th);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51707(FutureC12075 futureC12075) throws IOException {
        try {
            futureC12075.m30027();
        } catch (C17013 e) {
            throw new IOException("Text storage persistence failed", e.getCause());
        }
    }
}
