package l;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۛۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B7K */
/* JADX INFO: loaded from: classes2.dex */
public final class C5759 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m15852(Object obj, EnumC4430 enumC4430, EnumC4430 enumC4431) throws C23399 {
        byte[] bArr;
        Class<?> cls = obj.getClass();
        if (C1525.class.equals(cls)) {
            ByteBuffer byteBufferM5292 = ((C1525) obj).m5292();
            byte[] bArr2 = new byte[byteBufferM5292.remaining()];
            byteBufferM5292.get(bArr2);
            return bArr2;
        }
        if (enumC4430 == null || enumC4430 == EnumC4430.ANY) {
            return C10699.m26919(obj);
        }
        switch (C16343.f52628[enumC4430.ordinal()]) {
            case 1:
                InterfaceC15638 interfaceC15638 = (InterfaceC15638) C2313.m7056(cls);
                if (interfaceC15638 != null && interfaceC15638.type() == EnumC4430.CHOICE) {
                    return C10699.m26918(obj);
                }
                break;
            case 2:
                InterfaceC15638 interfaceC15639 = (InterfaceC15638) C2313.m7056(cls);
                if (interfaceC15639 != null && interfaceC15639.type() == EnumC4430.SEQUENCE) {
                    return C10699.m26922(obj);
                }
                break;
            case 4:
            case 5:
                if (obj instanceof ByteBuffer) {
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.slice().get(bArr);
                } else {
                    bArr = obj instanceof byte[] ? (byte[]) obj : null;
                }
                if (bArr != null) {
                    return C10699.m26921(0, false, AbstractC11487.m28674(enumC4430), bArr);
                }
                break;
            case 6:
                if (obj instanceof Integer) {
                    return C10699.m26908(((Integer) obj).intValue());
                }
                if (obj instanceof Long) {
                    return C10699.m26910(((Long) obj).longValue());
                }
                if (obj instanceof BigInteger) {
                    return C10699.m26914((BigInteger) obj);
                }
                break;
            case 7:
                if (obj instanceof Boolean) {
                    return C10699.m26917(((Boolean) obj).booleanValue());
                }
                break;
            case 8:
            case 9:
                if (obj instanceof String) {
                    return C10699.m26921(0, false, AbstractC11487.m28674(enumC4430), ((String) obj).getBytes());
                }
                break;
            case 10:
                if (obj instanceof String) {
                    return C10699.m26913((String) obj);
                }
                break;
            case 11:
                return C10699.m26923((Collection) obj, enumC4431);
            case 12:
                return C10699.m26915((Collection) obj, enumC4431);
        }
        throw new C23399("Unsupported conversion: " + cls.getName() + " to ASN.1 " + enumC4430);
    }
}
