package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16572 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f53640;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Map f53641;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f53642;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f53643;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f53644;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f53645;

    public C16572(boolean z, boolean z2, long j, long j2, List list) {
        this.f53643 = z;
        this.f53644 = z2;
        this.f53642 = j;
        this.f53640 = j2;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C17359.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.f53645 = C4681.unmodifiableList(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24778 c24778 = (C24778) it.next();
            linkedHashMap.put(c24778.f80214, c24778);
        }
        this.f53641 = C4681.unmodifiableMap(linkedHashMap);
    }
}
