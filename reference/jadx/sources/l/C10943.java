package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۤܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5IWP */
/* JADX INFO: loaded from: classes4.dex */
public final class C10943 extends AbstractC16700 {
    /* JADX WARN: Code duplicated, block: B:196:0x041d  */
    /* JADX WARN: Code duplicated, block: B:198:0x042b  */
    /* JADX WARN: Code duplicated, block: B:201:0x043c  */
    /* JADX WARN: Code duplicated, block: B:202:0x0442  */
    /* JADX WARN: Code duplicated, block: B:322:0x046c A[SYNTHETIC] */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        int i;
        C18959 c18959M39118;
        C17973 c17973M17530;
        C6041 c6041Mo44035;
        List listMo1986;
        int iM47981;
        C17973 c17973M17531;
        C17973 c17973M17532;
        C18959 c18959M17529;
        C18959 c18959M39119;
        C10733 c10733;
        if (c2551.m8524() || !c2551.m8490().isEmpty()) {
            return;
        }
        C4978 c4978 = new C4978(c2551);
        c4978.m15182();
        int iM8518 = c2551.m8518();
        int i2 = 0;
        for (int i3 = 0; i3 < iM8518; i3++) {
            List listM8508 = c2551.m8508();
            int size = listM8508.size();
            BitSet bitSet = new BitSet(size);
            BitSet bitSet2 = new BitSet(size);
            ArrayDeque arrayDeque = new ArrayDeque();
            BitSet bitSetM15181 = c4978.m15181(i3);
            for (int iNextSetBit = bitSetM15181.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM15181.nextSetBit(iNextSetBit + 1)) {
                bitSet2.set(iNextSetBit);
                arrayDeque.add((C21943) listM8508.get(iNextSetBit));
            }
            while (!arrayDeque.isEmpty()) {
                BitSet bitSetM49638 = ((C21943) arrayDeque.pop()).m49638();
                for (int iNextSetBit2 = bitSetM49638.nextSetBit(0); iNextSetBit2 >= 0; iNextSetBit2 = bitSetM49638.nextSetBit(iNextSetBit2 + 1)) {
                    if (!bitSet.get(iNextSetBit2) && c4978.m15183(iNextSetBit2, i3)) {
                        C21943 c21943 = (C21943) listM8508.get(iNextSetBit2);
                        ((ArrayList) c21943.mo1986()).add(0, m27766(c2551, c21943, i3));
                        bitSet.set(iNextSetBit2);
                        if (!bitSet2.get(iNextSetBit2)) {
                            bitSet2.set(iNextSetBit2);
                            arrayDeque.add(c21943);
                        }
                    }
                }
            }
        }
        C22132 c22132M50093 = C22132.m50093(c2551);
        C21943 c21943M50097 = c22132M50093.m50097();
        C11457 c11457 = C11457.f36001;
        C6566 c6566 = (C6566) c21943M50097.mo17862((InterfaceC2157) c11457);
        if (c6566 != null) {
            Iterator it = ((ArrayList) c6566.m18484()).iterator();
            while (it.hasNext()) {
                m27768(c22132M50093, (C18981) it.next());
            }
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        arrayDeque2.push(c22132M50093);
        while (!arrayDeque2.isEmpty()) {
            C22132 c22132 = (C22132) arrayDeque2.pop();
            C21943 c21943M50098 = c22132.m50097();
            for (C18959 c18959 : (ArrayList) c21943M50098.mo1986()) {
                if (c18959.getType() != EnumC24203.PHI) {
                    for (AbstractC16481 abstractC16481 : c18959.m44026()) {
                        abstractC16481.getClass();
                        if (abstractC16481 instanceof C6041) {
                            C6041 c6041 = (C6041) abstractC16481;
                            int iM17532 = c6041.m17532();
                            C17973 c17973M50095 = c22132.m50095(iM17532);
                            if (c17973M50095 == null) {
                                c2551.m31138("Not initialized variable reg: " + iM17532 + ", insn: " + c18959 + ", block:" + c21943M50098);
                                c17973M50095 = c22132.m50096(c6041);
                            }
                            c17973M50095.m41938(c6041);
                        }
                    }
                }
                C6041 c6041M44027 = c18959.m44027();
                if (c6041M44027 != null) {
                    c22132.m50096(c6041M44027);
                }
            }
            Iterator it2 = c21943M50098.m49646().iterator();
            while (it2.hasNext()) {
                C6566 c6567 = (C6566) ((C21943) it2.next()).mo17862((InterfaceC2157) c11457);
                if (c6567 != null) {
                    Iterator it3 = ((ArrayList) c6567.m18484()).iterator();
                    while (it3.hasNext()) {
                        m27768(c22132, (C18981) it3.next());
                    }
                }
            }
            Iterator it4 = c22132.m50097().m49636().iterator();
            while (it4.hasNext()) {
                arrayDeque2.push(C22132.m50094(c22132, (C21943) it4.next()));
            }
        }
        if (!C8314.m22407(c2551)) {
            for (C21943 c21944 : c2551.m8508()) {
                C6566 c6568 = (C6566) c21944.mo17862((InterfaceC2157) c11457);
                if (c6568 != null && (c10733 = (C10733) c21944.mo17862((InterfaceC2157) C11457.f36036)) != null) {
                    for (C18981 c18981 : (ArrayList) c6568.m18484()) {
                        int iM44039 = c18981.m44039();
                        int i4 = 0;
                        while (i4 < iM44039) {
                            C6041 c6041Mo44036 = c18981.mo44035(i4);
                            C18959 c18959M175210 = c6041Mo44036.m17529();
                            if (c18959M175210 != null && c18959M175210.m44027() != null && c18959M175210.mo17865(EnumC1763.TRY_LEAVE)) {
                                C11457 c11458 = C11457.f36015;
                                C21922 c21922 = (C21922) c18959M175210.mo17862((InterfaceC2157) c11458);
                                if (c21922 == null) {
                                    C21943 c21943M52163 = C23231.m52163(c2551, c18959M175210, c2551.m8508());
                                    c21922 = c21943M52163 == null ? null : (C21922) c21943M52163.mo17862((InterfaceC2157) c11458);
                                }
                                if (c21922 != null) {
                                    if (((ArrayList) c21922.m49617()).contains(c10733.m27337())) {
                                        c18981.m44089(c6041Mo44036);
                                        iM44039--;
                                    }
                                }
                            }
                            i4++;
                        }
                        if (c18981.m44039() == 0) {
                            throw new C8597("PHI empty after try-catch fix!");
                        }
                    }
                }
            }
        }
        for (C21943 c21945 : c2551.m8508()) {
            C6566 c6569 = (C6566) c21945.mo17862((InterfaceC2157) c11457);
            if (c6569 != null) {
                for (C18981 c18982 : (ArrayList) c6569.m18484()) {
                    for (int i5 = 0; i5 < c18982.m44039(); i5++) {
                        C6041 c6041Mo44037 = c18982.mo44035(i5);
                        C18959 c18959M175211 = c6041Mo44037.m17529();
                        if (c18959M175211 != null && c18959M175211.mo17865(EnumC1763.REMOVE)) {
                            c18982.m44089(c6041Mo44037);
                            C9804.m25537(c2551, c21945, c18959M175211);
                        }
                    }
                }
            }
        }
        int size2 = c2551.m8490().size() * 2;
        int i6 = 0;
        while (true) {
            ArrayList<C18981> arrayList = new ArrayList();
            Iterator it5 = c2551.m8490().iterator();
            boolean z = false;
            while (true) {
                i = 1;
                if (!it5.hasNext()) {
                    break;
                }
                C17973 c17973 = (C17973) it5.next();
                if (c17973.m41952() == 0 && (c18959M39119 = c17973.m41930().m39118()) != null && c18959M39119.getType() == EnumC24203.PHI) {
                    arrayList.add((C18981) c18959M39119);
                    z = true;
                }
            }
            for (C21943 c21946 : c2551.m8508()) {
                C6566 c65610 = (C6566) c21946.mo17862((InterfaceC2157) c11457);
                if (c65610 != null) {
                    Iterator it6 = ((ArrayList) c65610.m18484()).iterator();
                    while (it6.hasNext()) {
                        C18981 c18983 = (C18981) it6.next();
                        if (c18983.m44039() == 0) {
                            for (C6041 c6042 : c18983.m44027().m17530().m41946()) {
                                C18959 c18959M391110 = c6042.m39118();
                                if (c18959M391110 != null && c18959M391110.getType() == EnumC24203.PHI) {
                                    c18983.m44089(c6042);
                                }
                            }
                            C9804.m25537(c2551, c21946, c18983);
                        } else {
                            if (c18983.m44039() != i) {
                                int i7 = 0;
                                C17973 c17973M17533 = null;
                                while (true) {
                                    if (i7 < c18983.m44039()) {
                                        C6041 c6041Mo44038 = c18983.mo44035(i7);
                                        if (c17973M17533 == null) {
                                            c17973M17533 = c6041Mo44038.m17530();
                                        } else if (c17973M17533 != c6041Mo44038.m17530()) {
                                            int iM440310 = c18983.m44039();
                                            int i8 = 0;
                                            C17973 c17974 = null;
                                            while (i8 < iM440310) {
                                                C6041 c6041Mo44039 = c18983.mo44035(i8);
                                                if (c6041Mo44039.m17530().m41952() == i && (c18959M17529 = c6041Mo44039.m17529()) != null && c18959M17529.getType() == EnumC24203.MOVE) {
                                                    AbstractC16481 abstractC16481Mo44035 = c18959M17529.mo44035(0);
                                                    abstractC16481Mo44035.getClass();
                                                    if (abstractC16481Mo44035 instanceof C6041) {
                                                        C17973 c17973M17534 = ((C6041) abstractC16481Mo44035).m17530();
                                                        if (c17974 == null) {
                                                            c17974 = c17973M17534;
                                                        } else if (c17974 != c17973M17534) {
                                                        }
                                                        i8++;
                                                        i = 1;
                                                    }
                                                }
                                                c17974 = null;
                                                break;
                                            }
                                            if (c17974 != null && m27769(c2551, c21946, c18983, c17974.m41930().mo17528())) {
                                                Iterator it7 = c18983.m44026().iterator();
                                                while (it7.hasNext()) {
                                                    C18959 c18959M175212 = ((C6041) ((AbstractC16481) it7.next())).m17529();
                                                    if (c18959M175212 != null) {
                                                        c18959M175212.mo17866(EnumC1763.REMOVE);
                                                        C9804.m25534(c2551, c18959M175212);
                                                    }
                                                }
                                            }
                                        }
                                        i7++;
                                        i2 = 0;
                                        i = 1;
                                    } else {
                                        c6041Mo44035 = c18983.mo44035(i2);
                                        listMo1986 = c21946.mo1986();
                                        iM47981 = C20993.m47981(listMo1986, c18983);
                                        if (iM47981 == -1) {
                                            c17973M17531 = c18983.m44027().m17530();
                                            c17973M17532 = c6041Mo44035.m17530();
                                            if (c17973M17532 != null) {
                                                c17973M17532.m41933(c6041Mo44035);
                                                c17973M17532.m41950(c18983);
                                            }
                                            if (m27769(c2551, c21946, c18983, c18983.mo44035(0))) {
                                                ((ArrayList) listMo1986).remove(iM47981);
                                            } else {
                                                c17973M17531.m41950(c18983);
                                                C18959 c189510 = new C18959(EnumC24203.MOVE, 1);
                                                c189510.mo17866(EnumC1763.SYNTHETIC);
                                                c189510.m44031(c18983.m44027());
                                                c189510.mo44014((AbstractC16481) c6041Mo44035);
                                                c6041Mo44035.m17530().m41938(c6041Mo44035);
                                                ((ArrayList) listMo1986).set(iM47981, c189510);
                                            }
                                        }
                                    }
                                }
                            } else {
                                c6041Mo44035 = c18983.mo44035(i2);
                                listMo1986 = c21946.mo1986();
                                iM47981 = C20993.m47981(listMo1986, c18983);
                                if (iM47981 == -1) {
                                    c17973M17531 = c18983.m44027().m17530();
                                    c17973M17532 = c6041Mo44035.m17530();
                                    if (c17973M17532 != null) {
                                        c17973M17532.m41933(c6041Mo44035);
                                        c17973M17532.m41950(c18983);
                                    }
                                    if (m27769(c2551, c21946, c18983, c18983.mo44035(0))) {
                                        ((ArrayList) listMo1986).remove(iM47981);
                                    } else {
                                        c17973M17531.m41950(c18983);
                                        C18959 c189511 = new C18959(EnumC24203.MOVE, 1);
                                        c189511.mo17866(EnumC1763.SYNTHETIC);
                                        c189511.m44031(c18983.m44027());
                                        c189511.mo44014((AbstractC16481) c6041Mo44035);
                                        c6041Mo44035.m17530().m41938(c6041Mo44035);
                                        ((ArrayList) listMo1986).set(iM47981, c189511);
                                    }
                                }
                            }
                            i2 = 0;
                            i = 1;
                        }
                        it6.remove();
                        z = true;
                        i2 = 0;
                        i = 1;
                    }
                }
            }
            for (C21943 c21947 : c2551.m8508()) {
                C6566 c65611 = (C6566) c21947.mo17862((InterfaceC2157) c11457);
                if (c65611 != null) {
                    List listM18484 = c65611.m18484();
                    for (C18981 c18984 : arrayList) {
                        if (((ArrayList) listM18484).remove(c18984)) {
                            for (AbstractC16481 abstractC16482 : c18984.m44026()) {
                                if (abstractC16482 != null && (c17973M17530 = ((C6041) abstractC16482).m17530()) != null) {
                                    c17973M17530.m41950(c18984);
                                }
                            }
                            C9804.m25537(c2551, c21947, c18984);
                        }
                    }
                    if (((ArrayList) listM18484).isEmpty()) {
                        c21947.m39419(c11457);
                    }
                }
            }
            arrayList.clear();
            if (!z) {
                m27770(c2551.m8517());
                Iterator it8 = c2551.m8508().iterator();
                while (it8.hasNext()) {
                    C1170.removeIf((ArrayList) ((C21943) it8.next()).mo1986(), new C19060(2));
                }
                Iterator it9 = c2551.m8490().iterator();
                while (it9.hasNext()) {
                    C17973 c17975 = (C17973) it9.next();
                    if (c17975.m41952() == 0 && (c18959M39118 = c17975.m41930().m39118()) != null && c18959M39118.getType() == EnumC24203.INVOKE) {
                        c18959M39118.m44031((C6041) null);
                        it9.remove();
                    }
                }
                return;
            }
            int i9 = i6 + 1;
            if (i6 > size2) {
                throw new C8597("Phi nodes fix limit reached!");
            }
            i6 = i9;
            i2 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18981 m27766(C2551 c2551, C21943 c21943, int i) {
        C6566 c6566 = (C6566) c21943.mo17862(C11457.f36001);
        if (c6566 == null) {
            c6566 = new C6566();
            c21943.mo17864(c6566);
        }
        int size = c21943.m49643().size();
        if (c2551.m8535() == c21943) {
            C6041 c6041M8517 = c2551.m8517();
            if (c6041M8517 != null && c6041M8517.m17532() == i) {
                size++;
                break;
            }
            Iterator it = c2551.m8526().iterator();
            while (it.hasNext()) {
                if (((C6041) it.next()).m17532() == i) {
                    size++;
                    break;
                }
            }
        }
        C18981 c18981 = new C18981(i, size);
        ((ArrayList) c6566.m18484()).add(c18981);
        c18981.m44024(c21943.m49654());
        return c18981;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27768(C22132 c22132, C18981 c18981) {
        C17973 c17973M50095 = c22132.m50095(c18981.m44027().m17532());
        if (c17973M50095 == null) {
            return;
        }
        C21943 c21943M50097 = c22132.m50097();
        C6041 c6041 = new C6041(c18981.m44027().m17532(), c18981.m44027().m17531());
        c18981.m44088(c6041, c21943M50097);
        c17973M50095.m41938(c6041);
        c17973M50095.m41935(c18981);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27769(C2551 c2551, C21943 c21943, C18981 c18981, C6041 c6041) {
        C18959 c18959M17529;
        C17973 c17973M17530 = c18981.m44027().m17530();
        if (c17973M17530 == null || c6041.m17530() == null) {
            return false;
        }
        for (C6041 c6042 : new ArrayList(c17973M17530.m41946())) {
            C18959 c18959M39118 = c6042.m39118();
            if (c18959M39118 == null || c18959M39118 == c18981) {
                return false;
            }
            if (c6042.m17532() == c6041.m17532()) {
                c6042.m17530().m41933(c6042);
                c6041.m17530().m41938(c6042);
            } else if (!c18959M39118.mo14762(c6042, c6041.mo17528())) {
                return false;
            }
        }
        if (c21943.mo17867(C11457.f36036) && (c18959M17529 = c6041.m17529()) != null && !c18959M17529.m44025()) {
            c18959M17529.mo17866(EnumC1763.DONT_INLINE);
        }
        C9804.m25538(c2551, c18981);
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m27770(C6041 c6041) {
        if (c6041 != null) {
            m27771(c6041);
            C4937.forEach(c6041.m17530().m41946(), new C5576());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m27771(C6041 c6041) {
        if (c6041 == null) {
            return;
        }
        c6041.mo17866(EnumC1763.THIS);
        c6041.mo17866(EnumC1763.IMMUTABLE_TYPE);
        C18959 c18959M39118 = c6041.m39118();
        if (c18959M39118 != null && c18959M39118.getType() == EnumC24203.MOVE && c18959M39118.mo44035(0) == c6041) {
            C6041 c6041M44027 = c18959M39118.m44027();
            if (c6041M44027.m17532() == c6041.m17532() || c6041M44027.m17530().m41947()) {
                return;
            }
            m27770(c6041M44027);
            c18959M39118.mo17866(EnumC1763.DONT_GENERATE);
        }
    }
}
