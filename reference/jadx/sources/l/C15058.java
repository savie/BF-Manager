package l;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܳۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K77P */
/* JADX INFO: loaded from: classes4.dex */
public final class C15058 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22518 m36252(AbstractC22044 abstractC22044) {
        try {
            C18602 c18602 = new C18602(abstractC22044, false);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m36253(arrayList2, arrayList, "V1", c18602.m43227());
            m36253(arrayList2, arrayList, "V2", c18602.m43225());
            m36253(arrayList2, arrayList, "V3", c18602.m43223());
            m36253(arrayList2, arrayList, "V3.1", c18602.m43224());
            if (arrayList.isEmpty()) {
                return new C22518(true, false, arrayList, false, new ArrayList(), null);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(m36251((C19534) it.next()));
            }
            return new C22518(true, true, arrayList, arrayList3.size() > 1, arrayList3, null);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = e.getClass().getSimpleName();
            }
            return new C22518(false, false, new ArrayList(), false, new ArrayList(), message);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36253(ArrayList arrayList, ArrayList arrayList2, String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        arrayList2.add(str);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19534 c19534 = (C19534) it.next();
            if (Arrays.equals(c19534.f63008, bArr)) {
                c19534.f63009.add(str);
                return;
            }
        }
        arrayList.add(new C19534(bArr, str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10583 m36251(C19534 c19534) {
        byte[] bArr = c19534.f63008;
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        ArrayList arrayList = c19534.f63009;
        int length = bArr.length;
        int iHashCode = Arrays.hashCode(bArr);
        String strM36173 = C15022.m36173(bArr);
        String strM36182 = C15022.m36182(C15022.m36183().digest(bArr));
        String strM36183 = C15022.m36182(C15022.m36179().digest(bArr));
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        Locale locale = Locale.ROOT;
        return new C10583(arrayList, length, iHashCode, strM36173, strM36182, strM36183, String.format(locale, "%08x", Long.valueOf(crc32.getValue())), x509Certificate.getSigAlgName(), x509Certificate.getSigAlgOID(), x509Certificate.getSubjectX500Principal().getName("RFC2253"), x509Certificate.getIssuerX500Principal().getName("RFC2253"), x509Certificate.getSerialNumber().toString(16).toLowerCase(locale), x509Certificate.getNotBefore().getTime(), x509Certificate.getNotAfter().getTime());
    }
}
