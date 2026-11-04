package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: JIRM */
/* JADX INFO: loaded from: classes5.dex */
public final class C18042 extends AbstractC9091 {
    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ֫ */
    public final String mo10196() {
        return "list_entries";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "List APK Entries";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Page through APK ZIP entries. Use prefix=\"\" for all paths and limit=200. Inspect zip_entry locators with mt_apk_read_text or mt_apk_read_bytes. Follow mt_apk_continue actions for later pages.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_list_entries";
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ۫ */
    public final JSONObject mo10200() {
        return C16237.m38549();
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo10199() {
        return C16307.m38684();
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ᩷ */
    public final C19050 mo10201(JSONObject jSONObject) {
        return C4375.m13955(jSONObject);
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo10197(C19050 c19050) {
        return JSON.object().add("prefix", c19050.f61735);
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ۙ */
    public final void mo10198(JSONObject jSONObject, C3960 c3960) {
        ArrayList<C19291> arrayList = c3960.f13540;
        HashMap map = c3960.f13537;
        JSONArray jSONArrayArray = JSON.array();
        for (C19291 c19291 : arrayList) {
            JSONObject jSONObjectAdd = JSON.object().add("locator", C4375.m13906("zip_entry", c19291.f62362, (String) null, (String) null, (String) null, (String) null));
            Long l2 = c19291.f62363;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("size", l2 == null ? JSON.NULL : JSON.value(l2.longValue()));
            C10998 c10998 = (C10998) map.get(c19291.f62362);
            if (c10998 != null) {
                jSONObjectAdd2.add("referencedByResource", JSON.object().add("resourceLocator", C4375.m13906("resource", (String) null, (String) null, (String) null, (String) null, c10998.f34745)).add("resourceName", c10998.f34746));
            } else {
                jSONObjectAdd2.add("referencedByResource", JSON.NULL);
            }
            jSONArrayArray.add(jSONObjectAdd2);
        }
        jSONObject.add("items", jSONArrayArray);
    }
}
