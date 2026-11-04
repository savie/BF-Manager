package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UIVK */
/* JADX INFO: loaded from: classes4.dex */
public final class C7347 extends AbstractC16700 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        m20164(c2551);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c8 A[EDGE_INSN: B:101:0x01c8->B:170:0x02f0 BREAK  A[LOOP:5: B:47:0x00ed->B:59:0x011a]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01fc A[LOOP:8: B:110:0x01f6->B:112:0x01fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x021b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0223  */
    /* JADX WARN: Code duplicated, block: B:128:0x0249  */
    /* JADX WARN: Code duplicated, block: B:135:0x0266  */
    /* JADX WARN: Code duplicated, block: B:137:0x026e  */
    /* JADX WARN: Code duplicated, block: B:141:0x027e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0292  */
    /* JADX WARN: Code duplicated, block: B:149:0x029e  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:158:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:162:0x02cb A[EDGE_INSN: B:162:0x02cb->B:163:0x02cc BREAK  A[LOOP:9: B:114:0x0215->B:225:0x0215]] */
    /* JADX WARN: Code duplicated, block: B:164:0x02ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02d0 A[EDGE_INSN: B:165:0x02d0->B:170:0x02f0 BREAK  A[LOOP:5: B:47:0x00ed->B:59:0x011a]] */
    /* JADX WARN: Code duplicated, block: B:166:0x02d4 A[EDGE_INSN: B:166:0x02d4->B:170:0x02f0 BREAK  A[LOOP:5: B:47:0x00ed->B:59:0x011a]] */
    /* JADX WARN: Code duplicated, block: B:188:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x02cb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x02cb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x017d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c2  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20164(C2551 c2551) {
        Iterator it;
        Iterator it2;
        Iterator it3;
        C17973 c17973M17530;
        C18959 c18959M39118;
        boolean zMo17865;
        int iM47983;
        C21943 c21943M52163;
        C18959 c18959M9470;
        boolean z;
        BitSet bitSet;
        Iterator it4;
        Iterator it5;
        boolean z2;
        Iterator it6;
        Iterator it7;
        C18959 c18959;
        C21943 c21943;
        C12050 c12050M8515;
        boolean zContains;
        InterfaceC6281 interfaceC6281M47064;
        Iterator it8;
        C18959 c189510;
        C18959 c189511;
        C14058 c14058M9469;
        AbstractC16481 abstractC16481Mo13131;
        if (c2551.m8524()) {
            return;
        }
        c2551.m39418(EnumC1763.REQUEST_CODE_SHRINK);
        Iterator it9 = c2551.m8508().iterator();
        while (it9.hasNext()) {
            C21943 c21944 = (C21943) it9.next();
            if (((ArrayList) c21944.mo1986()).isEmpty()) {
                it = it9;
            } else {
                C20993 c20993 = new C20993((ArrayList) c21944.mo1986());
                int size = c20993.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new C2872(c20993.get(i), arrayList, i));
                }
                ArrayList<C14058> arrayList2 = new ArrayList();
                Iterator it10 = arrayList.iterator();
                while (it10.hasNext()) {
                    C2872 c2872 = (C2872) it10.next();
                    ArrayList arrayListM9468 = c2872.m9468();
                    int size2 = arrayListM9468.size() - 1;
                    while (size2 >= 0) {
                        C6041 c6041 = (C6041) arrayListM9468.get(size2);
                        EnumC1763 enumC1763 = EnumC1763.DONT_INLINE;
                        if (c6041.mo17865(enumC1763) || c6041.m39118() == null || c6041.m39118().mo17865(EnumC1763.DONT_GENERATE) || (c17973M17530 = c6041.m17530()) == null || c17973M17530.m41930().mo17865(enumC1763) || (c18959M39118 = c17973M17530.m41930().m39118()) == null || c18959M39118.mo17865(enumC1763) || c18959M39118.mo17865(EnumC1763.WRAPPED) || !C8314.m22409(c2551, c18959M39118, c2872.m9470()) || (!(zMo17865 = c18959M39118.mo17865(EnumC1763.FORCE_ASSIGN_INLINE)) && c17973M17530.m41947())) {
                            it2 = it9;
                            it3 = it10;
                        } else {
                            Iterator it11 = c17973M17530.m41946().iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it11.hasNext()) {
                                    it2 = it9;
                                    it3 = it10;
                                    if (!zMo17865 && i2 != 1) {
                                        break;
                                    }
                                    if (!zMo17865 && c17973M17530.getName() != null && ((AbstractC16481) c18959M39118.m44010(new C8838(c17973M17530.getName()))) == null) {
                                        Iterator it12 = c2551.m8490().iterator();
                                        while (true) {
                                            if (!it12.hasNext()) {
                                                break;
                                            }
                                            C17973 c17973 = (C17973) it12.next();
                                            if (c17973 != c17973M17530 && c17973.m41945() != c17973M17530.m41945() && C17359.equals(c17973.getName(), c17973M17530.getName())) {
                                                if (c17973.m41952() <= c17973M17530.m41952()) {
                                                    break;
                                                }
                                                if (c18959M39118.getType() != EnumC24203.INVOKE) {
                                                    iM47983 = c20993.m47983(c18959M39118);
                                                    if (iM47983 != -1) {
                                                        c21943M52163 = C23231.m52163(c2551, c18959M39118, c2551.m8508());
                                                        if (c21943M52163 == null) {
                                                            break;
                                                        }
                                                        c18959M9470 = c2872.m9470();
                                                        if (C23231.m52193(c21943M52163, c21944)) {
                                                            z = false;
                                                            break;
                                                        }
                                                        ArrayList arrayListM9462 = C2872.m9462(c18959M39118);
                                                        bitSet = new BitSet();
                                                        it4 = arrayListM9462.iterator();
                                                        while (it4.hasNext()) {
                                                            bitSet.set(((C6041) it4.next()).m17532());
                                                        }
                                                        it5 = ((ArrayList) c21943M52163.mo1986()).iterator();
                                                        z2 = false;
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                c189511 = (C18959) it5.next();
                                                                if (z2) {
                                                                }
                                                                if (c189511 == c18959M39118) {
                                                                    z2 = true;
                                                                }
                                                            } else {
                                                                HashSet hashSetM52150 = C23231.m52150(c21943M52163, c21944);
                                                                hashSetM52150.remove(c21943M52163);
                                                                hashSetM52150.remove(c21944);
                                                                it6 = hashSetM52150.iterator();
                                                                while (true) {
                                                                    if (it6.hasNext()) {
                                                                        c21943 = (C21943) it6.next();
                                                                        if (c21943.mo17865(EnumC1763.DONT_GENERATE)) {
                                                                            it8 = ((ArrayList) c21943.mo1986()).iterator();
                                                                            while (true) {
                                                                                if (it8.hasNext()) {
                                                                                    c189510 = (C18959) it8.next();
                                                                                    if (c189510.m44034()) {
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else if (C23231.m52184((InterfaceC23435) c21943, EnumC24203.MONITOR_EXIT)) {
                                                                            c12050M8515 = c2551.m8515();
                                                                            if (c12050M8515 == null) {
                                                                                zContains = false;
                                                                            } else {
                                                                                interfaceC6281M47064 = C20531.m47064((InterfaceC23435) c21943M52163, (InterfaceC6281) c12050M8515);
                                                                                if (interfaceC6281M47064 instanceof InterfaceC18213) {
                                                                                    zContains = false;
                                                                                } else {
                                                                                    zContains = false;
                                                                                }
                                                                            }
                                                                            if (zContains) {
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    } else {
                                                                        it7 = ((ArrayList) c21944.mo1986()).iterator();
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                throw new C8597("Can't process instruction move : " + c21943M52163);
                                                                            }
                                                                            c18959 = (C18959) it7.next();
                                                                            if (c18959 == c18959M9470) {
                                                                                z = true;
                                                                                break;
                                                                            } else if (c18959.m44034()) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z = false;
                                                            break;
                                                        }
                                                        if (z) {
                                                            break;
                                                        }
                                                        if (zMo17865) {
                                                            m20163(c2551, c6041, c18959M39118, c21943M52163);
                                                            break;
                                                        } else {
                                                            m20165(c2551, c6041, c18959M39118, c21943M52163);
                                                            break;
                                                        }
                                                    }
                                                    c14058M9469 = c2872.m9469(c2551, iM47983, c6041);
                                                    if (c14058M9469 != null) {
                                                        break;
                                                    }
                                                    arrayList2.add(c14058M9469);
                                                    break;
                                                }
                                                iM47983 = c20993.m47983(c18959M39118);
                                                if (iM47983 != -1) {
                                                    c21943M52163 = C23231.m52163(c2551, c18959M39118, c2551.m8508());
                                                    if (c21943M52163 == null) {
                                                        break;
                                                    }
                                                    c18959M9470 = c2872.m9470();
                                                    if (C23231.m52193(c21943M52163, c21944)) {
                                                        ArrayList arrayListM9463 = C2872.m9462(c18959M39118);
                                                        bitSet = new BitSet();
                                                        it4 = arrayListM9463.iterator();
                                                        while (it4.hasNext()) {
                                                            bitSet.set(((C6041) it4.next()).m17532());
                                                        }
                                                        it5 = ((ArrayList) c21943M52163.mo1986()).iterator();
                                                        z2 = false;
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                c189511 = (C18959) it5.next();
                                                                if (z2) {
                                                                }
                                                                if (c189511 == c18959M39118) {
                                                                    z2 = true;
                                                                }
                                                            } else {
                                                                HashSet hashSetM52151 = C23231.m52150(c21943M52163, c21944);
                                                                hashSetM52151.remove(c21943M52163);
                                                                hashSetM52151.remove(c21944);
                                                                it6 = hashSetM52151.iterator();
                                                                while (true) {
                                                                    if (it6.hasNext()) {
                                                                        c21943 = (C21943) it6.next();
                                                                        if (c21943.mo17865(EnumC1763.DONT_GENERATE)) {
                                                                            it8 = ((ArrayList) c21943.mo1986()).iterator();
                                                                            while (true) {
                                                                                if (it8.hasNext()) {
                                                                                    c189510 = (C18959) it8.next();
                                                                                    if (c189510.m44034()) {
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else if (C23231.m52184((InterfaceC23435) c21943, EnumC24203.MONITOR_EXIT)) {
                                                                            c12050M8515 = c2551.m8515();
                                                                            if (c12050M8515 == null) {
                                                                                zContains = false;
                                                                            } else {
                                                                                interfaceC6281M47064 = C20531.m47064((InterfaceC23435) c21943M52163, (InterfaceC6281) c12050M8515);
                                                                                if (interfaceC6281M47064 instanceof InterfaceC18213) {
                                                                                    zContains = false;
                                                                                } else {
                                                                                    zContains = false;
                                                                                }
                                                                            }
                                                                            if (zContains) {
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    } else {
                                                                        it7 = ((ArrayList) c21944.mo1986()).iterator();
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                throw new C8597("Can't process instruction move : " + c21943M52163);
                                                                            }
                                                                            c18959 = (C18959) it7.next();
                                                                            if (c18959 == c18959M9470) {
                                                                                z = true;
                                                                                break;
                                                                            } else if (c18959.m44034()) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z = false;
                                                            break;
                                                        }
                                                    }
                                                    z = false;
                                                    break;
                                                    if (z) {
                                                        break;
                                                    }
                                                    if (zMo17865) {
                                                        m20163(c2551, c6041, c18959M39118, c21943M52163);
                                                        break;
                                                    } else {
                                                        m20165(c2551, c6041, c18959M39118, c21943M52163);
                                                        break;
                                                    }
                                                }
                                                c14058M9469 = c2872.m9469(c2551, iM47983, c6041);
                                                if (c14058M9469 != null) {
                                                    break;
                                                }
                                                arrayList2.add(c14058M9469);
                                                break;
                                            }
                                        }
                                    } else {
                                        if (c18959M39118.getType() != EnumC24203.INVOKE || !(c18959M39118 instanceof C4065)) {
                                            iM47983 = c20993.m47983(c18959M39118);
                                            if (iM47983 != -1) {
                                                c21943M52163 = C23231.m52163(c2551, c18959M39118, c2551.m8508());
                                                if (c21943M52163 == null && c18959M39118 != c6041.m39118()) {
                                                    c18959M9470 = c2872.m9470();
                                                    if (C23231.m52193(c21943M52163, c21944)) {
                                                        ArrayList arrayListM9464 = C2872.m9462(c18959M39118);
                                                        bitSet = new BitSet();
                                                        it4 = arrayListM9464.iterator();
                                                        while (it4.hasNext()) {
                                                            bitSet.set(((C6041) it4.next()).m17532());
                                                        }
                                                        it5 = ((ArrayList) c21943M52163.mo1986()).iterator();
                                                        z2 = false;
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                c189511 = (C18959) it5.next();
                                                                if (z2 || (c189511.m44034() && !C2872.m9466(c189511, bitSet))) {
                                                                    if (c189511 == c18959M39118) {
                                                                        z2 = true;
                                                                    }
                                                                }
                                                            } else {
                                                                HashSet hashSetM52152 = C23231.m52150(c21943M52163, c21944);
                                                                hashSetM52152.remove(c21943M52163);
                                                                hashSetM52152.remove(c21944);
                                                                it6 = hashSetM52152.iterator();
                                                                while (true) {
                                                                    if (it6.hasNext()) {
                                                                        c21943 = (C21943) it6.next();
                                                                        if (c21943.mo17865(EnumC1763.DONT_GENERATE)) {
                                                                            it8 = ((ArrayList) c21943.mo1986()).iterator();
                                                                            while (true) {
                                                                                if (it8.hasNext()) {
                                                                                    c189510 = (C18959) it8.next();
                                                                                    if (c189510.m44034() || C2872.m9466(c189510, bitSet)) {
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else if (C23231.m52184((InterfaceC23435) c21943, EnumC24203.MONITOR_EXIT)) {
                                                                            continue;
                                                                        } else {
                                                                            c12050M8515 = c2551.m8515();
                                                                            if (c12050M8515 == null) {
                                                                                zContains = false;
                                                                            } else {
                                                                                interfaceC6281M47064 = C20531.m47064((InterfaceC23435) c21943M52163, (InterfaceC6281) c12050M8515);
                                                                                if ((interfaceC6281M47064 instanceof InterfaceC18213) || (interfaceC6281M47064 instanceof InterfaceC3297)) {
                                                                                    zContains = false;
                                                                                } else {
                                                                                    zContains = ((InterfaceC18213) interfaceC6281M47064).mo19035().contains(c21944);
                                                                                }
                                                                            }
                                                                            if (zContains) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        it7 = ((ArrayList) c21944.mo1986()).iterator();
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                throw new C8597("Can't process instruction move : " + c21943M52163);
                                                                            }
                                                                            c18959 = (C18959) it7.next();
                                                                            if (c18959 == c18959M9470) {
                                                                                z = true;
                                                                                break;
                                                                            } else if (c18959.m44034() || C2872.m9466(c18959, bitSet)) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z = false;
                                                            break;
                                                        }
                                                    }
                                                    z = false;
                                                    break;
                                                    if (z) {
                                                        break;
                                                    }
                                                    if (zMo17865) {
                                                        m20163(c2551, c6041, c18959M39118, c21943M52163);
                                                        break;
                                                    } else {
                                                        m20165(c2551, c6041, c18959M39118, c21943M52163);
                                                        break;
                                                    }
                                                }
                                                break;
                                                break;
                                            }
                                            c14058M9469 = c2872.m9469(c2551, iM47983, c6041);
                                            if (c14058M9469 != null) {
                                                break;
                                            }
                                            arrayList2.add(c14058M9469);
                                            break;
                                        }
                                        Iterator it13 = c6041.m17530().m41946().iterator();
                                        while (true) {
                                            if (!it13.hasNext()) {
                                                iM47983 = c20993.m47983(c18959M39118);
                                                if (iM47983 != -1) {
                                                    c21943M52163 = C23231.m52163(c2551, c18959M39118, c2551.m8508());
                                                    if (c21943M52163 == null) {
                                                        break;
                                                    }
                                                    c18959M9470 = c2872.m9470();
                                                    if (C23231.m52193(c21943M52163, c21944)) {
                                                        ArrayList arrayListM9465 = C2872.m9462(c18959M39118);
                                                        bitSet = new BitSet();
                                                        it4 = arrayListM9465.iterator();
                                                        while (it4.hasNext()) {
                                                            bitSet.set(((C6041) it4.next()).m17532());
                                                        }
                                                        it5 = ((ArrayList) c21943M52163.mo1986()).iterator();
                                                        z2 = false;
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                c189511 = (C18959) it5.next();
                                                                if (z2) {
                                                                }
                                                                if (c189511 == c18959M39118) {
                                                                    z2 = true;
                                                                }
                                                            } else {
                                                                HashSet hashSetM52153 = C23231.m52150(c21943M52163, c21944);
                                                                hashSetM52153.remove(c21943M52163);
                                                                hashSetM52153.remove(c21944);
                                                                it6 = hashSetM52153.iterator();
                                                                while (true) {
                                                                    if (it6.hasNext()) {
                                                                        c21943 = (C21943) it6.next();
                                                                        if (c21943.mo17865(EnumC1763.DONT_GENERATE)) {
                                                                            it8 = ((ArrayList) c21943.mo1986()).iterator();
                                                                            while (true) {
                                                                                if (it8.hasNext()) {
                                                                                    c189510 = (C18959) it8.next();
                                                                                    if (c189510.m44034()) {
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else if (C23231.m52184((InterfaceC23435) c21943, EnumC24203.MONITOR_EXIT)) {
                                                                            c12050M8515 = c2551.m8515();
                                                                            if (c12050M8515 == null) {
                                                                                zContains = false;
                                                                            } else {
                                                                                interfaceC6281M47064 = C20531.m47064((InterfaceC23435) c21943M52163, (InterfaceC6281) c12050M8515);
                                                                                if (interfaceC6281M47064 instanceof InterfaceC18213) {
                                                                                    zContains = false;
                                                                                } else {
                                                                                    zContains = false;
                                                                                }
                                                                            }
                                                                            if (zContains) {
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    } else {
                                                                        it7 = ((ArrayList) c21944.mo1986()).iterator();
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                throw new C8597("Can't process instruction move : " + c21943M52163);
                                                                            }
                                                                            c18959 = (C18959) it7.next();
                                                                            if (c18959 == c18959M9470) {
                                                                                z = true;
                                                                                break;
                                                                            } else if (c18959.m44034()) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z = false;
                                                            break;
                                                        }
                                                    }
                                                    z = false;
                                                    break;
                                                    if (z) {
                                                        break;
                                                    }
                                                    if (zMo17865) {
                                                        m20163(c2551, c6041, c18959M39118, c21943M52163);
                                                        break;
                                                    } else {
                                                        m20165(c2551, c6041, c18959M39118, c21943M52163);
                                                        break;
                                                    }
                                                }
                                                c14058M9469 = c2872.m9469(c2551, iM47983, c6041);
                                                if (c14058M9469 != null) {
                                                    break;
                                                }
                                                arrayList2.add(c14058M9469);
                                                break;
                                            }
                                            C6041 c6042 = (C6041) it13.next();
                                            C18959 c18959M39119 = c6042.m39118();
                                            if (c18959M39119 != null && c18959M39119.getType() == EnumC24203.INVOKE && (abstractC16481Mo13131 = ((C21219) c18959M39119).mo13131()) != null && abstractC16481Mo13131 == c6042) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    C6041 c6043 = (C6041) it11.next();
                                    it2 = it9;
                                    C18959 c18959M391110 = c6043.m39118();
                                    it3 = it10;
                                    if (c18959M391110 == null || !c18959M391110.mo17865(EnumC1763.DONT_GENERATE)) {
                                        if (!zMo17865 && c6043.mo17865(EnumC1763.DONT_INLINE_CONST)) {
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    }
                                    it9 = it2;
                                    it10 = it3;
                                }
                            }
                        }
                        size2--;
                        it9 = it2;
                        it10 = it3;
                    }
                }
                it = it9;
                if (!arrayList2.isEmpty()) {
                    for (C14058 c14058 : arrayList2) {
                        m20165(c2551, c14058.m34225(), c14058.m34226(), c21944);
                    }
                }
            }
            ArrayList arrayList3 = (ArrayList) c21944.mo1986();
            int size3 = arrayList3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C18959 c189512 = (C18959) arrayList3.get(i3);
                if (c189512.getType() == EnumC24203.MOVE) {
                    AbstractC16481 abstractC16481Mo44035 = c189512.mo44035(0);
                    abstractC16481Mo44035.getClass();
                    if (abstractC16481Mo44035 instanceof C17227) {
                        C18959 c18959M40461 = ((C17227) abstractC16481Mo44035).m40461();
                        C9804.m25542(c2551, c18959M40461);
                        c18959M40461.m44031(c189512.m44027().mo17528());
                        c18959M40461.m44021(c189512);
                        c18959M40461.m44024(c189512.getOffset());
                        c18959M40461.m39418(EnumC1763.WRAPPED);
                        ((ArrayList) c21944.mo1986()).set(i3, c18959M40461);
                    }
                }
            }
            it9 = it;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20163(C2551 c2551, C6041 c6041, C18959 c18959, C21943 c21943) {
        C6041 c6042 = (C6041) c6041.m17530().m41946().get(0);
        C18959 c18959M39118 = c6042.m39118();
        if (c18959M39118 == null || c18959M39118.mo17865(EnumC1763.DONT_GENERATE) || !C9804.m25541(c2551, c21943, c18959)) {
            return false;
        }
        c6042.m39113(c2551, c18959, true);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20165(C2551 c2551, C6041 c6041, C18959 c18959, C21943 c21943) {
        if (c18959.mo17865(EnumC1763.FORCE_ASSIGN_INLINE)) {
            m20163(c2551, c6041, c18959, c21943);
            return;
        }
        if (c6041.m39113(c2551, c18959, false) != null) {
            C18959 c18959M39118 = c6041.m39118();
            if (c18959M39118 != null) {
                c18959M39118.m44021(c18959);
            }
            C9804.m25542(c2551, c18959);
            C9804.m25541(c2551, c21943, c18959);
        }
    }
}
