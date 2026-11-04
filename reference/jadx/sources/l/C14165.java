package l;

import com.alipay.sdk.m.y.q;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.۬᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAVX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14165 implements InterfaceC10591, InterfaceC3725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C14165 f44790 = new C14165();

    @Override // l.InterfaceC10591
    /* JADX INFO: renamed from: ۙ */
    public final void mo3063(C9690 c9690, Object obj, Object obj2, Type type) {
        C5372 c5372 = c9690.f31276;
        if (obj == null) {
            if (type == Character.TYPE || type == Character.class) {
                c9690.m25278("");
                return;
            } else if ((c5372.f18847 & EnumC1643.WriteNullListAsEmpty.f5702) != 0 && Enumeration.class.isAssignableFrom(C3134.m10213(type))) {
                c5372.write("[]");
                return;
            } else {
                c5372.m16046();
                return;
            }
        }
        if (obj instanceof Pattern) {
            c9690.m25278(((Pattern) obj).pattern());
            return;
        }
        if (obj instanceof TimeZone) {
            c9690.m25278(((TimeZone) obj).getID());
            return;
        }
        if (obj instanceof Currency) {
            c9690.m25278(((Currency) obj).getCurrencyCode());
            return;
        }
        if (obj instanceof Class) {
            c9690.m25278(((Class) obj).getName());
            return;
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            if (ch.charValue() == 0) {
                c9690.m25278(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                return;
            } else {
                c9690.m25278(ch.toString());
                return;
            }
        }
        int i = 0;
        if (obj instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) obj).toPattern();
            if ((c5372.f18847 & EnumC1643.WriteClassName.f5702) != 0 && obj.getClass() != type) {
                c5372.write(123);
                c5372.m16049("@type", false);
                c9690.m25278(obj.getClass().getName());
                c5372.write(44);
                c5372.m16049("val", false);
                c5372.m16047(pattern);
                c5372.write(q.h);
                return;
            }
            c5372.m16047(pattern);
            return;
        }
        if (obj instanceof InterfaceC21405) {
            ((InterfaceC21405) obj).mo30928(c5372);
            return;
        }
        if (obj instanceof InterfaceC24389) {
            c5372.write(((InterfaceC24389) obj).mo30929());
            return;
        }
        if (obj instanceof InterfaceC1488) {
            ((InterfaceC1488) obj).m5314();
            return;
        }
        if (obj instanceof Enumeration) {
            Type type2 = ((c5372.f18847 & EnumC1643.WriteClassName.f5702) == 0 || !(type instanceof ParameterizedType)) ? null : ((ParameterizedType) type).getActualTypeArguments()[0];
            Enumeration enumeration = (Enumeration) obj;
            C15066 c15066 = c9690.f31285;
            c9690.m25279(c15066, obj, obj2);
            try {
                c5372.write(91);
                while (enumeration.hasMoreElements()) {
                    Object objNextElement = enumeration.nextElement();
                    int i2 = i + 1;
                    if (i != 0) {
                        c5372.write(44);
                    }
                    if (objNextElement == null) {
                        c5372.m16046();
                    } else {
                        c9690.f31277.m31835(objNextElement.getClass()).mo3063(c9690, objNextElement, Integer.valueOf(i), type2);
                    }
                    i = i2;
                }
                c5372.write(93);
                return;
            } finally {
                c9690.f31285 = c15066;
            }
        }
        c9690.m25278(obj.toString());
    }

    @Override // l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12124(C2759 c2759, Type type, Object obj) {
        Object objM9106;
        C13945 c13945 = c2759.f9128;
        String strM33979 = null;
        if (type == StackTraceElement.class) {
            if (c13945.m33938() == 8) {
                c13945.m33956();
                return null;
            }
            if (c13945.m33938() != 12 && c13945.m33938() != 16) {
                throw new C4251("syntax error: ".concat(C11109.m28059(c13945.m33938())));
            }
            int iM33968 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                String strM33941 = c13945.m33941(c2759.f9125);
                if (strM33941 == null) {
                    if (c13945.m33938() == 13) {
                        c13945.m33973(16);
                        break;
                    }
                    if (c13945.m33938() == 16) {
                        continue;
                    }
                }
                c13945.m33980();
                if ("className".equals(strM33941)) {
                    if (c13945.m33938() != 8) {
                        if (c13945.m33938() != 4) {
                            throw new C4251("syntax error");
                        }
                        strM33979 = c13945.m33979();
                    }
                    str = strM33979;
                } else if ("methodName".equals(strM33941)) {
                    if (c13945.m33938() != 8) {
                        if (c13945.m33938() != 4) {
                            throw new C4251("syntax error");
                        }
                        strM33979 = c13945.m33979();
                    }
                    str2 = strM33979;
                } else if ("fileName".equals(strM33941)) {
                    if (c13945.m33938() != 8) {
                        if (c13945.m33938() != 4) {
                            throw new C4251("syntax error");
                        }
                        strM33979 = c13945.m33979();
                    }
                    str3 = strM33979;
                } else if ("lineNumber".equals(strM33941)) {
                    if (c13945.m33938() == 8) {
                        iM33968 = 0;
                    } else {
                        if (c13945.m33938() != 2) {
                            throw new C4251("syntax error");
                        }
                        iM33968 = c13945.m33968();
                    }
                } else if ("nativeMethod".equals(strM33941)) {
                    if (c13945.m33938() != 8 && c13945.m33938() != 6 && c13945.m33938() != 7) {
                        throw new C4251("syntax error");
                    }
                    c13945.m33973(16);
                } else {
                    if (strM33941 != "@type") {
                        throw new C4251(C25272.m56409("syntax error : ", strM33941));
                    }
                    if (c13945.m33938() == 4) {
                        String strM339710 = c13945.m33979();
                        if (!strM339710.equals("java.lang.StackTraceElement")) {
                            throw new C4251("syntax error : ".concat(strM339710));
                        }
                    } else if (c13945.m33938() != 8) {
                        throw new C4251("syntax error");
                    }
                }
                if (c13945.m33938() == 13) {
                    c13945.m33973(16);
                    break;
                }
                strM33979 = null;
            }
            return new StackTraceElement(str, str2, str3, iM33968);
        }
        if (c2759.f9124 == 2) {
            c2759.f9124 = 0;
            c2759.m9110(16);
            if (c13945.m33938() != 4) {
                throw new C4251("syntax error");
            }
            if (!"val".equals(c13945.m33979())) {
                throw new C4251("syntax error");
            }
            c13945.m33956();
            c2759.m9110(17);
            objM9106 = c2759.m9106((Object) null);
            c2759.m9110(13);
        } else {
            objM9106 = c2759.m9106((Object) null);
        }
        if (objM9106 == null) {
            return null;
        }
        if (!(objM9106 instanceof String)) {
            if (objM9106 instanceof C14691) {
                C14691 c14691 = (C14691) objM9106;
                if (type == Currency.class) {
                    String strM35343 = c14691.m35343("currency");
                    if (strM35343 != null) {
                        return Currency.getInstance(strM35343);
                    }
                    String strM35344 = c14691.m35343("currencyCode");
                    if (strM35344 != null) {
                        return Currency.getInstance(strM35344);
                    }
                }
                if (type == Map.Entry.class) {
                    return c14691.entrySet().iterator().next();
                }
            }
            throw new C4251("except string value");
        }
        String str4 = (String) objM9106;
        if (str4.length() == 0) {
            return null;
        }
        if (type == UUID.class) {
            return UUID.fromString(str4);
        }
        if (type == Class.class) {
            c2759.f9130.getClass();
            return C3134.m10244(str4);
        }
        if (type == Locale.class) {
            String[] strArrSplit = str4.split("_");
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
            return strArrSplit.length == 2 ? new Locale(strArrSplit[0], strArrSplit[1]) : new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        }
        if (type == URI.class) {
            return URI.create(str4);
        }
        if (type == URL.class) {
            try {
                return new URL(str4);
            } catch (MalformedURLException e) {
                throw new C4251("create url error", (Throwable) e);
            }
        }
        if (type == Pattern.class) {
            return Pattern.compile(str4);
        }
        if (type == Charset.class) {
            return Charset.forName(str4);
        }
        if (type == Currency.class) {
            return Currency.getInstance(str4);
        }
        if (type == SimpleDateFormat.class) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str4, c13945.f44223);
            simpleDateFormat.setTimeZone(c13945.f44208);
            return simpleDateFormat;
        }
        if (type != Character.TYPE && type != Character.class) {
            if (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName())) {
                return C10646.getTimeZone(str4);
            }
            try {
                return Class.forName("android.net.Uri").getMethod("parse", String.class).invoke(null, str4);
            } catch (Exception e2) {
                throw new C4251("parse android.net.Uri error.", (Throwable) e2);
            }
        }
        int i = C3134.f10148;
        if (str4.length() == 0) {
            return null;
        }
        if (str4.length() == 1) {
            return Character.valueOf(str4.charAt(0));
        }
        throw new C4251("can not cast to byte, value : " + ((Object) str4));
    }
}
