package l;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܺۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes4.dex */
public class C15841 extends AbstractMap {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f51267 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile C18662 f51268;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Map f51269;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f51270;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List f51271 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile C20779 f51272;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Map f51273;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f51274;

    public C15841(int i) {
        this.f51270 = i;
        Map map = Collections.EMPTY_MAP;
        this.f51273 = map;
        this.f51269 = map;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void mo37659() {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        if (this.f51274) {
            return;
        }
        if (this.f51273.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = C0561.unmodifiableMap(this.f51273);
        }
        this.f51273 = mapUnmodifiableMap;
        if (this.f51269.isEmpty()) {
            mapUnmodifiableMap2 = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap2 = C0561.unmodifiableMap(this.f51269);
        }
        this.f51269 = mapUnmodifiableMap2;
        this.f51274 = true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m37662() {
        return this.f51274;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f51271.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((C10196) this.f51271.get(i)).hashCode();
        }
        return this.f51273.size() > 0 ? this.f51273.hashCode() + iHashCode : iHashCode;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m37664() {
        return this.f51271.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map.Entry m37665(int i) {
        return (Map.Entry) this.f51271.get(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Iterable m37663() {
        if (this.f51273.isEmpty()) {
            return C8785.m22857();
        }
        return this.f51273.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f51273.size() + this.f51271.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m37652(comparable) >= 0 || this.f51273.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM37652 = m37652(comparable);
        if (iM37652 >= 0) {
            return ((C10196) this.f51271.get(iM37652)).getValue();
        }
        return this.f51273.get(comparable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m37660(Comparable comparable, Object obj) {
        m37651();
        int iM37652 = m37652(comparable);
        if (iM37652 >= 0) {
            return ((C10196) this.f51271.get(iM37652)).setValue(obj);
        }
        m37651();
        boolean zIsEmpty = this.f51271.isEmpty();
        int i = this.f51270;
        if (zIsEmpty && !(this.f51271 instanceof ArrayList)) {
            this.f51271 = new ArrayList(i);
        }
        int i2 = -(iM37652 + 1);
        if (i2 >= i) {
            return m37655().put(comparable, obj);
        }
        if (this.f51271.size() == i) {
            C10196 c10196 = (C10196) this.f51271.remove(i - 1);
            m37655().put(c10196.getKey(), c10196.getValue());
        }
        this.f51271.add(i2, new C10196(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m37651();
        if (!this.f51271.isEmpty()) {
            this.f51271.clear();
        }
        if (this.f51273.isEmpty()) {
            return;
        }
        this.f51273.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m37651();
        Comparable comparable = (Comparable) obj;
        int iM37652 = m37652(comparable);
        if (iM37652 >= 0) {
            return m37656(iM37652);
        }
        if (this.f51273.isEmpty()) {
            return null;
        }
        return this.f51273.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Object m37656(int i) {
        m37651();
        Object value = ((C10196) this.f51271.remove(i)).getValue();
        if (!this.f51273.isEmpty()) {
            Iterator it = m37655().entrySet().iterator();
            List list = this.f51271;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C10196(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m37652(Comparable comparable) {
        int i;
        int iCompareTo;
        int size = this.f51271.size();
        int i2 = size - 1;
        if (i2 < 0) {
            size = 0;
            while (size <= i2) {
                i = (size + i2) / 2;
                iCompareTo = comparable.compareTo(((C10196) this.f51271.get(i)).getKey());
                if (iCompareTo < 0) {
                    i2 = i - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i;
                    }
                    size = i + 1;
                }
            }
        } else {
            int iCompareTo2 = comparable.compareTo(((C10196) this.f51271.get(i2)).getKey());
            if (iCompareTo2 <= 0) {
                if (iCompareTo2 == 0) {
                    return i2;
                }
                size = 0;
                while (size <= i2) {
                    i = (size + i2) / 2;
                    iCompareTo = comparable.compareTo(((C10196) this.f51271.get(i)).getKey());
                    if (iCompareTo < 0) {
                        i2 = i - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i;
                        }
                        size = i + 1;
                    }
                }
            }
        }
        return -(size + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f51272 == null) {
            this.f51272 = new C20779(this);
        }
        return this.f51272;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m37661() {
        if (this.f51268 == null) {
            this.f51268 = new C18662(this);
        }
        return this.f51268;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m37651() {
        if (this.f51274) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private SortedMap m37655() {
        m37651();
        if (this.f51273.isEmpty() && !(this.f51273 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f51273 = treeMap;
            this.f51269 = treeMap.descendingMap();
        }
        return (SortedMap) this.f51273;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15841)) {
            return super.equals(obj);
        }
        C15841 c15841 = (C15841) obj;
        int size = size();
        if (size == c15841.size()) {
            int size2 = this.f51271.size();
            if (size2 != c15841.f51271.size()) {
                return ((AbstractSet) entrySet()).equals(c15841.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (m37665(i).equals(c15841.m37665(i))) {
                }
            }
            if (size2 != size) {
                return this.f51273.equals(c15841.f51273);
            }
            return true;
        }
        return false;
    }
}
