package l;

/* JADX INFO: renamed from: l.᩶۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20014 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f64096;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f64098;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f64101;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C8725 f64102;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0257 f64103;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C8725 f64104;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f64107;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C8725 f64108;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f64111;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C8725 f64112;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f64113;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20719 f64099 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f64106 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f64110 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f64100 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f64109 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f64097 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f64105 = 0;

    public C20014(C0257 c0257, int i, C8725 c8725, C8725 c8726, C8725 c8727, C8725 c8728, int i2) {
        this.f64103 = c0257;
        this.f64113 = 0;
        this.f64111 = 0;
        this.f64107 = 0;
        this.f64101 = 0;
        this.f64096 = 0;
        this.f64098 = i;
        this.f64112 = c8725;
        this.f64102 = c8726;
        this.f64108 = c8727;
        this.f64104 = c8728;
        this.f64113 = c0257.m27197();
        this.f64111 = c0257.m27196();
        this.f64107 = c0257.m27190();
        this.f64101 = c0257.m27184();
        this.f64096 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45330(int i, C8725 c8725, C8725 c8726, C8725 c8727, C8725 c8728, int i2, int i3, int i4, int i5, int i6) {
        this.f64098 = i;
        this.f64112 = c8725;
        this.f64102 = c8726;
        this.f64108 = c8727;
        this.f64104 = c8728;
        this.f64113 = i2;
        this.f64111 = i3;
        this.f64107 = i4;
        this.f64101 = i5;
        this.f64096 = i6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45328() {
        this.f64106 = 0;
        this.f64099 = null;
        this.f64110 = 0;
        this.f64100 = 0;
        this.f64109 = 0;
        this.f64097 = 0;
        this.f64105 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45335(int i) {
        this.f64109 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m45333() {
        if (this.f64098 == 0) {
            return this.f64110 - this.f64103.f1523;
        }
        return this.f64110;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m45334() {
        if (this.f64098 == 1) {
            return this.f64100 - this.f64103.f1511;
        }
        return this.f64100;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45332(C20719 c20719) {
        int i = this.f64098;
        C0257 c0257 = this.f64103;
        if (i == 0) {
            int iM1730 = c0257.m1730(c20719, this.f64096);
            if (c20719.f67434[0] == EnumC7313.MATCH_CONSTRAINT) {
                this.f64105++;
                iM1730 = 0;
            }
            this.f64110 = iM1730 + (c20719.m46606() != 8 ? c0257.f1523 : 0) + this.f64110;
            int iM1721 = c0257.m1721(c20719, this.f64096);
            if (this.f64099 == null || this.f64106 < iM1721) {
                this.f64099 = c20719;
                this.f64106 = iM1721;
                this.f64100 = iM1721;
            }
        } else {
            int iM1731 = c0257.m1730(c20719, this.f64096);
            int iM1722 = c0257.m1721(c20719, this.f64096);
            if (c20719.f67434[1] == EnumC7313.MATCH_CONSTRAINT) {
                this.f64105++;
                iM1722 = 0;
            }
            this.f64100 = iM1722 + (c20719.m46606() != 8 ? c0257.f1511 : 0) + this.f64100;
            if (this.f64099 == null || this.f64106 < iM1731) {
                this.f64099 = c20719;
                this.f64106 = iM1731;
                this.f64110 = iM1731;
            }
        }
        this.f64097++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45331(int i, boolean z, boolean z2) {
        C0257 c0257;
        int i2;
        C20719 c20719;
        C8725 c8725;
        int i3;
        int i4 = this.f64097;
        int i5 = 0;
        while (true) {
            c0257 = this.f64103;
            if (i5 >= i4 || this.f64109 + i5 >= c0257.f1509) {
                break;
            }
            C20719 c207110 = c0257.f1521[this.f64109 + i5];
            if (c207110 != null) {
                c207110.m46611();
            }
            i5++;
        }
        if (i4 == 0 || this.f64099 == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = z ? (i4 - 1) - i8 : i8;
            if (this.f64109 + i9 >= c0257.f1509) {
                break;
            }
            if (c0257.f1521[this.f64109 + i9].m46606() == 0) {
                if (i6 == -1) {
                    i6 = i8;
                }
                i7 = i8;
            }
        }
        if (this.f64098 != 0) {
            C20719 c207111 = this.f64099;
            c207111.f67426 = c0257.f1503;
            C8725 c8726 = c207111.f67385;
            C8725 c8727 = c207111.f67421;
            int i10 = this.f64113;
            if (i > 0) {
                i10 += c0257.f1523;
            }
            if (z) {
                c8727.m22572(this.f64108, i10);
                if (z2) {
                    c8726.m22572(this.f64112, this.f64107);
                }
                if (i > 0) {
                    this.f64108.f29983.f67385.m22572(c8727, 0);
                }
            } else {
                c8726.m22572(this.f64112, i10);
                if (z2) {
                    c8727.m22572(this.f64108, this.f64107);
                }
                if (i > 0) {
                    this.f64112.f29983.f67421.m22572(c8726, 0);
                }
            }
            C20719 c207112 = null;
            int i11 = 0;
            while (i11 < i4 && this.f64109 + i11 < c0257.f1509) {
                C20719 c207113 = c0257.f1521[this.f64109 + i11];
                if (i11 == 0) {
                    c207113.m46592(c207113.f67392, this.f64102, this.f64111);
                    int i12 = c0257.f1505;
                    float f = c0257.f1504;
                    if (this.f64109 == 0) {
                        i2 = -1;
                        if (c0257.f1508 != -1) {
                            i12 = c0257.f1508;
                            f = c0257.f1512;
                        }
                        c207113.f67394 = i12;
                        c207113.f67423 = f;
                    } else {
                        i2 = -1;
                    }
                    if (z2 && c0257.f1507 != i2) {
                        i12 = c0257.f1507;
                        f = c0257.f1519;
                    }
                    c207113.f67394 = i12;
                    c207113.f67423 = f;
                }
                if (i11 == i4 - 1) {
                    c207113.m46592(c207113.f67387, this.f64104, this.f64101);
                }
                if (c207112 != null) {
                    C8725 c8728 = c207112.f67387;
                    C8725 c8729 = c207113.f67392;
                    c8729.m22572(c8728, c0257.f1511);
                    if (i11 == i6) {
                        int i13 = this.f64111;
                        if (c8729.m22568()) {
                            c8729.f29980 = i13;
                        }
                    }
                    c8728.m22572(c8729, 0);
                    if (i11 == i7 + 1) {
                        int i14 = this.f64101;
                        if (c8728.m22568()) {
                            c8728.f29980 = i14;
                        }
                    }
                }
                if (c207113 != c207111) {
                    if (z) {
                        int i15 = c0257.f1524;
                        if (i15 == 0) {
                            c207113.f67421.m22572(c8727, 0);
                        } else if (i15 == 1) {
                            c207113.f67385.m22572(c8726, 0);
                        } else if (i15 == 2) {
                            c207113.f67385.m22572(c8726, 0);
                            c207113.f67421.m22572(c8727, 0);
                        }
                    } else {
                        int i16 = c0257.f1524;
                        if (i16 == 0) {
                            c207113.f67385.m22572(c8726, 0);
                        } else if (i16 == 1) {
                            c207113.f67421.m22572(c8727, 0);
                        } else if (i16 == 2) {
                            if (z3) {
                                c207113.f67385.m22572(this.f64112, this.f64113);
                                c207113.f67421.m22572(this.f64108, this.f64107);
                            } else {
                                c207113.f67385.m22572(c8726, 0);
                                c207113.f67421.m22572(c8727, 0);
                            }
                        }
                    }
                }
                i11++;
                c207112 = c207113;
            }
            return;
        }
        C20719 c207114 = this.f64099;
        c207114.f67394 = c0257.f1505;
        C8725 c87210 = c207114.f67387;
        C8725 c87211 = c207114.f67392;
        int i17 = this.f64111;
        if (i > 0) {
            i17 += c0257.f1511;
        }
        c87211.m22572(this.f64102, i17);
        if (z2) {
            c87210.m22572(this.f64104, this.f64101);
        }
        if (i > 0) {
            this.f64102.f29983.f67387.m22572(c87211, 0);
        }
        if (c0257.f1515 != 3 || c207114.m46574()) {
            c20719 = c207114;
            break;
        }
        int i18 = 0;
        while (true) {
            if (i18 < i4) {
                int i19 = z ? (i4 - 1) - i18 : i18;
                if (this.f64109 + i19 < c0257.f1509) {
                    c20719 = c0257.f1521[this.f64109 + i19];
                    if (c20719.m46574()) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            c20719 = c207114;
            break;
        }
        C20719 c207115 = null;
        int i20 = 0;
        while (i20 < i4) {
            int i21 = z ? (i4 - 1) - i20 : i20;
            if (this.f64109 + i21 >= c0257.f1509) {
                return;
            }
            C20719 c207116 = c0257.f1521[this.f64109 + i21];
            if (i20 == 0) {
                c207116.m46592(c207116.f67385, this.f64112, this.f64113);
            }
            if (i21 == 0) {
                int i22 = c0257.f1503;
                float f2 = c0257.f1517;
                if (this.f64109 == 0) {
                    i3 = -1;
                    if (c0257.f1510 != -1) {
                        i22 = c0257.f1510;
                        f2 = c0257.f1522;
                    }
                    c207116.f67426 = i22;
                    c207116.f67389 = f2;
                } else {
                    i3 = -1;
                }
                if (z2 && c0257.f1514 != i3) {
                    i22 = c0257.f1514;
                    f2 = c0257.f1518;
                }
                c207116.f67426 = i22;
                c207116.f67389 = f2;
            }
            if (i20 == i4 - 1) {
                c207116.m46592(c207116.f67421, this.f64108, this.f64107);
            }
            if (c207115 != null) {
                C8725 c87212 = c207115.f67421;
                C8725 c87213 = c207116.f67385;
                c87213.m22572(c87212, c0257.f1523);
                if (i20 == i6) {
                    int i23 = this.f64113;
                    if (c87213.m22568()) {
                        c87213.f29980 = i23;
                    }
                }
                c87212.m22572(c87213, 0);
                if (i20 == i7 + 1) {
                    int i24 = this.f64107;
                    if (c87212.m22568()) {
                        c87212.f29980 = i24;
                    }
                }
            }
            if (c207116 == c207114) {
                c8725 = c87210;
            } else {
                if (c0257.f1515 == 3 && c20719.m46574() && c207116 != c20719 && c207116.m46574()) {
                    c207116.f67404.m22572(c20719.f67404, 0);
                } else {
                    int i25 = c0257.f1515;
                    if (i25 == 0) {
                        c8725 = c87210;
                        c207116.f67392.m22572(c87211, 0);
                    } else if (i25 == 1) {
                        c8725 = c87210;
                        c207116.f67387.m22572(c8725, 0);
                    } else if (z3) {
                        c207116.f67392.m22572(this.f64102, this.f64111);
                        c207116.f67387.m22572(this.f64104, this.f64101);
                    } else {
                        c207116.f67392.m22572(c87211, 0);
                        c8725 = c87210;
                        c207116.f67387.m22572(c8725, 0);
                    }
                }
                c8725 = c87210;
            }
            i20++;
            c87210 = c8725;
            c207115 = c207116;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45329(int i) {
        C0257 c0257;
        int i2 = this.f64105;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f64097;
        int i4 = i / i2;
        int i5 = 0;
        while (true) {
            c0257 = this.f64103;
            if (i5 >= i3 || this.f64109 + i5 >= c0257.f1509) {
                break;
            }
            C20719 c20719 = c0257.f1521[this.f64109 + i5];
            if (this.f64098 == 0) {
                if (c20719 != null) {
                    EnumC7313[] enumC7313Arr = c20719.f67434;
                    if (enumC7313Arr[0] == EnumC7313.MATCH_CONSTRAINT && c20719.f67395 == 0) {
                        c0257.m27182(c20719, EnumC7313.FIXED, i4, enumC7313Arr[1], c20719.m46619());
                    }
                }
            } else if (c20719 != null) {
                EnumC7313[] enumC7313Arr2 = c20719.f67434;
                if (enumC7313Arr2[1] == EnumC7313.MATCH_CONSTRAINT && c20719.f67375 == 0) {
                    c0257.m27182(c20719, enumC7313Arr2[0], c20719.m46640(), EnumC7313.FIXED, i4);
                }
            }
            i5++;
        }
        this.f64110 = 0;
        this.f64100 = 0;
        this.f64099 = null;
        this.f64106 = 0;
        int i6 = this.f64097;
        for (int i7 = 0; i7 < i6 && this.f64109 + i7 < c0257.f1509; i7++) {
            C20719 c207110 = c0257.f1521[this.f64109 + i7];
            if (this.f64098 != 0) {
                int iM1730 = c0257.m1730(c207110, this.f64096);
                int iM1721 = c0257.m1721(c207110, this.f64096);
                int i8 = c0257.f1511;
                if (c207110.m46606() == 8) {
                    i8 = 0;
                }
                this.f64100 = iM1721 + i8 + this.f64100;
                if (this.f64099 == null || this.f64106 < iM1730) {
                    this.f64099 = c207110;
                    this.f64106 = iM1730;
                    this.f64110 = iM1730;
                }
            } else {
                int iM46640 = c207110.m46640();
                int i9 = c0257.f1523;
                if (c207110.m46606() == 8) {
                    i9 = 0;
                }
                this.f64110 = iM46640 + i9 + this.f64110;
                int iM1722 = c0257.m1721(c207110, this.f64096);
                if (this.f64099 == null || this.f64106 < iM1722) {
                    this.f64099 = c207110;
                    this.f64106 = iM1722;
                    this.f64100 = iM1722;
                }
            }
        }
    }
}
