package l;

import java.util.Comparator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۘۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R4DT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3854 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C3854 f14387;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C3854 f14388;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C3854 f14389;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C3854 f14390;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C3854 f14391;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C3854 f14392;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C3854 f14393;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C3854 f14394;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C3854 f14395;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C3854 f14397;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C3854 f14399;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C3854 f14400;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C3854 f14401;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C3854 f14402;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C3854 f14403;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C3854 f14404;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C3854 f14405;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C3854 f14406;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f14407;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Comparator f14396 = new C13028();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f14398 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C3854 m11175(String str) {
        C3854 c3854;
        String str2;
        LinkedHashMap linkedHashMap = f14398;
        c3854 = (C3854) linkedHashMap.get(str);
        if (c3854 == null) {
            if (str.startsWith("TLS_")) {
                str2 = "SSL_" + str.substring(4);
            } else if (str.startsWith("SSL_")) {
                str2 = "TLS_" + str.substring(4);
            } else {
                str2 = str;
            }
            c3854 = (C3854) linkedHashMap.get(str2);
            if (c3854 == null) {
                c3854 = new C3854(str);
            }
            linkedHashMap.put(str, c3854);
        }
        return c3854;
    }

    static {
        m11176("SSL_RSA_WITH_NULL_MD5");
        m11176("SSL_RSA_WITH_NULL_SHA");
        m11176("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        m11176("SSL_RSA_WITH_RC4_128_MD5");
        m11176("SSL_RSA_WITH_RC4_128_SHA");
        m11176("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m11176("SSL_RSA_WITH_DES_CBC_SHA");
        f14402 = m11176("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        m11176("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        m11176("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        m11176("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        m11176("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m11176("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        m11176("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        m11176("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        m11176("SSL_DH_anon_WITH_RC4_128_MD5");
        m11176("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        m11176("SSL_DH_anon_WITH_DES_CBC_SHA");
        m11176("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        m11176("TLS_KRB5_WITH_DES_CBC_SHA");
        m11176("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        m11176("TLS_KRB5_WITH_RC4_128_SHA");
        m11176("TLS_KRB5_WITH_DES_CBC_MD5");
        m11176("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        m11176("TLS_KRB5_WITH_RC4_128_MD5");
        m11176("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        m11176("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        m11176("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        m11176("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f14394 = m11176("TLS_RSA_WITH_AES_128_CBC_SHA");
        m11176("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        m11176("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        m11176("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f14392 = m11176("TLS_RSA_WITH_AES_256_CBC_SHA");
        m11176("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        m11176("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        m11176("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        m11176("TLS_RSA_WITH_NULL_SHA256");
        m11176("TLS_RSA_WITH_AES_128_CBC_SHA256");
        m11176("TLS_RSA_WITH_AES_256_CBC_SHA256");
        m11176("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        m11176("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m11176("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        m11176("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m11176("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        m11176("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        m11176("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        m11176("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        m11176("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        m11176("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m11176("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        m11176("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m11176("TLS_PSK_WITH_RC4_128_SHA");
        m11176("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        m11176("TLS_PSK_WITH_AES_128_CBC_SHA");
        m11176("TLS_PSK_WITH_AES_256_CBC_SHA");
        m11176("TLS_RSA_WITH_SEED_CBC_SHA");
        f14395 = m11176("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f14403 = m11176("TLS_RSA_WITH_AES_256_GCM_SHA384");
        m11176("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        m11176("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        m11176("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        m11176("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        m11176("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        m11176("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        m11176("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        m11176("TLS_FALLBACK_SCSV");
        m11176("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        m11176("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        m11176("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m11176("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        m11176("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        m11176("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        m11176("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        m11176("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m11176("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        m11176("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        m11176("TLS_ECDH_RSA_WITH_NULL_SHA");
        m11176("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        m11176("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        m11176("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        m11176("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        m11176("TLS_ECDHE_RSA_WITH_NULL_SHA");
        m11176("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        m11176("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f14399 = m11176("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f14400 = m11176("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        m11176("TLS_ECDH_anon_WITH_NULL_SHA");
        m11176("TLS_ECDH_anon_WITH_RC4_128_SHA");
        m11176("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        m11176("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        m11176("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        m11176("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        m11176("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        m11176("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        m11176("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        m11176("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        m11176("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        m11176("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        m11176("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f14389 = m11176("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f14391 = m11176("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        m11176("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        m11176("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f14404 = m11176("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f14401 = m11176("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        m11176("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        m11176("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        m11176("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        m11176("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f14393 = m11176("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f14406 = m11176("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        m11176("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        m11176("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f14390 = m11176("TLS_AES_128_GCM_SHA256");
        f14387 = m11176("TLS_AES_256_GCM_SHA384");
        f14397 = m11176("TLS_CHACHA20_POLY1305_SHA256");
        f14388 = m11176("TLS_AES_128_CCM_SHA256");
        f14405 = m11176("TLS_AES_256_CCM_8_SHA256");
    }

    public C3854(String str) {
        str.getClass();
        this.f14407 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C3854 m11176(String str) {
        C3854 c3854 = new C3854(str);
        f14398.put(str, c3854);
        return c3854;
    }

    public final String toString() {
        return this.f14407;
    }
}
