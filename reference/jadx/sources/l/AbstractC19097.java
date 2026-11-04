package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ᩳ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 02RL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19097 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f61823 = null;

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo26260();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m44212(AbstractC19097 abstractC19097) {
        ArrayList arrayList = abstractC19097.f61823;
        return arrayList == null ? AbstractC1928.of() : arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44213(AbstractC19097 abstractC19097, AbstractC14621 abstractC14621) {
        if (abstractC19097.f61823 == null) {
            abstractC19097.f61823 = new ArrayList(1);
        }
        abstractC19097.f61823.add(abstractC14621);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44214(AbstractC19097 abstractC19097, C9400 c9400) {
        ArrayList arrayList;
        if (abstractC19097 == this || (arrayList = this.f61823) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC14621) it.next()).f46061 = c9400;
        }
        ArrayList arrayList2 = this.f61823;
        RandomAccess randomAccessOf = abstractC19097.f61823;
        if (randomAccessOf == null) {
            randomAccessOf = AbstractC1928.of();
        }
        arrayList2.addAll(randomAccessOf);
        abstractC19097.f61823 = arrayList2;
        this.f61823 = null;
    }
}
