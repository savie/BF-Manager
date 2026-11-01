package l;

/* JADX INFO: renamed from: l.᩻ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y2PE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23762 extends AbstractC17411 {
    /* JADX INFO: renamed from: ۙ */
    public abstract int mo1134(int i, int i2, String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract char[] mo1136(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m52313(int i, String str) {
        int codePoint;
        int length = str.length();
        char[] cArrM27881 = C11062.m27881();
        int i2 = 0;
        int length2 = 0;
        int iMo1134 = i;
        while (iMo1134 < length) {
            if (iMo1134 < length) {
                int i3 = iMo1134 + 1;
                char cCharAt = str.charAt(iMo1134);
                if (cCharAt >= 55296 && cCharAt <= 57343) {
                    if (cCharAt > 56319) {
                        codePoint = cCharAt;
                        codePoint = cCharAt;
                        throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + iMo1134 + " in '" + ((Object) str) + "'");
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
                char[] cArrMo1136 = mo1136(codePoint);
                int i4 = (Character.isSupplementaryCodePoint(codePoint) ? 2 : 1) + iMo1134;
                if (cArrMo1136 != null) {
                    int i5 = iMo1134 - i2;
                    int i6 = length2 + i5;
                    int length3 = cArrMo1136.length + i6;
                    if (cArrM27881.length < length3) {
                        int i7 = (length - iMo1134) + length3 + 32;
                        if (i7 < 0) {
                            throw new AssertionError("Cannot increase internal buffer any further");
                        }
                        char[] cArr = new char[i7];
                        if (length2 > 0) {
                            System.arraycopy(cArrM27881, 0, cArr, 0, length2);
                        }
                        cArrM27881 = cArr;
                    }
                    if (i5 > 0) {
                        str.getChars(i2, iMo1134, cArrM27881, length2);
                        length2 = i6;
                    }
                    if (cArrMo1136.length > 0) {
                        System.arraycopy(cArrMo1136, 0, cArrM27881, length2, cArrMo1136.length);
                        length2 += cArrMo1136.length;
                    }
                    i2 = i4;
                }
                iMo1134 = mo1134(i4, length, str);
            } else {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
        }
        int i8 = length - i2;
        if (i8 > 0) {
            int i9 = i8 + length2;
            if (cArrM27881.length < i9) {
                if (i9 < 0) {
                    throw new AssertionError("Cannot increase internal buffer any further");
                }
                char[] cArr2 = new char[i9];
                if (length2 > 0) {
                    System.arraycopy(cArrM27881, 0, cArr2, 0, length2);
                }
                cArrM27881 = cArr2;
            }
            str.getChars(i2, length, cArrM27881, length2);
            length2 = i9;
        }
        return new String(cArrM27881, 0, length2);
    }
}
