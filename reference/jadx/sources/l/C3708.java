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

/* JADX INFO: renamed from: l.ۗ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: MB8H */
/* JADX INFO: loaded from: classes2.dex */
public final class C3708 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m12052(ByteBuffer byteBuffer, Class cls) throws C12657 {
        try {
            C14148 c14148M51905 = new C23012(byteBuffer).m51905();
            if (c14148M51905 == null) {
                throw new C12657("Empty input");
            }
            return m12066(c14148M51905, cls);
        } catch (C5112 e) {
            throw new C12657("Failed to decode top-level data value", e);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static ArrayList m12059(ByteBuffer byteBuffer) throws C12657 {
        try {
            C14148 c14148M51905 = new C23012(byteBuffer).m51905();
            if (c14148M51905 == null) {
                throw new C12657("Empty input");
            }
            return m12061(c14148M51905, C8095.class);
        } catch (C5112 e) {
            throw new C12657("Failed to decode top-level data value", e);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Object m12063(C14148 c14148, Class cls) throws C12657 {
        ArrayList arrayListM12056 = m12056(cls);
        if (arrayListM12056.isEmpty()) {
            throw new C12657("No fields annotated with " + InterfaceC8183.class.getName() + " in CHOICE class " + cls.getName());
        }
        int i = 0;
        while (i < arrayListM12056.size() - 1) {
            C17878 c17878 = (C17878) arrayListM12056.get(i);
            int iM41731 = c17878.m41731();
            int iM41733 = c17878.m41733();
            i++;
            for (int i2 = i; i2 < arrayListM12056.size(); i2++) {
                C17878 c17879 = (C17878) arrayListM12056.get(i2);
                int iM41732 = c17879.m41731();
                int iM41734 = c17879.m41733();
                if (iM41731 == iM41732 && iM41733 == iM41734) {
                    throw new C12657("CHOICE fields are indistinguishable because they have the same tag class and number: " + cls.getName() + "." + c17878.m41734().getName() + " and ." + c17879.m41734().getName());
                }
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            Iterator it = arrayListM12056.iterator();
            while (it.hasNext()) {
                try {
                    ((C17878) it.next()).m41730(c14148, objNewInstance);
                    return objNewInstance;
                } catch (C16386 unused) {
                }
            }
            throw new C12657("No options of CHOICE " + cls.getName() + " matched");
        } catch (Exception e) {
            throw new C12657("Failed to instantiate ".concat(cls.getName()), e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m12065(C14148 c14148, Class cls) {
        return m12054(c14148, cls, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m12054(C14148 c14148, Class cls, boolean z) throws C12657 {
        C14148 c14148M51905;
        ArrayList<C17878> arrayListM12056 = m12056(cls);
        Collections.sort(arrayListM12056, new C25338());
        if (arrayListM12056.size() > 1) {
            C17878 c17878 = null;
            for (C17878 c17879 : arrayListM12056) {
                if (c17878 != null && c17878.m41729().index() == c17879.m41729().index()) {
                    throw new C12657("Fields have the same index: " + cls.getName() + "." + c17878.m41734().getName() + " and ." + c17879.m41734().getName());
                }
                c17878 = c17879;
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            C23012 c23012M34364 = c14148.m34364();
            int i = 0;
            while (i < arrayListM12056.size()) {
                if (z && i == 0) {
                    c14148M51905 = c14148;
                } else {
                    try {
                        c14148M51905 = c23012M34364.m51905();
                    } catch (C5112 e) {
                        throw new C12657("Malformed data value", e);
                    }
                }
                if (c14148M51905 == null) {
                    break;
                }
                for (int i2 = i; i2 < arrayListM12056.size(); i2++) {
                    C17878 c178710 = (C17878) arrayListM12056.get(i2);
                    try {
                        if (c178710.m41732()) {
                            try {
                                c178710.m41730(c14148M51905, objNewInstance);
                            } catch (C16386 unused) {
                            }
                        } else {
                            c178710.m41730(c14148M51905, objNewInstance);
                        }
                        i = i2 + 1;
                        break;
                    } catch (C12657 e2) {
                        throw new C12657("Failed to parse " + cls.getName() + "." + c178710.m41734().getName(), e2);
                    }
                }
            }
            return objNewInstance;
        } catch (Exception e3) {
            throw new C12657("Failed to instantiate ".concat(cls.getName()), e3);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m12061(C14148 c14148, Class cls) throws C12657 {
        Object objM12066;
        ArrayList arrayList = new ArrayList();
        C23012 c23012M34364 = c14148.m34364();
        while (true) {
            try {
                C14148 c14148M51905 = c23012M34364.m51905();
                if (c14148M51905 == null) {
                    return arrayList;
                }
                if (ByteBuffer.class.equals(cls)) {
                    objM12066 = c14148M51905.m34365();
                } else if (C19370.class.equals(cls)) {
                    objM12066 = new C19370(c14148M51905.m34367());
                } else {
                    objM12066 = m12066(c14148M51905, cls);
                }
                arrayList.add(objM12066);
            } catch (C5112 e) {
                throw new C12657("Malformed data value", e);
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Object m12066(C14148 c14148, Class cls) throws C12657 {
        if (cls == null) {
            throw new NullPointerException("containerClass == null");
        }
        InterfaceC20862 interfaceC20862 = (InterfaceC20862) C7437.m20382(cls);
        if (interfaceC20862 == null) {
            throw new C12657(cls.getName() + " is not annotated with " + InterfaceC20862.class.getName());
        }
        int[] iArr = C17132.f55887;
        int i = iArr[interfaceC20862.type().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new C12657("Unsupported ASN.1 container annotation type: " + interfaceC20862.type());
        }
        EnumC9673 enumC9673Type = interfaceC20862.type();
        int i2 = iArr[enumC9673Type.ordinal()];
        if (i2 == 1) {
            return m12063(c14148, cls);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return m12054(c14148, cls, true);
            }
            throw new C12657("Parsing container " + enumC9673Type + " not supported");
        }
        int iM27993 = AbstractC11077.m27993(enumC9673Type);
        if (c14148.m34368() == 0 && c14148.m34366() == iM27993) {
            return m12054(c14148, cls, false);
        }
        throw new C16386("Unexpected data value read as " + cls.getName() + ". Expected " + AbstractC11077.m27996(0, iM27993) + ", but read: " + AbstractC11077.m27996(c14148.m34368(), c14148.m34366()));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m12067(ByteBuffer byteBuffer) throws C12657 {
        if (!byteBuffer.hasRemaining()) {
            throw new C12657("Empty OBJECT IDENTIFIER");
        }
        long jM12062 = m12062(byteBuffer);
        int iMin = (int) Math.min(jM12062 / 40, 2L);
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(iMin));
        sb.append('.');
        sb.append(Long.toString(jM12062 - ((long) (iMin * 40))));
        while (byteBuffer.hasRemaining()) {
            long jM12063 = m12062(byteBuffer);
            sb.append('.');
            sb.append(Long.toString(jM12063));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static long m12062(ByteBuffer byteBuffer) throws C12657 {
        long j = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0L;
        }
        while (byteBuffer.hasRemaining()) {
            if (j > 72057594037927935L) {
                throw new C12657("Base-128 number too large");
            }
            byte b = byteBuffer.get();
            j = (j << 7) | ((long) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID));
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw new C12657("Truncated base-128 encoded input: missing terminating byte, with highest bit not set");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static BigInteger m12060(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new BigInteger(bArr);
        }
        return BigInteger.ZERO;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m12064(ByteBuffer byteBuffer) throws C12657 {
        BigInteger bigIntegerM12060 = m12060(byteBuffer);
        if (bigIntegerM12060.bitLength() <= 31) {
            return bigIntegerM12060.intValue();
        }
        throw new C12657(String.format("INTEGER cannot be represented as int: %1$d (0x%1$x)", bigIntegerM12060));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static long m12057(ByteBuffer byteBuffer) throws C12657 {
        BigInteger bigIntegerM12060 = m12060(byteBuffer);
        if (bigIntegerM12060.bitLength() <= 63) {
            return bigIntegerM12060.longValue();
        }
        throw new C12657(String.format("INTEGER cannot be represented as long: %1$d (0x%1$x)", bigIntegerM12060));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m12056(Class cls) throws C12657 {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            InterfaceC8183 interfaceC8183 = (InterfaceC8183) field.getAnnotation(InterfaceC8183.class);
            if (interfaceC8183 != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new C12657(InterfaceC8183.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new C17878(field, interfaceC8183));
                } catch (C12657 e) {
                    throw new C12657("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }
}
