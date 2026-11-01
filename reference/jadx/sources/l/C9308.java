package l;

import bin.mt.json.JSONObject;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.commonsdk.UMConfigure;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۢۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I75V */
/* JADX INFO: loaded from: classes3.dex */
public final class C9308 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f31579 = {ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, 69, 76, 70};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m23879(C21956 c21956, C14952 c14952, String str, String str2, InterfaceC1545 interfaceC1545) throws C12731 {
        C2956 c2956M23881;
        if (!str.isEmpty()) {
            C12317 c12317M35867 = c14952.m35867(c21956, str, str2);
            if (c12317M35867 != null) {
                AbstractC20745 abstractC20745 = c12317M35867.f41149;
                if (!abstractC20745.mo33971() || !m23886(abstractC20745)) {
                    throw C12731.m31630("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                }
                c2956M23881 = new C2956(abstractC20745, abstractC20745.mo33964(), 0L, false, false);
            } else {
                C16550 c16550M35886 = c14952.m35886(c21956, str, str2);
                if (c16550M35886 != null) {
                    byte[] bArr = c16550M35886.f53144;
                    if (!m23885(bArr)) {
                        throw C12731.m31630("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                    }
                    AbstractC20745 abstractC20745M46690 = C11904.f39937.m46690("apk_mcp_native");
                    try {
                        m23883(abstractC20745M46690);
                        abstractC20745M46690.m46739();
                        AbstractC20745 abstractC20745M46691 = abstractC20745M46690.m46690("apk-native-" + UUID.randomUUID() + ".bin");
                        abstractC20745M46691.m46703(bArr);
                        c2956M23881 = new C2956(abstractC20745M46691, bArr.length, 0L, true, false);
                    } catch (IOException | RuntimeException unused) {
                        throw C12731.m31630("NATIVE_CACHE_UNAVAILABLE", "Failed to prepare native entry cache.");
                    }
                } else {
                    if ("resources.arsc".equals(str2)) {
                        throw C12731.m31630("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                    }
                    c2956M23881 = m23881(c21956, str2, false);
                }
            }
        } else {
            c2956M23881 = m23881(c21956, str2, false);
        }
        try {
            try {
                Object objMo5330 = interfaceC1545.mo5330(c2956M23881);
                c2956M23881.close();
                return objMo5330;
            } catch (Throwable th) {
                try {
                    c2956M23881.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C12731 e) {
            if (!c2956M23881.f11083 && c2956M23881.f11080) {
                String str3 = e.f42472;
                if ("NATIVE_ANALYZER_FAILED".equals(str3) || "NATIVE_ENTRY_NOT_ELF".equals(str3) || "ENTRY_READ_FAILED".equals(str3) || "PATCH_EXPECTED_MISMATCH".equals(str3)) {
                    c2956M23881.close();
                    C2956 c2956M23882 = m23881(c21956, str2, true);
                    try {
                        Object objMo5331 = interfaceC1545.mo5330(c2956M23882);
                        c2956M23882.close();
                        return objMo5331;
                    } catch (Throwable th3) {
                        try {
                            c2956M23882.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2956 m23881(C21956 c21956, String str, boolean z) throws C12731 {
        int i;
        try {
            try {
                C2455 c2455 = new C2455(c21956.m48787());
                try {
                    C12107 c12107M23882 = m23882(c2455, str);
                    long size = c12107M23882.getSize();
                    long jM30113 = c12107M23882.m30113();
                    C7221 c7221 = c21956.f71231;
                    AbstractC20745 abstractC20745 = c21956.f71232;
                    c7221.getClass();
                    AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("cache").m46690(UMConfigure.WRAPER_TYPE_NATIVE);
                    String strM49424 = C22253.m49424(C22253.m49421().digest(str.getBytes(StandardCharsets.UTF_8)));
                    AbstractC20745 abstractC20745M46691 = abstractC20745M46690.m46690(strM49424.concat(".bin"));
                    AbstractC20745 abstractC20745M46692 = abstractC20745M46690.m46690(strM49424.concat(".json"));
                    if (z) {
                        i = 2;
                    } else {
                        i = 2;
                        if (m23884(abstractC20745M46692, abstractC20745M46691, str, size, jM30113)) {
                            if (m23886(abstractC20745M46691)) {
                                C2956 c2956 = new C2956(abstractC20745M46691, size, jM30113, false, true);
                                c2455.close();
                                return c2956;
                            }
                            AbstractC20745[] abstractC20745Arr = {abstractC20745M46692, abstractC20745M46691};
                            for (int i2 = 0; i2 < 2; i2++) {
                                abstractC20745Arr[i2].mo24647();
                            }
                        }
                    }
                    AbstractC20745[] abstractC20745Arr2 = new AbstractC20745[i];
                    abstractC20745Arr2[0] = abstractC20745M46692;
                    abstractC20745Arr2[1] = abstractC20745M46691;
                    for (int i3 = 0; i3 < i; i3++) {
                        abstractC20745Arr2[i3].mo24647();
                    }
                    C2956 c2956M23880 = m23880(c2455, c12107M23882, str, size, jM30113, abstractC20745M46690, abstractC20745M46691, abstractC20745M46692);
                    c2455.close();
                    return c2956M23880;
                } catch (Throwable th) {
                    try {
                        c2455.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (C12731 e) {
                throw e;
            }
        } catch (IOException | RuntimeException unused) {
            throw C12731.m31630("ENTRY_READ_FAILED", "Failed to read ZIP entry.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23884(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, String str, long j, long j2) {
        if (!abstractC20745.mo33971() || !abstractC20746.mo33971() || abstractC20746.mo33964() != j) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(abstractC20745.m46727(), StandardCharsets.UTF_8));
            return jSONObject.getInt("version", -1) == 1 && str.equals(jSONObject.getString("entryName", null)) && jSONObject.getLong("size", -1L) == j && jSONObject.getLong("unsignedCrc", -1L) == j2;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12107 m23882(C2455 c2455, String str) throws C12731 {
        C12107 entry = c2455.getEntry(str);
        if (entry == null) {
            throw C12731.m31625("ENTRY_NOT_FOUND", "ZIP entry not found");
        }
        if (entry.isDirectory()) {
            throw C12731.m31630("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
        }
        if (entry.getSize() >= 0) {
            return entry;
        }
        throw C12731.m31630("ENTRY_READ_FAILED", "ZIP entry size is unavailable.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23885(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            byte b = bArr[0];
            byte[] bArr2 = f31579;
            if (b == bArr2[0] && bArr[1] == bArr2[1] && bArr[2] == bArr2[2] && bArr[3] == bArr2[3]) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2956 m23880(C2455 c2455, C12107 c12107, String str, long j, long j2, AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, AbstractC20745 abstractC20747) throws Throwable {
        boolean z;
        InputStream inputStreamM7471 = c2455.m7471(c12107);
        try {
            byte[] bArr = new byte[4];
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i < 4) {
                    int i2 = inputStreamM7471.read(bArr, i, 4 - i);
                    if (i2 < 0) {
                        inputStreamM7471.close();
                        z = false;
                        break;
                    }
                    i += i2;
                } else {
                    boolean zM23885 = m23885(bArr);
                    inputStreamM7471.close();
                    z = zM23885;
                    break;
                }
            }
            if (!z) {
                throw C12731.m31630("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
            }
            abstractC20745.m46739();
            AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(abstractC20746.getName() + ".tmp");
            AbstractC20745 abstractC20745M46691 = abstractC20745.m46690(abstractC20747.getName() + ".tmp");
            abstractC20745M46690.mo24647();
            abstractC20745M46691.mo24647();
            try {
                InputStream inputStreamM7472 = c2455.m7471(c12107);
                try {
                    abstractC20745M46690.m46695(inputStreamM7472, j, (InterfaceC8978) null);
                    inputStreamM7472.close();
                    if (abstractC20745M46690.mo33964() != j) {
                        throw new IOException("Unexpected native entry size");
                    }
                    abstractC20745M46691.m46703(new JSONObject().add("version", 1).add("entryName", str).add("size", j).add("unsignedCrc", j2).toString().getBytes(StandardCharsets.UTF_8));
                    abstractC20746.mo24647();
                    if (!abstractC20745M46690.mo24646(abstractC20746)) {
                        throw new IOException("Failed to publish native cache data");
                    }
                    abstractC20747.mo24647();
                    if (!abstractC20745M46691.mo24646(abstractC20747)) {
                        abstractC20746.mo24647();
                        throw new IOException("Failed to publish native cache metadata");
                    }
                    try {
                        return new C2956(abstractC20746, j, j2, false, false);
                    } catch (Throwable th) {
                        th = th;
                        z2 = true;
                        if (!z2) {
                            abstractC20745M46690.mo24647();
                            abstractC20745M46691.mo24647();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        inputStreamM7472.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            try {
                inputStreamM7471.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m23886(AbstractC20745 abstractC20745) {
        try {
            InputStream inputStreamMo33970 = abstractC20745.mo33970();
            try {
                byte[] bArr = f31579;
                for (int i = 0; i < 4; i++) {
                    if (inputStreamMo33970.read() != (bArr[i] & 255)) {
                        inputStreamMo33970.close();
                        return false;
                    }
                }
                if (inputStreamMo33970 != null) {
                    inputStreamMo33970.close();
                }
                return true;
            } catch (Throwable th) {
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23883(AbstractC20745 abstractC20745) {
        if (abstractC20745.mo33974()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
            for (AbstractC20745 abstractC20746 : abstractC20745.mo33983(true)) {
                if (abstractC20746.getName().startsWith("apk-native-") && abstractC20746.mo33991() < jCurrentTimeMillis) {
                    abstractC20746.mo24647();
                }
            }
        }
    }
}
