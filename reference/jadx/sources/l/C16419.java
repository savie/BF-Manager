package l;

/* JADX INFO: renamed from: l.ܶ᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16419 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38983(int[] iArr, int i, C23879 c23879, CharSequence charSequence, int i2) {
        int i3 = 0;
        if (i == 1 || i == 2) {
            boolean z = i == 2;
            int i4 = c23879.f77326 - i2;
            while (i3 < iArr.length) {
                if (i3 >= i4) {
                    c23879.f77334 = true;
                    return -1;
                }
                char cCharAt = charSequence.charAt(i2 + i3);
                int i5 = iArr[i3];
                if (i5 != cCharAt) {
                    if (i5 != (z ? C17933.m41869(cCharAt) : C12690.m31488(cCharAt))) {
                    }
                }
                if (c23879.m53350()) {
                    return -2;
                }
                i3++;
            }
            return i2 + iArr.length;
        }
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(C13645.m33382(i, "Unknown regex literal type: "));
        }
        int i6 = c23879.f77326;
        while (i3 < iArr.length) {
            if (i2 >= i6) {
                c23879.f77334 = true;
                return -1;
            }
            int iCodePointAt = Character.codePointAt(charSequence, i2);
            int i7 = iArr[i3];
            if (i7 != iCodePointAt) {
                if (i != 3) {
                    if (i7 != (i == 5 ? C17933.m41869(iCodePointAt) : C12690.m31488(iCodePointAt))) {
                    }
                }
            }
            i2 += Character.charCount(iCodePointAt);
            if (i2 > i6) {
                c23879.f77334 = true;
                return -1;
            }
            if (c23879.m53350()) {
                return -2;
            }
            i3++;
        }
        return i2;
        return -1;
    }
}
