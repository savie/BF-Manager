package l;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩶᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B7K */
/* JADX INFO: loaded from: classes.dex */
public final class C21608 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m49136(Object obj, EnumC9673 enumC9673, EnumC9673 enumC9674) throws C0725 {
        byte[] bArr;
        Class<?> cls = obj.getClass();
        if (C19370.class.equals(cls)) {
            ByteBuffer byteBufferM44796 = ((C19370) obj).m44796();
            byte[] bArr2 = new byte[byteBufferM44796.remaining()];
            byteBufferM44796.get(bArr2);
            return bArr2;
        }
        if (enumC9673 == null || enumC9673 == EnumC9673.ANY) {
            return C18624.m43327(obj);
        }
        switch (C24592.f79683[enumC9673.ordinal()]) {
            case 1:
                InterfaceC20862 interfaceC20862 = (InterfaceC20862) C7437.m20382(cls);
                if (interfaceC20862 != null && interfaceC20862.type() == EnumC9673.CHOICE) {
                    return C18624.m43328(obj);
                }
                break;
            case 2:
                InterfaceC20862 interfaceC20863 = (InterfaceC20862) C7437.m20382(cls);
                if (interfaceC20863 != null && interfaceC20863.type() == EnumC9673.SEQUENCE) {
                    return C18624.m43331(obj);
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
                    return C18624.m43330(0, false, AbstractC8928.m23840(enumC9673), bArr);
                }
                break;
            case 6:
                if (obj instanceof Integer) {
                    return C18624.m43317(((Integer) obj).intValue());
                }
                if (obj instanceof Long) {
                    return C18624.m43319(((Long) obj).longValue());
                }
                if (obj instanceof BigInteger) {
                    return C18624.m43323((BigInteger) obj);
                }
                break;
            case 7:
                if (obj instanceof Boolean) {
                    return C18624.m43326(((Boolean) obj).booleanValue());
                }
                break;
            case 8:
            case 9:
                if (obj instanceof String) {
                    return C18624.m43330(0, false, AbstractC8928.m23840(enumC9673), ((String) obj).getBytes());
                }
                break;
            case 10:
                if (obj instanceof String) {
                    return C18624.m43322((String) obj);
                }
                break;
            case 11:
                return C18624.m43332((Collection) obj, enumC9674);
            case 12:
                return C18624.m43324((Collection) obj, enumC9674);
        }
        throw new C0725("Unsupported conversion: " + cls.getName() + " to ASN.1 " + enumC9673);
    }
}
