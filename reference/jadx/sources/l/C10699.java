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

/* JADX INFO: renamed from: l.ۧۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B7K */
/* JADX INFO: loaded from: classes3.dex */
public final class C10699 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m26919(Object obj) throws C23399 {
        Class<?> cls = obj.getClass();
        InterfaceC15638 interfaceC15638 = (InterfaceC15638) C2313.m7056(cls);
        if (interfaceC15638 == null) {
            throw new C23399(cls.getName() + " not annotated with " + InterfaceC15638.class.getName());
        }
        EnumC4430 enumC4430Type = interfaceC15638.type();
        int i = C16343.f52628[enumC4430Type.ordinal()];
        if (i == 1) {
            return m26918(obj);
        }
        if (i == 2) {
            return m26912(obj, false);
        }
        if (i == 3) {
            return m26912(obj, true);
        }
        throw new C23399("Unsupported container type: " + enumC4430Type);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static byte[] m26918(Object obj) throws C23399 {
        Class<?> cls = obj.getClass();
        ArrayList<C12110> arrayListM26906 = m26906(obj);
        if (arrayListM26906.isEmpty()) {
            throw new C23399("No fields annotated with " + InterfaceC14227.class.getName() + " in CHOICE class " + cls.getName());
        }
        C12110 c12110 = null;
        for (C12110 c12111 : arrayListM26906) {
            if (m26920(c12111.m30145(), obj) != null) {
                if (c12110 != null) {
                    throw new C23399("Multiple non-null fields in CHOICE class " + cls.getName() + ": " + c12110.m30145().getName() + ", " + c12111.m30145().getName());
                }
                c12110 = c12111;
            }
        }
        if (c12110 == null) {
            throw new C23399("No non-null fields in CHOICE class ".concat(cls.getName()));
        }
        return c12110.m30144();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m26922(Object obj) {
        return m26912(obj, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m26912(Object obj, boolean z) throws C23399 {
        Class<?> cls = obj.getClass();
        ArrayList<C12110> arrayListM26906 = m26906(obj);
        Collections.sort(arrayListM26906, new C0114());
        if (arrayListM26906.size() > 1) {
            C12110 c12110 = null;
            for (C12110 c12111 : arrayListM26906) {
                if (c12110 != null && c12110.m30143().index() == c12111.m30143().index()) {
                    throw new C23399("Fields have the same index: " + cls.getName() + "." + c12110.m30145().getName() + " and ." + c12111.m30145().getName());
                }
                c12110 = c12111;
            }
        }
        ArrayList<byte[]> arrayList = new ArrayList(arrayListM26906.size());
        int length = 0;
        for (C12110 c12112 : arrayListM26906) {
            try {
                byte[] bArrM30144 = c12112.m30144();
                if (bArrM30144 != null) {
                    arrayList.add(bArrM30144);
                    length += bArrM30144.length;
                }
            } catch (C23399 e) {
                throw new C23399("Failed to encode " + cls.getName() + "." + c12112.m30145().getName(), e);
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
        return m26921(0, true, 16, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m26923(Collection collection, EnumC4430 enumC4430) {
        return m26916(collection, enumC4430, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m26915(Collection collection, EnumC4430 enumC4430) {
        return m26916(collection, enumC4430, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m26916(Collection collection, EnumC4430 enumC4430, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(C5759.m15852(it.next(), enumC4430, null));
        }
        if (z) {
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, C17048.f54441);
            }
            i = 17;
        } else {
            i = 16;
        }
        return m26921(0, true, i, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ArrayList m26906(Object obj) throws C23399 {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            InterfaceC14227 interfaceC14227 = (InterfaceC14227) field.getAnnotation(InterfaceC14227.class);
            if (interfaceC14227 != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new C23399(InterfaceC14227.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new C12110(obj, field, interfaceC14227));
                } catch (C23399 e) {
                    throw new C23399("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m26908(int i) {
        return m26921(0, false, 2, BigInteger.valueOf(i).toByteArray());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m26910(long j) {
        return m26921(0, false, 2, BigInteger.valueOf(j).toByteArray());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m26914(BigInteger bigInteger) {
        return m26921(0, false, 2, bigInteger.toByteArray());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m26917(boolean z) {
        byte[] bArr = new byte[1];
        if (z) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return m26921(0, false, 1, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m26913(String str) throws C23399 {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2) {
            throw new C23399("OBJECT IDENTIFIER must contain at least two nodes: ".concat(str));
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            if (i > 6 || i < 0) {
                throw new C23399(C8479.m22141(i, "Invalid value for node #1: "));
            }
            try {
                int i2 = Integer.parseInt(strArrSplit[1]);
                if (i2 >= 40 || i2 < 0) {
                    throw new C23399(C8479.m22141(i2, "Invalid value for node #2: "));
                }
                int i3 = (i * 40) + i2;
                if (i3 > 255) {
                    throw new C23399(C2271.m6967("First two nodes out of range: ", i, i2, "."));
                }
                byteArrayOutputStream.write(i3);
                for (int i4 = 2; i4 < strArrSplit.length; i4++) {
                    String str2 = strArrSplit[i4];
                    try {
                        int i5 = Integer.parseInt(str2);
                        if (i5 < 0) {
                            throw new C23399("Invalid value for node #" + (i4 + 1) + ": " + i5);
                        }
                        if (i5 <= 127) {
                            byteArrayOutputStream.write(i5);
                        } else if (i5 < 16384) {
                            byteArrayOutputStream.write((i5 >> 7) | 128);
                            byteArrayOutputStream.write(i5 & 127);
                        } else {
                            if (i5 >= 2097152) {
                                throw new C23399("Node #" + (i4 + 1) + " too large: " + i5);
                            }
                            byteArrayOutputStream.write((i5 >> 14) | 128);
                            byteArrayOutputStream.write((127 & (i5 >> 7)) | 128);
                            byteArrayOutputStream.write(i5 & 127);
                        }
                    } catch (NumberFormatException unused) {
                        throw new C23399("Node #" + (i4 + 1) + " not numeric: " + str2);
                    }
                }
                return m26921(0, false, 6, byteArrayOutputStream.toByteArray());
            } catch (NumberFormatException unused2) {
                throw new C23399("Node #2 not numeric: " + strArrSplit[1]);
            }
        } catch (NumberFormatException unused3) {
            throw new C23399("Node #1 not numeric: " + strArrSplit[0]);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m26920(Field field, Object obj) throws C23399 {
        try {
            return field.get(obj);
        } catch (Exception e) {
            throw new C23399("Failed to read " + obj.getClass().getName() + "." + field.getName(), e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m26921(int i, boolean z, int i2, byte[]... bArr) {
        byte[] bArr2;
        if (i2 >= 31) {
            throw new IllegalArgumentException(C8479.m22141(i2, "High tag numbers not supported: "));
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
