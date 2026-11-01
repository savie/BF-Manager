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

/* JADX INFO: renamed from: l.ܽ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7WN */
/* JADX INFO: loaded from: classes5.dex */
public final class C16915 implements InterfaceC5668 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public KeyFactory f54095;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Signature f54096;

    @Override // l.InterfaceC2845
    public final void init() {
        this.f54096 = Signature.getInstance("SHA1withDSA");
        this.f54095 = KeyFactory.getInstance("DSA");
    }

    @Override // l.InterfaceC5668
    /* JADX INFO: renamed from: ܰ */
    public final void mo15558(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidKeySpecException, InvalidKeyException {
        this.f54096.initVerify(this.f54095.generatePublic(new DSAPublicKeySpec(new BigInteger(bArr), new BigInteger(bArr2), new BigInteger(bArr3), new BigInteger(bArr4))));
    }

    @Override // l.InterfaceC5668
    /* JADX INFO: renamed from: ۙ */
    public final void mo15557(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidKeySpecException, InvalidKeyException {
        this.f54096.initSign(this.f54095.generatePrivate(new DSAPrivateKeySpec(new BigInteger(bArr), new BigInteger(bArr2), new BigInteger(bArr3), new BigInteger(bArr4))));
    }

    @Override // l.InterfaceC2845
    public final byte[] sign() throws SignatureException {
        byte[] bArrSign = this.f54096.sign();
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

    @Override // l.InterfaceC2845
    public final void update(byte[] bArr) throws SignatureException {
        this.f54096.update(bArr);
    }

    @Override // l.InterfaceC2845
    public final boolean verify(byte[] bArr) {
        C14904 c14904 = new C14904(bArr);
        if (new String(c14904.m35628(), StandardCharsets.UTF_8).equals(OpenSSHPublicKeyUtil.DSS)) {
            int iM35638 = c14904.m35638();
            byte[] bArr2 = new byte[iM35638];
            System.arraycopy(bArr, c14904.m35625(), bArr2, 0, iM35638);
            bArr = bArr2;
        }
        byte[] bArr3 = new byte[20];
        System.arraycopy(bArr, 0, bArr3, 0, 20);
        byte[] bArrM39599 = m39599(bArr3);
        byte[] bArr4 = new byte[20];
        System.arraycopy(bArr, 20, bArr4, 0, 20);
        byte[] bArrM395910 = m39599(bArr4);
        int i = (bArrM39599[0] & GCMSIVBlockCipher.MASK) != 0 ? 1 : 0;
        int i2 = (bArrM395910[0] & GCMSIVBlockCipher.MASK) != 0 ? 1 : 0;
        byte[] bArr5 = new byte[bArrM39599.length + bArrM395910.length + 6 + i + i2];
        bArr5[0] = UTF8.S_P3A;
        byte length = (byte) (bArrM39599.length + bArrM395910.length + 4);
        bArr5[1] = length;
        byte b = (byte) i;
        byte b2 = (byte) (length + b);
        bArr5[1] = b2;
        byte b3 = (byte) i2;
        bArr5[1] = (byte) (b2 + b3);
        bArr5[2] = 2;
        byte length2 = (byte) bArrM39599.length;
        bArr5[3] = length2;
        bArr5[3] = (byte) (length2 + b);
        System.arraycopy(bArrM39599, 0, bArr5, i + 4, bArrM39599.length);
        bArr5[bArr5[3] + 4] = 2;
        bArr5[bArr5[3] + 5] = (byte) bArrM395910.length;
        int i3 = bArr5[3] + 5;
        bArr5[i3] = (byte) (bArr5[i3] + b3);
        System.arraycopy(bArrM395910, 0, bArr5, bArr5[3] + 6 + i2, bArrM395910.length);
        return this.f54096.verify(bArr5);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m39599(byte[] bArr) {
        if (bArr.length <= 1 || bArr[0] != 0 || (bArr[1] & GCMSIVBlockCipher.MASK) != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        return m39599(bArr2);
    }
}
