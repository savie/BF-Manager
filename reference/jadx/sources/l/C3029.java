package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S77V */
/* JADX INFO: loaded from: classes2.dex */
public final class C3029 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9032(C15958 c15958) {
        return C0735.m3193(JSON.object().add("workspaceId", c15958.f51712).add("editSessionId", c15958.f51709).add("locator", C17638.m41088(c15958.f51707, c15958.f51714)).add("newTargetVersion", c15958.f51708), JSON.array());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9031(C4398 c4398) {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c4398.f15660).add("editSessionId", c4398.f15658).add("changed", c4398.f15656).add("changedCount", c4398.f15659).add("noOpCount", c4398.f15655);
        ArrayList<C3256> arrayList = c4398.f15657;
        JSONArray jSONArrayArray = JSON.array();
        for (C3256 c3256 : arrayList) {
            jSONArrayArray.add(JSON.object().add("index", c3256.f12099).add("locator", C17638.m41044("resource", (String) null, (String) null, (String) null, (String) null, c3256.f12095)).add("variant", c3256.f12097).add("changed", c3256.f12096).add("newTargetVersion", c3256.f12098));
        }
        return C0735.m3193(jSONObjectAdd.add("results", jSONArrayArray), JSON.array());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9036(C12731 c12731) {
        return C0735.m3195(c12731, C11445.m28557(c12731.f42468, "workspaceId", JSON.object(), "workspaceId"), m9037(c12731));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9034(C12731 c12731) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c12731.f42468;
        JSONObject jSONObjectM28557 = C11445.m28557(jSONObject, "currentTargetVersion", C11445.m28557(jSONObject, "editSessionId", C11445.m28557(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId").add("locator", m9033(c12731)), "currentTargetVersion");
        JSONValue jSONValue = jSONObject.get("failedEditIndex");
        if (jSONValue == null || jSONValue.isNull() || !jSONValue.isNumber()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM28557.add("failedEditIndex", jSONValue);
        JSONArray jSONArray = jSONObject.getJSONArray("failures");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                JSONValue jSONValue2 = jSONObjectAsObject.get("line");
                JSONValue jSONValue3 = jSONObjectAsObject.get("column");
                JSONValue jSONValueM17456 = C6349.m17456(jSONObjectAsObject);
                String string = jSONObjectAsObject.getString("className", null);
                Iterator it2 = it;
                String string2 = jSONObjectAsObject.getString("errorCode", null);
                String string3 = jSONObjectAsObject.getString("message", null);
                JSONObject jSONObject2 = jSONObjectAdd;
                Integer numValueOf = (jSONValue2 == null || jSONValue2.isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("line", -1));
                Integer numValueOf2 = (jSONValue3 == null || jSONValue3.isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("column", -1));
                jSONArrayArray.add(JSON.object().add("locator", jSONValueM17456).add("className", string).add("errorCode", string2).add("message", string3).add("line", numValueOf == null ? JSON.NULL : JSON.value(numValueOf.intValue())).add("column", numValueOf2 == null ? JSON.NULL : JSON.value(numValueOf2.intValue())));
                it = it2;
                jSONObjectAdd = jSONObject2;
            }
        }
        return C0735.m3195(c12731, jSONObjectAdd.add("failures", jSONArrayArray), m9037(c12731));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9029(C12731 c12731) {
        JSONObject jSONObject = c12731.f42468;
        JSONObject jSONObject2 = jSONObject.getJSONObject("resourceNamePolicy");
        JSONObject jSONObjectM28557 = C11445.m28557(jSONObject, "currentTargetVersion", C11445.m28557(jSONObject, "variant", C11445.m28557(jSONObject, "editSessionId", C11445.m28557(jSONObject, "workspaceId", JSON.object(), "workspaceId"), "editSessionId").add("locator", m9033(c12731)), "variant"), "currentTargetVersion");
        JSONValue jSONValue = jSONObject.get("failedEditIndex");
        if (jSONValue == null || jSONValue.isNull() || !jSONValue.isNumber()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM28557.add("failedEditIndex", jSONValue).add("resourceNamePolicy", jSONObject2 == null ? JSON.NULL : new JSONObject(jSONObject2));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c12731.f42471.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            if ("mt_apk_resource_read".equals(jSONObjectAsObject.getString("tool", null))) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C0735.m3195(c12731, jSONObjectAdd, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9038() {
        return C4969.m13780("Result for mt_apk_session_create. data returns the new edit session id.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id used for this edit session.")).add("editSessionId", C4969.m13789("string", "Pass this editSessionId to follow-up tools to read or modify the same edited session; an empty string selects the base workspace.")), "Successful mt_apk_session_create data."), C4969.m13787(C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id, or null.")), "mt_apk_session_create diagnostics.")), m9030());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9035() {
        return C4969.m13780("Result for mt_apk_edit_text. data returns the edited locator and new targetVersion for the next edit of the same target.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id used for this edit session.")).add("editSessionId", C4969.m13789("string", "Pass this editSessionId to follow-up tools to read or modify the same edited session; an empty string selects the base workspace.")).add("locator", C4969.m13789("string", "Edited locator for this edit_text request.")).add("newTargetVersion", C4969.m13789("string", "Version token of the edited target after this successful edit (16 lowercase hex digits, or missing); pass this for the next edit of the same target.")), "Successful edit_text data."), C4969.m13787(C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id, or null.")).add("editSessionId", C4969.m13789("string", "Edit session id to keep using when fixing current failures, or null.")).add("locator", C4969.m13789("string", "Rejected edit_text request locator, or null.")).add("currentTargetVersion", C4969.m13789("string", "Only set for TARGET_VERSION_MISMATCH; current targetVersion at rejection time. Prefer nextActions to re-read and copy data.targetVersion; use this value directly only for the same target and editSessionId when not re-reading.")).add("failedEditIndex", C4969.m13789("integer", "0-based edits[] index for runtime failures tied to one edit, or JSON null for parameter errors, stale targetVersion, and prepare failures.")).add("failures", C3184.m9603("type", "array", "description", "Edit session prepare failures bound to locator. Success data describes current saved session failures; edit_text error diagnostics describe the rejected candidate text.").add("items", C4969.m13777(JSON.object().add("locator", C4969.m13789("string", "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates.")).add("className", C4969.m13789("string", "Dex class descriptor.")).add("errorCode", C4969.m13789("string", "Failure code.")).add("message", C4969.m13789("string", "Compiler error message.")).add("line", C4969.m13789("integer", "0-based line in the failed text, or null.")).add("column", C4969.m13789("integer", "0-based column in the failed text, or null.")), "One edit session prepare failure."))), "edit_text diagnostics.")), m9030());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9030() {
        return C4969.m13783("Edit success emits no follow-up actions; errors may return retry or workspace verification actions.", C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry"), C4969.m13778(C13530.m33069(), "mt_apk_read_text", "retry"), C4969.m13778(C13530.m33073(), "mt_apk_read_bytes", "retry"), C4969.m13778(C13530.m33058(), "mt_apk_list", "verify_workspace"), C4969.m13778(C13530.m33057(), "mt_apk_dex_read_class_outline", "verify_workspace"));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONArray m9037(C12731 c12731) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c12731.f42471.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_workspace_open".equals(string) || "mt_apk_read_text".equals(string) || "mt_apk_read_bytes".equals(string) || "mt_apk_list".equals(string) || "mt_apk_dex_read_class_outline".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m9033(C12731 c12731) {
        JSONObject jSONObject = c12731.f42468;
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue != null && !jSONValue.isNull()) {
            return C10413.m26320(jSONValue);
        }
        return C17638.m41088(jSONObject.getString("targetType", null), jSONObject.getString("target", null));
    }
}
