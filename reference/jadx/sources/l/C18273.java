package l;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.jar.Attributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܿۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L1W7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18273 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ByteArrayOutputStream f59614 = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f59615 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ByteArrayOutputStream f59617 = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f59616 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ByteArrayOutputStream f59618 = new ByteArrayOutputStream();

    /* JADX WARN: Code duplicated, block: B:58:0x0204  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42432(ConcurrentMapC17249 concurrentMapC17249, AbstractC14806 abstractC14806, EnumC8906 enumC8906, C7415 c7415, String str, boolean z, boolean z2, long j, C15289 c15289) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException {
        String str2;
        String upperCase;
        long size = concurrentMapC17249.size() + 2;
        long j2 = j / size;
        long j3 = j - (size * j2);
        c15289.m36691(j2);
        TreeMap treeMap = new TreeMap();
        Attributes attributes = new Attributes();
        attributes.putValue("Manifest-Version", "1.0");
        attributes.putValue("Built-By", "Signflinger");
        attributes.putValue("Created-By", "Android Gradle 8.0.2");
        Attributes.Name name = Attributes.Name.MANIFEST_VERSION;
        String value = attributes.getValue(name);
        if (value == null) {
            throw new IllegalArgumentException("Mandatory " + name + " attribute missing");
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f59614;
        AbstractC10814.m27549(byteArrayOutputStream, name, value);
        if (attributes.size() > 1) {
            TreeMap treeMapM27546 = AbstractC10814.m27546(attributes);
            treeMapM27546.remove(name.toString());
            AbstractC10814.m27551(byteArrayOutputStream, treeMapM27546);
        }
        AbstractC10814.m27547(byteArrayOutputStream);
        ArrayList arrayList = new ArrayList(concurrentMapC17249.keySet());
        Collections.sort(arrayList);
        String strM2169 = C0374.m2169(enumC8906);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            Iterator it2 = it;
            byte[] bArr = (byte[]) concurrentMapC17249.get(str3);
            Attributes attributes2 = new Attributes();
            long j4 = j3;
            attributes2.putValue(strM2169, Base64.encodeToString(bArr, 2));
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            AbstractC10814.m27548(byteArrayOutputStream2, str3, attributes2);
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            byteArrayOutputStream.write(byteArray);
            treeMap.put(str3, byteArray);
            it = it2;
            j3 = j4;
        }
        long j5 = j3;
        Attributes attributes3 = new Attributes();
        attributes3.putValue("Signature-Version", "1.0");
        attributes3.putValue("Created-By", "Android Gradle 8.0.2");
        if (z || z2) {
            if (z && z2) {
                attributes3.putValue("X-Android-APK-Signed", "2,3");
            } else if (z) {
                attributes3.putValue("X-Android-APK-Signed", "2");
            } else {
                attributes3.putValue("X-Android-APK-Signed", "3");
            }
        }
        MessageDigest messageDigest = MessageDigest.getInstance(enumC8906.m23816());
        int i = C21257.f67819[enumC8906.ordinal()];
        if (i == 1) {
            str2 = "SHA1-Digest-Manifest";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unexpected content digest algorithm: " + enumC8906);
            }
            str2 = "SHA-256-Digest-Manifest";
        }
        attributes3.putValue(str2, Base64.encodeToString(messageDigest.digest(byteArrayOutputStream.toByteArray()), 2));
        Attributes.Name name2 = Attributes.Name.SIGNATURE_VERSION;
        String value2 = attributes3.getValue(name2);
        if (value2 == null) {
            throw new IllegalArgumentException("Mandatory " + name2 + " attribute missing");
        }
        ByteArrayOutputStream byteArrayOutputStream3 = this.f59617;
        AbstractC10814.m27549(byteArrayOutputStream3, name2, value2);
        if (attributes3.size() > 1) {
            TreeMap treeMapM27547 = AbstractC10814.m27546(attributes3);
            treeMapM27547.remove(name2.toString());
            AbstractC10814.m27551(byteArrayOutputStream3, treeMapM27547);
        }
        AbstractC10814.m27547(byteArrayOutputStream3);
        String strM21610 = C0374.m2169(enumC8906);
        for (Map.Entry entry : treeMap.entrySet()) {
            c15289.m36691(j2);
            String str4 = (String) entry.getKey();
            byte[] bArrDigest = messageDigest.digest((byte[]) entry.getValue());
            Attributes attributes4 = new Attributes();
            attributes4.putValue(strM21610, Base64.encodeToString(bArrDigest, 2));
            AbstractC10814.m27548(byteArrayOutputStream3, str4, attributes4);
        }
        if (byteArrayOutputStream3.size() > 0 && byteArrayOutputStream3.size() % 1024 == 0) {
            AbstractC10814.m27547(byteArrayOutputStream3);
        }
        c15289.m36691(j2 + j5);
        X509Certificate x509CertificateM35652 = abstractC14806.m35652();
        InterfaceC0550 interfaceC0550M2804 = C0637.m2804(x509CertificateM35652.getPublicKey(), enumC8906, false);
        Signature signature = Signature.getInstance((String) interfaceC0550M2804.first());
        signature.initSign(abstractC14806.m35653());
        signature.update(byteArrayOutputStream3.toByteArray());
        byte[] bArrSign = signature.sign();
        String str5 = c7415.f24426;
        if (str5 != null && str5.equals("catch_.me_.if_.you_.can_")) {
            upperCase = "CERT";
        } else if (TextUtils.isEmpty(str)) {
            Matcher matcher = Pattern.compile("CN=([^,\\s]+)").matcher(x509CertificateM35652.getIssuerX500Principal().toString());
            String strGroup = matcher.find() ? matcher.group(1) : null;
            if (strGroup == null || !strGroup.matches("[a-zA-Z0-9_\\-]+")) {
                upperCase = "CERT";
            } else {
                upperCase = strGroup.toUpperCase();
            }
        } else {
            upperCase = str;
        }
        this.f59615 = C14442.m34865("META-INF/", upperCase, ".SF");
        StringBuilder sbM51387 = C22783.m51387("META-INF/", upperCase, ".");
        sbM51387.append(x509CertificateM35652.getPublicKey().getAlgorithm().toUpperCase(Locale.US));
        this.f59616 = sbM51387.toString();
        C10945 c10945 = new C10945();
        c10945.f34609 = 1;
        c10945.f34612 = new C22134(new C1383(new C19370(x509CertificateM35652.getIssuerX500Principal().getEncoded()), x509CertificateM35652.getSerialNumber()));
        C0637 c0637M2805 = C0637.m2805(enumC8906);
        C0637 c0637 = (C0637) interfaceC0550M2804.mo2558();
        c10945.f34607 = c0637M2805;
        c10945.f34613 = c0637;
        c10945.f34608 = ByteBuffer.wrap(bArrSign);
        C4980 c4980 = new C4980();
        ArrayList arrayList2 = new ArrayList(1);
        c4980.f17319 = arrayList2;
        arrayList2.add(new C19370(x509CertificateM35652.getEncoded()));
        c4980.f17321 = 1;
        c4980.f17320 = Collections.singletonList(c0637M2805);
        c4980.f17324 = new C10331("1.2.840.113549.1.7.1");
        c4980.f17322 = Collections.singletonList(c10945);
        C19282 c19282 = new C19282();
        c19282.f62339 = "1.2.840.113549.1.7.2";
        c19282.f62338 = new C19370(C18624.m43327(c4980));
        this.f59618.write(C18624.m43327(c19282));
    }
}
