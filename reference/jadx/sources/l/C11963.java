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

/* JADX INFO: renamed from: l.ۨ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z83J */
/* JADX INFO: loaded from: classes3.dex */
public final class C11963 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f40092;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f40093;

    public C11963(String str, String str2) {
        this.f40092 = str;
        this.f40093 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m29775(InputStream inputStream) {
        try {
            NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getElementsByTagName("Bucket");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element = (Element) elementsByTagName.item(i);
                arrayList.add(new C23770(element.getElementsByTagName("Name").item(0).getTextContent(), element.getElementsByTagName("Location").item(0).getTextContent(), element.getElementsByTagName("ExtranetEndpoint").item(0).getTextContent()));
            }
            return arrayList;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse ListBuckets response", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m29776() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(C12557.getTimeZone("GMT"));
        String str = simpleDateFormat.format(new Date());
        String str2 = this.f40093;
        String strM38890 = C16523.m38890("GET\n\n\n", str, "\n/");
        try {
            Charset charset = StandardCharsets.UTF_8;
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(charset), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            String strEncodeToString = C8324.getEncoder().encodeToString(mac.doFinal(strM38890.getBytes(charset)));
            C6490 c6490 = new C6490();
            c6490.m17686("https://oss-cn-hangzhou.aliyuncs.com");
            c6490.m17681("GET", (AbstractC21307) null);
            c6490.m17680("Date", str);
            c6490.m17680("Authorization", C1694.m5622(new StringBuilder("OSS "), this.f40092, ":", strEncodeToString));
            C18485 c18485Execute = C16737.m39297().m14157(c6490.m17678()).execute();
            try {
                if (c18485Execute.m42863()) {
                    AbstractC19191 abstractC19191M42860 = c18485Execute.m42860();
                    C13638.requireNonNull(abstractC19191M42860);
                    ArrayList arrayListM29775 = m29775(abstractC19191M42860.m44051());
                    c18485Execute.close();
                    return arrayListM29775;
                }
                if (c18485Execute.m42858() != 401 && c18485Execute.m42858() != 403) {
                    throw new IOException("Request failed: " + c18485Execute.m42858() + " " + c18485Execute.m42868());
                }
                throw new C8142(R.string.MT_Protector);
            } catch (Throwable th) {
                try {
                    c18485Execute.close();
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
