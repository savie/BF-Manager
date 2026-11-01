package l;

import bin.mt.plus.R;
import java.io.IOException;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: l.ܰ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D80C */
/* JADX INFO: loaded from: classes3.dex */
public final class C14080 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f46241;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f46242;

    public C14080(String str, String str2) {
        this.f46241 = str;
        this.f46242 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m34068() throws NoSuchAlgorithmException, InvalidKeyException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(C12557.getTimeZone("GMT"));
        String str = simpleDateFormat.format(new Date());
        String strM38890 = C16523.m38890("GET\n\n\n", str, "\n/");
        Mac mac = Mac.getInstance("HmacSHA1");
        Charset charset = StandardCharsets.UTF_8;
        mac.init(new SecretKeySpec(this.f46242.getBytes(charset), "HmacSHA1"));
        String strM5622 = C1694.m5622(new StringBuilder("OBS "), this.f46241, ":", C8324.getEncoder().encodeToString(mac.doFinal(strM38890.getBytes(charset))));
        C6490 c6490 = new C6490();
        c6490.m17686("https://obs.cn-north-4.myhuaweicloud.com/");
        c6490.m17685();
        c6490.m17687("Date", str);
        c6490.m17687("Authorization", strM5622);
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
                        Element element = (Element) nodeItem;
                        String strM6178 = C1896.m6178("Name", element);
                        String strM6179 = C1896.m6178("Location", element);
                        arrayList.add(new C23770(strM6178, strM6179, "obs." + strM6179 + ".myhuaweicloud.com"));
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
    }
}
