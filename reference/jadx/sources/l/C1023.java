package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֨۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N75N */
/* JADX INFO: loaded from: classes2.dex */
public final class C1023 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f3696;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f3697;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f3698;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f3699;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f3700;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f3701;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f3702;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f3703;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f3704;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1023 m3916() {
        List list = Collections.EMPTY_LIST;
        return new C1023();
    }

    public C1023(JSONObject jSONObject) {
        List listUnmodifiableList;
        this.f3700 = jSONObject.getInt("rangeCount", 0);
        this.f3704 = jSONObject.getInt("nextPhaseIndex", 0);
        this.f3702 = jSONObject.getInt("nextRangeIndex", 0);
        this.f3699 = C21160.m48263(jSONObject, "nextByteOffsetInRange", 0L);
        this.f3701 = jSONObject.getInt("nextRelocationIndex", 0);
        this.f3696 = jSONObject.getInt("scannedBytes", 0);
        boolean z = jSONObject.getBoolean("scanComplete", false);
        this.f3698 = z;
        String string = jSONObject.getString("completionReason", "");
        string = string.isEmpty() ? z ? "scan_space_exhausted" : "scan_budget_exhausted" : string;
        if (!C11109.m28060(string)) {
            throw new IllegalArgumentException("Invalid native xref completion reason");
        }
        this.f3697 = string;
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(C9971.m25814(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C4681.unmodifiableList(arrayList);
        }
        this.f3703 = listUnmodifiableList;
    }

    public C1023() {
        List list = Collections.EMPTY_LIST;
        this.f3700 = 0;
        this.f3704 = 0;
        this.f3702 = 0;
        this.f3699 = 0L;
        this.f3701 = 0;
        this.f3696 = 0;
        this.f3698 = true;
        if (!C11109.m28060("target_not_mapped")) {
            throw new IllegalArgumentException("Invalid native xref completion reason");
        }
        this.f3697 = "target_not_mapped";
        this.f3703 = C4681.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1023 m3917(JSONObject jSONObject) {
        return new C1023(jSONObject);
    }
}
