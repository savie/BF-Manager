package l;

/* JADX INFO: renamed from: l.ۗۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2980 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f11158;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f11159;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f11160;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[] f11161;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f11162;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f11163;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f11164;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f11165;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f11166;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C2357 f11167;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f11168;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13648 f11169;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long[] f11170;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f11171;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f11172;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9332 f11173;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f11175;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f11176;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f11177;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f11178;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f11180;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f11181;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f11182;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f11183;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f11184;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C20889[] f11185;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f11174 = 1;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f11179 = -1;

    public C2980(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3, C20889[] c20889Arr, boolean z) {
        this.f11168 = i4;
        int i5 = i3 - i2;
        this.f11176 = i5;
        this.f11184 = i2;
        this.f11175 = iArr;
        this.f11165 = iArr2;
        this.f11183 = iArr3;
        this.f11185 = c20889Arr;
        boolean z2 = (i2 == 0 && i3 == i) ? false : true;
        this.f11171 = z2;
        if (z) {
            this.f11178 = 16;
        } else {
            if (!z2) {
                this.f11178 = 1;
                return;
            }
            iArr[0] = 0;
            iArr2[0] = i5;
            this.f11178 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02cc A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8876() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f11178;
        int i6 = this.f11176;
        int[] iArr = this.f11183;
        int[] iArr2 = this.f11175;
        int[] iArr3 = this.f11165;
        int i7 = this.f11168;
        switch (i5) {
            case 0:
                int i8 = this.f11174;
                if (i8 < i7) {
                    int i9 = iArr2[i8];
                    int i10 = this.f11184;
                    iArr2[i8] = Math.max(i9, i10) - i10;
                    int i11 = this.f11174;
                    iArr3[i11] = Math.min(iArr3[i11], i6 + i10) - i10;
                    this.f11174++;
                } else {
                    this.f11174 = 1;
                    this.f11162 = 0;
                    this.f11159 = 0;
                    this.f11164 = 0;
                    this.f11180 = 0;
                    this.f11178 = 1;
                }
                break;
            case 1:
                int i12 = this.f11174;
                if (i12 >= i7) {
                    this.f11178 = 2;
                } else {
                    int i13 = iArr[i12];
                    int i14 = this.f11162;
                    if (i14 == i13) {
                        int i15 = iArr2[i12];
                        int i16 = this.f11159;
                        if (i15 < i16) {
                            m8873();
                        } else {
                            if (i15 > i16) {
                                this.f11180 = C2357.m7160(this.f11180);
                            }
                            int i17 = this.f11174;
                            this.f11159 = iArr2[i17];
                            this.f11174 = i17 + 1;
                            this.f11162 = i17;
                        }
                    } else if (i14 == 0 || (i = iArr3[i14]) < (i2 = this.f11159)) {
                        m8873();
                    } else {
                        if (i > i2) {
                            this.f11180 = C2357.m7160(this.f11180);
                        }
                        int i18 = this.f11162;
                        this.f11159 = iArr3[i18];
                        this.f11162 = iArr[i18];
                    }
                }
                break;
            case 2:
                int i19 = this.f11162;
                if (i19 < 0) {
                    if (this.f11159 == i6) {
                        this.f11178 = 3;
                    } else {
                        m8873();
                    }
                } else {
                    int i20 = iArr3[i19];
                    int i21 = this.f11159;
                    if (i20 < i21) {
                        m8873();
                    } else {
                        if (i20 > i21) {
                            this.f11180 = C2357.m7160(this.f11180);
                        }
                        int i22 = this.f11162;
                        this.f11159 = iArr3[i22];
                        this.f11162 = iArr[i22];
                    }
                }
                break;
            case 3:
                int i23 = this.f11180;
                if (i23 == 0) {
                    this.f11170 = C2357.f8311;
                } else if (i7 == 1 && i23 == 1) {
                    this.f11170 = C2357.f8310;
                } else {
                    this.f11170 = new long[i23];
                }
                this.f11174 = 1;
                this.f11162 = 0;
                this.f11159 = 0;
                this.f11164 = 0;
                this.f11178 = 4;
                break;
            case 4:
                int i24 = this.f11174;
                if (i24 >= i7) {
                    this.f11178 = 5;
                } else {
                    int i25 = iArr[i24];
                    int i26 = this.f11162;
                    if (i26 != i25) {
                        int i27 = iArr3[i26];
                        int i28 = this.f11159;
                        if (i27 > i28) {
                            long[] jArr = this.f11170;
                            int i29 = this.f11164;
                            this.f11164 = i29 + 1;
                            jArr[i29] = C2357.m7145(i28, i26);
                        }
                        int i30 = this.f11162;
                        this.f11159 = iArr3[i30];
                        this.f11162 = iArr[i30];
                    } else {
                        int i31 = iArr2[i24];
                        int i32 = this.f11159;
                        if (i31 > i32) {
                            long[] jArr2 = this.f11170;
                            int i33 = this.f11164;
                            this.f11164 = i33 + 1;
                            jArr2[i33] = C2357.m7145(i32, i26);
                        }
                        int i34 = this.f11174;
                        this.f11159 = iArr2[i34];
                        this.f11174 = i34 + 1;
                        this.f11162 = i34;
                    }
                }
                break;
            case 5:
                int i35 = this.f11162;
                if (i35 >= 0) {
                    int i36 = iArr3[i35];
                    int i37 = this.f11159;
                    if (i36 > i37) {
                        long[] jArr3 = this.f11170;
                        int i38 = this.f11164;
                        this.f11164 = i38 + 1;
                        jArr3[i38] = C2357.m7145(i37, i35);
                    }
                    int i39 = this.f11162;
                    this.f11159 = iArr3[i39];
                    this.f11162 = iArr[i39];
                } else {
                    if (this.f11164 != this.f11180 || this.f11159 != i6) {
                        throw new IllegalStateException("Ordered syntax context run count changed");
                    }
                    m8874();
                }
                break;
            case 6:
                this.f11182 = new int[i7];
                this.f11178 = 7;
                break;
            case 7:
                this.f11161 = new int[i7];
                this.f11174 = 0;
                this.f11178 = 8;
                break;
            case 8:
                int i40 = this.f11174;
                if (i40 >= i7) {
                    this.f11169 = new C13648(this.f11182, iArr2);
                    this.f11178 = 9;
                } else {
                    int[] iArr4 = this.f11182;
                    this.f11161[i40] = i40;
                    iArr4[i40] = i40;
                    this.f11174 = i40 + 1;
                }
                break;
            case 9:
                if (this.f11169.m33347()) {
                    this.f11169.m33346(this.f11161, iArr3);
                    this.f11178 = 10;
                }
                break;
            case 10:
                if (this.f11169.m33347()) {
                    this.f11169 = null;
                    this.f11173 = new C9332(i7);
                    this.f11172 = 0;
                    this.f11166 = 0;
                    this.f11158 = 0;
                    this.f11181 = 0;
                    this.f11179 = -1;
                    this.f11180 = 0;
                    this.f11177 = false;
                    this.f11178 = 11;
                }
                break;
            case 11:
                if (m8875()) {
                    this.f11178 = 12;
                }
                break;
            case 12:
                int i41 = this.f11180;
                this.f11170 = i41 == 0 ? C2357.f8311 : new long[i41];
                this.f11164 = this.f11180;
                this.f11180 = 0;
                this.f11163 = 0;
                this.f11160 = 0;
                this.f11178 = 13;
                break;
            case 13:
                if (this.f11160 < this.f11173.f31681.length) {
                    long[][] jArr4 = this.f11173.f31681;
                    int i42 = this.f11160;
                    long[] jArr5 = jArr4[i42];
                    int i43 = this.f11163;
                    if (i43 >= jArr5.length) {
                        this.f11160 = i42 + 1;
                        this.f11163 = 0;
                    } else {
                        this.f11163 = i43 + 1;
                        jArr5[i43] = 0;
                    }
                } else {
                    this.f11172 = 0;
                    this.f11166 = 0;
                    this.f11158 = 0;
                    this.f11181 = 0;
                    this.f11179 = -1;
                    this.f11180 = 0;
                    this.f11177 = true;
                    this.f11178 = 14;
                }
                break;
            case 14:
                if (m8875()) {
                    int i44 = this.f11180;
                    if (i44 != this.f11164 || (i44 != 0 && ((int) (this.f11170[0] >>> 32)) != 0)) {
                        throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                    }
                    m8874();
                }
                break;
            case 15:
                return true;
            case 16:
                int i45 = this.f11174;
                if (i45 >= i7) {
                    this.f11174 = 1;
                    if (this.f11171) {
                        iArr2[0] = 0;
                        iArr3[0] = i6;
                        this.f11178 = 0;
                    } else {
                        this.f11178 = 1;
                    }
                } else {
                    int i46 = iArr[i45];
                    if (i46 < 0 || i46 >= i45 || (i3 = iArr2[i45]) < iArr2[i46] || (i4 = iArr3[i45]) <= i3 || i4 > iArr3[i46]) {
                        throw new IllegalArgumentException("Invalid syntax context node: " + this.f11174);
                    }
                    this.f11174 = i45 + 1;
                }
                break;
            default:
                throw new IllegalStateException("Invalid syntax context build phase");
        }
        if (this.f11178 == 15) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2357 m8877() {
        C2357 c2357 = this.f11167;
        if (c2357 != null) {
            return c2357;
        }
        throw new IllegalStateException("Syntax context index is not complete");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m8873() {
        this.f11161 = null;
        this.f11182 = null;
        this.f11170 = null;
        this.f11164 = 0;
        this.f11180 = 0;
        this.f11178 = 6;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m8875() {
        int i = this.f11181;
        int[] iArr = this.f11165;
        int[] iArr2 = this.f11175;
        long j = C17492.FOREVER_NS;
        int i2 = this.f11168;
        if (i == 0) {
            int i3 = this.f11166;
            if (i3 < i2 || this.f11172 < i2) {
                long j2 = i3 < i2 ? iArr2[this.f11182[i3]] : Long.MAX_VALUE;
                int i4 = this.f11172;
                if (i4 < i2) {
                    j = iArr[this.f11161[i4]];
                }
                this.f11158 = (int) Math.min(j2, j);
                this.f11181 = 1;
                return false;
            }
        } else {
            if (i == 1) {
                int i5 = this.f11172;
                if (i5 < i2) {
                    int i6 = this.f11161[i5];
                    if (iArr[i6] == this.f11158) {
                        C9332 c9332 = this.f11173;
                        this.f11172 = i5 + 1;
                        c9332.m23994(i6);
                        return false;
                    }
                }
                this.f11181 = 2;
                return false;
            }
            if (i == 2) {
                int i7 = this.f11166;
                if (i7 < i2) {
                    int i8 = this.f11182[i7];
                    if (iArr2[i8] == this.f11158) {
                        C9332 c9333 = this.f11173;
                        this.f11166 = i7 + 1;
                        c9333.m23992(i8);
                        return false;
                    }
                }
                this.f11181 = 3;
                return false;
            }
            if (i == 3) {
                int i9 = this.f11166;
                if (i9 < i2 || this.f11172 < i2) {
                    long j3 = i9 < i2 ? iArr2[this.f11182[i9]] : Long.MAX_VALUE;
                    int i10 = this.f11172;
                    if (i10 < i2) {
                        j = iArr[this.f11161[i10]];
                    }
                    if (Math.min(j3, j) > this.f11158) {
                        int iM23993 = this.f11173.m23993();
                        if (iM23993 < 0) {
                            throw new IllegalArgumentException("Syntax context ranges do not cover the text");
                        }
                        if (iM23993 != this.f11179) {
                            if (this.f11177) {
                                this.f11170[this.f11180] = C2357.m7145(this.f11158, iM23993);
                            }
                            this.f11180 = C2357.m7160(this.f11180);
                            this.f11179 = iM23993;
                        }
                    }
                    this.f11181 = 0;
                    return false;
                }
            } else {
                throw new IllegalStateException("Invalid syntax context sweep phase");
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m8874() {
        this.f11167 = new C2357(this.f11176, this.f11168, this.f11175, this.f11165, this.f11183, this.f11185, this.f11170);
        this.f11161 = null;
        this.f11182 = null;
        this.f11169 = null;
        this.f11173 = null;
        this.f11178 = 15;
    }
}
