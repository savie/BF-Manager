package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۤ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6WN */
/* JADX INFO: loaded from: classes4.dex */
public final class C11086 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f34943;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1897 f34944;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f34945;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Read APK Signature Details";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Read full signing certificate metadata for the original APK saved in a workspace: certificate digests, subject, issuer, validity dates, and algorithms. This detects signature data without verifying signature validity or installability. Edit-session changes are not included. To inspect a built APK, first open that output with mt_apk_workspace_open, then pass its workspaceId. For a compact summary, use mt_apk_workspace_open or mt_apk_build results.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_read_signature";
    }

    public C11086(C1897 c1897) {
        this.f34944 = c1897;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f34943 == null) {
            this.f34943 = C6929.m19209("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open. Reads that workspace's original APK, excluding edit-session changes.\"\n  }\n}\n");
        }
        return this.f34943;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f34945 == null) {
            this.f34945 = C10932.m27734("Result for mt_apk_read_signature.", C10932.m27731(JSON.object().add("workspaceId", C10932.m27740("string", "Workspace id used for this read.")).add("signature", C17799.m41655(true)), "Original APK certificate metadata."), C10932.m27741(C14815.m35667()), C10932.m27737("Empty on success; workspace errors may offer reopening the source APK.", C10932.m27732(C16237.m38545(), "mt_apk_workspace_open", "retry")));
        }
        return this.f34945;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C15300.m36729(c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        String strM13983 = C4375.m13983(jSONObject);
        return new C1238(C15300.m36728(JSON.object().add("workspaceId", strM13983).add("signature", C17799.m41654(this.f34944.m6560(strM13983), true)), JSON.array()));
    }
}
