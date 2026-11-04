package l;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۗ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M9TU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3049 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static BouncyCastleProvider f9881;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m9903() {
        try {
            return MessageDigest.getInstance("MD4", m9906());
        } catch (NoSuchAlgorithmException e) {
            throw new C15572(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static MessageDigest m9907() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new C15572(e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static MessageDigest m9905(byte[] bArr) {
        return new C11998(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Cipher m9904(byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(bArr, "RC4"));
            return cipher;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new C15572(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Cipher m9908(byte[] bArr) {
        if (bArr.length != 7) {
            try {
                Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
                cipher.init(1, new SecretKeySpec(bArr, "DES"));
                return cipher;
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new C15572(e);
            }
        }
        byte[] bArr2 = new byte[8];
        bArr2[0] = (byte) (bArr[0] & UTF8.S_ERR);
        bArr2[1] = (byte) ((bArr[0] << 7) | ((bArr[1] & 255) >>> 1));
        bArr2[2] = (byte) ((bArr[1] << 6) | ((bArr[2] & 255) >>> 2));
        bArr2[3] = (byte) ((bArr[2] << 5) | ((bArr[3] & 255) >>> 3));
        bArr2[4] = (byte) ((bArr[3] << 4) | ((bArr[4] & 255) >>> 4));
        bArr2[5] = (byte) ((bArr[4] << 3) | ((bArr[5] & 255) >>> 5));
        bArr2[6] = (byte) ((bArr[5] << 2) | ((bArr[6] & 255) >>> 6));
        bArr2[7] = (byte) (bArr[6] << 1);
        for (int i = 0; i < 8; i++) {
            byte b = bArr2[i];
            bArr2[i] = (byte) (b ^ (Integer.bitCount(b ^ 1) & 1));
        }
        return m9908(bArr2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Provider m9906() {
        BouncyCastleProvider bouncyCastleProvider = f9881;
        if (bouncyCastleProvider != null) {
            return bouncyCastleProvider;
        }
        BouncyCastleProvider bouncyCastleProvider2 = new BouncyCastleProvider();
        f9881 = bouncyCastleProvider2;
        return bouncyCastleProvider2;
    }
}
