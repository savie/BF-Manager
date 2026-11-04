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
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۜᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FD */
/* JADX INFO: loaded from: classes3.dex */
public final class C7349 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final HashMap f24189;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final HashMap f24190;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4980 f24191;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f24192;

    public C7349(byte[] bArr) {
        C4980 c4980 = (C4980) C3708.m12052(((C19282) C3708.m12052(ByteBuffer.wrap(bArr), C19282.class)).f62338.m44796(), C4980.class);
        this.f24191 = c4980;
        this.f24192 = m20167(c4980.f17319);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final X509Certificate[] m20170() {
        List list = this.f24192;
        if (list.isEmpty()) {
            return null;
        }
        return (X509Certificate[]) list.toArray(new X509Certificate[0]);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x001e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20169(byte[] bArr) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CertificateException {
        char c;
        X509Certificate x509Certificate;
        String str;
        C4980 c4980 = this.f24191;
        if (c4980.f17322.isEmpty()) {
            return false;
        }
        List listM20167 = m20167(c4980.f17319);
        int i = 0;
        for (C10945 c10945 : c4980.f17322) {
            String str2 = c10945.f34607.f2493;
            String str3 = c10945.f34613.f2493;
            C22134 c22134 = c10945.f34612;
            Iterator it = listM20167.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c = 0;
                    x509Certificate = null;
                    break;
                }
                x509Certificate = (X509Certificate) it.next();
                C1383 c1383 = c22134.f71308;
                if (c1383 != null) {
                    ByteBuffer byteBufferM44796 = c1383.f4937.m44796();
                    byte[] bArr2 = new byte[byteBufferM44796.remaining()];
                    byteBufferM44796.get(bArr2);
                    X500Principal x500Principal = new X500Principal(bArr2);
                    if (c1383.f4936.equals(x509Certificate.getSerialNumber()) && x500Principal.equals(x509Certificate.getIssuerX500Principal())) {
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
            String strM46451 = (String) f24190.get(str3);
            if (strM46451 == null) {
                if ("1.2.840.113549.1.1.1".equals(str3)) {
                    str = d.a;
                } else if (C0637.f2489.equals(str3)) {
                    str = "DSA";
                } else {
                    if (!C0637.f2486.equals(str3)) {
                        throw new SignatureException(ExternalValue$$ExternalSyntheticOutline0.m("Unsupported JCA Signature algorithm . Digest algorithm: ", str2, ", signature algorithm: ", str3));
                    }
                    str = "ECDSA";
                }
                String strM20166 = m20166(str2);
                if (strM20166.startsWith("SHA-")) {
                    strM20166 = ExternalValue$$ExternalSyntheticOutline0.m(4, strM20166, new StringBuilder("SHA"));
                }
                strM46451 = C20196.m46451(strM20166, "with", str);
            }
            Signature signature = Signature.getInstance(strM46451);
            signature.initVerify(x509Certificate.getPublicKey());
            C19370 c19370 = c10945.f34611;
            if (c19370 != null) {
                try {
                    C8840 c8840 = new C8840(C3708.m12059(c19370.m44796()));
                    String strM23704 = c8840.m23704();
                    if (strM23704 == null) {
                        throw new SignatureException("No Content Type in signed attributes");
                    }
                    if (strM23704.equals(c4980.f17324.f32934)) {
                        byte[] bArrM23705 = c8840.m23705();
                        if (bArrM23705 == null) {
                            throw new SignatureException("No content digest in signed attributes");
                        }
                        if (Arrays.equals(bArrM23705, MessageDigest.getInstance(m20166(str2)).digest(bArr))) {
                            ByteBuffer byteBufferM44797 = c10945.f34611.m44796();
                            signature.update((byte) 49);
                            byteBufferM44797.position(1);
                            signature.update(byteBufferM44797);
                        }
                        if (x509Certificate != null) {
                            i++;
                        }
                    }
                    x509Certificate = null;
                    if (x509Certificate != null) {
                        i++;
                    }
                } catch (C12657 e) {
                    throw new SignatureException("Failed to parse signed attributes", e);
                }
            } else {
                signature.update(bArr);
            }
            ByteBuffer byteBufferSlice = c10945.f34608.slice();
            byte[] bArr3 = new byte[byteBufferSlice.remaining()];
            byteBufferSlice.get(bArr3);
            if (!signature.verify(bArr3)) {
                x509Certificate = null;
            }
            if (x509Certificate != null) {
                i++;
            }
        }
        return i == c4980.f17322.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m20167(List list) throws CertificateException {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ByteBuffer byteBufferM44796 = ((C19370) list.get(i)).m44796();
            byte[] bArr = new byte[byteBufferM44796.remaining()];
            byteBufferM44796.get(bArr);
            try {
                arrayList.add(new C13183(C5726.m16793(bArr), bArr));
            } catch (CertificateException e) {
                throw new CertificateException("Failed to parse certificate #" + (i + 1), e);
            }
        }
        return arrayList;
    }

    static {
        HashMap map = new HashMap();
        f24189 = map;
        map.put("1.2.840.113549.2.5", "MD5");
        map.put(C0637.f2492, "SHA-1");
        map.put("2.16.840.1.101.3.4.2.4", "SHA-224");
        map.put(C0637.f2491, XMSSKeyParameters.SHA_256);
        map.put("2.16.840.1.101.3.4.2.2", "SHA-384");
        map.put("2.16.840.1.101.3.4.2.3", XMSSKeyParameters.SHA_512);
        HashMap map2 = new HashMap();
        f24190 = map2;
        map2.put("1.2.840.113549.1.1.4", "MD5withRSA");
        map2.put("1.2.840.113549.1.1.5", "SHA1withRSA");
        map2.put("1.2.840.113549.1.1.14", "SHA224withRSA");
        map2.put("1.2.840.113549.1.1.11", "SHA256withRSA");
        map2.put("1.2.840.113549.1.1.12", "SHA384withRSA");
        map2.put("1.2.840.113549.1.1.13", "SHA512withRSA");
        map2.put("1.2.840.10040.4.3", "SHA1withDSA");
        map2.put("2.16.840.1.101.3.4.3.1", "SHA224withDSA");
        map2.put(C0637.f2488, "SHA256withDSA");
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
    public static String m20166(String str) throws SignatureException {
        String str2 = (String) f24189.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new SignatureException(C25272.m56409("Unsupported digest algorithm: ", str));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m20168(String str) {
        return (String) f24190.get(str);
    }
}
