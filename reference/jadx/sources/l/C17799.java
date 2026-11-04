package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.umeng.analytics.pro.d;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܽ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6WD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17799 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41654(C22518 c22518, boolean z) {
        JSONObject jSONObjectAdd;
        JSONArray jSONArrayArray = JSON.array();
        for (C10583 c10583 : c22518.f72847) {
            if (!z) {
                jSONObjectAdd = JSON.object().add("schemes", C12556.m31235(c10583.f33603)).add("sha256", c10583.f33611);
            } else {
                jSONObjectAdd = JSON.object().add("schemes", C12556.m31235(c10583.f33603)).add("sizeBytes", c10583.f33612).add("hashCode", c10583.f33615).add("md5", c10583.f33609).add("sha1", c10583.f33616).add("sha256", c10583.f33611).add("crc32", c10583.f33606).add("certificateSignatureAlgorithm", c10583.f33604).add("certificateSignatureAlgorithmOid", c10583.f33614).add("subject", c10583.f33610).add("issuer", c10583.f33613).add("serialNumberHex", c10583.f33607).add("notBeforeEpochMillis", c10583.f33605).add("notAfterEpochMillis", c10583.f33608);
            }
            jSONArrayArray.add(jSONObjectAdd);
        }
        return JSON.object().add("available", c22518.f72843).add("signaturePresent", c22518.f72845).add("schemes", C12556.m31235(c22518.f72846)).add("hasDifferentCertificates", c22518.f72848).add("certificates", jSONArrayArray).add(d.O, c22518.f72844);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41655(boolean z) {
        return C10932.m27731(JSON.object().add("available", C10932.m27740(ClassTransform.BOOLEAN, "Whether signing certificate metadata is available.")).add("signaturePresent", C10932.m27740(ClassTransform.BOOLEAN, "When available=true, whether any APK signature scheme certificate was found.")).add("schemes", C10932.m27742("When available=true, APK signature schemes found in fixed order: V1, V2, V3, V3.1.")).add("hasDifferentCertificates", C10932.m27740(ClassTransform.BOOLEAN, "When available=true, whether multiple schemes use different certificate DER bytes.")).add("certificates", !z ? C22121.m50076("type", "array", "description", "When available=true, unique certificate summaries; no DER or Base64 data is returned.").add("items", C22783.m51386(JSON.object().add("schemes", C10932.m27742("Schemes using this certificate.")), "string", "Lowercase certificate DER SHA-256 hex without colons or 0x prefix; not an APK file digest.", "sha256", "One signing certificate summary.")) : C22121.m50076("type", "array", "description", "When available=true, unique X.509 certificate summaries grouped by identical DER bytes; no DER or Base64 data is returned.").add("items", C22783.m51386(JSON.object().add("schemes", C10932.m27742("Schemes that use this certificate, in fixed order: V1, V2, V3, V3.1.")).add("sizeBytes", C10932.m27740("integer", "Certificate DER size in bytes.")).add("hashCode", C10932.m27740("integer", "Java Arrays.hashCode value over certificate DER bytes.")).add("md5", C10932.m27740("string", "Lowercase certificate DER MD5 hex without colons or 0x prefix.")).add("sha1", C10932.m27740("string", "Lowercase certificate DER SHA-1 hex without colons or 0x prefix.")).add("sha256", C10932.m27740("string", "Lowercase certificate DER SHA-256 hex without colons or 0x prefix.")).add("crc32", C10932.m27740("string", "Lowercase certificate DER CRC32 hex without colons or 0x prefix.")).add("certificateSignatureAlgorithm", C10932.m27740("string", "X.509 certificate signature algorithm name; not the APK v2/v3 signer algorithm.")).add("certificateSignatureAlgorithmOid", C10932.m27740("string", "X.509 certificate signature algorithm OID; not the APK v2/v3 signer algorithm.")).add("subject", C10932.m27740("string", "Certificate subject formatted with X500Principal RFC2253.")).add("issuer", C10932.m27740("string", "Certificate issuer formatted with X500Principal RFC2253.")).add("serialNumberHex", C10932.m27740("string", "Lowercase certificate serial number hex without 0x prefix.")).add("notBeforeEpochMillis", C10932.m27740("integer", "Certificate notBefore time in epoch milliseconds.")), "integer", "Certificate notAfter time in epoch milliseconds.", "notAfterEpochMillis", "One unique signing certificate summary."))).add(d.O, C10932.m27743("string", "Why signing certificate metadata is unavailable when available=false, or null.")), "APK signing certificate summary. This is certificate metadata only and does not verify installability or signature validity.".concat(z ? "" : " Use mt_apk_read_signature for full certificate attributes."));
    }
}
