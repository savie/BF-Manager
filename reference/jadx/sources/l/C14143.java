package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;

/* JADX INFO: renamed from: l.ܰ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J79K */
/* JADX INFO: loaded from: classes3.dex */
public final class C14143 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7768 m34192(EnumC10591 enumC10591, JSONValue jSONValue, int i, String str) {
        return AbstractC16940.m39639(enumC10591, "application/json", m34191(jSONValue, i, str).toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m34190(JSONObject jSONObject, JSONValue jSONValue) {
        JSONObject jSONObjectAdd = JSON.object().add("jsonrpc", UMCrashManager.CM_VERSION);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        return jSONObjectAdd.add("id", jSONValue).add(o.c, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m34191(JSONValue jSONValue, int i, String str) {
        JSONObject jSONObjectAdd = JSON.object().add("jsonrpc", UMCrashManager.CM_VERSION);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        return jSONObjectAdd.add("id", jSONValue).add(d.O, JSON.object().add("code", i).add("message", str));
    }
}
