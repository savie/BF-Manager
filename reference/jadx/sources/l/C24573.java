package l;

/* JADX INFO: renamed from: l.᩺᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I1TM */
/* JADX INFO: loaded from: classes.dex */
public final class C24573 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14129[] f79641;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f79642;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f79643;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f79644;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f79640 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f79645 = 0;

    public C24573(int i, int i2, int i3) {
        this.f79644 = i;
        this.f79642 = i2;
        this.f79643 = i3;
        this.f79641 = new C14129[i2];
        m54883(0, 0, i, i3, 32, C14546.f45847);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m54880(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        StringBuilder sb = new StringBuilder();
        int i8 = this.f79644;
        int i9 = -this.f79640;
        if (i2 >= i9) {
            i9 = i2;
        }
        int i10 = this.f79643;
        int i11 = i4 >= i10 ? i10 - 1 : i4;
        int i12 = i9;
        while (i12 <= i11) {
            int i13 = i12 == i9 ? i : 0;
            if (i12 != i11 || (i5 = i3 + 1) > i8) {
                i5 = i8;
            }
            C14129 c14129 = this.f79641[m54889(i12)];
            int iM34342 = c14129.m34342(i13);
            int iM34343 = i5 < this.f79644 ? c14129.m34342(i5) : c14129.m34341();
            if (iM34343 == iM34342) {
                iM34343 = c14129.m34342(i5 + 1);
            }
            char[] cArr = c14129.f44697;
            boolean z = this.f79641[m54889(i12)].f44696;
            if (z && i5 == i8) {
                i6 = iM34343 - 1;
            } else {
                int i14 = -1;
                for (int i15 = iM34342; i15 < iM34343; i15++) {
                    if (cArr[i15] != ' ') {
                        i14 = i15;
                    }
                }
                i6 = i14;
            }
            if (i6 != -1 && (i7 = (i6 - iM34342) + 1) > 0) {
                sb.append(cArr, iM34342, i7);
            }
            if (!z && i12 < i11 && i12 < this.f79643 - 1) {
                sb.append('\n');
            }
            i12++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m54887() {
        return m54880(0, -this.f79640, this.f79644, this.f79643).trim();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m54888() {
        return this.f79640;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m54879() {
        return this.f79640 + this.f79643;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m54889(int i) {
        if (i < (-this.f79640) || i > this.f79643) {
            throw new IllegalArgumentException();
        }
        int i2 = this.f79645 + i;
        int i3 = this.f79642;
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
    public final void m54885(int i, int i2, int i3, int[] iArr, long j, boolean z) {
        C14129[] c14129Arr;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int iM34341;
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
        int iM48443;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iMax;
        if (i == this.f79644 && i2 <= this.f79642) {
            int i19 = this.f79643;
            int i20 = i19 - i2;
            if (i20 > 0 && i20 < i19) {
                for (int i21 = i19 - 1; i21 > 0 && iArr[1] < i21; i21--) {
                    C14129 c14129 = this.f79641[m54889(i21)];
                    if ((c14129 == null || c14129.m34347()) && (i20 = i20 - 1) == 0) {
                        break;
                    }
                }
            } else if (i20 < 0 && i20 != (iMax = Math.max(i20, -this.f79640))) {
                for (int i22 = 0; i22 < iMax - i20; i22++) {
                    m54881(((this.f79645 + this.f79643) + i22) % this.f79642).m34344(j);
                }
                i20 = iMax;
            }
            int i23 = this.f79645 + i20;
            this.f79645 = i23;
            int i24 = this.f79642;
            this.f79645 = i23 < 0 ? i23 + i24 : i23 % i24;
            this.f79642 = i3;
            this.f79640 = z ? 0 : Math.max(0, this.f79640 + i20);
            iArr[1] = iArr[1] - i20;
            this.f79643 = i2;
        } else {
            C14129[] c14129Arr2 = this.f79641;
            this.f79641 = new C14129[i3];
            for (int i25 = 0; i25 < i3; i25++) {
                this.f79641[i25] = new C14129(i, j);
            }
            int i26 = this.f79640;
            int i27 = this.f79645;
            int i28 = this.f79643;
            int i29 = this.f79642;
            this.f79642 = i3;
            this.f79643 = i2;
            this.f79645 = 0;
            this.f79640 = 0;
            this.f79644 = i;
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
                C14129 c141210 = c14129Arr2[i39 < 0 ? i29 + i39 : i39 % i29];
                boolean z6 = i37 == i30;
                if (c141210 == null || ((z5 || !z6) && c141210.m34347())) {
                    c14129Arr = c14129Arr2;
                    i4 = i29;
                    i35++;
                    z5 = z5;
                } else {
                    if (i35 > 0) {
                        int i41 = i38;
                        int i42 = 0;
                        while (i42 < i35) {
                            boolean z7 = z5;
                            int i43 = this.f79643;
                            C14129[] c14129Arr3 = c14129Arr2;
                            if (i36 == i43 - 1) {
                                m54886(0, i43, j);
                            } else {
                                i36++;
                            }
                            i42++;
                            z5 = z7;
                            c14129Arr2 = c14129Arr3;
                            i41 = 0;
                        }
                        z2 = z5;
                        c14129Arr = c14129Arr2;
                        i38 = i41;
                        i5 = 0;
                    } else {
                        z2 = z5;
                        c14129Arr = c14129Arr2;
                        i5 = i35;
                    }
                    if (z6 || c141210.f44696) {
                        i6 = i38;
                        iM34341 = c141210.m34341();
                        z3 = z6;
                        i7 = 0;
                        i38 = i6;
                        j2 = 0;
                        z4 = z2;
                        int i44 = i33;
                        i8 = i36;
                        i9 = 0;
                        while (true) {
                            if (i7 < iM34341) {
                                i10 = i5;
                                i4 = i29;
                                break;
                            }
                            int i45 = iM34341;
                            c = c141210.f44697[i7];
                            i10 = i5;
                            if (Character.isHighSurrogate(c)) {
                                codePoint = c;
                                i7++;
                                codePoint = Character.toCodePoint(c, c141210.f44697[i7]);
                            }
                            codePoint = c;
                            int i46 = i7;
                            int i47 = codePoint;
                            iM48443 = C21260.m48443(i47 == true ? 1 : 0);
                            if (iM48443 > 0) {
                                j2 = c141210.f44698[i9];
                            }
                            i12 = i38;
                            if (i38 + iM48443 > this.f79644) {
                                this.f79641[m54889(i8)].f44696 = true;
                                i18 = this.f79643;
                                if (i8 == i18 - 1) {
                                    if (z4) {
                                        i34--;
                                    }
                                    m54886(0, i18, j);
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
                            if (iM48443 <= 0 || i13 <= 0) {
                                i16 = 0;
                            } else {
                                i16 = 1;
                            }
                            i4 = i29;
                            i17 = i9;
                            m54884(i13 - i16, i14, i47 == true ? 1 : 0, j2);
                            if (iM48443 > 0) {
                                if (i30 == i37 || i31 != i17) {
                                    i34 = i15;
                                } else {
                                    z4 = true;
                                    i44 = i13;
                                    i34 = i14;
                                }
                                i9 = i17 + iM48443;
                                i38 = i13 + iM48443;
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
                            iM34341 = i45;
                        }
                        if (i37 != i28 - 1 && !c141210.f44696) {
                            i11 = this.f79643;
                            if (i8 == i11 - 1) {
                                if (z4) {
                                    i34--;
                                }
                                m54886(0, i11, j);
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
                        iM34341 = 0;
                        i6 = i38;
                        for (int i48 = 0; i48 < c141210.m34341(); i48++) {
                            iM34341 = c141210.f44697[i48] != ' ' ? i48 + 1 : iM34341;
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
                        if (i7 < iM34341) {
                            i10 = i5;
                            i4 = i29;
                            break;
                        }
                        int i410 = iM34341;
                        c = c141210.f44697[i7];
                        i10 = i5;
                        if (Character.isHighSurrogate(c)) {
                            codePoint = c;
                            i7++;
                            codePoint = Character.toCodePoint(c, c141210.f44697[i7]);
                        }
                        codePoint = c;
                        int i411 = i7;
                        int i412 = codePoint;
                        iM48443 = C21260.m48443(i412 == true ? 1 : 0);
                        if (iM48443 > 0) {
                            j2 = c141210.f44698[i9];
                        }
                        i12 = i38;
                        if (i38 + iM48443 > this.f79644) {
                            this.f79641[m54889(i8)].f44696 = true;
                            i18 = this.f79643;
                            if (i8 == i18 - 1) {
                                if (z4) {
                                    i34--;
                                }
                                m54886(0, i18, j);
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
                        if (iM48443 <= 0) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                        }
                        i4 = i29;
                        i17 = i9;
                        m54884(i13 - i16, i14, i412 == true ? 1 : 0, j2);
                        if (iM48443 > 0) {
                            if (i30 == i37) {
                                i34 = i15;
                            } else {
                                i34 = i15;
                            }
                            i9 = i17 + iM48443;
                            i38 = i13 + iM48443;
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
                        iM34341 = i410;
                    }
                    if (i37 != i28 - 1) {
                        i11 = this.f79643;
                        if (i8 == i11 - 1) {
                            if (z4) {
                                i34--;
                            }
                            m54886(0, i11, j);
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
                c14129Arr2 = c14129Arr;
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
    private void m54878(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        int i3 = this.f79642;
        int i4 = i2 - 1;
        C14129 c14129 = this.f79641[((i + i4) + 1) % i3];
        while (i4 >= 0) {
            C14129[] c14129Arr = this.f79641;
            int i5 = i + i4;
            c14129Arr[(i5 + 1) % i3] = c14129Arr[i5 % i3];
            i4--;
        }
        this.f79641[i % i3] = c14129;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54886(int i, int i2, long j) {
        int i3 = i2 - 1;
        if (i > i3 || i < 0 || i2 > this.f79643) {
            throw new IllegalArgumentException();
        }
        m54878(this.f79645, i);
        m54878(m54889(i2), this.f79643 - i2);
        int i4 = this.f79645 + 1;
        int i5 = this.f79642;
        this.f79645 = i4 % i5;
        int i6 = this.f79640;
        if (i6 < i5 - this.f79643) {
            this.f79640 = i6 + 1;
        }
        int iM54889 = m54889(i3);
        C14129[] c14129Arr = this.f79641;
        C14129 c14129 = c14129Arr[iM54889];
        if (c14129 == null) {
            c14129Arr[iM54889] = new C14129(this.f79644, j);
        } else {
            c14129.m34344(j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54882(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i3 == 0) {
            return;
        }
        if (i >= 0 && (i7 = i + i3) <= (i8 = this.f79644) && i2 >= 0) {
            int i9 = i2 + i4;
            int i10 = this.f79643;
            if (i9 <= i10 && i5 >= 0 && i3 + i5 <= i8 && i6 >= 0 && i6 + i4 <= i10) {
                boolean z = i2 > i6;
                for (int i11 = 0; i11 < i4; i11++) {
                    int i12 = z ? i11 : i4 - (i11 + 1);
                    m54881(m54889(i12 + i6)).m34345(m54881(m54889(i2 + i12)), i, i7, i5);
                }
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54883(int i, int i2, int i3, int i4, int i5, long j) {
        if (i < 0 || i + i3 > this.f79644 || i2 < 0 || i2 + i4 > this.f79643) {
            throw new IllegalArgumentException();
        }
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                m54884(i + i7, i2 + i6, i5, j);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14129 m54881(int i) {
        C14129[] c14129Arr = this.f79641;
        C14129 c14129 = c14129Arr[i];
        if (c14129 != null) {
            return c14129;
        }
        C14129 c141210 = new C14129(this.f79644, 0L);
        c14129Arr[i] = c141210;
        return c141210;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54884(int i, int i2, int i3, long j) {
        if (i2 >= this.f79643 || i >= this.f79644) {
            throw new IllegalArgumentException();
        }
        m54881(m54889(i2)).m34343(i, i3, j);
    }
}
