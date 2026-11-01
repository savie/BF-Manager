package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ܺۘ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: T77G */
/* JADX INFO: loaded from: classes4.dex */
public final class C15689 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f50934;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f50935;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f50936;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f50937;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f50938;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f50939;

    public C15689(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f50939 = i;
        this.f50938 = i2;
        this.f50935 = i3;
        this.f50936 = i4;
        this.f50934 = i5;
        this.f50937 = i6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15689 m37382(JSONObject jSONObject, JSONValue jSONValue) throws C12731 {
        int i = jSONObject.getInt("scopeIndex", 0);
        int i2 = jSONObject.getInt("entryIndex", 0);
        int i3 = jSONObject.getInt("classIndex", 0);
        int i4 = jSONObject.getInt("memberIndex", 0);
        int i5 = jSONObject.getInt("instructionIndex", 0);
        int i6 = jSONObject.getInt("innerIndex", 0);
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0 || i5 < 0 || i6 < 0) {
            throw C12731.m31626("Invalid cursor position", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        return new C15689(i, i2, i3, i4, i5, i6);
    }
}
