package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: renamed from: l.ܽ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16299 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final DocumentBuilderFactory f52500;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final SAXParserFactory f52501;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f52502 = Pattern.compile("encoding=['\"](\\S*)['\"]");

    static {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        f52500 = documentBuilderFactoryNewInstance;
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setValidating(false);
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        f52501 = sAXParserFactoryNewInstance;
        try {
            sAXParserFactoryNewInstance.setNamespaceAware(false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
            sAXParserFactoryNewInstance.setValidating(false);
        } catch (ParserConfigurationException | SAXException unused) {
        }
        SAXParserFactory sAXParserFactoryNewInstance2 = SAXParserFactory.newInstance();
        try {
            sAXParserFactoryNewInstance2.setNamespaceAware(true);
            sAXParserFactoryNewInstance2.setFeature("http://xml.org/sax/features/namespace-prefixes", true);
            sAXParserFactoryNewInstance2.setValidating(false);
        } catch (ParserConfigurationException | SAXException unused2) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38448(String str, DefaultHandler defaultHandler) throws ParserConfigurationException, SAXException, IOException {
        SAXParser sAXParserNewSAXParser = f52501.newSAXParser();
        XMLReader xMLReader = sAXParserNewSAXParser.getXMLReader();
        xMLReader.setFeature("http://xml.org/sax/features/external-general-entities", false);
        xMLReader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        sAXParserNewSAXParser.getXMLReader().setProperty("http://xml.org/sax/properties/lexical-handler", defaultHandler);
        sAXParserNewSAXParser.parse(new InputSource(new StringReader(str)), defaultHandler);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Document m38447(ArrayList arrayList, byte[] bArr) throws ParserConfigurationException, IOException {
        int i;
        String str;
        String str2;
        String str3;
        boolean z;
        C19827 c19827;
        byte b;
        byte b2;
        byte b3;
        int length = bArr.length;
        String strGroup = a.D;
        if (length > 4) {
            byte b4 = bArr[0];
            i = 3;
            if (b4 == -17 && bArr[1] == -69 && bArr[2] == -65) {
                str2 = a.D;
            } else {
                if (b4 == -2 && bArr[1] == -1) {
                    str2 = "UTF_16";
                } else {
                    if (b4 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) {
                        str2 = "UTF_32";
                    } else if (b4 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0) {
                        str2 = "UTF_32LE";
                    } else if (b4 == -1 && bArr[1] == -2) {
                        str2 = "UTF_16LE";
                    } else {
                        i = 0;
                        str = null;
                        str2 = a.D;
                    }
                    i = 4;
                }
                i = 2;
            }
            str = str2;
        } else {
            i = 0;
            str = null;
            str2 = a.D;
        }
        int length2 = bArr.length - i;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = -1;
        for (int i3 = i; i3 < bArr.length; i3++) {
            byte b5 = bArr[i3];
            if (b5 != 0) {
                if (b5 == 10 || b5 == 13) {
                    break;
                }
                if (b5 != 60) {
                    if (b5 == 62) {
                        int i4 = i3 - 4;
                        while (true) {
                            if (i4 < 0) {
                                strGroup = str;
                                break;
                            }
                            byte b6 = bArr[i4];
                            if ((b6 == 117 || b6 == 85) && (((b = bArr[i4 + 1]) == 116 || b == 84) && (((b2 = bArr[i4 + 2]) == 102 || b2 == 70) && (((b3 = bArr[i4 + 3]) == 45 || b3 == 95) && bArr[i4 + 4] == 56)))) {
                                break;
                            }
                            i4--;
                        }
                        if (strGroup == null) {
                            StringBuilder sb = new StringBuilder();
                            while (i2 <= i3) {
                                byte b7 = bArr[i2];
                                if (b7 != 0) {
                                    sb.append((char) b7);
                                }
                                i2++;
                            }
                            String string = sb.toString();
                            int iIndexOf = string.indexOf("encoding");
                            if (iIndexOf != -1) {
                                Matcher matcher = f52502.matcher(string);
                                if (matcher.find(iIndexOf)) {
                                    strGroup = matcher.group(1);
                                }
                            }
                        }
                        str = strGroup;
                        break;
                    }
                } else {
                    i2 = i3;
                }
            } else if ((i3 - i) % 2 == 0) {
                z3 = true;
            } else {
                z2 = true;
            }
        }
        if (str == null) {
            str = z2 ? "UTF_16LE" : z3 ? "UTF_16" : str2;
        }
        try {
            try {
                str3 = new String(bArr, i, length2, str);
                while (true) {
                    c19827 = new C19827(str3);
                    try {
                        m38448(str3, c19827);
                        break;
                    } catch (SAXException e) {
                        if (z || !e.getMessage().contains("Content is not allowed in prolog")) {
                            arrayList.add(e.getLocalizedMessage());
                            c19827.m45077();
                            break;
                        }
                        str3 = str3.replaceFirst("^([\\W]+)<", "<");
                        z = true;
                    }
                }
            } catch (UnsupportedEncodingException unused) {
            }
        } catch (UnsupportedEncodingException unused2) {
            str3 = !str.equals(str2) ? new String(bArr, i, length2, str2) : null;
        }
        if (str3 == null) {
            str3 = new String(bArr, i, length2);
        }
        if (!str3.isEmpty() && str3.charAt(0) == 65279) {
            str3 = str3.substring(1);
        }
        z = false;
        return c19827.m45078();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x018d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12066 m38446(Node node) {
        String str;
        C0070 c0070 = null;
        if (node instanceof Attr) {
            Attr attr = (Attr) node;
            C0070 c0071 = (C0070) attr.getOwnerElement().getUserData("offsets");
            if (c0071 != null) {
                int iM987 = c0071.m987();
                int iM988 = c0071.m992().m987();
                String str2 = (String) node.getOwnerDocument().getUserData("contents");
                if (str2 != null) {
                    String name = attr.getName();
                    if (attr.getPrefix() != null) {
                        str = String.format("(%1$s\\s*=\\s*((\".*?\")|('.*?')))", name);
                    } else {
                        str = String.format("[^:](%1$s\\s*=\\s*((\".*?\")|('.*?')))", name);
                    }
                    Matcher matcher = Pattern.compile(str).matcher(str2);
                    if (!matcher.find(iM987) || matcher.start(1) > iM988) {
                        c0070 = c0071;
                    } else {
                        int iStart = matcher.start(1);
                        int iM991 = c0071.m991();
                        int iM989 = c0071.m988();
                        for (int iM9810 = c0071.m987(); iM9810 < iStart; iM9810++) {
                            if (str2.charAt(iM9810) == '\n') {
                                iM991++;
                                iM989 = 0;
                            } else {
                                iM989++;
                            }
                        }
                        C0070 c0072 = new C0070(iM991, iM989, iStart);
                        c0072.m989(new C0070(iM991, (matcher.end(1) + iM989) - iStart, matcher.end(1)));
                        c0070 = c0072;
                    }
                }
            } else {
                c0070 = (C0070) node.getUserData("offsets");
            }
        } else if (node instanceof Text) {
            C0070 c0073 = node.getPreviousSibling() != null ? (C0070) node.getPreviousSibling().getUserData("offsets") : null;
            if (c0073 == null) {
                c0073 = (C0070) node.getParentNode().getUserData("offsets");
            }
            if (c0073 != null) {
                int iM9811 = c0073.m992().m987();
                int iM992 = c0073.m991();
                int iM9812 = c0073.m988();
                String str3 = (String) node.getOwnerDocument().getUserData("contents");
                if (str3 != null && str3.length() >= iM9811) {
                    boolean z = false;
                    for (int iM9813 = c0073.m987(); iM9813 <= iM9811; iM9813++) {
                        char cCharAt = str3.charAt(iM9813);
                        if (cCharAt != '>' || z) {
                            if (cCharAt == '\"') {
                                z = !z;
                            } else if (cCharAt == '\n') {
                                iM992++;
                                iM9812 = -1;
                            }
                            iM9812++;
                        } else {
                            int i = iM9813 + 1;
                            int i2 = iM9812 + 1;
                            if ((node instanceof CDATASection) && str3.regionMatches(i, "<![CDATA[", 0, 9)) {
                                i = iM9813 + 10;
                                i2 = iM9812 + 10;
                            }
                            String nodeValue = node.getNodeValue();
                            int length = nodeValue.length();
                            int i3 = 0;
                            int i4 = i2;
                            int i5 = iM992;
                            while (i3 < length) {
                                char cCharAt2 = nodeValue.charAt(i3);
                                if (cCharAt2 == '\n') {
                                    i5++;
                                    i4 = 0;
                                } else {
                                    if (!Character.isWhitespace(cCharAt2)) {
                                        break;
                                    }
                                    i4++;
                                }
                                i3++;
                            }
                            if (i3 == nodeValue.length()) {
                                i3 = 0;
                            } else {
                                iM992 = i5;
                                i2 = i4;
                            }
                            int i6 = i + i3;
                            C0070 c0074 = new C0070(iM992, i2, i6);
                            for (int i7 = length - 1; i7 >= 0; i7--) {
                                if (!Character.isWhitespace(nodeValue.charAt(i7))) {
                                    length = i7 + 1;
                                    break;
                                }
                            }
                            while (i3 < length) {
                                if (nodeValue.charAt(i3) == '\n') {
                                    iM992++;
                                    i2 = 0;
                                } else {
                                    i2++;
                                }
                                i6++;
                                i3++;
                            }
                            c0074.m989(new C0070(iM992, i2, i6));
                            c0070 = c0074;
                        }
                    }
                    c0070 = c0073;
                }
            } else {
                c0070 = (C0070) node.getUserData("offsets");
            }
        } else {
            c0070 = (C0070) node.getUserData("offsets");
        }
        return c0070 == null ? C12066.f40376 : c0070.m990();
    }
}
