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

/* JADX INFO: renamed from: l.᩸ܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: D80C */
/* JADX INFO: loaded from: classes.dex */
public final class C22850 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f74232;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f74233;

    public C22850(String str, String str2) {
        this.f74232 = str;
        this.f74233 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m51565() throws NoSuchAlgorithmException, InvalidKeyException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(C10646.getTimeZone("GMT"));
        String str = simpleDateFormat.format(new Date());
        String strM34865 = C14442.m34865("GET\n\n\n", str, "\n/");
        Mac mac = Mac.getInstance("HmacSHA1");
        Charset charset = StandardCharsets.UTF_8;
        mac.init(new SecretKeySpec(this.f74233.getBytes(charset), "HmacSHA1"));
        String strM31438 = C12669.m31438(new StringBuilder("OBS "), this.f74232, ":", C19069.getEncoder().encodeToString(mac.doFinal(strM34865.getBytes(charset))));
        C0496 c0496 = new C0496();
        c0496.m2397("https://obs.cn-north-4.myhuaweicloud.com/");
        c0496.m2396();
        c0496.m2398("Date", str);
        c0496.m2398("Authorization", strM31438);
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
                        Element element = (Element) nodeItem;
                        String strM33320 = C13593.m33320("Name", element);
                        String strM33321 = C13593.m33320("Location", element);
                        arrayList.add(new C8373(strM33320, strM33321, "obs." + strM33321 + ".myhuaweicloud.com"));
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
    }
}
