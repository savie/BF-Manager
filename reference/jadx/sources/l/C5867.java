package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: MIRS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5867 extends AbstractC9091 {
    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ֫ */
    public final String mo10196() {
        return "resource_list";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "List APK Resources";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "List resources.arsc resources across all packages. Use view=resource_table to find resource locators for mt_apk_resource_read. To discover configurations, use view=resource_table_variants, then filter resource_table by the returned typeName and variant. Follow mt_apk_continue actions for later pages.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_apk_resource_list";
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ۫ */
    public final JSONObject mo10200() {
        return C16237.m38547();
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo10199() {
        return C16307.m38693();
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ᩷ */
    public final C19050 mo10201(JSONObject jSONObject) {
        return C4375.m13951(jSONObject);
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo10197(C19050 c19050) {
        return JSON.object().add("view", c19050.f61734).add("typeName", c19050.f61732).add("variant", c19050.f61730);
    }

    @Override // l.AbstractC9091
    /* JADX INFO: renamed from: ۙ */
    public final void mo10198(JSONObject jSONObject, C3960 c3960) {
        JSONArray jSONArrayArray;
        JSONValue jSONValueAdd;
        String str = c3960.f13538;
        JSONObject jSONObjectAdd = jSONObject.add("view", str);
        if ("resource_table".equals(str)) {
            ArrayList<C13192> arrayList = c3960.f13536;
            jSONArrayArray = JSON.array();
            for (C13192 c13192 : arrayList) {
                JSONObject jSONObjectAdd2 = JSON.object().add("locator", C4375.m13906("resource", (String) null, (String) null, (String) null, (String) null, C7972.m21711(c13192.f42137))).add("type", c13192.f42136).add("name", c13192.f42138).add("variantCount", c13192.f42131).add("valueShape", c13192.f42133);
                C3497 c3497 = c13192.f42139;
                if (c3497 == null) {
                    jSONValueAdd = JSON.NULL;
                } else {
                    jSONValueAdd = JSON.object().add("variant", c3497.f12055).add("valueKind", c3497.f12068).add("valueSnippet", c3497.f12061).add("styled", c3497.f12051).add("truncated", c3497.f12063).add("fileLocator", m17093("zip_entry", c3497.f12056)).add("targetLocator", m17093("resource", c3497.f12057));
                }
                jSONArrayArray.add(jSONObjectAdd2.add("previewValue", jSONValueAdd));
            }
        } else {
            ArrayList<C18413> arrayList2 = c3960.f13534;
            jSONArrayArray = JSON.array();
            for (C18413 c18413 : arrayList2) {
                jSONArrayArray.add(JSON.object().add("packageId", c18413.f59983).add("packageName", c18413.f59980).add("typeId", c18413.f59984).add("typeName", c18413.f59982).add("variant", c18413.f59981).add("entryCount", c18413.f59979));
            }
        }
        jSONObjectAdd.add("items", jSONArrayArray);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m17093(String str, String str2) {
        if (str2 == null) {
            return JSON.NULL;
        }
        return JSON.value(C4375.m13906(str, "zip_entry".equals(str) ? str2 : null, (String) null, (String) null, (String) null, "resource".equals(str) ? str2 : null));
    }
}
