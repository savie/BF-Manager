package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P784 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15014 {
    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x013f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36163(C18459 c18459, C3717 c3717, C10671 c10671) {
        int i = c3717.f12778;
        boolean z = c10671.f33864;
        int i2 = c10671.f33872;
        if (!z || i2 <= 0 || i < 0) {
            return null;
        }
        int iM4323 = C1173.m4323(i, c18459);
        int i3 = c3717.f12781;
        if (i3 > i) {
            i = i3 - 1;
        }
        int iM4325 = C1173.m4325(i, c18459);
        ArrayList arrayList = new ArrayList();
        int iMax = Math.max(0, Math.min(iM4323, c18459.length()));
        int iMax2 = Math.max(iMax, Math.min(iM4325, c18459.length()));
        while (iMax <= iMax2 && iMax < c18459.length()) {
            int iM4326 = C1173.m4325(iMax, c18459);
            C19490 c19490M36164 = m36164(iMax, iM4326, i2, c18459);
            if (c19490M36164 != null) {
                arrayList.add(c19490M36164);
            }
            if (iM4326 >= iMax2 || iM4326 >= c18459.length()) {
                break;
            }
            iMax = iM4326 + 1;
        }
        if (arrayList.isEmpty()) {
            return m36162((CharSequence) c18459, c3717, c10671);
        }
        ArrayList arrayList2 = new ArrayList();
        int iMax3 = Math.max(0, Math.min(iM4323, c18459.length()));
        while (iMax3 > 0 && arrayList2.size() < 2) {
            int i4 = iMax3 - 1;
            int i5 = iMax3 - 2;
            while (true) {
                if (i5 < 0) {
                    iMax3 = 0;
                    break;
                }
                if (c18459.charAt(i5) == '\n') {
                    iMax3 = i5 + 1;
                    break;
                }
                i5--;
            }
            C19490 c19490M36165 = m36164(iMax3, i4, i2, c18459);
            if (c19490M36165 != null) {
                arrayList2.add(0, c19490M36165);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int length = iM4325 < c18459.length() ? iM4325 + 1 : c18459.length();
        while (length < c18459.length() && arrayList3.size() < 2) {
            int iM4327 = C1173.m4325(length, c18459);
            C19490 c19490M36166 = m36164(length, iM4327, i2, c18459);
            if (c19490M36166 != null) {
                arrayList3.add(c19490M36166);
            }
            if (iM4327 >= c18459.length()) {
                break;
            }
            length = iM4327 + 1;
        }
        String strM36161 = m36161(i2, arrayList2, arrayList, arrayList3);
        if (strM36161 == null) {
            ArrayList arrayList4 = new ArrayList(arrayList2);
            ArrayList arrayList5 = new ArrayList(arrayList3);
            C19490 c19490 = arrayList4.size() >= 2 ? (C19490) arrayList4.get(0) : null;
            C19490 c19491 = arrayList5.size() >= 2 ? (C19490) j$$ExternalSyntheticOutline0.m(arrayList5, 1) : null;
            if (c19490 == null && c19491 == null) {
                if (arrayList2.size() > 1) {
                    arrayList2 = new ArrayList(arrayList2.subList(arrayList2.size() - 1, arrayList2.size()));
                }
                if (arrayList3.size() > 1) {
                    arrayList3 = new ArrayList(arrayList3.subList(0, 1));
                }
                strM36161 = m36161(i2, arrayList2, arrayList, arrayList3);
            } else {
                if (c19490 == null || (c19491 != null && c19490.f62920 <= c19491.f62920)) {
                    C2764.m9138(arrayList5, 1);
                } else {
                    arrayList4.remove(0);
                }
                strM36161 = m36161(i2, arrayList4, arrayList, arrayList5);
                if (strM36161 == null) {
                    if (arrayList2.size() > 1) {
                        arrayList2 = new ArrayList(arrayList2.subList(arrayList2.size() - 1, arrayList2.size()));
                    }
                    if (arrayList3.size() > 1) {
                        arrayList3 = new ArrayList(arrayList3.subList(0, 1));
                    }
                    strM36161 = m36161(i2, arrayList2, arrayList, arrayList3);
                }
            }
        }
        return strM36161 != null ? strM36161 : m36162((CharSequence) c18459, c3717, c10671);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36161(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ArrayList arrayList4 = new ArrayList(arrayList3.size() + arrayList2.size() + arrayList.size());
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        if (arrayList4.isEmpty()) {
            return null;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
            i2 += ((C19490) arrayList4.get(i3)).f62920;
            if (i3 > 0) {
                i2++;
            }
            if (i2 > i) {
                return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < arrayList4.size(); i4++) {
            if (i4 > 0) {
                sb.append('\n');
            }
            String str = ((C19490) arrayList4.get(i4)).f62921;
            if (str == null) {
                return null;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36162(CharSequence charSequence, C3717 c3717, C10671 c10671) {
        int iMax = Math.max(0, Math.min(c3717.f12778, charSequence.length()));
        int iCodePointCount = Character.codePointCount(charSequence, iMax, Math.max(iMax, Math.min(c3717.f12781, charSequence.length())));
        int i = c10671.f33872;
        String strM4316 = C1173.m4316(C1173.m4324(iMax, -(iCodePointCount >= i ? 0 : Math.min(i - iCodePointCount, i / 3)), charSequence), charSequence.length(), i, charSequence);
        String[] strArrSplit = strM4316.split("\n", -1);
        StringBuilder sb = new StringBuilder(strM4316.length());
        for (String str : strArrSplit) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(strTrim);
            }
        }
        String string = sb.toString();
        return string.isEmpty() ? strM4316.trim() : string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19490 m36164(int i, int i2, int i3, CharSequence charSequence) {
        int iMax = Math.max(0, Math.min(i, charSequence.length()));
        int iMax2 = Math.max(iMax, Math.min(i2, charSequence.length()));
        while (iMax < iMax2 && charSequence.charAt(iMax) <= ' ') {
            iMax++;
        }
        while (iMax2 > iMax && charSequence.charAt(iMax2 - 1) <= ' ') {
            iMax2--;
        }
        if (iMax >= iMax2) {
            return null;
        }
        int iCodePointCount = Character.codePointCount(charSequence, iMax, iMax2);
        return new C19490(iCodePointCount <= i3 ? C1173.m4316(iMax, iMax2, i3, charSequence) : null, iCodePointCount);
    }
}
