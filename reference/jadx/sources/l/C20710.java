package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.HashSet;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩷ۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 26X3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20710 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f67335;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5893 f67336;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f67337;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_copy_entry";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Copy the raw content of one ordinary zip_entry between an APK workspace and a local file, preserving the source. workspace_to_local reads the base APK when editSessionId=\"\" or the edited session otherwise; overwrite controls the local destination. local_to_edit_session requires a non-empty editSessionId and copies into the entry; overwrite controls replacement of an existing entry; a deleted entry can be recreated. localPath may be absolute or relative to Home and requires file access permission. Both directions reject classes*.dex, resources.arsc, AXML, and directories. ZIP metadata is not copied and text encoding is not changed. Large files are supported; disconnecting does not cancel a copy already in progress. Inspect failure diagnostics before retrying. After success, nextActions checks local file metadata or reads the first entry bytes; it does not verify complete content equality.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Copy APK Entry";
    }

    public C20710(C5893 c5893) {
        this.f67336 = c5893;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f67335 == null) {
            this.f67335 = C18828.m43457(JSON.object().add("direction", C4969.m13784("workspace_to_local copies an entry view to localPath; local_to_edit_session copies localPath into an edit session and requires a non-empty editSessionId.", "workspace_to_local", "local_to_edit_session")).add("workspaceId", C4969.m13786("string", "Non-empty workspace id returned by mt_apk_workspace_open.")).add("editSessionId", C4969.m13786("string", "For workspace_to_local, pass an empty string to read the base workspace or a non-empty id to read that edit-session view. For local_to_edit_session, this must be a non-empty id returned by mt_apk_session_create.")).add("locator", C4969.m13786("string", "Exact ordinary zip_entry locator. classes*.dex, resources.arsc, AXML, and ZIP directory entries are rejected in both directions.")).add("localPath", C4969.m13786("string", "Non-empty absolute or Home-relative local source or destination path, selected by direction.")), ClassTransform.BOOLEAN, "For workspace_to_local, true permits replacing an existing regular local file. For local_to_edit_session, true permits replacing an ordinary entry in the current session view; a tombstoned entry counts as missing.", "overwrite", "Arguments for mt_apk_copy_entry.");
        }
        return this.f67335;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f67337 == null) {
            this.f67337 = C7304.m19455();
        }
        return this.f67337;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        HashSet hashSet = new HashSet();
        for (String str : jSONObject.names()) {
            if ((!"direction".equals(str) && !"workspaceId".equals(str) && !"editSessionId".equals(str) && !"locator".equals(str) && !"localPath".equals(str) && !"overwrite".equals(str)) || !hashSet.add(str)) {
                throw m46561(jSONObject.get(str), "Invalid workspace entry copy argument", str);
            }
        }
        String[] strArr = {"direction", "workspaceId", "editSessionId", "locator", "localPath", "overwrite"};
        for (int i = 0; i < 6; i++) {
            String str2 = strArr[i];
            if (!hashSet.contains(str2)) {
                throw m46561(null, C0252.m1693("Missing parameter: ", str2), str2);
            }
        }
        JSONValue jSONValue = jSONObject.get("direction");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m46561(jSONValue, "Invalid direction", "direction");
        }
        String strAsString = jSONValue.asString();
        if (!"workspace_to_local".equals(strAsString) && !"local_to_edit_session".equals(strAsString)) {
            throw C12731.m31626("Invalid direction", "direction", jSONValue, JSON.array("workspace_to_local", "local_to_edit_session"), m46559());
        }
        String strM46560 = m46560(jSONObject, "workspaceId");
        String strM46562 = m46562(jSONObject, "editSessionId");
        String strM41105 = C17638.m41105(m46560(jSONObject, "locator"));
        String strM46563 = m46562(jSONObject, "localPath");
        JSONValue jSONValue2 = jSONObject.get("overwrite");
        if (jSONValue2 == null || !jSONValue2.isBoolean()) {
            throw m46561(jSONValue2, "Invalid boolean argument", "overwrite");
        }
        C17182 c17182M16131 = this.f67336.m16131(strAsString, strM46560, strM46562, strM41105, strM46563, jSONValue2.asBoolean());
        String strM41044 = C17638.m41044("zip_entry", c17182M16131.f54772, (String) null, (String) null, (String) null, (String) null);
        JSONObject jSONObjectObject = JSON.object();
        String str3 = c17182M16131.f54770;
        JSONObject jSONObjectAdd = jSONObjectObject.add("direction", str3);
        String str4 = c17182M16131.f54768;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("workspaceId", str4);
        String str5 = c17182M16131.f54773;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("editSessionId", str5).add("locator", strM41044);
        String str6 = c17182M16131.f54769;
        return new C17669(C0735.m3193(jSONObjectAdd3.add("localPath", str6).add("warnings", c17182M16131.f54774).add("size", c17182M16131.f54771), "workspace_to_local".equals(str3) ? JSON.array().add(C11320.m28376(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str6), "mt_file_stat", "inspect", "Inspect the copied local file at its normalized destination path.")) : JSON.array().add(C11320.m28376(C3184.m9603("workspaceId", str4, "editSessionId", str5).add("locator", strM41044).add("byteOffset", 0).add("maxBytes", 256), "mt_apk_read_bytes", "inspect", "Read back the first raw byte window from the committed edit-session entry."))));
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        JSONObject jSONObject = c12731.f42468;
        JSONObject jSONObjectM28557 = C11445.m28557(jSONObject, "editSessionId", C11445.m28557(jSONObject, "workspaceId", C11445.m28557(jSONObject, "direction", JSON.object(), "direction"), "workspaceId"), "editSessionId");
        JSONValue jSONValueValue = jSONObject.get("locator");
        if (jSONValueValue == null || !jSONValueValue.isString()) {
            String string = jSONObject.getString("entryName", null);
            jSONValueValue = (string == null || string.isEmpty()) ? JSON.NULL : JSON.value(C17638.m41044("zip_entry", string, (String) null, (String) null, (String) null, (String) null));
        }
        JSONObject jSONObjectM28558 = C11445.m28557(jSONObject, "localPath", jSONObjectM28557.add("locator", jSONValueValue), "localPath");
        JSONValue jSONValue = jSONObject.get("changed");
        boolean zAsBoolean = false;
        JSONObject jSONObjectM28559 = C11445.m28557(jSONObject, "operationMode", jSONObjectM28558.add("changed", (jSONValue == null || !jSONValue.isBoolean()) ? false : jSONValue.asBoolean()), "operationMode");
        JSONValue jSONValue2 = jSONObject.get("stateKnown");
        JSONObject jSONObjectAdd = jSONObjectM28559.add("stateKnown", (jSONValue2 == null || !jSONValue2.isBoolean()) ? true : jSONValue2.asBoolean());
        JSONValue jSONValue3 = jSONObject.get("warnings");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONValue3 != null && jSONValue3.isArray()) {
            for (JSONValue jSONValue4 : jSONValue3.asArray()) {
                if (jSONValue4.isString()) {
                    jSONArrayArray.add(jSONValue4.asString());
                }
            }
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("warnings", jSONArrayArray);
        JSONValue jSONValue5 = jSONObject.get("bytesCopied");
        if (jSONValue5 == null || !jSONValue5.isNumber()) {
            jSONValue5 = JSON.NULL;
        }
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("bytesCopied", jSONValue5);
        JSONValue jSONValue6 = jSONObject.get("safeToRetry");
        if (jSONValue6 != null && jSONValue6.isBoolean()) {
            zAsBoolean = jSONValue6.asBoolean();
        }
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("safeToRetry", zAsBoolean);
        JSONArray<JSONValue> jSONArray = c12731.f42471;
        JSONArray jSONArrayArray2 = JSON.array();
        for (JSONValue jSONValue7 : jSONArray) {
            if (jSONValue7.isObject()) {
                JSONObject jSONObjectAsObject = jSONValue7.asObject();
                if ("mt_apk_workspace_open".equals(jSONObjectAsObject.getString("tool", null)) && "retry".equals(jSONObjectAsObject.getString("purpose", null))) {
                    jSONArrayArray2.add(new JSONObject(jSONObjectAsObject));
                }
            }
        }
        return C0735.m3195(c12731, jSONObjectAdd4, jSONArrayArray2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m46562(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m46561(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46560(JSONObject jSONObject, String str) throws C12731 {
        String strM46562 = m46562(jSONObject, str);
        if (!strM46562.isEmpty()) {
            return strM46562;
        }
        throw m46561(JSON.value(strM46562), "Invalid ".concat(str), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m46561(JSONValue jSONValue, String str, String str2) {
        return C12731.m31626(str, str2, jSONValue, JSON.array(), m46559());
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static JSONObject m46559() {
        return C3184.m9603("direction", "workspace_to_local", "workspaceId", "workspace1234").add("editSessionId", "").add("locator", C17638.m41044("zip_entry", "assets/data.bin", (String) null, (String) null, (String) null, (String) null)).add("localPath", "copied/data.bin").add("overwrite", false);
    }
}
