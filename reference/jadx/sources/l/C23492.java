package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩻ۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: J79X */
/* JADX INFO: loaded from: classes.dex */
public final class C23492 extends AbstractC16964 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C21872 f76059;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1160 f76060;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C9173 f76061;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17141 f76062;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20917 f76063;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C7845 f76064;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11995 f76065;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C19050 f76066;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f76067;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5644 f76068;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C2115 f76069;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_continue";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        return null;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Continue a paged APK result, including search pages, native ELF item pages from mt_apk_native_list_items, and native xref scan pages from mt_apk_native_xref. Call this tool only for an action with tool=mt_apk_continue and purpose=continue, or a cursor page with data.pagination.hasMore=true. Prefer copying workspaceId, editSessionId, nextCursor, and limit from the matching nextActions[].arguments. If you only have data.pagination.nextCursor, reuse data.workspaceId and data.editSessionId from the same result. For search and native_xref, data.pagination.totalAvailableCount may be null; null means unknown and must not stop continuation. The presence of nextActions alone does not imply pagination; follow each action's tool and purpose. Native disassembly continuation calls mt_apk_native_disassemble directly. Treat nextCursor as opaque and copy it unchanged. For mt_apk_list_available_apks continuation, copy workspaceId=\"available_apks\" and editSessionId=\"\" exactly. Do not include the original tool's arguments such as prefix, namePrefix, demangle, locator, query, itemKind, address, scanKind, referenceKinds, maxScanBytes, or byte offsets.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Continue APK Cursor";
    }

    public C23492(C7845 c7845, C11995 c11995, C5644 c5644, C21872 c21872, C9173 c9173, C2115 c2115, C19050 c19050, C17141 c17141, C1160 c1160, C20917 c20917) {
        this.f76064 = c7845;
        this.f76065 = c11995;
        this.f76068 = c5644;
        this.f76059 = c21872;
        this.f76061 = c9173;
        this.f76069 = c2115;
        this.f76066 = c19050;
        this.f76062 = c17141;
        this.f76060 = c1160;
        this.f76063 = c20917;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f76067;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id originally returned by mt_apk_workspace_open; copy it unchanged from nextActions[].arguments.workspaceId, or use data.workspaceId from the result that produced data.pagination.nextCursor. For mt_apk_list_available_apks continuation, pass the sentinel value available_apks exactly.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Copy nextActions[].arguments.editSessionId when available; otherwise use data.editSessionId from the result that produced data.pagination.nextCursor. For edited sessions this is the id returned by mt_apk_session_create; use an empty string for the base APK and for mt_apk_list_available_apks continuation.\"\n  },\n  \"nextCursor\": {\n    \"type\": \"string\",\n    \"description\": \"Opaque cursor copied unchanged from nextActions[].arguments.nextCursor or data.pagination.nextCursor. Do not parse, construct, concatenate, or modify the cursor.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the continuation. Copy nextActions[].arguments.limit by default. For text reads use 1..2000 lines; for byte reads use 1..65536 bytes; for other pages use data.pagination.limitMax.\"\n  }\n}\n");
        this.f76067 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3194(c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        try {
            C21166 c21166M41109 = C17638.m41109(jSONObject);
            String str = c21166M41109.f68912;
            String str2 = c21166M41109.f68910;
            String str3 = c21166M41109.f68911;
            if ("available_apks".equals(str3) && str2.isEmpty()) {
                C21632 c21632M43393 = C18810.m43393(str, 0, str3, str2);
                if (!"available_apks".equals(c21632M43393.f70154)) {
                    throw C12731.m31626("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                C17669 c17669M40067 = this.f76062.m40067(c21632M43393, jSONObject);
                int i = C23044.f74862;
                return c17669M40067;
            }
            try {
                C21632 c21632M43394 = C18810.m43393(str, this.f76064.m20697(str3, str2), str3, str2);
                String str4 = c21632M43394.f70154;
                if ("list".equals(str4)) {
                    C17669 c17669M29879 = this.f76065.m29879(c21632M43394, jSONObject);
                    int i2 = C23044.f74862;
                    return c17669M29879;
                }
                if ("outline_class".equals(str4)) {
                    C17669 c17669M15531 = this.f76068.m15531(c21632M43394, jSONObject, new C15283());
                    int i3 = C23044.f74862;
                    return c17669M15531;
                }
                if ("read".equals(str4)) {
                    C17669 c17669M48651 = this.f76059.m48651(c21632M43394, jSONObject, new C15283());
                    int i4 = C23044.f74862;
                    return c17669M48651;
                }
                if ("search".equals(str4)) {
                    C17669 c17669M23585 = this.f76061.m23585(c21632M43394, jSONObject, new C15283());
                    int i5 = C23044.f74862;
                    return c17669M23585;
                }
                if ("xref".equals(str4)) {
                    C17669 c17669M6663 = this.f76069.m6663(c21632M43394, jSONObject);
                    int i6 = C23044.f74862;
                    return c17669M6663;
                }
                if ("resource_xref".equals(str4)) {
                    C17669 c17669M43796 = this.f76066.m43796(c21632M43394, jSONObject);
                    int i7 = C23044.f74862;
                    return c17669M43796;
                }
                if ("native_items".equals(str4)) {
                    C17669 c17669M4265 = this.f76060.m4265(c21632M43394, jSONObject);
                    int i8 = C23044.f74862;
                    return c17669M4265;
                }
                if (!"native_xref".equals(str4)) {
                    throw C12731.m31626("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                C17669 c17669M47028 = this.f76063.m47028(c21632M43394, jSONObject);
                int i9 = C23044.f74862;
                return c17669M47028;
            } catch (C12731 e) {
                if (e.f42473) {
                    int i10 = C23044.f74862;
                }
                throw e;
            }
        } catch (Throwable th) {
            int i11 = C23044.f74862;
            throw th;
        }
    }
}
