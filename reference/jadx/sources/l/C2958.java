package l;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۖ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2958 extends C14144 implements NavigableSet {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20024 f9647;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2958(AbstractC20024 abstractC20024, NavigableMap navigableMap) {
        super(abstractC20024, navigableMap);
        this.f9647 = abstractC20024;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo9648().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo9648().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo9648().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo9648().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return C7676.m20916(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return C7676.m20916(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C2958(this.f9647, mo9648().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C1467) descendingSet()).iterator();
    }

    @Override // l.C14144, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C2958(this.f9647, mo9648().headMap(obj, z));
    }

    @Override // l.C14144, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C2958(this.f9647, mo9648().subMap(obj, z, obj2, z2));
    }

    @Override // l.C14144, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C2958(this.f9647, mo9648().tailMap(obj, z));
    }

    @Override // l.C14144
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final NavigableMap mo9648() {
        return (NavigableMap) ((SortedMap) this.f5499);
    }
}
