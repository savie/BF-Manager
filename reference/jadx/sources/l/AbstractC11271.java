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

/* JADX INFO: renamed from: l.ۧ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7YO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11271 implements InterfaceC22602 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public KeyFactory f38091;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Signature f38092;

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo17434();

    @Override // l.InterfaceC2845
    public void init() {
        String str;
        String strMo17434 = mo17434();
        if (strMo17434.equals("ecdsa-sha2-nistp384")) {
            str = "SHA384withECDSA";
        } else {
            str = strMo17434.equals("ecdsa-sha2-nistp521") ? "SHA512withECDSA" : "SHA256withECDSA";
        }
        this.f38092 = Signature.getInstance(str);
        this.f38091 = KeyFactory.getInstance("EC");
    }

    @Override // l.InterfaceC22602
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28243(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException {
        String str;
        byte[] bArrM28241 = m28241(bArr);
        byte[] bArrM28242 = m28241(bArr2);
        if (bArrM28241.length >= 64) {
            str = "secp521r1";
        } else {
            str = bArrM28241.length >= 48 ? "secp384r1" : "secp256r1";
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.f38092.initVerify(this.f38091.generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArrM28241), new BigInteger(1, bArrM28242)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // l.InterfaceC22602
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28242(byte[] bArr) throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException {
        String str;
        byte[] bArrM28241 = m28241(bArr);
        if (bArrM28241.length >= 64) {
            str = "secp521r1";
        } else {
            str = bArrM28241.length >= 48 ? "secp384r1" : "secp256r1";
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.f38092.initSign(this.f38091.generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrM28241), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // l.InterfaceC2845
    public byte[] sign() throws SignatureException {
        byte[] bArrSign = this.f38092.sign();
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
                    C22455.m49956(bArr);
                    bArr = bArr3;
                }
                if (bArr2[0] == 0) {
                    int i6 = i4 - 1;
                    byte[] bArr4 = new byte[i6];
                    System.arraycopy(bArr2, 1, bArr4, 0, i6);
                    C22455.m49956(bArr2);
                    bArr2 = bArr4;
                }
                C14904 c14904 = new C14904();
                c14904.m35641(bArr);
                c14904.m35641(bArr2);
                byte[] bArr5 = new byte[c14904.m35626()];
                c14904.m35648();
                c14904.m35634(bArr5);
                return bArr5;
            }
        }
        return bArrSign;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:13:0x0073  */
    @Override // l.InterfaceC2845
    public boolean verify(byte[] bArr) {
        byte[] bArrM28240;
        byte[] bArrM28241;
        byte[] bArr2;
        if (bArr[0] == 48) {
            byte b = bArr[1];
            if (b + 2 != bArr.length && ((b & GCMSIVBlockCipher.MASK) == 0 || (bArr[2] & 255) + 3 != bArr.length)) {
                C14904 c14904 = new C14904(bArr);
                c14904.m35628();
                c14904.m35638();
                byte[] bArrM35636 = c14904.m35636();
                byte[] bArrM35637 = c14904.m35636();
                bArrM28240 = m28240(m28241(bArrM35636));
                bArrM28241 = m28240(m28241(bArrM35637));
                if (bArrM28240.length < 64) {
                    bArr2 = new byte[bArrM28240.length + 6 + bArrM28241.length];
                    bArr2[0] = UTF8.S_P3A;
                    bArr2[1] = (byte) (bArrM28240.length + 4 + bArrM28241.length);
                    bArr2[2] = 2;
                    bArr2[3] = (byte) bArrM28240.length;
                    System.arraycopy(bArrM28240, 0, bArr2, 4, bArrM28240.length);
                    bArr2[bArrM28240.length + 4] = 2;
                    bArr2[bArrM28240.length + 5] = (byte) bArrM28241.length;
                    System.arraycopy(bArrM28241, 0, bArr2, bArrM28240.length + 6, bArrM28241.length);
                } else {
                    bArr2 = new byte[bArrM28240.length + 6 + bArrM28241.length + 1];
                    bArr2[0] = UTF8.S_P3A;
                    bArr2[1] = -127;
                    bArr2[2] = (byte) (bArrM28240.length + 4 + bArrM28241.length);
                    bArr2[3] = 2;
                    bArr2[4] = (byte) bArrM28240.length;
                    System.arraycopy(bArrM28240, 0, bArr2, 5, bArrM28240.length);
                    bArr2[bArrM28240.length + 5] = 2;
                    bArr2[bArrM28240.length + 6] = (byte) bArrM28241.length;
                    System.arraycopy(bArrM28241, 0, bArr2, bArrM28240.length + 7, bArrM28241.length);
                }
                bArr = bArr2;
            }
        } else {
            C14904 c14905 = new C14904(bArr);
            c14905.m35628();
            c14905.m35638();
            byte[] bArrM35638 = c14905.m35636();
            byte[] bArrM35639 = c14905.m35636();
            bArrM28240 = m28240(m28241(bArrM35638));
            bArrM28241 = m28240(m28241(bArrM35639));
            if (bArrM28240.length < 64) {
                bArr2 = new byte[bArrM28240.length + 6 + bArrM28241.length];
                bArr2[0] = UTF8.S_P3A;
                bArr2[1] = (byte) (bArrM28240.length + 4 + bArrM28241.length);
                bArr2[2] = 2;
                bArr2[3] = (byte) bArrM28240.length;
                System.arraycopy(bArrM28240, 0, bArr2, 4, bArrM28240.length);
                bArr2[bArrM28240.length + 4] = 2;
                bArr2[bArrM28240.length + 5] = (byte) bArrM28241.length;
                System.arraycopy(bArrM28241, 0, bArr2, bArrM28240.length + 6, bArrM28241.length);
            } else {
                bArr2 = new byte[bArrM28240.length + 6 + bArrM28241.length + 1];
                bArr2[0] = UTF8.S_P3A;
                bArr2[1] = -127;
                bArr2[2] = (byte) (bArrM28240.length + 4 + bArrM28241.length);
                bArr2[3] = 2;
                bArr2[4] = (byte) bArrM28240.length;
                System.arraycopy(bArrM28240, 0, bArr2, 5, bArrM28240.length);
                bArr2[bArrM28240.length + 5] = 2;
                bArr2[bArrM28240.length + 6] = (byte) bArrM28241.length;
                System.arraycopy(bArrM28241, 0, bArr2, bArrM28240.length + 7, bArrM28241.length);
            }
            bArr = bArr2;
        }
        return this.f38092.verify(bArr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m28241(byte[] bArr) {
        if ((bArr[0] & GCMSIVBlockCipher.MASK) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        C22455.m49956(bArr);
        return bArr2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static byte[] m28240(byte[] bArr) {
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
                C22455.m49956(bArr);
                return bArr2;
            }
        }
        return bArr;
    }
}
