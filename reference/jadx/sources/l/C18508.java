package l;

/* JADX INFO: renamed from: l.ᩴۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1RV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18508 extends AbstractC21330 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7925[] f58948;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C4396 f58949;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int[] f58950;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19214 f58951;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f58952;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f58953;

    public C18508(C20625 c20625, int i, int i2, int i3, int i4, int i5, int i6, int i7, C17720 c17720) {
        super(c20625, AbstractC9606.m24481(i3, Math.max(i4, 4096), 4096, i5, i6, i7, c17720), i, i2, i3, i5);
        this.f58948 = new C7925[4096];
        this.f58953 = 0;
        this.f58952 = 0;
        this.f58950 = new int[4];
        this.f58951 = new C19214();
        for (int i8 = 0; i8 < 4096; i8++) {
            this.f58948[i8] = new C7925();
        }
    }

    @Override // l.AbstractC21330, l.AbstractC5102
    /* JADX INFO: renamed from: ۙ */
    public final void mo10858() {
        this.f58953 = 0;
        this.f58952 = 0;
        super.mo10858();
    }

    /* JADX WARN: Code duplicated, block: B:140:0x038f  */
    /* JADX WARN: Code duplicated, block: B:230:0x060d  */
    @Override // l.AbstractC21330
    /* JADX INFO: renamed from: ۚ */
    public final int mo41381() {
        int[] iArr;
        int[] iArr2;
        int i;
        short[][] sArr;
        int i2;
        C6513 c6513;
        int i3;
        int i4;
        int i5;
        boolean z;
        short[] sArr2;
        C6513 c6514;
        int i6;
        int i7;
        C4396 c4396;
        int[] iArr3;
        int i8;
        int i9;
        int i10;
        int i11;
        C6513 c6515;
        int i12;
        int i13 = this.f58953;
        int i14 = this.f58952;
        C7925[] c7925Arr = this.f58948;
        if (i13 < i14) {
            int i15 = c7925Arr[i13].f26025;
            int i16 = i15 - i13;
            this.f58953 = i15;
            this.f69427 = c7925Arr[i15].f26027;
            return i16;
        }
        this.f58953 = 0;
        this.f58952 = 0;
        this.f69427 = -1;
        if (this.f69424 == -1) {
            this.f58949 = m47847();
        }
        AbstractC9606 abstractC9606 = this.f69430;
        int iMin = Math.min(abstractC9606.m24485(), 273);
        if (iMin >= 2) {
            int i17 = 0;
            int i18 = 0;
            while (true) {
                iArr = this.f17788;
                iArr2 = this.f58950;
                if (i17 >= 4) {
                    break;
                }
                int iM24495 = abstractC9606.m24495(iArr[i17], iMin);
                iArr2[i17] = iM24495;
                if (iM24495 < 2) {
                    iArr2[i17] = 0;
                } else if (iM24495 > iArr2[i18]) {
                    i18 = i17;
                }
                i17++;
            }
            int i19 = iArr2[i18];
            int i20 = this.f69429;
            if (i19 >= i20) {
                this.f69427 = i18;
                m47851(i19 - 1);
                return iArr2[i18];
            }
            C4396 c4397 = this.f58949;
            int i21 = c4397.f15652;
            if (i21 > 0) {
                int i22 = i21 - 1;
                i = c4397.f15653[i22];
                int i23 = c4397.f15654[i22];
                if (i >= i20) {
                    this.f69427 = i23 + 4;
                    m47851(i - 1);
                    return i;
                }
            } else {
                i = 0;
            }
            int iM24486 = abstractC9606.m24486(0);
            int iM24487 = abstractC9606.m24486(iArr[0] + 1);
            if (i >= 2 || iM24486 == iM24487 || iArr2[i18] >= 2) {
                int iM24493 = abstractC9606.m24493();
                int i24 = this.f17782;
                int i25 = iM24493 & i24;
                int iM24488 = abstractC9606.m24486(1);
                C14981 c14981 = this.f69418;
                C19214 c19214 = this.f17786;
                int i26 = iM24493;
                c7925Arr[1].m20928(c14981.m35956(iM24486, iM24487, iM24488, iM24493, c19214), 0, -1);
                int iM44132 = c19214.m44132();
                short[][] sArr3 = this.f17778;
                int iM46486 = C20625.m46486(sArr3[iM44132][i25], 1);
                int iM44133 = c19214.m44132();
                short[] sArr4 = this.f17781;
                int iM46487 = C20625.m46486(sArr4[iM44133], 1) + iM46486;
                short[][] sArr5 = this.f17777;
                int i27 = i20;
                short[] sArr6 = this.f17787;
                if (iM24487 == iM24486) {
                    sArr = sArr5;
                    int iM46488 = C20625.m46486(sArr5[c19214.m44132()][i25], 0) + C20625.m46486(sArr6[c19214.m44132()], 0) + iM46487;
                    C7925 c7925 = c7925Arr[1];
                    if (iM46488 < c7925.f26024) {
                        c7925.m20928(iM46488, 0, 0);
                    }
                } else {
                    sArr = sArr5;
                }
                int iMax = Math.max(i, iArr2[i18]);
                this.f58952 = iMax;
                if (iMax < 2) {
                    this.f69427 = c7925Arr[1].f26027;
                    return 1;
                }
                m47854();
                c7925Arr[0].f26026.m44133(c19214);
                System.arraycopy(iArr, 0, c7925Arr[0].f26030, 0, 4);
                int i28 = this.f58952;
                while (true) {
                    i2 = 2;
                    if (i28 < 2) {
                        break;
                    }
                    c7925Arr[i28].f26024 = 1073741824;
                    i28--;
                }
                int i29 = 0;
                while (true) {
                    c6513 = this.f69422;
                    if (i29 >= 4) {
                        break;
                    }
                    int i30 = iArr2[i29];
                    if (i30 < i2) {
                        i12 = iM46487;
                    } else {
                        int iM47849 = m47849(iM46487, i29, c19214, i25);
                        while (true) {
                            int iM17718 = c6513.m17718(i30, i25) + iM47849;
                            int i31 = iM47849;
                            C7925 c7926 = c7925Arr[i30];
                            i12 = iM46487;
                            if (iM17718 < c7926.f26024) {
                                c7926.m20928(iM17718, 0, i29);
                            }
                            i30--;
                            if (i30 < 2) {
                                break;
                            }
                            iM47849 = i31;
                            iM46487 = i12;
                        }
                    }
                    i29++;
                    i2 = 2;
                    iM46487 = i12;
                }
                int iMax2 = Math.max(iArr2[0] + 1, 2);
                if (iMax2 <= i) {
                    int iM46489 = C20625.m46486(sArr4[c19214.m44132()], 0) + iM46486;
                    int i32 = 0;
                    while (iMax2 > this.f58949.f15653[i32]) {
                        i32++;
                    }
                    while (true) {
                        int i33 = this.f58949.f15654[i32];
                        int iM47848 = m47848(iM46489, i33, iMax2, i25);
                        C7925 c7927 = c7925Arr[iMax2];
                        if (iM47848 < c7927.f26024) {
                            c7927.m20928(iM47848, 0, i33 + 4);
                        }
                        C4396 c4398 = this.f58949;
                        if (iMax2 == c4398.f15653[i32] && (i32 = i32 + 1) == c4398.f15652) {
                            break;
                        }
                        iMax2++;
                    }
                }
                int iMin2 = Math.min(abstractC9606.m24485(), 4095);
                while (true) {
                    int i34 = this.f58953 + 1;
                    this.f58953 = i34;
                    if (i34 >= this.f58952) {
                        break;
                    }
                    C4396 c4396M47847 = m47847();
                    this.f58949 = c4396M47847;
                    int i35 = c4396M47847.f15652;
                    if (i35 > 0) {
                        int i36 = c4396M47847.f15653[i35 - 1];
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
                    C7925 c7928 = c7925Arr[this.f58953];
                    int i40 = c7928.f26025;
                    C19214 c19215 = c7928.f26026;
                    if (c7928.f26032) {
                        i40--;
                        if (c7928.f26029) {
                            c19215.m44133(c7925Arr[c7928.f26028].f26026);
                            C7925 c7929 = c7925Arr[this.f58953];
                            int i41 = c7929.f26031;
                            C19214 c19216 = c7929.f26026;
                            if (i41 < 4) {
                                c19216.m44134();
                            } else {
                                c19216.m44137();
                            }
                        } else {
                            c19215.m44133(c7925Arr[i40].f26026);
                        }
                        c7925Arr[this.f58953].f26026.m44131();
                    } else {
                        c19215.m44133(c7925Arr[i40].f26026);
                    }
                    int i42 = this.f58953;
                    if (i40 == i42 - 1) {
                        C7925 c79210 = c7925Arr[i42];
                        int i43 = c79210.f26027;
                        C19214 c19217 = c79210.f26026;
                        if (i43 == 0) {
                            c19217.m44130();
                        } else {
                            c19217.m44131();
                        }
                        System.arraycopy(c7925Arr[i40].f26030, 0, c7925Arr[this.f58953].f26030, 0, 4);
                    } else {
                        C7925 c79211 = c7925Arr[i42];
                        boolean z2 = c79211.f26032;
                        C19214 c19218 = c79211.f26026;
                        if (z2 && c79211.f26029) {
                            i40 = c79211.f26028;
                            i4 = c79211.f26031;
                            c19218.m44134();
                            i5 = 4;
                        } else {
                            i4 = c79211.f26027;
                            i5 = 4;
                            if (i4 < 4) {
                                c19218.m44134();
                            } else {
                                c19218.m44137();
                            }
                        }
                        if (i4 < i5) {
                            c7925Arr[this.f58953].f26030[0] = c7925Arr[i40].f26030[i4];
                            int i44 = 1;
                            while (i44 <= i4) {
                                c7925Arr[this.f58953].f26030[i44] = c7925Arr[i40].f26030[i44 - 1];
                                i44++;
                            }
                            while (i44 < 4) {
                                c7925Arr[this.f58953].f26030[i44] = c7925Arr[i40].f26030[i44];
                                i44++;
                            }
                        } else {
                            int[] iArr4 = c7925Arr[this.f58953].f26030;
                            iArr4[0] = i4 - 4;
                            System.arraycopy(c7925Arr[i40].f26030, 0, iArr4, 1, 3);
                        }
                    }
                    C7925 c79212 = c7925Arr[this.f58953];
                    int iM464810 = C20625.m46486(sArr3[c79212.f26026.m44132()][i39], 1) + c79212.f26024;
                    int iM464811 = C20625.m46486(sArr4[c7925Arr[this.f58953].f26026.m44132()], 1) + iM464810;
                    int iM24489 = abstractC9606.m24486(0);
                    int iM244810 = abstractC9606.m24486(c7925Arr[this.f58953].f26030[0] + 1);
                    short[] sArr7 = sArr4;
                    C6513 c6516 = c6513;
                    int i45 = iM464811;
                    int iM35956 = c7925Arr[this.f58953].f26024 + this.f69418.m35956(iM24489, iM244810, abstractC9606.m24486(1), i38, c7925Arr[this.f58953].f26026);
                    int i46 = this.f58953;
                    C7925 c79213 = c7925Arr[i46 + 1];
                    if (iM35956 < c79213.f26024) {
                        c79213.m20928(iM35956, i46, -1);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (iM244810 == iM24489) {
                        int i47 = this.f58953;
                        C7925 c79214 = c7925Arr[i47 + 1];
                        if (c79214.f26025 == i47 || c79214.f26027 != 0) {
                            C19214 c19219 = c7925Arr[i47].f26026;
                            int iM464812 = C20625.m46486(sArr[c19219.m44132()][i39], 0) + C20625.m46486(sArr6[c19219.m44132()], 0) + i45;
                            int i48 = this.f58953;
                            C7925 c79215 = c7925Arr[i48 + 1];
                            sArr2 = sArr6;
                            if (iM464812 <= c79215.f26024) {
                                c79215.m20928(iM464812, i48, 0);
                                z = true;
                            }
                        } else {
                            sArr2 = sArr6;
                        }
                    } else {
                        sArr2 = sArr6;
                    }
                    C19214 c192110 = this.f58951;
                    if (!z && iM244810 != iM24489 && i37 > 2) {
                        int iM244811 = abstractC9606.m24488(1, c7925Arr[this.f58953].f26030[0], Math.min(i3, iMin2 - 2));
                        if (iM244811 >= 2) {
                            c192110.m44133(c7925Arr[this.f58953].f26026);
                            c192110.m44131();
                            int iM47850 = iM35956 + m47850(iM244811, c192110, (i26 + 2) & i24);
                            int i49 = this.f58953 + 1 + iM244811;
                            while (true) {
                                int i50 = this.f58952;
                                if (i50 >= i49) {
                                    break;
                                }
                                int i51 = i50 + 1;
                                this.f58952 = i51;
                                c7925Arr[i51].f26024 = 1073741824;
                            }
                            C7925 c79216 = c7925Arr[i49];
                            if (iM47850 < c79216.f26024) {
                                int i52 = this.f58953;
                                c79216.f26024 = iM47850;
                                c79216.f26025 = i52 + 1;
                                c79216.f26027 = 0;
                                c79216.f26032 = true;
                                c79216.f26029 = false;
                            }
                        }
                    }
                    int i53 = 2;
                    if (i37 >= 2) {
                        int iMin3 = Math.min(i37, i3);
                        int i54 = 2;
                        int i55 = 0;
                        while (i55 < 4) {
                            int iM24496 = abstractC9606.m24495(c7925Arr[this.f58953].f26030[i55], iMin3);
                            if (iM24496 < i53) {
                                i10 = iMin3;
                                i11 = i45;
                                c6515 = c6516;
                            } else {
                                while (true) {
                                    int i56 = this.f58952;
                                    i9 = this.f58953;
                                    if (i56 >= i9 + iM24496) {
                                        break;
                                    }
                                    int i57 = i56 + 1;
                                    this.f58952 = i57;
                                    c7925Arr[i57].f26024 = 1073741824;
                                }
                                int iM478410 = m47849(i45, i55, c7925Arr[i9].f26026, i39);
                                int i58 = iM24496;
                                while (i58 >= 2) {
                                    C6513 c6517 = c6516;
                                    int iM17719 = c6517.m17718(i58, i39) + iM478410;
                                    int i59 = iMin3;
                                    int i60 = this.f58953;
                                    int i61 = i45;
                                    C7925 c79217 = c7925Arr[i60 + i58];
                                    int i62 = i54;
                                    if (iM17719 < c79217.f26024) {
                                        c79217.m20928(iM17719, i60, i55);
                                    }
                                    i58--;
                                    iMin3 = i59;
                                    i54 = i62;
                                    i45 = i61;
                                    c6516 = c6517;
                                }
                                i10 = iMin3;
                                i11 = i45;
                                c6515 = c6516;
                                i54 = i55 == 0 ? iM24496 + 1 : i54;
                                int i63 = (i37 - iM24496) - 1;
                                if (i63 >= 2) {
                                    if (i63 > i3) {
                                        i63 = i3;
                                    }
                                    int iM244812 = abstractC9606.m24488(iM24496 + 1, c7925Arr[this.f58953].f26030[i55], i63);
                                    if (iM244812 >= 2) {
                                        int iM177110 = iM478410 + c6515.m17718(iM24496, i39);
                                        c192110.m44133(c7925Arr[this.f58953].f26026);
                                        c192110.m44134();
                                        int i64 = i38 + iM24496;
                                        int iM35957 = iM177110 + this.f69418.m35956(abstractC9606.m24487(iM24496, 0), abstractC9606.m24486(0), abstractC9606.m24487(iM24496, 1), i64, this.f58951);
                                        c192110.m44131();
                                        int iM47851 = iM35957 + m47850(iM244812, c192110, (i64 + 1) & i24);
                                        int iM21118 = C8015.m21118(this.f58953, iM24496, 1, iM244812);
                                        while (true) {
                                            int i65 = this.f58952;
                                            if (i65 >= iM21118) {
                                                break;
                                            }
                                            int i66 = i65 + 1;
                                            this.f58952 = i66;
                                            c7925Arr[i66].f26024 = 1073741824;
                                        }
                                        C7925 c79218 = c7925Arr[iM21118];
                                        if (iM47851 < c79218.f26024) {
                                            int i67 = this.f58953;
                                            c79218.f26024 = iM47851;
                                            c79218.f26025 = iM24496 + i67 + 1;
                                            c79218.f26027 = 0;
                                            c79218.f26032 = true;
                                            c79218.f26029 = true;
                                            c79218.f26028 = i67;
                                            c79218.f26031 = i55;
                                        }
                                    }
                                }
                            }
                            i55++;
                            i53 = 2;
                            c6516 = c6515;
                            iMin3 = i10;
                            i45 = i11;
                        }
                        c6514 = c6516;
                        int i68 = i54;
                        C4396 c4399 = this.f58949;
                        int i69 = c4399.f15652;
                        if (i69 > 0) {
                            if (c4399.f15653[i69 - 1] > i37) {
                                c4399.f15652 = 0;
                                while (true) {
                                    c4396 = this.f58949;
                                    iArr3 = c4396.f15653;
                                    i8 = c4396.f15652;
                                    if (iArr3[i8] >= i37) {
                                        break;
                                    }
                                    c4396.f15652 = i8 + 1;
                                }
                                c4396.f15652 = i8 + 1;
                                iArr3[i8] = i37;
                            }
                            C4396 c43910 = this.f58949;
                            int i70 = i68;
                            if (c43910.f15653[c43910.f15652 - 1] >= i70) {
                                while (true) {
                                    int i71 = this.f58952;
                                    i6 = this.f58953;
                                    C4396 c43911 = this.f58949;
                                    if (i71 >= c43911.f15653[c43911.f15652 - 1] + i6) {
                                        break;
                                    }
                                    int i72 = i71 + 1;
                                    this.f58952 = i72;
                                    c7925Arr[i72].f26024 = 1073741824;
                                }
                                short s = sArr7[c7925Arr[i6].f26026.m44132()];
                                int i73 = 0;
                                int iM464813 = C20625.m46486(s, 0) + iM464810;
                                while (i70 > this.f58949.f15653[i73]) {
                                    i73++;
                                }
                                while (true) {
                                    int i74 = this.f58949.f15654[i73];
                                    int iM478411 = m47848(iM464813, i74, i70, i39);
                                    int i75 = this.f58953;
                                    C7925 c79219 = c7925Arr[i75 + i70];
                                    if (iM478411 < c79219.f26024) {
                                        c79219.m20928(iM478411, i75, i74 + 4);
                                    }
                                    if (i70 != this.f58949.f15653[i73]) {
                                        i7 = iM464813;
                                    } else {
                                        int i76 = (i37 - i70) - 1;
                                        if (i76 < 2) {
                                            i7 = iM464813;
                                        } else {
                                            if (i76 > i3) {
                                                i76 = i3;
                                            }
                                            int iM244813 = abstractC9606.m24488(i70 + 1, i74, i76);
                                            if (iM244813 >= 2) {
                                                c192110.m44133(c7925Arr[this.f58953].f26026);
                                                c192110.m44137();
                                                int i77 = i38 + i70;
                                                i7 = iM464813;
                                                int iM35958 = iM478411 + this.f69418.m35956(abstractC9606.m24487(i70, 0), abstractC9606.m24486(0), abstractC9606.m24487(i70, 1), i77, this.f58951);
                                                c192110.m44131();
                                                int iM47852 = iM35958 + m47850(iM244813, c192110, (i77 + 1) & i24);
                                                int iM21119 = C8015.m21118(this.f58953, i70, 1, iM244813);
                                                while (true) {
                                                    int i78 = this.f58952;
                                                    if (i78 >= iM21119) {
                                                        break;
                                                    }
                                                    int i79 = i78 + 1;
                                                    this.f58952 = i79;
                                                    c7925Arr[i79].f26024 = 1073741824;
                                                }
                                                C7925 c79220 = c7925Arr[iM21119];
                                                if (iM47852 < c79220.f26024) {
                                                    int i80 = this.f58953;
                                                    c79220.f26024 = iM47852;
                                                    c79220.f26025 = i80 + i70 + 1;
                                                    c79220.f26027 = 0;
                                                    c79220.f26032 = true;
                                                    c79220.f26029 = true;
                                                    c79220.f26028 = i80;
                                                    c79220.f26031 = i74 + 4;
                                                }
                                            } else {
                                                i7 = iM464813;
                                            }
                                        }
                                        i73++;
                                        if (i73 == this.f58949.f15652) {
                                            break;
                                        }
                                    }
                                    i70++;
                                    iM464813 = i7;
                                }
                            }
                        }
                    } else {
                        c6514 = c6516;
                    }
                    iMin2 = i37;
                    i27 = i3;
                    c6513 = c6514;
                    sArr6 = sArr2;
                    sArr4 = sArr7;
                    i26 = i38;
                }
                int i81 = this.f58953;
                this.f58952 = i81;
                int i82 = c7925Arr[i81].f26025;
                while (true) {
                    int i83 = this.f58953;
                    C7925 c79221 = c7925Arr[i83];
                    if (c79221.f26032) {
                        C7925 c79222 = c7925Arr[i82];
                        c79222.f26025 = i83;
                        c79222.f26027 = -1;
                        int i84 = i82 - 1;
                        this.f58953 = i82;
                        if (c79221.f26029) {
                            C7925 c79223 = c7925Arr[i84];
                            c79223.f26025 = i82;
                            c79223.f26027 = c79221.f26031;
                            this.f58953 = i84;
                            i82 = c79221.f26028;
                        } else {
                            i82 = i84;
                        }
                    }
                    C7925 c79224 = c7925Arr[i82];
                    int i85 = c79224.f26025;
                    c79224.f26025 = this.f58953;
                    this.f58953 = i82;
                    if (i82 <= 0) {
                        int i86 = c7925Arr[0].f26025;
                        this.f58953 = i86;
                        this.f69427 = c7925Arr[i86].f26027;
                        return i86;
                    }
                    i82 = i85;
                }
            }
        }
        return 1;
    }
}
