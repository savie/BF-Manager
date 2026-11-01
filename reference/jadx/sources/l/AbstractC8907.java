package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8907 {
    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo21489(AbstractC19055 abstractC19055, C8472 c8472);

    /* JADX INFO: renamed from: ܰ */
    public AbstractC8907 mo21490(AbstractC19055 abstractC19055, C8472 c8472) {
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8907 m23168(AbstractC8907 abstractC8907, AbstractC8907 abstractC8908) {
        C21606 c21606;
        if (abstractC8907 == null || abstractC8907 == (c21606 = C21606.f70083)) {
            return abstractC8908;
        }
        if (abstractC8908 == null || abstractC8908 == c21606) {
            return abstractC8907;
        }
        C15257 c15257 = new C15257(abstractC8907, abstractC8908);
        AbstractC8907[] abstractC8907Arr = c15257.f49729;
        return abstractC8907Arr.length == 1 ? abstractC8907Arr[0] : c15257;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m23167(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC8907 abstractC8907 = (AbstractC8907) it.next();
            if (abstractC8907 instanceof C8201) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((C8201) abstractC8907);
                it.remove();
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }
}
