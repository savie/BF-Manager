package l;

/* JADX INFO: renamed from: l.ۜۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7JL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7103 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19444(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m19447(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19446(byte[] bArr) {
        if (bArr.length < 18) {
            return false;
        }
        int i = bArr[1] & 255;
        int i2 = bArr[2] & 255;
        int i3 = ((bArr[6] & 255) << 8) | (bArr[5] & 255);
        int i4 = bArr[7] & 255;
        int i5 = ((bArr[13] & 255) << 8) | (bArr[12] & 255);
        int i6 = ((bArr[15] & 255) << 8) | (bArr[14] & 255);
        int i7 = bArr[16] & 255;
        if (i != 0 && i != 1) {
            return false;
        }
        if ((i2 != 1 && i2 != 2 && i2 != 3 && i2 != 9 && i2 != 10 && i2 != 11) || i5 == 0 || i6 == 0) {
            return false;
        }
        if (i2 == 1 || i2 == 9) {
            if (i != 1) {
                return false;
            }
        } else if (i != 0) {
            return false;
        }
        if (i == 1) {
            if (i3 <= 0) {
                return false;
            }
            if (i4 != 15 && i4 != 16 && i4 != 24 && i4 != 32) {
                return false;
            }
        }
        if (i2 == 1 || i2 == 9) {
            if (i7 != 8 && i7 != 16) {
                return false;
            }
        } else if (i2 == 2 || i2 == 10) {
            if (i7 != 15 && i7 != 16 && i7 != 24 && i7 != 32) {
                return false;
            }
        } else {
            if (i2 != 3 && i2 != 11) {
                return false;
            }
            if (i7 != 8 && i7 != 16) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19445(int i, Object obj) {
        return m19447(i, obj != null ? obj.hashCode() : 0);
    }
}
