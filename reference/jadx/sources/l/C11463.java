package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X74A */
/* JADX INFO: loaded from: classes3.dex */
public final class C11463 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f36044;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f36045;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f36046;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f36047;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f36048;

    public C11463(JSONObject jSONObject) {
        List listUnmodifiableList;
        this.f36048 = jSONObject.getInt("offset", 0);
        this.f36047 = jSONObject.getInt("limit", 0);
        this.f36046 = jSONObject.getInt("totalCount", 0);
        this.f36045 = C21160.m48263(jSONObject, "nextScanOffset", -1L);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(C1769.m6220(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C4681.unmodifiableList(arrayList);
        }
        this.f36044 = listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11463 m28820(JSONObject jSONObject) {
        return new C11463(jSONObject);
    }
}
