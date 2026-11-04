package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֨֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YK */
/* JADX INFO: loaded from: classes2.dex */
public final class C0799 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f2839 = new int[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f2840;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC9747 f2841;

    public C0799(C0799 c0799) {
        this(c0799.m3193().f2840, EnumC9747.m25373(c0799.f2840, false));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0799(boolean z) {
        int[] iArr = f2839;
        this(iArr, EnumC9747.m25373(iArr, z));
    }

    public C0799(int[] iArr, EnumC9747 enumC9747) {
        this.f2840 = iArr;
        this.f2841 = enumC9747;
        int iOrdinal = enumC9747.ordinal();
        if (iOrdinal == 0) {
            this.f2840 = null;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            C11972.m30026(iArr != f2839);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m3200(int i) {
        int[] iArr = this.f2840;
        if (iArr.length < i) {
            this.f2840 = Arrays.copyOf(iArr, i);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m3197() {
        this.f2840 = null;
        this.f2841 = EnumC9747.f31436;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m3206() {
        return this.f2841 == EnumC9747.f31436;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3205(C0799 c0799) {
        this.f2840 = c0799.m3193().f2840;
        this.f2841 = EnumC9747.f31439;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0799 m3193() {
        int[] iArr;
        C11972.m30026(this.f2841 != EnumC9747.f31436);
        C0799 c0799 = new C0799(false);
        EnumC9747 enumC9747 = this.f2841;
        EnumC9747 enumC9748 = EnumC9747.f31439;
        if (enumC9747 != enumC9748) {
            iArr = this.f2840;
        } else {
            int[] iArr2 = this.f2840;
            int[] iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr = iArr3;
        }
        c0799.f2840 = iArr;
        this.f2841 = enumC9748;
        return c0799;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m3198(int i) {
        C11972.m30026(this.f2841 != EnumC9747.f31436);
        C11972.m30026(i >= 0);
        int i2 = i >>> 5;
        m3200(i2 + 1);
        int[] iArr = this.f2840;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
        this.f2841 = EnumC9747.f31439;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3195(int i, int i2) {
        C11972.m30026(this.f2841 != EnumC9747.f31436);
        m3200((i2 >>> 5) + 1);
        while (i < i2) {
            int[] iArr = this.f2840;
            int i3 = i >>> 5;
            iArr[i3] = iArr[i3] | (1 << (i & 31));
            i++;
        }
        this.f2841 = EnumC9747.f31439;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m3204(int i) {
        C11972.m30026(this.f2841 != EnumC9747.f31436);
        C0799 c0799 = new C0799(false);
        c0799.m3200(this.f2840.length);
        c0799.m3195(0, i);
        m3207(c0799);
        this.f2841 = EnumC9747.f31439;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3194(int i) {
        C11972.m30026(this.f2841 != EnumC9747.f31436);
        C11972.m30026(i >= 0);
        int i2 = i >>> 5;
        m3200(i2 + 1);
        int[] iArr = this.f2840;
        iArr[i2] = (~(1 << (i & 31))) & iArr[i2];
        this.f2841 = EnumC9747.f31439;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m3208(int i) {
        C11972.m30026(this.f2841 != EnumC9747.f31436);
        if (i >= 0) {
            int[] iArr = this.f2840;
            if (i < (iArr.length << 5)) {
                if (((1 << (i & 31)) & iArr[i >>> 5]) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3196(C0799 c0799) {
        C11972.m30026(this.f2841 != EnumC9747.f31436);
        m3207(c0799);
        this.f2841 = EnumC9747.f31439;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m3207(C0799 c0799) {
        int i = 0;
        C11972.m30026(this.f2841 != EnumC9747.f31436);
        m3200(c0799.f2840.length);
        while (true) {
            int[] iArr = c0799.f2840;
            if (i >= iArr.length) {
                return;
            }
            int[] iArr2 = this.f2840;
            iArr2[i] = iArr[i] & iArr2[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m3203(C0799 c0799) {
        int i = 0;
        C11972.m30026(this.f2841 != EnumC9747.f31436);
        m3200(c0799.f2840.length);
        while (true) {
            int[] iArr = c0799.f2840;
            if (i < iArr.length) {
                int[] iArr2 = this.f2840;
                iArr2[i] = iArr[i] | iArr2[i];
                i++;
            } else {
                this.f2841 = EnumC9747.f31439;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m3199(C0799 c0799) {
        int i = 0;
        C11972.m30026(this.f2841 != EnumC9747.f31436);
        while (true) {
            int[] iArr = this.f2840;
            if (i < iArr.length) {
                int[] iArr2 = c0799.f2840;
                if (i < iArr2.length) {
                    iArr[i] = (~iArr2[i]) & iArr[i];
                }
                i++;
            } else {
                this.f2841 = EnumC9747.f31439;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m3201(C0799 c0799) {
        int i = 0;
        C11972.m30026(this.f2841 != EnumC9747.f31436);
        m3200(c0799.f2840.length);
        while (true) {
            int[] iArr = c0799.f2840;
            if (i < iArr.length) {
                int[] iArr2 = this.f2840;
                iArr2[i] = iArr[i] ^ iArr2[i];
                i++;
            } else {
                this.f2841 = EnumC9747.f31439;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m3202(int i) {
        int i2;
        int i3;
        C11972.m30026(this.f2841 != EnumC9747.f31436);
        int i4 = i >>> 5;
        int[] iArr = this.f2840;
        if (i4 >= iArr.length) {
            return -1;
        }
        int i5 = (~((1 << (i & 31)) - 1)) & iArr[i4];
        while (i5 == 0) {
            i4++;
            int[] iArr2 = this.f2840;
            if (i4 >= iArr2.length) {
                return -1;
            }
            i5 = iArr2[i4];
        }
        int i6 = i4 << 5;
        if (i5 == 0) {
            i3 = 32;
        } else {
            if ((65535 & i5) == 0) {
                i5 >>>= 16;
                i2 = 17;
            } else {
                i2 = 1;
            }
            if ((i5 & 255) == 0) {
                i2 += 8;
                i5 >>>= 8;
            }
            if ((i5 & 15) == 0) {
                i2 += 4;
                i5 >>>= 4;
            }
            if ((i5 & 3) == 0) {
                i2 += 2;
                i5 >>>= 2;
            }
            i3 = i2 - (i5 & 1);
        }
        return i6 + i3;
    }

    public final String toString() {
        int[] iArr = this.f2840;
        if (iArr == null || iArr.length <= 0) {
            return "[]";
        }
        char[] cArr = new char[iArr.length * 32];
        for (int i = 0; i < this.f2840.length * 32; i++) {
            cArr[i] = m3208(i) ? '1' : '0';
        }
        return new String(cArr);
    }
}
