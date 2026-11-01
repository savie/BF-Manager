package l;

import android.util.Base64;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۜ᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: F6Y2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7076 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18947(String str, boolean z, int i, String str2, C4253 c4253, String str3) {
        JSONObject jSONObjectAdd = JSON.object().add("version", str3.isEmpty() ? "mcp-file-list-v2" : "mcp-file-search-v1").add("directoryPath", str).add("recursive", z).add("limit", i).add("order", "normalized-name-asc-depth-first-v1").add("policyRevision", str2).add("lastPath", c4253.f15365).add("traversalId", c4253.f15366);
        if (!str3.isEmpty()) {
            jSONObjectAdd.add("queryKey", str3);
        }
        byte[] bytes = jSONObjectAdd.toString().getBytes(StandardCharsets.UTF_8);
        return Base64.encodeToString(bytes, 11) + "." + Base64.encodeToString(C22253.m49421().digest(bytes), 11);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4253 m18948(String str, String str2, boolean z, int i, String str3, String str4) {
        if (str.isEmpty()) {
            return new C4253("", UUID.randomUUID().toString());
        }
        if (str.length() > 65536) {
            throw m18949(str2, str3);
        }
        try {
            int iIndexOf = str.indexOf(46);
            if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(46) || iIndexOf == str.length() - 1) {
                throw m18949(str2, str3);
            }
            byte[] bArrDecode = Base64.decode(str.substring(0, iIndexOf), 11);
            if (!MessageDigest.isEqual(C22253.m49421().digest(bArrDecode), Base64.decode(str.substring(iIndexOf + 1), 11))) {
                throw m18949(str2, str3);
            }
            JSONObject jSONObjectAsObject = JSON.parse(new String(bArrDecode, StandardCharsets.UTF_8)).asObject();
            m18950(jSONObjectAsObject, str2, str3, !str4.isEmpty());
            if ((str4.isEmpty() ? "mcp-file-list-v2" : "mcp-file-search-v1").equals(m18946(jSONObjectAsObject, "version")) && ((str4.isEmpty() || str4.equals(m18946(jSONObjectAsObject, "queryKey"))) && str2.equals(m18946(jSONObjectAsObject, "directoryPath")))) {
                JSONValue jSONValue = jSONObjectAsObject.get("recursive");
                if (jSONValue == null || !jSONValue.isBoolean()) {
                    throw new IllegalArgumentException("Invalid cursor boolean field");
                }
                if (z == jSONValue.asBoolean()) {
                    JSONValue jSONValue2 = jSONObjectAsObject.get("limit");
                    if (jSONValue2 == null || !jSONValue2.isNumber()) {
                        throw new IllegalArgumentException("Invalid cursor integer field");
                    }
                    if (i == jSONValue2.asInt() && "normalized-name-asc-depth-first-v1".equals(m18946(jSONObjectAsObject, "order")) && str3.equals(m18946(jSONObjectAsObject, "policyRevision"))) {
                        String strM18946 = m18946(jSONObjectAsObject, "lastPath");
                        String strM18947 = m18946(jSONObjectAsObject, "traversalId");
                        if (strM18946.isEmpty() || strM18947.isEmpty()) {
                            throw m18949(str2, str3);
                        }
                        for (String str5 : strM18946.split("/", -1)) {
                            if (str5.isEmpty() || str5.equals(".") || str5.equals("..")) {
                                throw m18949(str2, str3);
                            }
                        }
                        if (!z && strM18946.indexOf(47) >= 0) {
                            throw m18949(str2, str3);
                        }
                        return new C4253(strM18946, strM18947);
                    }
                }
            }
            throw m18949(str2, str3);
        } catch (RuntimeException unused) {
            throw m18949(str2, str3);
        } catch (C12731 e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18950(JSONObject jSONObject, String str, String str2, boolean z) throws C12731 {
        Object[] objArr = {"version", "directoryPath", "recursive", "limit", "order", "policyRevision", "lastPath", "traversalId"};
        HashSet hashSet = new HashSet(8);
        for (int i = 0; i < 8; i++) {
            Object obj = objArr[i];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C0561.unmodifiableSet(hashSet));
        if (z) {
            linkedHashSet.add("queryKey");
        }
        HashSet hashSet2 = new HashSet();
        for (String str3 : jSONObject.names()) {
            if (!linkedHashSet.contains(str3) || !hashSet2.add(str3)) {
                throw m18949(str, str2);
            }
        }
        if (!hashSet2.equals(linkedHashSet)) {
            throw m18949(str, str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18946(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw new IllegalArgumentException("Invalid cursor string field");
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m18949(String str, String str2) {
        JSONObject jSONObjectAdd = JSON.object().add("operation", "list_cursor");
        if (str != null) {
            jSONObjectAdd.add(MotionUtils.EASING_TYPE_PATH, str);
        }
        if (str2 != null) {
            jSONObjectAdd.add("policyRevision", str2);
        }
        return C12731.m31627("FILE_INVALID_CURSOR", "The file cursor is invalid or no longer matches this request. Restart the traversal with cursor=\"\".", "warning", (JSONArray) null, jSONObjectAdd);
    }
}
