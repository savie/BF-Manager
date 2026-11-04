package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6HV */
/* JADX INFO: loaded from: classes3.dex */
public final class C0446 extends AbstractC16700 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524()) {
            return;
        }
        m2268(c2551);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m2268(C2551 c2551) {
        C24466 c24466;
        C9804 c9804 = new C9804(null, c2551);
        for (C21943 c21943 : c2551.m8508()) {
            c9804.m25548(c21943);
            for (C18959 c18959 : (ArrayList) c21943.mo1986()) {
                if (c18959.getType() == EnumC24203.MOVE) {
                    C6041 c6041M44027 = c18959.m44027();
                    AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
                    if (!c6041M44027.m17535(abstractC16481Mo44035)) {
                        abstractC16481Mo44035.getClass();
                        boolean z = abstractC16481Mo44035 instanceof C6041;
                        if (!z || !((C6041) abstractC16481Mo44035).m17530().m41953()) {
                            C17973 c17973M17530 = c6041M44027.m17530();
                            if (!c17973M17530.m41946().isEmpty()) {
                                if (!c17973M17530.m41947()) {
                                    C11457 c11457 = C11457.f36008;
                                    C24466 c24467 = (C24466) abstractC16481Mo44035.mo17862((InterfaceC2157) c11457);
                                    Iterator it = c17973M17530.m41946().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            C6041 c6041 = (C6041) it.next();
                                            if (c6041.m39118() == null) {
                                                break;
                                            } else if (c24467 == null && (c24466 = (C24466) c6041.mo17862((InterfaceC2157) c11457)) != null) {
                                                c24467 = c24466;
                                            }
                                        } else {
                                            for (C6041 c6042 : new ArrayList(c17973M17530.m41946())) {
                                                C18959 c18959M39118 = c6042.m39118();
                                                if (c18959M39118 != null) {
                                                    AbstractC16481 abstractC16481M17533 = z ? ((C6041) abstractC16481Mo44035).m17533(c6042.m17531()) : abstractC16481Mo44035.mo17528();
                                                    c18959M39118.m44021(c18959);
                                                    abstractC16481M17533.m39414((AbstractC16678) c6042);
                                                    if (c24467 != null) {
                                                        abstractC16481M17533.mo17864(c24467);
                                                    }
                                                    if (!c18959M39118.mo14762(c6042, abstractC16481M17533)) {
                                                        c2551.m31138("Failed to replace arg in insn: " + c18959M39118);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c9804.m25544(c18959);
                    break;
                }
            }
            c9804.m25543();
        }
    }
}
