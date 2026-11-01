package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7TD */
/* JADX INFO: loaded from: classes.dex */
public final class C23671 {
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10971 m52114(String str, String str2, C8148 c8148) {
        int i;
        String strM21459 = c8148.m21459();
        String strM21458 = c8148.m21458();
        if (str.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        for (int i5 = 0; i2 < str2.length() && i5 < strM21458.length(); i5++) {
            char cCharAt = str2.charAt(i2);
            char cCharAt2 = strM21458.charAt(i5);
            char cCharAt3 = strM21459.charAt(i5);
            if (cCharAt == cCharAt2) {
                arrayList.add(Integer.valueOf(i5));
                int iMax = Math.max(15 - i5, 0);
                int iM5620 = iMax + 10;
                if (i5 == 0) {
                    iM5620 = iMax + 30;
                } else {
                    char cCharAt4 = strM21459.charAt(i5);
                    char cCharAt5 = strM21459.charAt(i5 - 1);
                    if ((Character.isLowerCase(cCharAt5) && Character.isUpperCase(cCharAt4)) || (!Character.isLetterOrDigit(cCharAt5) && Character.isLetterOrDigit(cCharAt4))) {
                        iM5620 = iMax + 30;
                    }
                }
                if (z) {
                    iM5620 = C1694.m5620(i4, 5, 15, iM5620);
                }
                i3 += iM5620;
                if (str.charAt(i2) == cCharAt3 && Character.isUpperCase(cCharAt3)) {
                    i3 += 5;
                }
                i2++;
                i4++;
                z = true;
            } else {
                z = false;
                i4 = 0;
            }
        }
        if (i2 < str2.length()) {
            return null;
        }
        int[] array = C9030.stream(arrayList).mapToInt(new C6339()).toArray();
        if (strM21458.startsWith(str2)) {
            i = strM21459.startsWith(str) ? 80 : 50;
        } else {
            i = 0;
        }
        int iMax2 = Math.max(50 - strM21459.length(), 0) + i;
        if (str.equalsIgnoreCase(strM21459)) {
            iMax2 += 100;
        }
        if (array.length > 1) {
            iMax2 += ((array.length * 100) / ((array[array.length - 1] - array[0]) + 1)) / 10;
        }
        return new C10971(strM21459, i3 + iMax2, array);
    }
}
