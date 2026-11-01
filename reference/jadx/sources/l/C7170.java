package l;

import java.math.BigInteger;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۟ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB8H */
/* JADX INFO: loaded from: classes2.dex */
public final class C7170 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m19101(EnumC4430 enumC4430, C5136 c5136, Class cls) throws C19871 {
        if (ByteBuffer.class.equals(cls)) {
            return c5136.m14297();
        }
        if (byte[].class.equals(cls)) {
            ByteBuffer byteBufferM14297 = c5136.m14297();
            if (!byteBufferM14297.hasRemaining()) {
                return C8574.f29651;
            }
            byte[] bArr = new byte[byteBufferM14297.remaining()];
            byteBufferM14297.get(bArr);
            return bArr;
        }
        if (C1525.class.equals(cls)) {
            return new C1525(c5136.m14298());
        }
        ByteBuffer byteBufferM14298 = c5136.m14297();
        int i = C19165.f61895[enumC4430.ordinal()];
        if (i == 1) {
            InterfaceC15638 interfaceC15638 = (InterfaceC15638) C2313.m7056(cls);
            if (interfaceC15638 != null && interfaceC15638.type() == EnumC4430.CHOICE) {
                return C20576.m46432(c5136, cls);
            }
        } else if (i != 2) {
            switch (i) {
                case 6:
                    if (Integer.TYPE.equals(cls) || Integer.class.equals(cls)) {
                        return Integer.valueOf(C20576.m46435(byteBufferM14298));
                    }
                    if (Long.TYPE.equals(cls) || Long.class.equals(cls)) {
                        return Long.valueOf(C20576.m46433(byteBufferM14298));
                    }
                    if (BigInteger.class.equals(cls)) {
                        return C20576.m46437(byteBufferM14298);
                    }
                    break;
                case 7:
                    if (String.class.equals(cls)) {
                        return C20576.m46425(byteBufferM14298);
                    }
                    break;
                case 8:
                case 9:
                    if (String.class.equals(cls)) {
                        byte[] bArr2 = new byte[byteBufferM14298.remaining()];
                        byteBufferM14298.get(bArr2);
                        return new String(bArr2);
                    }
                    break;
                case 10:
                    if (Boolean.TYPE.equals(cls)) {
                        if (byteBufferM14298.remaining() != 1) {
                            throw new C19871("Incorrect encoded size of boolean value: " + byteBufferM14298.remaining());
                        }
                        return new Boolean(byteBufferM14298.get() != 0);
                    }
                    break;
            }
        } else {
            InterfaceC15638 interfaceC15639 = (InterfaceC15638) C2313.m7056(cls);
            if (interfaceC15639 != null && interfaceC15639.type() == EnumC4430.SEQUENCE) {
                return C20576.m46436(c5136, cls);
            }
        }
        throw new C19871("Unsupported conversion: ASN.1 " + enumC4430 + " to " + cls.getName());
    }
}
