package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֫ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C1689 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f5801;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f5802;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public char[] f5803;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5804;

    public C1689(int i) {
        this.f5801 = new int[Math.max(8, i)];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m6046(int i) {
        int[] iArr = this.f5802;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6044(int i) {
        int[] iArr = this.f5802;
        if (iArr == null) {
            return 0;
        }
        return iArr[i + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1689 m6045(int i, int i2) {
        int i3 = i2 - i;
        C1689 c1689 = new C1689(i3);
        c1689.f5804 = i3;
        System.arraycopy(this.f5801, i, c1689.f5801, 0, i3);
        int iM6046 = m6046(i);
        int iM6044 = i2 == 0 ? iM6046 : m6044(i2 - 1);
        if (iM6044 != iM6046) {
            c1689.f5802 = new int[c1689.f5801.length + 1];
            for (int i4 = 0; i4 <= c1689.f5804; i4++) {
                c1689.f5802[i4] = this.f5802[i + i4] - iM6046;
            }
            c1689.f5803 = Arrays.copyOfRange(this.f5803, iM6046, iM6044);
        }
        return c1689;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1689 m6043(C1689 c1689, C1689 c16810) {
        C1689 c16811 = new C1689(c1689.f5804 + c16810.f5804);
        c16811.f5804 = c1689.f5804 + c16810.f5804;
        System.arraycopy(c1689.f5801, 0, c16811.f5801, 0, c1689.f5804);
        System.arraycopy(c16810.f5801, 0, c16811.f5801, c1689.f5804, c16810.f5804);
        int iM6044 = c1689.m6044(c1689.f5804 - 1);
        long jM6044 = ((long) iM6044) + ((long) c16810.m6044(c16810.f5804 - 1));
        int i = (int) jM6044;
        if (jM6044 != i) {
            throw new ArithmeticException();
        }
        if (i != 0) {
            c16811.f5802 = new int[c16811.f5801.length + 1];
            c16811.f5803 = new char[i];
            for (int i2 = 0; i2 < c1689.f5804; i2++) {
                c16811.f5802[i2] = c1689.m6046(i2);
            }
            for (int i3 = 0; i3 < c16810.f5804; i3++) {
                c16811.f5802[c1689.f5804 + i3] = c16810.m6046(i3) + iM6044;
            }
            c16811.f5802[c16811.f5804] = i;
            if (iM6044 != 0) {
                System.arraycopy(c1689.f5803, 0, c16811.f5803, 0, iM6044);
            }
            if (i != iM6044) {
                System.arraycopy(c16810.f5803, 0, c16811.f5803, iM6044, i - iM6044);
            }
        }
        return c16811;
    }
}
