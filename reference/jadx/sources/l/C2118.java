package l;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: renamed from: l.֫᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2118 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23992 m6667(Object[] objArr, Object[] objArr2) {
        for (Object obj : objArr) {
        }
        for (Object obj2 : objArr2) {
        }
        int iMin = Math.min(objArr.length, objArr2.length);
        int i = 0;
        for (int i2 = 0; i2 < iMin && objArr[i2].equals(objArr2[i2]); i2++) {
            i++;
        }
        int iMin2 = Math.min(objArr.length, objArr2.length) - i;
        int i3 = 0;
        for (int i4 = 0; i4 < iMin2 && objArr[(objArr.length - i4) - 1].equals(objArr2[(objArr2.length - i4) - 1]); i4++) {
            i3++;
        }
        C10114 c10114M6664 = m6664(objArr.length, objArr2.length, i, i3);
        if (c10114M6664 != null) {
            return (C23992) c10114M6664.m25740();
        }
        C11292 c11292 = new C11292(((objArr.length + objArr2.length) - (i * 2)) - (i3 * 2));
        return m6666(c11292.m28303(i, i3, objArr), c11292.m28303(i, i3, objArr2), new C14820(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10114 m6664(int i, int i2, int i3, int i4) {
        int i5 = (i - i3) - i4;
        int i6 = (i2 - i3) - i4;
        if (i5 == 0 || i6 == 0) {
            return new C10114((i5 == 0 && i6 == 0) ? null : new C23992(i3, i3, i5, i6));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23992 m6666(int[] iArr, int[] iArr2, C14820 c14820) throws C9881 {
        BitSet[] bitSetArrM12145;
        C13493 c13493 = new C13493();
        int[][] iArrM33021 = c13493.m33021(iArr, iArr2);
        int[] iArr3 = iArrM33021[0];
        if (iArr3.length == 0 && iArrM33021[1].length == 0) {
            c14820.m35506(iArr.length, iArr2.length);
            return c14820.m35504();
        }
        try {
            int[] iArr4 = iArrM33021[1];
            C3529 c3529 = new C3529(iArr3, iArr4, 0, iArr3.length, 0, iArr4.length, new BitSet(iArr3.length), new BitSet(iArr4.length));
            c3529.m10394();
            bitSetArrM12145 = c3529.m10393();
        } catch (C9881 unused) {
            C4319 c4319 = new C4319(iArrM33021[0], iArrM33021[1]);
            c4319.m12144();
            bitSetArrM12145 = c4319.m12145();
            System.out.println("Successful fallback to patience diff");
        }
        c13493.m33020(bitSetArrM12145, c14820);
        return c14820.m35504();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23992 m6665(int[] iArr, int[] iArr2) {
        int iMin = Math.min(iArr.length, iArr2.length);
        int i = 0;
        for (int i2 = 0; i2 < iMin && iArr[i2] == iArr2[i2]; i2++) {
            i++;
        }
        int iMin2 = Math.min(iArr.length, iArr2.length) - i;
        int i3 = 0;
        for (int i4 = 0; i4 < iMin2 && iArr[(iArr.length - i4) - 1] == iArr2[(iArr2.length - i4) - 1]; i4++) {
            i3++;
        }
        C10114 c10114M6664 = m6664(iArr.length, iArr2.length, i, i3);
        if (c10114M6664 != null) {
            return (C23992) c10114M6664.m25740();
        }
        boolean z = (i == 0 && i3 == 0) ? false : true;
        if (z) {
            iArr = Arrays.copyOfRange(iArr, i, iArr.length - i3);
        }
        if (z) {
            iArr2 = Arrays.copyOfRange(iArr2, i, iArr2.length - i3);
        }
        return m6666(iArr, iArr2, new C14820(i));
    }
}
