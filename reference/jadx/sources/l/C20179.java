package l;

import com.umeng.analytics.pro.d;
import java.util.Stack;

/* JADX INFO: renamed from: l.ᩴ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37JR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20179 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f64811;

    public C20179(String str, C13921 c13921) {
        this.f64811 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m46427(String str) throws C3090 {
        int i;
        int i2;
        C20179 c20179 = this;
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack();
        int i3 = 0;
        int i4 = 1;
        stack.push(new C23163(null, 0, true, false));
        int i5 = 0;
        int i6 = 0;
        C20179 c201710 = c20179;
        while (true) {
            int length = str.length();
            String str2 = c201710.f64811;
            if (i5 > length) {
                if (stack.size() != 1) {
                    C23163 c23163 = (C23163) stack.peek();
                    throw new C10833(str2, c23163.f75081, 0, C8947.m23910(new StringBuilder("Unclosed #"), c23163.f75082, " block"));
                }
                if (!str.endsWith("\n") && sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                return sb.toString();
            }
            int iIndexOf = str.indexOf(10, i5);
            if (iIndexOf < 0) {
                iIndexOf = str.length();
            }
            String strSubstring = str.substring(i5, iIndexOf);
            int i7 = i4 + iIndexOf;
            int iM15707 = C5219.m15707(i3, strSubstring);
            boolean z = iM15707 < strSubstring.length() && strSubstring.charAt(iM15707) == '#';
            int i8 = iM15707 + 1;
            int i9 = i8;
            if (z) {
                while (i9 < strSubstring.length() && strSubstring.charAt(i9) >= 'a' && strSubstring.charAt(i9) <= 'z') {
                    i9++;
                }
            }
            String strSubstring2 = z ? strSubstring.substring(i8, i9) : "";
            C20179 c201711 = c201710;
            boolean z2 = z;
            if (strSubstring2.equals("if") || strSubstring2.equals("elif") || strSubstring2.equals("else") || strSubstring2.equals("endif") || strSubstring2.equals(d.O)) {
                if (i9 == strSubstring.length()) {
                    i2 = i8;
                } else {
                    int iM15708 = C5219.m15707(i9, strSubstring);
                    if (iM15708 > i9) {
                        i2 = i8;
                        while (iM15708 < strSubstring.length() && !C5219.m15704(strSubstring.charAt(iM15708))) {
                            iM15708++;
                        }
                        if (iM15708 != strSubstring.length()) {
                            i = i2;
                        }
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c20179 = this;
                        i5 = i7;
                        c201710 = c201711;
                    } else {
                        i = i8;
                    }
                    c201711 = this;
                }
                String strSubstring3 = strSubstring.substring(0, iM15707);
                String strSubstring4 = strSubstring.substring(i9);
                switch (strSubstring2) {
                    case "if":
                        this = this;
                        boolean zM46426 = this.m46426(strSubstring4.trim(), i6, i9, strSubstring2);
                        stack.push(new C23163(strSubstring2, i6 + 1, ((C23163) stack.peek()).f75083 && zM46426, zM46426));
                        sb.append(strSubstring3);
                        sb.append("//#if");
                        sb.append(strSubstring4);
                        sb.append("\n");
                        c201711 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c20179 = this;
                        i5 = i7;
                        c201710 = c201711;
                        break;
                    case "elif":
                        int i10 = i2;
                        if (stack.size() <= 1) {
                            throw new C10833(str2, i6 + 1, i10, "Unexpected #elif");
                        }
                        C23163 c23164 = (C23163) stack.pop();
                        C23163 c23165 = (C23163) stack.peek();
                        this = this;
                        boolean zM46427 = this.m46426(strSubstring4.trim(), i6, i9, strSubstring2);
                        stack.push(new C23163(strSubstring2, i6 + 1, c23165.f75083 && !c23164.f75080 && zM46427, c23164.f75080 || zM46427));
                        sb.append(strSubstring3);
                        sb.append("//#elif");
                        sb.append(strSubstring4);
                        sb.append("\n");
                        c201711 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c20179 = this;
                        i5 = i7;
                        c201710 = c201711;
                        break;
                        break;
                    case "else":
                        int i11 = i2;
                        if (stack.size() <= 1) {
                            throw new C10833(str2, i6 + 1, i11, "Unexpected #else");
                        }
                        if (!strSubstring4.trim().isEmpty()) {
                            throw new C10833(str2, i6 + 1, i9, "Unexpected content after #else");
                        }
                        stack.push(new C23163(strSubstring2, i6 + 1, ((C23163) stack.peek()).f75083 && !((C23163) stack.pop()).f75080, true));
                        sb.append(strSubstring3);
                        sb.append("//#else\n");
                        this = this;
                        c201711 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c20179 = this;
                        i5 = i7;
                        c201710 = c201711;
                        break;
                        break;
                    case "endif":
                        if (stack.size() <= 1) {
                            throw new C10833(str2, i6 + 1, i2, "Unexpected #endif");
                        }
                        if (!strSubstring4.trim().isEmpty()) {
                            throw new C10833(str2, i6 + 1, i9, "Unexpected content after #endif");
                        }
                        stack.pop();
                        sb.append(strSubstring3);
                        sb.append("//#endif\n");
                        this = this;
                        c201711 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c20179 = this;
                        i5 = i7;
                        c201710 = c201711;
                        break;
                        break;
                    case "error":
                        if (!((C23163) stack.peek()).f75083) {
                            C4794.m14774(sb, strSubstring3, "//#error", strSubstring4, "\n");
                            this = this;
                            c201711 = this;
                            i6++;
                            i3 = 0;
                            i4 = 1;
                            c20179 = this;
                            i5 = i7;
                            c201710 = c201711;
                            break;
                        } else {
                            String strTrim = strSubstring4.trim();
                            if (strTrim.isEmpty()) {
                                strTrim = "#error";
                            }
                            throw new C3090(strTrim);
                        }
                        break;
                    default:
                        this = this;
                        c201711 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c20179 = this;
                        i5 = i7;
                        c201710 = c201711;
                        break;
                }
            } else {
                this = c20179;
                i = i8;
            }
            if (z2) {
                int i12 = i6 + 1;
                int i13 = i;
                while (i13 < strSubstring.length() && !C5219.m15704(strSubstring.charAt(i13))) {
                    i13++;
                }
                throw new C10833(str2, i12, iM15707, C25272.m56409("Unknown directive: #", strSubstring.substring(i, i13)));
            }
            if (((C23163) stack.peek()).f75083) {
                sb.append(strSubstring);
                sb.append("\n");
            } else {
                C22121.m50078(sb, "//", strSubstring, "\n");
            }
            i6++;
            i3 = 0;
            i4 = 1;
            c20179 = this;
            i5 = i7;
            c201710 = c201711;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m46426(String str, int i, int i2, String str2) {
        String strConcat;
        char cCharAt;
        int iM15707 = str.startsWith("MT") ? C5219.m15707(2, str) : 0;
        int i3 = iM15707;
        while (i3 < str.length() && ((cCharAt = str.charAt(i3)) == '>' || cCharAt == '<' || cCharAt == '=' || cCharAt == '!')) {
            i3++;
        }
        int iM15708 = C5219.m15707(i3, str);
        if (iM15707 <= 2 || i3 <= iM15707 || iM15708 <= i3 || C5219.m15711(iM15708, str) != str.length()) {
            int i4 = i + 1;
            if (str.isEmpty()) {
                strConcat = "Missing condition after #".concat(str2);
            } else {
                strConcat = "Invalid condition: ".concat(str);
            }
            throw new C10833(this.f64811, i4, i2, strConcat);
        }
        return C5219.m15706(str.substring(iM15707, i3), str.substring(iM15708));
    }
}
