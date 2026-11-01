package l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14179 {
    public final Map a;
    public final Map b;

    public C14179(Map map) {
        this.a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l2 = (Long) entry2.getKey();
                ConcurrentMapC13783 concurrentMapC13783 = C9240.a;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l2));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, C9240.b);
            map2.put((EnumC4069) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, C9240.b);
        this.b = map2;
    }

    public final String a(long j, EnumC4069 enumC4069) {
        Map map = (Map) this.a.get(enumC4069);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
