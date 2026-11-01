package l;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܺۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K77P */
/* JADX INFO: loaded from: classes4.dex */
public final class C15731 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7263 m37452(AbstractC20745 abstractC20745) {
        try {
            C16674 c16674 = new C16674(abstractC20745, false);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m37454(arrayList2, arrayList, "V1", c16674.m39137());
            m37454(arrayList2, arrayList, "V2", c16674.m39141());
            m37454(arrayList2, arrayList, "V3", c16674.m39136());
            m37454(arrayList2, arrayList, "V3.1", c16674.m39146());
            if (arrayList.isEmpty()) {
                return new C7263(true, false, arrayList, false, new ArrayList(), null);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(m37453((C20669) it.next()));
            }
            return new C7263(true, true, arrayList, arrayList3.size() > 1, arrayList3, null);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = e.getClass().getSimpleName();
            }
            return new C7263(false, false, new ArrayList(), false, new ArrayList(), message);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37454(ArrayList arrayList, ArrayList arrayList2, String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        arrayList2.add(str);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C20669 c20669 = (C20669) it.next();
            if (Arrays.equals(c20669.f67256, bArr)) {
                c20669.f67257.add(str);
                return;
            }
        }
        arrayList.add(new C20669(bArr, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10086 m37453(C20669 c20669) {
        byte[] bArr = c20669.f67256;
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        ArrayList arrayList = c20669.f67257;
        int length = bArr.length;
        int iHashCode = Arrays.hashCode(bArr);
        String strM49415 = C22253.m49415(bArr);
        String strM49424 = C22253.m49424(C22253.m49425().digest(bArr));
        String strM49425 = C22253.m49424(C22253.m49421().digest(bArr));
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        Locale locale = Locale.ROOT;
        return new C10086(arrayList, length, iHashCode, strM49415, strM49424, strM49425, String.format(locale, "%08x", Long.valueOf(crc32.getValue())), x509Certificate.getSigAlgName(), x509Certificate.getSigAlgOID(), x509Certificate.getSubjectX500Principal().getName("RFC2253"), x509Certificate.getIssuerX500Principal().getName("RFC2253"), x509Certificate.getSerialNumber().toString(16).toLowerCase(locale), x509Certificate.getNotBefore().getTime(), x509Certificate.getNotAfter().getTime());
    }
}
