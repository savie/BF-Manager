package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5097 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f17761;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Map f17762;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List f17763;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f17764;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Map f17765;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f17766;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Map f17767;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f17768;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3249 f17769;

    public C5097(C22031 c22031) {
        this.f17769 = c22031.f71397;
        Map map = c22031.f71401;
        int i = C12859.f42771;
        this.f17768 = C0561.unmodifiableMap(new HashMap(map));
        this.f17764 = C0561.unmodifiableMap(new HashMap(c22031.f71398));
        this.f17767 = C0561.unmodifiableMap(new HashMap(c22031.f71399));
        Map mapUnmodifiableMap = C0561.unmodifiableMap(new HashMap(c22031.f71400));
        this.f17765 = mapUnmodifiableMap;
        ArrayList<C20889> arrayList = new ArrayList(mapUnmodifiableMap.values());
        C23846.sort(arrayList, C7618.comparing(new C6072(0)));
        this.f17766 = C0561.unmodifiableList(arrayList);
        HashMap map2 = new HashMap();
        for (C20889 c20889 : arrayList) {
            Iterator it = c20889.m46965().iterator();
            while (it.hasNext()) {
                C9735.putIfAbsent(map2, ((String) it.next()).toLowerCase(Locale.ROOT), c20889);
            }
        }
        this.f17762 = C0561.unmodifiableMap(new HashMap(map2));
        Collection<C20889> collectionValues = this.f17768.values();
        ArrayList arrayList2 = new ArrayList(arrayList.size() + collectionValues.size() + 1);
        for (C20889 c208810 : collectionValues) {
            if (!c208810.m46966()) {
                arrayList2.add(c208810.m46958());
            }
        }
        for (C20889 c208811 : arrayList) {
            if (!c208811.m46966()) {
                arrayList2.add(c208811.m46958());
            }
        }
        Collections.sort(arrayList2);
        arrayList2.add(0, "Text");
        arrayList2.trimToSize();
        this.f17763 = C0561.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C20889 m14198(C5097 c5097, String str) {
        C20889 c20889 = (C20889) c5097.f17765.get(str);
        return c20889 != null ? c20889 : (C20889) c5097.f17768.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20889 m14192(C5097 c5097, String str) {
        C20889 c20889 = (C20889) c5097.f17762.get(str);
        return c20889 != null ? c20889 : (C20889) c5097.f17764.get(str);
    }
}
