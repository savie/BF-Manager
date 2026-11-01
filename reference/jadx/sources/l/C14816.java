package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.statistics.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܳ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31G5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14816 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f48430;

    static {
        HashMap map = new HashMap();
        f48430 = map;
        map.put(AnnotationHandler.ATTRIBUTE, new C16227());
        map.put("bool", new C20460());
        map.put(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, new C0703());
        map.put("dimen", new C12699());
        map.put(ClassTransform.FLOAT, new C2114());
        map.put("fraction", new C9877());
        map.put("id", new C3525());
        map.put("integer", new C4315());
        map.put(Name.REFER, new C2198());
        map.put("dynamic-reference", new C6348());
        map.put("dynamic-attribute", new C17637());
        C5021 c5021 = new C5021();
        map.put("string", c5021);
        map.put(MotionUtils.EASING_TYPE_PATH, c5021);
        map.put("complex", new C16932());
        C10583 c10583 = new C10583();
        map.put("string-array", c10583);
        map.put("integer-array", c10583);
        map.put("array", c10583);
        map.put("attr", new C21165());
        map.put("plurals", new C13489());
        map.put("style", new C21955());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35491(C8340 c8340, C21373 c21373, C11288 c11288, HashMap map, C2820 c2820) {
        if (!c8340.m21779().equals("resources")) {
            throw new C4811("Expected tag: <resources>", c8340);
        }
        C18923 c18923M21780 = c8340.m21780("sparse");
        if (c18923M21780 != null && c18923M21780.m43586().equals("true")) {
            c21373.m47906(true);
        }
        C18923 c18923M21781 = c8340.m21780("offset16");
        if (c18923M21781 != null && c18923M21781.m43586().equals("true")) {
            c21373.m47905(true);
        }
        Iterator itM21772 = C8340.m21772(c8340);
        while (itM21772.hasNext()) {
            C8340 c8341 = (C8340) itM21772.next();
            C18923 c18923M21782 = c8341.m21780("name");
            if (c18923M21782 == null) {
                throw new C4811("Expected attr: name", c8341);
            }
            String strM43586 = c18923M21782.m43586();
            Integer num = (Integer) map.get(strM43586);
            if (num == null) {
                throw new C4811(C0242.m1617("Id definition not found: ", strM43586, " (in ", c21373.getType().getPath() + "/type-info.xml", MotionUtils.EASING_TYPE_FORMAT_END), c8341);
            }
            int iIntValue = num.intValue();
            boolean z = false;
            c21373.getType().m1526(iIntValue, strM43586, false);
            C18551 c18551M47902 = c21373.m47902(iIntValue);
            C18923 c18923M21783 = c8341.m21780("public");
            if (c2820.f10704) {
                c18551M47902.m42945(c18923M21783 == null || c18923M21783.m43586().equals("true"));
            } else {
                c18551M47902.m42945(c18923M21783 != null && c18923M21783.m43586().equals("true"));
            }
            C18923 c18923M21784 = c8341.m21780("weak");
            if (c2820.f10703) {
                c18551M47902.m42935(c18923M21784 == null || c18923M21784.m43586().equals("true"));
            } else {
                c18551M47902.m42935(c18923M21784 != null && c18923M21784.m43586().equals("true"));
            }
            C18923 c18923M21785 = c8341.m21780("compact");
            if (c2820.f10702) {
                c18551M47902.m42943(c18923M21785 == null || c18923M21785.m43586().equals("true"));
            } else {
                if (c18923M21785 != null && c18923M21785.m43586().equals("true")) {
                    z = true;
                }
                c18551M47902.m42943(z);
            }
            InterfaceC23988 interfaceC23988 = (InterfaceC23988) f48430.get(c8341.m21779());
            if (interfaceC23988 == null) {
                throw new C4811("Unknown tag <" + c8341.m21779() + ">", c8341);
            }
            interfaceC23988.mo6812(c18551M47902, c11288, c8341);
            c11288.m28268(c18551M47902.mo10693(), c8341.m51157(), c8341.m51158());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16435 m35487(C18551 c18551, C8340 c8340, C11288 c11288, boolean z) throws C4811 {
        Integer numM35486;
        C10457 c10457M21784 = c8340.m21784();
        String strM26418 = c10457M21784.m26418();
        if (!strM26418.startsWith("@")) {
            throw new C4811("Expected reference value", c10457M21784);
        }
        int i = 1;
        String strSubstring = strM26418.substring(1);
        if (strSubstring.equals("null")) {
            numM35486 = 0;
        } else if (!strSubstring.equals(b.f)) {
            numM35486 = m35486(strSubstring);
            if (numM35486 == null) {
                int iMo15890 = c11288.mo15890(c18551.m42934().mo19106(), strSubstring);
                numM35486 = iMo15890 == -1 ? null : Integer.valueOf(iMo15890);
            }
        } else {
            if (!z) {
                throw new C4811("@empty is supported only by root <reference>", c10457M21784);
            }
            numM35486 = 1;
            i = 0;
        }
        if (numM35486 != null) {
            C16435 c16435M42936 = c18551.m42936(numM35486.intValue(), i, -1);
            c11288.m28270(c16435M42936, c10457M21784);
            return c16435M42936;
        }
        throw new C4811("Resource not found: @".concat(strSubstring), c10457M21784);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16435 m35488(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        Integer numM35486;
        C10457 c10457M21784 = c8340.m21784();
        String strM26418 = c10457M21784.m26418();
        if (!strM26418.startsWith("?")) {
            throw new C4811("Expected reference value", c10457M21784);
        }
        String strSubstring = strM26418.substring(1);
        if (strSubstring.equals("null")) {
            numM35486 = 0;
        } else {
            numM35486 = m35486(strSubstring);
            if (numM35486 == null) {
                int iMo15890 = c11288.mo15890(c18551.m42934().mo19106(), strSubstring);
                numM35486 = iMo15890 == -1 ? null : Integer.valueOf(iMo15890);
            }
        }
        if (numM35486 != null) {
            C16435 c16435M42936 = c18551.m42936(numM35486.intValue(), 2, -1);
            c11288.m28270(c16435M42936, c10457M21784);
            return c16435M42936;
        }
        throw new C4811("Resource not found: ?".concat(strSubstring), c10457M21784);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m35486(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C6461.m17648(str)) {
            return Integer.valueOf(C6461.m17654(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C16435 m35494(C18551 c18551, C11288 c11288, C8340 c8340) {
        int iM51157;
        int iM51158;
        StringBuilder sb = new StringBuilder();
        LinkedList linkedList = new LinkedList();
        m35490(c8340.m21785(), sb, linkedList);
        C16435 c16435M42937 = c18551.m42937(sb.toString(), linkedList.isEmpty() ? null : (C15606[]) linkedList.toArray(new C15606[0]), -1);
        if (!c16435M42937.mo25185() && !c16435M42937.mo25189() && !c16435M42937.mo25191()) {
            return c16435M42937;
        }
        ArrayList arrayListM21785 = c8340.m21785();
        if (arrayListM21785.isEmpty()) {
            iM51157 = c8340.m51158();
            iM51158 = iM51157;
        } else {
            iM51157 = ((AbstractC23157) arrayListM21785.get(0)).m51157();
            iM51158 = ((AbstractC23157) arrayListM21785.get(arrayListM21785.size() - 1)).m51158();
        }
        c11288.m28269(c16435M42937, iM51157, iM51158);
        return c16435M42937;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35490(ArrayList arrayList, StringBuilder sb, LinkedList linkedList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC23157 abstractC23157 = (AbstractC23157) it.next();
            if (!abstractC23157.mo21788()) {
                if (abstractC23157.mo21788()) {
                    throw new UnsupportedOperationException();
                }
                m35489(sb, ((C10457) abstractC23157).m26418());
            } else {
                C8340 c8340M51156 = abstractC23157.m51156();
                int length = sb.length();
                StringBuilder sb2 = new StringBuilder(c8340M51156.m21779());
                for (C18923 c18923 : c8340M51156.m21778()) {
                    sb2.append(';');
                    sb2.append(c18923.m43584());
                    sb2.append(a.h);
                    sb2.append(c18923.m43586());
                }
                m35490(c8340M51156.m21785(), sb, linkedList);
                linkedList.addFirst(new C15606(sb2.toString(), length, sb.length()));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35489(StringBuilder sb, String str) {
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                if (i != str.length() - 1) {
                    i++;
                    sb.append(str.charAt(i));
                } else {
                    sb.append('\\');
                }
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C16435 m35492(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        int i;
        C10457 c10457M21784 = c8340.m21784();
        String strM26418 = c10457M21784.m26418();
        C12812 c12812 = new C12812();
        if (C6461.m17656(strM26418, c12812) && (i = c12812.f42661) == 4) {
            C16435 c16435M42936 = c18551.m42936(c12812.f42662, i, -1);
            c11288.m28270(c16435M42936, c10457M21784);
            return c16435M42936;
        }
        throw new C4811("Expected float value", c10457M21784);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C16435 m35485(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        int i;
        C10457 c10457M21784 = c8340.m21784();
        String strM26418 = c10457M21784.m26418();
        C12812 c12812 = new C12812();
        if (C6461.m17656(strM26418, c12812) && (i = c12812.f42661) == 5) {
            C16435 c16435M42936 = c18551.m42936(c12812.f42662, i, -1);
            c11288.m28270(c16435M42936, c10457M21784);
            return c16435M42936;
        }
        throw new C4811("Expected dimen value", c10457M21784);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C16435 m35496(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        int i;
        C10457 c10457M21784 = c8340.m21784();
        String strM26418 = c10457M21784.m26418();
        C12812 c12812 = new C12812();
        if (C6461.m17656(strM26418, c12812) && (i = c12812.f42661) == 6) {
            C16435 c16435M42936 = c18551.m42936(c12812.f42662, i, -1);
            c11288.m28270(c16435M42936, c10457M21784);
            return c16435M42936;
        }
        throw new C4811("Expected fraction value", c10457M21784);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C16435 m35484(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        C10457 c10457M21784 = c8340.m21784();
        String strM26418 = c10457M21784.m26418();
        C12812 c12812 = new C12812();
        if (C6461.m17653(strM26418, c12812)) {
            C16435 c16435M42936 = c18551.m42936(c12812.f42662, c12812.f42661, -1);
            c11288.m28270(c16435M42936, c10457M21784);
            return c16435M42936;
        }
        throw new C4811("Expected integer value", c10457M21784);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C16435 m35495(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        C10457 c10457M21784 = c8340.m21784();
        String strM26418 = c10457M21784.m26418();
        if (strM26418.equals("true")) {
            C16435 c16435M42936 = c18551.m42936(1, 18, -1);
            c11288.m28270(c16435M42936, c10457M21784);
            return c16435M42936;
        }
        if (strM26418.equals("false")) {
            C16435 c16435M42937 = c18551.m42936(0, 18, -1);
            c11288.m28270(c16435M42937, c10457M21784);
            return c16435M42937;
        }
        throw new C4811("Expected bool value", c10457M21784);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C16435 m35493(C18551 c18551, C11288 c11288, C8340 c8340) throws C4811 {
        C10457 c10457M21784 = c8340.m21784();
        String strM26418 = c10457M21784.m26418();
        C12812 c12812 = new C12812();
        if (C6461.m17649(strM26418, c12812)) {
            C16435 c16435M42936 = c18551.m42936(c12812.f42662, c12812.f42661, -1);
            c11288.m28270(c16435M42936, c10457M21784);
            return c16435M42936;
        }
        throw new C4811("Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ".concat(strM26418), c10457M21784);
    }
}
