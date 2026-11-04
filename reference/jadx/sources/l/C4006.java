package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes2.dex */
public final class C4006 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f13684;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23398 f13685;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9007 f13686;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f13687;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6244 f13688;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f13689;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f13690;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f13691;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f13692;

    public C4006(JSONObject jSONObject) {
        List listUnmodifiableList;
        List listUnmodifiableList2;
        List listUnmodifiableList3;
        List listUnmodifiableList4;
        this.f13691 = jSONObject.getString("arch", "");
        this.f13687 = jSONObject.getInt("bits", 0);
        this.f13686 = C9007.m24042(jSONObject.getJSONObject("mapping"));
        this.f13688 = C6244.m17873(jSONObject.getJSONObject("function"));
        JSONArray jSONArray = jSONObject.getJSONArray("blocks");
        if (jSONArray == null || jSONArray.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(C3260.m10646(jSONArray.getJSONObject(i)));
            }
            listUnmodifiableList = C4681.unmodifiableList(arrayList);
        }
        this.f13692 = listUnmodifiableList;
        JSONArray jSONArray2 = jSONObject.getJSONArray("edges");
        if (jSONArray2 == null || jSONArray2.isEmpty()) {
            listUnmodifiableList2 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(jSONArray2.size());
            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                arrayList2.add(C20414.m46825(jSONArray2.getJSONObject(i2)));
            }
            listUnmodifiableList2 = C4681.unmodifiableList(arrayList2);
        }
        this.f13690 = listUnmodifiableList2;
        JSONArray jSONArray3 = jSONObject.getJSONArray("externalFlows");
        if (jSONArray3 == null || jSONArray3.isEmpty()) {
            listUnmodifiableList3 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(jSONArray3.size());
            for (int i3 = 0; i3 < jSONArray3.size(); i3++) {
                arrayList3.add(C12209.m30482(jSONArray3.getJSONObject(i3)));
            }
            listUnmodifiableList3 = C4681.unmodifiableList(arrayList3);
        }
        this.f13689 = listUnmodifiableList3;
        JSONArray jSONArray4 = jSONObject.getJSONArray("unresolvedFlows");
        if (jSONArray4 == null || jSONArray4.isEmpty()) {
            listUnmodifiableList4 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList4 = new ArrayList(jSONArray4.size());
            for (int i4 = 0; i4 < jSONArray4.size(); i4++) {
                arrayList4.add(C24144.m54113(jSONArray4.getJSONObject(i4)));
            }
            listUnmodifiableList4 = C4681.unmodifiableList(arrayList4);
        }
        this.f13684 = listUnmodifiableList4;
        this.f13685 = C23398.m52578(jSONObject.getJSONObject("analysisSummary"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4006 m12967(JSONObject jSONObject) {
        return new C4006(jSONObject);
    }
}
