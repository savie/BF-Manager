package l;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩺᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes.dex */
public class C24654 extends AbstractC25246 implements Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient Set f79806;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractMap f79807;

    /* JADX WARN: Multi-variable type inference failed */
    public C24654(NavigableMap navigableMap) {
        this.f79807 = (AbstractMap) navigableMap;
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo12240(Integer num) {
        return mo4358(num) != null;
    }

    public /* synthetic */ C24654(NavigableMap navigableMap, int i) {
        this(navigableMap);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C24654 m55012() {
        return new C24654(new TreeMap());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.SortedMap] */
    @Override // l.InterfaceC6821
    /* JADX INFO: renamed from: ۙ */
    public final Set mo4357() {
        Set set = this.f79806;
        if (set != null) {
            return set;
        }
        C17194 c17194 = new C17194(this.f79807.values());
        this.f79806 = c17194;
        return c17194;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // l.InterfaceC6821
    /* JADX INFO: renamed from: ۙ */
    public C2346 mo4358(Integer num) {
        Map.Entry entryFloorEntry = this.f79807.floorEntry(new C3484(num));
        if (entryFloorEntry == null || !((C2346) entryFloorEntry.getValue()).m7918(num)) {
            return null;
        }
        return (C2346) entryFloorEntry.getValue();
    }

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC6821 mo12239(C2346 c2346) {
        return c2346.equals(C2346.m7915()) ? this : new C3770(this, c2346);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.Map, java.util.NavigableMap] */
    /* JADX INFO: renamed from: ۙ */
    public void mo12238(C2346 c2346) {
        c2346.getClass();
        if (c2346.m7917()) {
            return;
        }
        AbstractC20638 abstractC20638 = c2346.f7568;
        AbstractC20638 abstractC20639 = c2346.f7569;
        ?? r1 = this.f79807;
        Map.Entry entryLowerEntry = r1.lowerEntry(abstractC20638);
        if (entryLowerEntry != null) {
            C2346 c2347 = (C2346) entryLowerEntry.getValue();
            AbstractC20638 abstractC206310 = c2347.f7569;
            if (abstractC206310.compareTo(abstractC20638) >= 0) {
                if (abstractC206310.compareTo(abstractC20639) >= 0) {
                    abstractC20639 = abstractC206310;
                }
                abstractC20638 = c2347.f7568;
            }
        }
        Map.Entry entryFloorEntry = r1.floorEntry(abstractC20639);
        if (entryFloorEntry != null) {
            C2346 c2348 = (C2346) entryFloorEntry.getValue();
            if (c2348.f7569.compareTo(abstractC20639) >= 0) {
                abstractC20639 = c2348.f7569;
            }
        }
        r1.subMap(abstractC20638, abstractC20639).clear();
        C2346 c2346M7909 = C2346.m7909(abstractC20638, abstractC20639);
        boolean zM7917 = c2346M7909.m7917();
        AbstractC20638 abstractC206311 = c2346M7909.f7568;
        if (zM7917) {
            r1.remove(abstractC206311);
        } else {
            r1.put(abstractC206311, c2346M7909);
        }
    }
}
