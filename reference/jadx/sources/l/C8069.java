package l;

import java.security.DigestException;
import java.security.MessageDigest;
import javax.crypto.ShortBufferException;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: l.۠ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: LA2F */
/* JADX INFO: loaded from: classes3.dex */
public final class C8069 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28285 = {75, 71, 83, PublicSuffixDatabase.EXCEPTION_MARKER, 64, 35, 36, 37};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m21280(String str) {
        if (str == null) {
            throw new NullPointerException("Password parameter is required");
        }
        MessageDigest messageDigestM38988 = C16577.m38988();
        messageDigestM38988.update(C10933.m27421(str));
        return messageDigestM38988.digest();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m21284(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ShortBufferException {
        byte[] bArr4 = new byte[8];
        MessageDigest messageDigestM38992 = C16577.m38992();
        messageDigestM38992.update(bArr2);
        messageDigestM38992.update(bArr3, 0, 8);
        System.arraycopy(messageDigestM38992.digest(), 0, bArr4, 0, 8);
        byte[] bArr5 = new byte[21];
        System.arraycopy(bArr, 0, bArr5, 0, 16);
        byte[] bArr6 = new byte[24];
        m21279(bArr5, bArr4, bArr6);
        return bArr6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m21281(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws DigestException {
        byte[] bArr4 = new byte[24];
        MessageDigest messageDigestM38990 = C16577.m38990(bArr);
        messageDigestM38990.update(C10933.m27421(str2.toUpperCase()));
        messageDigestM38990.update(C10933.m27421(str.toUpperCase()));
        MessageDigest messageDigestM38991 = C16577.m38990(messageDigestM38990.digest());
        messageDigestM38991.update(bArr2);
        messageDigestM38991.update(bArr3);
        messageDigestM38991.digest(bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 8);
        return bArr4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m21283(byte[] bArr, byte[] bArr2) throws ShortBufferException {
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, 0, bArr3, 0, 16);
        m21279(bArr3, bArr2, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m21282(InterfaceC19067 interfaceC19067, String str, byte[] bArr) throws ShortBufferException {
        byte[] bArr2 = new byte[14];
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        byte[] bArrM27418 = C10933.m27418(str, interfaceC19067.mo29449());
        int length = bArrM27418.length;
        System.arraycopy(bArrM27418, 0, bArr2, 0, length <= 14 ? length : 14);
        m21279(bArr2, f28285, bArr3);
        m21279(bArr3, bArr, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21279(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ShortBufferException {
        byte[] bArr4 = new byte[7];
        byte[] bArr5 = new byte[8];
        for (int i = 0; i < bArr.length / 7; i++) {
            System.arraycopy(bArr, i * 7, bArr4, 0, 7);
            C16577.m38993(bArr4).update(bArr2, 0, bArr2.length, bArr5);
            System.arraycopy(bArr5, 0, bArr3, i * 8, 8);
        }
    }
}
