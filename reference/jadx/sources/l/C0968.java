package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.֨ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0968 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f3537;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f3538;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f3539;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f3540;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Boolean f3541;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f3542;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f3543;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m3842() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("1", this.f3543.mo4294());
        jSONObject.put("2", this.f3538);
        jSONObject.put("3", C18969.m44060(80, this.f3542));
        jSONObject.put("4", this.f3540);
        jSONObject.put("5", this.f3541.booleanValue());
        jSONObject.put("6", this.f3539);
        jSONObject.put("7", this.f3537);
        return jSONObject;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3843(JSONObject jSONObject) {
        this.f3543 = C14584.m35193(jSONObject.getString("1"), new String[0]);
        this.f3538 = jSONObject.getString("2");
        this.f3542 = jSONObject.getString("3");
        this.f3540 = jSONObject.getString("4");
        this.f3541 = Boolean.valueOf(jSONObject.getBoolean("5"));
        this.f3539 = jSONObject.getBoolean("6");
        this.f3537 = jSONObject.getString("7");
    }
}
