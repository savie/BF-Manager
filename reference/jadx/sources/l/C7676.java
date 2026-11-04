package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7676 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m20915(Iterator it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return C18444.m42974(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterator m20911(Iterator it, InterfaceC5417 interfaceC5417) {
        return new C3201(it, interfaceC5417);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m20909(Iterator it, String str) {
        return it.hasNext() ? it.next() : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Iterator m20910(Iterator it, Iterator it2) {
        it.getClass();
        it2.getClass();
        return new C6185(new C15879(new Iterator[]{it, it2}));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20914(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m20916(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC9802 m20913(Iterator it) {
        if (it instanceof C18117) {
            return (C18117) it;
        }
        return new C18117(it);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC4516 m20912(Iterable iterable, Comparator comparator) {
        C12128.m30305(iterable, "iterators");
        C12128.m30305(comparator, "comparator");
        return new C21101(iterable, comparator);
    }
}
