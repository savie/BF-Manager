package l;

import com.alipay.sdk.m.p.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.HashMap;
import javax.crypto.EncryptedPrivateKeyInfo;

/* JADX INFO: renamed from: l.ܿۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1W4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17131 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f54635 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f54636;

    /* JADX INFO: renamed from: ۘ */
    public abstract byte[] mo1449();

    /* JADX INFO: renamed from: ۙ */
    public void mo1451() {
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public void mo40010() {
    }

    /* JADX INFO: renamed from: ۬ */
    public abstract byte[] mo1454();

    /* JADX INFO: renamed from: ᩳ */
    public abstract String mo1456();

    /* JADX INFO: renamed from: ᩴ */
    public boolean mo1457() {
        return this instanceof C19954;
    }

    /* JADX INFO: renamed from: ᩵ */
    public void mo1458() {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40012(String str) {
        this.f54636 = str;
        f54635.put(mo1456(), str);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m40014() {
        return this.f54636;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final X509Certificate m40009() {
        return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(mo1454()));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final PrivateKey m40013() {
        byte[] bArrMo1449 = mo1449();
        try {
            return KeyFactory.getInstance(new EncryptedPrivateKeyInfo(bArrMo1449).getAlgName()).generatePrivate(new PKCS8EncodedKeySpec(bArrMo1449));
        } catch (IOException unused) {
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArrMo1449);
            try {
                try {
                    return KeyFactory.getInstance(d.a).generatePrivate(pKCS8EncodedKeySpec);
                } catch (InvalidKeySpecException unused2) {
                    return KeyFactory.getInstance("EC").generatePrivate(pKCS8EncodedKeySpec);
                }
            } catch (InvalidKeySpecException unused3) {
                return KeyFactory.getInstance("DSA").generatePrivate(pKCS8EncodedKeySpec);
            }
        }
    }

    public final String toString() {
        return mo1456();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m40011() {
        C11018 c11018 = new C11018();
        if (this != C7253.f24158) {
            c11018.writeByte(0);
            c11018.m27786(mo1456());
            c11018.m27794(mo1454());
            c11018.m27794(mo1449());
        } else {
            c11018.m27784(true);
        }
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC17131 m40008(byte[] bArr) {
        C17367 c17367 = new C17367(bArr);
        if (c17367.m40461()) {
            return C7253.f24158;
        }
        return new C12193(c17367.m40451(), c17367.m40458(), c17367.m40451());
    }

    /* JADX INFO: renamed from: ᩸ */
    public String mo1459() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۜ */
    public String mo1453() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩹ */
    public String mo1460() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo1450(String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo1455() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۚ */
    public String mo1452() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۖ */
    public byte[] mo1448() {
        throw new UnsupportedOperationException();
    }
}
