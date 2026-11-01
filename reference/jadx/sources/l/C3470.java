package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C3470 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12742;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12743;

    public C3470(ArrayList arrayList, ArrayList arrayList2) {
        this.f12743 = arrayList;
        this.f12742 = arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3470 m10188(ArrayList arrayList, HashSet hashSet, Set set) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.contains(str)) {
                if (set.contains(str)) {
                    arrayList3.add(str);
                } else {
                    arrayList2.add(str);
                }
            }
        }
        if (!arrayList3.isEmpty() && !set.contains("mo")) {
            arrayList2.add("mo");
        }
        return new C3470(arrayList2, arrayList3);
    }
}
