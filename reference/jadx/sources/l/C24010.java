package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩺ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L779 */
/* JADX INFO: loaded from: classes.dex */
public final class C24010 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f77660;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f77661;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f77662;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Edit APK Resource";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Edit one or more resources.arsc values inside an APK edit session using complete valueXml from mt_apk_resource_read. Pass edits[] items; each item has locator, variant, targetVersion, and valueXml for one resourceId+variant. Runtime allows 1..200 items; around 20 per call is recommended. Items apply atomically in edits[] order, later items can observe earlier edits, and dependent valueXml edits should put the dependency first. Duplicate resourceId+variant items are rejected; failedEditIndex is 0-based and matches edits[i]. valueXml must contain exactly one supported root element and cannot change the root name, resource id, or variant, and it cannot create new resources. stale targetVersion is checked before semantic no-op. On resource-name-confused APKs, APP references and style item attr names must use 8 uppercase hex digits without 0x in output, while input also accepts a 0x prefix; android: system names remain accepted.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_resource_edit";
    }

    public C24010(C1897 c1897) {
        this.f77661 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        JSONObject jSONObject = this.f77660;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM19209 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"edits\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic resource value edits. Must contain 1..200 items at runtime; around 20 is recommended. Items apply in order and failedEditIndex uses this 0-based array index.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"locator\": {\n          \"type\": \"string\",\n          \"description\": \"Resource locator string copied from mt_apk_resource_read, such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.\"\n        },\n        \"variant\": {\n          \"type\": \"string\",\n          \"description\": \"Exact resource variant copied from the value to edit. Do not pass *.\"\n        },\n        \"targetVersion\": {\n          \"type\": \"string\",\n          \"description\": \"Required semantic targetVersion copied from results[].targetVersion for the same workspaceId, editSessionId, resourceId, and variant.\"\n        },\n        \"valueXml\": {\n          \"type\": \"string\",\n          \"description\": \"Complete single-entry resource XML copied from results[].valueXml, optionally modified. The root name attribute is read-only and must remain unchanged.\"\n        }\n      },\n      \"required\": [\n        \"locator\",\n        \"variant\",\n        \"targetVersion\",\n        \"valueXml\"\n      ]\n    }\n  }\n}\n");
        this.f77660 = jSONObjectM19209;
        return jSONObjectM19209;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        JSONObject jSONObject = this.f77662;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM27734 = C10932.m27734("Result for mt_apk_resource_edit. data returns batch edit counts and per-item new targetVersion values.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id used for this edit session.")).add("editSessionId", C10932.m27743("string", "Edit session id used for this resource edit.")).add("changed", C10932.m27740(ClassTransform.BOOLEAN, "Whether this batch changed resource values in the edit session.")).add("changedCount", C10932.m27740("integer", "Number of edits whose semantic targetVersion changed.")).add("noOpCount", C10932.m27740("integer", "Number of edits whose semantic targetVersion stayed the same.")).add("results", C22121.m50076("type", "array", "description", "Per-edit results in the same order as input edits[].").add("items", C10932.m27731(JSON.object().add("index", C10932.m27740("integer", "0-based input edits[] index.")).add("locator", C10932.m27743("string", "Edited resource locator.")).add("variant", C10932.m27743("string", "Edited resource variant.")).add("changed", C10932.m27740(ClassTransform.BOOLEAN, "Whether this item changed its resource value in the edit session.")).add("newTargetVersion", C10932.m27743("string", "Semantic targetVersion after this edit item, as 16 lowercase hex digits.")), "One mt_apk_resource_edit item result."))), "Successful mt_apk_resource_edit data."), C10932.m27741(C10932.m27731(JSON.object().add("workspaceId", C10932.m27743("string", "Workspace id, or null.")).add("editSessionId", C10932.m27743("string", "Edit session id, or null.")).add("locator", C10932.m27743("string", "Rejected resource locator, or null.")).add("variant", C10932.m27743("string", "Rejected resource variant, or null.")).add("currentTargetVersion", C10932.m27743("string", "Current targetVersion when stale was detected, or null.")).add("failedEditIndex", C10932.m27743("integer", "0-based edits[] index for the rejected item, or null for top-level parameter errors.")).add("resourceNamePolicy", C10932.m27739(C10932.m27731(JSON.object().add("confused", C10932.m27740(ClassTransform.BOOLEAN, "Whether resources.arsc appears resource-name confused.")).add("appReferenceOutput", C10932.m27738("APP reference output policy.", "names_or_hex", "hex8_upper_no_0x")).add("appNameReferencesAccepted", C10932.m27740(ClassTransform.BOOLEAN, "Whether APP name references are accepted in valueXml input.")).add("systemNameReferencesAccepted", C10932.m27740(ClassTransform.BOOLEAN, "Whether android: system name references are accepted in valueXml input.")).add("hexPrefixAccepted", C10932.m27740(ClassTransform.BOOLEAN, "Whether 0x-prefixed hex ids are accepted in all resource/attr id input positions.")), "Resource name/reference policy for this ARSC snapshot."))), "mt_apk_resource_edit diagnostics.")), C10932.m27737("mt_apk_resource_edit errors may return a re-read action with current valueXml and targetVersion.", C10932.m27732(C16237.m38544(), "mt_apk_resource_read", "retry")));
        this.f77662 = jSONObjectM27734;
        return jSONObjectM27734;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C6110.m17638(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) {
        int i;
        try {
            C16834.m39750();
            return new C1238(C6110.m17631(this.f77661.m6543(C4375.m13938(jSONObject))));
        } finally {
            i = C24294.f78630;
        }
    }
}
