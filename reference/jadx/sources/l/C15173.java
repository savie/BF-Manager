package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C15173 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f49480;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f49481;

    public C15173(ArrayList arrayList, ArrayList arrayList2) {
        this.f49481 = arrayList;
        this.f49480 = arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15173 m36483(ArrayList arrayList, HashSet hashSet, Set set) {
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
        return new C15173(arrayList2, arrayList3);
    }
}
