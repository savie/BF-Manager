package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܳ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C14172 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f46516;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f46517;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f46518;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f46519;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C14172 f46513 = new C14172(0, 0, 1, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C14172 f46509 = new C14172(1, 1, 2, "VZCBSIFJD");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C14172 f46507 = new C14172(2, 2, 3, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C14172 f46514 = new C14172(3, 3, 4, "VZCBSIFJD");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C14172 f46512 = new C14172(4, 4, 5, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C14172 f46510 = new C14172(5, 5, 6, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C14172 f46508 = new C14172(6, 6, 7, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C14172 f46515 = new C14172(7, 7, 8, "VZCBSIFJD");

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C14172 f46511 = new C14172(8, 8, 9, "VZCBSIFJD");

    public C14172(int i, int i2, int i3, String str) {
        this.f46517 = i;
        this.f46518 = str;
        this.f46519 = i2;
        this.f46516 = i3;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C14172 m34263(String str) {
        return m34260(0, str.length(), str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14172 m34270() {
        return m34260(this.f46519 + m34271(), this.f46516, this.f46518);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C14172 m34261(String str) {
        return new C14172(str.charAt(0) == '[' ? 9 : 12, 0, str.length(), str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C14172 m34258(String str) {
        return new C14172(11, 0, str.length(), str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C14172[] m34264(String str) {
        C14172[] c14172Arr = new C14172[m34259(str)];
        int i = 0;
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            int i4 = i3 + 1;
            int iMax = str.charAt(i3) == 'L' ? Math.max(i4, str.indexOf(59, i4) + 1) : i4;
            c14172Arr[i] = m34260(i2, iMax, str);
            i2 = iMax;
            i++;
        }
        return c14172Arr;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C14172 m34265(String str) {
        return m34260(m34257(str), str.length(), str);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int m34257(String str) {
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? Math.max(i, str.indexOf(59, i) + 1) : i;
        }
        return iMax + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14172 m34260(int i, int i2, String str) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new C14172(11, i, i2, str);
        }
        if (cCharAt == 'F') {
            return f46508;
        }
        if (cCharAt == 'L') {
            return new C14172(10, i + 1, i2 - 1, str);
        }
        if (cCharAt == 'S') {
            return f46512;
        }
        if (cCharAt == 'V') {
            return f46513;
        }
        if (cCharAt == 'I') {
            return f46510;
        }
        if (cCharAt == 'J') {
            return f46515;
        }
        if (cCharAt == 'Z') {
            return f46509;
        }
        if (cCharAt == '[') {
            return new C14172(9, i, i2, str);
        }
        switch (cCharAt) {
            case 'B':
                return f46514;
            case 'C':
                return f46507;
            case 'D':
                return f46511;
            default:
                throw new IllegalArgumentException("Invalid descriptor: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m34266() {
        return this.f46518.substring(this.f46519, this.f46516);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m34268() {
        int i = this.f46516;
        int i2 = this.f46519;
        String str = this.f46518;
        int i3 = this.f46517;
        if (i3 == 10) {
            return str.substring(i2 - 1, i + 1);
        }
        return i3 == 12 ? C16523.m38890("L", str.substring(i2, i), l.b) : str.substring(i2, i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m34269() {
        int i = this.f46517;
        if (i == 12) {
            return 10;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m34271() {
        int i = 1;
        while (this.f46518.charAt(this.f46519 + i) == '[') {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34259(String str) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m34262(String str) {
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
    public final int m34267(int i) {
        int i2 = this.f46517;
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
        if (!(obj instanceof C14172)) {
            return false;
        }
        C14172 c14172 = (C14172) obj;
        int i = this.f46517;
        if (i == 12) {
            i = 10;
        }
        int i2 = c14172.f46517;
        if (i != (i2 != 12 ? i2 : 10)) {
            return false;
        }
        int i3 = c14172.f46519;
        int i4 = c14172.f46516;
        int i5 = this.f46516;
        int i6 = this.f46519;
        if (i5 - i6 != i4 - i3) {
            return false;
        }
        while (i6 < i5) {
            if (this.f46518.charAt(i6) != c14172.f46518.charAt(i3)) {
                return false;
            }
            i6++;
            i3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f46517;
        int iCharAt = (i == 12 ? 10 : i) * 13;
        if (i >= 9) {
            for (int i2 = this.f46519; i2 < this.f46516; i2++) {
                iCharAt = (this.f46518.charAt(i2) + iCharAt) * 17;
            }
        }
        return iCharAt;
    }

    public final String toString() {
        return m34268();
    }
}
