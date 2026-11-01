package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩺᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H79G */
/* JADX INFO: loaded from: classes.dex */
public final class C23284 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f75520;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21872 f75521;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f75522;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_read_text";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Use this when you need text from a known APK locator string: zip_entry text, decoded axml, dex_class smali, dex_method smali, or dex_field smali. Returned text is LF-normalized. Ordinary zip_entry text is decoded only up to the first 10485760 uncompressed bytes (10 MiB); source truncation cannot be bypassed by paging. For editable locators (zip_entry, axml, dex_class, dex_method), copy data.targetVersion to mt_apk_edit_text; dex_field is read-only and its targetVersion is informational. startLine/startColumn are read positions only, and edit_text does not accept line coordinates. Copy the full locator string exactly. Do not use this for resource table values or raw ZIP entry bytes; use mt_apk_resource_read for resource locators and mt_apk_read_bytes for zip_entry bytes. Continue pages via nextActions.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Read APK Text";
    }

    public C23284(C21872 c21872) {
        this.f75521 = c21872;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f75520;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to read the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Copy the full locator string returned by nextActions, mt_apk_list, mt_apk_dex_read_class_outline, or mt_apk_search. Accepted prefixes: zip_entry:, axml:, dex_class:, dex_method:, dex_field:. dex_class requires a dex descriptor such as dex_class:Lcom/example/Foo;.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Text page line count. Pass 500 by default; maximum 2000.\"\n  },\n  \"maxChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum code points in data.textWindow.text. Pass 49152 by default; maximum 131072.\"\n  },\n  \"startLine\": {\n    \"type\": \"integer\",\n    \"description\": \"0-based first line within this read target. Pass 0 by default. For dex_method and dex_field this is member-relative, not class-smali absolute. Smali .line N directives are original Java source debug lines; do not use them as read_text positions. edit_text does not accept line coordinates.\"\n  },\n  \"startColumn\": {\n    \"type\": \"integer\",\n    \"description\": \"0-based code point column within startLine. Pass 0 by default.\"\n  }\n}\n");
        this.f75520 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f75522;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM32897 = C13406.m32897();
        this.f75522 = jSONObjectM32897;
        return jSONObjectM32897;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3195(c12731, JSON.object().add("suggestedLocator", C10413.m26320(c12731.f42468.get("suggestedLocator"))), c12731.f42471);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        try {
            return this.f75521.m48649(C17638.m41074(jSONObject), new C15283());
        } finally {
            int i = C23044.f74862;
        }
    }
}
