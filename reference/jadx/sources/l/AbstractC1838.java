package l;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֫ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7YO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1838 implements InterfaceC23929 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public KeyFactory f6216;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Signature f6217;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo6338();

    @Override // l.InterfaceC11994
    public void init() {
        String str;
        String strMo6338 = mo6338();
        if (strMo6338.equals("ecdsa-sha2-nistp384")) {
            str = "SHA384withECDSA";
        } else {
            str = strMo6338.equals("ecdsa-sha2-nistp521") ? "SHA512withECDSA" : "SHA256withECDSA";
        }
        this.f6217 = Signature.getInstance(str);
        this.f6216 = KeyFactory.getInstance("EC");
    }

    @Override // l.InterfaceC23929
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo6340(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException {
        String str;
        byte[] bArrM6336 = m6336(bArr);
        byte[] bArrM6337 = m6336(bArr2);
        if (bArrM6336.length >= 64) {
            str = "secp521r1";
        } else {
            str = bArrM6336.length >= 48 ? "secp384r1" : "secp256r1";
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.f6217.initVerify(this.f6216.generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArrM6336), new BigInteger(1, bArrM6337)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // l.InterfaceC23929
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo6339(byte[] bArr) throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException {
        String str;
        byte[] bArrM6336 = m6336(bArr);
        if (bArrM6336.length >= 64) {
            str = "secp521r1";
        } else {
            str = bArrM6336.length >= 48 ? "secp384r1" : "secp256r1";
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.f6217.initSign(this.f6216.generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrM6336), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // l.InterfaceC11994
    public byte[] sign() throws SignatureException {
        byte[] bArrSign = this.f6217.sign();
        if (bArrSign[0] == '0') {
            int i = bArrSign[1];
            int i2 = 3;
            if (i + 2 == bArrSign.length || ((i & 128) != 0 && (bArrSign[2] & 255) + 3 == bArrSign.length)) {
                if ((i & 128) != 0 && (bArrSign[2] & 255) + 3 == bArrSign.length) {
                    i2 = 4;
                }
                int i3 = bArrSign[i2];
                byte[] bArr = new byte[i3];
                int i4 = bArrSign[i2 + 2 + i3];
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArrSign, i2 + 1, bArr, 0, i3);
                System.arraycopy(bArrSign, i2 + 3 + bArrSign[i2], bArr2, 0, i4);
                if (bArr[0] == 0) {
                    int i5 = i3 - 1;
                    byte[] bArr3 = new byte[i5];
                    System.arraycopy(bArr, 1, bArr3, 0, i5);
                    C24213.m54205(bArr);
                    bArr = bArr3;
                }
                if (bArr2[0] == 0) {
                    int i6 = i4 - 1;
                    byte[] bArr4 = new byte[i6];
                    System.arraycopy(bArr2, 1, bArr4, 0, i6);
                    C24213.m54205(bArr2);
                    bArr2 = bArr4;
                }
                C9866 c9866 = new C9866();
                c9866.m25661(bArr);
                c9866.m25661(bArr2);
                byte[] bArr5 = new byte[c9866.m25672()];
                c9866.m25666();
                c9866.m25655(bArr5);
                return bArr5;
            }
        }
        return bArrSign;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:13:0x0073  */
    @Override // l.InterfaceC11994
    public boolean verify(byte[] bArr) {
        byte[] bArrM6337;
        byte[] bArrM6338;
        byte[] bArr2;
        if (bArr[0] == 48) {
            byte b = bArr[1];
            if (b + 2 != bArr.length && ((b & GCMSIVBlockCipher.MASK) == 0 || (bArr[2] & 255) + 3 != bArr.length)) {
                C9866 c9866 = new C9866(bArr);
                c9866.m25649();
                c9866.m25658();
                byte[] bArrM25667 = c9866.m25667();
                byte[] bArrM25668 = c9866.m25667();
                bArrM6337 = m6337(m6336(bArrM25667));
                bArrM6338 = m6337(m6336(bArrM25668));
                if (bArrM6337.length < 64) {
                    bArr2 = new byte[bArrM6337.length + 6 + bArrM6338.length];
                    bArr2[0] = UTF8.S_P3A;
                    bArr2[1] = (byte) (bArrM6337.length + 4 + bArrM6338.length);
                    bArr2[2] = 2;
                    bArr2[3] = (byte) bArrM6337.length;
                    System.arraycopy(bArrM6337, 0, bArr2, 4, bArrM6337.length);
                    bArr2[bArrM6337.length + 4] = 2;
                    bArr2[bArrM6337.length + 5] = (byte) bArrM6338.length;
                    System.arraycopy(bArrM6338, 0, bArr2, bArrM6337.length + 6, bArrM6338.length);
                } else {
                    bArr2 = new byte[bArrM6337.length + 6 + bArrM6338.length + 1];
                    bArr2[0] = UTF8.S_P3A;
                    bArr2[1] = -127;
                    bArr2[2] = (byte) (bArrM6337.length + 4 + bArrM6338.length);
                    bArr2[3] = 2;
                    bArr2[4] = (byte) bArrM6337.length;
                    System.arraycopy(bArrM6337, 0, bArr2, 5, bArrM6337.length);
                    bArr2[bArrM6337.length + 5] = 2;
                    bArr2[bArrM6337.length + 6] = (byte) bArrM6338.length;
                    System.arraycopy(bArrM6338, 0, bArr2, bArrM6337.length + 7, bArrM6338.length);
                }
                bArr = bArr2;
            }
        } else {
            C9866 c9867 = new C9866(bArr);
            c9867.m25649();
            c9867.m25658();
            byte[] bArrM25669 = c9867.m25667();
            byte[] bArrM256610 = c9867.m25667();
            bArrM6337 = m6337(m6336(bArrM25669));
            bArrM6338 = m6337(m6336(bArrM256610));
            if (bArrM6337.length < 64) {
                bArr2 = new byte[bArrM6337.length + 6 + bArrM6338.length];
                bArr2[0] = UTF8.S_P3A;
                bArr2[1] = (byte) (bArrM6337.length + 4 + bArrM6338.length);
                bArr2[2] = 2;
                bArr2[3] = (byte) bArrM6337.length;
                System.arraycopy(bArrM6337, 0, bArr2, 4, bArrM6337.length);
                bArr2[bArrM6337.length + 4] = 2;
                bArr2[bArrM6337.length + 5] = (byte) bArrM6338.length;
                System.arraycopy(bArrM6338, 0, bArr2, bArrM6337.length + 6, bArrM6338.length);
            } else {
                bArr2 = new byte[bArrM6337.length + 6 + bArrM6338.length + 1];
                bArr2[0] = UTF8.S_P3A;
                bArr2[1] = -127;
                bArr2[2] = (byte) (bArrM6337.length + 4 + bArrM6338.length);
                bArr2[3] = 2;
                bArr2[4] = (byte) bArrM6337.length;
                System.arraycopy(bArrM6337, 0, bArr2, 5, bArrM6337.length);
                bArr2[bArrM6337.length + 5] = 2;
                bArr2[bArrM6337.length + 6] = (byte) bArrM6338.length;
                System.arraycopy(bArrM6338, 0, bArr2, bArrM6337.length + 7, bArrM6338.length);
            }
            bArr = bArr2;
        }
        return this.f6217.verify(bArr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m6336(byte[] bArr) {
        if ((bArr[0] & GCMSIVBlockCipher.MASK) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        C24213.m54205(bArr);
        return bArr2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static byte[] m6337(byte[] bArr) {
        if (bArr.length >= 2) {
            int i = 0;
            while (i < bArr.length - 1 && bArr[i] == 0) {
                int i2 = i + 1;
                if ((bArr[i2] & GCMSIVBlockCipher.MASK) != 0) {
                    break;
                }
                i = i2;
            }
            if (i != 0) {
                int length = bArr.length - i;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, i, bArr2, 0, length);
                C24213.m54205(bArr);
                return bArr2;
            }
        }
        return bArr;
    }
}
