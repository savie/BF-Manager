package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ܰ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87B0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14903 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f48686;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f48687;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f48688;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f48689;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f48690;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f48691;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f48692;

    public C14903(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, -1L, -1);
    }

    public C14903(int i, int i2, int i3, int i4, int i5, long j, int i6) {
        this.f48688 = i;
        this.f48687 = i2;
        this.f48691 = i3;
        this.f48692 = i4;
        this.f48686 = i5;
        this.f48690 = j;
        this.f48689 = i6;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14903 m35853(int i, int i2, int i3, int i4, long j) {
        return new C14903(i, i2, 0, i3, 0, j, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14903 m35852(int i, int i2, int i3) {
        return new C14903(i, 0, i2, i3, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14903 m35854(JSONObject jSONObject, JSONValue jSONValue) throws C10186 {
        int i = jSONObject.getInt("scopeIndex", 0);
        int i2 = jSONObject.getInt("entryIndex", 0);
        int i3 = jSONObject.getInt("classIndex", 0);
        int i4 = jSONObject.getInt("memberIndex", -1);
        int i5 = jSONObject.getInt("classCharOffset", 0);
        long j = jSONObject.getLong("nativeStringScanOffset", -1L);
        int i6 = jSONObject.getInt("nativeStringTotalCount", -1);
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < -1 || i5 < 0 || j < -1 || i6 < -1 || ((j >= 0 && i6 < 0) || (i6 >= 0 && (i4 < 0 || i4 > i6)))) {
            throw C10186.m26301("Invalid cursor position", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        return new C14903(i, i2, i3, i4, i5, j, i6);
    }
}
