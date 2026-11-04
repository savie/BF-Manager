package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܰᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X6IH */
/* JADX INFO: loaded from: classes4.dex */
public final class C14804 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f48424 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f48425 = C16980.m40037(C14804.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2551 f48426;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3618 f48427;

    public C14804(C2551 c2551, C3618 c3618) {
        this.f48426 = c2551;
        this.f48427 = c3618;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0290 A[LOOP:8: B:109:0x028a->B:111:0x0290, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x029d A[LOOP:9: B:113:0x029b->B:114:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x032d  */
    /* JADX WARN: Code duplicated, block: B:136:0x033f A[LOOP:2: B:134:0x0339->B:136:0x033f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x0366  */
    /* JADX WARN: Code duplicated, block: B:144:0x0389  */
    /* JADX WARN: Code duplicated, block: B:153:0x03d5 A[LOOP:4: B:151:0x03cf->B:153:0x03d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:157:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:161:0x0403  */
    /* JADX WARN: Code duplicated, block: B:163:0x041b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0425  */
    /* JADX WARN: Code duplicated, block: B:166:0x0437  */
    /* JADX WARN: Code duplicated, block: B:169:0x0445  */
    /* JADX WARN: Code duplicated, block: B:170:0x0447  */
    /* JADX WARN: Code duplicated, block: B:172:0x045a  */
    /* JADX WARN: Code duplicated, block: B:175:0x046d  */
    /* JADX WARN: Code duplicated, block: B:192:0x0376 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x043f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0177  */
    /* JADX WARN: Code duplicated, block: B:51:0x0191  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m35649(C12050 c12050, C21943 c21943, C1082 c1082, C12567 c12567) {
        C21943 c21944;
        C21943 c21943M52202;
        final C21943 c21943M8491;
        C21943 c21945;
        Iterator it;
        final LinkedHashMap linkedHashMap;
        boolean zAnyMatch;
        C21943 c21946;
        C21943 c21947;
        C12050 c12050M11737;
        BitSet bitSetM52197;
        Iterator it2;
        LinkedHashMap linkedHashMap2;
        BitSet bitSetM49638;
        BitSet bitSet;
        C21943 c21943M49648;
        Iterator it3;
        int i;
        int length = c1082.m4074().length;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(length);
        C21943[] c21943ArrM4078 = c1082.m4078();
        for (int i2 = 0; i2 < length; i2++) {
            ((List) C11392.computeIfAbsent(linkedHashMap3, c21943ArrM4078[i2], new C13105(6))).add(c1082.m4071(i2));
        }
        C21943 c21943M4070 = c1082.m4070();
        if (c21943M4070 != null) {
            ((List) C11392.computeIfAbsent(linkedHashMap3, c21943M4070, new C8417(6))).add(C14287.f45114);
        }
        C14287 c14287 = new C14287(c12050, c21943);
        c1082.mo17864(new C4328(c14287));
        ((ArrayList) c12050.mo19035()).add(c14287);
        c12567.m31276(c14287);
        C2551 c2551 = this.f48426;
        BitSet bitSetM52198 = C23231.m52197(c2551);
        for (C21943 c21948 : c21943.m49639()) {
            if (!c21948.mo17865(EnumC1763.LOOP_END)) {
                bitSetM52198.or(c21948.m49638());
            }
        }
        bitSetM52198.clear(c21943.getId());
        bitSetM52198.clear(c2551.m8491().getId());
        int iCardinality = bitSetM52198.cardinality();
        C3618 c3618 = this.f48427;
        if (iCardinality == 1) {
            c21943M52202 = C23231.m52202(c2551, bitSetM52198);
        } else {
            C11785 c11785M8548 = c2551.m8548(c21943);
            if (c11785M8548 != null) {
                bitSetM52198.andNot(c11785M8548.m29616().m49637());
                bitSetM52198.andNot(c11785M8548.m29613().m49637());
                C21943 c21943M29613 = c11785M8548.m29613();
                if (bitSetM52198.cardinality() == 2 && bitSetM52198.get(c21943M29613.getId())) {
                    List listM52151 = C23231.m52151(c2551, bitSetM52198);
                    listM52151.remove(c21943M29613);
                    C21943 c21949 = (C21943) C4123.m13219(listM52151);
                    if (c21949 != null) {
                        Iterator it4 = c21943.m49639().iterator();
                        boolean z = false;
                        while (it4.hasNext()) {
                            C21943 c219410 = (C21943) it4.next();
                            if (!c219410.m49638().get(c21943M29613.getId()) || c219410 == c21949) {
                                c21945 = c21949;
                                it = it4;
                            } else {
                                HashSet hashSet = new HashSet(C23231.m52147(c2551, c219410, c219410));
                                if (hashSet.contains(c21949)) {
                                    c21945 = c21949;
                                    it = it4;
                                } else {
                                    c21945 = c21949;
                                    it = it4;
                                    if (!C1170.stream(c21949.m49643()).anyMatch(new C10576(1, hashSet))) {
                                        for (C21943 c219411 : c21943M29613.m49643()) {
                                            if (hashSet.contains(c219411) || c219411 == c219410) {
                                                c219411.getClass();
                                                if (!c219411.mo17865(EnumC1763.SYNTHETIC)) {
                                                    break;
                                                }
                                                ((ArrayList) c219411.mo1986()).add(new C18959(EnumC24203.CONTINUE, 0));
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            c21949 = c21945;
                            it4 = it;
                        }
                        C21943 c219412 = c21949;
                        if (z) {
                            bitSetM52198.clear(c21943M29613.getId());
                            c21944 = c219412;
                        } else {
                            c21944 = null;
                        }
                    } else {
                        c21944 = null;
                    }
                } else {
                    c21944 = null;
                }
                if (bitSetM52198.isEmpty()) {
                    c21943M8491 = c2551.m8491();
                }
                c12567.m31277(c21943M8491);
                linkedHashMap = new LinkedHashMap();
                if (c21943M8491 != null) {
                    Set setKeySet = linkedHashMap3.keySet();
                    bitSetM52197 = C23231.m52197(c2551);
                    it2 = setKeySet.iterator();
                    while (it2.hasNext()) {
                        bitSetM52197.set(((C21943) it2.next()).getId());
                    }
                    bitSetM52197.clear(c21943M8491.m49644());
                    for (C21943 c219413 : c14287.m34697().m49646()) {
                        bitSetM49638 = c219413.m49638();
                        if (bitSetM49638.intersects(bitSetM52197)) {
                            bitSet = new BitSet(c2551.m8508().size());
                            if (!bitSetM49638.isEmpty()) {
                                bitSet.or(bitSetM49638);
                            }
                            bitSet.clear(c21943M8491.m49644());
                            bitSet.and(bitSetM52197);
                            linkedHashMap.put(c219413, C23231.m52202(c2551, bitSet));
                        }
                    }
                    if (!linkedHashMap.isEmpty() && m35646(linkedHashMap3, linkedHashMap)) {
                        ArrayList<C21943> arrayList = new ArrayList(linkedHashMap3.size());
                        arrayList.addAll(linkedHashMap3.keySet());
                        C12884.sort(arrayList, new Comparator() { // from class: l.᩺ᩴ᩵
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                C21943 c219414 = (C21943) obj;
                                C21943 c219415 = (C21943) obj2;
                                LinkedHashMap linkedHashMap4 = linkedHashMap;
                                C21943 c219416 = (C21943) linkedHashMap4.get(c219414);
                                if (c219416 != null) {
                                    return c219415.equals(c219416) ? -1 : 0;
                                }
                                return c219414.equals(linkedHashMap4.get(c219415)) ? 1 : 0;
                            }
                        });
                        linkedHashMap2 = new LinkedHashMap(linkedHashMap3.size());
                        for (C21943 c219414 : arrayList) {
                            linkedHashMap2.put(c219414, (List) linkedHashMap3.get(c219414));
                        }
                        if (m35646(linkedHashMap2, linkedHashMap)) {
                            c2551.m31138("Can't fix incorrect switch cases order, some code will duplicate");
                            linkedHashMap.clear();
                        } else {
                            linkedHashMap3 = linkedHashMap2;
                        }
                    }
                }
                for (Map.Entry entry : linkedHashMap3.entrySet()) {
                    List list = (List) entry.getValue();
                    c21946 = (C21943) entry.getKey();
                    if (c12567.m31281(c21946)) {
                        c12050M11737 = new C12050(c12567.m31278());
                    } else {
                        c21947 = (C21943) linkedHashMap.get(c21946);
                        c12567.m31277(c21947);
                        c12050M11737 = c3618.m11737(c21946);
                        c12567.m31279(c21947);
                        if (c21947 != null) {
                            EnumC1763 enumC1763 = EnumC1763.FALL_THROUGH;
                            c21947.mo17866(enumC1763);
                            c12050M11737.mo17866(enumC1763);
                        }
                    }
                    c14287.m34696(list, c12050M11737);
                }
                if (c21943M4070 == null) {
                    zAnyMatch = true;
                } else {
                    zAnyMatch = C1170.stream(c14287.m34695()).anyMatch(new Predicate() { // from class: l.ۛᩴ᩵
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
                            return C14804.m35647(this.f22087, c21943M8491, (C3847) obj);
                        }
                    });
                }
                if (zAnyMatch) {
                    for (C3847 c3847 : new ArrayList(c14287.m34695())) {
                        if (!m35648(c21943M8491, c3847.m12478()) && (c3847.m12479().contains(C14287.f45114) || c1082.m4076())) {
                            C20531.m47067(c2551, c3847.m12478(), EnumC1763.DONT_GENERATE);
                            c14287.m34695().remove(c3847);
                        }
                    }
                }
                c12567.m31282();
                return c21943M8491;
            }
            c21944 = null;
            if (c21944 == null) {
                C21943 c21943M49649 = c21943.m49648();
                if (bitSetM52198.get(c21943M49649.getId())) {
                    c21943M52202 = c21943M49649;
                } else {
                    bitSetM52198.andNot(c21943.m49637());
                    c21943M52202 = C23231.m52202(c2551, bitSetM52198);
                }
            } else {
                c21943M52202 = c21944;
            }
        }
        if (c21943M52202 != null && c2551.m8521(c21943M52202)) {
            c21943M52202 = c2551.m8491();
        }
        C21943 c21943M496410 = c21943.m49648();
        if (c21943M52202 == null && c21943M496410 == c2551.m8491()) {
            c21943M8491 = c2551.m8491();
            List listM49643 = c21943M8491.m49643();
            int size = listM49643.size();
            if (size == 1) {
                c21943M8491 = (C21943) listM49643.get(0);
            } else if (c2551.mo8519() == AbstractC1566.f5416) {
                Iterator it5 = listM49643.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        C18959 c18959M52200 = C23231.m52200((InterfaceC23435) it5.next());
                        if (c18959M52200 == null || c18959M52200.getType() != EnumC24203.RETURN) {
                        }
                    } else {
                        it3 = listM49643.iterator();
                        while (it3.hasNext()) {
                            c12567.m31277((C21943) it3.next());
                        }
                        for (i = 1; i < size; i++) {
                            C21943 c219415 = (C21943) listM49643.get(i);
                            c219415.mo17866(EnumC1763.REMOVE);
                            c219415.mo17866(EnumC1763.ADDED_TO_REGION);
                        }
                        c21943M8491 = (C21943) listM49643.get(0);
                    }
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = listM49643.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        C18959 c18959M52201 = C23231.m52200((InterfaceC23435) it6.next());
                        if (c18959M52201 != null && c18959M52201.getType() == EnumC24203.RETURN) {
                            arrayList2.add(c18959M52201.mo44035(0));
                        }
                    } else {
                        AbstractC16481 abstractC16481 = (AbstractC16481) arrayList2.get(0);
                        abstractC16481.getClass();
                        if (abstractC16481 instanceof C6041) {
                            C6041 c6041 = (C6041) abstractC16481;
                            int i3 = 1;
                            while (true) {
                                if (i3 < size) {
                                    AbstractC16481 abstractC16482 = (AbstractC16481) arrayList2.get(i3);
                                    abstractC16482.getClass();
                                    if ((abstractC16482 instanceof C6041) && ((C6041) abstractC16482).m17534(c6041)) {
                                        i3++;
                                    }
                                } else {
                                    it3 = listM49643.iterator();
                                    while (it3.hasNext()) {
                                        c12567.m31277((C21943) it3.next());
                                    }
                                    while (i < size) {
                                        C21943 c219416 = (C21943) listM49643.get(i);
                                        c219416.mo17866(EnumC1763.REMOVE);
                                        c219416.mo17866(EnumC1763.ADDED_TO_REGION);
                                    }
                                    c21943M8491 = (C21943) listM49643.get(0);
                                }
                            }
                        } else {
                            int i4 = 1;
                            while (true) {
                                if (i4 >= size) {
                                    it3 = listM49643.iterator();
                                    while (it3.hasNext()) {
                                        c12567.m31277((C21943) it3.next());
                                    }
                                    while (i < size) {
                                        C21943 c219417 = (C21943) listM49643.get(i);
                                        c219417.mo17866(EnumC1763.REMOVE);
                                        c219417.mo17866(EnumC1763.ADDED_TO_REGION);
                                    }
                                    c21943M8491 = (C21943) listM49643.get(0);
                                } else if (((AbstractC16481) arrayList2.get(i4)).equals(abstractC16481)) {
                                    i4++;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (c21943M496410 == c1082.m4070() && c21943.m49639().contains(c21943M496410) && c21943.m49638().get(c21943M496410.getId())) {
                c12567.m31277(c21943M496410);
            }
            if (c21943M52202 == null) {
                c2551.m31138("Failed to find 'out' block for switch in " + c21943 + ". Please report as an issue.");
                c21943M49648 = c21943.m49648();
            } else {
                c21943M49648 = c21943M52202;
            }
            if (c21943M49648 == null || !c3618.m11739(c21943M49648)) {
                c21943M8491 = c21943M49648;
            } else {
                c2551.m31138("Switch 'out' block " + c21943M49648 + " for " + c21943 + " already processed. Defaulting to fallback option.");
                c21943M8491 = c21943.m49648();
            }
        }
        c12567.m31277(c21943M8491);
        linkedHashMap = new LinkedHashMap();
        if (c21943M8491 != null) {
            Set setKeySet2 = linkedHashMap3.keySet();
            bitSetM52197 = C23231.m52197(c2551);
            it2 = setKeySet2.iterator();
            while (it2.hasNext()) {
                bitSetM52197.set(((C21943) it2.next()).getId());
            }
            bitSetM52197.clear(c21943M8491.m49644());
            while (r8.hasNext()) {
                bitSetM49638 = c219413.m49638();
                if (bitSetM49638.intersects(bitSetM52197)) {
                    bitSet = new BitSet(c2551.m8508().size());
                    if (!bitSetM49638.isEmpty()) {
                        bitSet.or(bitSetM49638);
                    }
                    bitSet.clear(c21943M8491.m49644());
                    bitSet.and(bitSetM52197);
                    linkedHashMap.put(c219413, C23231.m52202(c2551, bitSet));
                }
            }
            if (!linkedHashMap.isEmpty()) {
                ArrayList<C21943> arrayList3 = new ArrayList(linkedHashMap3.size());
                arrayList3.addAll(linkedHashMap3.keySet());
                C12884.sort(arrayList3, new Comparator() { // from class: l.᩺ᩴ᩵
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        C21943 c219418 = (C21943) obj;
                        C21943 c219419 = (C21943) obj2;
                        LinkedHashMap linkedHashMap4 = linkedHashMap;
                        C21943 c2194110 = (C21943) linkedHashMap4.get(c219418);
                        if (c2194110 != null) {
                            return c219419.equals(c2194110) ? -1 : 0;
                        }
                        return c219418.equals(linkedHashMap4.get(c219419)) ? 1 : 0;
                    }
                });
                linkedHashMap2 = new LinkedHashMap(linkedHashMap3.size());
                while (r8.hasNext()) {
                    linkedHashMap2.put(c219414, (List) linkedHashMap3.get(c219414));
                }
                if (m35646(linkedHashMap2, linkedHashMap)) {
                    c2551.m31138("Can't fix incorrect switch cases order, some code will duplicate");
                    linkedHashMap.clear();
                } else {
                    linkedHashMap3 = linkedHashMap2;
                }
            }
        }
        while (r5.hasNext()) {
            List list2 = (List) entry.getValue();
            c21946 = (C21943) entry.getKey();
            if (c12567.m31281(c21946)) {
                c12050M11737 = new C12050(c12567.m31278());
            } else {
                c21947 = (C21943) linkedHashMap.get(c21946);
                c12567.m31277(c21947);
                c12050M11737 = c3618.m11737(c21946);
                c12567.m31279(c21947);
                if (c21947 != null) {
                    EnumC1763 enumC1764 = EnumC1763.FALL_THROUGH;
                    c21947.mo17866(enumC1764);
                    c12050M11737.mo17866(enumC1764);
                }
            }
            c14287.m34696(list2, c12050M11737);
        }
        if (c21943M4070 == null) {
            zAnyMatch = true;
        } else {
            zAnyMatch = C1170.stream(c14287.m34695()).anyMatch(new Predicate() { // from class: l.ۛᩴ᩵
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
                    return C14804.m35647(this.f22087, c21943M8491, (C3847) obj);
                }
            });
        }
        if (zAnyMatch) {
            while (r2.hasNext()) {
                if (!m35648(c21943M8491, c3847.m12478())) {
                }
            }
        }
        c12567.m31282();
        return c21943M8491;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35645(C2551 c2551, C14287 c14287) {
        Iterator it = c14287.m34695().iterator();
        while (it.hasNext()) {
            InterfaceC6281 interfaceC6281M12478 = ((C3847) it.next()).m12478();
            C18293 c18293 = new C18293(c2551);
            C20531.m47068(c2551, interfaceC6281M12478, new C13498(1, c18293));
            C24590.m54902(c2551, interfaceC6281M12478, new C4364(interfaceC6281M12478, c18293, c14287));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m35647(C14804 c14804, C21943 c21943, C3847 c3847) {
        return c3847.m12479().contains(C14287.f45114) && m35648(c21943, c3847.m12478());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35646(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        C21943 c21943 = null;
        for (C21943 c21944 : linkedHashMap.keySet()) {
            if (c21943 != null && !c21944.equals(c21943)) {
                return true;
            }
            c21943 = (C21943) linkedHashMap2.get(c21944);
        }
        return c21943 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35648(C21943 c21943, InterfaceC6281 interfaceC6281) {
        if (!C20531.m47075(interfaceC6281)) {
            if (interfaceC6281 instanceof C21943) {
                if (C23231.m52203((C21943) interfaceC6281) == c21943) {
                    return true;
                }
            } else {
                if (interfaceC6281 instanceof InterfaceC18213) {
                    Iterator it = ((InterfaceC18213) interfaceC6281).mo19035().iterator();
                    while (it.hasNext()) {
                        if (!m35648(c21943, (InterfaceC6281) it.next())) {
                        }
                    }
                    return true;
                }
                f48425.mo13721("Unexpected container type in switch");
            }
        }
        return false;
    }
}
