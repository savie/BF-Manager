package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: l.۬ۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R811 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13593 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f43172;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f43173;

    public C13593(String str, String str2) {
        this.f43172 = str;
        this.f43173 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m33321() {
        HashMap map = new HashMap();
        map.put("Host", "service.cos.myqcloud.com");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(C10646.getTimeZone("GMT"));
        map.put("Date", simpleDateFormat.format(new Date()));
        map.put("Authorization", C6882.m19146(this.f43172, this.f43173, map));
        C0496 c0496 = new C0496();
        c0496.m2397("https://service.cos.myqcloud.com");
        c0496.m2396();
        for (Map.Entry entry : map.entrySet()) {
            c0496.m2391((String) entry.getKey(), (String) entry.getValue());
        }
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
                        String strM33320 = m33320("Name", element);
                        String strM33321 = m33320("Location", element);
                        arrayList.add(new C8373(strM33320, strM33321, "cos." + strM33321 + ".myqcloud.com"));
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m33320(String str, Element element) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        return elementsByTagName.getLength() > 0 ? elementsByTagName.item(0).getTextContent() : "";
    }
}
