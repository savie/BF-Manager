package l;

import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ܳ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8CI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15631 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final short[] f50766;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f50767 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f50768;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13394 f50769;

    public C15631(C13394 c13394) {
        this.f50769 = c13394;
        int[] iArr = new int[32768];
        this.f50768 = iArr;
        Arrays.fill(iArr, -1);
        this.f50766 = new short[65536];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37383(int i, byte[] bArr) {
        while (true) {
            int i2 = this.f50767;
            if (i2 >= i) {
                return;
            }
            int iM53093 = (C23800.m53093(i2, bArr) * (-1640531535)) >>> 17;
            int[] iArr = this.f50768;
            int i3 = i2 - iArr[iM53093];
            if (i3 >= 65536) {
                i3 = 65535;
            }
            this.f50766[i2 & 65535] = (short) i3;
            iArr[iM53093] = i2;
            this.f50767++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37385(byte[] bArr, int i, int i2, C17123 c17123) {
        int i3;
        int iM56601;
        int iM56602;
        c17123.f55866 = i;
        c17123.f55865 = 0;
        m37383(i, bArr);
        int iM53093 = (C23800.m53093(i, bArr) * (-1640531535)) >>> 17;
        int[] iArr = this.f50768;
        int i4 = iArr[iM53093];
        int i5 = i - 4;
        short[] sArr = this.f50766;
        if (i4 < i5 || i4 > i || i4 < 0) {
            i3 = 0;
            iM56601 = 0;
        } else {
            if (C25329.m56605(i4, i, bArr)) {
                i3 = i - i4;
                iM56601 = C25329.m56601(i4 + 4, bArr, i + 4, i2) + 4;
                c17123.f55865 = iM56601;
                c17123.f55867 = i4;
            } else {
                i3 = 0;
                iM56601 = 0;
            }
            i4 -= sArr[i4 & 65535] & HPKE.aead_EXPORT_ONLY;
        }
        for (int i6 = 0; i6 < this.f50769.f42685 && i4 >= Math.max(0, i - 65535) && i4 <= i; i6++) {
            if (C25329.m56605(i4, i, bArr) && (iM56602 = C25329.m56601(i4 + 4, bArr, i + 4, i2) + 4) > c17123.f55865) {
                c17123.f55867 = i4;
                c17123.f55865 = iM56602;
            }
            i4 -= sArr[i4 & 65535] & HPKE.aead_EXPORT_ONLY;
        }
        if (iM56601 != 0) {
            int i7 = (iM56601 + i) - 3;
            while (i < i7 - i3) {
                sArr[i & 65535] = (short) i3;
                i++;
            }
            do {
                sArr[i & 65535] = (short) i3;
                iArr[(C23800.m53093(i, bArr) * (-1640531535)) >>> 17] = i;
                i++;
            } while (i < i7);
            this.f50767 = i7;
        }
        return c17123.f55865 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37384(byte[] bArr, int i, int i2, int i3, int i4, C17123 c17123) {
        c17123.f55865 = i4;
        m37383(i, bArr);
        int i5 = this.f50768[(C23800.m53093(i, bArr) * (-1640531535)) >>> 17];
        for (int i6 = 0; i6 < this.f50769.f42685 && i5 >= Math.max(0, i - 65535) && i5 <= i; i6++) {
            if (C25329.m56605(i5, i, bArr)) {
                int iM56601 = C25329.m56601(i5 + 4, bArr, i + 4, i3) + 4;
                int iM56607 = C25329.m56607(i5, bArr, i, i2);
                int i7 = iM56601 + iM56607;
                if (i7 > c17123.f55865) {
                    c17123.f55865 = i7;
                    c17123.f55867 = i5 - iM56607;
                    c17123.f55866 = i - iM56607;
                }
            }
            i5 -= 65535 & this.f50766[i5 & 65535];
        }
        return c17123.f55865 > i4;
    }
}
