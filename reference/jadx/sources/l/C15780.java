package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2998 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15780 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Map f51361 = C4681.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static BinderC17272 m37716(C15034 c15034) {
        c15034.getClass();
        String className = c15034.f49074.getClassName();
        Map map = f51361;
        BinderC17272 binderC17272 = (BinderC17272) map.get(className);
        if (binderC17272 != null) {
            return binderC17272;
        }
        BinderC17272 binderC17273 = new BinderC17272(c15034);
        map.put(className, binderC17273);
        return binderC17273;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37717(BinderC17272 binderC17272) {
        ArrayList arrayList = new ArrayList();
        Map map = f51361;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == binderC17272) {
                arrayList.add((String) entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
