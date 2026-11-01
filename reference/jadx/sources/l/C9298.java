package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.alipay.sdk.m.u0.b;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۢۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9298 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashSet f31573 = new HashSet(Arrays.asList("string", MotionUtils.EASING_TYPE_PATH, "bool", ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimen", ClassTransform.FLOAT, "fraction", "id", "integer", Name.REFER, "dynamic-reference", AnnotationHandler.ATTRIBUTE, "dynamic-attribute", "string-array", "integer-array", "array", "plurals", "style", "complex"));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14942 m23850(C22577 c22577) {
        return new C14942(new C6037(c22577.m50079(), c22577.m50082()).m16373());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0124 m23848(C22577 c22577, InterfaceC3609 interfaceC3609, int i) {
        String strM4099 = C1098.m4099(C1098.m4102(interfaceC3609));
        try {
            if (m23869(interfaceC3609)) {
                return C0124.m1187(strM4099, "UNSUPPORTED_VALUE_XML");
            }
            m23842(interfaceC3609);
            m23863(interfaceC3609);
            String strM23847 = m23847(c22577, interfaceC3609, m23850(c22577));
            int iCodePointCount = strM23847.codePointCount(0, strM23847.length());
            if (iCodePointCount > i) {
                return C0124.m1184(iCodePointCount, strM4099);
            }
            return C0124.m1185(iCodePointCount, strM4099, strM23847);
        } catch (C1535 unused) {
            return C0124.m1186(strM4099);
        } catch (C14237 unused2) {
            return C0124.m1187(strM4099, "UNSUPPORTED_VALUE_XML");
        } catch (C23409 unused3) {
            return C0124.m1187(strM4099, "UNSUPPORTED_STYLED_TEXT_XML");
        } catch (Exception unused4) {
            return C0124.m1187(strM4099, "VALUE_XML_UNAVAILABLE");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20586 m23852(C22703 c22703, ArrayList arrayList) throws C12731 {
        C20150 c20150M50318 = c22703.m50318();
        C14942 c14942M45572 = c20150M50318.m45572();
        C0393[] c0393Arr = new C0393[arrayList.size()];
        String[] strArr = new String[arrayList.size()];
        String[] strArr2 = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            C16353 c16353 = (C16353) arrayList.get(i);
            C0393 c0393M45573 = c20150M50318.m45573((int) Long.parseLong(c16353.f52650.substring(2), 16), c16353.f52649);
            if (c0393M45573 == null) {
                C12731 c12731M31625 = C12731.m31625("RESOURCE_VARIANT_NOT_FOUND", "Resource variant not found.");
                m23856(c12731M31625, c16353, (String) null, c14942M45572);
                throw c12731M31625;
            }
            c0393Arr[i] = c0393M45573;
            InterfaceC3609 interfaceC3609 = c0393M45573.f1873;
            strArr[i] = interfaceC3609 == null ? "missing" : C1098.m4099(C1098.m4102(interfaceC3609));
            String strM4099 = C1098.m4099(C1098.m4102(c0393M45573.f1875));
            strArr2[i] = strM4099;
            if (!strM4099.equals(c16353.f52648)) {
                C12731 c12731M31627 = C12731.m31627("STALE_TARGET_VERSION", "targetVersion does not match current resource value. Re-read the resource and retry.", "warning", (JSONArray) null, JSON.object().add("currentTargetVersion", strM4099));
                m23856(c12731M31627, c16353, strM4099, c14942M45572);
                throw c12731M31627;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            C16353 c16354 = (C16353) arrayList.get(i2);
            try {
                C20150 c20150 = c20150M50318;
                try {
                    C12120 c12120M23849 = m23849(c20150M50318, c0393Arr[i2], c16354, strArr[i2], strArr2[i2], c14942M45572, map);
                    arrayList2.add(c12120M23849);
                    C0393 c0393 = c0393Arr[i2];
                    map.put(C22703.m50301(c0393.f1872, c0393.f1874), c12120M23849.f40587);
                    i2++;
                    c20150M50318 = c20150;
                } catch (C12731 e) {
                    e = e;
                    m23856(e, c16354, strArr2[i2], c14942M45572);
                    throw e;
                }
            } catch (C12731 e2) {
                e = e2;
            }
        }
        return new C20586(c14942M45572, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m23860(C20150 c20150, int i, String str, String str2) {
        C0393 c0393M45573 = c20150.m45573(i, str);
        if (c0393M45573 == null) {
            throw new IllegalStateException("Missing planned resource target");
        }
        return m23849(c20150, c0393M45573, new C16353(0, C22703.m50274(i), str, "missing", str2), "missing", "missing", c20150.m45572(), new HashMap()).f40587;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15648 m23851(InterfaceC3609 interfaceC3609) {
        C0206 c0206M19392 = C22785.m50438().m50439(interfaceC3609.mo10692().mo19106(), interfaceC3609.mo10692().getPackageName()).m19392(interfaceC3609.getType().mo26942(), interfaceC3609.getType().getTypeName());
        c0206M19392.m1526(interfaceC3609.mo10691(), interfaceC3609.mo7645(), false);
        C21373 c21373M1523 = c0206M19392.m1523(interfaceC3609.mo10690().mo31747());
        c21373M1523.m47906(interfaceC3609.mo10690().mo31750());
        c21373M1523.m47905(interfaceC3609.mo10690().mo31748());
        c21373M1523.m47902(interfaceC3609.mo10691());
        return new C15648(c21373M1523);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23856(C12731 c12731, C16353 c16353, String str, C14942 c14942) {
        c12731.f42468.put("failedEditIndex", c16353.f52651).put("resourceId", c16353.f52650).put("variant", c16353.f52649).put("currentTargetVersion", str == null ? JSON.NULL : JSON.value(str)).put("resourceNamePolicy", c14942 == null ? JSON.NULL : c14942.m35686());
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0272  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dc  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m23847(C22577 c22577, InterfaceC3609 interfaceC3609, C14942 c14942) {
        String str;
        int i;
        String strM23865;
        InterfaceC3609 interfaceC3609Mo31753;
        String string;
        String strM28518;
        boolean z = c14942.f48724;
        C10709 c10709 = new C10709();
        if (interfaceC3609.mo7644() && "style".equals(C21291.m47740(interfaceC3609.getType().getTypeName()))) {
            c10709.mo24062("style");
            c10709.mo24061("name", interfaceC3609.mo7645());
            if (interfaceC3609.getParent() != 0) {
                c10709.mo24061("parent", "@".concat(m23845(interfaceC3609.mo10692().mo19106(), interfaceC3609.getParent(), c22577, c14942)));
            }
            C5062 c5062M50082 = c22577.m50082();
            for (InterfaceC9961 interfaceC9961 : interfaceC3609.values()) {
                C11413 c11413M14108 = c5062M50082.m14108(interfaceC9961.mo25193());
                if (c11413M14108 != null) {
                    if (((C18597) c11413M14108.m28516()).contains(interfaceC9961.mo25192())) {
                        c10709.mo24062("item");
                        int iMo19106 = interfaceC3609.mo10692().mo19106();
                        int i2 = c11413M14108.f38428;
                        int i3 = (i2 >>> 24) & 255;
                        if (!z || i3 == 1) {
                            StringBuilder sbM23356 = C9023.m23356(c22577.m50078(iMo19106, i3));
                            sbM23356.append(c11413M14108.f38431);
                            string = sbM23356.toString();
                        } else {
                            string = m23865(i2);
                        }
                        c10709.mo24061("name", string);
                        if (interfaceC9961.mo25189()) {
                            int i4 = c11413M14108.f38427;
                            if ((65536 & i4) != 0) {
                                strM28518 = c11413M14108.m28515(interfaceC9961.getValue());
                            } else if ((i4 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                                strM28518 = c11413M14108.m28518(interfaceC9961.getValue());
                            } else {
                                strM28518 = null;
                            }
                        } else {
                            strM28518 = null;
                        }
                        if (strM28518 == null) {
                            m23868(c10709, interfaceC9961, c22577, c14942);
                        } else {
                            c10709.text(strM28518.toString());
                        }
                        c10709.mo24060("item");
                    }
                }
                m23855(c10709, interfaceC9961, c22577, c14942);
            }
            c10709.mo24060("style");
        } else if (interfaceC3609.mo7644() && m23869(interfaceC3609) && interfaceC3609.mo7647() != 0 && interfaceC3609.getValue().mo25193() == 16777216 && interfaceC3609.getValue().mo25189()) {
            c10709.mo24062("attr");
            c10709.mo24061("name", interfaceC3609.mo7645());
            int value = interfaceC3609.getValue().getValue();
            if (value != 65535) {
                ArrayList arrayList = new ArrayList();
                if ((value & 1) != 0) {
                    arrayList.add(Name.REFER);
                }
                if ((value & 2) != 0) {
                    arrayList.add("string");
                }
                if ((value & 4) != 0) {
                    arrayList.add("integer");
                }
                if ((value & 8) != 0) {
                    arrayList.add(ClassTransform.BOOLEAN);
                }
                if ((value & 16) != 0) {
                    arrayList.add(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR);
                }
                if ((value & 32) != 0) {
                    arrayList.add(ClassTransform.FLOAT);
                }
                if ((value & 64) != 0) {
                    arrayList.add("dimension");
                }
                if ((value & 128) != 0) {
                    arrayList.add("fraction");
                }
                if ((65536 & value) != 0) {
                    str = "enum";
                    arrayList.add("enum");
                } else {
                    str = null;
                }
                if ((131072 & value) != 0) {
                    arrayList.add("flags");
                    str = "flag";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) "|");
                    }
                }
                c10709.mo24061("format", sb.toString());
            } else {
                str = null;
            }
            InterfaceC19133 type = interfaceC3609.mo10692().getType("id");
            InterfaceC12783 interfaceC12783Mo1530 = (type == null || type.mo1536() == 0) ? null : type.mo1530(0);
            int iMo19107 = interfaceC3609.mo10692().mo19106() << 24;
            int i5 = 16;
            if (type != null) {
                iMo19107 |= type.mo26942() << 16;
            }
            int i6 = 1;
            while (i6 < interfaceC3609.mo7647()) {
                InterfaceC9961 value2 = interfaceC3609.getValue(i6);
                if (str == null) {
                    m23855(c10709, value2, c22577, c14942);
                } else {
                    if (value2.mo25192() != i5) {
                        i = 65535;
                        if (value2.mo25192() != 17) {
                            m23855(c10709, value2, c22577, c14942);
                        }
                    } else {
                        i = 65535;
                    }
                    c10709.mo24062(str);
                    int iMo25193 = value2.mo25193();
                    int i7 = (iMo25193 >>> 24) & 255;
                    if ((!z || i7 == 1) && interfaceC12783Mo1530 != null && ((-65536) & iMo25193) == iMo19107 && (interfaceC3609Mo31753 = interfaceC12783Mo1530.mo31753(iMo25193 & i)) != null) {
                        String strMo7645 = interfaceC3609Mo31753.mo7645();
                        strM23865 = m23843(strMo7645) ? m23865(iMo25193) : strMo7645;
                    } else {
                        strM23865 = m23865(iMo25193);
                    }
                    c10709.mo24061("name", strM23865);
                    c10709.mo24061(b.d, C7054.m18900(c22577, value2).toString());
                    c10709.mo24060(str);
                }
                i6++;
                i5 = 16;
            }
            c10709.mo24060("attr");
        } else {
            C7054.m18907(c10709, interfaceC3609, new C17058(c22577.m50079(), c14942), new C2820());
        }
        return c10709.f36525.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m23869(InterfaceC3609 interfaceC3609) {
        String strM47740 = C21291.m47740(interfaceC3609.getType().getTypeName());
        return "attr".equals(strM47740) || "^attr-private".equals(strM47740);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23855(InterfaceC9380 interfaceC9380, InterfaceC9961 interfaceC9961, C22577 c22577, C14942 c14942) {
        C10709 c10709 = (C10709) interfaceC9380;
        c10709.mo24062(m23846(interfaceC9961));
        if (interfaceC9961.mo25193() != -1) {
            c10709.mo24061("id", m23865(interfaceC9961.mo25193()));
        }
        m23868(interfaceC9380, interfaceC9961, c22577, c14942);
        c10709.mo24060(m23846(interfaceC9961));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m23868(InterfaceC9380 interfaceC9380, InterfaceC9961 interfaceC9961, C22577 c22577, C14942 c14942) {
        int iMo25192 = interfaceC9961.mo25192();
        if (iMo25192 == 0) {
            ((C10709) interfaceC9380).text(interfaceC9961.getValue() == 1 ? "@empty" : "@null");
            return;
        }
        if (iMo25192 != 1) {
            if (iMo25192 != 2) {
                if (iMo25192 == 3) {
                    InterfaceC12078 interfaceC12078Mo25187 = interfaceC9961.mo25187();
                    if (interfaceC12078Mo25187 == null) {
                        ((C10709) interfaceC9380).text("");
                        return;
                    } else {
                        C7054.m18905(interfaceC9380, interfaceC12078Mo25187.getValue(), interfaceC12078Mo25187.mo30052());
                        return;
                    }
                }
                if (iMo25192 != 7) {
                    if (iMo25192 != 8) {
                        ((C10709) interfaceC9380).text(C7054.m18900(c22577, interfaceC9961).toString());
                        return;
                    }
                }
            }
            ((C10709) interfaceC9380).text(interfaceC9961.getValue() == 0 ? "?null" : "?".concat(m23845(interfaceC9961.mo25190().mo19106(), interfaceC9961.getValue(), c22577, c14942)));
            return;
        }
        ((C10709) interfaceC9380).text(interfaceC9961.getValue() != 0 ? "@".concat(m23845(interfaceC9961.mo25190().mo19106(), interfaceC9961.getValue(), c22577, c14942)) : "@null");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m23846(InterfaceC9961 interfaceC9961) throws IOException {
        int iMo25192 = interfaceC9961.mo25192();
        switch (iMo25192) {
            case 0:
            case 1:
                return Name.REFER;
            case 2:
                return AnnotationHandler.ATTRIBUTE;
            case 3:
                return "string";
            case 4:
                return ClassTransform.FLOAT;
            case 5:
                return "dimen";
            case 6:
                return "fraction";
            case 7:
                return "dynamic-reference";
            case 8:
                return "dynamic-attribute";
            default:
                switch (iMo25192) {
                    case 16:
                    case 17:
                        return "integer";
                    case 18:
                        return "bool";
                    default:
                        switch (iMo25192) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
                            default:
                                throw new IOException("Unsupported value type: ".concat(C6037.m16364(interfaceC9961.mo25192())));
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m23845(int i, int i2, C22577 c22577, C14942 c14942) {
        int i3 = (i2 >>> 24) & 255;
        if (c14942.f48724 && i3 != 1) {
            return m23865(i2);
        }
        String strMo39837 = c22577.mo39837(i, i2);
        return m23843(strMo39837) ? m23865(i2) : strMo39837;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m23843(String str) {
        return str != null && str.length() == 8 && C6461.m17648(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m23865(int i) {
        return String.format(Locale.ROOT, "%08X", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m23863(InterfaceC3609 interfaceC3609) throws C23409 {
        C15606[] c15606ArrMo11444;
        boolean zM10306;
        for (InterfaceC9961 interfaceC9961 : interfaceC3609.values()) {
            if (interfaceC9961.mo25192() == 3 && interfaceC9961.mo25187() != null) {
                InterfaceC12078 interfaceC12078Mo25187 = interfaceC9961.mo25187();
                if (interfaceC12078Mo25187.mo11445() && (c15606ArrMo11444 = interfaceC12078Mo25187.mo11444()) != null) {
                    int length = interfaceC12078Mo25187.getValue().length();
                    for (C15606 c15606 : c15606ArrMo11444) {
                        if (c15606.m37273(length)) {
                            String str = c15606.f50740;
                            int iIndexOf = str.indexOf(59);
                            if (iIndexOf < 0) {
                                zM10306 = C3504.m10306(str);
                            } else if (C3504.m10306(str.substring(0, iIndexOf))) {
                                while (true) {
                                    if (iIndexOf >= 0) {
                                        int i = iIndexOf + 1;
                                        if (i < str.length()) {
                                            int iIndexOf2 = str.indexOf(61, i);
                                            if (iIndexOf2 >= 0) {
                                                String strSubstring = str.substring(i, iIndexOf2);
                                                if (strSubstring.indexOf(59) < 0 && strSubstring.indexOf(61) < 0 && C3504.m10306(strSubstring)) {
                                                    iIndexOf = str.indexOf(59, iIndexOf2 + 1);
                                                }
                                            }
                                            zM10306 = false;
                                        }
                                    }
                                    zM10306 = true;
                                }
                            } else {
                                zM10306 = false;
                            }
                            if (zM10306) {
                            }
                        }
                        throw new C23409();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m23842(InterfaceC3609 interfaceC3609) throws C14237 {
        if (interfaceC3609.mo7644()) {
            for (InterfaceC9961 interfaceC9961 : interfaceC3609.values()) {
                if (interfaceC9961.mo25192() == 0 && interfaceC9961.getValue() == 1) {
                    throw new C14237();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23853(C8340 c8340) throws C12731 {
        if (c8340.m21789()) {
            return;
        }
        Iterator itM21772 = C8340.m21772(c8340);
        while (itM21772.hasNext()) {
            m23866((C8340) itM21772.next());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m23866(C8340 c8340) throws C12731 {
        if (!C3504.m10306(c8340.m21779())) {
            throw C12731.m31623(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text tag name: " + c8340.m21779(), "warning");
        }
        for (C18923 c18923 : c8340.m21778()) {
            String strM43584 = c18923.m43584();
            String strM43586 = c18923.m43586();
            if (!C3504.m10306(strM43584) || strM43584.indexOf(61) >= 0 || strM43584.indexOf(59) >= 0) {
                throw C12731.m31623(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text attribute name: ".concat(strM43584), "warning");
            }
            if (strM43586.indexOf(59) >= 0) {
                throw C12731.m31623(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text attribute value.", "warning");
            }
        }
        Iterator itM21772 = C8340.m21772(c8340);
        while (itM21772.hasNext()) {
            m23866((C8340) itM21772.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23854(C8340 c8340, String str, boolean z, boolean z2) throws C12731 {
        if (z2) {
            return;
        }
        if (c8340.m21789()) {
            try {
                if ("@empty".equals(c8340.m21784().m26418()) && (!z || !Name.REFER.equals(c8340.m21779()))) {
                    throw m23862("@empty is supported only by root <reference>.");
                }
            } catch (C4811 e) {
                throw m23862(e.getMessage() == null ? "Invalid valueXml" : e.getMessage());
            }
        }
        boolean zM23859 = m23859(c8340, str, z);
        Iterator itM21772 = C8340.m21772(c8340);
        while (itM21772.hasNext()) {
            m23854((C8340) itM21772.next(), c8340.m21779(), false, zM23859);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C8340 m23870(String str) throws C12731 {
        if (str.trim().isEmpty()) {
            throw m23862("valueXml must contain one XML element.");
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (str.contains("<?") || upperCase.contains("<!DOCTYPE")) {
            throw m23862("valueXml must not contain processing instructions or DTD.");
        }
        try {
            int i = C9046.f30860;
            C3504 c3504 = new C3504();
            c3504.m10317(new StringReader(str));
            C9046 c9046M23372 = C9046.m23372(c3504, true);
            if (c9046M23372.size() != 1) {
                throw m23862("valueXml must contain exactly one root element.");
            }
            return (C8340) c9046M23372.get(0);
        } catch (C12731 e) {
            throw e;
        } catch (Exception e2) {
            throw m23862(e2.getMessage() == null ? "Invalid valueXml" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m23867(C8340 c8340, String str, boolean z, boolean z2) throws C12731 {
        if (z2) {
            return;
        }
        for (C18923 c18923 : c8340.m21778()) {
            if ("parent".equals(c18923.m43584()) && c18923.m43586().startsWith("@")) {
                m23841(c18923.m43586().substring(1));
            } else if ("item".equals(c8340.m21779()) && "name".equals(c18923.m43584())) {
                m23841(c18923.m43586());
            } else if ("enum".equals(c8340.m21779()) || "flag".equals(c8340.m21779())) {
                if ("name".equals(c18923.m43584())) {
                    m23841(c18923.m43586());
                }
            }
        }
        if (c8340.m21789()) {
            try {
                String strM26418 = c8340.m21784().m26418();
                if (strM26418.startsWith("@") || strM26418.startsWith("?")) {
                    m23841(strM26418.substring(1));
                }
            } catch (C4811 e) {
                throw m23862(e.getMessage() == null ? "Invalid valueXml" : e.getMessage());
            }
        }
        boolean zM23859 = m23859(c8340, str, z);
        Iterator itM21772 = C8340.m21772(c8340);
        while (itM21772.hasNext()) {
            m23867((C8340) itM21772.next(), c8340.m21779(), false, zM23859);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23859(C8340 c8340, String str, boolean z) {
        String strM21779 = c8340.m21779();
        if ("string".equals(strM21779) || MotionUtils.EASING_TYPE_PATH.equals(strM21779)) {
            return z || "array".equals(str) || "attr".equals(str) || "complex".equals(str) || "style".equals(str);
        }
        if ("item".equals(strM21779)) {
            return "string-array".equals(str) || "plurals".equals(str) || "style".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m23841(String str) throws C12731 {
        if (!str.equals("null") && !str.equals(com.umeng.commonsdk.statistics.b.f) && m23861(str) == null && !str.startsWith("android:")) {
            throw C12731.m31623(null, "APP_NAME_REFERENCES_NOT_ACCEPTED", "APP resource name references are not accepted when resources.arsc is confused; use hex resource ids.", "warning");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23857(C20150 c20150, C18551 c18551, String str) throws C12731 {
        if ("style".equals(str)) {
            if (c18551.getParent() != 0 && !"style".equals(c20150.m45570(c18551.getParent()))) {
                throw m23862("style parent must resolve to a style resource.");
            }
            Iterator it = c18551.values().iterator();
            while (it.hasNext()) {
                String strM45570 = c20150.m45570(((InterfaceC9961) it.next()).mo25193());
                if (!"attr".equals(strM45570) && !"^attr-private".equals(strM45570)) {
                    throw m23862("style item name must resolve to an attr resource.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Integer m23861(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C6461.m17648(str)) {
            return Integer.valueOf(C6461.m17654(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C12731 m23862(String str) {
        return C12731.m31623(null, "INVALID_VALUE_XML", str, "warning");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12120 m23849(C20150 c20150, C0393 c0393, C16353 c16353, String str, String str2, C14942 c14942, HashMap map) throws C12731 {
        InterfaceC3609 interfaceC3609M4100;
        byte[] bArr = (byte[]) map.get(C22703.m50301(c0393.f1872, c0393.f1874));
        if (bArr == null) {
            interfaceC3609M4100 = c0393.f1875;
        } else {
            interfaceC3609M4100 = C1098.m4100(c0393.f1876, c0393.f1872 & 65535, bArr);
        }
        boolean z = true;
        if (!m23869(interfaceC3609M4100)) {
            C8340 c8340M23870 = m23870(c16353.f52647);
            String strMo7645 = interfaceC3609M4100.mo7645();
            if (!f31573.contains(c8340M23870.m21779())) {
                throw C12731.m31623(null, "UNSUPPORTED_VALUE_XML", "Unsupported valueXml root tag: " + c8340M23870.m21779(), "warning");
            }
            C18923 c18923M21780 = c8340M23870.m21780("name");
            if (c18923M21780 == null) {
                throw m23862("valueXml root must keep the original name attribute.");
            }
            if (!strMo7645.equals(c18923M21780.m43586())) {
                throw m23862("valueXml root name is read-only and must not change.");
            }
            Iterator it = c8340M23870.m21778().iterator();
            while (it.hasNext()) {
                String strM43584 = ((C18923) it.next()).m43584();
                if ("public".equals(strM43584) || "weak".equals(strM43584) || "compact".equals(strM43584)) {
                    throw C12731.m31623(null, "UNSUPPORTED_VALUE_XML", "valueXml does not support public, weak, or compact attributes.", "warning");
                }
            }
            String strM21779 = c8340M23870.m21779();
            strM21779.getClass();
            switch (strM21779) {
                case "string-array":
                    Iterator itM21772 = C8340.m21772(c8340M23870);
                    while (itM21772.hasNext()) {
                        m23853((C8340) itM21772.next());
                    }
                    break;
                case "string":
                case "path":
                    m23853(c8340M23870);
                    break;
                case "plurals":
                    Iterator itM21773 = C8340.m21773(c8340M23870, "item");
                    while (itM21773.hasNext()) {
                        m23853((C8340) itM21773.next());
                    }
                    break;
                case "attr":
                case "array":
                case "complex":
                    Iterator itM21774 = C8340.m21772(c8340M23870);
                    while (itM21774.hasNext()) {
                        C8340 c8340 = (C8340) itM21774.next();
                        if ("string".equals(c8340.m21779()) || MotionUtils.EASING_TYPE_PATH.equals(c8340.m21779())) {
                            m23853(c8340);
                        }
                    }
                    break;
                case "style":
                    Iterator itM21775 = C8340.m21772(c8340M23870);
                    while (itM21775.hasNext()) {
                        C8340 c8341 = (C8340) itM21775.next();
                        if ("item".equals(c8341.m21779())) {
                            m23853(c8341);
                        } else if ("string".equals(c8341.m21779()) || MotionUtils.EASING_TYPE_PATH.equals(c8341.m21779())) {
                            m23853(c8341);
                        }
                    }
                    break;
            }
            m23854(c8340M23870, (String) null, true, false);
            boolean zMo7649 = interfaceC3609M4100.mo7649();
            boolean zMo7648 = interfaceC3609M4100.mo7648();
            boolean zMo7646 = interfaceC3609M4100.mo7646();
            if (c14942.f48724) {
                m23867(c8340M23870, (String) null, true, false);
            }
            try {
                C8340 c8340M21775 = C8340.m21775("<resources>" + c16353.f52647 + "</resources>", true);
                HashMap map2 = new HashMap();
                map2.put(interfaceC3609M4100.mo7645(), Integer.valueOf(interfaceC3609M4100.mo10691()));
                C21373 c21373 = m23851(interfaceC3609M4100).f50844;
                C5769 c5769 = new C5769(c20150, c14942);
                c5769.m28271();
                try {
                    C14816.m35491(c8340M21775, c21373, c5769, map2, new C2820());
                    c5769.m28267();
                    C18551 c18551Mo31753 = c21373.mo31753(interfaceC3609M4100.mo10691());
                    if (c18551Mo31753 == null || c18551Mo31753.mo7647() == 0) {
                        throw new C4811("Resource entry was not encoded", c8340M21775);
                    }
                    c18551Mo31753.m42945(zMo7649);
                    c18551Mo31753.m42935(zMo7648);
                    if (!zMo7646 || c18551Mo31753.mo7644()) {
                        z = false;
                    }
                    c18551Mo31753.m42943(z);
                    m23857(c20150, c18551Mo31753, c8340M23870.m21779());
                    byte[] bArrM4102 = C1098.m4102(c18551Mo31753);
                    return new C12120(c16353.f52651, c16353.f52650, c16353.f52649, str2, C1098.m4099(bArrM4102), str, bArrM4102);
                } catch (Throwable th) {
                    c5769.m28267();
                    throw th;
                }
            } catch (C12731 e) {
                throw e;
            } catch (Exception e2) {
                throw C12731.m31623(null, "INVALID_VALUE_XML", e2.getMessage() == null ? "Invalid valueXml" : e2.getMessage(), "warning");
            }
        }
        C12731 c12731M31623 = C12731.m31623(null, "UNSUPPORTED_VALUE_XML", "Resource attr definitions are not supported by valueXml editing.", "warning");
        c12731M31623.f42468.put("_suppressResourceRetry", true);
        throw c12731M31623;
    }
}
