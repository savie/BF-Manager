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

/* JADX INFO: renamed from: l.֫ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R811 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1896 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f7154;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f7155;

    public C1896(String str, String str2) {
        this.f7154 = str;
        this.f7155 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m6179() {
        HashMap map = new HashMap();
        map.put("Host", "service.cos.myqcloud.com");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(C12557.getTimeZone("GMT"));
        map.put("Date", simpleDateFormat.format(new Date()));
        map.put("Authorization", C14598.m35066(this.f7154, this.f7155, map));
        C6490 c6490 = new C6490();
        c6490.m17686("https://service.cos.myqcloud.com");
        c6490.m17685();
        for (Map.Entry entry : map.entrySet()) {
            c6490.m17680((String) entry.getKey(), (String) entry.getValue());
        }
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
                        String strM6178 = m6178("Name", element);
                        String strM6179 = m6178("Location", element);
                        arrayList.add(new C23770(strM6178, strM6179, "cos." + strM6179 + ".myqcloud.com"));
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m6178(String str, Element element) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        return elementsByTagName.getLength() > 0 ? elementsByTagName.item(0).getTextContent() : "";
    }
}
