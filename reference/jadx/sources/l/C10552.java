package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.y.l;
import com.amazonaws.auth.AWS4Signer;
import com.google.android.material.datepicker.UtcDates;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilderFactory;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: l.ۤ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7U0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10552 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f36132;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f36133;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f36134;

    public C10552(String str, String str2, String str3) {
        this.f36134 = str.concat(".r2.cloudflarestorage.com");
        this.f36132 = str2;
        this.f36133 = str3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m26707() {
        StringBuilder sb = new StringBuilder("https://");
        String str = this.f36134;
        String strM50267 = C22697.m50267(sb, str, "/");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AWS4Signer.TIME_PATTERN);
        simpleDateFormat.setTimeZone(C12557.getTimeZone(UtcDates.UTC));
        String str2 = simpleDateFormat.format(new Date());
        String strSubstring = str2.substring(0, 8);
        String strM26704 = m26704("");
        TreeMap treeMap = new TreeMap();
        treeMap.put(c.f, str);
        treeMap.put("x-amz-content-sha256", strM26704);
        treeMap.put("x-amz-date", str2);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : treeMap.keySet()) {
            sb2.append(str3.toLowerCase());
            sb2.append(":");
            sb2.append(((String) treeMap.get(str3)).trim());
            sb2.append("\n");
        }
        String string = sb2.toString();
        Set setKeySet = treeMap.keySet();
        StringBuilder sb3 = new StringBuilder();
        Iterator it = setKeySet.iterator();
        if (it.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) l.b);
            }
        }
        String string2 = sb3.toString();
        StringBuilder sbM30515 = C12278.m30515("GET\n/\n\n", string, "\n", string2, "\n");
        sbM30515.append(strM26704);
        String string3 = sbM30515.toString();
        String strM37076 = C15489.m37076(strSubstring, "/auto/s3/aws4_request");
        StringBuilder sbM30516 = C12278.m30515("AWS4-HMAC-SHA256\n", str2, "\n", strM37076, "\n");
        sbM30516.append(m26704(string3));
        try {
            String strM26705 = m26705(m26706(sbM30516.toString(), m26706(AWS4Signer.TERMINATOR, m26706("s3", m26706("auto", m26706(strSubstring, ("AWS4" + this.f36133).getBytes(StandardCharsets.UTF_8)))))));
            StringBuilder sb4 = new StringBuilder("AWS4-HMAC-SHA256 Credential=");
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb4, this.f36132, "/", strM37076, ", SignedHeaders=");
            String strM5622 = C1694.m5622(sb4, string2, ", Signature=", strM26705);
            C6490 c6490 = new C6490();
            c6490.m17686(strM50267);
            c6490.m17680("Host", str);
            c6490.m17680("X-Amz-Content-Sha256", strM26704);
            c6490.m17680("X-Amz-Date", str2);
            c6490.m17680("Authorization", strM5622);
            C18485 c18485Execute = C16737.m39297().m14157(c6490.m17678()).execute();
            try {
                if (!c18485Execute.m42863()) {
                    if (c18485Execute.m42858() != 401 && c18485Execute.m42858() != 403) {
                        throw new IOException("Request failed: " + c18485Execute.m42858() + " " + c18485Execute.m42868());
                    }
                    throw new C8142(R.string.MT_Protector);
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(c18485Execute.m42860().m44051()).getElementsByTagName("Bucket");
                    for (int i = 0; i < elementsByTagName.getLength(); i++) {
                        Node nodeItem = elementsByTagName.item(i);
                        if (nodeItem.getNodeType() == 1) {
                            arrayList.add(new C23770(C1896.m6178("Name", (Element) nodeItem), null, str));
                        }
                    }
                    c18485Execute.close();
                    return arrayList;
                } catch (Exception e) {
                    throw new RuntimeException("Failed to parse ListBuckets response", e);
                }
            } catch (Throwable th) {
                try {
                    c18485Execute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e2) {
            throw new RuntimeException("Failed to generate HMAC signature", e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m26706(String str, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        return mac.doFinal(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26704(String str) {
        try {
            return m26705(MessageDigest.getInstance(XMSSKeyParameters.SHA_256).digest(str.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26705(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}
