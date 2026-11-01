package l;

import com.alipay.sdk.m.p.d;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۖ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2811 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final HashMap f10681;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final HashMap f10682;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22568 f10683;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f10684;

    public C2811(byte[] bArr) {
        C22568 c22568 = (C22568) C20576.m46426(((C1608) C20576.m46426(ByteBuffer.wrap(bArr), C1608.class)).f6492.m5292(), C22568.class);
        this.f10683 = c22568;
        this.f10684 = m8545(c22568.f73546);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final X509Certificate[] m8548() {
        List list = this.f10684;
        if (list.isEmpty()) {
            return null;
        }
        return (X509Certificate[]) list.toArray(new X509Certificate[0]);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x001e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8547(byte[] bArr) throws C5634, SignatureException, NoSuchAlgorithmException, InvalidKeyException, CertificateException {
        char c;
        X509Certificate x509Certificate;
        String str;
        C22568 c22568 = this.f10683;
        if (c22568.f73547.isEmpty()) {
            return false;
        }
        List listM8545 = m8545(c22568.f73546);
        int i = 0;
        for (C13396 c13396 : c22568.f73547) {
            String str2 = c13396.f44352.f76035;
            String str3 = c13396.f44351.f76035;
            C1400 c1400 = c13396.f44355;
            Iterator it = listM8545.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c = 0;
                    x509Certificate = null;
                    break;
                }
                x509Certificate = (X509Certificate) it.next();
                C3019 c3019 = c1400.f5809;
                if (c3019 != null) {
                    ByteBuffer byteBufferM5292 = c3019.f11277.m5292();
                    byte[] bArr2 = new byte[byteBufferM5292.remaining()];
                    byteBufferM5292.get(bArr2);
                    X500Principal x500Principal = new X500Principal(bArr2);
                    if (c3019.f11276.equals(x509Certificate.getSerialNumber()) && x500Principal.equals(x509Certificate.getIssuerX500Principal())) {
                        c = 0;
                        break;
                    }
                }
            }
            if (x509Certificate == null) {
                throw new SignatureException("Signing certificate referenced in SignerInfo not found in SignedData");
            }
            if (x509Certificate.hasUnsupportedCriticalExtension()) {
                throw new SignatureException("Signing certificate has unsupported critical extensions");
            }
            boolean[] keyUsage = x509Certificate.getKeyUsage();
            if (keyUsage != null) {
                boolean z = keyUsage.length >= 1 && keyUsage[c];
                boolean z2 = keyUsage.length >= 2 && keyUsage[1];
                if (!z && !z2) {
                    throw new SignatureException("Signing certificate not authorized for use in digital signatures: keyUsage extension missing digitalSignature and nonRepudiation");
                }
            }
            String strM5594 = (String) f10681.get(str3);
            if (strM5594 == null) {
                if ("1.2.840.113549.1.1.1".equals(str3)) {
                    str = d.a;
                } else if (C23482.f76027.equals(str3)) {
                    str = "DSA";
                } else {
                    if (!C23482.f76033.equals(str3)) {
                        throw new SignatureException(C7997.m21055("Unsupported JCA Signature algorithm . Digest algorithm: ", str2, ", signature algorithm: ", str3));
                    }
                    str = "ECDSA";
                }
                String strM8544 = m8544(str2);
                if (strM8544.startsWith("SHA-")) {
                    strM8544 = C0242.m1616(4, strM8544, new StringBuilder("SHA"));
                }
                strM5594 = C1679.m5594(strM8544, "with", str);
            }
            Signature signature = Signature.getInstance(strM5594);
            signature.initVerify(x509Certificate.getPublicKey());
            C1525 c1525 = c13396.f44353;
            if (c1525 != null) {
                try {
                    C11985 c11985 = new C11985(C20576.m46423(c1525.m5292()));
                    String strM29792 = c11985.m29792();
                    if (strM29792 == null) {
                        throw new SignatureException("No Content Type in signed attributes");
                    }
                    if (strM29792.equals(c22568.f73545.f31740)) {
                        byte[] bArrM29793 = c11985.m29793();
                        if (bArrM29793 == null) {
                            throw new SignatureException("No content digest in signed attributes");
                        }
                        if (Arrays.equals(bArrM29793, MessageDigest.getInstance(m8544(str2)).digest(bArr))) {
                            ByteBuffer byteBufferM5293 = c13396.f44353.m5292();
                            signature.update((byte) 49);
                            byteBufferM5293.position(1);
                            signature.update(byteBufferM5293);
                        }
                        if (x509Certificate != null) {
                            i++;
                        }
                    }
                    x509Certificate = null;
                    if (x509Certificate != null) {
                        i++;
                    }
                } catch (C19871 e) {
                    throw new SignatureException("Failed to parse signed attributes", e);
                }
            } else {
                signature.update(bArr);
            }
            ByteBuffer byteBufferSlice = c13396.f44354.slice();
            byte[] bArr3 = new byte[byteBufferSlice.remaining()];
            byteBufferSlice.get(bArr3);
            if (!signature.verify(bArr3)) {
                x509Certificate = null;
            }
            if (x509Certificate != null) {
                i++;
            }
        }
        return i == c22568.f73547.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m8545(List list) throws CertificateException {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ByteBuffer byteBufferM5292 = ((C1525) list.get(i)).m5292();
            byte[] bArr = new byte[byteBufferM5292.remaining()];
            byteBufferM5292.get(bArr);
            try {
                arrayList.add(new C15513(C21862.m48643(bArr), bArr));
            } catch (CertificateException e) {
                throw new CertificateException("Failed to parse certificate #" + (i + 1), e);
            }
        }
        return arrayList;
    }

    static {
        HashMap map = new HashMap();
        f10682 = map;
        map.put("1.2.840.113549.2.5", "MD5");
        map.put(C23482.f76028, "SHA-1");
        map.put("2.16.840.1.101.3.4.2.4", "SHA-224");
        map.put(C23482.f76030, XMSSKeyParameters.SHA_256);
        map.put("2.16.840.1.101.3.4.2.2", "SHA-384");
        map.put("2.16.840.1.101.3.4.2.3", XMSSKeyParameters.SHA_512);
        HashMap map2 = new HashMap();
        f10681 = map2;
        map2.put("1.2.840.113549.1.1.4", "MD5withRSA");
        map2.put("1.2.840.113549.1.1.5", "SHA1withRSA");
        map2.put("1.2.840.113549.1.1.14", "SHA224withRSA");
        map2.put("1.2.840.113549.1.1.11", "SHA256withRSA");
        map2.put("1.2.840.113549.1.1.12", "SHA384withRSA");
        map2.put("1.2.840.113549.1.1.13", "SHA512withRSA");
        map2.put("1.2.840.10040.4.3", "SHA1withDSA");
        map2.put("2.16.840.1.101.3.4.3.1", "SHA224withDSA");
        map2.put(C23482.f76031, "SHA256withDSA");
        map2.put("2.16.840.1.101.3.4.3.3", "SHA384withDSA");
        map2.put("2.16.840.1.101.3.4.3.4", "SHA512withDSA");
        map2.put("2.16.840.1.101.3.4.3.5", "SHA3-224withDSA");
        map2.put("2.16.840.1.101.3.4.3.6", "SHA3-256withDSA");
        map2.put("2.16.840.1.101.3.4.3.7", "SHA3-384withDSA");
        map2.put("2.16.840.1.101.3.4.3.8", "SHA3-512withDSA");
        map2.put("2.16.840.1.101.3.4.3.9", "SHA3-224withECDSA");
        map2.put("2.16.840.1.101.3.4.3.10", "SHA3-256withECDSA");
        map2.put("2.16.840.1.101.3.4.3.11", "SHA3-384withECDSA");
        map2.put("2.16.840.1.101.3.4.3.12", "SHA3-512withECDSA");
        map2.put("2.16.840.1.101.3.4.3.13", "SHA3-224withRSA");
        map2.put("2.16.840.1.101.3.4.3.14", "SHA3-256withRSA");
        map2.put("2.16.840.1.101.3.4.3.15", "SHA3-384withRSA");
        map2.put("2.16.840.1.101.3.4.3.16", "SHA3-512withRSA");
        map2.put("1.2.840.10045.4.1", "SHA1withECDSA");
        map2.put("1.2.840.10045.4.3.1", "SHA224withECDSA");
        map2.put("1.2.840.10045.4.3.2", "SHA256withECDSA");
        map2.put("1.2.840.10045.4.3.3", "SHA384withECDSA");
        map2.put("1.2.840.10045.4.3.4", "SHA512withECDSA");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m8544(String str) throws SignatureException {
        String str2 = (String) f10682.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new SignatureException(C0252.m1693("Unsupported digest algorithm: ", str));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m8546(String str) {
        return (String) f10681.get(str);
    }
}
