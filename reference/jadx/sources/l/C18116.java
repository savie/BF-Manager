package l;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ᩳܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5J5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18116 implements InterfaceC3196 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TreeMap f57930 = new TreeMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C18116 m42177() {
        return new C18116();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42178(C9548 c9548, String str) {
        boolean zM24404 = c9548.m24404();
        AbstractC18054 abstractC18054 = c9548.f32247;
        if (zM24404) {
            return;
        }
        str.getClass();
        boolean zM24405 = c9548.m24404();
        AbstractC18054 abstractC18055 = c9548.f32248;
        TreeMap treeMap = this.f57930;
        if (!zM24405) {
            Map.Entry entryLowerEntry = treeMap.lowerEntry(abstractC18054);
            if (entryLowerEntry != null) {
                C21644 c21644 = (C21644) entryLowerEntry.getValue();
                if (((C9548) c21644.getKey()).f32248.compareTo(abstractC18054) > 0) {
                    if (((C9548) c21644.getKey()).f32248.compareTo(abstractC18055) > 0) {
                        AbstractC18054 abstractC18056 = ((C9548) c21644.getKey()).f32248;
                        treeMap.put(abstractC18055, new C21644(C9548.m24396(abstractC18055, abstractC18056), ((C21644) entryLowerEntry.getValue()).getValue()));
                    }
                    AbstractC18054 abstractC18057 = ((C9548) c21644.getKey()).f32247;
                    treeMap.put(abstractC18057, new C21644(C9548.m24396(abstractC18057, abstractC18054), ((C21644) entryLowerEntry.getValue()).getValue()));
                }
            }
            Map.Entry entryLowerEntry2 = treeMap.lowerEntry(abstractC18055);
            if (entryLowerEntry2 != null) {
                C21644 c21645 = (C21644) entryLowerEntry2.getValue();
                if (((C9548) c21645.getKey()).f32248.compareTo(abstractC18055) > 0) {
                    AbstractC18054 abstractC18058 = ((C9548) c21645.getKey()).f32248;
                    treeMap.put(abstractC18055, new C21644(C9548.m24396(abstractC18055, abstractC18058), ((C21644) entryLowerEntry2.getValue()).getValue()));
                }
            }
            treeMap.subMap(abstractC18054, abstractC18055).clear();
        }
        treeMap.put(abstractC18054, new C21644(c9548, str));
    }

    @Override // l.InterfaceC3196
    /* JADX INFO: renamed from: ۙ */
    public final Map mo2654() {
        return new C15295(this, this.f57930.values());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map m42179() {
        return new C15295(this, this.f57930.descendingMap().values());
    }

    @Override // l.InterfaceC3196
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2653(Integer num) {
        Map.Entry entryFloorEntry = this.f57930.floorEntry(new C21582(num));
        Map.Entry entry = (entryFloorEntry == null || !((C9548) ((C21644) entryFloorEntry.getValue()).getKey()).m24405(num)) ? null : (Map.Entry) entryFloorEntry.getValue();
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC3196)) {
            return false;
        }
        return ((AbstractMap) mo2654()).equals(((InterfaceC3196) obj).mo2654());
    }

    public final int hashCode() {
        return ((AbstractMap) mo2654()).hashCode();
    }

    public final String toString() {
        return this.f57930.values().toString();
    }
}
