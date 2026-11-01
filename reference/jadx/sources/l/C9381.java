package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۢۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V77Q */
/* JADX INFO: loaded from: classes.dex */
public final class C9381 extends AbstractC16964 {

    /* JADX INFO: renamed from: ᩺ܰᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f31752;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f31753;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f31754;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f31755;

    static {
        ApplicationC6132.m17119(IShizukuService.Stub.TRANSACTION_isHidden);
        f31752 = new short[]{9999, -2912, -2888, -2907, -2884, -2908, -2905, -2890, -2892, -2894, -2914, -2893, -2894, -2893, -2882, -2909, -2940, -2894, -2908, -2908, -2882, -2888, -2887, -2914, -2893};
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_session_create";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public native C17669 mo1548(JSONObject jSONObject);

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Create an isolated APK edit session from an immutable workspace. Choose semantic write tools when applicable: use mt_apk_native_patch_instructions for executable ELF instructions, mt_apk_native_patch_string for ELF UTF-8 strings, mt_apk_edit_text for text targets, and mt_apk_resource_edit for resource values. Use mt_apk_patch_bytes as the raw-byte fallback only when exact bytes are intentionally required or no semantic editor applies. The base workspace remains unchanged, and multiple sessions for the same workspace are independent. Pass the returned editSessionId to every follow-up read, search, analyze, continue, edit, check, or build tool that accepts editSessionId; use an empty string only when you intentionally want the base workspace.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Create APK Edit Session";
    }

    public C9381(C7845 c7845) {
        this.f31754 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f31753;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  }\n}\n");
        this.f31753 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f31755;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM9038 = C3029.m9038();
        this.f31755 = jSONObjectM9038;
        return jSONObjectM9038;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C3029.m9036(c12731);
    }
}
