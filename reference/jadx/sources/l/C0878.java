package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֨ۖ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C0878 extends C22681 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3576(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C15243.m36590(charSequence, "<this>");
        C15243.m36590(charSequence2, "other");
        if (!(charSequence2 instanceof String)) {
            if (C10746.m27409(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
                return true;
            }
        } else if (C10746.m27410(2, charSequence, (String) charSequence2, z) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static List m3581(String str) {
        C15243.m36590(str, "<this>");
        C7590 c7590 = new C7590(str);
        if (c7590.hasNext()) {
            Object next = c7590.next();
            if (!c7590.hasNext()) {
                return C7743.m21087(next);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(next);
            while (c7590.hasNext()) {
                arrayList.add(c7590.next());
            }
            return arrayList;
        }
        return C22242.f71645;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m3584(CharSequence charSequence) {
        C15243.m36590(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!C14301.m34742(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static CharSequence m3586(String str) {
        C15243.m36590(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM34742 = C14301.m34742(str.charAt(!z ? i : length));
            if (z) {
                if (!zM34742) {
                    break;
                }
                length--;
            } else if (zM34742) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3578(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m3573(String str, String str2, String str3) {
        C15243.m36590(str, "<this>");
        int iM27407 = C10746.m27407(0, str, str2, false);
        if (iM27407 < 0) {
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
            sb.append((CharSequence) str, i2, iM27407);
            sb.append(str3);
            i2 = iM27407 + length;
            if (iM27407 >= str.length()) {
                break;
            }
            iM27407 = C10746.m27407(iM27407 + i, str, str2, false);
        } while (iM27407 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        C15243.m36591(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static char m3571(StringBuilder sb) {
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return sb.charAt(C10746.m27408(sb));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m3572(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(C14442.m34864(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            throw new IllegalArgumentException(C14442.m34864(length, "Requested character count ", " is less than zero.").toString());
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        String strSubstring = str.substring(0, length);
        C15243.m36591(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m3585(String str, String str2) {
        C15243.m36590(str, "<this>");
        return str.startsWith(str2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m3580(String str, String str2) {
        C15243.m36590(str2, "delimiter");
        int iM27410 = C10746.m27410(6, str, str2, false);
        if (iM27410 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iM27410, str.length());
        C15243.m36591(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3579(String str, String str2, boolean z) {
        C15243.m36590(str, "<this>");
        C15243.m36590(str2, "suffix");
        return !z ? str.endsWith(str2) : C4781.m14757(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m3582(String str) {
        List listM21087;
        int length;
        Comparable comparable;
        String strSubstring;
        C15243.m36590(str, "<this>");
        C7590 c7590 = new C7590(str);
        if (c7590.hasNext()) {
            Object next = c7590.next();
            if (c7590.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c7590.hasNext()) {
                    arrayList.add(c7590.next());
                }
                listM21087 = arrayList;
            } else {
                listM21087 = C7743.m21087(next);
            }
        } else {
            listM21087 = C22242.f71645;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM21087) {
            if (!m3584((CharSequence) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C7743.m21084((Iterable) arrayList2));
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
                if (!C14301.m34742(str2.charAt(length))) {
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
        listM21087.size();
        int iM21085 = C7743.m21085(listM21087);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listM21087) {
            int i = length + 1;
            if (length < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iM21085) && m3584((CharSequence) str3)) {
                strSubstring = null;
            } else {
                C15243.m36590(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(C14442.m34864(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                C15243.m36591(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList4.add(strSubstring);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        C13708.m33503(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3575(CharSequence charSequence, char c) {
        C15243.m36590(charSequence, "<this>");
        return charSequence.length() > 0 && C14301.m34743(charSequence.charAt(0), c, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3577(String str) {
        C15243.m36590(str, "<this>");
        return str.length() > 0 && C14301.m34743(str.charAt(C10746.m27408(str)), '/', false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m3583(String str) {
        return str.lastIndexOf(46, C10746.m27408(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m3574(String str, char[] cArr) {
        if (cArr.length == 1) {
            String strValueOf = String.valueOf(cArr[0]);
            int iM27407 = C10746.m27407(0, str, strValueOf, false);
            if (iM27407 == -1) {
                return C7743.m21087(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int length = 0;
            do {
                arrayList.add(str.subSequence(length, iM27407).toString());
                length = strValueOf.length() + iM27407;
                iM27407 = C10746.m27407(length, str, strValueOf, false);
            } while (iM27407 != -1);
            arrayList.add(str.subSequence(length, str.length()).toString());
            return arrayList;
        }
        C6099<C1074> c6099 = new C6099(new C0132(str, new C21935(cArr)));
        ArrayList arrayList2 = new ArrayList(C7743.m21084((Iterable) c6099));
        for (C1074 c1074 : c6099) {
            C15243.m36590(c1074, "range");
            arrayList2.add(str.subSequence(c1074.getFirst(), c1074.getLast() + 1).toString());
        }
        return arrayList2;
    }
}
