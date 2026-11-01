package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U75B */
/* JADX INFO: loaded from: classes2.dex */
public final class C2293 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7011(C11467 c11467, int i, int i2) {
        StringBuilder sbM23356 = C9023.m23356("stretch:\n  x: ");
        ArrayList arrayList = c11467.f38607;
        C16373 c16373 = c11467.f38605;
        C16373 c16374 = c11467.f38608;
        m7016(sbM23356, arrayList);
        sbM23356.append("\n  y: ");
        m7016(sbM23356, c11467.f38610);
        sbM23356.append("\n\n");
        C16373 c16375 = c11467.f38606;
        if (c16375 == null) {
            sbM23356.append("content: auto");
        } else {
            sbM23356.append("content:\n  x: ");
            m7017(sbM23356, c16375);
            sbM23356.append("\n  y: ");
            m7017(sbM23356, c11467.f38609);
        }
        sbM23356.append("\n\n");
        if (c16374.f52692 == 0 && c16374.f52691 == i && c16373.f52692 == 0 && c16373.f52691 == i2) {
            sbM23356.append("optical: full");
        } else {
            sbM23356.append("optical:\n  x: ");
            m7017(sbM23356, c16374);
            sbM23356.append("\n  y: ");
            m7017(sbM23356, c16373);
        }
        return sbM23356.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11467 m7013(int i, int i2, String str) {
        int i3;
        C16373 c16373M7014;
        String[] strArr;
        byte b;
        if (str == null || i <= 0 || i2 <= 0) {
            throw m7009();
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
                    throw m7010(i4 + 1);
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
                        throw m7010(i4 + 1);
                    }
                    zArr[b] = true;
                    if (strTrim3.isEmpty()) {
                        b2 = b;
                    } else if (b == 1 && strTrim3.equals("auto")) {
                        b2 = -1;
                        z = true;
                    } else {
                        if (b != 2 || !strTrim3.equals("full")) {
                            throw m7010(i4 + 1);
                        }
                        b2 = -1;
                        z2 = true;
                    }
                } else {
                    if ((!strTrim2.equals("x") && !strTrim2.equals("y")) || strTrim3.isEmpty() || b2 == -1) {
                        throw m7010(i4 + 1);
                    }
                    boolean zEquals = strTrim2.equals("x");
                    int i5 = i4 + 1;
                    if (b2 == 0) {
                        if ((zEquals ? str2 : str3) != null) {
                            throw m7010(i5);
                        }
                        if (zEquals) {
                            str2 = strTrim3;
                        } else {
                            str3 = strTrim3;
                        }
                    } else if (b2 == 1) {
                        if ((zEquals ? str4 : str5) != null) {
                            throw m7010(i5);
                        }
                        if (zEquals) {
                            str4 = strTrim3;
                        } else {
                            str5 = strTrim3;
                        }
                    } else {
                        if ((zEquals ? str6 : str7) != null) {
                            throw m7010(i5);
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
            ArrayList arrayListM7018 = m7018(i, str2);
            ArrayList arrayListM7019 = m7018(i2, str3);
            C16373 c16373M7015 = z ? null : m7014(i, str4);
            C16373 c16373M7016 = z ? null : m7014(i2, str5);
            if (z2) {
                i3 = 0;
                c16373M7014 = new C16373(0, i);
            } else {
                i3 = 0;
                c16373M7014 = m7014(i, str6);
            }
            C16373 c16373 = c16373M7014;
            C16373 c16374 = z2 ? new C16373(i3, i2) : m7014(i2, str7);
            if (c16373M7015 != null && (c16373.f52692 > c16373M7015.f52692 || c16373.f52691 < c16373M7015.f52691 || c16374.f52692 > c16373M7016.f52692 || c16374.f52691 < c16373M7016.f52691)) {
                throw m7009();
            }
            if (arrayListM7018.size() * 2 > 127 || arrayListM7019.size() * 2 > 127) {
                throw m7009();
            }
            if (((long) m7008(arrayListM7018, i)) * ((long) m7008(arrayListM7019, i2)) <= 127) {
                return new C11467(arrayListM7018, arrayListM7019, c16373M7015, c16373M7016, c16373, c16374, i, i2);
            }
            throw m7009();
        }
        throw m7009();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7017(StringBuilder sb, C16373 c16373) {
        sb.append(c16373.f52692 + 1);
        sb.append('-');
        sb.append(c16373.f52691 + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7016(StringBuilder sb, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            sb.append("none");
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            m7017(sb, (C16373) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7018(int i, String str) {
        if (str.equals("none")) {
            return new ArrayList();
        }
        String[] strArrSplit = str.split(",", -1);
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (str2.trim().isEmpty()) {
                throw m7009();
            }
            arrayList.add(m7014(i, str2));
        }
        return m7019(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16373 m7014(int i, String str) {
        int iIndexOf = str.indexOf(45);
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(45)) {
            throw m7009();
        }
        int iM7007 = m7007(str.substring(0, iIndexOf).trim());
        int iM7008 = m7007(str.substring(iIndexOf + 1).trim());
        if (iM7007 < 1 || iM7007 >= iM7008 || iM7008 > i + 1) {
            throw m7009();
        }
        return new C16373(iM7007 - 1, iM7008 - 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m7007(String str) {
        if (str.isEmpty()) {
            throw m7009();
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw m7009();
            }
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw m7009();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7019(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16373 c16373 = (C16373) it.next();
            arrayList.add(c16373 == null ? null : new C16373(c16373.f52692, c16373.f52691));
        }
        Collections.sort(arrayList);
        int i = 0;
        while (i < arrayList.size() - 1) {
            C16373 c16374 = (C16373) arrayList.get(i);
            int i2 = i + 1;
            C16373 c16375 = (C16373) arrayList.get(i2);
            int i3 = c16375.f52692;
            int i4 = c16374.f52691;
            if (i3 <= i4) {
                c16374.f52691 = Math.max(i4, c16375.f52691);
                arrayList.remove(i2);
            } else {
                i = i2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16373 m7015(C16373 c16373) {
        if (c16373 == null) {
            return null;
        }
        return new C16373(c16373.f52692, c16373.f52691);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m7008(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size() * 2;
        int i2 = size - 1;
        if (((C16373) arrayList.get(0)).f52692 <= 0) {
            size = i2;
        }
        return ((C16373) C19084.m43861(arrayList, 1)).f52691 < i ? size + 1 : size;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m7009() {
        return new IllegalArgumentException("Invalid nine-patch region text");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m7010(int i) {
        return new IllegalArgumentException(C8479.m22141(i, "Invalid nine-patch region text at line "));
    }
}
