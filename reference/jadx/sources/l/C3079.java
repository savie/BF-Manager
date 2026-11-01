package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G1B3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3079 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15781 f11654;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f11655 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1668 f11656 = new C1668();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9264(C15781 c15781) {
        ArrayList arrayList = this.f11655;
        arrayList.clear();
        int size = c15781.f76249.size();
        for (int i = 0; i < size; i++) {
            C20719 c20719 = (C20719) c15781.f76249.get(i);
            EnumC7313[] enumC7313Arr = c20719.f67434;
            EnumC7313 enumC7313 = enumC7313Arr[0];
            EnumC7313 enumC7314 = EnumC7313.MATCH_CONSTRAINT;
            if (enumC7313 == enumC7314 || enumC7313Arr[1] == enumC7314) {
                arrayList.add(c20719);
            }
        }
        c15781.f51116.m29744();
    }

    public C3079(C15781 c15781) {
        this.f11654 = c15781;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9262(C15781 c15781, int i, int i2) {
        int iM46607 = c15781.m46607();
        int iM46635 = c15781.m46635();
        c15781.m46642(0);
        c15781.m46629(0);
        c15781.m46608(i);
        c15781.m46620(i2);
        c15781.m46642(iM46607);
        c15781.m46629(iM46635);
        this.f11654.mo37541();
    }

    /* JADX WARN: Code duplicated, block: B:146:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:260:0x01bf A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9265(C15781 c15781, int i, int i2, int i3, int i4, int i5) {
        float f;
        boolean zM29741;
        int i6;
        int i7;
        C15781 c15782;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        int i8;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        C15469 c15469;
        C18996 c18996;
        boolean zM29742;
        int i11;
        InterfaceC9431 interfaceC9431M37534 = c15781.m37534();
        C11941 c11941 = c15781.f51116;
        int size = c15781.f76249.size();
        int iM46640 = c15781.m46640();
        int iM46619 = c15781.m46619();
        boolean zM16170 = C5902.m16170(i, 128);
        char c = 0;
        boolean z6 = zM16170 || C5902.m16170(i, 64);
        if (z6) {
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    C20719 c20719 = (C20719) c15781.f76249.get(i12);
                    EnumC7313[] enumC7313Arr = c20719.f67434;
                    EnumC7313 enumC7313 = enumC7313Arr[c];
                    EnumC7313 enumC7314 = EnumC7313.MATCH_CONSTRAINT;
                    boolean z7 = enumC7313 == enumC7314;
                    boolean z8 = enumC7313Arr[1] == enumC7314;
                    if (z7 && z8) {
                        f = 0.0f;
                        boolean z9 = c20719.f67422 > 0.0f;
                        if ((c20719.m46631() || !z9) && !((c20719.m46632() && z9) || (c20719 instanceof C10842) || c20719.m46631() || c20719.m46632())) {
                            i12++;
                            c = 0;
                        } else {
                            z6 = false;
                        }
                    } else {
                        f = 0.0f;
                    }
                    if (c20719.m46631()) {
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
        boolean z10 = z6 & ((i2 == 1073741824 && i4 == 1073741824) || zM16170);
        if (z10) {
            int iMin = Math.min(c15781.m46633(), i3);
            int iMin2 = Math.min(c15781.m46641(), i5);
            if (i2 == 1073741824 && c15781.m46640() != iMin) {
                c15781.m46608(iMin);
                c11941.m29744();
            }
            if (i4 == 1073741824 && c15781.m46619() != iMin2) {
                c15781.m46620(iMin2);
                c11941.m29744();
            }
            if (i2 == 1073741824 && i4 == 1073741824) {
                zM29741 = c11941.m29742(zM16170);
                i6 = 2;
            } else {
                c11941.m29745();
                if (i2 == 1073741824) {
                    zM29742 = c11941.m29741(0, zM16170);
                    i11 = 1;
                } else {
                    zM29742 = true;
                    i11 = 0;
                }
                if (i4 == 1073741824) {
                    zM29741 = c11941.m29741(1, zM16170) & zM29742;
                    i6 = i11 + 1;
                } else {
                    zM29741 = zM29742;
                    i6 = i11;
                }
            }
            if (zM29741) {
                c15781.mo37529(i2 == 1073741824, i4 == 1073741824);
            }
        } else {
            zM29741 = false;
            i6 = 0;
        }
        if (zM29741 && i6 == 2) {
            return;
        }
        int iM37524 = c15781.m37524();
        if (size > 0) {
            int size2 = c15781.f76249.size();
            boolean zM37532 = c15781.m37532(64);
            InterfaceC9431 interfaceC9431M37535 = c15781.m37534();
            int i13 = 0;
            while (i13 < size2) {
                C20719 c207110 = (C20719) c15781.f76249.get(i13);
                if ((c207110 instanceof C12253) || (c207110 instanceof C21424) || c207110.m46603() || (zM37532 && (c15469 = c207110.f67376) != null && (c18996 = c207110.f67409) != null && c15469.f25502.f19187 && c18996.f25502.f19187)) {
                    i8 = iM37524;
                    i9 = size2;
                    z4 = zM37532;
                } else {
                    EnumC7313 enumC7313M46621 = c207110.m46621(0);
                    EnumC7313 enumC7313M46622 = c207110.m46621(1);
                    i9 = size2;
                    EnumC7313 enumC7315 = EnumC7313.MATCH_CONSTRAINT;
                    if (enumC7313M46621 == enumC7315) {
                        z4 = zM37532;
                        i8 = iM37524;
                        i10 = 1;
                        if (c207110.f67395 != 1 && enumC7313M46622 == enumC7315 && c207110.f67375 != 1) {
                            z5 = true;
                        }
                        if (!z5 && c15781.m37532(i10) && !(c207110 instanceof C10842)) {
                            if (enumC7313M46621 == enumC7315 && c207110.f67395 == 0 && enumC7313M46622 != enumC7315 && !c207110.m46631()) {
                                z5 = true;
                            }
                            if (enumC7313M46622 == enumC7315 && c207110.f67375 == 0 && enumC7313M46621 != enumC7315 && !c207110.m46631()) {
                                z5 = true;
                            }
                            if ((enumC7313M46621 != enumC7315 || enumC7313M46622 == enumC7315) && c207110.f67422 > f) {
                            }
                        }
                        if (z5) {
                            m9263(interfaceC9431M37535, c207110, 0);
                        }
                    } else {
                        i8 = iM37524;
                        z4 = zM37532;
                        i10 = 1;
                    }
                    z5 = false;
                    if (!z5) {
                        if (enumC7313M46621 == enumC7315) {
                            z5 = true;
                        }
                        if (enumC7313M46622 == enumC7315) {
                            z5 = true;
                        }
                        z5 = enumC7313M46621 != enumC7315 ? true : true;
                    }
                    if (z5) {
                        m9263(interfaceC9431M37535, c207110, 0);
                    }
                }
                i13++;
                size2 = i9;
                zM37532 = z4;
                iM37524 = i8;
            }
            i7 = iM37524;
            interfaceC9431M37535.mo8093();
        } else {
            i7 = iM37524;
        }
        m9264(c15781);
        ArrayList arrayList2 = this.f11655;
        int size3 = arrayList2.size();
        if (size > 0) {
            m9262(c15781, iM46640, iM46619);
        }
        if (size3 > 0) {
            EnumC7313[] enumC7313Arr2 = c15781.f67434;
            EnumC7313 enumC7316 = enumC7313Arr2[0];
            EnumC7313 enumC7317 = EnumC7313.WRAP_CONTENT;
            boolean z11 = enumC7316 == enumC7317;
            boolean z12 = enumC7313Arr2[1] == enumC7317;
            int iM46641 = c15781.m46640();
            C15781 c15783 = this.f11654;
            int iMax = Math.max(iM46641, c15783.m46607());
            int iMax2 = Math.max(c15781.m46619(), c15783.m46635());
            int i14 = 0;
            boolean zM27193 = false;
            while (i14 < size3) {
                C20719 c207111 = (C20719) arrayList2.get(i14);
                if (c207111 instanceof C10842) {
                    int iM46642 = c207111.m46640();
                    int iM466110 = c207111.m46619();
                    boolean zM9263 = m9263(interfaceC9431M37534, c207111, 1) | zM27193;
                    int iM46643 = c207111.m46640();
                    int iM466111 = c207111.m46619();
                    if (iM46643 != iM46642) {
                        c207111.m46608(iM46643);
                        if (z11 && c207111.m46637() > iMax) {
                            iMax = Math.max(iMax, c207111.mo30461(EnumC19308.RIGHT).m22577() + c207111.m46637());
                        }
                        z3 = true;
                    } else {
                        z3 = zM9263;
                    }
                    if (iM466111 != iM466110) {
                        c207111.m46620(iM466111);
                        if (z12 && c207111.m46577() > iMax2) {
                            iMax2 = Math.max(iMax2, c207111.mo30461(EnumC19308.BOTTOM).m22577() + c207111.m46577());
                        }
                        z3 = true;
                    }
                    zM27193 = ((C10842) c207111).m27193() | z3;
                }
                i14++;
                iM46640 = iM46640;
            }
            int i15 = iM46640;
            int i16 = 0;
            while (i16 < 2) {
                int i17 = 0;
                while (i17 < size3) {
                    C20719 c207112 = (C20719) arrayList2.get(i17);
                    if (((c207112 instanceof C17191) && !(c207112 instanceof C10842)) || (c207112 instanceof C12253) || c207112.m46606() == 8 || ((z10 && c207112.f67376.f25502.f19187 && c207112.f67409.f25502.f19187) || (c207112 instanceof C10842))) {
                        z2 = z10;
                        arrayList = arrayList2;
                    } else {
                        int iM46644 = c207112.m46640();
                        int iM466112 = c207112.m46619();
                        z2 = z10;
                        int iM46614 = c207112.m46614();
                        arrayList = arrayList2;
                        boolean zM9264 = m9263(interfaceC9431M37534, c207112, i16 == 1 ? 2 : 1) | zM27193;
                        int iM46645 = c207112.m46640();
                        int iM466113 = c207112.m46619();
                        if (iM46645 != iM46644) {
                            c207112.m46608(iM46645);
                            if (z11 && c207112.m46637() > iMax) {
                                iMax = Math.max(iMax, c207112.mo30461(EnumC19308.RIGHT).m22577() + c207112.m46637());
                            }
                            zM27193 = true;
                        } else {
                            zM27193 = zM9264;
                        }
                        if (iM466113 != iM466112) {
                            c207112.m46620(iM466113);
                            if (z12 && c207112.m46577() > iMax2) {
                                iMax2 = Math.max(iMax2, c207112.mo30461(EnumC19308.BOTTOM).m22577() + c207112.m46577());
                            }
                            zM27193 = true;
                        }
                        if (c207112.m46574() && iM46614 != c207112.m46614()) {
                            zM27193 = true;
                        }
                    }
                    i17++;
                    z10 = z2;
                    arrayList2 = arrayList;
                }
                boolean z13 = z10;
                ArrayList arrayList3 = arrayList2;
                if (!zM27193) {
                    break;
                }
                m9262(c15781, i15, iM46619);
                i16++;
                zM27193 = false;
                z10 = z13;
                arrayList2 = arrayList3;
            }
            c15782 = c15781;
            if (zM27193) {
                m9262(c15782, i15, iM46619);
                if (c15781.m46640() < iMax) {
                    c15782.m46608(iMax);
                    z = true;
                } else {
                    z = false;
                }
                if (c15781.m46619() < iMax2) {
                    c15782.m46620(iMax2);
                    z = true;
                }
                if (z) {
                    m9262(c15782, i15, iM46619);
                }
            }
        } else {
            c15782 = c15781;
        }
        c15782.m37531(i7);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9263(InterfaceC9431 interfaceC9431, C20719 c20719, int i) {
        EnumC7313[] enumC7313Arr = c20719.f67434;
        int[] iArr = c20719.f67419;
        EnumC7313 enumC7313 = enumC7313Arr[0];
        C1668 c1668 = this.f11656;
        c1668.f6645 = enumC7313;
        c1668.f6644 = enumC7313Arr[1];
        c1668.f6650 = c20719.m46640();
        c1668.f6647 = c20719.m46619();
        c1668.f6642 = false;
        c1668.f6648 = i;
        EnumC7313 enumC7314 = c1668.f6645;
        EnumC7313 enumC7315 = EnumC7313.MATCH_CONSTRAINT;
        boolean z = enumC7314 == enumC7315;
        boolean z2 = c1668.f6644 == enumC7315;
        boolean z3 = z && c20719.f67422 > 0.0f;
        boolean z4 = z2 && c20719.f67422 > 0.0f;
        if (z3 && iArr[0] == 4) {
            c1668.f6645 = EnumC7313.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            c1668.f6644 = EnumC7313.FIXED;
        }
        interfaceC9431.mo8094(c20719, c1668);
        c20719.m46608(c1668.f6649);
        c20719.m46620(c1668.f6651);
        c20719.m46598(c1668.f6646);
        c20719.m46644(c1668.f6643);
        c1668.f6648 = 0;
        return c1668.f6642;
    }
}
