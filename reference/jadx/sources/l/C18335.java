package l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18335 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59805 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7894 m42788() {
        int i = C2346.f7567;
        AbstractC18753 abstractC18753 = C9057.f29455;
        abstractC18753.getClass();
        C20770 c20770 = new C20770(new C4791(9), abstractC18753);
        ArrayList arrayList = this.f59805;
        Collections.sort(arrayList, c20770);
        C22811 c22811 = new C22811(arrayList.size());
        C22811 c22812 = new C22811(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C2346 c2346 = (C2346) ((Map.Entry) arrayList.get(i2)).getKey();
            if (i2 > 0) {
                C2346 c2347 = (C2346) ((Map.Entry) arrayList.get(i2 - 1)).getKey();
                if (c2346.m7921(c2347) && !c2346.m7923(c2347).m7917()) {
                    throw new IllegalArgumentException("Overlapping ranges: range " + c2347 + " overlaps with entry " + c2346);
                }
            }
            c22811.m19805((Object) c2346);
            c22812.m19805(((Map.Entry) arrayList.get(i2)).getValue());
        }
        return new C7894(c22811.m51441(), c22812.m51441());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42789(C2346 c2346, Object obj) {
        c2346.getClass();
        obj.getClass();
        C12128.m30306(c2346, "Range must not be empty, but was %s", !c2346.m7917());
        this.f59805.add(new AbstractMap.SimpleImmutableEntry(c2346, obj));
    }
}
