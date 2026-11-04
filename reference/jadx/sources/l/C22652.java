package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J766 */
/* JADX INFO: loaded from: classes.dex */
public final class C22652 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f73562;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f73563;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f73564;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f73565;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f73566;

    public C22652(JSONObject jSONObject) {
        List listUnmodifiableList;
        String string = jSONObject.getString("itemKind", "");
        C10717.m27304(string);
        this.f73562 = string;
        this.f73566 = jSONObject.getInt("offset", 0);
        this.f73563 = jSONObject.getInt("limit", 0);
        this.f73564 = jSONObject.getInt("totalCount", 0);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if ("neededLibraries".equals(string)) {
                    arrayList.add(C19668.m45338(jSONObject2));
                } else if ("sections".equals(string) || "segments".equals(string)) {
                    arrayList.add(C5498.m16325(jSONObject2));
                } else if ("imports".equals(string)) {
                    arrayList.add(C13482.m33161(jSONObject2));
                } else if ("symbols".equals(string) || "entries".equals(string)) {
                    arrayList.add(C17430.m40932(jSONObject2));
                } else if ("initArray".equals(string) || "finiArray".equals(string)) {
                    arrayList.add(C4752.m14649(jSONObject2));
                } else {
                    arrayList.add(C15192.m36542(jSONObject2));
                }
            }
            listUnmodifiableList = C4681.unmodifiableList(arrayList);
        }
        this.f73565 = listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22652 m51051(JSONObject jSONObject) {
        return new C22652(jSONObject);
    }
}
