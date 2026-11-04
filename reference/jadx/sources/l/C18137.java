package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes4.dex */
public final class C18137 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12850 m42251(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C15087 c15087) {
        InterfaceC21646 interfaceC21646M6133 = C1730.m6133(charSequence, new C14341(charSequence2, charSequence3), c15087);
        int length = charSequence2.length();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C22547 c22547 : interfaceC21646M6133.mo3131()) {
            int i = c22547.f72893;
            int i2 = c22547.f72894;
            int i3 = c22547.f72891;
            int i4 = c22547.f72892;
            if (i <= length) {
                arrayList.add(new C22547(i4, i3, i2, i));
            } else if (i2 >= length) {
                arrayList2.add(new C22547(i4, i3, i2 - length, i - length));
            } else {
                int i5 = (length - i2) + i4;
                arrayList.add(new C22547(i4, i5, i2, length));
                arrayList2.add(new C22547(i5, i3, 0, c22547.f72893 - length));
            }
        }
        return new C12850(C14932.m35915(C14932.m35911(charSequence.length(), charSequence2.length(), arrayList)), C14932.m35915(C14932.m35911(charSequence.length(), charSequence3.length(), arrayList2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42252(int i, CharSequence charSequence) {
        char cCharAt;
        if (i >= 0 && i != charSequence.length() && C7569.m20684(charSequence.charAt(i))) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 == '\n') {
                    return true;
                }
                if (C7569.m20684(cCharAt2)) {
                }
            }
            return true;
        }
        if (i < 0 || i == charSequence.length() || !C7569.m20684(charSequence.charAt(i))) {
            return false;
        }
        while (i < charSequence.length() && (cCharAt = charSequence.charAt(i)) != '\n') {
            if (!C7569.m20684(cCharAt)) {
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
    public static ArrayList m42250(CharSequence charSequence) {
        EnumC21430 enumC21430M48751;
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            boolean z = (iCodePointAt >= 128 || !C7569.m20684((char) iCodePointAt)) ? !C13441.m33071(iCodePointAt) : false;
            if (z) {
                if (iCodePointAt >= 128 && !Character.isDigit(iCodePointAt)) {
                    int i4 = C18446.f60051;
                    if ((iCodePointAt >>> 16) != 0 || Character.isIdeographic(iCodePointAt) || !Character.isAlphabetic(iCodePointAt) || (enumC21430M48751 = EnumC21430.m48751(iCodePointAt)) == EnumC21430.HIRAGANA || enumC21430M48751 == EnumC21430.KATAKANA || enumC21430M48751 == EnumC21430.THAI || enumC21430M48751 == EnumC21430.JAVANESE) {
                        if (i2 != -1) {
                            arrayList.add(new C21121(i2, i, i3, charSequence));
                            i2 = -1;
                        }
                        if (z) {
                            arrayList.add(new C21121(i, i + iCharCount, iCodePointAt, charSequence));
                        } else if (iCodePointAt == 10) {
                            arrayList.add(new C3967(i));
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
                    arrayList.add(new C21121(i2, i, i3, charSequence));
                    i2 = -1;
                }
                if (z) {
                    arrayList.add(new C21121(i, i + iCharCount, iCodePointAt, charSequence));
                } else if (iCodePointAt == 10) {
                    arrayList.add(new C3967(i));
                }
            }
            i += iCharCount;
        }
        if (i2 != -1) {
            arrayList.add(new C21121(i2, length, i3, charSequence));
        }
        return arrayList;
    }
}
