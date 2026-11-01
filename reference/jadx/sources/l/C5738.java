package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P784 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5738 {
    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x013f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15788(C14795 c14795, C4440 c4440, C1139 c1139) {
        int i = c4440.f15806;
        boolean z = c1139.f5117;
        int i2 = c1139.f5129;
        if (!z || i2 <= 0 || i < 0) {
            return null;
        }
        int iM20042 = C7521.m20042(i, c14795);
        int i3 = c4440.f15812;
        if (i3 > i) {
            i = i3 - 1;
        }
        int iM20044 = C7521.m20044(i, c14795);
        ArrayList arrayList = new ArrayList();
        int iMax = Math.max(0, Math.min(iM20042, c14795.length()));
        int iMax2 = Math.max(iMax, Math.min(iM20044, c14795.length()));
        while (iMax <= iMax2 && iMax < c14795.length()) {
            int iM20045 = C7521.m20044(iMax, c14795);
            C17027 c17027M15789 = m15789(iMax, iM20045, i2, c14795);
            if (c17027M15789 != null) {
                arrayList.add(c17027M15789);
            }
            if (iM20045 >= iMax2 || iM20045 >= c14795.length()) {
                break;
            }
            iMax = iM20045 + 1;
        }
        if (arrayList.isEmpty()) {
            return m15787((CharSequence) c14795, c4440, c1139);
        }
        ArrayList arrayList2 = new ArrayList();
        int iMax3 = Math.max(0, Math.min(iM20042, c14795.length()));
        while (iMax3 > 0 && arrayList2.size() < 2) {
            int i4 = iMax3 - 1;
            int i5 = iMax3 - 2;
            while (true) {
                if (i5 < 0) {
                    iMax3 = 0;
                    break;
                }
                if (c14795.charAt(i5) == '\n') {
                    iMax3 = i5 + 1;
                    break;
                }
                i5--;
            }
            C17027 c17027M157810 = m15789(iMax3, i4, i2, c14795);
            if (c17027M157810 != null) {
                arrayList2.add(0, c17027M157810);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int length = iM20044 < c14795.length() ? iM20044 + 1 : c14795.length();
        while (length < c14795.length() && arrayList3.size() < 2) {
            int iM20046 = C7521.m20044(length, c14795);
            C17027 c17027M157811 = m15789(length, iM20046, i2, c14795);
            if (c17027M157811 != null) {
                arrayList3.add(c17027M157811);
            }
            if (iM20046 >= c14795.length()) {
                break;
            }
            length = iM20046 + 1;
        }
        String strM15786 = m15786(i2, arrayList2, arrayList, arrayList3);
        if (strM15786 == null) {
            ArrayList arrayList4 = new ArrayList(arrayList2);
            ArrayList arrayList5 = new ArrayList(arrayList3);
            C17027 c17027 = arrayList4.size() >= 2 ? (C17027) arrayList4.get(0) : null;
            C17027 c17028 = arrayList5.size() >= 2 ? (C17027) C19084.m43861(arrayList5, 1) : null;
            if (c17027 == null && c17028 == null) {
                if (arrayList2.size() > 1) {
                    arrayList2 = new ArrayList(arrayList2.subList(arrayList2.size() - 1, arrayList2.size()));
                }
                if (arrayList3.size() > 1) {
                    arrayList3 = new ArrayList(arrayList3.subList(0, 1));
                }
                strM15786 = m15786(i2, arrayList2, arrayList, arrayList3);
            } else {
                if (c17027 == null || (c17028 != null && c17027.f54390 <= c17028.f54390)) {
                    C19028.m43762(arrayList5, 1);
                } else {
                    arrayList4.remove(0);
                }
                strM15786 = m15786(i2, arrayList4, arrayList, arrayList5);
                if (strM15786 == null) {
                    if (arrayList2.size() > 1) {
                        arrayList2 = new ArrayList(arrayList2.subList(arrayList2.size() - 1, arrayList2.size()));
                    }
                    if (arrayList3.size() > 1) {
                        arrayList3 = new ArrayList(arrayList3.subList(0, 1));
                    }
                    strM15786 = m15786(i2, arrayList2, arrayList, arrayList3);
                }
            }
        }
        return strM15786 != null ? strM15786 : m15787((CharSequence) c14795, c4440, c1139);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15786(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ArrayList arrayList4 = new ArrayList(arrayList3.size() + arrayList2.size() + arrayList.size());
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        if (arrayList4.isEmpty()) {
            return null;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
            i2 += ((C17027) arrayList4.get(i3)).f54390;
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
            String str = ((C17027) arrayList4.get(i4)).f54391;
            if (str == null) {
                return null;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15787(CharSequence charSequence, C4440 c4440, C1139 c1139) {
        int iMax = Math.max(0, Math.min(c4440.f15806, charSequence.length()));
        int iCodePointCount = Character.codePointCount(charSequence, iMax, Math.max(iMax, Math.min(c4440.f15812, charSequence.length())));
        int i = c1139.f5129;
        String strM20035 = C7521.m20035(C7521.m20043(iMax, -(iCodePointCount >= i ? 0 : Math.min(i - iCodePointCount, i / 3)), charSequence), charSequence.length(), i, charSequence);
        String[] strArrSplit = strM20035.split("\n", -1);
        StringBuilder sb = new StringBuilder(strM20035.length());
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
        return string.isEmpty() ? strM20035.trim() : string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17027 m15789(int i, int i2, int i3, CharSequence charSequence) {
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
        return new C17027(iCodePointCount <= i3 ? C7521.m20035(iMax, iMax2, i3, charSequence) : null, iCodePointCount);
    }
}
