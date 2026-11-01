package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۙ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W77C */
/* JADX INFO: loaded from: classes3.dex */
public final class C10771 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f36720 = m27074("1F2003D5");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f36722 = m27074("00F020E3");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f36721 = m27074("00BF");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final byte[] f36719 = m27074("90");

    /* JADX WARN: Code duplicated, block: B:110:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:96:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0183 A[LOOP:0: B:97:0x0180->B:99:0x0183, LOOP_END] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16415 m27073(C21956 c21956, C14952 c14952, C20212 c20212, C2956 c2956, C7190 c7190) throws C12731 {
        C14247 c14247;
        String str;
        String str2;
        int i;
        String str3;
        byte[] bArr;
        byte[] bArrCopyOf;
        int length;
        String str4 = c2956.f11082;
        C14247 c14247M34385 = C14247.m34385(str4);
        String strM20978 = C7948.m20978(c14247M34385, c7190);
        String str5 = c7190.f23990;
        long j = c7190.f23988;
        byte[] bArr2 = c7190.f23995;
        boolean zEquals = "virtual".equals(c7190.f23991);
        if (zEquals && "thumb".equals(strM20978)) {
            j &= -2;
        }
        try {
            c20212.getClass();
            C18129 c18129M36656 = C15308.m36656(str4, j, zEquals, false);
            C5831.m16041(c18129M36656);
            if (!c18129M36656.f57969) {
                throw C12731.m31625("NATIVE_ADDRESS_NOT_MAPPED", "Native address is not mapped in the ELF file.");
            }
            if (!c18129M36656.f57965) {
                throw C12731.m31625("NATIVE_ADDRESS_NOT_EXECUTABLE", "Native address is not executable. Use mt_apk_native_map_address to inspect mapping.isLoaded and mapping.isExecutable.");
            }
            if (!zEquals) {
                j = c18129M36656.f57970;
            }
            long j2 = j;
            long j3 = c18129M36656.f57968;
            long j4 = c2956.f11084;
            int length2 = bArr2.length;
            if (j3 >= 0) {
                long j5 = c18129M36656.f57961;
                if (j5 >= 0) {
                    long j6 = c18129M36656.f57972;
                    if (j6 >= 0 && j5 <= j6 && j3 <= j4) {
                        long j7 = length2;
                        if (C17492.FOREVER_NS - j5 >= j7 && j5 + j7 <= j6 && C17492.FOREVER_NS - j3 >= j7 && j7 + j3 <= j4) {
                            if (j2 < 0 || j3 > 2147483647L) {
                                throw C5831.m16037();
                            }
                            String str6 = c7190.f23993;
                            if ("arm".equals(c14247M34385.m34390())) {
                                if (c14247.f46657 == 40) {
                                    str2 = "thumb";
                                    if (str2.equals(str)) {
                                        c14247 = c14247M34385;
                                        str = strM20978;
                                        i = 2;
                                    }
                                } else {
                                    c14247 = c14247M34385;
                                    str = strM20978;
                                    str2 = "thumb";
                                }
                                c14247 = c14247M34385;
                                str = strM20978;
                                i = 4;
                            } else {
                                str = strM20978;
                                c14247 = c14247M34385;
                                str2 = "thumb";
                                i = 1;
                            }
                            if (((((long) i) - 1) & j2) != 0) {
                                throw C12731.m31626("address must map to an aligned instruction address", "address", JSON.value(str6), JSON.array(i + "-byte aligned effective virtual address"), (JSONObject) null);
                            }
                            byte[] bArr3 = new byte[bArr2.length];
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str4), "r");
                                try {
                                    randomAccessFile.seek(j3);
                                    randomAccessFile.readFully(bArr3);
                                    randomAccessFile.close();
                                    if (!Arrays.equals(bArr3, bArr2)) {
                                        throw m27072(c7190, j3, C16363.m38545(bArr3));
                                    }
                                    String strM34390 = c14247.m34390();
                                    int iM34389 = c14247.m34389(str);
                                    String str7 = c7190.f23996;
                                    String str8 = c2956.f11082;
                                    try {
                                        c20212.getClass();
                                        C18835 c18835M36657 = C15308.m36657(strM34390, iM34389, j2, str7);
                                        try {
                                            byte[] bArrM43468 = c18835M36657.m43468();
                                            if (!strM34390.equals(c18835M36657.f61030) || iM34389 != c18835M36657.f61029 || j2 != c18835M36657.f61027 || bArrM43468.length == 0 || c18835M36657.f61028 != bArrM43468.length) {
                                                throw C5831.m16032();
                                            }
                                            if (bArrM43468.length > 256) {
                                                throw C12731.m31627("NATIVE_PATCH_TOO_LARGE", "Native instruction patch window is too large.", "warning", JSON.array(), JSON.object().add("expectedBytes", bArr2.length).add("assembledBytes", bArrM43468.length).add("paddingMode", str5));
                                            }
                                            int length3 = bArr2.length;
                                            if (bArrM43468.length > length3) {
                                                throw m27070(length3, bArrM43468.length, str5);
                                            }
                                            if ("none".equals(str5)) {
                                                if (bArrM43468.length != length3) {
                                                    throw m27070(length3, bArrM43468.length, str5);
                                                }
                                                bArrCopyOf = (byte[]) bArrM43468.clone();
                                            } else {
                                                int length4 = length3 - bArrM43468.length;
                                                String strM34391 = c14247.m34390();
                                                if ("arm".equals(strM34391)) {
                                                    str3 = "warning";
                                                    if (c14247.f46656 == 64) {
                                                        bArr = f36720;
                                                    }
                                                    if (length4 % bArr.length == 0) {
                                                        throw C12731.m31627("NATIVE_PATCH_NOP_UNAVAILABLE", "Remaining patch window cannot be filled with NOP instructions.", str3, JSON.array(), JSON.object().add("remainingBytes", length4).add("instructionSet", c14247.m34392(str)).add("instructionWidth", c14247.m34391(str)));
                                                    }
                                                    bArrCopyOf = Arrays.copyOf(bArrM43468, length3);
                                                    for (length = bArrM43468.length; length < bArrCopyOf.length; length += bArr.length) {
                                                        System.arraycopy(bArr, 0, bArrCopyOf, length, bArr.length);
                                                    }
                                                } else {
                                                    str3 = "warning";
                                                }
                                                if ("arm".equals(strM34391) && str2.equals(str)) {
                                                    bArr = f36721;
                                                } else if ("arm".equals(strM34391)) {
                                                    bArr = f36722;
                                                } else {
                                                    bArr = f36719;
                                                }
                                                if (length4 % bArr.length == 0) {
                                                    throw C12731.m31627("NATIVE_PATCH_NOP_UNAVAILABLE", "Remaining patch window cannot be filled with NOP instructions.", str3, JSON.array(), JSON.object().add("remainingBytes", length4).add("instructionSet", c14247.m34392(str)).add("instructionWidth", c14247.m34391(str)));
                                                }
                                                bArrCopyOf = Arrays.copyOf(bArrM43468, length3);
                                                while (length < bArrCopyOf.length) {
                                                    System.arraycopy(bArr, 0, bArrCopyOf, length, bArr.length);
                                                }
                                            }
                                            byte[] bArr4 = bArrCopyOf;
                                            ArrayList arrayList = new ArrayList(1);
                                            arrayList.add(new C9257((int) j3, bArr2, bArr4));
                                            try {
                                                c14952.m35873(c21956, new C2905(c7190.f23994, c7190.f23986, c7190.f23989, arrayList));
                                                return new C16415(c7190, str, j2, c18129M36656, strM34390, c14247.f46656, c14247.m34392(str), c14247.m34391(str), j3, bArrM43468, bArr4);
                                            } catch (C12731 e) {
                                                if ("PATCH_EXPECTED_MISMATCH".equals(e.f42472)) {
                                                    throw m27072(c7190, j3, e.f42468.getString("actualHex", ""));
                                                }
                                                throw e;
                                            }
                                        } catch (RuntimeException unused) {
                                            throw C5831.m16032();
                                        }
                                    } catch (C1901 e2) {
                                        throw m27071(strM34390, iM34389, j2, str, e2, str8);
                                    } catch (RuntimeException e3) {
                                        throw m27071(strM34390, iM34389, j2, str, e3, str8);
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
                                throw C12731.m31630("ENTRY_READ_FAILED", "Failed to read native byte window.");
                            }
                        }
                    }
                }
            }
            throw C5831.m16037();
        } catch (RuntimeException unused3) {
            throw C12731.m31630("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m27072(C7190 c7190, long j, String str) {
        return C12731.m31627("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", JSON.array(), JSON.object().add("workspaceId", c7190.f23994).add("editSessionId", c7190.f23986).add("locator", c7190.f23987).add("patchedFileOffset", C16363.m38542(j)).add("byteOffset", j).add("expectedHex", c7190.f23985).add("actualHex", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m27071(String str, int i, long j, String str2, RuntimeException runtimeException, String str3) {
        String message = runtimeException.getMessage();
        if (message == null) {
            message = runtimeException.getClass().getSimpleName();
        }
        String strReplace = message.replace(str3, "<path>");
        if (strReplace.length() > 512) {
            strReplace = strReplace.substring(0, 512);
        }
        return C12731.m31627("NATIVE_ASSEMBLY_FAILED", "Native instruction assembly failed.", "warning", JSON.array(), JSON.object().add("arch", str).add("bits", i).add("address", C16363.m38542(j)).add("instructionMode", str2).add("message", strReplace));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m27070(int i, int i2, String str) {
        return C12731.m31627("NATIVE_PATCH_LENGTH_MISMATCH", "Assembled bytes do not fit the expected patch window.", "warning", JSON.array(), JSON.object().add("expectedBytes", i).add("assembledBytes", i2).add("paddingMode", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m27074(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Character.digit(str.charAt(i2 + 1), 16) | (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }
}
