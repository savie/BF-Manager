package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۢܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes3.dex */
public final class C9664 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f32483;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f32484;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f32485;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f32486;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f32487;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f32488;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f32489;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f32490;

    public C9664(JSONObject jSONObject) {
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f32484 = jSONObject.getBoolean("controlFlowComplete", false);
        this.f32487 = jSONObject.getString("completionReason", "");
        this.f32489 = jSONObject.getInt("bytesAnalyzed", 0);
        this.f32483 = jSONObject.getInt("instructionsAnalyzed", 0);
        this.f32485 = jSONObject.getInt("blockCount", 0);
        this.f32486 = jSONObject.getInt("edgeCount", 0);
        this.f32490 = jSONObject.getInt("externalFlowCount", 0);
        this.f32488 = jSONObject.getInt("unresolvedFlowCount", 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9664 m24563(JSONObject jSONObject) {
        return new C9664(jSONObject);
    }
}
