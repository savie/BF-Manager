package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 2998 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5472 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Map f18843 = C0561.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static BinderC2649 m15138(C14170 c14170) {
        c14170.getClass();
        String className = c14170.f46504.getClassName();
        Map map = f18843;
        BinderC2649 binderC2649 = (BinderC2649) map.get(className);
        if (binderC2649 != null) {
            return binderC2649;
        }
        BinderC2649 binderC26410 = new BinderC2649(c14170);
        map.put(className, binderC26410);
        return binderC26410;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15139(BinderC2649 binderC2649) {
        ArrayList arrayList = new ArrayList();
        Map map = f18843;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == binderC2649) {
                arrayList.add((String) entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
