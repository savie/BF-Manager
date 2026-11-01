package l;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: renamed from: l.ܰܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAUX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13864 implements InterfaceC11747, InterfaceC7950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C13864 f45705 = new C13864();

    @Override // l.InterfaceC11747
    /* JADX INFO: renamed from: ۙ */
    public final void mo1396(C23473 c23473, Object obj, Object obj2, Type type) {
        C13158 c13158 = c23473.f76006;
        if (obj == null) {
            if ((c13158.f43818 & EnumC3984.WriteNullNumberAsZero.f14811) != 0) {
                c13158.write(48);
                return;
            } else {
                c13158.m32530();
                return;
            }
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (Float.isNaN(fFloatValue)) {
                c13158.m32530();
                return;
            }
            if (Float.isInfinite(fFloatValue)) {
                c13158.m32530();
                return;
            }
            String string = Float.toString(fFloatValue);
            if (string.endsWith(".0")) {
                string = C20630.m46498(2, 0, string);
            }
            c13158.write(string);
            if ((c13158.f43818 & EnumC3984.WriteClassName.f14811) != 0) {
                c13158.write(70);
                return;
            }
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue)) {
            c13158.m32530();
            return;
        }
        if (Double.isInfinite(dDoubleValue)) {
            c13158.m32530();
            return;
        }
        String string2 = Double.toString(dDoubleValue);
        if (string2.endsWith(".0")) {
            string2 = C20630.m46498(2, 0, string2);
        }
        c13158.append((CharSequence) string2);
        if ((c13158.f43818 & EnumC3984.WriteClassName.f14811) != 0) {
            c13158.write(68);
        }
    }

    @Override // l.InterfaceC7950
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1395(C14265 c14265, Type type, Object obj) {
        C2974 c2974 = c14265.f46690;
        int iM8859 = c2974.m8859();
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        if (iM8859 == 2) {
            if (type == cls4 || type == Double.class) {
                String strM8854 = c2974.m8854();
                c2974.m8850(16);
                return Double.valueOf(Double.parseDouble(strM8854));
            }
            if (type == cls3 || type == Float.class) {
                String strM8855 = c2974.m8854();
                c2974.m8850(16);
                return Float.valueOf(Float.parseFloat(strM8855));
            }
            long jM8846 = c2974.m8846();
            c2974.m8850(16);
            if (type != cls2 && type != Short.class) {
                if (type == cls || type == Byte.class) {
                    return Byte.valueOf((byte) jM8846);
                }
                if (jM8846 >= -2147483648L && jM8846 <= 2147483647L) {
                    return Integer.valueOf((int) jM8846);
                }
                return Long.valueOf(jM8846);
            }
            return Short.valueOf((short) jM8846);
        }
        if (iM8859 == 3) {
            if (type == cls4 || type == Double.class) {
                String strM8856 = c2974.m8854();
                c2974.m8850(16);
                return Double.valueOf(Double.parseDouble(strM8856));
            }
            if (type == cls3 || type == Float.class) {
                String strM8857 = c2974.m8854();
                c2974.m8850(16);
                return Float.valueOf(Float.parseFloat(strM8857));
            }
            BigDecimal bigDecimalM8844 = c2974.m8844();
            c2974.m8850(16);
            if (type == cls2 || type == Short.class) {
                return Short.valueOf(bigDecimalM8844.shortValueExact());
            }
            return (type == cls || type == Byte.class) ? Byte.valueOf(bigDecimalM8844.byteValueExact()) : bigDecimalM8844;
        }
        Object objM34396 = c14265.m34396((Object) null);
        if (objM34396 == null) {
            return null;
        }
        if (type == cls4 || type == Double.class) {
            return C8219.m21536(objM34396);
        }
        if (type == cls3 || type == Float.class) {
            return C8219.m21503(objM34396);
        }
        if (type != cls2 && type != Short.class) {
            if (type == cls || type == Byte.class) {
                return C8219.m21504(objM34396);
            }
            return C8219.m21516(objM34396);
        }
        return C8219.m21524(objM34396);
    }
}
