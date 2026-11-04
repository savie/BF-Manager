package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚᩳ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C5834 extends C17766 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m17020(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map m17022(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C11053.f34872;
        }
        if (size == 1) {
            C21914 c21914 = (C21914) arrayList.get(0);
            C15243.m36590(c21914, "pair");
            Map mapSingletonMap = Collections.singletonMap(c21914.m49601(), c21914.m49603());
            C15243.m36591(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m17020(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C21914 c21915 = (C21914) it.next();
            linkedHashMap.put(c21915.m49600(), c21915.m49602());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map m17023(LinkedHashMap linkedHashMap) {
        C15243.m36590(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size == 0) {
            return C11053.f34872;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        C15243.m36590(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C15243.m36591(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
