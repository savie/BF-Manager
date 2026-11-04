package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DACT */
/* JADX INFO: loaded from: classes2.dex */
public final class C4123 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13223(String str) {
        if (str.charAt(0) != 'L') {
            return str;
        }
        int length = str.length() - 1;
        return str.charAt(length) == ';' ? str.substring(1, length).replace('/', '.') : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13220(int i, String str) {
        if (i < 1) {
            return "";
        }
        if (i == 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13221(Iterable iterable, String str) {
        return iterable == null ? "" : m13222(iterable, str, new C6361(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13222(Iterable iterable, String str, Function function) {
        StringBuilder sb = new StringBuilder();
        m13228(sb, iterable, str, function);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13228(StringBuilder sb, Iterable iterable, String str, Function function) {
        if (iterable == null) {
            return;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb.append((String) function.apply(it.next()));
        }
        while (it.hasNext()) {
            sb.append(str);
            sb.append((String) function.apply(it.next()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13225(ArrayList arrayList) {
        if (m13229((Collection) arrayList)) {
            return "";
        }
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        StringBuilder sb = new StringBuilder();
        C4937.forEach(arrayList, new C24261(sb));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13224(Throwable th) {
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        StringBuilder sb = new StringBuilder();
        while (th != null && setNewSetFromMap.add(th)) {
            if (sb.length() != 0) {
                sb.append("; caused by: ");
            }
            String simpleName = th.getClass().getSimpleName();
            if (th.getClass().getName().startsWith("jadx.") && simpleName.startsWith("Jadx")) {
                simpleName = simpleName.substring(4);
            }
            sb.append(simpleName);
            String message = th.getMessage();
            if (message != null && !message.isEmpty()) {
                sb.append(": ");
                sb.append(message);
            }
            th = th.getCause();
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m13226(Collection collection, Function function) {
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static List m13230(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (list.size() == 1) {
            return Collections.singletonList(list.get(0));
        }
        return new C14279(list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m13219(List list) {
        if (list == null || list.size() != 1) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m13231(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return C7750.m21093(1, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13229(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m13232(Collection collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13227() {
        if (Thread.currentThread().isInterrupted()) {
            throw new C8597("Thread interrupted");
        }
    }
}
