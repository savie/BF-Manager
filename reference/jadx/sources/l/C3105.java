package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۗۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes2.dex */
public final class C3105 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f10052;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f10053;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f10054;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f10055;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C3105 f10049 = new C3105(0, 0, 1, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C3105 f10050 = new C3105(1, 1, 2, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C3105 f10046 = new C3105(2, 2, 3, "VZCBSIFJD");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C3105 f10047 = new C3105(3, 3, 4, "VZCBSIFJD");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C3105 f10048 = new C3105(4, 4, 5, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C3105 f10045 = new C3105(5, 5, 6, "VZCBSIFJD");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C3105 f10043 = new C3105(6, 6, 7, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C3105 f10051 = new C3105(7, 7, 8, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C3105 f10044 = new C3105(8, 8, 9, "VZCBSIFJD");

    public C3105(int i, int i2, int i3, String str) {
        this.f10052 = i;
        this.f10053 = str;
        this.f10054 = i2;
        this.f10055 = i3;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C3105 m10130(String str) {
        return m10129(0, str.length(), str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3105 m10139() {
        return m10129(this.f10054 + m10141(), this.f10055, this.f10053);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C3105 m10134(String str) {
        return new C3105(str.charAt(0) == '[' ? 9 : 12, 0, str.length(), str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C3105 m10136(String str) {
        return new C3105(11, 0, str.length(), str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3105[] m10135(String str) {
        C3105[] c3105Arr = new C3105[m10128(str)];
        int i = 0;
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            int i4 = i3 + 1;
            int iMax = str.charAt(i3) == 'L' ? Math.max(i4, str.indexOf(59, i4) + 1) : i4;
            if (str.charAt(i2) == '(') {
                throw new IllegalArgumentException("Invalid descriptor: ".concat(str));
            }
            c3105Arr[i] = m10129(i2, iMax, str);
            i2 = iMax;
            i++;
        }
        return c3105Arr;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C3105 m10133(String str) {
        return m10129(m10132(str), str.length(), str);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int m10132(String str) {
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? Math.max(i, str.indexOf(59, i) + 1) : i;
        }
        int i2 = iMax + 1;
        if (str.charAt(i2) != '(') {
            return i2;
        }
        throw new IllegalArgumentException("Invalid descriptor: ".concat(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3105 m10129(int i, int i2, String str) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new C3105(11, i, i2, str);
        }
        if (cCharAt == 'F') {
            return f10043;
        }
        if (cCharAt == 'L') {
            return new C3105(10, i + 1, i2 - 1, str);
        }
        if (cCharAt == 'S') {
            return f10048;
        }
        if (cCharAt == 'V') {
            return f10049;
        }
        if (cCharAt == 'I') {
            return f10045;
        }
        if (cCharAt == 'J') {
            return f10051;
        }
        if (cCharAt == 'Z') {
            return f10050;
        }
        if (cCharAt == '[') {
            return new C3105(9, i, i2, str);
        }
        switch (cCharAt) {
            case 'B':
                return f10047;
            case 'C':
                return f10046;
            case 'D':
                return f10044;
            default:
                throw new IllegalArgumentException("Invalid descriptor: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m10142() {
        return this.f10053.substring(this.f10054, this.f10055);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m10138() {
        int i = this.f10055;
        int i2 = this.f10054;
        String str = this.f10053;
        int i3 = this.f10052;
        if (i3 == 10) {
            return str.substring(i2 - 1, i + 1);
        }
        return i3 == 12 ? C14442.m34865("L", str.substring(i2, i), l.b) : str.substring(i2, i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m10140() {
        int i = this.f10052;
        if (i == 12) {
            return 10;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m10141() {
        int i = 1;
        while (this.f10053.charAt(this.f10054 + i) == '[') {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m10128(String str) {
        int i = 0;
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i2 = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? Math.max(i2, str.indexOf(59, i2) + 1) : i2;
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m10131(String str) {
        char cCharAt = str.charAt(1);
        int i = 1;
        int i2 = 1;
        while (cCharAt != ')') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                i++;
                i2 += 2;
            } else {
                while (str.charAt(i) == '[') {
                    i++;
                }
                int iMax = i + 1;
                if (str.charAt(i) == 'L') {
                    iMax = Math.max(iMax, str.indexOf(59, iMax) + 1);
                }
                i2++;
                i = iMax;
            }
            cCharAt = str.charAt(i);
        }
        char cCharAt2 = str.charAt(i + 1);
        if (cCharAt2 == 'V') {
            return i2 << 2;
        }
        return (i2 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10137(int i) {
        int i2 = this.f10052;
        if (i == 46 || i == 79) {
            switch (i2) {
                case 0:
                case 11:
                    throw new UnsupportedOperationException();
                case 1:
                case 3:
                    return i + 5;
                case 2:
                    return i + 6;
                case 4:
                    return i + 7;
                case 5:
                    return i;
                case 6:
                    return i + 2;
                case 7:
                    return i + 1;
                case 8:
                    return i + 3;
                case 9:
                case 10:
                case 12:
                    return i + 4;
                default:
                    throw new AssertionError();
            }
        }
        switch (i2) {
            case 0:
                if (i == 172) {
                    return 177;
                }
                throw new UnsupportedOperationException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return i;
            case 6:
                return i + 2;
            case 7:
                return i + 1;
            case 8:
                return i + 3;
            case 9:
            case 10:
            case 12:
                if (i == 21 || i == 54 || i == 172) {
                    return i + 4;
                }
                throw new UnsupportedOperationException();
            case 11:
                throw new UnsupportedOperationException();
            default:
                throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3105)) {
            return false;
        }
        C3105 c3105 = (C3105) obj;
        int i = this.f10052;
        if (i == 12) {
            i = 10;
        }
        int i2 = c3105.f10052;
        if (i != (i2 != 12 ? i2 : 10)) {
            return false;
        }
        int i3 = c3105.f10054;
        int i4 = c3105.f10055;
        int i5 = this.f10055;
        int i6 = this.f10054;
        if (i5 - i6 != i4 - i3) {
            return false;
        }
        while (i6 < i5) {
            if (this.f10053.charAt(i6) != c3105.f10053.charAt(i3)) {
                return false;
            }
            i6++;
            i3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f10052;
        int iCharAt = (i == 12 ? 10 : i) * 13;
        if (i >= 9) {
            for (int i2 = this.f10054; i2 < this.f10055; i2++) {
                iCharAt = (this.f10053.charAt(i2) + iCharAt) * 17;
            }
        }
        return iCharAt;
    }

    public final String toString() {
        return m10138();
    }
}
