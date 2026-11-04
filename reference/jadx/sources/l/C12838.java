package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1B3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12838 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1497 f41128;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f41129 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19551 f41130 = new C19551();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31884(C1497 c1497) {
        ArrayList arrayList = this.f41129;
        arrayList.clear();
        int size = c1497.f33652.size();
        for (int i = 0; i < size; i++) {
            C10445 c10445 = (C10445) c1497.f33652.get(i);
            EnumC19396[] enumC19396Arr = c10445.f33210;
            EnumC19396 enumC19396 = enumC19396Arr[0];
            EnumC19396 enumC19397 = EnumC19396.MATCH_CONSTRAINT;
            if (enumC19396 == enumC19397 || enumC19396Arr[1] == enumC19397) {
                arrayList.add(c10445);
            }
        }
        c1497.f5222.m28653();
    }

    public C12838(C1497 c1497) {
        this.f41128 = c1497;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31882(C1497 c1497, int i, int i2) {
        int iM26804 = c1497.m26804();
        int iM26868 = c1497.m26868();
        c1497.m26848(0);
        c1497.m26846(0);
        c1497.m26805(i);
        c1497.m26824(i2);
        c1497.m26848(iM26804);
        c1497.m26846(iM26868);
        this.f41128.mo5343();
    }

    /* JADX WARN: Code duplicated, block: B:146:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:260:0x01bf A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31885(C1497 c1497, int i, int i2, int i3, int i4, int i5) {
        float f;
        boolean zM28651;
        int i6;
        int i7;
        C1497 c1498;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        int i8;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        C6127 c6127;
        C14329 c14329;
        boolean zM28652;
        int i11;
        InterfaceC15075 interfaceC15075M5337 = c1497.m5337();
        C11346 c11346 = c1497.f5222;
        int size = c1497.f33652.size();
        int iM26806 = c1497.m26806();
        int iM26823 = c1497.m26823();
        boolean zM14460 = C4635.m14460(i, 128);
        char c = 0;
        boolean z6 = zM14460 || C4635.m14460(i, 64);
        if (z6) {
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    C10445 c10445 = (C10445) c1497.f33652.get(i12);
                    EnumC19396[] enumC19396Arr = c10445.f33210;
                    EnumC19396 enumC19396 = enumC19396Arr[c];
                    EnumC19396 enumC19397 = EnumC19396.MATCH_CONSTRAINT;
                    boolean z7 = enumC19396 == enumC19397;
                    boolean z8 = enumC19396Arr[1] == enumC19397;
                    if (z7 && z8) {
                        f = 0.0f;
                        boolean z9 = c10445.f33239 > 0.0f;
                        if ((c10445.m26800() || !z9) && !((c10445.m26850() && z9) || (c10445 instanceof C21789) || c10445.m26800() || c10445.m26850())) {
                            i12++;
                            c = 0;
                        } else {
                            z6 = false;
                        }
                    } else {
                        f = 0.0f;
                    }
                    if (c10445.m26800()) {
                        i12++;
                        c = 0;
                    } else {
                        i12++;
                        c = 0;
                    }
                    z6 = false;
                } else {
                    f = 0.0f;
                }
            }
        } else {
            f = 0.0f;
        }
        boolean z10 = z6 & ((i2 == 1073741824 && i4 == 1073741824) || zM14460);
        if (z10) {
            int iMin = Math.min(c1497.m26843(), i3);
            int iMin2 = Math.min(c1497.m26847(), i5);
            if (i2 == 1073741824 && c1497.m26806() != iMin) {
                c1497.m26805(iMin);
                c11346.m28653();
            }
            if (i4 == 1073741824 && c1497.m26823() != iMin2) {
                c1497.m26824(iMin2);
                c11346.m28653();
            }
            if (i2 == 1073741824 && i4 == 1073741824) {
                zM28651 = c11346.m28652(zM14460);
                i6 = 2;
            } else {
                c11346.m28655();
                if (i2 == 1073741824) {
                    zM28652 = c11346.m28651(0, zM14460);
                    i11 = 1;
                } else {
                    zM28652 = true;
                    i11 = 0;
                }
                if (i4 == 1073741824) {
                    zM28651 = c11346.m28651(1, zM14460) & zM28652;
                    i6 = i11 + 1;
                } else {
                    zM28651 = zM28652;
                    i6 = i11;
                }
            }
            if (zM28651) {
                c1497.mo5336(i2 == 1073741824, i4 == 1073741824);
            }
        } else {
            zM28651 = false;
            i6 = 0;
        }
        if (zM28651 && i6 == 2) {
            return;
        }
        int iM5331 = c1497.m5331();
        if (size > 0) {
            int size2 = c1497.f33652.size();
            boolean zM5338 = c1497.m5338(64);
            InterfaceC15075 interfaceC15075M5338 = c1497.m5337();
            int i13 = 0;
            while (i13 < size2) {
                C10445 c10446 = (C10445) c1497.f33652.get(i13);
                if ((c10446 instanceof C7463) || (c10446 instanceof C24618) || c10446.m26828() || (zM5338 && (c6127 = c10446.f33245) != null && (c14329 = c10446.f33195) != null && c6127.f61069.f53630 && c14329.f61069.f53630)) {
                    i8 = iM5331;
                    i9 = size2;
                    z4 = zM5338;
                } else {
                    EnumC19396 enumC19396M26857 = c10446.m26857(0);
                    EnumC19396 enumC19396M26858 = c10446.m26857(1);
                    i9 = size2;
                    EnumC19396 enumC19398 = EnumC19396.MATCH_CONSTRAINT;
                    if (enumC19396M26857 == enumC19398) {
                        z4 = zM5338;
                        i8 = iM5331;
                        i10 = 1;
                        if (c10446.f33206 != 1 && enumC19396M26858 == enumC19398 && c10446.f33209 != 1) {
                            z5 = true;
                        }
                        if (!z5 && c1497.m5338(i10) && !(c10446 instanceof C21789)) {
                            if (enumC19396M26857 == enumC19398 && c10446.f33206 == 0 && enumC19396M26858 != enumC19398 && !c10446.m26800()) {
                                z5 = true;
                            }
                            if (enumC19396M26858 == enumC19398 && c10446.f33209 == 0 && enumC19396M26857 != enumC19398 && !c10446.m26800()) {
                                z5 = true;
                            }
                            if ((enumC19396M26857 != enumC19398 || enumC19396M26858 == enumC19398) && c10446.f33239 > f) {
                            }
                        }
                        if (z5) {
                            m31883(interfaceC15075M5338, c10446, 0);
                        }
                    } else {
                        i8 = iM5331;
                        z4 = zM5338;
                        i10 = 1;
                    }
                    z5 = false;
                    if (!z5) {
                        if (enumC19396M26857 == enumC19398) {
                            z5 = true;
                        }
                        if (enumC19396M26858 == enumC19398) {
                            z5 = true;
                        }
                        z5 = enumC19396M26857 != enumC19398 ? true : true;
                    }
                    if (z5) {
                        m31883(interfaceC15075M5338, c10446, 0);
                    }
                }
                i13++;
                size2 = i9;
                zM5338 = z4;
                iM5331 = i8;
            }
            i7 = iM5331;
            interfaceC15075M5338.mo36335();
        } else {
            i7 = iM5331;
        }
        m31884(c1497);
        ArrayList arrayList2 = this.f41129;
        int size3 = arrayList2.size();
        if (size > 0) {
            m31882(c1497, iM26806, iM26823);
        }
        if (size3 > 0) {
            EnumC19396[] enumC19396Arr2 = c1497.f33210;
            EnumC19396 enumC19399 = enumC19396Arr2[0];
            EnumC19396 enumC193910 = EnumC19396.WRAP_CONTENT;
            boolean z11 = enumC19399 == enumC193910;
            boolean z12 = enumC19396Arr2[1] == enumC193910;
            int iM26807 = c1497.m26806();
            C1497 c1499 = this.f41128;
            int iMax = Math.max(iM26807, c1499.m26804());
            int iMax2 = Math.max(c1497.m26823(), c1499.m26868());
            int i14 = 0;
            boolean zM49415 = false;
            while (i14 < size3) {
                C10445 c10447 = (C10445) arrayList2.get(i14);
                if (c10447 instanceof C21789) {
                    int iM26808 = c10447.m26806();
                    int iM26824 = c10447.m26823();
                    boolean zM31883 = m31883(interfaceC15075M5337, c10447, 1) | zM49415;
                    int iM26809 = c10447.m26806();
                    int iM26825 = c10447.m26823();
                    if (iM26809 != iM26808) {
                        c10447.m26805(iM26809);
                        if (z11 && c10447.m26854() > iMax) {
                            iMax = Math.max(iMax, c10447.mo20495(EnumC18650.RIGHT).m3108() + c10447.m26854());
                        }
                        z3 = true;
                    } else {
                        z3 = zM31883;
                    }
                    if (iM26825 != iM26824) {
                        c10447.m26824(iM26825);
                        if (z12 && c10447.m26864() > iMax2) {
                            iMax2 = Math.max(iMax2, c10447.mo20495(EnumC18650.BOTTOM).m3108() + c10447.m26864());
                        }
                        z3 = true;
                    }
                    zM49415 = ((C21789) c10447).m49415() | z3;
                }
                i14++;
                iM26806 = iM26806;
            }
            int i15 = iM26806;
            int i16 = 0;
            while (i16 < 2) {
                int i17 = 0;
                while (i17 < size3) {
                    C10445 c10448 = (C10445) arrayList2.get(i17);
                    if (((c10448 instanceof C14174) && !(c10448 instanceof C21789)) || (c10448 instanceof C7463) || c10448.m26870() == 8 || ((z10 && c10448.f33245.f61069.f53630 && c10448.f33195.f61069.f53630) || (c10448 instanceof C21789))) {
                        z2 = z10;
                        arrayList = arrayList2;
                    } else {
                        int iM268010 = c10448.m26806();
                        int iM26826 = c10448.m26823();
                        z2 = z10;
                        int iM26829 = c10448.m26829();
                        arrayList = arrayList2;
                        boolean zM31884 = m31883(interfaceC15075M5337, c10448, i16 == 1 ? 2 : 1) | zM49415;
                        int iM268011 = c10448.m26806();
                        int iM26827 = c10448.m26823();
                        if (iM268011 != iM268010) {
                            c10448.m26805(iM268011);
                            if (z11 && c10448.m26854() > iMax) {
                                iMax = Math.max(iMax, c10448.mo20495(EnumC18650.RIGHT).m3108() + c10448.m26854());
                            }
                            zM49415 = true;
                        } else {
                            zM49415 = zM31884;
                        }
                        if (iM26827 != iM26826) {
                            c10448.m26824(iM26827);
                            if (z12 && c10448.m26864() > iMax2) {
                                iMax2 = Math.max(iMax2, c10448.mo20495(EnumC18650.BOTTOM).m3108() + c10448.m26864());
                            }
                            zM49415 = true;
                        }
                        if (c10448.m26849() && iM26829 != c10448.m26829()) {
                            zM49415 = true;
                        }
                    }
                    i17++;
                    z10 = z2;
                    arrayList2 = arrayList;
                }
                boolean z13 = z10;
                ArrayList arrayList3 = arrayList2;
                if (!zM49415) {
                    break;
                }
                m31882(c1497, i15, iM26823);
                i16++;
                zM49415 = false;
                z10 = z13;
                arrayList2 = arrayList3;
            }
            c1498 = c1497;
            if (zM49415) {
                m31882(c1498, i15, iM26823);
                if (c1497.m26806() < iMax) {
                    c1498.m26805(iMax);
                    z = true;
                } else {
                    z = false;
                }
                if (c1497.m26823() < iMax2) {
                    c1498.m26824(iMax2);
                    z = true;
                }
                if (z) {
                    m31882(c1498, i15, iM26823);
                }
            }
        } else {
            c1498 = c1497;
        }
        c1498.m5350(i7);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m31883(InterfaceC15075 interfaceC15075, C10445 c10445, int i) {
        EnumC19396[] enumC19396Arr = c10445.f33210;
        int[] iArr = c10445.f33228;
        EnumC19396 enumC19396 = enumC19396Arr[0];
        C19551 c19551 = this.f41130;
        c19551.f63050 = enumC19396;
        c19551.f63049 = enumC19396Arr[1];
        c19551.f63057 = c10445.m26806();
        c19551.f63053 = c10445.m26823();
        c19551.f63054 = false;
        c19551.f63052 = i;
        EnumC19396 enumC19397 = c19551.f63050;
        EnumC19396 enumC19398 = EnumC19396.MATCH_CONSTRAINT;
        boolean z = enumC19397 == enumC19398;
        boolean z2 = c19551.f63049 == enumC19398;
        boolean z3 = z && c10445.f33239 > 0.0f;
        boolean z4 = z2 && c10445.f33239 > 0.0f;
        if (z3 && iArr[0] == 4) {
            c19551.f63050 = EnumC19396.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            c19551.f63049 = EnumC19396.FIXED;
        }
        interfaceC15075.mo36336(c10445, c19551);
        c10445.m26805(c19551.f63051);
        c10445.m26824(c19551.f63055);
        c10445.m26821(c19551.f63056);
        c10445.m26842(c19551.f63058);
        c19551.f63052 = 0;
        return c19551.f63054;
    }
}
