package l;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.ۜ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9NV */
/* JADX INFO: loaded from: classes2.dex */
public final class C6413 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f21730 = {KeyFactorySpi.Ed25519_type, 114, KeyFactorySpi.x448_type, 0};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f21731 = {KeyFactorySpi.Ed25519_type, 114, 109, 0};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m17556(String str, byte[] bArr, String str2) {
        byte[] bArr2 = C18408.f58670;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C18408.f58667;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return C22697.m50267(C9023.m23356(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17558(ByteArrayOutputStream byteArrayOutputStream, C11227 c11227, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        C23927.m52745(byteArrayOutputStream, str.getBytes(charset).length);
        C23927.m52745(byteArrayOutputStream, c11227.f37992);
        C23927.m52746(byteArrayOutputStream, c11227.f37993, 4);
        C23927.m52746(byteArrayOutputStream, c11227.f37986, 4);
        C23927.m52746(byteArrayOutputStream, c11227.f37987, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17559(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C11227[] c11227Arr) throws IOException {
        int length;
        byte[] bArr2 = C18408.f58666;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = C18408.f58672;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM17560 = m17560(c11227Arr, bArr3);
                C23927.m52746(byteArrayOutputStream, c11227Arr.length, 1);
                C23927.m52746(byteArrayOutputStream, bArrM17560.length, 4);
                byte[] bArrM52749 = C23927.m52749(bArrM17560);
                C23927.m52746(byteArrayOutputStream, bArrM52749.length, 4);
                byteArrayOutputStream.write(bArrM52749);
                return true;
            }
            byte[] bArr4 = C18408.f58667;
            if (Arrays.equals(bArr, bArr4)) {
                C23927.m52746(byteArrayOutputStream, c11227Arr.length, 1);
                for (C11227 c11227 : c11227Arr) {
                    int size = c11227.f37991.size() * 4;
                    String strM17556 = m17556(c11227.f37988, bArr4, c11227.f37989);
                    Charset charset = StandardCharsets.UTF_8;
                    C23927.m52745(byteArrayOutputStream, strM17556.getBytes(charset).length);
                    C23927.m52745(byteArrayOutputStream, c11227.f37990.length);
                    C23927.m52746(byteArrayOutputStream, size, 4);
                    C23927.m52746(byteArrayOutputStream, c11227.f37986, 4);
                    byteArrayOutputStream.write(strM17556.getBytes(charset));
                    Iterator it = c11227.f37991.keySet().iterator();
                    while (it.hasNext()) {
                        C23927.m52745(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        C23927.m52745(byteArrayOutputStream, 0);
                    }
                    for (int i : c11227.f37990) {
                        C23927.m52745(byteArrayOutputStream, i);
                    }
                }
                return true;
            }
            byte[] bArr5 = C18408.f58669;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM17561 = m17560(c11227Arr, bArr5);
                C23927.m52746(byteArrayOutputStream, c11227Arr.length, 1);
                C23927.m52746(byteArrayOutputStream, bArrM17561.length, 4);
                byte[] bArrM527410 = C23927.m52749(bArrM17561);
                C23927.m52746(byteArrayOutputStream, bArrM527410.length, 4);
                byteArrayOutputStream.write(bArrM527410);
                return true;
            }
            byte[] bArr6 = C18408.f58670;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            C23927.m52745(byteArrayOutputStream, c11227Arr.length);
            for (C11227 c11228 : c11227Arr) {
                String str = c11228.f37988;
                TreeMap treeMap = c11228.f37991;
                String strM17557 = m17556(str, bArr6, c11228.f37989);
                Charset charset2 = StandardCharsets.UTF_8;
                C23927.m52745(byteArrayOutputStream, strM17557.getBytes(charset2).length);
                C23927.m52745(byteArrayOutputStream, treeMap.size());
                C23927.m52745(byteArrayOutputStream, c11228.f37990.length);
                C23927.m52746(byteArrayOutputStream, c11228.f37986, 4);
                byteArrayOutputStream.write(strM17557.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    C23927.m52745(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i2 : c11228.f37990) {
                    C23927.m52745(byteArrayOutputStream, i2);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            C23927.m52745(byteArrayOutputStream2, c11227Arr.length);
            int i3 = 2;
            for (C11227 c11229 : c11227Arr) {
                C23927.m52746(byteArrayOutputStream2, c11229.f37986, 4);
                C23927.m52746(byteArrayOutputStream2, c11229.f37985, 4);
                C23927.m52746(byteArrayOutputStream2, c11229.f37987, 4);
                String strM17558 = m17556(c11229.f37988, bArr2, c11229.f37989);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM17558.getBytes(charset3).length;
                C23927.m52745(byteArrayOutputStream2, length2);
                i3 = i3 + 14 + length2;
                byteArrayOutputStream2.write(strM17558.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i3 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            }
            C7825 c7825 = new C7825(EnumC14755.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(c7825);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i4 = 0;
            for (int i5 = 0; i5 < c11227Arr.length; i5++) {
                try {
                    C11227 c112210 = c11227Arr[i5];
                    C23927.m52745(byteArrayOutputStream3, i5);
                    C23927.m52745(byteArrayOutputStream3, c112210.f37992);
                    i4 = i4 + 4 + (c112210.f37992 * 2);
                    int[] iArr = c112210.f37990;
                    int length3 = iArr.length;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length3) {
                        int i8 = iArr[i6];
                        C23927.m52745(byteArrayOutputStream3, i8 - i7);
                        i6++;
                        i7 = i8;
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i4 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray2.length);
            }
            C7825 c7826 = new C7825(EnumC14755.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(c7826);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i9 = 0;
            for (int i10 = 0; i10 < c11227Arr.length; i10++) {
                try {
                    C11227 c112211 = c11227Arr[i10];
                    Iterator it3 = c112211.f37991.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m17557(byteArrayOutputStream5, c112211);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m17567(byteArrayOutputStream6, c112211);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            C23927.m52745(byteArrayOutputStream4, i10);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i11 = i9 + 6;
                            C23927.m52746(byteArrayOutputStream4, length4, 4);
                            C23927.m52745(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i9 = i11 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i9 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray5.length);
            }
            C7825 c7827 = new C7825(EnumC14755.METHODS, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(c7827);
            long j = 4;
            long size2 = j + j + 4 + ((long) (arrayList.size() * 16));
            C23927.m52746(byteArrayOutputStream, arrayList.size(), 4);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                C7825 c7828 = (C7825) arrayList.get(i12);
                EnumC14755 enumC14755 = c7828.f25757;
                byte[] bArr7 = c7828.f25756;
                C23927.m52746(byteArrayOutputStream, enumC14755.getValue(), 4);
                C23927.m52746(byteArrayOutputStream, size2, 4);
                if (c7828.f25758) {
                    long length5 = bArr7.length;
                    byte[] bArrM527411 = C23927.m52749(bArr7);
                    arrayList2.add(bArrM527411);
                    C23927.m52746(byteArrayOutputStream, bArrM527411.length, 4);
                    C23927.m52746(byteArrayOutputStream, length5, 4);
                    length = bArrM527411.length;
                } else {
                    arrayList2.add(bArr7);
                    C23927.m52746(byteArrayOutputStream, bArr7.length, 4);
                    C23927.m52746(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
            }
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i13));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
            }
            throw th9;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m17560(C11227[] c11227Arr, byte[] bArr) throws IOException {
        int length = 0;
        for (C11227 c11227 : c11227Arr) {
            length += ((((c11227.f37987 * 2) + 7) & (-8)) / 8) + (c11227.f37992 * 2) + m17556(c11227.f37988, bArr, c11227.f37989).getBytes(StandardCharsets.UTF_8).length + 16 + c11227.f37993;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, C18408.f58669)) {
            for (C11227 c11228 : c11227Arr) {
                m17558(byteArrayOutputStream, c11228, m17556(c11228.f37988, bArr, c11228.f37989));
                m17567(byteArrayOutputStream, c11228);
                int[] iArr = c11228.f37990;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    C23927.m52745(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                m17557(byteArrayOutputStream, c11228);
            }
        } else {
            for (C11227 c11229 : c11227Arr) {
                m17558(byteArrayOutputStream, c11229, m17556(c11229.f37988, bArr, c11229.f37989));
            }
            for (C11227 c112210 : c11227Arr) {
                m17567(byteArrayOutputStream, c112210);
                int[] iArr2 = c112210.f37990;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    C23927.m52745(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                m17557(byteArrayOutputStream, c112210);
            }
        }
        if (byteArrayOutputStream.size() != length) {
            throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m17567(ByteArrayOutputStream byteArrayOutputStream, C11227 c11227) throws IOException {
        int i = 0;
        for (Map.Entry entry : c11227.f37991.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                C23927.m52745(byteArrayOutputStream, iIntValue - i);
                C23927.m52745(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17557(ByteArrayOutputStream byteArrayOutputStream, C11227 c11227) throws IOException {
        byte[] bArr = new byte[(((c11227.f37987 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c11227.f37991.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + c11227.f37987;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11227[] m17565(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, C18408.f58672)) {
            int iM52750 = (int) C23927.m52750(fileInputStream, 1);
            byte[] bArrM52747 = C23927.m52747(fileInputStream, (int) C23927.m52750(fileInputStream, 4), (int) C23927.m52750(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM52747);
            try {
                C11227[] c11227ArrM17563 = m17563(byteArrayInputStream, str, iM52750);
                byteArrayInputStream.close();
                return c11227ArrM17563;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw new IllegalStateException("Unsupported version");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11227[] m17566(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C11227[] c11227Arr) throws IOException {
        byte[] bArr3 = C18408.f58668;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, C18408.f58671)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM52750 = (int) C23927.m52750(fileInputStream, 2);
            byte[] bArrM52747 = C23927.m52747(fileInputStream, (int) C23927.m52750(fileInputStream, 4), (int) C23927.m52750(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM52747);
            try {
                C11227[] c11227ArrM17564 = m17564(byteArrayInputStream, bArr2, iM52750, c11227Arr);
                byteArrayInputStream.close();
                return c11227ArrM17564;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(C18408.f58666, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM52751 = (int) C23927.m52750(fileInputStream, 1);
        byte[] bArrM52748 = C23927.m52747(fileInputStream, (int) C23927.m52750(fileInputStream, 4), (int) C23927.m52750(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM52748);
        try {
            C11227[] c11227ArrM17562 = m17562(byteArrayInputStream2, iM52751, c11227Arr);
            byteArrayInputStream2.close();
            return c11227ArrM17562;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11227[] m17564(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C11227[] c11227Arr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C11227[0];
        }
        if (i != c11227Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            C23927.m52750(byteArrayInputStream, 2);
            String str = new String(C23927.m52748(byteArrayInputStream, (int) C23927.m52750(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM52750 = C23927.m52750(byteArrayInputStream, 4);
            int iM52750 = (int) C23927.m52750(byteArrayInputStream, 2);
            C11227 c11227 = null;
            if (c11227Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < c11227Arr.length; i3++) {
                    if (c11227Arr[i3].f37989.equals(strSubstring)) {
                        c11227 = c11227Arr[i3];
                        break;
                    }
                }
            }
            if (c11227 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c11227.f37985 = jM52750;
            int[] iArrM17561 = m17561(byteArrayInputStream, iM52750);
            if (Arrays.equals(bArr, C18408.f58670)) {
                c11227.f37992 = iM52750;
                c11227.f37990 = iArrM17561;
            }
        }
        return c11227Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11227[] m17562(ByteArrayInputStream byteArrayInputStream, int i, C11227[] c11227Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C11227[0];
        }
        if (i != c11227Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM52750 = (int) C23927.m52750(byteArrayInputStream, 2);
            iArr[i2] = (int) C23927.m52750(byteArrayInputStream, 2);
            strArr[i2] = new String(C23927.m52748(byteArrayInputStream, iM52750), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C11227 c11227 = c11227Arr[i3];
            if (!c11227.f37989.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c11227.f37992 = i4;
            c11227.f37990 = m17561(byteArrayInputStream, i4);
        }
        return c11227Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11227[] m17563(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2;
        if (byteArrayInputStream.available() == 0) {
            return new C11227[0];
        }
        C11227[] c11227Arr = new C11227[i];
        int i3 = 0;
        while (true) {
            i2 = 2;
            if (i3 >= i) {
                break;
            }
            int iM52750 = (int) C23927.m52750(byteArrayInputStream, 2);
            int iM52751 = (int) C23927.m52750(byteArrayInputStream, 2);
            c11227Arr[i3] = new C11227(str, new String(C23927.m52748(byteArrayInputStream, iM52750), StandardCharsets.UTF_8), C23927.m52750(byteArrayInputStream, 4), iM52751, (int) C23927.m52750(byteArrayInputStream, 4), (int) C23927.m52750(byteArrayInputStream, 4), new int[iM52751], new TreeMap());
            i3++;
        }
        for (int i4 = 0; i4 < i; i4++) {
            C11227 c11227 = c11227Arr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c11227.f37993;
            int i6 = c11227.f37987;
            TreeMap treeMap = c11227.f37991;
            int i7 = iAvailable - i5;
            int iM52752 = 0;
            while (byteArrayInputStream.available() > i7) {
                iM52752 += (int) C23927.m52750(byteArrayInputStream, i2);
                treeMap.put(Integer.valueOf(iM52752), 1);
                int iM52753 = (int) C23927.m52750(byteArrayInputStream, i2);
                while (iM52753 > 0) {
                    C23927.m52750(byteArrayInputStream, i2);
                    int iM52754 = (int) C23927.m52750(byteArrayInputStream, 1);
                    if (iM52754 != 6 && iM52754 != 7) {
                        while (iM52754 > 0) {
                            C23927.m52750(byteArrayInputStream, 1);
                            C11227 c11228 = c11227;
                            for (int iM52755 = (int) C23927.m52750(byteArrayInputStream, 1); iM52755 > 0; iM52755--) {
                                C23927.m52750(byteArrayInputStream, 2);
                            }
                            i2 = 2;
                            iM52754--;
                            c11227 = c11228;
                        }
                    }
                    iM52753--;
                    c11227 = c11227;
                }
            }
            C11227 c11229 = c11227;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c11229.f37990 = m17561(byteArrayInputStream, c11229.f37992);
            BitSet bitSetValueOf = BitSet.valueOf(C23927.m52748(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = bitSetValueOf.get(i8) ? 2 : 0;
                if (bitSetValueOf.get(i8 + i6)) {
                    i9 |= 4;
                }
                if (i9 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i8));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i8), Integer.valueOf(i9 | num.intValue()));
                }
            }
        }
        return c11227Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m17561(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM52750 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM52750 += (int) C23927.m52750(byteArrayInputStream, 2);
            iArr[i2] = iM52750;
        }
        return iArr;
    }
}
