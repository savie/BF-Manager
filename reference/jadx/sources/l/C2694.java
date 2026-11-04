package l;

/* JADX INFO: renamed from: l.ۖ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 428G */
/* JADX INFO: loaded from: classes2.dex */
public final class C2694 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f8571;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9405 f8572;

    public C2694(C9405 c9405, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f8572 = c9405;
        int length = iArr.length;
        int i = 1;
        if (length > 1 && iArr[0] == 0) {
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f8571 = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.f8571 = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        this.f8571 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m8859() {
        return this.f8571;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m8862() {
        return this.f8571.length - 1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m8861() {
        return this.f8571[0] == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2694 m8858(C2694 c2694) {
        C9405 c9405 = c2694.f8572;
        C9405 c9406 = this.f8572;
        if (!c9406.equals(c9405)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m8861()) {
            return c2694;
        }
        if (c2694.m8861()) {
            return this;
        }
        int[] iArr = c2694.f8571;
        int[] iArr2 = this.f8571;
        if (iArr2.length > iArr.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new C2694(c9406, iArr3);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2694 m8860(C2694 c2694) {
        C9405 c9405 = c2694.f8572;
        C9405 c9406 = this.f8572;
        if (!c9406.equals(c9405)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m8861() || c2694.m8861()) {
            return c9406.m24757();
        }
        int[] iArr = this.f8571;
        int length = iArr.length;
        int[] iArr2 = c2694.f8571;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = iArr3[i4] ^ c9406.m24756(i2, iArr2[i3]);
            }
        }
        return new C2694(c9406, iArr3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2694 m8857(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        C9405 c9405 = this.f8572;
        if (i2 == 0) {
            return c9405.m24757();
        }
        int[] iArr = this.f8571;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = c9405.m24756(iArr[i3], i2);
        }
        return new C2694(c9405, iArr2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2694[] m8863(C2694 c2694) {
        C9405 c9405 = c2694.f8572;
        C9405 c9406 = this.f8572;
        if (!c9406.equals(c9405)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c2694.m8861()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        C2694 c2694M24757 = c9406.m24757();
        int iM8862 = c2694.m8862();
        int[] iArr = c2694.f8571;
        int iM24755 = c9406.m24755(iArr[(iArr.length - 1) - iM8862]);
        C2694 c2694M8858 = this;
        while (c2694M8858.m8862() >= c2694.m8862() && !c2694M8858.m8861()) {
            int iM8863 = c2694M8858.m8862() - c2694.m8862();
            int iM8864 = c2694M8858.m8862();
            int[] iArr2 = c2694M8858.f8571;
            int iM24756 = c9406.m24756(iArr2[(iArr2.length - 1) - iM8864], iM24755);
            C2694 c2694M8857 = c2694.m8857(iM8863, iM24756);
            c2694M24757 = c2694M24757.m8858(c9406.m24753(iM8863, iM24756));
            c2694M8858 = c2694M8858.m8858(c2694M8857);
        }
        return new C2694[]{c2694M24757, c2694M8858};
    }

    public final String toString() {
        if (m8861()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(m8862() * 8);
        for (int iM8862 = m8862(); iM8862 >= 0; iM8862--) {
            int[] iArr = this.f8571;
            int i = iArr[(iArr.length - 1) - iM8862];
            if (i != 0) {
                if (i < 0) {
                    if (iM8862 == m8862()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM8862 == 0 || i != 1) {
                    int iM24754 = this.f8572.m24754(i);
                    if (iM24754 == 0) {
                        sb.append('1');
                    } else if (iM24754 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(iM24754);
                    }
                }
                if (iM8862 != 0) {
                    if (iM8862 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM8862);
                    }
                }
            }
        }
        return sb.toString();
    }
}
