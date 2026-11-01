package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵᩷۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes5.dex */
public final class C19710 extends C16182 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m44828(int i) {
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
    public static Map m44830(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C15477.f50426;
        }
        if (size == 1) {
            C15083 c15083 = (C15083) arrayList.get(0);
            C13465.m32966(c15083, "pair");
            Map mapSingletonMap = Collections.singletonMap(c15083.m36158(), c15083.m36156());
            C13465.m32967(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m44828(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C15083 c15084 = (C15083) it.next();
            linkedHashMap.put(c15084.m36157(), c15084.m36159());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map m44831(LinkedHashMap linkedHashMap) {
        C13465.m32966(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size == 0) {
            return C15477.f50426;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        C13465.m32966(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C13465.m32967(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
