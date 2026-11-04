package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: l.۟ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I5WF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8050 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Comparator f26676 = new C12524();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14761 m21936(AbstractC6559 abstractC6559, boolean z) {
        ArrayList arrayList;
        C18491 c18491;
        C0592 c0592;
        ArrayList arrayList2;
        int i;
        C18491 c18492;
        C4321 c4321;
        int i2;
        int iM54711;
        int i3;
        int i4;
        int iM54712;
        int i5;
        boolean z2;
        int iMo13346 = abstractC6559.mo13346();
        int iMo13344 = abstractC6559.mo13344();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C18491 c18493 = new C18491();
        c18493.f60170 = 0;
        c18493.f60168 = iMo13346;
        c18493.f60169 = 0;
        c18493.f60167 = iMo13344;
        arrayList4.add(c18493);
        int i6 = iMo13346 + iMo13344;
        int i7 = 1;
        int i8 = (((i6 + 1) / 2) * 2) + 1;
        C24459 c24459 = new C24459(i8);
        C24459 c244510 = new C24459(i8);
        ArrayList arrayList5 = new ArrayList();
        while (!arrayList4.isEmpty()) {
            C18491 c18494 = (C18491) C18011.m41990(arrayList4, i7);
            if (c18494.m43085() >= i7 && c18494.m43084() >= i7) {
                int iM43085 = ((c18494.m43085() + c18494.m43084()) + i7) / 2;
                c24459.m54712(i7, c18494.f60170);
                c244510.m54712(i7, c18494.f60168);
                int i9 = 0;
                while (true) {
                    if (i9 >= iM43085) {
                        arrayList = arrayList4;
                        c18491 = c18494;
                        c0592 = null;
                        break;
                    }
                    boolean z3 = Math.abs(c18494.m43085() - c18494.m43084()) % 2 == i7;
                    int iM43086 = c18494.m43085() - c18494.m43084();
                    int i10 = -i9;
                    int i11 = i10;
                    while (true) {
                        if (i11 > i9) {
                            arrayList = arrayList4;
                            i2 = iM43085;
                            c0592 = null;
                            break;
                        }
                        if (i11 == i10 || (i11 != i9 && c24459.m54711(i11 + 1) > c24459.m54711(i11 - 1))) {
                            iM54712 = c24459.m54711(i11 + 1);
                            i5 = iM54712;
                        } else {
                            iM54712 = c24459.m54711(i11 - 1);
                            i5 = iM54712 + 1;
                        }
                        i2 = iM43085;
                        int i12 = ((i5 - c18494.f60170) + c18494.f60169) - i11;
                        int i13 = (i9 == 0 || i5 != iM54712) ? i12 : i12 - 1;
                        arrayList = arrayList4;
                        while (i5 < c18494.f60168 && i12 < c18494.f60167 && abstractC6559.mo13347(i5, i12)) {
                            i5++;
                            i12++;
                        }
                        c24459.m54712(i11, i5);
                        if (z3) {
                            int i14 = iM43086 - i11;
                            z2 = z3;
                            if (i14 >= i10 + 1 && i14 <= i9 - 1 && c244510.m54711(i14) <= i5) {
                                c0592 = new C0592();
                                c0592.f2372 = iM54712;
                                c0592.f2370 = i13;
                                c0592.f2368 = i5;
                                c0592.f2371 = i12;
                                c0592.f2369 = false;
                                break;
                            }
                        } else {
                            z2 = z3;
                        }
                        i11 += 2;
                        iM43085 = i2;
                        arrayList4 = arrayList;
                        z3 = z2;
                    }
                    if (c0592 != null) {
                        c18491 = c18494;
                        break;
                    }
                    boolean z4 = (c18494.m43085() - c18494.m43084()) % 2 == 0;
                    int iM43087 = c18494.m43085() - c18494.m43084();
                    int i15 = i10;
                    while (true) {
                        if (i15 > i9) {
                            c18491 = c18494;
                            c0592 = null;
                            break;
                        }
                        if (i15 == i10 || (i15 != i9 && c244510.m54711(i15 + 1) < c244510.m54711(i15 - 1))) {
                            iM54711 = c244510.m54711(i15 + 1);
                            i3 = iM54711;
                        } else {
                            iM54711 = c244510.m54711(i15 - 1);
                            i3 = iM54711 - 1;
                        }
                        int i16 = c18494.f60167 - ((c18494.f60168 - i3) - i15);
                        int i17 = (i9 == 0 || i3 != iM54711) ? i16 : i16 + 1;
                        while (true) {
                            if (i3 > c18494.f60170 && i16 > c18494.f60169) {
                                c18491 = c18494;
                                if (!abstractC6559.mo13347(i3 - 1, i16 - 1)) {
                                    break;
                                }
                                i3--;
                                i16--;
                                c18494 = c18491;
                            } else {
                                c18491 = c18494;
                                break;
                            }
                        }
                        c244510.m54712(i15, i3);
                        if (z4 && (i4 = iM43087 - i15) >= i10 && i4 <= i9 && c24459.m54711(i4) >= i3) {
                            c0592 = new C0592();
                            c0592.f2372 = i3;
                            c0592.f2370 = i16;
                            c0592.f2368 = iM54711;
                            c0592.f2371 = i17;
                            c0592.f2369 = true;
                            break;
                        }
                        i15 += 2;
                        c18494 = c18491;
                    }
                    if (c0592 != null) {
                        break;
                    }
                    i9++;
                    i7 = 1;
                    iM43085 = i2;
                    arrayList4 = arrayList;
                    c18494 = c18491;
                }
            } else {
                arrayList = arrayList4;
                c18491 = c18494;
                c0592 = null;
                break;
            }
            if (c0592 != null) {
                if (c0592.m2685() > 0) {
                    int i18 = c0592.f2371;
                    int i19 = c0592.f2370;
                    int i20 = i18 - i19;
                    int i21 = c0592.f2368;
                    int i22 = c0592.f2372;
                    int i23 = i21 - i22;
                    if (i20 == i23) {
                        c4321 = new C4321(i22, i19, i23);
                    } else if (c0592.f2369) {
                        c4321 = new C4321(i22, i19, c0592.m2685());
                    } else {
                        c4321 = i20 > i23 ? new C4321(i22, i19 + 1, c0592.m2685()) : new C4321(i22 + 1, i19, c0592.m2685());
                    }
                    arrayList3.add(c4321);
                }
                if (arrayList5.isEmpty()) {
                    c18492 = new C18491();
                    i = 1;
                } else {
                    i = 1;
                    c18492 = (C18491) C18011.m41990(arrayList5, 1);
                }
                C18491 c18495 = c18491;
                c18492.f60170 = c18495.f60170;
                c18492.f60169 = c18495.f60169;
                c18492.f60168 = c0592.f2372;
                c18492.f60167 = c0592.f2370;
                arrayList2 = arrayList;
                arrayList2.add(c18492);
                c18495.f60168 = c18495.f60168;
                c18495.f60167 = c18495.f60167;
                c18495.f60170 = c0592.f2368;
                c18495.f60169 = c0592.f2371;
                arrayList2.add(c18495);
                i7 = i;
            } else {
                arrayList2 = arrayList;
                i7 = 1;
                arrayList5.add(c18491);
            }
            arrayList4 = arrayList2;
        }
        Collections.sort(arrayList3, f26676);
        return new C14761(abstractC6559, arrayList3, c24459.m54713(), c244510.m54713(), z);
    }
}
