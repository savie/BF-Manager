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

/* JADX INFO: renamed from: l.᩷ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QY */
/* JADX INFO: loaded from: classes.dex */
public final class C21784 implements InterfaceC2763 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final XmlPullParserFactory f69471;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f69465 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f69467 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f69468 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f69463 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f69466 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f69464 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f69469 = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C14169 f69470 = new C14169(1, 30.0f, 1);

    @Override // l.InterfaceC2763
    public final /* synthetic */ void reset() {
    }

    public C21784() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f69471 = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final void mo5930(byte[] bArr, int i, int i2, C9474 c9474, InterfaceC8103 interfaceC8103) {
        C20663.m47290(mo5929(i, i2, bArr), c9474, interfaceC8103);
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC24393 mo5929(int i, int i2, byte[] bArr) {
        C14169 c14169;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f69471.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C10595("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C4630 c4630M49403 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C14169 c14169M49404 = f69470;
            int iM49395 = 15;
            C15070 c15070 = null;
            int i3 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C7458 c7458 = (C7458) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c14169M49404 = m49404(xmlPullParserNewPullParser);
                            iM49395 = m49395(xmlPullParserNewPullParser);
                            c4630M49403 = m49403(xmlPullParserNewPullParser);
                        }
                        C4630 c4630 = c4630M49403;
                        C14169 c141610 = c14169M49404;
                        int i4 = iM49395;
                        if (m49402(name)) {
                            if ("head".equals(name)) {
                                c14169 = c141610;
                                m49401(xmlPullParserNewPullParser, map, i4, c4630, map2, map3);
                            } else {
                                c14169 = c141610;
                                try {
                                    C7458 c7458M49397 = m49397(xmlPullParserNewPullParser, c7458, map2, c14169);
                                    arrayDeque.push(c7458M49397);
                                    if (c7458 != null) {
                                        c7458.m20475(c7458M49397);
                                    }
                                } catch (C14695 e) {
                                    C1896.m6514("Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            c14169M49404 = c14169;
                            c4630M49403 = c4630;
                            iM49395 = i4;
                        } else {
                            C1896.m6513("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            c14169 = c141610;
                        }
                        i3++;
                        c14169M49404 = c14169;
                        c4630M49403 = c4630;
                        iM49395 = i4;
                    } else if (eventType == 4) {
                        c7458.getClass();
                        c7458.m20475(C7458.m20466(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C7458 c7459 = (C7458) arrayDeque.peek();
                            c7459.getClass();
                            c15070 = new C15070(c7459, map, map2, map3);
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
            c15070.getClass();
            return c15070;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14169 m49404(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = C7116.f23455;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            C20782.m47564("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        C14169 c14169 = f69470;
        int i2 = c14169.f44818;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = c14169.f44817;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C14169(i2, i * f, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49395(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f69469.matcher(attributeValue);
        if (!matcher.matches()) {
            C1896.m6517("Ignoring malformed cell resolution: ".concat(attributeValue));
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
            C20782.m47564("Invalid cell resolution " + i + " " + i2, z);
            return i2;
        } catch (NumberFormatException unused) {
            C1896.m6517("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C4630 m49403(XmlPullParser xmlPullParser) {
        String strM33739 = C13827.m33739(xmlPullParser, "extent");
        if (strM33739 == null) {
            return null;
        }
        Matcher matcher = f69464.matcher(strM33739);
        if (!matcher.matches()) {
            C1896.m6517("Ignoring non-pixel tts extent: ".concat(strM33739));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C4630(i, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            C1896.m6517("Ignoring malformed tts extent: ".concat(strM33739));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x020d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:97:0x0200  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49401(XmlPullParser xmlPullParser, HashMap map, int i, C4630 c4630, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strM33739;
        C10595 c10595;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        int i3;
        float f6;
        float f7;
        String strM337310;
        C19546 c19546;
        String strM337311;
        C19546 c19547;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (C13827.m33740(xmlPullParser, "style")) {
                String strM337312 = C13827.m33739(xmlPullParser, "style");
                C19546 c19546M49399 = m49399(xmlPullParser, new C19546());
                if (strM337312 != null) {
                    String strTrim = strM337312.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str = C7116.f23455;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str2 : strArrSplit) {
                        c19546M49399.m45088((C19546) map.get(str2));
                    }
                }
                String strM45098 = c19546M49399.m45098();
                if (strM45098 != null) {
                    map.put(strM45098, c19546M49399);
                }
            } else if (C13827.m33740(xmlPullParser, "region")) {
                String strM337313 = C13827.m33739(xmlPullParser, "id");
                if (strM337313 != null) {
                    String strM337314 = C13827.m33739(xmlPullParser, "origin");
                    if (strM337314 == null && (strM337311 = C13827.m33739(xmlPullParser, "style")) != null && (c19547 = (C19546) map.get(strM337311)) != null) {
                        strM337314 = c19547.m45080();
                    }
                    Pattern pattern = f69464;
                    Pattern pattern2 = f69466;
                    if (strM337314 != null) {
                        Matcher matcher = pattern2.matcher(strM337314);
                        Matcher matcher2 = pattern.matcher(strM337314);
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
                                C1896.m6517("Ignoring region with malformed origin: ".concat(strM337314));
                            }
                        } else if (!matcher2.matches()) {
                            C1896.m6517("Ignoring region with unsupported origin: ".concat(strM337314));
                        } else if (c4630 == null) {
                            C1896.m6517("Ignoring region with missing tts:extent: ".concat(strM337314));
                        } else {
                            try {
                                String strGroup3 = matcher2.group(1);
                                strGroup3.getClass();
                                int i4 = Integer.parseInt(strGroup3);
                                String strGroup4 = matcher2.group(2);
                                strGroup4.getClass();
                                int i5 = Integer.parseInt(strGroup4);
                                f = i4 / c4630.f16394;
                                f2 = i5 / c4630.f16393;
                            } catch (NumberFormatException unused2) {
                                C1896.m6517("Ignoring region with malformed origin: ".concat(strM337314));
                            }
                        }
                        c10595 = null;
                    } else {
                        f = 0.0f;
                        f2 = 0.0f;
                    }
                    String strM337315 = C13827.m33739(xmlPullParser, "extent");
                    if (strM337315 == null && (strM337310 = C13827.m33739(xmlPullParser, "style")) != null && (c19546 = (C19546) map.get(strM337310)) != null) {
                        strM337315 = c19546.m45107();
                    }
                    if (strM337315 != null) {
                        Matcher matcher3 = pattern2.matcher(strM337315);
                        Matcher matcher4 = pattern.matcher(strM337315);
                        if (matcher3.matches()) {
                            try {
                                String strGroup5 = matcher3.group(1);
                                strGroup5.getClass();
                                f6 = Float.parseFloat(strGroup5) / 100.0f;
                                String strGroup6 = matcher3.group(2);
                                strGroup6.getClass();
                                f7 = Float.parseFloat(strGroup6) / 100.0f;
                            } catch (NumberFormatException unused3) {
                                C22313.m50377("Ignoring region with malformed extent: ", strM337314);
                                c10595 = null;
                            }
                        } else {
                            if (!matcher4.matches()) {
                                C22313.m50377("Ignoring region with unsupported extent: ", strM337314);
                            } else if (c4630 == null) {
                                C22313.m50377("Ignoring region with missing tts:extent: ", strM337314);
                            } else {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i6 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i7 = Integer.parseInt(strGroup8);
                                f6 = i6 / c4630.f16394;
                                f7 = i7 / c4630.f16393;
                            }
                            c10595 = null;
                        }
                        f4 = f7;
                        f3 = f6;
                    } else {
                        f3 = 1.0f;
                        f4 = 1.0f;
                    }
                    String strM337316 = C13827.m33739(xmlPullParser, "displayAlign");
                    if (strM337316 != null) {
                        String strM21453 = C7914.m21453(strM337316);
                        strM21453.getClass();
                        if (strM21453.equals("center")) {
                            f5 = f2 + (f4 / 2.0f);
                            i2 = 1;
                        } else if (strM21453.equals("after")) {
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
                    String strM337317 = C13827.m33739(xmlPullParser, "writingMode");
                    if (strM337317 != null) {
                        String strM21454 = C7914.m21453(strM337317);
                        strM21454.getClass();
                        switch (strM21454) {
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
                    c10595 = new C10595(strM337313, f, f5, 0, i2, f3, f4, 1, f9, i3);
                } else {
                    c10595 = null;
                }
                if (c10595 != null) {
                    map2.put(c10595.f33637, c10595);
                }
            } else if (C13827.m33740(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (C13827.m33740(xmlPullParser, "image") && (strM33739 = C13827.m33739(xmlPullParser, "id")) != null) {
                        map3.put(strM33739, xmlPullParser.nextText());
                    }
                } while (!C13827.m33741(xmlPullParser, "metadata"));
            }
        } while (!C13827.m33741(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x014b  */
    /* JADX WARN: Code duplicated, block: B:170:0x028e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0317  */
    /* JADX WARN: Code duplicated, block: B:230:0x0388  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19546 m49399(XmlPullParser xmlPullParser, C19546 c19546) {
        byte b;
        String str;
        int attributeCount = xmlPullParser.getAttributeCount();
        C19546 c19546M49398 = c19546;
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
                    b = cb.f82047l;
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
                    c19546M49398 = m49398(c19546M49398);
                    c19546M49398.m45112("italic".equalsIgnoreCase(attributeValue));
                    continue;
                    break;
                case 1:
                    c19546M49398 = m49398(c19546M49398);
                    c19546M49398.m45086(attributeValue);
                    continue;
                    break;
                case 2:
                    c19546M49398 = m49398(c19546M49398);
                    c19546M49398.m45111(attributeValue);
                    continue;
                    break;
                case 3:
                    c19546M49398 = m49398(c19546M49398);
                    String strM21453 = C7914.m21453(attributeValue);
                    strM21453.getClass();
                    switch (strM21453) {
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
                    c19546M49398.m45110(alignment);
                    continue;
                    break;
                case 4:
                    c19546M49398 = m49398(c19546M49398);
                    c19546M49398.m45115(attributeValue);
                    continue;
                    break;
                case 5:
                    String strM21454 = C7914.m21453(attributeValue);
                    strM21454.getClass();
                    switch (strM21454) {
                        case "nounderline":
                            c19546M49398 = m49398(c19546M49398);
                            c19546M49398.m45105(false);
                            break;
                        case "underline":
                            c19546M49398 = m49398(c19546M49398);
                            c19546M49398.m45105(true);
                            break;
                        case "nolinethrough":
                            c19546M49398 = m49398(c19546M49398);
                            c19546M49398.m45095(false);
                            break;
                        case "linethrough":
                            c19546M49398 = m49398(c19546M49398);
                            c19546M49398.m45095(true);
                            continue;
                            break;
                    }
                    break;
                case 6:
                    c19546M49398 = m49398(c19546M49398);
                    c19546M49398.m45089("bold".equalsIgnoreCase(attributeValue));
                    continue;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        c19546M49398 = m49398(c19546M49398);
                        c19546M49398.m45094(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case 8:
                    String strM21455 = C7914.m21453(attributeValue);
                    strM21455.getClass();
                    switch (strM21455) {
                        case "baseContainer":
                        case "base":
                            c19546M49398 = m49398(c19546M49398);
                            c19546M49398.m45104(2);
                            break;
                        case "container":
                            c19546M49398 = m49398(c19546M49398);
                            c19546M49398.m45104(1);
                            break;
                        case "delimiter":
                            c19546M49398 = m49398(c19546M49398);
                            c19546M49398.m45104(4);
                            break;
                        case "textContainer":
                        case "text":
                            c19546M49398 = m49398(c19546M49398);
                            c19546M49398.m45104(3);
                            continue;
                            break;
                    }
                    break;
                case 9:
                    c19546M49398 = m49398(c19546M49398);
                    try {
                        c19546M49398.m45109(C18544.m43128(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        str = "Failed parsing color value: ";
                        C22313.m50377(str, attributeValue);
                    }
                    break;
                case 10:
                    C19546 c19546M49399 = m49398(c19546M49398);
                    Matcher matcher = f69463.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e) {
                            C1896.m6514("Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        C22313.m50377("Invalid value for shear: ", attributeValue);
                    }
                    c19546M49399.m45108(fMin);
                    c19546M49398 = c19546M49399;
                    continue;
                    break;
                case 11:
                    String strM21456 = C7914.m21453(attributeValue);
                    strM21456.getClass();
                    if (strM21456.equals(ProviderConfigurationPermission.ALL_STR)) {
                        c19546M49398 = m49398(c19546M49398);
                        c19546M49398.m45116(true);
                    } else if (strM21456.equals("none")) {
                        c19546M49398 = m49398(c19546M49398);
                        c19546M49398.m45116(false);
                        continue;
                    }
                    break;
                case 12:
                    try {
                        c19546M49398 = m49398(c19546M49398);
                        m49400(attributeValue, c19546M49398);
                        continue;
                    } catch (C14695 unused2) {
                        str = "Failed parsing fontSize value: ";
                        C22313.m50377(str, attributeValue);
                    }
                    break;
                case 13:
                    c19546M49398 = m49398(c19546M49398);
                    c19546M49398.m45087(C8949.m23917(attributeValue));
                    continue;
                    break;
                case 14:
                    String strM21457 = C7914.m21453(attributeValue);
                    strM21457.getClass();
                    if (strM21457.equals("before")) {
                        c19546M49398 = m49398(c19546M49398);
                        c19546M49398.m45114(1);
                    } else if (strM21457.equals("after")) {
                        c19546M49398 = m49398(c19546M49398);
                        c19546M49398.m45114(2);
                        continue;
                    }
                    break;
                case 15:
                    c19546M49398 = m49398(c19546M49398);
                    try {
                        c19546M49398.m45084(C18544.m43128(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused3) {
                        str = "Failed parsing background value: ";
                        C22313.m50377(str, attributeValue);
                    }
                    break;
                case 16:
                    c19546M49398 = m49398(c19546M49398);
                    String strM21458 = C7914.m21453(attributeValue);
                    strM21458.getClass();
                    switch (strM21458.hashCode()) {
                        case -1364013995:
                            if (strM21458.equals("center")) {
                            }
                            break;
                        case 100571:
                            if (strM21458.equals("end")) {
                            }
                            break;
                        case 3317767:
                            if (strM21458.equals("left")) {
                            }
                            break;
                        case 108511772:
                            if (strM21458.equals("right")) {
                            }
                            break;
                        case 109757538:
                            if (!strM21458.equals("start")) {
                            }
                            break;
                        default:
                            break;
                    }
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Switch insn not found in header
                        	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
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
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        Method dump skipped, instruction units count: 1210
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: l.C21784.m49399(org.xmlpull.v1.XmlPullParser, l.ᩴۗ᩷):l.ᩴۗ᩷");
                }

                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public static C19546 m49398(C19546 c19546) {
                    return c19546 == null ? new C19546() : c19546;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:31:0x007c  */
                /* JADX WARN: Code duplicated, block: B:71:0x0109  */
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public static C7458 m49397(XmlPullParser xmlPullParser, C7458 c7458, HashMap map, C14169 c14169) throws C14695 {
                    long j;
                    long j2;
                    String[] strArrSplit;
                    int attributeCount = xmlPullParser.getAttributeCount();
                    C19546 c19546M49399 = m49399(xmlPullParser, (C19546) null);
                    String[] strArr = null;
                    String strSubstring = null;
                    String str = "";
                    long jM49396 = -9223372036854775807L;
                    long jM49397 = -9223372036854775807L;
                    long jM49398 = -9223372036854775807L;
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
                                jM49398 = m49396(attributeValue, c14169);
                                continue;
                                break;
                            case "end":
                                jM49397 = m49396(attributeValue, c14169);
                                continue;
                                break;
                            case "begin":
                                jM49396 = m49396(attributeValue, c14169);
                                continue;
                                break;
                            case "style":
                                String strTrim = attributeValue.trim();
                                if (strTrim.isEmpty()) {
                                    strArrSplit = new String[0];
                                } else {
                                    String str2 = C7116.f23455;
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
                    if (c7458 != null) {
                        long j3 = c7458.f24567;
                        j = -9223372036854775807L;
                        if (j3 != -9223372036854775807L) {
                            if (jM49396 != -9223372036854775807L) {
                                jM49396 += j3;
                            }
                            if (jM49397 != -9223372036854775807L) {
                                jM49397 += j3;
                            }
                        }
                    } else {
                        j = -9223372036854775807L;
                    }
                    long j4 = jM49396;
                    if (jM49397 != j) {
                        j2 = jM49397;
                    } else if (jM49398 != j) {
                        j2 = j4 + jM49398;
                    } else if (c7458 != null) {
                        long j5 = c7458.f24577;
                        if (j5 != j) {
                            j2 = j5;
                        } else {
                            j2 = jM49397;
                        }
                    } else {
                        j2 = jM49397;
                    }
                    return C7458.m20467(xmlPullParser.getName(), j4, j2, c19546M49399, strArr, str, strSubstring, c7458);
                }

                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public static boolean m49402(String str) {
                    return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals(am.ax) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(e.m) || str.equals("information");
                }

                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public static void m49400(String str, C19546 c19546) throws C14695 {
                    Matcher matcher;
                    String str2 = C7116.f23455;
                    String[] strArrSplit = str.split("\\s+", -1);
                    int length = strArrSplit.length;
                    Pattern pattern = f69468;
                    if (length == 1) {
                        matcher = pattern.matcher(str);
                    } else {
                        if (strArrSplit.length != 2) {
                            throw new C14695(C12669.m31437(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
                        }
                        matcher = pattern.matcher(strArrSplit[1]);
                        C1896.m6517("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                    }
                    if (!matcher.matches()) {
                        throw new C14695(C14442.m34865("Invalid expression for fontSize: '", str, "'."));
                    }
                    String strGroup = matcher.group(3);
                    strGroup.getClass();
                    switch (strGroup) {
                        case "%":
                            c19546.m45093(3);
                            break;
                        case "em":
                            c19546.m45093(2);
                            break;
                        case "px":
                            c19546.m45093(1);
                            break;
                        default:
                            throw new C14695(C14442.m34865("Invalid unit for fontSize: '", strGroup, "'."));
                    }
                    String strGroup2 = matcher.group(1);
                    strGroup2.getClass();
                    c19546.m45083(Float.parseFloat(strGroup2));
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:42:0x00da  */
                /* JADX WARN: Failed to find 'out' block for switch in B:43:0x00db. Please report as an issue. */
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public static long m49396(String str, C14169 c14169) throws C14695 {
                    double d;
                    double d2;
                    double d3;
                    Matcher matcher = f69465.matcher(str);
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
                        double d8 = d7 + (strGroup5 != null ? Long.parseLong(strGroup5) / c14169.f44816 : 0.0d);
                        String strGroup6 = matcher.group(6);
                        d = d8 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) c14169.f44818)) / ((double) c14169.f44816) : 0.0d);
                    } else {
                        Matcher matcher2 = f69467.matcher(str);
                        if (!matcher2.matches()) {
                            throw new C14695(C25272.m56409("Malformed time expression: ", str));
                        }
                        String strGroup7 = matcher2.group(1);
                        strGroup7.getClass();
                        d = Double.parseDouble(strGroup7);
                        String strGroup8 = matcher2.group(2);
                        strGroup8.getClass();
                        switch (strGroup8) {
                            case "f":
                                d2 = c14169.f44816;
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
                                d2 = c14169.f44817;
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
