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
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: l.ۘܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J7U0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4204 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f15355;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f15356;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f15357;

    public C4204(String str, String str2, String str3) {
        this.f15357 = str.concat(".r2.cloudflarestorage.com");
        this.f15355 = str2;
        this.f15356 = str3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m13413() {
        StringBuilder sb = new StringBuilder("https://");
        String str = this.f15357;
        String strM23910 = C8947.m23910(sb, str, "/");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AWS4Signer.TIME_PATTERN);
        simpleDateFormat.setTimeZone(C10646.getTimeZone(UtcDates.UTC));
        String str2 = simpleDateFormat.format(new Date());
        String strSubstring = str2.substring(0, 8);
        String strM13410 = m13410("");
        TreeMap treeMap = new TreeMap();
        treeMap.put(c.f, str);
        treeMap.put("x-amz-content-sha256", strM13410);
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
        StringBuilder sbM10406 = C3188.m10406("GET\n/\n\n", string, "\n", string2, "\n");
        sbM10406.append(strM13410);
        String string3 = sbM10406.toString();
        String strM34972 = C14483.m34972(strSubstring, "/auto/s3/aws4_request");
        StringBuilder sbM10407 = C3188.m10406("AWS4-HMAC-SHA256\n", str2, "\n", strM34972, "\n");
        sbM10407.append(m13410(string3));
        try {
            String strM13411 = m13411(m13412(sbM10407.toString(), m13412(AWS4Signer.TERMINATOR, m13412("s3", m13412("auto", m13412(strSubstring, ("AWS4" + this.f15356).getBytes(StandardCharsets.UTF_8)))))));
            StringBuilder sb4 = new StringBuilder("AWS4-HMAC-SHA256 Credential=");
            C4794.m14774(sb4, this.f15355, "/", strM34972, ", SignedHeaders=");
            String strM31438 = C12669.m31438(sb4, string2, ", Signature=", strM13411);
            C0496 c0496 = new C0496();
            c0496.m2397(strM23910);
            c0496.m2391("Host", str);
            c0496.m2391("X-Amz-Content-Sha256", strM13410);
            c0496.m2391("X-Amz-Date", str2);
            c0496.m2391("Authorization", strM31438);
            C9444 c9444Execute = C21576.m49093().m54450(c0496.m2389()).execute();
            try {
                if (!c9444Execute.m24819()) {
                    if (c9444Execute.m24820() != 401 && c9444Execute.m24820() != 403) {
                        throw new IOException("Request failed: " + c9444Execute.m24820() + " " + c9444Execute.m24825());
                    }
                    throw new C3090(R.string.MT_Protector);
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(c9444Execute.m24818().m23391()).getElementsByTagName("Bucket");
                    for (int i = 0; i < elementsByTagName.getLength(); i++) {
                        Node nodeItem = elementsByTagName.item(i);
                        if (nodeItem.getNodeType() == 1) {
                            arrayList.add(new C8373(C13593.m33320("Name", (Element) nodeItem), null, str));
                        }
                    }
                    c9444Execute.close();
                    return arrayList;
                } catch (Exception e) {
                    throw new RuntimeException("Failed to parse ListBuckets response", e);
                }
            } catch (Throwable th) {
                try {
                    c9444Execute.close();
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
    public static byte[] m13412(String str, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        return mac.doFinal(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13410(String str) {
        try {
            return m13411(MessageDigest.getInstance(XMSSKeyParameters.SHA_256).digest(str.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13411(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}
