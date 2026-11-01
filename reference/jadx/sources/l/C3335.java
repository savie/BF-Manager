package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import java.io.Closeable;
import java.io.IOException;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۗܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAX9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3335 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m9936(C6707 c6707) {
        while (c6707.m18132()) {
            switch (c6707.m18135()) {
                case '[':
                    return false;
                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                    c6707.m18138();
                    char cM18135 = c6707.m18135();
                    switch (cM18135) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        case '.':
                        case '/':
                            c6707.m18138();
                            break;
                        default:
                            switch (cM18135) {
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    c6707.m18138();
                                    break;
                                default:
                                    switch (cM18135) {
                                        case '[':
                                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                        case ']':
                                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                        case '_':
                                        case '`':
                                            c6707.m18138();
                                            break;
                                        default:
                                            switch (cM18135) {
                                                case '{':
                                                case '|':
                                                case q.h /* 125 */:
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            c6707.m18138();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case ']':
                    return true;
                default:
                    c6707.m18138();
                    break;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9933(C6707 c6707) {
        char cM18135;
        if (c6707.m18132()) {
            if (c6707.m18136('<')) {
                while (c6707.m18132() && (cM18135 = c6707.m18135()) != '\n' && cM18135 != '<') {
                    if (cM18135 == '>') {
                        c6707.m18138();
                        return true;
                    }
                    if (cM18135 == '\\') {
                        c6707.m18138();
                        char cM18136 = c6707.m18135();
                        switch (cM18136) {
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                            case '&':
                            case '\'':
                            case '(':
                            case ')':
                            case '*':
                            case '+':
                            case ',':
                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            case '.':
                            case '/':
                                c6707.m18138();
                                break;
                            default:
                                switch (cM18136) {
                                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                        c6707.m18138();
                                        break;
                                    default:
                                        switch (cM18136) {
                                            case '[':
                                            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                            case ']':
                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                            case '_':
                                            case '`':
                                                c6707.m18138();
                                                break;
                                            default:
                                                switch (cM18136) {
                                                    case '{':
                                                    case '|':
                                                    case q.h /* 125 */:
                                                    case '~':
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                c6707.m18138();
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        c6707.m18138();
                    }
                }
            } else {
                boolean z = true;
                int i = 0;
                while (c6707.m18132()) {
                    char cM18137 = c6707.m18135();
                    if (cM18137 != ' ') {
                        if (cM18137 == '\\') {
                            c6707.m18138();
                            char cM18138 = c6707.m18135();
                            switch (cM18138) {
                                default:
                                    switch (cM18138) {
                                        default:
                                            switch (cM18138) {
                                                case '[':
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                case ']':
                                                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                case '_':
                                                case '`':
                                                    break;
                                                default:
                                                    switch (cM18138) {
                                                        case '{':
                                                        case '|':
                                                        case q.h /* 125 */:
                                                        case '~':
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    break;
                                            }
                                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                        case '<':
                                        case '=':
                                        case '>':
                                        case '?':
                                        case '@':
                                            c6707.m18138();
                                            break;
                                    }
                                case '!':
                                case '\"':
                                case '#':
                                case '$':
                                case '%':
                                case '&':
                                case '\'':
                                case '(':
                                case ')':
                                case '*':
                                case '+':
                                case ',':
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                case '.':
                                case '/':
                                    c6707.m18138();
                                    break;
                            }
                        } else if (cM18137 == '(') {
                            i++;
                            if (i <= 32) {
                                c6707.m18138();
                            }
                        } else if (cM18137 != ')') {
                            if (!Character.isISOControl(cM18137)) {
                                c6707.m18138();
                            }
                        } else {
                            if (i == 0) {
                                return true;
                            }
                            i--;
                            c6707.m18138();
                        }
                        z = false;
                    }
                    return !z;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m9932(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C13672.m33380(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9930(InterfaceC10768 interfaceC10768) {
        StringBuilder sb = new StringBuilder("{");
        int iMo2107 = interfaceC10768.mo2107();
        if (iMo2107 == 1) {
            sb.append(am.aE);
            sb.append(interfaceC10768.mo3085());
        } else if (iMo2107 == 2) {
            sb.append(am.aE);
            sb.append(interfaceC10768.mo3085());
            sb.append(", v");
            sb.append(interfaceC10768.mo3087());
        } else if (iMo2107 == 3) {
            sb.append(am.aE);
            sb.append(interfaceC10768.mo3085());
            sb.append(", v");
            sb.append(interfaceC10768.mo3087());
            sb.append(", v");
            sb.append(interfaceC10768.mo3089());
        } else if (iMo2107 == 4) {
            sb.append(am.aE);
            sb.append(interfaceC10768.mo3085());
            sb.append(", v");
            sb.append(interfaceC10768.mo3087());
            sb.append(", v");
            sb.append(interfaceC10768.mo3089());
            sb.append(", v");
            sb.append(interfaceC10768.mo3086());
        } else if (iMo2107 == 5) {
            sb.append(am.aE);
            sb.append(interfaceC10768.mo3085());
            sb.append(", v");
            sb.append(interfaceC10768.mo3087());
            sb.append(", v");
            sb.append(interfaceC10768.mo3089());
            sb.append(", v");
            sb.append(interfaceC10768.mo3086());
            sb.append(", v");
            sb.append(interfaceC10768.mo3088());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9935(C6707 c6707) {
        if (!c6707.m18132()) {
            return false;
        }
        char cM18135 = c6707.m18135();
        char c = '\"';
        if (cM18135 != '\"') {
            c = '\'';
            if (cM18135 != '\'') {
                if (cM18135 != '(') {
                    return false;
                }
                c = ')';
            }
        }
        c6707.m18138();
        if (!m9934(c6707, c) || !c6707.m18132()) {
            return false;
        }
        c6707.m18138();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9931(InterfaceC11742 interfaceC11742) {
        int iMo2107 = interfaceC11742.mo2107();
        if (iMo2107 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{v");
        int iMo2109 = interfaceC11742.mo2109();
        sb.append(iMo2109);
        sb.append(" .. v");
        sb.append((iMo2109 + iMo2107) - 1);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9934(C6707 c6707, char c) {
        while (c6707.m18132()) {
            char cM18135 = c6707.m18135();
            if (cM18135 == '\\') {
                c6707.m18138();
                char cM18136 = c6707.m18135();
                switch (cM18136) {
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case '.':
                    case '/':
                        c6707.m18138();
                        break;
                    default:
                        switch (cM18136) {
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                c6707.m18138();
                                break;
                            default:
                                switch (cM18136) {
                                    case '[':
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                    case ']':
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                    case '_':
                                    case '`':
                                        c6707.m18138();
                                        break;
                                    default:
                                        switch (cM18136) {
                                            case '{':
                                            case '|':
                                            case q.h /* 125 */:
                                            case '~':
                                                break;
                                            default:
                                                continue;
                                        }
                                        c6707.m18138();
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (cM18135 == c) {
                    return true;
                }
                if (c == ')' && cM18135 == '(') {
                    return false;
                }
                c6707.m18138();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9929(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }
}
