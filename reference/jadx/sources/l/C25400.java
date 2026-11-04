package l;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩻᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5J5 */
/* JADX INFO: loaded from: classes.dex */
public final class C25400 implements InterfaceC8312 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TreeMap f81980 = new TreeMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C25400 m56762() {
        return new C25400();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56763(C2346 c2346, String str) {
        boolean zM7917 = c2346.m7917();
        AbstractC20638 abstractC20638 = c2346.f7568;
        if (zM7917) {
            return;
        }
        str.getClass();
        boolean zM7918 = c2346.m7917();
        AbstractC20638 abstractC20639 = c2346.f7569;
        TreeMap treeMap = this.f81980;
        if (!zM7918) {
            Map.Entry entryLowerEntry = treeMap.lowerEntry(abstractC20638);
            if (entryLowerEntry != null) {
                C11973 c11973 = (C11973) entryLowerEntry.getValue();
                if (((C2346) c11973.getKey()).f7569.compareTo(abstractC20638) > 0) {
                    if (((C2346) c11973.getKey()).f7569.compareTo(abstractC20639) > 0) {
                        AbstractC20638 abstractC206310 = ((C2346) c11973.getKey()).f7569;
                        treeMap.put(abstractC20639, new C11973(C2346.m7909(abstractC20639, abstractC206310), ((C11973) entryLowerEntry.getValue()).getValue()));
                    }
                    AbstractC20638 abstractC206311 = ((C2346) c11973.getKey()).f7568;
                    treeMap.put(abstractC206311, new C11973(C2346.m7909(abstractC206311, abstractC20638), ((C11973) entryLowerEntry.getValue()).getValue()));
                }
            }
            Map.Entry entryLowerEntry2 = treeMap.lowerEntry(abstractC20639);
            if (entryLowerEntry2 != null) {
                C11973 c11974 = (C11973) entryLowerEntry2.getValue();
                if (((C2346) c11974.getKey()).f7569.compareTo(abstractC20639) > 0) {
                    AbstractC20638 abstractC206312 = ((C2346) c11974.getKey()).f7569;
                    treeMap.put(abstractC20639, new C11973(C2346.m7909(abstractC20639, abstractC206312), ((C11973) entryLowerEntry2.getValue()).getValue()));
                }
            }
            treeMap.subMap(abstractC20638, abstractC20639).clear();
        }
        treeMap.put(abstractC20638, new C11973(c2346, str));
    }

    @Override // l.InterfaceC8312
    /* JADX INFO: renamed from: ۙ */
    public final Map mo21437() {
        return new C2279(this, this.f81980.values());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map m56764() {
        return new C2279(this, this.f81980.descendingMap().values());
    }

    @Override // l.InterfaceC8312
    /* JADX INFO: renamed from: ۙ */
    public final Object mo21436(Integer num) {
        Map.Entry entryFloorEntry = this.f81980.floorEntry(new C3484(num));
        Map.Entry entry = (entryFloorEntry == null || !((C2346) ((C11973) entryFloorEntry.getValue()).getKey()).m7918(num)) ? null : (Map.Entry) entryFloorEntry.getValue();
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC8312)) {
            return false;
        }
        return ((AbstractMap) mo21437()).equals(((InterfaceC8312) obj).mo21437());
    }

    public final int hashCode() {
        return ((AbstractMap) mo21437()).hashCode();
    }

    public final String toString() {
        return this.f81980.values().toString();
    }
}
