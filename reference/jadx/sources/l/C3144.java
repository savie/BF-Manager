package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3144 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C3144 f11858;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f11859;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f11860;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f11861;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f11862;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long[] f11863;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Object[] f11864;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f11865;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long[] f11866;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public char[] f11867;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f11868;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public char[] f11869;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3144 f11870;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f11871;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f11872;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f11873;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11874;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int[] f11875;

    public C3144(int i) {
        this(i, true);
    }

    public C3144(int i, boolean z) {
        this.f11859 = 1;
        int iMax = Math.max(8, i);
        Object[] objArr = new Object[(iMax + 63) >>> 6];
        this.f11864 = objArr;
        this.f11871 = new int[objArr.length];
        if (z) {
            this.f11867 = new char[iMax];
        } else {
            this.f11865 = new int[iMax];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9529() {
        char[] cArr = this.f11867;
        return cArr != null ? cArr.length : this.f11865.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9531(int i) {
        int iM9529 = m9529();
        if (i <= iM9529) {
            return;
        }
        int iMin = Math.min(1024, Math.max(i, iM9529 * 2));
        int i2 = (iMin + 63) >>> 6;
        this.f11864 = Arrays.copyOf(this.f11864, i2);
        this.f11871 = Arrays.copyOf(this.f11871, i2);
        int i3 = iM9529 >>> 6;
        if ((iM9529 & 63) != 0 && this.f11864[i3] != null) {
            int iMin2 = Math.min(64, iMin - (i3 << 6));
            Object[] objArr = this.f11864;
            Object obj = objArr[i3];
            objArr[i3] = obj instanceof char[] ? Arrays.copyOf((char[]) obj, iMin2) : Arrays.copyOf((int[]) obj, iMin2);
        }
        char[] cArr = this.f11867;
        if (cArr != null) {
            this.f11867 = Arrays.copyOf(cArr, iMin);
        } else {
            this.f11865 = Arrays.copyOf(this.f11865, iMin);
        }
        int[] iArr = this.f11875;
        if (iArr != null) {
            this.f11875 = Arrays.copyOf(iArr, iMin);
        }
        long[] jArr = this.f11863;
        if (jArr != null) {
            this.f11863 = Arrays.copyOf(jArr, i2);
            this.f11869 = Arrays.copyOf(this.f11869, i2);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m9528(int i) {
        int i2 = i >>> 6;
        int i3 = i & 63;
        Object obj = this.f11864[i2];
        return this.f11871[i2] + (obj instanceof char[] ? ((char[]) obj)[i3] : ((int[]) obj)[i3]);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m9525(int i, int i2) {
        int i3 = i >>> 6;
        int i4 = i & 63;
        Object[] objArr = this.f11864;
        Object obj = objArr[i3];
        if (obj == null) {
            obj = new char[Math.min(64, m9529() - (i3 << 6))];
            objArr[i3] = obj;
            this.f11871[i3] = i2;
        }
        long j = ((long) i2) - ((long) this.f11871[i3]);
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            if (j >= 0 && j <= 65535) {
                cArr[i4] = (char) j;
                return;
            }
            int[] iArr = new int[cArr.length];
            for (int i5 = 0; i5 < cArr.length; i5++) {
                iArr[i5] = cArr[i5];
            }
            this.f11864[i3] = iArr;
            obj = iArr;
        }
        ((int[]) obj)[i4] = (int) j;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m9536(int i) {
        int[] iArr = this.f11875;
        if (iArr != null) {
            return iArr[i];
        }
        long[] jArr = this.f11863;
        if (jArr == null) {
            return i * this.f11873;
        }
        int i2 = i >>> 6;
        return Long.bitCount(((-1) >>> (63 - (i & 63))) & jArr[i2]) + this.f11869[i2];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m9539(int i) {
        long[] jArr = this.f11866;
        return (jArr == null || (jArr[i >>> 6] & (1 << i)) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9534(int i, boolean z) {
        if (z) {
            if (this.f11866 == null) {
                this.f11866 = new long[16];
            }
            long[] jArr = this.f11866;
            int i2 = i >>> 6;
            jArr[i2] = (1 << i) | jArr[i2];
            return;
        }
        long[] jArr2 = this.f11866;
        if (jArr2 != null) {
            int i3 = i >>> 6;
            jArr2[i3] = (~(1 << i)) & jArr2[i3];
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m9537(int i, C14435 c14435) {
        int i2;
        int iM9536;
        m9525(i, c14435.f47316 - this.f11861);
        int i3 = c14435.f47317 - c14435.f47316;
        int i4 = 0;
        if (this.f11867 != null && ((-65536) & i3) != 0) {
            this.f11865 = new int[m9529()];
            for (int i5 = 0; i5 < this.f11872; i5++) {
                this.f11865[i5] = this.f11867[i5];
            }
            this.f11867 = null;
        }
        char[] cArr = this.f11867;
        if (cArr != null) {
            cArr[i] = (char) i3;
        } else {
            this.f11865[i] = i3;
        }
        int i6 = c14435.f47319;
        int i7 = this.f11872;
        if (i7 == 0) {
            this.f11860 = i6;
        }
        if (this.f11875 != null || ((i >= i7 && this.f11863 != null) || i6 != this.f11860 + m9536(i))) {
            if (this.f11875 == null && i == (i2 = this.f11872) && i2 > 0 && ((iM9536 = i6 - (this.f11860 + m9536(i2 - 1))) == 0 || iM9536 == 1)) {
                long[] jArr = this.f11863;
                if (jArr == null && this.f11872 == 1) {
                    this.f11873 = iM9536;
                } else {
                    if (jArr == null) {
                        Object[] objArr = this.f11864;
                        this.f11863 = new long[objArr.length];
                        this.f11869 = new char[objArr.length];
                        for (int i8 = 1; i8 < this.f11872; i8++) {
                            if (this.f11873 == 1) {
                                long[] jArr2 = this.f11863;
                                int i9 = i8 >>> 6;
                                jArr2[i9] = jArr2[i9] | (1 << i8);
                            }
                        }
                        int iBitCount = 0;
                        while (true) {
                            long[] jArr3 = this.f11863;
                            if (i4 >= jArr3.length) {
                                break;
                            }
                            this.f11869[i4] = (char) iBitCount;
                            iBitCount += Long.bitCount(jArr3[i4]);
                            i4++;
                        }
                    }
                    int i10 = i >>> 6;
                    if ((i & 63) == 0 && i10 > 0) {
                        char[] cArr2 = this.f11869;
                        int i11 = i10 - 1;
                        cArr2[i10] = (char) (Long.bitCount(this.f11863[i11]) + cArr2[i11]);
                    }
                    if (iM9536 == 1) {
                        long[] jArr4 = this.f11863;
                        jArr4[i10] = jArr4[i10] | (1 << i);
                    } else {
                        long[] jArr5 = this.f11863;
                        jArr5[i10] = jArr5[i10] & (~(1 << i));
                    }
                }
            } else {
                m9523();
                this.f11875[i] = i6 - this.f11860;
            }
        }
        m9534(i, c14435.m34706());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9538(int i, C14435 c14435) {
        int iM9528 = m9528(i) + this.f11861;
        char[] cArr = this.f11867;
        c14435.m34709(iM9528, (cArr != null ? cArr[i] : this.f11865[i]) + iM9528, m9536(i) + this.f11860);
        c14435.m34711(m9539(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9535(C14435 c14435) {
        m9531(this.f11872 + 1);
        m9537(this.f11872, c14435);
        int i = this.f11872 + 1;
        this.f11872 = i;
        this.f11868 = i;
        if (i == 1024) {
            m9526();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9533(int i, C14435 c14435) {
        int i2 = this.f11872;
        if (i == i2) {
            m9535(c14435);
            return;
        }
        m9531(i2 + 1);
        if (this.f11875 == null && (this.f11863 != null || this.f11873 != 0 || c14435.f47319 != this.f11860)) {
            m9523();
        }
        for (int i3 = this.f11872; i3 > i; i3--) {
            m9525(i3, m9528(i3 - 1));
        }
        char[] cArr = this.f11867;
        if (cArr != null) {
            System.arraycopy(cArr, i, cArr, i + 1, this.f11872 - i);
        } else {
            int[] iArr = this.f11865;
            System.arraycopy(iArr, i, iArr, i + 1, this.f11872 - i);
        }
        int[] iArr2 = this.f11875;
        if (iArr2 != null) {
            System.arraycopy(iArr2, i, iArr2, i + 1, this.f11872 - i);
        }
        for (int i4 = this.f11872; i4 > i; i4--) {
            m9534(i4, m9539(i4 - 1));
        }
        this.f11872++;
        m9537(i, c14435);
        m9521();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9532(int i, int i2, int i3, int i4) {
        if (i >= i2) {
            return;
        }
        if (i == 0 && i2 == this.f11872) {
            this.f11861 += i3;
            this.f11860 += i4;
            return;
        }
        if (i3 != 0) {
            for (int i5 = i >>> 6; i5 <= ((i2 - 1) >>> 6); i5++) {
                int i6 = i5 << 6;
                int iMin = Math.min(this.f11872, i6 + 64);
                if (i <= i6 && i2 >= iMin) {
                    int[] iArr = this.f11871;
                    iArr[i5] = iArr[i5] + i3;
                } else {
                    for (int iMax = Math.max(i, i6); iMax < Math.min(i2, iMin); iMax++) {
                        m9525(iMax, m9528(iMax) + i3);
                    }
                    m9527(i5, iMin - i6);
                }
            }
        }
        if (i4 != 0) {
            m9523();
            while (i < i2) {
                int[] iArr2 = this.f11875;
                iArr2[i] = iArr2[i] + i4;
                i++;
            }
            m9524();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m9523() {
        if (this.f11875 != null) {
            return;
        }
        int[] iArr = new int[m9529()];
        for (int i = 0; i < this.f11872; i++) {
            iArr[i] = m9536(i);
        }
        this.f11875 = iArr;
        this.f11863 = null;
        this.f11869 = null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m9524() {
        int[] iArr = this.f11875;
        if (iArr == null || this.f11872 == 0) {
            return;
        }
        int i = 0;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int i5 = this.f11872;
            if (i3 < i5) {
                int[] iArr2 = this.f11875;
                int i6 = iArr2[i3] - iArr2[i3 - 1];
                if (i6 != 0 && i6 != 1) {
                    return;
                }
                i4 += i6;
                i3++;
            } else {
                if (i4 != 0 && i4 != i5 - 1) {
                    Object[] objArr = this.f11864;
                    this.f11863 = new long[objArr.length];
                    this.f11869 = new char[objArr.length];
                    for (int i7 = 1; i7 < this.f11872; i7++) {
                        int[] iArr3 = this.f11875;
                        if (iArr3[i7] != iArr3[i7 - 1]) {
                            long[] jArr = this.f11863;
                            int i8 = i7 >>> 6;
                            jArr[i8] = jArr[i8] | (1 << i7);
                        }
                    }
                    int iBitCount = 0;
                    while (true) {
                        long[] jArr2 = this.f11863;
                        if (i >= jArr2.length) {
                            break;
                        }
                        this.f11869[i] = (char) iBitCount;
                        iBitCount += Long.bitCount(jArr2[i]);
                        i++;
                    }
                } else {
                    this.f11873 = i4 != 0 ? 1 : 0;
                }
                this.f11860 += i2;
                this.f11875 = null;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m9521() {
        for (int i = 0; i < this.f11864.length; i++) {
            int iMin = Math.min(64, this.f11872 - (i << 6));
            if (iMin <= 0) {
                this.f11864[i] = null;
            } else {
                m9527(i, iMin);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m9527(int i, int i2) {
        Object obj = this.f11864[i];
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int iMax = iArr[0];
            int iMin = iMax;
            for (int i3 = 1; i3 < i2; i3++) {
                iMin = Math.min(iMin, iArr[i3]);
                iMax = Math.max(iMax, iArr[i3]);
            }
            if (((long) iMax) - ((long) iMin) > 65535) {
                return;
            }
            char[] cArr = new char[iArr.length];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = (char) (iArr[i4] - iMin);
            }
            int[] iArr2 = this.f11871;
            iArr2[i] = iArr2[i] + iMin;
            this.f11864[i] = cArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m9526() {
        m9521();
        m9524();
        if (this.f11865 == null) {
            return;
        }
        for (int i = 0; i < this.f11872; i++) {
            if ((this.f11865[i] & (-65536)) != 0) {
                return;
            }
        }
        this.f11867 = new char[m9529()];
        for (int i2 = 0; i2 < this.f11872; i2++) {
            this.f11867[i2] = (char) this.f11865[i2];
        }
        this.f11865 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3144 m9530(int i, int i2) {
        int i3 = i2 - i;
        C3144 c3144 = new C3144(i3, this.f11867 != null);
        c3144.f11868 = i3;
        c3144.f11872 = i3;
        c3144.f11861 = this.f11861;
        c3144.f11860 = this.f11860;
        c3144.f11873 = this.f11873;
        if (i == 0 && i2 == this.f11872) {
            int[] iArr = this.f11871;
            int[] iArr2 = c3144.f11871;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            for (int i4 = 0; i4 < c3144.f11864.length; i4++) {
                int iMin = Math.min(64, c3144.m9529() - (i4 << 6));
                Object obj = this.f11864[i4];
                c3144.f11864[i4] = obj instanceof char[] ? Arrays.copyOf((char[]) obj, iMin) : Arrays.copyOf((int[]) obj, iMin);
            }
        } else {
            for (int i5 = 0; i5 < c3144.f11872; i5++) {
                c3144.m9525(i5, m9528(i5 + i));
            }
        }
        char[] cArr = this.f11867;
        if (cArr != null) {
            System.arraycopy(cArr, i, c3144.f11867, 0, c3144.f11872);
        } else {
            System.arraycopy(this.f11865, i, c3144.f11865, 0, c3144.f11872);
        }
        if (this.f11875 == null && this.f11863 == null) {
            c3144.f11860 = (this.f11873 * i) + c3144.f11860;
        } else {
            long[] jArr = this.f11863;
            if (jArr != null && i == 0 && i2 == this.f11872) {
                c3144.f11863 = Arrays.copyOf(jArr, c3144.f11864.length);
                c3144.f11869 = Arrays.copyOf(this.f11869, c3144.f11864.length);
            } else {
                c3144.f11875 = new int[c3144.m9529()];
                for (int i6 = 0; i6 < c3144.f11872; i6++) {
                    c3144.f11875[i6] = m9536(i6 + i);
                }
            }
        }
        if (i != 0 || i2 != this.f11872) {
            c3144.m9526();
        }
        if (this.f11866 != null) {
            for (int i7 = i; i7 < i2; i7++) {
                c3144.m9534(i7 - i, m9539(i7));
            }
        }
        return c3144;
    }
}
