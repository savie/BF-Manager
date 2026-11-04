package l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.֡ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6KI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0149 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f1130 = Executors.newFixedThreadPool(2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16644 f1131;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f1132;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3878 f1133;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C11983 f1134;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18048 f1135;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17390 f1136;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f1137;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f1138;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f1139;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Executor f1140;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f1141;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1336(final C0149 c0149, final C18048 c18048) {
        c0149.getClass();
        final C11983 c11983M7455 = null;
        try {
            if (!c18048.f59092) {
                if (c18048.f59090 == 4) {
                    c11983M7455 = c18048.f59095.mo2785(c18048.f59091, c18048.f59094, c18048.f59093);
                } else {
                    c11983M7455 = ((C2166) c18048.f59095).m7455(c18048.f59094, c18048.f59093, false);
                }
            }
        } catch (Throwable unused) {
        }
        C3878 c3878 = c0149.f1133;
        Runnable runnable = new Runnable() { // from class: l.ܰۗܳ
            @Override // java.lang.Runnable
            public final void run() {
                C0149.m1337(this.f45184, c18048, c11983M7455);
            }
        };
        c3878.getClass();
        C21576.m49068(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1337(C0149 c0149, C18048 c18048, C11983 c11983) {
        c0149.getClass();
        if (c18048.f59089 != c0149.f1138) {
            if (c0149.f1135 == c18048) {
                c0149.f1135 = null;
                c0149.f1134 = null;
                c0149.f1139 = false;
            }
        } else {
            c0149.f1134 = c11983;
            c0149.f1139 = true;
        }
        c0149.f1131.accept(0L);
    }

    public C0149(C16644 c16644, C17390 c17390) {
        C3878 c3878 = new C3878();
        this.f1141 = new IdentityHashMap();
        this.f1132 = Collections.EMPTY_LIST;
        this.f1140 = f1130;
        this.f1133 = c3878;
        this.f1131 = c16644;
        this.f1136 = c17390;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1339() {
        this.f1138++;
        this.f1132 = Collections.EMPTY_LIST;
        this.f1141.clear();
        this.f1137 = 0L;
        C18048 c18048 = this.f1135;
        if (c18048 != null) {
            c18048.f59092 = true;
        }
        if (this.f1139) {
            this.f1135 = null;
            this.f1134 = null;
            this.f1139 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:88:0x0159  */
    /* JADX WARN: Code duplicated, block: B:90:0x015f A[EDGE_INSN: B:90:0x015f->B:93:0x0193 BREAK  A[LOOP:2: B:69:0x0116->B:86:0x0154]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1340(List list, int i, AbstractC7364 abstractC7364, InterfaceC0895 interfaceC0895, int i2, long j) {
        int i3;
        long j2;
        C11983 c11983M7455;
        if (this.f1132 != list) {
            this.f1132 = list;
            this.f1141.keySet().retainAll(list);
        }
        int iMin = Math.min(i, list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) list.get(i4);
            C21032 c21032 = (C21032) this.f1141.get(interfaceC2386);
            if (c21032 == null) {
                c21032 = new C21032(0);
                this.f1141.put(interfaceC2386, c21032);
            }
            if (i4 >= iMin) {
                c21032.f67206 = -1L;
            } else if (c21032.f67206 < 0) {
                c21032.f67206 = j;
            }
        }
        C18048 c18048 = this.f1135;
        if (c18048 != null) {
            if (list.contains(c18048.f59094)) {
                C18048 c18049 = this.f1135;
                if (c18049.f59095 == interfaceC0895) {
                    if (c18049.f59091 != abstractC7364) {
                    }
                }
                this.f1135.f59092 = true;
            } else {
                this.f1135.f59092 = true;
            }
        }
        if (this.f1139) {
            C18048 c180410 = this.f1135;
            C11983 c11983 = this.f1134;
            this.f1135 = null;
            this.f1134 = null;
            this.f1139 = false;
            if (c180410.f59092 || c180410.f59089 != this.f1138) {
                C21032 c21033 = (C21032) this.f1141.get(c180410.f59094);
                if (c21033 != null) {
                    c21033.f67205 = 0;
                }
            } else if (c11983 != null) {
                InterfaceC2386 interfaceC2387 = c180410.f59094;
                C11983 icon = interfaceC2387.getIcon();
                interfaceC2387.mo8094(c11983);
                if (icon != c11983) {
                    this.f1136.n(interfaceC2387);
                }
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < iMin; i6++) {
            InterfaceC2386 interfaceC2388 = (InterfaceC2386) list.get(i6);
            int iMo8108 = interfaceC2388.mo8108();
            if (iMo8108 != 0 && !m1338(interfaceC2388, 1)) {
                ((C21032) this.f1141.get(interfaceC2388)).f67205 |= 1;
                try {
                    c11983M7455 = ((C2166) interfaceC0895).m7455(interfaceC2388, iMo8108, true);
                } catch (Throwable unused) {
                    c11983M7455 = null;
                }
                if (c11983M7455 != null) {
                    C11983 icon2 = interfaceC2388.getIcon();
                    interfaceC2388.mo8094(c11983M7455);
                    if (icon2 != c11983M7455) {
                        this.f1136.n(interfaceC2388);
                    }
                    i5++;
                    if (i5 == 2) {
                        this.f1131.accept(0L);
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (this.f1135 != null) {
            return;
        }
        if (i2 != 2) {
            iMin = list.size();
        }
        long jMin = C25227.FOREVER_NS;
        for (int i7 = 0; i7 < iMin; i7++) {
            InterfaceC2386 interfaceC2389 = (InterfaceC2386) list.get(i7);
            int iMo8109 = interfaceC2389.mo8108();
            if (iMo8109 != 0) {
                if (i2 == 2) {
                    if (m1338(interfaceC2389, 2)) {
                        if (!m1338(interfaceC2389, 4)) {
                            long j3 = ((C21032) this.f1141.get(interfaceC2389)).f67206 + 120;
                            if (j < j3) {
                                jMin = Math.min(jMin, j3);
                            }
                        }
                        i3 = 4;
                        if (!m1338(interfaceC2389, i3)) {
                            if (i2 == 2) {
                                j2 = this.f1137;
                                if (j < j2) {
                                    jMin = Math.min(jMin, j2);
                                    break;
                                }
                            }
                            ((C21032) this.f1141.get(interfaceC2389)).f67205 |= i3;
                            final C18048 c180411 = new C18048(interfaceC2389, iMo8109, i3, abstractC7364, interfaceC0895, this.f1138);
                            this.f1135 = c180411;
                            this.f1137 = 80 + j;
                            this.f1140.execute(new Runnable() { // from class: l.᩺ۗܳ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0149.m1336(this.f77670, c180411);
                                }
                            });
                            return;
                        }
                    } else {
                        i3 = 2;
                        if (!m1338(interfaceC2389, i3)) {
                            if (i2 == 2) {
                                j2 = this.f1137;
                                if (j < j2) {
                                    jMin = Math.min(jMin, j2);
                                    break;
                                }
                            }
                            ((C21032) this.f1141.get(interfaceC2389)).f67205 |= i3;
                            final C18048 c180412 = new C18048(interfaceC2389, iMo8109, i3, abstractC7364, interfaceC0895, this.f1138);
                            this.f1135 = c180412;
                            this.f1137 = 80 + j;
                            this.f1140.execute(new Runnable() { // from class: l.᩺ۗܳ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0149.m1336(this.f77670, c180412);
                                }
                            });
                            return;
                        }
                    }
                } else {
                    i3 = 4;
                    if (!m1338(interfaceC2389, i3)) {
                        if (i2 == 2) {
                            j2 = this.f1137;
                            if (j < j2) {
                                jMin = Math.min(jMin, j2);
                                break;
                            }
                        }
                        ((C21032) this.f1141.get(interfaceC2389)).f67205 |= i3;
                        final C18048 c180413 = new C18048(interfaceC2389, iMo8109, i3, abstractC7364, interfaceC0895, this.f1138);
                        this.f1135 = c180413;
                        this.f1137 = 80 + j;
                        this.f1140.execute(new Runnable() { // from class: l.᩺ۗܳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0149.m1336(this.f77670, c180413);
                            }
                        });
                        return;
                    }
                }
            }
        }
        if (jMin != C25227.FOREVER_NS) {
            this.f1131.accept(jMin - j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m1338(InterfaceC2386 interfaceC2386, int i) {
        return (((C21032) this.f1141.get(interfaceC2386)).f67205 & i) != 0;
    }
}
