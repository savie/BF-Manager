package l;

import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.᩶ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N8CI */
/* JADX INFO: loaded from: classes4.dex */
public final class C20228 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0471 f65643;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final short[] f65644;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f65645 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f65646;

    public C20228(C0471 c0471) {
        this.f65643 = c0471;
        int[] iArr = new int[32768];
        this.f65646 = iArr;
        Arrays.fill(iArr, -1);
        this.f65644 = new short[65536];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45728(int i, byte[] bArr) {
        while (true) {
            int i2 = this.f65645;
            if (i2 >= i) {
                return;
            }
            int iM52458 = (C23805.m52458(i2, bArr) * (-1640531535)) >>> 17;
            int[] iArr = this.f65646;
            int i3 = i2 - iArr[iM52458];
            if (i3 >= 65536) {
                i3 = 65535;
            }
            this.f65644[i2 & 65535] = (short) i3;
            iArr[iM52458] = i2;
            this.f65645++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45730(byte[] bArr, int i, int i2, C6116 c6116) {
        int i3;
        int iM40567;
        int iM40568;
        c6116.f20882 = i;
        c6116.f20881 = 0;
        m45728(i, bArr);
        int iM52458 = (C23805.m52458(i, bArr) * (-1640531535)) >>> 17;
        int[] iArr = this.f65646;
        int i4 = iArr[iM52458];
        int i5 = i - 4;
        short[] sArr = this.f65644;
        if (i4 < i5 || i4 > i || i4 < 0) {
            i3 = 0;
            iM40567 = 0;
        } else {
            if (C17405.m40571(i4, i, bArr)) {
                i3 = i - i4;
                iM40567 = C17405.m40567(i4 + 4, bArr, i + 4, i2) + 4;
                c6116.f20881 = iM40567;
                c6116.f20883 = i4;
            } else {
                i3 = 0;
                iM40567 = 0;
            }
            i4 -= sArr[i4 & 65535] & HPKE.aead_EXPORT_ONLY;
        }
        for (int i6 = 0; i6 < this.f65643.f2141 && i4 >= Math.max(0, i - 65535) && i4 <= i; i6++) {
            if (C17405.m40571(i4, i, bArr) && (iM40568 = C17405.m40567(i4 + 4, bArr, i + 4, i2) + 4) > c6116.f20881) {
                c6116.f20883 = i4;
                c6116.f20881 = iM40568;
            }
            i4 -= sArr[i4 & 65535] & HPKE.aead_EXPORT_ONLY;
        }
        if (iM40567 != 0) {
            int i7 = (iM40567 + i) - 3;
            while (i < i7 - i3) {
                sArr[i & 65535] = (short) i3;
                i++;
            }
            do {
                sArr[i & 65535] = (short) i3;
                iArr[(C23805.m52458(i, bArr) * (-1640531535)) >>> 17] = i;
                i++;
            } while (i < i7);
            this.f65645 = i7;
        }
        return c6116.f20881 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45729(byte[] bArr, int i, int i2, int i3, int i4, C6116 c6116) {
        c6116.f20881 = i4;
        m45728(i, bArr);
        int i5 = this.f65646[(C23805.m52458(i, bArr) * (-1640531535)) >>> 17];
        for (int i6 = 0; i6 < this.f65643.f2141 && i5 >= Math.max(0, i - 65535) && i5 <= i; i6++) {
            if (C17405.m40571(i5, i, bArr)) {
                int iM40567 = C17405.m40567(i5 + 4, bArr, i + 4, i3) + 4;
                int iM40573 = C17405.m40573(i5, bArr, i, i2);
                int i7 = iM40567 + iM40573;
                if (i7 > c6116.f20881) {
                    c6116.f20881 = i7;
                    c6116.f20883 = i5 - iM40573;
                    c6116.f20882 = i - iM40573;
                }
            }
            i5 -= 65535 & this.f65644[i5 & 65535];
        }
        return c6116.f20881 > i4;
    }
}
