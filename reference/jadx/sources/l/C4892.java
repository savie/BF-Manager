package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ᩷۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C4892 extends C4186 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m13617(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        C13465.m32967(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13614(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m13618(Object... objArr) {
        if (objArr.length > 0) {
            List listAsList = Arrays.asList(objArr);
            C13465.m32967(listAsList, "asList(...)");
            return listAsList;
        }
        return C23238.f75405;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13615(List list) {
        C13465.m32966(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13620(ArrayList arrayList, InterfaceC15456 interfaceC15456) {
        int iM13615;
        C13465.m32966(arrayList, "<this>");
        int iM13616 = m13615((List) arrayList);
        int i = 0;
        if (iM13616 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) interfaceC15456.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iM13616) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= arrayList.size() || i > (iM13615 = m13615((List) arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(iM13615);
            if (iM13615 == i) {
                return;
            } else {
                iM13615--;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13616(Collection collection, String str, String str2, String str3, InterfaceC15456 interfaceC15456, int i) {
        String str4 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC15456 = null;
        }
        C13465.m32966(collection, "<this>");
        StringBuilder sb = new StringBuilder();
        C4186.m11836(collection, sb, str, str4, str5, "...", interfaceC15456);
        return sb.toString();
    }
}
