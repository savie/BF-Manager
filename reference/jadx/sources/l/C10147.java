package l;

/* JADX INFO: renamed from: l.ۤ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10147 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25785(int[] iArr, int i, C7324 c7324, CharSequence charSequence, int i2) {
        int i3 = 0;
        if (i == 1 || i == 2) {
            boolean z = i == 2;
            int i4 = c7324.f24340 - i2;
            while (i3 < iArr.length) {
                if (i3 >= i4) {
                    c7324.f24346 = true;
                    return -1;
                }
                char cCharAt = charSequence.charAt(i2 + i3);
                int i5 = iArr[i3];
                if (i5 != cCharAt) {
                    if (i5 != (z ? C12123.m30171(cCharAt) : C20025.m45350(cCharAt))) {
                    }
                }
                if (c7324.m19558()) {
                    return -2;
                }
                i3++;
            }
            return i2 + iArr.length;
        }
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(C8479.m22141(i, "Unknown regex literal type: "));
        }
        int i6 = c7324.f24340;
        while (i3 < iArr.length) {
            if (i2 >= i6) {
                c7324.f24346 = true;
                return -1;
            }
            int iCodePointAt = Character.codePointAt(charSequence, i2);
            int i7 = iArr[i3];
            if (i7 != iCodePointAt) {
                if (i != 3) {
                    if (i7 != (i == 5 ? C12123.m30171(iCodePointAt) : C20025.m45350(iCodePointAt))) {
                    }
                }
            }
            i2 += Character.charCount(iCodePointAt);
            if (i2 > i6) {
                c7324.f24346 = true;
                return -1;
            }
            if (c7324.m19558()) {
                return -2;
            }
            i3++;
        }
        return i2;
        return -1;
    }
}
