package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6F5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9241 extends AbstractC16700 {
    /* JADX WARN: Code duplicated, block: B:101:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:110:0x024c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0254  */
    /* JADX WARN: Code duplicated, block: B:144:0x031d A[EDGE_INSN: B:144:0x031d->B:145:0x031e BREAK  A[LOOP:5: B:119:0x0289->B:189:?]] */
    /* JADX WARN: Code duplicated, block: B:146:0x0320  */
    /* JADX WARN: Code duplicated, block: B:147:0x0327  */
    /* JADX WARN: Code duplicated, block: B:156:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c3  */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        boolean z;
        AbstractC16481 abstractC16481Mo13131;
        AbstractC1566 abstractC1566M10936;
        C6787 c6787;
        C2551 c2551M5668;
        C6787 c6788;
        C6041 c6041M44027;
        C18959 c18959M17529;
        C18959 c18959M24429;
        C6787 c6789;
        C21943 c21943M52163;
        C21943 c21943M52187;
        C18959 c18959M39118;
        C2551 c2551M55570;
        C18959 c18959M41951;
        if (c2551.m8524()) {
            return;
        }
        C18959 c18959 = null;
        C9804 c9804 = new C9804(null, c2551);
        int i = 0;
        boolean z2 = false;
        for (C21943 c21943 : c2551.m8508()) {
            int size = ((ArrayList) c21943.mo1986()).size();
            int i2 = 0;
            while (i2 < size) {
                if (((C18959) ((ArrayList) c21943.mo1986()).get(i2)).getType() == EnumC24203.INVOKE) {
                    C21219 c21219 = (C21219) ((ArrayList) c21943.mo1986()).get(i2);
                    C21965 c21965Mo18926 = c21219.mo18926();
                    if (c21965Mo18926.m49703()) {
                        C6041 c6041M17525 = (C6041) c21219.mo44035(i);
                        C18959 c18959M175210 = c6041M17525.m17529();
                        while (c18959M175210 != null && c18959M175210.getType() == EnumC24203.MOVE) {
                            AbstractC16481 abstractC16481Mo44035 = c18959M175210.mo44035(i);
                            abstractC16481Mo44035.getClass();
                            c18959M175210 = abstractC16481Mo44035 instanceof C6041 ? ((C6041) abstractC16481Mo44035).m17529() : c18959;
                        }
                        if (c18959M175210 != null && c18959M175210.getType() == EnumC24203.NEW_INSTANCE && C8314.m22407(c2551)) {
                            Iterator it = c18959M175210.m44027().m17530().m41946().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    C18959 c18959M39119 = ((C6041) it.next()).m39118();
                                    if (c18959M39119 != null && (c18959M39119.getType() == EnumC24203.MOVE || c18959M39119.getType() == EnumC24203.PHI || ((c18959M39119 instanceof C21219) && ((C21219) c18959M39119).mo18926().m49703() && !C8314.m22409(c2551, c18959M175210, c18959M39119)))) {
                                    }
                                } else {
                                    abstractC16481Mo13131 = c21219.mo13131();
                                    if (abstractC16481Mo13131 == null) {
                                        abstractC1566M10936 = null;
                                    } else {
                                        abstractC1566M10936 = null;
                                    }
                                    if (abstractC1566M10936 != null) {
                                        c21965Mo18926 = C21965.m49691(c2551.mo8527(), C1345.m4955(c2551.mo8527(), abstractC1566M10936), c21965Mo18926.getName(), c21965Mo18926.m49702(), c21965Mo18926.m49698());
                                    }
                                    c6787 = new C6787(c2551, c21219, c21965Mo18926);
                                    if (!C8314.m22407(c2551)) {
                                        C24927 c24927M8536 = c2551.m8536();
                                        if (!c6787.m18922()) {
                                        }
                                    }
                                    c6787.m44021(c21219);
                                    c6041M17525.m17530().m41933(c6041M17525);
                                    if (c6787.m18925()) {
                                        c18959M17529 = c6041M17525.m17529();
                                        if (c18959M17529 != null) {
                                            if (c18959M17529.getType() == EnumC24203.CONSTRUCTOR) {
                                                c6789 = (C6787) c18959M17529;
                                                c21943M52163 = C23231.m52163(c2551, c6789, c2551.m8508());
                                                if (c21943M52163 != null) {
                                                    throw new C8597("Block not found by insn: " + c6789);
                                                }
                                                c21943M52187 = C23231.m52187(c2551, c21943, c21943M52163);
                                                if (c21943M52187 == null) {
                                                    C6041 c6041M17526 = c6041M17525.m17525(c2551);
                                                    ArrayList arrayListM52148 = C23231.m52148(c2551, c21943, true);
                                                    for (AbstractC16481 abstractC16481 : c6041M17525.m17530().m41946()) {
                                                        c18959M39118 = abstractC16481.m39118();
                                                        if (c18959M39118 == null) {
                                                        }
                                                    }
                                                    c6041M17525 = c6041M17526;
                                                } else {
                                                    c6041M17525 = c6041M17525.m17525(c2551);
                                                    C6041 c6041M44028 = c6789.m44027();
                                                    C6041 c6041M17527 = c6041M44028.m17525(c2551);
                                                    C18981 c18981M27766 = C10943.m27766(c2551, c21943M52187, c6041M44028.m17532());
                                                    c18981M27766.m44031(c6041M44028.mo17528());
                                                    c18981M27766.m44088(c6041M17525.mo17528(), C23231.m52206(c2551, c21943M52187, c21943));
                                                    c18981M27766.m44088(c6041M17527.mo17528(), C23231.m52206(c2551, c21943M52187, c21943M52163));
                                                    c18981M27766.mo14759();
                                                    c6789.m44031(c6041M17527.mo17528());
                                                    c6789.mo14759();
                                                }
                                            } else {
                                                c18959M24429 = m24429(c2551, c18959M17529, c9804, EnumC24203.NEW_INSTANCE);
                                                if (c18959M24429 != null) {
                                                    c6787.m44021(c18959M24429);
                                                    c18959M24429.mo17866(EnumC1763.REMOVE);
                                                    c9804.m25547(c18959M24429);
                                                }
                                            }
                                        }
                                        c6787.m44031(c6041M17525.mo17528());
                                    }
                                    c6787.mo14759();
                                    c2551M5668 = c2551.mo8527().m5668(c6787.mo18926());
                                    if (c2551M5668 == null) {
                                        c6788 = null;
                                        break;
                                    } else {
                                        c6788 = null;
                                        break;
                                    }
                                    if (c6788 != null) {
                                        c9804.m25544(c6787);
                                        C23231.m52172(c2551, c21943, i2, c6788);
                                    } else {
                                        C23231.m52172(c2551, c21943, i2, c6787);
                                    }
                                    z = true;
                                }
                                z = false;
                            }
                        } else {
                            abstractC16481Mo13131 = c21219.mo13131();
                            if (abstractC16481Mo13131 == null && (abstractC16481Mo13131 instanceof C6041) && (c18959M41951 = ((C6041) abstractC16481Mo13131).m17530().m41951()) != null && c18959M41951.getType() == EnumC24203.NEW_INSTANCE) {
                                abstractC1566M10936 = ((C3319) c18959M41951).m10936();
                            } else {
                                abstractC1566M10936 = null;
                            }
                            if (abstractC1566M10936 != null && !abstractC1566M10936.equals(c21965Mo18926.m49700().getType())) {
                                c21965Mo18926 = C21965.m49691(c2551.mo8527(), C1345.m4955(c2551.mo8527(), abstractC1566M10936), c21965Mo18926.getName(), c21965Mo18926.m49702(), c21965Mo18926.m49698());
                            }
                            c6787 = new C6787(c2551, c21219, c21965Mo18926);
                            if (!C8314.m22407(c2551)) {
                                C24927 c24927M8537 = c2551.m8536();
                                if ((!c6787.m18922() && c6787.m44039() == 0) || ((c6787.m18923() && c6787.m44039() == 0 && ((c2551M55570 = c24927M8537.m55570(c6787.mo18926().m49701())) == null || c2551M55570.m8524())) || (c24927M8537.mo17867(C11457.f36004) && c2551.m8509() && c6787.m18922()))) {
                                    c9804.m25544(c21219);
                                    z = false;
                                }
                            }
                            c6787.m44021(c21219);
                            c6041M17525.m17530().m41933(c6041M17525);
                            if (c6787.m18925()) {
                                c18959M17529 = c6041M17525.m17529();
                                if (c18959M17529 != null) {
                                    if (c18959M17529.getType() == EnumC24203.CONSTRUCTOR) {
                                        c6789 = (C6787) c18959M17529;
                                        c21943M52163 = C23231.m52163(c2551, c6789, c2551.m8508());
                                        if (c21943M52163 != null) {
                                            throw new C8597("Block not found by insn: " + c6789);
                                        }
                                        c21943M52187 = C23231.m52187(c2551, c21943, c21943M52163);
                                        if (c21943M52187 == null) {
                                            C6041 c6041M17528 = c6041M17525.m17525(c2551);
                                            ArrayList arrayListM52149 = C23231.m52148(c2551, c21943, true);
                                            while (r10.hasNext()) {
                                                c18959M39118 = abstractC16481.m39118();
                                                if (c18959M39118 == null && C23231.m52163(c2551, c18959M39118, arrayListM52149) != null) {
                                                    c18959M39118.mo14762(abstractC16481, c6041M17528.mo17528());
                                                }
                                            }
                                            c6041M17525 = c6041M17528;
                                        } else {
                                            c6041M17525 = c6041M17525.m17525(c2551);
                                            C6041 c6041M44029 = c6789.m44027();
                                            C6041 c6041M17529 = c6041M44029.m17525(c2551);
                                            C18981 c18981M27767 = C10943.m27766(c2551, c21943M52187, c6041M44029.m17532());
                                            c18981M27767.m44031(c6041M44029.mo17528());
                                            c18981M27767.m44088(c6041M17525.mo17528(), C23231.m52206(c2551, c21943M52187, c21943));
                                            c18981M27767.m44088(c6041M17529.mo17528(), C23231.m52206(c2551, c21943M52187, c21943M52163));
                                            c18981M27767.mo14759();
                                            c6789.m44031(c6041M17529.mo17528());
                                            c6789.mo14759();
                                        }
                                    } else {
                                        c18959M24429 = m24429(c2551, c18959M17529, c9804, EnumC24203.NEW_INSTANCE);
                                        if (c18959M24429 != null) {
                                            c6787.m44021(c18959M24429);
                                            c18959M24429.mo17866(EnumC1763.REMOVE);
                                            c9804.m25547(c18959M24429);
                                        }
                                    }
                                }
                                c6787.m44031(c6041M17525.mo17528());
                            }
                            c6787.mo14759();
                            c2551M5668 = c2551.mo8527().m5668(c6787.mo18926());
                            if (c2551M5668 == null && c2551M5668.mo8547().m26528()) {
                                Iterator it2 = c6787.m44026().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        C24927 c24927M5671 = c2551.mo8527().m5671(c2551M5668.m8536().m55571());
                                        if (c24927M5671 != null && (c6041M44027 = c6787.m44027()) != null) {
                                            boolean zMo17865 = c6041M44027.mo17865(EnumC1763.THIS);
                                            StringBuilder sb = new StringBuilder("<init>(");
                                            sb.append(zMo17865 ? C15186.m36535(c6041M44027.m17531()) : "");
                                            sb.append(")V");
                                            C2551 c2551M55571 = c24927M5671.m55570(sb.toString());
                                            if (c2551M55571 != null && !c2551M55571.equals(c2551M5668) && !c2551M55571.mo8547().m26528()) {
                                                c6788 = new C6787(c2551M55571.mo8532(), c6787.m18924());
                                                c6788.m44031(c6787.m44027().mo17528());
                                                c6788.m44021(c6787);
                                                break;
                                            }
                                            break;
                                        }
                                    } else {
                                        AbstractC16481 abstractC16482 = (AbstractC16481) it2.next();
                                        abstractC16482.getClass();
                                        if (!(abstractC16482 instanceof C23195) || ((C23195) abstractC16482).m52122() != 0) {
                                        }
                                    }
                                    c6788 = null;
                                    break;
                                }
                            }
                            c6788 = null;
                            break;
                            if (c6788 != null) {
                                c9804.m25544(c6787);
                                C23231.m52172(c2551, c21943, i2, c6788);
                            } else {
                                C23231.m52172(c2551, c21943, i2, c6787);
                            }
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    z2 |= z;
                }
                i2++;
                c18959 = null;
                i = 0;
            }
            c9804.m25546();
            c18959 = null;
            i = 0;
        }
        if (z2) {
            C0446.m2268(c2551);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m24429(C2551 c2551, C18959 c18959, C9804 c9804, EnumC24203 enumC24203) {
        if (c18959 == null) {
            return null;
        }
        EnumC24203 type = c18959.getType();
        if (type == enumC24203) {
            return c18959;
        }
        if (c18959.m39417()) {
            c9804.m25547(c18959);
        } else {
            C18959 c189510 = new C18959(EnumC24203.NOP, 0);
            Iterator it = c2551.m8508().iterator();
            while (it.hasNext() && !C23231.m52179(c2551, (C21943) it.next(), c18959, c189510)) {
            }
        }
        if (type == EnumC24203.MOVE) {
            return m24429(c2551, ((C6041) c18959.mo44035(0)).m17529(), c9804, enumC24203);
        }
        return null;
    }
}
