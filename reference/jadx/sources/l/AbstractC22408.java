package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩹ܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5Z7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22408 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49687(String str) {
        return m49688(C14172.m34263(str)).m34268();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14172 m49688(C14172 c14172) {
        switch (c14172.m34269()) {
            case 9:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < c14172.m34271(); i++) {
                    sb.append('[');
                }
                sb.append(m49688(c14172.m34270()).m34268());
                return C14172.m34263(sb.toString());
            case 10:
                String strM34266 = c14172.m34266();
                return strM34266 != null ? C14172.m34261(strM34266) : c14172;
            case 11:
                return C14172.m34258(m49691(c14172.m34268()));
            default:
                return c14172;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m49690(String str) {
        if (str == null) {
            return null;
        }
        return m49688(C14172.m34261(str)).m34266();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] m49689(String[] strArr) {
        String[] strArr2 = null;
        for (int i = 0; i < strArr.length; i++) {
            String strM49690 = m49690(strArr[i]);
            if (strM49690 != null) {
                if (strArr2 == null) {
                    strArr2 = (String[]) strArr.clone();
                }
                strArr2[i] = strM49690;
            }
        }
        return strArr2 != null ? strArr2 : strArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m49691(String str) {
        if ("()V".equals(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        for (C14172 c14172 : C14172.m34264(str)) {
            sb.append(m49688(c14172).m34268());
        }
        C14172 c14172M34265 = C14172.m34265(str);
        if (c14172M34265 == C14172.f46513) {
            sb.append(")V");
        } else {
            sb.append(')');
            sb.append(m49688(c14172M34265).m34268());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m49686(Object obj) {
        String strM43914;
        if (obj instanceof C14172) {
            return m49688((C14172) obj);
        }
        if (obj instanceof C19110) {
            C19110 c19110 = (C19110) obj;
            i = c19110.m43910() <= 4 ? 1 : 0;
            int iM43910 = c19110.m43910();
            String strM49690 = m49690(c19110.m43913());
            if (i != 0) {
                strM43914 = c19110.m43914();
            } else {
                strM43914 = c19110.m43914();
            }
            String str = strM43914;
            String strM43911 = c19110.m43911();
            return new C19110(iM43910, strM49690, str, i != 0 ? m49687(strM43911) : m49691(strM43911), c19110.m43912());
        }
        if (!(obj instanceof C3586)) {
            return obj;
        }
        C3586 c3586 = (C3586) obj;
        String strM10601 = c3586.m10601();
        String strM10598 = c3586.m10598();
        C19110 c19110M10600 = c3586.m10600();
        int iM10603 = c3586.m10603();
        Object[] objArr = new Object[iM10603];
        Object[] objArr2 = new Object[iM10603];
        for (int i = 0; i < iM10603; i++) {
            Object objM10599 = c3586.m10599(i);
            objArr[i] = objM10599;
            objArr2[i] = m49686(objM10599);
        }
        return new C3586(strM10601, m49687(strM10598), (C19110) m49686(c19110M10600), objArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m49692(String str, boolean z) {
        if (str == null) {
            return null;
        }
        C13236 c13236 = new C13236(str);
        C6885 c6885 = new C6885();
        C1240 c1240 = new C1240(c6885, this);
        if (z) {
            c13236.m32718(c1240);
        } else {
            c13236.m32717(c1240);
        }
        return c6885.toString();
    }
}
