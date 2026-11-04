package l;

import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ܶۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15833 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16579 m37787(Object[] objArr, Object[] objArr2) {
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
        C1664 c1664M37784 = m37784(objArr.length, objArr2.length, i, i3);
        if (c1664M37784 != null) {
            return (C16579) c1664M37784.m5990();
        }
        C24785 c24785 = new C24785(((objArr.length + objArr2.length) - (i * 2)) - (i3 * 2));
        return m37786(c24785.m55312(i, i3, objArr), c24785.m55312(i, i3, objArr2), new C17325(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1664 m37784(int i, int i2, int i3, int i4) {
        int i5 = (i - i3) - i4;
        int i6 = (i2 - i3) - i4;
        if (i5 == 0 || i6 == 0) {
            return new C1664((i5 == 0 && i6 == 0) ? null : new C16579(i3, i3, i5, i6));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16579 m37786(int[] iArr, int[] iArr2, C17325 c17325) throws C23293 {
        BitSet[] bitSetArrM46650;
        C12104 c12104 = new C12104();
        int[][] iArrM30275 = c12104.m30275(iArr, iArr2);
        int[] iArr3 = iArrM30275[0];
        if (iArr3.length == 0 && iArrM30275[1].length == 0) {
            c17325.m40672(iArr.length, iArr2.length);
            return c17325.m40670();
        }
        try {
            int[] iArr4 = iArrM30275[1];
            C3155 c3155 = new C3155(iArr3, iArr4, 0, iArr3.length, 0, iArr4.length, new BitSet(iArr3.length), new BitSet(iArr4.length));
            c3155.m10297();
            bitSetArrM46650 = c3155.m10296();
        } catch (C23293 unused) {
            C20309 c20309 = new C20309(iArrM30275[0], iArrM30275[1]);
            c20309.m46649();
            bitSetArrM46650 = c20309.m46650();
            System.out.println("Successful fallback to patience diff");
        }
        c12104.m30274(bitSetArrM46650, c17325);
        return c17325.m40670();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16579 m37785(int[] iArr, int[] iArr2) {
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
        C1664 c1664M37784 = m37784(iArr.length, iArr2.length, i, i3);
        if (c1664M37784 != null) {
            return (C16579) c1664M37784.m5990();
        }
        boolean z = (i == 0 && i3 == 0) ? false : true;
        if (z) {
            iArr = Arrays.copyOfRange(iArr, i, iArr.length - i3);
        }
        if (z) {
            iArr2 = Arrays.copyOfRange(iArr2, i, iArr2.length - i3);
        }
        return m37786(iArr, iArr2, new C17325(i));
    }
}
