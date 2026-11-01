package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
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

/* JADX INFO: renamed from: l.۟ۘ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N7AJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7221 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24051 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f24052 = C11904.f39935.m46690("mcp");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final char[] f24050 = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f24049 = new SecureRandom();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m19205() {
        return this.f24052;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19204(AbstractC20745 abstractC20745, String str) {
        AbstractC20745 abstractC20745M46690 = this.f24052.m46690(str);
        return !abstractC20745M46690.mo33975() && abstractC20745.mo24646(abstractC20745M46690);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m19206(String str) {
        return this.f24052.m46690(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m19203() throws Throwable {
        AbstractC20745 abstractC20745 = this.f24052;
        boolean zMo33975 = abstractC20745.mo33975();
        AbstractC20745 abstractC20746 = null;
        int i = 0;
        try {
            abstractC20745.m46739();
            int i2 = (zMo33975 || !abstractC20745.mo33975()) ? 0 : 1;
            while (i < 100) {
                try {
                    AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(".tmp-" + UUID.randomUUID());
                    try {
                        if (abstractC20745M46690.mo33975()) {
                            i++;
                        } else {
                            abstractC20745M46690.m46739();
                            try {
                                abstractC20745M46690.m46690("entries").m46739();
                                abstractC20745M46690.m46690("cache").m46690("dex").m46739();
                                return abstractC20745M46690;
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
                    abstractC20746 = abstractC20745M46690;
                } catch (IOException | RuntimeException e3) {
                    int i3 = i2;
                    e = e3;
                    i = i3;
                }
                if (abstractC20746 != null && abstractC20746.mo33975()) {
                    m19199(abstractC20746);
                    i = 1;
                }
                if (((zMo33975 || !abstractC20745.mo33975()) ? i : 1) != 0) {
                    C15157.m36345();
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m19207() throws IOException {
        for (int i = 0; i < 100; i++) {
            char[] cArr = new char[8];
            for (int i2 = 0; i2 < 8; i2++) {
                SecureRandom secureRandom = f24049;
                char[] cArr2 = f24050;
                cArr[i2] = cArr2[secureRandom.nextInt(cArr2.length)];
            }
            String str = new String(cArr);
            if (!this.f24052.m46690(str).mo33975()) {
                return str;
            }
        }
        throw new IOException("Unable to allocate workspace id");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m19197(AbstractC20745 abstractC20745) {
        m19188(abstractC20745);
        if (abstractC20745.mo33975()) {
            throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to delete ")));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m19188(AbstractC20745 abstractC20745) throws IOException {
        if (abstractC20745.mo33975()) {
            if (abstractC20745.mo33974() && !abstractC20745.m46723()) {
                Iterator it = abstractC20745.mo33983(true).iterator();
                while (it.hasNext()) {
                    m19188((AbstractC20745) it.next());
                }
            }
            if (abstractC20745.mo33975() && !abstractC20745.mo24647()) {
                throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to delete ")));
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m19199(AbstractC20745 abstractC20745) {
        if (abstractC20745.mo33975()) {
            if (abstractC20745.mo33974()) {
                Iterator it = abstractC20745.mo33983(true).iterator();
                while (it.hasNext()) {
                    m19199((AbstractC20745) it.next());
                }
            }
            abstractC20745.mo24647();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m19190(C2455 c2455, AbstractC20745 abstractC20745) throws IOException {
        try {
            MessageDigest messageDigestM49421 = C22253.m49421();
            InterfaceC7739 interfaceC7739M7467 = c2455.m7467();
            interfaceC7739M7467.seek(0L);
            long length = interfaceC7739M7467.length();
            byte[] bArr = new byte[8192];
            OutputStream outputStreamMo33976 = abstractC20745.mo33976(false);
            while (length > 0) {
                try {
                    int i = interfaceC7739M7467.read(bArr, 0, (int) Math.min(8192, length));
                    if (i < 0) {
                        throw new IOException("Unexpected EOF while copying archive");
                    }
                    messageDigestM49421.update(bArr, 0, i);
                    outputStreamMo33976.write(bArr, 0, i);
                    length -= (long) i;
                } catch (Throwable th) {
                    if (outputStreamMo33976 != null) {
                        try {
                            outputStreamMo33976.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw e;
            }
            if (outputStreamMo33976 != null) {
                outputStreamMo33976.close();
            }
            return C22253.m49424(messageDigestM49421.digest());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19216 m19202(AbstractC20745 abstractC20745) {
        String strM17479;
        C19216 c19216;
        AbstractC20745 abstractC20746 = this.f24052;
        String strM174710 = null;
        if (!abstractC20746.mo33975() || !abstractC20746.mo33974()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strMo24643 = abstractC20745.mo24643();
        if (strMo24643 == null) {
            strM17479 = null;
        } else {
            try {
                strM17479 = C6370.m17479(strMo24643, "sourcePath");
            } catch (C12731 unused) {
                strM17479 = null;
            }
        }
        if (strM17479 == null) {
            return null;
        }
        long jMo33964 = abstractC20745.mo33964();
        long jMo33991 = abstractC20745.mo33991();
        int i = 1;
        for (AbstractC20745 abstractC20747 : abstractC20746.mo33983(true)) {
            if (abstractC20747.mo33974()) {
                try {
                    JSONObject jSONObjectM19195 = m19195(abstractC20747);
                    if (jSONObjectM19195.getInt("schemaVersion", -1) == i) {
                        String string = jSONObjectM19195.getString("workspaceId", strM174710);
                        if (abstractC20747.getName().equals(string) && m19189(string)) {
                            C19216 c19217 = new C19216(abstractC20747, string);
                            c19217.f62065 = jSONObjectM19195.getBoolean("temporary", false);
                            String string2 = jSONObjectM19195.getString("sourcePath", strM174710);
                            if (string2 != null) {
                                try {
                                    strM174710 = C6370.m17479(string2, "sourcePath");
                                } catch (C12731 unused2) {
                                }
                            }
                            c19217.f62064 = strM174710;
                            c19217.f62067 = jSONObjectM19195.getLong("sourceSize", -1L);
                            c19217.f62069 = jSONObjectM19195.getLong("sourceLastModified", -1L);
                            c19217.f62059 = jSONObjectM19195.getString("originalSha256", null);
                            c19217.f62058 = jSONObjectM19195.getLong("createdAt", -1L);
                            c19217.f62056 = jSONObjectM19195.getLong("lastAccessedAt", -1L);
                            if (c19217.f62065 || c19217.f62064 == null || c19217.f62067 < 0 || c19217.f62069 < 0 || c19217.f62059 == null || c19217.f62058 < 0) {
                                c19216 = 0;
                            } else {
                                c19216 = c19217;
                            }
                        } else {
                            c19216 = 0;
                        }
                    }
                } catch (Exception unused3) {
                }
                if (c19216 != 0 && strM17479.equals(c19216.f62064) && jMo33964 == c19216.f62067 && jMo33991 == c19216.f62069) {
                    c19216 = strM174710;
                    arrayList.add(c19216);
                }
                c19216 = strM174710;
                c19216 = strM174710;
                c19216 = strM174710;
                c19216 = strM174710;
                strM174710 = null;
                i = 1;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        final String strM19200 = m19200(abstractC20745);
        return (C19216) C9030.stream(arrayList).filter(new Predicate() { // from class: l.ᩳۘ۬
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return strM19200.equals(((C19216) obj).f62059);
            }
        }).max(C7618.comparingLong(new C18510())).orElse(null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19216 m19208(String str) throws C12731 {
        if (!m19189(str)) {
            throw C12731.m31629(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
        }
        try {
            C19216 c19216M19196 = m19196(this.f24052.m46690(str), str);
            m19191(c19216M19196);
            return c19216M19196;
        } catch (C8633 e) {
            throw C2664.m8200(e.f29784, e.f29785);
        } catch (C10044 unused) {
            throw C12731.m31629(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
        } catch (C12731 e2) {
            throw e2;
        } catch (Exception unused2) {
            throw C12731.m31629(null, "WORKSPACE_CORRUPT", "Workspace is corrupt.", "fatal");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19216 m19201(String str) {
        if (m19189(str)) {
            AbstractC20745 abstractC20745M46690 = this.f24052.m46690(str);
            try {
                JSONObject jSONObjectM19195 = m19195(abstractC20745M46690);
                if (jSONObjectM19195.getInt("schemaVersion", -1) != 1) {
                    throw new C10044();
                }
                if (!str.equals(jSONObjectM19195.getString("workspaceId", null))) {
                    throw new C10044();
                }
                C19216 c19216 = new C19216(abstractC20745M46690, str);
                c19216.f62065 = jSONObjectM19195.getBoolean("temporary", false);
                return c19216;
            } catch (C10044 unused) {
                throw C12731.m31629(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
            }
        }
        throw C12731.m31629(null, "WORKSPACE_NOT_FOUND", "Workspace not found.", "fatal");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19192(AbstractC20745 abstractC20745, long j) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject(new String(abstractC20745.m46690("metadata.json").m46727(), StandardCharsets.UTF_8));
            while (jSONObject.contains("lastAccessedAt")) {
                jSONObject.remove("lastAccessedAt");
            }
            jSONObject.put("lastAccessedAt", j);
            m19193(abstractC20745, jSONObject);
        } catch (Exception e) {
            throw new IOException("Unable to read metadata", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19193(AbstractC20745 abstractC20745, JSONObject jSONObject) {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("metadata.json");
        abstractC20745M46690.mo46720();
        AbstractC20745 abstractC20745M46733 = abstractC20745M46690.m46733(".metadata");
        try {
            abstractC20745M46733.m46703(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
            abstractC20745M46733.mo33989().mo8396(abstractC20745M46690);
        } finally {
            abstractC20745M46733.mo24647();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static JSONObject m19195(AbstractC20745 abstractC20745) throws C10044 {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("metadata.json");
        if (!abstractC20745M46690.mo33971()) {
            throw new C10044();
        }
        try {
            return new JSONObject(new String(abstractC20745M46690.m46727(), StandardCharsets.UTF_8));
        } catch (Exception unused) {
            throw new C10044();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m19198(AbstractC20745 abstractC20745, String str) {
        return abstractC20745.m46690("cache").m46690("dex").m46690(str + ".type_index");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m19189(String str) {
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
    
        if (r13.f62055 >= 0) goto L56;
     */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C19216 m19196(l.AbstractC20745 r12, java.lang.String r13) throws l.C8633, l.C10044 {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7221.m19196(l.᩷۠ۚ, java.lang.String):l.᩵ۘ۬");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19191(C19216 c19216) throws C12731 {
        String str = c19216.f62060;
        AbstractC20745 abstractC20745 = c19216.f62061;
        if (!"absent".equals(str) && !"available".equals(str) && !"extract_error".equals(str) && !"parse_error".equals(str)) {
            throw C2664.m8200(c19216.f62064, c19216.f62065);
        }
        if (!abstractC20745.m46690("original.apk").mo33971()) {
            throw C2664.m8200(c19216.f62064, c19216.f62065);
        }
        for (C7927 c7927 : c19216.f62063) {
            String str2 = c7927.f26034;
            String str3 = c7927.f26035;
            if (!"available".equals(str2) && !d.O.equals(str2) && !"skipped".equals(str2)) {
                throw C2664.m8200(c19216.f62064, c19216.f62065);
            }
            if ("available".equals(c7927.f26034) && (str3 == null || !abstractC20745.m46690("entries").m46690(str3).mo33971() || !m19198(abstractC20745, str3).mo33971())) {
                throw C2664.m8200(c19216.f62064, c19216.f62065);
            }
        }
        if (("available".equals(c19216.f62060) || "parse_error".equals(c19216.f62060)) && !abstractC20745.m46690("entries").m46690("resources.arsc").mo33971()) {
            throw C2664.m8200(c19216.f62064, c19216.f62065);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19194(AbstractC20745 abstractC20745, C19216 c19216) {
        String str;
        JSONArray jSONArrayArray = JSON.array();
        for (C7927 c7927 : c19216.f62063) {
            jSONArrayArray.add(JSON.object().add("entryName", c7927.f26035).add(c.a, c7927.f26034).add(d.O, c7927.f26037).add("indexCachePath", c7927.f26036));
        }
        JSONObject jSONObjectAdd = JSON.object().add("schemaVersion", 1).add("workspaceId", c19216.f62066).add("temporary", c19216.f62065).add("sourcePath", c19216.f62064).add("sourceSize", c19216.f62067).add("sourceLastModified", c19216.f62069).add("originalSha256", c19216.f62059).add("createdAt", c19216.f62058).add("lastAccessedAt", c19216.f62056).add("dexFiles", jSONArrayArray).add("resourceStatus", c19216.f62060).add("resourceError", c19216.f62068);
        if ("available".equals(c19216.f62060) && (str = c19216.f62057) != null && c19216.f62055 >= 0) {
            jSONObjectAdd.add("resourceSha256", str);
            jSONObjectAdd.add("resourceLength", c19216.f62055);
        }
        m19193(abstractC20745, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m19200(AbstractC20745 abstractC20745) throws IOException {
        try {
            MessageDigest messageDigestM49421 = C22253.m49421();
            C22253.m49417(messageDigestM49421, abstractC20745.mo33970());
            return C22253.m49424(messageDigestM49421.digest());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
