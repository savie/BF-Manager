package l;

import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩺۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P53K */
/* JADX INFO: loaded from: classes.dex */
public final class C22982 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f74689 = {GCMSIVBlockCipher.MASK, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f74691;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f74693;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f74694;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f74695;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f74696;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f74692 = new byte[64];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[] f74690 = new int[16];

    public C22982() {
        m50840();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50832(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM21118 = C8015.m21118((i3 & i2) | (i4 & (~i2)), i5, i7, i);
        return ((iM21118 >>> (32 - i6)) | (iM21118 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m50836(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM21118 = C8015.m21118((i3 & (~i4)) | (i2 & i4), i5, i7, i);
        return ((iM21118 >>> (32 - i6)) | (iM21118 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m50835(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM21118 = C8015.m21118((i3 ^ i2) ^ i4, i5, i7, i);
        return ((iM21118 >>> (32 - i6)) | (iM21118 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m50831(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM21118 = C8015.m21118(i3 ^ ((~i4) | i2), i5, i7, i);
        return ((iM21118 >>> (32 - i6)) | (iM21118 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50833(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50834(int i, byte[] bArr) {
        int i2 = this.f74694;
        int i3 = this.f74691;
        int i4 = this.f74693;
        int i5 = this.f74696;
        int i6 = i;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f74690;
            if (i7 < 16) {
                iArr[i7] = (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24);
                i7++;
                i6 += 4;
            } else {
                int iM50832 = m50832(i2, i3, i4, i5, iArr[0], 7, -680876936);
                int iM50833 = m50832(i5, iM50832, i3, i4, iArr[1], 12, -389564586);
                int iM50834 = m50832(i4, iM50833, iM50832, i3, iArr[2], 17, 606105819);
                int iM50835 = m50832(i3, iM50834, iM50833, iM50832, iArr[3], 22, -1044525330);
                int iM50836 = m50832(iM50832, iM50835, iM50834, iM50833, iArr[4], 7, -176418897);
                int iM50837 = m50832(iM50833, iM50836, iM50835, iM50834, iArr[5], 12, 1200080426);
                int iM50838 = m50832(iM50834, iM50837, iM50836, iM50835, iArr[6], 17, -1473231341);
                int iM50839 = m50832(iM50835, iM50838, iM50837, iM50836, iArr[7], 22, -45705983);
                int iM508310 = m50832(iM50836, iM50839, iM50838, iM50837, iArr[8], 7, 1770035416);
                int iM508311 = m50832(iM50837, iM508310, iM50839, iM50838, iArr[9], 12, -1958414417);
                int iM508312 = m50832(iM50838, iM508311, iM508310, iM50839, iArr[10], 17, -42063);
                int iM508313 = m50832(iM50839, iM508312, iM508311, iM508310, iArr[11], 22, -1990404162);
                int iM508314 = m50832(iM508310, iM508313, iM508312, iM508311, iArr[12], 7, 1804603682);
                int iM508315 = m50832(iM508311, iM508314, iM508313, iM508312, iArr[13], 12, -40341101);
                int iM508316 = m50832(iM508312, iM508315, iM508314, iM508313, iArr[14], 17, -1502002290);
                int iM508317 = m50832(iM508313, iM508316, iM508315, iM508314, iArr[15], 22, 1236535329);
                int iM508318 = m50836(iM508314, iM508317, iM508316, iM508315, iArr[1], 5, -165796510);
                int iM508319 = m50836(iM508315, iM508318, iM508317, iM508316, iArr[6], 9, -1069501632);
                int iM508320 = m50836(iM508316, iM508319, iM508318, iM508317, iArr[11], 14, 643717713);
                int iM508321 = m50836(iM508317, iM508320, iM508319, iM508318, iArr[0], 20, -373897302);
                int iM508322 = m50836(iM508318, iM508321, iM508320, iM508319, iArr[5], 5, -701558691);
                int iM508323 = m50836(iM508319, iM508322, iM508321, iM508320, iArr[10], 9, 38016083);
                int iM508324 = m50836(iM508320, iM508323, iM508322, iM508321, iArr[15], 14, -660478335);
                int iM508325 = m50836(iM508321, iM508324, iM508323, iM508322, iArr[4], 20, -405537848);
                int iM508326 = m50836(iM508322, iM508325, iM508324, iM508323, iArr[9], 5, 568446438);
                int iM508327 = m50836(iM508323, iM508326, iM508325, iM508324, iArr[14], 9, -1019803690);
                int iM508328 = m50836(iM508324, iM508327, iM508326, iM508325, iArr[3], 14, -187363961);
                int iM508329 = m50836(iM508325, iM508328, iM508327, iM508326, iArr[8], 20, 1163531501);
                int iM508330 = m50836(iM508326, iM508329, iM508328, iM508327, iArr[13], 5, -1444681467);
                int iM508331 = m50836(iM508327, iM508330, iM508329, iM508328, iArr[2], 9, -51403784);
                int iM508332 = m50836(iM508328, iM508331, iM508330, iM508329, iArr[7], 14, 1735328473);
                int iM508333 = m50836(iM508329, iM508332, iM508331, iM508330, iArr[12], 20, -1926607734);
                int iM508334 = m50835(iM508330, iM508333, iM508332, iM508331, iArr[5], 4, -378558);
                int iM508335 = m50835(iM508331, iM508334, iM508333, iM508332, iArr[8], 11, -2022574463);
                int iM508336 = m50835(iM508332, iM508335, iM508334, iM508333, iArr[11], 16, 1839030562);
                int iM508337 = m50835(iM508333, iM508336, iM508335, iM508334, iArr[14], 23, -35309556);
                int iM508338 = m50835(iM508334, iM508337, iM508336, iM508335, iArr[1], 4, -1530992060);
                int iM508339 = m50835(iM508335, iM508338, iM508337, iM508336, iArr[4], 11, 1272893353);
                int iM508340 = m50835(iM508336, iM508339, iM508338, iM508337, iArr[7], 16, -155497632);
                int iM508341 = m50835(iM508337, iM508340, iM508339, iM508338, iArr[10], 23, -1094730640);
                int iM508342 = m50835(iM508338, iM508341, iM508340, iM508339, iArr[13], 4, 681279174);
                int iM508343 = m50835(iM508339, iM508342, iM508341, iM508340, iArr[0], 11, -358537222);
                int iM508344 = m50835(iM508340, iM508343, iM508342, iM508341, iArr[3], 16, -722521979);
                int iM508345 = m50835(iM508341, iM508344, iM508343, iM508342, iArr[6], 23, 76029189);
                int iM508346 = m50835(iM508342, iM508345, iM508344, iM508343, iArr[9], 4, -640364487);
                int iM508347 = m50835(iM508343, iM508346, iM508345, iM508344, iArr[12], 11, -421815835);
                int iM508348 = m50835(iM508344, iM508347, iM508346, iM508345, iArr[15], 16, 530742520);
                int iM508349 = m50835(iM508345, iM508348, iM508347, iM508346, iArr[2], 23, -995338651);
                int iM50831 = m50831(iM508346, iM508349, iM508348, iM508347, iArr[0], 6, -198630844);
                int iM508350 = m50831(iM508347, iM50831, iM508349, iM508348, iArr[7], 10, 1126891415);
                int iM508351 = m50831(iM508348, iM508350, iM50831, iM508349, iArr[14], 15, -1416354905);
                int iM508352 = m50831(iM508349, iM508351, iM508350, iM50831, iArr[5], 21, -57434055);
                int iM508353 = m50831(iM50831, iM508352, iM508351, iM508350, iArr[12], 6, 1700485571);
                int iM508354 = m50831(iM508350, iM508353, iM508352, iM508351, iArr[3], 10, -1894986606);
                int iM508355 = m50831(iM508351, iM508354, iM508353, iM508352, iArr[10], 15, -1051523);
                int iM508356 = m50831(iM508352, iM508355, iM508354, iM508353, iArr[1], 21, -2054922799);
                int iM508357 = m50831(iM508353, iM508356, iM508355, iM508354, iArr[8], 6, 1873313359);
                int iM508358 = m50831(iM508354, iM508357, iM508356, iM508355, iArr[15], 10, -30611744);
                int iM508359 = m50831(iM508355, iM508358, iM508357, iM508356, iArr[6], 15, -1560198380);
                int iM508360 = m50831(iM508356, iM508359, iM508358, iM508357, iArr[13], 21, 1309151649);
                int iM508361 = m50831(iM508357, iM508360, iM508359, iM508358, iArr[4], 6, -145523070);
                int iM508362 = m50831(iM508358, iM508361, iM508360, iM508359, iArr[11], 10, -1120210379);
                int iM508363 = m50831(iM508359, iM508362, iM508361, iM508360, iArr[2], 15, 718787259);
                int iM508364 = m50831(iM508360, iM508363, iM508362, iM508361, iArr[9], 21, -343485551);
                this.f74694 += iM508361;
                this.f74691 += iM508364;
                this.f74693 += iM508363;
                this.f74696 += iM508362;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50840() {
        this.f74695 = 0L;
        this.f74694 = 1732584193;
        this.f74691 = -271733879;
        this.f74693 = -1732584194;
        this.f74696 = 271733878;
        for (int i = 0; i < 16; i++) {
            this.f74690[i] = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50837(byte[] bArr, int i, int i2) {
        long j = this.f74695;
        int i3 = 64 - ((int) (63 & j));
        this.f74695 = j + ((long) i2);
        while (i2 > 0) {
            byte[] bArr2 = this.f74692;
            if (i2 < i3) {
                System.arraycopy(bArr, i, bArr2, 64 - i3, i2);
                return;
            }
            if (i3 == 64) {
                m50834(i, bArr);
            } else {
                System.arraycopy(bArr, i, bArr2, 64 - i3, i3);
                m50834(0, bArr2);
            }
            i += i3;
            i2 -= i3;
            i3 = 64;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50841(byte[] bArr) {
        m50837(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m50838() {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[8];
        m50833(0, (int) (this.f74695 << 3), bArr2);
        m50833(4, (int) (this.f74695 >> 29), bArr2);
        int i = ((int) this.f74695) & 63;
        m50837(f74689, 0, i < 56 ? 56 - i : 120 - i);
        m50837(bArr2, 0, 8);
        m50833(0, this.f74694, bArr);
        m50833(4, this.f74691, bArr);
        m50833(8, this.f74693, bArr);
        m50833(12, this.f74696, bArr);
        m50840();
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m50839(byte[] bArr) {
        m50841(bArr);
        byte[] bArrM50838 = m50838();
        byte b = bArrM50838[0];
        if (b == 0) {
            bArrM50838[0] = 1;
            return bArrM50838;
        }
        if (b < 0) {
            byte b2 = (byte) (-b);
            bArrM50838[0] = b2 > 0 ? b2 : (byte) 1;
        }
        return bArrM50838;
    }
}
