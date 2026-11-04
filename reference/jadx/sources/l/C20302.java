package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.HashSet;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩵ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26X3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20302 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f65169;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18064 f65170;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f65171;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Copy APK Entry";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Copy the raw content of one ordinary zip_entry between an APK workspace and a local file, preserving the source. workspace_to_local reads the base APK when editSessionId=\"\" or the edited session otherwise; overwrite controls the local destination. local_to_edit_session requires a non-empty editSessionId and copies into the entry; overwrite controls replacement of an existing entry; a deleted entry can be recreated. localPath may be absolute or relative to Home and requires file access permission. Both directions reject classes*.dex, resources.arsc, AXML, and directories. ZIP metadata is not copied and text encoding is not changed. Large files are supported; disconnecting does not cancel a copy already in progress. Inspect failure diagnostics before retrying. After success, nextActions checks local file metadata or reads the first entry bytes; it does not verify complete content equality.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_copy_entry";
    }

    public C20302(C18064 c18064) {
        this.f65170 = c18064;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f65169 == null) {
            this.f65169 = C22783.m51386(JSON.object().add("direction", C10932.m27738("workspace_to_local copies an entry view to localPath; local_to_edit_session copies localPath into an edit session and requires a non-empty editSessionId.", "workspace_to_local", "local_to_edit_session")).add("workspaceId", C10932.m27740("string", "Non-empty workspace id returned by mt_apk_workspace_open.")).add("editSessionId", C10932.m27740("string", "For workspace_to_local, pass an empty string to read the base workspace or a non-empty id to read that edit-session view. For local_to_edit_session, this must be a non-empty id returned by mt_apk_session_create.")).add("locator", C10932.m27740("string", "Exact ordinary zip_entry locator. classes*.dex, resources.arsc, AXML, and ZIP directory entries are rejected in both directions.")).add("localPath", C10932.m27740("string", "Non-empty absolute or Home-relative local source or destination path, selected by direction.")), ClassTransform.BOOLEAN, "For workspace_to_local, true permits replacing an existing regular local file. For local_to_edit_session, true permits replacing an ordinary entry in the current session view; a tombstoned entry counts as missing.", "overwrite", "Arguments for mt_apk_copy_entry.");
        }
        return this.f65169;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f65171 == null) {
            this.f65171 = C3148.m10287();
        }
        return this.f65171;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        HashSet hashSet = new HashSet();
        for (String str : jSONObject.names()) {
            if ((!"direction".equals(str) && !"workspaceId".equals(str) && !"editSessionId".equals(str) && !"locator".equals(str) && !"localPath".equals(str) && !"overwrite".equals(str)) || !hashSet.add(str)) {
                throw m46641(jSONObject.get(str), "Invalid workspace entry copy argument", str);
            }
        }
        String[] strArr = {"direction", "workspaceId", "editSessionId", "locator", "localPath", "overwrite"};
        for (int i = 0; i < 6; i++) {
            String str2 = strArr[i];
            if (!hashSet.contains(str2)) {
                throw m46641(null, C25272.m56409("Missing parameter: ", str2), str2);
            }
        }
        JSONValue jSONValue = jSONObject.get("direction");
        if (jSONValue == null || !jSONValue.isString()) {
            throw m46641(jSONValue, "Invalid direction", "direction");
        }
        String strAsString = jSONValue.asString();
        if (!"workspace_to_local".equals(strAsString) && !"local_to_edit_session".equals(strAsString)) {
            throw C10186.m26301("Invalid direction", "direction", jSONValue, JSON.array("workspace_to_local", "local_to_edit_session"), m46642());
        }
        String strM46640 = m46640(jSONObject, "workspaceId");
        String strM46643 = m46643(jSONObject, "editSessionId");
        String strM13954 = C4375.m13954(m46640(jSONObject, "locator"));
        String strM46644 = m46643(jSONObject, "localPath");
        JSONValue jSONValue2 = jSONObject.get("overwrite");
        if (jSONValue2 == null || !jSONValue2.isBoolean()) {
            throw m46641(jSONValue2, "Invalid boolean argument", "overwrite");
        }
        C21048 c21048M42099 = this.f65170.m42099(strAsString, strM46640, strM46643, strM13954, strM46644, jSONValue2.asBoolean());
        String strM13906 = C4375.m13906("zip_entry", c21048M42099.f67268, (String) null, (String) null, (String) null, (String) null);
        JSONObject jSONObjectObject = JSON.object();
        String str3 = c21048M42099.f67267;
        JSONObject jSONObjectAdd = jSONObjectObject.add("direction", str3);
        String str4 = c21048M42099.f67269;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("workspaceId", str4);
        String str5 = c21048M42099.f67272;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("editSessionId", str5).add("locator", strM13906);
        String str6 = c21048M42099.f67273;
        return new C1238(C15300.m36728(jSONObjectAdd3.add("localPath", str6).add("warnings", c21048M42099.f67270).add("size", c21048M42099.f67271), "workspace_to_local".equals(str3) ? JSON.array().add(C2729.m9064(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str6), "mt_file_stat", "inspect", "Inspect the copied local file at its normalized destination path.")) : JSON.array().add(C2729.m9064(C22121.m50076("workspaceId", str4, "editSessionId", str5).add("locator", strM13906).add("byteOffset", 0).add("maxBytes", 256), "mt_apk_read_bytes", "inspect", "Read back the first raw byte window from the committed edit-session entry."))));
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        JSONObject jSONObject = c10186.f32602;
        JSONObject jSONObjectM21874 = C8008.m21874(jSONObject, "editSessionId", C8008.m21874(jSONObject, "workspaceId", C8008.m21874(jSONObject, "direction", JSON.object(), "direction"), "workspaceId"), "editSessionId");
        JSONValue jSONValueValue = jSONObject.get("locator");
        if (jSONValueValue == null || !jSONValueValue.isString()) {
            String string = jSONObject.getString("entryName", null);
            jSONValueValue = (string == null || string.isEmpty()) ? JSON.NULL : JSON.value(C4375.m13906("zip_entry", string, (String) null, (String) null, (String) null, (String) null));
        }
        JSONObject jSONObjectM21875 = C8008.m21874(jSONObject, "localPath", jSONObjectM21874.add("locator", jSONValueValue), "localPath");
        JSONValue jSONValue = jSONObject.get("changed");
        boolean zAsBoolean = false;
        JSONObject jSONObjectM21876 = C8008.m21874(jSONObject, "operationMode", jSONObjectM21875.add("changed", (jSONValue == null || !jSONValue.isBoolean()) ? false : jSONValue.asBoolean()), "operationMode");
        JSONValue jSONValue2 = jSONObject.get("stateKnown");
        JSONObject jSONObjectAdd = jSONObjectM21876.add("stateKnown", (jSONValue2 == null || !jSONValue2.isBoolean()) ? true : jSONValue2.asBoolean());
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
        JSONArray<JSONValue> jSONArray = c10186.f32599;
        JSONArray jSONArrayArray2 = JSON.array();
        for (JSONValue jSONValue7 : jSONArray) {
            if (jSONValue7.isObject()) {
                JSONObject jSONObjectAsObject = jSONValue7.asObject();
                if ("mt_apk_workspace_open".equals(jSONObjectAsObject.getString("tool", null)) && "retry".equals(jSONObjectAsObject.getString("purpose", null))) {
                    jSONArrayArray2.add(new JSONObject(jSONObjectAsObject));
                }
            }
        }
        return C15300.m36730(c10186, jSONObjectAdd4, jSONArrayArray2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m46643(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m46641(jSONValue, "Invalid string argument", str);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46640(JSONObject jSONObject, String str) throws C10186 {
        String strM46643 = m46643(jSONObject, str);
        if (!strM46643.isEmpty()) {
            return strM46643;
        }
        throw m46641(JSON.value(strM46643), "Invalid ".concat(str), str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m46641(JSONValue jSONValue, String str, String str2) {
        return C10186.m26301(str, str2, jSONValue, JSON.array(), m46642());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static JSONObject m46642() {
        return C22121.m50076("direction", "workspace_to_local", "workspaceId", "workspace1234").add("editSessionId", "").add("locator", C4375.m13906("zip_entry", "assets/data.bin", (String) null, (String) null, (String) null, (String) null)).add("localPath", "copied/data.bin").add("overwrite", false);
    }
}
