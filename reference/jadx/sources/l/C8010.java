package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8010 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f26260;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f26261;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f26262;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f26263;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f26264;

    public C8010(boolean z, boolean z2, long j, List list) {
        this.f26260 = z;
        this.f26261 = z2;
        this.f26262 = j;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C13638.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f26263 = C0561.unmodifiableList(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18593 c18593 = (C18593) it.next();
            linkedHashMap.put(c18593.f59153, c18593);
        }
        this.f26264 = C0561.unmodifiableMap(linkedHashMap);
    }
}
