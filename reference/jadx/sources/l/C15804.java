package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܶۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J79X */
/* JADX INFO: loaded from: classes5.dex */
public final class C15804 extends AbstractC19137 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20037 f51418;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24756 f51419;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5121 f51420;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18042 f51421;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5867 f51422;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9837 f51423;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7248 f51424;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C8104 f51425;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17053 f51426;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1897 f51427;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6503 f51428;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3126 f51429;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public JSONObject f51430;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C2138 f51431;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Continue APK Results";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        return null;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Continue a paged APK result. Prefer the action with tool=mt_apk_continue and purpose=continue, copying its complete nextActions[].arguments. Otherwise construct the call from data.pagination.nextCursor as explained by the parameter descriptions. Continue when data.pagination.hasMore=true; a null totalAvailableCount means unknown and must not stop continuation. Other nextActions may be for inspection or retry, not pagination. Native disassembly continues through mt_apk_native_disassemble instead. Pass only the four continuation parameters, not the original tool's query or read arguments.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_continue";
    }

    public C15804(C1897 c1897, C18042 c18042, C3126 c3126, C5867 c5867, C9837 c9837, C20037 c20037, C17053 c17053, C8104 c8104, C2138 c2138, C24756 c24756, C6503 c6503, C7248 c7248, C5121 c5121) {
        this.f51427 = c1897;
        this.f51421 = c18042;
        this.f51429 = c3126;
        this.f51422 = c5867;
        this.f51423 = c9837;
        this.f51418 = c20037;
        this.f51420 = c5121;
        this.f51426 = c17053;
        this.f51425 = c8104;
        this.f51431 = c2138;
        this.f51419 = c24756;
        this.f51428 = c6503;
        this.f51424 = c7248;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f51430;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Copy nextActions[].arguments.workspaceId. Without an action, use data.workspaceId from the result containing data.pagination.nextCursor (normally the id returned by mt_apk_workspace_open). For mt_apk_list_installed_apps use installed_apps; for mt_apk_list_available_apks use available_apks. These two listing values do not require opening a workspace.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Copy nextActions[].arguments.editSessionId. Without an action, use data.editSessionId from the result containing data.pagination.nextCursor. Use an empty string for the base APK and for mt_apk_list_available_apks or mt_apk_list_installed_apps. For edited content, use the id originally returned by mt_apk_session_create.\"\n  },\n  \"nextCursor\": {\n    \"type\": \"string\",\n    \"description\": \"Opaque cursor copied unchanged from nextActions[].arguments.nextCursor or data.pagination.nextCursor. Do not parse, construct, or modify it.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the continuation. Copy nextActions[].arguments.limit by default. For text reads use 1..2000 lines; for byte reads use 1..65536 bytes; for other pages use data.pagination.limitMax.\"\n  }\n}\n");
        this.f51430 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36729(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        try {
            C23767 c23767M13958 = C4375.m13958(jSONObject);
            String str = c23767M13958.f77010;
            String str2 = c23767M13958.f77008;
            String str3 = c23767M13958.f77009;
            if ("installed_apps".equals(str3) && str2.isEmpty()) {
                C14596 c14596M42760 = C18326.m42760(str, 0, str3, str2);
                if (!"installed_apps".equals(c14596M42760.f45981)) {
                    throw C10186.m26301("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object());
                }
                C1238 c1238M48046 = new C21026().m48046(c14596M42760, jSONObject);
                int i = C24294.f78630;
                return c1238M48046;
            }
            if ("available_apks".equals(str3) && str2.isEmpty()) {
                C14596 c14596M42761 = C18326.m42760(str, 0, str3, str2);
                if (!"available_apks".equals(c14596M42761.f45981)) {
                    throw C10186.m26301("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                C1238 c1238M55267 = this.f51419.m55267(c14596M42761, jSONObject);
                int i2 = C24294.f78630;
                return c1238M55267;
            }
            try {
                C14596 c14596M42762 = C18326.m42760(str, this.f51427.m6531(str3, str2), str3, str2);
                String str4 = c14596M42762.f45981;
                if ("list_entries".equals(str4)) {
                    C1238 c1238M24229 = this.f51421.m24229(c14596M42762, jSONObject);
                    int i3 = C24294.f78630;
                    return c1238M24229;
                }
                if ("dex_list_classes".equals(str4)) {
                    C1238 c1238M242210 = this.f51429.m24229(c14596M42762, jSONObject);
                    int i4 = C24294.f78630;
                    return c1238M242210;
                }
                if ("resource_list".equals(str4)) {
                    C1238 c1238M242211 = this.f51422.m24229(c14596M42762, jSONObject);
                    int i5 = C24294.f78630;
                    return c1238M242211;
                }
                if ("outline_class".equals(str4)) {
                    C1238 c1238M25617 = this.f51423.m25617(c14596M42762, jSONObject, new C4156());
                    int i6 = C24294.f78630;
                    return c1238M25617;
                }
                if ("java_pseudocode".equals(str4)) {
                    C1238 c1238M15485 = this.f51420.m15485(c14596M42762, jSONObject);
                    int i7 = C24294.f78630;
                    return c1238M15485;
                }
                if ("read".equals(str4)) {
                    C1238 c1238M46096 = this.f51418.m46096(c14596M42762, jSONObject, new C4156());
                    int i8 = C24294.f78630;
                    return c1238M46096;
                }
                if ("search".equals(str4)) {
                    C1238 c1238M40180 = this.f51426.m40180(c14596M42762, jSONObject, new C4156());
                    int i9 = C24294.f78630;
                    return c1238M40180;
                }
                if ("xref".equals(str4)) {
                    C1238 c1238M21984 = this.f51425.m21984(c14596M42762, jSONObject);
                    int i10 = C24294.f78630;
                    return c1238M21984;
                }
                if ("resource_xref".equals(str4)) {
                    C1238 c1238M7391 = this.f51431.m7391(c14596M42762, jSONObject);
                    int i11 = C24294.f78630;
                    return c1238M7391;
                }
                if ("native_items".equals(str4)) {
                    C1238 c1238M18361 = this.f51428.m18361(c14596M42762, jSONObject);
                    int i12 = C24294.f78630;
                    return c1238M18361;
                }
                if (!"native_xref".equals(str4)) {
                    throw C10186.m26301("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                C1238 c1238M19892 = this.f51424.m19892(c14596M42762, jSONObject);
                int i13 = C24294.f78630;
                return c1238M19892;
            } catch (C10186 e) {
                if (e.f32597) {
                    int i14 = C24294.f78630;
                }
                throw e;
            }
        } catch (Throwable th) {
            int i15 = C24294.f78630;
            throw th;
        }
    }
}
