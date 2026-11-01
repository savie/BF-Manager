package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: renamed from: l.ܺܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16001 extends AbstractC13241 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final NavigableMap f51808;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9548 f51809;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9548 f51810;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final NavigableMap f51811;

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return C17308.f55088;
    }

    public /* synthetic */ C16001(C9548 c9548, C9548 c9549, NavigableMap navigableMap, int i) {
        this(c9548, c9549, navigableMap);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return m37983(C9548.m24400((AbstractC18054) obj, EnumC18179.m42305(z)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m37983(C9548.m24394((AbstractC18054) obj, EnumC18179.m42305(z), (AbstractC18054) obj2, EnumC18179.m42305(z2)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return m37983(C9548.m24393((AbstractC18054) obj, EnumC18179.m42305(z)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private NavigableMap m37983(C9548 c9548) {
        C9548 c9549 = this.f51809;
        if (!c9548.m24408(c9549)) {
            return C2345.of();
        }
        return new C16001(c9549.m24410(c9548), this.f51810, this.f51811);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final C9548 get(Object obj) {
        C9548 c9548 = this.f51810;
        if (obj instanceof AbstractC18054) {
            try {
                AbstractC18054 abstractC18054 = (AbstractC18054) obj;
                if (this.f51809.m24405(abstractC18054) && abstractC18054.compareTo(c9548.f32247) >= 0 && abstractC18054.compareTo(c9548.f32248) < 0) {
                    boolean zEquals = abstractC18054.equals(c9548.f32247);
                    NavigableMap navigableMap = this.f51811;
                    if (zEquals) {
                        Map.Entry entryFloorEntry = navigableMap.floorEntry(abstractC18054);
                        C9548 c9549 = (C9548) (entryFloorEntry == null ? null : entryFloorEntry.getValue());
                        if (c9549 != null && c9549.f32248.compareTo(c9548.f32247) > 0) {
                            return c9549.m24410(c9548);
                        }
                    } else {
                        C9548 c95410 = (C9548) navigableMap.get(abstractC18054);
                        if (c95410 != null) {
                            return c95410.m24410(c9548);
                        }
                    }
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // l.AbstractC6724
    /* JADX INFO: renamed from: ۙ */
    public final Iterator mo18156() {
        Iterator it;
        C9548 c9548 = this.f51810;
        boolean zM24404 = c9548.m24404();
        AbstractC18054 abstractC18054 = c9548.f32247;
        if (zM24404) {
            return C19280.f62237;
        }
        C9548 c9549 = this.f51809;
        AbstractC18054 abstractC18055 = c9549.f32248;
        AbstractC18054 abstractC18056 = c9549.f32247;
        if (abstractC18055.mo18344((Comparable) abstractC18054)) {
            return C19280.f62237;
        }
        if (abstractC18056.mo18344((Comparable) abstractC18054)) {
            it = ((C8945) this.f51808).tailMap(abstractC18054, false).values().iterator();
        } else {
            it = this.f51811.tailMap((AbstractC18054) abstractC18056.mo18342(), abstractC18056.mo18346() == EnumC18179.CLOSED).values().iterator();
        }
        return new C7533(this, it, (AbstractC18054) C17308.f55088.mo27716(c9549.f32248, AbstractC18054.m42047(c9548.f32248)));
    }

    @Override // l.AbstractC13241
    /* JADX INFO: renamed from: ܰ */
    public final Iterator mo23246() {
        C9548 c9548 = this.f51810;
        if (c9548.m24404()) {
            return C19280.f62237;
        }
        AbstractC18054 abstractC18054 = (AbstractC18054) C17308.f55088.mo27716(this.f51809.f32248, AbstractC18054.m42047(c9548.f32248));
        return new C20939(this, this.f51811.headMap((AbstractC18054) abstractC18054.mo18342(), abstractC18054.mo18345() == EnumC18179.CLOSED).descendingMap().values().iterator());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return C16458.m38724(mo18156());
    }

    public C16001(C9548 c9548, C9548 c9549, NavigableMap navigableMap) {
        c9548.getClass();
        this.f51809 = c9548;
        c9549.getClass();
        this.f51810 = c9549;
        navigableMap.getClass();
        this.f51811 = navigableMap;
        this.f51808 = new C8945(navigableMap);
    }
}
