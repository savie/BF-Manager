package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩻ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W760 */
/* JADX INFO: loaded from: classes.dex */
public final class C24756 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f80139;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public JSONObject f80140;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10867 f80141 = new C10867();

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "List Available APKs";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "List APK targets that mt_apk_workspace_open can open. Use prefix=\"\" for no filter; when the current APK is available, the first page may start with mt://current-apk. Other items recursively include APK files in the current Home folder and its subdirectories, and return paths relative to Home. Pass data.items[].path directly as mt_apk_workspace_open.path, choose mt_apk_workspace_open.temporary for the intended lifetime, pass limit=50 unless you need a different page size, and use mt_apk_continue for later pages.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_list_available_apks";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f80139;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"prefix\": {\n    \"type\": \"string\",\n    \"description\": \"Home-relative path prefix filter for APK paths returned by this tool. Pass \\\"\\\" for no filter and to include mt://current-apk when available. Prefixes may name subdirectories such as release/.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the first page. Recommended value is 50; maximum 200. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f80139 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f80140;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM27734 = C10932.m27734("Result for mt_apk_list_available_apks. data.items[] contains APK targets that can be opened by mt_apk_workspace_open; pass items[i].path to mt_apk_workspace_open.path and choose mt_apk_workspace_open.temporary for the intended lifetime; nextActions carries continuation calls.", C10932.m27731(JSON.object().add("prefix", C10932.m27740("string", "Actual relative path prefix filter; empty string means no filter and may include mt://current-apk.")).add("items", C22121.m50076("type", "array", "description", "APK targets that can be opened by mt_apk_workspace_open.").add("items", C10932.m27731(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Path target to pass directly to mt_apk_workspace_open.path; may be mt://current-apk for the current APK or a relative APK path. Also set mt_apk_workspace_open.temporary when opening it.")).add("size", C10932.m27740("integer", "File size in bytes.")).add("lastModified", C10932.m27740("integer", "File modification time as epoch milliseconds.")).add("appLabel", C10932.m27743("string", "Resolved or raw application label when available.")).add("packageName", C10932.m27743("string", "Manifest package name when available.")).add("versionName", C10932.m27743("string", "Manifest versionName when available.")).add("versionCode", C10932.m27743("integer", "Manifest versionCode when available.")).add("manifestAvailable", C10932.m27740(ClassTransform.BOOLEAN, "Whether AndroidManifest.xml was parsed successfully.")).add("manifestError", C10932.m27743("string", "Manifest parse error, or null.")), "Available APK target."))).add("pagination", C10932.m27739(C10932.m27736("Number of APK targets returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor.", "Total available count when known, or null."))), "Successful mt_apk_list_available_apks data."), C10932.m27741(C14815.m35667()), C10932.m27737("Executable continue actions; copy arguments directly.", C10932.m27732(C16237.m38540(), "mt_apk_continue", "continue")));
        this.f80140 = jSONObjectM27734;
        return jSONObjectM27734;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36729(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        int i;
        try {
            C11329 c11329M55266 = m55266(jSONObject);
            return new C1238(C1635.m5794(this.f80141.m27605(c11329M55266.f35701, c11329M55266.f35700, 0, true)));
        } finally {
            i = C24294.f78630;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m55267(C14596 c14596, JSONObject jSONObject) throws C10186 {
        JSONObject jSONObject2 = c14596.f45982;
        JSONObject jSONObject3 = c14596.f45980;
        String string = jSONObject2.getString("prefix", null);
        int i = jSONObject3.getInt("offset", -1);
        JSONValue jSONValue = jSONObject.get("limit");
        int iM31240 = c14596.f45983;
        if (jSONValue != null) {
            if (!jSONValue.isNumber()) {
                throw C10186.m26301("Invalid limit", "limit", jSONValue, JSON.array(), JSON.object().add("limit", 50));
            }
            try {
                iM31240 = C12556.m31240(jSONValue);
            } catch (ArithmeticException | NumberFormatException unused) {
                throw C10186.m26301("Invalid limit", "limit", jSONValue, JSON.array(), JSON.object().add("limit", 50));
            }
        }
        m55265(iM31240);
        int i2 = C24294.f78630;
        return new C1238(C1635.m5794(this.f80141.m27605(string, iM31240, i, false)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C11329 m55266(JSONObject jSONObject) throws C10186 {
        for (String str : jSONObject.names()) {
            if (!"prefix".equals(str) && !"limit".equals(str)) {
                throw C10186.m26301("Invalid list_available_apks argument", str, jSONObject.get(str), JSON.array("prefix", "limit"), JSON.object().add("prefix", "").add("limit", 50));
            }
        }
        JSONValue jSONValue = jSONObject.get("prefix");
        if (jSONValue == null || jSONValue.isNull()) {
            throw C10186.m26301("Missing parameter: prefix", "prefix", jSONValue, JSON.array(), JSON.object().add("prefix", ""));
        }
        if (!jSONValue.isString()) {
            throw C10186.m26301("Invalid prefix", "prefix", jSONValue, JSON.array(), JSON.object().add("prefix", ""));
        }
        String strAsString = jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("limit");
        if (jSONValue2 == null || jSONValue2.isNull()) {
            throw C10186.m26301("Missing parameter: limit", "limit", jSONValue2, JSON.array(), JSON.object().add("limit", 50));
        }
        if (!jSONValue2.isNumber()) {
            throw C10186.m26301("Invalid limit", "limit", jSONValue2, JSON.array(), JSON.object().add("limit", 50));
        }
        try {
            int iM31240 = C12556.m31240(jSONValue2);
            m55265(iM31240);
            return new C11329(strAsString, iM31240);
        } catch (ArithmeticException | NumberFormatException unused) {
            throw C10186.m26301("Invalid limit", "limit", jSONValue2, JSON.array(), JSON.object().add("limit", 50));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55265(int i) throws C10186 {
        if (i < 1 || i > 200) {
            throw C10186.m26301("Invalid limit", "limit", JSON.value(i), JSON.array(1, 200), JSON.object().add("limit", 50));
        }
    }
}
