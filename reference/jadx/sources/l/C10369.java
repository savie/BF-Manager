package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۤܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W74O */
/* JADX INFO: loaded from: classes3.dex */
public final class C10369 implements InterfaceC7546 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f35533;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f35534;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f35535;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f35536;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f35537;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f35538;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f35539;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f35540;

    public C10369(JSONObject jSONObject) {
        this.f35539 = jSONObject.getString("arrayName", "");
        this.f35535 = jSONObject.getInt("arrayIndex", 0);
        this.f35536 = C1383.m4844(jSONObject, "slotVirtualAddress", 0L);
        this.f35534 = C1383.m4844(jSONObject, "slotPhysicalAddress", 0L);
        this.f35538 = C1383.m4844(jSONObject, "targetVirtualAddress", 0L);
        this.f35533 = C1383.m4844(jSONObject, "targetPhysicalAddress", 0L);
        this.f35540 = jSONObject.getString("targetInstructionMode", "");
        this.f35537 = jSONObject.getInt("pointerSize", 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10369 m26266(JSONObject jSONObject) {
        return new C10369(jSONObject);
    }
}
