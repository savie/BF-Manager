package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.n.c;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7AJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20893 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66878 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f66880 = C6382.f21570.m49876("mcp");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final char[] f66877 = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f66879 = new SecureRandom();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m47755() {
        return this.f66880;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47754(AbstractC22044 abstractC22044, String str) {
        AbstractC22044 abstractC22044M49876 = this.f66880.m49876(str);
        return !abstractC22044M49876.mo2934() && abstractC22044.mo4301(abstractC22044M49876);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m47756(String str) {
        return this.f66880.m49876(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m47753() throws Throwable {
        AbstractC22044 abstractC22044 = this.f66880;
        boolean zMo2934 = abstractC22044.mo2934();
        AbstractC22044 abstractC22045 = null;
        int i = 0;
        try {
            abstractC22044.m49853();
            int i2 = (zMo2934 || !abstractC22044.mo2934()) ? 0 : 1;
            while (i < 100) {
                try {
                    AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(".tmp-" + UUID.randomUUID());
                    try {
                        if (abstractC22044M49876.mo2934()) {
                            i++;
                        } else {
                            abstractC22044M49876.m49853();
                            try {
                                abstractC22044M49876.m49876("entries").m49853();
                                abstractC22044M49876.m49876("cache").m49876("dex").m49853();
                                return abstractC22044M49876;
                            } catch (IOException | RuntimeException e) {
                                e = e;
                                i = 1;
                            }
                        }
                    } catch (IOException | RuntimeException e2) {
                        e = e2;
                        i = i2;
                    }
                    e = e;
                    abstractC22045 = abstractC22044M49876;
                } catch (IOException | RuntimeException e3) {
                    int i3 = i2;
                    e = e3;
                    i = i3;
                }
                if (abstractC22045 != null && abstractC22045.mo2934()) {
                    m47748(abstractC22045);
                    i = 1;
                }
                if (((zMo2934 || !abstractC22044.mo2934()) ? i : 1) != 0) {
                    C22099.m50062();
                }
                throw e;
            }
            throw new IOException("Unable to create temporary workspace");
        } catch (IOException e4) {
            e = e4;
        } catch (RuntimeException e5) {
            e = e5;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m47757() throws IOException {
        for (int i = 0; i < 100; i++) {
            char[] cArr = new char[8];
            for (int i2 = 0; i2 < 8; i2++) {
                SecureRandom secureRandom = f66879;
                char[] cArr2 = f66877;
                cArr[i2] = cArr2[secureRandom.nextInt(cArr2.length)];
            }
            String str = new String(cArr);
            if (!this.f66880.m49876(str).mo2934()) {
                return str;
            }
        }
        throw new IOException("Unable to allocate workspace id");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m47744(AbstractC22044 abstractC22044) {
        m47749(abstractC22044);
        if (abstractC22044.mo2934()) {
            throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to delete ")));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m47749(AbstractC22044 abstractC22044) throws IOException {
        if (abstractC22044.mo2934()) {
            if (abstractC22044.mo4281() && !abstractC22044.m49860()) {
                Iterator it = abstractC22044.mo4299(true).iterator();
                while (it.hasNext()) {
                    m47749((AbstractC22044) it.next());
                }
            }
            if (abstractC22044.mo2934() && !abstractC22044.mo4296()) {
                throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to delete ")));
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m47748(AbstractC22044 abstractC22044) {
        if (abstractC22044.mo2934()) {
            if (abstractC22044.mo4281()) {
                Iterator it = abstractC22044.mo4299(true).iterator();
                while (it.hasNext()) {
                    m47748((AbstractC22044) it.next());
                }
            }
            abstractC22044.mo4296();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47738(C22941 c22941, AbstractC22044 abstractC22044) throws IOException {
        try {
            MessageDigest messageDigestM36179 = C15022.m36179();
            InterfaceC17713 interfaceC17713M51735 = c22941.m51735();
            interfaceC17713M51735.seek(0L);
            long length = interfaceC17713M51735.length();
            byte[] bArr = new byte[8192];
            OutputStream outputStreamMo4289 = abstractC22044.mo4289(false);
            while (length > 0) {
                try {
                    int i = interfaceC17713M51735.read(bArr, 0, (int) Math.min(8192, length));
                    if (i < 0) {
                        throw new IOException("Unexpected EOF while copying archive");
                    }
                    messageDigestM36179.update(bArr, 0, i);
                    outputStreamMo4289.write(bArr, 0, i);
                    length -= (long) i;
                } catch (Throwable th) {
                    if (outputStreamMo4289 != null) {
                        try {
                            outputStreamMo4289.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw e;
            }
            if (outputStreamMo4289 != null) {
                outputStreamMo4289.close();
            }
            return C15022.m36182(messageDigestM36179.digest());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16417 m47752(AbstractC22044 abstractC22044) {
        String strM2304;
        C16417 c16417;
        AbstractC22044 abstractC22045 = this.f66880;
        String strM2305 = null;
        if (!abstractC22045.mo2934() || !abstractC22045.mo4281()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strMo4278 = abstractC22044.mo4278();
        if (strMo4278 == null) {
            strM2304 = null;
        } else {
            try {
                strM2304 = C0470.m2304(strMo4278, "sourcePath");
            } catch (C10186 unused) {
                strM2304 = null;
            }
        }
        if (strM2304 == null) {
            return null;
        }
        long jMo4285 = abstractC22044.mo4285();
        long jMo4286 = abstractC22044.mo4286();
        int i = 1;
        for (AbstractC22044 abstractC22046 : abstractC22045.mo4299(true)) {
            if (abstractC22046.mo4281()) {
                try {
                    JSONObject jSONObjectM47746 = m47746(abstractC22046);
                    if (jSONObjectM47746.getInt("schemaVersion", -1) == i) {
                        String string = jSONObjectM47746.getString("workspaceId", strM2305);
                        if (abstractC22046.getName().equals(string) && m47750(string)) {
                            C16417 c16418 = new C16417(abstractC22046, string);
                            c16418.f53275 = jSONObjectM47746.getBoolean("temporary", false);
                            String string2 = jSONObjectM47746.getString("sourcePath", strM2305);
                            if (string2 != null) {
                                try {
                                    strM2305 = C0470.m2304(string2, "sourcePath");
                                } catch (C10186 unused2) {
                                }
                            }
                            c16418.f53276 = strM2305;
                            c16418.f53277 = jSONObjectM47746.getLong("sourceSize", -1L);
                            c16418.f53282 = jSONObjectM47746.getLong("sourceLastModified", -1L);
                            c16418.f53278 = jSONObjectM47746.getString("originalSha256", null);
                            c16418.f53269 = jSONObjectM47746.getLong("createdAt", -1L);
                            c16418.f53280 = jSONObjectM47746.getLong("lastAccessedAt", -1L);
                            if (c16418.f53275 || c16418.f53276 == null || c16418.f53277 < 0 || c16418.f53282 < 0 || c16418.f53278 == null || c16418.f53269 < 0) {
                                c16417 = 0;
                            } else {
                                c16417 = c16418;
                            }
                        } else {
                            c16417 = 0;
                        }
                    }
                } catch (Exception unused3) {
                }
                if (c16417 != 0 && strM2304.equals(c16417.f53276) && jMo4285 == c16417.f53277 && jMo4286 == c16417.f53282) {
                    c16417 = strM2305;
                    arrayList.add(c16417);
                }
                c16417 = strM2305;
                c16417 = strM2305;
                c16417 = strM2305;
                c16417 = strM2305;
                strM2305 = null;
                i = 1;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        final String strM47745 = m47745(abstractC22044);
        return (C16417) C1170.stream(arrayList).filter(new Predicate() { // from class: l.᩻᩺ۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return strM47745.equals(((C16417) obj).f53278);
            }
        }).max(C2661.comparingLong(new C17163())).orElse(null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16417 m47758(String str) throws C10186 {
        if (!m47750(str)) {
            throw C10186.m26304(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
        }
        try {
            C16417 c16417M47743 = m47743(this.f66880.m49876(str), str);
            m47739(c16417M47743);
            return c16417M47743;
        } catch (C3739 unused) {
            throw C10186.m26304(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
        } catch (C10186 e) {
            throw e;
        } catch (C23877 e2) {
            throw C18723.m43535(e2.f77307, e2.f77308);
        } catch (Exception unused2) {
            throw C10186.m26304(null, "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16417 m47751(String str) {
        if (m47750(str)) {
            AbstractC22044 abstractC22044M49876 = this.f66880.m49876(str);
            try {
                JSONObject jSONObjectM47746 = m47746(abstractC22044M49876);
                if (jSONObjectM47746.getInt("schemaVersion", -1) != 1) {
                    throw new C3739();
                }
                if (!str.equals(jSONObjectM47746.getString("workspaceId", null))) {
                    throw new C3739();
                }
                C16417 c16417 = new C16417(abstractC22044M49876, str);
                c16417.f53275 = jSONObjectM47746.getBoolean("temporary", false);
                JSONValue jSONValue = jSONObjectM47746.get("sourcePath");
                c16417.f53276 = (jSONValue == null || !jSONValue.isString()) ? null : jSONValue.asString();
                return c16417;
            } catch (C3739 unused) {
                throw C10186.m26304(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
            }
        }
        throw C10186.m26304(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47740(AbstractC22044 abstractC22044, long j) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject(new String(abstractC22044.m49876("metadata.json").m49865(), StandardCharsets.UTF_8));
            while (jSONObject.contains("lastAccessedAt")) {
                jSONObject.remove("lastAccessedAt");
            }
            jSONObject.put("lastAccessedAt", j);
            m47741(abstractC22044, jSONObject);
        } catch (Exception e) {
            throw new IOException("Unable to read metadata", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47741(AbstractC22044 abstractC22044, JSONObject jSONObject) {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("metadata.json");
        abstractC22044M49876.mo49834();
        AbstractC22044 abstractC22044M49862 = abstractC22044M49876.m49862(".metadata");
        try {
            abstractC22044M49862.m49849(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
            abstractC22044M49862.mo4298().mo8795(abstractC22044M49876);
        } finally {
            abstractC22044M49862.mo4296();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static JSONObject m47746(AbstractC22044 abstractC22044) throws C3739 {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("metadata.json");
        if (!abstractC22044M49876.mo4304()) {
            throw new C3739();
        }
        try {
            return new JSONObject(new String(abstractC22044M49876.m49865(), StandardCharsets.UTF_8));
        } catch (Exception unused) {
            throw new C3739();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m47747(AbstractC22044 abstractC22044, String str) {
        return abstractC22044.m49876("cache").m49876("dex").m49876(str + ".type_index");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m47750(String str) {
        if (str != null && str.length() == 8) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x010d, code lost:
    
        if (r13.f53273 >= 0) goto L56;
     */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C16417 m47743(l.AbstractC22044 r12, java.lang.String r13) throws l.C3739, l.C23877 {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20893.m47743(l.᩷ۨᩴ, java.lang.String):l.ܶ᩺ۚ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47739(C16417 c16417) throws C10186 {
        String str = c16417.f53272;
        AbstractC22044 abstractC22044 = c16417.f53271;
        if (!"absent".equals(str) && !"available".equals(str) && !"extract_error".equals(str) && !"parse_error".equals(str)) {
            throw C18723.m43535(c16417.f53276, c16417.f53275);
        }
        if (!abstractC22044.m49876("original.apk").mo4304()) {
            throw C18723.m43535(c16417.f53276, c16417.f53275);
        }
        for (C17909 c17909 : c16417.f53279) {
            String str2 = c17909.f58662;
            String str3 = c17909.f58659;
            if (!"available".equals(str2) && !d.O.equals(str2) && !"skipped".equals(str2)) {
                throw C18723.m43535(c16417.f53276, c16417.f53275);
            }
            if ("available".equals(c17909.f58662) && (str3 == null || !abstractC22044.m49876("entries").m49876(str3).mo4304() || !m47747(abstractC22044, str3).mo4304())) {
                throw C18723.m43535(c16417.f53276, c16417.f53275);
            }
        }
        if (("available".equals(c16417.f53272) || "parse_error".equals(c16417.f53272)) && !abstractC22044.m49876("entries").m49876("resources.arsc").mo4304()) {
            throw C18723.m43535(c16417.f53276, c16417.f53275);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47742(AbstractC22044 abstractC22044, C16417 c16417) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (C17909 c17909 : c16417.f53279) {
            jSONArrayArray.add(JSON.object().add("entryName", c17909.f58659).add(c.a, c17909.f58662).add(d.O, c17909.f58661).add("indexCachePath", c17909.f58660));
        }
        JSONObject jSONObjectAdd = JSON.object().add("schemaVersion", 1).add("workspaceId", c16417.f53281).add("temporary", c16417.f53275).add("sourcePath", c16417.f53276).add("sourceSize", c16417.f53277).add("sourceLastModified", c16417.f53282).add("originalSha256", c16417.f53278).add("createdAt", c16417.f53269).add("lastAccessedAt", c16417.f53280).add("dexFiles", jSONArrayArray).add("resourceStatus", c16417.f53272).add("resourceError", c16417.f53274);
        if ("available".equals(c16417.f53272) && (str = c16417.f53268) != null && c16417.f53273 >= 0) {
            jSONObjectAdd.add("resourceSha256", str);
            jSONObjectAdd.add("resourceLength", c16417.f53273);
        }
        m47741(abstractC22044, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m47745(AbstractC22044 abstractC22044) throws IOException {
        try {
            MessageDigest messageDigestM36179 = C15022.m36179();
            C15022.m36175(messageDigestM36179, abstractC22044.mo4290());
            return C15022.m36182(messageDigestM36179.digest());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
