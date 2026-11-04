package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۙ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6XI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4530 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14252(String str, ArrayList arrayList) throws C2817 {
        int i = 0;
        if (arrayList.size() == 1 && "write_target".equals(((C9528) arrayList.get(0)).f30864)) {
            return ((C9528) arrayList.get(0)).f30863;
        }
        ArrayList<C8783> arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C9528 c9528 = (C9528) arrayList.get(i2);
            String str2 = c9528.f30864;
            String str3 = c9528.f30862;
            if (!"replace_match".equals(str2) && !"insert_before_match".equals(str2) && !"insert_after_match".equals(str2)) {
                throw new C2817(EnumC7292.INVALID_MODE, i2, -1);
            }
            int iIndexOf = str.indexOf(str3);
            if (iIndexOf < 0) {
                throw new C2817(EnumC7292.MATCH_NOT_FOUND, i2, -1);
            }
            if (str.indexOf(str3, iIndexOf + 1) >= 0) {
                throw new C2817(EnumC7292.MATCH_AMBIGUOUS, i2, -1);
            }
            arrayList2.add(new C8783(i2, c9528, iIndexOf, str3.length() + iIndexOf));
        }
        int i3 = 0;
        while (i3 < arrayList2.size()) {
            C8783 c8783 = (C8783) arrayList2.get(i3);
            i3++;
            for (int i4 = i3; i4 < arrayList2.size(); i4++) {
                C8783 c8784 = (C8783) arrayList2.get(i4);
                if (c8783.f28632 < c8784.f28630 && c8784.f28632 < c8783.f28630) {
                    throw new C2817(EnumC7292.MATCH_OVERLAP, c8784.f28631, c8783.f28631);
                }
            }
        }
        ArrayList<C14003> arrayList3 = new ArrayList();
        TreeMap treeMap = new TreeMap();
        for (C8783 c8785 : arrayList2) {
            C9528 c9529 = c8785.f28629;
            String str4 = c9529.f30863;
            String str5 = c9529.f30864;
            int i5 = c8785.f28630;
            int i6 = c8785.f28632;
            if ("replace_match".equals(str5)) {
                arrayList3.add(new C14003(i6, i5, str4));
            } else {
                if ("insert_before_match".equals(str5)) {
                    i5 = i6;
                }
                ((ArrayList) C11392.computeIfAbsent(treeMap, Integer.valueOf(i5), new C23173(3))).add(str4);
            }
        }
        C12884.sort(arrayList3, C2661.comparingInt(new C1326()));
        StringBuilder sb = new StringBuilder(str.length());
        for (C14003 c14003 : arrayList3) {
            m14253(sb, str, i, c14003.f44369, treeMap);
            sb.append(c14003.f44368);
            i = c14003.f44367;
        }
        m14253(sb, str, i, str.length(), treeMap);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14253(StringBuilder sb, String str, int i, int i2, TreeMap treeMap) {
        while (i < i2) {
            ArrayList arrayList = (ArrayList) treeMap.remove(Integer.valueOf(i));
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                }
            }
            sb.append(str.charAt(i));
            i++;
        }
        ArrayList arrayList2 = (ArrayList) treeMap.remove(Integer.valueOf(i2));
        if (arrayList2 == null) {
            return;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
        }
    }
}
