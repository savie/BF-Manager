package l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.֫֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S6KI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1501 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f6062 = Executors.newFixedThreadPool(2);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C10134 f6063;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Executor f6064;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C8723 f6065;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f6066;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f6067;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C14203 f6068;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C14600 f6069;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5735 f6070;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f6071;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f6072;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f6073;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5184(final C1501 c1501, final C14203 c14203) {
        c1501.getClass();
        final C14600 c14600M42379 = null;
        try {
            if (!c14203.f46584) {
                if (c14203.f46582 == 4) {
                    c14600M42379 = c14203.f46579.mo7925(c14203.f46578, c14203.f46583, c14203.f46581);
                } else {
                    c14600M42379 = ((C18225) c14203.f46579).m42379(c14203.f46583, c14203.f46581, false);
                }
            }
        } catch (Throwable unused) {
        }
        C5735 c5735 = c1501.f6070;
        Runnable runnable = new Runnable() { // from class: l.ۧ֨᩹
            @Override // java.lang.Runnable
            public final void run() {
                C1501.m5185(this.f36424, c14203, c14600M42379);
            }
        };
        c5735.getClass();
        C16737.m39273(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5185(C1501 c1501, C14203 c14203, C14600 c14600) {
        c1501.getClass();
        if (c14203.f46580 != c1501.f6067) {
            if (c1501.f6068 == c14203) {
                c1501.f6068 = null;
                c1501.f6069 = null;
                c1501.f6071 = false;
            }
        } else {
            c1501.f6069 = c14600;
            c1501.f6071 = true;
        }
        c1501.f6065.accept(0L);
    }

    public C1501(C8723 c8723, C10134 c10134) {
        C5735 c5735 = new C5735();
        this.f6073 = new IdentityHashMap();
        this.f6066 = Collections.EMPTY_LIST;
        this.f6064 = f6062;
        this.f6070 = c5735;
        this.f6065 = c8723;
        this.f6063 = c10134;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5187() {
        this.f6067++;
        this.f6066 = Collections.EMPTY_LIST;
        this.f6073.clear();
        this.f6072 = 0L;
        C14203 c14203 = this.f6068;
        if (c14203 != null) {
            c14203.f46584 = true;
        }
        if (this.f6071) {
            this.f6068 = null;
            this.f6069 = null;
            this.f6071 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:88:0x0159  */
    /* JADX WARN: Code duplicated, block: B:90:0x015f A[EDGE_INSN: B:90:0x015f->B:93:0x0193 BREAK  A[LOOP:2: B:69:0x0116->B:86:0x0154]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5188(List list, int i, AbstractC11462 abstractC11462, InterfaceC13848 interfaceC13848, int i2, long j) {
        int i3;
        long j2;
        C14600 c14600M42379;
        if (this.f6066 != list) {
            this.f6066 = list;
            this.f6073.keySet().retainAll(list);
        }
        int iMin = Math.min(i, list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) list.get(i4);
            C23375 c23375 = (C23375) this.f6073.get(interfaceC2557);
            if (c23375 == null) {
                c23375 = new C23375(0);
                this.f6073.put(interfaceC2557, c23375);
            }
            if (i4 >= iMin) {
                c23375.f75721 = -1L;
            } else if (c23375.f75721 < 0) {
                c23375.f75721 = j;
            }
        }
        C14203 c14203 = this.f6068;
        if (c14203 != null) {
            if (list.contains(c14203.f46583)) {
                C14203 c14204 = this.f6068;
                if (c14204.f46579 == interfaceC13848) {
                    if (c14204.f46578 != abstractC11462) {
                    }
                }
                this.f6068.f46584 = true;
            } else {
                this.f6068.f46584 = true;
            }
        }
        if (this.f6071) {
            C14203 c14205 = this.f6068;
            C14600 c14600 = this.f6069;
            this.f6068 = null;
            this.f6069 = null;
            this.f6071 = false;
            if (c14205.f46584 || c14205.f46580 != this.f6067) {
                C23375 c23376 = (C23375) this.f6073.get(c14205.f46583);
                if (c23376 != null) {
                    c23376.f75720 = 0;
                }
            } else if (c14600 != null) {
                InterfaceC2557 interfaceC2558 = c14205.f46583;
                C14600 icon = interfaceC2558.getIcon();
                interfaceC2558.mo7966(c14600);
                if (icon != c14600) {
                    this.f6063.n(interfaceC2558);
                }
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < iMin; i6++) {
            InterfaceC2557 interfaceC2559 = (InterfaceC2557) list.get(i6);
            int iMo7988 = interfaceC2559.mo7988();
            if (iMo7988 != 0 && !m5186(interfaceC2559, 1)) {
                ((C23375) this.f6073.get(interfaceC2559)).f75720 |= 1;
                try {
                    c14600M42379 = ((C18225) interfaceC13848).m42379(interfaceC2559, iMo7988, true);
                } catch (Throwable unused) {
                    c14600M42379 = null;
                }
                if (c14600M42379 != null) {
                    C14600 icon2 = interfaceC2559.getIcon();
                    interfaceC2559.mo7966(c14600M42379);
                    if (icon2 != c14600M42379) {
                        this.f6063.n(interfaceC2559);
                    }
                    i5++;
                    if (i5 == 2) {
                        this.f6065.accept(0L);
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (this.f6068 != null) {
            return;
        }
        if (i2 != 2) {
            iMin = list.size();
        }
        long jMin = C17492.FOREVER_NS;
        for (int i7 = 0; i7 < iMin; i7++) {
            InterfaceC2557 interfaceC25510 = (InterfaceC2557) list.get(i7);
            int iMo7989 = interfaceC25510.mo7988();
            if (iMo7989 != 0) {
                if (i2 == 2) {
                    if (m5186(interfaceC25510, 2)) {
                        if (!m5186(interfaceC25510, 4)) {
                            long j3 = ((C23375) this.f6073.get(interfaceC25510)).f75721 + 120;
                            if (j < j3) {
                                jMin = Math.min(jMin, j3);
                            }
                        }
                        i3 = 4;
                        if (!m5186(interfaceC25510, i3)) {
                            if (i2 == 2) {
                                j2 = this.f6072;
                                if (j < j2) {
                                    jMin = Math.min(jMin, j2);
                                    break;
                                }
                            }
                            ((C23375) this.f6073.get(interfaceC25510)).f75720 |= i3;
                            final C14203 c14206 = new C14203(interfaceC25510, iMo7989, i3, abstractC11462, interfaceC13848, this.f6067);
                            this.f6068 = c14206;
                            this.f6072 = 80 + j;
                            this.f6064.execute(new Runnable() { // from class: l.ܿ֨᩹
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1501.m5184(this.f54387, c14206);
                                }
                            });
                            return;
                        }
                    } else {
                        i3 = 2;
                        if (!m5186(interfaceC25510, i3)) {
                            if (i2 == 2) {
                                j2 = this.f6072;
                                if (j < j2) {
                                    jMin = Math.min(jMin, j2);
                                    break;
                                }
                            }
                            ((C23375) this.f6073.get(interfaceC25510)).f75720 |= i3;
                            final C14203 c14207 = new C14203(interfaceC25510, iMo7989, i3, abstractC11462, interfaceC13848, this.f6067);
                            this.f6068 = c14207;
                            this.f6072 = 80 + j;
                            this.f6064.execute(new Runnable() { // from class: l.ܿ֨᩹
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1501.m5184(this.f54387, c14207);
                                }
                            });
                            return;
                        }
                    }
                } else {
                    i3 = 4;
                    if (!m5186(interfaceC25510, i3)) {
                        if (i2 == 2) {
                            j2 = this.f6072;
                            if (j < j2) {
                                jMin = Math.min(jMin, j2);
                                break;
                            }
                        }
                        ((C23375) this.f6073.get(interfaceC25510)).f75720 |= i3;
                        final C14203 c14208 = new C14203(interfaceC25510, iMo7989, i3, abstractC11462, interfaceC13848, this.f6067);
                        this.f6068 = c14208;
                        this.f6072 = 80 + j;
                        this.f6064.execute(new Runnable() { // from class: l.ܿ֨᩹
                            @Override // java.lang.Runnable
                            public final void run() {
                                C1501.m5184(this.f54387, c14208);
                            }
                        });
                        return;
                    }
                }
            }
        }
        if (jMin != C17492.FOREVER_NS) {
            this.f6065.accept(jMin - j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m5186(InterfaceC2557 interfaceC2557, int i) {
        return (((C23375) this.f6073.get(interfaceC2557)).f75720 & i) != 0;
    }
}
