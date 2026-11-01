package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۙۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 377O */
/* JADX INFO: loaded from: classes2.dex */
public final class C4481 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f15949;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f15950;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f15951;

    public C4481(int i, int i2, int i3) {
        this.f15949 = i;
        this.f15950 = i2;
        this.f15951 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4481 m12509(JSONObject jSONObject, JSONValue jSONValue) throws C12731 {
        int i = jSONObject.getInt("classIndex", 0);
        int i2 = jSONObject.getInt("memberIndex", 0);
        int i3 = jSONObject.getInt("instructionIndex", 0);
        if (i < 0 || i2 < 0 || i3 < 0) {
            throw C12731.m31626("Invalid cursor position", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        return new C4481(i, i2, i3);
    }
}
