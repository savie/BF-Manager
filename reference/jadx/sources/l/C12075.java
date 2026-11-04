package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V77Q */
/* JADX INFO: loaded from: classes.dex */
public final class C12075 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۛۙۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f38884;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f38885;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f38886;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f38887;

    static {
        ApplicationC23172.m52091(IShizukuService.Stub.TRANSACTION_attachUserService);
        f38884 = new short[]{336, 22957, 22965, 22952, 22961, 22953, 22954, 22971, 22969, 22975, 22931, 22974, 22975, 22974, 22963, 22958, 22921, 22975, 22953, 22953, 22963, 22965, 22964, 22931, 22974};
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public native C1238 mo1807(JSONObject jSONObject);

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Create APK Edit Session";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Create an isolated APK edit session from an immutable workspace. Choose semantic write tools when applicable: use mt_apk_native_patch_instructions for executable ELF instructions, mt_apk_native_patch_string for ELF UTF-8 strings, mt_apk_edit_text for text targets, and mt_apk_resource_edit for resource values. Use mt_apk_patch_bytes as the raw-byte fallback only when exact bytes are intentionally required or no semantic editor applies. The base workspace remains unchanged, and multiple sessions for the same workspace are independent. Pass the returned editSessionId to every follow-up read, search, analyze, continue, edit, check, or build tool that accepts editSessionId; use an empty string only when you intentionally want the base workspace.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_session_create";
    }

    public C12075(C1897 c1897) {
        this.f38886 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f38885;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  }\n}\n");
        this.f38885 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f38887;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM17637 = C6110.m17637();
        this.f38887 = jSONObjectM17637;
        return jSONObjectM17637;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C6110.m17634(c10186);
    }
}
