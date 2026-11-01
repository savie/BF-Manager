package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۛۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 0780 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5852 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f19820;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f19821;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f19822;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_build";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Build the current edit session into a new APK without modifying the source APK. For pre-build content checks without producing an APK, use mt_apk_session_check with runBuildChecks=true; passing them does not guarantee this build will succeed. All saved text, resource, byte edits, and deletions are included. Existing ZIP entries keep their compression method; new entries use APK compression rules. sign=true uses the signing key configured in MT MCP settings. sign=false skips signing but may preserve original signature data; it does not guarantee a valid signature on the changed APK. outputName is a file name in Home or an absolute path. The output file and its existing parent directory must have read-write access under the MCP file policy. An empty name selects <sourceBase>_mcp_<editSessionId>_sign.apk or <sourceBase>_mcp_<editSessionId>_unsigned.apk with the same overwrite policy as an explicit name. overwrite=false rejects an existing file; pass true only to allow replacement. Use nextActions to inspect the built APK.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Build APK";
    }

    public C5852(C7845 c7845) {
        this.f19821 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f19820;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"outputName\": {\n    \"type\": \"string\",\n    \"description\": \"Output APK file name in Home or an absolute path. The file and its existing parent directory must have MCP read-write access. Relative directory paths and URIs are not accepted. Use an empty string for the default name.\"\n  },\n  \"overwrite\": {\n    \"type\": \"boolean\",\n    \"description\": \"Applies to both default and explicit output names. If the output exists and overwrite=false, returns OUTPUT_ALREADY_EXISTS. Pass true only to allow replacement.\"\n  },\n  \"sign\": {\n    \"type\": \"boolean\",\n    \"description\": \"Required. Pass true normally to sign the output APK, or false to skip signing.\"\n  }\n}\n");
        this.f19820 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c12731.f42468;
        return C0735.m3195(c12731, C11445.m28557(jSONObject, "outputPath", C11445.m28557(jSONObject, "editSessionId", C11445.m28557(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId"), "outputPath").add("overlaySaved", jSONObject.getBoolean("overlaySaved", false)).add("failures", C6349.m17454(jSONObject.getJSONArray("failures"))), c12731.f42471);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f19822;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id used for this build.")).add("editSessionId", C4969.m13786("string", "Edit session id used for this build.")).add("outputPath", C4969.m13789("string", "Absolute path of the published APK output file.")).add("apkFileName", C4969.m13789("string", "Published APK file name.")).add("size", C4969.m13786("integer", "Published APK size in bytes.")).add("signingPerformed", C4969.m13786(ClassTransform.BOOLEAN, "Whether this build performed APK signing; false does not imply that preserved original signature data is absent.")).add("signSchemes", C4969.m13788("Signing schemes requested by MT MCP settings when signingPerformed=true; empty when signingPerformed=false."));
        JSONObject jSONObjectM26761 = C10584.m26761(false);
        jSONObjectM26761.put("description", "Signature data summary read without full verification. When build signingPerformed=false, this may still report original V1 entries or preserved V2/V3 data. Use mt_apk_read_signature after opening the built APK for full certificate attributes.");
        JSONObject jSONObjectM13780 = C4969.m13780("Result for mt_apk_build. data describes the published APK output, including signing results and changed dex/class counts.", C4969.m13777(jSONObjectAdd.add("signatureSummary", jSONObjectM26761).add("changedDexEntries", C4969.m13788("Dex entries rewritten or created during dex merge.")).add("changedClassCount", C4969.m13786("integer", "Modified or deleted class count applied to the build.")).add("deletedClassCount", C4969.m13786("integer", "Deleted class count applied to the build.")).add("addedZipEntries", C4969.m13788("New AXML or ordinary ZIP entries added by the edit session.")).add("changedZipEntries", C4969.m13788("Existing AXML or ordinary ZIP entries replaced by the edit session, including raw byte patches; resource patches appear here as resources.arsc.")).add("deletedZipEntries", C4969.m13788("Existing AXML or ordinary ZIP entries deleted by the edit session.")), "Successful build data."), C4969.m13787(C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id, or null.")).add("editSessionId", C4969.m13789("string", "Edit session id, or null.")).add("outputPath", C4969.m13789("string", "Output path related to the error, or null.")).add("overlaySaved", C4969.m13786(ClassTransform.BOOLEAN, "Only interpret for SMALI_COMPILE_FAILED_IN_SESSION or EDIT_TEXT_PREPARE_FAILED_IN_SESSION; true means the failing text was already saved in the edit session.")).add("failures", C3184.m9603("type", "array", "description", "Edit session prepare failures when build stops before packaging.").add("items", C4969.m13777(JSON.object().add("locator", C4969.m13789("string", "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates.")).add("className", C4969.m13789("string", "Dex class descriptor.")).add("errorCode", C4969.m13789("string", "Failure code.")).add("message", C4969.m13789("string", "Compiler error message.")).add("line", C4969.m13789("integer", "0-based line, or null.")).add("column", C4969.m13789("integer", "0-based column, or null.")), "One edit session prepare failure."))), "Build diagnostics.")), C4969.m13783("Successful build returns mt_apk_workspace_open with temporary=true for the published APK.", C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "inspect")));
        this.f19822 = jSONObjectM13780;
        return jSONObjectM13780;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        C7845 c7845 = this.f19821;
        try {
            C11755.m29361();
            C15607 c15607M41023 = C17638.m41023(jSONObject);
            String str = c15607M41023.f50746;
            C3070 c3070M37800 = C20119.m45481().m37800();
            String parent = str.startsWith("/") ? C5553.m15313(str, new String[0]).getParent() : c3070M37800.f11564;
            if (parent == null) {
                parent = str;
            }
            if (str.startsWith("/")) {
                c3070M37800.m9207(str);
                c3070M37800.m9210(str);
            }
            c3070M37800.m9207(parent);
            C11268 c11268M52812 = C20119.m45482().m52812(parent);
            try {
                InterfaceC7855 interfaceC7855M20724 = c7845.m20724();
                try {
                    C18073 c18073M20713 = c7845.m20713(c15607M41023, c3070M37800.f11564);
                    int i = C23044.f74862;
                    C17669 c17669 = new C17669(C1323.m4720(c18073M20713));
                    interfaceC7855M20724.close();
                    c11268M52812.close();
                    return c17669;
                } catch (Throwable th) {
                    try {
                        interfaceC7855M20724.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c11268M52812.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            int i2 = C23044.f74862;
            throw th5;
        }
    }
}
