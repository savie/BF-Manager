package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6XC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18064 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1897 f59137;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0580 f59138;

    public C18064(C0580 c0580, C1897 c1897) {
        C17359.requireNonNull(c0580, "writeService");
        this.f59138 = c0580;
        C17359.requireNonNull(c1897, "workspaceManager");
        this.f59137 = c1897;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C21048 m42098(final C3894 c3894, String str, boolean z) throws C10186 {
        final C22606 c22606 = new C22606(c3894.f13275, c3894.f13276, c3894.f13274);
        C21463 c21463M2663 = this.f59138.m2663(str, z, new InterfaceC24447() { // from class: l.ۨۘۚ
            @Override // l.InterfaceC24447
            /* JADX INFO: renamed from: ۙ */
            public final Object mo15357(BufferedOutputStream bufferedOutputStream) {
                return C18064.m42093(this.f38943, c3894, c22606, bufferedOutputStream);
            }

            @Override // l.InterfaceC24447
            /* JADX INFO: renamed from: ۙ */
            public final /* synthetic */ void mo15358() {
            }
        });
        c3894.f13273 = c21463M2663.f68564;
        c3894.f13277 = true;
        c3894.f13272 = true;
        c3894.f13268 = c21463M2663.f68561;
        JSONArray jSONArray = c21463M2663.f68562;
        c3894.f13279 = new JSONArray(jSONArray);
        c3894.f13270 = "local_publish";
        C5977 c5977 = (C5977) c21463M2663.f68565;
        c3894.f13278 = c5977.f20477;
        long j = c21463M2663.f68563;
        c3894.f13269 = j;
        if (c5977.f20474 != j) {
            throw m42095("Published local size does not match the workspace byte count.");
        }
        return new C21048(c3894.f13271, c5977.f20476, c5977.f20475, c5977.f20478, c21463M2663.f68564, new JSONArray(jSONArray), c21463M2663.f68563);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C5977 m42093(C18064 c18064, C3894 c3894, C22606 c22606, BufferedOutputStream bufferedOutputStream) {
        c3894.f13270 = "workspace_read";
        C14334 c14334 = new C14334(bufferedOutputStream);
        try {
            C5977 c5977M6540 = c18064.f59137.m6540(c22606, c14334);
            c3894.f13278 = c5977M6540.f20477;
            if (c5977M6540.f20474 != c14334.f45212) {
                throw m42095("Workspace entry byte count does not match bytes written.");
            }
            c3894.f13270 = "local_publish";
            C3894.m12537(c3894, c14334);
            return c5977M6540;
        } catch (Throwable th) {
            C3894.m12537(c3894, c14334);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21048 m42097(C3894 c3894, String str, boolean z) throws C10186 {
        C19622 c19622 = new C19622(c3894.f13275, c3894.f13276, c3894.f13274, z);
        c3894.f13270 = "local_read";
        C5977 c5977M2660 = this.f59138.m2660(str, new C6132(this, c3894, c19622));
        c3894.f13277 = true;
        c3894.f13272 = true;
        c3894.f13279 = JSON.array();
        c3894.f13278 = c5977M2660.f20477;
        long j = c5977M2660.f20474;
        c3894.f13269 = j;
        if (j < 0) {
            throw m42095("Workspace returned an invalid copied byte count.");
        }
        return new C21048(c3894.f13271, c5977M2660.f20476, c5977M2660.f20475, c5977M2660.f20478, c3894.f13273, JSON.array(), c5977M2660.f20474);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C5977 m42092(C18064 c18064, C3894 c3894, C19622 c19622, C6547 c6547) {
        c3894.f13273 = c6547.f21987;
        c3894.f13268 = "atomic";
        c3894.f13270 = "overlay_publish";
        return c18064.f59137.m6539(c19622, new C24032(c6547, c3894));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42095(String str) {
        return C10186.m26306("WORKSPACE_ENTRY_SOURCE_INVALID", str, "fatal", null, JSON.object().add("backendReason", "byte_count_mismatch"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21048 m42099(String str, String str2, String str3, String str4, String str5, boolean z) throws C10186 {
        JSONValue jSONValue;
        if ("workspace_to_local".equals(str) || "local_to_edit_session".equals(str)) {
            if ("local_to_edit_session".equals(str) && (str3 == null || str3.isEmpty())) {
                throw C10186.m26301("local_to_edit_session requires a non-empty editSessionId", "editSessionId", str3 != null ? JSON.value(str3) : null, JSON.array(), JSON.object().add("editSessionId", "ab12cd34"));
            }
            C3894 c3894 = new C3894(str, str2, str3, str4);
            try {
                if ("workspace_to_local".equals(str)) {
                    return m42098(c3894, str5, z);
                }
                return m42097(c3894, str5, z);
            } catch (IOException e) {
                throw m42096(C10186.m26306("EDIT_SESSION_STORAGE_FAILED", "Failed to write the workspace ZIP entry.", "fatal", null, JSON.object().add("operation", "overlay_publish").add("backendReason", e.getClass().getSimpleName())), c3894);
            } catch (C10186 e2) {
                e = e2;
                if (e.f32597) {
                    throw e;
                }
                String str6 = e.f32601;
                if ("EDIT_SESSION_STORAGE_FAILED".equals(str6)) {
                    JSONObject jSONObjectObject = JSON.object();
                    for (JSONObject.Member member : e.f32602) {
                        jSONObjectObject.put(member.getName(), member.getValue());
                    }
                    jSONObjectObject.put("backendReason", "workspace_storage_failure");
                    e = C10186.m26306(str6, "Edit session storage failed.", e.f32604, e.f32599, jSONObjectObject);
                }
                String str7 = e.f32601;
                JSONObject jSONObject = e.f32602;
                JSONValue jSONValue2 = jSONObject.get("localPath");
                if (jSONValue2 != null && jSONValue2.isString()) {
                    c3894.f13273 = jSONValue2.asString();
                } else if (("FILE_ACCESS_DENIED".equals(str7) || "FILE_ACCESS_ROOT_PROTECTED".equals(str7)) && (jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH)) != null && jSONValue.isString()) {
                    c3894.f13273 = jSONObject.get(MotionUtils.EASING_TYPE_PATH).asString();
                }
                JSONValue jSONValue3 = jSONObject.get("changed");
                if (jSONValue3 != null && jSONValue3.isBoolean()) {
                    c3894.f13277 = jSONValue3.asBoolean();
                }
                JSONValue jSONValue4 = jSONObject.get("stateKnown");
                if (jSONValue4 != null && jSONValue4.isBoolean()) {
                    c3894.f13272 = jSONValue4.asBoolean();
                }
                JSONValue jSONValue5 = jSONObject.get("operationMode");
                if (jSONValue5 != null && jSONValue5.isString()) {
                    c3894.f13268 = jSONValue5.asString();
                }
                JSONValue jSONValue6 = jSONObject.get("warnings");
                if (jSONValue6 != null && jSONValue6.isArray()) {
                    c3894.f13279 = new JSONArray(jSONValue6.asArray());
                }
                JSONValue jSONValue7 = jSONObject.get("bytesCopied");
                if (jSONValue7 != null) {
                    c3894.f13269 = jSONValue7.isNumber() ? jSONValue7.asLong() : -1L;
                }
                JSONValue jSONValue8 = jSONObject.get("editRevision");
                if (jSONValue8 != null && jSONValue8.isNumber()) {
                    c3894.f13278 = Integer.valueOf(jSONValue8.asInt());
                }
                if ("EDIT_SESSION_STORAGE_FAILED".equals(str7)) {
                    c3894.f13269 = -1L;
                }
                throw m42096(e, c3894);
            }
        }
        throw C10186.m26301("Invalid direction", "direction", str != null ? JSON.value(str) : null, JSON.array("workspace_to_local", "local_to_edit_session"), JSON.object().add("direction", "workspace_to_local"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42096(C10186 c10186, C3894 c3894) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject<JSONObject.Member> jSONObject = c10186.f32602;
        JSONArray jSONArray = c10186.f32599;
        String str = c10186.f32604;
        String str2 = c10186.f32601;
        for (JSONObject.Member member : jSONObject) {
            jSONObjectObject.put(member.getName(), member.getValue());
        }
        JSONObject jSONObjectPut = jSONObjectObject.put("direction", c3894.f13271).put("workspaceId", c3894.f13275);
        String str3 = c3894.f13276;
        jSONObjectPut.put("editSessionId", str3 == null ? JSON.NULL : JSON.value(str3)).put("entryName", c3894.f13274).put("locator", C4375.m13906("zip_entry", c3894.f13274, (String) null, (String) null, (String) null, (String) null));
        String str4 = c3894.f13273;
        if (str4 != null) {
            jSONObjectObject.put("localPath", str4);
        }
        JSONValue jSONValue = jSONObjectObject.get("operation");
        if (jSONValue == null || !jSONValue.isString()) {
            String str5 = c3894.f13270;
            jSONObjectObject.put("operation", str5 == null ? JSON.NULL : JSON.value(str5));
        }
        JSONValue jSONValue2 = jSONObjectObject.get("backendReason");
        if (jSONValue2 == null || !jSONValue2.isString()) {
            jSONObjectObject.put("backendReason", JSON.NULL);
        }
        JSONObject jSONObjectPut2 = jSONObjectObject.put("changed", c3894.f13277);
        String str6 = c3894.f13268;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("operationMode", str6 == null ? JSON.NULL : JSON.value(str6)).put("stateKnown", c3894.f13272).put("warnings", new JSONArray(c3894.f13279));
        long j = c3894.f13269;
        JSONObject jSONObjectPut4 = jSONObjectPut3.put("bytesCopied", j < 0 ? JSON.NULL : JSON.value(j));
        Integer num = c3894.f13278;
        jSONObjectPut4.put("editRevision", num == null ? JSON.NULL : JSON.value(num.intValue())).put("safeToRetry", c3894.f13272 && !c3894.f13277);
        if (c10186.f32600) {
            return C10186.m26302(str2, c10186.getMessage(), str, jSONArray, jSONObjectObject);
        }
        return C10186.m26306(str2, c10186.getMessage(), str, jSONArray, jSONObjectObject);
    }
}
