package l;

import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ܿ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAUD */
/* JADX INFO: loaded from: classes5.dex */
public final class C18641 implements InterfaceC10591, InterfaceC3725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C18641 f60610 = new C18641();

    @Override // l.InterfaceC10591
    /* JADX INFO: renamed from: ۙ */
    public final void mo3063(C9690 c9690, Object obj, Object obj2, Type type) throws IOException {
        Date time;
        char[] charArray;
        C5372 c5372 = c9690.f31276;
        TimeZone timeZone = c9690.f31281;
        Locale locale = c9690.f31280;
        if (obj == null) {
            c5372.m16046();
            return;
        }
        if ((c5372.f18847 & EnumC1643.WriteClassName.f5702) != 0 && obj.getClass() != type) {
            if (obj.getClass() == Date.class) {
                c5372.write("new Date(");
                c5372.m16051(((Date) obj).getTime());
                c5372.write(41);
                return;
            }
            c5372.write(123);
            c5372.m16049("@type", false);
            c9690.m25278(obj.getClass().getName());
            c5372.write(44);
            c5372.m16049("val", false);
            c5372.m16051(((Date) obj).getTime());
            c5372.write(q.h);
            return;
        }
        if (obj instanceof Calendar) {
            time = ((Calendar) obj).getTime();
        } else {
            time = (Date) obj;
        }
        if ((c5372.f18847 & EnumC1643.WriteDateUseDateFormat.f5702) != 0) {
            DateFormat dateFormatM25281 = c9690.m25281();
            if (dateFormatM25281 == null) {
                dateFormatM25281 = new SimpleDateFormat(AbstractC12454.f40026, locale);
                dateFormatM25281.setTimeZone(timeZone);
            }
            c5372.m16047(dateFormatM25281.format(time));
            return;
        }
        long time2 = time.getTime();
        int i = c5372.f18847;
        if ((EnumC1643.UseISO8601DateFormat.f5702 & i) != 0) {
            EnumC1643 enumC1643 = EnumC1643.UseSingleQuotes;
            if ((i & enumC1643.f5702) != 0) {
                c5372.write(39);
            } else {
                c5372.write(34);
            }
            Calendar calendar = Calendar.getInstance(timeZone, locale);
            calendar.setTimeInMillis(time2);
            int i2 = calendar.get(1);
            int i3 = calendar.get(2) + 1;
            int i4 = calendar.get(5);
            int i5 = calendar.get(11);
            int i6 = calendar.get(12);
            int i7 = calendar.get(13);
            int i8 = calendar.get(14);
            if (i8 != 0) {
                charArray = "0000-00-00T00:00:00.000".toCharArray();
                C5372.m16045(i8, 23, charArray);
                C5372.m16045(i7, 19, charArray);
                C5372.m16045(i6, 16, charArray);
                C5372.m16045(i5, 13, charArray);
                C5372.m16045(i4, 10, charArray);
                C5372.m16045(i3, 7, charArray);
                C5372.m16045(i2, 4, charArray);
            } else if (i7 == 0 && i6 == 0 && i5 == 0) {
                charArray = "0000-00-00".toCharArray();
                C5372.m16045(i4, 10, charArray);
                C5372.m16045(i3, 7, charArray);
                C5372.m16045(i2, 4, charArray);
            } else {
                charArray = "0000-00-00T00:00:00".toCharArray();
                C5372.m16045(i7, 19, charArray);
                C5372.m16045(i6, 16, charArray);
                C5372.m16045(i5, 13, charArray);
                C5372.m16045(i4, 10, charArray);
                C5372.m16045(i3, 7, charArray);
                C5372.m16045(i2, 4, charArray);
            }
            c5372.write(charArray);
            if ((c5372.f18847 & enumC1643.f5702) != 0) {
                c5372.write(39);
                return;
            } else {
                c5372.write(34);
                return;
            }
        }
        c5372.m16051(time2);
    }

    @Override // l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12124(C2759 c2759, Type type, Object obj) {
        return m43394(c2759, type, (String) null);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x017f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m43394(C2759 c2759, Type type, String str) {
        Object objM9106;
        String strM33979;
        Object time;
        Object obj;
        Date date;
        Calendar time2;
        Long lValueOf;
        C13945 c13945 = c2759.f9128;
        int iM33938 = c13945.m33938();
        int i = c13945.f44213;
        if (iM33938 == 2) {
            lValueOf = Long.valueOf(c13945.m33950());
            c13945.m33973(16);
        } else if (iM33938 == 4) {
            strM33979 = c13945.m33979();
            c13945.m33973(16);
            if ((i & EnumC7234.AllowISO8601DateFormat.f23858) != 0) {
                C13945 c13946 = new C13945(strM33979);
                if (c13946.m33975(true)) {
                    Calendar calendar = c13946.f44219;
                    if (type == Calendar.class) {
                        objM9106 = strM33979;
                        time = strM33979;
                        c13946.m33972();
                        return calendar;
                    }
                    objM9106 = strM33979;
                    time = strM33979;
                    time = calendar.getTime();
                }
                objM9106 = strM33979;
                time = strM33979;
                c13946.m33972();
                objM9106 = time;
            }
        } else if (iM33938 == 8) {
            c13945.m33956();
            objM9106 = null;
        } else if (iM33938 == 12) {
            c13945.m33956();
            if (c13945.m33938() != 4) {
                throw new C4251("syntax error");
            }
            if ("@type".equals(c13945.m33979())) {
                c13945.m33956();
                c2759.m9110(17);
                Class clsM33059 = c2759.f9130.m33059(c13945.m33979(), i, null);
                if (clsM33059 != null) {
                    type = clsM33059;
                }
                c2759.m9110(4);
                c2759.m9110(16);
            }
            c13945.m33980();
            int iM33939 = c13945.m33938();
            if (iM33939 != 2) {
                throw new C4251("syntax error : ".concat(C11109.m28059(iM33939)));
            }
            long jM33950 = c13945.m33950();
            c13945.m33956();
            Long lValueOf2 = Long.valueOf(jM33950);
            c2759.m9110(13);
            objM9106 = lValueOf2;
        } else if (c2759.f9124 == 2) {
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
            Object objM9107 = c2759.m9106((Object) null);
            c2759.m9110(13);
            objM9106 = objM9107;
        } else {
            objM9106 = c2759.m9106((Object) null);
        }
        if (objM9106 == null) {
            objM9106 = lValueOf;
            obj = objM9106;
            objM9106 = lValueOf;
            obj = null;
        } else if (!(objM9106 instanceof Date)) {
            if (objM9106 instanceof BigDecimal) {
                objM9106 = lValueOf;
                obj = objM9106;
                date = new Date(((BigDecimal) objM9106).longValueExact());
            } else if (objM9106 instanceof Number) {
                objM9106 = lValueOf;
                obj = objM9106;
                date = new Date(((Number) objM9106).longValue());
            } else {
                if (!(objM9106 instanceof String)) {
                    objM9106 = lValueOf;
                    obj = objM9106;
                    throw new C4251("parse error");
                }
                String str2 = (String) objM9106;
                if (str2.length() == 0) {
                    objM9106 = lValueOf;
                    obj = objM9106;
                    objM9106 = lValueOf;
                    obj = null;
                } else {
                    objM9106 = lValueOf;
                    obj = objM9106;
                    C13945 c13947 = new C13945(str2);
                    try {
                        if (c13947.m33975(false)) {
                            Calendar calendar2 = c13947.f44219;
                            if (type != Calendar.class) {
                                time2 = calendar2;
                                time2 = calendar2.getTime();
                            }
                            time2 = calendar2;
                            obj = time2;
                            c13947.m33972();
                        } else {
                            c13947.m33972();
                            if ("0000-00-00".equals(str2) || "0000-00-00T00:00:00".equalsIgnoreCase(str2) || "0001-01-01T00:00:00+08:00".equalsIgnoreCase(str2)) {
                                objM9106 = lValueOf;
                                obj = objM9106;
                                objM9106 = lValueOf;
                                obj = null;
                            } else {
                                try {
                                    obj = (str != null ? new SimpleDateFormat(str) : c2759.m9108()).parse(str2);
                                } catch (ParseException unused) {
                                    date = new Date(Long.parseLong(str2));
                                    obj = date;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        c13947.m33972();
                        throw th;
                    }
                }
            }
            obj = date;
        }
        if (type != Calendar.class || (obj instanceof Calendar)) {
            return obj;
        }
        Date date2 = (Date) obj;
        if (date2 == null) {
            return null;
        }
        Calendar calendar3 = Calendar.getInstance(c13945.f44208, c13945.f44223);
        calendar3.setTime(date2);
        return calendar3;
    }
}
