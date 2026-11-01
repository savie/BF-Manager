package l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16083 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52025 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0559 m38110() {
        int i = C9548.f32245;
        AbstractC10959 abstractC10959 = C1785.f6936;
        abstractC10959.getClass();
        C18885 c18885 = new C18885(EnumC1079.f4943, abstractC10959);
        ArrayList arrayList = this.f52025;
        Collections.sort(arrayList, c18885);
        C4793 c4793 = new C4793(arrayList.size());
        C4793 c4794 = new C4793(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C9548 c9548 = (C9548) ((Map.Entry) arrayList.get(i2)).getKey();
            if (i2 > 0) {
                C9548 c9549 = (C9548) ((Map.Entry) arrayList.get(i2 - 1)).getKey();
                if (c9548.m24408(c9549) && !c9548.m24410(c9549).m24404()) {
                    throw new IllegalArgumentException("Overlapping ranges: range " + c9549 + " overlaps with entry " + c9548);
                }
            }
            c4793.m52161((Object) c9548);
            c4794.m52161(((Map.Entry) arrayList.get(i2)).getValue());
        }
        return new C0559(c4793.m13309(), c4794.m13309());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38111(C9548 c9548, Object obj) {
        c9548.getClass();
        obj.getClass();
        C18304.m42514(c9548, "Range must not be empty, but was %s", !c9548.m24404());
        this.f52025.add(new AbstractMap.SimpleImmutableEntry(c9548, obj));
    }
}
