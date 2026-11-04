package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۫ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 068W */
/* JADX INFO: loaded from: classes4.dex */
public final class C13180 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C18415 f42110 = C18415.m42925("<[^<>\\s]+>?");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C18415 f42111 = C18415.m42925("[/?]?>");

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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m32702(CharSequence charSequence, int i, InterfaceC19893 interfaceC19893) {
        String strGroup;
        int iIndexOf;
        int iStart;
        int iEnd;
        int iStart2;
        int iEnd2;
        C4245 c4245Matcher;
        int iIndexOf2;
        int i2;
        if (i <= 0 || i >= charSequence.length()) {
            if (m32701(charSequence, i, interfaceC19893)) {
                return;
            }
            ((C11074) interfaceC19893).mo4037();
            return;
        }
        C18415 c18415 = f42110;
        C4245 c4245Matcher2 = c18415.matcher(charSequence);
        C4245 c4245Matcher3 = f42111.matcher(charSequence);
        boolean z = false;
        int i3 = -1;
        while (true) {
            if (z) {
                if (!c4245Matcher2.find(i3)) {
                    break;
                }
                if (z) {
                    z = false;
                }
                if (i <= c4245Matcher2.start()) {
                    if (m32701(charSequence, i, interfaceC19893)) {
                        return;
                    }
                    ((C11074) interfaceC19893).mo4037();
                    return;
                }
                strGroup = c4245Matcher2.group();
                if (strGroup.startsWith("<!--")) {
                    iIndexOf = TextUtils.indexOf(charSequence, "-->", c4245Matcher2.start() + 4);
                    if (iIndexOf == -1) {
                        ((C11074) interfaceC19893).mo4037();
                        return;
                    } else if (i < iIndexOf + 3) {
                        ((C11074) interfaceC19893).mo4037();
                        return;
                    }
                } else if (strGroup.endsWith(">")) {
                    if (i < c4245Matcher2.end()) {
                        ((C11074) interfaceC19893).mo4037();
                        return;
                    }
                } else {
                    iStart = c4245Matcher2.start();
                    iEnd = c4245Matcher2.end();
                    if (c4245Matcher3.find(iEnd)) {
                        iStart2 = -1;
                        break;
                    }
                    c4245Matcher = c18415.matcher(charSequence);
                    if (c4245Matcher.find(iEnd)) {
                        iStart2 = -2;
                        break;
                    }
                    while (true) {
                        if (c4245Matcher.start() <= c4245Matcher3.start()) {
                            if (c4245Matcher.group().startsWith("<!--")) {
                                iIndexOf2 = TextUtils.indexOf(charSequence, "-->", c4245Matcher.start() + 4);
                                if (iIndexOf2 == -1 || (c4245Matcher3.start() < (i2 = iIndexOf2 + 3) && !c4245Matcher3.find(i2))) {
                                    iStart2 = -1;
                                    break;
                                } else if (c4245Matcher.find(i2)) {
                                }
                            } else {
                                iStart2 = c4245Matcher.start();
                                break;
                            }
                        }
                        iStart2 = -2;
                        break;
                    }
                    if (iStart2 == -2) {
                        iEnd2 = c4245Matcher3.end();
                        if (i < c4245Matcher3.end()) {
                            if (m32700(charSequence, i, iStart, iEnd2, interfaceC19893)) {
                                return;
                            }
                            ((C11074) interfaceC19893).mo4037();
                            return;
                        }
                    } else if (iStart2 == -1) {
                        if (m32700(charSequence, i, iStart, charSequence.length(), interfaceC19893)) {
                            return;
                        }
                        ((C11074) interfaceC19893).mo4037();
                        return;
                    } else {
                        if (i <= iStart2) {
                            if (m32701(charSequence, i, interfaceC19893)) {
                                return;
                            }
                            ((C11074) interfaceC19893).mo4037();
                            return;
                        }
                        z = true;
                        i3 = iStart2;
                    }
                }
            } else {
                if (!c4245Matcher2.find()) {
                    break;
                }
                if (z) {
                    z = false;
                }
                if (i <= c4245Matcher2.start()) {
                    if (m32701(charSequence, i, interfaceC19893)) {
                        ((C11074) interfaceC19893).mo4037();
                        return;
                    }
                    return;
                }
                strGroup = c4245Matcher2.group();
                if (strGroup.startsWith("<!--")) {
                    iIndexOf = TextUtils.indexOf(charSequence, "-->", c4245Matcher2.start() + 4);
                    if (iIndexOf == -1) {
                        ((C11074) interfaceC19893).mo4037();
                        return;
                    } else if (i < iIndexOf + 3) {
                        ((C11074) interfaceC19893).mo4037();
                        return;
                    }
                } else if (strGroup.endsWith(">")) {
                    if (i < c4245Matcher2.end()) {
                        ((C11074) interfaceC19893).mo4037();
                        return;
                    }
                } else {
                    iStart = c4245Matcher2.start();
                    iEnd = c4245Matcher2.end();
                    if (c4245Matcher3.find(iEnd)) {
                        c4245Matcher = c18415.matcher(charSequence);
                        if (c4245Matcher.find(iEnd)) {
                            iStart2 = -2;
                            break;
                        }
                        while (true) {
                            if (c4245Matcher.start() <= c4245Matcher3.start()) {
                                if (c4245Matcher.group().startsWith("<!--")) {
                                    iIndexOf2 = TextUtils.indexOf(charSequence, "-->", c4245Matcher.start() + 4);
                                    if (iIndexOf2 == -1) {
                                        if (c4245Matcher.find(i2)) {
                                        }
                                    }
                                    iStart2 = -1;
                                    break;
                                }
                                iStart2 = c4245Matcher.start();
                                break;
                            }
                            iStart2 = -2;
                            break;
                        }
                    }
                    iStart2 = -1;
                    break;
                    if (iStart2 == -2) {
                        iEnd2 = c4245Matcher3.end();
                        if (i < c4245Matcher3.end()) {
                            if (m32700(charSequence, i, iStart, iEnd2, interfaceC19893)) {
                                ((C11074) interfaceC19893).mo4037();
                                return;
                            }
                            return;
                        }
                    } else if (iStart2 == -1) {
                        if (m32700(charSequence, i, iStart, charSequence.length(), interfaceC19893)) {
                            ((C11074) interfaceC19893).mo4037();
                            return;
                        }
                        return;
                    } else {
                        if (i <= iStart2) {
                            if (m32701(charSequence, i, interfaceC19893)) {
                                ((C11074) interfaceC19893).mo4037();
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
        if (m32701(charSequence, i, interfaceC19893)) {
            return;
        }
        ((C11074) interfaceC19893).mo4037();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32701(CharSequence charSequence, int i, InterfaceC19893 interfaceC19893) {
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
        ((C11074) interfaceC19893).f34927.f50579.clear();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32700(CharSequence charSequence, int i, int i2, int i3, InterfaceC19893 interfaceC19893) {
        String strM51605;
        int i4 = i2 + 1;
        C15417 c15417 = new C15417(charSequence.subSequence(i4, i3).toString().toCharArray(), i4);
        c15417.m36921();
        if (i <= c15417.m36920()) {
            charSequence.subSequence(i4, i).toString();
            ((C11074) interfaceC19893).f34927.f50579.clear();
            return true;
        }
        c15417.m36923();
        if (i > c15417.m36920()) {
            do {
                int iM36920 = c15417.m36920();
                String strM36921 = c15417.m36921();
                if (i <= c15417.m36920()) {
                    String string = charSequence.subSequence(iM36920, i).toString();
                    C15549 c15549 = ((C11074) interfaceC19893).f34927;
                    c15549.f50580.m51606(charSequence);
                    c15549.f50573.m51901(string);
                    c15549.f50572 = 2;
                    if (!c15549.f50579.isEmpty()) {
                        c15549.f50581 = iM36920;
                        c15549.f50577 = string.length() + iM36920;
                        return true;
                    }
                } else {
                    c15417.m36923();
                    if (i <= c15417.m36920() || c15417.m36922() != 61) {
                        break;
                    }
                    c15417.m36923();
                    if (i <= c15417.m36920()) {
                        break;
                    }
                    int iM36921 = c15417.m36920() + 1;
                    int iM36922 = c15417.m36922();
                    if (iM36922 != 34 && iM36922 != 39) {
                        break;
                    }
                    for (int iM36923 = c15417.m36922(); iM36923 != -1 && iM36923 != iM36922; iM36923 = c15417.m36922()) {
                    }
                    if (i <= c15417.m36920()) {
                        if (iM36921 > i || i == c15417.m36920()) {
                            break;
                            break;
                        }
                        String string2 = charSequence.subSequence(iM36921, i).toString();
                        C15549 c155410 = ((C11074) interfaceC19893).f34927;
                        c155410.f50580.m51606(charSequence);
                        String[] strArrSplit = strM36921.split(":", 2);
                        if (strArrSplit.length == 2) {
                            strM51605 = c155410.f50580.m51605(strArrSplit[0]);
                            strM36921 = strArrSplit[1];
                        } else {
                            strM51605 = "";
                        }
                        C2600 c2600M19408 = c155410.f50576.m48431().m19408(strM51605, strM36921, c155410.f50578);
                        if (c2600M19408 != null) {
                            c155410.f50571.m46071(c2600M19408, string2);
                            c155410.f50572 = 1;
                            if (!c155410.f50579.isEmpty()) {
                                c155410.f50581 = iM36921;
                                c155410.f50577 = string2.length() + iM36921;
                                return true;
                            }
                        }
                    } else {
                        c15417.m36923();
                    }
                }
                return true;
            } while (i > c15417.m36920());
        }
        return false;
    }
}
