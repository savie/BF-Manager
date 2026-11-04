package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.۠᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 377O */
/* JADX INFO: loaded from: classes3.dex */
public final class C8959 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29221;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f29222;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f29223;

    public C8959(int i, int i2, int i3) {
        this.f29221 = i;
        this.f29222 = i2;
        this.f29223 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8959 m23946(JSONObject jSONObject, JSONValue jSONValue) throws C10186 {
        int i = jSONObject.getInt("classIndex", 0);
        int i2 = jSONObject.getInt("memberIndex", 0);
        int i3 = jSONObject.getInt("instructionIndex", 0);
        if (i < 0 || i2 < 0 || i3 < 0) {
            throw C10186.m26301("Invalid cursor position", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        return new C8959(i, i2, i3);
    }
}
