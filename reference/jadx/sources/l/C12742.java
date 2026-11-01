package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12742 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m31675(Object obj, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m31676(Object obj, ArrayList arrayList) {
        if (arrayList != null) {
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
        }
        return arrayList;
    }
}
