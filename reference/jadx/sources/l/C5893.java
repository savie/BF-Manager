package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K6XC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5893 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7845 f20100;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17617 f20101;

    public C5893(C17617 c17617, C7845 c7845) {
        this.f20101 = c17617;
        this.f20100 = c7845;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C17182 m16130(C16477 c16477, String str, boolean z) throws C12731 {
        C16912 c16912M40990 = this.f20101.m40990(str, z, new C15772(this, c16477, new C13135(c16477.f52948, c16477.f52943, c16477.f52949)));
        c16477.f52939 = c16912M40990.f54088;
        c16477.f52947 = true;
        c16477.f52944 = true;
        c16477.f52941 = c16912M40990.f54087;
        JSONArray jSONArray = c16912M40990.f54089;
        c16477.f52950 = new JSONArray(jSONArray);
        c16477.f52946 = "local_publish";
        C22744 c22744 = (C22744) c16912M40990.f54084;
        c16477.f52940 = c22744.f74082;
        long j = c16912M40990.f54086;
        c16477.f52942 = j;
        if (c22744.f74079 != j) {
            throw m16125("Published local size does not match the workspace byte count.");
        }
        return new C17182(c16477.f52945, c22744.f74080, c22744.f74081, c22744.f74078, c16912M40990.f54088, new JSONArray(jSONArray), c16912M40990.f54086);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C22744 m16129(C5893 c5893, C16477 c16477, C13135 c13135, BufferedOutputStream bufferedOutputStream) {
        c16477.f52946 = "workspace_read";
        C12244 c12244 = new C12244(bufferedOutputStream);
        try {
            C22744 c22744M20718 = c5893.f20100.m20718(c13135, c12244);
            c16477.f52940 = c22744M20718.f74082;
            if (c22744M20718.f74079 != c12244.f40977) {
                throw m16125("Workspace entry byte count does not match bytes written.");
            }
            c16477.f52946 = "local_publish";
            C16477.m38743(c16477, c12244);
            return c22744M20718;
        } catch (Throwable th) {
            C16477.m38743(c16477, c12244);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17182 m16127(C16477 c16477, String str, boolean z) throws C12731 {
        C3961 c3961 = new C3961(c16477.f52948, c16477.f52943, c16477.f52949, z);
        c16477.f52946 = "local_read";
        C22744 c22744M40992 = this.f20101.m40992(str, new C20005(this, c16477, c3961));
        c16477.f52947 = true;
        c16477.f52944 = true;
        c16477.f52950 = JSON.array();
        c16477.f52940 = c22744M40992.f74082;
        long j = c22744M40992.f74079;
        c16477.f52942 = j;
        if (j < 0) {
            throw m16125("Workspace returned an invalid copied byte count.");
        }
        return new C17182(c16477.f52945, c22744M40992.f74080, c22744M40992.f74081, c22744M40992.f74078, c16477.f52939, JSON.array(), c22744M40992.f74079);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C22744 m16128(C5893 c5893, C16477 c16477, C3961 c3961, C16207 c16207) {
        c16477.f52939 = c16207.f52315;
        c16477.f52941 = "atomic";
        c16477.f52946 = "overlay_publish";
        return c5893.f20100.m20717(c3961, new C0248(c16207, c16477));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m16125(String str) {
        return C12731.m31631("WORKSPACE_ENTRY_SOURCE_INVALID", str, "fatal", null, JSON.object().add("backendReason", "byte_count_mismatch"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17182 m16131(String str, String str2, String str3, String str4, String str5, boolean z) throws C12731 {
        JSONValue jSONValue;
        if ("workspace_to_local".equals(str) || "local_to_edit_session".equals(str)) {
            if ("local_to_edit_session".equals(str) && (str3 == null || str3.isEmpty())) {
                throw C12731.m31626("local_to_edit_session requires a non-empty editSessionId", "editSessionId", str3 != null ? JSON.value(str3) : null, JSON.array(), JSON.object().add("editSessionId", "ab12cd34"));
            }
            C16477 c16477 = new C16477(str, str2, str3, str4);
            try {
                if ("workspace_to_local".equals(str)) {
                    return m16130(c16477, str5, z);
                }
                return m16127(c16477, str5, z);
            } catch (IOException e) {
                throw m16126(C12731.m31631("EDIT_SESSION_STORAGE_FAILED", "Failed to write the workspace ZIP entry.", "fatal", null, JSON.object().add("operation", "overlay_publish").add("backendReason", e.getClass().getSimpleName())), c16477);
            } catch (C12731 e2) {
                e = e2;
                if (e.f42473) {
                    throw e;
                }
                String str6 = e.f42472;
                if ("EDIT_SESSION_STORAGE_FAILED".equals(str6)) {
                    JSONObject jSONObjectObject = JSON.object();
                    for (JSONObject.Member member : e.f42468) {
                        jSONObjectObject.put(member.getName(), member.getValue());
                    }
                    jSONObjectObject.put("backendReason", "workspace_storage_failure");
                    e = C12731.m31631(str6, "Edit session storage failed.", e.f42475, e.f42471, jSONObjectObject);
                }
                String str7 = e.f42472;
                JSONObject jSONObject = e.f42468;
                JSONValue jSONValue2 = jSONObject.get("localPath");
                if (jSONValue2 != null && jSONValue2.isString()) {
                    c16477.f52939 = jSONValue2.asString();
                } else if (("FILE_ACCESS_DENIED".equals(str7) || "FILE_ACCESS_ROOT_PROTECTED".equals(str7)) && (jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH)) != null && jSONValue.isString()) {
                    c16477.f52939 = jSONObject.get(MotionUtils.EASING_TYPE_PATH).asString();
                }
                JSONValue jSONValue3 = jSONObject.get("changed");
                if (jSONValue3 != null && jSONValue3.isBoolean()) {
                    c16477.f52947 = jSONValue3.asBoolean();
                }
                JSONValue jSONValue4 = jSONObject.get("stateKnown");
                if (jSONValue4 != null && jSONValue4.isBoolean()) {
                    c16477.f52944 = jSONValue4.asBoolean();
                }
                JSONValue jSONValue5 = jSONObject.get("operationMode");
                if (jSONValue5 != null && jSONValue5.isString()) {
                    c16477.f52941 = jSONValue5.asString();
                }
                JSONValue jSONValue6 = jSONObject.get("warnings");
                if (jSONValue6 != null && jSONValue6.isArray()) {
                    c16477.f52950 = new JSONArray(jSONValue6.asArray());
                }
                JSONValue jSONValue7 = jSONObject.get("bytesCopied");
                if (jSONValue7 != null) {
                    c16477.f52942 = jSONValue7.isNumber() ? jSONValue7.asLong() : -1L;
                }
                JSONValue jSONValue8 = jSONObject.get("editRevision");
                if (jSONValue8 != null && jSONValue8.isNumber()) {
                    c16477.f52940 = Integer.valueOf(jSONValue8.asInt());
                }
                if ("EDIT_SESSION_STORAGE_FAILED".equals(str7)) {
                    c16477.f52942 = -1L;
                }
                throw m16126(e, c16477);
            }
        }
        throw C12731.m31626("Invalid direction", "direction", str != null ? JSON.value(str) : null, JSON.array("workspace_to_local", "local_to_edit_session"), JSON.object().add("direction", "workspace_to_local"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m16126(C12731 c12731, C16477 c16477) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject<JSONObject.Member> jSONObject = c12731.f42468;
        JSONArray jSONArray = c12731.f42471;
        String str = c12731.f42475;
        String str2 = c12731.f42472;
        for (JSONObject.Member member : jSONObject) {
            jSONObjectObject.put(member.getName(), member.getValue());
        }
        JSONObject jSONObjectPut = jSONObjectObject.put("direction", c16477.f52945).put("workspaceId", c16477.f52948);
        String str3 = c16477.f52943;
        jSONObjectPut.put("editSessionId", str3 == null ? JSON.NULL : JSON.value(str3)).put("entryName", c16477.f52949).put("locator", C17638.m41044("zip_entry", c16477.f52949, (String) null, (String) null, (String) null, (String) null));
        String str4 = c16477.f52939;
        if (str4 != null) {
            jSONObjectObject.put("localPath", str4);
        }
        JSONValue jSONValue = jSONObjectObject.get("operation");
        if (jSONValue == null || !jSONValue.isString()) {
            String str5 = c16477.f52946;
            jSONObjectObject.put("operation", str5 == null ? JSON.NULL : JSON.value(str5));
        }
        JSONValue jSONValue2 = jSONObjectObject.get("backendReason");
        if (jSONValue2 == null || !jSONValue2.isString()) {
            jSONObjectObject.put("backendReason", JSON.NULL);
        }
        JSONObject jSONObjectPut2 = jSONObjectObject.put("changed", c16477.f52947);
        String str6 = c16477.f52941;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("operationMode", str6 == null ? JSON.NULL : JSON.value(str6)).put("stateKnown", c16477.f52944).put("warnings", new JSONArray(c16477.f52950));
        long j = c16477.f52942;
        JSONObject jSONObjectPut4 = jSONObjectPut3.put("bytesCopied", j < 0 ? JSON.NULL : JSON.value(j));
        Integer num = c16477.f52940;
        jSONObjectPut4.put("editRevision", num == null ? JSON.NULL : JSON.value(num.intValue())).put("safeToRetry", c16477.f52944 && !c16477.f52947);
        if (c12731.f42469) {
            return C12731.m31627(str2, c12731.getMessage(), str, jSONArray, jSONObjectObject);
        }
        return C12731.m31631(str2, c12731.getMessage(), str, jSONArray, jSONObjectObject);
    }
}
