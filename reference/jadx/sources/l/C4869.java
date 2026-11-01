package l;

/* JADX INFO: renamed from: l.ۙ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1TM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4869 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f17123;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C18981[] f17124;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17125;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f17126;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17122 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f17121 = 0;

    public C4869(int i, int i2, int i3) {
        this.f17125 = i;
        this.f17126 = i2;
        this.f17123 = i3;
        this.f17124 = new C18981[i2];
        m13567(0, 0, i, i3, 32, C0761.f3077);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m13564(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        StringBuilder sb = new StringBuilder();
        int i8 = this.f17125;
        int i9 = -this.f17122;
        if (i2 >= i9) {
            i9 = i2;
        }
        int i10 = this.f17123;
        int i11 = i4 >= i10 ? i10 - 1 : i4;
        int i12 = i9;
        while (i12 <= i11) {
            int i13 = i12 == i9 ? i : 0;
            if (i12 != i11 || (i5 = i3 + 1) > i8) {
                i5 = i8;
            }
            C18981 c18981 = this.f17124[m13573(i12)];
            int iM43681 = c18981.m43681(i13);
            int iM43682 = i5 < this.f17125 ? c18981.m43681(i5) : c18981.m43680();
            if (iM43682 == iM43681) {
                iM43682 = c18981.m43681(i5 + 1);
            }
            char[] cArr = c18981.f61445;
            boolean z = this.f17124[m13573(i12)].f61443;
            if (z && i5 == i8) {
                i6 = iM43682 - 1;
            } else {
                int i14 = -1;
                for (int i15 = iM43681; i15 < iM43682; i15++) {
                    if (cArr[i15] != ' ') {
                        i14 = i15;
                    }
                }
                i6 = i14;
            }
            if (i6 != -1 && (i7 = (i6 - iM43681) + 1) > 0) {
                sb.append(cArr, iM43681, i7);
            }
            if (!z && i12 < i11 && i12 < this.f17123 - 1) {
                sb.append('\n');
            }
            i12++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m13571() {
        return m13564(0, -this.f17122, this.f17125, this.f17123).trim();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m13572() {
        return this.f17122;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13563() {
        return this.f17122 + this.f17123;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m13573(int i) {
        if (i < (-this.f17122) || i > this.f17123) {
            throw new IllegalArgumentException();
        }
        int i2 = this.f17121 + i;
        int i3 = this.f17126;
        return i2 < 0 ? i3 + i2 : i2 % i3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019c  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:126:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0204  */
    /* JADX WARN: Code duplicated, block: B:129:0x020b  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x0164  */
    /* JADX WARN: Code duplicated, block: B:92:0x0176  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13569(int i, int i2, int i3, int[] iArr, long j, boolean z) {
        C18981[] c18981Arr;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int iM43680;
        boolean z3;
        int i7;
        long j2;
        boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        char c;
        int codePoint;
        int iM31705;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iMax;
        if (i == this.f17125 && i2 <= this.f17126) {
            int i19 = this.f17123;
            int i20 = i19 - i2;
            if (i20 > 0 && i20 < i19) {
                for (int i21 = i19 - 1; i21 > 0 && iArr[1] < i21; i21--) {
                    C18981 c18981 = this.f17124[m13573(i21)];
                    if ((c18981 == null || c18981.m43686()) && (i20 = i20 - 1) == 0) {
                        break;
                    }
                }
            } else if (i20 < 0 && i20 != (iMax = Math.max(i20, -this.f17122))) {
                for (int i22 = 0; i22 < iMax - i20; i22++) {
                    m13565(((this.f17121 + this.f17123) + i22) % this.f17126).m43683(j);
                }
                i20 = iMax;
            }
            int i23 = this.f17121 + i20;
            this.f17121 = i23;
            int i24 = this.f17126;
            this.f17121 = i23 < 0 ? i23 + i24 : i23 % i24;
            this.f17126 = i3;
            this.f17122 = z ? 0 : Math.max(0, this.f17122 + i20);
            iArr[1] = iArr[1] - i20;
            this.f17123 = i2;
        } else {
            C18981[] c18981Arr2 = this.f17124;
            this.f17124 = new C18981[i3];
            for (int i25 = 0; i25 < i3; i25++) {
                this.f17124[i25] = new C18981(i, j);
            }
            int i26 = this.f17122;
            int i27 = this.f17121;
            int i28 = this.f17123;
            int i29 = this.f17126;
            this.f17126 = i3;
            this.f17123 = i2;
            this.f17121 = 0;
            this.f17122 = 0;
            this.f17125 = i;
            int i30 = iArr[1];
            int i31 = iArr[0];
            int i32 = -i26;
            int i33 = -1;
            int i34 = -1;
            boolean z5 = false;
            int i35 = 0;
            int i36 = 0;
            int i37 = i32;
            int i38 = 0;
            while (i37 < i28) {
                int i39 = i27 + i37;
                int i40 = i27;
                C18981 c18982 = c18981Arr2[i39 < 0 ? i29 + i39 : i39 % i29];
                boolean z6 = i37 == i30;
                if (c18982 == null || ((z5 || !z6) && c18982.m43686())) {
                    c18981Arr = c18981Arr2;
                    i4 = i29;
                    i35++;
                    z5 = z5;
                } else {
                    if (i35 > 0) {
                        int i41 = i38;
                        int i42 = 0;
                        while (i42 < i35) {
                            boolean z7 = z5;
                            int i43 = this.f17123;
                            C18981[] c18981Arr3 = c18981Arr2;
                            if (i36 == i43 - 1) {
                                m13570(0, i43, j);
                            } else {
                                i36++;
                            }
                            i42++;
                            z5 = z7;
                            c18981Arr2 = c18981Arr3;
                            i41 = 0;
                        }
                        z2 = z5;
                        c18981Arr = c18981Arr2;
                        i38 = i41;
                        i5 = 0;
                    } else {
                        z2 = z5;
                        c18981Arr = c18981Arr2;
                        i5 = i35;
                    }
                    if (z6 || c18982.f61443) {
                        i6 = i38;
                        iM43680 = c18982.m43680();
                        z3 = z6;
                        i7 = 0;
                        i38 = i6;
                        j2 = 0;
                        z4 = z2;
                        int i44 = i33;
                        i8 = i36;
                        i9 = 0;
                        while (true) {
                            if (i7 < iM43680) {
                                i10 = i5;
                                i4 = i29;
                                break;
                            }
                            int i45 = iM43680;
                            c = c18982.f61445[i7];
                            i10 = i5;
                            if (Character.isHighSurrogate(c)) {
                                codePoint = c;
                                i7++;
                                codePoint = Character.toCodePoint(c, c18982.f61445[i7]);
                            }
                            codePoint = c;
                            int i46 = i7;
                            int i47 = codePoint;
                            iM31705 = C12757.m31705(i47 == true ? 1 : 0);
                            if (iM31705 > 0) {
                                j2 = c18982.f61442[i9];
                            }
                            i12 = i38;
                            if (i38 + iM31705 > this.f17125) {
                                this.f17124[m13573(i8)].f61443 = true;
                                i18 = this.f17123;
                                if (i8 == i18 - 1) {
                                    if (z4) {
                                        i34--;
                                    }
                                    m13570(0, i18, j);
                                } else {
                                    i8++;
                                }
                                i14 = i8;
                                i15 = i34;
                                i13 = 0;
                            } else {
                                i13 = i12;
                                i14 = i8;
                                i15 = i34;
                            }
                            if (iM31705 <= 0 || i13 <= 0) {
                                i16 = 0;
                            } else {
                                i16 = 1;
                            }
                            i4 = i29;
                            i17 = i9;
                            m13568(i13 - i16, i14, i47 == true ? 1 : 0, j2);
                            if (iM31705 > 0) {
                                if (i30 == i37 || i31 != i17) {
                                    i34 = i15;
                                } else {
                                    z4 = true;
                                    i44 = i13;
                                    i34 = i14;
                                }
                                i9 = i17 + iM31705;
                                i38 = i13 + iM31705;
                                if (z3 && z4) {
                                    i8 = i14;
                                    break;
                                }
                            } else {
                                i9 = i17;
                                i38 = i13;
                                i34 = i15;
                            }
                            i7 = i46 + 1;
                            i5 = i10;
                            i8 = i14;
                            i29 = i4;
                            iM43680 = i45;
                        }
                        if (i37 != i28 - 1 && !c18982.f61443) {
                            i11 = this.f17123;
                            if (i8 == i11 - 1) {
                                if (z4) {
                                    i34--;
                                }
                                m13570(0, i11, j);
                            } else {
                                i8++;
                            }
                            i38 = 0;
                        }
                        i35 = i10;
                        i36 = i8;
                        i33 = i44;
                        z5 = z4;
                    } else {
                        iM43680 = 0;
                        i6 = i38;
                        for (int i48 = 0; i48 < c18982.m43680(); i48++) {
                            iM43680 = c18982.f61445[i48] != ' ' ? i48 + 1 : iM43680;
                        }
                    }
                    i7 = 0;
                    i38 = i6;
                    j2 = 0;
                    z4 = z2;
                    int i49 = i33;
                    i8 = i36;
                    i9 = 0;
                    while (true) {
                        if (i7 < iM43680) {
                            i10 = i5;
                            i4 = i29;
                            break;
                        }
                        int i410 = iM43680;
                        c = c18982.f61445[i7];
                        i10 = i5;
                        if (Character.isHighSurrogate(c)) {
                            codePoint = c;
                            i7++;
                            codePoint = Character.toCodePoint(c, c18982.f61445[i7]);
                        }
                        codePoint = c;
                        int i411 = i7;
                        int i412 = codePoint;
                        iM31705 = C12757.m31705(i412 == true ? 1 : 0);
                        if (iM31705 > 0) {
                            j2 = c18982.f61442[i9];
                        }
                        i12 = i38;
                        if (i38 + iM31705 > this.f17125) {
                            this.f17124[m13573(i8)].f61443 = true;
                            i18 = this.f17123;
                            if (i8 == i18 - 1) {
                                if (z4) {
                                    i34--;
                                }
                                m13570(0, i18, j);
                            } else {
                                i8++;
                            }
                            i14 = i8;
                            i15 = i34;
                            i13 = 0;
                        } else {
                            i13 = i12;
                            i14 = i8;
                            i15 = i34;
                        }
                        if (iM31705 <= 0) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                        }
                        i4 = i29;
                        i17 = i9;
                        m13568(i13 - i16, i14, i412 == true ? 1 : 0, j2);
                        if (iM31705 > 0) {
                            if (i30 == i37) {
                                i34 = i15;
                            } else {
                                i34 = i15;
                            }
                            i9 = i17 + iM31705;
                            i38 = i13 + iM31705;
                            if (z3) {
                                continue;
                            }
                        } else {
                            i9 = i17;
                            i38 = i13;
                            i34 = i15;
                        }
                        i7 = i411 + 1;
                        i5 = i10;
                        i8 = i14;
                        i29 = i4;
                        iM43680 = i410;
                    }
                    if (i37 != i28 - 1) {
                        i11 = this.f17123;
                        if (i8 == i11 - 1) {
                            if (z4) {
                                i34--;
                            }
                            m13570(0, i11, j);
                        } else {
                            i8++;
                        }
                        i38 = 0;
                    }
                    i35 = i10;
                    i36 = i8;
                    i33 = i49;
                    z5 = z4;
                }
                i37++;
                i27 = i40;
                c18981Arr2 = c18981Arr;
                i29 = i4;
            }
            iArr[0] = i33;
            iArr[1] = i34;
        }
        if (iArr[0] < 0 || iArr[1] < 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13562(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        int i3 = this.f17126;
        int i4 = i2 - 1;
        C18981 c18981 = this.f17124[((i + i4) + 1) % i3];
        while (i4 >= 0) {
            C18981[] c18981Arr = this.f17124;
            int i5 = i + i4;
            c18981Arr[(i5 + 1) % i3] = c18981Arr[i5 % i3];
            i4--;
        }
        this.f17124[i % i3] = c18981;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13570(int i, int i2, long j) {
        int i3 = i2 - 1;
        if (i > i3 || i < 0 || i2 > this.f17123) {
            throw new IllegalArgumentException();
        }
        m13562(this.f17121, i);
        m13562(m13573(i2), this.f17123 - i2);
        int i4 = this.f17121 + 1;
        int i5 = this.f17126;
        this.f17121 = i4 % i5;
        int i6 = this.f17122;
        if (i6 < i5 - this.f17123) {
            this.f17122 = i6 + 1;
        }
        int iM13573 = m13573(i3);
        C18981[] c18981Arr = this.f17124;
        C18981 c18981 = c18981Arr[iM13573];
        if (c18981 == null) {
            c18981Arr[iM13573] = new C18981(this.f17125, j);
        } else {
            c18981.m43683(j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13566(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i3 == 0) {
            return;
        }
        if (i >= 0 && (i7 = i + i3) <= (i8 = this.f17125) && i2 >= 0) {
            int i9 = i2 + i4;
            int i10 = this.f17123;
            if (i9 <= i10 && i5 >= 0 && i3 + i5 <= i8 && i6 >= 0 && i6 + i4 <= i10) {
                boolean z = i2 > i6;
                for (int i11 = 0; i11 < i4; i11++) {
                    int i12 = z ? i11 : i4 - (i11 + 1);
                    m13565(m13573(i12 + i6)).m43684(m13565(m13573(i2 + i12)), i, i7, i5);
                }
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13567(int i, int i2, int i3, int i4, int i5, long j) {
        if (i < 0 || i + i3 > this.f17125 || i2 < 0 || i2 + i4 > this.f17123) {
            throw new IllegalArgumentException();
        }
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                m13568(i + i7, i2 + i6, i5, j);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18981 m13565(int i) {
        C18981[] c18981Arr = this.f17124;
        C18981 c18981 = c18981Arr[i];
        if (c18981 != null) {
            return c18981;
        }
        C18981 c18982 = new C18981(this.f17125, 0L);
        c18981Arr[i] = c18982;
        return c18982;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13568(int i, int i2, int i3, long j) {
        if (i2 >= this.f17123 || i >= this.f17125) {
            throw new IllegalArgumentException();
        }
        m13565(m13573(i2)).m43682(i, i3, j);
    }
}
