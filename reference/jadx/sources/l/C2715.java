package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۖᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6QR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2715 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10451;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f10452;

    public C2715(String str, int i) {
        this.f10452 = str;
        this.f10451 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8273(int i) {
        if ((this.f10451 & 4) == 0) {
            return i;
        }
        String str = this.f10452;
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (!C20025.m45352(cCharAt, 2048)) {
                if (cCharAt != '#') {
                    break;
                }
                do {
                    i++;
                    if (i >= length || str.charAt(i) == 0) {
                        break;
                    }
                } while (!C4126.m11734(str.charAt(i), this.f10451));
            } else {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8274(int i, BitSet bitSet, int[] iArr) {
        int iM8273;
        String str = this.f10452;
        int length = str.length();
        int i2 = i + 1;
        if (i2 == length) {
            return i2;
        }
        int iCodePointAt = str.codePointAt(i2);
        int iCharCount = Character.charCount(iCodePointAt) + i2;
        if (iCodePointAt == 99) {
            int iM8274 = m8273(iCharCount);
            if (iM8274 >= length) {
                return iM8274;
            }
            bitSet.set(iArr[iM8274]);
            return Character.charCount(str.codePointAt(iM8274)) + iM8274;
        }
        if (iCodePointAt == 117) {
            for (int i3 = 0; i3 < 4 && iCharCount < length; i3++) {
                int iM8275 = m8273(iCharCount);
                if (iM8275 < length) {
                    iM8275++;
                }
                iCharCount = iM8275;
            }
            return iCharCount;
        }
        int i4 = 2;
        if (iCodePointAt != 120 && iCodePointAt != 112 && iCodePointAt != 80 && iCodePointAt != 78) {
            if (iCodePointAt == 48) {
                int iM8276 = m8273(iCharCount);
                if (iM8276 < length && str.charAt(iM8276) <= '3') {
                    i4 = 3;
                }
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0 || (iM8273 = m8273(iCharCount)) == length || str.charAt(iM8273) < '0' || str.charAt(iM8273) > '7') {
                        break;
                    }
                    iCharCount = iM8273 + 1;
                    i4 = i5;
                }
            }
            return iCharCount;
        }
        int iM8277 = m8273(iCharCount);
        if (iM8277 < length && str.charAt(iM8277) == '{') {
            do {
                iM8277 = m8273(iM8277 + 1);
                if (iM8277 >= length) {
                    break;
                }
            } while (str.charAt(iM8277) != '}');
            return iM8277 < length ? iM8277 + 1 : iM8277;
        }
        int i6 = iCodePointAt == 120 ? 2 : 1;
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0 || iM8277 >= length) {
                break;
            }
            iM8277 = m8273(iM8277);
            if (iM8277 < length) {
                iM8277 += Character.charCount(str.codePointAt(iM8277));
            }
            i6 = i7;
        }
        return iM8277;
    }
}
