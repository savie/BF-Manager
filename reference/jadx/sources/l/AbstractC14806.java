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

/* JADX INFO: renamed from: l.ܰᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A1W4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14806 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final HashMap f48428 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f48429;

    /* JADX INFO: renamed from: ֫ */
    public abstract byte[] mo11751();

    /* JADX INFO: renamed from: ۗ */
    public void mo31285() {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo18530() {
    }

    /* JADX INFO: renamed from: ۚ */
    public abstract byte[] mo11752();

    /* JADX INFO: renamed from: ܶ */
    public abstract String mo11753();

    /* JADX INFO: renamed from: ᩵ */
    public void mo18535() {
    }

    /* JADX INFO: renamed from: ᩹ */
    public boolean mo18538() {
        return this instanceof C12569;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35654(String str) {
        this.f48429 = str;
        f48428.put(mo11753(), str);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m35655() {
        return this.f48429;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final X509Certificate m35652() {
        return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(mo11752()));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final PrivateKey m35653() {
        byte[] bArrMo11751 = mo11751();
        try {
            return KeyFactory.getInstance(new EncryptedPrivateKeyInfo(bArrMo11751).getAlgName()).generatePrivate(new PKCS8EncodedKeySpec(bArrMo11751));
        } catch (IOException unused) {
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArrMo11751);
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
        return mo11753();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m35651() {
        C6178 c6178 = new C6178();
        if (this != C23758.f76988) {
            c6178.writeByte(0);
            c6178.m17800(mo11753());
            c6178.m17806(mo11752());
            c6178.m17806(mo11751());
        } else {
            c6178.m17789(true);
        }
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14806 m35650(byte[] bArr) {
        C20348 c20348 = new C20348(bArr);
        if (c20348.m46753()) {
            return C23758.f76988;
        }
        return new C4366(c20348.m46748(), c20348.m46758(), c20348.m46748());
    }

    /* JADX INFO: renamed from: ܽ */
    public String mo18533() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۧ */
    public String mo18531() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܳ */
    public String mo18532() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ */
    public String mo18529(String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo18536() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩴ */
    public String mo18534() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩸ */
    public byte[] mo18537() {
        throw new UnsupportedOperationException();
    }
}
