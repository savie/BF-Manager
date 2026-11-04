package l;

import java.security.DigestException;
import java.security.MessageDigest;
import javax.crypto.ShortBufferException;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: l.ܳܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA2F */
/* JADX INFO: loaded from: classes4.dex */
public final class C15506 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f50471 = {75, 71, 83, PublicSuffixDatabase.EXCEPTION_MARKER, 64, 35, 36, 37};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m37142(String str) {
        if (str == null) {
            throw new NullPointerException("Password parameter is required");
        }
        MessageDigest messageDigestM9903 = C3049.m9903();
        messageDigestM9903.update(C23933.m53455(str));
        return messageDigestM9903.digest();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m37146(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ShortBufferException {
        byte[] bArr4 = new byte[8];
        MessageDigest messageDigestM9907 = C3049.m9907();
        messageDigestM9907.update(bArr2);
        messageDigestM9907.update(bArr3, 0, 8);
        System.arraycopy(messageDigestM9907.digest(), 0, bArr4, 0, 8);
        byte[] bArr5 = new byte[21];
        System.arraycopy(bArr, 0, bArr5, 0, 16);
        byte[] bArr6 = new byte[24];
        m37141(bArr5, bArr4, bArr6);
        return bArr6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m37143(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws DigestException {
        byte[] bArr4 = new byte[24];
        MessageDigest messageDigestM9905 = C3049.m9905(bArr);
        messageDigestM9905.update(C23933.m53455(str2.toUpperCase()));
        messageDigestM9905.update(C23933.m53455(str.toUpperCase()));
        MessageDigest messageDigestM9906 = C3049.m9905(messageDigestM9905.digest());
        messageDigestM9906.update(bArr2);
        messageDigestM9906.update(bArr3);
        messageDigestM9906.digest(bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 8);
        return bArr4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m37145(byte[] bArr, byte[] bArr2) throws ShortBufferException {
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, 0, bArr3, 0, 16);
        m37141(bArr3, bArr2, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m37144(InterfaceC23032 interfaceC23032, String str, byte[] bArr) throws ShortBufferException {
        byte[] bArr2 = new byte[14];
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        byte[] bArrM53452 = C23933.m53452(str, interfaceC23032.mo2875());
        int length = bArrM53452.length;
        System.arraycopy(bArrM53452, 0, bArr2, 0, length <= 14 ? length : 14);
        m37141(bArr2, f50471, bArr3);
        m37141(bArr3, bArr, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37141(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ShortBufferException {
        byte[] bArr4 = new byte[7];
        byte[] bArr5 = new byte[8];
        for (int i = 0; i < bArr.length / 7; i++) {
            System.arraycopy(bArr, i * 7, bArr4, 0, 7);
            C3049.m9908(bArr4).update(bArr2, 0, bArr2.length, bArr5);
            System.arraycopy(bArr5, 0, bArr3, i * 8, 8);
        }
    }
}
