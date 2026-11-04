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

/* JADX INFO: renamed from: l.۠ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes3.dex */
public final class C8463 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f27724;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f27726;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f27732;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C1752 f27734 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC24170 f27725 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f27727 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f27733 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC1006 f27729 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public StringBuilder f27730 = null;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f27731 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public StringBuilder f27728 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1752 m22777(InputStream inputStream, boolean z) {
        this.f27726 = z;
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
            m22771(inputStream);
            if (z && !this.f27724) {
                throw new C14429("SVG root element is missing");
            }
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            return this.f27734;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m22771(InputStream inputStream) throws C14429 {
        String text;
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                C2497 c2497 = new C2497(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        this.f27734 = new C1752();
                        this.f27724 = false;
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        C9208 c9208 = new C9208(xmlPullParserNewPullParser.getText());
                        String strM24375 = c9208.m24375();
                        m22762(c9208);
                        strM24375.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (this.f27734.m6193() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                m22740(inputStream);
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
                        m22743(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, c2497);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        m22742(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        m22759(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        m22767(xmlPullParserNewPullParser.getText());
                    } else if (eventType == 6 && (text = xmlPullParserNewPullParser.getText()) != null) {
                        m22767(text);
                    }
                }
            } catch (XmlPullParserException e) {
                throw new C14429("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new C14429("Stream error", e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22740(InputStream inputStream) throws C14429 {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            if (this.f27726) {
                sAXParserFactoryNewInstance.setNamespaceAware(true);
            }
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            C18905 c18905 = new C18905(this);
            xMLReader.setContentHandler(c18905);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", c18905);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new C14429("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new C14429("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new C14429("SVG parse error", e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22746(C8463 c8463) {
        c8463.f27734 = new C1752();
        c8463.f27724 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:463:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:466:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:787:0x0907 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:0x0903 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m22743(String str, String str2, String str3, Attributes attributes) throws C14429 {
        int iIntValue;
        float fM24379;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        char cCharAt;
        boolean z;
        Attributes attributes2 = attributes;
        if (this.f27726 && !this.f27724) {
            if (!"svg".equals(str2.length() > 0 ? str2 : str3) || (!"http://www.w3.org/2000/svg".equals(str) && !"".equals(str))) {
                throw new C14429("Image XML root is not SVG");
            }
            this.f27724 = true;
        }
        if (this.f27727) {
            this.f27732++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            EnumC1006 enumC1006M3886 = EnumC1006.m3886(str2.length() > 0 ? str2 : str3);
            int i2 = 77;
            switch (enumC1006M3886.ordinal()) {
                case 0:
                    m22773(attributes2);
                    return;
                case 1:
                case 7:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C23996 c23996 = new C23996();
                    c23996.f59446 = this.f27734;
                    c23996.f59447 = this.f27725;
                    m22754((AbstractC14472) c23996, attributes2);
                    m22772(c23996, attributes2);
                    m22744((InterfaceC3858) c23996, attributes2);
                    m22756((InterfaceC20440) c23996, attributes2);
                    this.f27725.mo14635(c23996);
                    this.f27725 = c23996;
                    return;
                case 2:
                    m22758(attributes2);
                    return;
                case 3:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C16536 c16536 = new C16536();
                    c16536.f59446 = this.f27734;
                    c16536.f59447 = this.f27725;
                    m22754((AbstractC14472) c16536, attributes2);
                    m22772(c16536, attributes2);
                    m22744((InterfaceC3858) c16536, attributes2);
                    m22756((InterfaceC20440) c16536, attributes2);
                    for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                        String strTrim = attributes2.getValue(i3).trim();
                        if (EnumC9954.m25788(attributes2.getLocalName(i3)).ordinal() == 3) {
                            if ("objectBoundingBox".equals(strTrim)) {
                                c16536.f53532 = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim)) {
                                    throw new C14429("Invalid value for attribute clipPathUnits");
                                }
                                c16536.f53532 = Boolean.TRUE;
                            }
                        }
                    }
                    this.f27725.mo14635(c16536);
                    this.f27725 = c16536;
                    return;
                case 4:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C23250 c23250 = new C23250();
                    c23250.f59446 = this.f27734;
                    c23250.f59447 = this.f27725;
                    m22754((AbstractC14472) c23250, attributes2);
                    m22772(c23250, attributes2);
                    m22744((InterfaceC3858) c23250, attributes2);
                    this.f27725.mo14635(c23250);
                    this.f27725 = c23250;
                    return;
                case 5:
                case 26:
                    this.f27733 = true;
                    this.f27729 = enumC1006M3886;
                    return;
                case 6:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C3112 c3112 = new C3112();
                    c3112.f59446 = this.f27734;
                    c3112.f59447 = this.f27725;
                    m22754((AbstractC14472) c3112, attributes2);
                    m22772(c3112, attributes2);
                    m22744((InterfaceC3858) c3112, attributes2);
                    m22756((InterfaceC20440) c3112, attributes2);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String strTrim2 = attributes2.getValue(i4).trim();
                        int iOrdinal = EnumC9954.m25788(attributes2.getLocalName(i4)).ordinal();
                        if (iOrdinal == 6) {
                            c3112.f10084 = m22765(strTrim2);
                        } else if (iOrdinal == 7) {
                            c3112.f10081 = m22765(strTrim2);
                        } else if (iOrdinal == 56) {
                            C18028 c18028M22765 = m22765(strTrim2);
                            c3112.f10083 = c18028M22765;
                            if (c18028M22765.m42031()) {
                                throw new C14429("Invalid <ellipse> element. rx cannot be negative");
                            }
                        } else if (iOrdinal != 57) {
                            continue;
                        } else {
                            C18028 c18028M22766 = m22765(strTrim2);
                            c3112.f10082 = c18028M22766;
                            if (c18028M22766.m42031()) {
                                throw new C14429("Invalid <ellipse> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f27725.mo14635(c3112);
                    return;
                case 8:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C14298 c14298 = new C14298();
                    c14298.f59446 = this.f27734;
                    c14298.f59447 = this.f27725;
                    m22754((AbstractC14472) c14298, attributes2);
                    m22772(c14298, attributes2);
                    m22744((InterfaceC3858) c14298, attributes2);
                    m22756((InterfaceC20440) c14298, attributes2);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String strTrim3 = attributes2.getValue(i5).trim();
                        int iOrdinal2 = EnumC9954.m25788(attributes2.getLocalName(i5)).ordinal();
                        if (iOrdinal2 == 25) {
                            C18028 c18028M22767 = m22765(strTrim3);
                            c14298.f45146 = c18028M22767;
                            if (c18028M22767.m42031()) {
                                throw new C14429("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iOrdinal2 != 26) {
                            if (iOrdinal2 != 48) {
                                switch (iOrdinal2) {
                                    case 81:
                                        C18028 c18028M22768 = m22765(strTrim3);
                                        c14298.f45144 = c18028M22768;
                                        if (c18028M22768.m42031()) {
                                            throw new C14429("Invalid <use> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        c14298.f45143 = m22765(strTrim3);
                                        break;
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        c14298.f45147 = m22765(strTrim3);
                                        break;
                                }
                            } else {
                                m22745(c14298, strTrim3);
                            }
                        } else if ("".equals(attributes2.getURI(i5)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i5))) {
                            c14298.f45142 = strTrim3;
                        }
                    }
                    this.f27725.mo14635(c14298);
                    this.f27725 = c14298;
                    return;
                case 9:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C0129 c0129 = new C0129();
                    c0129.f59446 = this.f27734;
                    c0129.f59447 = this.f27725;
                    m22754((AbstractC14472) c0129, attributes2);
                    m22772(c0129, attributes2);
                    m22744((InterfaceC3858) c0129, attributes2);
                    m22756((InterfaceC20440) c0129, attributes2);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String strTrim4 = attributes2.getValue(i6).trim();
                        switch (EnumC9954.m25788(attributes2.getLocalName(i6)).ordinal()) {
                            case 84:
                                c0129.f1086 = m22765(strTrim4);
                                break;
                            case 85:
                                c0129.f1085 = m22765(strTrim4);
                                break;
                            case HRSS1373Polynomial.K /* 86 */:
                                c0129.f1083 = m22765(strTrim4);
                                break;
                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                c0129.f1084 = m22765(strTrim4);
                                break;
                        }
                    }
                    this.f27725.mo14635(c0129);
                    return;
                case 10:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C21186 c21186 = new C21186();
                    c21186.f59446 = this.f27734;
                    c21186.f59447 = this.f27725;
                    m22754((AbstractC14472) c21186, attributes2);
                    m22772(c21186, attributes2);
                    m22755((AbstractC20266) c21186, attributes2);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String strTrim5 = attributes2.getValue(i7).trim();
                        switch (EnumC9954.m25788(attributes2.getLocalName(i7)).ordinal()) {
                            case 84:
                                c21186.f67656 = m22765(strTrim5);
                                break;
                            case 85:
                                c21186.f67657 = m22765(strTrim5);
                                break;
                            case HRSS1373Polynomial.K /* 86 */:
                                c21186.f67655 = m22765(strTrim5);
                                break;
                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                c21186.f67654 = m22765(strTrim5);
                                break;
                        }
                    }
                    this.f27725.mo14635(c21186);
                    this.f27725 = c21186;
                    return;
                case 11:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C7587 c7587 = new C7587();
                    c7587.f59446 = this.f27734;
                    c7587.f59447 = this.f27725;
                    m22754((AbstractC14472) c7587, attributes2);
                    m22772(c7587, attributes2);
                    m22756((InterfaceC20440) c7587, attributes2);
                    m22750((AbstractC9997) c7587, attributes2);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String strTrim6 = attributes2.getValue(i8).trim();
                        int iOrdinal3 = EnumC9954.m25788(attributes2.getLocalName(i8)).ordinal();
                        if (iOrdinal3 != 41) {
                            if (iOrdinal3 == 50) {
                                c7587.f25060 = m22765(strTrim6);
                            } else if (iOrdinal3 != 51) {
                                switch (iOrdinal3) {
                                    case 32:
                                        C18028 c18028M22769 = m22765(strTrim6);
                                        c7587.f25055 = c18028M22769;
                                        if (c18028M22769.m42031()) {
                                            throw new C14429("Invalid <marker> element. markerHeight cannot be negative");
                                        }
                                        break;
                                    case 33:
                                        if (!"strokeWidth".equals(strTrim6)) {
                                            if (!"userSpaceOnUse".equals(strTrim6)) {
                                                throw new C14429("Invalid value for attribute markerUnits");
                                            }
                                            c7587.f25059 = true;
                                        } else {
                                            c7587.f25059 = false;
                                        }
                                        break;
                                    case 34:
                                        C18028 c18028M227610 = m22765(strTrim6);
                                        c7587.f25058 = c18028M227610;
                                        if (c18028M227610.m42031()) {
                                            throw new C14429("Invalid <marker> element. markerWidth cannot be negative");
                                        }
                                        break;
                                }
                            } else {
                                c7587.f25056 = m22765(strTrim6);
                            }
                        } else if ("auto".equals(strTrim6)) {
                            c7587.f25057 = Float.valueOf(Float.NaN);
                        } else {
                            c7587.f25057 = Float.valueOf(m22775(strTrim6));
                        }
                    }
                    this.f27725.mo14635(c7587);
                    this.f27725 = c7587;
                    return;
                case 12:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C18774 c18774 = new C18774();
                    c18774.f59446 = this.f27734;
                    c18774.f59447 = this.f27725;
                    m22754((AbstractC14472) c18774, attributes);
                    m22772(c18774, attributes);
                    m22756((InterfaceC20440) c18774, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String strTrim7 = attributes.getValue(i9).trim();
                        int iOrdinal4 = EnumC9954.m25788(attributes.getLocalName(i9)).ordinal();
                        if (iOrdinal4 == 25) {
                            C18028 c18028M227611 = m22765(strTrim7);
                            c18774.f60979 = c18028M227611;
                            if (c18028M227611.m42031()) {
                                throw new C14429("Invalid <mask> element. height cannot be negative");
                            }
                        } else if (iOrdinal4 != 36) {
                            if (iOrdinal4 != 37) {
                                switch (iOrdinal4) {
                                    case 81:
                                        C18028 c18028M227612 = m22765(strTrim7);
                                        c18774.f60980 = c18028M227612;
                                        if (c18028M227612.m42031()) {
                                            throw new C14429("Invalid <mask> element. width cannot be negative");
                                        }
                                        break;
                                        break;
                                    case 82:
                                        m22765(strTrim7);
                                        break;
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        m22765(strTrim7);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim7)) {
                                c18774.f60978 = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim7)) {
                                    throw new C14429("Invalid value for attribute maskUnits");
                                }
                                c18774.f60978 = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim7)) {
                            c18774.f60981 = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim7)) {
                                throw new C14429("Invalid value for attribute maskContentUnits");
                            }
                            c18774.f60981 = Boolean.TRUE;
                        }
                    }
                    this.f27725.mo14635(c18774);
                    this.f27725 = c18774;
                    return;
                case 13:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C9077 c9077 = new C9077();
                    c9077.f59446 = this.f27734;
                    c9077.f59447 = this.f27725;
                    m22754((AbstractC14472) c9077, attributes2);
                    m22772(c9077, attributes2);
                    m22744((InterfaceC3858) c9077, attributes2);
                    m22756((InterfaceC20440) c9077, attributes2);
                    int i10 = 0;
                    while (i10 < attributes.getLength()) {
                        String strTrim8 = attributes2.getValue(i10).trim();
                        int iOrdinal5 = EnumC9954.m25788(attributes2.getLocalName(i10)).ordinal();
                        if (iOrdinal5 == 13) {
                            C9208 c9208 = new C9208(strTrim8);
                            C2366 c2366 = new C2366();
                            if (!c9208.m24378() && ((iIntValue = c9208.m24373().intValue()) == i2 || iIntValue == 109)) {
                                float f5 = 0.0f;
                                float fM243710 = 0.0f;
                                float f6 = 0.0f;
                                float fM24366 = 0.0f;
                                float f7 = 0.0f;
                                float f8 = 0.0f;
                                while (true) {
                                    c9208.m24374();
                                    switch (iIntValue) {
                                        case 65:
                                        case 97:
                                            float fM243711 = c9208.m24379();
                                            float fM24367 = c9208.m24366(fM243711);
                                            float fM24368 = c9208.m24366(fM24367);
                                            Boolean boolM24368 = c9208.m24368(Float.valueOf(fM24368));
                                            Boolean boolM24369 = c9208.m24368(boolM24368);
                                            if (boolM24369 == null) {
                                                fM24379 = Float.NaN;
                                            } else {
                                                c9208.m24365();
                                                fM24379 = c9208.m24379();
                                            }
                                            float fM24369 = c9208.m24366(fM24379);
                                            if (!Float.isNaN(fM24369)) {
                                                if (fM243711 >= 0.0f && fM24367 >= 0.0f) {
                                                    if (iIntValue == 97) {
                                                        fM24379 += f5;
                                                        fM24369 += f6;
                                                    }
                                                    f5 = fM24379;
                                                    float f9 = fM24369;
                                                    c2366.mo8040(fM243711, fM24367, fM24368, boolM24368.booleanValue(), boolM24369.booleanValue(), f5, f9);
                                                    fM24366 = f9;
                                                    fM243710 = f5;
                                                    f6 = fM24366;
                                                    c9208.m24365();
                                                    if (c9208.m24378()) {
                                                        i = c9208.f30024;
                                                        if (i != c9208.f30025 && (((cCharAt = c9208.f30022.charAt(i)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                                            iIntValue = c9208.m24373().intValue();
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case 67:
                                        case q.f /* 99 */:
                                            float fM243712 = c9208.m24379();
                                            float fM243610 = c9208.m24366(fM243712);
                                            float fM243611 = c9208.m24366(fM243610);
                                            float fM243612 = c9208.m24366(fM243611);
                                            float fM243613 = c9208.m24366(fM243612);
                                            float fM243614 = c9208.m24366(fM243613);
                                            if (!Float.isNaN(fM243614)) {
                                                if (iIntValue == 99) {
                                                    fM243613 += f5;
                                                    fM243614 += f6;
                                                    fM243712 += f5;
                                                    fM243610 += f6;
                                                    fM243611 += f5;
                                                    fM243612 += f6;
                                                }
                                                f = fM243611;
                                                f2 = fM243612;
                                                f3 = fM243613;
                                                f4 = fM243614;
                                                c2366.mo8039(fM243712, fM243610, f, f2, f3, f4);
                                                fM243710 = f;
                                                fM24366 = f2;
                                                f5 = f3;
                                                f6 = f4;
                                                c9208.m24365();
                                                if (c9208.m24378()) {
                                                    i = c9208.f30024;
                                                    if (i != c9208.f30025) {
                                                        iIntValue = c9208.m24373().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 72:
                                        case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                            fM243710 = c9208.m24379();
                                            if (!Float.isNaN(fM243710)) {
                                                if (iIntValue == 104) {
                                                    fM243710 += f5;
                                                }
                                                c2366.mo8042(fM243710, f6);
                                                f5 = fM243710;
                                                c9208.m24365();
                                                if (c9208.m24378()) {
                                                    i = c9208.f30024;
                                                    if (i != c9208.f30025) {
                                                        iIntValue = c9208.m24373().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                        case 108:
                                            float fM243713 = c9208.m24379();
                                            fM24366 = c9208.m24366(fM243713);
                                            if (!Float.isNaN(fM24366)) {
                                                if (iIntValue == 108) {
                                                    fM243713 += f5;
                                                    fM24366 += f6;
                                                }
                                                f5 = fM243713;
                                                c2366.mo8042(f5, fM24366);
                                                fM243710 = f5;
                                                f6 = fM24366;
                                                c9208.m24365();
                                                if (c9208.m24378()) {
                                                    i = c9208.f30024;
                                                    if (i != c9208.f30025) {
                                                        iIntValue = c9208.m24373().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 77:
                                        case 109:
                                            fM243710 = c9208.m24379();
                                            fM24366 = c9208.m24366(fM243710);
                                            if (!Float.isNaN(fM24366)) {
                                                if (iIntValue == 109 && !c2366.m8043()) {
                                                    fM243710 += f5;
                                                    fM24366 += f6;
                                                }
                                                c2366.mo8037(fM243710, fM24366);
                                                iIntValue = iIntValue == 109 ? 108 : 76;
                                                f5 = fM243710;
                                                f7 = f5;
                                                f6 = fM24366;
                                                f8 = f6;
                                                c9208.m24365();
                                                if (c9208.m24378()) {
                                                    i = c9208.f30024;
                                                    if (i != c9208.f30025) {
                                                        iIntValue = c9208.m24373().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 81:
                                        case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                            fM243710 = c9208.m24379();
                                            fM24366 = c9208.m24366(fM243710);
                                            float fM243615 = c9208.m24366(fM24366);
                                            float fM243616 = c9208.m24366(fM243615);
                                            if (!Float.isNaN(fM243616)) {
                                                if (iIntValue == 113) {
                                                    fM243615 += f5;
                                                    fM243616 += f6;
                                                    fM243710 += f5;
                                                    fM24366 += f6;
                                                }
                                                c2366.mo8038(fM243710, fM24366, fM243615, fM243616);
                                                f5 = fM243615;
                                                f6 = fM243616;
                                                c9208.m24365();
                                                if (c9208.m24378()) {
                                                    i = c9208.f30024;
                                                    if (i != c9208.f30025) {
                                                        iIntValue = c9208.m24373().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        case 115:
                                            float f10 = (f5 * 2.0f) - fM243710;
                                            float f11 = (2.0f * f6) - fM24366;
                                            float fM243714 = c9208.m24379();
                                            float fM243617 = c9208.m24366(fM243714);
                                            float fM243618 = c9208.m24366(fM243617);
                                            float fM243619 = c9208.m24366(fM243618);
                                            if (!Float.isNaN(fM243619)) {
                                                if (iIntValue == 115) {
                                                    fM243618 += f5;
                                                    fM243619 += f6;
                                                    fM243714 += f5;
                                                    fM243617 += f6;
                                                }
                                                f = fM243714;
                                                f2 = fM243617;
                                                f3 = fM243618;
                                                f4 = fM243619;
                                                c2366.mo8039(f10, f11, f, f2, f3, f4);
                                                fM243710 = f;
                                                fM24366 = f2;
                                                f5 = f3;
                                                f6 = f4;
                                                c9208.m24365();
                                                if (c9208.m24378()) {
                                                    i = c9208.f30024;
                                                    if (i != c9208.f30025) {
                                                        iIntValue = c9208.m24373().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 84:
                                        case 116:
                                            float f12 = (f5 * 2.0f) - fM243710;
                                            float f13 = (2.0f * f6) - fM24366;
                                            float fM243715 = c9208.m24379();
                                            float fM243620 = c9208.m24366(fM243715);
                                            if (!Float.isNaN(fM243620)) {
                                                if (iIntValue == 116) {
                                                    fM243715 += f5;
                                                    fM243620 += f6;
                                                }
                                                c2366.mo8038(f12, f13, fM243715, fM243620);
                                                f5 = fM243715;
                                                f6 = fM243620;
                                                fM243710 = f12;
                                                fM24366 = f13;
                                                c9208.m24365();
                                                if (c9208.m24378()) {
                                                    i = c9208.f30024;
                                                    if (i != c9208.f30025) {
                                                        iIntValue = c9208.m24373().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case HRSS1373Polynomial.K /* 86 */:
                                        case 118:
                                            fM24366 = c9208.m24379();
                                            if (!Float.isNaN(fM24366)) {
                                                if (iIntValue == 118) {
                                                    fM24366 += f6;
                                                }
                                                c2366.mo8042(f5, fM24366);
                                                f6 = fM24366;
                                                c9208.m24365();
                                                if (c9208.m24378()) {
                                                    i = c9208.f30024;
                                                    if (i != c9208.f30025) {
                                                        iIntValue = c9208.m24373().intValue();
                                                    }
                                                }
                                            }
                                            break;
                                        case 90:
                                        case 122:
                                            c2366.close();
                                            f5 = f7;
                                            fM243710 = f5;
                                            fM24366 = f8;
                                            f6 = fM24366;
                                            c9208.m24365();
                                            if (c9208.m24378()) {
                                                i = c9208.f30024;
                                                if (i != c9208.f30025) {
                                                    iIntValue = c9208.m24373().intValue();
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }
                            c9077.f29506 = c2366;
                        } else if (iOrdinal5 == 43 && m22775(strTrim8) < 0.0f) {
                            throw new C14429("Invalid <path> element. pathLength cannot be negative");
                        }
                        i10++;
                        i2 = 77;
                        attributes2 = attributes;
                    }
                    this.f27725.mo14635(c9077);
                    return;
                case 14:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C6841 c6841 = new C6841();
                    c6841.f59446 = this.f27734;
                    c6841.f59447 = this.f27725;
                    m22754((AbstractC14472) c6841, attributes2);
                    m22772(c6841, attributes2);
                    m22756((InterfaceC20440) c6841, attributes2);
                    m22750((AbstractC9997) c6841, attributes2);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String strTrim9 = attributes2.getValue(i11).trim();
                        int iOrdinal6 = EnumC9954.m25788(attributes2.getLocalName(i11)).ordinal();
                        if (iOrdinal6 == 25) {
                            C18028 c18028M227613 = m22765(strTrim9);
                            c6841.f22744 = c18028M227613;
                            if (c18028M227613.m42031()) {
                                throw new C14429("Invalid <pattern> element. height cannot be negative");
                            }
                        } else if (iOrdinal6 != 26) {
                            switch (iOrdinal6) {
                                case 44:
                                    if (!"objectBoundingBox".equals(strTrim9)) {
                                        if (!"userSpaceOnUse".equals(strTrim9)) {
                                            throw new C14429("Invalid value for attribute patternContentUnits");
                                        }
                                        c6841.f22747 = Boolean.TRUE;
                                    } else {
                                        c6841.f22747 = Boolean.FALSE;
                                    }
                                    break;
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    c6841.f22746 = m22776(strTrim9);
                                    break;
                                case 46:
                                    if (!"objectBoundingBox".equals(strTrim9)) {
                                        if (!"userSpaceOnUse".equals(strTrim9)) {
                                            throw new C14429("Invalid value for attribute patternUnits");
                                        }
                                        c6841.f22751 = Boolean.TRUE;
                                    } else {
                                        c6841.f22751 = Boolean.FALSE;
                                    }
                                    break;
                                default:
                                    switch (iOrdinal6) {
                                        case 81:
                                            C18028 c18028M227614 = m22765(strTrim9);
                                            c6841.f22745 = c18028M227614;
                                            if (c18028M227614.m42031()) {
                                                throw new C14429("Invalid <pattern> element. width cannot be negative");
                                            }
                                            break;
                                            break;
                                        case 82:
                                            c6841.f22748 = m22765(strTrim9);
                                            break;
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                            c6841.f22750 = m22765(strTrim9);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("".equals(attributes2.getURI(i11)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i11))) {
                            c6841.f22749 = strTrim9;
                        }
                    }
                    this.f27725.mo14635(c6841);
                    this.f27725 = c6841;
                    return;
                case 15:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C4778 c4778 = new C4778();
                    c4778.f59446 = this.f27734;
                    c4778.f59447 = this.f27725;
                    m22754((AbstractC14472) c4778, attributes2);
                    m22772(c4778, attributes2);
                    m22744((InterfaceC3858) c4778, attributes2);
                    m22756((InterfaceC20440) c4778, attributes2);
                    m22752(c4778, attributes2, "polygon");
                    this.f27725.mo14635(c4778);
                    return;
                case 16:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C13552 c13552 = new C13552();
                    c13552.f59446 = this.f27734;
                    c13552.f59447 = this.f27725;
                    m22754((AbstractC14472) c13552, attributes2);
                    m22772(c13552, attributes2);
                    m22744((InterfaceC3858) c13552, attributes2);
                    m22756((InterfaceC20440) c13552, attributes2);
                    m22752(c13552, attributes2, "polyline");
                    this.f27725.mo14635(c13552);
                    return;
                case 17:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C18948 c18948 = new C18948();
                    c18948.f59446 = this.f27734;
                    c18948.f59447 = this.f27725;
                    m22754((AbstractC14472) c18948, attributes2);
                    m22772(c18948, attributes2);
                    m22755((AbstractC20266) c18948, attributes2);
                    for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                        String strTrim10 = attributes2.getValue(i12).trim();
                        int iOrdinal7 = EnumC9954.m25788(attributes2.getLocalName(i12)).ordinal();
                        if (iOrdinal7 == 6) {
                            c18948.f61450 = m22765(strTrim10);
                        } else if (iOrdinal7 == 7) {
                            c18948.f61449 = m22765(strTrim10);
                        } else if (iOrdinal7 == 11) {
                            c18948.f61452 = m22765(strTrim10);
                        } else if (iOrdinal7 == 12) {
                            c18948.f61448 = m22765(strTrim10);
                        } else if (iOrdinal7 != 49) {
                            continue;
                        } else {
                            C18028 c18028M227615 = m22765(strTrim10);
                            c18948.f61451 = c18028M227615;
                            if (c18028M227615.m42031()) {
                                throw new C14429("Invalid <radialGradient> element. r cannot be negative");
                            }
                        }
                    }
                    this.f27725.mo14635(c18948);
                    this.f27725 = c18948;
                    return;
                case 18:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C21932 c21932 = new C21932();
                    c21932.f59446 = this.f27734;
                    c21932.f59447 = this.f27725;
                    m22754((AbstractC14472) c21932, attributes2);
                    m22772(c21932, attributes2);
                    m22744((InterfaceC3858) c21932, attributes2);
                    m22756((InterfaceC20440) c21932, attributes2);
                    for (int i13 = 0; i13 < attributes.getLength(); i13++) {
                        String strTrim11 = attributes2.getValue(i13).trim();
                        int iOrdinal8 = EnumC9954.m25788(attributes2.getLocalName(i13)).ordinal();
                        if (iOrdinal8 == 25) {
                            C18028 c18028M227616 = m22765(strTrim11);
                            c21932.f70807 = c18028M227616;
                            if (c18028M227616.m42031()) {
                                throw new C14429("Invalid <rect> element. height cannot be negative");
                            }
                        } else if (iOrdinal8 == 56) {
                            C18028 c18028M227617 = m22765(strTrim11);
                            c21932.f70803 = c18028M227617;
                            if (c18028M227617.m42031()) {
                                throw new C14429("Invalid <rect> element. rx cannot be negative");
                            }
                        } else if (iOrdinal8 != 57) {
                            switch (iOrdinal8) {
                                case 81:
                                    C18028 c18028M227618 = m22765(strTrim11);
                                    c21932.f70805 = c18028M227618;
                                    if (c18028M227618.m42031()) {
                                        throw new C14429("Invalid <rect> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c21932.f70804 = m22765(strTrim11);
                                    break;
                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    c21932.f70808 = m22765(strTrim11);
                                    break;
                            }
                        } else {
                            C18028 c18028M227619 = m22765(strTrim11);
                            c21932.f70806 = c18028M227619;
                            if (c18028M227619.m42031()) {
                                throw new C14429("Invalid <rect> element. ry cannot be negative");
                            }
                        }
                    }
                    this.f27725.mo14635(c21932);
                    return;
                case 19:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C22678 c22678 = new C22678();
                    c22678.f59446 = this.f27734;
                    c22678.f59447 = this.f27725;
                    m22754(c22678, attributes2);
                    m22772(c22678, attributes2);
                    this.f27725.mo14635(c22678);
                    this.f27725 = c22678;
                    return;
                case 20:
                    InterfaceC24170 interfaceC24170 = this.f27725;
                    if (interfaceC24170 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC24170 instanceof AbstractC20266)) {
                        throw new C14429("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                    }
                    C19694 c19694 = new C19694();
                    c19694.f59446 = this.f27734;
                    c19694.f59447 = this.f27725;
                    m22754(c19694, attributes2);
                    m22772(c19694, attributes2);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim12 = attributes2.getValue(i14).trim();
                        if (EnumC9954.m25788(attributes2.getLocalName(i14)).ordinal() == 39) {
                            if (strTrim12.length() == 0) {
                                throw new C14429("Invalid offset value in <stop> (empty string)");
                            }
                            int length = strTrim12.length();
                            if (C22313.m50373(1, strTrim12) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float fM22736 = m22736(length, strTrim12);
                                float f14 = 100.0f;
                                if (z) {
                                    fM22736 /= 100.0f;
                                }
                                if (fM22736 < 0.0f) {
                                    f14 = 0.0f;
                                } else if (fM22736 <= 100.0f) {
                                    f14 = fM22736;
                                }
                                c19694.f63420 = Float.valueOf(f14);
                            } catch (NumberFormatException e) {
                                throw new C14429("Invalid offset value in <stop>: ".concat(strTrim12), e);
                            }
                        }
                    }
                    this.f27725.mo14635(c19694);
                    this.f27725 = c19694;
                    return;
                case 21:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    String str4 = ProviderConfigurationPermission.ALL_STR;
                    boolean zEquals = true;
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        String strTrim13 = attributes2.getValue(i15).trim();
                        int iOrdinal9 = EnumC9954.m25788(attributes2.getLocalName(i15)).ordinal();
                        if (iOrdinal9 == 38) {
                            str4 = strTrim13;
                        } else if (iOrdinal9 == 77) {
                            zEquals = strTrim13.equals("text/css");
                        }
                    }
                    if (zEquals && C21758.m49319(str4, EnumC4054.screen)) {
                        this.f27731 = true;
                        return;
                    } else {
                        this.f27727 = true;
                        this.f27732 = 1;
                        return;
                    }
                case 22:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C1049 c1049 = new C1049();
                    c1049.f59446 = this.f27734;
                    c1049.f59447 = this.f27725;
                    m22754((AbstractC14472) c1049, attributes2);
                    m22772(c1049, attributes2);
                    m22744((InterfaceC3858) c1049, attributes2);
                    m22756((InterfaceC20440) c1049, attributes2);
                    this.f27725.mo14635(c1049);
                    this.f27725 = c1049;
                    return;
                case 23:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C9251 c9251 = new C9251();
                    c9251.f59446 = this.f27734;
                    c9251.f59447 = this.f27725;
                    m22754((AbstractC14472) c9251, attributes2);
                    m22772(c9251, attributes2);
                    m22756((InterfaceC20440) c9251, attributes2);
                    m22750((AbstractC9997) c9251, attributes2);
                    this.f27725.mo14635(c9251);
                    this.f27725 = c9251;
                    return;
                case 24:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C7015 c7015 = new C7015();
                    c7015.f59446 = this.f27734;
                    c7015.f59447 = this.f27725;
                    m22754((AbstractC14472) c7015, attributes2);
                    m22772(c7015, attributes2);
                    m22744((InterfaceC3858) c7015, attributes2);
                    m22756((InterfaceC20440) c7015, attributes2);
                    m22751((AbstractC10700) c7015, attributes2);
                    this.f27725.mo14635(c7015);
                    this.f27725 = c7015;
                    return;
                case 25:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C21889 c21889 = new C21889();
                    c21889.f59446 = this.f27734;
                    c21889.f59447 = this.f27725;
                    m22754((AbstractC14472) c21889, attributes2);
                    m22772(c21889, attributes2);
                    m22756((InterfaceC20440) c21889, attributes2);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String strTrim14 = attributes2.getValue(i16).trim();
                        int iOrdinal10 = EnumC9954.m25788(attributes2.getLocalName(i16)).ordinal();
                        if (iOrdinal10 != 26) {
                            if (iOrdinal10 == 61) {
                                c21889.f70723 = m22765(strTrim14);
                            }
                        } else if ("".equals(attributes2.getURI(i16)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i16))) {
                            c21889.f70722 = strTrim14;
                        }
                    }
                    this.f27725.mo14635(c21889);
                    this.f27725 = c21889;
                    InterfaceC24170 interfaceC24171 = c21889.f59447;
                    if (interfaceC24171 instanceof InterfaceC22635) {
                        c21889.m49584((InterfaceC22635) interfaceC24171);
                        return;
                    } else {
                        c21889.m49584(((InterfaceC13726) interfaceC24171).mo8467());
                        return;
                    }
                case 27:
                    InterfaceC24170 interfaceC24172 = this.f27725;
                    if (interfaceC24172 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC24172 instanceof AbstractC4735)) {
                        throw new C14429("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                    C2540 c2540 = new C2540();
                    c2540.f59446 = this.f27734;
                    c2540.f59447 = this.f27725;
                    m22754((AbstractC14472) c2540, attributes2);
                    m22772(c2540, attributes2);
                    m22756((InterfaceC20440) c2540, attributes2);
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String strTrim15 = attributes2.getValue(i17).trim();
                        if (EnumC9954.m25788(attributes2.getLocalName(i17)).ordinal() == 26 && ("".equals(attributes2.getURI(i17)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i17)))) {
                            c2540.f8121 = strTrim15;
                        }
                    }
                    this.f27725.mo14635(c2540);
                    InterfaceC24170 interfaceC24173 = c2540.f59447;
                    if (interfaceC24173 instanceof InterfaceC22635) {
                        c2540.m8466((InterfaceC22635) interfaceC24173);
                        return;
                    } else {
                        c2540.m8466(((InterfaceC13726) interfaceC24173).mo8467());
                        return;
                    }
                case 28:
                    InterfaceC24170 interfaceC24174 = this.f27725;
                    if (interfaceC24174 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    if (!(interfaceC24174 instanceof AbstractC4735)) {
                        throw new C14429("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                    C8506 c8506 = new C8506();
                    c8506.f59446 = this.f27734;
                    c8506.f59447 = this.f27725;
                    m22754((AbstractC14472) c8506, attributes2);
                    m22772(c8506, attributes2);
                    m22756((InterfaceC20440) c8506, attributes2);
                    m22751((AbstractC10700) c8506, attributes2);
                    this.f27725.mo14635(c8506);
                    this.f27725 = c8506;
                    InterfaceC24170 interfaceC24175 = c8506.f59447;
                    if (interfaceC24175 instanceof InterfaceC22635) {
                        c8506.m22822((InterfaceC22635) interfaceC24175);
                        return;
                    } else {
                        c8506.m22822(((InterfaceC13726) interfaceC24175).mo8467());
                        return;
                    }
                case 29:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C12938 c12938 = new C12938();
                    c12938.f59446 = this.f27734;
                    c12938.f59447 = this.f27725;
                    m22754((AbstractC14472) c12938, attributes2);
                    m22772(c12938, attributes2);
                    m22744((InterfaceC3858) c12938, attributes2);
                    m22756((InterfaceC20440) c12938, attributes2);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String strTrim16 = attributes2.getValue(i18).trim();
                        int iOrdinal11 = EnumC9954.m25788(attributes2.getLocalName(i18)).ordinal();
                        if (iOrdinal11 == 25) {
                            C18028 c18028M227620 = m22765(strTrim16);
                            c12938.f41491 = c18028M227620;
                            if (c18028M227620.m42031()) {
                                throw new C14429("Invalid <use> element. height cannot be negative");
                            }
                        } else if (iOrdinal11 != 26) {
                            switch (iOrdinal11) {
                                case 81:
                                    C18028 c18028M227621 = m22765(strTrim16);
                                    c12938.f41490 = c18028M227621;
                                    if (c18028M227621.m42031()) {
                                        throw new C14429("Invalid <use> element. width cannot be negative");
                                    }
                                    break;
                                    break;
                                case 82:
                                    c12938.f41489 = m22765(strTrim16);
                                    break;
                                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    c12938.f41488 = m22765(strTrim16);
                                    break;
                            }
                        } else if ("".equals(attributes2.getURI(i18)) || "http://www.w3.org/1999/xlink".equals(attributes2.getURI(i18))) {
                            c12938.f41487 = strTrim16;
                        }
                    }
                    this.f27725.mo14635(c12938);
                    this.f27725 = c12938;
                    return;
                case 30:
                    if (this.f27725 == null) {
                        throw new C14429("Invalid document. Root element must be <svg>");
                    }
                    C5481 c5481 = new C5481();
                    c5481.f59446 = this.f27734;
                    c5481.f59447 = this.f27725;
                    m22754((AbstractC14472) c5481, attributes2);
                    m22756((InterfaceC20440) c5481, attributes2);
                    m22750((AbstractC9997) c5481, attributes2);
                    this.f27725.mo14635(c5481);
                    this.f27725 = c5481;
                    return;
                default:
                    this.f27727 = true;
                    this.f27732 = 1;
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m22767(String str) {
        if (this.f27727) {
            return;
        }
        if (this.f27733) {
            if (this.f27730 == null) {
                this.f27730 = new StringBuilder(str.length());
            }
            this.f27730.append(str);
        } else if (this.f27731) {
            if (this.f27728 == null) {
                this.f27728 = new StringBuilder(str.length());
            }
            this.f27728.append(str);
        } else if (this.f27725 instanceof AbstractC4735) {
            m22741(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22759(char[] cArr, int i, int i2) {
        if (this.f27727) {
            return;
        }
        if (this.f27733) {
            if (this.f27730 == null) {
                this.f27730 = new StringBuilder(i2);
            }
            this.f27730.append(cArr, i, i2);
        } else if (this.f27731) {
            if (this.f27728 == null) {
                this.f27728 = new StringBuilder(i2);
            }
            this.f27728.append(cArr, i, i2);
        } else if (this.f27725 instanceof AbstractC4735) {
            m22741(new String(cArr, i, i2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22741(String str) {
        AbstractC12235 abstractC12235 = (AbstractC12235) this.f27725;
        int size = abstractC12235.f39383.size();
        C18202 c18202 = size == 0 ? null : (C18202) abstractC12235.f39383.get(size - 1);
        if (c18202 instanceof C19651) {
            C19651 c19651 = (C19651) c18202;
            c19651.f63296 = C8947.m23910(new StringBuilder(), c19651.f63296, str);
        } else {
            InterfaceC24170 interfaceC24170 = this.f27725;
            C19651 c19652 = new C19651();
            c19652.f63296 = str;
            interfaceC24170.mo14635(c19652);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m22742(String str, String str2, String str3) {
        if (this.f27727) {
            int i = this.f27732 - 1;
            this.f27732 = i;
            if (i == 0) {
                this.f27727 = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            switch (EnumC1006.m3886(str2).ordinal()) {
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
                    this.f27725 = ((C18202) this.f27725).f59447;
                    break;
                case 5:
                case 26:
                    this.f27733 = false;
                    if (this.f27730 != null) {
                        EnumC1006 enumC1006 = this.f27729;
                        if (enumC1006 == EnumC1006.title || enumC1006 == EnumC1006.desc) {
                            this.f27734.getClass();
                        }
                        this.f27730.setLength(0);
                    }
                    break;
                case 21:
                    StringBuilder sb = this.f27728;
                    if (sb != null) {
                        this.f27731 = false;
                        this.f27734.m6189(new C21758(EnumC4054.screen, EnumC4604.Document).m49326(sb.toString()));
                        this.f27728.setLength(0);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m22762(C9208 c9208) {
        HashMap map = new HashMap();
        c9208.m24374();
        while (true) {
            String strM24369 = c9208.m24369(false, a.h);
            if (strM24369 == null) {
                return map;
            }
            c9208.m24370(a.h);
            map.put(strM24369, c9208.m24376());
            c9208.m24374();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m22773(Attributes attributes) throws C14429 {
        C3286 c3286 = new C3286();
        c3286.f59446 = this.f27734;
        c3286.f59447 = this.f27725;
        m22754((AbstractC14472) c3286, attributes);
        m22772(c3286, attributes);
        m22756((InterfaceC20440) c3286, attributes);
        m22750((AbstractC9997) c3286, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC9954.m25788(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 25) {
                C18028 c18028M22765 = m22765(strTrim);
                c3286.f10708 = c18028M22765;
                if (c18028M22765.m42031()) {
                    throw new C14429("Invalid <svg> element. height cannot be negative");
                }
            } else if (iOrdinal != 79) {
                switch (iOrdinal) {
                    case 81:
                        C18028 c18028M22766 = m22765(strTrim);
                        c3286.f10711 = c18028M22766;
                        if (c18028M22766.m42031()) {
                            throw new C14429("Invalid <svg> element. width cannot be negative");
                        }
                        break;
                        break;
                    case 82:
                        c3286.f10710 = m22765(strTrim);
                        break;
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                        c3286.f10709 = m22765(strTrim);
                        break;
                }
            } else {
                continue;
            }
        }
        InterfaceC24170 interfaceC24170 = this.f27725;
        if (interfaceC24170 == null) {
            this.f27734.m6188(c3286);
        } else {
            interfaceC24170.mo14635(c3286);
        }
        this.f27725 = c3286;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22758(Attributes attributes) throws C14429 {
        if (this.f27725 == null) {
            throw new C14429("Invalid document. Root element must be <svg>");
        }
        C24742 c24742 = new C24742();
        c24742.f59446 = this.f27734;
        c24742.f59447 = this.f27725;
        m22754((AbstractC14472) c24742, attributes);
        m22772(c24742, attributes);
        m22744((InterfaceC3858) c24742, attributes);
        m22756((InterfaceC20440) c24742, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC9954.m25788(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 6) {
                c24742.f80122 = m22765(strTrim);
            } else if (iOrdinal == 7) {
                c24742.f80120 = m22765(strTrim);
            } else if (iOrdinal != 49) {
                continue;
            } else {
                C18028 c18028M22765 = m22765(strTrim);
                c24742.f80121 = c18028M22765;
                if (c18028M22765.m42031()) {
                    throw new C14429("Invalid <circle> element. r cannot be negative");
                }
            }
        }
        this.f27725.mo14635(c24742);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22752(C13552 c13552, Attributes attributes, String str) throws C14429 {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC9954.m25788(attributes.getLocalName(i)) == EnumC9954.points) {
                C9208 c9208 = new C9208(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                c9208.m24374();
                while (!c9208.m24378()) {
                    float fM24379 = c9208.m24379();
                    if (Float.isNaN(fM24379)) {
                        throw new C14429(C14442.m34865("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    c9208.m24365();
                    float fM243710 = c9208.m24379();
                    if (Float.isNaN(fM243710)) {
                        throw new C14429(C14442.m34865("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    c9208.m24365();
                    arrayList.add(Float.valueOf(fM24379));
                    arrayList.add(Float.valueOf(fM243710));
                }
                c13552.f43041 = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    c13552.f43041[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22751(AbstractC10700 abstractC10700, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC9954.m25788(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 9) {
                abstractC10700.f33968 = m22761(strTrim);
            } else if (iOrdinal == 10) {
                abstractC10700.f33970 = m22761(strTrim);
            } else if (iOrdinal == 82) {
                abstractC10700.f33967 = m22761(strTrim);
            } else if (iOrdinal == 83) {
                abstractC10700.f33969 = m22761(strTrim);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22756(InterfaceC20440 interfaceC20440, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC9954.m25788(attributes.getLocalName(i)).ordinal();
            if (iOrdinal != 73) {
                switch (iOrdinal) {
                    case 52:
                        C9208 c9208 = new C9208(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!c9208.m24378()) {
                            String strM24375 = c9208.m24375();
                            if (strM24375.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strM24375.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            c9208.m24374();
                        }
                        interfaceC20440.mo17933(hashSet);
                        break;
                    case 53:
                        interfaceC20440.mo17932(strTrim);
                        break;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        C9208 c9209 = new C9208(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!c9209.m24378()) {
                            hashSet2.add(c9209.m24375());
                            c9209.m24374();
                        }
                        interfaceC20440.mo17940(hashSet2);
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        ArrayList arrayListM22768 = m22768(strTrim);
                        interfaceC20440.mo17934(arrayListM22768 != null ? new HashSet(arrayListM22768) : new HashSet(0));
                        break;
                }
            } else {
                C9208 c92010 = new C9208(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!c92010.m24378()) {
                    String strM24376 = c92010.m24375();
                    int iIndexOf = strM24376.indexOf(45);
                    if (iIndexOf != -1) {
                        strM24376 = strM24376.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strM24376, "", "").getLanguage());
                    c92010.m24374();
                }
                interfaceC20440.mo17938(hashSet3);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22755(AbstractC20266 abstractC20266, Attributes attributes) throws C14429 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC9954.m25788(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 23) {
                abstractC20266.f65075 = m22776(strTrim);
            } else if (iOrdinal != 24) {
                if (iOrdinal != 26) {
                    if (iOrdinal != 60) {
                        continue;
                    } else {
                        try {
                            abstractC20266.f65078 = EnumC12061.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new C14429(C14442.m34865("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                        }
                    }
                } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    abstractC20266.f65079 = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                abstractC20266.f65077 = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new C14429("Invalid value for attribute gradientUnits");
                }
                abstractC20266.f65077 = Boolean.TRUE;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22754(AbstractC14472 abstractC14472, Attributes attributes) throws C14429 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                abstractC14472.f45545 = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    abstractC14472.f45544 = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new C14429(C25272.m56409("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    abstractC14472.f45544 = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m22772(AbstractC14472 abstractC14472, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iOrdinal = EnumC9954.m25788(attributes.getLocalName(i)).ordinal();
                if (iOrdinal == 0) {
                    C6292 c6292 = new C6292(strTrim);
                    ArrayList arrayList = null;
                    while (!c6292.m24378()) {
                        String strM24375 = c6292.m24375();
                        if (strM24375 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strM24375);
                            c6292.m24374();
                        }
                    }
                    abstractC14472.f45546 = arrayList;
                } else if (iOrdinal != 72) {
                    if (abstractC14472.f45542 == null) {
                        abstractC14472.f45542 = new C23424();
                    }
                    m22757(abstractC14472.f45542, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    m22753(abstractC14472, strTrim, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22753(AbstractC14472 abstractC14472, String str, boolean z) {
        C9208 c9208 = new C9208(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strM24369 = c9208.m24369(false, ':');
            c9208.m24374();
            if (!c9208.m24370(':')) {
                return;
            }
            c9208.m24374();
            String strM243610 = c9208.m24369(true, ';');
            if (strM243610 == null) {
                return;
            }
            c9208.m24374();
            if (c9208.m24378() || c9208.m24370(';')) {
                if (!z || m22774(strM24369)) {
                    if (abstractC14472.f45543 == null) {
                        abstractC14472.f45543 = new C23424();
                    }
                    m22757(abstractC14472.f45543, strM24369, strM243610);
                }
                c9208.m24374();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m22774(String str) {
        int iOrdinal = EnumC9954.m25788(str).ordinal();
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
    public static void m22757(C23424 c23424, String str, String str2) {
        String strM24369;
        C18028 c18028M1757;
        C18028 c18028M24377;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = EnumC9954.m25788(str).ordinal();
        C11315 c11315 = null;
        C18028 c18028M22765 = null;
        EnumC15218 enumC15218 = null;
        EnumC1795 enumC1795 = null;
        EnumC5524 enumC5524 = null;
        c18028Arr = null;
        c18028Arr = null;
        c18028Arr = null;
        c18028Arr = null;
        c18028Arr = null;
        C18028[] c18028Arr = null;
        EnumC11489 enumC11489 = null;
        EnumC12981 enumC12981 = null;
        String strSubstring = null;
        EnumC15218 enumC15219 = null;
        EnumC16710 enumC16710 = null;
        EnumC24916 enumC24916 = null;
        EnumC15964 enumC15964 = null;
        Boolean bool = null;
        EnumC17456 enumC17456 = null;
        c11315 = null;
        c11315 = null;
        if (iOrdinal == 1) {
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                C9208 c9208 = new C9208(str2.substring(5));
                c9208.m24374();
                C18028 c18028M22770 = m22770(c9208);
                c9208.m24365();
                C18028 c18028M22771 = m22770(c9208);
                c9208.m24365();
                C18028 c18028M22772 = m22770(c9208);
                c9208.m24365();
                C18028 c18028M22773 = m22770(c9208);
                c9208.m24374();
                if (c9208.m24370(')') || c9208.m24378()) {
                    c11315 = new C11315();
                    c11315.f35664 = c18028M22770;
                    c11315.f35662 = c18028M22771;
                    c11315.f35661 = c18028M22772;
                    c11315.f35663 = c18028M22773;
                }
            }
            c23424.f75830 = c11315;
            if (c11315 != null) {
                c23424.f75826 |= 1048576;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            c23424.f75841 = m22766(str2);
            c23424.f75826 |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            if ("nonzero".equals(str2)) {
                enumC15218 = EnumC15218.NonZero;
            } else if ("evenodd".equals(str2)) {
                enumC15218 = EnumC15218.EvenOdd;
            }
            c23424.f75836 = enumC15218;
            c23424.f75826 |= 536870912;
            return;
        }
        try {
            if (iOrdinal == 5) {
                c23424.f75809 = m22763(str2);
                c23424.f75826 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                return;
            }
            if (iOrdinal == 8) {
                if (str2.equals("ltr")) {
                    enumC17456 = EnumC17456.LTR;
                } else if (str2.equals("rtl")) {
                    enumC17456 = EnumC17456.RTL;
                }
                c23424.f75820 = enumC17456;
                if (enumC17456 != null) {
                    c23424.f75826 |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                c23424.f75839 = m22766(str2);
                c23424.f75826 |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                c23424.f75832 = m22735(str2);
                c23424.f75826 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
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
                c23424.f75828 = bool;
                if (bool != null) {
                    c23424.f75826 |= 524288;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                if (str2.equals("none")) {
                    enumC15964 = EnumC15964.None;
                } else if (str2.equals("non-scaling-stroke")) {
                    enumC15964 = EnumC15964.NonScalingStroke;
                }
                c23424.f75842 = enumC15964;
                if (enumC15964 != null) {
                    c23424.f75826 |= 34359738368L;
                    return;
                }
                return;
            }
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    c23424.f75817 = C15790.m37721();
                } else {
                    try {
                        c23424.f75817 = m22763(str2);
                    } catch (C14429 e) {
                        e.getMessage();
                        return;
                    }
                }
                c23424.f75826 |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                c23424.f75812 = m22735(str2);
                c23424.f75826 |= Blake2xsDigest.MAX_NUMBER_BLOCKS;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        enumC24916 = EnumC24916.Middle;
                        break;
                    case "end":
                        enumC24916 = EnumC24916.End;
                        break;
                    case "start":
                        enumC24916 = EnumC24916.Start;
                        break;
                }
                c23424.f75815 = enumC24916;
                if (enumC24916 != null) {
                    c23424.f75826 |= 262144;
                    return;
                }
                return;
            }
            if (iOrdinal != 75) {
                switch (iOrdinal) {
                    case 14:
                        if (str2.indexOf(124) < 0) {
                            if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                                c23424.f75838 = Boolean.valueOf(!str2.equals("none"));
                                c23424.f75826 |= 16777216;
                                break;
                            }
                        }
                        break;
                    case 15:
                        AbstractC0303 abstractC0303M22764 = m22764(str2);
                        c23424.f75824 = abstractC0303M22764;
                        if (abstractC0303M22764 != null) {
                            c23424.f75826 |= 1;
                        }
                        break;
                    case 16:
                        if ("nonzero".equals(str2)) {
                            enumC15219 = EnumC15218.NonZero;
                        } else if ("evenodd".equals(str2)) {
                            enumC15219 = EnumC15218.EvenOdd;
                        }
                        c23424.f75823 = enumC15219;
                        if (enumC15219 != null) {
                            c23424.f75826 |= 2;
                        }
                        break;
                    case 17:
                        Float fM22735 = m22735(str2);
                        c23424.f75811 = fM22735;
                        if (fM22735 != null) {
                            c23424.f75826 |= 4;
                        }
                        break;
                    case 18:
                        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                            C9208 c9209 = new C9208(str2);
                            Integer numM21001 = null;
                            EnumC12981 enumC12982 = null;
                            String str3 = null;
                            while (true) {
                                strM24369 = c9209.m24369(false, '/');
                                c9209.m24374();
                                if (strM24369 == null) {
                                    break;
                                } else if (numM21001 == null || enumC12982 == null) {
                                    if (!strM24369.equals("normal") && (numM21001 != null || (numM21001 = C7718.m21001(strM24369)) == null)) {
                                        if (enumC12982 == null) {
                                            switch (strM24369) {
                                                case "oblique":
                                                    enumC12982 = EnumC12981.Oblique;
                                                    break;
                                                case "italic":
                                                    enumC12982 = EnumC12981.Italic;
                                                    break;
                                                case "normal":
                                                    enumC12982 = EnumC12981.Normal;
                                                    break;
                                                default:
                                                    enumC12982 = null;
                                                    break;
                                            }
                                            if (enumC12982 != null) {
                                                continue;
                                            }
                                        }
                                        if (str3 == null && strM24369.equals("small-caps")) {
                                            str3 = strM24369;
                                        }
                                    }
                                }
                            }
                            try {
                                c18028M1757 = C0260.m1757(strM24369);
                                if (c18028M1757 == null) {
                                    c18028M1757 = m22765(strM24369);
                                }
                            } catch (C14429 unused) {
                                c18028M1757 = null;
                            }
                            if (c9209.m24370('/')) {
                                c9209.m24374();
                                String strM24375 = c9209.m24375();
                                if (strM24375 != null) {
                                    m22765(strM24375);
                                }
                                c9209.m24374();
                            }
                            if (!c9209.m24378()) {
                                int i = c9209.f30024;
                                c9209.f30024 = c9209.f30025;
                                strSubstring = c9209.f30022.substring(i);
                            }
                            c23424.f75813 = m22768(strSubstring);
                            c23424.f75822 = c18028M1757;
                            c23424.f75829 = Integer.valueOf(numM21001 == null ? 400 : numM21001.intValue());
                            if (enumC12982 == null) {
                                enumC12982 = EnumC12981.Normal;
                            }
                            c23424.f75819 = enumC12982;
                            c23424.f75826 |= 122880;
                            break;
                        }
                        break;
                    case 19:
                        ArrayList arrayListM22768 = m22768(str2);
                        c23424.f75813 = arrayListM22768;
                        if (arrayListM22768 != null) {
                            c23424.f75826 |= 8192;
                        }
                        break;
                    case 20:
                        try {
                            C18028 c18028M1758 = C0260.m1757(str2);
                            c18028M22765 = c18028M1758 == null ? m22765(str2) : c18028M1758;
                            break;
                        } catch (C14429 unused2) {
                        }
                        c23424.f75822 = c18028M22765;
                        if (c18028M22765 != null) {
                            c23424.f75826 |= 16384;
                        }
                        break;
                    case 21:
                        Integer numM21002 = C7718.m21001(str2);
                        c23424.f75829 = numM21002;
                        if (numM21002 != null) {
                            c23424.f75826 |= X931RNG.BLOCK64_RESEED_MAX;
                        }
                        break;
                    case 22:
                        switch (str2) {
                            case "oblique":
                                enumC12981 = EnumC12981.Oblique;
                                break;
                            case "italic":
                                enumC12981 = EnumC12981.Italic;
                                break;
                            case "normal":
                                enumC12981 = EnumC12981.Normal;
                                break;
                        }
                        c23424.f75819 = enumC12981;
                        if (enumC12981 != null) {
                            c23424.f75826 |= 65536;
                        }
                        break;
                    default:
                        switch (iOrdinal) {
                            case 27:
                                switch (str2) {
                                    case "optimizeQuality":
                                        enumC11489 = EnumC11489.optimizeQuality;
                                        break;
                                    case "auto":
                                        enumC11489 = EnumC11489.auto;
                                        break;
                                    case "optimizeSpeed":
                                        enumC11489 = EnumC11489.optimizeSpeed;
                                        break;
                                }
                                c23424.f75816 = enumC11489;
                                if (enumC11489 != null) {
                                    c23424.f75826 |= 137438953472L;
                                }
                                break;
                            case 28:
                                String strM22766 = m22766(str2);
                                c23424.f75844 = strM22766;
                                c23424.f75825 = strM22766;
                                c23424.f75843 = strM22766;
                                c23424.f75826 |= 14680064;
                                break;
                            case 29:
                                c23424.f75844 = m22766(str2);
                                c23424.f75826 |= 2097152;
                                break;
                            case 30:
                                c23424.f75825 = m22766(str2);
                                c23424.f75826 |= 4194304;
                                break;
                            case 31:
                                c23424.f75843 = m22766(str2);
                                c23424.f75826 |= X931RNG.BLOCK128_RESEED_MAX;
                                break;
                            default:
                                switch (iOrdinal) {
                                    case 62:
                                        if (str2.equals("currentColor")) {
                                            c23424.f75847 = C15790.m37721();
                                        } else {
                                            try {
                                                c23424.f75847 = m22763(str2);
                                            } catch (C14429 e2) {
                                                e2.getMessage();
                                                return;
                                            }
                                        }
                                        c23424.f75826 |= 67108864;
                                        break;
                                    case 63:
                                        c23424.f75834 = m22735(str2);
                                        c23424.f75826 |= 134217728;
                                        break;
                                    case 64:
                                        AbstractC0303 abstractC0303M22765 = m22764(str2);
                                        c23424.f75835 = abstractC0303M22765;
                                        if (abstractC0303M22765 != null) {
                                            c23424.f75826 |= 8;
                                        }
                                        break;
                                    case 65:
                                        if ("none".equals(str2)) {
                                            c23424.f75833 = null;
                                            c23424.f75826 |= 512;
                                        } else {
                                            C9208 c92010 = new C9208(str2);
                                            c92010.m24374();
                                            if (!c92010.m24378() && (c18028M24377 = c92010.m24377()) != null && !c18028M24377.m42031()) {
                                                float f = c18028M24377.f59027;
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(c18028M24377);
                                                while (true) {
                                                    if (!c92010.m24378()) {
                                                        c92010.m24365();
                                                        C18028 c18028M24378 = c92010.m24377();
                                                        if (c18028M24378 != null && !c18028M24378.m42031()) {
                                                            arrayList.add(c18028M24378);
                                                            f += c18028M24378.f59027;
                                                        }
                                                    } else if (f != 0.0f) {
                                                        c18028Arr = (C18028[]) arrayList.toArray(new C18028[arrayList.size()]);
                                                    }
                                                }
                                            }
                                            c23424.f75833 = c18028Arr;
                                            if (c18028Arr != null) {
                                                c23424.f75826 |= 512;
                                            }
                                        }
                                        break;
                                    case 66:
                                        c23424.f75845 = m22765(str2);
                                        c23424.f75826 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                                        break;
                                    case 67:
                                        if ("butt".equals(str2)) {
                                            enumC5524 = EnumC5524.Butt;
                                        } else if ("round".equals(str2)) {
                                            enumC5524 = EnumC5524.Round;
                                        } else if ("square".equals(str2)) {
                                            enumC5524 = EnumC5524.Square;
                                        }
                                        c23424.f75814 = enumC5524;
                                        if (enumC5524 != null) {
                                            c23424.f75826 |= 64;
                                        }
                                        break;
                                    case 68:
                                        if ("miter".equals(str2)) {
                                            enumC1795 = EnumC1795.Miter;
                                        } else if ("round".equals(str2)) {
                                            enumC1795 = EnumC1795.Round;
                                        } else if ("bevel".equals(str2)) {
                                            enumC1795 = EnumC1795.Bevel;
                                        }
                                        c23424.f75840 = enumC1795;
                                        if (enumC1795 != null) {
                                            c23424.f75826 |= 128;
                                        }
                                        break;
                                    case 69:
                                        c23424.f75827 = Float.valueOf(m22775(str2));
                                        c23424.f75826 |= 256;
                                        break;
                                    case 70:
                                        Float fM22736 = m22735(str2);
                                        c23424.f75818 = fM22736;
                                        if (fM22736 != null) {
                                            c23424.f75826 |= 16;
                                        }
                                        break;
                                    case 71:
                                        c23424.f75846 = m22765(str2);
                                        c23424.f75826 |= 32;
                                        break;
                                    default:
                                        switch (iOrdinal) {
                                            case 88:
                                                if (str2.equals("currentColor")) {
                                                    c23424.f75837 = C15790.m37721();
                                                } else {
                                                    try {
                                                        c23424.f75837 = m22763(str2);
                                                    } catch (C14429 e3) {
                                                        e3.getMessage();
                                                        return;
                                                    }
                                                }
                                                c23424.f75826 |= 8589934592L;
                                                break;
                                            case 89:
                                                c23424.f75810 = m22735(str2);
                                                c23424.f75826 |= 17179869184L;
                                                break;
                                            case 90:
                                                if (str2.indexOf(124) < 0) {
                                                    if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                        c23424.f75821 = Boolean.valueOf(str2.equals("visible"));
                                                        c23424.f75826 |= 33554432;
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
                    enumC16710 = EnumC16710.LineThrough;
                    break;
                case "underline":
                    enumC16710 = EnumC16710.Underline;
                    break;
                case "none":
                    enumC16710 = EnumC16710.None;
                    break;
                case "blink":
                    enumC16710 = EnumC16710.Blink;
                    break;
                case "overline":
                    enumC16710 = EnumC16710.Overline;
                    break;
            }
            c23424.f75831 = enumC16710;
            if (enumC16710 != null) {
                c23424.f75826 |= 131072;
            }
        } catch (C14429 unused3) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22750(AbstractC9997 abstractC9997, Attributes attributes) throws C14429 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = EnumC9954.m25788(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 48) {
                m22745(abstractC9997, strTrim);
            } else if (iOrdinal != 80) {
                continue;
            } else {
                C9208 c9208 = new C9208(strTrim);
                c9208.m24374();
                float fM24379 = c9208.m24379();
                c9208.m24365();
                float fM243710 = c9208.m24379();
                c9208.m24365();
                float fM243711 = c9208.m24379();
                c9208.m24365();
                float fM243712 = c9208.m24379();
                if (Float.isNaN(fM24379) || Float.isNaN(fM243710) || Float.isNaN(fM243711) || Float.isNaN(fM243712)) {
                    throw new C14429("Invalid viewBox definition - should have four numbers");
                }
                if (fM243711 < 0.0f) {
                    throw new C14429("Invalid viewBox. width cannot be negative");
                }
                if (fM243712 >= 0.0f) {
                    abstractC9997.f32108 = new C1621(fM24379, fM243710, fM243711, fM243712);
                } else {
                    throw new C14429("Invalid viewBox. height cannot be negative");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22744(InterfaceC3858 interfaceC3858, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC9954.m25788(attributes.getLocalName(i)) == EnumC9954.transform) {
                interfaceC3858.mo12489(m22776(attributes.getValue(i)));
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Matrix m22776(String str) throws C14429 {
        Matrix matrix = new Matrix();
        C9208 c9208 = new C9208(str);
        c9208.m24374();
        while (!c9208.m24378()) {
            String str2 = c9208.f30022;
            String strSubstring = null;
            if (!c9208.m24378()) {
                int i = c9208.f30024;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = c9208.m24367();
                    }
                }
                int i2 = c9208.f30024;
                while (C9208.m24364(iCharAt)) {
                    iCharAt = c9208.m24367();
                }
                if (iCharAt == 40) {
                    c9208.f30024++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    c9208.f30024 = i;
                }
            }
            if (strSubstring == null) {
                throw new C14429("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    c9208.m24374();
                    float fM24379 = c9208.m24379();
                    c9208.m24365();
                    float fM243710 = c9208.m24379();
                    c9208.m24365();
                    float fM243711 = c9208.m24379();
                    c9208.m24365();
                    float fM243712 = c9208.m24379();
                    c9208.m24365();
                    float fM243713 = c9208.m24379();
                    c9208.m24365();
                    float fM243714 = c9208.m24379();
                    c9208.m24374();
                    if (Float.isNaN(fM243714) || !c9208.m24370(')')) {
                        throw new C14429("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fM24379, fM243711, fM243713, fM243710, fM243712, fM243714, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    c9208.m24374();
                    float fM243715 = c9208.m24379();
                    c9208.m24365();
                    float fM243716 = c9208.m24379();
                    c9208.m24365();
                    float fM243717 = c9208.m24379();
                    c9208.m24374();
                    if (Float.isNaN(fM243715) || !c9208.m24370(')')) {
                        throw new C14429("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fM243716)) {
                        matrix.preRotate(fM243715);
                    } else {
                        if (Float.isNaN(fM243717)) {
                            throw new C14429("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fM243715, fM243716, fM243717);
                    }
                    break;
                    break;
                case "scale":
                    c9208.m24374();
                    float fM243718 = c9208.m24379();
                    c9208.m24365();
                    float fM243719 = c9208.m24379();
                    c9208.m24374();
                    if (Float.isNaN(fM243718) || !c9208.m24370(')')) {
                        throw new C14429("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM243719)) {
                        matrix.preScale(fM243718, fM243719);
                    } else {
                        matrix.preScale(fM243718, fM243718);
                    }
                    break;
                    break;
                case "skewX":
                    c9208.m24374();
                    float fM243720 = c9208.m24379();
                    c9208.m24374();
                    if (Float.isNaN(fM243720) || !c9208.m24370(')')) {
                        throw new C14429("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fM243720)), 0.0f);
                    break;
                    break;
                case "skewY":
                    c9208.m24374();
                    float fM243721 = c9208.m24379();
                    c9208.m24374();
                    if (Float.isNaN(fM243721) || !c9208.m24370(')')) {
                        throw new C14429("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fM243721)));
                    break;
                    break;
                case "translate":
                    c9208.m24374();
                    float fM243722 = c9208.m24379();
                    c9208.m24365();
                    float fM243723 = c9208.m24379();
                    c9208.m24374();
                    if (Float.isNaN(fM243722) || !c9208.m24370(')')) {
                        throw new C14429("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM243723)) {
                        matrix.preTranslate(fM243722, fM243723);
                    } else {
                        matrix.preTranslate(fM243722, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new C14429(C14442.m34865("Invalid transform list fn: ", strSubstring, MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (c9208.m24378()) {
                return matrix;
            }
            c9208.m24365();
        }
        return matrix;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C18028 m22765(String str) throws C14429 {
        if (str.length() == 0) {
            throw new C14429("Invalid length value (empty string)");
        }
        int length = str.length();
        EnumC15175 enumC15175ValueOf = EnumC15175.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            enumC15175ValueOf = EnumC15175.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                enumC15175ValueOf = EnumC15175.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new C14429("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new C18028(m22736(length, str), enumC15175ValueOf);
        } catch (NumberFormatException e) {
            throw new C14429("Invalid length value: ".concat(str), e);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22761(String str) throws C14429 {
        if (str.length() == 0) {
            throw new C14429("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C9208 c9208 = new C9208(str);
        c9208.m24374();
        while (!c9208.m24378()) {
            float fM24379 = c9208.m24379();
            if (Float.isNaN(fM24379)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = c9208.f30022;
                int i = c9208.f30024;
                while (!c9208.m24378() && !C9208.m24364((int) str2.charAt(c9208.f30024))) {
                    c9208.f30024++;
                }
                String strSubstring = str2.substring(i, c9208.f30024);
                c9208.f30024 = i;
                sb.append(strSubstring);
                throw new C14429(sb.toString());
            }
            EnumC15175 enumC15175M24372 = c9208.m24372();
            if (enumC15175M24372 == null) {
                enumC15175M24372 = EnumC15175.px;
            }
            arrayList.add(new C18028(fM24379, enumC15175M24372));
            c9208.m24365();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static float m22775(String str) throws C14429 {
        int length = str.length();
        if (length == 0) {
            throw new C14429("Invalid float value (empty string)");
        }
        return m22736(length, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m22736(int i, String str) throws C14429 {
        float fM50743 = new C22504().m50743(0, i, 0, str);
        if (Float.isNaN(fM50743)) {
            throw new C14429(C25272.m56409("Invalid float value: ", str));
        }
        return fM50743;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Float m22735(String str) {
        try {
            float fM22775 = m22775(str);
            if (fM22775 < 0.0f) {
                fM22775 = 0.0f;
            } else if (fM22775 > 1.0f) {
                fM22775 = 1.0f;
            }
            return Float.valueOf(fM22775);
        } catch (C14429 unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22745(AbstractC7761 abstractC7761, String str) throws C14429 {
        EnumC15044 enumC15044;
        C9208 c9208 = new C9208(str);
        c9208.m24374();
        String strM24375 = c9208.m24375();
        if ("defer".equals(strM24375)) {
            c9208.m24374();
            strM24375 = c9208.m24375();
        }
        EnumC19520 enumC19520M48246 = C21143.m48246(strM24375);
        c9208.m24374();
        if (c9208.m24378()) {
            enumC15044 = null;
        } else {
            String strM24376 = c9208.m24375();
            strM24376.getClass();
            if (strM24376.equals("meet")) {
                enumC15044 = EnumC15044.meet;
            } else if (strM24376.equals("slice")) {
                enumC15044 = EnumC15044.slice;
            } else {
                throw new C14429("Invalid preserveAspectRatio definition: ".concat(str));
            }
        }
        abstractC7761.f25547 = new C12807(enumC19520M48246, enumC15044);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC0303 m22764(String str) {
        boolean zStartsWith = str.startsWith("url(");
        AbstractC0303 abstractC0303M22763 = C17282.f56306;
        AbstractC0303 abstractC0303 = null;
        if (zStartsWith) {
            int iIndexOf = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_END);
            if (iIndexOf != -1) {
                String strTrim = str.substring(4, iIndexOf).trim();
                String strTrim2 = str.substring(iIndexOf + 1).trim();
                if (strTrim2.length() > 0) {
                    if (!strTrim2.equals("none")) {
                        if (strTrim2.equals("currentColor")) {
                            abstractC0303M22763 = C15790.m37721();
                        } else {
                            try {
                                abstractC0303M22763 = m22763(strTrim2);
                            } catch (C14429 unused) {
                                abstractC0303M22763 = null;
                            }
                        }
                    }
                    abstractC0303 = abstractC0303M22763;
                }
                return new C0875(strTrim, abstractC0303);
            }
            return new C0875(str.substring(4).trim(), null);
        }
        if (str.equals("none")) {
            return abstractC0303M22763;
        }
        if (str.equals("currentColor")) {
            return C15790.m37721();
        }
        try {
            return m22763(str);
        } catch (C14429 unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C17282 m22763(String str) throws C14429 {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C10569 c10569 = null;
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
                        c10569 = new C10569(i2, j2);
                    }
                }
            }
            if (c10569 == null) {
                throw new C14429("Bad hex colour value: ".concat(str));
            }
            int iM27031 = c10569.m27031();
            if (iM27031 == 4) {
                int iM27032 = c10569.m27032();
                int i3 = iM27032 & 3840;
                int i4 = iM27032 & 240;
                int i5 = iM27032 & 15;
                return new C17282(i5 | (i3 << 8) | (-16777216) | (i3 << 12) | (i4 << 8) | (i4 << 4) | (i5 << 4));
            }
            if (iM27031 != 5) {
                if (iM27031 == 7) {
                    return new C17282(c10569.m27032() | (-16777216));
                }
                if (iM27031 == 9) {
                    return new C17282((c10569.m27032() << 24) | (c10569.m27032() >>> 8));
                }
                throw new C14429("Bad hex colour value: ".concat(str));
            }
            int iM27033 = c10569.m27032();
            int i6 = 61440 & iM27033;
            int i7 = iM27033 & 3840;
            int i8 = iM27033 & 240;
            int i9 = iM27033 & 15;
            return new C17282((i9 << 24) | (i9 << 28) | (i6 << 8) | (i6 << 4) | (i7 << 4) | i7 | i8 | (i8 >> 4));
        }
        boolean zM22760 = m22760(str, "rgba(");
        if (zM22760 || m22760(str, "rgb(")) {
            C9208 c9208 = new C9208(str, zM22760 ? 5 : 4);
            c9208.m24374();
            float fM24379 = c9208.m24379();
            if (!Float.isNaN(fM24379) && c9208.m24370('%')) {
                fM24379 = (fM24379 * 256.0f) / 100.0f;
            }
            float fM24366 = c9208.m24366(fM24379);
            if (!Float.isNaN(fM24366) && c9208.m24370('%')) {
                fM24366 = (fM24366 * 256.0f) / 100.0f;
            }
            float fM24367 = c9208.m24366(fM24366);
            if (!Float.isNaN(fM24367) && c9208.m24370('%')) {
                fM24367 = (fM24367 * 256.0f) / 100.0f;
            }
            if (!zM22760) {
                c9208.m24374();
                if (Float.isNaN(fM24367) || !c9208.m24370(')')) {
                    throw new C14429("Bad rgb() colour value: ".concat(str));
                }
                return new C17282((m22737(fM24379) << 16) | (-16777216) | (m22737(fM24366) << 8) | m22737(fM24367));
            }
            float fM24368 = c9208.m24366(fM24367);
            c9208.m24374();
            if (Float.isNaN(fM24368) || !c9208.m24370(')')) {
                throw new C14429("Bad rgba() colour value: ".concat(str));
            }
            return new C17282((m22737(fM24368 * 256.0f) << 24) | (m22737(fM24379) << 16) | (m22737(fM24366) << 8) | m22737(fM24367));
        }
        boolean zM22761 = m22760(str, "hsla(");
        if (!zM22761 && !m22760(str, "hsl(")) {
            String lowerCase = str.toLowerCase(Locale.US);
            Integer numM42314 = C18159.m42314(lowerCase);
            if (numM42314 != null) {
                return new C17282(numM42314.intValue());
            }
            throw new C14429(C25272.m56409("Invalid colour keyword: ", lowerCase));
        }
        C9208 c9209 = new C9208(str, zM22761 ? 5 : 4);
        c9209.m24374();
        float fM243710 = c9209.m24379();
        float fM24369 = c9209.m24366(fM243710);
        if (!Float.isNaN(fM24369)) {
            c9209.m24370('%');
        }
        float fM243610 = c9209.m24366(fM24369);
        if (!Float.isNaN(fM243610)) {
            c9209.m24370('%');
        }
        if (!zM22761) {
            c9209.m24374();
            if (Float.isNaN(fM243610) || !c9209.m24370(')')) {
                throw new C14429("Bad hsl() colour value: ".concat(str));
            }
            return new C17282(m22738(fM243710, fM24369, fM243610) | (-16777216));
        }
        float fM243611 = c9209.m24366(fM243610);
        c9209.m24374();
        if (Float.isNaN(fM243611) || !c9209.m24370(')')) {
            throw new C14429("Bad hsla() colour value: ".concat(str));
        }
        return new C17282((m22737(fM243611 * 256.0f) << 24) | m22738(fM243710, fM24369, fM243610));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22760(String str, String str2) {
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
    public static int m22737(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m22738(float f, float f2, float f3) {
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
        float fM22769 = m22769(f10, f9, f6 + 2.0f);
        float fM227610 = m22769(f10, f9, f6);
        return m22737(m22769(f10, f9, f6 - 2.0f) * 256.0f) | (m22737(fM22769 * 256.0f) << 16) | (m22737(fM227610 * 256.0f) << 8);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static float m22769(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            return C19967.m45884(f2, f, f3, f);
        }
        if (f3 < 3.0f) {
            return f2;
        }
        return f3 < 4.0f ? C19967.m45884(4.0f, f3, f2 - f, f) : f;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22768(String str) {
        C9208 c9208 = new C9208(str);
        ArrayList arrayList = null;
        do {
            String strM24376 = c9208.m24376();
            if (strM24376 == null) {
                strM24376 = c9208.m24369(true, ',');
            }
            if (strM24376 == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strM24376);
            c9208.m24365();
        } while (!c9208.m24378());
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C18028 m22770(C9208 c9208) {
        if (c9208.m24371("auto")) {
            return new C18028(0.0f);
        }
        return c9208.m24377();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m22766(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }
}
