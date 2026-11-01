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

/* JADX INFO: renamed from: l.ۛܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77D */
/* JADX INFO: loaded from: classes2.dex */
public final class C6161 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C16745 f21016 = new C16745();

    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m17165(ArrayList arrayList) {
        C2072 c2072;
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
            C14774 c14774 = (C14774) it.next();
            C9835 c9835 = c14774.f48304;
            C9835 c9836 = c14774.f48303;
            if (c9835 != null) {
                linkedHashSet.add(c9835);
            }
            if (c9836 != null) {
                linkedHashSet2.add(c9836);
            }
            if (c9835 != null && c9836 != null) {
                ((List) C9735.computeIfAbsent(linkedHashMap, new C17450(c9835, c9836), new C7572())).add(c14774);
                ((Set) C9735.computeIfAbsent(linkedHashMap4, c9836, new C20978())).add(c9835);
                ((Set) C9735.computeIfAbsent(linkedHashMap5, c9835, new C16040())).add(c9836);
            } else if (c9835 != null) {
                ((List) C9735.computeIfAbsent(linkedHashMap2, c9835, new C20273())).add(c14774);
            } else if (c9836 != null) {
                ((List) C9735.computeIfAbsent(linkedHashMap3, c9836, new C0516())).add(c14774);
            }
        }
        long jM17164 = m17164(linkedHashSet, linkedHashSet2, linkedHashMap4);
        long jM17165 = m17164(linkedHashSet2, linkedHashSet, linkedHashMap5);
        boolean z = false;
        if (jM17164 >= jM17165) {
            if (jM17165 < jM17164) {
                z = true;
            } else {
                Iterator it2 = linkedHashSet.iterator();
                long j = 0;
                long j2 = 0;
                while (it2.hasNext()) {
                    long j3 = ((C9835) it2.next()).f33610;
                    if (j3 > j2) {
                        j2 = j3;
                    }
                }
                Iterator it3 = linkedHashSet2.iterator();
                while (it3.hasNext()) {
                    long j4 = ((C9835) it3.next()).f33610;
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
            C17450 c17450 = (C17450) entry.getKey();
            C9835 c9837 = !z ? c17450.f55549 : c17450.f55550;
            C17450 c17451 = (C17450) entry.getKey();
            C9835 c9838 = !z ? c17451.f55550 : c17451.f55549;
            List list = (List) C9735.computeIfAbsent(linkedHashMap6, c9837, new C19567());
            Iterator it4 = list.iterator();
            do {
                if (!it4.hasNext()) {
                    c2072 = null;
                    break;
                }
                c2072 = (C2072) it4.next();
            } while (c2072.f7667 != c9838);
            if (c2072 == null) {
                c2072 = new C2072(c9837, c9838);
                list.add(c2072);
            }
            c2072.f7666.addAll((Collection) entry.getValue());
        }
        ArrayList<C9835> arrayList2 = new ArrayList(linkedHashMap6.keySet());
        C23846.sort(arrayList2, f21016);
        HashMap map = new HashMap();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List<C2072> list2 = (List) linkedHashMap6.get((C9835) it5.next());
            C23846.sort(list2, new C12512());
            for (C2072 c2073 : list2) {
                C9735.putIfAbsent(map, c2073.f7667, c2073);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            C2072 c2074 = (C2072) map.get(entry2.getKey());
            if (c2074 != null) {
                c2074.f7666.addAll((Collection) entry2.getValue());
            } else {
                arrayList3.add(new C2072((C9835) entry2.getKey(), (List) entry2.getValue()));
            }
        }
        for (Map.Entry entry3 : linkedHashMap8.entrySet()) {
            if (linkedHashMap6.containsKey(entry3.getKey())) {
                linkedHashMap7.put((C9835) entry3.getKey(), new C2072((C9835) entry3.getKey(), (List) entry3.getValue()));
            } else {
                arrayList3.add(new C2072((C9835) entry3.getKey(), (List) entry3.getValue()));
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (C9835 c9839 : arrayList2) {
            List list3 = (List) linkedHashMap6.get(c9839);
            C23846.sort(list3, new C8984(0));
            arrayList4.addAll(list3);
            C2072 c2075 = (C2072) linkedHashMap7.get(c9839);
            if (c2075 != null) {
                arrayList4.add(c2075);
            }
        }
        C23846.sort(arrayList3, new C10395());
        arrayList4.addAll(arrayList3);
        return arrayList4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m17164(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap) {
        Iterator it = linkedHashSet.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((C9835) it.next()).f33610;
        }
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            C9835 c9835 = (C9835) it2.next();
            Set set = (Set) linkedHashMap.get(c9835);
            int iMax = 1;
            if (set != null) {
                iMax = Math.max(1, set.size());
            }
            j += c9835.f33610 * ((long) iMax);
        }
        return j;
    }
}
