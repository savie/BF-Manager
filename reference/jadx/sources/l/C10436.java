package l;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: renamed from: l.ۢ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAUP */
/* JADX INFO: loaded from: classes4.dex */
public final class C10436 implements InterfaceC10591, InterfaceC3725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10436 f33163 = new C10436();

    @Override // l.InterfaceC10591
    /* JADX INFO: renamed from: ۙ */
    public final void mo3063(C9690 c9690, Object obj, Object obj2, Type type) {
        C5372 c5372 = c9690.f31276;
        Number number = (Number) obj;
        if (number == null) {
            if ((c5372.f18847 & EnumC1643.WriteNullNumberAsZero.f5702) != 0) {
                c5372.write(48);
                return;
            } else {
                c5372.m16046();
                return;
            }
        }
        if (obj instanceof Long) {
            c5372.m16051(number.longValue());
        } else {
            c5372.writeInt(number.intValue());
        }
        if ((c5372.f18847 & EnumC1643.WriteClassName.f5702) != 0) {
            Class<?> cls = number.getClass();
            if (cls == Byte.class) {
                c5372.write(66);
                return;
            }
            if (cls == Short.class) {
                c5372.write(83);
                return;
            }
            if (cls == Long.class) {
                long jLongValue = number.longValue();
                if (jLongValue > 2147483647L || jLongValue < -2147483648L || type == Long.class) {
                    return;
                }
                c5372.write(76);
            }
        }
    }

    @Override // l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12124(C2759 c2759, Type type, Object obj) {
        Object objValueOf;
        C13945 c13945 = c2759.f9128;
        int iM33938 = c13945.m33938();
        if (iM33938 == 8) {
            c13945.m33973(16);
            return null;
        }
        Class cls = Long.TYPE;
        if (iM33938 == 2) {
            if (type == cls || type == Long.class) {
                objValueOf = Long.valueOf(c13945.m33950());
            } else {
                try {
                    objValueOf = Integer.valueOf(c13945.m33968());
                } catch (NumberFormatException e) {
                    throw new C4251(C14483.m34971("int value overflow, field : ", obj), (Throwable) e);
                }
            }
            c13945.m33973(16);
            return objValueOf;
        }
        if (iM33938 == 3) {
            BigDecimal bigDecimalM33953 = c13945.m33953();
            c13945.m33973(16);
            return (type == cls || type == Long.class) ? Long.valueOf(bigDecimalM33953.longValueExact()) : Integer.valueOf(bigDecimalM33953.intValueExact());
        }
        Object objM9106 = c2759.m9106((Object) null);
        try {
            return (type == cls || type == Long.class) ? C3134.m10212(objM9106) : C3134.m10228(objM9106);
        } catch (Exception e2) {
            throw new C4251("cast error, field : " + obj + ", value " + objM9106, (Throwable) e2);
        }
    }
}
