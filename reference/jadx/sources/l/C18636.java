package l;

import android.text.Layout;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.cb;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: l.ᩴ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QY */
/* JADX INFO: loaded from: classes5.dex */
public final class C18636 implements InterfaceC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final XmlPullParserFactory f60418;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f60414 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f60417 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f60413 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Pattern f60412 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f60410 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f60415 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f60416 = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C21458 f60411 = new C21458(1, 30.0f, 1);

    @Override // l.InterfaceC6951
    public final /* synthetic */ void reset() {
    }

    public C18636() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f60418 = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo11109(byte[] bArr, int i, int i2, C4128 c4128, InterfaceC1008 interfaceC1008) {
        C23864.m52591(mo11108(i, i2, bArr), c4128, interfaceC1008);
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9753 mo11108(int i, int i2, byte[] bArr) {
        C21458 c21458;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f60418.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C8053("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C17930 c17930M43100 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C21458 c21458M43101 = f60411;
            int iM43092 = 15;
            C10170 c10170 = null;
            int i3 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C15109 c15109 = (C15109) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c21458M43101 = m43101(xmlPullParserNewPullParser);
                            iM43092 = m43092(xmlPullParserNewPullParser);
                            c17930M43100 = m43100(xmlPullParserNewPullParser);
                        }
                        C17930 c17930 = c17930M43100;
                        C21458 c21459 = c21458M43101;
                        int i4 = iM43092;
                        if (m43099(name)) {
                            if ("head".equals(name)) {
                                c21458 = c21459;
                                m43098(xmlPullParserNewPullParser, map, i4, c17930, map2, map3);
                            } else {
                                c21458 = c21459;
                                try {
                                    C15109 c15109M43096 = m43096(xmlPullParserNewPullParser, c15109, map2, c21458);
                                    arrayDeque.push(c15109M43096);
                                    if (c15109 != null) {
                                        c15109.m36192(c15109M43096);
                                    }
                                } catch (C4834 e) {
                                    C0303.m1852("Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            c21458M43101 = c21458;
                            c17930M43100 = c17930;
                            iM43092 = i4;
                        } else {
                            C0303.m1851("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            c21458 = c21459;
                        }
                        i3++;
                        c21458M43101 = c21458;
                        c17930M43100 = c17930;
                        iM43092 = i4;
                    } else if (eventType == 4) {
                        c15109.getClass();
                        c15109.m36192(C15109.m36183(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C15109 c151010 = (C15109) arrayDeque.peek();
                            c151010.getClass();
                            c10170 = new C10170(c151010, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            c10170.getClass();
            return c10170;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C21458 m43101(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = C17983.f57504;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            C2023.m6506("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        C21458 c21458 = f60411;
        int i2 = c21458.f69758;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = c21458.f69757;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C21458(i2, i * f, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43092(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f60416.matcher(attributeValue);
        if (!matcher.matches()) {
            C0303.m1848("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i == 0 || i2 == 0) {
                z = false;
            }
            C2023.m6506("Invalid cell resolution " + i + " " + i2, z);
            return i2;
        } catch (NumberFormatException unused) {
            C0303.m1848("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C17930 m43100(XmlPullParser xmlPullParser) {
        String strM43172 = C18689.m43172(xmlPullParser, "extent");
        if (strM43172 == null) {
            return null;
        }
        Matcher matcher = f60415.matcher(strM43172);
        if (!matcher.matches()) {
            C0303.m1848("Ignoring non-pixel tts extent: ".concat(strM43172));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C17930(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            C0303.m1848("Ignoring malformed tts extent: ".concat(strM43172));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x020d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:97:0x0200  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43098(XmlPullParser xmlPullParser, HashMap map, int i, C17930 c17930, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strM43172;
        C8053 c8053;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        int i3;
        float f6;
        float f7;
        String strM43173;
        C8759 c8759;
        String strM43174;
        C8759 c87510;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (C18689.m43173(xmlPullParser, "style")) {
                String strM43175 = C18689.m43172(xmlPullParser, "style");
                C8759 c8759M43095 = m43095(xmlPullParser, new C8759());
                if (strM43175 != null) {
                    String strTrim = strM43175.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str = C17983.f57504;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str2 : strArrSplit) {
                        c8759M43095.m22736((C8759) map.get(str2));
                    }
                }
                String strM22725 = c8759M43095.m22725();
                if (strM22725 != null) {
                    map.put(strM22725, c8759M43095);
                }
            } else if (C18689.m43173(xmlPullParser, "region")) {
                String strM43176 = C18689.m43172(xmlPullParser, "id");
                if (strM43176 != null) {
                    String strM43177 = C18689.m43172(xmlPullParser, "origin");
                    if (strM43177 == null && (strM43174 = C18689.m43172(xmlPullParser, "style")) != null && (c87510 = (C8759) map.get(strM43174)) != null) {
                        strM43177 = c87510.m22730();
                    }
                    Pattern pattern = f60415;
                    Pattern pattern2 = f60410;
                    if (strM43177 != null) {
                        Matcher matcher = pattern2.matcher(strM43177);
                        Matcher matcher2 = pattern.matcher(strM43177);
                        if (matcher.matches()) {
                            try {
                                String strGroup = matcher.group(1);
                                strGroup.getClass();
                                float f8 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher.group(2);
                                strGroup2.getClass();
                                f2 = Float.parseFloat(strGroup2) / 100.0f;
                                f = f8;
                            } catch (NumberFormatException unused) {
                                C0303.m1848("Ignoring region with malformed origin: ".concat(strM43177));
                            }
                        } else if (!matcher2.matches()) {
                            C0303.m1848("Ignoring region with unsupported origin: ".concat(strM43177));
                        } else if (c17930 == null) {
                            C0303.m1848("Ignoring region with missing tts:extent: ".concat(strM43177));
                        } else {
                            try {
                                String strGroup3 = matcher2.group(1);
                                strGroup3.getClass();
                                int i4 = Integer.parseInt(strGroup3);
                                String strGroup4 = matcher2.group(2);
                                strGroup4.getClass();
                                int i5 = Integer.parseInt(strGroup4);
                                f = i4 / c17930.f57365;
                                f2 = i5 / c17930.f57364;
                            } catch (NumberFormatException unused2) {
                                C0303.m1848("Ignoring region with malformed origin: ".concat(strM43177));
                            }
                        }
                        c8053 = null;
                    } else {
                        f = 0.0f;
                        f2 = 0.0f;
                    }
                    String strM43178 = C18689.m43172(xmlPullParser, "extent");
                    if (strM43178 == null && (strM43173 = C18689.m43172(xmlPullParser, "style")) != null && (c8759 = (C8759) map.get(strM43173)) != null) {
                        strM43178 = c8759.m22752();
                    }
                    if (strM43178 != null) {
                        Matcher matcher3 = pattern2.matcher(strM43178);
                        Matcher matcher4 = pattern.matcher(strM43178);
                        if (matcher3.matches()) {
                            try {
                                String strGroup5 = matcher3.group(1);
                                strGroup5.getClass();
                                f6 = Float.parseFloat(strGroup5) / 100.0f;
                                String strGroup6 = matcher3.group(2);
                                strGroup6.getClass();
                                f7 = Float.parseFloat(strGroup6) / 100.0f;
                            } catch (NumberFormatException unused3) {
                                C16523.m38891("Ignoring region with malformed extent: ", strM43177);
                                c8053 = null;
                            }
                        } else {
                            if (!matcher4.matches()) {
                                C16523.m38891("Ignoring region with unsupported extent: ", strM43177);
                            } else if (c17930 == null) {
                                C16523.m38891("Ignoring region with missing tts:extent: ", strM43177);
                            } else {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i6 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i7 = Integer.parseInt(strGroup8);
                                f6 = i6 / c17930.f57365;
                                f7 = i7 / c17930.f57364;
                            }
                            c8053 = null;
                        }
                        f4 = f7;
                        f3 = f6;
                    } else {
                        f3 = 1.0f;
                        f4 = 1.0f;
                    }
                    String strM43179 = C18689.m43172(xmlPullParser, "displayAlign");
                    if (strM43179 != null) {
                        String strM46672 = C20733.m46672(strM43179);
                        strM46672.getClass();
                        if (strM46672.equals("center")) {
                            f5 = f2 + (f4 / 2.0f);
                            i2 = 1;
                        } else if (strM46672.equals("after")) {
                            f5 = f2 + f4;
                            i2 = 2;
                        } else {
                            f5 = f2;
                            i2 = 0;
                        }
                    } else {
                        f5 = f2;
                        i2 = 0;
                    }
                    float f9 = 1.0f / i;
                    String strM431710 = C18689.m43172(xmlPullParser, "writingMode");
                    if (strM431710 != null) {
                        String strM46673 = C20733.m46672(strM431710);
                        strM46673.getClass();
                        switch (strM46673) {
                            case "tb":
                            case "tblr":
                                i3 = 2;
                                break;
                            case "tbrl":
                                i3 = 1;
                                break;
                            default:
                                i3 = Integer.MIN_VALUE;
                                break;
                        }
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    c8053 = new C8053(strM43176, f, f5, 0, i2, f3, f4, 1, f9, i3);
                } else {
                    c8053 = null;
                }
                if (c8053 != null) {
                    map2.put(c8053.f28202, c8053);
                }
            } else if (C18689.m43173(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (C18689.m43173(xmlPullParser, "image") && (strM43172 = C18689.m43172(xmlPullParser, "id")) != null) {
                        map3.put(strM43172, xmlPullParser.nextText());
                    }
                } while (!C18689.m43174(xmlPullParser, "metadata"));
            }
        } while (!C18689.m43174(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x014b  */
    /* JADX WARN: Code duplicated, block: B:170:0x028e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0317  */
    /* JADX WARN: Code duplicated, block: B:230:0x0388  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8759 m43095(XmlPullParser xmlPullParser, C8759 c8759) {
        byte b;
        String str;
        int attributeCount = xmlPullParser.getAttributeCount();
        C8759 c8759M43094 = c8759;
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b = 0;
                    break;
                case "extent":
                    b = 1;
                    break;
                case "fontFamily":
                    b = 2;
                    break;
                case "textAlign":
                    b = 3;
                    break;
                case "origin":
                    b = 4;
                    break;
                case "textDecoration":
                    b = 5;
                    break;
                case "fontWeight":
                    b = 6;
                    break;
                case "id":
                    b = 7;
                    break;
                case "ruby":
                    b = 8;
                    break;
                case "color":
                    b = 9;
                    break;
                case "shear":
                    b = 10;
                    break;
                case "textCombine":
                    b = 11;
                    break;
                case "fontSize":
                    b = 12;
                    break;
                case "textEmphasis":
                    b = cb.k;
                    break;
                case "rubyPosition":
                    b = cb.f77931l;
                    break;
                case "backgroundColor":
                    b = 15;
                    break;
                case "multiRowAlign":
                    b = 16;
                    break;
                default:
                    b = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b) {
                case 0:
                    c8759M43094 = m43094(c8759M43094);
                    c8759M43094.m22757("italic".equalsIgnoreCase(attributeValue));
                    continue;
                    break;
                case 1:
                    c8759M43094 = m43094(c8759M43094);
                    c8759M43094.m22735(attributeValue);
                    continue;
                    break;
                case 2:
                    c8759M43094 = m43094(c8759M43094);
                    c8759M43094.m22756(attributeValue);
                    continue;
                    break;
                case 3:
                    c8759M43094 = m43094(c8759M43094);
                    String strM46672 = C20733.m46672(attributeValue);
                    strM46672.getClass();
                    switch (strM46672) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    c8759M43094.m22755(alignment);
                    continue;
                    break;
                case 4:
                    c8759M43094 = m43094(c8759M43094);
                    c8759M43094.m22728(attributeValue);
                    continue;
                    break;
                case 5:
                    String strM46673 = C20733.m46672(attributeValue);
                    strM46673.getClass();
                    switch (strM46673) {
                        case "nounderline":
                            c8759M43094 = m43094(c8759M43094);
                            c8759M43094.m22741(false);
                            break;
                        case "underline":
                            c8759M43094 = m43094(c8759M43094);
                            c8759M43094.m22741(true);
                            break;
                        case "nolinethrough":
                            c8759M43094 = m43094(c8759M43094);
                            c8759M43094.m22750(false);
                            break;
                        case "linethrough":
                            c8759M43094 = m43094(c8759M43094);
                            c8759M43094.m22750(true);
                            continue;
                            break;
                    }
                    break;
                case 6:
                    c8759M43094 = m43094(c8759M43094);
                    c8759M43094.m22738("bold".equalsIgnoreCase(attributeValue));
                    continue;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        c8759M43094 = m43094(c8759M43094);
                        c8759M43094.m22749(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    String strM46674 = C20733.m46672(attributeValue);
                    strM46674.getClass();
                    switch (strM46674) {
                        case "baseContainer":
                        case "base":
                            c8759M43094 = m43094(c8759M43094);
                            c8759M43094.m22740(2);
                            break;
                        case "container":
                            c8759M43094 = m43094(c8759M43094);
                            c8759M43094.m22740(1);
                            break;
                        case "delimiter":
                            c8759M43094 = m43094(c8759M43094);
                            c8759M43094.m22740(4);
                            break;
                        case "textContainer":
                        case "text":
                            c8759M43094 = m43094(c8759M43094);
                            c8759M43094.m22740(3);
                            continue;
                            break;
                    }
                    break;
                case 9:
                    c8759M43094 = m43094(c8759M43094);
                    try {
                        c8759M43094.m22754(C5242.m14437(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        str = "Failed parsing color value: ";
                        C16523.m38891(str, attributeValue);
                    }
                    break;
                case 10:
                    C8759 c8759M43095 = m43094(c8759M43094);
                    Matcher matcher = f60412.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e) {
                            C0303.m1852("Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        C16523.m38891("Invalid value for shear: ", attributeValue);
                    }
                    c8759M43095.m22753(fMin);
                    c8759M43094 = c8759M43095;
                    continue;
                    break;
                case 11:
                    String strM46675 = C20733.m46672(attributeValue);
                    strM46675.getClass();
                    if (strM46675.equals(ProviderConfigurationPermission.ALL_STR)) {
                        c8759M43094 = m43094(c8759M43094);
                        c8759M43094.m22729(true);
                    } else if (strM46675.equals("none")) {
                        c8759M43094 = m43094(c8759M43094);
                        c8759M43094.m22729(false);
                        continue;
                    }
                    break;
                case 12:
                    try {
                        c8759M43094 = m43094(c8759M43094);
                        m43097(attributeValue, c8759M43094);
                        continue;
                    } catch (C4834 unused2) {
                        str = "Failed parsing fontSize value: ";
                        C16523.m38891(str, attributeValue);
                    }
                    break;
                case 13:
                    c8759M43094 = m43094(c8759M43094);
                    c8759M43094.m22737(C22870.m50615(attributeValue));
                    continue;
                    break;
                case 14:
                    String strM46676 = C20733.m46672(attributeValue);
                    strM46676.getClass();
                    if (strM46676.equals("before")) {
                        c8759M43094 = m43094(c8759M43094);
                        c8759M43094.m22727(1);
                    } else if (strM46676.equals("after")) {
                        c8759M43094 = m43094(c8759M43094);
                        c8759M43094.m22727(2);
                        continue;
                    }
                    break;
                case 15:
                    c8759M43094 = m43094(c8759M43094);
                    try {
                        c8759M43094.m22733(C5242.m14437(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused3) {
                        str = "Failed parsing background value: ";
                        C16523.m38891(str, attributeValue);
                    }
                    break;
                case 16:
                    c8759M43094 = m43094(c8759M43094);
                    String strM46677 = C20733.m46672(attributeValue);
                    strM46677.getClass();
                    switch (strM46677.hashCode()) {
                        case -1364013995:
                            if (strM46677.equals("center")) {
                            }
                            break;
                        case 100571:
                            if (strM46677.equals("end")) {
                            }
                            break;
                        case 3317767:
                            if (strM46677.equals("left")) {
                            }
                            break;
                        case 108511772:
                            if (strM46677.equals("right")) {
                            }
                            break;
                        case 109757538:
                            if (!strM46677.equals("start")) {
                            }
                            break;
                        default:
                            break;
                    }
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Switch insn not found in header
                        	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        */
                    /*
                        Method dump skipped, instruction units count: 1210
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: l.C18636.m43095(org.xmlpull.v1.XmlPullParser, l.ۡ۠ܰ):l.ۡ۠ܰ");
                }

                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public static C8759 m43094(C8759 c8759) {
                    return c8759 == null ? new C8759() : c8759;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:31:0x007c  */
                /* JADX WARN: Code duplicated, block: B:71:0x0109  */
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public static C15109 m43096(XmlPullParser xmlPullParser, C15109 c15109, HashMap map, C21458 c21458) throws C4834 {
                    long j;
                    long j2;
                    String[] strArrSplit;
                    int attributeCount = xmlPullParser.getAttributeCount();
                    C8759 c8759M43095 = m43095(xmlPullParser, (C8759) null);
                    String[] strArr = null;
                    String strSubstring = null;
                    String str = "";
                    long jM43093 = -9223372036854775807L;
                    long jM43094 = -9223372036854775807L;
                    long jM43095 = -9223372036854775807L;
                    for (int i = 0; i < attributeCount; i++) {
                        String attributeName = xmlPullParser.getAttributeName(i);
                        String attributeValue = xmlPullParser.getAttributeValue(i);
                        attributeName.getClass();
                        switch (attributeName) {
                            case "region":
                                if (map.containsKey(attributeValue)) {
                                    str = attributeValue;
                                    continue;
                                }
                                break;
                            case "dur":
                                jM43095 = m43093(attributeValue, c21458);
                                continue;
                                break;
                            case "end":
                                jM43094 = m43093(attributeValue, c21458);
                                continue;
                                break;
                            case "begin":
                                jM43093 = m43093(attributeValue, c21458);
                                continue;
                                break;
                            case "style":
                                String strTrim = attributeValue.trim();
                                if (strTrim.isEmpty()) {
                                    strArrSplit = new String[0];
                                } else {
                                    String str2 = C17983.f57504;
                                    strArrSplit = strTrim.split("\\s+", -1);
                                }
                                if (strArrSplit.length > 0) {
                                    strArr = strArrSplit;
                                    break;
                                }
                                break;
                            case "backgroundImage":
                                if (attributeValue.startsWith("#")) {
                                    strSubstring = attributeValue.substring(1);
                                    break;
                                }
                                break;
                        }
                    }
                    if (c15109 != null) {
                        long j3 = c15109.f49335;
                        j = -9223372036854775807L;
                        if (j3 != -9223372036854775807L) {
                            if (jM43093 != -9223372036854775807L) {
                                jM43093 += j3;
                            }
                            if (jM43094 != -9223372036854775807L) {
                                jM43094 += j3;
                            }
                        }
                    } else {
                        j = -9223372036854775807L;
                    }
                    long j4 = jM43093;
                    if (jM43094 != j) {
                        j2 = jM43094;
                    } else if (jM43095 != j) {
                        j2 = j4 + jM43095;
                    } else if (c15109 != null) {
                        long j5 = c15109.f49341;
                        if (j5 != j) {
                            j2 = j5;
                        } else {
                            j2 = jM43094;
                        }
                    } else {
                        j2 = jM43094;
                    }
                    return C15109.m36184(xmlPullParser.getName(), j4, j2, c8759M43095, strArr, str, strSubstring, c15109);
                }

                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public static boolean m43099(String str) {
                    return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals(am.ax) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(e.m) || str.equals("information");
                }

                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public static void m43097(String str, C8759 c8759) throws C4834 {
                    Matcher matcher;
                    String str2 = C17983.f57504;
                    String[] strArrSplit = str.split("\\s+", -1);
                    int length = strArrSplit.length;
                    Pattern pattern = f60413;
                    if (length == 1) {
                        matcher = pattern.matcher(str);
                    } else {
                        if (strArrSplit.length != 2) {
                            throw new C4834(C12441.m30911(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
                        }
                        matcher = pattern.matcher(strArrSplit[1]);
                        C0303.m1848("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                    }
                    if (!matcher.matches()) {
                        throw new C4834(C16523.m38890("Invalid expression for fontSize: '", str, "'."));
                    }
                    String strGroup = matcher.group(3);
                    strGroup.getClass();
                    switch (strGroup) {
                        case "%":
                            c8759.m22748(3);
                            break;
                        case "em":
                            c8759.m22748(2);
                            break;
                        case "px":
                            c8759.m22748(1);
                            break;
                        default:
                            throw new C4834(C16523.m38890("Invalid unit for fontSize: '", strGroup, "'."));
                    }
                    String strGroup2 = matcher.group(1);
                    strGroup2.getClass();
                    c8759.m22732(Float.parseFloat(strGroup2));
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:42:0x00da  */
                /* JADX WARN: Failed to find 'out' block for switch in B:43:0x00db. Please report as an issue. */
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public static long m43093(String str, C21458 c21458) throws C4834 {
                    double d;
                    double d2;
                    double d3;
                    Matcher matcher = f60414.matcher(str);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        double d4 = Long.parseLong(strGroup) * 3600;
                        String strGroup2 = matcher.group(2);
                        strGroup2.getClass();
                        double d5 = d4 + (Long.parseLong(strGroup2) * 60);
                        String strGroup3 = matcher.group(3);
                        strGroup3.getClass();
                        double d6 = d5 + Long.parseLong(strGroup3);
                        String strGroup4 = matcher.group(4);
                        double d7 = d6 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                        String strGroup5 = matcher.group(5);
                        double d8 = d7 + (strGroup5 != null ? Long.parseLong(strGroup5) / c21458.f69756 : 0.0d);
                        String strGroup6 = matcher.group(6);
                        d = d8 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) c21458.f69758)) / ((double) c21458.f69756) : 0.0d);
                    } else {
                        Matcher matcher2 = f60417.matcher(str);
                        if (!matcher2.matches()) {
                            throw new C4834(C0252.m1693("Malformed time expression: ", str));
                        }
                        String strGroup7 = matcher2.group(1);
                        strGroup7.getClass();
                        d = Double.parseDouble(strGroup7);
                        String strGroup8 = matcher2.group(2);
                        strGroup8.getClass();
                        switch (strGroup8) {
                            case "f":
                                d2 = c21458.f69756;
                                d /= d2;
                                break;
                            case "h":
                                d3 = 3600.0d;
                                d *= d3;
                                break;
                            case "m":
                                d3 = 60.0d;
                                d *= d3;
                                break;
                            case "t":
                                d2 = c21458.f69757;
                                d /= d2;
                                break;
                            case "ms":
                                d2 = 1000.0d;
                                d /= d2;
                                break;
                        }
                    }
                    return (long) (d * 1000000.0d);
                }
            }
