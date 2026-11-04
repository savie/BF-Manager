package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U75B */
/* JADX INFO: loaded from: classes2.dex */
public final class C4985 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15195(C13977 c13977, int i, int i2) {
        StringBuilder sbM27333 = C10732.m27333("stretch:\n  x: ");
        ArrayList arrayList = c13977.f44322;
        C24421 c24421 = c13977.f44324;
        C24421 c24422 = c13977.f44320;
        m15200(sbM27333, arrayList);
        sbM27333.append("\n  y: ");
        m15200(sbM27333, c13977.f44321);
        sbM27333.append("\n\n");
        C24421 c24423 = c13977.f44319;
        if (c24423 == null) {
            sbM27333.append("content: auto");
        } else {
            sbM27333.append("content:\n  x: ");
            m15201(sbM27333, c24423);
            sbM27333.append("\n  y: ");
            m15201(sbM27333, c13977.f44323);
        }
        sbM27333.append("\n\n");
        if (c24422.f79289 == 0 && c24422.f79288 == i && c24421.f79289 == 0 && c24421.f79288 == i2) {
            sbM27333.append("optical: full");
        } else {
            sbM27333.append("optical:\n  x: ");
            m15201(sbM27333, c24422);
            sbM27333.append("\n  y: ");
            m15201(sbM27333, c24421);
        }
        return sbM27333.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13977 m15197(int i, int i2, String str) {
        int i3;
        C24421 c24421M15198;
        String[] strArr;
        byte b;
        if (str == null || i <= 0 || i2 <= 0) {
            throw m15193();
        }
        boolean[] zArr = new boolean[3];
        String[] strArrSplit = str.replace("\r\n", "\n").replace('\r', '\n').split("\n", -1);
        String str2 = null;
        int i4 = 0;
        byte b2 = -1;
        String str3 = null;
        boolean z = false;
        String str4 = null;
        String str5 = null;
        boolean z2 = false;
        String str6 = null;
        String str7 = null;
        while (i4 < strArrSplit.length) {
            String strTrim = strArrSplit[i4].trim();
            if (strTrim.isEmpty()) {
                strArr = strArrSplit;
            } else {
                int iIndexOf = strTrim.indexOf(58);
                if (iIndexOf <= 0) {
                    throw m15194(i4 + 1);
                }
                strArr = strArrSplit;
                String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                String strTrim3 = strTrim.substring(iIndexOf + 1).trim();
                strTrim2.getClass();
                switch (strTrim2) {
                    case "stretch":
                        b = 0;
                        break;
                    case "optical":
                        b = 2;
                        break;
                    case "content":
                        b = 1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b != -1) {
                    if (zArr[b]) {
                        throw m15194(i4 + 1);
                    }
                    zArr[b] = true;
                    if (strTrim3.isEmpty()) {
                        b2 = b;
                    } else if (b == 1 && strTrim3.equals("auto")) {
                        b2 = -1;
                        z = true;
                    } else {
                        if (b != 2 || !strTrim3.equals("full")) {
                            throw m15194(i4 + 1);
                        }
                        b2 = -1;
                        z2 = true;
                    }
                } else {
                    if ((!strTrim2.equals("x") && !strTrim2.equals("y")) || strTrim3.isEmpty() || b2 == -1) {
                        throw m15194(i4 + 1);
                    }
                    boolean zEquals = strTrim2.equals("x");
                    int i5 = i4 + 1;
                    if (b2 == 0) {
                        if ((zEquals ? str2 : str3) != null) {
                            throw m15194(i5);
                        }
                        if (zEquals) {
                            str2 = strTrim3;
                        } else {
                            str3 = strTrim3;
                        }
                    } else if (b2 == 1) {
                        if ((zEquals ? str4 : str5) != null) {
                            throw m15194(i5);
                        }
                        if (zEquals) {
                            str4 = strTrim3;
                        } else {
                            str5 = strTrim3;
                        }
                    } else {
                        if ((zEquals ? str6 : str7) != null) {
                            throw m15194(i5);
                        }
                        if (zEquals) {
                            str6 = strTrim3;
                        } else {
                            str7 = strTrim3;
                        }
                    }
                }
            }
            i4++;
            strArrSplit = strArr;
        }
        if (zArr[0] && str2 != null && str3 != null && zArr[1] && ((z || (str4 != null && str5 != null)) && zArr[2] && (z2 || (str6 != null && str7 != null)))) {
            ArrayList arrayListM15202 = m15202(i, str2);
            ArrayList arrayListM15203 = m15202(i2, str3);
            C24421 c24421M15199 = z ? null : m15198(i, str4);
            C24421 c24421M151910 = z ? null : m15198(i2, str5);
            if (z2) {
                i3 = 0;
                c24421M15198 = new C24421(0, i);
            } else {
                i3 = 0;
                c24421M15198 = m15198(i, str6);
            }
            C24421 c24421 = c24421M15198;
            C24421 c24422 = z2 ? new C24421(i3, i2) : m15198(i2, str7);
            if (c24421M15199 != null && (c24421.f79289 > c24421M15199.f79289 || c24421.f79288 < c24421M15199.f79288 || c24422.f79289 > c24421M151910.f79289 || c24422.f79288 < c24421M151910.f79288)) {
                throw m15193();
            }
            if (arrayListM15202.size() * 2 > 127 || arrayListM15203.size() * 2 > 127) {
                throw m15193();
            }
            if (((long) m15192(arrayListM15202, i)) * ((long) m15192(arrayListM15203, i2)) <= 127) {
                return new C13977(arrayListM15202, arrayListM15203, c24421M15199, c24421M151910, c24421, c24422, i, i2);
            }
            throw m15193();
        }
        throw m15193();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15201(StringBuilder sb, C24421 c24421) {
        sb.append(c24421.f79289 + 1);
        sb.append('-');
        sb.append(c24421.f79288 + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15200(StringBuilder sb, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            sb.append("none");
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            m15201(sb, (C24421) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m15202(int i, String str) {
        if (str.equals("none")) {
            return new ArrayList();
        }
        String[] strArrSplit = str.split(",", -1);
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (str2.trim().isEmpty()) {
                throw m15193();
            }
            arrayList.add(m15198(i, str2));
        }
        return m15203(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24421 m15198(int i, String str) {
        int iIndexOf = str.indexOf(45);
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(45)) {
            throw m15193();
        }
        int iM15191 = m15191(str.substring(0, iIndexOf).trim());
        int iM15192 = m15191(str.substring(iIndexOf + 1).trim());
        if (iM15191 < 1 || iM15191 >= iM15192 || iM15192 > i + 1) {
            throw m15193();
        }
        return new C24421(iM15191 - 1, iM15192 - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15191(String str) {
        if (str.isEmpty()) {
            throw m15193();
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw m15193();
            }
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw m15193();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m15203(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24421 c24421 = (C24421) it.next();
            arrayList.add(c24421 == null ? null : new C24421(c24421.f79289, c24421.f79288));
        }
        Collections.sort(arrayList);
        int i = 0;
        while (i < arrayList.size() - 1) {
            C24421 c24422 = (C24421) arrayList.get(i);
            int i2 = i + 1;
            C24421 c24423 = (C24421) arrayList.get(i2);
            int i3 = c24423.f79289;
            int i4 = c24422.f79288;
            if (i3 <= i4) {
                c24422.f79288 = Math.max(i4, c24423.f79288);
                arrayList.remove(i2);
            } else {
                i = i2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24421 m15199(C24421 c24421) {
        if (c24421 == null) {
            return null;
        }
        return new C24421(c24421.f79289, c24421.f79288);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15192(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size() * 2;
        int i2 = size - 1;
        if (((C24421) arrayList.get(0)).f79289 <= 0) {
            size = i2;
        }
        return ((C24421) j$$ExternalSyntheticOutline0.m(arrayList, 1)).f79288 < i ? size + 1 : size;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m15193() {
        return new IllegalArgumentException("Invalid nine-patch region text");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m15194(int i) {
        return new IllegalArgumentException(C13645.m33382(i, "Invalid nine-patch region text at line "));
    }
}
