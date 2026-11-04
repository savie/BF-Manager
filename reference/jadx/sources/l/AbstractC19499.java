package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ᩴ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19499 extends AbstractC19146 implements NavigableMap {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient AbstractC18753 f62938;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient NavigableSet f62939;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Set f62940;

    @Override // l.AbstractC10195
    public final String toString() {
        return C15769.m37709(this);
    }

    @Override // l.AbstractC10195
    /* JADX INFO: renamed from: ᩴ */
    public final Object mo26313() {
        return ((C2125) this).f7003;
    }

    @Override // l.AbstractC19146, l.AbstractC10195
    /* JADX INFO: renamed from: ᩴ */
    public final Map mo26313() {
        return ((C2125) this).f7003;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        AbstractC18753 abstractC18753 = this.f62938;
        if (abstractC18753 != null) {
            return abstractC18753;
        }
        Comparator comparator = ((C2125) this).f7003.comparator();
        if (comparator == null) {
            comparator = C0108.f1051;
        }
        AbstractC18753 abstractC18753Mo1214 = AbstractC18753.m43551(comparator).mo1214();
        this.f62938 = abstractC18753Mo1214;
        return abstractC18753Mo1214;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return ((C2125) this).f7003.lastKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return ((C2125) this).f7003.firstKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return ((C2125) this).f7003.higherEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((C2125) this).f7003.higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return ((C2125) this).f7003.ceilingEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((C2125) this).f7003.ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return ((C2125) this).f7003.floorEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((C2125) this).f7003.floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return ((C2125) this).f7003.lowerEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((C2125) this).f7003.lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return ((C2125) this).f7003.lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return ((C2125) this).f7003.firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return ((C2125) this).f7003.pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return ((C2125) this).f7003.pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return ((C2125) this).f7003;
    }

    @Override // l.AbstractC19146, java.util.Map
    public final Set entrySet() {
        Set set = this.f62940;
        if (set != null) {
            return set;
        }
        C22483 c22483 = new C22483(this);
        this.f62940 = c22483;
        return c22483;
    }

    @Override // l.AbstractC19146, java.util.Map
    public final Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        NavigableSet navigableSet = this.f62939;
        if (navigableSet != null) {
            return navigableSet;
        }
        C11294 c11294 = new C11294(this);
        this.f62939 = c11294;
        return c11294;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        AbstractC11819 abstractC11819 = ((C2125) this).f7003;
        abstractC11819.getClass();
        return new C11294(abstractC11819);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return ((C2125) this).f7003.subMap(obj2, z2, obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return ((C2125) this).f7003.tailMap(obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return ((C2125) this).f7003.headMap(obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // l.AbstractC19146, java.util.Map
    public final Collection values() {
        return new C16515(this);
    }
}
