package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75L */
/* JADX INFO: loaded from: classes4.dex */
public final class C19541 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f62812;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f62813;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f62814;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f62815;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f62816;

    public C19541(JSONObject jSONObject) {
        List listUnmodifiableList;
        this.f62813 = jSONObject.getString("arch", "");
        this.f62816 = jSONObject.getInt("bits", 0);
        C1383.m4844(jSONObject, "address", 0L);
        JSONArray jSONArray = jSONObject.getJSONArray("instructions");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(new C8252(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C0561.unmodifiableList(arrayList);
        }
        this.f62814 = listUnmodifiableList;
        this.f62815 = jSONObject.getInt("bytesConsumed", 0);
        this.f62812 = jSONObject.getBoolean("incompleteInstructionAtEnd", false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19541 m44636(JSONObject jSONObject) {
        return new C19541(jSONObject);
    }
}
