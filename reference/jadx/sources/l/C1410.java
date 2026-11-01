package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.֨᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 779S */
/* JADX INFO: loaded from: classes2.dex */
public final class C1410 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f5830;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21872 f5831;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f5832;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_read_bytes";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Use this when you need raw bytes from a known zip_entry locator, whether the entry is text or binary, in the base workspace or an edit session. It returns uppercase hex bytes in data.byteWindow.hex. It accepts only zip_entry: locator strings; AXML and resources.arsc bytes include edits from the selected session. Do not use this for dex smali text, resource table values, virtual addresses, or ELF section addresses. Continue byte pages via nextActions.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Read APK Bytes";
    }

    public C1410(C21872 c21872) {
        this.f5831 = c21872;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f5830;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to keep reading in the edited session context; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:classes.dex. The zip_entry: prefix is required.\"\n  },\n  \"byteOffset\": {\n    \"type\": \"integer\",\n    \"description\": \"Byte offset for the first page. Pass 0 by default.\"\n  },\n  \"maxBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum bytes to return on this page. Pass 256 by default; maximum 65536.\"\n  }\n}\n");
        this.f5830 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f5832;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM32887 = C13406.m32887();
        this.f5832 = jSONObjectM32887;
        return jSONObjectM32887;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3195(c12731, JSON.object().add("failures", C6349.m17454(c12731.f42468.getJSONArray("failures"))), c12731.f42471);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        try {
            return this.f5831.m48649(C17638.m41072(jSONObject), new C15283());
        } finally {
            int i = C23044.f74862;
        }
    }
}
