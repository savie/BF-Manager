package l;

/* JADX INFO: renamed from: l.ᩴ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 428G */
/* JADX INFO: loaded from: classes4.dex */
public final class C18620 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f60377;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17914 f60378;

    public C18620(C17914 c17914, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f60378 = c17914;
        int length = iArr.length;
        int i = 1;
        if (length > 1 && iArr[0] == 0) {
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f60377 = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.f60377 = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        this.f60377 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m43063() {
        return this.f60377;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m43066() {
        return this.f60377.length - 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m43065() {
        return this.f60377[0] == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18620 m43062(C18620 c18620) {
        C17914 c17914 = c18620.f60378;
        C17914 c17915 = this.f60378;
        if (!c17915.equals(c17914)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m43065()) {
            return c18620;
        }
        if (c18620.m43065()) {
            return this;
        }
        int[] iArr = c18620.f60377;
        int[] iArr2 = this.f60377;
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
        return new C18620(c17915, iArr3);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C18620 m43064(C18620 c18620) {
        C17914 c17914 = c18620.f60378;
        C17914 c17915 = this.f60378;
        if (!c17915.equals(c17914)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m43065() || c18620.m43065()) {
            return c17915.m41606();
        }
        int[] iArr = this.f60377;
        int length = iArr.length;
        int[] iArr2 = c18620.f60377;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = iArr3[i4] ^ c17915.m41605(i2, iArr2[i3]);
            }
        }
        return new C18620(c17915, iArr3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18620 m43061(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        C17914 c17914 = this.f60378;
        if (i2 == 0) {
            return c17914.m41606();
        }
        int[] iArr = this.f60377;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = c17914.m41605(iArr[i3], i2);
        }
        return new C18620(c17914, iArr2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18620[] m43067(C18620 c18620) {
        C17914 c17914 = c18620.f60378;
        C17914 c17915 = this.f60378;
        if (!c17915.equals(c17914)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c18620.m43065()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        C18620 c18620M41606 = c17915.m41606();
        int iM43066 = c18620.m43066();
        int[] iArr = c18620.f60377;
        int iM41604 = c17915.m41604(iArr[(iArr.length - 1) - iM43066]);
        C18620 c18620M43062 = this;
        while (c18620M43062.m43066() >= c18620.m43066() && !c18620M43062.m43065()) {
            int iM43067 = c18620M43062.m43066() - c18620.m43066();
            int iM43068 = c18620M43062.m43066();
            int[] iArr2 = c18620M43062.f60377;
            int iM41605 = c17915.m41605(iArr2[(iArr2.length - 1) - iM43068], iM41604);
            C18620 c18620M43061 = c18620.m43061(iM43067, iM41605);
            c18620M41606 = c18620M41606.m43062(c17915.m41602(iM43067, iM41605));
            c18620M43062 = c18620M43062.m43062(c18620M43061);
        }
        return new C18620[]{c18620M41606, c18620M43062};
    }

    public final String toString() {
        if (m43065()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(m43066() * 8);
        for (int iM43066 = m43066(); iM43066 >= 0; iM43066--) {
            int[] iArr = this.f60377;
            int i = iArr[(iArr.length - 1) - iM43066];
            if (i != 0) {
                if (i < 0) {
                    if (iM43066 == m43066()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM43066 == 0 || i != 1) {
                    int iM41603 = this.f60378.m41603(i);
                    if (iM41603 == 0) {
                        sb.append('1');
                    } else if (iM41603 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(iM41603);
                    }
                }
                if (iM43066 != 0) {
                    if (iM43066 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM43066);
                    }
                }
            }
        }
        return sb.toString();
    }
}
