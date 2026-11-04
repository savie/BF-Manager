package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I5WF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14761 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC6559 f48224;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f48225;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f48226;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f48227;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f48228;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f48229;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f48230;

    public C14761(AbstractC6559 abstractC6559, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z) {
        int i;
        int i2;
        this.f48225 = arrayList;
        this.f48227 = iArr;
        this.f48230 = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f48224 = abstractC6559;
        int iMo13346 = abstractC6559.mo13346();
        this.f48226 = iMo13346;
        int iMo13344 = abstractC6559.mo13344();
        this.f48228 = iMo13344;
        this.f48229 = z;
        C4321 c4321 = arrayList.isEmpty() ? null : (C4321) arrayList.get(0);
        if (c4321 == null || c4321.f15663 != 0 || c4321.f15662 != 0) {
            arrayList.add(0, new C4321(0, 0, 0));
        }
        arrayList.add(new C4321(iMo13346, iMo13344, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4321 c4322 = (C4321) it.next();
            for (int i3 = 0; i3 < c4322.f15661; i3++) {
                int i4 = c4322.f15663 + i3;
                int i5 = c4322.f15662 + i3;
                int i6 = abstractC6559.mo13345(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.f48229) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                C4321 c4323 = (C4321) it2.next();
                while (true) {
                    i = c4323.f15663;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            for (int i9 = 0; i9 < size; i9++) {
                                C4321 c4324 = (C4321) arrayList.get(i9);
                                while (true) {
                                    i2 = c4324.f15662;
                                    if (i8 < i2) {
                                        if (iArr2[i8] == 0 && abstractC6559.mo13347(i7, i8)) {
                                            int i10 = abstractC6559.mo13345(i7, i8) ? 8 : 4;
                                            iArr[i7] = (i8 << 4) | i10;
                                            iArr2[i8] = i10 | (i7 << 4);
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                i8 = c4324.f15661 + i2;
                            }
                        }
                        i7++;
                    }
                }
                i7 = c4323.f15661 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35496(AbstractC12964 abstractC12964) {
        int[] iArr;
        AbstractC6559 abstractC6559;
        int i;
        ArrayList arrayList;
        int i2;
        C22967 c22967 = new C22967(new C11032(abstractC12964));
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = this.f48225;
        int size = arrayList2.size() - 1;
        int i3 = this.f48226;
        int i4 = this.f48228;
        int i5 = i3;
        while (size >= 0) {
            C4321 c4321 = (C4321) arrayList2.get(size);
            int i6 = c4321.f15663;
            int i7 = c4321.f15662;
            int i8 = c4321.f15661;
            int i9 = i6 + i8;
            int i10 = i7 + i8;
            while (true) {
                iArr = this.f48227;
                abstractC6559 = this.f48224;
                if (i5 <= i9) {
                    break;
                }
                i5--;
                int i11 = iArr[i5];
                if ((i11 & 12) == 0) {
                    arrayList = arrayList2;
                    if (c22967.f74602 == 2 && (i2 = c22967.f74603) >= i5 && i2 <= i5 + 1) {
                        c22967.f74601++;
                        c22967.f74603 = i5;
                    } else {
                        c22967.m51838();
                        c22967.f74603 = i5;
                        c22967.f74601 = 1;
                        c22967.f74602 = 2;
                    }
                    i3--;
                } else {
                    arrayList = arrayList2;
                    C21475 c21475M35495 = m35495(arrayDeque, i11 >> 4, false);
                    if (c21475M35495 != null) {
                        int i12 = (i3 - c21475M35495.f68629) - 1;
                        c22967.m51840(i5, i12);
                        if ((i11 & 4) != 0) {
                            abstractC6559.getClass();
                            c22967.m51839(i12, 1);
                        }
                    } else {
                        arrayDeque.add(new C21475(i5, (i3 - i5) - 1, true));
                    }
                }
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            while (i4 > i10) {
                i4--;
                int i13 = this.f48230[i4];
                if ((i13 & 12) == 0) {
                    if (c22967.f74602 != 1 || i5 < (i = c22967.f74603)) {
                        c22967.m51838();
                        c22967.f74603 = i5;
                        c22967.f74601 = 1;
                        c22967.f74602 = 1;
                    } else {
                        int i14 = c22967.f74601;
                        if (i5 <= i + i14) {
                            c22967.f74601 = i14 + 1;
                            c22967.f74603 = Math.min(i5, i);
                        } else {
                            c22967.m51838();
                            c22967.f74603 = i5;
                            c22967.f74601 = 1;
                            c22967.f74602 = 1;
                        }
                    }
                    i3++;
                } else {
                    C21475 c21475M35496 = m35495(arrayDeque, i13 >> 4, true);
                    if (c21475M35496 == null) {
                        arrayDeque.add(new C21475(i4, i3 - i5, false));
                    } else {
                        c22967.m51840((i3 - c21475M35496.f68629) - 1, i5);
                        if ((i13 & 4) != 0) {
                            abstractC6559.getClass();
                            c22967.m51839(i5, 1);
                        }
                    }
                }
            }
            int i15 = i6;
            for (int i16 = 0; i16 < i8; i16++) {
                if ((iArr[i15] & 15) == 2) {
                    abstractC6559.getClass();
                    c22967.m51839(i15, 1);
                }
                i15++;
            }
            size--;
            i5 = i6;
            i4 = i7;
            arrayList2 = arrayList3;
        }
        c22967.m51838();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21475 m35495(ArrayDeque arrayDeque, int i, boolean z) {
        C21475 c21475;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c21475 = null;
                break;
            }
            c21475 = (C21475) it.next();
            if (c21475.f68631 == i && c21475.f68630 == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C21475 c21476 = (C21475) it.next();
            if (z) {
                c21476.f68629--;
            } else {
                c21476.f68629++;
            }
        }
        return c21475;
    }
}
