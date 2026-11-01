package l;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: l.᩺۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C22851 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Method f74339;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Class f74340;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f74341;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Method f74342;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Class f74343;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50576(char c, CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m50582(AbstractC20745 abstractC20745, String str) {
        AbstractC20745 abstractC20746;
        String strSubstring;
        String strConcat;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Relative path can not be empty.");
        }
        if (str.startsWith("/") || str.endsWith("/")) {
            throw new IllegalArgumentException("Relative path can not start or end with '/': ".concat(str));
        }
        int iLastIndexOf = str.lastIndexOf(47);
        int i = -1;
        if (iLastIndexOf != -1) {
            String strSubstring2 = str.substring(0, iLastIndexOf);
            if (strSubstring2 != null && !strSubstring2.isEmpty()) {
                if (strSubstring2.startsWith("/") || strSubstring2.endsWith("/")) {
                    throw new IllegalArgumentException("Relative path can not start or end with '/': ".concat(strSubstring2));
                }
                if (abstractC20745.mo33975()) {
                    int iIndexOf = strSubstring2.indexOf(47);
                    int i2 = -1;
                    while (iIndexOf != -1) {
                        AbstractC20745 abstractC20745M50581 = m50581(strSubstring2.substring(i2 + 1, iIndexOf), abstractC20745.mo33983(true));
                        if (abstractC20745M50581 == null) {
                            break;
                        }
                        i2 = iIndexOf;
                        iIndexOf = strSubstring2.indexOf(47, iIndexOf + 1);
                        abstractC20745 = abstractC20745M50581;
                    }
                    String strSubstring3 = strSubstring2.substring(i2 + 1);
                    int iIndexOf2 = strSubstring3.indexOf(47);
                    if (iIndexOf2 == -1) {
                        AbstractC20745 abstractC20745M50582 = m50581(strSubstring3, abstractC20745.mo33983(true));
                        if (abstractC20745M50582 == null) {
                            abstractC20745M50582 = abstractC20745.m46690(strSubstring3);
                            while (abstractC20745M50582.mo33975()) {
                                StringBuilder sbM8976 = C3012.m8976(strSubstring3, "-");
                                iIndexOf2++;
                                sbM8976.append(iIndexOf2);
                                abstractC20745M50582 = abstractC20745.m46690(sbM8976.toString());
                            }
                        }
                        abstractC20745 = abstractC20745M50582;
                    } else {
                        String strSubstring4 = strSubstring3.substring(0, iIndexOf2);
                        String strSubstring5 = strSubstring3.substring(iIndexOf2 + 1);
                        AbstractC20745 abstractC20745M50583 = m50581(strSubstring4, abstractC20745.mo33983(true));
                        if (abstractC20745M50583 == null) {
                            abstractC20745M50583 = abstractC20745.m46690(strSubstring4);
                            int i3 = -1;
                            while (abstractC20745M50583.mo33975()) {
                                StringBuilder sbM8977 = C3012.m8976(strSubstring4, "-");
                                i3++;
                                sbM8977.append(i3);
                                abstractC20745M50583 = abstractC20745.m46690(sbM8977.toString());
                            }
                        }
                        abstractC20745 = abstractC20745M50583.m46690(strSubstring5);
                    }
                } else {
                    abstractC20745 = abstractC20745.m46690(strSubstring2);
                }
            }
            str = str.substring(iLastIndexOf + 1);
        }
        Iterator it = abstractC20745.mo33983(true).iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractC20746 = null;
                break;
            }
            abstractC20746 = (AbstractC20745) it.next();
            if (abstractC20746.mo33971()) {
                String name = abstractC20746.getName();
                if (!name.equals(str)) {
                    int iLastIndexOf2 = name.lastIndexOf(46);
                    if (iLastIndexOf2 > 0) {
                        int iLastIndexOf3 = name.lastIndexOf(46, iLastIndexOf2 - 1);
                        if (iLastIndexOf3 == -1) {
                            if (m50586(iLastIndexOf2 + 1, name.length(), name) && name.substring(0, iLastIndexOf2).equals(str)) {
                                break;
                            }
                        } else if (m50586(iLastIndexOf3 + 1, iLastIndexOf2, name)) {
                            if ((name.substring(0, iLastIndexOf3) + name.substring(iLastIndexOf2)).equals(str)) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            }
        }
        if (abstractC20746 != null) {
            return abstractC20746;
        }
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(str);
        int iLastIndexOf4 = str.lastIndexOf(46);
        if (iLastIndexOf4 == -1) {
            strConcat = str.concat(".");
            strSubstring = "";
        } else {
            String strSubstring6 = str.substring(0, iLastIndexOf4 + 1);
            strSubstring = str.substring(iLastIndexOf4);
            strConcat = strSubstring6;
        }
        while (abstractC20745M46690.mo33975()) {
            StringBuilder sbM23356 = C9023.m23356(strConcat);
            i++;
            sbM23356.append(i);
            sbM23356.append(strSubstring);
            abstractC20745M46690 = abstractC20745.m46690(sbM23356.toString());
        }
        return abstractC20745M46690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50583(Context context, C15796 c15796) {
        try {
            c15796.getClass();
            if (C1931.m6267(context, "101492915").m6274("Common_ta_enable")) {
                f74339.invoke(f74340, Boolean.TRUE);
            } else {
                f74339.invoke(f74340, Boolean.FALSE);
            }
        } catch (Exception e) {
            C23099.m51115("OpenConfig", "checkStatStatus exception: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m50588(String str) {
        char cCharAt;
        if (str != null && !str.isEmpty()) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 < '@') {
                    if (((1 << cCharAt2) & 4294957567L) != 0) {
                        return true;
                    }
                } else if (cCharAt2 < 128) {
                    if (cCharAt2 == 127) {
                        return true;
                    }
                } else if (cCharAt2 < 8203 || cCharAt2 > 8303) {
                    if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                        if ((cCharAt2 >= 57344 && cCharAt2 <= 63743) || cCharAt2 == 65533 || cCharAt2 == 65279) {
                            return true;
                        }
                    } else if (cCharAt2 > 56319 || (i = i + 1) >= length || (cCharAt = str.charAt(i)) < 56320 || cCharAt > 57343 || Character.toCodePoint(cCharAt2, cCharAt) >= 983040) {
                        return true;
                    }
                } else if (cCharAt2 <= 8207 || ((cCharAt2 >= 8232 && cCharAt2 <= 8239) || cCharAt2 >= 8288)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m50592(Context context, C15796 c15796) {
        try {
            f74340 = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            f74343 = cls;
            f74342 = cls.getMethod("reportQQ", Context.class, String.class);
            f74343.getMethod("trackCustomEvent", Context.class, String.class, String[].class);
            Class cls2 = f74343;
            Class<?> cls3 = Integer.TYPE;
            cls2.getMethod("commitEvents", Context.class, cls3);
            Class cls4 = f74340;
            Class<?> cls5 = Boolean.TYPE;
            f74339 = cls4.getMethod("setEnableStatService", cls5);
            m50583(context, c15796);
            f74340.getMethod("setAutoExceptionCaught", cls5).invoke(f74340, Boolean.FALSE);
            f74340.getMethod("setEnableSmartReporting", cls5).invoke(f74340, Boolean.TRUE);
            f74340.getMethod("setSendPeriodMinutes", cls3).invoke(f74340, 1440);
            Class<?> cls6 = Class.forName("com.tencent.stat.StatReportStrategy");
            f74340.getMethod("setStatSendStrategy", cls6).invoke(f74340, cls6.getField("PERIOD").get(null));
            f74343.getMethod("startStatService", Context.class, String.class, String.class).invoke(f74343, context, "Aqc101492915", Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null));
            f74341 = true;
        } catch (Exception e) {
            C23099.m51115("OpenConfig", "start4QQConnect exception: " + e.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50585(int i) {
        switch (Character.getType(i)) {
            default:
                if (i != 36 && i != 43 && i != 94 && i != 96 && i != 124 && i != 126) {
                    switch (i) {
                        case 60:
                        case 61:
                        case 62:
                            break;
                        default:
                            return false;
                    }
                }
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return true;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m50591(C7807 c7807) {
        Iterator it;
        C16322 c16322;
        Iterator it2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = c7807.getMethods().iterator();
        while (it3.hasNext()) {
            InterfaceC18528 interfaceC18528 = (InterfaceC18528) it3.next();
            String strM50579 = m50579(interfaceC18528);
            InterfaceC7945 interfaceC7945Mo25747 = interfaceC18528.mo25747();
            if (interfaceC7945Mo25747 == null) {
                c16322 = new C16322(0, 0, 0, 0, new ArrayList(), new ArrayList());
                it = it3;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (InterfaceC1594 interfaceC1594 : interfaceC7945Mo25747.mo11508()) {
                    i++;
                    EnumC10297 enumC10297Mo5435 = interfaceC1594.mo5435();
                    InterfaceC13859 interfaceC13859 = interfaceC1594 instanceof InterfaceC13859 ? (InterfaceC13859) interfaceC1594 : null;
                    InterfaceC7446 reference = interfaceC13859 != null ? interfaceC13859.getReference() : null;
                    if (interfaceC13859 != null && enumC10297Mo5435.f35329 == 0 && (reference instanceof InterfaceC20852)) {
                        i2++;
                        String string = ((InterfaceC20852) reference).getString();
                        if (linkedHashSet.size() < 5 && string != null && !string.isEmpty() && string.codePointCount(0, string.length()) <= 80) {
                            int iCharCount = 0;
                            while (true) {
                                if (iCharCount >= string.length()) {
                                    it2 = it3;
                                    linkedHashSet.add(string);
                                    break;
                                }
                                int iCodePointAt = string.codePointAt(iCharCount);
                                it2 = it3;
                                if (iCodePointAt == 10 || iCodePointAt == 13 || Character.isISOControl(iCodePointAt)) {
                                    break;
                                }
                                iCharCount += Character.charCount(iCodePointAt);
                                it3 = it2;
                            }
                        } else {
                            it2 = it3;
                        }
                    } else {
                        it2 = it3;
                        if (interfaceC13859 != null && enumC10297Mo5435.f35329 == 2 && (reference instanceof InterfaceC18735)) {
                            InterfaceC18735 interfaceC18735 = (InterfaceC18735) reference;
                            if ("I".equals(interfaceC18735.getType())) {
                                String strMo1183 = interfaceC18735.mo1183();
                                if (strMo1183.contains("/R$") || strMo1183.startsWith("LR$")) {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (interfaceC1594 instanceof InterfaceC6802) {
                        long jMo4062 = ((InterfaceC6802) interfaceC1594).mo4062();
                        if (jMo4062 >= 0 && jMo4062 <= 4294967295L) {
                            int i5 = (int) jMo4062;
                            int i6 = (i5 >>> 24) & 255;
                            int i7 = (i5 >>> 16) & 255;
                            if ((i6 == 127 || i6 == 1) && i7 != 0) {
                                i3++;
                            }
                        }
                    }
                    if (enumC10297Mo5435.f35326.startsWith("invoke-")) {
                        i4++;
                        if (reference instanceof InterfaceC8858) {
                            InterfaceC8858 interfaceC8858 = (InterfaceC8858) reference;
                            if (linkedHashSet2.size() < 5) {
                                linkedHashSet2.add(interfaceC8858.mo9700() + "->" + interfaceC8858.getName());
                            }
                        }
                    }
                    it3 = it2;
                }
                it = it3;
                c16322 = new C16322(i, i2, i3, i4, linkedHashSet, linkedHashSet2);
            }
            linkedHashMap.put(strM50579, c16322);
            it3 = it;
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m50580(C7807 c7807) {
        InterfaceC10975 interfaceC10975Mo28399;
        C15617 c15617;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC17822 interfaceC17822 : c7807.getFields()) {
            int iMo28400 = interfaceC17822.mo28400();
            if (EnumC15236.STATIC.m36501(iMo28400) && EnumC15236.FINAL.m36501(iMo28400) && (interfaceC10975Mo28399 = interfaceC17822.mo28399()) != null) {
                C14795 c14795 = new C14795();
                try {
                    AbstractC14387.m34621(new C12283(new C2093(c14795)), interfaceC10975Mo28399);
                    String string = c14795.toString();
                    boolean z = string.codePointCount(0, string.length()) > 240;
                    if (z) {
                        string = C7521.m20035(0, string.length(), 240, string);
                    }
                    c15617 = new C15617(string, z);
                } catch (IOException unused) {
                    c15617 = null;
                }
                if (c15617 != null) {
                    linkedHashMap.put(interfaceC17822.getName() + ":" + interfaceC17822.getType(), c15617);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50584(InterfaceC15785 interfaceC15785) {
        if (interfaceC15785 != null) {
            try {
                interfaceC15785.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m50581(String str, List list) {
        int iLastIndexOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC20745 abstractC20745 = (AbstractC20745) it.next();
            if (abstractC20745.mo33974()) {
                String name = abstractC20745.getName();
                if (name.equals(str) || ((iLastIndexOf = name.lastIndexOf(45)) != -1 && m50586(iLastIndexOf + 1, name.length(), name) && name.substring(0, iLastIndexOf).equals(str))) {
                    return abstractC20745;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m50587(Context context, C15796 c15796) {
        if (!TextUtils.isEmpty(c15796.m37570())) {
            C3487 c3487M10219 = C3487.m10219();
            String strM37570 = c15796.m37570();
            c3487M10219.getClass();
            C3487.m10221(strM37570, "101492915", "11", "0");
        }
        if (f74341) {
            m50583(context, c15796);
            if (c15796.m37570() != null) {
                try {
                    f74342.invoke(f74343, context, c15796.m37570());
                } catch (Exception e) {
                    C23099.m51115("OpenConfig", "reportQQ exception: " + e.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m50593(int i) {
        return i == 9 || i == 10 || i == 12 || i == 13 || i == 32 || Character.getType(i) == 12;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50577(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m50589(int i, int i2, CharSequence charSequence) {
        while (i >= i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50586(int i, int i2, String str) {
        if (i >= i2) {
            return false;
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50579(InterfaceC18528 interfaceC18528) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC18528.getParameters().iterator();
        while (it.hasNext()) {
            sb.append(((InterfaceC19234) it.next()).getType());
        }
        return interfaceC18528.getName() + MotionUtils.EASING_TYPE_FORMAT_START + ((Object) sb) + MotionUtils.EASING_TYPE_FORMAT_END + interfaceC18528.mo9698();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m50590(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return str;
        }
        int iLastIndexOf2 = str.lastIndexOf(46, iLastIndexOf - 1);
        if (iLastIndexOf2 == -1) {
            return m50586(iLastIndexOf + 1, str.length(), str) ? str.substring(0, iLastIndexOf) : str;
        }
        if (!m50586(iLastIndexOf2 + 1, iLastIndexOf, str)) {
            return str;
        }
        return str.substring(0, iLastIndexOf2) + str.substring(iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50578(String str) {
        int iLastIndexOf = str.lastIndexOf(45);
        return (iLastIndexOf == -1 || !m50586(iLastIndexOf + 1, str.length(), str)) ? str : str.substring(0, iLastIndexOf);
    }
}
