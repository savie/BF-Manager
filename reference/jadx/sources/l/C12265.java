package l;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۫۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B74J */
/* JADX INFO: loaded from: classes3.dex */
public final class C12265 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Object f41023 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f41022 = new HashMap();

    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15793 m30484(C1263 c1263, Uri uri, InterfaceC20723 interfaceC20723, C15231 c15231) {
        C16498 c16498M30485;
        String str;
        C15327 c15327M4584 = c1263.m4584();
        if (c15327M4584 == null) {
            return C15793.m37556();
        }
        String strM11619 = C4085.m11619(uri, interfaceC20723);
        synchronized (f41023) {
            C20731 c20731 = (C20731) C9735.computeIfAbsent(f41022, strM11619, new C7325());
            C15793 c15793 = new C15793(c20731, 0);
            c20731.f67469++;
            if (c15231 != null) {
                C21580.m48292(c15231.f49659, c15793);
            }
            while (c20731.f67475 && !c15793.f51140) {
                try {
                    f41023.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    c15793.m37552();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP validation");
                }
            }
            if (c15793.f51140) {
                return C15793.m37556();
            }
            if (c1263.m4586().equals(c20731.f67471) && (str = c20731.f67474) != null) {
                C15793.m37553(c15793, str, c20731.f67472, c20731.f67468);
                return c15793;
            }
            c20731.f67475 = true;
            C16498 c16498 = null;
            try {
                c16498M30485 = m30485(c15327M4584, strM11619, uri, interfaceC20723, c20731);
            } catch (IOException | RuntimeException unused2) {
                c16498M30485 = null;
            }
            synchronized (f41023) {
                if (c16498M30485 == null) {
                    c16498 = c16498M30485;
                } else if (c16498M30485.f53005 != null) {
                    while (c20731.f67470 > 0) {
                        try {
                            f41023.wait();
                        } catch (InterruptedException unused3) {
                            Thread.currentThread().interrupt();
                            c20731.f67475 = false;
                            c15793.m37552();
                            f41023.notifyAll();
                            throw new InterruptedIOException("Interrupted while waiting to replace HTTP cache generation");
                        }
                    }
                    try {
                        c15327M4584.m36705(c16498M30485.f53005);
                        c16498 = c16498M30485;
                    } catch (RuntimeException unused4) {
                    }
                } else {
                    c16498 = c16498M30485;
                }
                c20731.f67475 = false;
                if (c16498 == null) {
                    c15793.m37552();
                    c1263.m4585();
                    f41023.notifyAll();
                    return C15793.m37556();
                }
                c20731.f67471 = c1263.m4586();
                c20731.f67474 = c16498.f53004;
                c20731.f67472 = c16498.f53006;
                c20731.f67468 = c16498.f53003;
                if (!c15793.f51140) {
                    C15793.m37553(c15793, c16498.f53004, c16498.f53006, c16498.f53003);
                }
                f41023.notifyAll();
                if (c15793.f51140) {
                    c15793 = C15793.m37556();
                }
                return c15793;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0171 A[PHI: r14
      0x0171: PHI (r14v7 long) = (r14v5 long), (r14v2 long), (r14v2 long) binds: [B:105:0x015c, B:101:0x0143, B:102:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16498 m30485(C15327 c15327, String str, Uri uri, InterfaceC20723 interfaceC20723, C20731 c20731) throws IOException {
        C0269 c0269M1771;
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
        C13210 c13210Mo36698 = c15327.mo36698(str);
        C20026 c20026 = new C20026();
        c20026.f64131 = -1L;
        c20026.f64130 = c13210Mo36698.m32699("custom_mt.video.etag");
        c20026.f64129 = c13210Mo36698.m32699("custom_mt.video.last_modified");
        c20026.f64131 = c13210Mo36698.m32695(-1L, "custom_mt.video.length");
        c20026.f64132 = c13210Mo36698.m32695(0L, "custom_mt.video.generation");
        c20026.f64133 = c13210Mo36698.m32699("custom_mt.video.final_uri_digest");
        try {
            c0269M1771 = m30483(interfaceC20723, uri, c20026, true, false, c20731);
        } catch (C1360 e) {
            if (e.f5709 == 304) {
                c0269M1771 = C0269.m1771(e);
            } else {
                try {
                    c0269M1771 = m30483(interfaceC20723, uri, c20026, true, true, c20731);
                } catch (C1360 e2) {
                    if (e2.f5709 == 304) {
                        c0269M1771 = C0269.m1771(e2);
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (c0269M1771.f1558 && (!c20026.m45355() || (((str3 = c0269M1771.f1557) != null && (str8 = c20026.f64130) != null && !str3.equals(str8)) || (((str4 = c0269M1771.f1559) != null && (str7 = c20026.f64129) != null && !str4.equals(str7)) || ((str5 = c0269M1771.f1560) != null && (str6 = c20026.f64133) != null && !str5.equals(str6)))))) {
            c0269M1771 = m30483(interfaceC20723, uri, null, false, false, c20731);
        }
        boolean z2 = c0269M1771.f1558;
        String str9 = c0269M1771.f1557;
        if (str9 == null) {
            str9 = z2 ? c20026.f64130 : null;
        }
        String str10 = c0269M1771.f1559;
        if (str10 == null) {
            str10 = z2 ? c20026.f64129 : null;
        }
        long j = c0269M1771.f1556;
        if (j == -1) {
            j = z2 ? c20026.f64131 : -1L;
        }
        String str11 = c0269M1771.f1560;
        if (str11 == null) {
            str11 = z2 ? c20026.f64133 : null;
        }
        long jMax = c20026.f64132;
        if (jMax <= 0 && str9 == null && str10 == null && j == -1) {
            throw new IOException("HTTP validation returned incomplete metadata");
        }
        if (c20026.m45355()) {
            String str12 = c20026.f64130;
            if (str12 == null) {
                zEquals = str9 == null;
            } else {
                zEquals = str12.equals(str9);
            }
            if (zEquals) {
                String str13 = c20026.f64129;
                if (str13 == null) {
                    zEquals2 = str10 == null;
                } else {
                    zEquals2 = str13.equals(str10);
                }
                if (zEquals2 && c20026.f64131 == j) {
                    String str14 = c20026.f64133;
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
            jMax = Math.max(System.currentTimeMillis(), c20026.f64132 + 1);
            long j2 = c20026.f64132;
            if (j2 > 0) {
                str2 = str + ":g" + j2;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        String str15 = str2;
        C1214 c1214 = new C1214();
        if (str9 == null) {
            c1214.m4409("custom_mt.video.etag");
        } else {
            c1214.m4410("custom_mt.video.etag", str9);
        }
        if (str10 == null) {
            c1214.m4409("custom_mt.video.last_modified");
        } else {
            c1214.m4410("custom_mt.video.last_modified", str10);
        }
        c1214.m4408(j, "custom_mt.video.length");
        c1214.m4408(jMax, "custom_mt.video.generation");
        if (str11 == null) {
            c1214.m4409("custom_mt.video.final_uri_digest");
        } else {
            c1214.m4410("custom_mt.video.final_uri_digest", str11);
        }
        c15327.mo36701(str, c1214);
        return new C16498(str + ":g" + jMax, j, c0269M1771.f1561, str15);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0269 m30483(InterfaceC20723 interfaceC20723, Uri uri, C20026 c20026, boolean z, boolean z2, C20731 c20731) {
        long jM25786;
        Boolean bool;
        InterfaceC15785 interfaceC15785Mo4000 = interfaceC20723.mo4000();
        C16490 c16490 = new C16490();
        c16490.m38756(uri);
        if (z2) {
            c16490.m38762(0L);
            c16490.m38755(1L);
        } else {
            c16490.m38761(3);
        }
        if (z && c20026 != null) {
            HashMap map = new HashMap();
            String str = c20026.f64130;
            if (str != null) {
                map.put("If-None-Match", str);
            }
            String str2 = c20026.f64129;
            if (str2 != null) {
                map.put("If-Modified-Since", str2);
            }
            c16490.m38758(map);
        }
        try {
            m30486(c20731, interfaceC15785Mo4000);
            long jMo9272 = interfaceC15785Mo4000.mo9272(c16490.m38753());
            Map mapMo9273 = interfaceC15785Mo4000.mo9273();
            Uri uriMo9274 = interfaceC15785Mo4000.mo9274();
            int iMo9271 = interfaceC15785Mo4000 instanceof InterfaceC4182 ? ((InterfaceC4182) interfaceC15785Mo4000).mo9271() : -1;
            if (z2) {
                if (iMo9271 == 206) {
                    jM25786 = C10148.m25786(m30488("Content-Range", mapMo9273));
                    if (jM25786 == -1) {
                        throw new IOException("Invalid HTTP range probe response");
                    }
                    bool = Boolean.TRUE;
                } else if (iMo9271 == 200) {
                    String strM30488 = m30488("Content-Length", mapMo9273);
                    if (strM30488 != null) {
                        try {
                            jM25786 = Long.parseLong(strM30488);
                            if (jM25786 < 0) {
                                if (jMo9272 < 0) {
                                    jMo9272 = -1;
                                }
                                jM25786 = jMo9272;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        if (jMo9272 < 0) {
                            jMo9272 = -1;
                        }
                        jM25786 = jMo9272;
                    }
                    bool = Boolean.FALSE;
                } else {
                    throw new IOException("Unexpected HTTP range probe status: " + iMo9271);
                }
            } else {
                if (iMo9271 < 200 || iMo9271 >= 300) {
                    throw new IOException("Unexpected HTTP validation status: " + iMo9271);
                }
                String strM30489 = m30488("Content-Length", mapMo9273);
                if (strM30489 != null) {
                    try {
                        jM25786 = Long.parseLong(strM30489);
                        if (jM25786 < 0) {
                            if (jMo9272 < 0) {
                                jMo9272 = -1;
                            }
                            jM25786 = jMo9272;
                        }
                    } catch (NumberFormatException unused2) {
                    }
                } else {
                    if (jMo9272 < 0) {
                        jMo9272 = -1;
                    }
                    jM25786 = jMo9272;
                }
                bool = null;
            }
            long j = jM25786;
            Boolean bool2 = bool;
            String strM304810 = m30488("ETag", mapMo9273);
            String strM304811 = m30488("Last-Modified", mapMo9273);
            if (uriMo9274 == null) {
                uriMo9274 = uri;
            }
            C0269 c0269 = new C0269(false, strM304810, strM304811, j, m30487(uriMo9274), bool2);
            try {
                interfaceC15785Mo4000.close();
                return c0269;
            } finally {
                m30489(c20731, interfaceC15785Mo4000);
            }
        } catch (Throwable th) {
            try {
                interfaceC15785Mo4000.close();
                throw th;
            } finally {
                m30489(c20731, interfaceC15785Mo4000);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30486(C20731 c20731, InterfaceC15785 interfaceC15785) {
        synchronized (f41023) {
            if (!c20731.f67475 || c20731.f67469 + c20731.f67470 == 0) {
                throw new InterruptedIOException("HTTP validation was canceled");
            }
            c20731.f67467 = interfaceC15785;
            c20731.f67473 = Thread.currentThread();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m30489(C20731 c20731, InterfaceC15785 interfaceC15785) {
        synchronized (f41023) {
            if (c20731.f67467 == interfaceC15785) {
                c20731.f67467 = null;
                c20731.f67473 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m30488(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && ((String) entry.getKey()).equalsIgnoreCase(str) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m30487(Uri uri) {
        MessageDigest messageDigestM49421 = C22253.m49421();
        messageDigestM49421.update(uri.buildUpon().fragment(null).build().toString().getBytes(StandardCharsets.UTF_8));
        return C22253.m49424(messageDigestM49421.digest());
    }
}
