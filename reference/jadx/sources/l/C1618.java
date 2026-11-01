package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Y75Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C1618 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f6512;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f6513;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f6514;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_session_check";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Check an APK edit session without producing or signing an APK. runBuildChecks=false reports pending work and recorded failures. runBuildChecks=true runs pre-build content checks: prepare edited content, check changed entry readability, and merge Dex. It does not validate output paths, signing configuration, final APK packaging, or installability. Inspect buildCheckStatus and failures; passed applies only to these content checks.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "APK Edit Session Check";
    }

    public C1618(C7845 c7845) {
        this.f6513 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f6512;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"runBuildChecks\": {\n    \"type\": \"boolean\",\n    \"description\": \"Pass false for current edit session status only. Pass true to run the pre-build content checks described above without producing or signing an APK.\"\n  }\n}\n");
        this.f6512 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c12731.f42468;
        JSONObject jSONObjectAdd = C11445.m28557(jSONObject, "editSessionId", C11445.m28557(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId").add("runBuildChecks", jSONObject.getBoolean("runBuildChecks", false)).add("overlaySaved", jSONObject.getBoolean("overlaySaved", false)).add("failures", C6349.m17454(jSONObject.getJSONArray("failures")));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c12731.f42471.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_workspace_open".equals(string) || "mt_apk_read_text".equals(string) || "mt_apk_read_bytes".equals(string) || "mt_apk_list".equals(string) || "mt_apk_dex_read_class_outline".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C0735.m3195(c12731, jSONObjectAdd, jSONArrayArray);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f6514;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM24385 = C9535.m24385();
        this.f6514 = jSONObjectM24385;
        return jSONObjectM24385;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        try {
            C11755.m29361();
            try {
                C16312 c16312M41085 = C17638.m41085(jSONObject);
                try {
                    C20896 c20896M20714 = this.f6513.m20714(c16312M41085);
                    int i = C23044.f74862;
                    return new C17669(C9535.m24381(c20896M20714));
                } catch (C12731 e) {
                    m5493(e, c16312M41085);
                    throw e;
                }
            } catch (C12731 e2) {
                JSONObject jSONObject2 = e2.f42468;
                JSONValue jSONValue = jSONObject.get("workspaceId");
                if (jSONValue == null || !jSONValue.isString()) {
                    jSONValue = JSON.NULL;
                }
                JSONObject jSONObjectPut = jSONObject2.put("workspaceId", jSONValue);
                JSONValue jSONValue2 = jSONObject.get("editSessionId");
                if (jSONValue2 == null || !jSONValue2.isString()) {
                    jSONValue2 = JSON.NULL;
                }
                jSONObjectPut.put("editSessionId", jSONValue2).put("runBuildChecks", false).put("overlaySaved", false).put("failures", JSON.array());
                throw e2;
            }
        } catch (Throwable th) {
            int i2 = C23044.f74862;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5493(C12731 c12731, C16312 c16312) {
        JSONObject jSONObject = c12731.f42468;
        JSONValue jSONValueValue = JSON.value(c16312.f52519);
        if (!jSONObject.contains("workspaceId")) {
            jSONObject.put("workspaceId", jSONValueValue);
        }
        JSONValue jSONValueValue2 = JSON.value(c16312.f52518);
        if (!jSONObject.contains("editSessionId")) {
            jSONObject.put("editSessionId", jSONValueValue2);
        }
        JSONValue jSONValueValue3 = JSON.value(c16312.f52520);
        if (!jSONObject.contains("runBuildChecks")) {
            jSONObject.put("runBuildChecks", jSONValueValue3);
        }
        JSONValue jSONValueValue4 = JSON.value(false);
        if (!jSONObject.contains("overlaySaved")) {
            jSONObject.put("overlaySaved", jSONValueValue4);
        }
        JSONArray jSONArrayArray = JSON.array();
        if (jSONObject.contains("failures")) {
            return;
        }
        jSONObject.put("failures", jSONArrayArray);
    }
}
