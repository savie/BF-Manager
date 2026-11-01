package l;

import com.alipay.sdk.m.p.d;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ܳ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77V1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14799 implements InterfaceC13430 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public KeyFactory f48390;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Signature f48391;

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo6638();

    @Override // l.InterfaceC2845
    public void init() {
        String str;
        String strMo6638 = mo6638();
        if (strMo6638.equals("rsa-sha2-256") || strMo6638.equals("ssh-rsa-sha256@ssh.com")) {
            str = "SHA256withRSA";
        } else if (strMo6638.equals("rsa-sha2-512") || strMo6638.equals("ssh-rsa-sha512@ssh.com")) {
            str = "SHA512withRSA";
        } else if (strMo6638.equals("ssh-rsa-sha384@ssh.com")) {
            str = "SHA384withRSA";
        } else {
            str = strMo6638.equals("ssh-rsa-sha224@ssh.com") ? "SHA224withRSA" : "SHA1withRSA";
        }
        this.f48391 = Signature.getInstance(str);
        this.f48390 = KeyFactory.getInstance(d.a);
    }

    @Override // l.InterfaceC13430
    /* JADX INFO: renamed from: ۙ */
    public void mo32922(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.f48391.initVerify(this.f48390.generatePublic(new RSAPublicKeySpec(new BigInteger(bArr2), new BigInteger(bArr))));
    }

    @Override // l.InterfaceC13430
    /* JADX INFO: renamed from: ܰ */
    public void mo32923(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.f48391.initSign(this.f48390.generatePrivate(new RSAPrivateKeySpec(new BigInteger(bArr2), new BigInteger(bArr))));
    }

    @Override // l.InterfaceC2845
    public void update(byte[] bArr) throws SignatureException {
        this.f48391.update(bArr);
    }

    @Override // l.InterfaceC2845
    public boolean verify(byte[] bArr) {
        C14904 c14904 = new C14904(bArr);
        String str = new String(c14904.m35628(), StandardCharsets.UTF_8);
        if (str.equals(OpenSSHPublicKeyUtil.RSA) || str.equals("rsa-sha2-256") || str.equals("rsa-sha2-512") || str.equals("ssh-rsa-sha224@ssh.com") || str.equals("ssh-rsa-sha256@ssh.com") || str.equals("ssh-rsa-sha384@ssh.com") || str.equals("ssh-rsa-sha512@ssh.com")) {
            if (!str.equals(mo6638())) {
                return false;
            }
            int iM35638 = c14904.m35638();
            byte[] bArr2 = new byte[iM35638];
            System.arraycopy(bArr, c14904.m35625(), bArr2, 0, iM35638);
            bArr = bArr2;
        }
        return this.f48391.verify(bArr);
    }
}
