package l;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: renamed from: l.ۛۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAUP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5833 implements InterfaceC11747, InterfaceC7950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5833 f19793 = new C5833();

    @Override // l.InterfaceC11747
    /* JADX INFO: renamed from: ۙ */
    public final void mo1396(C23473 c23473, Object obj, Object obj2, Type type) {
        C13158 c13158 = c23473.f76006;
        Number number = (Number) obj;
        if (number == null) {
            if ((c13158.f43818 & EnumC3984.WriteNullNumberAsZero.f14811) != 0) {
                c13158.write(48);
                return;
            } else {
                c13158.m32530();
                return;
            }
        }
        if (obj instanceof Long) {
            c13158.m32535(number.longValue());
        } else {
            c13158.writeInt(number.intValue());
        }
        if ((c13158.f43818 & EnumC3984.WriteClassName.f14811) != 0) {
            Class<?> cls = number.getClass();
            if (cls == Byte.class) {
                c13158.write(66);
                return;
            }
            if (cls == Short.class) {
                c13158.write(83);
                return;
            }
            if (cls == Long.class) {
                long jLongValue = number.longValue();
                if (jLongValue > 2147483647L || jLongValue < -2147483648L || type == Long.class) {
                    return;
                }
                c13158.write(76);
            }
        }
    }

    @Override // l.InterfaceC7950
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1395(C14265 c14265, Type type, Object obj) {
        Object objValueOf;
        C2974 c2974 = c14265.f46690;
        int iM8859 = c2974.m8859();
        if (iM8859 == 8) {
            c2974.m8850(16);
            return null;
        }
        Class cls = Long.TYPE;
        if (iM8859 == 2) {
            if (type == cls || type == Long.class) {
                objValueOf = Long.valueOf(c2974.m8846());
            } else {
                try {
                    objValueOf = Integer.valueOf(c2974.m8836());
                } catch (NumberFormatException e) {
                    throw new C20614(C9023.m23354(obj, "int value overflow, field : "), (Throwable) e);
                }
            }
            c2974.m8850(16);
            return objValueOf;
        }
        if (iM8859 == 3) {
            BigDecimal bigDecimalM8844 = c2974.m8844();
            c2974.m8850(16);
            return (type == cls || type == Long.class) ? Long.valueOf(bigDecimalM8844.longValueExact()) : Integer.valueOf(bigDecimalM8844.intValueExact());
        }
        Object objM34396 = c14265.m34396((Object) null);
        try {
            return (type == cls || type == Long.class) ? C8219.m21507(objM34396) : C8219.m21529(objM34396);
        } catch (Exception e2) {
            throw new C20614("cast error, field : " + obj + ", value " + objM34396, (Throwable) e2);
        }
    }
}
