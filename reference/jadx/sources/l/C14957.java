package l;

/* JADX INFO: renamed from: l.ܰ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14957 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f48835;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f48836;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C8246 f48837;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[] f48838;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48839;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f48840;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C18687 f48841;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f48842;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f48843;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long[] f48844;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f48845;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f48846;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f48847;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f48848;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f48849;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f48850;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f48852;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f48853;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f48854;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f48855;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f48856;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48857;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4517 f48858;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f48859;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f48861;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16800[] f48862;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f48851 = 1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f48860 = -1;

    public C14957(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3, C16800[] c16800Arr, boolean z) {
        this.f48846 = i4;
        int i5 = i3 - i2;
        this.f48835 = i5;
        this.f48849 = i2;
        this.f48848 = iArr;
        this.f48845 = iArr2;
        this.f48852 = iArr3;
        this.f48862 = c16800Arr;
        boolean z2 = (i2 == 0 && i3 == i) ? false : true;
        this.f48842 = z2;
        if (z) {
            this.f48850 = 16;
        } else {
            if (!z2) {
                this.f48850 = 1;
                return;
            }
            iArr[0] = 0;
            iArr2[0] = i5;
            this.f48850 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02cc A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36001() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f48850;
        int i6 = this.f48835;
        int[] iArr = this.f48852;
        int[] iArr2 = this.f48848;
        int[] iArr3 = this.f48845;
        int i7 = this.f48846;
        switch (i5) {
            case 0:
                int i8 = this.f48851;
                if (i8 < i7) {
                    int i9 = iArr2[i8];
                    int i10 = this.f48849;
                    iArr2[i8] = Math.max(i9, i10) - i10;
                    int i11 = this.f48851;
                    iArr3[i11] = Math.min(iArr3[i11], i6 + i10) - i10;
                    this.f48851++;
                } else {
                    this.f48851 = 1;
                    this.f48839 = 0;
                    this.f48847 = 0;
                    this.f48843 = 0;
                    this.f48856 = 0;
                    this.f48850 = 1;
                }
                break;
            case 1:
                int i12 = this.f48851;
                if (i12 >= i7) {
                    this.f48850 = 2;
                } else {
                    int i13 = iArr[i12];
                    int i14 = this.f48839;
                    if (i14 == i13) {
                        int i15 = iArr2[i12];
                        int i16 = this.f48847;
                        if (i15 < i16) {
                            m36000();
                        } else {
                            if (i15 > i16) {
                                this.f48856 = C8246.m22170(this.f48856);
                            }
                            int i17 = this.f48851;
                            this.f48847 = iArr2[i17];
                            this.f48851 = i17 + 1;
                            this.f48839 = i17;
                        }
                    } else if (i14 == 0 || (i = iArr3[i14]) < (i2 = this.f48847)) {
                        m36000();
                    } else {
                        if (i > i2) {
                            this.f48856 = C8246.m22170(this.f48856);
                        }
                        int i18 = this.f48839;
                        this.f48847 = iArr3[i18];
                        this.f48839 = iArr[i18];
                    }
                }
                break;
            case 2:
                int i19 = this.f48839;
                if (i19 < 0) {
                    if (this.f48847 == i6) {
                        this.f48850 = 3;
                    } else {
                        m36000();
                    }
                } else {
                    int i20 = iArr3[i19];
                    int i21 = this.f48847;
                    if (i20 < i21) {
                        m36000();
                    } else {
                        if (i20 > i21) {
                            this.f48856 = C8246.m22170(this.f48856);
                        }
                        int i22 = this.f48839;
                        this.f48847 = iArr3[i22];
                        this.f48839 = iArr[i22];
                    }
                }
                break;
            case 3:
                int i23 = this.f48856;
                if (i23 == 0) {
                    this.f48844 = C8246.f27118;
                } else if (i7 == 1 && i23 == 1) {
                    this.f48844 = C8246.f27119;
                } else {
                    this.f48844 = new long[i23];
                }
                this.f48851 = 1;
                this.f48839 = 0;
                this.f48847 = 0;
                this.f48843 = 0;
                this.f48850 = 4;
                break;
            case 4:
                int i24 = this.f48851;
                if (i24 >= i7) {
                    this.f48850 = 5;
                } else {
                    int i25 = iArr[i24];
                    int i26 = this.f48839;
                    if (i26 != i25) {
                        int i27 = iArr3[i26];
                        int i28 = this.f48847;
                        if (i27 > i28) {
                            long[] jArr = this.f48844;
                            int i29 = this.f48843;
                            this.f48843 = i29 + 1;
                            jArr[i29] = C8246.m22177(i28, i26);
                        }
                        int i30 = this.f48839;
                        this.f48847 = iArr3[i30];
                        this.f48839 = iArr[i30];
                    } else {
                        int i31 = iArr2[i24];
                        int i32 = this.f48847;
                        if (i31 > i32) {
                            long[] jArr2 = this.f48844;
                            int i33 = this.f48843;
                            this.f48843 = i33 + 1;
                            jArr2[i33] = C8246.m22177(i32, i26);
                        }
                        int i34 = this.f48851;
                        this.f48847 = iArr2[i34];
                        this.f48851 = i34 + 1;
                        this.f48839 = i34;
                    }
                }
                break;
            case 5:
                int i35 = this.f48839;
                if (i35 >= 0) {
                    int i36 = iArr3[i35];
                    int i37 = this.f48847;
                    if (i36 > i37) {
                        long[] jArr3 = this.f48844;
                        int i38 = this.f48843;
                        this.f48843 = i38 + 1;
                        jArr3[i38] = C8246.m22177(i37, i35);
                    }
                    int i39 = this.f48839;
                    this.f48847 = iArr3[i39];
                    this.f48839 = iArr[i39];
                } else {
                    if (this.f48843 != this.f48856 || this.f48847 != i6) {
                        throw new IllegalStateException("Ordered syntax context run count changed");
                    }
                    m35999();
                }
                break;
            case 6:
                this.f48838 = new int[i7];
                this.f48850 = 7;
                break;
            case 7:
                this.f48836 = new int[i7];
                this.f48851 = 0;
                this.f48850 = 8;
                break;
            case 8:
                int i40 = this.f48851;
                if (i40 >= i7) {
                    this.f48841 = new C18687(this.f48838, iArr2);
                    this.f48850 = 9;
                } else {
                    int[] iArr4 = this.f48838;
                    this.f48836[i40] = i40;
                    iArr4[i40] = i40;
                    this.f48851 = i40 + 1;
                }
                break;
            case 9:
                if (this.f48841.m43483()) {
                    this.f48841.m43482(this.f48836, iArr3);
                    this.f48850 = 10;
                }
                break;
            case 10:
                if (this.f48841.m43483()) {
                    this.f48841 = null;
                    this.f48858 = new C4517(i7);
                    this.f48840 = 0;
                    this.f48861 = 0;
                    this.f48853 = 0;
                    this.f48857 = 0;
                    this.f48860 = -1;
                    this.f48856 = 0;
                    this.f48854 = false;
                    this.f48850 = 11;
                }
                break;
            case 11:
                if (m35998()) {
                    this.f48850 = 12;
                }
                break;
            case 12:
                int i41 = this.f48856;
                this.f48844 = i41 == 0 ? C8246.f27118 : new long[i41];
                this.f48843 = this.f48856;
                this.f48856 = 0;
                this.f48855 = 0;
                this.f48859 = 0;
                this.f48850 = 13;
                break;
            case 13:
                if (this.f48859 < this.f48858.f16099.length) {
                    long[][] jArr4 = this.f48858.f16099;
                    int i42 = this.f48859;
                    long[] jArr5 = jArr4[i42];
                    int i43 = this.f48855;
                    if (i43 >= jArr5.length) {
                        this.f48859 = i42 + 1;
                        this.f48855 = 0;
                    } else {
                        this.f48855 = i43 + 1;
                        jArr5[i43] = 0;
                    }
                } else {
                    this.f48840 = 0;
                    this.f48861 = 0;
                    this.f48853 = 0;
                    this.f48857 = 0;
                    this.f48860 = -1;
                    this.f48856 = 0;
                    this.f48854 = true;
                    this.f48850 = 14;
                }
                break;
            case 14:
                if (m35998()) {
                    int i44 = this.f48856;
                    if (i44 != this.f48843 || (i44 != 0 && ((int) (this.f48844[0] >>> 32)) != 0)) {
                        throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                    }
                    m35999();
                }
                break;
            case 15:
                return true;
            case 16:
                int i45 = this.f48851;
                if (i45 >= i7) {
                    this.f48851 = 1;
                    if (this.f48842) {
                        iArr2[0] = 0;
                        iArr3[0] = i6;
                        this.f48850 = 0;
                    } else {
                        this.f48850 = 1;
                    }
                } else {
                    int i46 = iArr[i45];
                    if (i46 < 0 || i46 >= i45 || (i3 = iArr2[i45]) < iArr2[i46] || (i4 = iArr3[i45]) <= i3 || i4 > iArr3[i46]) {
                        throw new IllegalArgumentException("Invalid syntax context node: " + this.f48851);
                    }
                    this.f48851 = i45 + 1;
                }
                break;
            default:
                throw new IllegalStateException("Invalid syntax context build phase");
        }
        if (this.f48850 == 15) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8246 m36002() {
        C8246 c8246 = this.f48837;
        if (c8246 != null) {
            return c8246;
        }
        throw new IllegalStateException("Syntax context index is not complete");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m36000() {
        this.f48836 = null;
        this.f48838 = null;
        this.f48844 = null;
        this.f48843 = 0;
        this.f48856 = 0;
        this.f48850 = 6;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m35998() {
        int i = this.f48857;
        int[] iArr = this.f48845;
        int[] iArr2 = this.f48848;
        long j = C25227.FOREVER_NS;
        int i2 = this.f48846;
        if (i == 0) {
            int i3 = this.f48861;
            if (i3 < i2 || this.f48840 < i2) {
                long j2 = i3 < i2 ? iArr2[this.f48838[i3]] : Long.MAX_VALUE;
                int i4 = this.f48840;
                if (i4 < i2) {
                    j = iArr[this.f48836[i4]];
                }
                this.f48853 = (int) Math.min(j2, j);
                this.f48857 = 1;
                return false;
            }
        } else {
            if (i == 1) {
                int i5 = this.f48840;
                if (i5 < i2) {
                    int i6 = this.f48836[i5];
                    if (iArr[i6] == this.f48853) {
                        C4517 c4517 = this.f48858;
                        this.f48840 = i5 + 1;
                        c4517.m14245(i6);
                        return false;
                    }
                }
                this.f48857 = 2;
                return false;
            }
            if (i == 2) {
                int i7 = this.f48861;
                if (i7 < i2) {
                    int i8 = this.f48838[i7];
                    if (iArr2[i8] == this.f48853) {
                        C4517 c4518 = this.f48858;
                        this.f48861 = i7 + 1;
                        c4518.m14243(i8);
                        return false;
                    }
                }
                this.f48857 = 3;
                return false;
            }
            if (i == 3) {
                int i9 = this.f48861;
                if (i9 < i2 || this.f48840 < i2) {
                    long j3 = i9 < i2 ? iArr2[this.f48838[i9]] : Long.MAX_VALUE;
                    int i10 = this.f48840;
                    if (i10 < i2) {
                        j = iArr[this.f48836[i10]];
                    }
                    if (Math.min(j3, j) > this.f48853) {
                        int iM14244 = this.f48858.m14244();
                        if (iM14244 < 0) {
                            throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                        }
                        if (iM14244 != this.f48860) {
                            if (this.f48854) {
                                this.f48844[this.f48856] = C8246.m22177(this.f48853, iM14244);
                            }
                            this.f48856 = C8246.m22170(this.f48856);
                            this.f48860 = iM14244;
                        }
                    }
                    this.f48857 = 0;
                    return false;
                }
            } else {
                throw new IllegalStateException("Invalid syntax context sweep phase");
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m35999() {
        this.f48837 = new C8246(this.f48835, this.f48846, this.f48848, this.f48845, this.f48852, this.f48862, this.f48844);
        this.f48836 = null;
        this.f48838 = null;
        this.f48841 = null;
        this.f48858 = null;
        this.f48850 = 15;
    }
}
