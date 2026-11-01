package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes2.dex */
public final class C3737 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12703 m10946(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C16936 c16936) {
        InterfaceC13409 interfaceC13409M15898 = C5772.m15898(charSequence, new C21959(charSequence2, charSequence3), c16936);
        int length = charSequence2.length();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C20464 c20464 : interfaceC13409M15898.mo11889()) {
            int i = c20464.f66402;
            int i2 = c20464.f66399;
            int i3 = c20464.f66400;
            int i4 = c20464.f66401;
            if (i <= length) {
                arrayList.add(new C20464(i4, i3, i2, i));
            } else if (i2 >= length) {
                arrayList2.add(new C20464(i4, i3, i2 - length, i - length));
            } else {
                int i5 = (length - i2) + i4;
                arrayList.add(new C20464(i4, i5, i2, length));
                arrayList2.add(new C20464(i5, i3, 0, c20464.f66402 - length));
            }
        }
        return new C12703(C1413.m4944(C1413.m4940(charSequence.length(), charSequence2.length(), arrayList)), C1413.m4944(C1413.m4940(charSequence.length(), charSequence3.length(), arrayList2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10947(int i, CharSequence charSequence) {
        char cCharAt;
        if (i >= 0 && i != charSequence.length() && C13571.m33170(charSequence.charAt(i))) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 == '\n') {
                    return true;
                }
                if (C13571.m33170(cCharAt2)) {
                }
            }
            return true;
        }
        if (i < 0 || i == charSequence.length() || !C13571.m33170(charSequence.charAt(i))) {
            return false;
        }
        while (i < charSequence.length() && (cCharAt = charSequence.charAt(i)) != '\n') {
            if (!C13571.m33170(cCharAt)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m10945(CharSequence charSequence) {
        EnumC3522 enumC3522M10384;
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            boolean z = (iCodePointAt >= 128 || !C13571.m33170((char) iCodePointAt)) ? !C12206.m30311(iCodePointAt) : false;
            if (z) {
                if (iCodePointAt >= 128 && !Character.isDigit(iCodePointAt)) {
                    int i4 = C4312.f15487;
                    if ((iCodePointAt >>> 16) != 0 || Character.isIdeographic(iCodePointAt) || !Character.isAlphabetic(iCodePointAt) || (enumC3522M10384 = EnumC3522.m10384(iCodePointAt)) == EnumC3522.HIRAGANA || enumC3522M10384 == EnumC3522.KATAKANA || enumC3522M10384 == EnumC3522.THAI || enumC3522M10384 == EnumC3522.JAVANESE) {
                        if (i2 != -1) {
                            arrayList.add(new C12911(i2, i, i3, charSequence));
                            i2 = -1;
                        }
                        if (z) {
                            arrayList.add(new C12911(i, i + iCharCount, iCodePointAt, charSequence));
                        } else if (iCodePointAt == 10) {
                            arrayList.add(new C22083(i));
                        }
                    }
                }
                if (i2 == -1) {
                    i3 = 0;
                    i2 = i;
                }
                i3 = (i3 * 31) + iCodePointAt;
            } else {
                if (i2 != -1) {
                    arrayList.add(new C12911(i2, i, i3, charSequence));
                    i2 = -1;
                }
                if (z) {
                    arrayList.add(new C12911(i, i + iCharCount, iCodePointAt, charSequence));
                } else if (iCodePointAt == 10) {
                    arrayList.add(new C22083(i));
                }
            }
            i += iCharCount;
        }
        if (i2 != -1) {
            arrayList.add(new C12911(i2, length, i3, charSequence));
        }
        return arrayList;
    }
}
