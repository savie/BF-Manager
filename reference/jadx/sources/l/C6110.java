package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S77V */
/* JADX INFO: loaded from: classes3.dex */
public final class C6110 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m17630(C6198 c6198) {
        return C15300.m36728(JSON.object().add("workspaceId", c6198.f21100).add("editSessionId", c6198.f21099).add("locator", C4375.m13967(c6198.f21102, c6198.f21103)).add("newTargetVersion", c6198.f21106), JSON.array());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m17631(C8434 c8434) {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c8434.f27600).add("editSessionId", c8434.f27599).add("changed", c8434.f27598).add("changedCount", c8434.f27602).add("noOpCount", c8434.f27603);
        ArrayList<C2468> arrayList = c8434.f27601;
        JSONArray jSONArrayArray = JSON.array();
        for (C2468 c2468 : arrayList) {
            jSONArrayArray.add(JSON.object().add("index", c2468.f7923).add("locator", C4375.m13906("resource", (String) null, (String) null, (String) null, (String) null, c2468.f7924)).add("variant", c2468.f7922).add("changed", c2468.f7920).add("newTargetVersion", c2468.f7921));
        }
        return C15300.m36728(jSONObjectAdd.add("results", jSONArrayArray), JSON.array());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static JSONObject m17634(C10186 c10186) {
        return C15300.m36730(c10186, C8008.m21874(c10186.f32602, "workspaceId", JSON.object(), "workspaceId"), m17636(c10186));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static JSONObject m17635(C10186 c10186) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c10186.f32602;
        JSONObject jSONObjectM21874 = C8008.m21874(jSONObject, "currentTargetVersion", C8008.m21874(jSONObject, "editSessionId", C8008.m21874(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId").add("locator", m17632(c10186)), "currentTargetVersion");
        JSONValue jSONValue = jSONObject.get("failedEditIndex");
        if (jSONValue == null || jSONValue.isNull() || !jSONValue.isNumber()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM21874.add("failedEditIndex", jSONValue);
        JSONArray jSONArray = jSONObject.getJSONArray("failures");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                JSONValue jSONValue2 = jSONObjectAsObject.get("line");
                JSONValue jSONValue3 = jSONObjectAsObject.get("column");
                JSONValue jSONValueM35668 = C14815.m35668(jSONObjectAsObject);
                String string = jSONObjectAsObject.getString("className", null);
                Iterator it2 = it;
                String string2 = jSONObjectAsObject.getString("errorCode", null);
                String string3 = jSONObjectAsObject.getString("message", null);
                JSONObject jSONObject2 = jSONObjectAdd;
                Integer numValueOf = (jSONValue2 == null || jSONValue2.isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("line", -1));
                Integer numValueOf2 = (jSONValue3 == null || jSONValue3.isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("column", -1));
                jSONArrayArray.add(JSON.object().add("locator", jSONValueM35668).add("className", string).add("errorCode", string2).add("message", string3).add("line", numValueOf == null ? JSON.NULL : JSON.value(numValueOf.intValue())).add("column", numValueOf2 == null ? JSON.NULL : JSON.value(numValueOf2.intValue())));
                it = it2;
                jSONObjectAdd = jSONObject2;
            }
        }
        return C15300.m36730(c10186, jSONObjectAdd.add("failures", jSONArrayArray), m17636(c10186));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static JSONObject m17638(C10186 c10186) {
        JSONObject jSONObject = c10186.f32602;
        JSONObject jSONObject2 = jSONObject.getJSONObject("resourceNamePolicy");
        JSONObject jSONObjectM21874 = C8008.m21874(jSONObject, "currentTargetVersion", C8008.m21874(jSONObject, "variant", C8008.m21874(jSONObject, "editSessionId", C8008.m21874(jSONObject, "workspaceId", JSON.object(), "workspaceId"), "editSessionId").add("locator", m17632(c10186)), "variant"), "currentTargetVersion");
        JSONValue jSONValue = jSONObject.get("failedEditIndex");
        if (jSONValue == null || jSONValue.isNull() || !jSONValue.isNumber()) {
            jSONValue = JSON.NULL;
        }
        JSONObject jSONObjectAdd = jSONObjectM21874.add("failedEditIndex", jSONValue).add("resourceNamePolicy", jSONObject2 == null ? JSON.NULL : new JSONObject(jSONObject2));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c10186.f32599.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            if ("mt_apk_resource_read".equals(jSONObjectAsObject.getString("tool", null))) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return C15300.m36730(c10186, jSONObjectAdd, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m17637() {
        return C10932.m27734("Result for mt_apk_session_create. data returns the new edit session id.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id used for this edit session.")).add("editSessionId", C10932.m27743("string", "Pass this editSessionId to follow-up tools to read or modify the same edited session; an empty string selects the base workspace.")), "Successful mt_apk_session_create data."), C10932.m27741(C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id, or null.")), "mt_apk_session_create diagnostics.")), m17629());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static JSONObject m17633() {
        return C10932.m27734("Result for mt_apk_edit_text. data returns the edited locator and new targetVersion for the next edit of the same target.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id used for this edit session.")).add("editSessionId", C10932.m27743("string", "Pass this editSessionId to follow-up tools to read or modify the same edited session; an empty string selects the base workspace.")).add("locator", C10932.m27743("string", "Edited locator for this edit_text request.")).add("newTargetVersion", C10932.m27743("string", "Version token of the edited target after this successful edit (16 lowercase hex digits, or missing); pass this for the next edit of the same target.")), "Successful edit_text data."), C10932.m27741(C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id, or null.")).add("editSessionId", C10932.m27743("string", "Edit session id to keep using when fixing current failures, or null.")).add("locator", C10932.m27743("string", "Rejected edit_text request locator, or null.")).add("currentTargetVersion", C10932.m27743("string", "Only set for TARGET_VERSION_MISMATCH; current targetVersion at rejection time. Prefer nextActions to re-read and copy data.targetVersion; use this value directly only for the same target and editSessionId when not re-reading.")).add("failedEditIndex", C10932.m27743("integer", "0-based edits[] index for runtime failures tied to one edit, or JSON null for parameter errors, stale targetVersion, and prepare failures.")).add("failures", C22121.m50076("type", "array", "description", "Edit session prepare failures bound to locator. Success data describes current saved session failures; edit_text error diagnostics describe the rejected candidate text.").add("items", C10932.m27731(JSON.object().add("locator", C10932.m27743("string", "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates.")).add("className", C10932.m27743("string", "Dex class descriptor.")).add("errorCode", C10932.m27743("string", "Failure code.")).add("message", C10932.m27743("string", "Compiler error message.")).add("line", C10932.m27743("integer", "0-based line in the failed text, or null.")).add("column", C10932.m27743("integer", "0-based column in the failed text, or null.")), "One edit session prepare failure."))), "edit_text diagnostics.")), m17629());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m17629() {
        return C10932.m27737("Edit success emits no follow-up actions; errors may return retry or workspace verification actions.", C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry"), C10932.m27732(C16237.m38550(), "mt_apk_read_text", "retry"), C10932.m27732(C16237.m38537(), "mt_apk_read_bytes", "retry"), C10932.m27732(C16237.m38549(), "mt_apk_list_entries", "verify_workspace"), C10932.m27732(C16237.m38543(), "mt_apk_dex_list_classes", "verify_workspace"), C10932.m27732(C16237.m38547(), "mt_apk_resource_list", "verify_workspace"), C10932.m27732(C16237.m38542(), "mt_apk_dex_read_class_outline", "verify_workspace"));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONArray m17636(C10186 c10186) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = c10186.f32599.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            String string = jSONObjectAsObject.getString("tool", null);
            if ("mt_apk_workspace_open".equals(string) || "mt_apk_read_text".equals(string) || "mt_apk_read_bytes".equals(string) || "mt_apk_list_entries".equals(string) || "mt_apk_dex_list_classes".equals(string) || "mt_apk_resource_list".equals(string) || "mt_apk_dex_read_class_outline".equals(string)) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m17632(C10186 c10186) {
        JSONObject jSONObject = c10186.f32602;
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue != null && !jSONValue.isNull()) {
            return C12556.m31239(jSONValue);
        }
        return C4375.m13967(jSONObject.getString("targetType", null), jSONObject.getString("target", null));
    }
}
