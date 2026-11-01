package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۢ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9598 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f32338;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f32339;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f32340;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Boolean f32341;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f32342;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f32343;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f32344;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m24462() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("1", this.f32339.mo33986());
        jSONObject.put("2", this.f32342);
        jSONObject.put("3", C13012.m32189(80, this.f32343));
        jSONObject.put("4", this.f32344);
        jSONObject.put("5", this.f32341.booleanValue());
        jSONObject.put("6", this.f32338);
        jSONObject.put("7", this.f32340);
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24463(JSONObject jSONObject) {
        this.f32339 = C5553.m15313(jSONObject.getString("1"), new String[0]);
        this.f32342 = jSONObject.getString("2");
        this.f32343 = jSONObject.getString("3");
        this.f32344 = jSONObject.getString("4");
        this.f32341 = Boolean.valueOf(jSONObject.getBoolean("5"));
        this.f32338 = jSONObject.getBoolean("6");
        this.f32340 = jSONObject.getString("7");
    }
}
