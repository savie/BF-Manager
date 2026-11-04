package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۛ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T77G */
/* JADX INFO: loaded from: classes3.dex */
public final class C6723 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f22369;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f22370;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f22371;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f22372;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f22373;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f22374;

    public C6723(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f22371 = i;
        this.f22373 = i2;
        this.f22369 = i3;
        this.f22372 = i4;
        this.f22374 = i5;
        this.f22370 = i6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6723 m18765(JSONObject jSONObject, JSONValue jSONValue) throws C10186 {
        int i = jSONObject.getInt("scopeIndex", 0);
        int i2 = jSONObject.getInt("entryIndex", 0);
        int i3 = jSONObject.getInt("classIndex", 0);
        int i4 = jSONObject.getInt("memberIndex", 0);
        int i5 = jSONObject.getInt("instructionIndex", 0);
        int i6 = jSONObject.getInt("innerIndex", 0);
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0 || i5 < 0 || i6 < 0) {
            throw C10186.m26301("Invalid cursor position", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        return new C6723(i, i2, i3, i4, i5, i6);
    }
}
