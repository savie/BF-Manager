package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ᩴۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19609 extends AbstractC17589 implements NavigableMap, InterfaceC16613 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C19609 f63199;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final transient AbstractC1928 f63200;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient C5613 f63201;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final transient C19609 f63202;

    static {
        C5613 c5613M16230 = AbstractC5439.m16230(C0108.f1051);
        int i = AbstractC1928.f6477;
        f63199 = new C19609(c5613M16230, C4867.f16966, null);
    }

    public static C19609 of() {
        return f63199;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19609 m45258(Comparator comparator) {
        if (C0108.f1051.equals(comparator)) {
            return f63199;
        }
        return new C19609(AbstractC5439.m16230(comparator), C4867.f16966, null);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        C5613 c5613 = this.f63201;
        AbstractC5439 abstractC5439 = c5613.f18991;
        if (abstractC5439 != null) {
            return abstractC5439;
        }
        AbstractC5439 abstractC5439Mo16233 = c5613.mo16233();
        c5613.f18991 = abstractC5439Mo16233;
        abstractC5439Mo16233.f18991 = c5613;
        return abstractC5439Mo16233;
    }

    public C19609(C5613 c5613, AbstractC1928 abstractC1928, C19609 c19609) {
        this.f63201 = c5613;
        this.f63200 = abstractC1928;
        this.f63202 = c19609;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f63200.size();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // l.AbstractC17589, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        C5613 c5613 = this.f63201;
        c5613.getClass();
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(c5613.f19445, obj, c5613.f18990);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f63200.get(iBinarySearch);
    }

    @Override // l.AbstractC17589
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo33237() {
        return this.f63201.f19445.mo14905() || this.f63200.mo14905();
    }

    @Override // l.AbstractC17589, java.util.Map
    public final AbstractC8639 entrySet() {
        if (isEmpty()) {
            int i = AbstractC8639.f28224;
            return C13070.f41806;
        }
        return new C10658(this);
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f63201.f18990;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f63201.first();
    }

    @Override // l.AbstractC17589, java.util.Map
    public final Set keySet() {
        return this.f63201;
    }

    @Override // l.AbstractC17589, java.util.Map
    public final AbstractC8639 keySet() {
        return this.f63201;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f63201.last();
    }

    @Override // l.AbstractC17589, java.util.Map
    public final Collection values() {
        return this.f63200;
    }

    @Override // l.AbstractC17589, java.util.Map
    public final AbstractC4911 values() {
        return this.f63200;
    }

    @Override // java.util.NavigableMap
    public final C19609 headMap(Object obj, boolean z) {
        obj.getClass();
        return m45257(0, this.f63201.m16591(obj, z));
    }

    @Override // java.util.NavigableMap
    public final C19609 subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        C12128.m30310(this.f63201.f18990.compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    public final C19609 tailMap(Object obj, boolean z) {
        obj.getClass();
        return m45257(this.f63201.m16593(obj, z), this.f63200.size());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C19609 m45257(int i, int i2) {
        AbstractC1928 abstractC1928 = this.f63200;
        if (i == 0 && i2 == abstractC1928.size()) {
            return this;
        }
        C5613 c5613 = this.f63201;
        if (i != i2) {
            return new C19609(c5613.m16592(i, i2), abstractC1928.subList(i, i2), null);
        }
        return m45258(c5613.f18990);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return C15769.m37708(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return C15769.m37708(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return C15769.m37708(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return C15769.m37708(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo6621().get(0);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo6621().get(this.f63200.size() - 1);
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        C19609 c19609 = this.f63202;
        if (c19609 == null) {
            boolean zIsEmpty = isEmpty();
            C5613 c5613 = this.f63201;
            if (!zIsEmpty) {
                AbstractC5439 abstractC5439Mo16233 = c5613.f18991;
                if (abstractC5439Mo16233 == null) {
                    abstractC5439Mo16233 = c5613.mo16233();
                    c5613.f18991 = abstractC5439Mo16233;
                    abstractC5439Mo16233.f18991 = c5613;
                }
                c19609 = new C19609((C5613) abstractC5439Mo16233, this.f63200.mo6620(), this);
            } else {
                return m45258(AbstractC18753.m43551(c5613.f18990).mo1214());
            }
        }
        return c19609;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.f63201;
    }

    @Override // l.AbstractC17589
    public Object writeReplace() {
        return new C22593(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
