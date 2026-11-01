package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۟ۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YK */
/* JADX INFO: loaded from: classes3.dex */
public final class C7403 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int[] f24595 = new int[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f24596;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC10226 f24597;

    public C7403(C7403 c7403) {
        this(c7403.m19736().f24596, EnumC10226.m26007(c7403.f24596, false));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7403(boolean z) {
        int[] iArr = f24595;
        this(iArr, EnumC10226.m26007(iArr, z));
    }

    public C7403(int[] iArr, EnumC10226 enumC10226) {
        this.f24596 = iArr;
        this.f24597 = enumC10226;
        int iOrdinal = enumC10226.ordinal();
        if (iOrdinal == 0) {
            this.f24596 = null;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            C6171.m17176(iArr != f24595);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m19748(int i) {
        int[] iArr = this.f24596;
        if (iArr.length < i) {
            this.f24596 = Arrays.copyOf(iArr, i);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19742() {
        this.f24596 = null;
        this.f24597 = EnumC10226.f34904;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m19747() {
        return this.f24597 == EnumC10226.f34904;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19746(C7403 c7403) {
        this.f24596 = c7403.m19736().f24596;
        this.f24597 = EnumC10226.f34905;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7403 m19736() {
        int[] iArr;
        C6171.m17176(this.f24597 != EnumC10226.f34904);
        C7403 c7403 = new C7403(false);
        EnumC10226 enumC10226 = this.f24597;
        EnumC10226 enumC10227 = EnumC10226.f34905;
        if (enumC10226 != enumC10227) {
            iArr = this.f24596;
        } else {
            int[] iArr2 = this.f24596;
            int[] iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr = iArr3;
        }
        c7403.f24596 = iArr;
        this.f24597 = enumC10227;
        return c7403;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19743(int i) {
        C6171.m17176(this.f24597 != EnumC10226.f34904);
        C6171.m17176(i >= 0);
        int i2 = i >>> 5;
        m19748(i2 + 1);
        int[] iArr = this.f24596;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
        this.f24597 = EnumC10226.f34905;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19738(int i, int i2) {
        C6171.m17176(this.f24597 != EnumC10226.f34904);
        m19748((i2 >>> 5) + 1);
        while (i < i2) {
            int[] iArr = this.f24596;
            int i3 = i >>> 5;
            iArr[i3] = iArr[i3] | (1 << (i & 31));
            i++;
        }
        this.f24597 = EnumC10226.f34905;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19745(int i) {
        C6171.m17176(this.f24597 != EnumC10226.f34904);
        C7403 c7403 = new C7403(false);
        c7403.m19748(this.f24596.length);
        c7403.m19738(0, i);
        m19734(c7403);
        this.f24597 = EnumC10226.f34905;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19737(int i) {
        C6171.m17176(this.f24597 != EnumC10226.f34904);
        C6171.m17176(i >= 0);
        int i2 = i >>> 5;
        m19748(i2 + 1);
        int[] iArr = this.f24596;
        iArr[i2] = (~(1 << (i & 31))) & iArr[i2];
        this.f24597 = EnumC10226.f34905;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m19735(int i) {
        C6171.m17176(this.f24597 != EnumC10226.f34904);
        if (i >= 0) {
            int[] iArr = this.f24596;
            if (i < (iArr.length << 5)) {
                if (((1 << (i & 31)) & iArr[i >>> 5]) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19739(C7403 c7403) {
        C6171.m17176(this.f24597 != EnumC10226.f34904);
        m19734(c7403);
        this.f24597 = EnumC10226.f34905;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m19734(C7403 c7403) {
        int i = 0;
        C6171.m17176(this.f24597 != EnumC10226.f34904);
        m19748(c7403.f24596.length);
        while (true) {
            int[] iArr = c7403.f24596;
            if (i >= iArr.length) {
                return;
            }
            int[] iArr2 = this.f24596;
            iArr2[i] = iArr[i] & iArr2[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m19741(C7403 c7403) {
        int i = 0;
        C6171.m17176(this.f24597 != EnumC10226.f34904);
        m19748(c7403.f24596.length);
        while (true) {
            int[] iArr = c7403.f24596;
            if (i < iArr.length) {
                int[] iArr2 = this.f24596;
                iArr2[i] = iArr[i] | iArr2[i];
                i++;
            } else {
                this.f24597 = EnumC10226.f34905;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19744(C7403 c7403) {
        int i = 0;
        C6171.m17176(this.f24597 != EnumC10226.f34904);
        while (true) {
            int[] iArr = this.f24596;
            if (i < iArr.length) {
                int[] iArr2 = c7403.f24596;
                if (i < iArr2.length) {
                    iArr[i] = (~iArr2[i]) & iArr[i];
                }
                i++;
            } else {
                this.f24597 = EnumC10226.f34905;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m19749(C7403 c7403) {
        int i = 0;
        C6171.m17176(this.f24597 != EnumC10226.f34904);
        m19748(c7403.f24596.length);
        while (true) {
            int[] iArr = c7403.f24596;
            if (i < iArr.length) {
                int[] iArr2 = this.f24596;
                iArr2[i] = iArr[i] ^ iArr2[i];
                i++;
            } else {
                this.f24597 = EnumC10226.f34905;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m19740(int i) {
        int i2;
        int i3;
        C6171.m17176(this.f24597 != EnumC10226.f34904);
        int i4 = i >>> 5;
        int[] iArr = this.f24596;
        if (i4 >= iArr.length) {
            return -1;
        }
        int i5 = (~((1 << (i & 31)) - 1)) & iArr[i4];
        while (i5 == 0) {
            i4++;
            int[] iArr2 = this.f24596;
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
        int[] iArr = this.f24596;
        if (iArr == null || iArr.length <= 0) {
            return "[]";
        }
        char[] cArr = new char[iArr.length * 32];
        for (int i = 0; i < this.f24596.length * 32; i++) {
            cArr[i] = m19735(i) ? '1' : '0';
        }
        return new String(cArr);
    }
}
