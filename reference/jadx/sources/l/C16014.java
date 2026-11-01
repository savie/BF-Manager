package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܺܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J766 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16014 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f51834;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f51835;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f51836;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f51837;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f51838;

    public C16014(JSONObject jSONObject) {
        List listUnmodifiableList;
        String string = jSONObject.getString("itemKind", "");
        C20952.m47129(string);
        this.f51835 = string;
        this.f51834 = jSONObject.getInt("offset", 0);
        this.f51837 = jSONObject.getInt("limit", 0);
        this.f51836 = jSONObject.getInt("totalCount", 0);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if ("neededLibraries".equals(string)) {
                    arrayList.add(C20247.m45759(jSONObject2));
                } else if ("sections".equals(string) || "segments".equals(string)) {
                    arrayList.add(C12486.m31030(jSONObject2));
                } else if ("imports".equals(string)) {
                    arrayList.add(C8958.m23254(jSONObject2));
                } else if ("symbols".equals(string) || "entries".equals(string)) {
                    arrayList.add(C14603.m35075(jSONObject2));
                } else if ("initArray".equals(string) || "finiArray".equals(string)) {
                    arrayList.add(C10369.m26266(jSONObject2));
                } else {
                    arrayList.add(C0490.m2366(jSONObject2));
                }
            }
            listUnmodifiableList = C0561.unmodifiableList(arrayList);
        }
        this.f51838 = listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16014 m37989(JSONObject jSONObject) {
        return new C16014(jSONObject);
    }
}
