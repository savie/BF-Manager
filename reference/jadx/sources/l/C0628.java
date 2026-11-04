package l;

import java.util.Comparator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.֡ᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4DT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0628 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C0628 f2450;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C0628 f2451;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C0628 f2452;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C0628 f2453;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C0628 f2454;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C0628 f2456;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C0628 f2457;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C0628 f2458;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C0628 f2459;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C0628 f2460;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C0628 f2461;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C0628 f2462;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C0628 f2463;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C0628 f2464;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C0628 f2466;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C0628 f2467;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C0628 f2468;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C0628 f2469;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f2470;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Comparator f2455 = new C18527();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f2465 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C0628 m2776(String str) {
        C0628 c0628;
        String str2;
        LinkedHashMap linkedHashMap = f2465;
        c0628 = (C0628) linkedHashMap.get(str);
        if (c0628 == null) {
            if (str.startsWith("TLS_")) {
                str2 = "SSL_" + str.substring(4);
            } else if (str.startsWith("SSL_")) {
                str2 = "TLS_" + str.substring(4);
            } else {
                str2 = str;
            }
            c0628 = (C0628) linkedHashMap.get(str2);
            if (c0628 == null) {
                c0628 = new C0628(str);
            }
            linkedHashMap.put(str, c0628);
        }
        return c0628;
    }

    static {
        m2777("SSL_RSA_WITH_NULL_MD5");
        m2777("SSL_RSA_WITH_NULL_SHA");
        m2777("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        m2777("SSL_RSA_WITH_RC4_128_MD5");
        m2777("SSL_RSA_WITH_RC4_128_SHA");
        m2777("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m2777("SSL_RSA_WITH_DES_CBC_SHA");
        f2464 = m2777("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        m2777("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        m2777("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        m2777("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        m2777("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m2777("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        m2777("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        m2777("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        m2777("SSL_DH_anon_WITH_RC4_128_MD5");
        m2777("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        m2777("SSL_DH_anon_WITH_DES_CBC_SHA");
        m2777("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        m2777("TLS_KRB5_WITH_DES_CBC_SHA");
        m2777("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        m2777("TLS_KRB5_WITH_RC4_128_SHA");
        m2777("TLS_KRB5_WITH_DES_CBC_MD5");
        m2777("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        m2777("TLS_KRB5_WITH_RC4_128_MD5");
        m2777("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        m2777("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        m2777("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        m2777("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f2457 = m2777("TLS_RSA_WITH_AES_128_CBC_SHA");
        m2777("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        m2777("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        m2777("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f2468 = m2777("TLS_RSA_WITH_AES_256_CBC_SHA");
        m2777("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        m2777("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        m2777("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        m2777("TLS_RSA_WITH_NULL_SHA256");
        m2777("TLS_RSA_WITH_AES_128_CBC_SHA256");
        m2777("TLS_RSA_WITH_AES_256_CBC_SHA256");
        m2777("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        m2777("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m2777("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        m2777("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m2777("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        m2777("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        m2777("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        m2777("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        m2777("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        m2777("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m2777("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        m2777("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m2777("TLS_PSK_WITH_RC4_128_SHA");
        m2777("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        m2777("TLS_PSK_WITH_AES_128_CBC_SHA");
        m2777("TLS_PSK_WITH_AES_256_CBC_SHA");
        m2777("TLS_RSA_WITH_SEED_CBC_SHA");
        f2454 = m2777("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f2452 = m2777("TLS_RSA_WITH_AES_256_GCM_SHA384");
        m2777("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        m2777("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        m2777("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        m2777("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        m2777("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        m2777("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        m2777("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        m2777("TLS_FALLBACK_SCSV");
        m2777("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        m2777("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        m2777("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m2777("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        m2777("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        m2777("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        m2777("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        m2777("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m2777("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        m2777("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        m2777("TLS_ECDH_RSA_WITH_NULL_SHA");
        m2777("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        m2777("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        m2777("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        m2777("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        m2777("TLS_ECDHE_RSA_WITH_NULL_SHA");
        m2777("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        m2777("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f2461 = m2777("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f2460 = m2777("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        m2777("TLS_ECDH_anon_WITH_NULL_SHA");
        m2777("TLS_ECDH_anon_WITH_RC4_128_SHA");
        m2777("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        m2777("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        m2777("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        m2777("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        m2777("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        m2777("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        m2777("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        m2777("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        m2777("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        m2777("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        m2777("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f2450 = m2777("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f2456 = m2777("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        m2777("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        m2777("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f2462 = m2777("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f2467 = m2777("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        m2777("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        m2777("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        m2777("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        m2777("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f2451 = m2777("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f2469 = m2777("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        m2777("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        m2777("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f2463 = m2777("TLS_AES_128_GCM_SHA256");
        f2458 = m2777("TLS_AES_256_GCM_SHA384");
        f2453 = m2777("TLS_CHACHA20_POLY1305_SHA256");
        f2466 = m2777("TLS_AES_128_CCM_SHA256");
        f2459 = m2777("TLS_AES_256_CCM_8_SHA256");
    }

    public C0628(String str) {
        str.getClass();
        this.f2470 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C0628 m2777(String str) {
        C0628 c0628 = new C0628(str);
        f2465.put(str, c0628);
        return c0628;
    }

    public final String toString() {
        return this.f2470;
    }
}
