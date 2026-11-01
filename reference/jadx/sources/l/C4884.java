package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: H1AQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4884 extends AbstractC7707 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public ArrayList f17164;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f17165;

    public C4884(C20719 c20719, int i) {
        super(c20719);
        ArrayList<AbstractC7707> arrayList = new ArrayList();
        this.f17164 = arrayList;
        this.f25508 = i;
        C20719 c207110 = this.f25504;
        C20719 c20719M46578 = c207110.m46578(i);
        while (c20719M46578 != null) {
            c207110 = c20719M46578;
            c20719M46578 = c20719M46578.m46578(this.f25508);
        }
        this.f25504 = c207110;
        int i2 = this.f25508;
        arrayList.add(i2 == 0 ? c207110.f67376 : i2 == 1 ? c207110.f67409 : null);
        C20719 c20719M46615 = c207110.m46615(this.f25508);
        while (c20719M46615 != null) {
            int i3 = this.f25508;
            arrayList.add(i3 == 0 ? c20719M46615.f67376 : i3 == 1 ? c20719M46615.f67409 : null);
            c20719M46615 = c20719M46615.m46615(this.f25508);
        }
        for (AbstractC7707 abstractC7707 : arrayList) {
            int i4 = this.f25508;
            if (i4 == 0) {
                abstractC7707.f25504.f67406 = this;
            } else if (i4 == 1) {
                abstractC7707.f25504.f67399 = this;
            }
        }
        if (this.f25508 == 0 && ((C15781) this.f25504.f67433).m37538() && arrayList.size() > 1) {
            this.f25504 = ((AbstractC7707) C19084.m43861(arrayList, 1)).f25504;
        }
        this.f17165 = this.f25508 == 0 ? this.f25504.m46604() : this.f25504.m46612();
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f25508 == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC7707 abstractC7707 : this.f17164) {
            strConcat = C15489.m37076(C15489.m37076(strConcat, "<") + abstractC7707, "> ");
        }
        return strConcat;
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo11825() {
        ArrayList arrayList = this.f17164;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC7707) arrayList.get(i)).mo11825()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long mo13593() {
        ArrayList arrayList = this.f17164;
        int size = arrayList.size();
        long jMo13593 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC7707 abstractC7707 = (AbstractC7707) arrayList.get(i);
            jMo13593 = ((long) abstractC7707.f25505.f19193) + abstractC7707.mo13593() + jMo13593 + ((long) abstractC7707.f25501.f19193);
        }
        return jMo13593;
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ۨ */
    public final void mo11823() {
        this.f25506 = null;
        Iterator it = this.f17164.iterator();
        while (it.hasNext()) {
            ((AbstractC7707) it.next()).mo11823();
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
    @Override // l.AbstractC7707, l.InterfaceC14058
    /* JADX INFO: renamed from: ۙ */
    public final void mo11822(InterfaceC14058 interfaceC14058) {
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
        C5590 c5590 = this.f25501;
        if (c5590.f19187) {
            C5590 c5591 = this.f25505;
            if (c5591.f19187) {
                C20719 c20719 = this.f25504.f67433;
                boolean zM37538 = (c20719 == null || !(c20719 instanceof C15781)) ? false : ((C15781) c20719).m37538();
                int i14 = c5591.f19196 - c5590.f19196;
                ArrayList arrayList3 = this.f17164;
                int size = arrayList3.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((AbstractC7707) arrayList3.get(i15)).f25504.m46606() != 8) {
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = size - 1;
                for (int i17 = i16; i17 >= 0; i17--) {
                    if (((AbstractC7707) arrayList3.get(i17)).f25504.m46606() != 8) {
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
                        AbstractC7707 abstractC7707 = (AbstractC7707) arrayList3.get(i19);
                        ArrayList arrayList4 = arrayList3;
                        if (abstractC7707.f25504.m46606() == i2) {
                            i12 = i15;
                        } else {
                            i20++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += abstractC7707.f25501.f19193;
                            }
                            C22524 c22524 = abstractC7707.f25502;
                            int i21 = c22524.f19196;
                            i12 = i15;
                            boolean z3 = abstractC7707.f25507 != EnumC7313.MATCH_CONSTRAINT;
                            if (z3) {
                                int i22 = this.f25508;
                                if (i22 == 0 && !abstractC7707.f25504.f67376.f25502.f19187) {
                                    return;
                                }
                                if (i22 == 1 && !abstractC7707.f25504.f67409.f25502.f19187) {
                                    return;
                                }
                            } else {
                                if (abstractC7707.f25503 == 1 && i18 == 0) {
                                    i13 = c22524.f73492;
                                    i4++;
                                } else {
                                    if (c22524.f19187) {
                                        i13 = i21;
                                    }
                                    if (z2) {
                                        i5 += i13;
                                    } else {
                                        i4++;
                                        f6 = abstractC7707.f25504.f67413[this.f25508];
                                        if (f6 >= 0.0f) {
                                            f2 += f6;
                                        }
                                    }
                                    if (i19 >= i16 && i19 < i) {
                                        i5 += -abstractC7707.f25505.f19193;
                                    }
                                }
                                z2 = true;
                                if (z2) {
                                    i4++;
                                    f6 = abstractC7707.f25504.f67413[this.f25508];
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
                                f6 = abstractC7707.f25504.f67413[this.f25508];
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
                int i23 = c5590.f19196;
                if (zM37538) {
                    i23 = c5591.f19196;
                }
                if (i5 > i14) {
                    int i24 = (int) (((i5 - i14) / 2.0f) + 0.5f);
                    i23 = zM37538 ? i23 + i24 : i23 - i24;
                }
                if (i4 > 0) {
                    float f7 = i14 - i5;
                    int i25 = (int) ((f7 / i4) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        ArrayList arrayList5 = arrayList;
                        int i28 = i25;
                        AbstractC7707 abstractC7708 = (AbstractC7707) arrayList5.get(i26);
                        int i29 = i5;
                        C20719 c207110 = abstractC7708.f25504;
                        int i30 = i23;
                        C22524 c22525 = abstractC7708.f25502;
                        boolean z4 = zM37538;
                        if (c207110.m46606() == 8 || abstractC7708.f25507 != EnumC7313.MATCH_CONSTRAINT || c22525.f19187) {
                            f4 = f7;
                            f5 = f;
                        } else {
                            int i31 = f2 > f ? (int) (((abstractC7708.f25504.f67413[this.f25508] * f7) / f2) + 0.5f) : i28;
                            if (this.f25508 == 0) {
                                C20719 c207111 = abstractC7708.f25504;
                                f4 = f7;
                                int i32 = c207111.f67382;
                                f5 = f;
                                iMax = Math.max(c207111.f67401, abstractC7708.f25503 == 1 ? Math.min(i31, c22525.f73492) : i31);
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
                                C20719 c207112 = abstractC7708.f25504;
                                int i33 = c207112.f67378;
                                iMax = Math.max(c207112.f67407, abstractC7708.f25503 == 1 ? Math.min(i31, c22525.f73492) : i31);
                                if (i33 > 0) {
                                    iMax = Math.min(i33, iMax);
                                }
                                if (iMax != i31) {
                                    i31 = iMax;
                                    i27++;
                                }
                            }
                            c22525.mo15463(i31);
                        }
                        i26++;
                        i23 = i30;
                        i5 = i29;
                        f7 = f4;
                        i25 = i28;
                        zM37538 = z4;
                        f = f5;
                        arrayList = arrayList5;
                    }
                    i7 = i23;
                    z = zM37538;
                    int i34 = i5;
                    arrayList2 = arrayList;
                    f3 = 0.5f;
                    if (i27 > 0) {
                        i4 -= i27;
                        int i35 = 0;
                        int i36 = 0;
                        while (i35 < size) {
                            AbstractC7707 abstractC7709 = (AbstractC7707) arrayList2.get(i35);
                            if (abstractC7709.f25504.m46606() == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i36 += abstractC7709.f25501.f19193;
                                }
                                i36 += abstractC7709.f25502.f19196;
                                if (i35 < i16 && i35 < i) {
                                    i36 += -abstractC7709.f25505.f19193;
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
                    if (this.f17165 == 2 && i27 == 0) {
                        this.f17165 = 0;
                    }
                } else {
                    i7 = i23;
                    z = zM37538;
                    arrayList2 = arrayList;
                    i8 = i3;
                    i9 = 2;
                    f3 = 0.5f;
                }
                if (i5 > i14) {
                    this.f17165 = i9;
                }
                if (i6 > 0 && i4 == 0 && i8 == i) {
                    this.f17165 = i9;
                }
                int i37 = this.f17165;
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
                        AbstractC7707 abstractC77010 = (AbstractC7707) arrayList2.get(z ? size - (i39 + 1) : i39);
                        C20719 c207113 = abstractC77010.f25504;
                        C5590 c5592 = abstractC77010.f25505;
                        C5590 c5593 = abstractC77010.f25501;
                        if (c207113.m46606() == 8) {
                            c5593.mo15463(i38);
                            c5592.mo15463(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z ? i38 - i10 : i38 + i10;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                if (z) {
                                    i38 -= c5593.f19193;
                                } else {
                                    i38 += c5593.f19193;
                                }
                            }
                            if (z) {
                                c5592.mo15463(i38);
                            } else {
                                c5593.mo15463(i38);
                            }
                            C22524 c22526 = abstractC77010.f25502;
                            int i40 = c22526.f19196;
                            if (abstractC77010.f25507 == EnumC7313.MATCH_CONSTRAINT && abstractC77010.f25503 == 1) {
                                i40 = c22526.f73492;
                            }
                            i38 = z ? i38 - i40 : i38 + i40;
                            if (z) {
                                c5593.mo15463(i38);
                            } else {
                                c5592.mo15463(i38);
                            }
                            abstractC77010.f25499 = true;
                            if (i39 < i16 && i39 < i) {
                                if (z) {
                                    i38 -= -c5592.f19193;
                                } else {
                                    i38 += -c5592.f19193;
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
                        AbstractC7707 abstractC77011 = (AbstractC7707) arrayList2.get(z ? size - (i43 + 1) : i43);
                        C20719 c207114 = abstractC77011.f25504;
                        C5590 c5594 = abstractC77011.f25505;
                        C5590 c5595 = abstractC77011.f25501;
                        if (c207114.m46606() == 8) {
                            c5595.mo15463(i42);
                            c5594.mo15463(i42);
                        } else {
                            int i44 = z ? i42 - i41 : i42 + i41;
                            if (i43 > 0 && i43 >= i8) {
                                if (z) {
                                    i44 -= c5595.f19193;
                                } else {
                                    i44 += c5595.f19193;
                                }
                            }
                            if (z) {
                                c5594.mo15463(i44);
                            } else {
                                c5595.mo15463(i44);
                            }
                            C22524 c22527 = abstractC77011.f25502;
                            int iMin = c22527.f19196;
                            if (abstractC77011.f25507 == EnumC7313.MATCH_CONSTRAINT && abstractC77011.f25503 == 1) {
                                iMin = Math.min(iMin, c22527.f73492);
                            }
                            i42 = z ? i44 - iMin : i44 + iMin;
                            if (z) {
                                c5595.mo15463(i42);
                            } else {
                                c5594.mo15463(i42);
                            }
                            if (i43 < i16 && i43 < i) {
                                if (z) {
                                    i42 -= -c5594.f19193;
                                } else {
                                    i42 += -c5594.f19193;
                                }
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    float fM46582 = this.f25508 == 0 ? this.f25504.m46582() : this.f25504.m46609();
                    if (z) {
                        fM46582 = 1.0f - fM46582;
                    }
                    int i45 = (int) (((i14 - i5) * fM46582) + f3);
                    if (i45 < 0 || i4 > 0) {
                        i45 = 0;
                    }
                    int i46 = z ? i7 - i45 : i7 + i45;
                    for (int i47 = 0; i47 < size; i47++) {
                        AbstractC7707 abstractC77012 = (AbstractC7707) arrayList2.get(z ? size - (i47 + 1) : i47);
                        C20719 c207115 = abstractC77012.f25504;
                        C5590 c5596 = abstractC77012.f25505;
                        C5590 c5597 = abstractC77012.f25501;
                        if (c207115.m46606() == 8) {
                            c5597.mo15463(i46);
                            c5596.mo15463(i46);
                        } else {
                            if (i47 > 0 && i47 >= i8) {
                                if (z) {
                                    i46 -= c5597.f19193;
                                } else {
                                    i46 += c5597.f19193;
                                }
                            }
                            if (z) {
                                c5596.mo15463(i46);
                            } else {
                                c5597.mo15463(i46);
                            }
                            C22524 c22528 = abstractC77012.f25502;
                            int i48 = c22528.f19196;
                            if (abstractC77012.f25507 == EnumC7313.MATCH_CONSTRAINT && abstractC77012.f25503 == 1) {
                                i48 = c22528.f73492;
                            }
                            i46 = z ? i46 - i48 : i46 + i48;
                            if (z) {
                                c5597.mo15463(i46);
                            } else {
                                c5596.mo15463(i46);
                            }
                            if (i47 < i16 && i47 < i) {
                                if (z) {
                                    i46 -= -c5596.f19193;
                                } else {
                                    i46 += -c5596.f19193;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ܰ */
    public final void mo11824() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f17164;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC7707) arrayList.get(i)).mo11824();
            i++;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C20719 m13591() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f17164;
            if (i >= arrayList.size()) {
                return null;
            }
            AbstractC7707 abstractC7707 = (AbstractC7707) arrayList.get(i);
            if (abstractC7707.f25504.m46606() != 8) {
                return abstractC7707.f25504;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private C20719 m13592() {
        AbstractC7707 abstractC7707;
        ArrayList arrayList = this.f17164;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            abstractC7707 = (AbstractC7707) arrayList.get(size);
        } while (abstractC7707.f25504.m46606() == 8);
        return abstractC7707.f25504;
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ۙ */
    public final void mo11821() {
        ArrayList arrayList = this.f17164;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC7707) it.next()).mo11821();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C20719 c20719 = ((AbstractC7707) arrayList.get(0)).f25504;
        C20719 c207110 = ((AbstractC7707) arrayList.get(size - 1)).f25504;
        int i = this.f25508;
        C5590 c5590 = this.f25505;
        C5590 c5591 = this.f25501;
        if (i == 0) {
            C8725 c8725 = c20719.f67385;
            C8725 c8726 = c207110.f67421;
            C5590 c5590M20337 = AbstractC7707.m20337(c8725, 0);
            int iM22577 = c8725.m22577();
            C20719 c20719M13591 = m13591();
            if (c20719M13591 != null) {
                iM22577 = c20719M13591.f67385.m22577();
            }
            if (c5590M20337 != null) {
                AbstractC7707.m20338(c5591, c5590M20337, iM22577);
            }
            C5590 c5590M20338 = AbstractC7707.m20337(c8726, 0);
            int iM22578 = c8726.m22577();
            C20719 c20719M13592 = m13592();
            if (c20719M13592 != null) {
                iM22578 = c20719M13592.f67421.m22577();
            }
            if (c5590M20338 != null) {
                AbstractC7707.m20338(c5590, c5590M20338, -iM22578);
            }
        } else {
            C8725 c8727 = c20719.f67392;
            C8725 c8728 = c207110.f67387;
            C5590 c5590M20339 = AbstractC7707.m20337(c8727, 1);
            int iM22579 = c8727.m22577();
            C20719 c20719M13593 = m13591();
            if (c20719M13593 != null) {
                iM22579 = c20719M13593.f67392.m22577();
            }
            if (c5590M20339 != null) {
                AbstractC7707.m20338(c5591, c5590M20339, iM22579);
            }
            C5590 c5590M203310 = AbstractC7707.m20337(c8728, 1);
            int iM225710 = c8728.m22577();
            C20719 c20719M13594 = m13592();
            if (c20719M13594 != null) {
                iM225710 = c20719M13594.f67387.m22577();
            }
            if (c5590M203310 != null) {
                AbstractC7707.m20338(c5590, c5590M203310, -iM225710);
            }
        }
        c5591.f19198 = this;
        c5590.f19198 = this;
    }
}
