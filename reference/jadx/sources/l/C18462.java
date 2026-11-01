package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ᩴۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 068W */
/* JADX INFO: loaded from: classes4.dex */
public final class C18462 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C14690 f58831 = C14690.m35219("<[^<>\\s]+>?");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C14690 f58832 = C14690.m35219("[/?]?>");

    /* JADX WARN: Code duplicated, block: B:100:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[LOOP:1: B:42:0x0095->B:111:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095 A[LOOP:1: B:42:0x0095->B:111:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c5 A[EDGE_INSN: B:54:0x00c5->B:60:0x00d4 BREAK  A[LOOP:1: B:42:0x0095->B:111:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d3 A[EDGE_INSN: B:59:0x00d3->B:60:0x00d4 BREAK  A[LOOP:1: B:42:0x0095->B:111:?]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x010c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0100 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m42822(CharSequence charSequence, int i, InterfaceC21284 interfaceC21284) {
        String strGroup;
        int iIndexOf;
        int iStart;
        int iEnd;
        int iStart2;
        int iEnd2;
        C6222 c6222Matcher;
        int iIndexOf2;
        int i2;
        if (i <= 0 || i >= charSequence.length()) {
            if (m42821(charSequence, i, interfaceC21284)) {
                return;
            }
            ((C15204) interfaceC21284).mo30239();
            return;
        }
        C14690 c14690 = f58831;
        C6222 c6222Matcher2 = c14690.matcher(charSequence);
        C6222 c6222Matcher3 = f58832.matcher(charSequence);
        boolean z = false;
        int i3 = -1;
        while (true) {
            if (z) {
                if (!c6222Matcher2.find(i3)) {
                    break;
                }
                if (z) {
                    z = false;
                }
                if (i <= c6222Matcher2.start()) {
                    if (m42821(charSequence, i, interfaceC21284)) {
                        return;
                    }
                    ((C15204) interfaceC21284).mo30239();
                    return;
                }
                strGroup = c6222Matcher2.group();
                if (strGroup.startsWith("<!--")) {
                    iIndexOf = TextUtils.indexOf(charSequence, "-->", c6222Matcher2.start() + 4);
                    if (iIndexOf == -1) {
                        ((C15204) interfaceC21284).mo30239();
                        return;
                    } else if (i < iIndexOf + 3) {
                        ((C15204) interfaceC21284).mo30239();
                        return;
                    }
                } else if (strGroup.endsWith(">")) {
                    if (i < c6222Matcher2.end()) {
                        ((C15204) interfaceC21284).mo30239();
                        return;
                    }
                } else {
                    iStart = c6222Matcher2.start();
                    iEnd = c6222Matcher2.end();
                    if (c6222Matcher3.find(iEnd)) {
                        iStart2 = -1;
                        break;
                    }
                    c6222Matcher = c14690.matcher(charSequence);
                    if (c6222Matcher.find(iEnd)) {
                        iStart2 = -2;
                        break;
                    }
                    while (true) {
                        if (c6222Matcher.start() <= c6222Matcher3.start()) {
                            if (c6222Matcher.group().startsWith("<!--")) {
                                iIndexOf2 = TextUtils.indexOf(charSequence, "-->", c6222Matcher.start() + 4);
                                if (iIndexOf2 == -1 || (c6222Matcher3.start() < (i2 = iIndexOf2 + 3) && !c6222Matcher3.find(i2))) {
                                    iStart2 = -1;
                                    break;
                                } else if (c6222Matcher.find(i2)) {
                                }
                            } else {
                                iStart2 = c6222Matcher.start();
                                break;
                            }
                        }
                        iStart2 = -2;
                        break;
                    }
                    if (iStart2 == -2) {
                        iEnd2 = c6222Matcher3.end();
                        if (i < c6222Matcher3.end()) {
                            if (m42820(charSequence, i, iStart, iEnd2, interfaceC21284)) {
                                return;
                            }
                            ((C15204) interfaceC21284).mo30239();
                            return;
                        }
                    } else if (iStart2 == -1) {
                        if (m42820(charSequence, i, iStart, charSequence.length(), interfaceC21284)) {
                            return;
                        }
                        ((C15204) interfaceC21284).mo30239();
                        return;
                    } else {
                        if (i <= iStart2) {
                            if (m42821(charSequence, i, interfaceC21284)) {
                                return;
                            }
                            ((C15204) interfaceC21284).mo30239();
                            return;
                        }
                        z = true;
                        i3 = iStart2;
                    }
                }
            } else {
                if (!c6222Matcher2.find()) {
                    break;
                }
                if (z) {
                    z = false;
                }
                if (i <= c6222Matcher2.start()) {
                    if (m42821(charSequence, i, interfaceC21284)) {
                        ((C15204) interfaceC21284).mo30239();
                        return;
                    }
                    return;
                }
                strGroup = c6222Matcher2.group();
                if (strGroup.startsWith("<!--")) {
                    iIndexOf = TextUtils.indexOf(charSequence, "-->", c6222Matcher2.start() + 4);
                    if (iIndexOf == -1) {
                        ((C15204) interfaceC21284).mo30239();
                        return;
                    } else if (i < iIndexOf + 3) {
                        ((C15204) interfaceC21284).mo30239();
                        return;
                    }
                } else if (strGroup.endsWith(">")) {
                    if (i < c6222Matcher2.end()) {
                        ((C15204) interfaceC21284).mo30239();
                        return;
                    }
                } else {
                    iStart = c6222Matcher2.start();
                    iEnd = c6222Matcher2.end();
                    if (c6222Matcher3.find(iEnd)) {
                        c6222Matcher = c14690.matcher(charSequence);
                        if (c6222Matcher.find(iEnd)) {
                            iStart2 = -2;
                            break;
                        }
                        while (true) {
                            if (c6222Matcher.start() <= c6222Matcher3.start()) {
                                if (c6222Matcher.group().startsWith("<!--")) {
                                    iIndexOf2 = TextUtils.indexOf(charSequence, "-->", c6222Matcher.start() + 4);
                                    if (iIndexOf2 == -1) {
                                        if (c6222Matcher.find(i2)) {
                                        }
                                    }
                                    iStart2 = -1;
                                    break;
                                }
                                iStart2 = c6222Matcher.start();
                                break;
                            }
                            iStart2 = -2;
                            break;
                        }
                    }
                    iStart2 = -1;
                    break;
                    if (iStart2 == -2) {
                        iEnd2 = c6222Matcher3.end();
                        if (i < c6222Matcher3.end()) {
                            if (m42820(charSequence, i, iStart, iEnd2, interfaceC21284)) {
                                ((C15204) interfaceC21284).mo30239();
                                return;
                            }
                            return;
                        }
                    } else if (iStart2 == -1) {
                        if (m42820(charSequence, i, iStart, charSequence.length(), interfaceC21284)) {
                            ((C15204) interfaceC21284).mo30239();
                            return;
                        }
                        return;
                    } else {
                        if (i <= iStart2) {
                            if (m42821(charSequence, i, interfaceC21284)) {
                                ((C15204) interfaceC21284).mo30239();
                                return;
                            }
                            return;
                        }
                        z = true;
                        i3 = iStart2;
                    }
                }
            }
        }
        if (m42821(charSequence, i, interfaceC21284)) {
            return;
        }
        ((C15204) interfaceC21284).mo30239();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42821(CharSequence charSequence, int i, InterfaceC21284 interfaceC21284) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            char cCharAt = charSequence.charAt(i);
            if (Character.isWhitespace(cCharAt)) {
                break;
            }
            sb.insert(0, cCharAt);
        }
        if (sb.length() <= 0 || sb.charAt(0) != '<') {
            return false;
        }
        sb.deleteCharAt(0);
        ((C15204) interfaceC21284).f49600.f60761.clear();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42820(CharSequence charSequence, int i, int i2, int i3, InterfaceC21284 interfaceC21284) {
        String strM35683;
        int i4 = i2 + 1;
        C17756 c17756 = new C17756(charSequence.subSequence(i4, i3).toString().toCharArray(), i4);
        c17756.m41316();
        if (i <= c17756.m41315()) {
            charSequence.subSequence(i4, i).toString();
            ((C15204) interfaceC21284).f49600.f60761.clear();
            return true;
        }
        c17756.m41314();
        if (i > c17756.m41315()) {
            do {
                int iM41315 = c17756.m41315();
                String strM41316 = c17756.m41316();
                if (i <= c17756.m41315()) {
                    String string = charSequence.subSequence(iM41315, i).toString();
                    C18731 c18731 = ((C15204) interfaceC21284).f49600;
                    c18731.f60760.m35684(charSequence);
                    c18731.f60756.m48268(string);
                    c18731.f60754 = 2;
                    if (!c18731.f60761.isEmpty()) {
                        c18731.f60759 = iM41315;
                        c18731.f60758 = string.length() + iM41315;
                        return true;
                    }
                } else {
                    c17756.m41314();
                    if (i <= c17756.m41315() || c17756.m41317() != 61) {
                        break;
                    }
                    c17756.m41314();
                    if (i <= c17756.m41315()) {
                        break;
                    }
                    int iM41316 = c17756.m41315() + 1;
                    int iM41317 = c17756.m41317();
                    if (iM41317 != 34 && iM41317 != 39) {
                        break;
                    }
                    for (int iM41318 = c17756.m41317(); iM41318 != -1 && iM41318 != iM41317; iM41318 = c17756.m41317()) {
                    }
                    if (i <= c17756.m41315()) {
                        if (iM41316 > i || i == c17756.m41315()) {
                            break;
                            break;
                        }
                        String string2 = charSequence.subSequence(iM41316, i).toString();
                        C18731 c18732 = ((C15204) interfaceC21284).f49600;
                        c18732.f60760.m35684(charSequence);
                        String[] strArrSplit = strM41316.split(":", 2);
                        if (strArrSplit.length == 2) {
                            strM35683 = c18732.f60760.m35683(strArrSplit[0]);
                            strM41316 = strArrSplit[1];
                        } else {
                            strM35683 = "";
                        }
                        C11413 c11413M14106 = c18732.f60751.m16376().m14106(strM35683, strM41316, c18732.f60757);
                        if (c11413M14106 != null) {
                            c18732.f60752.m41980(c11413M14106, string2);
                            c18732.f60754 = 1;
                            if (!c18732.f60761.isEmpty()) {
                                c18732.f60759 = iM41316;
                                c18732.f60758 = string2.length() + iM41316;
                                return true;
                            }
                        }
                    } else {
                        c17756.m41314();
                    }
                }
                return true;
            } while (i > c17756.m41315());
        }
        return false;
    }
}
