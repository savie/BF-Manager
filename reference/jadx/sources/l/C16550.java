package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܺۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0780 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16550 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f53568;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f53569;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f53570;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Build APK";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Build the current edit session into a new APK without modifying the source APK. All saved edits and deletions are included. Existing ZIP entries keep their compression method; new entries use APK compression rules. For pre-build content checks without producing an APK, use mt_apk_session_check with runBuildChecks=true; passing them does not guarantee this build will succeed. Use nextActions to inspect the built APK.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_build";
    }

    public C16550(C1897 c1897) {
        this.f53569 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f53568;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"outputPath\": {\n    \"type\": \"string\",\n    \"description\": \"Output APK absolute path or Home-relative path, including subdirectories. Relative paths must stay inside Home; URIs are not accepted. The file and its existing parent directory must have MCP read-write access. Missing parent directories are not created. Use an empty string for <sourceBase>_mcp_<editSessionId>_sign.apk or <sourceBase>_mcp_<editSessionId>_unsigned.apk in Home; overwrite applies to this default path too.\"\n  },\n  \"overwrite\": {\n    \"type\": \"boolean\",\n    \"description\": \"Applies to both default and explicit output paths. If the output exists and overwrite=false, returns OUTPUT_ALREADY_EXISTS. Pass true only to allow replacement.\"\n  },\n  \"sign\": {\n    \"type\": \"boolean\",\n    \"description\": \"Pass true normally to sign with the key configured in MT MCP settings. false skips signing but may preserve original signature data; it does not guarantee a valid signature on the changed APK.\"\n  }\n}\n");
        this.f53568 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c10186.f32602;
        return C15300.m36730(c10186, C8008.m21874(jSONObject, "outputPath", C8008.m21874(jSONObject, "editSessionId", C8008.m21874(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId"), "outputPath").add("overlaySaved", jSONObject.getBoolean("overlaySaved", false)).add("failures", C14815.m35666(jSONObject.getJSONArray("failures"))), c10186.f32599);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f53570;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id used for this build.")).add("editSessionId", C10932.m27740("string", "Edit session id used for this build.")).add("outputPath", C10932.m27743("string", "Absolute path of the published APK output file.")).add("apkFileName", C10932.m27743("string", "Published APK file name.")).add("size", C10932.m27740("integer", "Published APK size in bytes.")).add("signingPerformed", C10932.m27740(ClassTransform.BOOLEAN, "Whether this build performed APK signing; false does not imply that preserved original signature data is absent.")).add("signSchemes", C10932.m27742("Signing schemes requested by MT MCP settings when signingPerformed=true; empty when signingPerformed=false."));
        JSONObject jSONObjectM41655 = C17799.m41655(false);
        jSONObjectM41655.put("description", "Signature data summary read without full verification. When build signingPerformed=false, this may still report original V1 entries or preserved V2/V3 data. Use mt_apk_read_signature after opening the built APK for full certificate attributes.");
        JSONObject jSONObjectM27734 = C10932.m27734("Result for mt_apk_build. data describes the published APK output, including signing results and changed dex/class counts.", C10932.m27731(jSONObjectAdd.add("signatureSummary", jSONObjectM41655).add("changedDexEntries", C10932.m27742("Dex entries rewritten or created during dex merge.")).add("changedClassCount", C10932.m27740("integer", "Modified or deleted class count applied to the build.")).add("deletedClassCount", C10932.m27740("integer", "Deleted class count applied to the build.")).add("addedZipEntries", C10932.m27742("New AXML or ordinary ZIP entries added by the edit session.")).add("changedZipEntries", C10932.m27742("Existing AXML or ordinary ZIP entries replaced by the edit session, including raw byte patches; resource patches appear here as resources.arsc.")).add("deletedZipEntries", C10932.m27742("Existing AXML or ordinary ZIP entries deleted by the edit session.")), "Successful build data."), C10932.m27741(C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id, or null.")).add("editSessionId", C10932.m27743("string", "Edit session id, or null.")).add("outputPath", C10932.m27743("string", "Output path related to the error, or null.")).add("overlaySaved", C10932.m27740(ClassTransform.BOOLEAN, "Only interpret for SMALI_COMPILE_FAILED_IN_SESSION or EDIT_TEXT_PREPARE_FAILED_IN_SESSION; true means the failing text was already saved in the edit session.")).add("failures", C22121.m50076("type", "array", "description", "Edit session prepare failures when build stops before packaging.").add("items", C10932.m27731(JSON.object().add("locator", C10932.m27743("string", "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates.")).add("className", C10932.m27743("string", "Dex class descriptor.")).add("errorCode", C10932.m27743("string", "Failure code.")).add("message", C10932.m27743("string", "Compiler error message.")).add("line", C10932.m27743("integer", "0-based line, or null.")).add("column", C10932.m27743("integer", "0-based column, or null.")), "One edit session prepare failure."))), "Build diagnostics.")), C10932.m27737("Successful build returns mt_apk_workspace_open with temporary=true for the published APK.", C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "inspect")));
        this.f53570 = jSONObjectM27734;
        return jSONObjectM27734;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        C1897 c1897 = this.f53569;
        try {
            C16834.m39750();
            C9113 c9113M51885 = C20015.m46048().m51885();
            C3388 c3388M13910 = C4375.m13910(jSONObject, c9113M51885);
            String str = c3388M13910.f11035;
            C10801.m27507(str);
            String parent = str.startsWith("/") ? C14584.m35193(str, new String[0]).getParent() : c9113M51885.f29601;
            if (parent == null) {
                parent = str;
            }
            if (str.startsWith("/")) {
                c9113M51885.m24270(str);
                c9113M51885.m24269(str);
            }
            c9113M51885.m24270(parent);
            C19225 c19225M26486 = C20015.m46049().m26486(parent);
            try {
                InterfaceC18854 interfaceC18854M6559 = c1897.m6559();
                try {
                    C11417 c11417M6546 = c1897.m6546(c3388M13910, c9113M51885.f29601);
                    int i = C24294.f78630;
                    C1238 c1238 = new C1238(C18450.m42984(c11417M6546));
                    interfaceC18854M6559.close();
                    c19225M26486.close();
                    return c1238;
                } catch (Throwable th) {
                    try {
                        interfaceC18854M6559.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c19225M26486.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            int i2 = C24294.f78630;
            throw th5;
        }
    }
}
