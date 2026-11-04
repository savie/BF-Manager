package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟۟᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes4.dex */
public final class C7743 extends C13708 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m21087(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        C15243.m36591(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21084(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m21088(Object... objArr) {
        if (objArr.length > 0) {
            List listAsList = Arrays.asList(objArr);
            C15243.m36591(listAsList, "asList(...)");
            return listAsList;
        }
        return C22242.f71645;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21085(List list) {
        C15243.m36590(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21090(ArrayList arrayList, InterfaceC3071 interfaceC3071) {
        int iM21085;
        C15243.m36590(arrayList, "<this>");
        int iM21086 = m21085((List) arrayList);
        int i = 0;
        if (iM21086 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) interfaceC3071.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iM21086) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= arrayList.size() || i > (iM21085 = m21085((List) arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(iM21085);
            if (iM21085 == i) {
                return;
            } else {
                iM21085--;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m21091(Iterable iterable) {
        ArrayList arrayList;
        C15243.m36590(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                return m21087(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
            }
        } else {
            if (z) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                C15243.m36590(iterable, "<this>");
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            int size2 = arrayList.size();
            if (size2 != 0) {
                return size2 != 1 ? arrayList : m21087(arrayList.get(0));
            }
        }
        return C22242.f71645;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21086(Collection collection, String str, String str2, String str3, InterfaceC3071 interfaceC3071, int i) {
        String str4 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC3071 = null;
        }
        C15243.m36590(collection, "<this>");
        StringBuilder sb = new StringBuilder();
        C13708.m33503(collection, sb, str, str4, str5, "...", interfaceC3071);
        return sb.toString();
    }
}
