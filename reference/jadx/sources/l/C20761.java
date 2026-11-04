package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.᩵ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H79P */
/* JADX INFO: loaded from: classes.dex */
public final class C20761 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17031 f66503;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9440 f66504;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final JSONObject f66505;

    static {
        ApplicationC23172.m52091(146);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native C3607 m47467(JSONObject jSONObject);

    public C20761(C17031 c17031, JSONObject jSONObject, C9440 c9440) {
        this.f66503 = c17031;
        this.f66505 = jSONObject;
        this.f66504 = c9440;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private JSONObject m47464(String str) {
        return JSON.object().add("protocolVersion", str).add("serverInfo", this.f66505).add("capabilities", JSON.object().add("tools", JSON.object()));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private String m47465(JSONObject jSONObject) throws C10186 {
        JSONObject jSONObjectM47463 = m47463(jSONObject, "params");
        if (jSONObjectM47463 == null) {
            throw C10186.m26301("Missing protocolVersion", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONValue jSONValue = jSONObjectM47463.get("protocolVersion");
        if (jSONValue == null || !jSONValue.isString()) {
            throw C10186.m26301("Invalid protocolVersion", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        return this.f66503.m40122(jSONValue.asString());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private JSONObject m47466(JSONObject jSONObject) throws C10186 {
        if (jSONObject == null) {
            throw C10186.m26301("Missing params", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONValue jSONValue = jSONObject.get("name");
        if (jSONValue == null || !jSONValue.isString()) {
            throw C10186.m26301("Missing name", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONObject jSONObjectM47463 = m47463(jSONObject, "arguments");
        if (jSONObjectM47463 == null) {
            jSONObjectM47463 = JSON.object();
        }
        return this.f66504.m24814(jSONObjectM47463, jSONValue.asString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m47463(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        if (!jSONValue.isObject()) {
            throw C10186.m26301("Invalid ".concat(str), (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asObject();
    }
}
