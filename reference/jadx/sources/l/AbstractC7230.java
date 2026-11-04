package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7230 {
    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo4584(AbstractC9488 abstractC9488, C2777 c2777);

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC7230 mo4585(AbstractC9488 abstractC9488, C2777 c2777) {
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC7230 m19830(AbstractC7230 abstractC7230, AbstractC7230 abstractC7231) {
        C10212 c10212;
        if (abstractC7230 == null || abstractC7230 == (c10212 = C10212.f32654)) {
            return abstractC7231;
        }
        if (abstractC7231 == null || abstractC7231 == c10212) {
            return abstractC7230;
        }
        C19163 c19163 = new C19163(abstractC7230, abstractC7231);
        AbstractC7230[] abstractC7230Arr = c19163.f62008;
        return abstractC7230Arr.length == 1 ? abstractC7230Arr[0] : c19163;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m19829(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC7230 abstractC7230 = (AbstractC7230) it.next();
            if (abstractC7230 instanceof C2755) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((C2755) abstractC7230);
                it.remove();
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }
}
