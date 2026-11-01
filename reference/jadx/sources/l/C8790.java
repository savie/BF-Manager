package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8790 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f30212;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f30213;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f30214;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f30215;

    public C8790(int i) {
        this.f30213 = new int[Math.max(8, i)];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m22867(int i) {
        int[] iArr = this.f30214;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22865(int i) {
        int[] iArr = this.f30214;
        if (iArr == null) {
            return 0;
        }
        return iArr[i + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8790 m22866(int i, int i2) {
        int i3 = i2 - i;
        C8790 c8790 = new C8790(i3);
        c8790.f30212 = i3;
        System.arraycopy(this.f30213, i, c8790.f30213, 0, i3);
        int iM22867 = m22867(i);
        int iM22865 = i2 == 0 ? iM22867 : m22865(i2 - 1);
        if (iM22865 != iM22867) {
            c8790.f30214 = new int[c8790.f30213.length + 1];
            for (int i4 = 0; i4 <= c8790.f30212; i4++) {
                c8790.f30214[i4] = this.f30214[i + i4] - iM22867;
            }
            c8790.f30215 = Arrays.copyOfRange(this.f30215, iM22867, iM22865);
        }
        return c8790;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8790 m22864(C8790 c8790, C8790 c8791) {
        C8790 c8792 = new C8790(c8790.f30212 + c8791.f30212);
        c8792.f30212 = c8790.f30212 + c8791.f30212;
        System.arraycopy(c8790.f30213, 0, c8792.f30213, 0, c8790.f30212);
        System.arraycopy(c8791.f30213, 0, c8792.f30213, c8790.f30212, c8791.f30212);
        int iM22865 = c8790.m22865(c8790.f30212 - 1);
        long jM22865 = ((long) iM22865) + ((long) c8791.m22865(c8791.f30212 - 1));
        int i = (int) jM22865;
        if (jM22865 != i) {
            throw new ArithmeticException();
        }
        if (i != 0) {
            c8792.f30214 = new int[c8792.f30213.length + 1];
            c8792.f30215 = new char[i];
            for (int i2 = 0; i2 < c8790.f30212; i2++) {
                c8792.f30214[i2] = c8790.m22867(i2);
            }
            for (int i3 = 0; i3 < c8791.f30212; i3++) {
                c8792.f30214[c8790.f30212 + i3] = c8791.m22867(i3) + iM22865;
            }
            c8792.f30214[c8792.f30212] = i;
            if (iM22865 != 0) {
                System.arraycopy(c8790.f30215, 0, c8792.f30215, 0, iM22865);
            }
            if (i != iM22865) {
                System.arraycopy(c8791.f30215, 0, c8792.f30215, iM22865, i - iM22865);
            }
        }
        return c8792;
    }
}
