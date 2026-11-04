package l;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.KeyAgreement;

/* JADX INFO: renamed from: l.֫ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67UW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2101 implements InterfaceC19320 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static BigInteger f6956;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static BigInteger f6957;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f6958;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ECPublicKey f6959;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public KeyAgreement f6960;

    @Override // l.InterfaceC19320
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7269(int i) throws NoSuchAlgorithmException, InvalidKeyException, C2079, InvalidAlgorithmParameterException {
        String str;
        this.f6960 = KeyAgreement.getInstance("ECDH");
        C1355 c1355 = new C1355();
        if (i == 256) {
            str = "secp256r1";
        } else if (i == 384) {
            str = "secp384r1";
        } else {
            if (i != 521) {
                throw new C2079(C13645.m33382(i, "unsupported key size: "));
            }
            str = "secp521r1";
        }
        for (int i2 = 0; i2 < 1000; i2++) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec(str));
            KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
            c1355.f4835 = (ECPrivateKey) keyPairGenKeyPair.getPrivate();
            ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenKeyPair.getPublic();
            c1355.f4833 = eCPublicKey;
            eCPublicKey.getParams();
            c1355.f4832 = c1355.f4835.getS().toByteArray();
            ECPoint w = c1355.f4833.getW();
            c1355.f4836 = w.getAffineX().toByteArray();
            byte[] byteArray = w.getAffineY().toByteArray();
            c1355.f4834 = byteArray;
            byte[] bArr = c1355.f4836;
            if (bArr.length == byteArray.length && ((i == 256 && bArr.length == 32) || ((i == 384 && bArr.length == 48) || (i == 521 && bArr.length == 66)))) {
                break;
            }
        }
        byte[] bArr2 = c1355.f4832;
        if (bArr2.length < c1355.f4836.length) {
            byte[] bArr3 = new byte[bArr2.length + 1];
            System.arraycopy(bArr2, 0, bArr3, 1, bArr2.length);
            C24213.m54205(bArr2);
            c1355.f4832 = bArr3;
        }
        this.f6959 = c1355.f4833;
        byte[] bArr4 = c1355.f4836;
        byte[] bArr5 = c1355.f4834;
        byte[] bArr6 = new byte[bArr4.length + 1 + bArr5.length];
        bArr6[0] = 4;
        System.arraycopy(bArr4, 0, bArr6, 1, bArr4.length);
        System.arraycopy(bArr5, 0, bArr6, bArr4.length + 1, bArr5.length);
        this.f6958 = bArr6;
        this.f6960.init(c1355.f4835);
    }

    @Override // l.InterfaceC19320
    public final byte[] getQ() {
        return this.f6958;
    }

    @Override // l.InterfaceC19320
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo7270(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.f6960.doPhase(KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2)), this.f6959.getParams())), true);
        return this.f6960.generateSecret();
    }

    static {
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerAdd = bigInteger.add(bigInteger);
        f6956 = bigIntegerAdd;
        f6957 = bigIntegerAdd.add(bigInteger);
    }

    @Override // l.InterfaceC19320
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo7271(byte[] bArr, byte[] bArr2) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        if (new ECPoint(bigInteger, bigInteger2).equals(ECPoint.POINT_INFINITY)) {
            return false;
        }
        EllipticCurve curve = this.f6959.getParams().getCurve();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        BigInteger bigIntegerSubtract = p.subtract(BigInteger.ONE);
        if (bigInteger.compareTo(bigIntegerSubtract) > 0 || bigInteger2.compareTo(bigIntegerSubtract) > 0) {
            return false;
        }
        return bigInteger2.modPow(f6956, p).equals(bigInteger.multiply(curve.getA()).add(curve.getB()).add(bigInteger.modPow(f6957, p)).mod(p));
    }
}
