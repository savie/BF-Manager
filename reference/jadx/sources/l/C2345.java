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

/* JADX INFO: renamed from: l.ۖۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2345 extends AbstractC6910 implements NavigableMap, InterfaceC4464 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C2345 f8281;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC22433 f8282;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient C2345 f8283;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final transient C7098 f8284;

    static {
        C7098 c7098M3685 = AbstractC0934.m3685(C17308.f55088);
        int i = AbstractC22433.f73217;
        f8281 = new C2345(c7098M3685, C12038.f40301, null);
    }

    public static C2345 of() {
        return f8281;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2345 m7127(Comparator comparator) {
        if (C17308.f55088.equals(comparator)) {
            return f8281;
        }
        return new C2345(AbstractC0934.m3685(comparator), C12038.f40301, null);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        C7098 c7098 = this.f8284;
        AbstractC0934 abstractC0934 = c7098.f3734;
        if (abstractC0934 != null) {
            return abstractC0934;
        }
        AbstractC0934 abstractC0934Mo3688 = c7098.mo3688();
        c7098.f3734 = abstractC0934Mo3688;
        abstractC0934Mo3688.f3734 = c7098;
        return abstractC0934Mo3688;
    }

    public C2345(C7098 c7098, AbstractC22433 abstractC22433, C2345 c2345) {
        this.f8284 = c7098;
        this.f8282 = abstractC22433;
        this.f8283 = c2345;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8282.size();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // l.AbstractC6910, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        C7098 c7098 = this.f8284;
        c7098.getClass();
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(c7098.f23786, obj, c7098.f3735);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f8282.get(iBinarySearch);
    }

    @Override // l.AbstractC6910
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo7131() {
        return this.f8284.f23786.mo5042() || this.f8282.mo5042();
    }

    @Override // l.AbstractC6910, java.util.Map, java.util.SortedMap
    public final Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public final C2345 headMap(Object obj, boolean z) {
        obj.getClass();
        return m7126(0, this.f8284.m18974(obj, z));
    }

    @Override // java.util.NavigableMap
    public final C2345 subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        C18304.m42518(this.f8284.f3735.compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    public final C2345 tailMap(Object obj, boolean z) {
        obj.getClass();
        return m7126(this.f8284.m18973(obj, z), this.f8282.size());
    }

    @Override // l.AbstractC6910
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23844 mo7130() {
        if (isEmpty()) {
            int i = AbstractC23844.f77093;
            return C4275.f15410;
        }
        return new C4462(this);
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f8284.f3735;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f8284.first();
    }

    @Override // l.AbstractC6910, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return this.f8284;
    }

    @Override // l.AbstractC6910, java.util.Map, java.util.SortedMap
    public final AbstractC23844 keySet() {
        return this.f8284;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f8284.last();
    }

    @Override // l.AbstractC6910
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23844 mo7133() {
        throw new AssertionError("should never be called");
    }

    @Override // l.AbstractC6910, java.util.Map, java.util.SortedMap
    public final Collection values() {
        return this.f8282;
    }

    @Override // l.AbstractC6910, java.util.Map, java.util.SortedMap
    public final AbstractC1826 values() {
        return this.f8282;
    }

    @Override // l.AbstractC6910
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC1826 mo7132() {
        throw new AssertionError("should never be called");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2345 m7126(int i, int i2) {
        AbstractC22433 abstractC22433 = this.f8282;
        if (i == 0 && i2 == abstractC22433.size()) {
            return this;
        }
        C7098 c7098 = this.f8284;
        if (i != i2) {
            return new C2345(c7098.m18975(i, i2), abstractC22433.subList(i, i2), null);
        }
        return m7127(c7098.f3735);
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
        return C8136.m21446(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return C8136.m21446(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return C8136.m21446(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return C8136.m21446(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().mo5971().get(0);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().mo5971().get(this.f8282.size() - 1);
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
        C2345 c2345 = this.f8283;
        if (c2345 == null) {
            boolean zIsEmpty = isEmpty();
            C7098 c7098 = this.f8284;
            if (!zIsEmpty) {
                AbstractC0934 abstractC0934Mo3688 = c7098.f3734;
                if (abstractC0934Mo3688 == null) {
                    abstractC0934Mo3688 = c7098.mo3688();
                    c7098.f3734 = abstractC0934Mo3688;
                    abstractC0934Mo3688.f3734 = c7098;
                }
                c2345 = new C2345((C7098) abstractC0934Mo3688, this.f8282.mo29543(), this);
            } else {
                return m7127(AbstractC10959.m27715(c7098.f3735).mo27718());
            }
        }
        return c2345;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.f8284;
    }

    @Override // l.AbstractC6910
    public Object writeReplace() {
        return new C11519(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
