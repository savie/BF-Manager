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

/* JADX INFO: renamed from: l.ۛ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5709 extends C14177 implements NavigableMap {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11830 f19458;

    @Override // l.C14177
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final NavigableMap mo15745() {
        return (NavigableMap) ((SortedMap) this.f963);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5709(AbstractC11830 abstractC11830, NavigableMap navigableMap) {
        super(abstractC11830, navigableMap);
        this.f19458 = abstractC11830;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = mo15745().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m982(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo15745().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = mo15745().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m982(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo15745().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = mo15745().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m982(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo15745().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = mo15745().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m982(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo15745().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = mo15745().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m982(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = mo15745().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m982(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m15743(((C15588) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m15743(((C15588) ((AbstractC18719) descendingMap()).entrySet()).iterator());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractMap.SimpleImmutableEntry m15743(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionMo29507 = this.f19458.mo29507();
        collectionMo29507.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), C0561.unmodifiableList((List) collectionMo29507));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C5709(this.f19458, mo15745().descendingMap());
    }

    @Override // l.C14177, l.C0064, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // l.C14177, l.C0064, java.util.AbstractMap, java.util.Map
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // l.C14177
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SortedSet mo15744() {
        return new C10649(this.f19458, mo15745());
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // l.C14177, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C5709(this.f19458, mo15745().subMap(obj, z, obj2, z2));
    }

    @Override // l.C14177, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C5709(this.f19458, mo15745().headMap(obj, z));
    }

    @Override // l.C14177, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C5709(this.f19458, mo15745().tailMap(obj, z));
    }
}
