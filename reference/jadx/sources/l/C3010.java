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

/* JADX INFO: renamed from: l.ۗۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAVX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3010 implements InterfaceC11747, InterfaceC7950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C3010 f11260 = new C3010();

    @Override // l.InterfaceC11747
    /* JADX INFO: renamed from: ۙ */
    public final void mo1396(C23473 c23473, Object obj, Object obj2, Type type) {
        C13158 c13158 = c23473.f76006;
        if (obj == null) {
            if (type == Character.TYPE || type == Character.class) {
                c23473.m51726("");
                return;
            } else if ((c13158.f43818 & EnumC3984.WriteNullListAsEmpty.f14811) != 0 && Enumeration.class.isAssignableFrom(C8219.m21508(type))) {
                c13158.write("[]");
                return;
            } else {
                c13158.m32530();
                return;
            }
        }
        if (obj instanceof Pattern) {
            c23473.m51726(((Pattern) obj).pattern());
            return;
        }
        if (obj instanceof TimeZone) {
            c23473.m51726(((TimeZone) obj).getID());
            return;
        }
        if (obj instanceof Currency) {
            c23473.m51726(((Currency) obj).getCurrencyCode());
            return;
        }
        if (obj instanceof Class) {
            c23473.m51726(((Class) obj).getName());
            return;
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            if (ch.charValue() == 0) {
                c23473.m51726(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                return;
            } else {
                c23473.m51726(ch.toString());
                return;
            }
        }
        int i = 0;
        if (obj instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) obj).toPattern();
            if ((c13158.f43818 & EnumC3984.WriteClassName.f14811) != 0 && obj.getClass() != type) {
                c13158.write(123);
                c13158.m32533("@type", false);
                c23473.m51726(obj.getClass().getName());
                c13158.write(44);
                c13158.m32533("val", false);
                c13158.m32531(pattern);
                c13158.write(q.h);
                return;
            }
            c13158.m32531(pattern);
            return;
        }
        if (obj instanceof InterfaceC19909) {
            ((InterfaceC19909) obj).mo22399(c13158);
            return;
        }
        if (obj instanceof InterfaceC7208) {
            c13158.write(((InterfaceC7208) obj).mo19151());
            return;
        }
        if (obj instanceof InterfaceC10773) {
            ((InterfaceC10773) obj).m27075();
            return;
        }
        if (obj instanceof Enumeration) {
            Type type2 = ((c13158.f43818 & EnumC3984.WriteClassName.f14811) == 0 || !(type instanceof ParameterizedType)) ? null : ((ParameterizedType) type).getActualTypeArguments()[0];
            Enumeration enumeration = (Enumeration) obj;
            C22330 c22330 = c23473.f76000;
            c23473.m51727(c22330, obj, obj2);
            try {
                c13158.write(91);
                while (enumeration.hasMoreElements()) {
                    Object objNextElement = enumeration.nextElement();
                    int i2 = i + 1;
                    if (i != 0) {
                        c13158.write(44);
                    }
                    if (objNextElement == null) {
                        c13158.m32530();
                    } else {
                        c23473.f76005.m4271(objNextElement.getClass()).mo1396(c23473, objNextElement, Integer.valueOf(i), type2);
                    }
                    i = i2;
                }
                c13158.write(93);
                return;
            } finally {
                c23473.f76000 = c22330;
            }
        }
        c23473.m51726(obj.toString());
    }

    @Override // l.InterfaceC7950
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1395(C14265 c14265, Type type, Object obj) {
        Object objM34396;
        C2974 c2974 = c14265.f46690;
        String strM8840 = null;
        if (type == StackTraceElement.class) {
            if (c2974.m8859() == 8) {
                c2974.m8839();
                return null;
            }
            if (c2974.m8859() != 12 && c2974.m8859() != 16) {
                throw new C20614("syntax error: ".concat(C0735.m3199(c2974.m8859())));
            }
            int iM8836 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                String strM8827 = c2974.m8827(c14265.f46682);
                if (strM8827 == null) {
                    if (c2974.m8859() == 13) {
                        c2974.m8850(16);
                        break;
                    }
                    if (c2974.m8859() == 16) {
                        continue;
                    }
                }
                c2974.m8864();
                if ("className".equals(strM8827)) {
                    if (c2974.m8859() != 8) {
                        if (c2974.m8859() != 4) {
                            throw new C20614("syntax error");
                        }
                        strM8840 = c2974.m8840();
                    }
                    str = strM8840;
                } else if ("methodName".equals(strM8827)) {
                    if (c2974.m8859() != 8) {
                        if (c2974.m8859() != 4) {
                            throw new C20614("syntax error");
                        }
                        strM8840 = c2974.m8840();
                    }
                    str2 = strM8840;
                } else if ("fileName".equals(strM8827)) {
                    if (c2974.m8859() != 8) {
                        if (c2974.m8859() != 4) {
                            throw new C20614("syntax error");
                        }
                        strM8840 = c2974.m8840();
                    }
                    str3 = strM8840;
                } else if ("lineNumber".equals(strM8827)) {
                    if (c2974.m8859() == 8) {
                        iM8836 = 0;
                    } else {
                        if (c2974.m8859() != 2) {
                            throw new C20614("syntax error");
                        }
                        iM8836 = c2974.m8836();
                    }
                } else if ("nativeMethod".equals(strM8827)) {
                    if (c2974.m8859() != 8 && c2974.m8859() != 6 && c2974.m8859() != 7) {
                        throw new C20614("syntax error");
                    }
                    c2974.m8850(16);
                } else {
                    if (strM8827 != "@type") {
                        throw new C20614(C0252.m1693("syntax error : ", strM8827));
                    }
                    if (c2974.m8859() == 4) {
                        String strM8841 = c2974.m8840();
                        if (!strM8841.equals("java.lang.StackTraceElement")) {
                            throw new C20614("syntax error : ".concat(strM8841));
                        }
                    } else if (c2974.m8859() != 8) {
                        throw new C20614("syntax error");
                    }
                }
                if (c2974.m8859() == 13) {
                    c2974.m8850(16);
                    break;
                }
                strM8840 = null;
            }
            return new StackTraceElement(str, str2, str3, iM8836);
        }
        if (c14265.f46685 == 2) {
            c14265.f46685 = 0;
            c14265.m34400(16);
            if (c2974.m8859() != 4) {
                throw new C20614("syntax error");
            }
            if (!"val".equals(c2974.m8840())) {
                throw new C20614("syntax error");
            }
            c2974.m8839();
            c14265.m34400(17);
            objM34396 = c14265.m34396((Object) null);
            c14265.m34400(13);
        } else {
            objM34396 = c14265.m34396((Object) null);
        }
        if (objM34396 == null) {
            return null;
        }
        if (!(objM34396 instanceof String)) {
            if (objM34396 instanceof C15676) {
                C15676 c15676 = (C15676) objM34396;
                if (type == Currency.class) {
                    String strM37351 = c15676.m37351("currency");
                    if (strM37351 != null) {
                        return Currency.getInstance(strM37351);
                    }
                    String strM37352 = c15676.m37351("currencyCode");
                    if (strM37352 != null) {
                        return Currency.getInstance(strM37352);
                    }
                }
                if (type == Map.Entry.class) {
                    return c15676.entrySet().iterator().next();
                }
            }
            throw new C20614("except string value");
        }
        String str4 = (String) objM34396;
        if (str4.length() == 0) {
            return null;
        }
        if (type == UUID.class) {
            return UUID.fromString(str4);
        }
        if (type == Class.class) {
            c14265.f46686.getClass();
            return C8219.m21505(str4);
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
                throw new C20614("create url error", (Throwable) e);
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
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str4, c2974.f11143);
            simpleDateFormat.setTimeZone(c2974.f11133);
            return simpleDateFormat;
        }
        if (type != Character.TYPE && type != Character.class) {
            if (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName())) {
                return C12557.getTimeZone(str4);
            }
            try {
                return Class.forName("android.net.Uri").getMethod("parse", String.class).invoke(null, str4);
            } catch (Exception e2) {
                throw new C20614("parse android.net.Uri error.", (Throwable) e2);
            }
        }
        int i = C8219.f28613;
        if (str4.length() == 0) {
            return null;
        }
        if (str4.length() == 1) {
            return Character.valueOf(str4.charAt(0));
        }
        throw new C20614("can not cast to byte, value : " + ((Object) str4));
    }
}
