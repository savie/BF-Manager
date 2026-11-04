package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6PB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13414 {
    /* JADX WARN: Code duplicated, block: B:296:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:297:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:300:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:301:0x04d5  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20149 m33056(C9093 c9093) {
        int[] iArr;
        int[] iArr2;
        int iM37409;
        ArrayList arrayList;
        int i;
        C15651 c15651;
        int i2;
        C11198[] c11198Arr;
        int i3;
        int i4;
        ArrayList arrayList2;
        int[] iArr3;
        ArrayList arrayList3;
        int[] iArrM15733;
        int[] iArr4;
        int i5;
        int i6;
        byte b;
        C15651 c15652;
        int i7;
        C21531 c21531;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr5;
        C10673 c10673;
        int[] iArr6;
        C0407 c0407;
        int i13 = c9093.f29543;
        int i14 = i13 & 512;
        boolean z = i14 != 0;
        C0407 c0408 = c9093.f29545;
        boolean z2 = (i14 != 0) | z;
        if ((i13 & (-1024)) != 0) {
            throw new UnsupportedOperationException("Regex program does not support flags: " + c9093.f29543);
        }
        C15651 c15653 = new C15651(c9093.f29544, z2);
        int iM374010 = c15653.m37409(c9093.f29539);
        C10673 c10673M15734 = C5233.m15734(c0408);
        C10673 c10673M15735 = (c10673M15734 == null || (c0407 = c10673M15734.f33876) == null) ? null : C5233.m15734(c0407);
        if (c10673M15734 != null && c10673M15734.f33876 != null && c10673M15735 == null) {
            throw new UnsupportedOperationException("Unknown regex search fallback");
        }
        if (c10673M15734 == null) {
            iArr = null;
        } else {
            int iM374011 = c15653.m37409(c10673M15734.f33881);
            C0407 c0409 = c10673M15734.f33879;
            iArr = new int[]{iM374011, c0409 == null ? -1 : c15653.m37409(c0409)};
        }
        if (c10673M15735 == null) {
            iArr2 = null;
        } else {
            int iM374012 = c15653.m37409(c10673M15735.f33881);
            C0407 c04010 = c10673M15735.f33879;
            iArr2 = new int[]{iM374012, c04010 == null ? -1 : c15653.m37409(c04010)};
        }
        Class<?> cls = c0408.getClass();
        C21531 c21532 = (cls == C21531.class || cls == C18547.class) ? (C21531) c0408 : null;
        int iM374013 = c21532 == null ? -1 : c15653.m37409(c21532.f1952);
        if (c21532 != null) {
            iM37409 = iM374010;
        } else {
            if (c0408 instanceof C16640) {
                c0408 = c0408.f1952;
            }
            iM37409 = c15653.m37409(c0408);
        }
        int i15 = 0;
        while (true) {
            arrayList = c15653.f50864;
            if (i15 >= arrayList.size()) {
                break;
            }
            c15653.m37410((C0407) arrayList.get(i15), i15 * 8);
            i15++;
        }
        int[] iArr7 = c15653.f50868;
        ArrayList arrayList4 = c15653.f50861;
        C22387 c22387M50464 = C22387.m50464(iArr7, arrayList4, iM374010);
        int size = arrayList.size();
        int[] iArr8 = new int[size];
        c15653.f50862 = iArr8;
        Arrays.fill(iArr8, -1);
        int[] iArr9 = new int[size];
        int i16 = 0;
        while (true) {
            boolean z3 = c15653.f50867;
            if (i16 >= size) {
                C10673 c10674 = c10673M15734;
                C10673 c10675 = c10673M15735;
                int[] iArr10 = iArr;
                int[] iArr11 = iArr2;
                int i17 = 0;
                while (true) {
                    i = size * 8;
                    if (i17 >= i) {
                        break;
                    }
                    int[] iArr12 = c15653.f50868;
                    int i18 = i17 + 1;
                    int i19 = iArr12[i18];
                    if (i19 != -1) {
                        iArr12[i18] = c15653.f50862[i19 / 8];
                    }
                    int i20 = iArr12[i17];
                    if (i20 == 6) {
                        int[] iArr13 = (int[]) arrayList4.get(iArr12[i17 + 2]);
                        for (int i21 = 0; i21 < iArr13.length; i21++) {
                            iArr13[i21] = c15653.f50862[iArr13[i21] / 8];
                        }
                    } else if (i20 == 10 || i20 == 9 || i20 == 19 || i20 == 18 || i20 == 27 || i20 == 26) {
                        int i22 = i17 + 6;
                        iArr12[i22] = c15653.f50862[iArr12[i22] / 8];
                    } else if (i20 == 22 || i20 == 25) {
                        int i23 = i17 + 3;
                        iArr12[i23] = c15653.f50862[iArr12[i23] / 8];
                    }
                    i17 += 8;
                }
                int i24 = 0;
                while (i24 < i && !z3) {
                    int[] iArr14 = c15653.f50868;
                    int i25 = iArr14[i24];
                    if (i25 == 10 || i25 == 9) {
                        i7 = i;
                        c21531 = c21532;
                        i8 = iM374013;
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
                            c21531 = c21532;
                            i8 = iM374013;
                        } else {
                            int i31 = iArr14[i30 + 1];
                            i8 = iM374013;
                            if (iArr14[i31] == 8) {
                                int i32 = i24 + 2;
                                c21531 = c21532;
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
                                c21531 = c21532;
                            }
                        }
                    } else {
                        i7 = i;
                        c21531 = c21532;
                        i8 = iM374013;
                        if (i25 == 14 && (((i10 = iArr14[(i9 = iArr14[i24 + 1])]) == 1 || i10 == 3) && iArr14[iArr14[i9 + 1]] == 0)) {
                            iArr14[i24 + 3] = 1;
                        }
                    }
                    i24 += 8;
                    i = i7;
                    iM374013 = i8;
                    c21532 = c21531;
                }
                C21531 c21533 = c21532;
                int i37 = iM374013;
                int i38 = 0;
                C11198[] c11198Arr2 = null;
                C23111 c23111 = null;
                while (i38 < arrayList.size() * 8) {
                    if (c15653.f50868[i38] != 6) {
                        c15651 = c15653;
                        i2 = iM374010;
                        i3 = iM37409;
                        arrayList3 = arrayList;
                    } else {
                        if (c11198Arr2 == null) {
                            c11198Arr2 = new C11198[arrayList4.size()];
                        }
                        int i39 = c15653.f50868[i38 + 2];
                        int[] iArr15 = (int[]) arrayList4.get(i39);
                        if (z3 || iArr15.length <= 0 || iArr15.length > 31) {
                            c15651 = c15653;
                            i2 = iM374010;
                            c11198Arr = c11198Arr2;
                            i3 = iM37409;
                            i4 = i39;
                            arrayList2 = arrayList;
                        } else {
                            if (c23111 == null) {
                                c23111 = new C23111(arrayList.size());
                            }
                            long[] jArr = c23111.f74962;
                            long[] jArr2 = c23111.f74960;
                            iArr3 = new int[128];
                            int i40 = 0;
                            while (i40 < iArr15.length) {
                                int i41 = iArr15[i40];
                                int i42 = iM37409;
                                byte[] bArr = c23111.f74961;
                                int i43 = i41 / 8;
                                C23111 c23112 = c23111;
                                int i44 = iM374010;
                                if (bArr[i43] != 2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    bArr[i43] = 1;
                                    arrayList5.add(new C20127(i41));
                                    int i45 = 1;
                                    while (!arrayList5.isEmpty()) {
                                        C20127 c20127 = (C20127) j$$ExternalSyntheticOutline0.m(arrayList5, i45);
                                        int i46 = c20127.f64687;
                                        int i47 = i46 / 8;
                                        C11198[] c11198Arr3 = c11198Arr2;
                                        int[] iArr16 = c15653.f50868;
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
                                                    InterfaceC2885 interfaceC2885 = (InterfaceC2885) arrayList4.get(iArr16[i46 + 2]);
                                                    for (int i51 = 0; i51 < 128; i51++) {
                                                        if (interfaceC2885.mo1303(i51)) {
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
                                            C2764.m9138(arrayList5, 1);
                                            c15652 = c15653;
                                            i45 = 1;
                                            c15653 = c15652;
                                            c11198Arr2 = c11198Arr3;
                                            i39 = i48;
                                            arrayList = arrayList6;
                                        }
                                        int[] iArr18 = i49 == i5 ? (int[]) arrayList4.get(iArr16[i46 + 2]) : null;
                                        int length = iArr18 == null ? 1 : iArr18.length;
                                        int i52 = c20127.f64686;
                                        if (i52 == length) {
                                            bArr[i47] = 2;
                                            C2764.m9138(arrayList5, 1);
                                            c15652 = c15653;
                                        } else {
                                            if (iArr18 == null) {
                                                b = 1;
                                                i6 = c15653.f50868[c20127.f64687 + 1];
                                            } else {
                                                i6 = iArr18[i52];
                                                b = 1;
                                            }
                                            int i53 = i6 / 8;
                                            c15652 = c15653;
                                            byte b2 = bArr[i53];
                                            if (b2 == 0) {
                                                bArr[i53] = b;
                                                arrayList5.add(new C20127(i6));
                                            } else {
                                                if (b2 == 1) {
                                                    jArr2[i47] = -1;
                                                    jArr[i47] = -1;
                                                } else {
                                                    jArr[i47] = jArr[i47] | jArr[i53];
                                                    jArr2[i47] = jArr2[i47] | jArr2[i53];
                                                }
                                                c20127.f64686 = i52 + 1;
                                            }
                                        }
                                        i45 = 1;
                                        c15653 = c15652;
                                        c11198Arr2 = c11198Arr3;
                                        i39 = i48;
                                        arrayList = arrayList6;
                                    }
                                }
                                C15651 c15654 = c15653;
                                C11198[] c11198Arr4 = c11198Arr2;
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
                                c15653 = c15654;
                                iM37409 = i42;
                                c23111 = c23112;
                                iM374010 = i44;
                                c11198Arr2 = c11198Arr4;
                                i39 = i54;
                                arrayList = arrayList7;
                            }
                            c15651 = c15653;
                            i2 = iM374010;
                            c11198Arr = c11198Arr2;
                            i3 = iM37409;
                            C23111 c23113 = c23111;
                            i4 = i39;
                            arrayList2 = arrayList;
                            int length2 = (int) ((1 << iArr15.length) - 1);
                            int i57 = 0;
                            while (true) {
                                if (i57 >= 128) {
                                    c23111 = c23113;
                                } else {
                                    if (iArr3[i57] != length2) {
                                        c23111 = c23113;
                                        break;
                                    }
                                    i57++;
                                }
                            }
                            if (z3) {
                                arrayList3 = arrayList2;
                                iArrM15733 = C5233.m15733((C8106) arrayList3.get(i38 / 8));
                            } else {
                                arrayList3 = arrayList2;
                                iArrM15733 = null;
                            }
                            if (iArrM15733 == null) {
                                iArr4 = null;
                            } else {
                                iArr4 = (int[]) iArrM15733.clone();
                            }
                            c11198Arr[i4] = new C11198(iArr15, iArr3, iArr4);
                            c11198Arr2 = c11198Arr;
                        }
                        iArr3 = null;
                        if (z3) {
                            arrayList3 = arrayList2;
                            iArrM15733 = C5233.m15733((C8106) arrayList3.get(i38 / 8));
                        } else {
                            arrayList3 = arrayList2;
                            iArrM15733 = null;
                        }
                        if (iArrM15733 == null) {
                            iArr4 = null;
                        } else {
                            iArr4 = (int[]) iArrM15733.clone();
                        }
                        c11198Arr[i4] = new C11198(iArr15, iArr3, iArr4);
                        c11198Arr2 = c11198Arr;
                    }
                    i38 += 8;
                    arrayList = arrayList3;
                    c15653 = c15651;
                    iM37409 = i3;
                    iM374010 = i2;
                }
                C15651 c15655 = c15653;
                int i58 = iM374010;
                int i59 = iM37409;
                ArrayList arrayList8 = arrayList;
                if (c11198Arr2 != null) {
                    for (int i60 = 0; i60 < c11198Arr2.length; i60++) {
                        C11198 c11198 = c11198Arr2[i60];
                        if (c11198 != null) {
                            arrayList4.set(i60, c11198);
                        }
                    }
                }
                int[] iArr19 = c15655.f50862;
                return new C20149(Arrays.copyOf(c15655.f50868, arrayList8.size() * 8), arrayList4.toArray(), iArr19[i58 / 8], iArr19[i59 / 8], c9093.f29544, c15655.f50866, c15655.f50865, c21533 == null ? null : new C21028(c21533, iArr19[i37 / 8]), z2, m33055(c10674, iArr10, c15655.f50862, m33055(c10675, iArr11, c15655.f50862, null)), c22387M50464, c9093.f29545, c9093.f29539);
            }
            int i61 = i16 * 8;
            int[] iArr20 = c15653.f50862;
            C10673 c10676 = c10673M15734;
            int i62 = 0;
            while (true) {
                i12 = i61 / 8;
                iArr5 = iArr;
                c10673 = c10673M15735;
                if (iArr20[i12] != -1) {
                    iArr6 = iArr2;
                    break;
                }
                int[] iArr21 = c15653.f50868;
                int i63 = iArr21[i61];
                iArr6 = iArr2;
                if (i63 != 11) {
                    if (!z3 && i63 == 8 && iArr21[i61 + 3] == 0) {
                        if (c15653.f50859[iArr21[i61 + 2]]) {
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
                c10673M15735 = c10673;
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
            c10673M15734 = c10676;
            iArr = iArr5;
            c10673M15735 = c10673;
            iArr2 = iArr6;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5979 m33055(C10673 c10673, int[] iArr, int[] iArr2, C5979 c5979) {
        if (c10673 == null) {
            return null;
        }
        int i = iArr2[iArr[0] / 8];
        int i2 = iArr[1];
        return new C5979(c10673, i, i2 != -1 ? iArr2[i2 / 8] : -1, c5979);
    }
}
