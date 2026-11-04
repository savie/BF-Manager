package l;

import java.io.OutputStreamWriter;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: l.᩸᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBJL */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23095 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Logger f74885 = Logger.getLogger("SvgNode");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Element f74886;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f74887;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5941 f74889;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f74888 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C23841 f74890 = new C23841();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23841 f74891 = new C23841();

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC23095 mo4137();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4138(OutputStreamWriter outputStreamWriter, String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo15616(String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4140(C23841 c23841);

    /* JADX INFO: renamed from: ۤ */
    public void mo4141() {
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo4143(C23841 c23841);

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo15618();

    public AbstractC23095(C5941 c5941, Element element, String str) {
        this.f74887 = str;
        this.f74889 = c5941;
        this.f74886 = element;
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = attributes.item(i);
            String nodeName = nodeItem.getNodeName();
            String nodeValue = nodeItem.getNodeValue();
            if (C10063.f32283.containsKey(nodeName)) {
                m51998(nodeName, nodeValue);
            }
            if ("transform".equals(nodeName)) {
                f74885.log(Level.FINE, nodeName + " " + nodeValue);
                m52003(nodeValue);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x010d A[PHI: r22
      0x010d: PHI (r22v5 int) = (r22v0 int), (r22v0 int), (r22v0 int), (r22v0 int), (r22v0 int), (r22v6 int) binds: [B:59:0x010b, B:54:0x00ef, B:42:0x00c6, B:32:0x00a9, B:23:0x008e, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m52003(String str) {
        float[] fArr;
        int i;
        String[] strArrSplit = str.replaceAll(",", " ").split("[()]");
        char c = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= strArrSplit.length - 1) {
                return;
            }
            String strTrim = strArrSplit[i2].trim();
            String[] strArrSplit2 = strArrSplit[i2 + 1].trim().split("\\s+");
            int length = strArrSplit2.length;
            C23841 c23841 = null;
            if (length == 0) {
                fArr = null;
            } else {
                fArr = new float[length];
                for (int i3 = 0; i3 < length; i3++) {
                    fArr[i3] = Float.parseFloat(strArrSplit2[i3]);
                }
            }
            if (fArr == null) {
                i = i2;
                c = 0;
            } else {
                int length2 = fArr.length;
                C23841 c23842 = new C23841();
                if ("matrix".equalsIgnoreCase(strTrim)) {
                    if (length2 == 6) {
                        i = i2;
                        c23842.m53177(fArr[c], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                    }
                    i = i2;
                    c = 0;
                } else {
                    i = i2;
                    if ("translate".equalsIgnoreCase(strTrim)) {
                        if (length2 == 1 || length2 == 2) {
                            c23842.m53183(fArr[0], length2 == 2 ? fArr[1] : 0.0d);
                        } else {
                            c = 0;
                        }
                    } else if ("scale".equalsIgnoreCase(strTrim)) {
                        if (length2 == 1 || length2 == 2) {
                            c23842.m53175(fArr[0], fArr[length2 != 2 ? (char) 0 : (char) 1]);
                        } else {
                            c = 0;
                        }
                    } else if ("rotate".equalsIgnoreCase(strTrim)) {
                        if (length2 == 1 || length2 == 3) {
                            c23842.m53176(Math.toRadians(fArr[0]), length2 == 3 ? fArr[1] : 0.0d, length2 == 3 ? fArr[2] : 0.0d);
                        } else {
                            c = 0;
                        }
                    } else if (!"skewX".equalsIgnoreCase(strTrim)) {
                        if ("skewY".equalsIgnoreCase(strTrim)) {
                            if (length2 != 1) {
                                c = 0;
                            } else {
                                c = 0;
                                c23842.m53188(0.0d, Math.tan(Math.toRadians(fArr[0])));
                            }
                        }
                        c23841 = c23842;
                    } else if (length2 != 1) {
                        c = 0;
                    } else {
                        c23842.m53188(Math.tan(Math.toRadians(fArr[0])), 0.0d);
                    }
                }
                c = 0;
                c23841 = c23842;
            }
            if (c23841 != null) {
                this.f74890.m53179(c23841);
            }
            i2 = i + 2;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public EnumC11160 mo33701(C24159 c24159) {
        return C1115.m4136((EnumMap) c24159.f78175, this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m51998(String str, String str2) {
        if (str.equals("fill-rule") || str.equals("clip-rule")) {
            if (str2.equals("nonzero")) {
                str2 = "nonZero";
            } else if (str2.equals("evenodd")) {
                str2 = "evenOdd";
            }
        }
        f74885.log(Level.FINE, ExternalValue$$ExternalSyntheticOutline0.m(">>>> PROP ", str, " = ", str2));
        if (str2.startsWith("url(") && !str.equals("fill") && !str.equals("stroke")) {
            m52002("Unsupported URL value: ".concat(str2));
            return;
        }
        boolean zEquals = str.equals("stroke-width");
        HashMap map = this.f74888;
        if (zEquals && str2.equals("0")) {
            map.remove("stroke");
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo33704(String str, String str2) {
        m51998(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52000(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            HashMap map2 = this.f74888;
            if (!map2.containsKey(str)) {
                map2.put(str, (String) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m51999(String str, String str2) {
        try {
            return C9317.m24555(str);
        } catch (IllegalArgumentException unused) {
            m52002(C14442.m34865("Unsupported color format \"", str, "\""));
            return str2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52002(String str) {
        this.f74889.m17269(str, this.f74886);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m52001(String str) {
        C5941 c5941 = this.f74889;
        c5941.getClass();
        c5941.m17270(str, this.f74886, EnumC13398.WARNING);
    }
}
