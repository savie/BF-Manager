package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۘܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5WF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4066 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Comparator f14966 = new C4772();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5478 m11593(AbstractC13946 abstractC13946) {
        ArrayList arrayList;
        C1244 c1244;
        C13240 c13240;
        ArrayList arrayList2;
        int i;
        C1244 c1245;
        C2655 c2655;
        int i2;
        int iM29498;
        int i3;
        int i4;
        int iM29499;
        int i5;
        boolean z;
        int iMo7139 = abstractC13946.mo7139();
        int iMo7137 = abstractC13946.mo7137();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C1244 c1246 = new C1244();
        c1246.f5421 = 0;
        c1246.f5423 = iMo7139;
        c1246.f5424 = 0;
        c1246.f5422 = iMo7137;
        arrayList4.add(c1246);
        int i6 = iMo7139 + iMo7137;
        int i7 = 1;
        int i8 = (((i6 + 1) / 2) * 2) + 1;
        C11829 c11829 = new C11829(i8);
        C11829 c118210 = new C11829(i8);
        ArrayList arrayList5 = new ArrayList();
        while (!arrayList4.isEmpty()) {
            C1244 c1247 = (C1244) C17745.m41308(arrayList4, i7);
            if (c1247.m4461() >= i7 && c1247.m4460() >= i7) {
                int iM4461 = ((c1247.m4461() + c1247.m4460()) + i7) / 2;
                c11829.m29499(i7, c1247.f5421);
                c118210.m29499(i7, c1247.f5423);
                int i9 = 0;
                while (true) {
                    if (i9 >= iM4461) {
                        arrayList = arrayList4;
                        c1244 = c1247;
                        c13240 = null;
                        break;
                    }
                    boolean z2 = Math.abs(c1247.m4461() - c1247.m4460()) % 2 == i7;
                    int iM4462 = c1247.m4461() - c1247.m4460();
                    int i10 = -i9;
                    int i11 = i10;
                    while (true) {
                        if (i11 > i9) {
                            arrayList = arrayList4;
                            i2 = iM4461;
                            c13240 = null;
                            break;
                        }
                        if (i11 == i10 || (i11 != i9 && c11829.m29498(i11 + 1) > c11829.m29498(i11 - 1))) {
                            iM29499 = c11829.m29498(i11 + 1);
                            i5 = iM29499;
                        } else {
                            iM29499 = c11829.m29498(i11 - 1);
                            i5 = iM29499 + 1;
                        }
                        i2 = iM4461;
                        int i12 = ((i5 - c1247.f5421) + c1247.f5424) - i11;
                        int i13 = (i9 == 0 || i5 != iM29499) ? i12 : i12 - 1;
                        arrayList = arrayList4;
                        while (i5 < c1247.f5423 && i12 < c1247.f5422 && abstractC13946.mo7140(i5, i12)) {
                            i5++;
                            i12++;
                        }
                        c11829.m29499(i11, i5);
                        if (z2) {
                            int i14 = iM4462 - i11;
                            z = z2;
                            if (i14 >= i10 + 1 && i14 <= i9 - 1 && c118210.m29498(i14) <= i5) {
                                c13240 = new C13240();
                                c13240.f43997 = iM29499;
                                c13240.f43999 = i13;
                                c13240.f43998 = i5;
                                c13240.f44001 = i12;
                                c13240.f44000 = false;
                                break;
                            }
                        } else {
                            z = z2;
                        }
                        i11 += 2;
                        iM4461 = i2;
                        arrayList4 = arrayList;
                        z2 = z;
                    }
                    if (c13240 != null) {
                        c1244 = c1247;
                        break;
                    }
                    boolean z3 = (c1247.m4461() - c1247.m4460()) % 2 == 0;
                    int iM4463 = c1247.m4461() - c1247.m4460();
                    int i15 = i10;
                    while (true) {
                        if (i15 > i9) {
                            c1244 = c1247;
                            c13240 = null;
                            break;
                        }
                        if (i15 == i10 || (i15 != i9 && c118210.m29498(i15 + 1) < c118210.m29498(i15 - 1))) {
                            iM29498 = c118210.m29498(i15 + 1);
                            i3 = iM29498;
                        } else {
                            iM29498 = c118210.m29498(i15 - 1);
                            i3 = iM29498 - 1;
                        }
                        int i16 = c1247.f5422 - ((c1247.f5423 - i3) - i15);
                        int i17 = (i9 == 0 || i3 != iM29498) ? i16 : i16 + 1;
                        while (true) {
                            if (i3 > c1247.f5421 && i16 > c1247.f5424) {
                                c1244 = c1247;
                                if (!abstractC13946.mo7140(i3 - 1, i16 - 1)) {
                                    break;
                                }
                                i3--;
                                i16--;
                                c1247 = c1244;
                            } else {
                                c1244 = c1247;
                                break;
                            }
                        }
                        c118210.m29499(i15, i3);
                        if (z3 && (i4 = iM4463 - i15) >= i10 && i4 <= i9 && c11829.m29498(i4) >= i3) {
                            c13240 = new C13240();
                            c13240.f43997 = i3;
                            c13240.f43999 = i16;
                            c13240.f43998 = iM29498;
                            c13240.f44001 = i17;
                            c13240.f44000 = true;
                            break;
                        }
                        i15 += 2;
                        c1247 = c1244;
                    }
                    if (c13240 != null) {
                        break;
                    }
                    i9++;
                    i7 = 1;
                    iM4461 = i2;
                    arrayList4 = arrayList;
                    c1247 = c1244;
                }
            } else {
                arrayList = arrayList4;
                c1244 = c1247;
                c13240 = null;
                break;
            }
            if (c13240 != null) {
                if (c13240.m32719() > 0) {
                    int i18 = c13240.f44001;
                    int i19 = c13240.f43999;
                    int i20 = i18 - i19;
                    int i21 = c13240.f43998;
                    int i22 = c13240.f43997;
                    int i23 = i21 - i22;
                    if (i20 == i23) {
                        c2655 = new C2655(i22, i19, i23);
                    } else if (c13240.f44000) {
                        c2655 = new C2655(i22, i19, c13240.m32719());
                    } else {
                        c2655 = i20 > i23 ? new C2655(i22, i19 + 1, c13240.m32719()) : new C2655(i22 + 1, i19, c13240.m32719());
                    }
                    arrayList3.add(c2655);
                }
                if (arrayList5.isEmpty()) {
                    c1245 = new C1244();
                    i = 1;
                } else {
                    i = 1;
                    c1245 = (C1244) C17745.m41308(arrayList5, 1);
                }
                C1244 c1248 = c1244;
                c1245.f5421 = c1248.f5421;
                c1245.f5424 = c1248.f5424;
                c1245.f5423 = c13240.f43997;
                c1245.f5422 = c13240.f43999;
                arrayList2 = arrayList;
                arrayList2.add(c1245);
                c1248.f5423 = c1248.f5423;
                c1248.f5422 = c1248.f5422;
                c1248.f5421 = c13240.f43998;
                c1248.f5424 = c13240.f44001;
                arrayList2.add(c1248);
                i7 = i;
            } else {
                arrayList2 = arrayList;
                i7 = 1;
                arrayList5.add(c1244);
            }
            arrayList4 = arrayList2;
        }
        Collections.sort(arrayList3, f14966);
        return new C5478(abstractC13946, arrayList3, c11829.m29500(), c118210.m29500());
    }
}
