package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16507 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20740 f53024;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C0278 f53025;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15802 f53026;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo36169(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo36170(int i, int i2);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo36171(int i, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo36172();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo36173(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo36174(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۨ */
    public abstract int mo36175();

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo36176(Object obj);

    /* JADX INFO: renamed from: ܰ */
    public abstract Map mo36177();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38780(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] m38782(int i, Object[] objArr) {
        int iMo36175 = mo36175();
        if (objArr.length < iMo36175) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iMo36175);
        }
        for (int i2 = 0; i2 < iMo36175; i2++) {
            objArr[i2] = mo36170(i2, i);
        }
        if (objArr.length > iMo36175) {
            objArr[iMo36175] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38781(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
