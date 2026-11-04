package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: l.ᩴܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z83J */
/* JADX INFO: loaded from: classes5.dex */
public final class C19866 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f63897;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f63898;

    public C19866(String str, String str2) {
        this.f63897 = str;
        this.f63898 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m45722(InputStream inputStream) {
        try {
            NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getElementsByTagName("Bucket");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element = (Element) elementsByTagName.item(i);
                arrayList.add(new C8373(element.getElementsByTagName("Name").item(0).getTextContent(), element.getElementsByTagName("Location").item(0).getTextContent(), element.getElementsByTagName("ExtranetEndpoint").item(0).getTextContent()));
            }
            return arrayList;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse ListBuckets response", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45723() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(C10646.getTimeZone("GMT"));
        String str = simpleDateFormat.format(new Date());
        String str2 = this.f63898;
        String strM34865 = C14442.m34865("GET\n\n\n", str, "\n/");
        try {
            Charset charset = StandardCharsets.UTF_8;
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(charset), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            String strEncodeToString = C19069.getEncoder().encodeToString(mac.doFinal(strM34865.getBytes(charset)));
            C0496 c0496 = new C0496();
            c0496.m2397("https://oss-cn-hangzhou.aliyuncs.com");
            c0496.m2392("GET", (AbstractC10190) null);
            c0496.m2391("Date", str);
            c0496.m2391("Authorization", C12669.m31438(new StringBuilder("OSS "), this.f63897, ":", strEncodeToString));
            C9444 c9444Execute = C21576.m49093().m54450(c0496.m2389()).execute();
            try {
                if (c9444Execute.m24819()) {
                    AbstractC8699 abstractC8699M24818 = c9444Execute.m24818();
                    C17359.requireNonNull(abstractC8699M24818);
                    ArrayList arrayListM45722 = m45722(abstractC8699M24818.m23391());
                    c9444Execute.close();
                    return arrayListM45722;
                }
                if (c9444Execute.m24820() != 401 && c9444Execute.m24820() != 403) {
                    throw new IOException("Request failed: " + c9444Execute.m24820() + " " + c9444Execute.m24825());
                }
                throw new C3090(R.string.MT_Protector);
            } catch (Throwable th) {
                try {
                    c9444Execute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new RuntimeException("Failed to generate HMAC signature", e);
        }
    }
}
