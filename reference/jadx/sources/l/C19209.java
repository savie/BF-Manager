package l;

import com.umeng.analytics.pro.d;
import java.util.Stack;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩵ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37JR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19209 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f62033;

    public C19209(String str, C0219 c0219) {
        this.f62033 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m44128(String str) throws C8142 {
        int i;
        int i2;
        C19209 c19209 = this;
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack();
        int i3 = 0;
        int i4 = 1;
        stack.push(new C7920(null, 0, true, false));
        int i5 = 0;
        int i6 = 0;
        C19209 c192010 = c19209;
        while (true) {
            int length = str.length();
            String str2 = c192010.f62033;
            if (i5 > length) {
                if (stack.size() != 1) {
                    C7920 c7920 = (C7920) stack.peek();
                    throw new C18066(str2, c7920.f26014, 0, C22697.m50267(new StringBuilder("Unclosed #"), c7920.f26015, " block"));
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
            int iM22097 = C8439.m22097(i3, strSubstring);
            boolean z = iM22097 < strSubstring.length() && strSubstring.charAt(iM22097) == '#';
            int i8 = iM22097 + 1;
            int i9 = i8;
            if (z) {
                while (i9 < strSubstring.length() && strSubstring.charAt(i9) >= 'a' && strSubstring.charAt(i9) <= 'z') {
                    i9++;
                }
            }
            String strSubstring2 = z ? strSubstring.substring(i8, i9) : "";
            C19209 c192011 = c192010;
            boolean z2 = z;
            if (strSubstring2.equals("if") || strSubstring2.equals("elif") || strSubstring2.equals("else") || strSubstring2.equals("endif") || strSubstring2.equals(d.O)) {
                if (i9 == strSubstring.length()) {
                    i2 = i8;
                } else {
                    int iM22098 = C8439.m22097(i9, strSubstring);
                    if (iM22098 > i9) {
                        i2 = i8;
                        while (iM22098 < strSubstring.length() && !C8439.m22094(strSubstring.charAt(iM22098))) {
                            iM22098++;
                        }
                        if (iM22098 != strSubstring.length()) {
                            i = i2;
                        }
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c19209 = this;
                        i5 = i7;
                        c192010 = c192011;
                    } else {
                        i = i8;
                    }
                    c192011 = this;
                }
                String strSubstring3 = strSubstring.substring(0, iM22097);
                String strSubstring4 = strSubstring.substring(i9);
                switch (strSubstring2) {
                    case "if":
                        this = this;
                        boolean zM44127 = this.m44127(strSubstring4.trim(), i6, i9, strSubstring2);
                        stack.push(new C7920(strSubstring2, i6 + 1, ((C7920) stack.peek()).f26012 && zM44127, zM44127));
                        sb.append(strSubstring3);
                        sb.append("//#if");
                        sb.append(strSubstring4);
                        sb.append("\n");
                        c192011 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c19209 = this;
                        i5 = i7;
                        c192010 = c192011;
                        break;
                    case "elif":
                        int i10 = i2;
                        if (stack.size() <= 1) {
                            throw new C18066(str2, i6 + 1, i10, "Unexpected #elif");
                        }
                        C7920 c7921 = (C7920) stack.pop();
                        C7920 c7922 = (C7920) stack.peek();
                        this = this;
                        boolean zM44128 = this.m44127(strSubstring4.trim(), i6, i9, strSubstring2);
                        stack.push(new C7920(strSubstring2, i6 + 1, c7922.f26012 && !c7921.f26013 && zM44128, c7921.f26013 || zM44128));
                        sb.append(strSubstring3);
                        sb.append("//#elif");
                        sb.append(strSubstring4);
                        sb.append("\n");
                        c192011 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c19209 = this;
                        i5 = i7;
                        c192010 = c192011;
                        break;
                        break;
                    case "else":
                        int i11 = i2;
                        if (stack.size() <= 1) {
                            throw new C18066(str2, i6 + 1, i11, "Unexpected #else");
                        }
                        if (!strSubstring4.trim().isEmpty()) {
                            throw new C18066(str2, i6 + 1, i9, "Unexpected content after #else");
                        }
                        stack.push(new C7920(strSubstring2, i6 + 1, ((C7920) stack.peek()).f26012 && !((C7920) stack.pop()).f26013, true));
                        sb.append(strSubstring3);
                        sb.append("//#else\n");
                        this = this;
                        c192011 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c19209 = this;
                        i5 = i7;
                        c192010 = c192011;
                        break;
                        break;
                    case "endif":
                        if (stack.size() <= 1) {
                            throw new C18066(str2, i6 + 1, i2, "Unexpected #endif");
                        }
                        if (!strSubstring4.trim().isEmpty()) {
                            throw new C18066(str2, i6 + 1, i9, "Unexpected content after #endif");
                        }
                        stack.pop();
                        sb.append(strSubstring3);
                        sb.append("//#endif\n");
                        this = this;
                        c192011 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c19209 = this;
                        i5 = i7;
                        c192010 = c192011;
                        break;
                        break;
                    case "error":
                        if (!((C7920) stack.peek()).f26012) {
                            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strSubstring3, "//#error", strSubstring4, "\n");
                            this = this;
                            c192011 = this;
                            i6++;
                            i3 = 0;
                            i4 = 1;
                            c19209 = this;
                            i5 = i7;
                            c192010 = c192011;
                            break;
                        } else {
                            String strTrim = strSubstring4.trim();
                            if (strTrim.isEmpty()) {
                                strTrim = "#error";
                            }
                            throw new C8142(strTrim);
                        }
                        break;
                    default:
                        this = this;
                        c192011 = this;
                        i6++;
                        i3 = 0;
                        i4 = 1;
                        c19209 = this;
                        i5 = i7;
                        c192010 = c192011;
                        break;
                }
            } else {
                this = c19209;
                i = i8;
            }
            if (z2) {
                int i12 = i6 + 1;
                int i13 = i;
                while (i13 < strSubstring.length() && !C8439.m22094(strSubstring.charAt(i13))) {
                    i13++;
                }
                throw new C18066(str2, i12, iM22097, C0252.m1693("Unknown directive: #", strSubstring.substring(i, i13)));
            }
            if (((C7920) stack.peek()).f26012) {
                sb.append(strSubstring);
                sb.append("\n");
            } else {
                C0219.m1594(sb, "//", strSubstring, "\n");
            }
            i6++;
            i3 = 0;
            i4 = 1;
            c19209 = this;
            i5 = i7;
            c192010 = c192011;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m44127(String str, int i, int i2, String str2) {
        String strConcat;
        char cCharAt;
        int iM22097 = str.startsWith("MT") ? C8439.m22097(2, str) : 0;
        int i3 = iM22097;
        while (i3 < str.length() && ((cCharAt = str.charAt(i3)) == '>' || cCharAt == '<' || cCharAt == '=' || cCharAt == '!')) {
            i3++;
        }
        int iM22098 = C8439.m22097(i3, str);
        if (iM22097 <= 2 || i3 <= iM22097 || iM22098 <= i3 || C8439.m22091(iM22098, str) != str.length()) {
            int i4 = i + 1;
            if (str.isEmpty()) {
                strConcat = "Missing condition after #".concat(str2);
            } else {
                strConcat = "Invalid condition: ".concat(str);
            }
            throw new C18066(this.f62033, i4, i2, strConcat);
        }
        return C8439.m22096(str.substring(iM22097, i3), str.substring(iM22098));
    }
}
