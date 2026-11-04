package l;

import java.math.BigInteger;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩹᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: MB8H */
/* JADX INFO: loaded from: classes.dex */
public final class C23846 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m53193(EnumC9673 enumC9673, C14148 c14148, Class cls) throws C12657 {
        if (ByteBuffer.class.equals(cls)) {
            return c14148.m34365();
        }
        if (byte[].class.equals(cls)) {
            ByteBuffer byteBufferM34365 = c14148.m34365();
            if (!byteBufferM34365.hasRemaining()) {
                return C9498.f30777;
            }
            byte[] bArr = new byte[byteBufferM34365.remaining()];
            byteBufferM34365.get(bArr);
            return bArr;
        }
        if (C19370.class.equals(cls)) {
            return new C19370(c14148.m34367());
        }
        ByteBuffer byteBufferM34366 = c14148.m34365();
        int i = C17132.f55887[enumC9673.ordinal()];
        if (i == 1) {
            InterfaceC20862 interfaceC20862 = (InterfaceC20862) C7437.m20382(cls);
            if (interfaceC20862 != null && interfaceC20862.type() == EnumC9673.CHOICE) {
                return C3708.m12063(c14148, cls);
            }
        } else if (i != 2) {
            switch (i) {
                case 6:
                    if (Integer.TYPE.equals(cls) || Integer.class.equals(cls)) {
                        return Integer.valueOf(C3708.m12064(byteBufferM34366));
                    }
                    if (Long.TYPE.equals(cls) || Long.class.equals(cls)) {
                        return Long.valueOf(C3708.m12057(byteBufferM34366));
                    }
                    if (BigInteger.class.equals(cls)) {
                        return C3708.m12060(byteBufferM34366);
                    }
                    break;
                case 7:
                    if (String.class.equals(cls)) {
                        return C3708.m12067(byteBufferM34366);
                    }
                    break;
                case 8:
                case 9:
                    if (String.class.equals(cls)) {
                        byte[] bArr2 = new byte[byteBufferM34366.remaining()];
                        byteBufferM34366.get(bArr2);
                        return new String(bArr2);
                    }
                    break;
                case 10:
                    if (Boolean.TYPE.equals(cls)) {
                        if (byteBufferM34366.remaining() != 1) {
                            throw new C12657("Incorrect encoded size of boolean value: " + byteBufferM34366.remaining());
                        }
                        return new Boolean(byteBufferM34366.get() != 0);
                    }
                    break;
            }
        } else {
            InterfaceC20862 interfaceC20863 = (InterfaceC20862) C7437.m20382(cls);
            if (interfaceC20863 != null && interfaceC20863.type() == EnumC9673.SEQUENCE) {
                return C3708.m12065(c14148, cls);
            }
        }
        throw new C12657("Unsupported conversion: ASN.1 " + enumC9673 + " to " + cls.getName());
    }
}
