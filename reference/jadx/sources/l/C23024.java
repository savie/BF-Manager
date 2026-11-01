package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.badge.BadgeDrawable;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.᩺ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55EZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23024 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CharSequence f74816;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f74819;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f74818 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74817 = 0;

    public C23024(CharSequence charSequence) {
        this.f74816 = charSequence;
        this.f74819 = charSequence.length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50948() {
        int iIndexOf = -1;
        int i = 1;
        while (true) {
            iIndexOf = TextUtils.indexOf(this.f74816, '\n', iIndexOf + 1);
            if (iIndexOf == -1 || iIndexOf >= this.f74817) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m50950() throws Exception {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (z) {
            char cM50945 = m50945();
            int i = this.f74818;
            this.f74817 = i;
            if (cM50945 == '\n') {
                this.f74817 = i - 1;
                throw new Exception("Can not find the right \"");
            }
            if (cM50945 == '\"') {
                z = false;
            } else if (cM50945 == '\\') {
                char cM50946 = m50945();
                this.f74817 = this.f74818;
                if (cM50946 == '\"' || cM50946 == '\'' || cM50946 == '\\') {
                    sb.append(cM50946);
                } else if (cM50946 == 'b') {
                    sb.append('\b');
                } else if (cM50946 == 'f') {
                    sb.append('\f');
                } else if (cM50946 == 'n') {
                    sb.append('\n');
                } else if (cM50946 == 'r') {
                    sb.append('\r');
                } else if (cM50946 == 't') {
                    sb.append('\t');
                } else {
                    throw new Exception("Invalid escape sequence: \\" + cM50946);
                }
            } else {
                sb.append(cM50945);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m50946(String str) {
        return str.replace("\\", "\\\\").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t").replace("\b", "\\b").replace("\"", "\\\"");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private char m50945() throws Exception {
        int i = this.f74818;
        if (i >= this.f74819) {
            throw new Exception("EOF");
        }
        this.f74818 = i + 1;
        return this.f74816.charAt(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m50951() throws Exception {
        int i;
        boolean z = true;
        while (true) {
            i = this.f74819;
            if (z && this.f74818 < i) {
                char cM50945 = m50945();
                if (cM50945 != '\f' && cM50945 != '\r' && cM50945 != ' ') {
                    if (cM50945 != '/') {
                        switch (cM50945) {
                            case '\b':
                            case '\t':
                            case '\n':
                                continue;
                        }
                        m50944();
                        z = false;
                    } else {
                        char cM50946 = m50945();
                        if (cM50946 == '/') {
                            while (this.f74818 < i && m50945() != '\n') {
                            }
                        } else if (cM50946 == '*') {
                            while (true) {
                                if (this.f74818 >= i || m50945() == '*') {
                                    if (this.f74818 >= i) {
                                        throw new Exception("EOF");
                                    }
                                    if (m50945() == '/') {
                                        break;
                                    }
                                }
                            }
                        } else {
                            m50944();
                            m50944();
                            z = false;
                        }
                    }
                }
            }
        }
        int i2 = this.f74818;
        if (i2 >= i) {
            return "";
        }
        this.f74817 = i2;
        char cM50947 = m50945();
        if (cM50947 == '!') {
            if (m50945() == '=') {
                return "!=";
            }
            m50944();
            return "!";
        }
        if (cM50947 != '\"' && cM50947 != '.') {
            if (cM50947 == '/') {
                if (m50945() == '=') {
                    return "/=";
                }
                m50944();
                return "/";
            }
            if (cM50947 != '[' && cM50947 != ']') {
                if (cM50947 == '^') {
                    if (m50945() == '=') {
                        return "^=";
                    }
                    m50944();
                    return "^";
                }
                switch (cM50947) {
                    case '%':
                        if (m50945() == '=') {
                            return "%=";
                        }
                        m50944();
                        return "%";
                    case '&':
                        char cM50948 = m50945();
                        if (cM50948 == '&') {
                            return "&&";
                        }
                        if (cM50948 == '=') {
                            return "&=";
                        }
                        m50944();
                        return a.p;
                    case '\'':
                    case '(':
                    case ')':
                    case ',':
                        break;
                    case '*':
                        if (m50945() == '=') {
                            return "*=";
                        }
                        m50944();
                        return "*";
                    case '+':
                        char cM50949 = m50945();
                        if (cM50949 == '+') {
                            return "++";
                        }
                        if (cM50949 == '=') {
                            return "+=";
                        }
                        m50944();
                        return BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX;
                    default:
                        switch (cM50947) {
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                            case '?':
                                break;
                            case '<':
                                char cM509410 = m50945();
                                if (cM509410 == '=') {
                                    return "<=";
                                }
                                if (cM509410 != '<') {
                                    m50944();
                                    return "<";
                                }
                                if (m50945() == '=') {
                                    return "<<=";
                                }
                                m50944();
                                return "<<";
                            case '=':
                                if (m50945() == '=') {
                                    return "==";
                                }
                                m50944();
                                return "=";
                            case '>':
                                char cM509411 = m50945();
                                if (cM509411 == '=') {
                                    return ">=";
                                }
                                if (cM509411 != '>') {
                                    m50944();
                                    return ">";
                                }
                                char cM509412 = m50945();
                                if (cM509412 == '>') {
                                    if (m50945() == '=') {
                                        return ">>>=";
                                    }
                                    m50944();
                                    return ">>>";
                                }
                                if (cM509412 == '=') {
                                    return ">>=";
                                }
                                m50944();
                                return ">>";
                            default:
                                switch (cM50947) {
                                    case '{':
                                    case q.h /* 125 */:
                                    case '~':
                                        break;
                                    case '|':
                                        char cM509413 = m50945();
                                        if (cM509413 == '|') {
                                            return "||";
                                        }
                                        if (cM509413 == '=') {
                                            return "|=";
                                        }
                                        m50944();
                                        return "|";
                                    default:
                                        boolean z2 = cM50947 == '-';
                                        if (z2) {
                                            cM50947 = m50945();
                                            if (cM50947 == '-') {
                                                return "--";
                                            }
                                            if (cM50947 == '=') {
                                                return "-=";
                                            }
                                        }
                                        boolean z3 = '0' <= cM50947 && cM50947 <= '9';
                                        if (!z3 && z2) {
                                            m50944();
                                            return "-";
                                        }
                                        if (!z3 && (('a' > cM50947 || cM50947 > 'z') && (('A' > cM50947 || cM50947 > 'Z') && cM50947 != '_' && cM50947 != '$' && (19968 > cM50947 || cM50947 > 40869)))) {
                                            throw new Exception("Unknown Token Start: " + cM50947);
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        if (z2) {
                                            sb.append('-');
                                        }
                                        while (true) {
                                            sb.append(cM50947);
                                            cM50947 = m50945();
                                            if (('a' <= cM50947 && cM50947 <= 'z') || (('A' <= cM50947 && cM50947 <= 'Z') || cM50947 == '_' || cM50947 == '$' || (19968 <= cM50947 && cM50947 <= 40869))) {
                                                z3 = false;
                                            } else if ('0' > cM50947 || cM50947 > '9') {
                                                if (!z3 || cM50947 != '.') {
                                                }
                                            }
                                        }
                                        m50944();
                                        return sb.toString();
                                }
                                break;
                        }
                        break;
                }
            }
        }
        return String.valueOf(cM50947);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50949(String str) throws Exception {
        String strM50951 = m50951();
        if (!strM50951.equals(str)) {
            throw new Exception(C7997.m21055("Invalid token: expected=", str, ", got=", strM50951));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m50947(String str) throws Exception {
        if (!str.equals("{")) {
            throw new Exception("Invalid token: expected={, got=".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m50944() {
        this.f74818--;
    }
}
