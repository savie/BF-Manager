package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۖ᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: U7AG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2821 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f10705;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f10706;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f10707;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_workspace_open";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Use first. Open a read-only APK workspace. Inputs are path and temporary: use \"mt://current-apk\" for the current APK file, data.items[].path (\"mt://workspace/<workspaceId>\") returned by mt_apk_workspace_list with temporary=false to reopen an existing non-temporary workspace, or an allowed absolute path or Home-relative APK path. mt_apk_list_available_apks returns Home-relative paths that can be passed directly. Set temporary=true for one-time workspaces that may be inspected, edited, built, then deleted as a whole. Temporary workspaces are intended for targeted verification; prefer a reusable workspace for extensive Smali analysis or searches. Set false when the same workspace may need to be reused, reopened, kept long-term, or revisited later. Returns workspaceId, temporary, apkFileName, compact manifest/count/capability/signature summaries, and inspect nextActions.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Open APK";
    }

    public C2821(C7845 c7845) {
        this.f10706 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f10705;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"path\": {\n    \"type\": \"string\",\n    \"description\": \"Path target for mt_apk_workspace_open. Use ${CURRENT_APK_PATH} exactly when the user asks to analyze the current APK or current app. Pass items[i].path (${WORKSPACE_PATH_PREFIX}<workspaceId>) returned by mt_apk_workspace_list with temporary=false when reopening an existing non-temporary workspace. Otherwise pass items[i].path returned by mt_apk_list_available_apks, another Home-relative APK path, or an allowed absolute APK path. Relative paths are resolved against the current Home and may contain dot segments only when the normalized result remains inside Home. URI forms, backslashes, and empty paths are rejected.\"\n  },\n  \"temporary\": {\n    \"type\": \"boolean\",\n    \"description\": \"Set true for one-time generated, candidate, comparison, or diagnostic APK workspaces that may be inspected, edited, built, then deleted as a whole. temporary=true always creates a fresh workspace, is not reused by path, cannot be reopened with ${WORKSPACE_PATH_PREFIX}<workspaceId>, and may later be deleted by mt_apk_workspace_delete. Set false when the same workspace may need to be reused, reopened, kept long-term, or revisited later.\"\n  }\n}\n".replace("${CURRENT_APK_PATH}", "mt://current-apk").replace("${WORKSPACE_PATH_PREFIX}", "mt://workspace/"));
        this.f10705 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f10707;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13780 = C4969.m13780("Result for mt_apk_workspace_open. data returns workspaceId, temporary status, compact APK summaries, capability flags, and signing certificate summaries; nextActions carries executable inspect, retry, or optional temporary cleanup calls.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id to pass to mt_apk_list, mt_apk_dex_read_class_outline, mt_apk_read_text, mt_apk_read_bytes, mt_apk_resource_read, mt_apk_search, mt_apk_dex_xref, mt_apk_resource_xref, or mt_apk_continue.")).add("temporary", C4969.m13786(ClassTransform.BOOLEAN, "Whether this workspace was opened as a one-time temporary workspace. Delete temporary workspaces with mt_apk_workspace_delete after they are no longer needed. Keep ordinary workspaces because they are reusable; delete an ordinary workspace only when the user explicitly asks or clearly confirms it is no longer needed.")).add("apkFileName", C4969.m13789("string", "Opened APK file name.")).add("packageName", C4969.m13789("string", "Manifest package name when available.")).add("versionName", C4969.m13789("string", "Manifest versionName when available.")).add("versionCode", C4969.m13789("integer", "Manifest versionCode when available.")).add("minSdk", C4969.m13789("integer", "Manifest minSdk when available.")).add("targetSdk", C4969.m13789("integer", "Manifest targetSdk when available.")).add("appLabel", C4969.m13789("string", "Resolved or raw application label when available.")).add("counts", C4969.m13785(C4969.m13777(JSON.object().add("zipEntries", C4969.m13786("integer", "ZIP entry count.")).add("dexEntries", C4969.m13786("integer", "DEX entry count.")).add("xmlEntries", C4969.m13786("integer", "XML-looking entry count.")).add("classes", C4969.m13786("integer", "DEX class count when a dex summary is available.")), "Compact counts for major APK structures."))).add("capabilities", C4969.m13785(C4969.m13777(JSON.object().add("canReadAxml", C4969.m13786(ClassTransform.BOOLEAN, "AXML decode/read support.")).add("canSearchDexNames", C4969.m13786(ClassTransform.BOOLEAN, "Whether dex name search is available.")).add("canSearchDexStrings", C4969.m13786(ClassTransform.BOOLEAN, "Whether dex string search is available.")).add("canReadResourceTable", C4969.m13786(ClassTransform.BOOLEAN, "Whether resource table listing and reading are available.")), "Available APK analysis features for follow-up calls."))).add("signature", C10584.m26761(false)).add("resourceTableSummaryError", C4969.m13789("string", "resources.arsc summary error, or null.")), "Successful mt_apk_workspace_open data."), C4969.m13787(C4969.m13777(JSON.object(), "No mt_apk_workspace_open-specific diagnostics; call mt_apk_list_available_apks from nextActions to inspect available APK files.")), C4969.m13783("Executable inspect, retry, or optional temporary cleanup actions; copy arguments directly.", C4969.m13778(C13530.m33069(), "mt_apk_read_text", "inspect"), C4969.m13778(C18828.m43457(JSON.object().add("prefix", C4969.m13786("string", "Relative APK path prefix; empty string means no filter and may include the current APK sentinel.")), "integer", "Page size; recommended value is 50 and maximum is 200.", "limit", "Arguments for mt_apk_list_available_apks."), "mt_apk_list_available_apks", "inspect"), C4969.m13778(C13530.m33058(), "mt_apk_list", "inspect"), C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry"), C4969.m13778(C18828.m43457(JSON.object(), "string", "Temporary workspace id to close only when this workspace is no longer needed; close deletes the temporary workspace and associated state, including edit sessions.", "workspaceId", "Arguments for mt_apk_workspace_delete."), "mt_apk_workspace_delete", "cleanup")));
        this.f10707 = jSONObjectM13780;
        return jSONObjectM13780;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        try {
            C12430 c12430M8564 = m8564(C17638.m41106(jSONObject));
            int i = C23044.f74862;
            JSONObject jSONObjectM20417 = C7761.m20417(m8563(c12430M8564));
            this.f10706.m20720(c12430M8564.f41478);
            return new C17669(jSONObjectM20417);
        } catch (Throwable th) {
            int i2 = C23044.f74862;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12430 m8564(C1494 c1494) {
        String str = c1494.f6031;
        String strM33715 = (str == null && c1494.f6030 == null) ? C13872.m33715() : str;
        C7845 c7845 = this.f10706;
        if (strM33715 == null) {
            return c7845.m20708(c1494);
        }
        String strM17479 = C6370.m17479(strM33715, MotionUtils.EASING_TYPE_PATH);
        if (str == null) {
            c1494 = new C1494(strM17479, null, c1494.f6033, c1494.f6032);
        }
        C11268 c11268M52809 = C20119.m45482().m52809(strM17479);
        try {
            C12430 c12430M20708 = c7845.m20708(c1494);
            c11268M52809.close();
            return c12430M20708;
        } catch (Throwable th) {
            try {
                c11268M52809.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m8563(C12430 c12430) {
        JSONObject jSONObjectObject = JSON.object();
        ArrayList arrayList = c12430.f41477;
        boolean z = c12430.f41472;
        String str = c12430.f41478;
        JSONObject jSONObjectAdd = jSONObjectObject.add("zipEntries", arrayList.size()).add("dexEntries", c12430.f41468.size()).add("xmlEntries", c12430.f41476).add("classes", c12430.f41471.f12190);
        JSONObject jSONObjectAdd2 = JSON.object().add("canReadAxml", true);
        boolean z2 = c12430.f41475;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("canSearchDexNames", z2).add("canSearchDexStrings", c12430.f41473);
        C18469 c18469 = c12430.f41474;
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("canReadResourceTable", c18469.f58847);
        JSONArray jSONArrayArray = JSON.array();
        C0465 c0465 = c12430.f41467;
        if (c0465.f2099) {
            jSONArrayArray.add(C11320.m28376(C3184.m9603("workspaceId", str, "editSessionId", "").add("locator", C17638.m41044("axml", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "inspect", "Read decoded AndroidManifest.xml"));
        }
        jSONArrayArray.add(C11320.m28376(C3184.m9603("workspaceId", str, "editSessionId", "").add("view", "zip_entries").add("prefix", "").add("limit", 200), "mt_apk_list", "inspect", "List APK ZIP entries"));
        if (z2) {
            jSONArrayArray.add(C11320.m28376(C3184.m9603("workspaceId", str, "editSessionId", "").add("view", "dex_classes").add("prefix", "").add("limit", 200), "mt_apk_list", "inspect", "List dex classes"));
        }
        if (c18469.f58847) {
            jSONArrayArray.add(C11320.m28376(C3184.m9603("workspaceId", str, "editSessionId", "").add("view", "resource_table").add("prefix", "").add("limit", 200), "mt_apk_list", "inspect", "List resource table"));
        }
        if (z) {
            jSONArrayArray.add(C11320.m28376(JSON.object().add("workspaceId", str), "mt_apk_workspace_delete", "cleanup", "Clean up this temporary workspace only after it is no longer needed"));
        }
        String str2 = c0465.f2096;
        if (str2 == null) {
            str2 = c0465.f2101;
        }
        JSONObject jSONObjectAdd5 = JSON.object().add("workspaceId", str).add("temporary", z);
        String str3 = c12430.f41470;
        if (str3 != null) {
            jSONObjectAdd5.add("apkFileName", str3);
        }
        String str4 = c0465.f2093;
        if (str4 != null) {
            jSONObjectAdd5.add("packageName", str4);
        }
        String str5 = c0465.f2098;
        if (str5 != null) {
            jSONObjectAdd5.add("versionName", str5);
        }
        m8565(jSONObjectAdd5, "versionCode", c0465.f2095);
        m8565(jSONObjectAdd5, "minSdk", c0465.f2102);
        m8565(jSONObjectAdd5, "targetSdk", c0465.f2100);
        if (str2 != null) {
            jSONObjectAdd5.add("appLabel", str2);
        }
        jSONObjectAdd5.add("counts", jSONObjectAdd).add("capabilities", jSONObjectAdd4).add("signature", C10584.m26760(c12430.f41469, false)).add("nextActions", jSONArrayArray);
        String str6 = c18469.f58848;
        if (str6 != null) {
            jSONObjectAdd5.add("resourceTableSummaryError", str6);
        }
        return jSONObjectAdd5;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3195(c12731, JSON.NULL, c12731.f42471);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8565(JSONObject jSONObject, String str, String str2) {
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
