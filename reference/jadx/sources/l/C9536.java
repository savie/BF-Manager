package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.umeng.commonsdk.internal.crash.UMCrashManager;

/* JADX INFO: renamed from: l.ۢۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: H79P */
/* JADX INFO: loaded from: classes3.dex */
public final class C9536 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10947 f32225;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6380 f32226;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final JSONObject f32227;

    public C9536(C10947 c10947, JSONObject jSONObject, C6380 c6380) {
        this.f32225 = c10947;
        this.f32227 = jSONObject;
        this.f32226 = c6380;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1773 m24390(JSONObject jSONObject) {
        C1773 c1773M5815;
        JSONValue jSONValue = jSONObject.get("id");
        JSONValue jSONValue2 = jSONObject.get("jsonrpc");
        JSONValue jSONValue3 = jSONObject.get(e.s);
        if (jSONValue2 == null || !jSONValue2.isString() || !UMCrashManager.CM_VERSION.equals(jSONValue2.asString()) || jSONValue3 == null || !jSONValue3.isString()) {
            return C1773.m5815(EnumC10591.BAD_REQUEST, C14143.m34191(jSONValue, -32600, "Invalid Request"));
        }
        String strAsString = jSONValue3.asString();
        if (jSONValue == null && "tools/call".equals(strAsString)) {
            return C1773.m5814(EnumC10591.ACCEPTED);
        }
        try {
            if ("initialize".equals(strAsString)) {
                c1773M5815 = C1773.m5815(EnumC10591.OK, C14143.m34190(m24387(m24388(jSONObject)), jSONValue));
            } else {
                if ("notifications/initialized".equals(strAsString)) {
                    return C1773.m5814(EnumC10591.ACCEPTED);
                }
                if ("ping".equals(strAsString)) {
                    c1773M5815 = C1773.m5815(EnumC10591.OK, C14143.m34190(JSON.object(), jSONValue));
                } else if ("tools/list".equals(strAsString)) {
                    c1773M5815 = C1773.m5815(EnumC10591.OK, C14143.m34190(JSON.object().add("tools", this.f32226.m17516()), jSONValue));
                } else if ("tools/call".equals(strAsString)) {
                    c1773M5815 = C1773.m5815(EnumC10591.OK, C14143.m34190(m24389(m24386(jSONObject, "params")), jSONValue));
                } else {
                    c1773M5815 = C1773.m5815(EnumC10591.OK, C14143.m34191(jSONValue, -32601, "Method not found"));
                }
            }
        } catch (C12731 e) {
            c1773M5815 = C1773.m5815(EnumC10591.OK, C14143.m34191(jSONValue, -32602, e.getMessage()));
        } catch (Exception unused) {
            c1773M5815 = C1773.m5815(EnumC10591.OK, C14143.m34191(jSONValue, -32603, "Internal error"));
        }
        return jSONValue == null ? C1773.m5814(EnumC10591.ACCEPTED) : c1773M5815;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private JSONObject m24387(String str) {
        return JSON.object().add("protocolVersion", str).add("serverInfo", this.f32227).add("capabilities", JSON.object().add("tools", JSON.object()));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private String m24388(JSONObject jSONObject) throws C12731 {
        JSONObject jSONObjectM24386 = m24386(jSONObject, "params");
        if (jSONObjectM24386 == null) {
            throw C12731.m31626("Missing protocolVersion", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONValue jSONValue = jSONObjectM24386.get("protocolVersion");
        if (jSONValue == null || !jSONValue.isString()) {
            throw C12731.m31626("Invalid protocolVersion", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        return this.f32225.m27463(jSONValue.asString());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private JSONObject m24389(JSONObject jSONObject) throws C12731 {
        if (jSONObject == null) {
            throw C12731.m31626("Missing params", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONValue jSONValue = jSONObject.get("name");
        if (jSONValue == null || !jSONValue.isString()) {
            throw C12731.m31626("Missing name", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        JSONObject jSONObjectM24386 = m24386(jSONObject, "arguments");
        if (jSONObjectM24386 == null) {
            jSONObjectM24386 = JSON.object();
        }
        return this.f32226.m17517(jSONObjectM24386, jSONValue.asString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m24386(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        if (!jSONValue.isObject()) {
            throw C12731.m31626("Invalid ".concat(str), (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asObject();
    }
}
