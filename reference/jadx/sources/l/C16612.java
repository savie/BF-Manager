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

/* JADX INFO: renamed from: l.ܽۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1W7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16612 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ByteArrayOutputStream f53317 = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f53319 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ByteArrayOutputStream f53320 = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f53318 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ByteArrayOutputStream f53316 = new ByteArrayOutputStream();

    /* JADX WARN: Code duplicated, block: B:58:0x0204  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39074(ConcurrentMapC13783 concurrentMapC13783, AbstractC17131 abstractC17131, EnumC9619 enumC9619, C3267 c3267, String str, boolean z, boolean z2, long j, C1088 c1088) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException {
        String str2;
        String upperCase;
        long size = concurrentMapC13783.size() + 2;
        long j2 = j / size;
        long j3 = j - (size * j2);
        c1088.m4090(j2);
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
        ByteArrayOutputStream byteArrayOutputStream = this.f53317;
        AbstractC2499.m7632(byteArrayOutputStream, name, value);
        if (attributes.size() > 1) {
            TreeMap treeMapM7629 = AbstractC2499.m7629(attributes);
            treeMapM7629.remove(name.toString());
            AbstractC2499.m7634(byteArrayOutputStream, treeMapM7629);
        }
        AbstractC2499.m7630(byteArrayOutputStream);
        ArrayList arrayList = new ArrayList(concurrentMapC13783.keySet());
        Collections.sort(arrayList);
        String strM30793 = C12379.m30793(enumC9619);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            Iterator it2 = it;
            byte[] bArr = (byte[]) concurrentMapC13783.get(str3);
            Attributes attributes2 = new Attributes();
            long j4 = j3;
            attributes2.putValue(strM30793, Base64.encodeToString(bArr, 2));
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            AbstractC2499.m7631(byteArrayOutputStream2, str3, attributes2);
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
        MessageDigest messageDigest = MessageDigest.getInstance(enumC9619.m24529());
        int i = C0383.f1862[enumC9619.ordinal()];
        if (i == 1) {
            str2 = "SHA1-Digest-Manifest";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unexpected content digest algorithm: " + enumC9619);
            }
            str2 = "SHA-256-Digest-Manifest";
        }
        attributes3.putValue(str2, Base64.encodeToString(messageDigest.digest(byteArrayOutputStream.toByteArray()), 2));
        Attributes.Name name2 = Attributes.Name.SIGNATURE_VERSION;
        String value2 = attributes3.getValue(name2);
        if (value2 == null) {
            throw new IllegalArgumentException("Mandatory " + name2 + " attribute missing");
        }
        ByteArrayOutputStream byteArrayOutputStream3 = this.f53320;
        AbstractC2499.m7632(byteArrayOutputStream3, name2, value2);
        if (attributes3.size() > 1) {
            TreeMap treeMapM76210 = AbstractC2499.m7629(attributes3);
            treeMapM76210.remove(name2.toString());
            AbstractC2499.m7634(byteArrayOutputStream3, treeMapM76210);
        }
        AbstractC2499.m7630(byteArrayOutputStream3);
        String strM30794 = C12379.m30793(enumC9619);
        for (Map.Entry entry : treeMap.entrySet()) {
            c1088.m4090(j2);
            String str4 = (String) entry.getKey();
            byte[] bArrDigest = messageDigest.digest((byte[]) entry.getValue());
            Attributes attributes4 = new Attributes();
            attributes4.putValue(strM30794, Base64.encodeToString(bArrDigest, 2));
            AbstractC2499.m7631(byteArrayOutputStream3, str4, attributes4);
        }
        if (byteArrayOutputStream3.size() > 0 && byteArrayOutputStream3.size() % 1024 == 0) {
            AbstractC2499.m7630(byteArrayOutputStream3);
        }
        c1088.m4090(j2 + j5);
        X509Certificate x509CertificateM40009 = abstractC17131.m40009();
        InterfaceC14924 interfaceC14924M51740 = C23482.m51740(x509CertificateM40009.getPublicKey(), enumC9619, false);
        Signature signature = Signature.getInstance((String) interfaceC14924M51740.first());
        signature.initSign(abstractC17131.m40013());
        signature.update(byteArrayOutputStream3.toByteArray());
        byte[] bArrSign = signature.sign();
        String str5 = c3267.f12127;
        if (str5 != null && str5.equals("catch_.me_.if_.you_.can_")) {
            upperCase = "CERT";
        } else if (TextUtils.isEmpty(str)) {
            Matcher matcher = Pattern.compile("CN=([^,\\s]+)").matcher(x509CertificateM40009.getIssuerX500Principal().toString());
            String strGroup = matcher.find() ? matcher.group(1) : null;
            if (strGroup == null || !strGroup.matches("[a-zA-Z0-9_\\-]+")) {
                upperCase = "CERT";
            } else {
                upperCase = strGroup.toUpperCase();
            }
        } else {
            upperCase = str;
        }
        this.f53319 = C16523.m38890("META-INF/", upperCase, ".SF");
        StringBuilder sbM30914 = C12441.m30914("META-INF/", upperCase, ".");
        sbM30914.append(x509CertificateM40009.getPublicKey().getAlgorithm().toUpperCase(Locale.US));
        this.f53318 = sbM30914.toString();
        C13396 c13396 = new C13396();
        c13396.f44350 = 1;
        c13396.f44355 = new C1400(new C3019(new C1525(x509CertificateM40009.getIssuerX500Principal().getEncoded()), x509CertificateM40009.getSerialNumber()));
        C23482 c23482M51741 = C23482.m51741(enumC9619);
        C23482 c23482 = (C23482) interfaceC14924M51740.mo7335();
        c13396.f44352 = c23482M51741;
        c13396.f44351 = c23482;
        c13396.f44354 = ByteBuffer.wrap(bArrSign);
        C22568 c22568 = new C22568();
        ArrayList arrayList2 = new ArrayList(1);
        c22568.f73546 = arrayList2;
        arrayList2.add(new C1525(x509CertificateM40009.getEncoded()));
        c22568.f73550 = 1;
        c22568.f73548 = Collections.singletonList(c23482M51741);
        c22568.f73545 = new C9371("1.2.840.113549.1.7.1");
        c22568.f73547 = Collections.singletonList(c13396);
        C1608 c1608 = new C1608();
        c1608.f6493 = "1.2.840.113549.1.7.2";
        c1608.f6492 = new C1525(C10699.m26919(c22568));
        this.f53316.write(C10699.m26919(c1608));
    }
}
