package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩷ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB8H */
/* JADX INFO: loaded from: classes4.dex */
public final class C20576 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m46426(ByteBuffer byteBuffer, Class cls) throws C19871 {
        try {
            C5136 c5136M10906 = new C3724(byteBuffer).m10906();
            if (c5136M10906 == null) {
                throw new C19871("Empty input");
            }
            return m46424(c5136M10906, cls);
        } catch (C22070 e) {
            throw new C19871("Failed to decode top-level data value", e);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static ArrayList m46423(ByteBuffer byteBuffer) throws C19871 {
        try {
            C5136 c5136M10906 = new C3724(byteBuffer).m10906();
            if (c5136M10906 == null) {
                throw new C19871("Empty input");
            }
            return m46438(c5136M10906, C14310.class);
        } catch (C22070 e) {
            throw new C19871("Failed to decode top-level data value", e);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Object m46432(C5136 c5136, Class cls) throws C19871 {
        ArrayList arrayListM46430 = m46430(cls);
        if (arrayListM46430.isEmpty()) {
            throw new C19871("No fields annotated with " + InterfaceC14227.class.getName() + " in CHOICE class " + cls.getName());
        }
        int i = 0;
        while (i < arrayListM46430.size() - 1) {
            C8582 c8582 = (C8582) arrayListM46430.get(i);
            int iM22358 = c8582.m22358();
            int iM22359 = c8582.m22359();
            i++;
            for (int i2 = i; i2 < arrayListM46430.size(); i2++) {
                C8582 c8583 = (C8582) arrayListM46430.get(i2);
                int iM223510 = c8583.m22358();
                int iM223511 = c8583.m22359();
                if (iM22358 == iM223510 && iM22359 == iM223511) {
                    throw new C19871("CHOICE fields are indistinguishable because they have the same tag class and number: " + cls.getName() + "." + c8582.m22354().getName() + " and ." + c8583.m22354().getName());
                }
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            Iterator it = arrayListM46430.iterator();
            while (it.hasNext()) {
                try {
                    ((C8582) it.next()).m22356(c5136, objNewInstance);
                    return objNewInstance;
                } catch (C9993 unused) {
                }
            }
            throw new C19871("No options of CHOICE " + cls.getName() + " matched");
        } catch (Exception e) {
            throw new C19871("Failed to instantiate ".concat(cls.getName()), e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m46436(C5136 c5136, Class cls) {
        return m46428(c5136, cls, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m46428(C5136 c5136, Class cls, boolean z) throws C19871 {
        C5136 c5136M10906;
        ArrayList<C8582> arrayListM46430 = m46430(cls);
        Collections.sort(arrayListM46430, new C7876());
        if (arrayListM46430.size() > 1) {
            C8582 c8582 = null;
            for (C8582 c8583 : arrayListM46430) {
                if (c8582 != null && c8582.m22355().index() == c8583.m22355().index()) {
                    throw new C19871("Fields have the same index: " + cls.getName() + "." + c8582.m22354().getName() + " and ." + c8583.m22354().getName());
                }
                c8582 = c8583;
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            C3724 c3724M14295 = c5136.m14295();
            int i = 0;
            while (i < arrayListM46430.size()) {
                if (z && i == 0) {
                    c5136M10906 = c5136;
                } else {
                    try {
                        c5136M10906 = c3724M14295.m10906();
                    } catch (C22070 e) {
                        throw new C19871("Malformed data value", e);
                    }
                }
                if (c5136M10906 == null) {
                    break;
                }
                for (int i2 = i; i2 < arrayListM46430.size(); i2++) {
                    C8582 c8584 = (C8582) arrayListM46430.get(i2);
                    try {
                        if (c8584.m22357()) {
                            try {
                                c8584.m22356(c5136M10906, objNewInstance);
                            } catch (C9993 unused) {
                            }
                        } else {
                            c8584.m22356(c5136M10906, objNewInstance);
                        }
                        i = i2 + 1;
                        break;
                    } catch (C19871 e2) {
                        throw new C19871("Failed to parse " + cls.getName() + "." + c8584.m22354().getName(), e2);
                    }
                }
            }
            return objNewInstance;
        } catch (Exception e3) {
            throw new C19871("Failed to instantiate ".concat(cls.getName()), e3);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static ArrayList m46438(C5136 c5136, Class cls) throws C19871 {
        Object objM46424;
        ArrayList arrayList = new ArrayList();
        C3724 c3724M14295 = c5136.m14295();
        while (true) {
            try {
                C5136 c5136M10906 = c3724M14295.m10906();
                if (c5136M10906 == null) {
                    return arrayList;
                }
                if (ByteBuffer.class.equals(cls)) {
                    objM46424 = c5136M10906.m14297();
                } else if (C1525.class.equals(cls)) {
                    objM46424 = new C1525(c5136M10906.m14298());
                } else {
                    objM46424 = m46424(c5136M10906, cls);
                }
                arrayList.add(objM46424);
            } catch (C22070 e) {
                throw new C19871("Malformed data value", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Object m46424(C5136 c5136, Class cls) throws C19871 {
        if (cls == null) {
            throw new NullPointerException("containerClass == null");
        }
        InterfaceC15638 interfaceC15638 = (InterfaceC15638) C2313.m7056(cls);
        if (interfaceC15638 == null) {
            throw new C19871(cls.getName() + " is not annotated with " + InterfaceC15638.class.getName());
        }
        int[] iArr = C19165.f61895;
        int i = iArr[interfaceC15638.type().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new C19871("Unsupported ASN.1 container annotation type: " + interfaceC15638.type());
        }
        EnumC4430 enumC4430Type = interfaceC15638.type();
        int i2 = iArr[enumC4430Type.ordinal()];
        if (i2 == 1) {
            return m46432(c5136, cls);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return m46428(c5136, cls, true);
            }
            throw new C19871("Parsing container " + enumC4430Type + " not supported");
        }
        int iM31969 = AbstractC12898.m31969(enumC4430Type);
        if (c5136.m14294() == 0 && c5136.m14296() == iM31969) {
            return m46428(c5136, cls, false);
        }
        throw new C9993("Unexpected data value read as " + cls.getName() + ". Expected " + AbstractC12898.m31972(0, iM31969) + ", but read: " + AbstractC12898.m31972(c5136.m14294(), c5136.m14296()));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m46425(ByteBuffer byteBuffer) throws C19871 {
        if (!byteBuffer.hasRemaining()) {
            throw new C19871("Empty OBJECT IDENTIFIER");
        }
        long jM46431 = m46431(byteBuffer);
        int iMin = (int) Math.min(jM46431 / 40, 2L);
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(iMin));
        sb.append('.');
        sb.append(Long.toString(jM46431 - ((long) (iMin * 40))));
        while (byteBuffer.hasRemaining()) {
            long jM46432 = m46431(byteBuffer);
            sb.append('.');
            sb.append(Long.toString(jM46432));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static long m46431(ByteBuffer byteBuffer) throws C19871 {
        long j = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0L;
        }
        while (byteBuffer.hasRemaining()) {
            if (j > 72057594037927935L) {
                throw new C19871("Base-128 number too large");
            }
            byte b = byteBuffer.get();
            j = (j << 7) | ((long) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID));
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw new C19871("Truncated base-128 encoded input: missing terminating byte, with highest bit not set");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static BigInteger m46437(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new BigInteger(bArr);
        }
        return BigInteger.ZERO;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m46435(ByteBuffer byteBuffer) throws C19871 {
        BigInteger bigIntegerM46437 = m46437(byteBuffer);
        if (bigIntegerM46437.bitLength() <= 31) {
            return bigIntegerM46437.intValue();
        }
        throw new C19871(String.format("INTEGER cannot be represented as int: %1$d (0x%1$x)", bigIntegerM46437));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static long m46433(ByteBuffer byteBuffer) throws C19871 {
        BigInteger bigIntegerM46437 = m46437(byteBuffer);
        if (bigIntegerM46437.bitLength() <= 63) {
            return bigIntegerM46437.longValue();
        }
        throw new C19871(String.format("INTEGER cannot be represented as long: %1$d (0x%1$x)", bigIntegerM46437));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m46430(Class cls) throws C19871 {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            InterfaceC14227 interfaceC14227 = (InterfaceC14227) field.getAnnotation(InterfaceC14227.class);
            if (interfaceC14227 != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new C19871(InterfaceC14227.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new C8582(field, interfaceC14227));
                } catch (C19871 e) {
                    throw new C19871("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }
}
