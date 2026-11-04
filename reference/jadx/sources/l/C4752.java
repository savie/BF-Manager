package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۙ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W74O */
/* JADX INFO: loaded from: classes3.dex */
public final class C4752 implements InterfaceC21906 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f16694;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f16695;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f16696;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f16697;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f16698;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f16699;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f16700;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f16701;

    public C4752(JSONObject jSONObject) {
        this.f16700 = jSONObject.getString("arrayName", "");
        this.f16694 = jSONObject.getInt("arrayIndex", 0);
        this.f16699 = C21160.m48263(jSONObject, "slotVirtualAddress", 0L);
        this.f16701 = C21160.m48263(jSONObject, "slotPhysicalAddress", 0L);
        this.f16695 = C21160.m48263(jSONObject, "targetVirtualAddress", 0L);
        this.f16697 = C21160.m48263(jSONObject, "targetPhysicalAddress", 0L);
        this.f16698 = jSONObject.getString("targetInstructionMode", "");
        this.f16696 = jSONObject.getInt("pointerSize", 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4752 m14649(JSONObject jSONObject) {
        return new C4752(jSONObject);
    }
}
