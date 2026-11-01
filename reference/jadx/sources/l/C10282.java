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

/* JADX INFO: renamed from: l.ۤ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R77X */
/* JADX INFO: loaded from: classes3.dex */
public final class C10282 implements InterfaceC11050 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [l.᩷۠ۚ] */
    /* JADX WARN: Type inference failed for: r11v15, types: [l.᩷۠ۚ] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [l.ۤ۫֨] */
    /* JADX WARN: Type inference failed for: r4v10, types: [l.᩷۠ۚ] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18073 m26093(C21956 c21956, C15607 c15607, C18779 c18779, String str) throws Throwable {
        ?? M46733;
        AbstractC20745 abstractC20745M46690;
        C14558 c14558M27753;
        String str2;
        AbstractC20745 abstractC20745M46733;
        String str3 = c21956.f71219;
        String str4 = c18779.f60889;
        String string = c15607.f50746;
        boolean z = c15607.f50745;
        boolean z2 = c15607.f50742;
        boolean z3 = false;
        if (string.startsWith("/")) {
            abstractC20745M46690 = C5553.m15313(string, new String[0]);
        } else {
            AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
            try {
                boolean zIsEmpty = string.isEmpty();
                M46733 = zIsEmpty;
                if (zIsEmpty) {
                    StringBuilder sb = new StringBuilder();
                    String strM46718 = C5553.m15313(str3, new String[0]).m46718();
                    StringBuilder sb2 = new StringBuilder(strM46718.length());
                    for (int i = 0; i < strM46718.length(); i++) {
                        char cCharAt = strM46718.charAt(i);
                        if (cCharAt == ':' || cCharAt == '/' || cCharAt == '\\' || cCharAt == 0) {
                            cCharAt = '_';
                        }
                        sb2.append(cCharAt);
                    }
                    sb.append(sb2.toString());
                    String str5 = "_mcp_";
                    sb.append("_mcp_");
                    sb.append(str4);
                    sb.append(z2 ? "_sign.apk" : "_unsigned.apk");
                    string = sb.toString();
                    M46733 = str5;
                }
                abstractC20745M46690 = abstractC20745M15313.m46690(string);
            } catch (Exception e) {
                throw m26076((AbstractC20745) null, "OUTPUT_PATH_RESOLVE_FAILED", m26073(e));
            }
        }
        AbstractC20745 abstractC20745 = abstractC20745M46690;
        m26092(abstractC20745);
        if (abstractC20745.equals(C5553.m15313(str3, new String[0]))) {
            throw m26076(abstractC20745, "OUTPUT_PATH_IS_SOURCE_APK", "outputName must not resolve to the source APK.");
        }
        if (!abstractC20745.m46711().mo8447()) {
            throw m26076(abstractC20745, "OUTPUT_DIRECTORY_UNWRITABLE", "Output directory is not writable.");
        }
        if (abstractC20745.mo33975() && !z) {
            throw C12731.m31627("OUTPUT_ALREADY_EXISTS", "Output file already exists.", "warning", JSON.array(), JSON.object().add("outputPath", abstractC20745.mo33986()));
        }
        ?? r4 = 1;
        if (z2) {
            try {
                c14558M27753 = C11005.m27753(C0403.m2140(), true);
                if (c14558M27753.m35031() instanceof C19954) {
                    try {
                        c14558M27753.m35031().mo1451();
                    } catch (Exception e2) {
                        if (e2 instanceof C15721) {
                            C15721 c15721 = (C15721) e2;
                            str2 = "The MCP service cannot use the current signing key: " + c15721.m37443() + ". Log in to MT account " + c15721.m37444() + ", or choose another signing key in MT MCP Settings, then retry.";
                        } else {
                            str2 = "The MCP service cannot use the current signing key. Log in to the correct MT account, or choose another signing key in MT MCP Settings, then retry.";
                        }
                        throw m26089(abstractC20745, "APK_SIGN_ACCOUNT_REQUIRED", str2);
                    }
                } else if (c14558M27753.m35031().mo1457()) {
                    throw m26089(abstractC20745, "APK_SIGN_KEY_LOCKED", "The MCP service cannot use the current signing key because it requires password input. Open MT MCP Settings to enter the signing key password or choose another signing key, then retry.");
                }
            } catch (Exception e3) {
                throw m26089(abstractC20745, "APK_SIGN_KEY_MISSING", m26073(e3));
            }
        } else {
            c14558M27753 = null;
        }
        C14558 c14558 = c14558M27753;
        C8165 c8165M26090 = m26090(c21956, c18779);
        try {
            try {
                M46733 = abstractC20745.m46733(".mcp_unsigned");
                if (!z2) {
                    try {
                        if (ApplicationC0716.f2992.getBoolean("kasb", true)) {
                            z3 = true;
                        }
                    } catch (C12731 e4) {
                        e = e4;
                        throw e;
                    } catch (Exception e5) {
                        e = e5;
                        throw m26076(abstractC20745, "APK_BUILD_FAILED", m26073(e));
                    } catch (Throwable th) {
                        th = th;
                        r4 = 0;
                        if (M46733 != 0) {
                            M46733.mo24647();
                        }
                        if (r4 != 0) {
                            r4.mo24647();
                        }
                        C15157.m36345();
                        throw th;
                    }
                }
                m26083(c21956, c18779, c8165M26090, (AbstractC20745) M46733, z3);
                if (z2) {
                    abstractC20745M46733 = abstractC20745.m46733(".mcp_signed");
                    try {
                        m26081((AbstractC20745) M46733, abstractC20745M46733, abstractC20745, c14558);
                        m26082(abstractC20745M46733, abstractC20745, z);
                    } catch (C12731 e6) {
                        throw e6;
                    } catch (Exception e7) {
                        e = e7;
                        throw m26076(abstractC20745, "APK_BUILD_FAILED", m26073(e));
                    }
                } else {
                    m26082(M46733, abstractC20745, z);
                    abstractC20745M46733 = null;
                }
                AbstractC20745 abstractC20746 = abstractC20745M46733;
                try {
                    C18073 c18073M26077 = m26077(c21956, c18779, c8165M26090, abstractC20745, c14558, c15607.f50742);
                    if (M46733.mo33975()) {
                        M46733.mo24647();
                    }
                    if (abstractC20746 != null && abstractC20746.mo33975()) {
                        abstractC20746.mo24647();
                    }
                    C15157.m36345();
                    return c18073M26077;
                } catch (C12731 e8) {
                    throw e8;
                } catch (Exception e9) {
                    e = e9;
                    throw m26076(abstractC20745, "APK_BUILD_FAILED", m26073(e));
                } catch (Throwable th2) {
                    th = th2;
                    r4 = abstractC20746;
                    if (M46733 != 0 && M46733.mo33975()) {
                        M46733.mo24647();
                    }
                    if (r4 != 0 && r4.mo33975()) {
                        r4.mo24647();
                    }
                    C15157.m36345();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (C12731 e10) {
            e = e10;
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
            M46733 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26082(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, boolean z) throws C12731, IOException {
        m26092(abstractC20746);
        if (z) {
            abstractC20745.m46702(abstractC20746, false, true, null);
            return;
        }
        try {
            abstractC20745.mo33989().mo8391(abstractC20746);
        } catch (C20040 e) {
            if (e.m45399() == EnumC15807.ALREADY_EXISTS) {
                throw C12731.m31627("OUTPUT_ALREADY_EXISTS", "Output file already exists.", "warning", JSON.array(), JSON.object().add("outputPath", abstractC20746.mo33986()));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m26092(AbstractC20745 abstractC20745) throws C12731 {
        EnumC12279 enumC12279;
        C3070 c3070M37800 = C20119.m45481().m37800();
        c3070M37800.m9207(abstractC20745.mo33986());
        c3070M37800.m9210(abstractC20745.mo33986());
        c3070M37800.m9207(abstractC20745.m46711().mo33986());
        C2800 c2800 = new C2800(C20119.m45481(), C20119.m45482());
        c2800.m8507(abstractC20745, new C18748(this, abstractC20745));
        EnumC12279 enumC12279M16196 = c2800.m8503(abstractC20745.m46737()).m16196();
        EnumC12279 enumC122710 = EnumC12279.MISSING;
        if (enumC12279M16196 == enumC122710 || enumC12279M16196 == (enumC12279 = EnumC12279.REGULAR)) {
            throw m26091(abstractC20745, "OUTPUT_DIRECTORY_UNAVAILABLE", "Output parent must be an existing directory.");
        }
        EnumC12279 enumC122711 = EnumC12279.DIRECTORY;
        if (enumC12279M16196 != enumC122711) {
            throw m26076(abstractC20745, "OUTPUT_DIRECTORY_UNAVAILABLE", "Output parent could not be verified as a directory.");
        }
        EnumC12279 enumC12279M16197 = c2800.m8503(abstractC20745.mo33986()).m16196();
        if (enumC12279M16197 == enumC122711) {
            throw m26091(abstractC20745, "OUTPUT_PATH_NOT_FILE", "Output path refers to a directory.");
        }
        if (enumC12279M16197 != enumC122710 && enumC12279M16197 != enumC12279) {
            throw m26076(abstractC20745, "OUTPUT_PATH_NOT_FILE", "Output must be a regular file or a missing file.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C12731 m26075(C10282 c10282, AbstractC20745 abstractC20745, String str, String str2, String str3) {
        if (("FILE_PARENT_NOT_FOUND".equals(str) && "parent_missing".equals(str3)) || ("FILE_NOT_DIRECTORY".equals(str) && "regular".equals(str3))) {
            return m26091(abstractC20745, str, str2);
        }
        return m26076(abstractC20745, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[PHI: r16
      0x00bf: PHI (r16v1 java.util.HashMap) = (r16v3 java.util.HashMap), (r16v4 java.util.HashMap) binds: [B:39:0x00bd, B:33:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x004e, blocks: (B:13:0x0044, B:15:0x004a, B:28:0x008e, B:32:0x009e, B:38:0x00b3, B:46:0x00ca), top: B:108:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd A[Catch: all -> 0x016b, TRY_ENTER, TryCatch #5 {all -> 0x016b, blocks: (B:11:0x003e, B:19:0x0054, B:20:0x005f, B:22:0x0065, B:25:0x0076, B:30:0x0092, B:36:0x00af, B:44:0x00c5, B:49:0x00cf, B:48:0x00cd), top: B:105:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8 A[Catch: all -> 0x0169, TryCatch #4 {all -> 0x0169, blocks: (B:51:0x00db, B:53:0x00f8, B:54:0x00fc, B:56:0x0106, B:57:0x010e, B:59:0x0114, B:60:0x0133, B:61:0x0137, B:63:0x013d, B:67:0x014a), top: B:103:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc A[Catch: all -> 0x0169, TryCatch #4 {all -> 0x0169, blocks: (B:51:0x00db, B:53:0x00f8, B:54:0x00fc, B:56:0x0106, B:57:0x010e, B:59:0x0114, B:60:0x0133, B:61:0x0137, B:63:0x013d, B:67:0x014a), top: B:103:0x00db }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.ᩴ۬۬] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2, types: [l.ۖۢ᩺] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26083(C21956 c21956, C18779 c18779, C8165 c8165, AbstractC20745 abstractC20745, boolean z) throws Throwable {
        Throwable th;
        C2455 c2455;
        Throwable th2;
        HashMap map;
        boolean z2;
        long length;
        HashMap map2 = c8165.f28511;
        HashMap map3 = new HashMap();
        ArrayList<C15252> arrayList = c18779.f60888;
        for (C15252 c15252 : arrayList) {
            if (c15252.f49726) {
                map3.put(c15252.f49727, c15252);
            }
        }
        HashSet hashSet = new HashSet(c18779.f60891);
        try {
            C2455 c2456 = new C2455(c21956.m48787());
            try {
                try {
                    C22918 c22918 = new C22918(abstractC20745);
                    try {
                        C21123 c21123M26079 = m26079(c2456, map3);
                        if (z) {
                            try {
                                if (c2456.m7488()) {
                                    c22918.m50726(c2456);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                c18779 = c2456;
                                try {
                                    c22918.close();
                                    throw th2;
                                } catch (Throwable th4) {
                                    th2.addSuppressed(th4);
                                    throw th2;
                                }
                            }
                        }
                        c22918.m50718();
                        for (C12107 c12107 : c2456.m7466()) {
                            if (!hashSet.contains(c12107.getName())) {
                                byte[] bArr = (byte[]) map2.get(c12107.getName());
                                C15252 c15253 = (C15252) map3.get(c12107.getName());
                                if (bArr == null && c15253 == null) {
                                    m26080(c2456, c22918, c12107, c21123M26079);
                                } else {
                                    String name = c12107.getName();
                                    int iM30119 = c12107.m30119();
                                    try {
                                        if (c21123M26079.f68791) {
                                            map = map3;
                                            z2 = name.toLowerCase().startsWith("lib/");
                                            if (z2) {
                                                iM30119 = 0;
                                            }
                                            c22918.m50733(iM30119);
                                            if (bArr != null) {
                                                length = bArr.length;
                                            } else {
                                                length = c15253.f49725;
                                            }
                                            C12107 c12108 = new C12107(c12107.getName());
                                            HashSet hashSet2 = hashSet;
                                            c2455 = c2456;
                                            c12108.setTime(c12107.getTime());
                                            c12108.m30104(c12107.m30110());
                                            c12108.m30096(c12107.getSize());
                                            c12108.m30096(length);
                                            c22918.m50727(c12108);
                                            if (bArr != null) {
                                                c22918.write(bArr);
                                            } else {
                                                m26085(c22918, c15253);
                                            }
                                            c2456 = c2455;
                                            hashSet = hashSet2;
                                            map3 = map;
                                        } else {
                                            map = map3;
                                        }
                                        c12108.setTime(c12107.getTime());
                                        c12108.m30104(c12107.m30110());
                                        c12108.m30096(c12107.getSize());
                                        c12108.m30096(length);
                                        c22918.m50727(c12108);
                                        if (bArr != null) {
                                            c22918.write(bArr);
                                        } else {
                                            m26085(c22918, c15253);
                                        }
                                        c2456 = c2455;
                                        hashSet = hashSet2;
                                        map3 = map;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th2 = th;
                                        c18779 = c2455;
                                        c22918.close();
                                        throw th2;
                                    }
                                    if (!c21123M26079.f68792 || !name.toLowerCase().endsWith(".dex")) {
                                    }
                                    if (z2) {
                                        iM30119 = 0;
                                    }
                                    c22918.m50733(iM30119);
                                    if (bArr != null) {
                                        length = bArr.length;
                                    } else {
                                        length = c15253.f49725;
                                    }
                                    C12107 c12109 = new C12107(c12107.getName());
                                    HashSet hashSet3 = hashSet;
                                    c2455 = c2456;
                                }
                            }
                        }
                        c2455 = c2456;
                        for (String str : c8165.f28512) {
                            c22918.m50733(C16185.m38271(str, c21123M26079));
                            c22918.m50727(new C12107(str));
                            c22918.write((byte[]) map2.get(str));
                        }
                        for (C15252 c15254 : arrayList) {
                            boolean z3 = c15254.f49726;
                            String str2 = c15254.f49727;
                            if (!z3) {
                                c22918.m50733(C16185.m38271(str2, c21123M26079));
                                long j = c15254.f49725;
                                C12107 c121010 = new C12107(str2);
                                c121010.m30096(j);
                                c22918.m50727(c121010);
                                m26085(c22918, c15254);
                            }
                        }
                        c22918.close();
                        c2455.close();
                    } catch (Throwable th6) {
                        th = th6;
                        c2455 = c2456;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    th = th;
                    try {
                        c18779.close();
                        throw th;
                    } catch (Throwable th8) {
                        th.addSuppressed(th8);
                        throw th;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                c18779 = c2456;
                th = th;
                c18779.close();
                throw th;
            }
        } catch (IOException e) {
            throw m26076(abstractC20745, "APK_WRITE_FAILED", m26073(e));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21123 m26079(C2455 c2455, HashMap map) throws IOException {
        C15252 c15252 = (C15252) map.get("AndroidManifest.xml");
        if (c15252 != null) {
            byte[] bArr = c15252.f49724;
            if (bArr != null) {
                C21123 c21123 = new C21123();
                c21123.m47549(bArr);
                return c21123;
            }
            AbstractC20745 abstractC20745 = c15252.f49723;
            if (abstractC20745 != null) {
                long j = c15252.f49725;
                if (j >= 0) {
                    try {
                        if (j > 5242880) {
                            return new C21123();
                        }
                        byte[] bArrM26087 = m26087(abstractC20745);
                        if (bArrM26087 == null) {
                            return new C21123();
                        }
                        C21123 c21124 = new C21123();
                        c21124.m47549(bArrM26087);
                        return c21124;
                    } catch (IOException e) {
                        throw new IOException("Failed to inspect changed APK manifest content.", e);
                    } catch (RuntimeException e2) {
                        if (!m26086(e2)) {
                            throw e2;
                        }
                        throw new IOException("Failed to inspect changed APK manifest content.", e2);
                    }
                }
            }
            throw new IOException("Changed manifest data source is missing.");
        }
        C21123 c21125 = new C21123();
        c21125.m47548(c2455);
        return c21125;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m26087(AbstractC20745 abstractC20745) throws IOException {
        InputStream inputStreamMo33970 = abstractC20745.mo33970();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[65536];
                int i = 0;
                do {
                    int i2 = inputStreamMo33970.read(bArr, 0, Math.min(65536, 5242881 - i));
                    if (i2 < 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStreamMo33970.close();
                        return byteArray;
                    }
                    if (i2 == 0) {
                        int i3 = inputStreamMo33970.read();
                        if (i3 < 0) {
                            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            inputStreamMo33970.close();
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
                inputStreamMo33970.close();
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
            if (inputStreamMo33970 != null) {
                try {
                    inputStreamMo33970.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26080(C2455 c2455, C22918 c22918, C12107 c12107, C21123 c21123) throws IOException {
        if (C16185.m38274(c12107, c21123)) {
            C16185.m38273(c2455, c22918, c12107, c21123, null);
            return;
        }
        if ((c12107.m30131() & 8) == 0) {
            c22918.m50728(c12107, c2455);
            return;
        }
        c22918.m50733(c12107.m30119());
        C12107 c12108 = new C12107(c12107.getName());
        c12108.setTime(c12107.getTime());
        c12108.m30104(c12107.m30110());
        c12108.m30096(c12107.getSize());
        c22918.m50727(c12108);
        InputStream inputStreamM7471 = c2455.m7471(c12107);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStreamM7471.read(bArr);
                if (i != -1) {
                    c22918.write(bArr, 0, i);
                } else {
                    inputStreamM7471.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                inputStreamM7471.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26085(C22918 c22918, C15252 c15252) throws IOException {
        byte[] bArr = c15252.f49724;
        long j = c15252.f49725;
        if (bArr != null) {
            if (j != bArr.length) {
                throw new IOException("Changed entry size does not match its byte array.");
            }
            c22918.write(bArr);
            return;
        }
        AbstractC20745 abstractC20745 = c15252.f49723;
        if (abstractC20745 == null) {
            throw new IOException("Changed entry data source is missing.");
        }
        try {
            InputStream inputStreamMo33970 = abstractC20745.mo33970();
            try {
                byte[] bArr2 = new byte[65536];
                long jM26072 = 0;
                while (true) {
                    int i = inputStreamMo33970.read(bArr2);
                    if (i < 0) {
                        break;
                    }
                    if (i == 0) {
                        int i2 = inputStreamMo33970.read();
                        if (i2 < 0) {
                            break;
                        }
                        c22918.write(i2);
                        jM26072 = m26072(1, jM26072);
                    } else {
                        c22918.write(bArr2, 0, i);
                        jM26072 = m26072(i, jM26072);
                    }
                }
                if (jM26072 != j) {
                    throw new IOException("Changed entry size changed after the build snapshot.");
                }
                inputStreamMo33970.close();
                return;
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
        } catch (IOException e) {
            throw new IOException("Failed to stream changed APK entry content.", e);
        } catch (RuntimeException e2) {
            if (!m26086(e2)) {
                throw e2;
            }
            throw new IOException("Failed to stream changed APK entry content.", e2);
        }
        throw new IOException("Failed to stream changed APK entry content.", e);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20896 m26094(C21956 c21956, C18779 c18779) throws C12731 {
        ArrayList arrayList = c18779.f60887;
        byte[] bArr = new byte[65536];
        for (C15252 c15252 : c18779.f60888) {
            AbstractC20745 abstractC20745 = c15252.f49723;
            if (abstractC20745 != null) {
                try {
                    InputStream inputStreamMo33970 = abstractC20745.mo33970();
                    long jM26072 = 0;
                    while (true) {
                        try {
                            int i = inputStreamMo33970.read(bArr);
                            if (i < 0) {
                                break;
                            }
                            if (i == 0) {
                                if (inputStreamMo33970.read() < 0) {
                                    break;
                                }
                                jM26072 = m26072(1, jM26072);
                            } else {
                                jM26072 = m26072(i, jM26072);
                            }
                        } catch (Throwable th) {
                            if (inputStreamMo33970 == null) {
                                throw th;
                            }
                            try {
                                inputStreamMo33970.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (jM26072 != c15252.f49725) {
                        throw new IOException("Changed entry size changed after the build snapshot.");
                    }
                    inputStreamMo33970.close();
                } catch (IOException unused) {
                    throw m26076((AbstractC20745) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
                } catch (RuntimeException e) {
                    if (!m26086(e)) {
                        throw e;
                    }
                    throw m26076((AbstractC20745) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
                }
                throw m26076((AbstractC20745) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
            }
        }
        C8165 c8165M26090 = m26090(c21956, c18779);
        String str = c21956.f71244;
        String str2 = c18779.f60889;
        ArrayList arrayList2 = new ArrayList();
        Collections.addAll(new ArrayList(3), "edit_session_prepare", "entry_overlay_encode", "dex_merge");
        return new C20896(str, str2, true, 0, 0, arrayList2, "passed", new ArrayList(c8165M26090.f28513), arrayList.size() + c18779.f60885.size(), arrayList.size(), new ArrayList(c18779.f60886), new ArrayList(c18779.f60884), new ArrayList(c18779.f60891));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m26072(int i, long j) throws IOException {
        long j2 = i;
        if (j <= 9007199254740991L - j2) {
            return j + j2;
        }
        throw new IOException("Changed entry exceeds the supported size range.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26086(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C8165 m26090(C21956 c21956, C18779 c18779) throws C12731 {
        C19454 c19454;
        LinkedHashSet linkedHashSet;
        int i;
        String str;
        C19454 c19455;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        LinkedHashSet linkedHashSet2;
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C19454 c19456;
        c21956 = c21956;
        C18779 c187710 = c18779;
        Iterator it = c187710.f60888.iterator();
        while (it.hasNext()) {
            if (C2209.m6822(((C15252) it.next()).f49727) > 0) {
                throw C12731.m31630("DEX_ENTRY_RESERVED", "Standard dex entries can only be changed through dex class edits.");
            }
        }
        Iterator it2 = c187710.f60891.iterator();
        while (it2.hasNext()) {
            if (C2209.m6822((String) it2.next()) > 0) {
                throw C12731.m31630("DEX_ENTRY_RESERVED", "Standard dex entries cannot be deleted as ZIP entries.");
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (String str3 : m26074(c21956.f71224)) {
            int iM6822 = C2209.m6822(str3);
            if (iM6822 > 0) {
                linkedHashMap2.put(str3, C19454.m44505(iM6822, str3));
            }
        }
        for (C21601 c21601 : c187710.f60885) {
            m26078(linkedHashMap2, c21601.f70065).f62627.put(c21601.f70066, c21601);
        }
        for (C23013 c23013 : c187710.f60887) {
            m26078(linkedHashMap2, c23013.f74796).f62629.add(c23013.f74795);
        }
        C20160 c20160 = new C20160();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = m26074(c187710.f60890).iterator();
        while (true) {
            String str4 = "DEX_POOL_OVERFLOW";
            if (it3.hasNext()) {
                C19454 c19454M26078 = m26078(linkedHashMap2, (String) it3.next());
                try {
                    m26084(c21956, c187710, c20160, c19454M26078);
                } catch (C12731 e) {
                    if (!"DEX_POOL_OVERFLOW".equals(e.f42472)) {
                        throw e;
                    }
                    c19454M26078.f62630 = true;
                    arrayList2.add(c19454M26078);
                }
            } else {
                Iterator it4 = arrayList2.iterator();
                String str5 = c187710;
                while (true) {
                    String str6 = "DEX_BUILD_FAILED";
                    if (!it4.hasNext()) {
                        HashMap map = new HashMap();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (C19454 c19457 : linkedHashMap2.values()) {
                            boolean z = c19457.f62631;
                            String str7 = c19457.f62634;
                            if (z) {
                                byte[] bArr = c19457.f62633;
                                if (bArr == null) {
                                    throw C12731.m31630("DEX_BUILD_FAILED", "Dex merge plan was not materialized: " + str7);
                                }
                                map.put(str7, bArr);
                                arrayList3.add(str7);
                                if (!c19457.f62632) {
                                    arrayList4.add(str7);
                                }
                            }
                        }
                        C23846.sort(arrayList3, C2209.m6823());
                        C23846.sort(arrayList4, C2209.m6823());
                        return new C8165(map, arrayList3, arrayList4);
                    }
                    C19454 c19458 = (C19454) it4.next();
                    LinkedHashMap linkedHashMap3 = c19458.f62627;
                    LinkedHashSet linkedHashSet3 = c19458.f62629;
                    String str8 = c19458.f62634;
                    ArrayList arrayList5 = new ArrayList(linkedHashMap3.values());
                    if (arrayList5.isEmpty()) {
                        throw C12731.m31625(str4, "Dex method or field pool overflow.");
                    }
                    try {
                        try {
                            C8485 c8485 = new C8485(C7474.m19963(c19458.f62628));
                            Iterator it5 = arrayList5.iterator();
                            while (it5.hasNext()) {
                                c8485.m22160((InterfaceC22762) ((C21601) it5.next()).f70064);
                            }
                            try {
                                if (c8485.m37938()) {
                                    throw C12731.m31625(str4, "Dex method or field pool overflow.");
                                }
                                C16246 c16246 = new C16246();
                                c8485.m37936(c16246);
                                C10678 c10678M26886 = C10678.m26886(str8 + "#relocation-group", c16246.m38374());
                                if (!c10678M26886.m26889(65536)) {
                                    throw C12731.m31625(str4, "Dex method or field pool overflow.");
                                }
                                Iterator it6 = linkedHashMap2.values().iterator();
                                String str9 = str4;
                                C19454 c19454M44504 = null;
                                int i7 = Integer.MAX_VALUE;
                                Iterator it7 = it4;
                                int i8 = Integer.MAX_VALUE;
                                while (it6.hasNext()) {
                                    it6 = it6;
                                    C19454 c19459 = (C19454) it6.next();
                                    if (c19459 == c19458 || c19459.f62630) {
                                        c20160 = c20160;
                                        i = i8;
                                        str = str6;
                                        c19455 = c19458;
                                        arrayList = arrayList5;
                                        linkedHashMap = linkedHashMap3;
                                        linkedHashSet2 = linkedHashSet3;
                                        str2 = str8;
                                        i8 = i;
                                        c20160 = c20160;
                                        str6 = str;
                                        linkedHashSet3 = linkedHashSet2;
                                        str8 = str2;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList5 = arrayList;
                                        linkedHashMap2 = linkedHashMap2;
                                        c19458 = c19455;
                                    } else {
                                        C10678 c10678M26887 = c19459.f62626;
                                        if (c10678M26887 == null) {
                                            if (c19459.f62632 && c19459.f62627.isEmpty() && c19459.f62629.isEmpty()) {
                                                try {
                                                    String str10 = c19459.f62634;
                                                    try {
                                                        c10678M26887 = C10678.m26887(c21956.m48785(str10), str10);
                                                        c19459.f62626 = c10678M26887;
                                                        c19459.f62628 = c10678M26887.f36431;
                                                        c20160 = c20160;
                                                    } catch (IOException e2) {
                                                        try {
                                                            throw m26076(c21956.m48785(str10), "DEX_COUNTS_UNAVAILABLE", m26073(e2));
                                                        } catch (C12731 unused) {
                                                        }
                                                    }
                                                } catch (C12731 unused2) {
                                                }
                                            }
                                            c10678M26887 = null;
                                        } else {
                                            c20160 = c20160;
                                        }
                                        if (c10678M26887 != null) {
                                            int i9 = c10678M26887.f36435;
                                            int i10 = c10678M26887.f36429;
                                            str = str6;
                                            int i11 = c10678M26887.f36432;
                                            linkedHashSet2 = linkedHashSet3;
                                            int i12 = c10678M26887.f36434;
                                            int i13 = c10678M26887.f36430;
                                            str2 = str8;
                                            int i14 = c10678M26887.f36433;
                                            linkedHashMap = linkedHashMap3;
                                            arrayList = arrayList5;
                                            if (c19458.f62628 > c19459.f62628 || !c10678M26887.m26889(43690)) {
                                                linkedHashMap2 = linkedHashMap2;
                                                i = i8;
                                                c19455 = c19458;
                                                i8 = i;
                                                c20160 = c20160;
                                                str6 = str;
                                                linkedHashSet3 = linkedHashSet2;
                                                str8 = str2;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList5 = arrayList;
                                                linkedHashMap2 = linkedHashMap2;
                                                c19458 = c19455;
                                            } else {
                                                int i15 = c10678M26886.f36429;
                                                int i16 = c10678M26886.f36435;
                                                int i17 = c10678M26886.f36432;
                                                linkedHashMap2 = linkedHashMap2;
                                                int i18 = c10678M26886.f36434;
                                                c19455 = c19458;
                                                int i19 = c10678M26886.f36430;
                                                int i20 = c10678M26886.f36433;
                                                int i21 = i15 + i10;
                                                int i22 = i8;
                                                if (i21 > 65536 || (i2 = i9 + i16) > 65536 || (i3 = i14 + i20) > 65536 || (i4 = i13 + i19) > 65536 || (i5 = i12 + i18) > 65536 || (i6 = i11 + i17) > 65536) {
                                                    i = i22;
                                                    i8 = i;
                                                    c20160 = c20160;
                                                    str6 = str;
                                                    linkedHashSet3 = linkedHashSet2;
                                                    str8 = str2;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList5 = arrayList;
                                                    linkedHashMap2 = linkedHashMap2;
                                                    c19458 = c19455;
                                                } else {
                                                    int iMin = Math.min(Math.min(Math.min(Math.min(Math.min(65536 - i21, 65536 - i2), 65536 - i3), 65536 - i4), 65536 - i5), 65536 - i6);
                                                    i8 = (((((((((WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - (i10 + c10678M26886.f36429)) - i2) + 65536) - i3) + 65536) - i4) + 65536) - i5) + 65536) - i6;
                                                    if (c19454M44504 == null || iMin < i7 || (iMin == i7 && i8 < i22)) {
                                                        c19456 = c19459;
                                                    } else {
                                                        if (iMin == i7 && i8 == i22) {
                                                            c19456 = c19459;
                                                            if (c19456.f62625 < c19454M44504.f62625) {
                                                            }
                                                            c20160 = c20160;
                                                            str6 = str;
                                                            linkedHashSet3 = linkedHashSet2;
                                                            str8 = str2;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList5 = arrayList;
                                                            linkedHashMap2 = linkedHashMap2;
                                                            c19458 = c19455;
                                                        }
                                                        i8 = i22;
                                                        c20160 = c20160;
                                                        str6 = str;
                                                        linkedHashSet3 = linkedHashSet2;
                                                        str8 = str2;
                                                        linkedHashMap3 = linkedHashMap;
                                                        arrayList5 = arrayList;
                                                        linkedHashMap2 = linkedHashMap2;
                                                        c19458 = c19455;
                                                    }
                                                    i7 = iMin;
                                                    c19454M44504 = c19456;
                                                    c20160 = c20160;
                                                    str6 = str;
                                                    linkedHashSet3 = linkedHashSet2;
                                                    str8 = str2;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList5 = arrayList;
                                                    linkedHashMap2 = linkedHashMap2;
                                                    c19458 = c19455;
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            str = str6;
                                            c19455 = c19458;
                                            arrayList = arrayList5;
                                            linkedHashMap = linkedHashMap3;
                                            linkedHashSet2 = linkedHashSet3;
                                            str2 = str8;
                                            i8 = i;
                                            c20160 = c20160;
                                            str6 = str;
                                            linkedHashSet3 = linkedHashSet2;
                                            str8 = str2;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList5 = arrayList;
                                            linkedHashMap2 = linkedHashMap2;
                                            c19458 = c19455;
                                        }
                                    }
                                }
                                LinkedHashMap linkedHashMap4 = linkedHashMap2;
                                C20160 c20161 = c20160;
                                String str11 = str6;
                                C19454 c194510 = c19458;
                                ArrayList<C21601> arrayList6 = arrayList5;
                                AbstractMap abstractMap = linkedHashMap3;
                                LinkedHashSet linkedHashSet4 = linkedHashSet3;
                                String str12 = str8;
                                if (c19454M44504 == null) {
                                    c19454 = c194510;
                                    int i23 = c19454.f62628;
                                    Iterator it8 = linkedHashMap4.values().iterator();
                                    int iMax = 1;
                                    while (it8.hasNext()) {
                                        iMax = Math.max(iMax, ((C19454) it8.next()).f62625 + 1);
                                    }
                                    if (iMax <= 0) {
                                        throw new IllegalArgumentException("Invalid dex index");
                                    }
                                    String strM6966 = iMax == 1 ? "classes.dex" : C2271.m6966(iMax, "classes", ".dex");
                                    c19454M44504 = C19454.m44504(iMax, i23, strM6966);
                                    linkedHashMap2 = linkedHashMap4;
                                    linkedHashMap2.put(strM6966, c19454M44504);
                                } else {
                                    linkedHashMap2 = linkedHashMap4;
                                    c19454 = c194510;
                                }
                                for (C21601 c21602 : arrayList6) {
                                    String str13 = c21602.f70066;
                                    AbstractMap abstractMap2 = abstractMap;
                                    abstractMap2.remove(str13);
                                    String str14 = str12;
                                    try {
                                        Iterator it9 = ((AbstractC18494) c21956.m48786(str14).mo34148()).iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                linkedHashSet = linkedHashSet4;
                                                break;
                                            }
                                            if (str13.equals(((InterfaceC22762) it9.next()).getType())) {
                                                linkedHashSet = linkedHashSet4;
                                                linkedHashSet.add(str13);
                                                break;
                                            }
                                        }
                                        c19454M44504.f62627.put(str13, new C21601(str13, c19454M44504.f62634, c21602.f70064, c21602.f70063));
                                        abstractMap = abstractMap2;
                                        str12 = str14;
                                        linkedHashSet4 = linkedHashSet;
                                    } catch (Exception e3) {
                                        throw m26076(c21956.m48785(str14), str11, m26073(e3));
                                    } catch (OutOfMemoryError unused3) {
                                        throw C2664.m8203();
                                    }
                                }
                                c19454.f62631 = (abstractMap.isEmpty() && linkedHashSet4.isEmpty()) ? false : true;
                                c19454.f62633 = null;
                                c19454.f62626 = null;
                                c19454M44504.f62631 = true;
                                c19454M44504.f62633 = null;
                                c19454M44504.f62626 = null;
                                c19454.f62630 = false;
                                if (c19454.f62631) {
                                    m26084(c21956, c18779, c20161, c19454);
                                }
                                m26084(c21956, c18779, c20161, c19454M44504);
                                str5 = c18779;
                                c20160 = c20161;
                                c21956 = c21956;
                                it4 = it7;
                                str4 = str9;
                            } catch (Exception e4) {
                                e = e4;
                                throw m26076((AbstractC20745) null, str5, m26073(e));
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str5 = "DEX_BUILD_FAILED";
                        }
                    } catch (OutOfMemoryError unused4) {
                        throw C2664.m8203();
                    } catch (C12731 e6) {
                        throw e6;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19454 m26078(LinkedHashMap linkedHashMap, String str) throws C12731 {
        C19454 c19454 = (C19454) linkedHashMap.get(str);
        if (c19454 != null) {
            return c19454;
        }
        throw C12731.m31630("DEX_BUILD_FAILED", "Dex entry is unavailable: " + str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26084(C21956 c21956, C18779 c18779, C20160 c20160, C19454 c19454) throws C12731 {
        String strM19200;
        AbstractC20745 abstractC20745 = c18779.f60883;
        String str = c19454.f62634;
        if (c19454.f62632) {
            try {
                C7221 c7221 = c21956.f71231;
                AbstractC20745 abstractC20745M48785 = c21956.m48785(str);
                c7221.getClass();
                strM19200 = C7221.m19200(abstractC20745M48785);
            } catch (IOException e) {
                throw m26076(c21956.m48785(str), "DEX_BUILD_FAILED", m26073(e));
            }
        } else {
            strM19200 = "<mcp-new-dex>";
        }
        C15927 c15927M45582 = C20160.m45582(str, strM19200, new ArrayList(c19454.f62627.values()), new ArrayList(c19454.f62629));
        try {
            try {
                byte[] bArrM45585 = C20160.m45585(abstractC20745, c15927M45582);
                if (bArrM45585 == null) {
                    bArrM45585 = m26088(c21956, c19454);
                    try {
                        C20160.m45584(abstractC20745, c15927M45582, bArrM45585);
                    } catch (IOException unused) {
                    }
                }
                c19454.f62633 = bArrM45585;
                C10678 c10678M26886 = C10678.m26886(str, bArrM45585);
                c19454.f62626 = c10678M26886;
                c19454.f62628 = c10678M26886.f36431;
                c19454.f62631 = true;
            } catch (OutOfMemoryError unused2) {
                throw C2664.m8203();
            }
        } catch (IOException e2) {
            throw m26076((AbstractC20745) null, "DEX_BUILD_FAILED", m26073(e2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m26088(C21956 c21956, C19454 c19454) throws C12731 {
        C8485 c8485;
        String str = c19454.f62634;
        boolean z = c19454.f62632;
        LinkedHashMap linkedHashMap = c19454.f62627;
        try {
            if (z) {
                C17684 c17684M48786 = c21956.m48786(str);
                c19454.f62628 = c17684M48786.mo34147().f24881;
                c8485 = new C8485(c17684M48786.mo34147());
                for (InterfaceC22762 interfaceC22762 : (AbstractC18494) c17684M48786.mo34148()) {
                    String type = interfaceC22762.getType();
                    if (!c19454.f62629.contains(type) && !linkedHashMap.containsKey(type)) {
                        c8485.m22160(interfaceC22762);
                    }
                }
            } else {
                c8485 = new C8485(C7474.m19963(c19454.f62628));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                c8485.m22160((InterfaceC22762) ((C21601) it.next()).f70064);
            }
            if (c8485.m37938()) {
                throw C12731.m31625("DEX_POOL_OVERFLOW", "Dex method or field pool overflow.");
            }
            C16246 c16246 = new C16246();
            c8485.m37936(c16246);
            return c16246.m38374();
        } catch (C12731 e) {
            throw e;
        } catch (Exception e2) {
            throw m26076(z ? c21956.m48785(str) : null, "DEX_BUILD_FAILED", m26073(e2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m26074(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        C23846.sort(arrayList2, C2209.m6823());
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26081(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, AbstractC20745 abstractC20747, C14558 c14558) throws C12731 {
        try {
            C23730.m52263(abstractC20745, abstractC20746, c14558, new C8871());
        } catch (Exception e) {
            throw m26076(abstractC20747, "APK_SIGN_FAILED", m26073(e));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18073 m26077(C21956 c21956, C18779 c18779, C8165 c8165, AbstractC20745 abstractC20745, C14558 c14558, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = c18779.f60887;
        if (z) {
            EnumC7501 enumC7501M35034 = c14558.m35034();
            ArrayList arrayList3 = new ArrayList();
            if (enumC7501M35034.f24976) {
                arrayList3.add("V1");
            }
            if (enumC7501M35034.f24978) {
                arrayList3.add("V2");
            }
            if (enumC7501M35034.f24975) {
                arrayList3.add("V3");
            }
            arrayList = arrayList3;
        } else {
            arrayList = new ArrayList();
        }
        String str = c21956.f71244;
        String str2 = c18779.f60889;
        abstractC20745.mo33986();
        String strMo33986 = abstractC20745.mo33986();
        String strMo33987 = abstractC20745.mo33986();
        String name = abstractC20745.getName();
        long jMo33964 = abstractC20745.mo33964();
        C7263 c7263M37452 = C15731.m37452(abstractC20745);
        if (z) {
            Collections.addAll(new ArrayList(6), "edit_session_prepare", "entry_overlay_encode", "dex_merge", "apk_zip_write", "apk_sign", "publish");
        } else {
            Collections.addAll(new ArrayList(5), "edit_session_prepare", "entry_overlay_encode", "dex_merge", "apk_zip_write", "publish");
        }
        return new C18073(str, str2, strMo33986, strMo33987, name, jMo33964, z, arrayList, c7263M37452, new ArrayList(c8165.f28513), arrayList2.size() + c18779.f60885.size(), arrayList2.size(), new ArrayList(c18779.f60886), new ArrayList(c18779.f60884), new ArrayList(c18779.f60891));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m26091(AbstractC20745 abstractC20745, String str, String str2) {
        return C12731.m31627(str, str2, "warning", JSON.array(), JSON.object().add("outputPath", abstractC20745.mo33986()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m26076(AbstractC20745 abstractC20745, String str, String str2) {
        return C12731.m31631(str, str2, "fatal", JSON.array(), JSON.object().add("outputPath", abstractC20745 == null ? JSON.NULL : JSON.value(abstractC20745.mo33986())));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C12731 m26089(AbstractC20745 abstractC20745, String str, String str2) {
        return C12731.m31627(str, str2, "fatal", JSON.array(), JSON.object().add("outputPath", JSON.value(abstractC20745.mo33986())));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m26073(Exception exc) {
        String message = exc.getMessage();
        return (message == null || message.isEmpty()) ? exc.getClass().getSimpleName() : message;
    }
}
