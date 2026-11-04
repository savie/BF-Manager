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

/* JADX INFO: renamed from: l.᩻ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77V1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24959 implements InterfaceC14231 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public KeyFactory f80821;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Signature f80822;

    /* JADX INFO: renamed from: ۙ */
    public abstract String mo10973();

    @Override // l.InterfaceC11994
    public void init() {
        String str;
        String strMo10973 = mo10973();
        if (strMo10973.equals("rsa-sha2-256") || strMo10973.equals("ssh-rsa-sha256@ssh.com")) {
            str = "SHA256withRSA";
        } else if (strMo10973.equals("rsa-sha2-512") || strMo10973.equals("ssh-rsa-sha512@ssh.com")) {
            str = "SHA512withRSA";
        } else if (strMo10973.equals("ssh-rsa-sha384@ssh.com")) {
            str = "SHA384withRSA";
        } else {
            str = strMo10973.equals("ssh-rsa-sha224@ssh.com") ? "SHA224withRSA" : "SHA1withRSA";
        }
        this.f80822 = Signature.getInstance(str);
        this.f80821 = KeyFactory.getInstance(d.a);
    }

    @Override // l.InterfaceC14231
    /* JADX INFO: renamed from: ۙ */
    public void mo34543(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.f80822.initVerify(this.f80821.generatePublic(new RSAPublicKeySpec(new BigInteger(bArr2), new BigInteger(bArr))));
    }

    @Override // l.InterfaceC14231
    /* JADX INFO: renamed from: ᩷ */
    public void mo34544(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.f80822.initSign(this.f80821.generatePrivate(new RSAPrivateKeySpec(new BigInteger(bArr2), new BigInteger(bArr))));
    }

    @Override // l.InterfaceC11994
    public void update(byte[] bArr) throws SignatureException {
        this.f80822.update(bArr);
    }

    @Override // l.InterfaceC11994
    public boolean verify(byte[] bArr) {
        C9866 c9866 = new C9866(bArr);
        String str = new String(c9866.m25649(), StandardCharsets.UTF_8);
        if (str.equals(OpenSSHPublicKeyUtil.RSA) || str.equals("rsa-sha2-256") || str.equals("rsa-sha2-512") || str.equals("ssh-rsa-sha224@ssh.com") || str.equals("ssh-rsa-sha256@ssh.com") || str.equals("ssh-rsa-sha384@ssh.com") || str.equals("ssh-rsa-sha512@ssh.com")) {
            if (!str.equals(mo10973())) {
                return false;
            }
            int iM25658 = c9866.m25658();
            byte[] bArr2 = new byte[iM25658];
            System.arraycopy(bArr, c9866.m25663(), bArr2, 0, iM25658);
            bArr = bArr2;
        }
        return this.f80822.verify(bArr);
    }
}
