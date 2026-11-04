package l;

import bin.mt.json.JSON;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܿۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R77X */
/* JADX INFO: loaded from: classes5.dex */
public final class C18086 implements InterfaceC22584 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [l.᩷ۨᩴ] */
    /* JADX WARN: Type inference failed for: r11v12, types: [l.᩷ۨᩴ] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [l.ܿۙۚ] */
    /* JADX WARN: Type inference failed for: r4v10, types: [l.᩷ۨᩴ] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11417 m42150(C14069 c14069, C3388 c3388, C24844 c24844, String str) throws Throwable {
        ?? M49862;
        AbstractC22044 abstractC22044M49876;
        C9651 c9651M3741;
        String str2;
        AbstractC22044 abstractC22044M49862;
        String str3 = c14069.f44548;
        String str4 = c24844.f80344;
        String str5 = c3388.f11035;
        boolean z = c3388.f11033;
        boolean z2 = c3388.f11036;
        boolean z3 = false;
        if (str5.isEmpty()) {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
            try {
                StringBuilder sb = new StringBuilder();
                String strM49874 = C14584.m35193(str3, new String[0]).m49874();
                StringBuilder sb2 = new StringBuilder(strM49874.length());
                for (int i = 0; i < strM49874.length(); i++) {
                    char cCharAt = strM49874.charAt(i);
                    if (cCharAt == ':' || cCharAt == '/' || cCharAt == '\\' || cCharAt == 0) {
                        cCharAt = '_';
                    }
                    sb2.append(cCharAt);
                }
                sb.append(sb2.toString());
                M49862 = "_mcp_";
                sb.append("_mcp_");
                sb.append(str4);
                sb.append(z2 ? "_sign.apk" : "_unsigned.apk");
                abstractC22044M49876 = abstractC22044M35193.m49876(sb.toString());
            } catch (Exception e) {
                throw m42134((AbstractC22044) null, "OUTPUT_PATH_RESOLVE_FAILED", m42130(e));
            }
        } else {
            abstractC22044M49876 = C14584.m35193(str5, new String[0]);
        }
        AbstractC22044 abstractC22044 = abstractC22044M49876;
        C10801.m27507(abstractC22044.mo4294());
        m42149(abstractC22044);
        if (abstractC22044.equals(C14584.m35193(str3, new String[0]))) {
            throw m42134(abstractC22044, "OUTPUT_PATH_IS_SOURCE_APK", "outputPath must not resolve to the source APK.");
        }
        if (!abstractC22044.m49856().mo4303()) {
            throw m42134(abstractC22044, "OUTPUT_DIRECTORY_UNWRITABLE", "Output directory is not writable.");
        }
        if (abstractC22044.mo2934() && !z) {
            throw C10186.m26302("OUTPUT_ALREADY_EXISTS", "Output file already exists.", "warning", JSON.array(), JSON.object().add("outputPath", abstractC22044.mo4294()));
        }
        ?? r4 = 1;
        if (z2) {
            try {
                c9651M3741 = C0938.m3741(C9881.m25692(), true);
                if (c9651M3741.m25168() instanceof C12569) {
                    try {
                        c9651M3741.m25168().mo18530();
                    } catch (Exception e2) {
                        if (e2 instanceof C20774) {
                            C20774 c20774 = (C20774) e2;
                            str2 = "The MCP service cannot use the current signing key: " + c20774.m47523() + ". Log in to MT account " + c20774.m47524() + ", or choose another signing key in MT MCP Settings, then retry.";
                        } else {
                            str2 = "The MCP service cannot use the current signing key. Log in to the correct MT account, or choose another signing key in MT MCP Settings, then retry.";
                        }
                        throw m42146(abstractC22044, "APK_SIGN_ACCOUNT_REQUIRED", str2);
                    }
                } else if (c9651M3741.m25168().mo18538()) {
                    throw m42146(abstractC22044, "APK_SIGN_KEY_LOCKED", "The MCP service cannot use the current signing key because it requires password input. Open MT MCP Settings to enter the signing key password or choose another signing key, then retry.");
                }
            } catch (Exception e3) {
                throw m42146(abstractC22044, "APK_SIGN_KEY_MISSING", m42130(e3));
            }
        } else {
            c9651M3741 = null;
        }
        C9651 c9651 = c9651M3741;
        C3916 c3916M42147 = m42147(c14069, c24844);
        try {
            try {
                M49862 = abstractC22044.m49862(".mcp_unsigned");
                if (!z2) {
                    try {
                        if (ApplicationC17729.f58258.getBoolean("kasb", true)) {
                            z3 = true;
                        }
                    } catch (C10186 e4) {
                        e = e4;
                        throw e;
                    } catch (Exception e5) {
                        e = e5;
                        throw m42134(abstractC22044, "APK_BUILD_FAILED", m42130(e));
                    } catch (Throwable th) {
                        th = th;
                        r4 = 0;
                        if (M49862 != 0) {
                            M49862.mo4296();
                        }
                        if (r4 != 0) {
                            r4.mo4296();
                        }
                        C22099.m50062();
                        throw th;
                    }
                }
                m42137(c14069, c24844, c3916M42147, (AbstractC22044) M49862, z3);
                if (z2) {
                    abstractC22044M49862 = abstractC22044.m49862(".mcp_signed");
                    try {
                        m42139((AbstractC22044) M49862, abstractC22044M49862, abstractC22044, c9651);
                        m42140(abstractC22044M49862, abstractC22044, z);
                    } catch (C10186 e6) {
                        throw e6;
                    } catch (Exception e7) {
                        e = e7;
                        throw m42134(abstractC22044, "APK_BUILD_FAILED", m42130(e));
                    }
                } else {
                    m42140(M49862, abstractC22044, z);
                    abstractC22044M49862 = null;
                }
                AbstractC22044 abstractC22045 = abstractC22044M49862;
                try {
                    C11417 c11417M42135 = m42135(c14069, c24844, c3916M42147, abstractC22044, c9651, c3388.f11036);
                    if (M49862.mo2934()) {
                        M49862.mo4296();
                    }
                    if (abstractC22045 != null && abstractC22045.mo2934()) {
                        abstractC22045.mo4296();
                    }
                    C22099.m50062();
                    return c11417M42135;
                } catch (C10186 e8) {
                    throw e8;
                } catch (Exception e9) {
                    e = e9;
                    throw m42134(abstractC22044, "APK_BUILD_FAILED", m42130(e));
                } catch (Throwable th2) {
                    th = th2;
                    r4 = abstractC22045;
                    if (M49862 != 0 && M49862.mo2934()) {
                        M49862.mo4296();
                    }
                    if (r4 != 0 && r4.mo2934()) {
                        r4.mo4296();
                    }
                    C22099.m50062();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (C10186 e10) {
            e = e10;
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
            M49862 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42140(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, boolean z) throws C10186, IOException {
        m42149(abstractC22045);
        if (z) {
            abstractC22044.m49848(abstractC22045, false, true, null);
            return;
        }
        try {
            abstractC22044.mo4298().mo8789(abstractC22045);
        } catch (C22790 e) {
            if (e.m51409() == EnumC10855.ALREADY_EXISTS) {
                throw C10186.m26302("OUTPUT_ALREADY_EXISTS", "Output file already exists.", "warning", JSON.array(), JSON.object().add("outputPath", abstractC22045.mo4294()));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m42149(AbstractC22044 abstractC22044) throws C10186 {
        EnumC13093 enumC13093;
        C9113 c9113M51885 = C20015.m46048().m51885();
        c9113M51885.m24270(abstractC22044.mo4294());
        c9113M51885.m24269(abstractC22044.mo4294());
        c9113M51885.m24270(abstractC22044.m49856().mo4294());
        C22209 c22209 = new C22209(C20015.m46048(), C20015.m46049());
        c22209.m50231(abstractC22044, new C24054(this, abstractC22044));
        EnumC13093 enumC13093M6567 = c22209.m50234(abstractC22044.m49881()).m6567();
        EnumC13093 enumC13094 = EnumC13093.MISSING;
        if (enumC13093M6567 == enumC13094 || enumC13093M6567 == (enumC13093 = EnumC13093.REGULAR)) {
            throw m42148(abstractC22044, "OUTPUT_DIRECTORY_UNAVAILABLE", "Output parent must be an existing directory.");
        }
        EnumC13093 enumC13095 = EnumC13093.DIRECTORY;
        if (enumC13093M6567 != enumC13095) {
            throw m42134(abstractC22044, "OUTPUT_DIRECTORY_UNAVAILABLE", "Output parent could not be verified as a directory.");
        }
        EnumC13093 enumC13093M6568 = c22209.m50234(abstractC22044.mo4294()).m6567();
        if (enumC13093M6568 == enumC13095) {
            throw m42148(abstractC22044, "OUTPUT_PATH_NOT_FILE", "Output path refers to a directory.");
        }
        if (enumC13093M6568 != enumC13094 && enumC13093M6568 != enumC13093) {
            throw m42134(abstractC22044, "OUTPUT_PATH_NOT_FILE", "Output must be a regular file or a missing file.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C10186 m42133(C18086 c18086, AbstractC22044 abstractC22044, String str, String str2, String str3) {
        if (("FILE_PARENT_NOT_FOUND".equals(str) && "parent_missing".equals(str3)) || ("FILE_NOT_DIRECTORY".equals(str) && "regular".equals(str3))) {
            return m42148(abstractC22044, str, str2);
        }
        return m42134(abstractC22044, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[PHI: r16
      0x00bf: PHI (r16v1 java.util.HashMap) = (r16v3 java.util.HashMap), (r16v4 java.util.HashMap) binds: [B:39:0x00bd, B:33:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x004e, blocks: (B:13:0x0044, B:15:0x004a, B:28:0x008e, B:32:0x009e, B:38:0x00b3, B:46:0x00ca), top: B:108:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd A[Catch: all -> 0x016b, TRY_ENTER, TryCatch #5 {all -> 0x016b, blocks: (B:11:0x003e, B:19:0x0054, B:20:0x005f, B:22:0x0065, B:25:0x0076, B:30:0x0092, B:36:0x00af, B:44:0x00c5, B:49:0x00cf, B:48:0x00cd), top: B:105:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8 A[Catch: all -> 0x0169, TryCatch #4 {all -> 0x0169, blocks: (B:51:0x00db, B:53:0x00f8, B:54:0x00fc, B:56:0x0106, B:57:0x010e, B:59:0x0114, B:60:0x0133, B:61:0x0137, B:63:0x013d, B:67:0x014a), top: B:103:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc A[Catch: all -> 0x0169, TryCatch #4 {all -> 0x0169, blocks: (B:51:0x00db, B:53:0x00f8, B:54:0x00fc, B:56:0x0106, B:57:0x010e, B:59:0x0114, B:60:0x0133, B:61:0x0137, B:63:0x013d, B:67:0x014a), top: B:103:0x00db }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.᩻ۛۚ] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2, types: [l.᩸ܽܺ] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42137(C14069 c14069, C24844 c24844, C3916 c3916, AbstractC22044 abstractC22044, boolean z) throws Throwable {
        Throwable th;
        C22941 c22941;
        Throwable th2;
        HashMap map;
        boolean z2;
        long length;
        HashMap map2 = c3916.f13375;
        HashMap map3 = new HashMap();
        ArrayList<C5452> arrayList = c24844.f80345;
        for (C5452 c5452 : arrayList) {
            if (c5452.f19043) {
                map3.put(c5452.f19045, c5452);
            }
        }
        HashSet hashSet = new HashSet(c24844.f80347);
        try {
            C22941 c22942 = new C22941(c14069.m34234());
            try {
                try {
                    C25179 c25179 = new C25179(abstractC22044);
                    try {
                        C3150 c3150M42132 = m42132(c22942, map3);
                        if (z) {
                            try {
                                if (c22942.m51726()) {
                                    c25179.m56128(c22942);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                c24844 = c22942;
                                try {
                                    c25179.close();
                                    throw th2;
                                } catch (Throwable th4) {
                                    th2.addSuppressed(th4);
                                    throw th2;
                                }
                            }
                        }
                        c25179.m56130();
                        for (C8002 c8002 : c22942.m51742()) {
                            if (!hashSet.contains(c8002.getName())) {
                                byte[] bArr = (byte[]) map2.get(c8002.getName());
                                C5452 c5453 = (C5452) map3.get(c8002.getName());
                                if (bArr == null && c5453 == null) {
                                    m42141(c22942, c25179, c8002, c3150M42132);
                                } else {
                                    String name = c8002.getName();
                                    int iM21826 = c8002.m21826();
                                    try {
                                        if (c3150M42132.f10213) {
                                            map = map3;
                                            z2 = name.toLowerCase().startsWith("lib/");
                                            if (z2) {
                                                iM21826 = 0;
                                            }
                                            c25179.m56135(iM21826);
                                            if (bArr != null) {
                                                length = bArr.length;
                                            } else {
                                                length = c5453.f19044;
                                            }
                                            C8002 c8003 = new C8002(c8002.getName());
                                            HashSet hashSet2 = hashSet;
                                            c22941 = c22942;
                                            c8003.setTime(c8002.getTime());
                                            c8003.m21819(c8002.m21844());
                                            c8003.m21854(c8002.getSize());
                                            c8003.m21854(length);
                                            c25179.m56125(c8003);
                                            if (bArr != null) {
                                                c25179.write(bArr);
                                            } else {
                                                m42142(c25179, c5453);
                                            }
                                            c22942 = c22941;
                                            hashSet = hashSet2;
                                            map3 = map;
                                        } else {
                                            map = map3;
                                        }
                                        c8003.setTime(c8002.getTime());
                                        c8003.m21819(c8002.m21844());
                                        c8003.m21854(c8002.getSize());
                                        c8003.m21854(length);
                                        c25179.m56125(c8003);
                                        if (bArr != null) {
                                            c25179.write(bArr);
                                        } else {
                                            m42142(c25179, c5453);
                                        }
                                        c22942 = c22941;
                                        hashSet = hashSet2;
                                        map3 = map;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th2 = th;
                                        c24844 = c22941;
                                        c25179.close();
                                        throw th2;
                                    }
                                    if (!c3150M42132.f10214 || !name.toLowerCase().endsWith(".dex")) {
                                    }
                                    if (z2) {
                                        iM21826 = 0;
                                    }
                                    c25179.m56135(iM21826);
                                    if (bArr != null) {
                                        length = bArr.length;
                                    } else {
                                        length = c5453.f19044;
                                    }
                                    C8002 c8004 = new C8002(c8002.getName());
                                    HashSet hashSet3 = hashSet;
                                    c22941 = c22942;
                                }
                            }
                        }
                        c22941 = c22942;
                        for (String str : c3916.f13376) {
                            c25179.m56135(C20304.m46644(str, c3150M42132));
                            c25179.m56125(new C8002(str));
                            c25179.write((byte[]) map2.get(str));
                        }
                        for (C5452 c5454 : arrayList) {
                            boolean z3 = c5454.f19043;
                            String str2 = c5454.f19045;
                            if (!z3) {
                                c25179.m56135(C20304.m46644(str2, c3150M42132));
                                long j = c5454.f19044;
                                C8002 c8005 = new C8002(str2);
                                c8005.m21854(j);
                                c25179.m56125(c8005);
                                m42142(c25179, c5454);
                            }
                        }
                        c25179.close();
                        c22941.close();
                    } catch (Throwable th6) {
                        th = th6;
                        c22941 = c22942;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    th = th;
                    try {
                        c24844.close();
                        throw th;
                    } catch (Throwable th8) {
                        th.addSuppressed(th8);
                        throw th;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                c24844 = c22942;
                th = th;
                c24844.close();
                throw th;
            }
        } catch (IOException e) {
            throw m42134(abstractC22044, "APK_WRITE_FAILED", m42130(e));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3150 m42132(C22941 c22941, HashMap map) throws IOException {
        C5452 c5452 = (C5452) map.get("AndroidManifest.xml");
        if (c5452 != null) {
            byte[] bArr = c5452.f19042;
            if (bArr != null) {
                C3150 c3150 = new C3150();
                c3150.m10290(bArr);
                return c3150;
            }
            AbstractC22044 abstractC22044 = c5452.f19046;
            if (abstractC22044 != null) {
                long j = c5452.f19044;
                if (j >= 0) {
                    try {
                        if (j > 5242880) {
                            return new C3150();
                        }
                        byte[] bArrM42145 = m42145(abstractC22044);
                        if (bArrM42145 == null) {
                            return new C3150();
                        }
                        C3150 c3151 = new C3150();
                        c3151.m10290(bArrM42145);
                        return c3151;
                    } catch (IOException e) {
                        throw new IOException("Failed to inspect changed APK manifest content.", e);
                    } catch (RuntimeException e2) {
                        if (!m42143(e2)) {
                            throw e2;
                        }
                        throw new IOException("Failed to inspect changed APK manifest content.", e2);
                    }
                }
            }
            throw new IOException("Changed manifest data source is missing.");
        }
        C3150 c3152 = new C3150();
        c3152.m10289(c22941);
        return c3152;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m42145(AbstractC22044 abstractC22044) throws IOException {
        InputStream inputStreamMo4290 = abstractC22044.mo4290();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[65536];
                int i = 0;
                do {
                    int i2 = inputStreamMo4290.read(bArr, 0, Math.min(65536, 5242881 - i));
                    if (i2 < 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStreamMo4290.close();
                        return byteArray;
                    }
                    if (i2 == 0) {
                        int i3 = inputStreamMo4290.read();
                        if (i3 < 0) {
                            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            inputStreamMo4290.close();
                            return byteArray2;
                        }
                        byteArrayOutputStream.write(i3);
                        i++;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i2);
                        i += i2;
                    }
                } while (i <= 5242880);
                byteArrayOutputStream.close();
                inputStreamMo4290.close();
                return null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStreamMo4290 != null) {
                try {
                    inputStreamMo4290.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42141(C22941 c22941, C25179 c25179, C8002 c8002, C3150 c3150) throws IOException {
        if (C20304.m46647(c8002, c3150)) {
            C20304.m46646(c22941, c25179, c8002, c3150, null);
            return;
        }
        if ((c8002.m21841() & 8) == 0) {
            c25179.m56126(c8002, c22941);
            return;
        }
        c25179.m56135(c8002.m21826());
        C8002 c8003 = new C8002(c8002.getName());
        c8003.setTime(c8002.getTime());
        c8003.m21819(c8002.m21844());
        c8003.m21854(c8002.getSize());
        c25179.m56125(c8003);
        InputStream inputStreamM51727 = c22941.m51727(c8002);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStreamM51727.read(bArr);
                if (i != -1) {
                    c25179.write(bArr, 0, i);
                } else {
                    inputStreamM51727.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                inputStreamM51727.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42142(C25179 c25179, C5452 c5452) throws IOException {
        byte[] bArr = c5452.f19042;
        long j = c5452.f19044;
        if (bArr != null) {
            if (j != bArr.length) {
                throw new IOException("Changed entry size does not match its byte array.");
            }
            c25179.write(bArr);
            return;
        }
        AbstractC22044 abstractC22044 = c5452.f19046;
        if (abstractC22044 == null) {
            throw new IOException("Changed entry data source is missing.");
        }
        try {
            InputStream inputStreamMo4290 = abstractC22044.mo4290();
            try {
                byte[] bArr2 = new byte[65536];
                long jM42129 = 0;
                while (true) {
                    int i = inputStreamMo4290.read(bArr2);
                    if (i < 0) {
                        break;
                    }
                    if (i == 0) {
                        int i2 = inputStreamMo4290.read();
                        if (i2 < 0) {
                            break;
                        }
                        c25179.write(i2);
                        jM42129 = m42129(1, jM42129);
                    } else {
                        c25179.write(bArr2, 0, i);
                        jM42129 = m42129(i, jM42129);
                    }
                }
                if (jM42129 != j) {
                    throw new IOException("Changed entry size changed after the build snapshot.");
                }
                inputStreamMo4290.close();
                return;
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
        } catch (IOException e) {
            throw new IOException("Failed to stream changed APK entry content.", e);
        } catch (RuntimeException e2) {
            if (!m42143(e2)) {
                throw e2;
            }
            throw new IOException("Failed to stream changed APK entry content.", e2);
        }
        throw new IOException("Failed to stream changed APK entry content.", e);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12163 m42151(C14069 c14069, C24844 c24844) throws C10186 {
        ArrayList arrayList = c24844.f80348;
        byte[] bArr = new byte[65536];
        for (C5452 c5452 : c24844.f80345) {
            AbstractC22044 abstractC22044 = c5452.f19046;
            if (abstractC22044 != null) {
                try {
                    InputStream inputStreamMo4290 = abstractC22044.mo4290();
                    long jM42129 = 0;
                    while (true) {
                        try {
                            int i = inputStreamMo4290.read(bArr);
                            if (i < 0) {
                                break;
                            }
                            if (i == 0) {
                                if (inputStreamMo4290.read() < 0) {
                                    break;
                                }
                                jM42129 = m42129(1, jM42129);
                            } else {
                                jM42129 = m42129(i, jM42129);
                            }
                        } catch (Throwable th) {
                            if (inputStreamMo4290 == null) {
                                throw th;
                            }
                            try {
                                inputStreamMo4290.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (jM42129 != c5452.f19044) {
                        throw new IOException("Changed entry size changed after the build snapshot.");
                    }
                    inputStreamMo4290.close();
                } catch (IOException unused) {
                    throw m42134((AbstractC22044) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
                } catch (RuntimeException e) {
                    if (!m42143(e)) {
                        throw e;
                    }
                    throw m42134((AbstractC22044) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
                }
                throw m42134((AbstractC22044) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
            }
        }
        C3916 c3916M42147 = m42147(c14069, c24844);
        String str = c14069.f44556;
        String str2 = c24844.f80344;
        ArrayList arrayList2 = new ArrayList();
        Collections.addAll(new ArrayList(3), "edit_session_prepare", "entry_overlay_encode", "dex_merge");
        return new C12163(str, str2, true, 0, 0, arrayList2, "passed", new ArrayList(c3916M42147.f13377), arrayList.size() + c24844.f80342.size(), arrayList.size(), new ArrayList(c24844.f80343), new ArrayList(c24844.f80350), new ArrayList(c24844.f80347));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m42129(int i, long j) throws IOException {
        long j2 = i;
        if (j <= 9007199254740991L - j2) {
            return j + j2;
        }
        throw new IOException("Changed entry exceeds the supported size range.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42143(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3916 m42147(C14069 c14069, C24844 c24844) throws C10186 {
        C14356 c14356;
        LinkedHashSet linkedHashSet;
        int i;
        String str;
        C14356 c14357;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        LinkedHashSet linkedHashSet2;
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C14356 c14358;
        c14069 = c14069;
        C24844 c24845 = c24844;
        Iterator it = c24845.f80345.iterator();
        while (it.hasNext()) {
            if (C15870.m37838(((C5452) it.next()).f19045) > 0) {
                throw C10186.m26305("DEX_ENTRY_RESERVED", "Standard dex entries can only be changed through dex class edits.");
            }
        }
        Iterator it2 = c24845.f80347.iterator();
        while (it2.hasNext()) {
            if (C15870.m37838((String) it2.next()) > 0) {
                throw C10186.m26305("DEX_ENTRY_RESERVED", "Standard dex entries cannot be deleted as ZIP entries.");
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (String str3 : m42131(c14069.f44549)) {
            int iM37838 = C15870.m37838(str3);
            if (iM37838 > 0) {
                linkedHashMap2.put(str3, C14356.m34783(iM37838, str3));
            }
        }
        for (C1723 c1723 : c24845.f80342) {
            m42136(linkedHashMap2, c1723.f5879).f45263.put(c1723.f5880, c1723);
        }
        for (C12909 c12909 : c24845.f80348) {
            m42136(linkedHashMap2, c12909.f41284).f45270.add(c12909.f41283);
        }
        C18832 c18832 = new C18832();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = m42131(c24845.f80349).iterator();
        while (true) {
            String str4 = "DEX_POOL_OVERFLOW";
            if (it3.hasNext()) {
                C14356 c14356M42136 = m42136(linkedHashMap2, (String) it3.next());
                try {
                    m42138(c14069, c24845, c18832, c14356M42136);
                } catch (C10186 e) {
                    if (!"DEX_POOL_OVERFLOW".equals(e.f32601)) {
                        throw e;
                    }
                    c14356M42136.f45267 = true;
                    arrayList2.add(c14356M42136);
                }
            } else {
                Iterator it4 = arrayList2.iterator();
                String str5 = c24845;
                while (true) {
                    String str6 = "DEX_BUILD_FAILED";
                    if (!it4.hasNext()) {
                        HashMap map = new HashMap();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (C14356 c14359 : linkedHashMap2.values()) {
                            boolean z = c14359.f45266;
                            String str7 = c14359.f45269;
                            if (z) {
                                byte[] bArr = c14359.f45271;
                                if (bArr == null) {
                                    throw C10186.m26305("DEX_BUILD_FAILED", "Dex merge plan was not materialized: " + str7);
                                }
                                map.put(str7, bArr);
                                arrayList3.add(str7);
                                if (!c14359.f45265) {
                                    arrayList4.add(str7);
                                }
                            }
                        }
                        C12884.sort(arrayList3, C15870.m37839());
                        C12884.sort(arrayList4, C15870.m37839());
                        return new C3916(map, arrayList3, arrayList4);
                    }
                    C14356 c143510 = (C14356) it4.next();
                    LinkedHashMap linkedHashMap3 = c143510.f45263;
                    LinkedHashSet linkedHashSet3 = c143510.f45270;
                    String str8 = c143510.f45269;
                    ArrayList arrayList5 = new ArrayList(linkedHashMap3.values());
                    if (arrayList5.isEmpty()) {
                        throw C10186.m26300(str4, "Dex method or field pool overflow.");
                    }
                    try {
                        try {
                            C8850 c8850 = new C8850(C19647.m45292(c143510.f45264));
                            Iterator it5 = arrayList5.iterator();
                            while (it5.hasNext()) {
                                c8850.m23712((InterfaceC10122) ((C1723) it5.next()).f5878);
                            }
                            try {
                                if (c8850.m52045()) {
                                    throw C10186.m26300(str4, "Dex method or field pool overflow.");
                                }
                                C22781 c22781 = new C22781();
                                c8850.m52043(c22781);
                                C5320 c5320M15972 = C5320.m15972(str8 + "#relocation-group", c22781.m51385());
                                if (!c5320M15972.m15975(65536)) {
                                    throw C10186.m26300(str4, "Dex method or field pool overflow.");
                                }
                                Iterator it6 = linkedHashMap2.values().iterator();
                                String str9 = str4;
                                C14356 c14356M34782 = null;
                                int i7 = Integer.MAX_VALUE;
                                Iterator it7 = it4;
                                int i8 = Integer.MAX_VALUE;
                                while (it6.hasNext()) {
                                    it6 = it6;
                                    C14356 c143511 = (C14356) it6.next();
                                    if (c143511 == c143510 || c143511.f45267) {
                                        c18832 = c18832;
                                        i = i8;
                                        str = str6;
                                        c14357 = c143510;
                                        arrayList = arrayList5;
                                        linkedHashMap = linkedHashMap3;
                                        linkedHashSet2 = linkedHashSet3;
                                        str2 = str8;
                                        i8 = i;
                                        c18832 = c18832;
                                        str6 = str;
                                        linkedHashSet3 = linkedHashSet2;
                                        str8 = str2;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList5 = arrayList;
                                        linkedHashMap2 = linkedHashMap2;
                                        c143510 = c14357;
                                    } else {
                                        C5320 c5320M15973 = c143511.f45272;
                                        if (c5320M15973 == null) {
                                            if (c143511.f45265 && c143511.f45263.isEmpty() && c143511.f45270.isEmpty()) {
                                                try {
                                                    String str10 = c143511.f45269;
                                                    try {
                                                        c5320M15973 = C5320.m15973(c14069.m34231(str10), str10);
                                                        c143511.f45272 = c5320M15973;
                                                        c143511.f45264 = c5320M15973.f18704;
                                                        c18832 = c18832;
                                                    } catch (IOException e2) {
                                                        try {
                                                            throw m42134(c14069.m34231(str10), "DEX_COUNTS_UNAVAILABLE", m42130(e2));
                                                        } catch (C10186 unused) {
                                                        }
                                                    }
                                                } catch (C10186 unused2) {
                                                }
                                            }
                                            c5320M15973 = null;
                                        } else {
                                            c18832 = c18832;
                                        }
                                        if (c5320M15973 != null) {
                                            int i9 = c5320M15973.f18707;
                                            int i10 = c5320M15973.f18706;
                                            str = str6;
                                            int i11 = c5320M15973.f18708;
                                            linkedHashSet2 = linkedHashSet3;
                                            int i12 = c5320M15973.f18709;
                                            int i13 = c5320M15973.f18710;
                                            str2 = str8;
                                            int i14 = c5320M15973.f18705;
                                            linkedHashMap = linkedHashMap3;
                                            arrayList = arrayList5;
                                            if (c143510.f45264 > c143511.f45264 || !c5320M15973.m15975(43690)) {
                                                linkedHashMap2 = linkedHashMap2;
                                                i = i8;
                                                c14357 = c143510;
                                                i8 = i;
                                                c18832 = c18832;
                                                str6 = str;
                                                linkedHashSet3 = linkedHashSet2;
                                                str8 = str2;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList5 = arrayList;
                                                linkedHashMap2 = linkedHashMap2;
                                                c143510 = c14357;
                                            } else {
                                                int i15 = c5320M15972.f18706;
                                                int i16 = c5320M15972.f18707;
                                                int i17 = c5320M15972.f18708;
                                                linkedHashMap2 = linkedHashMap2;
                                                int i18 = c5320M15972.f18709;
                                                c14357 = c143510;
                                                int i19 = c5320M15972.f18710;
                                                int i20 = c5320M15972.f18705;
                                                int i21 = i15 + i10;
                                                int i22 = i8;
                                                if (i21 > 65536 || (i2 = i9 + i16) > 65536 || (i3 = i14 + i20) > 65536 || (i4 = i13 + i19) > 65536 || (i5 = i12 + i18) > 65536 || (i6 = i11 + i17) > 65536) {
                                                    i = i22;
                                                    i8 = i;
                                                    c18832 = c18832;
                                                    str6 = str;
                                                    linkedHashSet3 = linkedHashSet2;
                                                    str8 = str2;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList5 = arrayList;
                                                    linkedHashMap2 = linkedHashMap2;
                                                    c143510 = c14357;
                                                } else {
                                                    int iMin = Math.min(Math.min(Math.min(Math.min(Math.min(65536 - i21, 65536 - i2), 65536 - i3), 65536 - i4), 65536 - i5), 65536 - i6);
                                                    i8 = (((((((((WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - (i10 + c5320M15972.f18706)) - i2) + 65536) - i3) + 65536) - i4) + 65536) - i5) + 65536) - i6;
                                                    if (c14356M34782 == null || iMin < i7 || (iMin == i7 && i8 < i22)) {
                                                        c14358 = c143511;
                                                    } else {
                                                        if (iMin == i7 && i8 == i22) {
                                                            c14358 = c143511;
                                                            if (c14358.f45268 < c14356M34782.f45268) {
                                                            }
                                                            c18832 = c18832;
                                                            str6 = str;
                                                            linkedHashSet3 = linkedHashSet2;
                                                            str8 = str2;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList5 = arrayList;
                                                            linkedHashMap2 = linkedHashMap2;
                                                            c143510 = c14357;
                                                        }
                                                        i8 = i22;
                                                        c18832 = c18832;
                                                        str6 = str;
                                                        linkedHashSet3 = linkedHashSet2;
                                                        str8 = str2;
                                                        linkedHashMap3 = linkedHashMap;
                                                        arrayList5 = arrayList;
                                                        linkedHashMap2 = linkedHashMap2;
                                                        c143510 = c14357;
                                                    }
                                                    i7 = iMin;
                                                    c14356M34782 = c14358;
                                                    c18832 = c18832;
                                                    str6 = str;
                                                    linkedHashSet3 = linkedHashSet2;
                                                    str8 = str2;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList5 = arrayList;
                                                    linkedHashMap2 = linkedHashMap2;
                                                    c143510 = c14357;
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            str = str6;
                                            c14357 = c143510;
                                            arrayList = arrayList5;
                                            linkedHashMap = linkedHashMap3;
                                            linkedHashSet2 = linkedHashSet3;
                                            str2 = str8;
                                            i8 = i;
                                            c18832 = c18832;
                                            str6 = str;
                                            linkedHashSet3 = linkedHashSet2;
                                            str8 = str2;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList5 = arrayList;
                                            linkedHashMap2 = linkedHashMap2;
                                            c143510 = c14357;
                                        }
                                    }
                                }
                                LinkedHashMap linkedHashMap4 = linkedHashMap2;
                                C18832 c18833 = c18832;
                                String str11 = str6;
                                C14356 c143512 = c143510;
                                ArrayList<C1723> arrayList6 = arrayList5;
                                AbstractMap abstractMap = linkedHashMap3;
                                LinkedHashSet linkedHashSet4 = linkedHashSet3;
                                String str12 = str8;
                                if (c14356M34782 == null) {
                                    c14356 = c143512;
                                    int i23 = c14356.f45264;
                                    Iterator it8 = linkedHashMap4.values().iterator();
                                    int iMax = 1;
                                    while (it8.hasNext()) {
                                        iMax = Math.max(iMax, ((C14356) it8.next()).f45268 + 1);
                                    }
                                    if (iMax <= 0) {
                                        throw new IllegalArgumentException("Invalid dex index");
                                    }
                                    String strM34864 = iMax == 1 ? "classes.dex" : C14442.m34864(iMax, "classes", ".dex");
                                    c14356M34782 = C14356.m34782(iMax, i23, strM34864);
                                    linkedHashMap2 = linkedHashMap4;
                                    linkedHashMap2.put(strM34864, c14356M34782);
                                } else {
                                    linkedHashMap2 = linkedHashMap4;
                                    c14356 = c143512;
                                }
                                for (C1723 c1724 : arrayList6) {
                                    String str13 = c1724.f5880;
                                    AbstractMap abstractMap2 = abstractMap;
                                    abstractMap2.remove(str13);
                                    String str14 = str12;
                                    try {
                                        Iterator it9 = ((AbstractC8696) c14069.m34232(str14).mo4327()).iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                linkedHashSet = linkedHashSet4;
                                                break;
                                            }
                                            if (str13.equals(((InterfaceC10122) it9.next()).getType())) {
                                                linkedHashSet = linkedHashSet4;
                                                linkedHashSet.add(str13);
                                                break;
                                            }
                                        }
                                        c14356M34782.f45263.put(str13, new C1723(str13, c14356M34782.f45269, c1724.f5878, c1724.f5881));
                                        abstractMap = abstractMap2;
                                        str12 = str14;
                                        linkedHashSet4 = linkedHashSet;
                                    } catch (Exception e3) {
                                        throw m42134(c14069.m34231(str14), str11, m42130(e3));
                                    } catch (OutOfMemoryError unused3) {
                                        throw C18723.m43530();
                                    }
                                }
                                c14356.f45266 = (abstractMap.isEmpty() && linkedHashSet4.isEmpty()) ? false : true;
                                c14356.f45271 = null;
                                c14356.f45272 = null;
                                c14356M34782.f45266 = true;
                                c14356M34782.f45271 = null;
                                c14356M34782.f45272 = null;
                                c14356.f45267 = false;
                                if (c14356.f45266) {
                                    m42138(c14069, c24844, c18833, c14356);
                                }
                                m42138(c14069, c24844, c18833, c14356M34782);
                                str5 = c24844;
                                c18832 = c18833;
                                c14069 = c14069;
                                it4 = it7;
                                str4 = str9;
                            } catch (Exception e4) {
                                e = e4;
                                throw m42134((AbstractC22044) null, str5, m42130(e));
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str5 = "DEX_BUILD_FAILED";
                        }
                    } catch (OutOfMemoryError unused4) {
                        throw C18723.m43530();
                    } catch (C10186 e6) {
                        throw e6;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14356 m42136(LinkedHashMap linkedHashMap, String str) throws C10186 {
        C14356 c14356 = (C14356) linkedHashMap.get(str);
        if (c14356 != null) {
            return c14356;
        }
        throw C10186.m26305("DEX_BUILD_FAILED", "Dex entry is unavailable: " + str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42138(C14069 c14069, C24844 c24844, C18832 c18832, C14356 c14356) throws C10186 {
        String strM47745;
        AbstractC22044 abstractC22044 = c24844.f80346;
        String str = c14356.f45269;
        if (c14356.f45265) {
            try {
                C20893 c20893 = c14069.f44538;
                AbstractC22044 abstractC22044M34231 = c14069.m34231(str);
                c20893.getClass();
                strM47745 = C20893.m47745(abstractC22044M34231);
            } catch (IOException e) {
                throw m42134(c14069.m34231(str), "DEX_BUILD_FAILED", m42130(e));
            }
        } else {
            strM47745 = "<mcp-new-dex>";
        }
        C7645 c7645M43687 = C18832.m43687(str, strM47745, new ArrayList(c14356.f45263.values()), new ArrayList(c14356.f45270));
        try {
            try {
                byte[] bArrM43690 = C18832.m43690(abstractC22044, c7645M43687);
                if (bArrM43690 == null) {
                    bArrM43690 = m42144(c14069, c14356);
                    try {
                        C18832.m43689(abstractC22044, c7645M43687, bArrM43690);
                    } catch (IOException unused) {
                    }
                }
                c14356.f45271 = bArrM43690;
                C5320 c5320M15972 = C5320.m15972(str, bArrM43690);
                c14356.f45272 = c5320M15972;
                c14356.f45264 = c5320M15972.f18704;
                c14356.f45266 = true;
            } catch (OutOfMemoryError unused2) {
                throw C18723.m43530();
            }
        } catch (IOException e2) {
            throw m42134((AbstractC22044) null, "DEX_BUILD_FAILED", m42130(e2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m42144(C14069 c14069, C14356 c14356) throws C10186 {
        C8850 c8850;
        String str = c14356.f45269;
        boolean z = c14356.f45265;
        LinkedHashMap linkedHashMap = c14356.f45263;
        try {
            if (z) {
                C24975 c24975M34232 = c14069.m34232(str);
                c14356.f45264 = c24975M34232.mo4326().f63286;
                c8850 = new C8850(c24975M34232.mo4326());
                for (InterfaceC10122 interfaceC10122 : (AbstractC8696) c24975M34232.mo4327()) {
                    String type = interfaceC10122.getType();
                    if (!c14356.f45270.contains(type) && !linkedHashMap.containsKey(type)) {
                        c8850.m23712(interfaceC10122);
                    }
                }
            } else {
                c8850 = new C8850(C19647.m45292(c14356.f45264));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                c8850.m23712((InterfaceC10122) ((C1723) it.next()).f5878);
            }
            if (c8850.m52045()) {
                throw C10186.m26300("DEX_POOL_OVERFLOW", "Dex method or field pool overflow.");
            }
            C22781 c22781 = new C22781();
            c8850.m52043(c22781);
            return c22781.m51385();
        } catch (C10186 e) {
            throw e;
        } catch (Exception e2) {
            throw m42134(z ? c14069.m34231(str) : null, "DEX_BUILD_FAILED", m42130(e2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m42131(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        C12884.sort(arrayList2, C15870.m37839());
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42139(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, AbstractC22044 abstractC22046, C9651 c9651) throws C10186 {
        try {
            C1449.m5220(abstractC22044, abstractC22045, c9651, new C21070());
        } catch (Exception e) {
            throw m42134(abstractC22046, "APK_SIGN_FAILED", m42130(e));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11417 m42135(C14069 c14069, C24844 c24844, C3916 c3916, AbstractC22044 abstractC22044, C9651 c9651, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = c24844.f80348;
        if (z) {
            EnumC6670 enumC6670M25170 = c9651.m25170();
            ArrayList arrayList3 = new ArrayList();
            if (enumC6670M25170.f22243) {
                arrayList3.add("V1");
            }
            if (enumC6670M25170.f22245) {
                arrayList3.add("V2");
            }
            if (enumC6670M25170.f22244) {
                arrayList3.add("V3");
            }
            arrayList = arrayList3;
        } else {
            arrayList = new ArrayList();
        }
        String str = c14069.f44556;
        String str2 = c24844.f80344;
        abstractC22044.mo4294();
        String strMo4294 = abstractC22044.mo4294();
        String strMo4295 = abstractC22044.mo4294();
        String name = abstractC22044.getName();
        long jMo4285 = abstractC22044.mo4285();
        C22518 c22518M36252 = C15058.m36252(abstractC22044);
        if (z) {
            Collections.addAll(new ArrayList(6), "edit_session_prepare", "entry_overlay_encode", "dex_merge", "apk_zip_write", "apk_sign", "publish");
        } else {
            Collections.addAll(new ArrayList(5), "edit_session_prepare", "entry_overlay_encode", "dex_merge", "apk_zip_write", "publish");
        }
        return new C11417(str, str2, strMo4294, strMo4295, name, jMo4285, z, arrayList, c22518M36252, new ArrayList(c3916.f13377), arrayList2.size() + c24844.f80342.size(), arrayList2.size(), new ArrayList(c24844.f80343), new ArrayList(c24844.f80350), new ArrayList(c24844.f80347));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m42148(AbstractC22044 abstractC22044, String str, String str2) {
        return C10186.m26302(str, str2, "warning", JSON.array(), JSON.object().add("outputPath", abstractC22044.mo4294()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42134(AbstractC22044 abstractC22044, String str, String str2) {
        return C10186.m26306(str, str2, "fatal", JSON.array(), JSON.object().add("outputPath", abstractC22044 == null ? JSON.NULL : JSON.value(abstractC22044.mo4294())));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C10186 m42146(AbstractC22044 abstractC22044, String str, String str2) {
        return C10186.m26302(str, str2, "fatal", JSON.array(), JSON.object().add("outputPath", JSON.value(abstractC22044.mo4294())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42130(Exception exc) {
        String message = exc.getMessage();
        return (message == null || message.isEmpty()) ? exc.getClass().getSimpleName() : message;
    }
}
