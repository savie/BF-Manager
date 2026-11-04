package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1AQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5381 extends AbstractC18805 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f18870;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f18871;

    public C5381(C10445 c10445, int i) {
        super(c10445);
        ArrayList<AbstractC18805> arrayList = new ArrayList();
        this.f18870 = arrayList;
        this.f61074 = i;
        C10445 c10446 = this.f61072;
        C10445 c10445M26865 = c10446.m26865(i);
        while (c10445M26865 != null) {
            c10446 = c10445M26865;
            c10445M26865 = c10445M26865.m26865(this.f61074);
        }
        this.f61072 = c10446;
        int i2 = this.f61074;
        arrayList.add(i2 == 0 ? c10446.f33245 : i2 == 1 ? c10446.f33195 : null);
        C10445 c10445M26830 = c10446.m26830(this.f61074);
        while (c10445M26830 != null) {
            int i3 = this.f61074;
            arrayList.add(i3 == 0 ? c10445M26830.f33245 : i3 == 1 ? c10445M26830.f33195 : null);
            c10445M26830 = c10445M26830.m26830(this.f61074);
        }
        for (AbstractC18805 abstractC18805 : arrayList) {
            int i4 = this.f61074;
            if (i4 == 0) {
                abstractC18805.f61072.f33243 = this;
            } else if (i4 == 1) {
                abstractC18805.f61072.f33191 = this;
            }
        }
        if (this.f61074 == 0 && ((C1497) this.f61072.f33252).m5345() && arrayList.size() > 1) {
            this.f61072 = ((AbstractC18805) j$$ExternalSyntheticOutline0.m(arrayList, 1)).f61072;
        }
        this.f18871 = this.f61074 == 0 ? this.f61072.m26833() : this.f61072.m26825();
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f61074 == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC18805 abstractC18805 : this.f18870) {
            strConcat = C14483.m34972(C14483.m34972(strConcat, "<") + abstractC18805, "> ");
        }
        return strConcat;
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo10267() {
        ArrayList arrayList = this.f18870;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC18805) arrayList.get(i)).mo10267()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long mo16069() {
        ArrayList arrayList = this.f18870;
        int size = arrayList.size();
        long jMo16069 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC18805 abstractC18805 = (AbstractC18805) arrayList.get(i);
            jMo16069 = ((long) abstractC18805.f61071.f53628) + abstractC18805.mo16069() + jMo16069 + ((long) abstractC18805.f61068.f53628);
        }
        return jMo16069;
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ۤ */
    public final void mo10266() {
        this.f61070 = null;
        Iterator it = this.f18870.iterator();
        while (it.hasNext()) {
            ((AbstractC18805) it.next()).mo10266();
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01de A[PHI: r2 r18 r22
      0x01de: PHI (r2v60 int) = (r2v56 int), (r2v65 int) binds: [B:120:0x01dc, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r18v5 float) = (r18v4 float), (r18v7 float) binds: [B:120:0x01dc, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r22v1 float) = (r22v0 float), (r22v3 float) binds: [B:120:0x01dc, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:301:0x00fa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2 A[ADDED_TO_REGION] */
    @Override // l.AbstractC18805, l.InterfaceC1652
    /* JADX INFO: renamed from: ۙ */
    public final void mo5938(InterfaceC1652 interfaceC1652) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        float f;
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        boolean z;
        ArrayList arrayList2;
        int i8;
        int i9;
        float f3;
        int i10;
        int i11;
        float f4;
        float f5;
        int iMax;
        int i12;
        int i13;
        boolean z2;
        float f6;
        C16567 c16567 = this.f61068;
        if (c16567.f53630) {
            C16567 c16568 = this.f61071;
            if (c16568.f53630) {
                C10445 c10445 = this.f61072.f33252;
                boolean zM5345 = (c10445 == null || !(c10445 instanceof C1497)) ? false : ((C1497) c10445).m5345();
                int i14 = c16568.f53632 - c16567.f53632;
                ArrayList arrayList3 = this.f18870;
                int size = arrayList3.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((AbstractC18805) arrayList3.get(i15)).f61072.m26870() != 8) {
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = size - 1;
                for (int i17 = i16; i17 >= 0; i17--) {
                    if (((AbstractC18805) arrayList3.get(i17)).f61072.m26870() != 8) {
                        i = i17;
                        break;
                    }
                }
                int i18 = 0;
                while (true) {
                    if (i18 >= 2) {
                        arrayList = arrayList3;
                        i3 = i15;
                        f = 0.0f;
                        i4 = 0;
                        i5 = 0;
                        f2 = 0.0f;
                        i6 = 0;
                        break;
                    }
                    i5 = 0;
                    int i19 = 0;
                    i4 = 0;
                    int i20 = 0;
                    f2 = 0.0f;
                    while (i19 < size) {
                        AbstractC18805 abstractC18805 = (AbstractC18805) arrayList3.get(i19);
                        ArrayList arrayList4 = arrayList3;
                        if (abstractC18805.f61072.m26870() == i2) {
                            i12 = i15;
                        } else {
                            i20++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += abstractC18805.f61068.f53628;
                            }
                            C17313 c17313 = abstractC18805.f61069;
                            int i21 = c17313.f53632;
                            i12 = i15;
                            boolean z3 = abstractC18805.f61076 != EnumC19396.MATCH_CONSTRAINT;
                            if (z3) {
                                int i22 = this.f61074;
                                if (i22 == 0 && !abstractC18805.f61072.f33245.f61069.f53630) {
                                    return;
                                }
                                if (i22 == 1 && !abstractC18805.f61072.f33195.f61069.f53630) {
                                    return;
                                }
                            } else {
                                if (abstractC18805.f61075 == 1 && i18 == 0) {
                                    i13 = c17313.f56393;
                                    i4++;
                                } else {
                                    if (c17313.f53630) {
                                        i13 = i21;
                                    }
                                    if (z2) {
                                        i5 += i13;
                                    } else {
                                        i4++;
                                        f6 = abstractC18805.f61072.f33224[this.f61074];
                                        if (f6 >= 0.0f) {
                                            f2 += f6;
                                        }
                                    }
                                    if (i19 >= i16 && i19 < i) {
                                        i5 += -abstractC18805.f61071.f53628;
                                    }
                                }
                                z2 = true;
                                if (z2) {
                                    i4++;
                                    f6 = abstractC18805.f61072.f33224[this.f61074];
                                    if (f6 >= 0.0f) {
                                        f2 += f6;
                                    }
                                } else {
                                    i5 += i13;
                                }
                                if (i19 >= i16) {
                                }
                            }
                            i13 = i21;
                            z2 = z3;
                            if (z2) {
                                i4++;
                                f6 = abstractC18805.f61072.f33224[this.f61074];
                                if (f6 >= 0.0f) {
                                    f2 += f6;
                                }
                            } else {
                                i5 += i13;
                            }
                            if (i19 >= i16) {
                            }
                        }
                        i19++;
                        i2 = 8;
                        arrayList3 = arrayList4;
                        i15 = i12;
                    }
                    arrayList = arrayList3;
                    i3 = i15;
                    if (i5 < i14 || i4 == 0) {
                        i6 = i20;
                        f = 0.0f;
                        break;
                    } else {
                        i18++;
                        i2 = 8;
                        arrayList3 = arrayList;
                        i15 = i3;
                    }
                }
                int i23 = c16567.f53632;
                if (zM5345) {
                    i23 = c16568.f53632;
                }
                if (i5 > i14) {
                    int i24 = (int) (((i5 - i14) / 2.0f) + 0.5f);
                    i23 = zM5345 ? i23 + i24 : i23 - i24;
                }
                if (i4 > 0) {
                    float f7 = i14 - i5;
                    int i25 = (int) ((f7 / i4) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        ArrayList arrayList5 = arrayList;
                        int i28 = i25;
                        AbstractC18805 abstractC18806 = (AbstractC18805) arrayList5.get(i26);
                        int i29 = i5;
                        C10445 c10446 = abstractC18806.f61072;
                        int i30 = i23;
                        C17313 c17314 = abstractC18806.f61069;
                        boolean z4 = zM5345;
                        if (c10446.m26870() == 8 || abstractC18806.f61076 != EnumC19396.MATCH_CONSTRAINT || c17314.f53630) {
                            f4 = f7;
                            f5 = f;
                        } else {
                            int i31 = f2 > f ? (int) (((abstractC18806.f61072.f33224[this.f61074] * f7) / f2) + 0.5f) : i28;
                            if (this.f61074 == 0) {
                                C10445 c10447 = abstractC18806.f61072;
                                f4 = f7;
                                int i32 = c10447.f33201;
                                f5 = f;
                                iMax = Math.max(c10447.f33215, abstractC18806.f61075 == 1 ? Math.min(i31, c17314.f56393) : i31);
                                if (i32 > 0) {
                                    iMax = Math.min(i32, iMax);
                                }
                                if (iMax != i31) {
                                    i31 = iMax;
                                    i27++;
                                }
                            } else {
                                f4 = f7;
                                f5 = f;
                                C10445 c10448 = abstractC18806.f61072;
                                int i33 = c10448.f33222;
                                iMax = Math.max(c10448.f33244, abstractC18806.f61075 == 1 ? Math.min(i31, c17314.f56393) : i31);
                                if (i33 > 0) {
                                    iMax = Math.min(i33, iMax);
                                }
                                if (iMax != i31) {
                                    i31 = iMax;
                                    i27++;
                                }
                            }
                            c17314.mo39242(i31);
                        }
                        i26++;
                        i23 = i30;
                        i5 = i29;
                        f7 = f4;
                        i25 = i28;
                        zM5345 = z4;
                        f = f5;
                        arrayList = arrayList5;
                    }
                    i7 = i23;
                    z = zM5345;
                    int i34 = i5;
                    arrayList2 = arrayList;
                    f3 = 0.5f;
                    if (i27 > 0) {
                        i4 -= i27;
                        int i35 = 0;
                        int i36 = 0;
                        while (i35 < size) {
                            AbstractC18805 abstractC18807 = (AbstractC18805) arrayList2.get(i35);
                            if (abstractC18807.f61072.m26870() == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i36 += abstractC18807.f61068.f53628;
                                }
                                i36 += abstractC18807.f61069.f53632;
                                if (i35 < i16 && i35 < i) {
                                    i36 += -abstractC18807.f61071.f53628;
                                }
                            }
                            i35++;
                            i3 = i11;
                        }
                        i8 = i3;
                        i5 = i36;
                    } else {
                        i8 = i3;
                        i5 = i34;
                    }
                    i9 = 2;
                    if (this.f18871 == 2 && i27 == 0) {
                        this.f18871 = 0;
                    }
                } else {
                    i7 = i23;
                    z = zM5345;
                    arrayList2 = arrayList;
                    i8 = i3;
                    i9 = 2;
                    f3 = 0.5f;
                }
                if (i5 > i14) {
                    this.f18871 = i9;
                }
                if (i6 > 0 && i4 == 0 && i8 == i) {
                    this.f18871 = i9;
                }
                int i37 = this.f18871;
                if (i37 == 1) {
                    if (i6 > 1) {
                        i10 = (i14 - i5) / (i6 - 1);
                    } else {
                        i10 = i6 == 1 ? (i14 - i5) / 2 : 0;
                    }
                    if (i4 > 0) {
                        i10 = 0;
                    }
                    int i38 = i7;
                    for (int i39 = 0; i39 < size; i39++) {
                        AbstractC18805 abstractC18808 = (AbstractC18805) arrayList2.get(z ? size - (i39 + 1) : i39);
                        C10445 c10449 = abstractC18808.f61072;
                        C16567 c16569 = abstractC18808.f61071;
                        C16567 c165610 = abstractC18808.f61068;
                        if (c10449.m26870() == 8) {
                            c165610.mo39242(i38);
                            c16569.mo39242(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z ? i38 - i10 : i38 + i10;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                if (z) {
                                    i38 -= c165610.f53628;
                                } else {
                                    i38 += c165610.f53628;
                                }
                            }
                            if (z) {
                                c16569.mo39242(i38);
                            } else {
                                c165610.mo39242(i38);
                            }
                            C17313 c17315 = abstractC18808.f61069;
                            int i40 = c17315.f53632;
                            if (abstractC18808.f61076 == EnumC19396.MATCH_CONSTRAINT && abstractC18808.f61075 == 1) {
                                i40 = c17315.f56393;
                            }
                            i38 = z ? i38 - i40 : i38 + i40;
                            if (z) {
                                c165610.mo39242(i38);
                            } else {
                                c16569.mo39242(i38);
                            }
                            abstractC18808.f61073 = true;
                            if (i39 < i16 && i39 < i) {
                                if (z) {
                                    i38 -= -c16569.f53628;
                                } else {
                                    i38 += -c16569.f53628;
                                }
                            }
                        }
                    }
                    return;
                }
                if (i37 == 0) {
                    int i41 = (i14 - i5) / (i6 + 1);
                    if (i4 > 0) {
                        i41 = 0;
                    }
                    int i42 = i7;
                    for (int i43 = 0; i43 < size; i43++) {
                        AbstractC18805 abstractC18809 = (AbstractC18805) arrayList2.get(z ? size - (i43 + 1) : i43);
                        C10445 c104410 = abstractC18809.f61072;
                        C16567 c165611 = abstractC18809.f61071;
                        C16567 c165612 = abstractC18809.f61068;
                        if (c104410.m26870() == 8) {
                            c165612.mo39242(i42);
                            c165611.mo39242(i42);
                        } else {
                            int i44 = z ? i42 - i41 : i42 + i41;
                            if (i43 > 0 && i43 >= i8) {
                                if (z) {
                                    i44 -= c165612.f53628;
                                } else {
                                    i44 += c165612.f53628;
                                }
                            }
                            if (z) {
                                c165611.mo39242(i44);
                            } else {
                                c165612.mo39242(i44);
                            }
                            C17313 c17316 = abstractC18809.f61069;
                            int iMin = c17316.f53632;
                            if (abstractC18809.f61076 == EnumC19396.MATCH_CONSTRAINT && abstractC18809.f61075 == 1) {
                                iMin = Math.min(iMin, c17316.f56393);
                            }
                            i42 = z ? i44 - iMin : i44 + iMin;
                            if (z) {
                                c165612.mo39242(i42);
                            } else {
                                c165611.mo39242(i42);
                            }
                            if (i43 < i16 && i43 < i) {
                                if (z) {
                                    i42 -= -c165611.f53628;
                                } else {
                                    i42 += -c165611.f53628;
                                }
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    float fM26802 = this.f61074 == 0 ? this.f61072.m26802() : this.f61072.m26835();
                    if (z) {
                        fM26802 = 1.0f - fM26802;
                    }
                    int i45 = (int) (((i14 - i5) * fM26802) + f3);
                    if (i45 < 0 || i4 > 0) {
                        i45 = 0;
                    }
                    int i46 = z ? i7 - i45 : i7 + i45;
                    for (int i47 = 0; i47 < size; i47++) {
                        AbstractC18805 abstractC188010 = (AbstractC18805) arrayList2.get(z ? size - (i47 + 1) : i47);
                        C10445 c104411 = abstractC188010.f61072;
                        C16567 c165613 = abstractC188010.f61071;
                        C16567 c165614 = abstractC188010.f61068;
                        if (c104411.m26870() == 8) {
                            c165614.mo39242(i46);
                            c165613.mo39242(i46);
                        } else {
                            if (i47 > 0 && i47 >= i8) {
                                if (z) {
                                    i46 -= c165614.f53628;
                                } else {
                                    i46 += c165614.f53628;
                                }
                            }
                            if (z) {
                                c165613.mo39242(i46);
                            } else {
                                c165614.mo39242(i46);
                            }
                            C17313 c17317 = abstractC188010.f61069;
                            int i48 = c17317.f53632;
                            if (abstractC188010.f61076 == EnumC19396.MATCH_CONSTRAINT && abstractC188010.f61075 == 1) {
                                i48 = c17317.f56393;
                            }
                            i46 = z ? i46 - i48 : i46 + i48;
                            if (z) {
                                c165614.mo39242(i46);
                            } else {
                                c165613.mo39242(i46);
                            }
                            if (i47 < i16 && i47 < i) {
                                if (z) {
                                    i46 -= -c165613.f53628;
                                } else {
                                    i46 += -c165613.f53628;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10268() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f18870;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC18805) arrayList.get(i)).mo10268();
            i++;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private C10445 m16068() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f18870;
            if (i >= arrayList.size()) {
                return null;
            }
            AbstractC18805 abstractC18805 = (AbstractC18805) arrayList.get(i);
            if (abstractC18805.f61072.m26870() != 8) {
                return abstractC18805.f61072;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C10445 m16067() {
        AbstractC18805 abstractC18805;
        ArrayList arrayList = this.f18870;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            abstractC18805 = (AbstractC18805) arrayList.get(size);
        } while (abstractC18805.f61072.m26870() == 8);
        return abstractC18805.f61072;
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ۙ */
    public final void mo10265() {
        ArrayList arrayList = this.f18870;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC18805) it.next()).mo10265();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C10445 c10445 = ((AbstractC18805) arrayList.get(0)).f61072;
        C10445 c10446 = ((AbstractC18805) arrayList.get(size - 1)).f61072;
        int i = this.f61074;
        C16567 c16567 = this.f61071;
        C16567 c16568 = this.f61068;
        if (i == 0) {
            C0751 c0751 = c10445.f33212;
            C0751 c0752 = c10446.f33248;
            C16567 c16567M43599 = AbstractC18805.m43599(c0751, 0);
            int iM3108 = c0751.m3108();
            C10445 c10445M16068 = m16068();
            if (c10445M16068 != null) {
                iM3108 = c10445M16068.f33212.m3108();
            }
            if (c16567M43599 != null) {
                AbstractC18805.m43600(c16568, c16567M43599, iM3108);
            }
            C16567 c16567M435910 = AbstractC18805.m43599(c0752, 0);
            int iM3109 = c0752.m3108();
            C10445 c10445M16067 = m16067();
            if (c10445M16067 != null) {
                iM3109 = c10445M16067.f33248.m3108();
            }
            if (c16567M435910 != null) {
                AbstractC18805.m43600(c16567, c16567M435910, -iM3109);
            }
        } else {
            C0751 c0753 = c10445.f33197;
            C0751 c0754 = c10446.f33216;
            C16567 c16567M435911 = AbstractC18805.m43599(c0753, 1);
            int iM31010 = c0753.m3108();
            C10445 c10445M16069 = m16068();
            if (c10445M16069 != null) {
                iM31010 = c10445M16069.f33197.m3108();
            }
            if (c16567M435911 != null) {
                AbstractC18805.m43600(c16568, c16567M435911, iM31010);
            }
            C16567 c16567M435912 = AbstractC18805.m43599(c0754, 1);
            int iM31011 = c0754.m3108();
            C10445 c10445M160610 = m16067();
            if (c10445M160610 != null) {
                iM31011 = c10445M160610.f33216.m3108();
            }
            if (c16567M435912 != null) {
                AbstractC18805.m43600(c16567, c16567M435912, -iM31011);
            }
        }
        c16568.f53636 = this;
        c16567.f53636 = this;
    }
}
