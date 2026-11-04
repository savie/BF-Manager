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

/* JADX INFO: renamed from: l.᩺ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31G5 */
/* JADX INFO: loaded from: classes.dex */
public final class C24361 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f79030;

    static {
        HashMap map = new HashMap();
        f79030 = map;
        map.put(AnnotationHandler.ATTRIBUTE, new C25107());
        map.put("bool", new C16901());
        map.put(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, new C17647());
        map.put("dimen", new C23615());
        map.put(ClassTransform.FLOAT, new C4223());
        map.put("fraction", new C14663());
        map.put("id", new C21377());
        map.put("integer", new C18393());
        map.put(Name.REFER, new C19139());
        map.put("dynamic-reference", new C20631());
        map.put("dynamic-attribute", new C3477());
        C10188 c10188 = new C10188();
        map.put("string", c10188);
        map.put(MotionUtils.EASING_TYPE_PATH, c10188);
        map.put("complex", new C16155());
        C1986 c1986 = new C1986();
        map.put("string-array", c1986);
        map.put("integer-array", c1986);
        map.put("array", c1986);
        map.put("attr", new C11680());
        map.put("plurals", new C0494());
        map.put("style", new C1240());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54438(C2008 c2008, C20017 c20017, C12426 c12426, HashMap map, C1372 c1372) {
        if (!c2008.m6853().equals("resources")) {
            throw new C10254("Expected tag: <resources>", c2008);
        }
        C5737 c5737M6854 = c2008.m6854("sparse");
        if (c5737M6854 != null && c5737M6854.m16798().equals("true")) {
            c20017.m46055(true);
        }
        C5737 c5737M6855 = c2008.m6854("offset16");
        if (c5737M6855 != null && c5737M6855.m16798().equals("true")) {
            c20017.m46053(true);
        }
        Iterator itM6847 = C2008.m6847(c2008);
        while (itM6847.hasNext()) {
            C2008 c2009 = (C2008) itM6847.next();
            C5737 c5737M6856 = c2009.m6854("name");
            if (c5737M6856 == null) {
                throw new C10254("Expected attr: name", c2009);
            }
            String strM16798 = c5737M6856.m16798();
            Integer num = (Integer) map.get(strM16798);
            if (num == null) {
                throw new C10254(C3188.m10404("Id definition not found: ", strM16798, " (in ", c20017.getType().getPath() + "/type-info.xml", MotionUtils.EASING_TYPE_FORMAT_END), c2009);
            }
            int iIntValue = num.intValue();
            boolean z = false;
            c20017.getType().m53016(iIntValue, strM16798, false);
            C13304 c13304M46050 = c20017.m46050(iIntValue);
            C5737 c5737M6857 = c2009.m6854("public");
            if (c1372.f4895) {
                c13304M46050.m32856(c5737M6857 == null || c5737M6857.m16798().equals("true"));
            } else {
                c13304M46050.m32856(c5737M6857 != null && c5737M6857.m16798().equals("true"));
            }
            C5737 c5737M6858 = c2009.m6854("weak");
            if (c1372.f4894) {
                c13304M46050.m32861(c5737M6858 == null || c5737M6858.m16798().equals("true"));
            } else {
                c13304M46050.m32861(c5737M6858 != null && c5737M6858.m16798().equals("true"));
            }
            C5737 c5737M6859 = c2009.m6854("compact");
            if (c1372.f4893) {
                c13304M46050.m32855(c5737M6859 == null || c5737M6859.m16798().equals("true"));
            } else {
                if (c5737M6859 != null && c5737M6859.m16798().equals("true")) {
                    z = true;
                }
                c13304M46050.m32855(z);
            }
            InterfaceC6461 interfaceC6461 = (InterfaceC6461) f79030.get(c2009.m6853());
            if (interfaceC6461 == null) {
                throw new C10254("Unknown tag <" + c2009.m6853() + ">", c2009);
            }
            interfaceC6461.mo2387(c13304M46050, c12426, c2009);
            c12426.m30901(c13304M46050.mo23384(), c2009.m51624(), c2009.m51623());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3609 m54434(C13304 c13304, C2008 c2008, C12426 c12426, boolean z) throws C10254 {
        Integer numM54433;
        C16923 c16923M6859 = c2008.m6859();
        String strM39906 = c16923M6859.m39906();
        if (!strM39906.startsWith("@")) {
            throw new C10254("Expected reference value", c16923M6859);
        }
        int i = 1;
        String strSubstring = strM39906.substring(1);
        if (strSubstring.equals("null")) {
            numM54433 = 0;
        } else if (!strSubstring.equals(b.f)) {
            numM54433 = m54433(strSubstring);
            if (numM54433 == null) {
                int iMo7578 = c12426.mo7578(c13304.m32857().mo27607(), strSubstring);
                numM54433 = iMo7578 == -1 ? null : Integer.valueOf(iMo7578);
            }
        } else {
            if (!z) {
                throw new C10254("@empty is supported only by root <reference>", c16923M6859);
            }
            numM54433 = 1;
            i = 0;
        }
        if (numM54433 != null) {
            C3609 c3609M32848 = c13304.m32848(numM54433.intValue(), i, -1);
            c12426.m30903(c3609M32848, c16923M6859);
            return c3609M32848;
        }
        throw new C10254("Resource not found: @".concat(strSubstring), c16923M6859);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3609 m54435(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        Integer numM54433;
        C16923 c16923M6859 = c2008.m6859();
        String strM39906 = c16923M6859.m39906();
        if (!strM39906.startsWith("?")) {
            throw new C10254("Expected reference value", c16923M6859);
        }
        String strSubstring = strM39906.substring(1);
        if (strSubstring.equals("null")) {
            numM54433 = 0;
        } else {
            numM54433 = m54433(strSubstring);
            if (numM54433 == null) {
                int iMo7578 = c12426.mo7578(c13304.m32857().mo27607(), strSubstring);
                numM54433 = iMo7578 == -1 ? null : Integer.valueOf(iMo7578);
            }
        }
        if (numM54433 != null) {
            C3609 c3609M32848 = c13304.m32848(numM54433.intValue(), 2, -1);
            c12426.m30903(c3609M32848, c16923M6859);
            return c3609M32848;
        }
        throw new C10254("Resource not found: ?".concat(strSubstring), c16923M6859);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m54433(String str) {
        if (str.length() == 10 && str.regionMatches(true, 0, "0x", 0, 2)) {
            str = str.substring(2);
        }
        if (str.length() == 8 && C11730.m29453(str)) {
            return Integer.valueOf(C11730.m29456(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C3609 m54439(C13304 c13304, C12426 c12426, C2008 c2008) {
        int iM51624;
        int iM51623;
        StringBuilder sb = new StringBuilder();
        LinkedList linkedList = new LinkedList();
        m54437(c2008.m6858(), sb, linkedList);
        C3609 c3609M32849 = c13304.m32849(sb.toString(), linkedList.isEmpty() ? null : (C25042[]) linkedList.toArray(new C25042[0]), -1);
        if (!c3609M32849.mo16636() && !c3609M32849.mo16632() && !c3609M32849.mo16634()) {
            return c3609M32849;
        }
        ArrayList arrayListM6858 = c2008.m6858();
        if (arrayListM6858.isEmpty()) {
            iM51624 = c2008.m51623();
            iM51623 = iM51624;
        } else {
            iM51624 = ((AbstractC22891) arrayListM6858.get(0)).m51624();
            iM51623 = ((AbstractC22891) arrayListM6858.get(arrayListM6858.size() - 1)).m51623();
        }
        c12426.m30902(c3609M32849, iM51624, iM51623);
        return c3609M32849;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54437(ArrayList arrayList, StringBuilder sb, LinkedList linkedList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC22891 abstractC22891 = (AbstractC22891) it.next();
            if (!abstractC22891.mo6861()) {
                if (abstractC22891.mo6861()) {
                    throw new UnsupportedOperationException();
                }
                m54436(sb, ((C16923) abstractC22891).m39906());
            } else {
                C2008 c2008M51622 = abstractC22891.m51622();
                int length = sb.length();
                StringBuilder sb2 = new StringBuilder(c2008M51622.m6853());
                for (C5737 c5737 : c2008M51622.m6860()) {
                    sb2.append(';');
                    sb2.append(c5737.m16796());
                    sb2.append(a.h);
                    sb2.append(c5737.m16798());
                }
                m54437(c2008M51622.m6858(), sb, linkedList);
                linkedList.addFirst(new C25042(sb2.toString(), length, sb.length()));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54436(StringBuilder sb, String str) {
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

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C3609 m54443(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        int i;
        C16923 c16923M6859 = c2008.m6859();
        String strM39906 = c16923M6859.m39906();
        C5765 c5765 = new C5765();
        if (C11730.m29463(strM39906, c5765) && (i = c5765.f19814) == 4) {
            C3609 c3609M32848 = c13304.m32848(c5765.f19813, i, -1);
            c12426.m30903(c3609M32848, c16923M6859);
            return c3609M32848;
        }
        throw new C10254("Expected float value", c16923M6859);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C3609 m54445(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        int i;
        C16923 c16923M6859 = c2008.m6859();
        String strM39906 = c16923M6859.m39906();
        C5765 c5765 = new C5765();
        if (C11730.m29463(strM39906, c5765) && (i = c5765.f19814) == 5) {
            C3609 c3609M32848 = c13304.m32848(c5765.f19813, i, -1);
            c12426.m30903(c3609M32848, c16923M6859);
            return c3609M32848;
        }
        throw new C10254("Expected dimen value", c16923M6859);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C3609 m54442(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        int i;
        C16923 c16923M6859 = c2008.m6859();
        String strM39906 = c16923M6859.m39906();
        C5765 c5765 = new C5765();
        if (C11730.m29463(strM39906, c5765) && (i = c5765.f19814) == 6) {
            C3609 c3609M32848 = c13304.m32848(c5765.f19813, i, -1);
            c12426.m30903(c3609M32848, c16923M6859);
            return c3609M32848;
        }
        throw new C10254("Expected fraction value", c16923M6859);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C3609 m54441(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        C16923 c16923M6859 = c2008.m6859();
        String strM39906 = c16923M6859.m39906();
        C5765 c5765 = new C5765();
        if (C11730.m29458(strM39906, c5765)) {
            C3609 c3609M32848 = c13304.m32848(c5765.f19813, c5765.f19814, -1);
            c12426.m30903(c3609M32848, c16923M6859);
            return c3609M32848;
        }
        throw new C10254("Expected integer value", c16923M6859);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3609 m54444(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        C16923 c16923M6859 = c2008.m6859();
        String strM39906 = c16923M6859.m39906();
        if (strM39906.equals("true")) {
            C3609 c3609M32848 = c13304.m32848(1, 18, -1);
            c12426.m30903(c3609M32848, c16923M6859);
            return c3609M32848;
        }
        if (strM39906.equals("false")) {
            C3609 c3609M32849 = c13304.m32848(0, 18, -1);
            c12426.m30903(c3609M32849, c16923M6859);
            return c3609M32849;
        }
        throw new C10254("Expected bool value", c16923M6859);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C3609 m54440(C13304 c13304, C12426 c12426, C2008 c2008) throws C10254 {
        C16923 c16923M6859 = c2008.m6859();
        String strM39906 = c16923M6859.m39906();
        C5765 c5765 = new C5765();
        if (C11730.m29454(strM39906, c5765)) {
            C3609 c3609M32848 = c13304.m32848(c5765.f19813, c5765.f19814, -1);
            c12426.m30903(c3609M32848, c16923M6859);
            return c3609M32848;
        }
        throw new C10254("Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ".concat(strM39906), c16923M6859);
    }
}
