package l;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۧ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10649 extends C1475 implements NavigableSet {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11830 f36333;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10649(AbstractC11830 abstractC11830, NavigableMap navigableMap) {
        super(abstractC11830, navigableMap);
        this.f36333 = abstractC11830;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo5121().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo5121().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo5121().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo5121().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return C16458.m38725(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return C16458.m38725(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C10649(this.f36333, mo5121().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C16998) descendingSet()).iterator();
    }

    @Override // l.C1475, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C10649(this.f36333, mo5121().headMap(obj, z));
    }

    @Override // l.C1475, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C10649(this.f36333, mo5121().subMap(obj, z, obj2, z2));
    }

    @Override // l.C1475, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C10649(this.f36333, mo5121().tailMap(obj, z));
    }

    @Override // l.C1475
    /* JADX INFO: renamed from: ۨ */
    public final NavigableMap mo5121() {
        return (NavigableMap) ((SortedMap) this.f74624);
    }
}
