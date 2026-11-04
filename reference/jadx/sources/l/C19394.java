package l;

/* JADX INFO: renamed from: l.ᩳ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M1RV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19394 extends AbstractC0749 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C1495 f62680;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f62681;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f62682;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C10443[] f62683;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f62684;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C17902 f62685;

    public C19394(C7461 c7461, int i, int i2, int i3, int i4, int i5, int i6, int i7, C0573 c0573) {
        super(c7461, AbstractC25362.m56713(i3, Math.max(i4, 4096), 4096, i5, i6, i7, c0573), i, i2, i3, i5);
        this.f62683 = new C10443[4096];
        this.f62684 = 0;
        this.f62681 = 0;
        this.f62682 = new int[4];
        this.f62680 = new C1495();
        for (int i8 = 0; i8 < 4096; i8++) {
            this.f62683[i8] = new C10443();
        }
    }

    @Override // l.AbstractC0749, l.AbstractC20886
    /* JADX INFO: renamed from: ۙ */
    public final void mo3090() {
        this.f62684 = 0;
        this.f62681 = 0;
        super.mo3090();
    }

    /* JADX WARN: Code duplicated, block: B:140:0x038f  */
    /* JADX WARN: Code duplicated, block: B:230:0x060d  */
    @Override // l.AbstractC0749
    /* JADX INFO: renamed from: ᩴ */
    public final int mo3097() {
        int[] iArr;
        int[] iArr2;
        int i;
        short[][] sArr;
        int i2;
        C14918 c14918;
        int i3;
        int i4;
        int i5;
        boolean z;
        short[] sArr2;
        C14918 c14919;
        int i6;
        int i7;
        C17902 c17902;
        int[] iArr3;
        int i8;
        int i9;
        int i10;
        int i11;
        C14918 c149110;
        int i12;
        int i13 = this.f62684;
        int i14 = this.f62681;
        C10443[] c10443Arr = this.f62683;
        if (i13 < i14) {
            int i15 = c10443Arr[i13].f33187;
            int i16 = i15 - i13;
            this.f62684 = i15;
            this.f2740 = c10443Arr[i15].f33180;
            return i16;
        }
        this.f62684 = 0;
        this.f62681 = 0;
        this.f2740 = -1;
        if (this.f2727 == -1) {
            this.f62685 = m3099();
        }
        AbstractC25362 abstractC25362 = this.f2729;
        int iMin = Math.min(abstractC25362.m56716(), 273);
        if (iMin >= 2) {
            int i17 = 0;
            int i18 = 0;
            while (true) {
                iArr = this.f66852;
                iArr2 = this.f62682;
                if (i17 >= 4) {
                    break;
                }
                int iM56726 = abstractC25362.m56726(iArr[i17], iMin);
                iArr2[i17] = iM56726;
                if (iM56726 < 2) {
                    iArr2[i17] = 0;
                } else if (iM56726 > iArr2[i18]) {
                    i18 = i17;
                }
                i17++;
            }
            int i19 = iArr2[i18];
            int i20 = this.f2739;
            if (i19 >= i20) {
                this.f2740 = i18;
                m3091(i19 - 1);
                return iArr2[i18];
            }
            C17902 c17903 = this.f62685;
            int i21 = c17903.f58641;
            if (i21 > 0) {
                int i22 = i21 - 1;
                i = c17903.f58642[i22];
                int i23 = c17903.f58643[i22];
                if (i >= i20) {
                    this.f2740 = i23 + 4;
                    m3091(i - 1);
                    return i;
                }
            } else {
                i = 0;
            }
            int iM56717 = abstractC25362.m56717(0);
            int iM56718 = abstractC25362.m56717(iArr[0] + 1);
            if (i >= 2 || iM56717 == iM56718 || iArr2[i18] >= 2) {
                int iM56722 = abstractC25362.m56722();
                int i24 = this.f66845;
                int i25 = iM56722 & i24;
                int iM56719 = abstractC25362.m56717(1);
                C18648 c18648 = this.f2741;
                C1495 c1495 = this.f66848;
                int i26 = iM56722;
                c10443Arr[1].m26797(c18648.m43410(iM56717, iM56718, iM56719, iM56722, c1495), 0, -1);
                int iM5322 = c1495.m5322();
                short[][] sArr3 = this.f66851;
                int iM20481 = C7461.m20481(sArr3[iM5322][i25], 1);
                int iM5323 = c1495.m5322();
                short[] sArr4 = this.f66849;
                int iM20482 = C7461.m20481(sArr4[iM5323], 1) + iM20481;
                short[][] sArr5 = this.f66846;
                int i27 = i20;
                short[] sArr6 = this.f66847;
                if (iM56718 == iM56717) {
                    sArr = sArr5;
                    int iM20483 = C7461.m20481(sArr5[c1495.m5322()][i25], 0) + C7461.m20481(sArr6[c1495.m5322()], 0) + iM20482;
                    C10443 c10443 = c10443Arr[1];
                    if (iM20483 < c10443.f33183) {
                        c10443.m26797(iM20483, 0, 0);
                    }
                } else {
                    sArr = sArr5;
                }
                int iMax = Math.max(i, iArr2[i18]);
                this.f62681 = iMax;
                if (iMax < 2) {
                    this.f2740 = c10443Arr[1].f33180;
                    return 1;
                }
                m3093();
                c10443Arr[0].f33179.m5323(c1495);
                System.arraycopy(iArr, 0, c10443Arr[0].f33181, 0, 4);
                int i28 = this.f62681;
                while (true) {
                    i2 = 2;
                    if (i28 < 2) {
                        break;
                    }
                    c10443Arr[i28].f33183 = 1073741824;
                    i28--;
                }
                int i29 = 0;
                while (true) {
                    c14918 = this.f2731;
                    if (i29 >= 4) {
                        break;
                    }
                    int i30 = iArr2[i29];
                    if (i30 < i2) {
                        i12 = iM20482;
                    } else {
                        int iM3088 = m3088(iM20482, i29, c1495, i25);
                        while (true) {
                            int iM35897 = c14918.m35897(i30, i25) + iM3088;
                            int i31 = iM3088;
                            C10443 c10444 = c10443Arr[i30];
                            i12 = iM20482;
                            if (iM35897 < c10444.f33183) {
                                c10444.m26797(iM35897, 0, i29);
                            }
                            i30--;
                            if (i30 < 2) {
                                break;
                            }
                            iM3088 = i31;
                            iM20482 = i12;
                        }
                    }
                    i29++;
                    i2 = 2;
                    iM20482 = i12;
                }
                int iMax2 = Math.max(iArr2[0] + 1, 2);
                if (iMax2 <= i) {
                    int iM20484 = C7461.m20481(sArr4[c1495.m5322()], 0) + iM20481;
                    int i32 = 0;
                    while (iMax2 > this.f62685.f58642[i32]) {
                        i32++;
                    }
                    while (true) {
                        int i33 = this.f62685.f58643[i32];
                        int iM3087 = m3087(iM20484, i33, iMax2, i25);
                        C10443 c10445 = c10443Arr[iMax2];
                        if (iM3087 < c10445.f33183) {
                            c10445.m26797(iM3087, 0, i33 + 4);
                        }
                        C17902 c17904 = this.f62685;
                        if (iMax2 == c17904.f58642[i32] && (i32 = i32 + 1) == c17904.f58641) {
                            break;
                        }
                        iMax2++;
                    }
                }
                int iMin2 = Math.min(abstractC25362.m56716(), 4095);
                while (true) {
                    int i34 = this.f62684 + 1;
                    this.f62684 = i34;
                    if (i34 >= this.f62681) {
                        break;
                    }
                    C17902 c17902M3099 = m3099();
                    this.f62685 = c17902M3099;
                    int i35 = c17902M3099.f58641;
                    if (i35 > 0) {
                        int i36 = c17902M3099.f58642[i35 - 1];
                        i3 = i27;
                        if (i36 >= i3) {
                            break;
                        }
                    } else {
                        i3 = i27;
                    }
                    int i37 = iMin2 - 1;
                    int i38 = i26 + 1;
                    int i39 = i38 & i24;
                    C10443 c10446 = c10443Arr[this.f62684];
                    int i40 = c10446.f33187;
                    C1495 c1496 = c10446.f33179;
                    if (c10446.f33184) {
                        i40--;
                        if (c10446.f33182) {
                            c1496.m5323(c10443Arr[c10446.f33185].f33179);
                            C10443 c10447 = c10443Arr[this.f62684];
                            int i41 = c10447.f33186;
                            C1495 c1497 = c10447.f33179;
                            if (i41 < 4) {
                                c1497.m5327();
                            } else {
                                c1497.m5326();
                            }
                        } else {
                            c1496.m5323(c10443Arr[i40].f33179);
                        }
                        c10443Arr[this.f62684].f33179.m5329();
                    } else {
                        c1496.m5323(c10443Arr[i40].f33179);
                    }
                    int i42 = this.f62684;
                    if (i40 == i42 - 1) {
                        C10443 c10448 = c10443Arr[i42];
                        int i43 = c10448.f33180;
                        C1495 c1498 = c10448.f33179;
                        if (i43 == 0) {
                            c1498.m5325();
                        } else {
                            c1498.m5329();
                        }
                        System.arraycopy(c10443Arr[i40].f33181, 0, c10443Arr[this.f62684].f33181, 0, 4);
                    } else {
                        C10443 c10449 = c10443Arr[i42];
                        boolean z2 = c10449.f33184;
                        C1495 c1499 = c10449.f33179;
                        if (z2 && c10449.f33182) {
                            i40 = c10449.f33185;
                            i4 = c10449.f33186;
                            c1499.m5327();
                            i5 = 4;
                        } else {
                            i4 = c10449.f33180;
                            i5 = 4;
                            if (i4 < 4) {
                                c1499.m5327();
                            } else {
                                c1499.m5326();
                            }
                        }
                        if (i4 < i5) {
                            c10443Arr[this.f62684].f33181[0] = c10443Arr[i40].f33181[i4];
                            int i44 = 1;
                            while (i44 <= i4) {
                                c10443Arr[this.f62684].f33181[i44] = c10443Arr[i40].f33181[i44 - 1];
                                i44++;
                            }
                            while (i44 < 4) {
                                c10443Arr[this.f62684].f33181[i44] = c10443Arr[i40].f33181[i44];
                                i44++;
                            }
                        } else {
                            int[] iArr4 = c10443Arr[this.f62684].f33181;
                            iArr4[0] = i4 - 4;
                            System.arraycopy(c10443Arr[i40].f33181, 0, iArr4, 1, 3);
                        }
                    }
                    C10443 c104410 = c10443Arr[this.f62684];
                    int iM20485 = C7461.m20481(sArr3[c104410.f33179.m5322()][i39], 1) + c104410.f33183;
                    int iM20486 = C7461.m20481(sArr4[c10443Arr[this.f62684].f33179.m5322()], 1) + iM20485;
                    int iM567110 = abstractC25362.m56717(0);
                    int iM567111 = abstractC25362.m56717(c10443Arr[this.f62684].f33181[0] + 1);
                    short[] sArr7 = sArr4;
                    C14918 c149111 = c14918;
                    int i45 = iM20486;
                    int iM43410 = c10443Arr[this.f62684].f33183 + this.f2741.m43410(iM567110, iM567111, abstractC25362.m56717(1), i38, c10443Arr[this.f62684].f33179);
                    int i46 = this.f62684;
                    C10443 c104411 = c10443Arr[i46 + 1];
                    if (iM43410 < c104411.f33183) {
                        c104411.m26797(iM43410, i46, -1);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (iM567111 == iM567110) {
                        int i47 = this.f62684;
                        C10443 c104412 = c10443Arr[i47 + 1];
                        if (c104412.f33187 == i47 || c104412.f33180 != 0) {
                            C1495 c14910 = c10443Arr[i47].f33179;
                            int iM20487 = C7461.m20481(sArr[c14910.m5322()][i39], 0) + C7461.m20481(sArr6[c14910.m5322()], 0) + i45;
                            int i48 = this.f62684;
                            C10443 c104413 = c10443Arr[i48 + 1];
                            sArr2 = sArr6;
                            if (iM20487 <= c104413.f33183) {
                                c104413.m26797(iM20487, i48, 0);
                                z = true;
                            }
                        } else {
                            sArr2 = sArr6;
                        }
                    } else {
                        sArr2 = sArr6;
                    }
                    C1495 c14911 = this.f62680;
                    if (!z && iM567111 != iM567110 && i37 > 2) {
                        int iM567112 = abstractC25362.m56719(1, c10443Arr[this.f62684].f33181[0], Math.min(i3, iMin2 - 2));
                        if (iM567112 >= 2) {
                            c14911.m5323(c10443Arr[this.f62684].f33179);
                            c14911.m5329();
                            int iM3089 = iM43410 + m3089(iM567112, c14911, (i26 + 2) & i24);
                            int i49 = this.f62684 + 1 + iM567112;
                            while (true) {
                                int i50 = this.f62681;
                                if (i50 >= i49) {
                                    break;
                                }
                                int i51 = i50 + 1;
                                this.f62681 = i51;
                                c10443Arr[i51].f33183 = 1073741824;
                            }
                            C10443 c104414 = c10443Arr[i49];
                            if (iM3089 < c104414.f33183) {
                                int i52 = this.f62684;
                                c104414.f33183 = iM3089;
                                c104414.f33187 = i52 + 1;
                                c104414.f33180 = 0;
                                c104414.f33184 = true;
                                c104414.f33182 = false;
                            }
                        }
                    }
                    int i53 = 2;
                    if (i37 >= 2) {
                        int iMin3 = Math.min(i37, i3);
                        int i54 = 2;
                        int i55 = 0;
                        while (i55 < 4) {
                            int iM56727 = abstractC25362.m56726(c10443Arr[this.f62684].f33181[i55], iMin3);
                            if (iM56727 < i53) {
                                i10 = iMin3;
                                i11 = i45;
                                c149110 = c149111;
                            } else {
                                while (true) {
                                    int i56 = this.f62681;
                                    i9 = this.f62684;
                                    if (i56 >= i9 + iM56727) {
                                        break;
                                    }
                                    int i57 = i56 + 1;
                                    this.f62681 = i57;
                                    c10443Arr[i57].f33183 = 1073741824;
                                }
                                int iM30810 = m3088(i45, i55, c10443Arr[i9].f33179, i39);
                                int i58 = iM56727;
                                while (i58 >= 2) {
                                    C14918 c149112 = c149111;
                                    int iM35898 = c149112.m35897(i58, i39) + iM30810;
                                    int i59 = iMin3;
                                    int i60 = this.f62684;
                                    int i61 = i45;
                                    C10443 c104415 = c10443Arr[i60 + i58];
                                    int i62 = i54;
                                    if (iM35898 < c104415.f33183) {
                                        c104415.m26797(iM35898, i60, i55);
                                    }
                                    i58--;
                                    iMin3 = i59;
                                    i54 = i62;
                                    i45 = i61;
                                    c149111 = c149112;
                                }
                                i10 = iMin3;
                                i11 = i45;
                                c149110 = c149111;
                                i54 = i55 == 0 ? iM56727 + 1 : i54;
                                int i63 = (i37 - iM56727) - 1;
                                if (i63 >= 2) {
                                    if (i63 > i3) {
                                        i63 = i3;
                                    }
                                    int iM567113 = abstractC25362.m56719(iM56727 + 1, c10443Arr[this.f62684].f33181[i55], i63);
                                    if (iM567113 >= 2) {
                                        int iM35899 = iM30810 + c149110.m35897(iM56727, i39);
                                        c14911.m5323(c10443Arr[this.f62684].f33179);
                                        c14911.m5327();
                                        int i64 = i38 + iM56727;
                                        int iM43411 = iM35899 + this.f2741.m43410(abstractC25362.m56718(iM56727, 0), abstractC25362.m56717(0), abstractC25362.m56718(iM56727, 1), i64, this.f62680);
                                        c14911.m5329();
                                        int iM30811 = iM43411 + m3089(iM567113, c14911, (i64 + 1) & i24);
                                        int iM54897 = C24579.m54897(this.f62684, iM56727, 1, iM567113);
                                        while (true) {
                                            int i65 = this.f62681;
                                            if (i65 >= iM54897) {
                                                break;
                                            }
                                            int i66 = i65 + 1;
                                            this.f62681 = i66;
                                            c10443Arr[i66].f33183 = 1073741824;
                                        }
                                        C10443 c104416 = c10443Arr[iM54897];
                                        if (iM30811 < c104416.f33183) {
                                            int i67 = this.f62684;
                                            c104416.f33183 = iM30811;
                                            c104416.f33187 = iM56727 + i67 + 1;
                                            c104416.f33180 = 0;
                                            c104416.f33184 = true;
                                            c104416.f33182 = true;
                                            c104416.f33185 = i67;
                                            c104416.f33186 = i55;
                                        }
                                    }
                                }
                            }
                            i55++;
                            i53 = 2;
                            c149111 = c149110;
                            iMin3 = i10;
                            i45 = i11;
                        }
                        c14919 = c149111;
                        int i68 = i54;
                        C17902 c17905 = this.f62685;
                        int i69 = c17905.f58641;
                        if (i69 > 0) {
                            if (c17905.f58642[i69 - 1] > i37) {
                                c17905.f58641 = 0;
                                while (true) {
                                    c17902 = this.f62685;
                                    iArr3 = c17902.f58642;
                                    i8 = c17902.f58641;
                                    if (iArr3[i8] >= i37) {
                                        break;
                                    }
                                    c17902.f58641 = i8 + 1;
                                }
                                c17902.f58641 = i8 + 1;
                                iArr3[i8] = i37;
                            }
                            C17902 c17906 = this.f62685;
                            int i70 = i68;
                            if (c17906.f58642[c17906.f58641 - 1] >= i70) {
                                while (true) {
                                    int i71 = this.f62681;
                                    i6 = this.f62684;
                                    C17902 c17907 = this.f62685;
                                    if (i71 >= c17907.f58642[c17907.f58641 - 1] + i6) {
                                        break;
                                    }
                                    int i72 = i71 + 1;
                                    this.f62681 = i72;
                                    c10443Arr[i72].f33183 = 1073741824;
                                }
                                short s = sArr7[c10443Arr[i6].f33179.m5322()];
                                int i73 = 0;
                                int iM20488 = C7461.m20481(s, 0) + iM20485;
                                while (i70 > this.f62685.f58642[i73]) {
                                    i73++;
                                }
                                while (true) {
                                    int i74 = this.f62685.f58643[i73];
                                    int iM30812 = m3087(iM20488, i74, i70, i39);
                                    int i75 = this.f62684;
                                    C10443 c104417 = c10443Arr[i75 + i70];
                                    if (iM30812 < c104417.f33183) {
                                        c104417.m26797(iM30812, i75, i74 + 4);
                                    }
                                    if (i70 != this.f62685.f58642[i73]) {
                                        i7 = iM20488;
                                    } else {
                                        int i76 = (i37 - i70) - 1;
                                        if (i76 < 2) {
                                            i7 = iM20488;
                                        } else {
                                            if (i76 > i3) {
                                                i76 = i3;
                                            }
                                            int iM567114 = abstractC25362.m56719(i70 + 1, i74, i76);
                                            if (iM567114 >= 2) {
                                                c14911.m5323(c10443Arr[this.f62684].f33179);
                                                c14911.m5326();
                                                int i77 = i38 + i70;
                                                i7 = iM20488;
                                                int iM43412 = iM30812 + this.f2741.m43410(abstractC25362.m56718(i70, 0), abstractC25362.m56717(0), abstractC25362.m56718(i70, 1), i77, this.f62680);
                                                c14911.m5329();
                                                int iM30813 = iM43412 + m3089(iM567114, c14911, (i77 + 1) & i24);
                                                int iM54898 = C24579.m54897(this.f62684, i70, 1, iM567114);
                                                while (true) {
                                                    int i78 = this.f62681;
                                                    if (i78 >= iM54898) {
                                                        break;
                                                    }
                                                    int i79 = i78 + 1;
                                                    this.f62681 = i79;
                                                    c10443Arr[i79].f33183 = 1073741824;
                                                }
                                                C10443 c104418 = c10443Arr[iM54898];
                                                if (iM30813 < c104418.f33183) {
                                                    int i80 = this.f62684;
                                                    c104418.f33183 = iM30813;
                                                    c104418.f33187 = i80 + i70 + 1;
                                                    c104418.f33180 = 0;
                                                    c104418.f33184 = true;
                                                    c104418.f33182 = true;
                                                    c104418.f33185 = i80;
                                                    c104418.f33186 = i74 + 4;
                                                }
                                            } else {
                                                i7 = iM20488;
                                            }
                                        }
                                        i73++;
                                        if (i73 == this.f62685.f58641) {
                                            break;
                                        }
                                    }
                                    i70++;
                                    iM20488 = i7;
                                }
                            }
                        }
                    } else {
                        c14919 = c149111;
                    }
                    iMin2 = i37;
                    i27 = i3;
                    c14918 = c14919;
                    sArr6 = sArr2;
                    sArr4 = sArr7;
                    i26 = i38;
                }
                int i81 = this.f62684;
                this.f62681 = i81;
                int i82 = c10443Arr[i81].f33187;
                while (true) {
                    int i83 = this.f62684;
                    C10443 c104419 = c10443Arr[i83];
                    if (c104419.f33184) {
                        C10443 c104420 = c10443Arr[i82];
                        c104420.f33187 = i83;
                        c104420.f33180 = -1;
                        int i84 = i82 - 1;
                        this.f62684 = i82;
                        if (c104419.f33182) {
                            C10443 c104421 = c10443Arr[i84];
                            c104421.f33187 = i82;
                            c104421.f33180 = c104419.f33186;
                            this.f62684 = i84;
                            i82 = c104419.f33185;
                        } else {
                            i82 = i84;
                        }
                    }
                    C10443 c104422 = c10443Arr[i82];
                    int i85 = c104422.f33187;
                    c104422.f33187 = this.f62684;
                    this.f62684 = i82;
                    if (i82 <= 0) {
                        int i86 = c10443Arr[0].f33187;
                        this.f62684 = i86;
                        this.f2740 = c10443Arr[i86].f33180;
                        return i86;
                    }
                    i82 = i85;
                }
            }
        }
        return 1;
    }
}
