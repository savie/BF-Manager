package l;

import java.io.OutputStreamWriter;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: l.᩹֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: RBJL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21943 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Logger f71175 = Logger.getLogger("SvgNode");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Element f71177;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6420 f71178;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f71179;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f71181 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19121 f71180 = new C19121();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C19121 f71176 = new C19121();

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC21943 mo12101();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo12102(OutputStreamWriter outputStreamWriter, String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo12103(String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo12107(C19121 c19121);

    /* JADX INFO: renamed from: ۨ */
    public void mo32975() {
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo12108(C19121 c19121);

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo12109();

    public AbstractC21943(C6420 c6420, Element element, String str) {
        this.f71179 = str;
        this.f71178 = c6420;
        this.f71177 = element;
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = attributes.item(i);
            String nodeName = nodeItem.getNodeName();
            String nodeValue = nodeItem.getNodeValue();
            if (C23934.f77514.containsKey(nodeName)) {
                m48767(nodeName, nodeValue);
            }
            if ("transform".equals(nodeName)) {
                f71175.log(Level.FINE, nodeName + " " + nodeValue);
                m48768(nodeValue);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x010d A[PHI: r22
      0x010d: PHI (r22v5 int) = (r22v0 int), (r22v0 int), (r22v0 int), (r22v0 int), (r22v0 int), (r22v6 int) binds: [B:59:0x010b, B:54:0x00ef, B:42:0x00c6, B:32:0x00a9, B:23:0x008e, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m48768(String str) {
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
            C19121 c19121 = null;
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
                C19121 c19122 = new C19121();
                if ("matrix".equalsIgnoreCase(strTrim)) {
                    if (length2 == 6) {
                        i = i2;
                        c19122.m43925(fArr[c], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                    }
                    i = i2;
                    c = 0;
                } else {
                    i = i2;
                    if ("translate".equalsIgnoreCase(strTrim)) {
                        if (length2 == 1 || length2 == 2) {
                            c19122.m43932(fArr[0], length2 == 2 ? fArr[1] : 0.0d);
                        } else {
                            c = 0;
                        }
                    } else if ("scale".equalsIgnoreCase(strTrim)) {
                        if (length2 == 1 || length2 == 2) {
                            c19122.m43923(fArr[0], fArr[length2 != 2 ? (char) 0 : (char) 1]);
                        } else {
                            c = 0;
                        }
                    } else if ("rotate".equalsIgnoreCase(strTrim)) {
                        if (length2 == 1 || length2 == 3) {
                            c19122.m43924(Math.toRadians(fArr[0]), length2 == 3 ? fArr[1] : 0.0d, length2 == 3 ? fArr[2] : 0.0d);
                        } else {
                            c = 0;
                        }
                    } else if (!"skewX".equalsIgnoreCase(strTrim)) {
                        if ("skewY".equalsIgnoreCase(strTrim)) {
                            if (length2 != 1) {
                                c = 0;
                            } else {
                                c = 0;
                                c19122.m43934(0.0d, Math.tan(Math.toRadians(fArr[0])));
                            }
                        }
                        c19121 = c19122;
                    } else if (length2 != 1) {
                        c = 0;
                    } else {
                        c19122.m43934(Math.tan(Math.toRadians(fArr[0])), 0.0d);
                    }
                }
                c = 0;
                c19121 = c19122;
            }
            if (c19121 != null) {
                this.f71180.m43927(c19121);
            }
            i2 = i + 2;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public EnumC5009 mo32972(C21778 c21778) {
        return C14762.m35379((EnumMap) c21778.f70553, this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m48767(String str, String str2) {
        if (str.equals("fill-rule") || str.equals("clip-rule")) {
            if (str2.equals("nonzero")) {
                str2 = "nonZero";
            } else if (str2.equals("evenodd")) {
                str2 = "evenOdd";
            }
        }
        f71175.log(Level.FINE, C7997.m21055(">>>> PROP ", str, " = ", str2));
        if (str2.startsWith("url(") && !str.equals("fill") && !str.equals("stroke")) {
            m48772("Unsupported URL value: ".concat(str2));
            return;
        }
        boolean zEquals = str.equals("stroke-width");
        HashMap map = this.f71181;
        if (zEquals && str2.equals("0")) {
            map.remove("stroke");
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo32977(String str, String str2) {
        m48767(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48770(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            HashMap map2 = this.f71181;
            if (!map2.containsKey(str)) {
                map2.put(str, (String) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m48769(String str, String str2) {
        try {
            return C2060.m6565(str);
        } catch (IllegalArgumentException unused) {
            m48772(C16523.m38890("Unsupported color format \"", str, "\""));
            return str2;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48772(String str) {
        this.f71178.m17580(str, this.f71177);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48771(String str) {
        C6420 c6420 = this.f71178;
        c6420.getClass();
        c6420.m17581(str, this.f71177, EnumC3597.WARNING);
    }
}
