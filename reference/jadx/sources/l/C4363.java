package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C4363 {
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24501 m13865(String str, String str2, C13312 c13312) {
        int i;
        String strM32875 = c13312.m32875();
        String strM32874 = c13312.m32874();
        if (str.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        for (int i5 = 0; i2 < str2.length() && i5 < strM32874.length(); i5++) {
            char cCharAt = str2.charAt(i2);
            char cCharAt2 = strM32874.charAt(i5);
            char cCharAt3 = strM32875.charAt(i5);
            if (cCharAt == cCharAt2) {
                arrayList.add(Integer.valueOf(i5));
                int iMax = Math.max(15 - i5, 0);
                int iM31436 = iMax + 10;
                if (i5 == 0) {
                    iM31436 = iMax + 30;
                } else {
                    char cCharAt4 = strM32875.charAt(i5);
                    char cCharAt5 = strM32875.charAt(i5 - 1);
                    if ((Character.isLowerCase(cCharAt5) && Character.isUpperCase(cCharAt4)) || (!Character.isLetterOrDigit(cCharAt5) && Character.isLetterOrDigit(cCharAt4))) {
                        iM31436 = iMax + 30;
                    }
                }
                if (z) {
                    iM31436 = C12669.m31436(i4, 5, 15, iM31436);
                }
                i3 += iM31436;
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
        int[] array = C1170.stream(arrayList).mapToInt(new C7963()).toArray();
        if (strM32874.startsWith(str2)) {
            i = strM32875.startsWith(str) ? 80 : 50;
        } else {
            i = 0;
        }
        int iMax2 = Math.max(50 - strM32875.length(), 0) + i;
        if (str.equalsIgnoreCase(strM32875)) {
            iMax2 += 100;
        }
        if (array.length > 1) {
            iMax2 += ((array.length * 100) / ((array[array.length - 1] - array[0]) + 1)) / 10;
        }
        return new C24501(strM32875, i3 + iMax2, array);
    }
}
