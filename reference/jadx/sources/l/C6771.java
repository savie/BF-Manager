package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6771 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f22583;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f22584;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f22585;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f22586;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f22587;

    public C6771(JSONObject jSONObject) {
        List listUnmodifiableList;
        this.f22583 = jSONObject.getString("arch", "");
        this.f22586 = jSONObject.getInt("bits", 0);
        C21160.m48263(jSONObject, "address", 0L);
        JSONArray jSONArray = jSONObject.getJSONArray("instructions");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(new C8262(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C4681.unmodifiableList(arrayList);
        }
        this.f22585 = listUnmodifiableList;
        this.f22584 = jSONObject.getInt("bytesConsumed", 0);
        this.f22587 = jSONObject.getBoolean("incompleteInstructionAtEnd", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6771 m18894(JSONObject jSONObject) {
        return new C6771(jSONObject);
    }
}
