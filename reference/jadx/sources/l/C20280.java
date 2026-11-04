package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y75Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C20280 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f65103;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f65104;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f65105;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "APK Edit Session Check";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Check an APK edit session without producing or signing an APK. runBuildChecks=false reports pending work and recorded failures. runBuildChecks=true runs pre-build content checks: prepare edited content, check changed entry readability, and merge Dex. It does not validate output paths, signing configuration, final APK packaging, or installability. Inspect buildCheckStatus and failures; passed applies only to these content checks.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_session_check";
    }

    public C20280(C1897 c1897) {
        this.f65104 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f65103;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"runBuildChecks\": {\n    \"type\": \"boolean\",\n    \"description\": \"Pass false for current edit session status only. Pass true to run the pre-build content checks described above without producing or signing an APK.\"\n  }\n}\n");
        this.f65103 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c10186.f32602;
        JSONObject jSONObjectAdd = C8008.m21874(jSONObject, "editSessionId", C8008.m21874(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId").add("runBuildChecks", jSONObject.getBoolean("runBuildChecks", false)).add("overlaySaved", jSONObject.getBoolean("overlaySaved", false)).add("failures", C14815.m35666(jSONObject.getJSONArray("failures")));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c10186.f32599.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_workspace_open".equals(string) || "mt_apk_read_text".equals(string) || "mt_apk_read_bytes".equals(string) || "mt_apk_list_entries".equals(string) || "mt_apk_dex_list_classes".equals(string) || "mt_apk_resource_list".equals(string) || "mt_apk_dex_read_class_outline".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C15300.m36730(c10186, jSONObjectAdd, jSONArrayArray);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f65105;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM44065 = C18969.m44065();
        this.f65105 = jSONObjectM44065;
        return jSONObjectM44065;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        try {
            C16834.m39750();
            try {
                C4134 c4134M13927 = C4375.m13927(jSONObject);
                try {
                    C12163 c12163M6548 = this.f65104.m6548(c4134M13927);
                    int i = C24294.f78630;
                    return new C1238(C18969.m44058(c12163M6548));
                } catch (C10186 e) {
                    m46546(e, c4134M13927);
                    throw e;
                }
            } catch (C10186 e2) {
                JSONObject jSONObject2 = e2.f32602;
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
            int i2 = C24294.f78630;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46546(C10186 c10186, C4134 c4134) {
        JSONObject jSONObject = c10186.f32602;
        JSONValue jSONValueValue = JSON.value(c4134.f14027);
        if (!jSONObject.contains("workspaceId")) {
            jSONObject.put("workspaceId", jSONValueValue);
        }
        JSONValue jSONValueValue2 = JSON.value(c4134.f14026);
        if (!jSONObject.contains("editSessionId")) {
            jSONObject.put("editSessionId", jSONValueValue2);
        }
        JSONValue jSONValueValue3 = JSON.value(c4134.f14028);
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
