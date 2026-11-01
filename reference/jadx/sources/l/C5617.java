package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes2.dex */
public final class C5617 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C11968 f19223;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f19224;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List f19225;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9664 f19226;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f19227;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f19228;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C18129 f19229;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f19230;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f19231;

    public C5617(JSONObject jSONObject) {
        List listUnmodifiableList;
        List listUnmodifiableList2;
        List listUnmodifiableList3;
        List listUnmodifiableList4;
        this.f19230 = jSONObject.getString("arch", "");
        this.f19228 = jSONObject.getInt("bits", 0);
        this.f19229 = C18129.m42201(jSONObject.getJSONObject("mapping"));
        this.f19223 = C11968.m29780(jSONObject.getJSONObject("function"));
        JSONArray jSONArray = jSONObject.getJSONArray("blocks");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(C3312.m9815(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C0561.unmodifiableList(arrayList);
        }
        this.f19224 = listUnmodifiableList;
        JSONArray jSONArray2 = jSONObject.getJSONArray("edges");
        if (jSONArray2 == null || jSONArray2.isEmpty()) {
            listUnmodifiableList2 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(jSONArray2.size());
            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                arrayList2.add(C4911.m13669(jSONArray2.getJSONObject(i2)));
            }
            listUnmodifiableList2 = C0561.unmodifiableList(arrayList2);
        }
        this.f19227 = listUnmodifiableList2;
        JSONArray jSONArray3 = jSONObject.getJSONArray("externalFlows");
        if (jSONArray3 == null || jSONArray3.isEmpty()) {
            listUnmodifiableList3 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(jSONArray3.size());
            for (int i3 = 0; i3 < jSONArray3.size(); i3++) {
                arrayList3.add(C14085.m34075(jSONArray3.getJSONObject(i3)));
            }
            listUnmodifiableList3 = C0561.unmodifiableList(arrayList3);
        }
        this.f19231 = listUnmodifiableList3;
        JSONArray jSONArray4 = jSONObject.getJSONArray("unresolvedFlows");
        if (jSONArray4 == null || jSONArray4.isEmpty()) {
            listUnmodifiableList4 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList4 = new ArrayList(jSONArray4.size());
            for (int i4 = 0; i4 < jSONArray4.size(); i4++) {
                arrayList4.add(C2794.m8494(jSONArray4.getJSONObject(i4)));
            }
            listUnmodifiableList4 = C0561.unmodifiableList(arrayList4);
        }
        this.f19225 = listUnmodifiableList4;
        this.f19226 = C9664.m24563(jSONObject.getJSONObject("analysisSummary"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5617 m15494(JSONObject jSONObject) {
        return new C5617(jSONObject);
    }
}
