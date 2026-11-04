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

/* JADX INFO: renamed from: l.ܶ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16395 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashSet f53206 = new HashSet(Arrays.asList("string", MotionUtils.EASING_TYPE_PATH, "bool", ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimen", ClassTransform.FLOAT, "fraction", "id", "integer", Name.REFER, "dynamic-reference", AnnotationHandler.ATTRIBUTE, "dynamic-attribute", "string-array", "integer-array", "array", "plurals", "style", "complex"));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19159 m38927(C2863 c2863) {
        return new C19159(new C21246(c2863.m9453(), c2863.m9457()).m48427());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20125 m38928(C2863 c2863, InterfaceC8697 interfaceC8697, int i) {
        String strM13663 = C4287.m13663(C4287.m13666(interfaceC8697));
        try {
            if (m38948(interfaceC8697)) {
                return C20125.m46337(strM13663, "UNSUPPORTED_VALUE_XML");
            }
            m38949(interfaceC8697);
            m38939(interfaceC8697);
            String strM38923 = m38923(c2863, interfaceC8697, m38927(c2863));
            int iCodePointCount = strM38923.codePointCount(0, strM38923.length());
            if (iCodePointCount > i) {
                return C20125.m46334(iCodePointCount, strM13663);
            }
            return C20125.m46335(iCodePointCount, strM13663, strM38923);
        } catch (C17141 unused) {
            return C20125.m46337(strM13663, "UNSUPPORTED_VALUE_XML");
        } catch (C17887 unused2) {
            return C20125.m46336(strM13663);
        } catch (C25347 unused3) {
            return C20125.m46337(strM13663, "UNSUPPORTED_STYLED_TEXT_XML");
        } catch (Exception unused4) {
            return C20125.m46337(strM13663, "VALUE_XML_UNAVAILABLE");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22363 m38929(C7972 c7972, ArrayList arrayList) throws C10186 {
        C10954 c10954M21757 = c7972.m21757();
        C19159 c19159M27784 = c10954M21757.m27784();
        C22889[] c22889Arr = new C22889[arrayList.size()];
        String[] strArr = new String[arrayList.size()];
        String[] strArr2 = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            C15649 c15649 = (C15649) arrayList.get(i);
            C22889 c22889M27786 = c10954M21757.m27786((int) Long.parseLong(c15649.f50855.substring(2), 16), c15649.f50856);
            if (c22889M27786 == null) {
                C10186 c10186M26300 = C10186.m26300("RESOURCE_VARIANT_NOT_FOUND", "Resource variant not found.");
                m38932(c10186M26300, c15649, (String) null, c19159M27784);
                throw c10186M26300;
            }
            c22889Arr[i] = c22889M27786;
            InterfaceC8697 interfaceC8697 = c22889M27786.f74359;
            strArr[i] = interfaceC8697 == null ? "missing" : C4287.m13663(C4287.m13666(interfaceC8697));
            String strM13663 = C4287.m13663(C4287.m13666(c22889M27786.f74360));
            strArr2[i] = strM13663;
            if (!strM13663.equals(c15649.f50854)) {
                C10186 c10186M26302 = C10186.m26302("STALE_TARGET_VERSION", "targetVersion does not match current resource value. Re-read the resource and retry.", "warning", (JSONArray) null, JSON.object().add("currentTargetVersion", strM13663));
                m38932(c10186M26302, c15649, strM13663, c19159M27784);
                throw c10186M26302;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            C15649 c156410 = (C15649) arrayList.get(i2);
            try {
                C10954 c10954 = c10954M21757;
                try {
                    C13412 c13412M38926 = m38926(c10954M21757, c22889Arr[i2], c156410, strArr[i2], strArr2[i2], c19159M27784, map);
                    arrayList2.add(c13412M38926);
                    C22889 c22889 = c22889Arr[i2];
                    map.put(C7972.m21741(c22889.f74363, c22889.f74361), c13412M38926.f42729);
                    i2++;
                    c10954M21757 = c10954;
                } catch (C10186 e) {
                    e = e;
                    m38932(e, c156410, strArr2[i2], c19159M27784);
                    throw e;
                }
            } catch (C10186 e2) {
                e = e2;
            }
        }
        return new C22363(c19159M27784, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m38937(C10954 c10954, int i, String str, String str2) {
        C22889 c22889M27786 = c10954.m27786(i, str);
        if (c22889M27786 == null) {
            throw new IllegalStateException("Missing planned resource target");
        }
        return m38926(c10954, c22889M27786, new C15649(C7972.m21711(i), 0, str, "missing", str2), "missing", "missing", c10954.m27784(), new HashMap()).f42729;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11174 m38925(InterfaceC8697 interfaceC8697) {
        C23747 c23747M56375 = C23001.m51886().m51891(interfaceC8697.mo18153().mo27607(), interfaceC8697.mo18153().getPackageName()).m56375(interfaceC8697.getType().mo35833(), interfaceC8697.getType().getTypeName());
        c23747M56375.m53016(interfaceC8697.mo23383(), interfaceC8697.mo18156(), false);
        C20017 c20017M53013 = c23747M56375.m53013(interfaceC8697.mo18158().mo9073());
        c20017M53013.m46055(interfaceC8697.mo18158().mo9072());
        c20017M53013.m46053(interfaceC8697.mo18158().mo9067());
        c20017M53013.m46050(interfaceC8697.mo23383());
        return new C11174(c20017M53013);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38932(C10186 c10186, C15649 c15649, String str, C19159 c19159) {
        c10186.f32602.put("failedEditIndex", c15649.f50857).put("resourceId", c15649.f50855).put("variant", c15649.f50856).put("currentTargetVersion", str == null ? JSON.NULL : JSON.value(str)).put("resourceNamePolicy", c19159 == null ? JSON.NULL : c19159.m44398());
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0272  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dc  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38923(C2863 c2863, InterfaceC8697 interfaceC8697, C19159 c19159) {
        String str;
        int i;
        String strM38944;
        InterfaceC8697 interfaceC8697Mo9076;
        String string;
        String strM8732;
        boolean z = c19159.f61991;
        C11920 c11920 = new C11920();
        if (interfaceC8697.mo18155() && "style".equals(C10208.m26336(interfaceC8697.getType().getTypeName()))) {
            c11920.mo14234("style");
            c11920.mo14233("name", interfaceC8697.mo18156());
            if (interfaceC8697.getParent() != 0) {
                c11920.mo14233("parent", "@".concat(m38922(interfaceC8697.mo18153().mo27607(), interfaceC8697.getParent(), c2863, c19159)));
            }
            C7075 c7075M9457 = c2863.m9457();
            for (InterfaceC5650 interfaceC5650 : interfaceC8697.values()) {
                C2600 c2600M19410 = c7075M9457.m19410(interfaceC5650.mo16637());
                if (c2600M19410 != null) {
                    if (((C0594) c2600M19410.m8730()).contains(interfaceC5650.mo16635())) {
                        c11920.mo14234("item");
                        int iMo27607 = interfaceC8697.mo18153().mo27607();
                        int i2 = c2600M19410.f8353;
                        int i3 = (i2 >>> 24) & 255;
                        if (!z || i3 == 1) {
                            StringBuilder sbM27333 = C10732.m27333(c2863.m9452(iMo27607, i3));
                            sbM27333.append(c2600M19410.f8356);
                            string = sbM27333.toString();
                        } else {
                            string = m38944(i2);
                        }
                        c11920.mo14233("name", string);
                        if (interfaceC5650.mo16632()) {
                            int i4 = c2600M19410.f8357;
                            if ((65536 & i4) != 0) {
                                strM8732 = c2600M19410.m8729(interfaceC5650.getValue());
                            } else if ((i4 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                                strM8732 = c2600M19410.m8732(interfaceC5650.getValue());
                            } else {
                                strM8732 = null;
                            }
                        } else {
                            strM8732 = null;
                        }
                        if (strM8732 == null) {
                            m38947(c11920, interfaceC5650, c2863, c19159);
                        } else {
                            c11920.text(strM8732.toString());
                        }
                        c11920.mo14232("item");
                    }
                }
                m38934(c11920, interfaceC5650, c2863, c19159);
            }
            c11920.mo14232("style");
        } else if (interfaceC8697.mo18155() && m38948(interfaceC8697) && interfaceC8697.mo18154() != 0 && interfaceC8697.getValue().mo16637() == 16777216 && interfaceC8697.getValue().mo16632()) {
            c11920.mo14234("attr");
            c11920.mo14233("name", interfaceC8697.mo18156());
            int value = interfaceC8697.getValue().getValue();
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
                c11920.mo14233("format", sb.toString());
            } else {
                str = null;
            }
            InterfaceC15344 type = interfaceC8697.mo18153().getType("id");
            InterfaceC2731 interfaceC2731Mo4334 = (type == null || type.mo4331() == 0) ? null : type.mo4334(0);
            int iMo27608 = interfaceC8697.mo18153().mo27607() << 24;
            int i5 = 16;
            if (type != null) {
                iMo27608 |= type.mo35833() << 16;
            }
            int i6 = 1;
            while (i6 < interfaceC8697.mo18154()) {
                InterfaceC5650 value2 = interfaceC8697.getValue(i6);
                if (str == null) {
                    m38934(c11920, value2, c2863, c19159);
                } else {
                    if (value2.mo16635() != i5) {
                        i = 65535;
                        if (value2.mo16635() != 17) {
                            m38934(c11920, value2, c2863, c19159);
                        }
                    } else {
                        i = 65535;
                    }
                    c11920.mo14234(str);
                    int iMo16637 = value2.mo16637();
                    int i7 = (iMo16637 >>> 24) & 255;
                    if ((!z || i7 == 1) && interfaceC2731Mo4334 != null && ((-65536) & iMo16637) == iMo27608 && (interfaceC8697Mo9076 = interfaceC2731Mo4334.mo9076(iMo16637 & i)) != null) {
                        String strMo18156 = interfaceC8697Mo9076.mo18156();
                        strM38944 = m38950(strMo18156) ? m38944(iMo16637) : strMo18156;
                    } else {
                        strM38944 = m38944(iMo16637);
                    }
                    c11920.mo14233("name", strM38944);
                    c11920.mo14233(b.d, C14049.m34210(c2863, value2).toString());
                    c11920.mo14232(str);
                }
                i6++;
                i5 = 16;
            }
            c11920.mo14232("attr");
        } else {
            C14049.m34217(c11920, interfaceC8697, new C5955(c2863.m9453(), c19159), new C1372());
        }
        return c11920.f38413.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m38948(InterfaceC8697 interfaceC8697) {
        String strM26336 = C10208.m26336(interfaceC8697.getType().getTypeName());
        return "attr".equals(strM26336) || "^attr-private".equals(strM26336);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38934(InterfaceC18525 interfaceC18525, InterfaceC5650 interfaceC5650, C2863 c2863, C19159 c19159) {
        C11920 c11920 = (C11920) interfaceC18525;
        c11920.mo14234(m38924(interfaceC5650));
        if (interfaceC5650.mo16637() != -1) {
            c11920.mo14233("id", m38944(interfaceC5650.mo16637()));
        }
        m38947(interfaceC18525, interfaceC5650, c2863, c19159);
        c11920.mo14232(m38924(interfaceC5650));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m38947(InterfaceC18525 interfaceC18525, InterfaceC5650 interfaceC5650, C2863 c2863, C19159 c19159) {
        int iMo16635 = interfaceC5650.mo16635();
        if (iMo16635 == 0) {
            ((C11920) interfaceC18525).text(interfaceC5650.getValue() == 1 ? "@empty" : "@null");
            return;
        }
        if (iMo16635 != 1) {
            if (iMo16635 != 2) {
                if (iMo16635 == 3) {
                    InterfaceC16090 interfaceC16090Mo11710 = interfaceC5650.mo11710();
                    if (interfaceC16090Mo11710 == null) {
                        ((C11920) interfaceC18525).text("");
                        return;
                    } else {
                        C14049.m34215(interfaceC18525, interfaceC16090Mo11710.getValue(), interfaceC16090Mo11710.mo26721());
                        return;
                    }
                }
                if (iMo16635 != 7) {
                    if (iMo16635 != 8) {
                        ((C11920) interfaceC18525).text(C14049.m34210(c2863, interfaceC5650).toString());
                        return;
                    }
                }
            }
            ((C11920) interfaceC18525).text(interfaceC5650.getValue() == 0 ? "?null" : "?".concat(m38922(interfaceC5650.mo11708().mo27607(), interfaceC5650.getValue(), c2863, c19159)));
            return;
        }
        ((C11920) interfaceC18525).text(interfaceC5650.getValue() != 0 ? "@".concat(m38922(interfaceC5650.mo11708().mo27607(), interfaceC5650.getValue(), c2863, c19159)) : "@null");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38924(InterfaceC5650 interfaceC5650) throws IOException {
        int iMo16635 = interfaceC5650.mo16635();
        switch (iMo16635) {
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
                switch (iMo16635) {
                    case 16:
                    case 17:
                        return "integer";
                    case 18:
                        return "bool";
                    default:
                        switch (iMo16635) {
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                return ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR;
                            default:
                                throw new IOException("Unsupported value type: ".concat(C21246.m48420(interfaceC5650.mo16635())));
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38922(int i, int i2, C2863 c2863, C19159 c19159) {
        int i3 = (i2 >>> 24) & 255;
        if (c19159.f61991 && i3 != 1) {
            return m38944(i2);
        }
        String strMo9456 = c2863.mo9456(i, i2);
        return m38950(strMo9456) ? m38944(i2) : strMo9456;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m38950(String str) {
        return str != null && str.length() == 8 && C11730.m29453(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m38944(int i) {
        return String.format(Locale.ROOT, "%08X", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m38939(InterfaceC8697 interfaceC8697) throws C25347 {
        C25042[] c25042ArrMo8826;
        boolean zM44487;
        for (InterfaceC5650 interfaceC5650 : interfaceC8697.values()) {
            if (interfaceC5650.mo16635() == 3 && interfaceC5650.mo11710() != null) {
                InterfaceC16090 interfaceC16090Mo11710 = interfaceC5650.mo11710();
                if (interfaceC16090Mo11710.mo8825() && (c25042ArrMo8826 = interfaceC16090Mo11710.mo8826()) != null) {
                    int length = interfaceC16090Mo11710.getValue().length();
                    for (C25042 c25042 : c25042ArrMo8826) {
                        if (c25042.m55862(length)) {
                            String str = c25042.f81015;
                            int iIndexOf = str.indexOf(59);
                            if (iIndexOf < 0) {
                                zM44487 = C19205.m44487(str);
                            } else if (C19205.m44487(str.substring(0, iIndexOf))) {
                                while (true) {
                                    if (iIndexOf >= 0) {
                                        int i = iIndexOf + 1;
                                        if (i < str.length()) {
                                            int iIndexOf2 = str.indexOf(61, i);
                                            if (iIndexOf2 >= 0) {
                                                String strSubstring = str.substring(i, iIndexOf2);
                                                if (strSubstring.indexOf(59) < 0 && strSubstring.indexOf(61) < 0 && C19205.m44487(strSubstring)) {
                                                    iIndexOf = str.indexOf(59, iIndexOf2 + 1);
                                                }
                                            }
                                            zM44487 = false;
                                        }
                                    }
                                    zM44487 = true;
                                }
                            } else {
                                zM44487 = false;
                            }
                            if (zM44487) {
                            }
                        }
                        throw new C25347();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m38949(InterfaceC8697 interfaceC8697) throws C17141 {
        if (interfaceC8697.mo18155()) {
            for (InterfaceC5650 interfaceC5650 : interfaceC8697.values()) {
                if (interfaceC5650.mo16635() == 0 && interfaceC5650.getValue() == 1) {
                    throw new C17141();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38930(C2008 c2008) throws C10186 {
        if (c2008.m6864()) {
            return;
        }
        Iterator itM6847 = C2008.m6847(c2008);
        while (itM6847.hasNext()) {
            m38945((C2008) itM6847.next());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m38945(C2008 c2008) throws C10186 {
        if (!C19205.m44487(c2008.m6853())) {
            throw C10186.m26298(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text tag name: " + c2008.m6853(), "warning");
        }
        for (C5737 c5737 : c2008.m6860()) {
            String strM16796 = c5737.m16796();
            String strM16798 = c5737.m16798();
            if (!C19205.m44487(strM16796) || strM16796.indexOf(61) >= 0 || strM16796.indexOf(59) >= 0) {
                throw C10186.m26298(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text attribute name: ".concat(strM16796), "warning");
            }
            if (strM16798.indexOf(59) >= 0) {
                throw C10186.m26298(null, "UNSUPPORTED_STYLED_TEXT_XML", "Unsupported styled text attribute value.", "warning");
            }
        }
        Iterator itM6847 = C2008.m6847(c2008);
        while (itM6847.hasNext()) {
            m38945((C2008) itM6847.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38931(C2008 c2008, String str, boolean z, boolean z2) throws C10186 {
        if (z2) {
            return;
        }
        if (c2008.m6864()) {
            try {
                if ("@empty".equals(c2008.m6859().m39906()) && (!z || !Name.REFER.equals(c2008.m6853()))) {
                    throw m38938("@empty is supported only by root <reference>.");
                }
            } catch (C10254 e) {
                throw m38938(e.getMessage() == null ? "Invalid valueXml" : e.getMessage());
            }
        }
        boolean zM38936 = m38936(c2008, str, z);
        Iterator itM6847 = C2008.m6847(c2008);
        while (itM6847.hasNext()) {
            m38931((C2008) itM6847.next(), c2008.m6853(), false, zM38936);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C2008 m38941(String str) throws C10186 {
        if (str.trim().isEmpty()) {
            throw m38938("valueXml must contain one XML element.");
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (str.contains("<?") || upperCase.contains("<!DOCTYPE")) {
            throw m38938("valueXml must not contain processing instructions or DTD.");
        }
        try {
            int i = C25129.f81255;
            C19205 c19205 = new C19205();
            c19205.m44493(new StringReader(str));
            C25129 c25129M55999 = C25129.m55999(c19205, true);
            if (c25129M55999.size() != 1) {
                throw m38938("valueXml must contain exactly one root element.");
            }
            return (C2008) c25129M55999.get(0);
        } catch (C10186 e) {
            throw e;
        } catch (Exception e2) {
            throw m38938(e2.getMessage() == null ? "Invalid valueXml" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m38946(C2008 c2008, String str, boolean z, boolean z2) throws C10186 {
        if (z2) {
            return;
        }
        for (C5737 c5737 : c2008.m6860()) {
            if ("parent".equals(c5737.m16796()) && c5737.m16798().startsWith("@")) {
                m38940(c5737.m16798().substring(1));
            } else if ("item".equals(c2008.m6853()) && "name".equals(c5737.m16796())) {
                m38940(c5737.m16798());
            } else if ("enum".equals(c2008.m6853()) || "flag".equals(c2008.m6853())) {
                if ("name".equals(c5737.m16796())) {
                    m38940(c5737.m16798());
                }
            }
        }
        if (c2008.m6864()) {
            try {
                String strM39906 = c2008.m6859().m39906();
                if (strM39906.startsWith("@") || strM39906.startsWith("?")) {
                    m38940(strM39906.substring(1));
                }
            } catch (C10254 e) {
                throw m38938(e.getMessage() == null ? "Invalid valueXml" : e.getMessage());
            }
        }
        boolean zM38936 = m38936(c2008, str, z);
        Iterator itM6847 = C2008.m6847(c2008);
        while (itM6847.hasNext()) {
            m38946((C2008) itM6847.next(), c2008.m6853(), false, zM38936);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38936(C2008 c2008, String str, boolean z) {
        String strM6853 = c2008.m6853();
        if ("string".equals(strM6853) || MotionUtils.EASING_TYPE_PATH.equals(strM6853)) {
            return z || "array".equals(str) || "attr".equals(str) || "complex".equals(str) || "style".equals(str);
        }
        if ("item".equals(strM6853)) {
            return "string-array".equals(str) || "plurals".equals(str) || "style".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m38940(String str) throws C10186 {
        if (!str.equals("null") && !str.equals(com.umeng.commonsdk.statistics.b.f) && m38942(str) == null && !str.startsWith("android:")) {
            throw C10186.m26298(null, "APP_NAME_REFERENCES_NOT_ACCEPTED", "APP resource name references are not accepted when resources.arsc is confused; use hex resource ids.", "warning");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38933(C10954 c10954, C13304 c13304, String str) throws C10186 {
        if ("style".equals(str)) {
            if (c13304.getParent() != 0 && !"style".equals(c10954.m27782(c13304.getParent()))) {
                throw m38938("style parent must resolve to a style resource.");
            }
            Iterator it = c13304.values().iterator();
            while (it.hasNext()) {
                String strM27782 = c10954.m27782(((InterfaceC5650) it.next()).mo16637());
                if (!"attr".equals(strM27782) && !"^attr-private".equals(strM27782)) {
                    throw m38938("style item name must resolve to an attr resource.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Integer m38942(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C11730.m29453(str)) {
            return Integer.valueOf(C11730.m29456(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C10186 m38938(String str) {
        return C10186.m26298(null, "INVALID_VALUE_XML", str, "warning");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13412 m38926(C10954 c10954, C22889 c22889, C15649 c15649, String str, String str2, C19159 c19159, HashMap map) throws C10186 {
        InterfaceC8697 interfaceC8697M13664;
        byte[] bArr = (byte[]) map.get(C7972.m21741(c22889.f74363, c22889.f74361));
        if (bArr == null) {
            interfaceC8697M13664 = c22889.f74360;
        } else {
            interfaceC8697M13664 = C4287.m13664(c22889.f74362, c22889.f74363 & 65535, bArr);
        }
        boolean z = true;
        if (!m38948(interfaceC8697M13664)) {
            C2008 c2008M38941 = m38941(c15649.f50858);
            String strMo18156 = interfaceC8697M13664.mo18156();
            if (!f53206.contains(c2008M38941.m6853())) {
                throw C10186.m26298(null, "UNSUPPORTED_VALUE_XML", "Unsupported valueXml root tag: " + c2008M38941.m6853(), "warning");
            }
            C5737 c5737M6854 = c2008M38941.m6854("name");
            if (c5737M6854 == null) {
                throw m38938("valueXml root must keep the original name attribute.");
            }
            if (!strMo18156.equals(c5737M6854.m16798())) {
                throw m38938("valueXml root name is read-only and must not change.");
            }
            Iterator it = c2008M38941.m6860().iterator();
            while (it.hasNext()) {
                String strM16796 = ((C5737) it.next()).m16796();
                if ("public".equals(strM16796) || "weak".equals(strM16796) || "compact".equals(strM16796)) {
                    throw C10186.m26298(null, "UNSUPPORTED_VALUE_XML", "valueXml does not support public, weak, or compact attributes.", "warning");
                }
            }
            String strM6853 = c2008M38941.m6853();
            strM6853.getClass();
            switch (strM6853) {
                case "string-array":
                    Iterator itM6847 = C2008.m6847(c2008M38941);
                    while (itM6847.hasNext()) {
                        m38930((C2008) itM6847.next());
                    }
                    break;
                case "string":
                case "path":
                    m38930(c2008M38941);
                    break;
                case "plurals":
                    Iterator itM6848 = C2008.m6848(c2008M38941, "item");
                    while (itM6848.hasNext()) {
                        m38930((C2008) itM6848.next());
                    }
                    break;
                case "attr":
                case "array":
                case "complex":
                    Iterator itM6849 = C2008.m6847(c2008M38941);
                    while (itM6849.hasNext()) {
                        C2008 c2008 = (C2008) itM6849.next();
                        if ("string".equals(c2008.m6853()) || MotionUtils.EASING_TYPE_PATH.equals(c2008.m6853())) {
                            m38930(c2008);
                        }
                    }
                    break;
                case "style":
                    Iterator itM68410 = C2008.m6847(c2008M38941);
                    while (itM68410.hasNext()) {
                        C2008 c2009 = (C2008) itM68410.next();
                        if ("item".equals(c2009.m6853())) {
                            m38930(c2009);
                        } else if ("string".equals(c2009.m6853()) || MotionUtils.EASING_TYPE_PATH.equals(c2009.m6853())) {
                            m38930(c2009);
                        }
                    }
                    break;
            }
            m38931(c2008M38941, (String) null, true, false);
            boolean zMo18152 = interfaceC8697M13664.mo18152();
            boolean zMo18157 = interfaceC8697M13664.mo18157();
            boolean zMo18151 = interfaceC8697M13664.mo18151();
            if (c19159.f61991) {
                m38946(c2008M38941, (String) null, true, false);
            }
            try {
                C2008 c2008M6850 = C2008.m6850("<resources>" + c15649.f50858 + "</resources>", true);
                HashMap map2 = new HashMap();
                map2.put(interfaceC8697M13664.mo18156(), Integer.valueOf(interfaceC8697M13664.mo23383()));
                C20017 c20017 = m38925(interfaceC8697M13664).f35219;
                C2226 c2226 = new C2226(c10954, c19159);
                c2226.m30904();
                try {
                    C24361.m54438(c2008M6850, c20017, c2226, map2, new C1372());
                    c2226.m30900();
                    C13304 c13304Mo9076 = c20017.mo9076(interfaceC8697M13664.mo23383());
                    if (c13304Mo9076 == null || c13304Mo9076.mo18154() == 0) {
                        throw new C10254("Resource entry was not encoded", c2008M6850);
                    }
                    c13304Mo9076.m32856(zMo18152);
                    c13304Mo9076.m32861(zMo18157);
                    if (!zMo18151 || c13304Mo9076.mo18155()) {
                        z = false;
                    }
                    c13304Mo9076.m32855(z);
                    m38933(c10954, c13304Mo9076, c2008M38941.m6853());
                    byte[] bArrM13666 = C4287.m13666(c13304Mo9076);
                    return new C13412(c15649.f50857, c15649.f50855, c15649.f50856, str2, C4287.m13663(bArrM13666), str, bArrM13666);
                } catch (Throwable th) {
                    c2226.m30900();
                    throw th;
                }
            } catch (C10186 e) {
                throw e;
            } catch (Exception e2) {
                throw C10186.m26298(null, "INVALID_VALUE_XML", e2.getMessage() == null ? "Invalid valueXml" : e2.getMessage(), "warning");
            }
        }
        C10186 c10186M26298 = C10186.m26298(null, "UNSUPPORTED_VALUE_XML", "Resource attr definitions are not supported by valueXml editing.", "warning");
        c10186M26298.f32602.put("_suppressResourceRetry", true);
        throw c10186M26298;
    }
}
