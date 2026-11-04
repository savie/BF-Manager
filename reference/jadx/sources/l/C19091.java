package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ᩳ۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6FM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19091 extends AbstractC16700 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        return "OverrideMethodVisitor";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16260 m44201(C2551 c2551, ArrayList arrayList, HashSet hashSet, C16260 c16260) {
        Collection collection;
        Set set;
        if (arrayList.isEmpty() && c16260 == null) {
            return null;
        }
        if (c16260 == null) {
            return m44202(c2551, (List) C1170.stream(arrayList).distinct().collect(C2025.toList()), (Set) hashSet, false);
        }
        List listM38596 = c16260.m38596();
        if (C4123.m13229((Collection) arrayList)) {
            collection = listM38596;
        } else if (!C4123.m13229((Collection) listM38596)) {
            collection = arrayList;
            ArrayList arrayList2 = new ArrayList(listM38596.size() + arrayList.size());
            arrayList2.addAll(arrayList);
            arrayList2.addAll(listM38596);
            collection = arrayList2;
        }
        collection = arrayList;
        List list = (List) C1170.stream(collection).distinct().collect(C2025.toList());
        Set setM38593 = c16260.m38593();
        if (C4123.m13229(hashSet)) {
            set = setM38593;
        } else if (!C4123.m13229(setM38593)) {
            set = hashSet;
            HashSet hashSet2 = new HashSet(setM38593.size() + hashSet.size());
            hashSet2.addAll(hashSet);
            hashSet2.addAll(setM38593);
            set = hashSet2;
        }
        set = hashSet;
        return m44202(c2551, list, set, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16260 m44202(C2551 c2551, List list, Set set, boolean z) {
        SortedSet treeSet;
        List listSubList;
        C16260 c16260;
        SortedSet sortedSetM38595;
        ArrayList<C2551> arrayList = new ArrayList(list.size() + 1);
        arrayList.add(c2551);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC21197 interfaceC21197 = (InterfaceC21197) it.next();
            if (interfaceC21197 instanceof C2551) {
                arrayList.add((C2551) interfaceC21197);
            }
        }
        C11457 c11457 = C11457.f36025;
        if (z) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    treeSet = null;
                    break;
                }
                C16260 c16261 = (C16260) ((C2551) it2.next()).mo17862((InterfaceC2157) c11457);
                if (c16261 != null) {
                    treeSet = c16261.m38595();
                    break;
                }
            }
            if (treeSet != null) {
                treeSet.addAll(arrayList);
            } else {
                treeSet = new TreeSet(arrayList);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C16260 c16262 = (C16260) ((C2551) it3.next()).mo17862((InterfaceC2157) c11457);
                if (c16262 != null && treeSet != (sortedSetM38595 = c16262.m38595())) {
                    treeSet.addAll(sortedSetM38595);
                }
            }
        } else {
            treeSet = new TreeSet(arrayList);
        }
        int i = 0;
        for (C2551 c2552 : arrayList) {
            if (i == 0) {
                i = 1;
            } else if (z && (c16260 = (C16260) c2552.mo17862((InterfaceC2157) c11457)) != null) {
                c16260.m38594(treeSet);
            } else {
                if (i == 0) {
                    listSubList = list;
                } else {
                    int size = list.size();
                    if (i >= size) {
                        listSubList = Collections.EMPTY_LIST;
                    } else {
                        listSubList = list.subList(i, size);
                    }
                }
                c2552.mo17864(new C16260(listSubList, treeSet, set));
                i++;
            }
        }
        return new C16260(list, treeSet, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        C7904 c7904;
        Iterator it;
        InterfaceC21197 interfaceC21197;
        C2551 c2551;
        boolean zEquals;
        InterfaceC21197 interfaceC21198;
        boolean z;
        boolean z2;
        AbstractC1566 abstractC1566M10106;
        boolean z3;
        int size;
        C16260 c16260;
        InterfaceC21197 interfaceC21199;
        Object obj;
        AbstractC1566 abstractC1566M10107;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        m44203(c24927, linkedHashSet, hashSet);
        C16260 c16261 = null;
        if (linkedHashSet.isEmpty()) {
            c7904 = null;
        } else {
            if (hashSet.isEmpty()) {
                throw new C8597("No end types in class hierarchy: " + c24927);
            }
            c7904 = new C7904(new ArrayList(linkedHashSet), hashSet);
        }
        if (c7904 == null) {
            return true;
        }
        Iterator it2 = c24927.getMethods().iterator();
        while (it2.hasNext()) {
            C2551 c2552 = (C2551) it2.next();
            if (c2552.m8529() || c2552.mo8547().m26540() || c2552.mo8547().m26549()) {
                it = it2;
            } else {
                C11457 c11457 = C11457.f36025;
                C16260 c16260M44201 = (C16260) c2552.mo17862((InterfaceC2157) c11457);
                if (c16260M44201 == null) {
                    C24927 c24927M8536 = c2552.m8536();
                    String strM49697 = c2552.mo8532().m49697(false, false);
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet2 = new HashSet();
                    Iterator it3 = ((ArrayList) c7904.m21442()).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            AbstractC1566 abstractC1566 = (AbstractC1566) it3.next();
                            C24927 c24927M5672 = c2552.mo8527().m5672(abstractC1566);
                            if (c24927M5672 == null) {
                                it = it2;
                                C7289 c7289M49222 = c2552.mo8527().m5691().m49222(abstractC1566);
                                if (c7289M49222 != null) {
                                    for (Map.Entry entry : c7289M49222.m19960().entrySet()) {
                                        if (((String) entry.getKey()).startsWith(strM49697)) {
                                            arrayList.add((InterfaceC21197) entry.getValue());
                                            break;
                                        }
                                    }
                                }
                            } else {
                                String strM49701 = c2552.mo8532().m49701();
                                Iterator it4 = c24927M5672.getMethods().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        c2551 = (C2551) it4.next();
                                        if (c2551.mo8532().m49701().equals(strM49701) && !c2551.mo8547().m26540()) {
                                            it = it2;
                                            break;
                                        }
                                    } else {
                                        Iterator it5 = c24927M5672.getMethods().iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                it = it2;
                                                c2551 = c16261;
                                                break;
                                            }
                                            c2551 = (C2551) it5.next();
                                            if (c2551.mo8532().m49701().startsWith(strM49697) && !c2551.mo8547().m26540()) {
                                                it = it2;
                                                EnumC7215 enumC7215M23403 = c24927M5672.mo8527().m5687().m23403(c2551.mo8532().m49698(), c2552.mo8532().m49698());
                                                if (enumC7215M23403.m19811()) {
                                                    break;
                                                }
                                                if (enumC7215M23403 == EnumC7215.UNKNOWN || enumC7215M23403 == EnumC7215.CONFLICT) {
                                                    c2552.m31133("Possible override for method " + c2551.mo8532().m49694());
                                                }
                                                it2 = it;
                                            }
                                        }
                                    }
                                }
                                if (c2551 != 0) {
                                    C10293 c10293Mo8547 = c2551.mo8547();
                                    if (c10293Mo8547.m26549()) {
                                        zEquals = false;
                                    } else {
                                        zEquals = (c10293Mo8547.m26542() || c10293Mo8547.m26541()) ? true : C17359.equals(c2551.m8536().m55583(), c24927M8536.m55583());
                                    }
                                    if (zEquals) {
                                        arrayList.add(c2551);
                                        C16260 c16262 = (C16260) c2551.mo17862((InterfaceC2157) c11457);
                                        if (c16262 != null) {
                                            if (((HashSet) c7904.m21441()).contains(abstractC1566.mo5570()) && (interfaceC21198 = (InterfaceC21197) C4123.m13231((List) arrayList)) != null) {
                                                hashSet2.add(interfaceC21198);
                                            }
                                            c16260M44201 = m44201(c2552, arrayList, hashSet2, c16262);
                                            break;
                                        }
                                    }
                                }
                            }
                            if (((HashSet) c7904.m21441()).contains(abstractC1566.mo5570()) && (interfaceC21197 = (InterfaceC21197) C4123.m13231((List) arrayList)) != null) {
                                hashSet2.add(interfaceC21197);
                            }
                            it2 = it;
                        } else {
                            it = it2;
                            c16260M44201 = m44201(c2552, arrayList, hashSet2, c16261);
                            break;
                        }
                    }
                } else {
                    it = it2;
                }
                if (c16260M44201 == null) {
                    continue;
                } else {
                    if (c16260M44201.m38593().isEmpty()) {
                        throw new C8597("No base methods for override attribute: " + c16260M44201.m38596());
                    }
                    c2552.mo17864(c16260M44201);
                    Set setM38593 = c16260M44201.m38593();
                    InterfaceC21197 interfaceC211910 = (InterfaceC21197) ((setM38593 == null || setM38593.size() != 1) ? c16261 : setM38593.iterator().next());
                    if (interfaceC211910 != null) {
                        AbstractC1566 abstractC1566Mo8519 = c2552.mo8519();
                        if (abstractC1566Mo8519 == AbstractC1566.f5416) {
                            z2 = false;
                        } else {
                            AbstractC1566 abstractC1566Mo85110 = interfaceC211910.mo8519();
                            if (c2552.mo8519().equals(abstractC1566Mo85110) || !abstractC1566Mo85110.m5567()) {
                                z = false;
                                break;
                            }
                            C8706 c8706M26142 = c2552.mo8527().m5685().m26142();
                            AbstractC1566 type = interfaceC211910.mo8532().m49700().getType();
                            Iterator it6 = ((ArrayList) c7904.m21442()).iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    z = false;
                                    break;
                                }
                                AbstractC1566 abstractC1567 = (AbstractC1566) it6.next();
                                if (c8706M26142.m23403(abstractC1567, type) == EnumC7215.NARROW_BY_GENERIC && (abstractC1566M10106 = c2552.mo8527().m5692().m10106(abstractC1567, abstractC1567, abstractC1566Mo85110)) != null && !abstractC1566M10106.m5567() && !abstractC1566M10106.equals(c2552.mo8519())) {
                                    c2552.m8551(abstractC1566M10106);
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                c2552.m31133("Return type fixed from '" + abstractC1566Mo8519 + "' to match base method");
                            }
                            z2 = z;
                        }
                        List listMo8537 = c2552.mo8537();
                        List listMo8538 = interfaceC211910.mo8537();
                        if (!listMo8537.equals(listMo8538) && (size = listMo8537.size()) == listMo8538.size()) {
                            ArrayList arrayList2 = new ArrayList(size);
                            boolean z4 = false;
                            int i = 0;
                            while (i < size) {
                                AbstractC1566 abstractC1568 = (AbstractC1566) c2552.mo8537().get(i);
                                AbstractC1566 abstractC1569 = (AbstractC1566) interfaceC211910.mo8537().get(i);
                                if (!abstractC1568.equals(abstractC1569) && abstractC1569.m5567()) {
                                    c16260 = c16261;
                                    C8706 c8706M26143 = c2552.mo8527().m5685().m26142();
                                    AbstractC1566 type2 = interfaceC211910.mo8532().m49700().getType();
                                    Iterator it7 = ((ArrayList) c7904.m21442()).iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            interfaceC21199 = interfaceC211910;
                                            obj = null;
                                            break;
                                        }
                                        AbstractC1566 abstractC15610 = (AbstractC1566) it7.next();
                                        interfaceC21199 = interfaceC211910;
                                        if (c8706M26143.m23403(abstractC15610, type2) == EnumC7215.NARROW_BY_GENERIC && (abstractC1566M10107 = c2552.mo8527().m5692().m10106(abstractC15610, abstractC15610, abstractC1569)) != null && !abstractC1566M10107.m5567() && !abstractC1566M10107.equals(abstractC1568)) {
                                            obj = abstractC1566M10107;
                                            break;
                                        }
                                        interfaceC211910 = interfaceC21199;
                                    }
                                } else {
                                    c16260 = c16261;
                                    c16260 = c16261;
                                    interfaceC21199 = interfaceC211910;
                                    obj = c16260;
                                }
                                if (obj != null) {
                                    arrayList2.add(obj);
                                    z4 = true;
                                } else {
                                    arrayList2.add((AbstractC1566) listMo8537.get(i));
                                }
                                i++;
                                c16260 = null;
                                interfaceC211910 = interfaceC21199;
                            }
                            if (z4) {
                                c16260 = c16261;
                                c2552.m8549(arrayList2);
                            }
                            c16260 = c16261;
                            z3 = z4;
                        } else {
                            z3 = false;
                        }
                        if (z3 || z2) {
                            String strM49696 = c2552.mo8532().m49696();
                            c16261 = null;
                            c16261 = null;
                            String strM49690 = C21965.m49690(strM49696, c2552.mo8537(), null);
                            for (C2551 c2553 : c2552.m8536().getMethods()) {
                                if (c2553.m8522().equals(strM49696) && c2553 != c2552 && c2553.mo8532().m49697(true, false).equals(strM49690)) {
                                    c2553.mo17864(new C17006(c2552));
                                    break;
                                }
                            }
                        } else {
                            c16261 = null;
                        }
                    }
                }
            }
            it2 = it;
            c16261 = c16261;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44203(C24927 c24927, LinkedHashSet linkedHashSet, HashSet hashSet) {
        C1610 c1610Mo8527 = c24927.mo8527();
        AbstractC1566 abstractC1566M55553 = c24927.m55553();
        int iM44200 = abstractC1566M55553 != null ? m44200(c1610Mo8527, linkedHashSet, hashSet, abstractC1566M55553) : 0;
        Iterator it = c24927.m55564().iterator();
        while (it.hasNext()) {
            iM44200 += m44200(c1610Mo8527, linkedHashSet, hashSet, (AbstractC1566) it.next());
        }
        if (iM44200 == 0) {
            hashSet.add(c24927.getType().mo5570());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m44200(C1610 c1610, LinkedHashSet linkedHashSet, HashSet hashSet, AbstractC1566 abstractC1566) {
        if (C17359.equals(abstractC1566, AbstractC1566.f5426) || !linkedHashSet.add(abstractC1566)) {
            return 0;
        }
        C24927 c24927M5672 = c1610.m5672(abstractC1566);
        if (c24927M5672 != null) {
            m44203(c24927M5672, linkedHashSet, hashSet);
            return 1;
        }
        C7289 c7289M49222 = c1610.m5691().m49222(abstractC1566);
        if (c7289M49222 != null) {
            int iM44200 = 0;
            for (AbstractC1566 abstractC1567 : c7289M49222.m19961()) {
                iM44200 += m44200(c1610, linkedHashSet, hashSet, abstractC1567);
            }
            if (iM44200 == 0) {
                hashSet.add(abstractC1566.mo5570());
            }
            return 1;
        }
        hashSet.add(abstractC1566.mo5570());
        return 1;
    }
}
