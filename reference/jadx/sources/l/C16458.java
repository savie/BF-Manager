package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16458 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m38724(Iterator it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return C17039.m39822(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterator m38720(Iterator it, InterfaceC11955 interfaceC11955) {
        return new C18574(it, interfaceC11955);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m38718(Iterator it, String str) {
        return it.hasNext() ? it.next() : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterator m38719(Iterator it, Iterator it2) {
        it.getClass();
        it2.getClass();
        return new C8697(new C21396(new Iterator[]{it, it2}));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38723(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m38725(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23659 m38722(Iterator it) {
        if (it instanceof C19986) {
            return (C19986) it;
        }
        return new C19986(it);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0477 m38721(Iterable iterable, Comparator comparator) {
        C18304.m42513(iterable, "iterators");
        C18304.m42513(comparator, "comparator");
        return new C15753(iterable, comparator);
    }
}
