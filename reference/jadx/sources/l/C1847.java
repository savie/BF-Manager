package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.֫۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBHC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1847 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f7060 = new HashMap(50);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6009(AbstractC23721 abstractC23721) {
        for (AbstractC21603 abstractC21603 : abstractC23721.mo12263()) {
            String strMo2376 = abstractC21603.mo4170().mo2376();
            HashMap map = this.f7060;
            C14549 c14549 = (C14549) map.get(strMo2376);
            if (c14549 == null) {
                map.put(strMo2376, new C14549(abstractC21603, strMo2376));
            } else {
                c14549.m35016(abstractC21603);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6008(C2718 c2718) {
        HashMap map = this.f7060;
        if (map.size() == 0) {
            return;
        }
        c2718.m8283(0, "\nstatistics:\n");
        TreeMap treeMap = new TreeMap();
        for (C14549 c14549 : map.values()) {
            treeMap.put(c14549.f47641, c14549);
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            ((C14549) it.next()).m35015(c2718);
        }
    }
}
