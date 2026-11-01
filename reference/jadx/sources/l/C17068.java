package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S76D */
/* JADX INFO: loaded from: classes4.dex */
public final class C17068 {
    /* JADX WARN: Code duplicated, block: B:195:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m39853(C20212 c20212, C2956 c2956, C18479 c18479, C12130 c12130) throws C12731 {
        C18129 c18129M36656;
        String str;
        long j;
        C17120 c17120M39976;
        int iMin;
        int i;
        long j2;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        C19541 c19541M36658;
        String str2;
        boolean z;
        C17120 c17120M39977;
        JSONValue jSONValueValue;
        JSONValue jSONValueValue2;
        JSONValue jSONValueValue3;
        String str3 = c2956.f11082;
        long j3 = c2956.f11084;
        C14247 c14247M34385 = C14247.m34385(str3);
        String strM20980 = C7948.m20980(c14247M34385, c18479);
        boolean z2 = c18479.f58887;
        long j4 = c18479.f58885;
        String str4 = c18479.f58888;
        boolean zEquals = "virtual".equals(str4);
        if (zEquals && "thumb".equals(strM20980)) {
            j4 &= -2;
        }
        String str5 = c2956.f11082;
        boolean z3 = c18479.f58887;
        C18129 c18129M30186 = c12130.m30186(str5, j4, zEquals, z3);
        if (c18129M30186 != null) {
            c18129M36656 = c18129M30186;
        } else {
            try {
                c20212.getClass();
                c18129M36656 = C15308.m36656(str5, j4, zEquals, z3);
            } catch (RuntimeException unused) {
                throw C12731.m31630("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
            }
        }
        long j5 = c18129M36656.f57972;
        long j6 = j4;
        long j7 = c18129M36656.f57961;
        long j8 = c18129M36656.f57970;
        C5831.m16041(c18129M36656);
        if (!c18129M36656.f57969) {
            throw C12731.m31625("NATIVE_ADDRESS_NOT_MAPPED", "Native address is not mapped in the ELF file.");
        }
        if (!c18129M36656.f57965) {
            throw C12731.m31625("NATIVE_ADDRESS_NOT_EXECUTABLE", "Native address is not executable. Use mt_apk_native_map_address to inspect mapping.isLoaded and mapping.isExecutable.");
        }
        long j9 = c18129M36656.f57968;
        long j10 = !zEquals ? j8 : j6;
        if (z2) {
            C5831.m16047(c18129M36656);
            C21657 c21657 = c18129M36656.f57964;
            boolean z4 = c21657.f70213;
            str = strM20980;
            j = j8;
            long j11 = c21657.f70212;
            if (z4) {
                long jM39852 = m39852(j11, c21657.f70210);
                long jM39853 = m39852(j11, c21657.f70214);
                if (jM39852 != j10 || j10 >= jM39853) {
                    throw C5831.m16032();
                }
                c17120M39976 = C17120.m39976(c21657, jM39853, false);
            } else {
                c17120M39976 = C17120.m39977(true);
            }
        } else {
            str = strM20980;
            j = j8;
            c17120M39976 = C17120.m39977(false);
        }
        long j12 = c17120M39976.f54592;
        boolean z5 = c17120M39976.f54594;
        if (j9 < 0 || j7 < 0 || j5 < 0 || j7 > j5 || j9 > j3 || j < 0 || j10 < 0) {
            throw C5831.m16037();
        }
        long j13 = j10;
        c12130.m30187(str3, c18129M36656, z2);
        long jMin = Math.min(j5 - j7, j3 - j9);
        if (jMin <= 0) {
            if (z5) {
                throw C5831.m16032();
            }
            String strM34390 = c14247M34385.m34390();
            int i2 = c14247M34385.f46656;
            String str6 = str;
            String strM34392 = c14247M34385.m34392(str6);
            String strM34391 = c14247M34385.m34391(str6);
            List list = Collections.EMPTY_LIST;
            JSONValue jSONValue = JSON.NULL;
            return C5831.m16024(c18479, str6, j13, c18129M36656, strM34390, i2, strM34392, strM34391, 0, 0, false, list, c17120M39976, false, jSONValue, jSONValue, jSONValue);
        }
        C18129 c18129 = c18129M36656;
        String str7 = str;
        C17120 c17120 = c17120M39976;
        if (z5) {
            long j14 = j12 - j13;
            if (j14 <= 0) {
                throw C5831.m16032();
            }
            jMin = Math.min(jMin, j14);
        }
        int iMin2 = (int) Math.min(c18479.f58889, jMin);
        if (z5 && iMin2 == 0) {
            throw C5831.m16032();
        }
        String strM34393 = c14247M34385.m34390();
        int iM34389 = c14247M34385.m34389(str7);
        if (!"x86".equals(strM34393)) {
            if ("arm".equals(strM34393) && iM34389 == 16) {
                i = 2;
            } else {
                iMin = iMin2;
            }
            j2 = C17492.FOREVER_NS - j13;
            if (j2 >= iMin) {
                throw C5831.m16037();
            }
            bArr = new byte[iMin];
            try {
                randomAccessFile = new RandomAccessFile(new File(str3), "r");
                try {
                    randomAccessFile.seek(j9);
                    randomAccessFile.readFully(bArr);
                    randomAccessFile.close();
                    int i3 = c18479.f58884;
                    try {
                        c20212.getClass();
                        c19541M36658 = C15308.m36658(strM34393, iM34389, j13, bArr, i3);
                        str2 = strM34393;
                        if (str2.equals(c19541M36658.f62813) || iM34389 != c19541M36658.f62816) {
                            throw C5831.m16032();
                        }
                        int i4 = c19541M36658.f62815;
                        if (i4 < 0 || i4 > iMin) {
                            throw C5831.m16032();
                        }
                        boolean z6 = c19541M36658.f62812;
                        if (z6 && i4 >= iMin) {
                            throw C5831.m16032();
                        }
                        int i5 = c18479.f58884;
                        List list2 = c19541M36658.f62814;
                        if (list2.size() > i5) {
                            throw C5831.m16032();
                        }
                        ArrayList arrayList = new ArrayList(list2.size());
                        Iterator it = list2.iterator();
                        int i6 = 0;
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            C8252 c8252 = (C8252) it.next();
                            String str8 = str2;
                            int i7 = c8252.f28705;
                            if (i7 <= 0 || i6 > i4 - i7) {
                                throw C5831.m16032();
                            }
                            long j15 = jMin;
                            long j16 = i6;
                            if (j16 < 0 || j10 < 0 || j2 < j16) {
                                throw C5831.m16037();
                            }
                            long j17 = j13 + j16;
                            if (i6 < 0 || i7 < 0 || i6 > iMin - i7) {
                                throw C5831.m16032();
                            }
                            char[] cArr = new char[i7 * 2];
                            int i8 = 0;
                            while (i8 < i7) {
                                byte b = bArr[i6 + i8];
                                int i9 = i8 * 2;
                                char[] cArr2 = C22253.f72746;
                                cArr[i9] = cArr2[(b & 255) >>> 4];
                                cArr[i9 + 1] = cArr2[b & 15];
                                i8++;
                                bArr = bArr;
                            }
                            byte[] bArr2 = bArr;
                            String str9 = new String(cArr);
                            String str10 = c8252.f28706;
                            arrayList.add(new C0186(str9, i7, j17, str10 == null ? "" : str10.replace('\r', ' ').replace('\n', ' ')));
                            i6 += c8252.f28705;
                            it = it2;
                            jMin = j15;
                            bArr = bArr2;
                            iMin = iMin;
                            str2 = str8;
                        }
                        long j18 = jMin;
                        String str11 = str2;
                        if (i6 != i4) {
                            throw C5831.m16032();
                        }
                        ArrayList arrayList2 = new ArrayList();
                        boolean z7 = z6 && i4 < iMin2;
                        Iterator it3 = arrayList.iterator();
                        int i10 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                C0186 c0186 = (C0186) it3.next();
                                if (i10 < iMin2) {
                                    if (c0186.f1305 > iMin2 - i10) {
                                        z = true;
                                        break;
                                    }
                                    arrayList2.add(c0186);
                                    i10 += c0186.f1305;
                                }
                            }
                            z = z7;
                            break;
                        }
                        if (z5) {
                            c17120M39977 = C17120.m39976(C21657.m48367(c17120.f54595, c17120.f54598, "", c17120.f54593, -1L, c17120.f54599, c17120.f54597), j12, m39852(j13, (long) i10) == j12);
                        } else {
                            c17120M39977 = c17120;
                        }
                        boolean z8 = !z && i10 > 0 && ((long) i10) < j18;
                        JSONValue jSONValue2 = JSON.NULL;
                        if (z8) {
                            long j19 = zEquals ? j13 : j9;
                            long j20 = i10;
                            if (j20 < 0 || j19 < 0 || C17492.FOREVER_NS - j19 < j20) {
                                throw C5831.m16037();
                            }
                            jSONValueValue = JSON.value(str4);
                            jSONValueValue2 = JSON.value(C16363.m38542(j19 + j20));
                            jSONValueValue3 = JSON.value(str7);
                        } else {
                            jSONValueValue = jSONValue2;
                            jSONValueValue2 = jSONValueValue;
                            jSONValueValue3 = jSONValueValue2;
                        }
                        return C5831.m16024(c18479, str7, j13, c18129, str11, c14247M34385.f46656, c14247M34385.m34392(str7), c14247M34385.m34391(str7), iMin2, i10, z, arrayList2, c17120M39977, z8, jSONValueValue, jSONValueValue2, jSONValueValue3);
                    } catch (RuntimeException unused2) {
                        throw C12731.m31630("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
                    }
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException | RuntimeException unused3) {
                throw C12731.m31630("ENTRY_READ_FAILED", "Failed to read native byte window.");
            }
        }
        i = 14;
        iMin = (int) Math.min(jMin, ((long) iMin2) + ((long) i));
        j2 = C17492.FOREVER_NS - j13;
        if (j2 >= iMin) {
            throw C5831.m16037();
        }
        bArr = new byte[iMin];
        randomAccessFile = new RandomAccessFile(new File(str3), "r");
        randomAccessFile.seek(j9);
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        int i11 = c18479.f58884;
        c20212.getClass();
        c19541M36658 = C15308.m36658(strM34393, iM34389, j13, bArr, i11);
        str2 = strM34393;
        if (str2.equals(c19541M36658.f62813)) {
        }
        throw C5831.m16032();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m39852(long j, long j2) throws C12731 {
        if (j2 < 0 || j < 0 || C17492.FOREVER_NS - j < j2) {
            throw C5831.m16032();
        }
        return j + j2;
    }
}
