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

/* JADX INFO: renamed from: l.᩶᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKB */
/* JADX INFO: loaded from: classes.dex */
public final class C21603 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final DocumentBuilderFactory f69014;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final SAXParserFactory f69015;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f69016 = Pattern.compile("encoding=['\"](\\S*)['\"]");

    static {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        f69014 = documentBuilderFactoryNewInstance;
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setValidating(false);
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        f69015 = sAXParserFactoryNewInstance;
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
    public static void m49135(String str, DefaultHandler defaultHandler) throws ParserConfigurationException, SAXException, IOException {
        SAXParser sAXParserNewSAXParser = f69015.newSAXParser();
        XMLReader xMLReader = sAXParserNewSAXParser.getXMLReader();
        xMLReader.setFeature("http://xml.org/sax/features/external-general-entities", false);
        xMLReader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        sAXParserNewSAXParser.getXMLReader().setProperty("http://xml.org/sax/properties/lexical-handler", defaultHandler);
        sAXParserNewSAXParser.parse(new InputSource(new StringReader(str)), defaultHandler);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Document m49134(ArrayList arrayList, byte[] bArr) throws ParserConfigurationException, IOException {
        int i;
        String str;
        String str2;
        String str3;
        boolean z;
        C4449 c4449;
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
                                Matcher matcher = f69016.matcher(string);
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
                    c4449 = new C4449(str3);
                    try {
                        m49135(str3, c4449);
                        break;
                    } catch (SAXException e) {
                        if (z || !e.getMessage().contains("Content is not allowed in prolog")) {
                            arrayList.add(e.getLocalizedMessage());
                            c4449.m14145();
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
        return c4449.m14146();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x018d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18619 m49133(Node node) {
        String str;
        C14889 c14889 = null;
        if (node instanceof Attr) {
            Attr attr = (Attr) node;
            C14889 c148810 = (C14889) attr.getOwnerElement().getUserData("offsets");
            if (c148810 != null) {
                int iM35844 = c148810.m35844();
                int iM35845 = c148810.m35843().m35844();
                String str2 = (String) node.getOwnerDocument().getUserData("contents");
                if (str2 != null) {
                    String name = attr.getName();
                    if (attr.getPrefix() != null) {
                        str = String.format("(%1$s\\s*=\\s*((\".*?\")|('.*?')))", name);
                    } else {
                        str = String.format("[^:](%1$s\\s*=\\s*((\".*?\")|('.*?')))", name);
                    }
                    Matcher matcher = Pattern.compile(str).matcher(str2);
                    if (!matcher.find(iM35844) || matcher.start(1) > iM35845) {
                        c14889 = c148810;
                    } else {
                        int iStart = matcher.start(1);
                        int iM35841 = c148810.m35841();
                        int iM35839 = c148810.m35839();
                        for (int iM35846 = c148810.m35844(); iM35846 < iStart; iM35846++) {
                            if (str2.charAt(iM35846) == '\n') {
                                iM35841++;
                                iM35839 = 0;
                            } else {
                                iM35839++;
                            }
                        }
                        C14889 c148811 = new C14889(iM35841, iM35839, iStart);
                        c148811.m35840(new C14889(iM35841, (matcher.end(1) + iM35839) - iStart, matcher.end(1)));
                        c14889 = c148811;
                    }
                }
            } else {
                c14889 = (C14889) node.getUserData("offsets");
            }
        } else if (node instanceof Text) {
            C14889 c148812 = node.getPreviousSibling() != null ? (C14889) node.getPreviousSibling().getUserData("offsets") : null;
            if (c148812 == null) {
                c148812 = (C14889) node.getParentNode().getUserData("offsets");
            }
            if (c148812 != null) {
                int iM35847 = c148812.m35843().m35844();
                int iM35842 = c148812.m35841();
                int iM358310 = c148812.m35839();
                String str3 = (String) node.getOwnerDocument().getUserData("contents");
                if (str3 != null && str3.length() >= iM35847) {
                    boolean z = false;
                    for (int iM35848 = c148812.m35844(); iM35848 <= iM35847; iM35848++) {
                        char cCharAt = str3.charAt(iM35848);
                        if (cCharAt != '>' || z) {
                            if (cCharAt == '\"') {
                                z = !z;
                            } else if (cCharAt == '\n') {
                                iM35842++;
                                iM358310 = -1;
                            }
                            iM358310++;
                        } else {
                            int i = iM35848 + 1;
                            int i2 = iM358310 + 1;
                            if ((node instanceof CDATASection) && str3.regionMatches(i, "<![CDATA[", 0, 9)) {
                                i = iM35848 + 10;
                                i2 = iM358310 + 10;
                            }
                            String nodeValue = node.getNodeValue();
                            int length = nodeValue.length();
                            int i3 = 0;
                            int i4 = i2;
                            int i5 = iM35842;
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
                                iM35842 = i5;
                                i2 = i4;
                            }
                            int i6 = i + i3;
                            C14889 c148813 = new C14889(iM35842, i2, i6);
                            for (int i7 = length - 1; i7 >= 0; i7--) {
                                if (!Character.isWhitespace(nodeValue.charAt(i7))) {
                                    length = i7 + 1;
                                    break;
                                }
                            }
                            while (i3 < length) {
                                if (nodeValue.charAt(i3) == '\n') {
                                    iM35842++;
                                    i2 = 0;
                                } else {
                                    i2++;
                                }
                                i6++;
                                i3++;
                            }
                            c148813.m35840(new C14889(iM35842, i2, i6));
                            c14889 = c148813;
                        }
                    }
                    c14889 = c148812;
                }
            } else {
                c14889 = (C14889) node.getUserData("offsets");
            }
        } else {
            c14889 = (C14889) node.getUserData("offsets");
        }
        return c14889 == null ? C18619.f60539 : c14889.m35842();
    }
}
