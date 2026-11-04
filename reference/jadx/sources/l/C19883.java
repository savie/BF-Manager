package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;

/* JADX INFO: renamed from: l.ᩴܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J79K */
/* JADX INFO: loaded from: classes5.dex */
public final class C19883 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18683 m45785(EnumC21667 enumC21667, JSONValue jSONValue, int i, String str) {
        return AbstractC1530.m5422(enumC21667, "application/json", m45783(i, jSONValue, str).toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m45784(JSONObject jSONObject, JSONValue jSONValue) {
        JSONObject jSONObjectAdd = JSON.object().add("jsonrpc", UMCrashManager.CM_VERSION);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        return jSONObjectAdd.add("id", jSONValue).add(o.c, jSONObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m45783(int i, JSONValue jSONValue, String str) {
        JSONObject jSONObjectAdd = JSON.object().add("jsonrpc", UMCrashManager.CM_VERSION);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        return jSONObjectAdd.add("id", jSONValue).add(d.O, JSON.object().add("code", i).add("message", str));
    }
}
