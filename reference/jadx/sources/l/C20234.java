package l;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩶ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public class C20234 extends AbstractC4067 implements Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient Set f65658;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractMap f65659;

    /* JADX WARN: Multi-variable type inference failed */
    public C20234(NavigableMap navigableMap) {
        this.f65659 = (AbstractMap) navigableMap;
    }

    /* JADX INFO: renamed from: ܰ */
    public boolean mo26254(Integer num) {
        return mo13812(num) != null;
    }

    public /* synthetic */ C20234(NavigableMap navigableMap, int i) {
        this(navigableMap);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C20234 m45738() {
        return new C20234(new TreeMap());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.SortedMap] */
    @Override // l.InterfaceC4981
    /* JADX INFO: renamed from: ۙ */
    public final Set mo13811() {
        Set set = this.f65658;
        if (set != null) {
            return set;
        }
        C18822 c18822 = new C18822(this.f65659.values());
        this.f65658 = c18822;
        return c18822;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // l.InterfaceC4981
    /* JADX INFO: renamed from: ۙ */
    public C9548 mo13812(Integer num) {
        Map.Entry entryFloorEntry = this.f65659.floorEntry(new C21582(num));
        if (entryFloorEntry == null || !((C9548) entryFloorEntry.getValue()).m24405(num)) {
            return null;
        }
        return (C9548) entryFloorEntry.getValue();
    }

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC4981 mo26253(C9548 c9548) {
        return c9548.equals(C9548.m24392()) ? this : new C10356(this, c9548);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.Map, java.util.NavigableMap] */
    /* JADX INFO: renamed from: ۙ */
    public void mo26252(C9548 c9548) {
        c9548.getClass();
        if (c9548.m24404()) {
            return;
        }
        AbstractC18054 abstractC18054 = c9548.f32247;
        AbstractC18054 abstractC18055 = c9548.f32248;
        ?? r1 = this.f65659;
        Map.Entry entryLowerEntry = r1.lowerEntry(abstractC18054);
        if (entryLowerEntry != null) {
            C9548 c9549 = (C9548) entryLowerEntry.getValue();
            AbstractC18054 abstractC18056 = c9549.f32248;
            if (abstractC18056.compareTo(abstractC18054) >= 0) {
                if (abstractC18056.compareTo(abstractC18055) >= 0) {
                    abstractC18055 = abstractC18056;
                }
                abstractC18054 = c9549.f32247;
            }
        }
        Map.Entry entryFloorEntry = r1.floorEntry(abstractC18055);
        if (entryFloorEntry != null) {
            C9548 c95410 = (C9548) entryFloorEntry.getValue();
            if (c95410.f32248.compareTo(abstractC18055) >= 0) {
                abstractC18055 = c95410.f32248;
            }
        }
        r1.subMap(abstractC18054, abstractC18055).clear();
        C9548 c9548M24396 = C9548.m24396(abstractC18054, abstractC18055);
        boolean zM24404 = c9548M24396.m24404();
        AbstractC18054 abstractC18057 = c9548M24396.f32247;
        if (zM24404) {
            r1.remove(abstractC18057);
        } else {
            r1.put(abstractC18057, c9548M24396);
        }
    }
}
