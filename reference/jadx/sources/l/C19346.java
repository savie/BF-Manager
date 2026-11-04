package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R6F1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19346 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f62508 = C16980.m40037(C19346.class);

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        List listM44766;
        C11457 c11457 = C11457.f36027;
        if (c2551.m8524() || c2551.m8560()) {
            return;
        }
        try {
            List<C12971> listMo17861 = c2551.mo17861(c11457);
            ArrayList arrayList = new ArrayList();
            boolean zM44771 = false;
            boolean z = false;
            for (C12971 c12971 : listMo17861) {
                C8159 c8159M44768 = m44768(c2551, c12971);
                if (c8159M44768 != null && (listM44766 = m44766(c2551, c8159M44768, c8159M44768.f26920)) != null) {
                    if (!listM44766.isEmpty() && !C23231.m52188(listM44766)) {
                        arrayList.add(c12971);
                    } else {
                        c8159M44768.f26920.m45357().m32372(c8159M44768.f26920);
                        z = true;
                    }
                }
            }
            if (z) {
                c2551.m8513();
                ArrayList arrayList2 = new ArrayList(listMo17861);
                if (C1170.removeIf(arrayList2, new C18214(1))) {
                    c2551.m39419(c11457);
                    c2551.m39413(c11457, (List) arrayList2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C8159 c8159M44769 = m44768(c2551, (C12971) it.next());
                if (c8159M44769 != null) {
                    m44766(c2551, c8159M44769, c8159M44769.f26920);
                    zM44771 |= m44771(c2551, c8159M44769);
                }
            }
            if (zM44771) {
                c2551.m8513();
                ArrayList arrayList3 = new ArrayList(listMo17861);
                if (C1170.removeIf(arrayList3, new C18214(1))) {
                    c2551.m39419(c11457);
                    c2551.m39413(c11457, (List) arrayList3);
                }
            }
        } catch (Exception e) {
            f62508.mo13724("MarkFinallyVisitor error", (Throwable) e);
            try {
                c2551.mo8527().m5694().m4866(c2551);
            } catch (Exception e2) {
                C23977.m53506(c2551, "Undo finally extract failed", e2);
            }
            c2551.m31134("Undo finally extract visitor", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8159 m44768(C2551 c2551, C12971 c12971) {
        C19684 c19684;
        HashMap map;
        Iterator it;
        if (!c12971.m32378()) {
            Iterator it2 = c12971.m32377().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c19684 = null;
                    break;
                }
                C19684 c19685 = (C19684) it2.next();
                if (c19685.m45366()) {
                    c19684 = c19685;
                    break;
                }
            }
            if (c19684 != null) {
                HashMap mapM32380 = c12971.m32380();
                C11479 c11479 = new C11479(c12971, mapM32380.size());
                c11479.m28853(mapM32380);
                HashMap mapM28852 = c11479.m28852(c2551);
                HashMap mapM32381 = c12971.m32380();
                C1447 c1447 = new C1447();
                Iterator it3 = mapM28852.keySet().iterator();
                while (it3.hasNext()) {
                    final C21943 c21943 = (C21943) it3.next();
                    for (C5514 c5514 : (List) mapM28852.get(c21943)) {
                        C21943 c21944 = (C21943) mapM32381.get(c5514);
                        boolean z = (c5514.m16420() && C6823.m19003((Collection) c11479.m28851(), (Predicate) new C8618(2))) ? false : true;
                        ArrayList arrayListM52149 = C23231.m52149(c21944, z, new C19355(2, c21943));
                        List listM19008 = C6823.m19008((Collection) arrayListM52149, (Predicate) new C19060(1));
                        if (listM19008.isEmpty()) {
                            map = mapM32381;
                            it = it3;
                            break;
                        }
                        Iterator it4 = listM19008.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                map = mapM32381;
                                it = it3;
                                break;
                            }
                            C12971 c12972 = null;
                            for (C21943 c21945 : ((C21943) it4.next()).m49639()) {
                                HashMap map2 = mapM32381;
                                Iterator it5 = it3;
                                C11457 c11457 = C11457.f36033;
                                if (c21945.mo17867(c11457)) {
                                    c12972 = (C12971) c21945.mo17862((InterfaceC2157) c11457);
                                }
                                mapM32381 = map2;
                                it3 = it5;
                            }
                            map = mapM32381;
                            it = it3;
                            if (c12972 != null && !C12971.m32366(c12972)) {
                                if (!z) {
                                    break;
                                }
                                arrayListM52149 = C23231.m52149(c21944, false, new Predicate() { // from class: l.ۢ᩷᩵
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
                                        return ((C21943) obj) == c21943;
                                    }
                                });
                                break;
                            }
                            mapM32381 = map;
                            it3 = it;
                        }
                        if (c5514.m16420()) {
                            ArrayList arrayList = new ArrayList(arrayListM52149);
                            arrayList.addAll(c12971.m32368());
                            arrayListM52149 = arrayList;
                        }
                        c1447.put(c5514, arrayListM52149);
                        mapM32381 = map;
                        it3 = it;
                    }
                }
                List listM5204 = c1447.m5204(c19684);
                if (listM5204 != null) {
                    for (C5514 c5515 : c1447.keySet()) {
                        if (!c5515.m16418() || c5515.m16417() != c19684) {
                            c1447.get((Object) c5515).removeAll(listM5204);
                        }
                    }
                }
                return new C8159(c12971, c11479, c19684, mapM28852, c1447);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44771(C2551 c2551, C8159 c8159) {
        HashMap map;
        C21943 c21943;
        C21943 c21944;
        List linkedList;
        boolean z = false;
        if (!c8159.f26923.isEmpty()) {
            boolean zIsEmpty = c8159.f26919.m32374().isEmpty();
            if (!m44767(c8159.f26919).isEmpty()) {
                List listM5204 = c8159.f26925.m5204(c8159.f26920);
                C19684 c19684 = c8159.f26920;
                Iterator it = ((HashMap) c8159.f26921).keySet().iterator();
                loop0: while (true) {
                    map = null;
                    if (!it.hasNext()) {
                        c21943 = null;
                        break;
                    }
                    C21943 c21945 = (C21943) it.next();
                    for (C5514 c5514 : (List) ((HashMap) c8159.f26921).get(c21945)) {
                        if (!c5514.m16420() && c5514.m16417().equals(c19684)) {
                            c21943 = c21945;
                            break loop0;
                        }
                    }
                }
                if (c21943 != null) {
                    HashMap map2 = new HashMap();
                    for (C5514 c5515 : c8159.f26925.keySet()) {
                        if (!c5515.m16418() || c5515.m16417() != c8159.f26920) {
                            List list = c8159.f26925.get((Object) c5515);
                            Iterator it2 = ((HashMap) c8159.f26921).keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    c21944 = null;
                                    break;
                                }
                                C21943 c21946 = (C21943) it2.next();
                                if (((List) ((HashMap) c8159.f26921).get(c21946)).contains(c5515)) {
                                    c21944 = c21946;
                                    break;
                                }
                            }
                            if (c21944 == null) {
                                throw new C8597("Expected to find fallthrough terminus for handler " + c5515);
                            }
                            List<C7830> listM9615 = new C2938(null).m9615(new C7830(c2551, new C24018(), c21943, c21944, listM5204, list));
                            HashSet hashSet = new HashSet();
                            HashSet hashSet2 = new HashSet();
                            for (C7830 c7830 : listM9615) {
                                for (C4869 c4869 : c7830.m21351()) {
                                    C18959 c18959 = (C18959) c4869.m14925();
                                    C18959 c189510 = (C18959) c4869.m14926();
                                    if (!map2.containsKey(c18959)) {
                                        linkedList = new LinkedList();
                                        map2.put(c18959, linkedList);
                                    } else {
                                        linkedList = (List) map2.get(c18959);
                                    }
                                    linkedList.add(c189510);
                                }
                                hashSet.addAll(c7830.m21350());
                                hashSet2.addAll(c7830.m21354());
                            }
                            if (c8159.f26924 == null) {
                                c8159.f26924 = hashSet;
                            } else {
                                c8159.f26924.retainAll(hashSet);
                            }
                            if (c8159.f26918 == null) {
                                c8159.f26918 = hashSet2;
                            } else {
                                c8159.f26918.addAll(hashSet2);
                            }
                        }
                    }
                    map = map2;
                }
                if (map != null && !map.isEmpty()) {
                    HashSet hashSet3 = new HashSet();
                    HashSet hashSet4 = new HashSet();
                    HashMap map3 = new HashMap();
                    for (C18959 c189511 : map.keySet()) {
                        List list2 = (List) map.get(c189511);
                        if (list2.size() != c8159.f26925.size() - 1) {
                            hashSet3.add(c189511);
                            hashSet4.addAll(list2);
                            return false;
                        }
                        map3.put(c189511, list2);
                    }
                    for (C18959 c189512 : map3.keySet()) {
                        c189512.mo17866(EnumC1763.FINALLY_INSNS);
                        for (C18959 c189513 : (List) map3.get(c189512)) {
                            m44770(c189512.m44027(), c189513.m44027());
                            int iM44039 = c189512.m44039();
                            for (int i = 0; i < iM44039; i++) {
                                m44770(c189512.mo44035(i), c189513.mo44035(i));
                            }
                            c189513.mo17866(EnumC1763.DONT_GENERATE);
                        }
                    }
                    for (C21943 c21947 : (HashSet) c8159.f26924) {
                        if (!C6823.m19003((Collection) c21947.mo1986(), (Predicate) new C23941(1, hashSet3))) {
                            c21947.mo17866(EnumC1763.FINALLY_INSNS);
                        }
                    }
                    for (C21943 c21948 : (HashSet) c8159.f26918) {
                        if (!C6823.m19003((Collection) c21948.mo1986(), (Predicate) new C23941(1, hashSet4))) {
                            c21948.mo17866(EnumC1763.DONT_GENERATE);
                        }
                    }
                    boolean zM19003 = C6823.m19003((Collection) c8159.f26922.m28851(), (Predicate) new C7568(1));
                    if (!zIsEmpty && !zM19003) {
                        z = true;
                    }
                    c8159.f26920.m45369();
                    if (z) {
                        List<C12971> listM32374 = c8159.f26919.m32374();
                        for (C12971 c12971 : listM32374) {
                            c8159.f26919.m32377().addAll(c12971.m32377());
                            c8159.f26919.m32368().addAll(c12971.m32368());
                            c12971.m32367();
                        }
                        c8159.f26919.m32370(new ArrayList(new LinkedHashSet(c8159.f26919.m32368())));
                        listM32374.clear();
                    }
                    Iterator it3 = c8159.f26923.iterator();
                    while (it3.hasNext()) {
                        C18959 c18959M52200 = C23231.m52200((InterfaceC23435) it3.next());
                        if (c18959M52200 != null) {
                            c18959M52200.mo17866(EnumC1763.DONT_GENERATE);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m44766(C2551 c2551, C8159 c8159, C19684 c19684) {
        C21943 c21943M45368 = c19684.m45368();
        List listM5204 = c8159.f26925.m5204(c19684);
        if (listM5204 == null) {
            return null;
        }
        C18959 c18959M52186 = C23231.m52186(c21943M45368);
        if (c18959M52186 != null && c18959M52186.getType() == EnumC24203.MOVE_EXCEPTION) {
            listM5204.remove(c21943M45368);
        }
        C21943 c21943M52159 = C23231.m52159(listM5204, false);
        if (c21943M52159 == null) {
            c2551.m31136("Bottom block not found for handler: " + c19684);
            return listM5204;
        }
        LinkedList<C21943> linkedList = new LinkedList();
        C23231.m52168(linkedList, c21943M52159, listM5204, new HashSet());
        if (!linkedList.isEmpty()) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                C18959 c18959M52200 = C23231.m52200((InterfaceC23435) it.next());
                if (c18959M52200 == null || c18959M52186 == null || c18959M52200.getType() != EnumC24203.THROW || c18959M52200.m44039() <= 0 || !c18959M52200.mo44035(0).equals(c18959M52186.m44027())) {
                }
            }
            ArrayList arrayList = new ArrayList(listM5204);
            for (C21943 c21943 : linkedList) {
                arrayList.remove(c21943);
                m44769(arrayList, c21943);
                c8159.f26923.add(c21943);
            }
            return arrayList;
        }
        return listM5204;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m44767(C12971 c12971) {
        if (!c12971.m32374().isEmpty()) {
            ArrayList arrayList = new ArrayList(c12971.m32377());
            Iterator it = c12971.m32374().iterator();
            while (it.hasNext()) {
                arrayList.addAll(m44767((C12971) it.next()));
            }
            return arrayList;
        }
        return c12971.m32377();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44769(ArrayList arrayList, C21943 c21943) {
        for (C21943 c21944 : c21943.m49643()) {
            if (c21944.m49647() && arrayList.remove(c21944)) {
                if (!(c21944.m49639().contains(c21943) ? false : c21944.m49646().contains(c21943))) {
                    m44769(arrayList, c21944);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44770(AbstractC16481 abstractC16481, AbstractC16481 abstractC16482) {
        if (abstractC16481 == null || abstractC16482 == null || !(abstractC16481 instanceof C6041) || !(abstractC16482 instanceof C6041)) {
            return;
        }
        ((C6041) abstractC16482).m17530().m41934(((C6041) abstractC16481).m17530().m41945());
    }
}
