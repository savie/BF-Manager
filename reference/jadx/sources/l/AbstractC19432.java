package l;

/* JADX INFO: renamed from: l.ᩳ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2PE */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19432 extends AbstractC18686 {
    /* JADX INFO: renamed from: ۙ */
    public abstract int mo13625(int i, int i2, String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract char[] mo13627(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m44925(int i, String str) {
        int codePoint;
        int length = str.length();
        char[] cArrM22160 = C8245.m22160();
        int i2 = 0;
        int length2 = 0;
        int iMo13625 = i;
        while (iMo13625 < length) {
            if (iMo13625 < length) {
                int i3 = iMo13625 + 1;
                char cCharAt = str.charAt(iMo13625);
                if (cCharAt >= 55296 && cCharAt <= 57343) {
                    if (cCharAt > 56319) {
                        codePoint = cCharAt;
                        codePoint = cCharAt;
                        throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + iMo13625 + " in '" + ((Object) str) + "'");
                    }
                    if (i3 == length) {
                        codePoint = -cCharAt;
                    } else {
                        char cCharAt2 = str.charAt(i3);
                        if (Character.isLowSurrogate(cCharAt2)) {
                            codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                        } else {
                            throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i3 + " in '" + ((Object) str) + "'");
                        }
                    }
                }
                if (codePoint < 0) {
                    throw new IllegalArgumentException("Trailing high surrogate at end of input");
                }
                char[] cArrMo13627 = mo13627(codePoint);
                int iCharCount = Character.charCount(codePoint) + iMo13625;
                if (cArrMo13627 != null) {
                    int i4 = iMo13625 - i2;
                    int i5 = length2 + i4;
                    int length3 = cArrMo13627.length + i5;
                    if (cArrM22160.length < length3) {
                        int i6 = (length - iMo13625) + length3 + 32;
                        if (i6 < 0) {
                            throw new AssertionError("Cannot increase internal buffer any further");
                        }
                        char[] cArr = new char[i6];
                        if (length2 > 0) {
                            System.arraycopy(cArrM22160, 0, cArr, 0, length2);
                        }
                        cArrM22160 = cArr;
                    }
                    if (i4 > 0) {
                        str.getChars(i2, iMo13625, cArrM22160, length2);
                        length2 = i5;
                    }
                    if (cArrMo13627.length > 0) {
                        System.arraycopy(cArrMo13627, 0, cArrM22160, length2, cArrMo13627.length);
                        length2 += cArrMo13627.length;
                    }
                    i2 = iCharCount;
                }
                iMo13625 = mo13625(iCharCount, length, str);
            } else {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i7 + length2;
            if (cArrM22160.length < i8) {
                if (i8 < 0) {
                    throw new AssertionError("Cannot increase internal buffer any further");
                }
                char[] cArr2 = new char[i8];
                if (length2 > 0) {
                    System.arraycopy(cArrM22160, 0, cArr2, 0, length2);
                }
                cArrM22160 = cArr2;
            }
            str.getChars(i2, length, cArrM22160, length2);
            length2 = i8;
        }
        return new String(cArrM22160, 0, length2);
    }
}
