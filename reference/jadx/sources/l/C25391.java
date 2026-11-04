package l;

import bin.mt.json.JSONObject;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.commonsdk.UMConfigure;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩻᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I75V */
/* JADX INFO: loaded from: classes.dex */
public final class C25391 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f81968 = {ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, 69, 76, 70};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m56749(C14069 c14069, C18282 c18282, String str, String str2, InterfaceC11964 interfaceC11964) throws C10186 {
        C17185 c17185M56751;
        if (!str.isEmpty()) {
            C22758 c22758M42616 = c18282.m42616(c14069, str, str2);
            if (c22758M42616 != null) {
                AbstractC22044 abstractC22044 = c22758M42616.f73832;
                if (!abstractC22044.mo4304() || !m56756(abstractC22044)) {
                    throw C10186.m26305("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                }
                c17185M56751 = new C17185(abstractC22044, abstractC22044.mo4285(), 0L, false, false);
            } else {
                C10823 c10823M42606 = c18282.m42606(c14069, str, str2);
                if (c10823M42606 != null) {
                    byte[] bArr = c10823M42606.f34305;
                    if (!m56755(bArr)) {
                        throw C10186.m26305("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                    }
                    AbstractC22044 abstractC22044M49876 = C6382.f21562.m49876("apk_mcp_native");
                    try {
                        m56753(abstractC22044M49876);
                        abstractC22044M49876.m49853();
                        AbstractC22044 abstractC22044M49877 = abstractC22044M49876.m49876("apk-native-" + UUID.randomUUID() + ".bin");
                        abstractC22044M49877.m49849(bArr);
                        c17185M56751 = new C17185(abstractC22044M49877, bArr.length, 0L, true, false);
                    } catch (IOException | RuntimeException unused) {
                        throw C10186.m26305("NATIVE_CACHE_UNAVAILABLE", "Failed to prepare native entry cache.");
                    }
                } else {
                    if ("resources.arsc".equals(str2)) {
                        throw C10186.m26305("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                    }
                    c17185M56751 = m56751(c14069, str2, false);
                }
            }
        } else {
            c17185M56751 = m56751(c14069, str2, false);
        }
        try {
            try {
                Object objMo7002 = interfaceC11964.mo7002(c17185M56751);
                c17185M56751.close();
                return objMo7002;
            } catch (C10186 e) {
                if (!c17185M56751.f56014 && c17185M56751.f56011) {
                    String str3 = e.f32601;
                    if ("NATIVE_ANALYZER_FAILED".equals(str3) || "NATIVE_ENTRY_NOT_ELF".equals(str3) || "ENTRY_READ_FAILED".equals(str3) || "PATCH_EXPECTED_MISMATCH".equals(str3)) {
                        c17185M56751.close();
                        C17185 c17185M56752 = m56751(c14069, str2, true);
                        try {
                            Object objMo7003 = interfaceC11964.mo7002(c17185M56752);
                            c17185M56752.close();
                            return objMo7003;
                        } catch (Throwable th) {
                            try {
                                c17185M56752.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
                throw e;
            }
        } catch (Throwable th3) {
            try {
                c17185M56751.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17185 m56751(C14069 c14069, String str, boolean z) throws C10186 {
        int i;
        try {
            try {
                C22941 c22941 = new C22941(c14069.m34234());
                try {
                    C8002 c8002M56750 = m56750(c22941, str);
                    long size = c8002M56750.getSize();
                    long jM21830 = c8002M56750.m21830();
                    C20893 c20893 = c14069.f44538;
                    AbstractC22044 abstractC22044 = c14069.f44536;
                    c20893.getClass();
                    AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("cache").m49876(UMConfigure.WRAPER_TYPE_NATIVE);
                    String strM36182 = C15022.m36182(C15022.m36179().digest(str.getBytes(StandardCharsets.UTF_8)));
                    AbstractC22044 abstractC22044M49877 = abstractC22044M49876.m49876(strM36182.concat(".bin"));
                    AbstractC22044 abstractC22044M49878 = abstractC22044M49876.m49876(strM36182.concat(".json"));
                    if (z) {
                        i = 2;
                    } else {
                        i = 2;
                        if (m56754(abstractC22044M49878, abstractC22044M49877, str, size, jM21830)) {
                            if (m56756(abstractC22044M49877)) {
                                C17185 c17185 = new C17185(abstractC22044M49877, size, jM21830, false, true);
                                c22941.close();
                                return c17185;
                            }
                            AbstractC22044[] abstractC22044Arr = {abstractC22044M49878, abstractC22044M49877};
                            for (int i2 = 0; i2 < 2; i2++) {
                                abstractC22044Arr[i2].mo4296();
                            }
                        }
                    }
                    AbstractC22044[] abstractC22044Arr2 = new AbstractC22044[i];
                    abstractC22044Arr2[0] = abstractC22044M49878;
                    abstractC22044Arr2[1] = abstractC22044M49877;
                    for (int i3 = 0; i3 < i; i3++) {
                        abstractC22044Arr2[i3].mo4296();
                    }
                    C17185 c17185M56752 = m56752(c22941, c8002M56750, str, size, jM21830, abstractC22044M49876, abstractC22044M49877, abstractC22044M49878);
                    c22941.close();
                    return c17185M56752;
                } catch (Throwable th) {
                    try {
                        c22941.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (C10186 e) {
                throw e;
            }
        } catch (IOException | RuntimeException unused) {
            throw C10186.m26305("ENTRY_READ_FAILED", "Failed to read ZIP entry.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56754(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, String str, long j, long j2) {
        if (!abstractC22044.mo4304() || !abstractC22045.mo4304() || abstractC22045.mo4285() != j) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(abstractC22044.m49865(), StandardCharsets.UTF_8));
            return jSONObject.getInt("version", -1) == 1 && str.equals(jSONObject.getString("entryName", null)) && jSONObject.getLong("size", -1L) == j && jSONObject.getLong("unsignedCrc", -1L) == j2;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8002 m56750(C22941 c22941, String str) throws C10186 {
        C8002 entry = c22941.getEntry(str);
        if (entry == null) {
            throw C10186.m26300("ENTRY_NOT_FOUND", "ZIP entry not found");
        }
        if (entry.isDirectory()) {
            throw C10186.m26305("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
        }
        if (entry.getSize() >= 0) {
            return entry;
        }
        throw C10186.m26305("ENTRY_READ_FAILED", "ZIP entry size is unavailable.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m56755(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            byte b = bArr[0];
            byte[] bArr2 = f81968;
            if (b == bArr2[0] && bArr[1] == bArr2[1] && bArr[2] == bArr2[2] && bArr[3] == bArr2[3]) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17185 m56752(C22941 c22941, C8002 c8002, String str, long j, long j2, AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, AbstractC22044 abstractC22046) throws Throwable {
        boolean z;
        InputStream inputStreamM51727 = c22941.m51727(c8002);
        try {
            byte[] bArr = new byte[4];
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i < 4) {
                    int i2 = inputStreamM51727.read(bArr, i, 4 - i);
                    if (i2 < 0) {
                        inputStreamM51727.close();
                        z = false;
                        break;
                    }
                    i += i2;
                } else {
                    boolean zM56755 = m56755(bArr);
                    inputStreamM51727.close();
                    z = zM56755;
                    break;
                }
            }
            if (!z) {
                throw C10186.m26305("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
            }
            abstractC22044.m49853();
            AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(abstractC22045.getName() + ".tmp");
            AbstractC22044 abstractC22044M49877 = abstractC22044.m49876(abstractC22046.getName() + ".tmp");
            abstractC22044M49876.mo4296();
            abstractC22044M49877.mo4296();
            try {
                InputStream inputStreamM51728 = c22941.m51727(c8002);
                try {
                    abstractC22044M49876.m49841(inputStreamM51728, j, (InterfaceC23711) null);
                    inputStreamM51728.close();
                    if (abstractC22044M49876.mo4285() != j) {
                        throw new IOException("Unexpected native entry size");
                    }
                    abstractC22044M49877.m49849(new JSONObject().add("version", 1).add("entryName", str).add("size", j).add("unsignedCrc", j2).toString().getBytes(StandardCharsets.UTF_8));
                    abstractC22045.mo4296();
                    if (!abstractC22044M49876.mo4301(abstractC22045)) {
                        throw new IOException("Failed to publish native cache data");
                    }
                    abstractC22046.mo4296();
                    if (!abstractC22044M49877.mo4301(abstractC22046)) {
                        abstractC22045.mo4296();
                        throw new IOException("Failed to publish native cache metadata");
                    }
                    try {
                        return new C17185(abstractC22045, j, j2, false, false);
                    } catch (Throwable th) {
                        th = th;
                        z2 = true;
                        if (!z2) {
                            abstractC22044M49876.mo4296();
                            abstractC22044M49877.mo4296();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        inputStreamM51728.close();
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
                inputStreamM51727.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m56756(AbstractC22044 abstractC22044) {
        try {
            InputStream inputStreamMo4290 = abstractC22044.mo4290();
            try {
                byte[] bArr = f81968;
                for (int i = 0; i < 4; i++) {
                    if (inputStreamMo4290.read() != (bArr[i] & 255)) {
                        inputStreamMo4290.close();
                        return false;
                    }
                }
                if (inputStreamMo4290 != null) {
                    inputStreamMo4290.close();
                }
                return true;
            } catch (Throwable th) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
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
    public static void m56753(AbstractC22044 abstractC22044) {
        if (abstractC22044.mo4281()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
            for (AbstractC22044 abstractC22045 : abstractC22044.mo4299(true)) {
                if (abstractC22045.getName().startsWith("apk-native-") && abstractC22045.mo4286() < jCurrentTimeMillis) {
                    abstractC22045.mo4296();
                }
            }
        }
    }
}
