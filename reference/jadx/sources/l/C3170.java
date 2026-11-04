package l;

import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۗۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53K */
/* JADX INFO: loaded from: classes2.dex */
public final class C3170 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f10280 = {GCMSIVBlockCipher.MASK, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f10282;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f10284;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f10285;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f10286;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f10287;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f10281 = new byte[64];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f10283 = new int[16];

    public C3170() {
        m10362();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m10353(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM54897 = C24579.m54897((i3 & i2) | (i4 & (~i2)), i5, i7, i);
        return ((iM54897 >>> (32 - i6)) | (iM54897 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m10357(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM54897 = C24579.m54897((i3 & (~i4)) | (i2 & i4), i5, i7, i);
        return ((iM54897 >>> (32 - i6)) | (iM54897 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m10356(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM54897 = C24579.m54897((i3 ^ i2) ^ i4, i5, i7, i);
        return ((iM54897 >>> (32 - i6)) | (iM54897 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m10358(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int iM54897 = C24579.m54897(i3 ^ ((~i4) | i2), i5, i7, i);
        return ((iM54897 >>> (32 - i6)) | (iM54897 << i6)) + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10354(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10355(int i, byte[] bArr) {
        int i2 = this.f10282;
        int i3 = this.f10287;
        int i4 = this.f10285;
        int i5 = this.f10284;
        int i6 = i;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f10283;
            if (i7 < 16) {
                iArr[i7] = (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24);
                i7++;
                i6 += 4;
            } else {
                int iM10353 = m10353(i2, i3, i4, i5, iArr[0], 7, -680876936);
                int iM10354 = m10353(i5, iM10353, i3, i4, iArr[1], 12, -389564586);
                int iM10355 = m10353(i4, iM10354, iM10353, i3, iArr[2], 17, 606105819);
                int iM10356 = m10353(i3, iM10355, iM10354, iM10353, iArr[3], 22, -1044525330);
                int iM10357 = m10353(iM10353, iM10356, iM10355, iM10354, iArr[4], 7, -176418897);
                int iM10358 = m10353(iM10354, iM10357, iM10356, iM10355, iArr[5], 12, 1200080426);
                int iM10359 = m10353(iM10355, iM10358, iM10357, iM10356, iArr[6], 17, -1473231341);
                int iM103510 = m10353(iM10356, iM10359, iM10358, iM10357, iArr[7], 22, -45705983);
                int iM103511 = m10353(iM10357, iM103510, iM10359, iM10358, iArr[8], 7, 1770035416);
                int iM103512 = m10353(iM10358, iM103511, iM103510, iM10359, iArr[9], 12, -1958414417);
                int iM103513 = m10353(iM10359, iM103512, iM103511, iM103510, iArr[10], 17, -42063);
                int iM103514 = m10353(iM103510, iM103513, iM103512, iM103511, iArr[11], 22, -1990404162);
                int iM103515 = m10353(iM103511, iM103514, iM103513, iM103512, iArr[12], 7, 1804603682);
                int iM103516 = m10353(iM103512, iM103515, iM103514, iM103513, iArr[13], 12, -40341101);
                int iM103517 = m10353(iM103513, iM103516, iM103515, iM103514, iArr[14], 17, -1502002290);
                int iM103518 = m10353(iM103514, iM103517, iM103516, iM103515, iArr[15], 22, 1236535329);
                int iM103519 = m10357(iM103515, iM103518, iM103517, iM103516, iArr[1], 5, -165796510);
                int iM103520 = m10357(iM103516, iM103519, iM103518, iM103517, iArr[6], 9, -1069501632);
                int iM103521 = m10357(iM103517, iM103520, iM103519, iM103518, iArr[11], 14, 643717713);
                int iM103522 = m10357(iM103518, iM103521, iM103520, iM103519, iArr[0], 20, -373897302);
                int iM103523 = m10357(iM103519, iM103522, iM103521, iM103520, iArr[5], 5, -701558691);
                int iM103524 = m10357(iM103520, iM103523, iM103522, iM103521, iArr[10], 9, 38016083);
                int iM103525 = m10357(iM103521, iM103524, iM103523, iM103522, iArr[15], 14, -660478335);
                int iM103526 = m10357(iM103522, iM103525, iM103524, iM103523, iArr[4], 20, -405537848);
                int iM103527 = m10357(iM103523, iM103526, iM103525, iM103524, iArr[9], 5, 568446438);
                int iM103528 = m10357(iM103524, iM103527, iM103526, iM103525, iArr[14], 9, -1019803690);
                int iM103529 = m10357(iM103525, iM103528, iM103527, iM103526, iArr[3], 14, -187363961);
                int iM103530 = m10357(iM103526, iM103529, iM103528, iM103527, iArr[8], 20, 1163531501);
                int iM103531 = m10357(iM103527, iM103530, iM103529, iM103528, iArr[13], 5, -1444681467);
                int iM103532 = m10357(iM103528, iM103531, iM103530, iM103529, iArr[2], 9, -51403784);
                int iM103533 = m10357(iM103529, iM103532, iM103531, iM103530, iArr[7], 14, 1735328473);
                int iM103534 = m10357(iM103530, iM103533, iM103532, iM103531, iArr[12], 20, -1926607734);
                int iM103535 = m10356(iM103531, iM103534, iM103533, iM103532, iArr[5], 4, -378558);
                int iM103536 = m10356(iM103532, iM103535, iM103534, iM103533, iArr[8], 11, -2022574463);
                int iM103537 = m10356(iM103533, iM103536, iM103535, iM103534, iArr[11], 16, 1839030562);
                int iM103538 = m10356(iM103534, iM103537, iM103536, iM103535, iArr[14], 23, -35309556);
                int iM103539 = m10356(iM103535, iM103538, iM103537, iM103536, iArr[1], 4, -1530992060);
                int iM103540 = m10356(iM103536, iM103539, iM103538, iM103537, iArr[4], 11, 1272893353);
                int iM103541 = m10356(iM103537, iM103540, iM103539, iM103538, iArr[7], 16, -155497632);
                int iM103542 = m10356(iM103538, iM103541, iM103540, iM103539, iArr[10], 23, -1094730640);
                int iM103543 = m10356(iM103539, iM103542, iM103541, iM103540, iArr[13], 4, 681279174);
                int iM103544 = m10356(iM103540, iM103543, iM103542, iM103541, iArr[0], 11, -358537222);
                int iM103545 = m10356(iM103541, iM103544, iM103543, iM103542, iArr[3], 16, -722521979);
                int iM103546 = m10356(iM103542, iM103545, iM103544, iM103543, iArr[6], 23, 76029189);
                int iM103547 = m10356(iM103543, iM103546, iM103545, iM103544, iArr[9], 4, -640364487);
                int iM103548 = m10356(iM103544, iM103547, iM103546, iM103545, iArr[12], 11, -421815835);
                int iM103549 = m10356(iM103545, iM103548, iM103547, iM103546, iArr[15], 16, 530742520);
                int iM103550 = m10356(iM103546, iM103549, iM103548, iM103547, iArr[2], 23, -995338651);
                int iM103551 = m10358(iM103547, iM103550, iM103549, iM103548, iArr[0], 6, -198630844);
                int iM103552 = m10358(iM103548, iM103551, iM103550, iM103549, iArr[7], 10, 1126891415);
                int iM103553 = m10358(iM103549, iM103552, iM103551, iM103550, iArr[14], 15, -1416354905);
                int iM103554 = m10358(iM103550, iM103553, iM103552, iM103551, iArr[5], 21, -57434055);
                int iM103555 = m10358(iM103551, iM103554, iM103553, iM103552, iArr[12], 6, 1700485571);
                int iM103556 = m10358(iM103552, iM103555, iM103554, iM103553, iArr[3], 10, -1894986606);
                int iM103557 = m10358(iM103553, iM103556, iM103555, iM103554, iArr[10], 15, -1051523);
                int iM103558 = m10358(iM103554, iM103557, iM103556, iM103555, iArr[1], 21, -2054922799);
                int iM103559 = m10358(iM103555, iM103558, iM103557, iM103556, iArr[8], 6, 1873313359);
                int iM103560 = m10358(iM103556, iM103559, iM103558, iM103557, iArr[15], 10, -30611744);
                int iM103561 = m10358(iM103557, iM103560, iM103559, iM103558, iArr[6], 15, -1560198380);
                int iM103562 = m10358(iM103558, iM103561, iM103560, iM103559, iArr[13], 21, 1309151649);
                int iM103563 = m10358(iM103559, iM103562, iM103561, iM103560, iArr[4], 6, -145523070);
                int iM103564 = m10358(iM103560, iM103563, iM103562, iM103561, iArr[11], 10, -1120210379);
                int iM103565 = m10358(iM103561, iM103564, iM103563, iM103562, iArr[2], 15, 718787259);
                int iM103566 = m10358(iM103562, iM103565, iM103564, iM103563, iArr[9], 21, -343485551);
                this.f10282 += iM103563;
                this.f10287 += iM103566;
                this.f10285 += iM103565;
                this.f10284 += iM103564;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10362() {
        this.f10286 = 0L;
        this.f10282 = 1732584193;
        this.f10287 = -271733879;
        this.f10285 = -1732584194;
        this.f10284 = 271733878;
        for (int i = 0; i < 16; i++) {
            this.f10283[i] = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10359(byte[] bArr, int i, int i2) {
        long j = this.f10286;
        int i3 = 64 - ((int) (63 & j));
        this.f10286 = j + ((long) i2);
        while (i2 > 0) {
            byte[] bArr2 = this.f10281;
            if (i2 < i3) {
                System.arraycopy(bArr, i, bArr2, 64 - i3, i2);
                return;
            }
            if (i3 == 64) {
                m10355(i, bArr);
            } else {
                System.arraycopy(bArr, i, bArr2, 64 - i3, i3);
                m10355(0, bArr2);
            }
            i += i3;
            i2 -= i3;
            i3 = 64;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10363(byte[] bArr) {
        m10359(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m10360() {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[8];
        m10354(0, (int) (this.f10286 << 3), bArr2);
        m10354(4, (int) (this.f10286 >> 29), bArr2);
        int i = ((int) this.f10286) & 63;
        m10359(f10280, 0, i < 56 ? 56 - i : 120 - i);
        m10359(bArr2, 0, 8);
        m10354(0, this.f10282, bArr);
        m10354(4, this.f10287, bArr);
        m10354(8, this.f10285, bArr);
        m10354(12, this.f10284, bArr);
        m10362();
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m10361(byte[] bArr) {
        m10363(bArr);
        byte[] bArrM10360 = m10360();
        byte b = bArrM10360[0];
        if (b == 0) {
            bArrM10360[0] = 1;
            return bArrM10360;
        }
        if (b < 0) {
            byte b2 = (byte) (-b);
            bArrM10360[0] = b2 > 0 ? b2 : (byte) 1;
        }
        return bArrM10360;
    }
}
