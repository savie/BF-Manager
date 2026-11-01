package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܿۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W760 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17141 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f54678;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public JSONObject f54679;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4698 f54680 = new C4698();

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_list_available_apks";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "List APK targets that mt_apk_workspace_open can open. Use prefix=\"\" for no filter; when the current APK is available, the first page may start with mt://current-apk. Other items recursively include APK files in the current Home folder and its subdirectories, and return paths relative to Home. Pass data.items[].path directly as mt_apk_workspace_open.path, choose mt_apk_workspace_open.temporary for the intended lifetime, pass limit=50 unless you need a different page size, and use mt_apk_continue for later pages.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "List Available APKs";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f54678;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"prefix\": {\n    \"type\": \"string\",\n    \"description\": \"Home-relative path prefix filter for APK paths returned by this tool. Pass \\\"\\\" for no filter and to include mt://current-apk when available. Prefixes may name subdirectories such as release/.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the first page. Recommended value is 50; maximum 200. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f54678 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f54679;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13780 = C4969.m13780("Result for mt_apk_list_available_apks. data.items[] contains APK targets that can be opened by mt_apk_workspace_open; pass items[i].path to mt_apk_workspace_open.path and choose mt_apk_workspace_open.temporary for the intended lifetime; nextActions carries continuation calls.", C4969.m13777(JSON.object().add("prefix", C4969.m13786("string", "Actual relative path prefix filter; empty string means no filter and may include mt://current-apk.")).add("items", C3184.m9603("type", "array", "description", "APK targets that can be opened by mt_apk_workspace_open.").add("items", C4969.m13777(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Path target to pass directly to mt_apk_workspace_open.path; may be mt://current-apk for the current APK or a relative APK path. Also set mt_apk_workspace_open.temporary when opening it.")).add("size", C4969.m13786("integer", "File size in bytes.")).add("lastModified", C4969.m13786("integer", "File modification time as epoch milliseconds.")).add("appLabel", C4969.m13789("string", "Resolved or raw application label when available.")).add("packageName", C4969.m13789("string", "Manifest package name when available.")).add("versionName", C4969.m13789("string", "Manifest versionName when available.")).add("versionCode", C4969.m13789("integer", "Manifest versionCode when available.")).add("manifestAvailable", C4969.m13786(ClassTransform.BOOLEAN, "Whether AndroidManifest.xml was parsed successfully.")).add("manifestError", C4969.m13789("string", "Manifest parse error, or null.")), "Available APK target."))).add("pagination", C4969.m13785(C4969.m13782("Number of APK targets returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor.", "Total available count when known, or null."))), "Successful mt_apk_list_available_apks data."), C4969.m13787(C6349.m17455()), C4969.m13783("Executable continue actions; copy arguments directly.", C4969.m13778(C13530.m33061(), "mt_apk_continue", "continue")));
        this.f54679 = jSONObjectM13780;
        return jSONObjectM13780;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3194(c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        try {
            C12203 c12203M40066 = m40066(jSONObject);
            int i = C23044.f74862;
            C4698 c4698 = this.f54680;
            String str = c12203M40066.f40810;
            int i2 = c12203M40066.f40809;
            c4698.getClass();
            return new C17669(C16436.m38688(C4698.m13014(str, i2, 0, true)));
        } catch (Throwable th) {
            int i3 = C23044.f74862;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17669 m40067(C21632 c21632, JSONObject jSONObject) throws C12731 {
        JSONObject jSONObject2 = c21632.f70156;
        JSONObject jSONObject3 = c21632.f70155;
        String string = jSONObject2.getString("prefix", null);
        int i = jSONObject3.getInt("offset", -1);
        JSONValue jSONValue = jSONObject.get("limit");
        int iM26321 = c21632.f70152;
        if (jSONValue != null) {
            if (!jSONValue.isNumber()) {
                throw C12731.m31626("Invalid limit", "limit", jSONValue, JSON.array(), JSON.object().add("limit", 50));
            }
            try {
                iM26321 = C10413.m26321(jSONValue);
            } catch (ArithmeticException | NumberFormatException unused) {
                throw C12731.m31626("Invalid limit", "limit", jSONValue, JSON.array(), JSON.object().add("limit", 50));
            }
        }
        m40065(iM26321);
        int i2 = C23044.f74862;
        this.f54680.getClass();
        return new C17669(C16436.m38688(C4698.m13014(string, iM26321, i, false)));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12203 m40066(JSONObject jSONObject) throws C12731 {
        for (String str : jSONObject.names()) {
            if (!"prefix".equals(str) && !"limit".equals(str)) {
                throw C12731.m31626("Invalid list_available_apks argument", str, jSONObject.get(str), JSON.array("prefix", "limit"), JSON.object().add("prefix", "").add("limit", 50));
            }
        }
        JSONValue jSONValue = jSONObject.get("prefix");
        if (jSONValue == null || jSONValue.isNull()) {
            throw C12731.m31626("Missing parameter: prefix", "prefix", jSONValue, JSON.array(), JSON.object().add("prefix", ""));
        }
        if (!jSONValue.isString()) {
            throw C12731.m31626("Invalid prefix", "prefix", jSONValue, JSON.array(), JSON.object().add("prefix", ""));
        }
        String strAsString = jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("limit");
        if (jSONValue2 == null || jSONValue2.isNull()) {
            throw C12731.m31626("Missing parameter: limit", "limit", jSONValue2, JSON.array(), JSON.object().add("limit", 50));
        }
        if (!jSONValue2.isNumber()) {
            throw C12731.m31626("Invalid limit", "limit", jSONValue2, JSON.array(), JSON.object().add("limit", 50));
        }
        try {
            int iM26321 = C10413.m26321(jSONValue2);
            m40065(iM26321);
            return new C12203(strAsString, iM26321);
        } catch (ArithmeticException | NumberFormatException unused) {
            throw C12731.m31626("Invalid limit", "limit", jSONValue2, JSON.array(), JSON.object().add("limit", 50));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40065(int i) throws C12731 {
        if (i < 1 || i > 200) {
            throw C12731.m31626("Invalid limit", "limit", JSON.value(i), JSON.array(1, 200), JSON.object().add("limit", 50));
        }
    }
}
