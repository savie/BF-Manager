package l;

import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۡ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9085 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30958;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30957 = {78, 84, 76, 77, 83, 83, UTF8.S_P4A, 0};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30956 = {6, 1, 0, 0, 0, 0, 0, 15};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23421() {
        return this.f30958;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m23422(int i) {
        return (i & this.f30958) != 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23423() {
        this.f30958 = 8388608 | this.f30958;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23424(int i) {
        this.f30958 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m23420(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m23419(int i, byte[] bArr) {
        int i2 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, m23420(i + 4, bArr), bArr2, 0, i2);
        return bArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23418(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23417(int i, byte[] bArr, byte[] bArr2) {
        int length = bArr2 != null ? bArr2.length : 0;
        if (length != 0) {
            byte b = (byte) (length & 255);
            bArr[i] = b;
            byte b2 = (byte) ((length >> 8) & 255);
            bArr[i + 1] = b2;
            bArr[i + 2] = b;
            bArr[i + 3] = b2;
        }
        return i + 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23416(int i, int i2, byte[] bArr, byte[] bArr2) {
        m23418(i2, i, bArr);
        if (bArr2 == null || bArr2.length <= 0) {
            return 0;
        }
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        return bArr2.length;
    }
}
