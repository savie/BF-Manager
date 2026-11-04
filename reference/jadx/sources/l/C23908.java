package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: renamed from: l.᩹᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23908 extends AbstractC11819 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final NavigableMap f77414;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2346 f77415;

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return C0108.f1051;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return m53409(C2346.m7913((AbstractC20638) obj, EnumC3616.m11733(z)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m53409(C2346.m7907((AbstractC20638) obj, EnumC3616.m11733(z), (AbstractC20638) obj2, EnumC3616.m11733(z2)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return m53409(C2346.m7906((AbstractC20638) obj, EnumC3616.m11733(z)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private NavigableMap m53409(C2346 c2346) {
        C2346 c2347 = this.f77415;
        if (c2346.m7921(c2347)) {
            return new C23908(this.f77414, c2346.m7923(c2347));
        }
        return C19609.of();
    }

    @Override // l.AbstractC5329
    /* JADX INFO: renamed from: ۙ */
    public final Iterator mo7724() {
        Iterator it;
        Map.Entry entryLowerEntry;
        C2346 c2346 = this.f77415;
        AbstractC20638 abstractC20638 = c2346.f7568;
        AbstractC20638 abstractC20639 = c2346.f7568;
        C23622 c23622 = C23622.f76665;
        NavigableMap navigableMap = this.f77414;
        if (abstractC20638 == c23622 || (entryLowerEntry = navigableMap.lowerEntry((AbstractC20638) abstractC20639.mo41314())) == null) {
            it = navigableMap.values().iterator();
        } else if (abstractC20639.mo11449((Comparable) ((C2346) entryLowerEntry.getValue()).f7569)) {
            it = navigableMap.tailMap((AbstractC20638) entryLowerEntry.getKey(), true).values().iterator();
        } else {
            it = navigableMap.tailMap((AbstractC20638) abstractC20639.mo41314(), true).values().iterator();
        }
        return new C17940(this, it);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final C2346 get(Object obj) {
        Map.Entry entryLowerEntry;
        if (obj instanceof AbstractC20638) {
            try {
                AbstractC20638 abstractC20638 = (AbstractC20638) obj;
                if (this.f77415.m7918(abstractC20638) && (entryLowerEntry = this.f77414.lowerEntry(abstractC20638)) != null && ((C2346) entryLowerEntry.getValue()).f7569.equals(abstractC20638)) {
                    return (C2346) entryLowerEntry.getValue();
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // l.AbstractC11819
    /* JADX INFO: renamed from: ᩷ */
    public final Iterator mo18859() {
        Collection collectionValues;
        C2346 c2346 = this.f77415;
        AbstractC20638 abstractC20638 = c2346.f7569;
        AbstractC20638 abstractC20639 = c2346.f7569;
        C17654 c17654 = C17654.f58034;
        NavigableMap navigableMap = this.f77414;
        if (abstractC20638 != c17654) {
            collectionValues = navigableMap.headMap((AbstractC20638) abstractC20639.mo41314(), false).descendingMap().values();
        } else {
            collectionValues = navigableMap.descendingMap().values();
        }
        InterfaceC9802 interfaceC9802M20913 = C7676.m20913(collectionValues.iterator());
        C18117 c18117 = (C18117) interfaceC9802M20913;
        if (c18117.hasNext() && abstractC20639.mo11449((Comparable) ((C2346) c18117.peek()).f7569)) {
            c18117.next();
        }
        return new C16448(this, interfaceC9802M20913);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        if (this.f77415.equals(C2346.m7915())) {
            return this.f77414.size();
        }
        return C7676.m20915(mo7724());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (this.f77415.equals(C2346.m7915())) {
            return this.f77414.isEmpty();
        }
        return !((AbstractC4450) mo7724()).hasNext();
    }

    public C23908(NavigableMap navigableMap) {
        this.f77414 = navigableMap;
        this.f77415 = C2346.m7915();
    }

    public C23908(NavigableMap navigableMap, C2346 c2346) {
        this.f77414 = navigableMap;
        this.f77415 = c2346;
    }
}
