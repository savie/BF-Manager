package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۜ᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K6WN */
/* JADX INFO: loaded from: classes3.dex */
public final class C7055 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f23697;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f23698;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f23699;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_read_signature";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Read full signing certificate metadata for the original APK saved in a workspace: certificate digests, subject, issuer, validity dates, and algorithms. This detects signature data without verifying signature validity or installability. Edit-session changes are not included. To inspect a built APK, first open that output with mt_apk_workspace_open, then pass its workspaceId. For a compact summary, use mt_apk_workspace_open or mt_apk_build results.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Read APK Signature Details";
    }

    public C7055(C7845 c7845) {
        this.f23698 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f23697 == null) {
            this.f23697 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open. Reads that workspace's original APK, excluding edit-session changes.\"\n  }\n}\n");
        }
        return this.f23697;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f23699 == null) {
            this.f23699 = C4969.m13780("Result for mt_apk_read_signature.", C4969.m13777(JSON.object().add("workspaceId", C4969.m13786("string", "Workspace id used for this read.")).add("signature", C10584.m26761(true)), "Original APK certificate metadata."), C4969.m13787(C6349.m17455()), C4969.m13783("Empty on success; workspace errors may offer reopening the source APK.", C4969.m13778(C13530.m33076(), "mt_apk_workspace_open", "retry")));
        }
        return this.f23699;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3194(c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        String strM41073 = C17638.m41073(jSONObject);
        return new C17669(C0735.m3193(JSON.object().add("workspaceId", strM41073).add("signature", C10584.m26760(this.f23698.m20723(strM41073), true)), JSON.array()));
    }
}
