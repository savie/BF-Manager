package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫ܽ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes4.dex */
public final class C12529 extends C4642 {
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static CharSequence m31133(String str) {
        C13465.m32966(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM26318 = C10413.m26318(str.charAt(!z ? i : length));
            if (z) {
                if (!zM26318) {
                    break;
                }
                length--;
            } else if (zM26318) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31136(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C13465.m32966(charSequence, "<this>");
        C13465.m32966(charSequence2, "other");
        if (!(charSequence2 instanceof String)) {
            if (C3355.m10012(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
                return true;
            }
        } else if (C3355.m10013(2, charSequence, (String) charSequence2, z) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static List m31142(String str) {
        C13465.m32966(str, "<this>");
        C20290 c20290 = new C20290(str);
        if (c20290.hasNext()) {
            Object next = c20290.next();
            if (!c20290.hasNext()) {
                return C4892.m13617(next);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(next);
            while (c20290.hasNext()) {
                arrayList.add(c20290.next());
            }
            return arrayList;
        }
        return C23238.f75405;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m31145(CharSequence charSequence) {
        C13465.m32966(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!C10413.m26318(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31138(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31134(String str, String str2, String str3) {
        C13465.m32966(str, "<this>");
        int iM10009 = C3355.m10009(0, str, str2, false);
        if (iM10009 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM10009);
            sb.append(str3);
            i2 = iM10009 + length;
            if (iM10009 >= str.length()) {
                break;
            }
            iM10009 = C3355.m10009(iM10009 + i, str, str2, false);
        } while (iM10009 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        C13465.m32967(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m31146(String str, String str2) {
        C13465.m32966(str, "<this>");
        return str.startsWith(str2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m31141(String str, String str2) {
        C13465.m32966(str2, "delimiter");
        int iM10013 = C3355.m10013(6, str, str2, false);
        if (iM10013 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iM10013, str.length());
        C13465.m32967(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31139(String str, String str2, boolean z) {
        C13465.m32966(str, "<this>");
        C13465.m32966(str2, "suffix");
        return !z ? str.endsWith(str2) : C1944.m6305(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m31140(String str) {
        List listM13617;
        int length;
        Comparable comparable;
        String strSubstring;
        C13465.m32966(str, "<this>");
        C20290 c20290 = new C20290(str);
        if (c20290.hasNext()) {
            Object next = c20290.next();
            if (c20290.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c20290.hasNext()) {
                    arrayList.add(c20290.next());
                }
                listM13617 = arrayList;
            } else {
                listM13617 = C4892.m13617(next);
            }
        } else {
            listM13617 = C23238.f75405;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM13617) {
            if (!m31145((CharSequence) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C4892.m13614((Iterable) arrayList2));
        Iterator it = arrayList2.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!C10413.m26318(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM13617.size();
        int iM13615 = C4892.m13615(listM13617);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listM13617) {
            int i = length + 1;
            if (length < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iM13615) && m31145((CharSequence) str3)) {
                strSubstring = null;
            } else {
                C13465.m32966(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(C2271.m6966(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                C13465.m32967(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList4.add(strSubstring);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        C4186.m11836(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m31143(CharSequence charSequence) {
        C13465.m32966(charSequence, "<this>");
        return charSequence.length() > 0 && C10413.m26319(charSequence.charAt(0), '\t', false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31137(String str) {
        C13465.m32966(str, "<this>");
        return str.length() > 0 && C10413.m26319(str.charAt(C3355.m10010(str)), '/', false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m31144(String str) {
        return str.lastIndexOf(46, C3355.m10010(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m31135(String str, char[] cArr) {
        if (cArr.length == 1) {
            String strValueOf = String.valueOf(cArr[0]);
            int iM10009 = C3355.m10009(0, str, strValueOf, false);
            if (iM10009 == -1) {
                return C4892.m13617(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int length = 0;
            do {
                arrayList.add(str.subSequence(length, iM10009).toString());
                length = strValueOf.length() + iM10009;
                iM10009 = C3355.m10009(length, str, strValueOf, false);
            } while (iM10009 != -1);
            arrayList.add(str.subSequence(length, str.length()).toString());
            return arrayList;
        }
        C8296<C16287> c8296 = new C8296(new C16057(str, new C9707(cArr)));
        ArrayList arrayList2 = new ArrayList(C4892.m13614((Iterable) c8296));
        for (C16287 c16287 : c8296) {
            C13465.m32966(c16287, "range");
            arrayList2.add(str.subSequence(c16287.getFirst(), c16287.getLast() + 1).toString());
        }
        return arrayList2;
    }
}
