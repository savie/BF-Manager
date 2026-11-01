package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۨᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: T6XI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11869 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29590(String str, ArrayList arrayList) throws C9857 {
        int i = 0;
        if (arrayList.size() == 1 && "write_target".equals(((C2094) arrayList.get(0)).f7732)) {
            return ((C2094) arrayList.get(0)).f7731;
        }
        ArrayList<C3505> arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C2094 c2094 = (C2094) arrayList.get(i2);
            String str2 = c2094.f7732;
            String str3 = c2094.f7730;
            if (!"replace_match".equals(str2) && !"insert_before_match".equals(str2) && !"insert_after_match".equals(str2)) {
                throw new C9857(EnumC4812.INVALID_MODE, i2, -1);
            }
            int iIndexOf = str.indexOf(str3);
            if (iIndexOf < 0) {
                throw new C9857(EnumC4812.MATCH_NOT_FOUND, i2, -1);
            }
            if (str.indexOf(str3, iIndexOf + 1) >= 0) {
                throw new C9857(EnumC4812.MATCH_AMBIGUOUS, i2, -1);
            }
            arrayList2.add(new C3505(i2, c2094, iIndexOf, str3.length() + iIndexOf));
        }
        int i3 = 0;
        while (i3 < arrayList2.size()) {
            C3505 c3505 = (C3505) arrayList2.get(i3);
            i3++;
            for (int i4 = i3; i4 < arrayList2.size(); i4++) {
                C3505 c3506 = (C3505) arrayList2.get(i4);
                if (c3505.f12856 < c3506.f12858 && c3506.f12856 < c3505.f12858) {
                    throw new C9857(EnumC4812.MATCH_OVERLAP, c3506.f12859, c3505.f12859);
                }
            }
        }
        ArrayList<C13986> arrayList3 = new ArrayList();
        TreeMap treeMap = new TreeMap();
        for (C3505 c3507 : arrayList2) {
            C2094 c2095 = c3507.f12857;
            String str4 = c2095.f7731;
            String str5 = c2095.f7732;
            int i5 = c3507.f12858;
            int i6 = c3507.f12856;
            if ("replace_match".equals(str5)) {
                arrayList3.add(new C13986(i6, i5, str4));
            } else {
                if ("insert_before_match".equals(str5)) {
                    i5 = i6;
                }
                ((ArrayList) C9735.computeIfAbsent(treeMap, Integer.valueOf(i5), new C17437(2))).add(str4);
            }
        }
        C23846.sort(arrayList3, C7618.comparingInt(new C14796()));
        StringBuilder sb = new StringBuilder(str.length());
        for (C13986 c13986 : arrayList3) {
            m29591(sb, str, i, c13986.f45993, treeMap);
            sb.append(c13986.f45992);
            i = c13986.f45991;
        }
        m29591(sb, str, i, str.length(), treeMap);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29591(StringBuilder sb, String str, int i, int i2, TreeMap treeMap) {
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
