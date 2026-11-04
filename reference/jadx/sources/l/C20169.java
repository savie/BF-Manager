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

/* JADX INFO: renamed from: l.ᩴ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S76D */
/* JADX INFO: loaded from: classes5.dex */
public final class C20169 {
    /* JADX WARN: Code duplicated, block: B:195:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m46397(C5033 c5033, C17185 c17185, C19028 c19028, C23153 c23153) throws C10186 {
        C9007 c9007M25418;
        String str;
        long j;
        C19927 c19927M45854;
        int iMin;
        int i;
        long j2;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        C6771 c6771M25417;
        String str2;
        boolean z;
        C19927 c19927M45855;
        JSONValue jSONValueValue;
        JSONValue jSONValueValue2;
        JSONValue jSONValueValue3;
        String str3 = c17185.f56010;
        long j3 = c17185.f56015;
        C2270 c2270M7704 = C2270.m7704(str3);
        String strM26897 = C10472.m26897(c2270M7704, c19028);
        boolean z2 = c19028.f61644;
        long j4 = c19028.f61641;
        String str4 = c19028.f61643;
        boolean zEquals = "virtual".equals(str4);
        if (zEquals && "thumb".equals(strM26897)) {
            j4 &= -2;
        }
        String str5 = c17185.f56010;
        boolean z3 = c19028.f61644;
        C9007 c9007M52072 = c23153.m52072(str5, j4, zEquals, z3);
        if (c9007M52072 != null) {
            c9007M25418 = c9007M52072;
        } else {
            try {
                c5033.getClass();
                c9007M25418 = C9752.m25418(str5, j4, zEquals, z3);
            } catch (RuntimeException unused) {
                throw C10186.m26305("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
            }
        }
        long j5 = c9007M25418.f29353;
        long j6 = j4;
        long j7 = c9007M25418.f29347;
        long j8 = c9007M25418.f29349;
        C15451.m36994(c9007M25418);
        if (!c9007M25418.f29351) {
            throw C10186.m26300("NATIVE_ADDRESS_NOT_MAPPED", "Native address is not mapped in the ELF file.");
        }
        if (!c9007M25418.f29350) {
            throw C10186.m26300("NATIVE_ADDRESS_NOT_EXECUTABLE", "Native address is not executable. Use mt_apk_native_map_address to inspect mapping.isLoaded and mapping.isExecutable.");
        }
        long j9 = c9007M25418.f29344;
        long j10 = !zEquals ? j8 : j6;
        if (z2) {
            C15451.m37003(c9007M25418);
            C0804 c0804 = c9007M25418.f29343;
            boolean z4 = c0804.f2852;
            str = strM26897;
            j = j8;
            long j11 = c0804.f2847;
            if (z4) {
                long jM46396 = m46396(j11, c0804.f2851);
                long jM46397 = m46396(j11, c0804.f2850);
                if (jM46396 != j10 || j10 >= jM46397) {
                    throw C15451.m36986();
                }
                c19927M45854 = C19927.m45854(c0804, jM46397, false);
            } else {
                c19927M45854 = C19927.m45855(true);
            }
        } else {
            str = strM26897;
            j = j8;
            c19927M45854 = C19927.m45855(false);
        }
        long j12 = c19927M45854.f64098;
        boolean z5 = c19927M45854.f64091;
        if (j9 < 0 || j7 < 0 || j5 < 0 || j7 > j5 || j9 > j3 || j < 0 || j10 < 0) {
            throw C15451.m36998();
        }
        long j13 = j10;
        c23153.m52073(str3, c9007M25418, z2);
        long jMin = Math.min(j5 - j7, j3 - j9);
        if (jMin <= 0) {
            if (z5) {
                throw C15451.m36986();
            }
            String strM7706 = c2270M7704.m7706();
            int i2 = c2270M7704.f7405;
            String str6 = str;
            String strM7708 = c2270M7704.m7708(str6);
            String strM7707 = c2270M7704.m7707(str6);
            List list = Collections.EMPTY_LIST;
            JSONValue jSONValue = JSON.NULL;
            return C15451.m36979(c19028, str6, j13, c9007M25418, strM7706, i2, strM7708, strM7707, 0, 0, false, list, c19927M45854, false, jSONValue, jSONValue, jSONValue);
        }
        C9007 c9007 = c9007M25418;
        String str7 = str;
        C19927 c19927 = c19927M45854;
        if (z5) {
            long j14 = j12 - j13;
            if (j14 <= 0) {
                throw C15451.m36986();
            }
            jMin = Math.min(jMin, j14);
        }
        int iMin2 = (int) Math.min(c19028.f61642, jMin);
        if (z5 && iMin2 == 0) {
            throw C15451.m36986();
        }
        String strM7709 = c2270M7704.m7706();
        int iM7705 = c2270M7704.m7705(str7);
        if (!"x86".equals(strM7709)) {
            if ("arm".equals(strM7709) && iM7705 == 16) {
                i = 2;
            } else {
                iMin = iMin2;
            }
            j2 = C25227.FOREVER_NS - j13;
            if (j2 >= iMin) {
                throw C15451.m36998();
            }
            bArr = new byte[iMin];
            try {
                randomAccessFile = new RandomAccessFile(new File(str3), "r");
                try {
                    randomAccessFile.seek(j9);
                    randomAccessFile.readFully(bArr);
                    randomAccessFile.close();
                    int i3 = c19028.f61640;
                    try {
                        c5033.getClass();
                        c6771M25417 = C9752.m25417(strM7709, iM7705, j13, bArr, i3);
                        str2 = strM7709;
                        if (str2.equals(c6771M25417.f22583) || iM7705 != c6771M25417.f22586) {
                            throw C15451.m36986();
                        }
                        int i4 = c6771M25417.f22584;
                        if (i4 < 0 || i4 > iMin) {
                            throw C15451.m36986();
                        }
                        boolean z6 = c6771M25417.f22587;
                        if (z6 && i4 >= iMin) {
                            throw C15451.m36986();
                        }
                        int i5 = c19028.f61640;
                        List list2 = c6771M25417.f22585;
                        if (list2.size() > i5) {
                            throw C15451.m36986();
                        }
                        ArrayList arrayList = new ArrayList(list2.size());
                        Iterator it = list2.iterator();
                        int i6 = 0;
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            C8262 c8262 = (C8262) it.next();
                            String str8 = str2;
                            int i7 = c8262.f27199;
                            if (i7 <= 0 || i6 > i4 - i7) {
                                throw C15451.m36986();
                            }
                            long j15 = jMin;
                            long j16 = i6;
                            if (j16 < 0 || j10 < 0 || j2 < j16) {
                                throw C15451.m36998();
                            }
                            long j17 = j13 + j16;
                            if (i6 < 0 || i7 < 0 || i6 > iMin - i7) {
                                throw C15451.m36986();
                            }
                            char[] cArr = new char[i7 * 2];
                            int i8 = 0;
                            while (i8 < i7) {
                                byte b = bArr[i6 + i8];
                                int i9 = i8 * 2;
                                char[] cArr2 = C15022.f49061;
                                cArr[i9] = cArr2[(b & 255) >>> 4];
                                cArr[i9 + 1] = cArr2[b & 15];
                                i8++;
                                bArr = bArr;
                            }
                            byte[] bArr2 = bArr;
                            String str9 = new String(cArr);
                            String str10 = c8262.f27200;
                            arrayList.add(new C22165(str9, i7, j17, str10 == null ? "" : str10.replace('\r', ' ').replace('\n', ' ')));
                            i6 += c8262.f27199;
                            it = it2;
                            jMin = j15;
                            bArr = bArr2;
                            iMin = iMin;
                            str2 = str8;
                        }
                        long j18 = jMin;
                        String str11 = str2;
                        if (i6 != i4) {
                            throw C15451.m36986();
                        }
                        ArrayList arrayList2 = new ArrayList();
                        boolean z7 = z6 && i4 < iMin2;
                        Iterator it3 = arrayList.iterator();
                        int i10 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                C22165 c22165 = (C22165) it3.next();
                                if (i10 < iMin2) {
                                    if (c22165.f71388 > iMin2 - i10) {
                                        z = true;
                                        break;
                                    }
                                    arrayList2.add(c22165);
                                    i10 += c22165.f71388;
                                }
                            }
                            z = z7;
                            break;
                        }
                        if (z5) {
                            c19927M45855 = C19927.m45854(C0804.m3224(c19927.f64096, c19927.f64097, "", c19927.f64090, -1L, c19927.f64095, c19927.f64092), j12, m46396(j13, (long) i10) == j12);
                        } else {
                            c19927M45855 = c19927;
                        }
                        boolean z8 = !z && i10 > 0 && ((long) i10) < j18;
                        JSONValue jSONValue2 = JSON.NULL;
                        if (z8) {
                            long j19 = zEquals ? j13 : j9;
                            long j20 = i10;
                            if (j20 < 0 || j19 < 0 || C25227.FOREVER_NS - j19 < j20) {
                                throw C15451.m36998();
                            }
                            jSONValueValue = JSON.value(str4);
                            jSONValueValue2 = JSON.value(C11218.m28261(j19 + j20));
                            jSONValueValue3 = JSON.value(str7);
                        } else {
                            jSONValueValue = jSONValue2;
                            jSONValueValue2 = jSONValueValue;
                            jSONValueValue3 = jSONValueValue2;
                        }
                        return C15451.m36979(c19028, str7, j13, c9007, str11, c2270M7704.f7405, c2270M7704.m7708(str7), c2270M7704.m7707(str7), iMin2, i10, z, arrayList2, c19927M45855, z8, jSONValueValue, jSONValueValue2, jSONValueValue3);
                    } catch (RuntimeException unused2) {
                        throw C10186.m26305("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
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
                throw C10186.m26305("ENTRY_READ_FAILED", "Failed to read native byte window.");
            }
        }
        i = 14;
        iMin = (int) Math.min(jMin, ((long) iMin2) + ((long) i));
        j2 = C25227.FOREVER_NS - j13;
        if (j2 >= iMin) {
            throw C15451.m36998();
        }
        bArr = new byte[iMin];
        randomAccessFile = new RandomAccessFile(new File(str3), "r");
        randomAccessFile.seek(j9);
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        int i11 = c19028.f61640;
        c5033.getClass();
        c6771M25417 = C9752.m25417(strM7709, iM7705, j13, bArr, i11);
        str2 = strM7709;
        if (str2.equals(c6771M25417.f22583)) {
        }
        throw C15451.m36986();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m46396(long j, long j2) throws C10186 {
        if (j2 < 0 || j < 0 || C25227.FOREVER_NS - j < j2) {
            throw C15451.m36986();
        }
        return j + j2;
    }
}
