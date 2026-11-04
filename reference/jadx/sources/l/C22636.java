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

/* JADX INFO: renamed from: l.᩸ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes.dex */
public class C22636 extends AbstractMap {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73524 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile C10701 f73525;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f73526;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Map f73527;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f73528 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile C2541 f73529;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Map f73530;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f73531;

    public C22636(int i) {
        this.f73526 = i;
        Map map = Collections.EMPTY_MAP;
        this.f73530 = map;
        this.f73527 = map;
    }

    /* JADX INFO: renamed from: ۫ */
    public void mo3949() {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        if (this.f73531) {
            return;
        }
        if (this.f73530.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = C4681.unmodifiableMap(this.f73530);
        }
        this.f73530 = mapUnmodifiableMap;
        if (this.f73527.isEmpty()) {
            mapUnmodifiableMap2 = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap2 = C4681.unmodifiableMap(this.f73527);
        }
        this.f73527 = mapUnmodifiableMap2;
        this.f73531 = true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m51023() {
        return this.f73531;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f73528.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((C4736) this.f73528.get(i)).hashCode();
        }
        return this.f73530.size() > 0 ? this.f73530.hashCode() + iHashCode : iHashCode;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m51024() {
        return this.f73528.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map.Entry m51025(int i) {
        return (Map.Entry) this.f73528.get(i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterable m51026() {
        if (this.f73530.isEmpty()) {
            return C13727.m33545();
        }
        return this.f73530.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f73530.size() + this.f73528.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m51013(comparable) >= 0 || this.f73530.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM51013 = m51013(comparable);
        if (iM51013 >= 0) {
            return ((C4736) this.f73528.get(iM51013)).getValue();
        }
        return this.f73530.get(comparable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m51021(Comparable comparable, Object obj) {
        m51012();
        int iM51013 = m51013(comparable);
        if (iM51013 >= 0) {
            return ((C4736) this.f73528.get(iM51013)).setValue(obj);
        }
        m51012();
        boolean zIsEmpty = this.f73528.isEmpty();
        int i = this.f73526;
        if (zIsEmpty && !(this.f73528 instanceof ArrayList)) {
            this.f73528 = new ArrayList(i);
        }
        int i2 = -(iM51013 + 1);
        if (i2 >= i) {
            return m51018().put(comparable, obj);
        }
        if (this.f73528.size() == i) {
            C4736 c4736 = (C4736) this.f73528.remove(i - 1);
            m51018().put(c4736.getKey(), c4736.getValue());
        }
        this.f73528.add(i2, new C4736(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m51012();
        if (!this.f73528.isEmpty()) {
            this.f73528.clear();
        }
        if (this.f73530.isEmpty()) {
            return;
        }
        this.f73530.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m51012();
        Comparable comparable = (Comparable) obj;
        int iM51013 = m51013(comparable);
        if (iM51013 >= 0) {
            return m51016(iM51013);
        }
        if (this.f73530.isEmpty()) {
            return null;
        }
        return this.f73530.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Object m51016(int i) {
        m51012();
        Object value = ((C4736) this.f73528.remove(i)).getValue();
        if (!this.f73530.isEmpty()) {
            Iterator it = m51018().entrySet().iterator();
            List list = this.f73528;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C4736(this, (Comparable) entry.getKey(), entry.getValue()));
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
    private int m51013(Comparable comparable) {
        int i;
        int iCompareTo;
        int size = this.f73528.size();
        int i2 = size - 1;
        if (i2 < 0) {
            size = 0;
            while (size <= i2) {
                i = (size + i2) / 2;
                iCompareTo = comparable.compareTo(((C4736) this.f73528.get(i)).getKey());
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
            int iCompareTo2 = comparable.compareTo(((C4736) this.f73528.get(i2)).getKey());
            if (iCompareTo2 <= 0) {
                if (iCompareTo2 == 0) {
                    return i2;
                }
                size = 0;
                while (size <= i2) {
                    i = (size + i2) / 2;
                    iCompareTo = comparable.compareTo(((C4736) this.f73528.get(i)).getKey());
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
        if (this.f73525 == null) {
            this.f73525 = new C10701(this);
        }
        return this.f73525;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m51022() {
        if (this.f73529 == null) {
            this.f73529 = new C2541(this);
        }
        return this.f73529;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51012() {
        if (this.f73531) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private SortedMap m51018() {
        m51012();
        if (this.f73530.isEmpty() && !(this.f73530 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f73530 = treeMap;
            this.f73527 = treeMap.descendingMap();
        }
        return (SortedMap) this.f73530;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22636)) {
            return super.equals(obj);
        }
        C22636 c22636 = (C22636) obj;
        int size = size();
        if (size == c22636.size()) {
            int size2 = this.f73528.size();
            if (size2 != c22636.f73528.size()) {
                return ((AbstractSet) entrySet()).equals(c22636.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (m51025(i).equals(c22636.m51025(i))) {
                }
            }
            if (size2 != size) {
                return this.f73530.equals(c22636.f73530);
            }
            return true;
        }
        return false;
    }
}
