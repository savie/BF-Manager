package l;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.᩷ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAUB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20650 implements InterfaceC11747, InterfaceC7950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C20650 f67222 = new C20650();

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
        if (obj instanceof BigInteger) {
            c13158.write(((BigInteger) obj).toString());
            return;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        c13158.write(bigDecimal.toString());
        if ((c13158.f43818 & EnumC3984.WriteClassName.f14811) == 0 || type == BigDecimal.class || bigDecimal.scale() != 0) {
            return;
        }
        c13158.write(46);
    }

    @Override // l.InterfaceC7950
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1395(C14265 c14265, Type type, Object obj) {
        C2974 c2974 = c14265.f46690;
        int iM8859 = c2974.m8859();
        if (iM8859 == 2) {
            if (type == BigInteger.class) {
                String strM8854 = c2974.m8854();
                c2974.m8850(16);
                return new BigInteger(strM8854, 10);
            }
            BigDecimal bigDecimalM8844 = c2974.m8844();
            c2974.m8850(16);
            return bigDecimalM8844;
        }
        if (iM8859 == 3) {
            BigDecimal bigDecimalM8845 = c2974.m8844();
            c2974.m8850(16);
            if (type != BigInteger.class) {
                return bigDecimalM8845;
            }
            int iScale = bigDecimalM8845.scale();
            if (iScale < -100 || iScale > 100) {
                throw new NumberFormatException();
            }
            return bigDecimalM8845.toBigInteger();
        }
        Object objM34396 = c14265.m34396((Object) null);
        if (objM34396 == null) {
            return null;
        }
        if (type == BigInteger.class) {
            return C8219.m21534(objM34396);
        }
        return C8219.m21516(objM34396);
    }
}
