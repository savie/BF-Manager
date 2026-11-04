package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9IS4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6823 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19004(List list, Object obj) {
        if (list == null || list.size() != 1) {
            return false;
        }
        return C17359.equals(list.get(0), obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m19000(Collection collection, Function function) {
        if (collection == null || collection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m18999(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return C7750.m21093(1, list);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m19006(List list) {
        int size;
        if (list == null || (size = list.size()) == 0) {
            return null;
        }
        return list.remove(size - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m19002(List list, AbstractC12531 abstractC12531, AbstractC12531 abstractC12532) {
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(abstractC12532);
            return arrayList;
        }
        int iIndexOf = list.indexOf(abstractC12531);
        if (iIndexOf != -1) {
            list.set(iIndexOf, abstractC12532);
            return list;
        }
        list.add(abstractC12532);
        return list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m19001(List list, AbstractC12531 abstractC12531) {
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(abstractC12531);
            return arrayList;
        }
        list.add(abstractC12531);
        return list;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m19008(Collection collection, Predicate predicate) {
        if (collection == null || collection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (predicate.test(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m19007(List list, Predicate predicate) {
        if (list != null && !list.isEmpty()) {
            Object obj = null;
            for (Object obj2 : list) {
                if (predicate.test(obj2)) {
                    if (obj == null) {
                        obj = obj2;
                    }
                }
            }
            return obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19005(List list, Predicate predicate) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!predicate.test(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19003(Collection collection, Predicate predicate) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                return true;
            }
        }
        return false;
    }
}
