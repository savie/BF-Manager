package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸ᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6PB */
/* JADX INFO: loaded from: classes4.dex */
public final class C21766 {
    /* JADX WARN: Code duplicated, block: B:296:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:297:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:300:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:301:0x04d5  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6618 m48522(C4853 c4853) {
        int[] iArr;
        int[] iArr2;
        int iM36885;
        ArrayList arrayList;
        int i;
        C15417 c15417;
        int i2;
        C12969[] c12969Arr;
        int i3;
        int i4;
        ArrayList arrayList2;
        int[] iArr3;
        ArrayList arrayList3;
        int[] iArrM49106;
        int[] iArr4;
        int i5;
        int i6;
        byte b;
        C15417 c15418;
        int i7;
        C6264 c6264;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr5;
        C13052 c13052;
        int[] iArr6;
        C23595 c23595;
        int i13 = c4853.f17091;
        int i14 = i13 & 512;
        boolean z = i14 != 0;
        C23595 c23596 = c4853.f17094;
        boolean z2 = (i14 != 0) | z;
        if ((i13 & (-1024)) != 0) {
            throw new UnsupportedOperationException("Regex program does not support flags: " + c4853.f17091);
        }
        C15417 c15419 = new C15417(c4853.f17084, z2);
        int iM36886 = c15419.m36885(c4853.f17083);
        C13052 c13052M49107 = C22141.m49107(c23596);
        C13052 c13052M49108 = (c13052M49107 == null || (c23595 = c13052M49107.f43504) == null) ? null : C22141.m49107(c23595);
        if (c13052M49107 != null && c13052M49107.f43504 != null && c13052M49108 == null) {
            throw new UnsupportedOperationException("Unknown regex search fallback");
        }
        if (c13052M49107 == null) {
            iArr = null;
        } else {
            int iM36887 = c15419.m36885(c13052M49107.f43510);
            C23595 c23597 = c13052M49107.f43506;
            iArr = new int[]{iM36887, c23597 == null ? -1 : c15419.m36885(c23597)};
        }
        if (c13052M49108 == null) {
            iArr2 = null;
        } else {
            int iM36888 = c15419.m36885(c13052M49108.f43510);
            C23595 c23598 = c13052M49108.f43506;
            iArr2 = new int[]{iM36888, c23598 == null ? -1 : c15419.m36885(c23598)};
        }
        Class<?> cls = c23596.getClass();
        C6264 c6265 = (cls == C6264.class || cls == C11204.class) ? (C6264) c23596 : null;
        int iM36889 = c6265 == null ? -1 : c15419.m36885(c6265.f76439);
        if (c6265 != null) {
            iM36885 = iM36886;
        } else {
            if (c23596 instanceof C19402) {
                c23596 = c23596.f76439;
            }
            iM36885 = c15419.m36885(c23596);
        }
        int i15 = 0;
        while (true) {
            arrayList = c15419.f50253;
            if (i15 >= arrayList.size()) {
                break;
            }
            c15419.m36886((C23595) arrayList.get(i15), i15 * 8);
            i15++;
        }
        int[] iArr7 = c15419.f50254;
        ArrayList arrayList4 = c15419.f50260;
        C0973 c0973M3764 = C0973.m3764(iArr7, arrayList4, iM36886);
        int size = arrayList.size();
        int[] iArr8 = new int[size];
        c15419.f50259 = iArr8;
        Arrays.fill(iArr8, -1);
        int[] iArr9 = new int[size];
        int i16 = 0;
        while (true) {
            boolean z3 = c15419.f50261;
            if (i16 >= size) {
                C13052 c13053 = c13052M49107;
                C13052 c13054 = c13052M49108;
                int[] iArr10 = iArr;
                int[] iArr11 = iArr2;
                int i17 = 0;
                while (true) {
                    i = size * 8;
                    if (i17 >= i) {
                        break;
                    }
                    int[] iArr12 = c15419.f50254;
                    int i18 = i17 + 1;
                    int i19 = iArr12[i18];
                    if (i19 != -1) {
                        iArr12[i18] = c15419.f50259[i19 / 8];
                    }
                    int i20 = iArr12[i17];
                    if (i20 == 6) {
                        int[] iArr13 = (int[]) arrayList4.get(iArr12[i17 + 2]);
                        for (int i21 = 0; i21 < iArr13.length; i21++) {
                            iArr13[i21] = c15419.f50259[iArr13[i21] / 8];
                        }
                    } else if (i20 == 10 || i20 == 9 || i20 == 19 || i20 == 18 || i20 == 27 || i20 == 26) {
                        int i22 = i17 + 6;
                        iArr12[i22] = c15419.f50259[iArr12[i22] / 8];
                    } else if (i20 == 22 || i20 == 25) {
                        int i23 = i17 + 3;
                        iArr12[i23] = c15419.f50259[iArr12[i23] / 8];
                    }
                    i17 += 8;
                }
                int i24 = 0;
                while (i24 < i && !z3) {
                    int[] iArr14 = c15419.f50254;
                    int i25 = iArr14[i24];
                    if (i25 == 10 || i25 == 9) {
                        i7 = i;
                        c6264 = c6265;
                        i8 = iM36889;
                        int i26 = i24 + 6;
                        int i27 = iArr14[i26];
                        if (iArr14[i27] == 7 && iArr14[i27 + 2] == iArr14[i24 + 3]) {
                            iArr14[i26] = iArr14[i27 + 1];
                            iArr14[i24 + 7] = 1;
                        }
                    } else if (i25 == 7) {
                        int i28 = i24 + 1;
                        int i29 = iArr14[i28];
                        boolean z4 = iArr14[i29] == 1;
                        int i30 = z4 ? iArr14[i29 + 1] : i29;
                        i7 = i;
                        if (iArr14[i30] != 4) {
                            c6264 = c6265;
                            i8 = iM36889;
                        } else {
                            int i31 = iArr14[i30 + 1];
                            i8 = iM36889;
                            if (iArr14[i31] == 8) {
                                int i32 = i24 + 2;
                                c6264 = c6265;
                                if (iArr14[i31 + 2] == iArr14[i32] && (i11 = iArr14[i31 + 3]) > 0 && iArr14[iArr14[i31 + 1]] == 0) {
                                    int i33 = iArr14[i30 + 2];
                                    int i34 = iArr14[i30 + 3];
                                    iArr14[i24] = z4 ? 12 : 13;
                                    iArr14[i28] = -1;
                                    iArr14[i32] = z4 ? iArr14[i29 + 2] : i33;
                                    int i35 = i24 + 3;
                                    if (!z4) {
                                        i33 = i34;
                                    }
                                    iArr14[i35] = i33;
                                    iArr14[i24 + 4] = i11;
                                    int i36 = i24 + 5;
                                    if (!z4) {
                                        i34 = 0;
                                    }
                                    iArr14[i36] = i34;
                                }
                            } else {
                                c6264 = c6265;
                            }
                        }
                    } else {
                        i7 = i;
                        c6264 = c6265;
                        i8 = iM36889;
                        if (i25 == 14 && (((i10 = iArr14[(i9 = iArr14[i24 + 1])]) == 1 || i10 == 3) && iArr14[iArr14[i9 + 1]] == 0)) {
                            iArr14[i24 + 3] = 1;
                        }
                    }
                    i24 += 8;
                    i = i7;
                    iM36889 = i8;
                    c6265 = c6264;
                }
                C6264 c6266 = c6265;
                int i37 = iM36889;
                int i38 = 0;
                C12969[] c12969Arr2 = null;
                C6949 c6949 = null;
                while (i38 < arrayList.size() * 8) {
                    if (c15419.f50254[i38] != 6) {
                        c15417 = c15419;
                        i2 = iM36886;
                        i3 = iM36885;
                        arrayList3 = arrayList;
                    } else {
                        if (c12969Arr2 == null) {
                            c12969Arr2 = new C12969[arrayList4.size()];
                        }
                        int i39 = c15419.f50254[i38 + 2];
                        int[] iArr15 = (int[]) arrayList4.get(i39);
                        if (z3 || iArr15.length <= 0 || iArr15.length > 31) {
                            c15417 = c15419;
                            i2 = iM36886;
                            c12969Arr = c12969Arr2;
                            i3 = iM36885;
                            i4 = i39;
                            arrayList2 = arrayList;
                        } else {
                            if (c6949 == null) {
                                c6949 = new C6949(arrayList.size());
                            }
                            long[] jArr = c6949.f23374;
                            long[] jArr2 = c6949.f23372;
                            iArr3 = new int[128];
                            int i40 = 0;
                            while (i40 < iArr15.length) {
                                int i41 = iArr15[i40];
                                int i42 = iM36885;
                                byte[] bArr = c6949.f23373;
                                int i43 = i41 / 8;
                                C6949 c69410 = c6949;
                                int i44 = iM36886;
                                if (bArr[i43] != 2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    bArr[i43] = 1;
                                    arrayList5.add(new C23178(i41));
                                    int i45 = 1;
                                    while (!arrayList5.isEmpty()) {
                                        C23178 c23178 = (C23178) C19084.m43861(arrayList5, i45);
                                        int i46 = c23178.f75222;
                                        int i47 = i46 / 8;
                                        C12969[] c12969Arr3 = c12969Arr2;
                                        int[] iArr16 = c15419.f50254;
                                        int i48 = i39;
                                        int i49 = iArr16[i46];
                                        ArrayList arrayList6 = arrayList;
                                        if (i49 == 7 || i49 == 11) {
                                            i5 = 6;
                                        } else {
                                            i5 = 6;
                                            if (i49 != 6) {
                                                if (i49 == 3) {
                                                    int[] iArr17 = (int[]) arrayList4.get(iArr16[i46 + 2]);
                                                    if (iArr17.length == 0) {
                                                        jArr2[i47] = -1;
                                                        jArr[i47] = -1;
                                                    } else {
                                                        int i50 = iArr17[0];
                                                        if (i50 >= 0 && i50 < 128) {
                                                            if (i50 < 64) {
                                                                jArr[i47] = 1 << i50;
                                                            } else {
                                                                jArr2[i47] = 1 << i50;
                                                            }
                                                        }
                                                    }
                                                } else if (i49 == 1 || i49 == 2 || i49 == 12 || ((i49 == 4 || i49 == 5 || i49 == 13) && iArr16[i46 + 3] > 0)) {
                                                    InterfaceC13717 interfaceC13717 = (InterfaceC13717) arrayList4.get(iArr16[i46 + 2]);
                                                    for (int i51 = 0; i51 < 128; i51++) {
                                                        if (interfaceC13717.mo1813(i51)) {
                                                            if (i51 < 64) {
                                                                jArr[i47] = jArr[i47] | (1 << i51);
                                                            } else {
                                                                jArr2[i47] = jArr2[i47] | (1 << i51);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    jArr2[i47] = -1;
                                                    jArr[i47] = -1;
                                                }
                                                bArr[i47] = 2;
                                            }
                                            C19028.m43762(arrayList5, 1);
                                            c15418 = c15419;
                                            i45 = 1;
                                            c15419 = c15418;
                                            c12969Arr2 = c12969Arr3;
                                            i39 = i48;
                                            arrayList = arrayList6;
                                        }
                                        int[] iArr18 = i49 == i5 ? (int[]) arrayList4.get(iArr16[i46 + 2]) : null;
                                        int length = iArr18 == null ? 1 : iArr18.length;
                                        int i52 = c23178.f75221;
                                        if (i52 == length) {
                                            bArr[i47] = 2;
                                            C19028.m43762(arrayList5, 1);
                                            c15418 = c15419;
                                        } else {
                                            if (iArr18 == null) {
                                                b = 1;
                                                i6 = c15419.f50254[c23178.f75222 + 1];
                                            } else {
                                                i6 = iArr18[i52];
                                                b = 1;
                                            }
                                            int i53 = i6 / 8;
                                            c15418 = c15419;
                                            byte b2 = bArr[i53];
                                            if (b2 == 0) {
                                                bArr[i53] = b;
                                                arrayList5.add(new C23178(i6));
                                            } else {
                                                if (b2 == 1) {
                                                    jArr2[i47] = -1;
                                                    jArr[i47] = -1;
                                                } else {
                                                    jArr[i47] = jArr[i47] | jArr[i53];
                                                    jArr2[i47] = jArr2[i47] | jArr2[i53];
                                                }
                                                c23178.f75221 = i52 + 1;
                                            }
                                        }
                                        i45 = 1;
                                        c15419 = c15418;
                                        c12969Arr2 = c12969Arr3;
                                        i39 = i48;
                                        arrayList = arrayList6;
                                    }
                                }
                                C15417 c154110 = c15419;
                                C12969[] c12969Arr4 = c12969Arr2;
                                int i54 = i39;
                                ArrayList arrayList7 = arrayList;
                                int i55 = iArr15[i40] / 8;
                                int i56 = 1 << i40;
                                for (long j = jArr[i55]; j != 0; j &= j - 1) {
                                    int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
                                    iArr3[iNumberOfTrailingZeros] = iArr3[iNumberOfTrailingZeros] | i56;
                                }
                                for (long j2 = jArr2[i55]; j2 != 0; j2 &= j2 - 1) {
                                    int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2) + 64;
                                    iArr3[iNumberOfTrailingZeros2] = iArr3[iNumberOfTrailingZeros2] | i56;
                                }
                                i40++;
                                c15419 = c154110;
                                iM36885 = i42;
                                c6949 = c69410;
                                iM36886 = i44;
                                c12969Arr2 = c12969Arr4;
                                i39 = i54;
                                arrayList = arrayList7;
                            }
                            c15417 = c15419;
                            i2 = iM36886;
                            c12969Arr = c12969Arr2;
                            i3 = iM36885;
                            C6949 c69411 = c6949;
                            i4 = i39;
                            arrayList2 = arrayList;
                            int length2 = (int) ((1 << iArr15.length) - 1);
                            int i57 = 0;
                            while (true) {
                                if (i57 >= 128) {
                                    c6949 = c69411;
                                } else {
                                    if (iArr3[i57] != length2) {
                                        c6949 = c69411;
                                        break;
                                    }
                                    i57++;
                                }
                            }
                            if (z3) {
                                arrayList3 = arrayList2;
                                iArrM49106 = C22141.m49106((C14732) arrayList3.get(i38 / 8));
                            } else {
                                arrayList3 = arrayList2;
                                iArrM49106 = null;
                            }
                            if (iArrM49106 == null) {
                                iArr4 = null;
                            } else {
                                iArr4 = (int[]) iArrM49106.clone();
                            }
                            c12969Arr[i4] = new C12969(iArr15, iArr3, iArr4);
                            c12969Arr2 = c12969Arr;
                        }
                        iArr3 = null;
                        if (z3) {
                            arrayList3 = arrayList2;
                            iArrM49106 = C22141.m49106((C14732) arrayList3.get(i38 / 8));
                        } else {
                            arrayList3 = arrayList2;
                            iArrM49106 = null;
                        }
                        if (iArrM49106 == null) {
                            iArr4 = null;
                        } else {
                            iArr4 = (int[]) iArrM49106.clone();
                        }
                        c12969Arr[i4] = new C12969(iArr15, iArr3, iArr4);
                        c12969Arr2 = c12969Arr;
                    }
                    i38 += 8;
                    arrayList = arrayList3;
                    c15419 = c15417;
                    iM36885 = i3;
                    iM36886 = i2;
                }
                C15417 c154111 = c15419;
                int i58 = iM36886;
                int i59 = iM36885;
                ArrayList arrayList8 = arrayList;
                if (c12969Arr2 != null) {
                    for (int i60 = 0; i60 < c12969Arr2.length; i60++) {
                        C12969 c12969 = c12969Arr2[i60];
                        if (c12969 != null) {
                            arrayList4.set(i60, c12969);
                        }
                    }
                }
                int[] iArr19 = c154111.f50259;
                return new C6618(Arrays.copyOf(c154111.f50254, arrayList8.size() * 8), arrayList4.toArray(), iArr19[i58 / 8], iArr19[i59 / 8], c4853.f17084, c154111.f50257, c154111.f50262, c6266 == null ? null : new C5934(c6266, iArr19[i37 / 8]), z2, m48523(c13053, iArr10, c154111.f50259, m48523(c13054, iArr11, c154111.f50259, null)), c0973M3764, c4853.f17094, c4853.f17083);
            }
            int i61 = i16 * 8;
            int[] iArr20 = c15419.f50259;
            C13052 c13055 = c13052M49107;
            int i62 = 0;
            while (true) {
                i12 = i61 / 8;
                iArr5 = iArr;
                c13052 = c13052M49108;
                if (iArr20[i12] != -1) {
                    iArr6 = iArr2;
                    break;
                }
                int[] iArr21 = c15419.f50254;
                int i63 = iArr21[i61];
                iArr6 = iArr2;
                if (i63 != 11) {
                    if (!z3 && i63 == 8 && iArr21[i61 + 3] == 0) {
                        if (c15419.f50255[iArr21[i61 + 2]]) {
                        }
                    }
                    iArr20[i12] = i61;
                    break;
                }
                iArr20[i12] = -2;
                iArr9[i62] = i61;
                i61 = iArr21[i61 + 1];
                i62++;
                iArr = iArr5;
                c13052M49108 = c13052;
                iArr2 = iArr6;
            }
            int i64 = iArr20[i12];
            if (i64 == -2) {
                throw new UnsupportedOperationException("Regex program encountered an empty jump cycle");
            }
            for (int i65 = 0; i65 < i62; i65++) {
                iArr20[iArr9[i65] / 8] = i64;
            }
            i16++;
            c13052M49107 = c13055;
            iArr = iArr5;
            c13052M49108 = c13052;
            iArr2 = iArr6;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21435 m48523(C13052 c13052, int[] iArr, int[] iArr2, C21435 c21435) {
        if (c13052 == null) {
            return null;
        }
        int i = iArr2[iArr[0] / 8];
        int i2 = iArr[1];
        return new C21435(c13052, i, i2 != -1 ? iArr2[i2 / 8] : -1, c21435);
    }
}
