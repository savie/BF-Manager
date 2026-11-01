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

/* JADX INFO: renamed from: l.ܶۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB28 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14932 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10946 m35679(C18459 c18459, boolean z, byte[] bArr) throws EOFException {
        if (!c18459.m42818()) {
            return null;
        }
        c18459.m42810(c18459.m42814());
        long jM42819 = c18459.m42819() - 24;
        int i = z ? 462663009 : -262969152;
        while (jM42819 > 0 && jM42819 >= 12) {
            long jM428110 = c18459.m42819();
            if (jM428110 < 4 || jM428110 > jM42819 - 8) {
                return null;
            }
            long jM42808 = c18459.m42808() + jM428110;
            if (c18459.m42813() == i) {
                try {
                    return m35678(c18459, jM42808, bArr);
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
    public static C10946 m35678(C18459 c18459, long j, byte[] bArr) throws C4222, EOFException {
        long jM10740 = C3641.m10740(c18459, C3641.m10740(c18459, j));
        long jM10741 = C3641.m10740(c18459, jM10740);
        c18459.m42810(C3641.m10740(c18459, jM10741));
        byte[] bArrM10745 = C3641.m10745(c18459, C3641.m10740(c18459, jM10741), bArr);
        if (bArrM10745 == null) {
            return null;
        }
        if (jM10741 - c18459.m42808() < 12) {
            throw new C4222("V3 signed data is missing SDK range or attributes");
        }
        int iM42813 = c18459.m42813();
        int iM42814 = c18459.m42813();
        long jM10742 = C3641.m10740(c18459, jM10741);
        long jM42808 = c18459.m42808();
        long j2 = 0;
        while (true) {
            byte[] bArr2 = bArrM10745;
            int i = iM42814;
            if (c18459.m42808() >= jM10742) {
                c18459.m42810(jM42808);
                C15907 c15907M37814 = null;
                while (c18459.m42808() < jM10742) {
                    long jM10743 = C3641.m10740(c18459, jM10742);
                    if (jM10743 - c18459.m42808() < 4) {
                        throw new C4222("V3 signing attribute is missing its ID");
                    }
                    if (c18459.m42813() != 1000370060) {
                        c18459.m42810(jM10743);
                    } else {
                        try {
                            C15907 c15907M37815 = C15907.m37815(c18459.m42811((int) (jM10743 - c18459.m42808())));
                            c15907M37814 = c15907M37814 == null ? c15907M37815 : C15907.m37814(Arrays.asList(c15907M37814, c15907M37815));
                        } catch (Exception e) {
                            throw new C4222("Failed to parse V3 signing certificate lineage", e);
                        }
                    }
                }
                c18459.m42810(jM10741);
                if (jM10740 - c18459.m42808() < 16) {
                    throw new C4222("V3 signer is missing SDK range, signatures, or public key");
                }
                int iM42815 = c18459.m42813();
                int iM42816 = c18459.m42813();
                if (iM42813 != iM42815 || i != iM42816) {
                    throw new C4222("V3 signer SDK range does not match signed data");
                }
                c18459.m42810(C3641.m10740(c18459, jM10740));
                c18459.m42810(C3641.m10740(c18459, jM10740));
                return new C10946(bArr2, c15907M37814);
            }
            long jM10744 = C3641.m10740(c18459, jM10742);
            if (jM10744 - c18459.m42808() < 4) {
                throw new C4222("V3 signing attribute is missing its ID");
            }
            if (c18459.m42813() == 1000370060) {
                long jM42809 = (jM10744 - c18459.m42808()) + j2;
                if (jM42809 > 4194304) {
                    throw new C4222("V3 proof-of-rotation data exceeds safety limit");
                }
                j2 = jM42809;
            }
            c18459.m42810(jM10744);
            bArrM10745 = bArr2;
            iM42814 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35680(C18459 c18459, boolean z, InterfaceC5614 interfaceC5614) throws EOFException {
        if (!c18459.m42818()) {
            return false;
        }
        c18459.m42810(c18459.m42814());
        long jM42819 = c18459.m42819() - 24;
        int i = z ? 462663009 : -262969152;
        while (jM42819 > 0 && jM42819 >= 12) {
            long jM428110 = c18459.m42819();
            if (jM428110 < 4 || jM428110 > jM42819 - 8) {
                return false;
            }
            long jM42808 = c18459.m42808() + jM428110;
            if (c18459.m42813() == i) {
                try {
                    int iM10740 = (int) (C3641.m10740(c18459, jM42808) - c18459.m42808());
                    if (iM10740 <= 16777216) {
                        return m35681(c18459.m42811(iM10740), c18459.m42812(), c18459, interfaceC5614);
                    }
                    throw new C4222("Signer sequence exceeds safety limit");
                } catch (RuntimeException | C4222 | Exception unused) {
                    return false;
                }
            }
            jM42819 -= jM428110 + 8;
            c18459.m42810(jM42808);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35681(byte[] bArr, InterfaceC7739 interfaceC7739, C18459 c18459, InterfaceC5614 interfaceC5614) throws C4222, IOException, CertificateException {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferOrder.position() < byteBufferOrder.limit()) {
            ByteBuffer byteBufferM18897 = C7045.m18897(byteBufferOrder);
            byte[] bArrM18898 = C7045.m18898(byteBufferM18897);
            int i = byteBufferM18897.getInt();
            int i2 = byteBufferM18897.getInt();
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
            int i3 = byteBufferOrder2.getInt();
            int i4 = byteBufferOrder2.getInt();
            C7045.m18897(byteBufferOrder2);
            if (i3 == i && i4 == i2) {
                ArrayList<C22693> arrayList2 = new ArrayList();
                while (byteBufferM18898.hasRemaining()) {
                    ByteBuffer byteBufferM188912 = C7045.m18897(byteBufferM18898);
                    int i5 = byteBufferM188912.getInt();
                    byte[] bArrM188910 = C7045.m18898(byteBufferM188912);
                    if (AbstractC20845.f67728.containsKey(Integer.valueOf(i5))) {
                        arrayList2.add(new C22693(i5, bArrM188910));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    for (C22693 c22693 : arrayList2) {
                        AbstractC20845 abstractC20845M46869 = AbstractC20845.m46869(c22693.f73922);
                        try {
                            if (abstractC20845M46869.m46871(KeyFactory.getInstance(abstractC20845M46869.mo19927()).generatePublic(new X509EncodedKeySpec(bArrM18899)), bArrM18898, c22693.f73923) && Arrays.equals(bArrM18899, ((X509Certificate) arrayList.get(0)).getPublicKey().getEncoded())) {
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
                    for (C22693 c22694 : arrayList2) {
                        AbstractC20845 abstractC20845M468610 = AbstractC20845.m46869(c22694.f73922);
                        if (z) {
                            InterfaceC19248[] interfaceC19248Arr = {c10076M22462, c10076M22463, c22776M41422};
                            for (int i6 = 0; i6 < 3; i6++) {
                                interfaceC19248Arr[i6].reset();
                            }
                        }
                        abstractC20845M468610.mo19924(c10076M22462, c10076M22463, c22776M41422, interfaceC5614);
                        if (!interfaceC5614.mo2357() && Arrays.equals(abstractC20845M468610.f67729, (byte[]) map.get(Integer.valueOf(c22694.f73922)))) {
                            z = true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
