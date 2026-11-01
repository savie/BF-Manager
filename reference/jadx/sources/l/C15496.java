package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N75N */
/* JADX INFO: loaded from: classes4.dex */
public final class C15496 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f50484;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f50485;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f50486;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f50487;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f50488;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f50489;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f50490;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f50491;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f50492;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15496 m37091() {
        List list = Collections.EMPTY_LIST;
        return new C15496();
    }

    public C15496(JSONObject jSONObject) {
        List listUnmodifiableList;
        this.f50484 = jSONObject.getInt("rangeCount", 0);
        this.f50485 = jSONObject.getInt("nextPhaseIndex", 0);
        this.f50488 = jSONObject.getInt("nextRangeIndex", 0);
        this.f50489 = C1383.m4844(jSONObject, "nextByteOffsetInRange", 0L);
        this.f50492 = jSONObject.getInt("nextRelocationIndex", 0);
        this.f50486 = jSONObject.getInt("scannedBytes", 0);
        boolean z = jSONObject.getBoolean("scanComplete", false);
        this.f50490 = z;
        String string = jSONObject.getString("completionReason", "");
        string = string.isEmpty() ? z ? "scan_space_exhausted" : "scan_budget_exhausted" : string;
        if (!C23805.m52459(string)) {
            throw new IllegalArgumentException("Invalid native xref completion reason");
        }
        this.f50487 = string;
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(C23257.m51328(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C0561.unmodifiableList(arrayList);
        }
        this.f50491 = listUnmodifiableList;
    }

    public C15496() {
        List list = Collections.EMPTY_LIST;
        this.f50484 = 0;
        this.f50485 = 0;
        this.f50488 = 0;
        this.f50489 = 0L;
        this.f50492 = 0;
        this.f50486 = 0;
        this.f50490 = true;
        if (!C23805.m52459("target_not_mapped")) {
            throw new IllegalArgumentException("Invalid native xref completion reason");
        }
        this.f50487 = "target_not_mapped";
        this.f50491 = C0561.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15496 m37092(JSONObject jSONObject) {
        return new C15496(jSONObject);
    }
}
