package l;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ᩴۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7WN */
/* JADX INFO: loaded from: classes5.dex */
public final class C19737 implements InterfaceC6029 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public KeyFactory f63514;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Signature f63515;

    @Override // l.InterfaceC11994
    public final void init() {
        this.f63515 = Signature.getInstance("SHA1withDSA");
        this.f63514 = KeyFactory.getInstance("DSA");
    }

    @Override // l.InterfaceC6029
    /* JADX INFO: renamed from: ᩷ */
    public final void mo17502(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidKeySpecException, InvalidKeyException {
        this.f63515.initVerify(this.f63514.generatePublic(new DSAPublicKeySpec(new BigInteger(bArr), new BigInteger(bArr2), new BigInteger(bArr3), new BigInteger(bArr4))));
    }

    @Override // l.InterfaceC6029
    /* JADX INFO: renamed from: ۙ */
    public final void mo17501(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidKeySpecException, InvalidKeyException {
        this.f63515.initSign(this.f63514.generatePrivate(new DSAPrivateKeySpec(new BigInteger(bArr), new BigInteger(bArr2), new BigInteger(bArr3), new BigInteger(bArr4))));
    }

    @Override // l.InterfaceC11994
    public final byte[] sign() throws SignatureException {
        byte[] bArrSign = this.f63515.sign();
        int i = bArrSign[3] & 255;
        byte[] bArr = new byte[i];
        System.arraycopy(bArrSign, 4, bArr, 0, i);
        int i2 = bArrSign[i + 5] & 255;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArrSign, i + 6, bArr2, 0, i2);
        byte[] bArr3 = new byte[40];
        int i3 = i > 20 ? 1 : 0;
        int i4 = i > 20 ? 0 : 20 - i;
        if (i > 20) {
            i = 20;
        }
        System.arraycopy(bArr, i3, bArr3, i4, i);
        int i5 = i2 > 20 ? 1 : 0;
        int i6 = i2 > 20 ? 20 : 40 - i2;
        if (i2 > 20) {
            i2 = 20;
        }
        System.arraycopy(bArr2, i5, bArr3, i6, i2);
        return bArr3;
    }

    @Override // l.InterfaceC11994
    public final void update(byte[] bArr) throws SignatureException {
        this.f63515.update(bArr);
    }

    @Override // l.InterfaceC11994
    public final boolean verify(byte[] bArr) {
        C9866 c9866 = new C9866(bArr);
        if (new String(c9866.m25649(), StandardCharsets.UTF_8).equals(OpenSSHPublicKeyUtil.DSS)) {
            int iM25658 = c9866.m25658();
            byte[] bArr2 = new byte[iM25658];
            System.arraycopy(bArr, c9866.m25663(), bArr2, 0, iM25658);
            bArr = bArr2;
        }
        byte[] bArr3 = new byte[20];
        System.arraycopy(bArr, 0, bArr3, 0, 20);
        byte[] bArrM45443 = m45443(bArr3);
        byte[] bArr4 = new byte[20];
        System.arraycopy(bArr, 20, bArr4, 0, 20);
        byte[] bArrM45444 = m45443(bArr4);
        int i = (bArrM45443[0] & GCMSIVBlockCipher.MASK) != 0 ? 1 : 0;
        int i2 = (bArrM45444[0] & GCMSIVBlockCipher.MASK) != 0 ? 1 : 0;
        byte[] bArr5 = new byte[bArrM45443.length + bArrM45444.length + 6 + i + i2];
        bArr5[0] = UTF8.S_P3A;
        byte length = (byte) (bArrM45443.length + bArrM45444.length + 4);
        bArr5[1] = length;
        byte b = (byte) i;
        byte b2 = (byte) (length + b);
        bArr5[1] = b2;
        byte b3 = (byte) i2;
        bArr5[1] = (byte) (b2 + b3);
        bArr5[2] = 2;
        byte length2 = (byte) bArrM45443.length;
        bArr5[3] = length2;
        bArr5[3] = (byte) (length2 + b);
        System.arraycopy(bArrM45443, 0, bArr5, i + 4, bArrM45443.length);
        bArr5[bArr5[3] + 4] = 2;
        bArr5[bArr5[3] + 5] = (byte) bArrM45444.length;
        int i3 = bArr5[3] + 5;
        bArr5[i3] = (byte) (bArr5[i3] + b3);
        System.arraycopy(bArrM45444, 0, bArr5, bArr5[3] + 6 + i2, bArrM45444.length);
        return this.f63515.verify(bArr5);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m45443(byte[] bArr) {
        if (bArr.length <= 1 || bArr[0] != 0 || (bArr[1] & GCMSIVBlockCipher.MASK) != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        return m45443(bArr2);
    }
}
