package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֡ۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5Z7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0122 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1262(String str) {
        return m1263(C3105.m10130(str)).m10138();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3105 m1263(C3105 c3105) {
        switch (c3105.m10140()) {
            case 9:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < c3105.m10141(); i++) {
                    sb.append('[');
                }
                sb.append(m1263(c3105.m10139()).m10138());
                return C3105.m10130(sb.toString());
            case 10:
                String strM10142 = c3105.m10142();
                return strM10142 != null ? C3105.m10134(strM10142) : c3105;
            case 11:
                return C3105.m10136(m1266(c3105.m10138()));
            default:
                return c3105;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m1265(String str) {
        if (str == null) {
            return null;
        }
        return m1263(C3105.m10134(str)).m10142();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] m1264(String[] strArr) {
        String[] strArr2 = null;
        for (int i = 0; i < strArr.length; i++) {
            String strM1265 = m1265(strArr[i]);
            if (strM1265 != null) {
                if (strArr2 == null) {
                    strArr2 = (String[]) strArr.clone();
                }
                strArr2[i] = strM1265;
            }
        }
        return strArr2 != null ? strArr2 : strArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m1266(String str) {
        if ("()V".equals(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        for (C3105 c3105 : C3105.m10135(str)) {
            sb.append(m1263(c3105).m10138());
        }
        C3105 c3105M10133 = C3105.m10133(str);
        if (c3105M10133 == C3105.f10049) {
            sb.append(")V");
        } else {
            sb.append(')');
            sb.append(m1263(c3105M10133).m10138());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m1261(Object obj) {
        String strM14405;
        if (obj instanceof C3105) {
            return m1263((C3105) obj);
        }
        if (obj instanceof C4597) {
            C4597 c4597 = (C4597) obj;
            i = c4597.m14406() <= 4 ? 1 : 0;
            int iM14406 = c4597.m14406();
            String strM1265 = m1265(c4597.m14403());
            if (i != 0) {
                strM14405 = c4597.m14405();
            } else {
                strM14405 = c4597.m14405();
            }
            String str = strM14405;
            String strM14402 = c4597.m14402();
            return new C4597(iM14406, strM1265, str, i != 0 ? m1262(strM14402) : m1266(strM14402), c4597.m14404());
        }
        if (!(obj instanceof C18963)) {
            return obj;
        }
        C18963 c18963 = (C18963) obj;
        String strM44050 = c18963.m44050();
        String strM44053 = c18963.m44053();
        C4597 c4597M44048 = c18963.m44048();
        int iM44051 = c18963.m44051();
        Object[] objArr = new Object[iM44051];
        Object[] objArr2 = new Object[iM44051];
        for (int i = 0; i < iM44051; i++) {
            Object objM44047 = c18963.m44047(i);
            objArr[i] = objM44047;
            objArr2[i] = m1261(objM44047);
        }
        return new C18963(strM44050, m1262(strM44053), (C4597) m1261(c4597M44048), objArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m1267(String str, boolean z) {
        if (str == null) {
            return null;
        }
        C18767 c18767 = new C18767(str);
        C0868 c0868 = new C0868();
        C7580 c7580 = new C7580(c0868, this);
        if (z) {
            c18767.m43563(c7580);
        } else {
            c18767.m43562(c7580);
        }
        return c0868.toString();
    }
}
