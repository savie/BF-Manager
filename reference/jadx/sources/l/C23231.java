package l;

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T6GT */
/* JADX INFO: loaded from: classes.dex */
public final class C23231 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m52157(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21943 c21943 = (C21943) it.next();
            if (c21943.m49654() == i) {
                return c21943;
            }
        }
        throw new C8597("Can't find block by offset: " + C8314.m22396(i) + " in list " + list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m52166(C21943 c21943, List list) {
        if (list.size() > 2) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C21943 c21944 = (C21943) it.next();
                if (!m52191(c21944)) {
                    arrayList.add(c21944);
                }
            }
            list = arrayList;
        }
        if (list.size() != 2) {
            throw new C8597("Incorrect nodes count for selectOther: " + c21943 + " in " + list);
        }
        C21943 c21945 = (C21943) list.get(0);
        return c21945 != c21943 ? c21945 : (C21943) list.get(1);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m52191(C21943 c21943) {
        C11457 c11457 = C11457.f36036;
        if (!c21943.mo17867(c11457) && !c21943.mo17865(EnumC1763.EXC_BOTTOM_SPLITTER) && !c21943.mo17865(EnumC1763.REMOVE)) {
            if (c21943.mo17865(EnumC1763.SYNTHETIC)) {
                List listM49646 = c21943.m49646();
                if (listM49646.size() != 1 || !((C21943) listM49646.get(0)).mo17867(c11457)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52145(C21943 c21943) {
        if (c21943 != null && c21943.mo17865(EnumC1763.LOOP_START)) {
            List listM49643 = c21943.m49643();
            if (listM49643.size() == 1) {
                C21943 c21944 = (C21943) listM49643.get(0);
                if (c21944.mo17865(EnumC1763.LOOP_END)) {
                    for (C11785 c11785 : c21944.mo17861(C11457.f36019)) {
                        if (c11785.m29616().equals(c21943) && c11785.m29613().equals(c21944)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52181(C21943 c21943, C18959 c18959) {
        Iterator it = ((ArrayList) c21943.mo1986()).iterator();
        while (it.hasNext()) {
            if (((C18959) it.next()) == c18959) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52184(InterfaceC23435 interfaceC23435, EnumC24203 enumC24203) {
        C18959 c18959M52200 = m52200(interfaceC23435);
        return c18959M52200 != null && c18959M52200.getType() == enumC24203;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m52156(C21943 c21943, EnumC24203 enumC24203) {
        C18959 c18959M52200 = m52200((InterfaceC23435) c21943);
        if (c18959M52200 == null || c18959M52200.getType() != enumC24203) {
            return null;
        }
        return c18959M52200;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C18959 m52186(C21943 c21943) {
        if (c21943 == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) c21943.mo1986();
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C18959) arrayList.get(0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C18959 m52200(InterfaceC23435 interfaceC23435) {
        if (interfaceC23435 == null) {
            return null;
        }
        List listMo1986 = interfaceC23435.mo1986();
        if (listMo1986.isEmpty()) {
            return null;
        }
        return (C18959) C7750.m21093(1, listMo1986);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52180(C21943 c21943, C2551 c2551) {
        if (c21943 == c2551.m8491()) {
            return true;
        }
        return m52185(c21943);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m52185(C21943 c21943) {
        List listM49646 = c21943.m49646();
        if (listM49646.isEmpty()) {
            return true;
        }
        if (listM49646.size() == 1) {
            return ((C21943) listM49646.get(0)).m49646().isEmpty();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52183(InterfaceC23435 interfaceC23435) {
        C18959 c18959M52200 = m52200(interfaceC23435);
        if (c18959M52200 == null) {
            return false;
        }
        EnumC24203 type = c18959M52200.getType();
        return type == EnumC24203.RETURN || type == EnumC24203.THROW || type == EnumC24203.BREAK || type == EnumC24203.CONTINUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m52162(C2551 c2551, C18959 c18959) {
        return m52163(c2551, c18959, c2551.m8508());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m52163(C2551 c2551, C18959 c18959, List list) {
        if (c18959 == null) {
            return null;
        }
        if (c18959 instanceof C18981) {
            C18981 c18981 = (C18981) c18959;
            for (C21943 c21943 : c2551.m8508()) {
                C6566 c6566 = (C6566) c21943.mo17862((InterfaceC2157) C11457.f36001);
                if (c6566 != null) {
                    Iterator it = ((ArrayList) c6566.m18484()).iterator();
                    while (it.hasNext()) {
                        if (((C18981) it.next()) == c18981) {
                            return c21943;
                        }
                    }
                }
            }
            return null;
        }
        if (!c18959.mo17865(EnumC1763.WRAPPED)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C21943 c21944 = (C21943) it2.next();
                if (m52181(c21944, c18959)) {
                    return c21944;
                }
            }
            return null;
        }
        for (C21943 c21945 : c2551.m8508()) {
            for (C18959 c189510 : (ArrayList) c21945.mo1986()) {
                if (c189510 == c18959 || m52154(c189510, c18959) != null) {
                    return c21945;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC16481 m52199(C2551 c2551, C18959 c18959) {
        if (!c18959.mo17865(EnumC1763.WRAPPED)) {
            return null;
        }
        Iterator it = c2551.m8508().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) ((C21943) it.next()).mo1986()).iterator();
            while (it2.hasNext()) {
                AbstractC16481 abstractC16481M52154 = m52154((C18959) it2.next(), c18959);
                if (abstractC16481M52154 != null) {
                    return abstractC16481M52154;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC16481 m52154(C18959 c18959, C18959 c189510) {
        for (AbstractC16481 abstractC16481 : c18959.m44026()) {
            abstractC16481.getClass();
            if (abstractC16481 instanceof C17227) {
                C18959 c18959M40461 = ((C17227) abstractC16481).m40461();
                if (c18959M40461 == c189510) {
                    return abstractC16481;
                }
                AbstractC16481 abstractC16481M52154 = m52154(c18959M40461, c189510);
                if (abstractC16481M52154 != null) {
                    return abstractC16481M52154;
                }
            }
        }
        if (c18959 instanceof C4789) {
            return m52153(((C4789) c18959).m14764(), c189510);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC16481 m52153(C9812 c9812, C18959 c18959) {
        if (c9812.m25589()) {
            return m52154(c9812.m25585().m51663(), c18959);
        }
        Iterator it = c9812.m25586().iterator();
        while (it.hasNext()) {
            AbstractC16481 abstractC16481M52153 = m52153((C9812) it.next(), c18959);
            if (abstractC16481M52153 != null) {
                return abstractC16481M52153;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static BitSet m52197(C2551 c2551) {
        return new BitSet(c2551.m8508().size());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21943 m52202(C2551 c2551, BitSet bitSet) {
        if (bitSet.cardinality() != 1) {
            return null;
        }
        return (C21943) c2551.m8508().get(bitSet.nextSetBit(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m52151(C2551 c2551, BitSet bitSet) {
        if (bitSet == null || bitSet == C20247.f65032) {
            return Collections.EMPTY_LIST;
        }
        int iCardinality = bitSet.cardinality();
        if (iCardinality == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iCardinality);
        int i = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(i);
            if (iNextSetBit < 0) {
                return arrayList;
            }
            arrayList.add((C21943) c2551.m8508().get(iNextSetBit));
            i = iNextSetBit + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52169(C2551 c2551, BitSet bitSet, Consumer consumer) {
        if (bitSet == C20247.f65032 || bitSet.isEmpty()) {
            return;
        }
        List listM8508 = c2551.m8508();
        int i = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(i);
            if (iNextSetBit < 0) {
                return;
            }
            consumer.n((C21943) listM8508.get(iNextSetBit));
            i = iNextSetBit + 1;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C21943 m52207(C21943 c21943) {
        List listM49639 = c21943.m49639();
        if (listM49639.isEmpty()) {
            return null;
        }
        return (C21943) listM49639.get(0);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C21943 m52206(C2551 c2551, C21943 c21943, C21943 c21944) {
        C21943 c21943M2203;
        C18293 c18293M42620 = C18293.m42620(c2551, c21943.m49643());
        if (c18293M42620.m42625(c21944)) {
            return c21944;
        }
        C0394 c0394 = new C0394(c2551, c21944, new C18980(10));
        do {
            c21943M2203 = c0394.m2203();
            if (c21943M2203 == null) {
                return null;
            }
        } while (!c18293M42620.m42625(c21943M2203));
        return c21943M2203;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52175(C2551 c2551, C21943 c21943, C21943 c21944, Consumer consumer) {
        consumer.n(c21943);
        if (c21943 != c21944) {
            if (c21943.m49639().contains(c21944)) {
                consumer.n(c21944);
                return;
            }
            BitSet bitSetM52197 = m52197(c2551);
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.addLast(c21943);
            while (true) {
                C21943 c21945 = (C21943) arrayDeque.peekLast();
                if (c21945 != null) {
                    Iterator it = c21945.m49639().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            arrayDeque.pollLast();
                            if (!arrayDeque.isEmpty()) {
                                break;
                            } else {
                                return;
                            }
                        }
                        C21943 c21946 = (C21943) it.next();
                        if (c21946 == c21944) {
                            arrayDeque.removeFirst();
                            arrayDeque.addLast(c21946);
                            C4937.forEach(arrayDeque, consumer);
                            return;
                        } else {
                            int id = c21946.getId();
                            if (!bitSetM52197.get(id)) {
                                bitSetM52197.set(id);
                                arrayDeque.addLast(c21946);
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52148(C2551 c2551, C21943 c21943, boolean z) {
        ArrayList arrayList = new ArrayList(c2551.m8508().size());
        m52173(c2551, c21943, z ? new C18980(10) : new C7620(9), new C21900(0, arrayList));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52149(C21943 c21943, boolean z, Predicate predicate) {
        ArrayList arrayList = new ArrayList();
        m52167(arrayList, c21943, z, predicate);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52167(ArrayList arrayList, C21943 c21943, boolean z, Predicate predicate) {
        if (arrayList.contains(c21943)) {
            return;
        }
        arrayList.add(c21943);
        if (predicate.test(c21943)) {
            return;
        }
        Iterator it = (z ? c21943.m49639() : c21943.m49646()).iterator();
        while (it.hasNext()) {
            m52167(arrayList, (C21943) it.next(), z, predicate);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m52160(C2551 c2551, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        C21943 c21943 = (C21943) arrayList.get(0);
        ArrayList arrayList2 = new ArrayList(c2551.m8508().size());
        m52173(c2551, c21943, new C20299(6), new C21900(0, arrayList2));
        HashSet hashSet = new HashSet(arrayList2);
        for (int i = 1; i < arrayList.size(); i++) {
            C21943 c21944 = (C21943) arrayList.get(i);
            ArrayList arrayList3 = new ArrayList(c2551.m8508().size());
            m52173(c2551, c21944, new C20299(6), new C21900(0, arrayList3));
            hashSet.retainAll(arrayList3);
        }
        return m52159((List) new ArrayList(hashSet), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52170(C2551 c2551, Consumer consumer) {
        m52173(c2551, c2551.m8535(), new C7620(9), consumer);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52171(C2551 c2551, C21900 c21900) {
        m52173(c2551, c2551.m8491(), new C20299(6), c21900);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52173(C2551 c2551, C21943 c21943, Function function, Consumer consumer) {
        C0394 c0394 = new C0394(c2551, c21943, function);
        while (true) {
            C21943 c21943M2203 = c0394.m2203();
            if (c21943M2203 == null) {
                return;
            } else {
                consumer.n(c21943M2203);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52174(C2551 c2551, C21943 c21943, Predicate predicate) {
        BitSet bitSetM52197 = m52197(c2551);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(c21943);
        while (true) {
            C21943 c21944 = (C21943) arrayDeque.poll();
            if (c21944 == null || predicate.test(c21944)) {
                return;
            }
            for (C21943 c21945 : c21944.m49643()) {
                int id = c21945.getId();
                if (!bitSetM52197.get(id)) {
                    bitSetM52197.set(id);
                    arrayDeque.add(c21945);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashSet m52150(C21943 c21943, C21943 c21944) {
        HashSet hashSet = new HashSet();
        hashSet.add(c21943);
        if (c21943 != c21944) {
            m52178(c21944, c21943, hashSet);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52178(C21943 c21943, C21943 c21944, HashSet hashSet) {
        hashSet.add(c21943);
        for (C21943 c21945 : c21943.m49643()) {
            if (c21945 != c21944 && !hashSet.contains(c21945)) {
                m52178(c21945, c21944, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52182(C21943 c21943, C21943 c21944, BitSet bitSet, boolean z, C15025 c15025) {
        for (C21943 c21945 : z ? c21943.m49639() : c21943.m49646()) {
            if (c21945 == c21944) {
                return true;
            }
            if (c21945 != c21943) {
                int iM49644 = c21945.m49644();
                if (bitSet.get(iM49644)) {
                    continue;
                } else {
                    bitSet.set(iM49644);
                    if (c21944.m49650(c21945) || m52182(c21945, c21944, bitSet, z, c15025)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m52193(C21943 c21943, C21943 c21944) {
        if (c21943 == c21944 || c21943.m49639().contains(c21944)) {
            return true;
        }
        return m52182(c21943, c21944, new BitSet(), true, new C15025(0));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m52205(C21943 c21943, C21943 c21944) {
        if (c21943 == c21944 || c21944.m49650(c21943) || c21943.m49646().contains(c21944)) {
            return true;
        }
        return m52182(c21943, c21944, new BitSet(), false, new C15025(0));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21943 m52201(List list) {
        if (list.size() == 1) {
            return (C21943) list.get(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21943 c21943 = (C21943) it.next();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C21943 c21944 = (C21943) it2.next();
                if (c21943 == c21944 || m52205(c21943, c21944)) {
                }
            }
            return c21943;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m52159(List list, boolean z) {
        if (list.size() == 1) {
            return (C21943) list.get(0);
        }
        if (!z) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C21943 c21943 = (C21943) it.next();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C21943 c21944 = (C21943) it2.next();
                    if (c21943 == c21944 || c21943.m49650(c21944)) {
                    }
                }
                return c21943;
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C21943 c21945 = (C21943) it3.next();
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                C21943 c21946 = (C21943) it4.next();
                if (z) {
                    if (c21945 == c21946 || m52193(c21946, c21945)) {
                    }
                } else if (c21945 == c21946 || m52205(c21946, c21945)) {
                }
            }
            return c21945;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m52161(final C2551 c2551, List list) {
        BitSet bitSetM52197 = m52197(c2551);
        BitSet bitSetM52198 = m52197(c2551);
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C21943 c21943 = (C21943) it.next();
            bitSetM52198.clear();
            bitSetM52198.set(c21943.getId());
            bitSetM52198.or(c21943.m49638());
            if (z) {
                bitSetM52197.or(bitSetM52198);
                z = false;
            } else {
                bitSetM52197.and(bitSetM52198);
            }
        }
        bitSetM52197.clear(c2551.m8491().getId());
        if (!bitSetM52197.isEmpty()) {
            C21943 c21943M52202 = m52202(c2551, bitSetM52197);
            if (c21943M52202 != null) {
                return c21943M52202;
            }
            final BitSet bitSetM52199 = m52197(c2551);
            bitSetM52199.set(c2551.m8491().getId());
            C4937.forEach(c2551.m8558(), new C5331(0, bitSetM52199));
            if (!c2551.m8560()) {
                C4937.forEach(c2551.m8530(), new Consumer() { // from class: l.֫֫᩵
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C12312.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        C19684 c19684 = (C19684) obj;
                        C21943 c21943M45368 = c19684.m45368();
                        if (c21943M45368 != null) {
                            bitSetM52199.set(c21943M45368.getId());
                        } else {
                            c2551.m31133("Null handler block in: " + c19684);
                        }
                    }
                });
            }
            bitSetM52197.andNot(bitSetM52199);
            C21943 c21943M52203 = m52202(c2551, bitSetM52197);
            if (c21943M52203 != null) {
                return c21943M52203;
            }
            BitSet bitSetM521910 = m52197(c2551);
            int size = c2551.m8508().size();
            while (true) {
                m52169(c2551, bitSetM52197, new C11296(0, bitSetM521910));
                bitSetM521910.andNot(bitSetM52199);
                int iCardinality = bitSetM521910.cardinality();
                if (iCardinality == 1) {
                    return m52202(c2551, bitSetM521910);
                }
                if (iCardinality != 0) {
                    int i = size - 1;
                    if (size < 0) {
                        c2551.m31138("Path cross not found for " + list + ", limit reached: " + c2551.m8508().size());
                        return null;
                    }
                    bitSetM52197.clear();
                    bitSetM52197.or(bitSetM521910);
                    bitSetM521910.clear();
                    size = i;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C21943 m52187(C2551 c2551, C21943 c21943, C21943 c21944) {
        if (c21943 == c21944) {
            return c21943;
        }
        if (c21943 == null || c21944 == null) {
            return null;
        }
        return m52161(c2551, Arrays.asList(c21943, c21944));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52147(C2551 c2551, C21943 c21943, C21943 c21944) {
        ArrayList arrayList = new ArrayList();
        m52177(c21943, c21944, (AbstractCollection) arrayList, m52197(c2551), false);
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m52198(C2551 c2551, C21943 c21943, C21943 c21944) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m52177(c21943, c21944, (AbstractCollection) linkedHashSet, m52197(c2551), true);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52177(C21943 c21943, C21943 c21944, AbstractCollection abstractCollection, BitSet bitSet, boolean z) {
        if (bitSet.get(c21944.getId())) {
            return;
        }
        bitSet.set(c21944.getId());
        for (C21943 c21945 : z ? c21944.m49646() : c21944.m49639()) {
            if (c21945.m49650(c21943)) {
                abstractCollection.add(c21945);
                m52177(c21943, c21945, abstractCollection, bitSet, z);
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C21943 m52194(C21943 c21943) {
        if (c21943.m49643().size() > 1) {
            return null;
        }
        List listM49646 = c21943.m49646();
        if (listM49646.size() == 1) {
            return (C21943) listM49646.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m52152(C21943 c21943) {
        if (c21943 == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (c21943.m49639().size() >= 2) {
            return Collections.EMPTY_LIST;
        }
        arrayList.add(c21943);
        for (C21943 c21943M52207 = m52207(c21943); c21943M52207 != null && c21943M52207.m49639().size() < 2 && c21943M52207.m49643().size() == 1; c21943M52207 = m52207(c21943M52207)) {
            arrayList.add(c21943M52207);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21943 m52203(C21943 c21943) {
        return m52165(c21943, Boolean.FALSE, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m52165(C21943 c21943, Boolean bool, boolean z) {
        while (true) {
            C21943 c21943M52204 = m52204(c21943, bool, z);
            if (c21943M52204 == null) {
                return c21943;
            }
            c21943 = c21943M52204;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52168(LinkedList linkedList, C21943 c21943, final List list, HashSet hashSet) {
        for (C21943 c21944 : C6823.m19008((Collection) c21943.m49643(), new Predicate() { // from class: l.ܶ֫᩵
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return list.contains((C21943) obj);
            }
        })) {
            if (list.contains(c21944) && !hashSet.contains(c21944)) {
                hashSet.add(c21944);
                if (((ArrayList) c21944.mo1986()).isEmpty()) {
                    m52168(linkedList, c21943, list, hashSet);
                } else {
                    linkedList.add(c21944);
                }
                c21943 = c21944;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52176(C21943 c21943, Consumer consumer) {
        while (true) {
            c21943 = m52204(c21943, Boolean.FALSE, true);
            if (c21943 == null) {
                return;
            } else {
                consumer.n(c21943);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21943 m52204(C21943 c21943, Boolean bool, boolean z) {
        List listM49639;
        if (!((ArrayList) c21943.mo1986()).isEmpty()) {
            return null;
        }
        if (!bool.booleanValue() && c21943.m49643().size() > 1) {
            return null;
        }
        if (bool.booleanValue() && c21943.m49639().size() > 1) {
            return null;
        }
        if (bool.booleanValue()) {
            listM49639 = c21943.m49643();
        } else {
            listM49639 = z ? c21943.m49639() : c21943.m49646();
        }
        if (listM49639.size() != 1) {
            return null;
        }
        return (C21943) listM49639.get(0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21943 m52190(C21943 c21943) {
        c21943.getClass();
        return (c21943.mo17865(EnumC1763.SYNTHETIC) && ((ArrayList) c21943.mo1986()).isEmpty() && c21943.m49643().size() == 1) ? (C21943) c21943.m49643().get(0) : c21943;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m52188(List list) {
        if (C4123.m13229((Collection) list)) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((ArrayList) ((C21943) it.next()).mo1986()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52146(List list) {
        ArrayList arrayList = new ArrayList();
        C4937.forEach(list, new C24723(0, arrayList));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18959 m52155(C2551 c2551) {
        if (!c2551.m8524()) {
            Iterator it = c2551.m8508().iterator();
            C18959 c18959 = null;
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) ((C21943) it.next()).mo1986();
                int size = arrayList.size();
                if (size != 0) {
                    if (size <= 1 && c18959 == null) {
                        c18959 = (C18959) arrayList.get(0);
                    }
                }
            }
            return c18959;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52172(C2551 c2551, C21943 c21943, int i, C18959 c18959) {
        C18959 c189510 = (C18959) ((ArrayList) c21943.mo1986()).get(i);
        c18959.m39414((AbstractC16678) c189510);
        c18959.m16975((AbstractC5820) c189510);
        c18959.m44021(c189510);
        c18959.m44024(c189510.getOffset());
        ((ArrayList) c21943.mo1986()).set(i, c18959);
        C6041 c6041M44027 = c18959.m44027();
        C6041 c6041M44028 = c189510.m44027();
        if (c6041M44027 != null && c6041M44028 != null && c6041M44027.m17535((AbstractC16481) c6041M44028)) {
            C9804.m25540(c2551, c189510);
        } else {
            C9804.m25538(c2551, c189510);
        }
        c18959.mo14759();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52179(C2551 c2551, C21943 c21943, C18959 c18959, C18959 c189510) {
        ArrayList arrayList = (ArrayList) c21943.mo1986();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C18959) arrayList.get(i)) == c18959) {
                m52172(c2551, c21943, i, c189510);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m52196(C21943 c21943, C18959 c18959) {
        ArrayList arrayList = (ArrayList) c21943.mo1986();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == c18959) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C21943 m52192(C21943 c21943) {
        C21943 c21943M52158 = m52158(c21943.m49643(), EnumC1763.EXC_TOP_SPLITTER);
        if (c21943M52158 != null) {
            return c21943M52158;
        }
        throw new C8597("Can't find top splitter block for handler:" + c21943);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m52164(C2551 c2551, C19684 c19684) {
        C21943 c21943M45368 = c19684.m45368();
        C21943 c21943M52192 = m52192(c21943M45368);
        List listM32377 = c19684.m45357().m32377();
        ArrayList arrayList = new ArrayList(m52151(c2551, c21943M45368.m49638()));
        BitSet bitSetM52197 = m52197(c2551);
        while (!arrayList.isEmpty()) {
            C21943 c21943 = (C21943) arrayList.remove(0);
            if (!bitSetM52197.get(c21943.m49644())) {
                bitSetM52197.set(c21943.m49644());
                for (C21943 c21944 : c21943.m49643()) {
                    if (!C1170.stream(listM32377).anyMatch(new C12788(c21944, 0)) && m52193(c21943M52192, c21944) && c21943 != c2551.m8491()) {
                        return c21943;
                    }
                }
                arrayList.addAll(m52151(c2551, c21943.m49638()));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m52158(List list, EnumC1763 enumC1763) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21943 c21943 = (C21943) it.next();
            if (c21943.mo17865(enumC1763)) {
                return c21943;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m52208(C21943 c21943, C21943 c21944) {
        C21943 c21943M52203;
        C21943 c21943M52204;
        if (c21943 == c21944) {
            return true;
        }
        if (c21943 == null || c21944 == null) {
            return false;
        }
        return m52195(c21943, c21944) || (c21943M52203 = m52203(c21943)) == (c21943M52204 = m52203(c21944)) || m52195(c21943M52203, c21943M52204) || m52189(c21943, c21944);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m52195(C21943 c21943, C21943 c21944) {
        c21943.getClass();
        EnumC1763 enumC1763 = EnumC1763.RETURN;
        if (c21943.mo17865(enumC1763)) {
            c21944.getClass();
            if (c21944.mo17865(enumC1763)) {
                List listMo1986 = c21943.mo1986();
                List listMo1987 = c21944.mo1986();
                ArrayList arrayList = (ArrayList) listMo1986;
                if (arrayList.size() == 1) {
                    ArrayList arrayList2 = (ArrayList) listMo1987;
                    if (arrayList2.size() == 1) {
                        C18959 c18959 = (C18959) arrayList.get(0);
                        C18959 c189510 = (C18959) arrayList2.get(0);
                        if (c18959.m44039() == c189510.m44039()) {
                            if (c18959.m44039() != 0) {
                                AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
                                AbstractC16481 abstractC16481Mo44036 = c189510.mo44035(0);
                                if (!((abstractC16481Mo44035.m39122() && abstractC16481Mo44036.m39122()) ? abstractC16481Mo44035.equals(abstractC16481Mo44036) : false)) {
                                    if (c18959.m16977() == c189510.m16977()) {
                                        return abstractC16481Mo44035.equals(abstractC16481Mo44036);
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m52189(C21943 c21943, C21943 c21944) {
        if (c21943.m49646().size() == 1 && c21944.m49646().size() == 1 && ((C21943) c21943.m49646().get(0)).equals(c21944.m49646().get(0))) {
            List listMo1986 = c21943.mo1986();
            ArrayList arrayList = (ArrayList) listMo1986;
            ArrayList arrayList2 = (ArrayList) c21944.mo1986();
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C18959 c18959 = (C18959) arrayList.get(i);
                    C18959 c189510 = (C18959) arrayList2.get(i);
                    if (c18959 != c189510) {
                        if (c18959.mo4075(c189510) && C17359.equals(c18959.m44026(), c189510.m44026())) {
                            C6041 c6041M44027 = c18959.m44027();
                            C6041 c6041M44028 = c189510.m44027();
                            if (c6041M44027 == null || c6041M44028 == null) {
                                if (c6041M44027 == c6041M44028) {
                                }
                            } else if (c6041M44027.m17532() == c6041M44028.m17532()) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
