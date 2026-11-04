package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩸᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H79G */
/* JADX INFO: loaded from: classes.dex */
public final class C23021 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f74711;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20037 f74712;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f74713;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Read APK Text";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Use this when you need text from a known APK locator string: zip_entry text, decoded axml, dex_class smali, dex_method smali, or dex_field smali. For DEX class or method logic, first use mt_apk_dex_read_pseudocode. Use Smali only when exact instructions or editing are needed, generation fails, or questions remain after reading the relevant pseudocode pages. Truncated pages should be continued, not treated as generation failures. Read dex_field directly for field inspection. Returned text is LF-normalized. Ordinary zip_entry text is decoded only up to the first 10485760 uncompressed bytes (10 MiB); source truncation cannot be bypassed by paging. For editable locators (zip_entry, axml, dex_class, dex_method), copy data.targetVersion to mt_apk_edit_text; dex_field is read-only and its targetVersion is informational. startLine/startColumn are read positions only, and edit_text does not accept line coordinates. Copy the full locator string exactly. Do not use this for resource table values or raw ZIP entry bytes; use mt_apk_resource_read for resource locators and mt_apk_read_bytes for zip_entry bytes. Continue pages via nextActions.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_read_text";
    }

    public C23021(C20037 c20037) {
        this.f74712 = c20037;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f74711;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to read the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Copy the full locator string returned by nextActions, the APK listing tools, mt_apk_dex_read_class_outline, or mt_apk_search. Accepted prefixes: zip_entry:, axml:, dex_class:, dex_method:, dex_field:. dex_class requires a dex descriptor such as dex_class:Lcom/example/Foo;.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Text page line count. Pass 500 by default; maximum 2000.\"\n  },\n  \"maxChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum code points in data.textWindow.text. Pass 49152 by default; maximum 131072.\"\n  },\n  \"startLine\": {\n    \"type\": \"integer\",\n    \"description\": \"0-based first line within this read target. Pass 0 by default. For dex_method and dex_field this is member-relative, not class-smali absolute. Smali .line N directives are original Java source debug lines; do not use them as read_text positions. edit_text does not accept line coordinates.\"\n  },\n  \"startColumn\": {\n    \"type\": \"integer\",\n    \"description\": \"0-based code point column within startLine. Pass 0 by default.\"\n  }\n}\n");
        this.f74711 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f74713;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19082 = C6855.m19082();
        this.f74713 = jSONObjectM19082;
        return jSONObjectM19082;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36730(c10186, JSON.object().add("suggestedLocator", C12556.m31239(c10186.f32602.get("suggestedLocator"))), c10186.f32599);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        try {
            return this.f74712.m46094(C4375.m13889(jSONObject), new C4156());
        } finally {
            int i = C24294.f78630;
        }
    }
}
