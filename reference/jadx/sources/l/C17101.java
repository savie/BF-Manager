package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17101 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m40262(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }
}
