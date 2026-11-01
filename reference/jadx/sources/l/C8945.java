package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: renamed from: l.ۡܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8945 extends AbstractC13241 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final NavigableMap f30667;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9548 f30668;

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return C17308.f55088;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return m23244(C9548.m24400((AbstractC18054) obj, EnumC18179.m42305(z)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m23244(C9548.m24394((AbstractC18054) obj, EnumC18179.m42305(z), (AbstractC18054) obj2, EnumC18179.m42305(z2)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return m23244(C9548.m24393((AbstractC18054) obj, EnumC18179.m42305(z)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private NavigableMap m23244(C9548 c9548) {
        C9548 c9549 = this.f30668;
        if (c9548.m24408(c9549)) {
            return new C8945(this.f30667, c9548.m24410(c9549));
        }
        return C2345.of();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // l.AbstractC6724
    /* JADX INFO: renamed from: ۙ */
    public final Iterator mo18156() {
        Iterator it;
        Map.Entry entryLowerEntry;
        C9548 c9548 = this.f30668;
        AbstractC18054 abstractC18054 = c9548.f32247;
        AbstractC18054 abstractC18055 = c9548.f32247;
        C15233 c15233 = C15233.f49660;
        NavigableMap navigableMap = this.f30667;
        if (abstractC18054 == c15233 || (entryLowerEntry = navigableMap.lowerEntry((AbstractC18054) abstractC18055.mo18342())) == null) {
            it = navigableMap.values().iterator();
        } else if (abstractC18055.mo18344((Comparable) ((C9548) entryLowerEntry.getValue()).f32248)) {
            it = navigableMap.tailMap((AbstractC18054) entryLowerEntry.getKey(), true).values().iterator();
        } else {
            it = navigableMap.tailMap((AbstractC18054) abstractC18055.mo18342(), true).values().iterator();
        }
        return new C8239(this, it);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final C9548 get(Object obj) {
        Map.Entry entryLowerEntry;
        if (obj instanceof AbstractC18054) {
            try {
                AbstractC18054 abstractC18054 = (AbstractC18054) obj;
                if (this.f30668.m24405(abstractC18054) && (entryLowerEntry = this.f30667.lowerEntry(abstractC18054)) != null && ((C9548) entryLowerEntry.getValue()).f32248.equals(abstractC18054)) {
                    return (C9548) entryLowerEntry.getValue();
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // l.AbstractC13241
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterator mo23246() {
        Collection collectionValues;
        C9548 c9548 = this.f30668;
        AbstractC18054 abstractC18054 = c9548.f32248;
        AbstractC18054 abstractC18055 = c9548.f32248;
        C6765 c6765 = C6765.f22852;
        NavigableMap navigableMap = this.f30667;
        if (abstractC18054 != c6765) {
            collectionValues = navigableMap.headMap((AbstractC18054) abstractC18055.mo18342(), false).descendingMap().values();
        } else {
            collectionValues = navigableMap.descendingMap().values();
        }
        InterfaceC23659 interfaceC23659M38722 = C16458.m38722(collectionValues.iterator());
        C19986 c19986 = (C19986) interfaceC23659M38722;
        if (c19986.hasNext() && abstractC18055.mo18344((Comparable) ((C9548) c19986.peek()).f32248)) {
            c19986.next();
        }
        return new C19528(this, interfaceC23659M38722);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        if (this.f30668.equals(C9548.m24392())) {
            return this.f30667.size();
        }
        return C16458.m38724(mo18156());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (this.f30668.equals(C9548.m24392())) {
            return this.f30667.isEmpty();
        }
        return !((AbstractC9943) mo18156()).hasNext();
    }

    public C8945(NavigableMap navigableMap) {
        this.f30667 = navigableMap;
        this.f30668 = C9548.m24392();
    }

    public C8945(NavigableMap navigableMap, C9548 c9548) {
        this.f30667 = navigableMap;
        this.f30668 = c9548;
    }
}
