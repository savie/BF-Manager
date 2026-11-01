package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ۖۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2490 extends AbstractC0415 implements NavigableMap {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient NavigableSet f9892;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient AbstractC10959 f9893;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Set f9894;

    @Override // l.AbstractC16644
    public final String toString() {
        return C8136.m21447(this);
    }

    @Override // l.AbstractC16644
    /* JADX INFO: renamed from: ۚ */
    public final Object mo2173() {
        return ((C1245) this).f5425;
    }

    @Override // l.AbstractC0415, l.AbstractC16644
    /* JADX INFO: renamed from: ۚ */
    public final Map mo2173() {
        return ((C1245) this).f5425;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        AbstractC10959 abstractC10959 = this.f9893;
        if (abstractC10959 != null) {
            return abstractC10959;
        }
        Comparator comparator = ((C1245) this).f5425.comparator();
        if (comparator == null) {
            comparator = C17308.f55088;
        }
        AbstractC10959 abstractC10959Mo27718 = AbstractC10959.m27715(comparator).mo27718();
        this.f9893 = abstractC10959Mo27718;
        return abstractC10959Mo27718;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return ((C1245) this).f5425.lastKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return ((C1245) this).f5425.firstKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return ((C1245) this).f5425.higherEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((C1245) this).f5425.higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return ((C1245) this).f5425.ceilingEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((C1245) this).f5425.ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return ((C1245) this).f5425.floorEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((C1245) this).f5425.floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return ((C1245) this).f5425.lowerEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((C1245) this).f5425.lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return ((C1245) this).f5425.lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return ((C1245) this).f5425.firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return ((C1245) this).f5425.pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return ((C1245) this).f5425.pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return ((C1245) this).f5425;
    }

    @Override // l.AbstractC0415, java.util.Map
    public final Set entrySet() {
        Set set = this.f9894;
        if (set != null) {
            return set;
        }
        C11664 c11664 = new C11664(this);
        this.f9894 = c11664;
        return c11664;
    }

    @Override // l.AbstractC0415, java.util.Map
    public final Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        NavigableSet navigableSet = this.f9892;
        if (navigableSet != null) {
            return navigableSet;
        }
        C15192 c15192 = new C15192(this);
        this.f9892 = c15192;
        return c15192;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        AbstractC13241 abstractC13241 = ((C1245) this).f5425;
        abstractC13241.getClass();
        return new C15192(abstractC13241);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return ((C1245) this).f5425.subMap(obj2, z2, obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return ((C1245) this).f5425.tailMap(obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return ((C1245) this).f5425.headMap(obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // l.AbstractC0415, java.util.Map
    public final Collection values() {
        return new C18013(this);
    }
}
