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

/* JADX INFO: renamed from: l.ᩳ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W9NV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19325 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f62424 = {KeyFactorySpi.Ed25519_type, 114, KeyFactorySpi.x448_type, 0};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f62425 = {KeyFactorySpi.Ed25519_type, 114, 109, 0};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44690(String str, byte[] bArr, String str2) {
        byte[] bArr2 = C8883.f29008;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C8883.f29013;
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
                return C8947.m23910(C10732.m27333(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44693(ByteArrayOutputStream byteArrayOutputStream, C16341 c16341, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        C23801.m53098(byteArrayOutputStream, str.getBytes(charset).length);
        C23801.m53098(byteArrayOutputStream, c16341.f53078);
        C23801.m53099(byteArrayOutputStream, c16341.f53076, 4);
        C23801.m53099(byteArrayOutputStream, c16341.f53079, 4);
        C23801.m53099(byteArrayOutputStream, c16341.f53071, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44694(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C16341[] c16341Arr) throws IOException {
        int length;
        byte[] bArr2 = C8883.f29009;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = C8883.f29010;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM44695 = m44695(c16341Arr, bArr3);
                C23801.m53099(byteArrayOutputStream, c16341Arr.length, 1);
                C23801.m53099(byteArrayOutputStream, bArrM44695.length, 4);
                byte[] bArrM53102 = C23801.m53102(bArrM44695);
                C23801.m53099(byteArrayOutputStream, bArrM53102.length, 4);
                byteArrayOutputStream.write(bArrM53102);
                return true;
            }
            byte[] bArr4 = C8883.f29013;
            if (Arrays.equals(bArr, bArr4)) {
                C23801.m53099(byteArrayOutputStream, c16341Arr.length, 1);
                for (C16341 c16341 : c16341Arr) {
                    int size = c16341.f53073.size() * 4;
                    String strM44690 = m44690(c16341.f53072, bArr4, c16341.f53077);
                    Charset charset = StandardCharsets.UTF_8;
                    C23801.m53098(byteArrayOutputStream, strM44690.getBytes(charset).length);
                    C23801.m53098(byteArrayOutputStream, c16341.f53074.length);
                    C23801.m53099(byteArrayOutputStream, size, 4);
                    C23801.m53099(byteArrayOutputStream, c16341.f53079, 4);
                    byteArrayOutputStream.write(strM44690.getBytes(charset));
                    Iterator it = c16341.f53073.keySet().iterator();
                    while (it.hasNext()) {
                        C23801.m53098(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        C23801.m53098(byteArrayOutputStream, 0);
                    }
                    for (int i : c16341.f53074) {
                        C23801.m53098(byteArrayOutputStream, i);
                    }
                }
                return true;
            }
            byte[] bArr5 = C8883.f29011;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM44696 = m44695(c16341Arr, bArr5);
                C23801.m53099(byteArrayOutputStream, c16341Arr.length, 1);
                C23801.m53099(byteArrayOutputStream, bArrM44696.length, 4);
                byte[] bArrM53103 = C23801.m53102(bArrM44696);
                C23801.m53099(byteArrayOutputStream, bArrM53103.length, 4);
                byteArrayOutputStream.write(bArrM53103);
                return true;
            }
            byte[] bArr6 = C8883.f29008;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            C23801.m53098(byteArrayOutputStream, c16341Arr.length);
            for (C16341 c16342 : c16341Arr) {
                String str = c16342.f53072;
                TreeMap treeMap = c16342.f53073;
                String strM44691 = m44690(str, bArr6, c16342.f53077);
                Charset charset2 = StandardCharsets.UTF_8;
                C23801.m53098(byteArrayOutputStream, strM44691.getBytes(charset2).length);
                C23801.m53098(byteArrayOutputStream, treeMap.size());
                C23801.m53098(byteArrayOutputStream, c16342.f53074.length);
                C23801.m53099(byteArrayOutputStream, c16342.f53079, 4);
                byteArrayOutputStream.write(strM44691.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    C23801.m53098(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i2 : c16342.f53074) {
                    C23801.m53098(byteArrayOutputStream, i2);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            C23801.m53098(byteArrayOutputStream2, c16341Arr.length);
            int i3 = 2;
            for (C16341 c16343 : c16341Arr) {
                C23801.m53099(byteArrayOutputStream2, c16343.f53079, 4);
                C23801.m53099(byteArrayOutputStream2, c16343.f53075, 4);
                C23801.m53099(byteArrayOutputStream2, c16343.f53071, 4);
                String strM44692 = m44690(c16343.f53072, bArr2, c16343.f53077);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM44692.getBytes(charset3).length;
                C23801.m53098(byteArrayOutputStream2, length2);
                i3 = i3 + 14 + length2;
                byteArrayOutputStream2.write(strM44692.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i3 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            }
            C7392 c7392 = new C7392(EnumC3663.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(c7392);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i4 = 0;
            for (int i5 = 0; i5 < c16341Arr.length; i5++) {
                try {
                    C16341 c16344 = c16341Arr[i5];
                    C23801.m53098(byteArrayOutputStream3, i5);
                    C23801.m53098(byteArrayOutputStream3, c16344.f53078);
                    i4 = i4 + 4 + (c16344.f53078 * 2);
                    int[] iArr = c16344.f53074;
                    int length3 = iArr.length;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length3) {
                        int i8 = iArr[i6];
                        C23801.m53098(byteArrayOutputStream3, i8 - i7);
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
            C7392 c7393 = new C7392(EnumC3663.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(c7393);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i9 = 0;
            for (int i10 = 0; i10 < c16341Arr.length; i10++) {
                try {
                    C16341 c16345 = c16341Arr[i10];
                    Iterator it3 = c16345.f53073.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m44691(byteArrayOutputStream5, iIntValue, c16345);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m44702(byteArrayOutputStream6, c16345);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            C23801.m53098(byteArrayOutputStream4, i10);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i11 = i9 + 6;
                            C23801.m53099(byteArrayOutputStream4, length4, 4);
                            C23801.m53098(byteArrayOutputStream4, iIntValue);
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
            C7392 c7394 = new C7392(EnumC3663.METHODS, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(c7394);
            long j = 4;
            long size2 = j + j + 4 + ((long) (arrayList.size() * 16));
            C23801.m53099(byteArrayOutputStream, arrayList.size(), 4);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                C7392 c7395 = (C7392) arrayList.get(i12);
                EnumC3663 enumC3663 = c7395.f24371;
                byte[] bArr7 = c7395.f24370;
                C23801.m53099(byteArrayOutputStream, enumC3663.getValue(), 4);
                C23801.m53099(byteArrayOutputStream, size2, 4);
                if (c7395.f24372) {
                    long length5 = bArr7.length;
                    byte[] bArrM53104 = C23801.m53102(bArr7);
                    arrayList2.add(bArrM53104);
                    C23801.m53099(byteArrayOutputStream, bArrM53104.length, 4);
                    C23801.m53099(byteArrayOutputStream, length5, 4);
                    length = bArrM53104.length;
                } else {
                    arrayList2.add(bArr7);
                    C23801.m53099(byteArrayOutputStream, bArr7.length, 4);
                    C23801.m53099(byteArrayOutputStream, 0L, 4);
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
    public static byte[] m44695(C16341[] c16341Arr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C16341 c16341 : c16341Arr) {
            length += ((((c16341.f53071 * 2) + 7) & (-8)) / 8) + (c16341.f53078 * 2) + m44690(c16341.f53072, bArr, c16341.f53077).getBytes(StandardCharsets.UTF_8).length + 16 + c16341.f53076;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, C8883.f29011)) {
            int length2 = c16341Arr.length;
            while (i < length2) {
                C16341 c16342 = c16341Arr[i];
                m44693(byteArrayOutputStream, c16342, m44690(c16342.f53072, bArr, c16342.f53077));
                m44692(byteArrayOutputStream, c16342);
                i++;
            }
        } else {
            for (C16341 c16343 : c16341Arr) {
                m44693(byteArrayOutputStream, c16343, m44690(c16343.f53072, bArr, c16343.f53077));
            }
            int length3 = c16341Arr.length;
            while (i < length3) {
                m44692(byteArrayOutputStream, c16341Arr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() != length) {
            throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44692(ByteArrayOutputStream byteArrayOutputStream, C16341 c16341) throws IOException {
        m44702(byteArrayOutputStream, c16341);
        int i = c16341.f53071;
        int[] iArr = c16341.f53074;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            C23801.m53098(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c16341.f53073.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m44702(ByteArrayOutputStream byteArrayOutputStream, C16341 c16341) throws IOException {
        int i = 0;
        for (Map.Entry entry : c16341.f53073.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                C23801.m53098(byteArrayOutputStream, iIntValue - i);
                C23801.m53098(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44691(ByteArrayOutputStream byteArrayOutputStream, int i, C16341 c16341) throws IOException {
        int i2 = c16341.f53071;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c16341.f53073.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16341[] m44700(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, C8883.f29010)) {
            int iM53103 = (int) C23801.m53103(fileInputStream, 1);
            byte[] bArrM53100 = C23801.m53100(fileInputStream, (int) C23801.m53103(fileInputStream, 4), (int) C23801.m53103(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM53100);
            try {
                C16341[] c16341ArrM44698 = m44698(byteArrayInputStream, str, iM53103);
                byteArrayInputStream.close();
                return c16341ArrM44698;
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
    public static C16341[] m44701(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C16341[] c16341Arr) throws IOException {
        byte[] bArr3 = C8883.f29007;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, C8883.f29012)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM53103 = (int) C23801.m53103(fileInputStream, 2);
            byte[] bArrM53100 = C23801.m53100(fileInputStream, (int) C23801.m53103(fileInputStream, 4), (int) C23801.m53103(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM53100);
            try {
                C16341[] c16341ArrM44699 = m44699(byteArrayInputStream, bArr2, iM53103, c16341Arr);
                byteArrayInputStream.close();
                return c16341ArrM44699;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(C8883.f29009, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM53104 = (int) C23801.m53103(fileInputStream, 1);
        byte[] bArrM53101 = C23801.m53100(fileInputStream, (int) C23801.m53103(fileInputStream, 4), (int) C23801.m53103(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM53101);
        try {
            C16341[] c16341ArrM44697 = m44697(byteArrayInputStream2, iM53104, c16341Arr);
            byteArrayInputStream2.close();
            return c16341ArrM44697;
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
    public static C16341[] m44699(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C16341[] c16341Arr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C16341[0];
        }
        if (i != c16341Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            C23801.m53103(byteArrayInputStream, 2);
            String str = new String(C23801.m53101(byteArrayInputStream, (int) C23801.m53103(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM53103 = C23801.m53103(byteArrayInputStream, 4);
            int iM53103 = (int) C23801.m53103(byteArrayInputStream, 2);
            C16341 c16341 = null;
            if (c16341Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < c16341Arr.length; i3++) {
                    if (c16341Arr[i3].f53077.equals(strSubstring)) {
                        c16341 = c16341Arr[i3];
                        break;
                    }
                }
            }
            if (c16341 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c16341.f53075 = jM53103;
            int[] iArrM44696 = m44696(byteArrayInputStream, iM53103);
            if (Arrays.equals(bArr, C8883.f29008)) {
                c16341.f53078 = iM53103;
                c16341.f53074 = iArrM44696;
            }
        }
        return c16341Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16341[] m44697(ByteArrayInputStream byteArrayInputStream, int i, C16341[] c16341Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C16341[0];
        }
        if (i != c16341Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM53103 = (int) C23801.m53103(byteArrayInputStream, 2);
            iArr[i2] = (int) C23801.m53103(byteArrayInputStream, 2);
            strArr[i2] = new String(C23801.m53101(byteArrayInputStream, iM53103), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C16341 c16341 = c16341Arr[i3];
            if (!c16341.f53077.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c16341.f53078 = i4;
            c16341.f53074 = m44696(byteArrayInputStream, i4);
        }
        return c16341Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16341[] m44698(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2;
        if (byteArrayInputStream.available() == 0) {
            return new C16341[0];
        }
        C16341[] c16341Arr = new C16341[i];
        int i3 = 0;
        while (true) {
            i2 = 2;
            if (i3 >= i) {
                break;
            }
            int iM53103 = (int) C23801.m53103(byteArrayInputStream, 2);
            int iM53104 = (int) C23801.m53103(byteArrayInputStream, 2);
            c16341Arr[i3] = new C16341(str, new String(C23801.m53101(byteArrayInputStream, iM53103), StandardCharsets.UTF_8), C23801.m53103(byteArrayInputStream, 4), iM53104, (int) C23801.m53103(byteArrayInputStream, 4), (int) C23801.m53103(byteArrayInputStream, 4), new int[iM53104], new TreeMap());
            i3++;
        }
        for (int i4 = 0; i4 < i; i4++) {
            C16341 c16341 = c16341Arr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c16341.f53076;
            int i6 = c16341.f53071;
            TreeMap treeMap = c16341.f53073;
            int i7 = iAvailable - i5;
            int iM53105 = 0;
            while (byteArrayInputStream.available() > i7) {
                iM53105 += (int) C23801.m53103(byteArrayInputStream, i2);
                treeMap.put(Integer.valueOf(iM53105), 1);
                int iM53106 = (int) C23801.m53103(byteArrayInputStream, i2);
                while (iM53106 > 0) {
                    C23801.m53103(byteArrayInputStream, i2);
                    int iM53107 = (int) C23801.m53103(byteArrayInputStream, 1);
                    if (iM53107 != 6 && iM53107 != 7) {
                        while (iM53107 > 0) {
                            C23801.m53103(byteArrayInputStream, 1);
                            C16341 c16342 = c16341;
                            for (int iM53108 = (int) C23801.m53103(byteArrayInputStream, 1); iM53108 > 0; iM53108--) {
                                C23801.m53103(byteArrayInputStream, 2);
                            }
                            i2 = 2;
                            iM53107--;
                            c16341 = c16342;
                        }
                    }
                    iM53106--;
                    c16341 = c16341;
                }
            }
            C16341 c16343 = c16341;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c16343.f53074 = m44696(byteArrayInputStream, c16343.f53078);
            BitSet bitSetValueOf = BitSet.valueOf(C23801.m53101(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
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
        return c16341Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m44696(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM53103 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM53103 += (int) C23801.m53103(byteArrayInputStream, 2);
            iArr[i2] = iM53103;
        }
        return iArr;
    }
}
