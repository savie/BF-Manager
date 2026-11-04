package l;

/* JADX INFO: renamed from: l.ۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9699 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31312;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C0751 f31313;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C0751 f31316;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31317;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2988 f31318;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f31319;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C0751 f31320;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C0751 f31321;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f31322;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31323;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f31329;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10445 f31314 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31326 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f31325 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f31324 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f31328 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f31327 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f31315 = 0;

    public C9699(C2988 c2988, int i, C0751 c0751, C0751 c0752, C0751 c0753, C0751 c0754, int i2) {
        this.f31318 = c2988;
        this.f31329 = 0;
        this.f31323 = 0;
        this.f31322 = 0;
        this.f31317 = 0;
        this.f31319 = 0;
        this.f31312 = i;
        this.f31320 = c0751;
        this.f31313 = c0752;
        this.f31321 = c0753;
        this.f31316 = c0754;
        this.f31329 = c2988.m49423();
        this.f31323 = c2988.m49417();
        this.f31322 = c2988.m49416();
        this.f31317 = c2988.m49413();
        this.f31319 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25295(int i, C0751 c0751, C0751 c0752, C0751 c0753, C0751 c0754, int i2, int i3, int i4, int i5, int i6) {
        this.f31312 = i;
        this.f31320 = c0751;
        this.f31313 = c0752;
        this.f31321 = c0753;
        this.f31316 = c0754;
        this.f31329 = i2;
        this.f31323 = i3;
        this.f31322 = i4;
        this.f31317 = i5;
        this.f31319 = i6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25293() {
        this.f31326 = 0;
        this.f31314 = null;
        this.f31325 = 0;
        this.f31324 = 0;
        this.f31328 = 0;
        this.f31327 = 0;
        this.f31315 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25300(int i) {
        this.f31328 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m25298() {
        if (this.f31312 == 0) {
            return this.f31325 - this.f31318.f9715;
        }
        return this.f31325;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m25299() {
        if (this.f31312 == 1) {
            return this.f31324 - this.f31318.f9701;
        }
        return this.f31324;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25297(C10445 c10445) {
        int i = this.f31312;
        C2988 c2988 = this.f31318;
        if (i == 0) {
            int iM9728 = c2988.m9728(c10445, this.f31319);
            if (c10445.f33210[0] == EnumC19396.MATCH_CONSTRAINT) {
                this.f31315++;
                iM9728 = 0;
            }
            this.f31325 = iM9728 + (c10445.m26870() != 8 ? c2988.f9715 : 0) + this.f31325;
            int iM9714 = c2988.m9714(c10445, this.f31319);
            if (this.f31314 == null || this.f31326 < iM9714) {
                this.f31314 = c10445;
                this.f31326 = iM9714;
                this.f31324 = iM9714;
            }
        } else {
            int iM9729 = c2988.m9728(c10445, this.f31319);
            int iM9715 = c2988.m9714(c10445, this.f31319);
            if (c10445.f33210[1] == EnumC19396.MATCH_CONSTRAINT) {
                this.f31315++;
                iM9715 = 0;
            }
            this.f31324 = iM9715 + (c10445.m26870() != 8 ? c2988.f9701 : 0) + this.f31324;
            if (this.f31314 == null || this.f31326 < iM9729) {
                this.f31314 = c10445;
                this.f31326 = iM9729;
                this.f31325 = iM9729;
            }
        }
        this.f31327++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25296(int i, boolean z, boolean z2) {
        C2988 c2988;
        int i2;
        C10445 c10445;
        C0751 c0751;
        int i3;
        int i4 = this.f31327;
        int i5 = 0;
        while (true) {
            c2988 = this.f31318;
            if (i5 >= i4 || this.f31328 + i5 >= c2988.f9697) {
                break;
            }
            C10445 c10446 = c2988.f9716[this.f31328 + i5];
            if (c10446 != null) {
                c10446.m26826();
            }
            i5++;
        }
        if (i4 == 0 || this.f31314 == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = z ? (i4 - 1) - i8 : i8;
            if (this.f31328 + i9 >= c2988.f9697) {
                break;
            }
            if (c2988.f9716[this.f31328 + i9].m26870() == 0) {
                if (i6 == -1) {
                    i6 = i8;
                }
                i7 = i8;
            }
        }
        if (this.f31312 != 0) {
            C10445 c10447 = this.f31314;
            c10447.f33198 = c2988.f9712;
            C0751 c0752 = c10447.f33212;
            C0751 c0753 = c10447.f33248;
            int i10 = this.f31329;
            if (i > 0) {
                i10 += c2988.f9715;
            }
            if (z) {
                c0753.m3104(this.f31321, i10);
                if (z2) {
                    c0752.m3104(this.f31320, this.f31322);
                }
                if (i > 0) {
                    this.f31321.f2747.f33212.m3104(c0753, 0);
                }
            } else {
                c0752.m3104(this.f31320, i10);
                if (z2) {
                    c0753.m3104(this.f31321, this.f31322);
                }
                if (i > 0) {
                    this.f31320.f2747.f33248.m3104(c0752, 0);
                }
            }
            C10445 c10448 = null;
            int i11 = 0;
            while (i11 < i4 && this.f31328 + i11 < c2988.f9697) {
                C10445 c10449 = c2988.f9716[this.f31328 + i11];
                if (i11 == 0) {
                    c10449.m26813(c10449.f33197, this.f31313, this.f31323);
                    int i12 = c2988.f9707;
                    float f = c2988.f9703;
                    if (this.f31328 == 0) {
                        i2 = -1;
                        if (c2988.f9717 != -1) {
                            i12 = c2988.f9717;
                            f = c2988.f9700;
                        }
                        c10449.f33219 = i12;
                        c10449.f33240 = f;
                    } else {
                        i2 = -1;
                    }
                    if (z2 && c2988.f9705 != i2) {
                        i12 = c2988.f9705;
                        f = c2988.f9713;
                    }
                    c10449.f33219 = i12;
                    c10449.f33240 = f;
                }
                if (i11 == i4 - 1) {
                    c10449.m26813(c10449.f33216, this.f31316, this.f31317);
                }
                if (c10448 != null) {
                    C0751 c0754 = c10448.f33216;
                    C0751 c0755 = c10449.f33197;
                    c0755.m3104(c0754, c2988.f9701);
                    if (i11 == i6) {
                        int i13 = this.f31323;
                        if (c0755.m3100()) {
                            c0755.f2745 = i13;
                        }
                    }
                    c0754.m3104(c0755, 0);
                    if (i11 == i7 + 1) {
                        int i14 = this.f31317;
                        if (c0754.m3100()) {
                            c0754.f2745 = i14;
                        }
                    }
                }
                if (c10449 != c10447) {
                    if (z) {
                        int i15 = c2988.f9698;
                        if (i15 == 0) {
                            c10449.f33248.m3104(c0753, 0);
                        } else if (i15 == 1) {
                            c10449.f33212.m3104(c0752, 0);
                        } else if (i15 == 2) {
                            c10449.f33212.m3104(c0752, 0);
                            c10449.f33248.m3104(c0753, 0);
                        }
                    } else {
                        int i16 = c2988.f9698;
                        if (i16 == 0) {
                            c10449.f33212.m3104(c0752, 0);
                        } else if (i16 == 1) {
                            c10449.f33248.m3104(c0753, 0);
                        } else if (i16 == 2) {
                            if (z3) {
                                c10449.f33212.m3104(this.f31320, this.f31329);
                                c10449.f33248.m3104(this.f31321, this.f31322);
                            } else {
                                c10449.f33212.m3104(c0752, 0);
                                c10449.f33248.m3104(c0753, 0);
                            }
                        }
                    }
                }
                i11++;
                c10448 = c10449;
            }
            return;
        }
        C10445 c104410 = this.f31314;
        c104410.f33219 = c2988.f9707;
        C0751 c0756 = c104410.f33216;
        C0751 c0757 = c104410.f33197;
        int i17 = this.f31323;
        if (i > 0) {
            i17 += c2988.f9701;
        }
        c0757.m3104(this.f31313, i17);
        if (z2) {
            c0756.m3104(this.f31316, this.f31317);
        }
        if (i > 0) {
            this.f31313.f2747.f33216.m3104(c0757, 0);
        }
        if (c2988.f9696 != 3 || c104410.m26849()) {
            c10445 = c104410;
            break;
        }
        int i18 = 0;
        while (true) {
            if (i18 < i4) {
                int i19 = z ? (i4 - 1) - i18 : i18;
                if (this.f31328 + i19 < c2988.f9697) {
                    c10445 = c2988.f9716[this.f31328 + i19];
                    if (c10445.m26849()) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            c10445 = c104410;
            break;
        }
        C10445 c104411 = null;
        int i20 = 0;
        while (i20 < i4) {
            int i21 = z ? (i4 - 1) - i20 : i20;
            if (this.f31328 + i21 >= c2988.f9697) {
                return;
            }
            C10445 c104412 = c2988.f9716[this.f31328 + i21];
            if (i20 == 0) {
                c104412.m26813(c104412.f33212, this.f31320, this.f31329);
            }
            if (i21 == 0) {
                int i22 = c2988.f9712;
                float f2 = c2988.f9708;
                if (this.f31328 == 0) {
                    i3 = -1;
                    if (c2988.f9706 != -1) {
                        i22 = c2988.f9706;
                        f2 = c2988.f9714;
                    }
                    c104412.f33198 = i22;
                    c104412.f33249 = f2;
                } else {
                    i3 = -1;
                }
                if (z2 && c2988.f9702 != i3) {
                    i22 = c2988.f9702;
                    f2 = c2988.f9694;
                }
                c104412.f33198 = i22;
                c104412.f33249 = f2;
            }
            if (i20 == i4 - 1) {
                c104412.m26813(c104412.f33248, this.f31321, this.f31322);
            }
            if (c104411 != null) {
                C0751 c0758 = c104411.f33248;
                C0751 c0759 = c104412.f33212;
                c0759.m3104(c0758, c2988.f9715);
                if (i20 == i6) {
                    int i23 = this.f31329;
                    if (c0759.m3100()) {
                        c0759.f2745 = i23;
                    }
                }
                c0758.m3104(c0759, 0);
                if (i20 == i7 + 1) {
                    int i24 = this.f31322;
                    if (c0758.m3100()) {
                        c0758.f2745 = i24;
                    }
                }
            }
            if (c104412 == c104410) {
                c0751 = c0756;
            } else {
                if (c2988.f9696 == 3 && c10445.m26849() && c104412 != c10445 && c104412.m26849()) {
                    c104412.f33202.m3104(c10445.f33202, 0);
                } else {
                    int i25 = c2988.f9696;
                    if (i25 == 0) {
                        c0751 = c0756;
                        c104412.f33197.m3104(c0757, 0);
                    } else if (i25 == 1) {
                        c0751 = c0756;
                        c104412.f33216.m3104(c0751, 0);
                    } else if (z3) {
                        c104412.f33197.m3104(this.f31313, this.f31323);
                        c104412.f33216.m3104(this.f31316, this.f31317);
                    } else {
                        c104412.f33197.m3104(c0757, 0);
                        c0751 = c0756;
                        c104412.f33216.m3104(c0751, 0);
                    }
                }
                c0751 = c0756;
            }
            i20++;
            c0756 = c0751;
            c104411 = c104412;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25294(int i) {
        C2988 c2988;
        int i2 = this.f31315;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f31327;
        int i4 = i / i2;
        int i5 = 0;
        while (true) {
            c2988 = this.f31318;
            if (i5 >= i3 || this.f31328 + i5 >= c2988.f9697) {
                break;
            }
            C10445 c10445 = c2988.f9716[this.f31328 + i5];
            if (this.f31312 == 0) {
                if (c10445 != null) {
                    EnumC19396[] enumC19396Arr = c10445.f33210;
                    if (enumC19396Arr[0] == EnumC19396.MATCH_CONSTRAINT && c10445.f33206 == 0) {
                        c2988.m49409(c10445, EnumC19396.FIXED, i4, enumC19396Arr[1], c10445.m26823());
                    }
                }
            } else if (c10445 != null) {
                EnumC19396[] enumC19396Arr2 = c10445.f33210;
                if (enumC19396Arr2[1] == EnumC19396.MATCH_CONSTRAINT && c10445.f33209 == 0) {
                    c2988.m49409(c10445, enumC19396Arr2[0], c10445.m26806(), EnumC19396.FIXED, i4);
                }
            }
            i5++;
        }
        this.f31325 = 0;
        this.f31324 = 0;
        this.f31314 = null;
        this.f31326 = 0;
        int i6 = this.f31327;
        for (int i7 = 0; i7 < i6 && this.f31328 + i7 < c2988.f9697; i7++) {
            C10445 c10446 = c2988.f9716[this.f31328 + i7];
            if (this.f31312 != 0) {
                int iM9728 = c2988.m9728(c10446, this.f31319);
                int iM9714 = c2988.m9714(c10446, this.f31319);
                int i8 = c2988.f9701;
                if (c10446.m26870() == 8) {
                    i8 = 0;
                }
                this.f31324 = iM9714 + i8 + this.f31324;
                if (this.f31314 == null || this.f31326 < iM9728) {
                    this.f31314 = c10446;
                    this.f31326 = iM9728;
                    this.f31325 = iM9728;
                }
            } else {
                int iM26806 = c10446.m26806();
                int i9 = c2988.f9715;
                if (c10446.m26870() == 8) {
                    i9 = 0;
                }
                this.f31325 = iM26806 + i9 + this.f31325;
                int iM9715 = c2988.m9714(c10446, this.f31319);
                if (this.f31314 == null || this.f31326 < iM9715) {
                    this.f31314 = c10446;
                    this.f31326 = iM9715;
                    this.f31324 = iM9715;
                }
            }
        }
    }
}
