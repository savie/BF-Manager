package l;

import com.alipay.sdk.m.y.l;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۢᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C9751 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24733(C14690 c14690, String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            m24730((InterfaceC1988) null, i);
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                i++;
                if (i == length) {
                    throw new C17511("The last '\\' need follow a character.", str, length - 1);
                }
            } else if (cCharAt != '$') {
                continue;
            } else {
                int i2 = i + 1;
                if (i2 == length) {
                    throw new C17511("The last '$' must be followed by a group index", str, length - 1);
                }
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 == '{') {
                    StringBuilder sb = new StringBuilder();
                    int i3 = i2;
                    while (true) {
                        i3++;
                        if (i3 == length) {
                            throw new C17511("Missing ending brace '}' from replacement string", str, length - 1);
                        }
                        m24730((InterfaceC1988) null, i3);
                        char cCharAt3 = str.charAt(i3);
                        if (cCharAt3 == '}') {
                            if (sb.length() == 0) {
                                throw new C17511("The '${' must be followed by a group name or index", str, i2);
                            }
                            if (sb.length() == 0) {
                                throw new C17511("The '${' must be followed by a group name or index", str, i2);
                            }
                            String string = sb.toString();
                            if (C20025.m45354(string.charAt(0))) {
                                try {
                                    Integer.parseInt(string);
                                } catch (NumberFormatException e) {
                                    throw new C17511(e.toString(), str, i + 2);
                                }
                            } else if (c14690 != null && !c14690.m35224().containsKey(string)) {
                                throw new C17511(C16523.m38890("No group with name {", string, l.d), str, i2);
                            }
                            i = i3;
                            break;
                        }
                        if (((cCharAt3 - 'a') | ('z' - cCharAt3)) < 0 && ((cCharAt3 - 'A') | ('Z' - cCharAt3)) < 0 && !C20025.m45354(cCharAt3)) {
                            throw new C17511("The '${' must be followed by a group name or index", str, i2);
                        }
                        sb.append(cCharAt3);
                    }
                } else {
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        throw new C17511("The '$' must be followed by a group index", str, i);
                    }
                    i = i2;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24731(InterfaceC1988 interfaceC1988, StringBuilder sb, String str) {
        int i;
        int iIntValue;
        interfaceC1988.mo6401();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            m24730(interfaceC1988, i3);
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\\') {
                i = i2 + 1;
                if (i == length) {
                    throw new C17511("The last '\\' need follow a character.", str, length - 1);
                }
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == 'L' || cCharAt2 == 'U' || cCharAt2 == 'l' || cCharAt2 == 'u') {
                    sb2.append('\\');
                    sb2.append(cCharAt2);
                } else {
                    if (sb2.length() != 0) {
                        throw new C17511("The '" + ((Object) sb2) + "' need follow a '$'.", str, i2 - sb2.length());
                    }
                    if (cCharAt2 == 'n') {
                        sb.append("\n");
                    } else if (cCharAt2 == 'r') {
                        sb.append("\r");
                    } else if (cCharAt2 != 't') {
                        sb.append(cCharAt2);
                    } else {
                        sb.append("\t");
                    }
                }
            } else {
                if (cCharAt == '$') {
                    i = i2 + 1;
                    if (i == length) {
                        throw new C17511("The last '$' must be followed by a group index", str, length - 1);
                    }
                    char cCharAt3 = str.charAt(i);
                    if (cCharAt3 == '{') {
                        StringBuilder sb3 = new StringBuilder();
                        int i5 = i;
                        while (true) {
                            i5++;
                            if (i5 == length) {
                                throw new C17511("Missing ending brace '}' from replacement string", str, length - 1);
                            }
                            int i6 = i4 + 1;
                            m24730(interfaceC1988, i4);
                            char cCharAt4 = str.charAt(i5);
                            if (cCharAt4 == '}') {
                                if (sb3.length() == 0) {
                                    throw new C17511("The '${' must be followed by a group name or index", str, i);
                                }
                                if (sb3.length() == 0) {
                                    throw new C17511("The '${' must be followed by a group name or index", str, i);
                                }
                                C14690 c14690Pattern = interfaceC1988.pattern();
                                String string = sb3.toString();
                                if (C20025.m45354(string.charAt(0))) {
                                    try {
                                        iIntValue = Integer.parseInt(string);
                                    } catch (NumberFormatException e) {
                                        throw new C17511(e.toString(), str, i2 + 2);
                                    }
                                } else {
                                    Integer num = (Integer) c14690Pattern.m35224().get(string);
                                    if (num == null) {
                                        throw new C17511(C16523.m38890("No group with name {", string, l.d), str, i);
                                    }
                                    iIntValue = num.intValue();
                                }
                                if (sb2.length() != 0) {
                                    m24732(interfaceC1988, sb, sb2, iIntValue);
                                    sb2.setLength(0);
                                } else if (iIntValue <= interfaceC1988.groupCount()) {
                                    int iStart = interfaceC1988.start(iIntValue);
                                    int iEnd = interfaceC1988.end(iIntValue);
                                    if (iStart != -1 && iEnd != -1) {
                                        CharSequence text = interfaceC1988.getText();
                                        while (iStart < iEnd) {
                                            m24730(interfaceC1988, 0);
                                            int iMin = Math.min(4096, iEnd - iStart) + iStart;
                                            sb.append(text, iStart, iMin);
                                            iStart = iMin;
                                        }
                                    }
                                }
                                i2 = i5;
                                i3 = i6;
                                break;
                            }
                            if (((cCharAt4 - 'a') | ('z' - cCharAt4)) < 0 && ((cCharAt4 - 'A') | ('Z' - cCharAt4)) < 0 && !C20025.m45354(cCharAt4)) {
                                throw new C17511("The '${' must be followed by a group name or index", str, i);
                            }
                            sb3.append(cCharAt4);
                            i4 = i6;
                        }
                    } else {
                        if (cCharAt3 < '0' || cCharAt3 > '9') {
                            throw new C17511("The '$' must be followed by a group index", str, i2);
                        }
                        if (sb2.length() == 0) {
                            int i7 = cCharAt3 - '0';
                            if (i7 <= interfaceC1988.groupCount()) {
                                int iStart2 = interfaceC1988.start(i7);
                                int iEnd2 = interfaceC1988.end(i7);
                                if (iStart2 != -1 && iEnd2 != -1) {
                                    CharSequence text2 = interfaceC1988.getText();
                                    while (iStart2 < iEnd2) {
                                        m24730(interfaceC1988, 0);
                                        int iMin2 = Math.min(4096, iEnd2 - iStart2) + iStart2;
                                        sb.append(text2, iStart2, iMin2);
                                        iStart2 = iMin2;
                                    }
                                }
                            }
                        } else {
                            m24732(interfaceC1988, sb, sb2, cCharAt3 - '0');
                            sb2.setLength(0);
                        }
                    }
                } else {
                    if (sb2.length() != 0) {
                        throw new C17511("The '" + ((Object) sb2) + "' need follow a '$'.", str, i2 - sb2.length());
                    }
                    sb.append(cCharAt);
                    i3 = i4;
                }
                i2++;
            }
            i2 = i;
            i3 = i4;
            i2++;
        }
        if (sb2.length() == 0) {
            interfaceC1988.mo6401();
            return;
        }
        throw new C17511("The '" + ((Object) sb2) + "' need follow a '$'.", str, str.length() - sb2.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24732(InterfaceC1988 interfaceC1988, StringBuilder sb, StringBuilder sb2, int i) {
        String strGroup;
        int i2;
        if (i <= interfaceC1988.groupCount() && (strGroup = interfaceC1988.group(i)) != null) {
            int length = sb2.length() / 2;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                m24730(interfaceC1988, i4);
                char cCharAt = sb2.charAt((i4 * 2) + 1);
                if (cCharAt == 'L') {
                    while (i3 < strGroup.length()) {
                        m24730(interfaceC1988, i3);
                        sb.append(Character.toLowerCase(strGroup.charAt(i3)));
                        i3++;
                    }
                    return;
                }
                if (cCharAt == 'U') {
                    while (i3 < strGroup.length()) {
                        m24730(interfaceC1988, i3);
                        sb.append(Character.toUpperCase(strGroup.charAt(i3)));
                        i3++;
                    }
                    return;
                }
                if (cCharAt == 'l') {
                    if (i3 >= strGroup.length()) {
                        return;
                    }
                    i2 = i3 + 1;
                    sb.append(Character.toLowerCase(strGroup.charAt(i3)));
                } else if (cCharAt == 'u') {
                    if (i3 >= strGroup.length()) {
                        return;
                    }
                    i2 = i3 + 1;
                    sb.append(Character.toUpperCase(strGroup.charAt(i3)));
                } else {
                    throw new IllegalStateException();
                }
                i3 = i2;
            }
            if (i3 < strGroup.length()) {
                int length2 = strGroup.length();
                while (i3 < length2) {
                    m24730(interfaceC1988, 0);
                    int iMin = Math.min(4096, length2 - i3) + i3;
                    sb.append((CharSequence) strGroup, i3, iMin);
                    i3 = iMin;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24730(InterfaceC1988 interfaceC1988, int i) {
        if ((i & 1023) != 0) {
            return;
        }
        if (interfaceC1988 != null) {
            interfaceC1988.mo6401();
        }
        if (Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Regex replacement canceled");
        }
    }
}
