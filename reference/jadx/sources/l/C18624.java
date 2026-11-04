package l;

import com.umeng.analytics.pro.bo;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B7K */
/* JADX INFO: loaded from: classes4.dex */
public final class C18624 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m43327(Object obj) throws C0725 {
        Class<?> cls = obj.getClass();
        InterfaceC20862 interfaceC20862 = (InterfaceC20862) C7437.m20382(cls);
        if (interfaceC20862 == null) {
            throw new C0725(cls.getName() + " not annotated with " + InterfaceC20862.class.getName());
        }
        EnumC9673 enumC9673Type = interfaceC20862.type();
        int i = C24592.f79683[enumC9673Type.ordinal()];
        if (i == 1) {
            return m43328(obj);
        }
        if (i == 2) {
            return m43321(obj, false);
        }
        if (i == 3) {
            return m43321(obj, true);
        }
        throw new C0725("Unsupported container type: " + enumC9673Type);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static byte[] m43328(Object obj) throws C0725 {
        Class<?> cls = obj.getClass();
        ArrayList<C4454> arrayListM43333 = m43333(obj);
        if (arrayListM43333.isEmpty()) {
            throw new C0725("No fields annotated with " + InterfaceC8183.class.getName() + " in CHOICE class " + cls.getName());
        }
        C4454 c4454 = null;
        for (C4454 c4455 : arrayListM43333) {
            if (m43329(c4455.m14154(), obj) != null) {
                if (c4454 != null) {
                    throw new C0725("Multiple non-null fields in CHOICE class " + cls.getName() + ": " + c4454.m14154().getName() + ", " + c4455.m14154().getName());
                }
                c4454 = c4455;
            }
        }
        if (c4454 == null) {
            throw new C0725("No non-null fields in CHOICE class ".concat(cls.getName()));
        }
        return c4454.m14153();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m43331(Object obj) {
        return m43321(obj, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m43321(Object obj, boolean z) throws C0725 {
        Class<?> cls = obj.getClass();
        ArrayList<C4454> arrayListM43333 = m43333(obj);
        Collections.sort(arrayListM43333, new C6692());
        if (arrayListM43333.size() > 1) {
            C4454 c4454 = null;
            for (C4454 c4455 : arrayListM43333) {
                if (c4454 != null && c4454.m14152().index() == c4455.m14152().index()) {
                    throw new C0725("Fields have the same index: " + cls.getName() + "." + c4454.m14154().getName() + " and ." + c4455.m14154().getName());
                }
                c4454 = c4455;
            }
        }
        ArrayList<byte[]> arrayList = new ArrayList(arrayListM43333.size());
        int length = 0;
        for (C4454 c4456 : arrayListM43333) {
            try {
                byte[] bArrM14153 = c4456.m14153();
                if (bArrM14153 != null) {
                    arrayList.add(bArrM14153);
                    length += bArrM14153.length;
                }
            } catch (C0725 e) {
                throw new C0725("Failed to encode " + cls.getName() + "." + c4456.m14154().getName(), e);
            }
        }
        if (z) {
            byte[] bArr = new byte[length];
            int length2 = 0;
            for (byte[] bArr2 : arrayList) {
                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                length2 += bArr2.length;
            }
            return bArr;
        }
        return m43330(0, true, 16, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m43332(Collection collection, EnumC9673 enumC9673) {
        return m43325(collection, enumC9673, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m43324(Collection collection, EnumC9673 enumC9673) {
        return m43325(collection, enumC9673, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m43325(Collection collection, EnumC9673 enumC9673, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(C21608.m49136(it.next(), enumC9673, null));
        }
        if (z) {
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, C14894.f48654);
            }
            i = 17;
        } else {
            i = 16;
        }
        return m43330(0, true, i, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ArrayList m43333(Object obj) throws C0725 {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            InterfaceC8183 interfaceC8183 = (InterfaceC8183) field.getAnnotation(InterfaceC8183.class);
            if (interfaceC8183 != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new C0725(InterfaceC8183.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new C4454(obj, field, interfaceC8183));
                } catch (C0725 e) {
                    throw new C0725("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m43317(int i) {
        return m43330(0, false, 2, BigInteger.valueOf(i).toByteArray());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m43319(long j) {
        return m43330(0, false, 2, BigInteger.valueOf(j).toByteArray());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m43323(BigInteger bigInteger) {
        return m43330(0, false, 2, bigInteger.toByteArray());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m43326(boolean z) {
        byte[] bArr = new byte[1];
        if (z) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return m43330(0, false, 1, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m43322(String str) throws C0725 {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2) {
            throw new C0725("OBJECT IDENTIFIER must contain at least two nodes: ".concat(str));
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            if (i > 6 || i < 0) {
                throw new C0725(C13645.m33382(i, "Invalid value for node #1: "));
            }
            try {
                int i2 = Integer.parseInt(strArrSplit[1]);
                if (i2 >= 40 || i2 < 0) {
                    throw new C0725(C13645.m33382(i2, "Invalid value for node #2: "));
                }
                int i3 = (i * 40) + i2;
                if (i3 > 255) {
                    throw new C0725(C6934.m19217("First two nodes out of range: ", i, i2, "."));
                }
                byteArrayOutputStream.write(i3);
                for (int i4 = 2; i4 < strArrSplit.length; i4++) {
                    String str2 = strArrSplit[i4];
                    try {
                        int i5 = Integer.parseInt(str2);
                        if (i5 < 0) {
                            throw new C0725("Invalid value for node #" + (i4 + 1) + ": " + i5);
                        }
                        if (i5 <= 127) {
                            byteArrayOutputStream.write(i5);
                        } else if (i5 < 16384) {
                            byteArrayOutputStream.write((i5 >> 7) | 128);
                            byteArrayOutputStream.write(i5 & 127);
                        } else {
                            if (i5 >= 2097152) {
                                throw new C0725("Node #" + (i4 + 1) + " too large: " + i5);
                            }
                            byteArrayOutputStream.write((i5 >> 14) | 128);
                            byteArrayOutputStream.write((127 & (i5 >> 7)) | 128);
                            byteArrayOutputStream.write(i5 & 127);
                        }
                    } catch (NumberFormatException unused) {
                        throw new C0725("Node #" + (i4 + 1) + " not numeric: " + str2);
                    }
                }
                return m43330(0, false, 6, byteArrayOutputStream.toByteArray());
            } catch (NumberFormatException unused2) {
                throw new C0725("Node #2 not numeric: " + strArrSplit[1]);
            }
        } catch (NumberFormatException unused3) {
            throw new C0725("Node #1 not numeric: " + strArrSplit[0]);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m43329(Field field, Object obj) throws C0725 {
        try {
            return field.get(obj);
        } catch (Exception e) {
            throw new C0725("Failed to read " + obj.getClass().getName() + "." + field.getName(), e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m43330(int i, boolean z, int i2, byte[]... bArr) {
        byte[] bArr2;
        if (i2 >= 31) {
            throw new IllegalArgumentException(C13645.m33382(i2, "High tag numbers not supported: "));
        }
        int i3 = 6;
        byte b = (byte) ((i << 6) | (z ? 32 : 0) | i2);
        int length = 0;
        for (byte[] bArr3 : bArr) {
            length += bArr3.length;
        }
        int length2 = 2;
        if (length < 128) {
            bArr2 = new byte[length + 2];
            bArr2[0] = b;
            bArr2[1] = (byte) length;
        } else {
            if (length <= 255) {
                bArr2 = new byte[length + 3];
                bArr2[1] = -127;
                bArr2[2] = (byte) length;
                i3 = 3;
            } else if (length <= 65535) {
                byte[] bArr4 = new byte[length + 4];
                bArr4[1] = bo.h;
                bArr4[2] = (byte) (length >> 8);
                bArr4[3] = (byte) (length & 255);
                bArr2 = bArr4;
                i3 = 4;
            } else if (length <= 16777215) {
                byte[] bArr5 = new byte[length + 5];
                bArr5[1] = -125;
                bArr5[2] = (byte) (length >> 16);
                bArr5[3] = (byte) ((length >> 8) & 255);
                bArr5[4] = (byte) (length & 255);
                bArr2 = bArr5;
                i3 = 5;
            } else {
                byte[] bArr6 = new byte[length + 6];
                bArr6[1] = -124;
                bArr6[2] = (byte) (length >> 24);
                bArr6[3] = (byte) ((length >> 16) & 255);
                bArr6[4] = (byte) ((length >> 8) & 255);
                bArr6[5] = (byte) (length & 255);
                bArr2 = bArr6;
            }
            bArr2[0] = b;
            length2 = i3;
        }
        for (byte[] bArr7 : bArr) {
            System.arraycopy(bArr7, 0, bArr2, length2, bArr7.length);
            length2 += bArr7.length;
        }
        return bArr2;
    }
}
