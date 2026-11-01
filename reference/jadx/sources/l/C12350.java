package l;

import android.graphics.Matrix;
import android.util.Xml;
import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.prng.X931RNG;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.۫ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes3.dex */
public final class C12350 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f41260;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f41265;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f41266;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C11644 f41268 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC17952 f41261 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f41264 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f41259 = false;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC20111 f41258 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public StringBuilder f41267 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f41262 = false;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public StringBuilder f41263 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11644 m30711(InputStream inputStream, boolean z) {
        this.f41265 = z;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            m30704(inputStream);
            if (z && !this.f41260) {
                throw new C8116("SVG root element is missing");
            }
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            return this.f41268;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m30704(InputStream inputStream) throws C8116 {
        String text;
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                C16583 c16583 = new C16583(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        this.f41268 = new C11644();
                        this.f41260 = false;
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        C0354 c0354 = new C0354(xmlPullParserNewPullParser.getText());
                        String strM2041 = c0354.m2041();
                        m30699(c0354);
                        strM2041.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (this.f41268.m29094() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                m30676(inputStream);
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        m30679(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, c16583);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        m30678(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        m30695(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        m30708(xmlPullParserNewPullParser.getText());
                    } else if (eventType == 6 && (text = xmlPullParserNewPullParser.getText()) != null) {
                        m30708(text);
                    }
                }
            } catch (XmlPullParserException e) {
                throw new C8116("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new C8116("Stream error", e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30676(InputStream inputStream) throws C8116 {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            if (this.f41265) {
                sAXParserFactoryNewInstance.setNamespaceAware(true);
            }
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            C20816 c20816 = new C20816(this);
            xMLReader.setContentHandler(c20816);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", c20816);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new C8116("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new C8116("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new C8116("SVG parse error", e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30685(C12350 c12350) {
        c12350.f41268 = new C11644();
        c12350.f41260 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:463:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:466:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:787:0x0907 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:0x0903 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m30679(String str, String str2, String str3, Attributes attributes) throws C8116 {
        int iIntValue;
        float fM2042;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        char cCharAt;
        boolean z;
        Attributes attributes2 = attributes;
        if (this.f41265 && !this.f41260) {
            if (!"svg".equals(str2.length() > 0 ? str2 : str3) || (!"http://www.w3.org/2000/svg".equals(str) && !"".equals(str))) {
                throw new C8116("Image XML root is not SVG");
            }
            this.f41260 = true;
        }
        if (this.f41264) {
            this.f41266++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            EnumC20111 enumC20111M45474 = EnumC20111.m45474(str2.length() > 0 ? str2 : str3);
            int i2 = 77;
            switch (enumC20111M45474.ordinal()) {
                case 0:
                    m30706(attributes2);
                    return;
                case 1:
                case 7:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C8385 c8385 = new C8385();
                    c8385.f30200 = this.f41268;
                    c8385.f30201 = this.f41261;
                    m30683((AbstractC8075) c8385, attributes2);
                    m30705(c8385, attributes2);
                    m30691((InterfaceC19674) c8385, attributes2);
                    m30693((InterfaceC22892) c8385, attributes2);
                    this.f41261.mo6530(c8385);
                    this.f41261 = c8385;
                    return;
                case 2:
                    m30694(attributes2);
                    return;
                case 3:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C13324 c13324 = new C13324();
                    c13324.f30200 = this.f41268;
                    c13324.f30201 = this.f41261;
                    m30683((AbstractC8075) c13324, attributes2);
                    m30705(c13324, attributes2);
                    m30691((InterfaceC19674) c13324, attributes2);
                    m30693((InterfaceC22892) c13324, attributes2);
                    for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                        String strTrim = attributes2.getValue(i3).trim();
                        if (EnumC15878.m37752(attributes2.getLocalName(i3)).ordinal() == 3) {
                            if ("objectBoundingBox".equals(strTrim)) {
                                c13324.f44234 = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim)) {
                                    throw new C8116("Invalid value for attribute clipPathUnits");
                                }
                                c13324.f44234 = Boolean.TRUE;
                            }
                        }
                    }
                    this.f41261.mo6530(c13324);
                    this.f41261 = c13324;
                    return;
                case 4:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C23202 c23202 = new C23202();
                    c23202.f30200 = this.f41268;
                    c23202.f30201 = this.f41261;
                    m30683((AbstractC8075) c23202, attributes2);
                    m30705(c23202, attributes2);
                    m30691((InterfaceC19674) c23202, attributes2);
                    this.f41261.mo6530(c23202);
                    this.f41261 = c23202;
                    return;
                case 5:
                case 26:
                    this.f41259 = true;
                    this.f41258 = enumC20111M45474;
                    return;
                case 6:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C15441 c15441 = new C15441();
                    c15441.f30200 = this.f41268;
                    c15441.f30201 = this.f41261;
                    m30683((AbstractC8075) c15441, attributes2);
                    m30705(c15441, attributes2);
                    m30691((InterfaceC19674) c15441, attributes2);
                    m30693((InterfaceC22892) c15441, attributes2);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String strTrim2 = attributes2.getValue(i4).trim();
                        int iOrdinal = EnumC15878.m37752(attributes2.getLocalName(i4)).ordinal();
                        if (iOrdinal == 6) {
                            c15441.f50323 = m30669(strTrim2);
                        } else if (iOrdinal == 7) {
                            c15441.f50321 = m30669(strTrim2);
                        } else if (iOrdinal == 56) {
                            C10502 c10502M30669 = m30669(strTrim2);
                            c15441.f50324 = c10502M30669;
                            if (c10502M30669.m26655()) {
                                throw new C8116("Invalid <ellipse> element. rx cannot be negative");
                            }
                        } else if (iOrdinal != 57) {
                            continue;
                        } else {
                            C10502 c10502M306610 = m30669(strTrim2);
                            c15441.f50322 = c10502M306610;
                            if (c10502M306610.m26655()) {
                                throw new C8116("Invalid <ellipse> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f41261.mo6530(c15441);
                    return;
                case 8:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C9091 c9091 = new C9091();
                    c9091.f30200 = this.f41268;
                    c9091.f30201 = this.f41261;
                    m30683((AbstractC8075) c9091, attributes2);
                    m30705(c9091, attributes2);
                    m30691((InterfaceC19674) c9091, attributes2);
                    m30693((InterfaceC22892) c9091, attributes2);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String strTrim3 = attributes2.getValue(i5).trim();
                        int iOrdinal2 = EnumC15878.m37752(attributes2.getLocalName(i5)).ordinal();
                        if (iOrdinal2 == 25) {
                            C10502 c10502M306611 = m30669(strTrim3);
                            c9091.f31002 = c10502M306611;
                            if (c10502M306611.m26655()) {
                                throw new C8116("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iOrdinal2 != 26) {
                            if (iOrdinal2 != 48) {
                                switch (iOrdinal2) {
                                    case 81:
                                        C10502 c10502M306612 = m30669(strTrim3);
                                        c9091.f31000 = c10502M306612;
                                        if (c10502M306612.m26655()) {
                                            throw new C8116("Invalid <use> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        c9091.f31001 = m30669(strTrim3);
                                        break;
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        c9091.f30998 = m30669(strTrim3);
                                        break;
                                }
                            } else {
                                m30681(c9091, strTrim3);
                            }
                        } else if ("".equals(attributes2.getURI(i5)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i5))) {
                            c9091.f30999 = strTrim3;
                        }
                    }
                    this.f41261.mo6530(c9091);
                    this.f41261 = c9091;
                    return;
                case 9:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C7679 c7679 = new C7679();
                    c7679.f30200 = this.f41268;
                    c7679.f30201 = this.f41261;
                    m30683((AbstractC8075) c7679, attributes2);
                    m30705(c7679, attributes2);
                    m30691((InterfaceC19674) c7679, attributes2);
                    m30693((InterfaceC22892) c7679, attributes2);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String strTrim4 = attributes2.getValue(i6).trim();
                        switch (EnumC15878.m37752(attributes2.getLocalName(i6)).ordinal()) {
                            case 84:
                                c7679.f25427 = m30669(strTrim4);
                                break;
                            case 85:
                                c7679.f25428 = m30669(strTrim4);
                                break;
                            case HRSS1373Polynomial.K /* 86 */:
                                c7679.f25425 = m30669(strTrim4);
                                break;
                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                c7679.f25426 = m30669(strTrim4);
                                break;
                        }
                    }
                    this.f41261.mo6530(c7679);
                    return;
                case 10:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C19364 c19364 = new C19364();
                    c19364.f30200 = this.f41268;
                    c19364.f30201 = this.f41261;
                    m30683((AbstractC8075) c19364, attributes2);
                    m30705(c19364, attributes2);
                    m30692((AbstractC21790) c19364, attributes2);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String strTrim5 = attributes2.getValue(i7).trim();
                        switch (EnumC15878.m37752(attributes2.getLocalName(i7)).ordinal()) {
                            case 84:
                                c19364.f62421 = m30669(strTrim5);
                                break;
                            case 85:
                                c19364.f62420 = m30669(strTrim5);
                                break;
                            case HRSS1373Polynomial.K /* 86 */:
                                c19364.f62419 = m30669(strTrim5);
                                break;
                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                c19364.f62418 = m30669(strTrim5);
                                break;
                        }
                    }
                    this.f41261.mo6530(c19364);
                    this.f41261 = c19364;
                    return;
                case 11:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C21084 c21084 = new C21084();
                    c21084.f30200 = this.f41268;
                    c21084.f30201 = this.f41261;
                    m30683((AbstractC8075) c21084, attributes2);
                    m30705(c21084, attributes2);
                    m30693((InterfaceC22892) c21084, attributes2);
                    m30690((AbstractC15837) c21084, attributes2);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String strTrim6 = attributes2.getValue(i8).trim();
                        int iOrdinal3 = EnumC15878.m37752(attributes2.getLocalName(i8)).ordinal();
                        if (iOrdinal3 != 41) {
                            if (iOrdinal3 == 50) {
                                c21084.f68682 = m30669(strTrim6);
                            } else if (iOrdinal3 != 51) {
                                switch (iOrdinal3) {
                                    case 32:
                                        C10502 c10502M306613 = m30669(strTrim6);
                                        c21084.f68683 = c10502M306613;
                                        if (c10502M306613.m26655()) {
                                            throw new C8116("Invalid <marker> element. markerHeight cannot be negative");
                                        }
                                        break;
                                    case 33:
                                        if (!"strokeWidth".equals(strTrim6)) {
                                            if (!"userSpaceOnUse".equals(strTrim6)) {
                                                throw new C8116("Invalid value for attribute markerUnits");
                                            }
                                            c21084.f68686 = true;
                                        } else {
                                            c21084.f68686 = false;
                                        }
                                        break;
                                    case 34:
                                        C10502 c10502M306614 = m30669(strTrim6);
                                        c21084.f68684 = c10502M306614;
                                        if (c10502M306614.m26655()) {
                                            throw new C8116("Invalid <marker> element. markerWidth cannot be negative");
                                        }
                                        break;
                                }
                            } else {
                                c21084.f68687 = m30669(strTrim6);
                            }
                        } else if ("auto".equals(strTrim6)) {
                            c21084.f68685 = Float.valueOf(Float.NaN);
                        } else {
                            c21084.f68685 = Float.valueOf(m30670(strTrim6));
                        }
                    }
                    this.f41261.mo6530(c21084);
                    this.f41261 = c21084;
                    return;
                case 12:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C16146 c16146 = new C16146();
                    c16146.f30200 = this.f41268;
                    c16146.f30201 = this.f41261;
                    m30683((AbstractC8075) c16146, attributes);
                    m30705(c16146, attributes);
                    m30693((InterfaceC22892) c16146, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String strTrim7 = attributes.getValue(i9).trim();
                        int iOrdinal4 = EnumC15878.m37752(attributes.getLocalName(i9)).ordinal();
                        if (iOrdinal4 == 25) {
                            C10502 c10502M306615 = m30669(strTrim7);
                            c16146.f52175 = c10502M306615;
                            if (c10502M306615.m26655()) {
                                throw new C8116("Invalid <mask> element. height cannot be negative");
                            }
                        } else if (iOrdinal4 != 36) {
                            if (iOrdinal4 != 37) {
                                switch (iOrdinal4) {
                                    case 81:
                                        C10502 c10502M306616 = m30669(strTrim7);
                                        c16146.f52177 = c10502M306616;
                                        if (c10502M306616.m26655()) {
                                            throw new C8116("Invalid <mask> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        m30669(strTrim7);
                                        break;
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        m30669(strTrim7);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim7)) {
                                c16146.f52174 = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim7)) {
                                    throw new C8116("Invalid value for attribute maskUnits");
                                }
                                c16146.f52174 = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim7)) {
                            c16146.f52176 = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim7)) {
                                throw new C8116("Invalid value for attribute maskContentUnits");
                            }
                            c16146.f52176 = Boolean.TRUE;
                        }
                    }
                    this.f41261.mo6530(c16146);
                    this.f41261 = c16146;
                    return;
                case 13:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C16851 c16851 = new C16851();
                    c16851.f30200 = this.f41268;
                    c16851.f30201 = this.f41261;
                    m30683((AbstractC8075) c16851, attributes2);
                    m30705(c16851, attributes2);
                    m30691((InterfaceC19674) c16851, attributes2);
                    m30693((InterfaceC22892) c16851, attributes2);
                    int i10 = 0;
                    while (i10 < attributes.getLength()) {
                        String strTrim8 = attributes2.getValue(i10).trim();
                        int iOrdinal5 = EnumC15878.m37752(attributes2.getLocalName(i10)).ordinal();
                        if (iOrdinal5 == 13) {
                            C0354 c0354 = new C0354(strTrim8);
                            C12618 c12618 = new C12618();
                            if (!c0354.m2054() && ((iIntValue = c0354.m2052().intValue()) == i2 || iIntValue == 109)) {
                                float f5 = 0.0f;
                                float fM2043 = 0.0f;
                                float f6 = 0.0f;
                                float fM2044 = 0.0f;
                                float f7 = 0.0f;
                                float f8 = 0.0f;
                                while (true) {
                                    c0354.m2051();
                                    switch (iIntValue) {
                                        case 65:
                                        case 97:
                                            float fM2045 = c0354.m2042();
                                            float fM2046 = c0354.m2044(fM2045);
                                            float fM2047 = c0354.m2044(fM2046);
                                            Boolean boolM2046 = c0354.m2046(Float.valueOf(fM2047));
                                            Boolean boolM2047 = c0354.m2046(boolM2046);
                                            if (boolM2047 == null) {
                                                fM2042 = Float.NaN;
                                            } else {
                                                c0354.m2043();
                                                fM2042 = c0354.m2042();
                                            }
                                            float fM2048 = c0354.m2044(fM2042);
                                            if (!Float.isNaN(fM2048)) {
                                                if (fM2045 >= 0.0f && fM2046 >= 0.0f) {
                                                    if (iIntValue == 97) {
                                                        fM2042 += f5;
                                                        fM2048 += f6;
                                                    }
                                                    f5 = fM2042;
                                                    float f9 = fM2048;
                                                    c12618.mo4007(fM2045, fM2046, fM2047, boolM2046.booleanValue(), boolM2047.booleanValue(), f5, f9);
                                                    fM2044 = f9;
                                                    fM2043 = f5;
                                                    f6 = fM2044;
                                                    c0354.m2043();
                                                    if (c0354.m2054()) {
                                                        i = c0354.f1783;
                                                        if (i != c0354.f1785 && (((cCharAt = c0354.f1782.charAt(i)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                                            iIntValue = c0354.m2052().intValue();
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 67:
                                        case q.f /* 99 */:
                                            float fM2049 = c0354.m2042();
                                            float fM20410 = c0354.m2044(fM2049);
                                            float fM20411 = c0354.m2044(fM20410);
                                            float fM20412 = c0354.m2044(fM20411);
                                            float fM20413 = c0354.m2044(fM20412);
                                            float fM20414 = c0354.m2044(fM20413);
                                            if (!Float.isNaN(fM20414)) {
                                                if (iIntValue == 99) {
                                                    fM20413 += f5;
                                                    fM20414 += f6;
                                                    fM2049 += f5;
                                                    fM20410 += f6;
                                                    fM20411 += f5;
                                                    fM20412 += f6;
                                                }
                                                f = fM20411;
                                                f2 = fM20412;
                                                f3 = fM20413;
                                                f4 = fM20414;
                                                c12618.mo4006(fM2049, fM20410, f, f2, f3, f4);
                                                fM2043 = f;
                                                fM2044 = f2;
                                                f5 = f3;
                                                f6 = f4;
                                                c0354.m2043();
                                                if (c0354.m2054()) {
                                                    i = c0354.f1783;
                                                    if (i != c0354.f1785) {
                                                        iIntValue = c0354.m2052().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 72:
                                        case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                            fM2043 = c0354.m2042();
                                            if (!Float.isNaN(fM2043)) {
                                                if (iIntValue == 104) {
                                                    fM2043 += f5;
                                                }
                                                c12618.mo4008(fM2043, f6);
                                                f5 = fM2043;
                                                c0354.m2043();
                                                if (c0354.m2054()) {
                                                    i = c0354.f1783;
                                                    if (i != c0354.f1785) {
                                                        iIntValue = c0354.m2052().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                        case 108:
                                            float fM20415 = c0354.m2042();
                                            fM2044 = c0354.m2044(fM20415);
                                            if (!Float.isNaN(fM2044)) {
                                                if (iIntValue == 108) {
                                                    fM20415 += f5;
                                                    fM2044 += f6;
                                                }
                                                f5 = fM20415;
                                                c12618.mo4008(f5, fM2044);
                                                fM2043 = f5;
                                                f6 = fM2044;
                                                c0354.m2043();
                                                if (c0354.m2054()) {
                                                    i = c0354.f1783;
                                                    if (i != c0354.f1785) {
                                                        iIntValue = c0354.m2052().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 77:
                                        case 109:
                                            fM2043 = c0354.m2042();
                                            fM2044 = c0354.m2044(fM2043);
                                            if (!Float.isNaN(fM2044)) {
                                                if (iIntValue == 109 && !c12618.m31405()) {
                                                    fM2043 += f5;
                                                    fM2044 += f6;
                                                }
                                                c12618.mo4004(fM2043, fM2044);
                                                iIntValue = iIntValue == 109 ? 108 : 76;
                                                f5 = fM2043;
                                                f7 = f5;
                                                f6 = fM2044;
                                                f8 = f6;
                                                c0354.m2043();
                                                if (c0354.m2054()) {
                                                    i = c0354.f1783;
                                                    if (i != c0354.f1785) {
                                                        iIntValue = c0354.m2052().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 81:
                                        case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                            fM2043 = c0354.m2042();
                                            fM2044 = c0354.m2044(fM2043);
                                            float fM20416 = c0354.m2044(fM2044);
                                            float fM20417 = c0354.m2044(fM20416);
                                            if (!Float.isNaN(fM20417)) {
                                                if (iIntValue == 113) {
                                                    fM20416 += f5;
                                                    fM20417 += f6;
                                                    fM2043 += f5;
                                                    fM2044 += f6;
                                                }
                                                c12618.mo4005(fM2043, fM2044, fM20416, fM20417);
                                                f5 = fM20416;
                                                f6 = fM20417;
                                                c0354.m2043();
                                                if (c0354.m2054()) {
                                                    i = c0354.f1783;
                                                    if (i != c0354.f1785) {
                                                        iIntValue = c0354.m2052().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        case 115:
                                            float f10 = (f5 * 2.0f) - fM2043;
                                            float f11 = (2.0f * f6) - fM2044;
                                            float fM20418 = c0354.m2042();
                                            float fM20419 = c0354.m2044(fM20418);
                                            float fM20420 = c0354.m2044(fM20419);
                                            float fM20421 = c0354.m2044(fM20420);
                                            if (!Float.isNaN(fM20421)) {
                                                if (iIntValue == 115) {
                                                    fM20420 += f5;
                                                    fM20421 += f6;
                                                    fM20418 += f5;
                                                    fM20419 += f6;
                                                }
                                                f = fM20418;
                                                f2 = fM20419;
                                                f3 = fM20420;
                                                f4 = fM20421;
                                                c12618.mo4006(f10, f11, f, f2, f3, f4);
                                                fM2043 = f;
                                                fM2044 = f2;
                                                f5 = f3;
                                                f6 = f4;
                                                c0354.m2043();
                                                if (c0354.m2054()) {
                                                    i = c0354.f1783;
                                                    if (i != c0354.f1785) {
                                                        iIntValue = c0354.m2052().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 84:
                                        case 116:
                                            float f12 = (f5 * 2.0f) - fM2043;
                                            float f13 = (2.0f * f6) - fM2044;
                                            float fM20422 = c0354.m2042();
                                            float fM20423 = c0354.m2044(fM20422);
                                            if (!Float.isNaN(fM20423)) {
                                                if (iIntValue == 116) {
                                                    fM20422 += f5;
                                                    fM20423 += f6;
                                                }
                                                c12618.mo4005(f12, f13, fM20422, fM20423);
                                                f5 = fM20422;
                                                f6 = fM20423;
                                                fM2043 = f12;
                                                fM2044 = f13;
                                                c0354.m2043();
                                                if (c0354.m2054()) {
                                                    i = c0354.f1783;
                                                    if (i != c0354.f1785) {
                                                        iIntValue = c0354.m2052().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case HRSS1373Polynomial.K /* 86 */:
                                        case 118:
                                            fM2044 = c0354.m2042();
                                            if (!Float.isNaN(fM2044)) {
                                                if (iIntValue == 118) {
                                                    fM2044 += f6;
                                                }
                                                c12618.mo4008(f5, fM2044);
                                                f6 = fM2044;
                                                c0354.m2043();
                                                if (c0354.m2054()) {
                                                    i = c0354.f1783;
                                                    if (i != c0354.f1785) {
                                                        iIntValue = c0354.m2052().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 90:
                                        case 122:
                                            c12618.close();
                                            f5 = f7;
                                            fM2043 = f5;
                                            fM2044 = f8;
                                            f6 = fM2044;
                                            c0354.m2043();
                                            if (c0354.m2054()) {
                                                i = c0354.f1783;
                                                if (i != c0354.f1785) {
                                                    iIntValue = c0354.m2052().intValue();
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }
                            c16851.f53918 = c12618;
                        } else if (iOrdinal5 == 43 && m30670(strTrim8) < 0.0f) {
                            throw new C8116("Invalid <path> element. pathLength cannot be negative");
                        }
                        i10++;
                        i2 = 77;
                        attributes2 = attributes;
                    }
                    this.f41261.mo6530(c16851);
                    return;
                case 14:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C6267 c6267 = new C6267();
                    c6267.f30200 = this.f41268;
                    c6267.f30201 = this.f41261;
                    m30683((AbstractC8075) c6267, attributes2);
                    m30705(c6267, attributes2);
                    m30693((InterfaceC22892) c6267, attributes2);
                    m30690((AbstractC15837) c6267, attributes2);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String strTrim9 = attributes2.getValue(i11).trim();
                        int iOrdinal6 = EnumC15878.m37752(attributes2.getLocalName(i11)).ordinal();
                        if (iOrdinal6 == 25) {
                            C10502 c10502M306617 = m30669(strTrim9);
                            c6267.f21246 = c10502M306617;
                            if (c10502M306617.m26655()) {
                                throw new C8116("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (iOrdinal6 != 26) {
                            switch (iOrdinal6) {
                                case 44:
                                    if (!"objectBoundingBox".equals(strTrim9)) {
                                        if (!"userSpaceOnUse".equals(strTrim9)) {
                                            throw new C8116("Invalid value for attribute patternContentUnits");
                                        }
                                        c6267.f21247 = Boolean.TRUE;
                                    } else {
                                        c6267.f21247 = Boolean.FALSE;
                                    }
                                    break;
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    c6267.f21248 = m30710(strTrim9);
                                    break;
                                case 46:
                                    if (!"objectBoundingBox".equals(strTrim9)) {
                                        if (!"userSpaceOnUse".equals(strTrim9)) {
                                            throw new C8116("Invalid value for attribute patternUnits");
                                        }
                                        c6267.f21245 = Boolean.TRUE;
                                    } else {
                                        c6267.f21245 = Boolean.FALSE;
                                    }
                                    break;
                                default:
                                    switch (iOrdinal6) {
                                        case 81:
                                            C10502 c10502M306618 = m30669(strTrim9);
                                            c6267.f21252 = c10502M306618;
                                            if (c10502M306618.m26655()) {
                                                throw new C8116("Invalid <pattern> element. width cannot be negative");
                                            }
                                            break;
                                            break;
                                        case 82:
                                            c6267.f21249 = m30669(strTrim9);
                                            break;
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                            c6267.f21251 = m30669(strTrim9);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("".equals(attributes2.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i11))) {
                            c6267.f21250 = strTrim9;
                        }
                    }
                    this.f41261.mo6530(c6267);
                    this.f41261 = c6267;
                    return;
                case 15:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C23907 c23907 = new C23907();
                    c23907.f30200 = this.f41268;
                    c23907.f30201 = this.f41261;
                    m30683((AbstractC8075) c23907, attributes2);
                    m30705(c23907, attributes2);
                    m30691((InterfaceC19674) c23907, attributes2);
                    m30693((InterfaceC22892) c23907, attributes2);
                    m30684(c23907, attributes2, "polygon");
                    this.f41261.mo6530(c23907);
                    return;
                case 16:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C11207 c11207 = new C11207();
                    c11207.f30200 = this.f41268;
                    c11207.f30201 = this.f41261;
                    m30683((AbstractC8075) c11207, attributes2);
                    m30705(c11207, attributes2);
                    m30691((InterfaceC19674) c11207, attributes2);
                    m30693((InterfaceC22892) c11207, attributes2);
                    m30684(c11207, attributes2, "polyline");
                    this.f41261.mo6530(c11207);
                    return;
                case 17:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C20775 c20775 = new C20775();
                    c20775.f30200 = this.f41268;
                    c20775.f30201 = this.f41261;
                    m30683((AbstractC8075) c20775, attributes2);
                    m30705(c20775, attributes2);
                    m30692((AbstractC21790) c20775, attributes2);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        String strTrim10 = attributes2.getValue(i12).trim();
                        int iOrdinal7 = EnumC15878.m37752(attributes2.getLocalName(i12)).ordinal();
                        if (iOrdinal7 == 6) {
                            c20775.f67577 = m30669(strTrim10);
                        } else if (iOrdinal7 == 7) {
                            c20775.f67574 = m30669(strTrim10);
                        } else if (iOrdinal7 == 11) {
                            c20775.f67575 = m30669(strTrim10);
                        } else if (iOrdinal7 == 12) {
                            c20775.f67573 = m30669(strTrim10);
                        } else if (iOrdinal7 != 49) {
                            continue;
                        } else {
                            C10502 c10502M306619 = m30669(strTrim10);
                            c20775.f67576 = c10502M306619;
                            if (c10502M306619.m26655()) {
                                throw new C8116("Invalid <radialGradient> element. r cannot be negative");
                            }
                        }
                    }
                    this.f41261.mo6530(c20775);
                    this.f41261 = c20775;
                    return;
                case 18:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C14735 c14735 = new C14735();
                    c14735.f30200 = this.f41268;
                    c14735.f30201 = this.f41261;
                    m30683((AbstractC8075) c14735, attributes2);
                    m30705(c14735, attributes2);
                    m30691((InterfaceC19674) c14735, attributes2);
                    m30693((InterfaceC22892) c14735, attributes2);
                    for (int i13 = 0; i13 < attributes.getLength(); i13++) {
                        String strTrim11 = attributes2.getValue(i13).trim();
                        int iOrdinal8 = EnumC15878.m37752(attributes2.getLocalName(i13)).ordinal();
                        if (iOrdinal8 == 25) {
                            C10502 c10502M306620 = m30669(strTrim11);
                            c14735.f48171 = c10502M306620;
                            if (c10502M306620.m26655()) {
                                throw new C8116("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (iOrdinal8 == 56) {
                            C10502 c10502M306621 = m30669(strTrim11);
                            c14735.f48168 = c10502M306621;
                            if (c10502M306621.m26655()) {
                                throw new C8116("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (iOrdinal8 != 57) {
                            switch (iOrdinal8) {
                                case 81:
                                    C10502 c10502M306622 = m30669(strTrim11);
                                    c14735.f48169 = c10502M306622;
                                    if (c10502M306622.m26655()) {
                                        throw new C8116("Invalid <rect> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c14735.f48170 = m30669(strTrim11);
                                    break;
                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    c14735.f48167 = m30669(strTrim11);
                                    break;
                            }
                        } else {
                            C10502 c10502M306623 = m30669(strTrim11);
                            c14735.f48172 = c10502M306623;
                            if (c10502M306623.m26655()) {
                                throw new C8116("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f41261.mo6530(c14735);
                    return;
                case 19:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C2033 c2033 = new C2033();
                    c2033.f30200 = this.f41268;
                    c2033.f30201 = this.f41261;
                    m30683(c2033, attributes2);
                    m30705(c2033, attributes2);
                    this.f41261.mo6530(c2033);
                    this.f41261 = c2033;
                    return;
                case 20:
                    InterfaceC17952 interfaceC17952 = this.f41261;
                    if (interfaceC17952 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC17952 instanceof AbstractC21790)) {
                        throw new C8116("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                    }
                    C9796 c9796 = new C9796();
                    c9796.f30200 = this.f41268;
                    c9796.f30201 = this.f41261;
                    m30683(c9796, attributes2);
                    m30705(c9796, attributes2);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim12 = attributes2.getValue(i14).trim();
                        if (EnumC15878.m37752(attributes2.getLocalName(i14)).ordinal() == 39) {
                            if (strTrim12.length() == 0) {
                                throw new C8116("Invalid offset value in <stop> (empty string)");
                            }
                            int length = strTrim12.length();
                            if (C3184.m9601(1, strTrim12) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float fM30672 = m30672(length, strTrim12);
                                float f14 = 100.0f;
                                if (z) {
                                    fM30672 /= 100.0f;
                                }
                                if (fM30672 < 0.0f) {
                                    f14 = 0.0f;
                                } else if (fM30672 <= 100.0f) {
                                    f14 = fM30672;
                                }
                                c9796.f33522 = Float.valueOf(f14);
                            } catch (NumberFormatException e) {
                                throw new C8116("Invalid offset value in <stop>: ".concat(strTrim12), e);
                            }
                        }
                    }
                    this.f41261.mo6530(c9796);
                    this.f41261 = c9796;
                    return;
                case 21:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    String str4 = ProviderConfigurationPermission.ALL_STR;
                    boolean zEquals = true;
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        String strTrim13 = attributes2.getValue(i15).trim();
                        int iOrdinal9 = EnumC15878.m37752(attributes2.getLocalName(i15)).ordinal();
                        if (iOrdinal9 == 38) {
                            str4 = strTrim13;
                        } else if (iOrdinal9 == 77) {
                            zEquals = strTrim13.equals("text/css");
                        }
                    }
                    if (zEquals && C1703.m5657(str4, EnumC19343.screen)) {
                        this.f41262 = true;
                        return;
                    } else {
                        this.f41264 = true;
                        this.f41266 = 1;
                        return;
                    }
                case 22:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C20070 c20070 = new C20070();
                    c20070.f30200 = this.f41268;
                    c20070.f30201 = this.f41261;
                    m30683((AbstractC8075) c20070, attributes2);
                    m30705(c20070, attributes2);
                    m30691((InterfaceC19674) c20070, attributes2);
                    m30693((InterfaceC22892) c20070, attributes2);
                    this.f41261.mo6530(c20070);
                    this.f41261 = c20070;
                    return;
                case 23:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C0313 c0313 = new C0313();
                    c0313.f30200 = this.f41268;
                    c0313.f30201 = this.f41261;
                    m30683((AbstractC8075) c0313, attributes2);
                    m30705(c0313, attributes2);
                    m30693((InterfaceC22892) c0313, attributes2);
                    m30690((AbstractC15837) c0313, attributes2);
                    this.f41261.mo6530(c0313);
                    this.f41261 = c0313;
                    return;
                case 24:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C17247 c17247 = new C17247();
                    c17247.f30200 = this.f41268;
                    c17247.f30201 = this.f41261;
                    m30683((AbstractC8075) c17247, attributes2);
                    m30705(c17247, attributes2);
                    m30691((InterfaceC19674) c17247, attributes2);
                    m30693((InterfaceC22892) c17247, attributes2);
                    m30689((AbstractC14426) c17247, attributes2);
                    this.f41261.mo6530(c17247);
                    this.f41261 = c17247;
                    return;
                case 25:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C23598 c23598 = new C23598();
                    c23598.f30200 = this.f41268;
                    c23598.f30201 = this.f41261;
                    m30683((AbstractC8075) c23598, attributes2);
                    m30705(c23598, attributes2);
                    m30693((InterfaceC22892) c23598, attributes2);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String strTrim14 = attributes2.getValue(i16).trim();
                        int iOrdinal10 = EnumC15878.m37752(attributes2.getLocalName(i16)).ordinal();
                        if (iOrdinal10 != 26) {
                            if (iOrdinal10 == 61) {
                                c23598.f76451 = m30669(strTrim14);
                            }
                        } else if ("".equals(attributes2.getURI(i16)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i16))) {
                            c23598.f76450 = strTrim14;
                        }
                    }
                    this.f41261.mo6530(c23598);
                    this.f41261 = c23598;
                    InterfaceC17952 interfaceC17953 = c23598.f30201;
                    if (interfaceC17953 instanceof InterfaceC1724) {
                        c23598.m52027((InterfaceC1724) interfaceC17953);
                        return;
                    } else {
                        c23598.m52027(((InterfaceC5958) interfaceC17953).mo16244());
                        return;
                    }
                case 27:
                    InterfaceC17952 interfaceC17954 = this.f41261;
                    if (interfaceC17954 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC17954 instanceof AbstractC10898)) {
                        throw new C8116("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    C16542 c16542 = new C16542();
                    c16542.f30200 = this.f41268;
                    c16542.f30201 = this.f41261;
                    m30683((AbstractC8075) c16542, attributes2);
                    m30705(c16542, attributes2);
                    m30693((InterfaceC22892) c16542, attributes2);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String strTrim15 = attributes2.getValue(i17).trim();
                        if (EnumC15878.m37752(attributes2.getLocalName(i17)).ordinal() == 26 && ("".equals(attributes2.getURI(i17)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i17)))) {
                            c16542.f53133 = strTrim15;
                        }
                    }
                    this.f41261.mo6530(c16542);
                    InterfaceC17952 interfaceC17955 = c16542.f30201;
                    if (interfaceC17955 instanceof InterfaceC1724) {
                        c16542.m38944((InterfaceC1724) interfaceC17955);
                        return;
                    } else {
                        c16542.m38944(((InterfaceC5958) interfaceC17955).mo16244());
                        return;
                    }
                case 28:
                    InterfaceC17952 interfaceC17956 = this.f41261;
                    if (interfaceC17956 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC17956 instanceof AbstractC10898)) {
                        throw new C8116("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    C12309 c12309 = new C12309();
                    c12309.f30200 = this.f41268;
                    c12309.f30201 = this.f41261;
                    m30683((AbstractC8075) c12309, attributes2);
                    m30705(c12309, attributes2);
                    m30693((InterfaceC22892) c12309, attributes2);
                    m30689((AbstractC14426) c12309, attributes2);
                    this.f41261.mo6530(c12309);
                    this.f41261 = c12309;
                    InterfaceC17952 interfaceC17957 = c12309.f30201;
                    if (interfaceC17957 instanceof InterfaceC1724) {
                        c12309.m30570((InterfaceC1724) interfaceC17957);
                        return;
                    } else {
                        c12309.m30570(((InterfaceC5958) interfaceC17957).mo16244());
                        return;
                    }
                case 29:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C4587 c4587 = new C4587();
                    c4587.f30200 = this.f41268;
                    c4587.f30201 = this.f41261;
                    m30683((AbstractC8075) c4587, attributes2);
                    m30705(c4587, attributes2);
                    m30691((InterfaceC19674) c4587, attributes2);
                    m30693((InterfaceC22892) c4587, attributes2);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String strTrim16 = attributes2.getValue(i18).trim();
                        int iOrdinal11 = EnumC15878.m37752(attributes2.getLocalName(i18)).ordinal();
                        if (iOrdinal11 == 25) {
                            C10502 c10502M306624 = m30669(strTrim16);
                            c4587.f16248 = c10502M306624;
                            if (c10502M306624.m26655()) {
                                throw new C8116("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iOrdinal11 != 26) {
                            switch (iOrdinal11) {
                                case 81:
                                    C10502 c10502M306625 = m30669(strTrim16);
                                    c4587.f16249 = c10502M306625;
                                    if (c10502M306625.m26655()) {
                                        throw new C8116("Invalid <use> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c4587.f16246 = m30669(strTrim16);
                                    break;
                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    c4587.f16247 = m30669(strTrim16);
                                    break;
                            }
                        } else if ("".equals(attributes2.getURI(i18)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i18))) {
                            c4587.f16245 = strTrim16;
                        }
                    }
                    this.f41261.mo6530(c4587);
                    this.f41261 = c4587;
                    return;
                case 30:
                    if (this.f41261 == null) {
                        throw new C8116("Invalid document. Root element must be <svg>");
                    }
                    C13761 c13761 = new C13761();
                    c13761.f30200 = this.f41268;
                    c13761.f30201 = this.f41261;
                    m30683((AbstractC8075) c13761, attributes2);
                    m30693((InterfaceC22892) c13761, attributes2);
                    m30690((AbstractC15837) c13761, attributes2);
                    this.f41261.mo6530(c13761);
                    this.f41261 = c13761;
                    return;
                default:
                    this.f41264 = true;
                    this.f41266 = 1;
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m30708(String str) {
        if (this.f41264) {
            return;
        }
        if (this.f41259) {
            if (this.f41267 == null) {
                this.f41267 = new StringBuilder(str.length());
            }
            this.f41267.append(str);
        } else if (this.f41262) {
            if (this.f41263 == null) {
                this.f41263 = new StringBuilder(str.length());
            }
            this.f41263.append(str);
        } else if (this.f41261 instanceof AbstractC10898) {
            m30677(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30695(char[] cArr, int i, int i2) {
        if (this.f41264) {
            return;
        }
        if (this.f41259) {
            if (this.f41267 == null) {
                this.f41267 = new StringBuilder(i2);
            }
            this.f41267.append(cArr, i, i2);
        } else if (this.f41262) {
            if (this.f41263 == null) {
                this.f41263 = new StringBuilder(i2);
            }
            this.f41263.append(cArr, i, i2);
        } else if (this.f41261 instanceof AbstractC10898) {
            m30677(new String(cArr, i, i2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30677(String str) {
        AbstractC15131 abstractC15131 = (AbstractC15131) this.f41261;
        int size = abstractC15131.f49442.size();
        C8781 c8781 = size == 0 ? null : (C8781) abstractC15131.f49442.get(size - 1);
        if (c8781 instanceof C9487) {
            C9487 c9487 = (C9487) c8781;
            c9487.f32086 = C22697.m50267(new StringBuilder(), c9487.f32086, str);
        } else {
            InterfaceC17952 interfaceC17952 = this.f41261;
            C9487 c9488 = new C9487();
            c9488.f32086 = str;
            interfaceC17952.mo6530(c9488);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m30678(String str, String str2, String str3) {
        if (this.f41264) {
            int i = this.f41266 - 1;
            this.f41266 = i;
            if (i == 0) {
                this.f41264 = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            switch (EnumC20111.m45474(str2).ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f41261 = ((C8781) this.f41261).f30201;
                    break;
                case 5:
                case 26:
                    this.f41259 = false;
                    if (this.f41267 != null) {
                        EnumC20111 enumC20111 = this.f41258;
                        if (enumC20111 == EnumC20111.title || enumC20111 == EnumC20111.desc) {
                            this.f41268.getClass();
                        }
                        this.f41267.setLength(0);
                    }
                    break;
                case 21:
                    StringBuilder sb = this.f41263;
                    if (sb != null) {
                        this.f41262 = false;
                        this.f41268.m29092(new C1703(EnumC19343.screen, EnumC14405.Document).m5664(sb.toString()));
                        this.f41263.setLength(0);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m30699(C0354 c0354) {
        HashMap map = new HashMap();
        c0354.m2051();
        while (true) {
            String strM2047 = c0354.m2047(false, a.h);
            if (strM2047 == null) {
                return map;
            }
            c0354.m2048(a.h);
            map.put(strM2047, c0354.m2055());
            c0354.m2051();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m30706(Attributes attributes) throws C8116 {
        C6663 c6663 = new C6663();
        c6663.f30200 = this.f41268;
        c6663.f30201 = this.f41261;
        m30683((AbstractC8075) c6663, attributes);
        m30705(c6663, attributes);
        m30693((InterfaceC22892) c6663, attributes);
        m30690((AbstractC15837) c6663, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC15878.m37752(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 25) {
                C10502 c10502M30669 = m30669(strTrim);
                c6663.f22517 = c10502M30669;
                if (c10502M30669.m26655()) {
                    throw new C8116("Invalid <svg> element. height cannot be negative");
                }
            } else if (iOrdinal != 79) {
                switch (iOrdinal) {
                    case 81:
                        C10502 c10502M306610 = m30669(strTrim);
                        c6663.f22520 = c10502M306610;
                        if (c10502M306610.m26655()) {
                            throw new C8116("Invalid <svg> element. width cannot be negative");
                        }
                        break;
                        break;
                    case 82:
                        c6663.f22518 = m30669(strTrim);
                        break;
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                        c6663.f22519 = m30669(strTrim);
                        break;
                }
            } else {
                continue;
            }
        }
        InterfaceC17952 interfaceC17952 = this.f41261;
        if (interfaceC17952 == null) {
            this.f41268.m29093(c6663);
        } else {
            interfaceC17952.mo6530(c6663);
        }
        this.f41261 = c6663;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30694(Attributes attributes) throws C8116 {
        if (this.f41261 == null) {
            throw new C8116("Invalid document. Root element must be <svg>");
        }
        C1328 c1328 = new C1328();
        c1328.f30200 = this.f41268;
        c1328.f30201 = this.f41261;
        m30683((AbstractC8075) c1328, attributes);
        m30705(c1328, attributes);
        m30691((InterfaceC19674) c1328, attributes);
        m30693((InterfaceC22892) c1328, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC15878.m37752(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 6) {
                c1328.f5629 = m30669(strTrim);
            } else if (iOrdinal == 7) {
                c1328.f5628 = m30669(strTrim);
            } else if (iOrdinal != 49) {
                continue;
            } else {
                C10502 c10502M30669 = m30669(strTrim);
                c1328.f5630 = c10502M30669;
                if (c10502M30669.m26655()) {
                    throw new C8116("Invalid <circle> element. r cannot be negative");
                }
            }
        }
        this.f41261.mo6530(c1328);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30684(C11207 c11207, Attributes attributes, String str) throws C8116 {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC15878.m37752(attributes.getLocalName(i)) == EnumC15878.points) {
                C0354 c0354 = new C0354(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                c0354.m2051();
                while (!c0354.m2054()) {
                    float fM2042 = c0354.m2042();
                    if (Float.isNaN(fM2042)) {
                        throw new C8116(C16523.m38890("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    c0354.m2043();
                    float fM2043 = c0354.m2042();
                    if (Float.isNaN(fM2043)) {
                        throw new C8116(C16523.m38890("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    c0354.m2043();
                    arrayList.add(Float.valueOf(fM2042));
                    arrayList.add(Float.valueOf(fM2043));
                }
                c11207.f37927 = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    c11207.f37927[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30689(AbstractC14426 abstractC14426, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC15878.m37752(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 9) {
                abstractC14426.f47305 = m30701(strTrim);
            } else if (iOrdinal == 10) {
                abstractC14426.f47306 = m30701(strTrim);
            } else if (iOrdinal == 82) {
                abstractC14426.f47304 = m30701(strTrim);
            } else if (iOrdinal == 83) {
                abstractC14426.f47307 = m30701(strTrim);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30693(InterfaceC22892 interfaceC22892, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC15878.m37752(attributes.getLocalName(i)).ordinal();
            if (iOrdinal != 73) {
                switch (iOrdinal) {
                    case 52:
                        C0354 c0354 = new C0354(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!c0354.m2054()) {
                            String strM2041 = c0354.m2041();
                            if (strM2041.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strM2041.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            c0354.m2051();
                        }
                        interfaceC22892.mo36275(hashSet);
                        break;
                    case 53:
                        interfaceC22892.mo36274(strTrim);
                        break;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        C0354 c0355 = new C0354(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!c0355.m2054()) {
                            hashSet2.add(c0355.m2041());
                            c0355.m2051();
                        }
                        interfaceC22892.mo36272(hashSet2);
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        ArrayList arrayListM30697 = m30697(strTrim);
                        interfaceC22892.mo36277(arrayListM30697 != null ? new HashSet(arrayListM30697) : new HashSet(0));
                        break;
                }
            } else {
                C0354 c0356 = new C0354(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!c0356.m2054()) {
                    String strM2042 = c0356.m2041();
                    int iIndexOf = strM2042.indexOf(45);
                    if (iIndexOf != -1) {
                        strM2042 = strM2042.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strM2042, "", "").getLanguage());
                    c0356.m2051();
                }
                interfaceC22892.mo36279(hashSet3);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30692(AbstractC21790 abstractC21790, Attributes attributes) throws C8116 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC15878.m37752(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 23) {
                abstractC21790.f70577 = m30710(strTrim);
            } else if (iOrdinal != 24) {
                if (iOrdinal != 26) {
                    if (iOrdinal != 60) {
                        continue;
                    } else {
                        try {
                            abstractC21790.f70580 = EnumC18262.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new C8116(C16523.m38890("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                    }
                } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    abstractC21790.f70581 = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                abstractC21790.f70578 = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new C8116("Invalid value for attribute gradientUnits");
                }
                abstractC21790.f70578 = Boolean.TRUE;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30683(AbstractC8075 abstractC8075, Attributes attributes) throws C8116 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                abstractC8075.f28299 = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    abstractC8075.f28301 = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new C8116(C0252.m1693("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    abstractC8075.f28301 = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m30705(AbstractC8075 abstractC8075, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iOrdinal = EnumC15878.m37752(attributes.getLocalName(i)).ordinal();
                if (iOrdinal == 0) {
                    C18637 c18637 = new C18637(strTrim);
                    ArrayList arrayList = null;
                    while (!c18637.m2054()) {
                        String strM2041 = c18637.m2041();
                        if (strM2041 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strM2041);
                            c18637.m2051();
                        }
                    }
                    abstractC8075.f28298 = arrayList;
                } else if (iOrdinal != 72) {
                    if (abstractC8075.f28300 == null) {
                        abstractC8075.f28300 = new C3840();
                    }
                    m30680(abstractC8075.f28300, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    m30682(abstractC8075, strTrim, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30682(AbstractC8075 abstractC8075, String str, boolean z) {
        C0354 c0354 = new C0354(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strM2047 = c0354.m2047(false, ':');
            c0354.m2051();
            if (!c0354.m2048(':')) {
                return;
            }
            c0354.m2051();
            String strM2048 = c0354.m2047(true, ';');
            if (strM2048 == null) {
                return;
            }
            c0354.m2051();
            if (c0354.m2054() || c0354.m2048(';')) {
                if (!z || m30707(strM2047)) {
                    if (abstractC8075.f28297 == null) {
                        abstractC8075.f28297 = new C3840();
                    }
                    m30680(abstractC8075.f28297, strM2047, strM2048);
                }
                c0354.m2051();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m30707(String str) {
        int iOrdinal = EnumC15878.m37752(str).ordinal();
        if (iOrdinal == 2 || iOrdinal == 15 || iOrdinal == 35 || iOrdinal == 64) {
            return true;
        }
        switch (iOrdinal) {
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:0x0152  */
    /* JADX WARN: Code duplicated, block: B:199:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:330:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:357:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:407:0x0592  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30680(C3840 c3840, String str, String str2) {
        String strM2047;
        C10502 c10502M26026;
        C10502 c10502M2050;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = EnumC15878.m37752(str).ordinal();
        C22496 c22496 = null;
        C10502 c10502M30669 = null;
        EnumC3444 enumC3444 = null;
        EnumC11603 enumC11603 = null;
        EnumC13720 enumC13720 = null;
        c10502Arr = null;
        c10502Arr = null;
        c10502Arr = null;
        c10502Arr = null;
        c10502Arr = null;
        C10502[] c10502Arr = null;
        EnumC2429 enumC2429 = null;
        EnumC4546 enumC4546 = null;
        String strSubstring = null;
        EnumC3444 enumC3445 = null;
        EnumC22186 enumC22186 = null;
        EnumC5252 enumC5252 = null;
        EnumC13014 enumC13014 = null;
        Boolean bool = null;
        EnumC1018 enumC1018 = null;
        c22496 = null;
        c22496 = null;
        if (iOrdinal == 1) {
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                C0354 c0354 = new C0354(str2.substring(5));
                c0354.m2051();
                C10502 c10502M30703 = m30703(c0354);
                c0354.m2043();
                C10502 c10502M30704 = m30703(c0354);
                c0354.m2043();
                C10502 c10502M30705 = m30703(c0354);
                c0354.m2043();
                C10502 c10502M30706 = m30703(c0354);
                c0354.m2051();
                if (c0354.m2048(')') || c0354.m2054()) {
                    c22496 = new C22496();
                    c22496.f73440 = c10502M30703;
                    c22496.f73442 = c10502M30704;
                    c22496.f73441 = c10502M30705;
                    c22496.f73443 = c10502M30706;
                }
            }
            c3840.f14347 = c22496;
            if (c22496 != null) {
                c3840.f14333 |= 1048576;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            c3840.f14355 = m30709(str2);
            c3840.f14333 |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            if ("nonzero".equals(str2)) {
                enumC3444 = EnumC3444.NonZero;
            } else if ("evenodd".equals(str2)) {
                enumC3444 = EnumC3444.EvenOdd;
            }
            c3840.f14323 = enumC3444;
            c3840.f14333 |= 536870912;
            return;
        }
        try {
            if (iOrdinal == 5) {
                c3840.f14349 = m30700(str2);
                c3840.f14333 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                return;
            }
            if (iOrdinal == 8) {
                if (str2.equals("ltr")) {
                    enumC1018 = EnumC1018.LTR;
                } else if (str2.equals("rtl")) {
                    enumC1018 = EnumC1018.RTL;
                }
                c3840.f14341 = enumC1018;
                if (enumC1018 != null) {
                    c3840.f14333 |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                c3840.f14331 = m30709(str2);
                c3840.f14333 |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                c3840.f14359 = m30671(str2);
                c3840.f14333 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                return;
            }
            if (iOrdinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                }
                c3840.f14325 = bool;
                if (bool != null) {
                    c3840.f14333 |= 524288;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                if (str2.equals("none")) {
                    enumC13014 = EnumC13014.None;
                } else if (str2.equals("non-scaling-stroke")) {
                    enumC13014 = EnumC13014.NonScalingStroke;
                }
                c3840.f14356 = enumC13014;
                if (enumC13014 != null) {
                    c3840.f14333 |= 34359738368L;
                    return;
                }
                return;
            }
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    c3840.f14343 = C6973.m18752();
                } else {
                    try {
                        c3840.f14343 = m30700(str2);
                    } catch (C8116 e) {
                        e.getMessage();
                        return;
                    }
                }
                c3840.f14333 |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                c3840.f14329 = m30671(str2);
                c3840.f14333 |= Blake2xsDigest.MAX_NUMBER_BLOCKS;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        enumC5252 = EnumC5252.Middle;
                        break;
                    case "end":
                        enumC5252 = EnumC5252.End;
                        break;
                    case "start":
                        enumC5252 = EnumC5252.Start;
                        break;
                }
                c3840.f14357 = enumC5252;
                if (enumC5252 != null) {
                    c3840.f14333 |= 262144;
                    return;
                }
                return;
            }
            if (iOrdinal != 75) {
                switch (iOrdinal) {
                    case 14:
                        if (str2.indexOf(124) < 0) {
                            if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                                c3840.f14351 = Boolean.valueOf(!str2.equals("none"));
                                c3840.f14333 |= 16777216;
                                break;
                            }
                        }
                        break;
                    case 15:
                        AbstractC10192 abstractC10192M30698 = m30698(str2);
                        c3840.f14332 = abstractC10192M30698;
                        if (abstractC10192M30698 != null) {
                            c3840.f14333 |= 1;
                        }
                        break;
                    case 16:
                        if ("nonzero".equals(str2)) {
                            enumC3445 = EnumC3444.NonZero;
                        } else if ("evenodd".equals(str2)) {
                            enumC3445 = EnumC3444.EvenOdd;
                        }
                        c3840.f14361 = enumC3445;
                        if (enumC3445 != null) {
                            c3840.f14333 |= 2;
                        }
                        break;
                    case 17:
                        Float fM30671 = m30671(str2);
                        c3840.f14339 = fM30671;
                        if (fM30671 != null) {
                            c3840.f14333 |= 4;
                        }
                        break;
                    case 18:
                        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                            C0354 c0355 = new C0354(str2);
                            Integer numM19836 = null;
                            EnumC4546 enumC4547 = null;
                            String str3 = null;
                            while (true) {
                                strM2047 = c0355.m2047(false, '/');
                                c0355.m2051();
                                if (strM2047 == null) {
                                    break;
                                } else if (numM19836 == null || enumC4547 == null) {
                                    if (!strM2047.equals("normal") && (numM19836 != null || (numM19836 = C7410.m19836(strM2047)) == null)) {
                                        if (enumC4547 == null) {
                                            switch (strM2047) {
                                                case "oblique":
                                                    enumC4547 = EnumC4546.Oblique;
                                                    break;
                                                case "italic":
                                                    enumC4547 = EnumC4546.Italic;
                                                    break;
                                                case "normal":
                                                    enumC4547 = EnumC4546.Normal;
                                                    break;
                                                default:
                                                    enumC4547 = null;
                                                    break;
                                            }
                                            if (enumC4547 != null) {
                                                continue;
                                            }
                                        }
                                        if (str3 == null && strM2047.equals("small-caps")) {
                                            str3 = strM2047;
                                        }
                                    }
                                }
                            }
                            try {
                                c10502M26026 = C10233.m26026(strM2047);
                                if (c10502M26026 == null) {
                                    c10502M26026 = m30669(strM2047);
                                }
                            } catch (C8116 unused) {
                                c10502M26026 = null;
                            }
                            if (c0355.m2048('/')) {
                                c0355.m2051();
                                String strM2041 = c0355.m2041();
                                if (strM2041 != null) {
                                    m30669(strM2041);
                                }
                                c0355.m2051();
                            }
                            if (!c0355.m2054()) {
                                int i = c0355.f1783;
                                c0355.f1783 = c0355.f1785;
                                strSubstring = c0355.f1782.substring(i);
                            }
                            c3840.f14345 = m30697(strSubstring);
                            c3840.f14326 = c10502M26026;
                            c3840.f14328 = Integer.valueOf(numM19836 == null ? 400 : numM19836.intValue());
                            if (enumC4547 == null) {
                                enumC4547 = EnumC4546.Normal;
                            }
                            c3840.f14337 = enumC4547;
                            c3840.f14333 |= 122880;
                            break;
                        }
                        break;
                    case 19:
                        ArrayList arrayListM30697 = m30697(str2);
                        c3840.f14345 = arrayListM30697;
                        if (arrayListM30697 != null) {
                            c3840.f14333 |= 8192;
                        }
                        break;
                    case 20:
                        try {
                            C10502 c10502M26027 = C10233.m26026(str2);
                            c10502M30669 = c10502M26027 == null ? m30669(str2) : c10502M26027;
                            break;
                        } catch (C8116 unused2) {
                        }
                        c3840.f14326 = c10502M30669;
                        if (c10502M30669 != null) {
                            c3840.f14333 |= 16384;
                        }
                        break;
                    case 21:
                        Integer numM19837 = C7410.m19836(str2);
                        c3840.f14328 = numM19837;
                        if (numM19837 != null) {
                            c3840.f14333 |= X931RNG.BLOCK64_RESEED_MAX;
                        }
                        break;
                    case 22:
                        switch (str2) {
                            case "oblique":
                                enumC4546 = EnumC4546.Oblique;
                                break;
                            case "italic":
                                enumC4546 = EnumC4546.Italic;
                                break;
                            case "normal":
                                enumC4546 = EnumC4546.Normal;
                                break;
                        }
                        c3840.f14337 = enumC4546;
                        if (enumC4546 != null) {
                            c3840.f14333 |= 65536;
                        }
                        break;
                    default:
                        switch (iOrdinal) {
                            case 27:
                                switch (str2) {
                                    case "optimizeQuality":
                                        enumC2429 = EnumC2429.optimizeQuality;
                                        break;
                                    case "auto":
                                        enumC2429 = EnumC2429.auto;
                                        break;
                                    case "optimizeSpeed":
                                        enumC2429 = EnumC2429.optimizeSpeed;
                                        break;
                                }
                                c3840.f14330 = enumC2429;
                                if (enumC2429 != null) {
                                    c3840.f14333 |= 137438953472L;
                                }
                                break;
                            case 28:
                                String strM30709 = m30709(str2);
                                c3840.f14327 = strM30709;
                                c3840.f14340 = strM30709;
                                c3840.f14344 = strM30709;
                                c3840.f14333 |= 14680064;
                                break;
                            case 29:
                                c3840.f14327 = m30709(str2);
                                c3840.f14333 |= 2097152;
                                break;
                            case 30:
                                c3840.f14340 = m30709(str2);
                                c3840.f14333 |= 4194304;
                                break;
                            case 31:
                                c3840.f14344 = m30709(str2);
                                c3840.f14333 |= X931RNG.BLOCK128_RESEED_MAX;
                                break;
                            default:
                                switch (iOrdinal) {
                                    case 62:
                                        if (str2.equals("currentColor")) {
                                            c3840.f14360 = C6973.m18752();
                                        } else {
                                            try {
                                                c3840.f14360 = m30700(str2);
                                            } catch (C8116 e2) {
                                                e2.getMessage();
                                                return;
                                            }
                                        }
                                        c3840.f14333 |= 67108864;
                                        break;
                                    case 63:
                                        c3840.f14346 = m30671(str2);
                                        c3840.f14333 |= 134217728;
                                        break;
                                    case 64:
                                        AbstractC10192 abstractC10192M30699 = m30698(str2);
                                        c3840.f14358 = abstractC10192M30699;
                                        if (abstractC10192M30699 != null) {
                                            c3840.f14333 |= 8;
                                        }
                                        break;
                                    case 65:
                                        if ("none".equals(str2)) {
                                            c3840.f14352 = null;
                                            c3840.f14333 |= 512;
                                        } else {
                                            C0354 c0356 = new C0354(str2);
                                            c0356.m2051();
                                            if (!c0356.m2054() && (c10502M2050 = c0356.m2050()) != null && !c10502M2050.m26655()) {
                                                float f = c10502M2050.f35991;
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(c10502M2050);
                                                while (true) {
                                                    if (!c0356.m2054()) {
                                                        c0356.m2043();
                                                        C10502 c10502M2051 = c0356.m2050();
                                                        if (c10502M2051 != null && !c10502M2051.m26655()) {
                                                            arrayList.add(c10502M2051);
                                                            f += c10502M2051.f35991;
                                                        }
                                                    } else if (f != 0.0f) {
                                                        c10502Arr = (C10502[]) arrayList.toArray(new C10502[arrayList.size()]);
                                                    }
                                                }
                                            }
                                            c3840.f14352 = c10502Arr;
                                            if (c10502Arr != null) {
                                                c3840.f14333 |= 512;
                                            }
                                        }
                                        break;
                                    case 66:
                                        c3840.f14353 = m30669(str2);
                                        c3840.f14333 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                                        break;
                                    case 67:
                                        if ("butt".equals(str2)) {
                                            enumC13720 = EnumC13720.Butt;
                                        } else if ("round".equals(str2)) {
                                            enumC13720 = EnumC13720.Round;
                                        } else if ("square".equals(str2)) {
                                            enumC13720 = EnumC13720.Square;
                                        }
                                        c3840.f14335 = enumC13720;
                                        if (enumC13720 != null) {
                                            c3840.f14333 |= 64;
                                        }
                                        break;
                                    case 68:
                                        if ("miter".equals(str2)) {
                                            enumC11603 = EnumC11603.Miter;
                                        } else if ("round".equals(str2)) {
                                            enumC11603 = EnumC11603.Round;
                                        } else if ("bevel".equals(str2)) {
                                            enumC11603 = EnumC11603.Bevel;
                                        }
                                        c3840.f14354 = enumC11603;
                                        if (enumC11603 != null) {
                                            c3840.f14333 |= 128;
                                        }
                                        break;
                                    case 69:
                                        c3840.f14336 = Float.valueOf(m30670(str2));
                                        c3840.f14333 |= 256;
                                        break;
                                    case 70:
                                        Float fM30672 = m30671(str2);
                                        c3840.f14338 = fM30672;
                                        if (fM30672 != null) {
                                            c3840.f14333 |= 16;
                                        }
                                        break;
                                    case 71:
                                        c3840.f14334 = m30669(str2);
                                        c3840.f14333 |= 32;
                                        break;
                                    default:
                                        switch (iOrdinal) {
                                            case 88:
                                                if (str2.equals("currentColor")) {
                                                    c3840.f14324 = C6973.m18752();
                                                } else {
                                                    try {
                                                        c3840.f14324 = m30700(str2);
                                                    } catch (C8116 e3) {
                                                        e3.getMessage();
                                                        return;
                                                    }
                                                }
                                                c3840.f14333 |= 8589934592L;
                                                break;
                                            case 89:
                                                c3840.f14350 = m30671(str2);
                                                c3840.f14333 |= 17179869184L;
                                                break;
                                            case 90:
                                                if (str2.indexOf(124) < 0) {
                                                    if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                        c3840.f14342 = Boolean.valueOf(str2.equals("visible"));
                                                        c3840.f14333 |= 33554432;
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                return;
            }
            switch (str2) {
                case "line-through":
                    enumC22186 = EnumC22186.LineThrough;
                    break;
                case "underline":
                    enumC22186 = EnumC22186.Underline;
                    break;
                case "none":
                    enumC22186 = EnumC22186.None;
                    break;
                case "blink":
                    enumC22186 = EnumC22186.Blink;
                    break;
                case "overline":
                    enumC22186 = EnumC22186.Overline;
                    break;
            }
            c3840.f14348 = enumC22186;
            if (enumC22186 != null) {
                c3840.f14333 |= 131072;
            }
        } catch (C8116 unused3) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30690(AbstractC15837 abstractC15837, Attributes attributes) throws C8116 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC15878.m37752(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 48) {
                m30681(abstractC15837, strTrim);
            } else if (iOrdinal != 80) {
                continue;
            } else {
                C0354 c0354 = new C0354(strTrim);
                c0354.m2051();
                float fM2042 = c0354.m2042();
                c0354.m2043();
                float fM2043 = c0354.m2042();
                c0354.m2043();
                float fM2044 = c0354.m2042();
                c0354.m2043();
                float fM2045 = c0354.m2042();
                if (Float.isNaN(fM2042) || Float.isNaN(fM2043) || Float.isNaN(fM2044) || Float.isNaN(fM2045)) {
                    throw new C8116("Invalid viewBox definition - should have four numbers");
                }
                if (fM2044 < 0.0f) {
                    throw new C8116("Invalid viewBox. width cannot be negative");
                }
                if (fM2045 >= 0.0f) {
                    abstractC15837.f51260 = new C5562(fM2042, fM2043, fM2044, fM2045);
                } else {
                    throw new C8116("Invalid viewBox. height cannot be negative");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30691(InterfaceC19674 interfaceC19674, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC15878.m37752(attributes.getLocalName(i)) == EnumC15878.transform) {
                interfaceC19674.mo22016(m30710(attributes.getValue(i)));
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static Matrix m30710(String str) throws C8116 {
        Matrix matrix = new Matrix();
        C0354 c0354 = new C0354(str);
        c0354.m2051();
        while (!c0354.m2054()) {
            String str2 = c0354.f1782;
            String strSubstring = null;
            if (!c0354.m2054()) {
                int i = c0354.f1783;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = c0354.m2045();
                    }
                }
                int i2 = c0354.f1783;
                while (C0354.m2040(iCharAt)) {
                    iCharAt = c0354.m2045();
                }
                if (iCharAt == 40) {
                    c0354.f1783++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    c0354.f1783 = i;
                }
            }
            if (strSubstring == null) {
                throw new C8116("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    c0354.m2051();
                    float fM2042 = c0354.m2042();
                    c0354.m2043();
                    float fM2043 = c0354.m2042();
                    c0354.m2043();
                    float fM2044 = c0354.m2042();
                    c0354.m2043();
                    float fM2045 = c0354.m2042();
                    c0354.m2043();
                    float fM2046 = c0354.m2042();
                    c0354.m2043();
                    float fM2047 = c0354.m2042();
                    c0354.m2051();
                    if (Float.isNaN(fM2047) || !c0354.m2048(')')) {
                        throw new C8116("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fM2042, fM2044, fM2046, fM2043, fM2045, fM2047, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    c0354.m2051();
                    float fM2048 = c0354.m2042();
                    c0354.m2043();
                    float fM2049 = c0354.m2042();
                    c0354.m2043();
                    float fM20410 = c0354.m2042();
                    c0354.m2051();
                    if (Float.isNaN(fM2048) || !c0354.m2048(')')) {
                        throw new C8116("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fM2049)) {
                        matrix.preRotate(fM2048);
                    } else {
                        if (Float.isNaN(fM20410)) {
                            throw new C8116("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fM2048, fM2049, fM20410);
                    }
                    break;
                    break;
                case "scale":
                    c0354.m2051();
                    float fM20411 = c0354.m2042();
                    c0354.m2043();
                    float fM20412 = c0354.m2042();
                    c0354.m2051();
                    if (Float.isNaN(fM20411) || !c0354.m2048(')')) {
                        throw new C8116("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM20412)) {
                        matrix.preScale(fM20411, fM20412);
                    } else {
                        matrix.preScale(fM20411, fM20411);
                    }
                    break;
                    break;
                case "skewX":
                    c0354.m2051();
                    float fM20413 = c0354.m2042();
                    c0354.m2051();
                    if (Float.isNaN(fM20413) || !c0354.m2048(')')) {
                        throw new C8116("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fM20413)), 0.0f);
                    break;
                    break;
                case "skewY":
                    c0354.m2051();
                    float fM20414 = c0354.m2042();
                    c0354.m2051();
                    if (Float.isNaN(fM20414) || !c0354.m2048(')')) {
                        throw new C8116("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fM20414)));
                    break;
                    break;
                case "translate":
                    c0354.m2051();
                    float fM20415 = c0354.m2042();
                    c0354.m2043();
                    float fM20416 = c0354.m2042();
                    c0354.m2051();
                    if (Float.isNaN(fM20415) || !c0354.m2048(')')) {
                        throw new C8116("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM20416)) {
                        matrix.preTranslate(fM20415, fM20416);
                    } else {
                        matrix.preTranslate(fM20415, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new C8116(C16523.m38890("Invalid transform list fn: ", strSubstring, MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (c0354.m2054()) {
                return matrix;
            }
            c0354.m2043();
        }
        return matrix;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C10502 m30669(String str) throws C8116 {
        if (str.length() == 0) {
            throw new C8116("Invalid length value (empty string)");
        }
        int length = str.length();
        EnumC3135 enumC3135ValueOf = EnumC3135.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            enumC3135ValueOf = EnumC3135.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                enumC3135ValueOf = EnumC3135.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new C8116("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new C10502(m30672(length, str), enumC3135ValueOf);
        } catch (NumberFormatException e) {
            throw new C8116("Invalid length value: ".concat(str), e);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static ArrayList m30701(String str) throws C8116 {
        if (str.length() == 0) {
            throw new C8116("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C0354 c0354 = new C0354(str);
        c0354.m2051();
        while (!c0354.m2054()) {
            float fM2042 = c0354.m2042();
            if (Float.isNaN(fM2042)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = c0354.f1782;
                int i = c0354.f1783;
                while (!c0354.m2054() && !C0354.m2040((int) str2.charAt(c0354.f1783))) {
                    c0354.f1783++;
                }
                String strSubstring = str2.substring(i, c0354.f1783);
                c0354.f1783 = i;
                sb.append(strSubstring);
                throw new C8116(sb.toString());
            }
            EnumC3135 enumC3135M2053 = c0354.m2053();
            if (enumC3135M2053 == null) {
                enumC3135M2053 = EnumC3135.px;
            }
            arrayList.add(new C10502(fM2042, enumC3135M2053));
            c0354.m2043();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static float m30670(String str) throws C8116 {
        int length = str.length();
        if (length == 0) {
            throw new C8116("Invalid float value (empty string)");
        }
        return m30672(length, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m30672(int i, String str) throws C8116 {
        float fM9343 = new C3114().m9343(0, i, 0, str);
        if (Float.isNaN(fM9343)) {
            throw new C8116(C0252.m1693("Invalid float value: ", str));
        }
        return fM9343;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static Float m30671(String str) {
        try {
            float fM30670 = m30670(str);
            if (fM30670 < 0.0f) {
                fM30670 = 0.0f;
            } else if (fM30670 > 1.0f) {
                fM30670 = 1.0f;
            }
            return Float.valueOf(fM30670);
        } catch (C8116 unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30681(AbstractC7369 abstractC7369, String str) throws C8116 {
        EnumC14030 enumC14030;
        C0354 c0354 = new C0354(str);
        c0354.m2051();
        String strM2041 = c0354.m2041();
        if ("defer".equals(strM2041)) {
            c0354.m2051();
            strM2041 = c0354.m2041();
        }
        EnumC4856 enumC4856M44456 = C19405.m44456(strM2041);
        c0354.m2051();
        if (c0354.m2054()) {
            enumC14030 = null;
        } else {
            String strM2042 = c0354.m2041();
            strM2042.getClass();
            if (strM2042.equals("meet")) {
                enumC14030 = EnumC14030.meet;
            } else if (strM2042.equals("slice")) {
                enumC14030 = EnumC14030.slice;
            } else {
                throw new C8116("Invalid preserveAspectRatio definition: ".concat(str));
            }
        }
        abstractC7369.f24454 = new C11913(enumC4856M44456, enumC14030);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static AbstractC10192 m30698(String str) {
        boolean zStartsWith = str.startsWith("url(");
        AbstractC10192 abstractC10192M30700 = C4150.f15174;
        AbstractC10192 abstractC10192 = null;
        if (zStartsWith) {
            int iIndexOf = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_END);
            if (iIndexOf != -1) {
                String strTrim = str.substring(4, iIndexOf).trim();
                String strTrim2 = str.substring(iIndexOf + 1).trim();
                if (strTrim2.length() > 0) {
                    if (!strTrim2.equals("none")) {
                        if (strTrim2.equals("currentColor")) {
                            abstractC10192M30700 = C6973.m18752();
                        } else {
                            try {
                                abstractC10192M30700 = m30700(strTrim2);
                            } catch (C8116 unused) {
                                abstractC10192M30700 = null;
                            }
                        }
                    }
                    abstractC10192 = abstractC10192M30700;
                }
                return new C0622(strTrim, abstractC10192);
            }
            return new C0622(str.substring(4).trim(), null);
        }
        if (str.equals("none")) {
            return abstractC10192M30700;
        }
        if (str.equals("currentColor")) {
            return C6973.m18752();
        }
        try {
            return m30700(str);
        } catch (C8116 unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C4150 m30700(String str) throws C8116 {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C9466 c9466 = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (true) {
                    if (i2 < length) {
                        char cCharAt = str.charAt(i2);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j = j2 * 16;
                                i = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j = j2 * 16;
                                i = cCharAt - 'a';
                            }
                            j2 = j + ((long) i) + 10;
                        } else {
                            j2 = (j2 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j2 <= 4294967295L) {
                            i2++;
                        }
                    }
                    if (i2 != 1) {
                        c9466 = new C9466(i2, j2);
                    }
                }
            }
            if (c9466 == null) {
                throw new C8116("Bad hex colour value: ".concat(str));
            }
            int iM24237 = c9466.m24237();
            if (iM24237 == 4) {
                int iM24238 = c9466.m24238();
                int i3 = iM24238 & 3840;
                int i4 = iM24238 & 240;
                int i5 = iM24238 & 15;
                return new C4150(i5 | (i3 << 8) | (-16777216) | (i3 << 12) | (i4 << 8) | (i4 << 4) | (i5 << 4));
            }
            if (iM24237 != 5) {
                if (iM24237 == 7) {
                    return new C4150(c9466.m24238() | (-16777216));
                }
                if (iM24237 == 9) {
                    return new C4150((c9466.m24238() << 24) | (c9466.m24238() >>> 8));
                }
                throw new C8116("Bad hex colour value: ".concat(str));
            }
            int iM24239 = c9466.m24238();
            int i6 = 61440 & iM24239;
            int i7 = iM24239 & 3840;
            int i8 = iM24239 & 240;
            int i9 = iM24239 & 15;
            return new C4150((i9 << 24) | (i9 << 28) | (i6 << 8) | (i6 << 4) | (i7 << 4) | i7 | i8 | (i8 >> 4));
        }
        boolean zM30696 = m30696(str, "rgba(");
        if (zM30696 || m30696(str, "rgb(")) {
            C0354 c0354 = new C0354(str, zM30696 ? 5 : 4);
            c0354.m2051();
            float fM2042 = c0354.m2042();
            if (!Float.isNaN(fM2042) && c0354.m2048('%')) {
                fM2042 = (fM2042 * 256.0f) / 100.0f;
            }
            float fM2044 = c0354.m2044(fM2042);
            if (!Float.isNaN(fM2044) && c0354.m2048('%')) {
                fM2044 = (fM2044 * 256.0f) / 100.0f;
            }
            float fM2045 = c0354.m2044(fM2044);
            if (!Float.isNaN(fM2045) && c0354.m2048('%')) {
                fM2045 = (fM2045 * 256.0f) / 100.0f;
            }
            if (!zM30696) {
                c0354.m2051();
                if (Float.isNaN(fM2045) || !c0354.m2048(')')) {
                    throw new C8116("Bad rgb() colour value: ".concat(str));
                }
                return new C4150((m30673(fM2042) << 16) | (-16777216) | (m30673(fM2044) << 8) | m30673(fM2045));
            }
            float fM2046 = c0354.m2044(fM2045);
            c0354.m2051();
            if (Float.isNaN(fM2046) || !c0354.m2048(')')) {
                throw new C8116("Bad rgba() colour value: ".concat(str));
            }
            return new C4150((m30673(fM2046 * 256.0f) << 24) | (m30673(fM2042) << 16) | (m30673(fM2044) << 8) | m30673(fM2045));
        }
        boolean zM30697 = m30696(str, "hsla(");
        if (!zM30697 && !m30696(str, "hsl(")) {
            String lowerCase = str.toLowerCase(Locale.US);
            Integer numM22958 = C8822.m22958(lowerCase);
            if (numM22958 != null) {
                return new C4150(numM22958.intValue());
            }
            throw new C8116(C0252.m1693("Invalid colour keyword: ", lowerCase));
        }
        C0354 c0355 = new C0354(str, zM30697 ? 5 : 4);
        c0355.m2051();
        float fM2043 = c0355.m2042();
        float fM2047 = c0355.m2044(fM2043);
        if (!Float.isNaN(fM2047)) {
            c0355.m2048('%');
        }
        float fM2048 = c0355.m2044(fM2047);
        if (!Float.isNaN(fM2048)) {
            c0355.m2048('%');
        }
        if (!zM30697) {
            c0355.m2051();
            if (Float.isNaN(fM2048) || !c0355.m2048(')')) {
                throw new C8116("Bad hsl() colour value: ".concat(str));
            }
            return new C4150(m30674(fM2043, fM2047, fM2048) | (-16777216));
        }
        float fM2049 = c0355.m2044(fM2048);
        c0355.m2051();
        if (Float.isNaN(fM2049) || !c0355.m2048(')')) {
            throw new C8116("Bad hsla() colour value: ".concat(str));
        }
        return new C4150((m30673(fM2049 * 256.0f) << 24) | m30674(fM2043, fM2047, fM2048));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30696(String str, String str2) {
        if (str.length() >= str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                if (cCharAt == str2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30673(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30674(float f, float f2, float f3) {
        float f4 = 0.0f;
        float f5 = f % 360.0f;
        if (f < 0.0f) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= 0.0f) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f10 = (f4 * 2.0f) - f9;
        float fM30702 = m30702(f10, f9, f6 + 2.0f);
        float fM30703 = m30702(f10, f9, f6);
        return m30673(m30702(f10, f9, f6 - 2.0f) * 256.0f) | (m30673(fM30702 * 256.0f) << 16) | (m30673(fM30703 * 256.0f) << 8);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static float m30702(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            return C0280.m1792(f2, f, f3, f);
        }
        if (f3 < 3.0f) {
            return f2;
        }
        return f3 < 4.0f ? C0280.m1792(4.0f, f3, f2 - f, f) : f;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static ArrayList m30697(String str) {
        C0354 c0354 = new C0354(str);
        ArrayList arrayList = null;
        do {
            String strM2055 = c0354.m2055();
            if (strM2055 == null) {
                strM2055 = c0354.m2047(true, ',');
            }
            if (strM2055 == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strM2055);
            c0354.m2043();
        } while (!c0354.m2054());
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C10502 m30703(C0354 c0354) {
        if (c0354.m2049("auto")) {
            return new C10502(0.0f);
        }
        return c0354.m2050();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m30709(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }
}
