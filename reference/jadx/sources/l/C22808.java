package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩺ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes.dex */
public final class C22808 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object[] m50470(Iterable iterable, Class cls) {
        Collection collectionM9145;
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, 0);
        if (iterable instanceof Collection) {
            collectionM9145 = (Collection) iterable;
        } else {
            collectionM9145 = C3051.m9145(iterable.iterator());
        }
        return collectionM9145.toArray(objArr);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m50463(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return C16458.m38724(iterable.iterator());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m50472(Iterable iterable, InterfaceC19010 interfaceC19010) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            interfaceC19010.getClass();
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                if (!interfaceC19010.apply(obj)) {
                    if (i2 > i) {
                        try {
                            list.set(i, obj);
                        } catch (IllegalArgumentException unused) {
                            m50468(list, interfaceC19010, i, i2);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            m50468(list, interfaceC19010, i, i2);
                            return;
                        }
                    }
                    i++;
                }
            }
            list.subList(i, list.size()).clear();
            return;
        }
        Iterator it = iterable.iterator();
        interfaceC19010.getClass();
        while (it.hasNext()) {
            if (interfaceC19010.apply(it.next())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50468(List list, InterfaceC19010 interfaceC19010, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (interfaceC19010.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterable m50464(Iterable iterable) {
        return new C10294(iterable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterable m50465(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new C20877(iterableArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m50467(Collection collection) {
        Iterator it = collection.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Object[] m50471(Iterable iterable) {
        Collection collectionM9145;
        if (iterable instanceof Collection) {
            collectionM9145 = (Collection) iterable;
        } else {
            collectionM9145 = C3051.m9145(iterable.iterator());
        }
        return collectionM9145.toArray();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0025 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50469(Iterable iterable, InterfaceC19010 interfaceC19010) {
        Iterator it = iterable.iterator();
        C18304.m42513(interfaceC19010, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (interfaceC19010.apply(it.next())) {
                if (i != -1) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m50475(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return C3012.m8974(1, list);
        }
        if (iterable instanceof SortedSet) {
            return ((SortedSet) iterable).last();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterable m50466(Iterable iterable, InterfaceC11955 interfaceC11955) {
        iterable.getClass();
        return new C3756(iterable, interfaceC11955);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Iterable m50474(Iterable iterable, InterfaceC19010 interfaceC19010) {
        iterable.getClass();
        interfaceC19010.getClass();
        return new C12930(iterable, interfaceC19010);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m50473(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }
}
