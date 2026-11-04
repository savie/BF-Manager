package l;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۜ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public class C7433 extends C8179 implements SortedMap {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public SortedSet f24469;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20024 f24470;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7433(AbstractC20024 abstractC20024, SortedMap sortedMap) {
        super(abstractC20024, sortedMap);
        this.f24470 = abstractC20024;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public SortedMap mo20369() {
        return (SortedMap) this.f26975;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo20369().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo20369().firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo20369().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new C7433(this.f24470, mo20369().headMap(obj));
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new C7433(this.f24470, mo20369().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new C7433(this.f24470, mo20369().tailMap(obj));
    }

    @Override // l.C8179, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public SortedSet keySet() {
        SortedSet sortedSet = this.f24469;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo20368 = mo20368();
        this.f24469 = sortedSetMo20368;
        return sortedSetMo20368;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SortedSet mo20368() {
        return new C14144(this.f24470, mo20369());
    }
}
