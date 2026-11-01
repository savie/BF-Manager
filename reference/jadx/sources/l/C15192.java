package l;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ܶۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes5.dex */
public final class C15192 extends C21541 implements NavigableSet {
    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) this.f74624).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return ((NavigableMap) this.f74624).descendingKeySet();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) this.f74624).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return ((NavigableMap) this.f74624).headMap(obj, z).navigableKeySet();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) this.f74624).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) this.f74624).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return C8136.m21446(((NavigableMap) this.f74624).pollFirstEntry());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return C8136.m21446(((NavigableMap) this.f74624).pollLastEntry());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return ((NavigableMap) this.f74624).subMap(obj, z, obj2, z2).navigableKeySet();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return ((NavigableMap) this.f74624).tailMap(obj, z).navigableKeySet();
    }

    @Override // l.C22953
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map mo36411() {
        return (NavigableMap) this.f74624;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
