package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩶ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: CIV3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21026 extends AbstractC19137 {
    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "List Installed Apps";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Find apps installed for the current Android user that MT can see. To find APK files in Home instead, use mt_apk_list_available_apks. Pass a returned data.items[].path to mt_apk_workspace_open before inspecting APK contents; split apps open only their base APK. Installation or removal can change later pages; start a new query for a fresh full listing. Follow nextActions to continue.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_list_installed_apps";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        return C6929.m19209("{\"query\":{\"type\":\"string\",\"description\":\"One literal substring matched case-insensitively against the app name OR package name. Empty string disables filtering. Maximum 512 UTF-16 units.\"},\n \"appType\":{\"type\":\"string\",\"enum\":[\"all\",\"user\",\"system\"],\"description\":\"all: all visible installed apps, including disabled apps and apps without launcher icons; user: non-system apps; system: system apps and updated system apps. Use all unless a specific type is requested.\"},\n \"limit\":{\"type\":\"integer\",\"description\":\"Number of apps on the first page, 1..200; recommended 50.\"}}\n");
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        return C10932.m27734("Result for mt_apk_list_installed_apps. Use nextActions for continuation.", C10932.m27731(JSON.object().add("query", C10932.m27740("string", "Keyword used.")).add("appType", C10932.m27740("string", "Application type filter.")).add("items", JSON.object().add("type", "array").add("items", C22783.m51386(JSON.object().add("appLabel", C10932.m27743("string", "App name in the current language.")).add("packageName", C10932.m27740("string", "Installed package name.")).add("versionName", C10932.m27743("string", "Display version.")).add("versionCode", C10932.m27740("string", "Full version code as a decimal string, preserving 64-bit precision.")).add("systemApp", C10932.m27740(ClassTransform.BOOLEAN, "True for system apps and updated system apps; false for user apps.")).add("enabled", C10932.m27740(ClassTransform.BOOLEAN, "Whether the app is enabled.")).add("minSdk", C10932.m27743("integer", "Minimum Android API level.")).add("targetSdk", C10932.m27743("integer", "Target Android API level.")).add("size", C10932.m27743("integer", "Total base and split APK bytes, excluding data and cache.")).add("baseApkSize", C10932.m27743("integer", "Base APK bytes.")).add("splitCount", C10932.m27740("integer", "Additional APK count, excluding base.")), "string", "Copy to mt_apk_workspace_open.path; resolves the currently installed base APK.", MotionUtils.EASING_TYPE_PATH, "Metadata for one visible installed app. Unavailable fields are null."))).add("warnings", JSON.object().add("type", "array").add("items", C22783.m51386(JSON.object().add("code", C10932.m27740("string", "installed_apps_permission_denied: apps may be hidden by permissions. metadata_unavailable: candidate apps have unreadable metadata and may be omitted when their names cannot be matched.")), "integer", "For metadata_unavailable, the number of affected candidates encountered on this page, including omitted candidates. For installed_apps_permission_denied, 1 marks a restriction, not the number of hidden apps.", "count", "A restriction or metadata failure encountered while producing this page.")).add("description", "With warnings, even an empty last page does not prove an app is absent. Resolve permission restrictions or retry the query before concluding it is not installed.")).add("pagination", C10932.m27736("Apps returned on this page.", "Maximum page size.", "Not calculated for this listing; always null. Use hasMore to decide whether to continue.")), "Installed app page."), C10932.m27741(C14815.m35667()), C10932.m27737("Next-page action; copy its complete arguments.", C10932.m27732(C16237.m38540(), "mt_apk_continue", "continue")));
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36729(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        for (String str : jSONObject.names()) {
            if (!str.equals("query") && !str.equals("appType") && !str.equals("limit")) {
                throw m48044(str, jSONObject.get(str));
            }
        }
        String strM48042 = m48042(jSONObject, "query");
        String strM48043 = m48042(jSONObject, "appType");
        m48045(strM48042, strM48043);
        return m48043(strM48042, m48041(jSONObject.get("limit")), strM48043, "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1238 m48046(C14596 c14596, JSONObject jSONObject) throws C10186 {
        JSONObject jSONObject2 = c14596.f45982;
        String strM48042 = m48042(jSONObject2, "query");
        String strM48043 = m48042(jSONObject2, "appType");
        m48045(strM48042, strM48043);
        return m48043(strM48042, m48041(jSONObject.get("limit") == null ? JSON.value(c14596.f45983) : jSONObject.get("limit")), strM48043, m48042(c14596.f45980, "afterPackage"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1238 m48043(String str, int i, String str2, String str3) throws Throwable {
        C5648 c5648M29182 = C11613.m29182(str, i, str2, str3);
        JSONArray jSONArray = c5648M29182.f19512;
        String strM42757 = c5648M29182.f19509 ? C18326.m42757("installed_apps", "installed_apps", "", 0, C22121.m50076("query", str, "appType", str2).add("recommendedLimit", i).add("limitMax", 200), JSON.object().add("afterPackage", c5648M29182.f19510)) : null;
        JSONArray jSONArrayArray = JSON.array();
        JSONArray jSONArrayArray2 = JSON.array();
        if (strM42757 != null) {
            jSONArrayArray.add(C2729.m9064(C22121.m50076("workspaceId", "installed_apps", "editSessionId", "").add("nextCursor", strM42757).add("limit", i), "mt_apk_continue", "continue", "Continue installed apps"));
        }
        if (c5648M29182.f19511) {
            jSONArrayArray2.add(JSON.object().add("code", "installed_apps_permission_denied").add("count", 1));
        }
        if (c5648M29182.f19513 > 0) {
            jSONArrayArray2.add(JSON.object().add("code", "metadata_unavailable").add("count", c5648M29182.f19513));
        }
        return new C1238(C15300.m36728(C22121.m50076("query", str, "appType", str2).add("items", jSONArray).add("warnings", jSONArrayArray2).add("pagination", JSON.object().add("hasMore", c5648M29182.f19509).add("nextCursor", strM42757).add("returnedCount", jSONArray.size()).add("limitMax", 200).add("totalAvailableCount", JSON.NULL)), jSONArrayArray));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48042(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m48044(str, jSONValue);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48041(JSONValue jSONValue) throws C10186 {
        int iM31240;
        if (jSONValue != null) {
            try {
                if (jSONValue.isNumber() && (iM31240 = C12556.m31240(jSONValue)) >= 1 && iM31240 <= 200) {
                    return iM31240;
                }
            } catch (ArithmeticException | NumberFormatException unused) {
            }
        }
        throw m48044("limit", jSONValue);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48045(String str, String str2) throws C10186 {
        if (str.length() > 512) {
            throw m48044("query", JSON.value(str));
        }
        if (!str2.equals(ProviderConfigurationPermission.ALL_STR) && !str2.equals("user") && !str2.equals("system")) {
            throw m48044("appType", JSON.value(str2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m48044(String str, JSONValue jSONValue) {
        return C10186.m26301("Invalid installed app query argument", str, jSONValue, JSON.array(), C22121.m50076("query", "", "appType", ProviderConfigurationPermission.ALL_STR).add("limit", 50));
    }
}
