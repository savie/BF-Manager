package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5WF */
/* JADX INFO: loaded from: classes2.dex */
public final class C5478 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f18859;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f18860;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13946 f18861;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f18862;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f18863;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f18864;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f18865;

    public C5478(AbstractC13946 abstractC13946, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        int i2;
        this.f18863 = arrayList;
        this.f18865 = iArr;
        this.f18860 = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f18861 = abstractC13946;
        int iMo7139 = abstractC13946.mo7139();
        this.f18859 = iMo7139;
        int iMo7137 = abstractC13946.mo7137();
        this.f18862 = iMo7137;
        this.f18864 = true;
        C2655 c2655 = arrayList.isEmpty() ? null : (C2655) arrayList.get(0);
        if (c2655 == null || c2655.f10323 != 0 || c2655.f10322 != 0) {
            arrayList.add(0, new C2655(0, 0, 0));
        }
        arrayList.add(new C2655(iMo7139, iMo7137, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2655 c2656 = (C2655) it.next();
            for (int i3 = 0; i3 < c2656.f10321; i3++) {
                int i4 = c2656.f10323 + i3;
                int i5 = c2656.f10322 + i3;
                int i6 = abstractC13946.mo7138(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.f18864) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                C2655 c2657 = (C2655) it2.next();
                while (true) {
                    i = c2657.f10323;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            for (int i9 = 0; i9 < size; i9++) {
                                C2655 c2658 = (C2655) arrayList.get(i9);
                                while (true) {
                                    i2 = c2658.f10322;
                                    if (i8 < i2) {
                                        if (iArr2[i8] == 0 && abstractC13946.mo7140(i7, i8)) {
                                            int i10 = abstractC13946.mo7138(i7, i8) ? 8 : 4;
                                            iArr[i7] = (i8 << 4) | i10;
                                            iArr2[i8] = i10 | (i7 << 4);
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                i8 = c2658.f10321 + i2;
                            }
                        }
                        i7++;
                    }
                }
                i7 = c2657.f10321 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15146(AbstractC0414 abstractC0414) {
        int[] iArr;
        AbstractC13946 abstractC13946;
        int i;
        ArrayList arrayList;
        int i2;
        C20525 c20525 = new C20525(new C7119(abstractC0414));
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = this.f18863;
        int size = arrayList2.size() - 1;
        int i3 = this.f18859;
        int i4 = this.f18862;
        int i5 = i3;
        while (size >= 0) {
            C2655 c2655 = (C2655) arrayList2.get(size);
            int i6 = c2655.f10323;
            int i7 = c2655.f10322;
            int i8 = c2655.f10321;
            int i9 = i6 + i8;
            int i10 = i7 + i8;
            while (true) {
                iArr = this.f18865;
                abstractC13946 = this.f18861;
                if (i5 <= i9) {
                    break;
                }
                i5--;
                int i11 = iArr[i5];
                if ((i11 & 12) == 0) {
                    arrayList = arrayList2;
                    if (c20525.f66504 == 2 && (i2 = c20525.f66505) >= i5 && i2 <= i5 + 1) {
                        c20525.f66503++;
                        c20525.f66505 = i5;
                    } else {
                        c20525.m46309();
                        c20525.f66505 = i5;
                        c20525.f66503 = 1;
                        c20525.f66504 = 2;
                    }
                    i3--;
                } else {
                    arrayList = arrayList2;
                    C22412 c22412M15145 = m15145(arrayDeque, i11 >> 4, false);
                    if (c22412M15145 != null) {
                        int i12 = (i3 - c22412M15145.f73140) - 1;
                        c20525.m46311(i5, i12);
                        if ((i11 & 4) != 0) {
                            abstractC13946.getClass();
                            c20525.m46310(i12, 1);
                        }
                    } else {
                        arrayDeque.add(new C22412(i5, (i3 - i5) - 1, true));
                    }
                }
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            while (i4 > i10) {
                i4--;
                int i13 = this.f18860[i4];
                if ((i13 & 12) == 0) {
                    if (c20525.f66504 != 1 || i5 < (i = c20525.f66505)) {
                        c20525.m46309();
                        c20525.f66505 = i5;
                        c20525.f66503 = 1;
                        c20525.f66504 = 1;
                    } else {
                        int i14 = c20525.f66503;
                        if (i5 <= i + i14) {
                            c20525.f66503 = i14 + 1;
                            c20525.f66505 = Math.min(i5, i);
                        } else {
                            c20525.m46309();
                            c20525.f66505 = i5;
                            c20525.f66503 = 1;
                            c20525.f66504 = 1;
                        }
                    }
                    i3++;
                } else {
                    C22412 c22412M15146 = m15145(arrayDeque, i13 >> 4, true);
                    if (c22412M15146 == null) {
                        arrayDeque.add(new C22412(i4, i3 - i5, false));
                    } else {
                        c20525.m46311((i3 - c22412M15146.f73140) - 1, i5);
                        if ((i13 & 4) != 0) {
                            abstractC13946.getClass();
                            c20525.m46310(i5, 1);
                        }
                    }
                }
            }
            int i15 = i6;
            for (int i16 = 0; i16 < i8; i16++) {
                if ((iArr[i15] & 15) == 2) {
                    abstractC13946.getClass();
                    c20525.m46310(i15, 1);
                }
                i15++;
            }
            size--;
            i5 = i6;
            i4 = i7;
            arrayList2 = arrayList3;
        }
        c20525.m46309();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22412 m15145(ArrayDeque arrayDeque, int i, boolean z) {
        C22412 c22412;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c22412 = null;
                break;
            }
            c22412 = (C22412) it.next();
            if (c22412.f73142 == i && c22412.f73141 == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C22412 c22413 = (C22412) it.next();
            if (z) {
                c22413.f73140--;
            } else {
                c22413.f73140++;
            }
        }
        return c22412;
    }
}
