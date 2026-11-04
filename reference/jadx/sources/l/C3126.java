package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1IS1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3126 extends AbstractC9091 {
    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo10196() {
        return "dex_list_classes";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "List DEX Classes";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Page through DEX classes. Use prefix=\"\" for all classes and limit=200. Pass an exact dex_class locator to mt_apk_dex_read_class_outline for fields and methods, or mt_apk_dex_read_pseudocode for logic. Follow mt_apk_continue actions for later pages.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_dex_list_classes";
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final JSONObject mo10200() {
        return C16237.m38543();
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo10199() {
        return C16307.m38690();
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19050 mo10201(JSONObject jSONObject) {
        return C4375.m13953(jSONObject);
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo10197(C19050 c19050) {
        return JSON.object().add("prefix", c19050.f61735);
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10198(JSONObject jSONObject, C3960 c3960) {
        ArrayList<C5430> arrayList = c3960.f13539;
        JSONArray jSONArrayArray = JSON.array();
        for (C5430 c5430 : arrayList) {
            jSONArrayArray.add(JSON.object().add("locator", C4375.m13906("dex_class", (String) null, c5430.f18921, (String) null, (String) null, (String) null)).add("javaName", c5430.f18922).add("fieldCount", c5430.f18923).add("methodCount", c5430.f18924));
        }
        jSONObject.add("items", jSONArrayArray);
    }
}
