package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩹۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes.dex */
public final class C23398 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f75739;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f75740;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f75741;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f75742;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f75743;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f75744;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f75745;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f75746;

    public C23398(JSONObject jSONObject) {
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f75746 = jSONObject.getBoolean("controlFlowComplete", false);
        this.f75741 = jSONObject.getString("completionReason", "");
        this.f75745 = jSONObject.getInt("bytesAnalyzed", 0);
        this.f75742 = jSONObject.getInt("instructionsAnalyzed", 0);
        this.f75739 = jSONObject.getInt("blockCount", 0);
        this.f75744 = jSONObject.getInt("edgeCount", 0);
        this.f75743 = jSONObject.getInt("externalFlowCount", 0);
        this.f75740 = jSONObject.getInt("unresolvedFlowCount", 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23398 m52578(JSONObject jSONObject) {
        return new C23398(jSONObject);
    }
}
