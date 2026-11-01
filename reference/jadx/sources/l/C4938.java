package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۙ᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L779 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4938 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f17269;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f17270;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f17271;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_resource_edit";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Edit one or more resources.arsc values inside an APK edit session using complete valueXml from mt_apk_resource_read. Pass edits[] items; each item has locator, variant, targetVersion, and valueXml for one resourceId+variant. Runtime allows 1..200 items; around 20 per call is recommended. Items apply atomically in edits[] order, later items can observe earlier edits, and dependent valueXml edits should put the dependency first. Duplicate resourceId+variant items are rejected; failedEditIndex is 0-based and matches edits[i]. valueXml must contain exactly one supported root element and cannot change the root name, resource id, or variant, and it cannot create new resources. stale targetVersion is checked before semantic no-op. On resource-name-confused APKs, APP references and style item attr names must use 8 uppercase hex digits without 0x in output, while input also accepts a 0x prefix; android: system names remain accepted.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Edit APK Resource";
    }

    public C4938(C7845 c7845) {
        this.f17270 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f17269;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"edits\": {\n    \"type\": \"array\",\n    \"description\": \"Atomic resource value edits. Must contain 1..200 items at runtime; around 20 is recommended. Items apply in order and failedEditIndex uses this 0-based array index.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"properties\": {\n        \"locator\": {\n          \"type\": \"string\",\n          \"description\": \"Resource locator string copied from mt_apk_resource_read, such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.\"\n        },\n        \"variant\": {\n          \"type\": \"string\",\n          \"description\": \"Exact resource variant copied from the value to edit. Do not pass *.\"\n        },\n        \"targetVersion\": {\n          \"type\": \"string\",\n          \"description\": \"Required semantic targetVersion copied from results[].targetVersion for the same workspaceId, editSessionId, resourceId, and variant.\"\n        },\n        \"valueXml\": {\n          \"type\": \"string\",\n          \"description\": \"Complete single-entry resource XML copied from results[].valueXml, optionally modified. The root name attribute is read-only and must remain unchanged.\"\n        }\n      },\n      \"required\": [\n        \"locator\",\n        \"variant\",\n        \"targetVersion\",\n        \"valueXml\"\n      ]\n    }\n  }\n}\n");
        this.f17269 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f17271;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13780 = C4969.m13780("Result for mt_apk_resource_edit. data returns batch edit counts and per-item new targetVersion values.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id used for this edit session.")).add("editSessionId", C4969.m13789("string", "Edit session id used for this resource edit.")).add("changed", C4969.m13786(ClassTransform.BOOLEAN, "Whether this batch changed resource values in the edit session.")).add("changedCount", C4969.m13786("integer", "Number of edits whose semantic targetVersion changed.")).add("noOpCount", C4969.m13786("integer", "Number of edits whose semantic targetVersion stayed the same.")).add("results", C3184.m9603("type", "array", "description", "Per-edit results in the same order as input edits[].").add("items", C4969.m13777(JSON.object().add("index", C4969.m13786("integer", "0-based input edits[] index.")).add("locator", C4969.m13789("string", "Edited resource locator.")).add("variant", C4969.m13789("string", "Edited resource variant.")).add("changed", C4969.m13786(ClassTransform.BOOLEAN, "Whether this item changed its resource value in the edit session.")).add("newTargetVersion", C4969.m13789("string", "Semantic targetVersion after this edit item, as 16 lowercase hex digits.")), "One mt_apk_resource_edit item result."))), "Successful mt_apk_resource_edit data."), C4969.m13787(C4969.m13777(JSON.object().add("workspaceId", C4969.m13789("string", "Workspace id, or null.")).add("editSessionId", C4969.m13789("string", "Edit session id, or null.")).add("locator", C4969.m13789("string", "Rejected resource locator, or null.")).add("variant", C4969.m13789("string", "Rejected resource variant, or null.")).add("currentTargetVersion", C4969.m13789("string", "Current targetVersion when stale was detected, or null.")).add("failedEditIndex", C4969.m13789("integer", "0-based edits[] index for the rejected item, or null for top-level parameter errors.")).add("resourceNamePolicy", C4969.m13785(C4969.m13777(JSON.object().add("confused", C4969.m13786(ClassTransform.BOOLEAN, "Whether resources.arsc appears resource-name confused.")).add("appReferenceOutput", C4969.m13784("APP reference output policy.", "names_or_hex", "hex8_upper_no_0x")).add("appNameReferencesAccepted", C4969.m13786(ClassTransform.BOOLEAN, "Whether APP name references are accepted in valueXml input.")).add("systemNameReferencesAccepted", C4969.m13786(ClassTransform.BOOLEAN, "Whether android: system name references are accepted in valueXml input.")).add("hexPrefixAccepted", C4969.m13786(ClassTransform.BOOLEAN, "Whether 0x-prefixed hex ids are accepted in all resource/attr id input positions.")), "Resource name/reference policy for this ARSC snapshot."))), "mt_apk_resource_edit diagnostics.")), C4969.m13783("mt_apk_resource_edit errors may return a re-read action with current valueXml and targetVersion.", C4969.m13778(C13530.m33060(), "mt_apk_resource_read", "retry")));
        this.f17271 = jSONObjectM13780;
        return jSONObjectM13780;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C3029.m9029(c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        int i;
        try {
            C11755.m29361();
            return new C17669(C3029.m9031(this.f17270.m20702(C17638.m41068(jSONObject))));
        } finally {
            i = C23044.f74862;
        }
    }
}
