package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7AG */
/* JADX INFO: loaded from: classes4.dex */
public final class C7601 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f25092;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f25093;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f25094;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Open APK";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Open an APK workspace before inspecting its contents or creating an edit session. Find installed apps with mt_apk_list_installed_apps, APK files in Home with mt_apk_list_available_apks, or saved workspaces with mt_apk_workspace_list, then copy the returned path. Installed-app targets (mt://installed-app/<packageName>) open the current base APK only, excluding split APKs. Prefer a reusable workspace for extensive Smali analysis or searches. Follow nextActions to inspect the opened workspace.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_workspace_open";
    }

    public C7601(C1897 c1897) {
        this.f25093 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f25092;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"path\": {\n    \"type\": \"string\",\n    \"description\": \"Copy data.items[].path returned by mt_apk_list_installed_apps, mt_apk_list_available_apks, or mt_apk_workspace_list. Use ${CURRENT_APK_PATH} only for the APK selected in MT's APK information dialog, not the app currently in the foreground; mt_apk_list_available_apks returns this target when available. Saved workspace paths (${WORKSPACE_PATH_PREFIX}<workspaceId>) require temporary=false. You may also pass a Home-relative APK path or an allowed absolute APK path. Relative paths must remain inside Home after normalization. Other URI forms, backslashes, and empty paths are rejected.\"\n  },\n  \"temporary\": {\n    \"type\": \"boolean\",\n    \"description\": \"Set true for a disposable workspace: always creates a fresh workspace that can be inspected, edited, built, and deleted as a whole with mt_apk_workspace_delete, but cannot be reopened using ${WORKSPACE_PATH_PREFIX}<workspaceId>. Set false for a reusable workspace to be kept long-term or revisited later. Reopening a saved workspace requires false.\"\n  }\n}\n".replace("${CURRENT_APK_PATH}", "mt://current-apk").replace("${WORKSPACE_PATH_PREFIX}", "mt://workspace/"));
        this.f25092 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f25094;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM27734 = C10932.m27734("Result for mt_apk_workspace_open. data returns workspaceId, temporary status, compact APK summaries, capability flags, and signing certificate summaries; nextActions carries executable inspect, retry, or optional temporary cleanup calls.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id to pass to the APK listing tools, mt_apk_dex_read_class_outline, mt_apk_read_text, mt_apk_read_bytes, mt_apk_resource_read, mt_apk_search, mt_apk_dex_xref, mt_apk_resource_xref, or mt_apk_continue.")).add("temporary", C10932.m27740(ClassTransform.BOOLEAN, "Whether this workspace was opened as a one-time temporary workspace. Delete temporary workspaces with mt_apk_workspace_delete after they are no longer needed. Keep ordinary workspaces because they are reusable; delete an ordinary workspace only when the user explicitly asks or clearly confirms it is no longer needed.")).add("apkFileName", C10932.m27743("string", "Opened APK file name.")).add("packageName", C10932.m27743("string", "Manifest package name when available.")).add("versionName", C10932.m27743("string", "Manifest versionName when available.")).add("versionCode", C10932.m27743("integer", "Manifest versionCode when available.")).add("minSdk", C10932.m27743("integer", "Manifest minSdk when available.")).add("targetSdk", C10932.m27743("integer", "Manifest targetSdk when available.")).add("appLabel", C10932.m27743("string", "Resolved or raw application label when available.")).add("installedApp", C10932.m27739(C10932.m27731(JSON.object().add("packageName", C10932.m27740("string", "Installed package resolved when opening.")).add("splitCount", C10932.m27740("integer", "Additional split APK count, excluding the opened base APK.")), "Installed app source, or null for other targets. This workspace includes only the base APK; split APKs are not included."))).add("counts", C10932.m27739(C10932.m27731(JSON.object().add("zipEntries", C10932.m27740("integer", "ZIP entry count.")).add("dexEntries", C10932.m27740("integer", "DEX entry count.")).add("xmlEntries", C10932.m27740("integer", "XML-looking entry count.")).add("classes", C10932.m27740("integer", "DEX class count when a dex summary is available.")), "Compact counts for major APK structures."))).add("capabilities", C10932.m27739(C10932.m27731(JSON.object().add("canReadAxml", C10932.m27740(ClassTransform.BOOLEAN, "AXML decode/read support.")).add("canSearchDexNames", C10932.m27740(ClassTransform.BOOLEAN, "Whether dex name search is available.")).add("canSearchDexStrings", C10932.m27740(ClassTransform.BOOLEAN, "Whether dex string search is available.")).add("canReadResourceTable", C10932.m27740(ClassTransform.BOOLEAN, "Whether resource table listing and reading are available.")), "Available APK analysis features for follow-up calls."))).add("signature", C17799.m41655(false)).add("resourceTableSummaryError", C10932.m27743("string", "resources.arsc summary error, or null.")), "Successful mt_apk_workspace_open data."), C10932.m27741(C10932.m27731(JSON.object(), "No mt_apk_workspace_open-specific diagnostics; call mt_apk_list_available_apks from nextActions to inspect available APK files.")), C10932.m27737("Executable inspect, retry, or optional temporary cleanup actions; copy arguments directly.", C10932.m27732(C16237.m38550(), "mt_apk_read_text", "inspect"), C10932.m27732(C22783.m51386(JSON.object().add("prefix", C10932.m27740("string", "Relative APK path prefix; empty string means no filter and may include the current APK sentinel.")), "integer", "Page size; recommended value is 50 and maximum is 200.", "limit", "Arguments for mt_apk_list_available_apks."), "mt_apk_list_available_apks", "inspect"), C10932.m27732(C16237.m38549(), "mt_apk_list_entries", "inspect"), C10932.m27732(C16237.m38543(), "mt_apk_dex_list_classes", "inspect"), C10932.m27732(C16237.m38547(), "mt_apk_resource_list", "inspect"), C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry"), C10932.m27732(C22783.m51386(JSON.object(), "string", "Temporary workspace id to close only when this workspace is no longer needed; close deletes the temporary workspace and associated state, including edit sessions.", "workspaceId", "Arguments for mt_apk_workspace_delete."), "mt_apk_workspace_delete", "cleanup")));
        this.f25094 = jSONObjectM27734;
        return jSONObjectM27734;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        try {
            C10099 c10099M13982 = C4375.m13982(jSONObject);
            C1919 c1919 = c10099M13982.f32350;
            C21114 c21114M20776 = m20776(c10099M13982);
            int i = C24294.f78630;
            JSONObject jSONObjectM20775 = m20775(c21114M20776);
            if (c1919 != null) {
                jSONObjectM20775.add("installedApp", JSON.object().add("packageName", c1919.f6452).add("splitCount", c1919.f6453));
            }
            JSONObject jSONObjectM38676 = C16307.m38676(jSONObjectM20775);
            this.f25093.m6556(c21114M20776.f67446);
            return new C1238(jSONObjectM38676);
        } catch (Throwable th) {
            int i2 = C24294.f78630;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21114 m20776(C10099 c10099) throws C10186 {
        String str = c10099.f32353;
        String strM55860 = (str == null && c10099.f32352 == null) ? C25040.m55860() : str;
        C1897 c1897 = this.f25093;
        if (strM55860 == null) {
            return c1897.m6553(c10099);
        }
        String strM2304 = C0470.m2304(strM55860, MotionUtils.EASING_TYPE_PATH);
        if (str == null) {
            c10099 = new C10099(strM2304, null, c10099.f32351, c10099.f32354);
        }
        C19225 c19225M26483 = C20015.m46049().m26483(strM2304);
        try {
            C21114 c21114M6553 = c1897.m6553(c10099);
            c19225M26483.close();
            return c21114M6553;
        } catch (Throwable th) {
            try {
                c19225M26483.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m20775(C21114 c21114) {
        JSONObject jSONObjectObject = JSON.object();
        ArrayList arrayList = c21114.f67441;
        boolean z = c21114.f67439;
        String str = c21114.f67446;
        JSONObject jSONObjectAdd = jSONObjectObject.add("zipEntries", arrayList.size()).add("dexEntries", c21114.f67445.size()).add("xmlEntries", c21114.f67442).add("classes", c21114.f67443.f35857);
        JSONObject jSONObjectAdd2 = JSON.object().add("canReadAxml", true);
        boolean z2 = c21114.f67444;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("canSearchDexNames", z2).add("canSearchDexStrings", c21114.f67438);
        C9462 c9462 = c21114.f67437;
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("canReadResourceTable", c9462.f30674);
        JSONArray jSONArrayArray = JSON.array();
        C7139 c7139 = c21114.f67440;
        if (c7139.f23605) {
            jSONArrayArray.add(C2729.m9064(C22121.m50076("workspaceId", str, "editSessionId", "").add("locator", C4375.m13906("axml", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "inspect", "Read decoded AndroidManifest.xml"));
        }
        jSONArrayArray.add(C2729.m9064(C22121.m50076("workspaceId", str, "editSessionId", "").add("prefix", "").add("limit", 200), "mt_apk_list_entries", "inspect", "List APK ZIP entries"));
        if (z2) {
            jSONArrayArray.add(C2729.m9064(C22121.m50076("workspaceId", str, "editSessionId", "").add("prefix", "").add("limit", 200), "mt_apk_dex_list_classes", "inspect", "List dex classes"));
        }
        if (c9462.f30674) {
            jSONArrayArray.add(C2729.m9064(C22121.m50076("workspaceId", str, "editSessionId", "").add("view", "resource_table").add("typeName", "*").add("variant", "*").add("limit", 200), "mt_apk_resource_list", "inspect", "List resource table"));
        }
        if (z) {
            jSONArrayArray.add(C2729.m9064(JSON.object().add("workspaceId", str), "mt_apk_workspace_delete", "cleanup", "Clean up this temporary workspace only after it is no longer needed"));
        }
        String str2 = c7139.f23603;
        if (str2 == null) {
            str2 = c7139.f23610;
        }
        JSONObject jSONObjectAdd5 = JSON.object().add("workspaceId", str).add("temporary", z);
        String str3 = c21114.f67436;
        if (str3 != null) {
            jSONObjectAdd5.add("apkFileName", str3);
        }
        String str4 = c7139.f23607;
        if (str4 != null) {
            jSONObjectAdd5.add("packageName", str4);
        }
        String str5 = c7139.f23606;
        if (str5 != null) {
            jSONObjectAdd5.add("versionName", str5);
        }
        m20777(jSONObjectAdd5, "versionCode", c7139.f23602);
        m20777(jSONObjectAdd5, "minSdk", c7139.f23608);
        m20777(jSONObjectAdd5, "targetSdk", c7139.f23604);
        if (str2 != null) {
            jSONObjectAdd5.add("appLabel", str2);
        }
        jSONObjectAdd5.add("counts", jSONObjectAdd).add("capabilities", jSONObjectAdd4).add("signature", C17799.m41654(c21114.f67435, false)).add("nextActions", jSONArrayArray);
        String str6 = c9462.f30675;
        if (str6 != null) {
            jSONObjectAdd5.add("resourceTableSummaryError", str6);
        }
        return jSONObjectAdd5;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36730(c10186, JSON.NULL, c10186.f32599);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20777(JSONObject jSONObject, String str, String str2) {
        Long lValueOf = null;
        if (str2 != null && !str2.isEmpty()) {
            int i = 0;
            while (true) {
                if (i < str2.length()) {
                    char cCharAt = str2.charAt(i);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    try {
                        lValueOf = Long.valueOf(Long.parseLong(str2));
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        if (lValueOf != null) {
            jSONObject.add(str, lValueOf.longValue());
        }
    }
}
