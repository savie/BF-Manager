package l;

import java.nio.ByteBuffer;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: renamed from: l.ۛۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3NK */
/* JADX INFO: loaded from: classes2.dex */
public final class C6003 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC0358 f20400;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16286(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m16295(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m16296(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16293(byte[] bArr) {
        return f20400.mo2071(0, bArr, 0, bArr.length) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16290(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return m16295(b, bArr[i]);
        }
        if (i3 == 2) {
            return m16296(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16291(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new C12354(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + Blake2xsDigest.MAX_NUMBER_BLOCKS));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16289(int i, int i2, String str, byte[] bArr) {
        return f20400.mo2070(i, i2, str, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m16292(ByteBuffer byteBuffer, int i, int i2) {
        AbstractC0358 abstractC0358 = f20400;
        abstractC0358.getClass();
        if (byteBuffer.hasArray()) {
            return abstractC0358.mo2072(byteBuffer.arrayOffset() + i, i2, byteBuffer.array());
        }
        if (byteBuffer.isDirect()) {
            return abstractC0358.mo2073(byteBuffer, i, i2);
        }
        return AbstractC0358.m2069(byteBuffer, i, i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m16297(int i, int i2, byte[] bArr) {
        return f20400.mo2072(i, i2, bArr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m16294(int i, int i2, byte[] bArr) {
        return f20400.mo2071(0, bArr, i, i2) == 0;
    }

    static {
        f20400 = (C15882.m37762() && C15882.m37783() && !C19491.m44546()) ? new C17292() : new C16587();
    }
}
