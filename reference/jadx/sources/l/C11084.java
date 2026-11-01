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

/* JADX INFO: renamed from: l.ۧܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11084 implements InterfaceC22747 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static BigInteger f37620;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static BigInteger f37621;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f37622;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ECPublicKey f37623;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public KeyAgreement f37624;

    @Override // l.InterfaceC22747
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27932(int i) throws C5813, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        this.f37624 = KeyAgreement.getInstance("ECDH");
        C19032 c19032 = new C19032();
        if (i == 256) {
            str = "secp256r1";
        } else if (i == 384) {
            str = "secp384r1";
        } else {
            if (i != 521) {
                throw new C5813(C8479.m22141(i, "unsupported key size: "));
            }
            str = "secp521r1";
        }
        for (int i2 = 0; i2 < 1000; i2++) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec(str));
            KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
            c19032.f61565 = (ECPrivateKey) keyPairGenKeyPair.getPrivate();
            ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenKeyPair.getPublic();
            c19032.f61564 = eCPublicKey;
            eCPublicKey.getParams();
            c19032.f61562 = c19032.f61565.getS().toByteArray();
            ECPoint w = c19032.f61564.getW();
            c19032.f61561 = w.getAffineX().toByteArray();
            byte[] byteArray = w.getAffineY().toByteArray();
            c19032.f61563 = byteArray;
            byte[] bArr = c19032.f61561;
            if (bArr.length == byteArray.length && ((i == 256 && bArr.length == 32) || ((i == 384 && bArr.length == 48) || (i == 521 && bArr.length == 66)))) {
                break;
            }
        }
        byte[] bArr2 = c19032.f61562;
        if (bArr2.length < c19032.f61561.length) {
            byte[] bArr3 = new byte[bArr2.length + 1];
            System.arraycopy(bArr2, 0, bArr3, 1, bArr2.length);
            C22455.m49956(bArr2);
            c19032.f61562 = bArr3;
        }
        this.f37623 = c19032.f61564;
        byte[] bArr4 = c19032.f61561;
        byte[] bArr5 = c19032.f61563;
        byte[] bArr6 = new byte[bArr4.length + 1 + bArr5.length];
        bArr6[0] = 4;
        System.arraycopy(bArr4, 0, bArr6, 1, bArr4.length);
        System.arraycopy(bArr5, 0, bArr6, bArr4.length + 1, bArr5.length);
        this.f37622 = bArr6;
        this.f37624.init(c19032.f61565);
    }

    @Override // l.InterfaceC22747
    public final byte[] getQ() {
        return this.f37622;
    }

    @Override // l.InterfaceC22747
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] mo27933(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.f37624.doPhase(KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2)), this.f37623.getParams())), true);
        return this.f37624.generateSecret();
    }

    static {
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerAdd = bigInteger.add(bigInteger);
        f37621 = bigIntegerAdd;
        f37620 = bigIntegerAdd.add(bigInteger);
    }

    @Override // l.InterfaceC22747
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo27934(byte[] bArr, byte[] bArr2) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        if (new ECPoint(bigInteger, bigInteger2).equals(ECPoint.POINT_INFINITY)) {
            return false;
        }
        EllipticCurve curve = this.f37623.getParams().getCurve();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        BigInteger bigIntegerSubtract = p.subtract(BigInteger.ONE);
        if (bigInteger.compareTo(bigIntegerSubtract) > 0 || bigInteger2.compareTo(bigIntegerSubtract) > 0) {
            return false;
        }
        return bigInteger2.modPow(f37621, p).equals(bigInteger.multiply(curve.getA()).add(curve.getB()).add(bigInteger.modPow(f37620, p)).mod(p));
    }
}
