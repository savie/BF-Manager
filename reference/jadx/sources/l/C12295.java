package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۨۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1G7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12295 implements InterfaceC13530 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30688(String str) {
        System.out.println(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m30692(C0805 c0805) {
        while (c0805.m3232()) {
            switch (c0805.m3234()) {
                case '[':
                    return false;
                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                    c0805.m3240();
                    char cM3234 = c0805.m3234();
                    switch (cM3234) {
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
                            c0805.m3240();
                            break;
                        default:
                            switch (cM3234) {
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    c0805.m3240();
                                    break;
                                default:
                                    switch (cM3234) {
                                        case '[':
                                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                        case ']':
                                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                        case '_':
                                        case '`':
                                            c0805.m3240();
                                            break;
                                        default:
                                            switch (cM3234) {
                                                case '{':
                                                case '|':
                                                case q.h /* 125 */:
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            c0805.m3240();
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
                    c0805.m3240();
                    break;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30689(C0805 c0805) {
        char cM3234;
        if (c0805.m3232()) {
            if (c0805.m3235('<')) {
                while (c0805.m3232() && (cM3234 = c0805.m3234()) != '\n' && cM3234 != '<') {
                    if (cM3234 == '>') {
                        c0805.m3240();
                        return true;
                    }
                    if (cM3234 == '\\') {
                        c0805.m3240();
                        char cM3235 = c0805.m3234();
                        switch (cM3235) {
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
                                c0805.m3240();
                                break;
                            default:
                                switch (cM3235) {
                                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                        c0805.m3240();
                                        break;
                                    default:
                                        switch (cM3235) {
                                            case '[':
                                            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                            case ']':
                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                            case '_':
                                            case '`':
                                                c0805.m3240();
                                                break;
                                            default:
                                                switch (cM3235) {
                                                    case '{':
                                                    case '|':
                                                    case q.h /* 125 */:
                                                    case '~':
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                c0805.m3240();
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        c0805.m3240();
                    }
                }
            } else {
                boolean z = true;
                int i = 0;
                while (c0805.m3232()) {
                    char cM3236 = c0805.m3234();
                    if (cM3236 != ' ') {
                        if (cM3236 == '\\') {
                            c0805.m3240();
                            char cM3237 = c0805.m3234();
                            switch (cM3237) {
                                default:
                                    switch (cM3237) {
                                        default:
                                            switch (cM3237) {
                                                case '[':
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                case ']':
                                                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                case '_':
                                                case '`':
                                                    break;
                                                default:
                                                    switch (cM3237) {
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
                                            c0805.m3240();
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
                                    c0805.m3240();
                                    break;
                            }
                        } else if (cM3236 == '(') {
                            i++;
                            if (i <= 32) {
                                c0805.m3240();
                            }
                        } else if (cM3236 != ')') {
                            if (!Character.isISOControl(cM3236)) {
                                c0805.m3240();
                            }
                        } else {
                            if (i == 0) {
                                return true;
                            }
                            i--;
                            c0805.m3240();
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
    public static AbstractC13213 m30687(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException(C24966.m55772(cls, "Cannot create an instance of "));
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                C15243.m36586(objNewInstance);
                return (AbstractC13213) objNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(C24966.m55772(cls, "Cannot create an instance of "), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(C24966.m55772(cls, "Cannot create an instance of "), e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(C24966.m55772(cls, "Cannot create an instance of "), e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IndexOutOfBoundsException m30686(int i, int i2) {
        return new IndexOutOfBoundsException(C6934.m19217("index=", i, i2, ", length="));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m30691(C0805 c0805) {
        if (!c0805.m3232()) {
            return false;
        }
        char cM3234 = c0805.m3234();
        char c = '\"';
        if (cM3234 != '\"') {
            c = '\'';
            if (cM3234 != '\'') {
                if (cM3234 != '(') {
                    return false;
                }
                c = ')';
            }
        }
        c0805.m3240();
        if (!m30690(c0805, c) || !c0805.m3232()) {
            return false;
        }
        c0805.m3240();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30690(C0805 c0805, char c) {
        while (c0805.m3232()) {
            char cM3234 = c0805.m3234();
            if (cM3234 == '\\') {
                c0805.m3240();
                char cM3235 = c0805.m3234();
                switch (cM3235) {
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
                        c0805.m3240();
                        break;
                    default:
                        switch (cM3235) {
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                c0805.m3240();
                                break;
                            default:
                                switch (cM3235) {
                                    case '[':
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                    case ']':
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                    case '_':
                                    case '`':
                                        c0805.m3240();
                                        break;
                                    default:
                                        switch (cM3235) {
                                            case '{':
                                            case '|':
                                            case q.h /* 125 */:
                                            case '~':
                                                break;
                                            default:
                                                continue;
                                        }
                                        c0805.m3240();
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (cM3234 == c) {
                    return true;
                }
                if (c == ')' && cM3234 == '(') {
                    return false;
                }
                c0805.m3240();
            }
        }
        return true;
    }
}
