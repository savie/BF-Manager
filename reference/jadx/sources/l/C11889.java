package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.badge.BadgeDrawable;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۧ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 55EZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11889 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f38308;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f38309;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f38307 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38306 = 0;

    public C11889(CharSequence charSequence) {
        this.f38309 = charSequence;
        this.f38308 = charSequence.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29766() {
        int iIndexOf = -1;
        int i = 1;
        while (true) {
            iIndexOf = TextUtils.indexOf(this.f38309, '\n', iIndexOf + 1);
            if (iIndexOf == -1 || iIndexOf >= this.f38306) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m29768() throws Exception {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (z) {
            char cM29763 = m29763();
            int i = this.f38307;
            this.f38306 = i;
            if (cM29763 == '\n') {
                this.f38306 = i - 1;
                throw new Exception("Can not find the right \"");
            }
            if (cM29763 == '\"') {
                z = false;
            } else if (cM29763 == '\\') {
                char cM29764 = m29763();
                this.f38306 = this.f38307;
                if (cM29764 == '\"' || cM29764 == '\'' || cM29764 == '\\') {
                    sb.append(cM29764);
                } else if (cM29764 == 'b') {
                    sb.append('\b');
                } else if (cM29764 == 'f') {
                    sb.append('\f');
                } else if (cM29764 == 'n') {
                    sb.append('\n');
                } else if (cM29764 == 'r') {
                    sb.append('\r');
                } else if (cM29764 == 't') {
                    sb.append('\t');
                } else {
                    throw new Exception("Invalid escape sequence: \\" + cM29764);
                }
            } else {
                sb.append(cM29763);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m29762(String str) {
        return str.replace("\\", "\\\\").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t").replace("\b", "\\b").replace("\"", "\\\"");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private char m29763() throws Exception {
        int i = this.f38307;
        if (i >= this.f38308) {
            throw new Exception("EOF");
        }
        this.f38307 = i + 1;
        return this.f38309.charAt(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m29769() throws Exception {
        int i;
        boolean z = true;
        while (true) {
            i = this.f38308;
            if (z && this.f38307 < i) {
                char cM29763 = m29763();
                if (cM29763 != '\f' && cM29763 != '\r' && cM29763 != ' ') {
                    if (cM29763 != '/') {
                        switch (cM29763) {
                            case '\b':
                            case '\t':
                            case '\n':
                                continue;
                        }
                        m29765();
                        z = false;
                    } else {
                        char cM29764 = m29763();
                        if (cM29764 == '/') {
                            while (this.f38307 < i && m29763() != '\n') {
                            }
                        } else if (cM29764 == '*') {
                            while (true) {
                                if (this.f38307 >= i || m29763() == '*') {
                                    if (this.f38307 >= i) {
                                        throw new Exception("EOF");
                                    }
                                    if (m29763() == '/') {
                                        break;
                                    }
                                }
                            }
                        } else {
                            m29765();
                            m29765();
                            z = false;
                        }
                    }
                }
            }
        }
        int i2 = this.f38307;
        if (i2 >= i) {
            return "";
        }
        this.f38306 = i2;
        char cM29765 = m29763();
        if (cM29765 == '!') {
            if (m29763() == '=') {
                return "!=";
            }
            m29765();
            return "!";
        }
        if (cM29765 != '\"' && cM29765 != '.') {
            if (cM29765 == '/') {
                if (m29763() == '=') {
                    return "/=";
                }
                m29765();
                return "/";
            }
            if (cM29765 != '[' && cM29765 != ']') {
                if (cM29765 == '^') {
                    if (m29763() == '=') {
                        return "^=";
                    }
                    m29765();
                    return "^";
                }
                switch (cM29765) {
                    case '%':
                        if (m29763() == '=') {
                            return "%=";
                        }
                        m29765();
                        return "%";
                    case '&':
                        char cM29766 = m29763();
                        if (cM29766 == '&') {
                            return "&&";
                        }
                        if (cM29766 == '=') {
                            return "&=";
                        }
                        m29765();
                        return a.p;
                    case '\'':
                    case '(':
                    case ')':
                    case ',':
                        break;
                    case '*':
                        if (m29763() == '=') {
                            return "*=";
                        }
                        m29765();
                        return "*";
                    case '+':
                        char cM29767 = m29763();
                        if (cM29767 == '+') {
                            return "++";
                        }
                        if (cM29767 == '=') {
                            return "+=";
                        }
                        m29765();
                        return BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX;
                    default:
                        switch (cM29765) {
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                            case '?':
                                break;
                            case '<':
                                char cM29768 = m29763();
                                if (cM29768 == '=') {
                                    return "<=";
                                }
                                if (cM29768 != '<') {
                                    m29765();
                                    return "<";
                                }
                                if (m29763() == '=') {
                                    return "<<=";
                                }
                                m29765();
                                return "<<";
                            case '=':
                                if (m29763() == '=') {
                                    return "==";
                                }
                                m29765();
                                return "=";
                            case '>':
                                char cM29769 = m29763();
                                if (cM29769 == '=') {
                                    return ">=";
                                }
                                if (cM29769 != '>') {
                                    m29765();
                                    return ">";
                                }
                                char cM297610 = m29763();
                                if (cM297610 == '>') {
                                    if (m29763() == '=') {
                                        return ">>>=";
                                    }
                                    m29765();
                                    return ">>>";
                                }
                                if (cM297610 == '=') {
                                    return ">>=";
                                }
                                m29765();
                                return ">>";
                            default:
                                switch (cM29765) {
                                    case '{':
                                    case q.h /* 125 */:
                                    case '~':
                                        break;
                                    case '|':
                                        char cM297611 = m29763();
                                        if (cM297611 == '|') {
                                            return "||";
                                        }
                                        if (cM297611 == '=') {
                                            return "|=";
                                        }
                                        m29765();
                                        return "|";
                                    default:
                                        boolean z2 = cM29765 == '-';
                                        if (z2) {
                                            cM29765 = m29763();
                                            if (cM29765 == '-') {
                                                return "--";
                                            }
                                            if (cM29765 == '=') {
                                                return "-=";
                                            }
                                        }
                                        boolean z3 = '0' <= cM29765 && cM29765 <= '9';
                                        if (!z3 && z2) {
                                            m29765();
                                            return "-";
                                        }
                                        if (!z3 && (('a' > cM29765 || cM29765 > 'z') && (('A' > cM29765 || cM29765 > 'Z') && cM29765 != '_' && cM29765 != '$' && (19968 > cM29765 || cM29765 > 40869)))) {
                                            throw new Exception("Unknown Token Start: " + cM29765);
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        if (z2) {
                                            sb.append('-');
                                        }
                                        while (true) {
                                            sb.append(cM29765);
                                            cM29765 = m29763();
                                            if (('a' <= cM29765 && cM29765 <= 'z') || (('A' <= cM29765 && cM29765 <= 'Z') || cM29765 == '_' || cM29765 == '$' || (19968 <= cM29765 && cM29765 <= 40869))) {
                                                z3 = false;
                                            } else if ('0' > cM29765 || cM29765 > '9') {
                                                if (!z3 || cM29765 != '.') {
                                                }
                                            }
                                        }
                                        m29765();
                                        return sb.toString();
                                }
                                break;
                        }
                        break;
                }
            }
        }
        return String.valueOf(cM29765);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29767(String str) throws Exception {
        String strM29769 = m29769();
        if (!strM29769.equals(str)) {
            throw new Exception(ExternalValue$$ExternalSyntheticOutline0.m("Invalid token: expected=", str, ", got=", strM29769));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m29764(String str) throws Exception {
        if (!str.equals("{")) {
            throw new Exception("Invalid token: expected={, got=".concat(str));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m29765() {
        this.f38307--;
    }
}
