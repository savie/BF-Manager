package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۛܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X74A */
/* JADX INFO: loaded from: classes2.dex */
public final class C6135 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f20947;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f20948;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f20949;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f20950;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f20951;

    public C6135(JSONObject jSONObject) {
        List listUnmodifiableList;
        this.f20947 = jSONObject.getInt("offset", 0);
        this.f20951 = jSONObject.getInt("limit", 0);
        this.f20949 = jSONObject.getInt("totalCount", 0);
        this.f20950 = C1383.m4844(jSONObject, "nextScanOffset", -1L);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(C17424.m40620(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C0561.unmodifiableList(arrayList);
        }
        this.f20948 = listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6135 m17120(JSONObject jSONObject) {
        return new C6135(jSONObject);
    }
}
