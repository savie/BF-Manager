package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W77C */
/* JADX INFO: loaded from: classes4.dex */
public final class C13214 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f42175 = m32729("1F2003D5");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f42177 = m32729("00F020E3");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final byte[] f42176 = m32729("00BF");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final byte[] f42178 = m32729("90");

    /* JADX WARN: Code duplicated, block: B:110:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:96:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0183 A[LOOP:0: B:97:0x0180->B:99:0x0183, LOOP_END] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10976 m32728(C14069 c14069, C18282 c18282, C5033 c5033, C17185 c17185, C8586 c8586) throws C10186 {
        C2270 c2270;
        String str;
        String str2;
        int i;
        String str3;
        byte[] bArr;
        byte[] bArrCopyOf;
        int length;
        String str4 = c17185.f56010;
        C2270 c2270M7704 = C2270.m7704(str4);
        String strM26895 = C10472.m26895(c2270M7704, c8586);
        String str5 = c8586.f28071;
        long j = c8586.f28068;
        byte[] bArr2 = c8586.f28073;
        boolean zEquals = "virtual".equals(c8586.f28070);
        if (zEquals && "thumb".equals(strM26895)) {
            j &= -2;
        }
        try {
            c5033.getClass();
            C9007 c9007M25418 = C9752.m25418(str4, j, zEquals, false);
            C15451.m36994(c9007M25418);
            if (!c9007M25418.f29351) {
                throw C10186.m26300("NATIVE_ADDRESS_NOT_MAPPED", "Native address is not mapped in the ELF file.");
            }
            if (!c9007M25418.f29350) {
                throw C10186.m26300("NATIVE_ADDRESS_NOT_EXECUTABLE", "Native address is not executable. Use mt_apk_native_map_address to inspect mapping.isLoaded and mapping.isExecutable.");
            }
            if (!zEquals) {
                j = c9007M25418.f29349;
            }
            long j2 = j;
            long j3 = c9007M25418.f29344;
            long j4 = c17185.f56015;
            int length2 = bArr2.length;
            if (j3 >= 0) {
                long j5 = c9007M25418.f29347;
                if (j5 >= 0) {
                    long j6 = c9007M25418.f29353;
                    if (j6 >= 0 && j5 <= j6 && j3 <= j4) {
                        long j7 = length2;
                        if (C25227.FOREVER_NS - j5 >= j7 && j5 + j7 <= j6 && C25227.FOREVER_NS - j3 >= j7 && j7 + j3 <= j4) {
                            if (j2 < 0 || j3 > 2147483647L) {
                                throw C15451.m36998();
                            }
                            String str6 = c8586.f28076;
                            if ("arm".equals(c2270M7704.m7706())) {
                                if (c2270.f7406 == 40) {
                                    str2 = "thumb";
                                    if (str2.equals(str)) {
                                        c2270 = c2270M7704;
                                        str = strM26895;
                                        i = 2;
                                    }
                                } else {
                                    c2270 = c2270M7704;
                                    str = strM26895;
                                    str2 = "thumb";
                                }
                                c2270 = c2270M7704;
                                str = strM26895;
                                i = 4;
                            } else {
                                str = strM26895;
                                c2270 = c2270M7704;
                                str2 = "thumb";
                                i = 1;
                            }
                            if (((((long) i) - 1) & j2) != 0) {
                                throw C10186.m26301("address must map to an aligned instruction address", "address", JSON.value(str6), JSON.array(i + "-byte aligned effective virtual address"), (JSONObject) null);
                            }
                            byte[] bArr3 = new byte[bArr2.length];
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str4), "r");
                                try {
                                    randomAccessFile.seek(j3);
                                    randomAccessFile.readFully(bArr3);
                                    randomAccessFile.close();
                                    if (!Arrays.equals(bArr3, bArr2)) {
                                        throw m32727(c8586, j3, C11218.m28264(bArr3));
                                    }
                                    String strM7706 = c2270.m7706();
                                    int iM7705 = c2270.m7705(str);
                                    String str7 = c8586.f28078;
                                    String str8 = c17185.f56010;
                                    try {
                                        c5033.getClass();
                                        C2296 c2296M25415 = C9752.m25415(strM7706, iM7705, j2, str7);
                                        try {
                                            byte[] bArrM7775 = c2296M25415.m7775();
                                            if (!strM7706.equals(c2296M25415.f7454) || iM7705 != c2296M25415.f7452 || j2 != c2296M25415.f7451 || bArrM7775.length == 0 || c2296M25415.f7453 != bArrM7775.length) {
                                                throw C15451.m36986();
                                            }
                                            if (bArrM7775.length > 256) {
                                                throw C10186.m26302("NATIVE_PATCH_TOO_LARGE", "Native instruction patch window is too large.", "warning", JSON.array(), JSON.object().add("expectedBytes", bArr2.length).add("assembledBytes", bArrM7775.length).add("paddingMode", str5));
                                            }
                                            int length3 = bArr2.length;
                                            if (bArrM7775.length > length3) {
                                                throw m32725(length3, bArrM7775.length, str5);
                                            }
                                            if ("none".equals(str5)) {
                                                if (bArrM7775.length != length3) {
                                                    throw m32725(length3, bArrM7775.length, str5);
                                                }
                                                bArrCopyOf = (byte[]) bArrM7775.clone();
                                            } else {
                                                int length4 = length3 - bArrM7775.length;
                                                String strM7707 = c2270.m7706();
                                                if ("arm".equals(strM7707)) {
                                                    str3 = "warning";
                                                    if (c2270.f7405 == 64) {
                                                        bArr = f42175;
                                                    }
                                                    if (length4 % bArr.length == 0) {
                                                        throw C10186.m26302("NATIVE_PATCH_NOP_UNAVAILABLE", "Remaining patch window cannot be filled with NOP instructions.", str3, JSON.array(), JSON.object().add("remainingBytes", length4).add("instructionSet", c2270.m7708(str)).add("instructionWidth", c2270.m7707(str)));
                                                    }
                                                    bArrCopyOf = Arrays.copyOf(bArrM7775, length3);
                                                    for (length = bArrM7775.length; length < bArrCopyOf.length; length += bArr.length) {
                                                        System.arraycopy(bArr, 0, bArrCopyOf, length, bArr.length);
                                                    }
                                                } else {
                                                    str3 = "warning";
                                                }
                                                if ("arm".equals(strM7707) && str2.equals(str)) {
                                                    bArr = f42176;
                                                } else if ("arm".equals(strM7707)) {
                                                    bArr = f42177;
                                                } else {
                                                    bArr = f42178;
                                                }
                                                if (length4 % bArr.length == 0) {
                                                    throw C10186.m26302("NATIVE_PATCH_NOP_UNAVAILABLE", "Remaining patch window cannot be filled with NOP instructions.", str3, JSON.array(), JSON.object().add("remainingBytes", length4).add("instructionSet", c2270.m7708(str)).add("instructionWidth", c2270.m7707(str)));
                                                }
                                                bArrCopyOf = Arrays.copyOf(bArrM7775, length3);
                                                while (length < bArrCopyOf.length) {
                                                    System.arraycopy(bArr, 0, bArrCopyOf, length, bArr.length);
                                                }
                                            }
                                            byte[] bArr4 = bArrCopyOf;
                                            ArrayList arrayList = new ArrayList(1);
                                            arrayList.add(new C1151((int) j3, bArr2, bArr4));
                                            try {
                                                c18282.m42590(c14069, new C9353(c8586.f28074, c8586.f28077, c8586.f28075, arrayList));
                                                return new C10976(c8586, str, j2, c9007M25418, strM7706, c2270.f7405, c2270.m7708(str), c2270.m7707(str), j3, bArrM7775, bArr4);
                                            } catch (C10186 e) {
                                                if ("PATCH_EXPECTED_MISMATCH".equals(e.f32601)) {
                                                    throw m32727(c8586, j3, e.f32602.getString("actualHex", ""));
                                                }
                                                throw e;
                                            }
                                        } catch (RuntimeException unused) {
                                            throw C15451.m36986();
                                        }
                                    } catch (C15938 e2) {
                                        throw m32726(strM7706, iM7705, j2, str, e2, str8);
                                    } catch (RuntimeException e3) {
                                        throw m32726(strM7706, iM7705, j2, str, e3, str8);
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
                            } catch (IOException | RuntimeException unused2) {
                                throw C10186.m26305("ENTRY_READ_FAILED", "Failed to read native byte window.");
                            }
                        }
                    }
                }
            }
            throw C15451.m36998();
        } catch (RuntimeException unused3) {
            throw C10186.m26305("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m32727(C8586 c8586, long j, String str) {
        return C10186.m26302("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", JSON.array(), JSON.object().add("workspaceId", c8586.f28074).add("editSessionId", c8586.f28077).add("locator", c8586.f28067).add("patchedFileOffset", C11218.m28261(j)).add("byteOffset", j).add("expectedHex", c8586.f28072).add("actualHex", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m32726(String str, int i, long j, String str2, RuntimeException runtimeException, String str3) {
        String message = runtimeException.getMessage();
        if (message == null) {
            message = runtimeException.getClass().getSimpleName();
        }
        String strReplace = message.replace(str3, "<path>");
        if (strReplace.length() > 512) {
            strReplace = strReplace.substring(0, 512);
        }
        return C10186.m26302("NATIVE_ASSEMBLY_FAILED", "Native instruction assembly failed.", "warning", JSON.array(), JSON.object().add("arch", str).add("bits", i).add("address", C11218.m28261(j)).add("instructionMode", str2).add("message", strReplace));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m32725(int i, int i2, String str) {
        return C10186.m26302("NATIVE_PATCH_LENGTH_MISMATCH", "Assembled bytes do not fit the expected patch window.", "warning", JSON.array(), JSON.object().add("expectedBytes", i).add("assembledBytes", i2).add("paddingMode", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m32729(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Character.digit(str.charAt(i2 + 1), 16) | (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }
}
