package l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۡ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9669 extends C7433 implements NavigableMap {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20024 f31218;

    @Override // l.C7433
    /* JADX INFO: renamed from: ᩷ */
    public final NavigableMap mo20369() {
        return (NavigableMap) ((SortedMap) this.f26975);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9669(AbstractC20024 abstractC20024, NavigableMap navigableMap) {
        super(abstractC20024, navigableMap);
        this.f31218 = abstractC20024;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = mo20369().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m22089(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo20369().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = mo20369().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m22089(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo20369().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = mo20369().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m22089(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo20369().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = mo20369().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m22089(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo20369().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = mo20369().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m22089(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = mo20369().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m22089(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m25182(((C18620) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m25182(((C18620) ((AbstractC17261) descendingMap()).entrySet()).iterator());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractMap.SimpleImmutableEntry m25182(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionMo41614 = this.f31218.mo41614();
        collectionMo41614.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), C4681.unmodifiableList((List) collectionMo41614));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C9669(this.f31218, mo20369().descendingMap());
    }

    @Override // l.C7433, l.C8179, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // l.C7433, l.C8179, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // l.C7433
    /* JADX INFO: renamed from: ۙ */
    public final SortedSet mo20368() {
        return new C2958(this.f31218, mo20369());
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // l.C7433, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C9669(this.f31218, mo20369().subMap(obj, z, obj2, z2));
    }

    @Override // l.C7433, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C9669(this.f31218, mo20369().headMap(obj, z));
    }

    @Override // l.C7433, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C9669(this.f31218, mo20369().tailMap(obj, z));
    }
}
