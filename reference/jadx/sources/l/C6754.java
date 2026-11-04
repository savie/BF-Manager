package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* JADX INFO: renamed from: l.ۛ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6754 extends AbstractC11819 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2346 f22479;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2346 f22480;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final NavigableMap f22481;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final NavigableMap f22482;

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return C0108.f1051;
    }

    public /* synthetic */ C6754(C2346 c2346, C2346 c2347, NavigableMap navigableMap, int i) {
        this(c2346, c2347, navigableMap);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return m18856(C2346.m7913((AbstractC20638) obj, EnumC3616.m11733(z)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m18856(C2346.m7907((AbstractC20638) obj, EnumC3616.m11733(z), (AbstractC20638) obj2, EnumC3616.m11733(z2)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return m18856(C2346.m7906((AbstractC20638) obj, EnumC3616.m11733(z)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private NavigableMap m18856(C2346 c2346) {
        C2346 c2347 = this.f22480;
        if (!c2346.m7921(c2347)) {
            return C19609.of();
        }
        return new C6754(c2347.m7923(c2346), this.f22479, this.f22482);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final C2346 get(Object obj) {
        C2346 c2346 = this.f22479;
        if (obj instanceof AbstractC20638) {
            try {
                AbstractC20638 abstractC20638 = (AbstractC20638) obj;
                if (this.f22480.m7918(abstractC20638) && abstractC20638.compareTo(c2346.f7568) >= 0 && abstractC20638.compareTo(c2346.f7569) < 0) {
                    boolean zEquals = abstractC20638.equals(c2346.f7568);
                    NavigableMap navigableMap = this.f22482;
                    if (zEquals) {
                        Map.Entry entryFloorEntry = navigableMap.floorEntry(abstractC20638);
                        C2346 c2347 = (C2346) (entryFloorEntry == null ? null : entryFloorEntry.getValue());
                        if (c2347 != null && c2347.f7569.compareTo(c2346.f7568) > 0) {
                            return c2347.m7923(c2346);
                        }
                    } else {
                        C2346 c2348 = (C2346) navigableMap.get(abstractC20638);
                        if (c2348 != null) {
                            return c2348.m7923(c2346);
                        }
                    }
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // l.AbstractC5329
    /* JADX INFO: renamed from: ۙ */
    public final Iterator mo7724() {
        Iterator it;
        C2346 c2346 = this.f22479;
        boolean zM7917 = c2346.m7917();
        AbstractC20638 abstractC20638 = c2346.f7568;
        if (zM7917) {
            return C12150.f39059;
        }
        C2346 c2347 = this.f22480;
        AbstractC20638 abstractC20639 = c2347.f7569;
        AbstractC20638 abstractC206310 = c2347.f7568;
        if (abstractC20639.mo11449((Comparable) abstractC20638)) {
            return C12150.f39059;
        }
        if (abstractC206310.mo11449((Comparable) abstractC20638)) {
            it = ((C23908) this.f22481).tailMap(abstractC20638, false).values().iterator();
        } else {
            it = this.f22482.tailMap((AbstractC20638) abstractC206310.mo41314(), abstractC206310.mo11452() == EnumC3616.CLOSED).values().iterator();
        }
        return new C20924(this, it, (AbstractC20638) C0108.f1051.mo6460(c2347.f7569, AbstractC20638.m47251(c2346.f7569)));
    }

    @Override // l.AbstractC11819
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Iterator mo18859() {
        C2346 c2346 = this.f22479;
        if (c2346.m7917()) {
            return C12150.f39059;
        }
        AbstractC20638 abstractC20638 = (AbstractC20638) C0108.f1051.mo6460(this.f22480.f7569, AbstractC20638.m47251(c2346.f7569));
        return new C12719(this, this.f22482.headMap((AbstractC20638) abstractC20638.mo41314(), abstractC20638.mo11450() == EnumC3616.CLOSED).descendingMap().values().iterator());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return C7676.m20915(mo7724());
    }

    public C6754(C2346 c2346, C2346 c2347, NavigableMap navigableMap) {
        c2346.getClass();
        this.f22480 = c2346;
        c2347.getClass();
        this.f22479 = c2347;
        navigableMap.getClass();
        this.f22482 = navigableMap;
        this.f22481 = new C23908(navigableMap);
    }
}
