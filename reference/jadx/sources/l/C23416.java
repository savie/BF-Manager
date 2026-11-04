package l;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B74J */
/* JADX INFO: loaded from: classes.dex */
public final class C23416 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Object f75798 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f75797 = new HashMap();

    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24908 m52615(C16281 c16281, Uri uri, InterfaceC15670 interfaceC15670, C6675 c6675) throws InterruptedIOException {
        C15956 c15956M52613;
        String str;
        C8367 c8367M38628 = c16281.m38628();
        if (c8367M38628 == null) {
            return C24908.m55488();
        }
        String strM11682 = C3603.m11682(uri, interfaceC15670);
        synchronized (f75798) {
            C11481 c11481 = (C11481) C11392.computeIfAbsent(f75797, strM11682, new C1787());
            C24908 c24908 = new C24908(c11481, 0);
            c11481.f36113++;
            if (c6675 != null) {
                C24575.m54893(c6675.f22256, c24908);
            }
            while (c11481.f36118 && !c24908.f80617) {
                try {
                    f75798.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    c24908.m55487();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP validation");
                }
            }
            if (c24908.f80617) {
                return C24908.m55488();
            }
            if (c16281.m38631().equals(c11481.f36119) && (str = c11481.f36120) != null) {
                C24908.m55485(c24908, str, c11481.f36116, c11481.f36121);
                return c24908;
            }
            c11481.f36118 = true;
            C15956 c15956 = null;
            try {
                c15956M52613 = m52613(c8367M38628, strM11682, uri, interfaceC15670, c11481);
            } catch (IOException | RuntimeException unused2) {
                c15956M52613 = null;
            }
            synchronized (f75798) {
                if (c15956M52613 == null) {
                    c15956 = c15956M52613;
                } else if (c15956M52613.f51807 != null) {
                    while (c11481.f36114 > 0) {
                        try {
                            f75798.wait();
                        } catch (InterruptedException unused3) {
                            Thread.currentThread().interrupt();
                            c11481.f36118 = false;
                            c24908.m55487();
                            f75798.notifyAll();
                            throw new InterruptedIOException("Interrupted while waiting to replace HTTP cache generation");
                        }
                    }
                    try {
                        c8367M38628.m22523(c15956M52613.f51807);
                        c15956 = c15956M52613;
                    } catch (RuntimeException unused4) {
                    }
                } else {
                    c15956 = c15956M52613;
                }
                c11481.f36118 = false;
                if (c15956 == null) {
                    c24908.m55487();
                    c16281.m38632();
                    f75798.notifyAll();
                    return C24908.m55488();
                }
                c11481.f36119 = c16281.m38631();
                c11481.f36120 = c15956.f51806;
                c11481.f36116 = c15956.f51808;
                c11481.f36121 = c15956.f51809;
                if (!c24908.f80617) {
                    C24908.m55485(c24908, c15956.f51806, c15956.f51808, c15956.f51809);
                }
                f75798.notifyAll();
                if (c24908.f80617) {
                    c24908 = C24908.m55488();
                }
                return c24908;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0171 A[PHI: r14
      0x0171: PHI (r14v7 long) = (r14v5 long), (r14v2 long), (r14v2 long) binds: [B:105:0x015c, B:101:0x0143, B:102:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15956 m52613(C8367 c8367, String str, Uri uri, InterfaceC15670 interfaceC15670, C11481 c11481) throws IOException {
        C17448 c17448M40947;
        boolean z;
        String str2;
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C18809 c18809Mo22517 = c8367.mo22517(str);
        C16702 c16702 = new C16702();
        c16702.f53956 = -1L;
        c16702.f53954 = c18809Mo22517.m43654("custom_mt.video.etag");
        c16702.f53958 = c18809Mo22517.m43654("custom_mt.video.last_modified");
        c16702.f53956 = c18809Mo22517.m43650(-1L, "custom_mt.video.length");
        c16702.f53955 = c18809Mo22517.m43650(0L, "custom_mt.video.generation");
        c16702.f53957 = c18809Mo22517.m43654("custom_mt.video.final_uri_digest");
        try {
            c17448M40947 = m52614(interfaceC15670, uri, c16702, true, false, c11481);
        } catch (C8213 e) {
            if (e.f27043 == 304) {
                c17448M40947 = C17448.m40947(e);
            } else {
                try {
                    c17448M40947 = m52614(interfaceC15670, uri, c16702, true, true, c11481);
                } catch (C8213 e2) {
                    if (e2.f27043 == 304) {
                        c17448M40947 = C17448.m40947(e2);
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (c17448M40947.f56750 && (!c16702.m39461() || (((str3 = c17448M40947.f56747) != null && (str8 = c16702.f53954) != null && !str3.equals(str8)) || (((str4 = c17448M40947.f56748) != null && (str7 = c16702.f53958) != null && !str4.equals(str7)) || ((str5 = c17448M40947.f56751) != null && (str6 = c16702.f53957) != null && !str5.equals(str6)))))) {
            c17448M40947 = m52614(interfaceC15670, uri, null, false, false, c11481);
        }
        boolean z2 = c17448M40947.f56750;
        String str9 = c17448M40947.f56747;
        if (str9 == null) {
            str9 = z2 ? c16702.f53954 : null;
        }
        String str10 = c17448M40947.f56748;
        if (str10 == null) {
            str10 = z2 ? c16702.f53958 : null;
        }
        long j = c17448M40947.f56752;
        if (j == -1) {
            j = z2 ? c16702.f53956 : -1L;
        }
        String str11 = c17448M40947.f56751;
        if (str11 == null) {
            str11 = z2 ? c16702.f53957 : null;
        }
        long jMax = c16702.f53955;
        if (jMax <= 0 && str9 == null && str10 == null && j == -1) {
            throw new IOException("HTTP validation returned incomplete metadata");
        }
        if (c16702.m39461()) {
            String str12 = c16702.f53954;
            if (str12 == null) {
                zEquals = str9 == null;
            } else {
                zEquals = str12.equals(str9);
            }
            if (zEquals) {
                String str13 = c16702.f53958;
                if (str13 == null) {
                    zEquals2 = str10 == null;
                } else {
                    zEquals2 = str13.equals(str10);
                }
                if (zEquals2 && c16702.f53956 == j) {
                    String str14 = c16702.f53957;
                    if (str14 == null) {
                        zEquals3 = str11 == null;
                    } else {
                        zEquals3 = str14.equals(str11);
                    }
                    if (zEquals3) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z || (str9 == null && str10 == null)) {
            jMax = Math.max(System.currentTimeMillis(), c16702.f53955 + 1);
            long j2 = c16702.f53955;
            if (j2 > 0) {
                str2 = str + ":g" + j2;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        String str15 = str2;
        C7622 c7622 = new C7622();
        if (str9 == null) {
            c7622.m20822("custom_mt.video.etag");
        } else {
            c7622.m20823("custom_mt.video.etag", str9);
        }
        if (str10 == null) {
            c7622.m20822("custom_mt.video.last_modified");
        } else {
            c7622.m20823("custom_mt.video.last_modified", str10);
        }
        c7622.m20821(j, "custom_mt.video.length");
        c7622.m20821(jMax, "custom_mt.video.generation");
        if (str11 == null) {
            c7622.m20822("custom_mt.video.final_uri_digest");
        } else {
            c7622.m20823("custom_mt.video.final_uri_digest", str11);
        }
        c8367.mo22520(str, c7622);
        return new C15956(str + ":g" + jMax, j, c17448M40947.f56749, str15);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17448 m52614(InterfaceC15670 interfaceC15670, Uri uri, C16702 c16702, boolean z, boolean z2, C11481 c11481) {
        long jM16421;
        Boolean bool;
        InterfaceC13433 interfaceC13433Mo3996 = interfaceC15670.mo3996();
        C11941 c11941 = new C11941();
        c11941.m29911(uri);
        if (z2) {
            c11941.m29917(0L);
            c11941.m29910(1L);
        } else {
            c11941.m29916(3);
        }
        if (z && c16702 != null) {
            HashMap map = new HashMap();
            String str = c16702.f53954;
            if (str != null) {
                map.put("If-None-Match", str);
            }
            String str2 = c16702.f53958;
            if (str2 != null) {
                map.put("If-Modified-Since", str2);
            }
            c11941.m29913(map);
        }
        try {
            m52616(c11481, interfaceC13433Mo3996);
            long jMo8326 = interfaceC13433Mo3996.mo8326(c11941.m29908());
            Map mapMo10893 = interfaceC13433Mo3996.mo10893();
            Uri uriMo8327 = interfaceC13433Mo3996.mo8327();
            int iMo18764 = interfaceC13433Mo3996 instanceof InterfaceC10449 ? ((InterfaceC10449) interfaceC13433Mo3996).mo18764() : -1;
            if (z2) {
                if (iMo18764 == 206) {
                    jM16421 = C5516.m16421(m52618("Content-Range", mapMo10893));
                    if (jM16421 == -1) {
                        throw new IOException("Invalid HTTP range probe response");
                    }
                    bool = Boolean.TRUE;
                } else if (iMo18764 == 200) {
                    String strM52618 = m52618("Content-Length", mapMo10893);
                    if (strM52618 != null) {
                        try {
                            jM16421 = Long.parseLong(strM52618);
                            if (jM16421 < 0) {
                                if (jMo8326 < 0) {
                                    jMo8326 = -1;
                                }
                                jM16421 = jMo8326;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        if (jMo8326 < 0) {
                            jMo8326 = -1;
                        }
                        jM16421 = jMo8326;
                    }
                    bool = Boolean.FALSE;
                } else {
                    throw new IOException("Unexpected HTTP range probe status: " + iMo18764);
                }
            } else {
                if (iMo18764 < 200 || iMo18764 >= 300) {
                    throw new IOException("Unexpected HTTP validation status: " + iMo18764);
                }
                String strM52619 = m52618("Content-Length", mapMo10893);
                if (strM52619 != null) {
                    try {
                        jM16421 = Long.parseLong(strM52619);
                        if (jM16421 < 0) {
                            if (jMo8326 < 0) {
                                jMo8326 = -1;
                            }
                            jM16421 = jMo8326;
                        }
                    } catch (NumberFormatException unused2) {
                    }
                } else {
                    if (jMo8326 < 0) {
                        jMo8326 = -1;
                    }
                    jM16421 = jMo8326;
                }
                bool = null;
            }
            long j = jM16421;
            Boolean bool2 = bool;
            String strM526110 = m52618("ETag", mapMo10893);
            String strM526111 = m52618("Last-Modified", mapMo10893);
            if (uriMo8327 == null) {
                uriMo8327 = uri;
            }
            C17448 c17448 = new C17448(false, strM526110, strM526111, j, m52617(uriMo8327), bool2);
            try {
                interfaceC13433Mo3996.close();
                return c17448;
            } finally {
                m52619(c11481, interfaceC13433Mo3996);
            }
        } catch (Throwable th) {
            try {
                interfaceC13433Mo3996.close();
                throw th;
            } finally {
                m52619(c11481, interfaceC13433Mo3996);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52616(C11481 c11481, InterfaceC13433 interfaceC13433) {
        synchronized (f75798) {
            if (!c11481.f36118 || c11481.f36113 + c11481.f36114 == 0) {
                throw new InterruptedIOException("HTTP validation was canceled");
            }
            c11481.f36117 = interfaceC13433;
            c11481.f36115 = Thread.currentThread();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m52619(C11481 c11481, InterfaceC13433 interfaceC13433) {
        synchronized (f75798) {
            if (c11481.f36117 == interfaceC13433) {
                c11481.f36117 = null;
                c11481.f36115 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m52618(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && ((String) entry.getKey()).equalsIgnoreCase(str) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m52617(Uri uri) {
        MessageDigest messageDigestM36179 = C15022.m36179();
        messageDigestM36179.update(uri.buildUpon().fragment(null).build().toString().getBytes(StandardCharsets.UTF_8));
        return C15022.m36182(messageDigestM36179.digest());
    }
}
