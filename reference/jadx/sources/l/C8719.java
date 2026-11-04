package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.۠ܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6QR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8719 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28388;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f28389;

    public C8719(String str, int i) {
        this.f28389 = str;
        this.f28388 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23407(int i) {
        if ((this.f28388 & 4) == 0) {
            return i;
        }
        String str = this.f28389;
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (!C12690.m31485(cCharAt, 2048)) {
                if (cCharAt != '#') {
                    break;
                }
                do {
                    i++;
                    if (i >= length || str.charAt(i) == 0) {
                        break;
                    }
                } while (!C11176.m28165(str.charAt(i), this.f28388));
            } else {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23408(int i, BitSet bitSet, int[] iArr) {
        int iM23407;
        String str = this.f28389;
        int length = str.length();
        int i2 = i + 1;
        if (i2 == length) {
            return i2;
        }
        int iCodePointAt = str.codePointAt(i2);
        int iCharCount = Character.charCount(iCodePointAt) + i2;
        if (iCodePointAt == 99) {
            int iM23408 = m23407(iCharCount);
            if (iM23408 >= length) {
                return iM23408;
            }
            bitSet.set(iArr[iM23408]);
            return Character.charCount(str.codePointAt(iM23408)) + iM23408;
        }
        if (iCodePointAt == 117) {
            for (int i3 = 0; i3 < 4 && iCharCount < length; i3++) {
                int iM23409 = m23407(iCharCount);
                if (iM23409 < length) {
                    iM23409++;
                }
                iCharCount = iM23409;
            }
            return iCharCount;
        }
        int i4 = 2;
        if (iCodePointAt != 120 && iCodePointAt != 112 && iCodePointAt != 80 && iCodePointAt != 78) {
            if (iCodePointAt == 48) {
                int iM234010 = m23407(iCharCount);
                if (iM234010 < length && str.charAt(iM234010) <= '3') {
                    i4 = 3;
                }
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0 || (iM23407 = m23407(iCharCount)) == length || str.charAt(iM23407) < '0' || str.charAt(iM23407) > '7') {
                        break;
                    }
                    iCharCount = iM23407 + 1;
                    i4 = i5;
                }
            }
            return iCharCount;
        }
        int iM234011 = m23407(iCharCount);
        if (iM234011 < length && str.charAt(iM234011) == '{') {
            do {
                iM234011 = m23407(iM234011 + 1);
                if (iM234011 >= length) {
                    break;
                }
            } while (str.charAt(iM234011) != '}');
            return iM234011 < length ? iM234011 + 1 : iM234011;
        }
        int i6 = iCodePointAt == 120 ? 2 : 1;
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0 || iM234011 >= length) {
                break;
            }
            iM234011 = m23407(iM234011);
            if (iM234011 < length) {
                iM234011 += Character.charCount(str.codePointAt(iM234011));
            }
            i6 = i7;
        }
        return iM234011;
    }
}
