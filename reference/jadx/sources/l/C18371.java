package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77D */
/* JADX INFO: loaded from: classes4.dex */
public final class C18371 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C4201 f59860 = new C4201();

    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m42848(ArrayList arrayList) {
        C18812 c18812;
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7625 c7625 = (C7625) it.next();
            C9861 c9861 = c7625.f25167;
            C9861 c9862 = c7625.f25166;
            if (c9861 != null) {
                linkedHashSet.add(c9861);
            }
            if (c9862 != null) {
                linkedHashSet2.add(c9862);
            }
            if (c9861 != null && c9862 != null) {
                ((List) C11392.computeIfAbsent(linkedHashMap, new C21355(c9861, c9862), new C3455())).add(c7625);
                ((Set) C11392.computeIfAbsent(linkedHashMap4, c9862, new C20609())).add(c9861);
                ((Set) C11392.computeIfAbsent(linkedHashMap5, c9861, new C12404())).add(c9862);
            } else if (c9861 != null) {
                ((List) C11392.computeIfAbsent(linkedHashMap2, c9861, new C6439())).add(c7625);
            } else if (c9862 != null) {
                ((List) C11392.computeIfAbsent(linkedHashMap3, c9862, new C24339())).add(c7625);
            }
        }
        long jM42847 = m42847(linkedHashSet, linkedHashSet2, linkedHashMap4);
        long jM42848 = m42847(linkedHashSet2, linkedHashSet, linkedHashMap5);
        boolean z = false;
        if (jM42847 >= jM42848) {
            if (jM42848 < jM42847) {
                z = true;
            } else {
                Iterator it2 = linkedHashSet.iterator();
                long j = 0;
                long j2 = 0;
                while (it2.hasNext()) {
                    long j3 = ((C9861) it2.next()).f31732;
                    if (j3 > j2) {
                        j2 = j3;
                    }
                }
                Iterator it3 = linkedHashSet2.iterator();
                while (it3.hasNext()) {
                    long j4 = ((C9861) it3.next()).f31732;
                    if (j4 > j) {
                        j = j4;
                    }
                }
                if (j2 <= j && j > j2) {
                    z = true;
                }
            }
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        LinkedHashMap linkedHashMap8 = !z ? linkedHashMap2 : linkedHashMap3;
        if (!z) {
            linkedHashMap2 = linkedHashMap3;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C21355 c21355 = (C21355) entry.getKey();
            C9861 c9863 = !z ? c21355.f68019 : c21355.f68020;
            C21355 c21356 = (C21355) entry.getKey();
            C9861 c9864 = !z ? c21356.f68020 : c21356.f68019;
            List list = (List) C11392.computeIfAbsent(linkedHashMap6, c9863, new C17625());
            Iterator it4 = list.iterator();
            do {
                if (!it4.hasNext()) {
                    c18812 = null;
                    break;
                }
                c18812 = (C18812) it4.next();
            } while (c18812.f61134 != c9864);
            if (c18812 == null) {
                c18812 = new C18812(c9863, c9864);
                list.add(c18812);
            }
            c18812.f61133.addAll((Collection) entry.getValue());
        }
        ArrayList<C9861> arrayList2 = new ArrayList(linkedHashMap6.keySet());
        C12884.sort(arrayList2, f59860);
        HashMap map = new HashMap();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List<C18812> list2 = (List) linkedHashMap6.get((C9861) it5.next());
            C12884.sort(list2, new C14641());
            for (C18812 c18813 : list2) {
                C11392.putIfAbsent(map, c18813.f61134, c18813);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            C18812 c18814 = (C18812) map.get(entry2.getKey());
            if (c18814 != null) {
                c18814.f61133.addAll((Collection) entry2.getValue());
            } else {
                arrayList3.add(new C18812((C9861) entry2.getKey(), (List) entry2.getValue()));
            }
        }
        for (Map.Entry entry3 : linkedHashMap8.entrySet()) {
            if (linkedHashMap6.containsKey(entry3.getKey())) {
                linkedHashMap7.put((C9861) entry3.getKey(), new C18812((C9861) entry3.getKey(), (List) entry3.getValue()));
            } else {
                arrayList3.add(new C18812((C9861) entry3.getKey(), (List) entry3.getValue()));
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (C9861 c9865 : arrayList2) {
            List list3 = (List) linkedHashMap6.get(c9865);
            C12884.sort(list3, new C16133());
            arrayList4.addAll(list3);
            C18812 c18815 = (C18812) linkedHashMap7.get(c9865);
            if (c18815 != null) {
                arrayList4.add(c18815);
            }
        }
        C12884.sort(arrayList3, new C23593());
        arrayList4.addAll(arrayList3);
        return arrayList4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m42847(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap) {
        Iterator it = linkedHashSet.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((C9861) it.next()).f31732;
        }
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            C9861 c9861 = (C9861) it2.next();
            Set set = (Set) linkedHashMap.get(c9861);
            int iMax = 1;
            if (set != null) {
                iMax = Math.max(1, set.size());
            }
            j += c9861.f31732 * ((long) iMax);
        }
        return j;
    }
}
