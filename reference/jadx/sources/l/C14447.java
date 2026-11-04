package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܰ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14447 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4007 f45453;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f45457;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f45459;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f45460;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C8481 f45456 = new C8481();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f45455 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean[] f45458 = new boolean[256];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f45454 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f45452 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34869(int i, int i2) {
        int i3 = this.f45455;
        boolean[] zArr = this.f45458;
        zArr[i] = true;
        this.f45456.m22797(i, i2);
        byte b = (byte) i;
        byte[] bArr = this.f45459;
        if (i2 == 1) {
            bArr[i3] = b;
            this.f45455 = i3 + 1;
            return;
        }
        if (i2 == 2) {
            bArr[i3] = b;
            bArr[i3 + 1] = b;
            this.f45455 = i3 + 2;
        } else {
            if (i2 == 3) {
                bArr[i3] = b;
                bArr[i3 + 1] = b;
                bArr[i3 + 2] = b;
                this.f45455 = i3 + 3;
                return;
            }
            int i4 = i2 - 4;
            zArr[i4] = true;
            bArr[i3] = b;
            bArr[i3 + 1] = b;
            bArr[i3 + 2] = b;
            bArr[i3 + 3] = b;
            bArr[i3 + 4] = (byte) i4;
            this.f45455 = i3 + 5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34871(int i) {
        if (this.f45455 > this.f45460) {
            return false;
        }
        int i2 = this.f45454;
        int i3 = this.f45452;
        if (i3 == 0) {
            this.f45454 = i;
            this.f45452 = 1;
        } else if (i2 != i) {
            m34869(i2 & 255, i3);
            this.f45454 = i;
            this.f45452 = 1;
        } else if (i3 == 254) {
            m34869(i2 & 255, 255);
            this.f45452 = 0;
        } else {
            this.f45452 = i3 + 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34870() throws IOException {
        boolean[] zArr;
        int i = this.f45452;
        if (i > 0) {
            m34869(this.f45454 & 255, i);
        }
        int i2 = this.f45455;
        byte[] bArr = this.f45459;
        bArr[i2] = bArr[0];
        int[] iArr = this.f45457;
        int iM1836 = new C0278(bArr, i2, iArr).m1836();
        C4007 c4007 = this.f45453;
        c4007.m12969(24, 3227993);
        c4007.m12969(24, 2511705);
        int iM22795 = this.f45456.m22795();
        c4007.m12969(16, (iM22795 >>> 16) & 65535);
        c4007.m12969(16, iM22795 & 65535);
        c4007.m12970(false);
        c4007.m12969(24, iM1836);
        boolean[] zArr2 = new boolean[16];
        int i3 = 0;
        while (true) {
            zArr = this.f45458;
            if (i3 >= 16) {
                break;
            }
            int i4 = i3 << 4;
            int i5 = 0;
            while (i5 < 16) {
                if (zArr[i4]) {
                    zArr2[i3] = true;
                }
                i5++;
                i4++;
            }
            i3++;
        }
        for (int i6 = 0; i6 < 16; i6++) {
            c4007.m12970(zArr2[i6]);
        }
        for (int i7 = 0; i7 < 16; i7++) {
            if (zArr2[i7]) {
                int i8 = i7 * 16;
                int i9 = 0;
                while (i9 < 16) {
                    c4007.m12970(zArr[i8]);
                    i9++;
                    i8++;
                }
            }
        }
        C9226 c9226 = new C9226(iArr, this.f45455, zArr);
        c9226.m24408();
        new C9972(this.f45453, c9226.m24409(), c9226.m24412(), c9226.m24411(), c9226.m24410()).m25815();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m34872() {
        return this.f45455 == 0 && this.f45452 == 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m34873() {
        return this.f45456.m22795();
    }

    public C14447(C4007 c4007, int i) {
        this.f45453 = c4007;
        int i2 = i + 1;
        this.f45459 = new byte[i2];
        this.f45457 = new int[i2];
        this.f45460 = i - 6;
    }
}
