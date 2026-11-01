package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۖۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 87B0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2323 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f8244;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f8245;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f8246;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f8247;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f8248;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f8249;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f8250;

    public C2323(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, -1L, -1);
    }

    public C2323(int i, int i2, int i3, int i4, int i5, long j, int i6) {
        this.f8244 = i;
        this.f8248 = i2;
        this.f8249 = i3;
        this.f8245 = i4;
        this.f8246 = i5;
        this.f8247 = j;
        this.f8250 = i6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2323 m7059(int i, int i2, int i3, int i4, long j) {
        return new C2323(i, i2, 0, i3, 0, j, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2323 m7058(int i, int i2, int i3) {
        return new C2323(i, 0, i2, i3, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2323 m7060(JSONObject jSONObject, JSONValue jSONValue) throws C12731 {
        int i = jSONObject.getInt("scopeIndex", 0);
        int i2 = jSONObject.getInt("entryIndex", 0);
        int i3 = jSONObject.getInt("classIndex", 0);
        int i4 = jSONObject.getInt("memberIndex", -1);
        int i5 = jSONObject.getInt("classCharOffset", 0);
        long j = jSONObject.getLong("nativeStringScanOffset", -1L);
        int i6 = jSONObject.getInt("nativeStringTotalCount", -1);
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < -1 || i5 < 0 || j < -1 || i6 < -1 || ((j >= 0 && i6 < 0) || (i6 >= 0 && (i4 < 0 || i4 > i6)))) {
            throw C12731.m31626("Invalid cursor position", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        return new C2323(i, i2, i3, i4, i5, j, i6);
    }
}
