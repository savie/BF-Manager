package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.umeng.analytics.pro.d;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۤ᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: F6WD */
/* JADX INFO: loaded from: classes3.dex */
public final class C10584 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m26760(C7263 c7263, boolean z) {
        JSONObject jSONObjectAdd;
        JSONArray jSONArrayArray = JSON.array();
        for (C10086 c10086 : c7263.f24177) {
            if (!z) {
                jSONObjectAdd = JSON.object().add("schemes", C10413.m26314(c10086.f34428)).add("sha256", c10086.f34435);
            } else {
                jSONObjectAdd = JSON.object().add("schemes", C10413.m26314(c10086.f34428)).add("sizeBytes", c10086.f34437).add("hashCode", c10086.f34427).add("md5", c10086.f34438).add("sha1", c10086.f34439).add("sha256", c10086.f34435).add("crc32", c10086.f34432).add("certificateSignatureAlgorithm", c10086.f34429).add("certificateSignatureAlgorithmOid", c10086.f34434).add("subject", c10086.f34436).add("issuer", c10086.f34430).add("serialNumberHex", c10086.f34431).add("notBeforeEpochMillis", c10086.f34433).add("notAfterEpochMillis", c10086.f34426);
            }
            jSONArrayArray.add(jSONObjectAdd);
        }
        return JSON.object().add("available", c7263.f24174).add("signaturePresent", c7263.f24178).add("schemes", C10413.m26314(c7263.f24175)).add("hasDifferentCertificates", c7263.f24173).add("certificates", jSONArrayArray).add(d.O, c7263.f24176);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m26761(boolean z) {
        return C4969.m13777(JSON.object().add("available", C4969.m13786(ClassTransform.BOOLEAN, "Whether signing certificate metadata is available.")).add("signaturePresent", C4969.m13786(ClassTransform.BOOLEAN, "When available=true, whether any APK signature scheme certificate was found.")).add("schemes", C4969.m13788("When available=true, APK signature schemes found in fixed order: V1, V2, V3, V3.1.")).add("hasDifferentCertificates", C4969.m13786(ClassTransform.BOOLEAN, "When available=true, whether multiple schemes use different certificate DER bytes.")).add("certificates", !z ? C3184.m9603("type", "array", "description", "When available=true, unique certificate summaries; no DER or Base64 data is returned.").add("items", C18828.m43457(JSON.object().add("schemes", C4969.m13788("Schemes using this certificate.")), "string", "Lowercase certificate DER SHA-256 hex without colons or 0x prefix; not an APK file digest.", "sha256", "One signing certificate summary.")) : C3184.m9603("type", "array", "description", "When available=true, unique X.509 certificate summaries grouped by identical DER bytes; no DER or Base64 data is returned.").add("items", C18828.m43457(JSON.object().add("schemes", C4969.m13788("Schemes that use this certificate, in fixed order: V1, V2, V3, V3.1.")).add("sizeBytes", C4969.m13786("integer", "Certificate DER size in bytes.")).add("hashCode", C4969.m13786("integer", "Java Arrays.hashCode value over certificate DER bytes.")).add("md5", C4969.m13786("string", "Lowercase certificate DER MD5 hex without colons or 0x prefix.")).add("sha1", C4969.m13786("string", "Lowercase certificate DER SHA-1 hex without colons or 0x prefix.")).add("sha256", C4969.m13786("string", "Lowercase certificate DER SHA-256 hex without colons or 0x prefix.")).add("crc32", C4969.m13786("string", "Lowercase certificate DER CRC32 hex without colons or 0x prefix.")).add("certificateSignatureAlgorithm", C4969.m13786("string", "X.509 certificate signature algorithm name; not the APK v2/v3 signer algorithm.")).add("certificateSignatureAlgorithmOid", C4969.m13786("string", "X.509 certificate signature algorithm OID; not the APK v2/v3 signer algorithm.")).add("subject", C4969.m13786("string", "Certificate subject formatted with X500Principal RFC2253.")).add("issuer", C4969.m13786("string", "Certificate issuer formatted with X500Principal RFC2253.")).add("serialNumberHex", C4969.m13786("string", "Lowercase certificate serial number hex without 0x prefix.")).add("notBeforeEpochMillis", C4969.m13786("integer", "Certificate notBefore time in epoch milliseconds.")), "integer", "Certificate notAfter time in epoch milliseconds.", "notAfterEpochMillis", "One unique signing certificate summary."))).add(d.O, C4969.m13789("string", "Why signing certificate metadata is unavailable when available=false, or null.")), "APK signing certificate summary. This is certificate metadata only and does not verify installability or signature validity.".concat(z ? "" : " Use mt_apk_read_signature for full certificate attributes."));
    }
}
