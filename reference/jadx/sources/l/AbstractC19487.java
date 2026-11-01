package l;

import com.alipay.sdk.m.t.e;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩵۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBDS */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19487 extends AbstractC5106 {
    @Override // l.AbstractC5106
    /* JADX INFO: renamed from: ۜ */
    public final void mo12266() {
        int i = 0;
        if (mo12263().size() <= 65536) {
            Iterator it = mo12263().iterator();
            while (it.hasNext()) {
                ((AbstractC8198) it.next()).m36533(i);
                i++;
            }
            return;
        }
        TreeMap treeMap = new TreeMap();
        Iterator it2 = mo12263().iterator();
        while (it2.hasNext()) {
            String string = ((AbstractC8198) it2.next()).m50908().m17129().getString();
            int iLastIndexOf = string.lastIndexOf(47);
            String strReplace = iLastIndexOf == -1 ? "default" : string.substring(string.lastIndexOf(91) + 2, iLastIndexOf).replace('/', '.');
            AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(strReplace);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                treeMap.put(strReplace, atomicInteger);
            }
            atomicInteger.incrementAndGet();
        }
        Formatter formatter = new Formatter();
        try {
            formatter.format("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:", this instanceof C15960 ? e.s : "field", Integer.valueOf(mo12263().size()), 65536);
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format("%n%6d %s", Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey());
            }
            throw new C8925(formatter.toString(), null);
        } finally {
            formatter.close();
        }
    }
}
