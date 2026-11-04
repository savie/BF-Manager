package l;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: renamed from: l.᩷ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAUX */
/* JADX INFO: loaded from: classes.dex */
public final class C21780 implements InterfaceC10591, InterfaceC3725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C21780 f69456 = new C21780();

    @Override // l.InterfaceC10591
    /* JADX INFO: renamed from: ۙ */
    public final void mo3063(C9690 c9690, Object obj, Object obj2, Type type) {
        C5372 c5372 = c9690.f31276;
        if (obj == null) {
            if ((c5372.f18847 & EnumC1643.WriteNullNumberAsZero.f5702) != 0) {
                c5372.write(48);
                return;
            } else {
                c5372.m16046();
                return;
            }
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (Float.isNaN(fFloatValue)) {
                c5372.m16046();
                return;
            }
            if (Float.isInfinite(fFloatValue)) {
                c5372.m16046();
                return;
            }
            String string = Float.toString(fFloatValue);
            if (string.endsWith(".0")) {
                string = C1402.m5124(2, 0, string);
            }
            c5372.write(string);
            if ((c5372.f18847 & EnumC1643.WriteClassName.f5702) != 0) {
                c5372.write(70);
                return;
            }
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue)) {
            c5372.m16046();
            return;
        }
        if (Double.isInfinite(dDoubleValue)) {
            c5372.m16046();
            return;
        }
        String string2 = Double.toString(dDoubleValue);
        if (string2.endsWith(".0")) {
            string2 = C1402.m5124(2, 0, string2);
        }
        c5372.append((CharSequence) string2);
        if ((c5372.f18847 & EnumC1643.WriteClassName.f5702) != 0) {
            c5372.write(68);
        }
    }

    @Override // l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12124(C2759 c2759, Type type, Object obj) {
        C13945 c13945 = c2759.f9128;
        int iM33938 = c13945.m33938();
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        if (iM33938 == 2) {
            if (type == cls4 || type == Double.class) {
                String strM33965 = c13945.m33965();
                c13945.m33973(16);
                return Double.valueOf(Double.parseDouble(strM33965));
            }
            if (type == cls3 || type == Float.class) {
                String strM33966 = c13945.m33965();
                c13945.m33973(16);
                return Float.valueOf(Float.parseFloat(strM33966));
            }
            long jM33950 = c13945.m33950();
            c13945.m33973(16);
            if (type != cls2 && type != Short.class) {
                if (type == cls || type == Byte.class) {
                    return Byte.valueOf((byte) jM33950);
                }
                if (jM33950 >= -2147483648L && jM33950 <= 2147483647L) {
                    return Integer.valueOf((int) jM33950);
                }
                return Long.valueOf(jM33950);
            }
            return Short.valueOf((short) jM33950);
        }
        if (iM33938 == 3) {
            if (type == cls4 || type == Double.class) {
                String strM33967 = c13945.m33965();
                c13945.m33973(16);
                return Double.valueOf(Double.parseDouble(strM33967));
            }
            if (type == cls3 || type == Float.class) {
                String strM33968 = c13945.m33965();
                c13945.m33973(16);
                return Float.valueOf(Float.parseFloat(strM33968));
            }
            BigDecimal bigDecimalM33953 = c13945.m33953();
            c13945.m33973(16);
            if (type == cls2 || type == Short.class) {
                return Short.valueOf(bigDecimalM33953.shortValueExact());
            }
            return (type == cls || type == Byte.class) ? Byte.valueOf(bigDecimalM33953.byteValueExact()) : bigDecimalM33953;
        }
        Object objM9106 = c2759.m9106((Object) null);
        if (objM9106 == null) {
            return null;
        }
        if (type == cls4 || type == Double.class) {
            return C3134.m10235(objM9106);
        }
        if (type == cls3 || type == Float.class) {
            return C3134.m10234(objM9106);
        }
        if (type != cls2 && type != Short.class) {
            if (type == cls || type == Byte.class) {
                return C3134.m10243(objM9106);
            }
            return C3134.m10221(objM9106);
        }
        return C3134.m10233(objM9106);
    }
}
