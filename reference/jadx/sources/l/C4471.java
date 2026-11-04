package l;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۘ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAUB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4471 implements InterfaceC10591, InterfaceC3725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C4471 f15987 = new C4471();

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
        if (obj instanceof BigInteger) {
            c5372.write(((BigInteger) obj).toString());
            return;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        c5372.write(bigDecimal.toString());
        if ((c5372.f18847 & EnumC1643.WriteClassName.f5702) == 0 || type == BigDecimal.class || bigDecimal.scale() != 0) {
            return;
        }
        c5372.write(46);
    }

    @Override // l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12124(C2759 c2759, Type type, Object obj) {
        C13945 c13945 = c2759.f9128;
        int iM33938 = c13945.m33938();
        if (iM33938 == 2) {
            if (type == BigInteger.class) {
                String strM33965 = c13945.m33965();
                c13945.m33973(16);
                return new BigInteger(strM33965, 10);
            }
            BigDecimal bigDecimalM33953 = c13945.m33953();
            c13945.m33973(16);
            return bigDecimalM33953;
        }
        if (iM33938 == 3) {
            BigDecimal bigDecimalM33954 = c13945.m33953();
            c13945.m33973(16);
            if (type != BigInteger.class) {
                return bigDecimalM33954;
            }
            int iScale = bigDecimalM33954.scale();
            if (iScale < -100 || iScale > 100) {
                throw new NumberFormatException();
            }
            return bigDecimalM33954.toBigInteger();
        }
        Object objM9106 = c2759.m9106((Object) null);
        if (objM9106 == null) {
            return null;
        }
        if (type == BigInteger.class) {
            return C3134.m10241(objM9106);
        }
        return C3134.m10221(objM9106);
    }
}
