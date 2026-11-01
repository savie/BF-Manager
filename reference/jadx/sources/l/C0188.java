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

/* JADX INFO: renamed from: l.֡ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAUD */
/* JADX INFO: loaded from: classes2.dex */
public final class C0188 implements InterfaceC11747, InterfaceC7950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0188 f1309 = new C0188();

    @Override // l.InterfaceC11747
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1396(C23473 c23473, Object obj, Object obj2, Type type) throws IOException {
        Date time;
        char[] charArray;
        C13158 c13158 = c23473.f76006;
        TimeZone timeZone = c23473.f76008;
        Locale locale = c23473.f76010;
        if (obj == null) {
            c13158.m32530();
            return;
        }
        if ((c13158.f43818 & EnumC3984.WriteClassName.f14811) != 0 && obj.getClass() != type) {
            if (obj.getClass() == Date.class) {
                c13158.write("new Date(");
                c13158.m32535(((Date) obj).getTime());
                c13158.write(41);
                return;
            }
            c13158.write(123);
            c13158.m32533("@type", false);
            c23473.m51726(obj.getClass().getName());
            c13158.write(44);
            c13158.m32533("val", false);
            c13158.m32535(((Date) obj).getTime());
            c13158.write(q.h);
            return;
        }
        if (obj instanceof Calendar) {
            time = ((Calendar) obj).getTime();
        } else {
            time = (Date) obj;
        }
        if ((c13158.f43818 & EnumC3984.WriteDateUseDateFormat.f14811) != 0) {
            DateFormat dateFormatM51729 = c23473.m51729();
            if (dateFormatM51729 == null) {
                dateFormatM51729 = new SimpleDateFormat(AbstractC8620.f29745, locale);
                dateFormatM51729.setTimeZone(timeZone);
            }
            c13158.m32531(dateFormatM51729.format(time));
            return;
        }
        long time2 = time.getTime();
        int i = c13158.f43818;
        if ((EnumC3984.UseISO8601DateFormat.f14811 & i) != 0) {
            EnumC3984 enumC3984 = EnumC3984.UseSingleQuotes;
            if ((i & enumC3984.f14811) != 0) {
                c13158.write(39);
            } else {
                c13158.write(34);
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
                C13158.m32529(i8, 23, charArray);
                C13158.m32529(i7, 19, charArray);
                C13158.m32529(i6, 16, charArray);
                C13158.m32529(i5, 13, charArray);
                C13158.m32529(i4, 10, charArray);
                C13158.m32529(i3, 7, charArray);
                C13158.m32529(i2, 4, charArray);
            } else if (i7 == 0 && i6 == 0 && i5 == 0) {
                charArray = "0000-00-00".toCharArray();
                C13158.m32529(i4, 10, charArray);
                C13158.m32529(i3, 7, charArray);
                C13158.m32529(i2, 4, charArray);
            } else {
                charArray = "0000-00-00T00:00:00".toCharArray();
                C13158.m32529(i7, 19, charArray);
                C13158.m32529(i6, 16, charArray);
                C13158.m32529(i5, 13, charArray);
                C13158.m32529(i4, 10, charArray);
                C13158.m32529(i3, 7, charArray);
                C13158.m32529(i2, 4, charArray);
            }
            c13158.write(charArray);
            if ((c13158.f43818 & enumC3984.f14811) != 0) {
                c13158.write(39);
                return;
            } else {
                c13158.write(34);
                return;
            }
        }
        c13158.m32535(time2);
    }

    @Override // l.InterfaceC7950
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1395(C14265 c14265, Type type, Object obj) {
        return m1394(c14265, type, (String) null);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x017f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m1394(C14265 c14265, Type type, String str) {
        Object objM34396;
        String strM8840;
        Object time;
        Object obj;
        Date date;
        Calendar time2;
        Long lValueOf;
        C2974 c2974 = c14265.f46690;
        int iM8859 = c2974.m8859();
        int i = c2974.f11142;
        if (iM8859 == 2) {
            lValueOf = Long.valueOf(c2974.m8846());
            c2974.m8850(16);
        } else if (iM8859 == 4) {
            strM8840 = c2974.m8840();
            c2974.m8850(16);
            if ((i & EnumC9326.AllowISO8601DateFormat.f31669) != 0) {
                C2974 c2975 = new C2974(strM8840);
                if (c2975.m8852(true)) {
                    Calendar calendar = c2975.f11136;
                    if (type == Calendar.class) {
                        objM34396 = strM8840;
                        time = strM8840;
                        c2975.m8849();
                        return calendar;
                    }
                    objM34396 = strM8840;
                    time = strM8840;
                    time = calendar.getTime();
                }
                objM34396 = strM8840;
                time = strM8840;
                c2975.m8849();
                objM34396 = time;
            }
        } else if (iM8859 == 8) {
            c2974.m8839();
            objM34396 = null;
        } else if (iM8859 == 12) {
            c2974.m8839();
            if (c2974.m8859() != 4) {
                throw new C20614("syntax error");
            }
            if ("@type".equals(c2974.m8840())) {
                c2974.m8839();
                c14265.m34400(17);
                Class clsM3567 = c14265.f46686.m3567(c2974.m8840(), i, null);
                if (clsM3567 != null) {
                    type = clsM3567;
                }
                c14265.m34400(4);
                c14265.m34400(16);
            }
            c2974.m8864();
            int iM88510 = c2974.m8859();
            if (iM88510 != 2) {
                throw new C20614("syntax error : ".concat(C0735.m3199(iM88510)));
            }
            long jM8846 = c2974.m8846();
            c2974.m8839();
            Long lValueOf2 = Long.valueOf(jM8846);
            c14265.m34400(13);
            objM34396 = lValueOf2;
        } else if (c14265.f46685 == 2) {
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
            Object objM34397 = c14265.m34396((Object) null);
            c14265.m34400(13);
            objM34396 = objM34397;
        } else {
            objM34396 = c14265.m34396((Object) null);
        }
        if (objM34396 == null) {
            objM34396 = lValueOf;
            obj = objM34396;
            objM34396 = lValueOf;
            obj = null;
        } else if (!(objM34396 instanceof Date)) {
            if (objM34396 instanceof BigDecimal) {
                objM34396 = lValueOf;
                obj = objM34396;
                date = new Date(((BigDecimal) objM34396).longValueExact());
            } else if (objM34396 instanceof Number) {
                objM34396 = lValueOf;
                obj = objM34396;
                date = new Date(((Number) objM34396).longValue());
            } else {
                if (!(objM34396 instanceof String)) {
                    objM34396 = lValueOf;
                    obj = objM34396;
                    throw new C20614("parse error");
                }
                String str2 = (String) objM34396;
                if (str2.length() == 0) {
                    objM34396 = lValueOf;
                    obj = objM34396;
                    objM34396 = lValueOf;
                    obj = null;
                } else {
                    objM34396 = lValueOf;
                    obj = objM34396;
                    C2974 c2976 = new C2974(str2);
                    try {
                        if (c2976.m8852(false)) {
                            Calendar calendar2 = c2976.f11136;
                            if (type != Calendar.class) {
                                time2 = calendar2;
                                time2 = calendar2.getTime();
                            }
                            time2 = calendar2;
                            obj = time2;
                            c2976.m8849();
                        } else {
                            c2976.m8849();
                            if ("0000-00-00".equals(str2) || "0000-00-00T00:00:00".equalsIgnoreCase(str2) || "0001-01-01T00:00:00+08:00".equalsIgnoreCase(str2)) {
                                objM34396 = lValueOf;
                                obj = objM34396;
                                objM34396 = lValueOf;
                                obj = null;
                            } else {
                                try {
                                    obj = (str != null ? new SimpleDateFormat(str) : c14265.m34398()).parse(str2);
                                } catch (ParseException unused) {
                                    date = new Date(Long.parseLong(str2));
                                    obj = date;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        c2976.m8849();
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
        Calendar calendar3 = Calendar.getInstance(c2974.f11133, c2974.f11143);
        calendar3.setTime(date2);
        return calendar3;
    }
}
