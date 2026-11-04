package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۬ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBHC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13901 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f44077 = new HashMap(50);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33847(AbstractC8681 abstractC8681) {
        for (AbstractC23599 abstractC23599 : abstractC8681.mo3721()) {
            String strMo1843 = abstractC23599.mo1454().mo1843();
            HashMap map = this.f44077;
            C7190 c7190 = (C7190) map.get(strMo1843);
            if (c7190 == null) {
                map.put(strMo1843, new C7190(abstractC23599, strMo1843));
            } else {
                c7190.m19764(abstractC23599);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33848(C15000 c15000) {
        HashMap map = this.f44077;
        if (map.size() == 0) {
            return;
        }
        c15000.m36111(0, "\nstatistics:\n");
        TreeMap treeMap = new TreeMap();
        for (C7190 c7190 : map.values()) {
            treeMap.put(c7190.f23738, c7190);
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            ((C7190) it.next()).m19763(c15000);
        }
    }
}
