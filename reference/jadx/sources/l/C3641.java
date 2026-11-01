package l;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31A6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3641 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m10744(C18459 c18459, byte[] bArr) throws EOFException {
        if (!c18459.m42818()) {
            return null;
        }
        c18459.m42810(c18459.m42814());
        long jM42819 = c18459.m42819() - 24;
        while (jM42819 > 0 && jM42819 >= 12) {
            long jM428110 = c18459.m42819();
            if (jM428110 < 4 || jM428110 > jM42819 - 8) {
                return null;
            }
            long jM42808 = c18459.m42808() + jM428110;
            if (c18459.m42813() == 1896449818) {
                try {
                    return m10743(c18459, jM42808, bArr);
                } catch (RuntimeException | C4222 unused) {
                    return null;
                }
            }
            jM42819 -= jM428110 + 8;
            c18459.m42810(jM42808);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m10743(C18459 c18459, long j, byte[] bArr) throws C4222, EOFException {
        long jM10740 = m10740(c18459, m10740(c18459, j));
        long jM10741 = m10740(c18459, jM10740);
        c18459.m42810(m10740(c18459, jM10741));
        byte[] bArrM10745 = m10745(c18459, m10740(c18459, jM10741), bArr);
        if (bArrM10745 == null) {
            return null;
        }
        m10740(c18459, jM10741);
        c18459.m42810(jM10741);
        if (jM10740 - c18459.m42808() < 8) {
            throw new C4222("V2 signer is missing signatures or public key");
        }
        c18459.m42810(m10740(c18459, jM10740));
        c18459.m42810(m10740(c18459, jM10740));
        return bArrM10745;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m10740(C18459 c18459, long j) throws C4222, EOFException {
        if (j - c18459.m42808() < 4) {
            throw new C4222("Length-prefixed field is missing its length");
        }
        int iM42813 = c18459.m42813();
        long jM42808 = j - c18459.m42808();
        if (iM42813 >= 0) {
            long j2 = iM42813;
            if (j2 <= jM42808) {
                return c18459.m42808() + j2;
            }
        }
        throw new C4222("Length-prefixed field exceeds its container");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m10745(C18459 c18459, long j, byte[] bArr) {
        try {
            if (j - c18459.m42808() > 4194304) {
                throw new C4222("Signing certificate sequence exceeds safety limit");
            }
            byte[] bArr2 = null;
            byte[] bArr3 = null;
            while (c18459.m42808() < j) {
                long jM10740 = m10740(c18459, j);
                int iM42808 = (int) (jM10740 - c18459.m42808());
                if (iM42808 == 0) {
                    throw new C4222("Signing certificate is empty");
                }
                if (iM42808 > 1048576) {
                    throw new C4222("Signing certificate exceeds safety limit");
                }
                if (bArr3 == null || (bArr != null && bArr.length == iM42808)) {
                    byte[] bArrM42811 = c18459.m42811(iM42808);
                    if (bArr3 == null) {
                        bArr3 = bArrM42811;
                    }
                    if (bArr != null && Arrays.equals(bArr, bArrM42811)) {
                        bArr2 = bArrM42811;
                    }
                } else {
                    c18459.m42810(jM10740);
                }
            }
            if (bArr2 == null) {
                bArr2 = bArr3;
            }
            c18459.m42810(j);
            return bArr2;
        } catch (Throwable th) {
            c18459.m42810(j);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10741(C18459 c18459, InterfaceC5614 interfaceC5614) throws EOFException {
        if (!c18459.m42818()) {
            return false;
        }
        c18459.m42810(c18459.m42814());
        long jM42819 = c18459.m42819() - 24;
        while (jM42819 > 0 && jM42819 >= 12) {
            long jM428110 = c18459.m42819();
            if (jM428110 < 4 || jM428110 > jM42819 - 8) {
                return false;
            }
            long jM42808 = c18459.m42808() + jM428110;
            if (c18459.m42813() != 1896449818) {
                jM42819 -= jM428110 + 8;
                c18459.m42810(jM42808);
            } else {
                try {
                    int iM10740 = (int) (m10740(c18459, jM42808) - c18459.m42808());
                    if (iM10740 <= 16777216) {
                        return m10742(c18459.m42811(iM10740), c18459.m42812(), c18459, interfaceC5614);
                    }
                    throw new C4222("Signer sequence exceeds safety limit");
                } catch (RuntimeException | C4222 | Exception unused) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10742(byte[] bArr, InterfaceC7739 interfaceC7739, C18459 c18459, InterfaceC5614 interfaceC5614) throws C4222, IOException, CertificateException {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferOrder.position() < byteBufferOrder.limit()) {
            ByteBuffer byteBufferM18897 = C7045.m18897(byteBufferOrder);
            byte[] bArrM18898 = C7045.m18898(byteBufferM18897);
            ByteBuffer byteBufferM18898 = C7045.m18897(byteBufferM18897);
            byte[] bArrM18899 = C7045.m18898(byteBufferM18897);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArrM18898).order(ByteOrder.LITTLE_ENDIAN);
            ByteBuffer byteBufferM18899 = C7045.m18897(byteBufferOrder2);
            while (byteBufferM18899.hasRemaining()) {
                ByteBuffer byteBufferM188910 = C7045.m18897(byteBufferM18899);
                if (map.put(Integer.valueOf(byteBufferM188910.getInt()), C7045.m18898(byteBufferM188910)) != null) {
                    return false;
                }
            }
            ByteBuffer byteBufferM188911 = C7045.m18897(byteBufferOrder2);
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            while (byteBufferM188911.hasRemaining()) {
                arrayList.add((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(C7045.m18898(byteBufferM188911))));
            }
            C7045.m18897(byteBufferOrder2);
            ArrayList<C12815> arrayList2 = new ArrayList();
            while (byteBufferM18898.hasRemaining()) {
                ByteBuffer byteBufferM188912 = C7045.m18897(byteBufferM18898);
                int i = byteBufferM188912.getInt();
                byte[] bArrM188910 = C7045.m18898(byteBufferM188912);
                if (AbstractC20845.f67728.containsKey(Integer.valueOf(i))) {
                    arrayList2.add(new C12815(i, bArrM188910));
                }
            }
            if (!arrayList2.isEmpty()) {
                for (C12815 c12815 : arrayList2) {
                    AbstractC20845 abstractC20845M46869 = AbstractC20845.m46869(c12815.f42668);
                    try {
                        if (abstractC20845M46869.m46871(KeyFactory.getInstance(abstractC20845M46869.mo19927()).generatePublic(new X509EncodedKeySpec(bArrM18899)), bArrM18898, c12815.f42669) && Arrays.equals(bArrM18899, ((X509Certificate) arrayList.get(0)).getPublicKey().getEncoded())) {
                        }
                    } catch (NoSuchAlgorithmException unused) {
                    }
                }
                C10076 c10076M22462 = C8665.m22462(interfaceC7739, 0L, c18459.m42814());
                C10076 c10076M22463 = C8665.m22462(interfaceC7739, c18459.m42809(), c18459.m42816());
                long jM42807 = c18459.m42807();
                C22776 c22776M41422 = C17836.m41422(C8665.m22462(interfaceC7739, jM42807, c18459.m42815() - jM42807));
                int iM42809 = (int) (c18459.m42809() - c18459.m42814());
                byte[] bArrM50429 = c22776M41422.m50429();
                int iM50430 = c22776M41422.m50430() + 16;
                C1856.m6059(C1856.m6055(iM50430, bArrM50429) - ((long) iM42809), iM50430, bArrM50429);
                boolean z = false;
                for (C12815 c12816 : arrayList2) {
                    AbstractC20845 abstractC20845M468610 = AbstractC20845.m46869(c12816.f42668);
                    if (z) {
                        InterfaceC19248[] interfaceC19248Arr = {c10076M22462, c10076M22463, c22776M41422};
                        for (int i2 = 0; i2 < 3; i2++) {
                            interfaceC19248Arr[i2].reset();
                        }
                    }
                    abstractC20845M468610.mo19924(c10076M22462, c10076M22463, c22776M41422, interfaceC5614);
                    if (!interfaceC5614.mo2357() && Arrays.equals(abstractC20845M468610.f67729, (byte[]) map.get(Integer.valueOf(c12816.f42668)))) {
                        z = true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
