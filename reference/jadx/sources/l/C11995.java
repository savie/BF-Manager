package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 879T */
/* JADX INFO: loaded from: classes4.dex */
public final class C11995 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f40209;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7845 f40210;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f40211;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_apk_list";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Page through an opened APK workspace: ZIP file entries, dex classes, or resource table entries. Use prefix=\"\" for no filter and limit=200 by default. Pass a dex_class item locator to mt_apk_dex_read_class_outline when you need fields and methods for one exact class. For resource table entries, call mt_apk_resource_read with data.workspaceId, data.editSessionId, reads[0].locator, reads[0].variant from previewValue.variant when non-null, and required budget fields. ZIP entry locators can be inspected as raw bytes with mt_apk_read_bytes, whether the entry is text or binary. Continue pages via nextActions.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "List APK Structures";
    }

    public C11995(C7845 c7845) {
        this.f40210 = c7845;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        JSONObject jSONObject = this.f40209;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM42597 = C18342.m42597("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to list the edited session; pass an empty string to list the base workspace.\"\n  },\n  \"view\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"zip_entries\",\n      \"dex_classes\",\n      \"resource_table\"\n    ],\n    \"description\": \"Choose the structure page. zip_entries: ZIP file entry list with zip_entry locators; dex_classes: dex class list with dex_class locators for mt_apk_dex_read_class_outline; resource_table: resources.arsc compiled resource table entry list with lightweight value previews.\"\n  },\n  \"prefix\": {\n    \"type\": \"string\",\n    \"description\": \"Pass \\\"\\\" for the default no-filter prefix. For zip_entries, match APK ZIP paths like res/layout/. For dex_classes, match dex descriptors or Java/package prefixes like Lcom/example/ or com.example. For resource_table, match resource locator targets like 0x7f010000, type/name, or name; only 0x resource ids are case-insensitive.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the first page. Pass 200 by default; maximum 1000. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f40209 = jSONObjectM42597;
        return jSONObjectM42597;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        JSONObject jSONObject = this.f40211;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM20416 = C7761.m20416();
        this.f40211 = jSONObjectM20416;
        return jSONObjectM20416;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) {
        try {
            C14196 c14196M41097 = C17638.m41097(jSONObject);
            C7845 c7845 = this.f40210;
            String str = c14196M41097.f46551;
            C17669 c17669 = (C17669) c7845.m20698(str, c14196M41097.f46556, (String) null, new C19078(this, c14196M41097));
            c7845.m20720(str);
            return c17669;
        } finally {
            int i = C23044.f74862;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17669 m29879(C21632 c21632, JSONObject jSONObject) throws C12731 {
        C14196 c14196M41052 = C17638.m41052(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c21632, jSONObject);
        String string = jSONObject.getString("nextCursor", null);
        String str = c14196M41052.f46551;
        String str2 = c14196M41052.f46556;
        C19078 c19078 = new C19078(this, c14196M41052);
        C7845 c7845 = this.f40210;
        C17669 c17669 = (C17669) c7845.m20698(str, str2, string, c19078);
        c7845.m20720(str);
        return c17669;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:41:0x035d  */
    /* JADX WARN: Code duplicated, block: B:45:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:64:0x0418  */
    /* JADX WARN: Code duplicated, block: B:65:0x041f  */
    /* JADX WARN: Code duplicated, block: B:67:0x045c  */
    /* JADX WARN: Code duplicated, block: B:69:0x046a  */
    /* JADX WARN: Code duplicated, block: B:71:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x0513  */
    /* JADX WARN: Code duplicated, block: B:76:0x0522  */
    /* JADX WARN: Code duplicated, block: B:78:0x0583  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17669 m29878(C11995 c11995, C14196 c14196, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C0434 c0434;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONValue jSONValueAdd;
        int i2;
        String str11;
        String str12;
        JSONObject jSONObjectAdd;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        JSONArray jSONArray;
        JSONArray jSONArrayArray;
        Iterator it;
        JSONObject jSONObjectAsObject;
        JSONValue jSONValue;
        String string;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        JSONObject jSONObject;
        String str29;
        String str30;
        String str31;
        JSONValue jSONValueAdd2;
        JSONObject jSONObject2;
        JSONValue jSONValueAdd3;
        C0434 c0434M20701 = c11995.f40210.m20701(c14196, new C15283());
        int i3 = C23044.f74862;
        String str32 = c14196.f46556;
        JSONObject jSONObjectObject = JSON.object();
        String str33 = c0434M20701.f2003;
        boolean z = c0434M20701.f2002;
        String str34 = c0434M20701.f2011;
        JSONObject jSONObjectAdd2 = jSONObjectObject.add("workspaceId", str33).add("editSessionId", str32);
        String str35 = c0434M20701.f2010;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("view", str35).add("nextActions", JSON.array());
        String str36 = "previewValue";
        String str37 = "targetLocator";
        String str38 = "resource";
        String str39 = "fileLocator";
        String str40 = "truncated";
        String str41 = "javaName";
        String str42 = "resourceName";
        String str43 = "resourceLocator";
        String str44 = "referencedByResource";
        String str45 = "size";
        String str46 = "valueShape";
        String str47 = "locator";
        String str48 = "variantCount";
        String str49 = "name";
        if ("zip_entries".equals(str35)) {
            JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("prefix", str34);
            str3 = "type";
            ArrayList arrayList = c0434M20701.f1997;
            HashMap map = c0434M20701.f2000;
            str = "fieldCount";
            JSONArray jSONArrayArray2 = JSON.array();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2;
                C9878 c9878 = (C9878) it2.next();
                String str50 = str41;
                C0434 c0435 = c0434M20701;
                JSONObject jSONObjectAdd5 = JSON.object().add("locator", C17638.m41044("zip_entry", c9878.f33725, (String) null, (String) null, (String) null, (String) null));
                Long l2 = c9878.f33726;
                JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("size", l2 == null ? JSON.NULL : JSON.value(l2.longValue()));
                C16684 c16684 = (C16684) map.get(c9878.f33725);
                if (c16684 != null) {
                    jSONObjectAdd6.add("referencedByResource", JSON.object().add("resourceLocator", C17638.m41044("resource", (String) null, (String) null, (String) null, (String) null, c16684.f53458)).add("resourceName", c16684.f53459));
                }
                jSONArrayArray2.add(jSONObjectAdd6);
                str41 = str50;
                it2 = it3;
                c0434M20701 = c0435;
                map = map;
            }
            str2 = str41;
            jSONObjectAdd4.add(e.m, jSONArrayArray2);
            str4 = "resourceName";
            str6 = "methodCount";
            c0434 = c0434M20701;
        } else {
            str = "fieldCount";
            str2 = "javaName";
            str3 = "type";
            if ("dex_classes".equals(str35)) {
                JSONObject jSONObjectAdd7 = jSONObjectAdd3.add("prefix", str34);
                c0434 = c0434M20701;
                ArrayList arrayList2 = c0434.f2006;
                JSONArray jSONArrayArray3 = JSON.array();
                for (Iterator it4 = arrayList2.iterator(); it4.hasNext(); it4 = it4) {
                    C1876 c1876 = (C1876) it4.next();
                    jSONArrayArray3.add(JSON.object().add("locator", C17638.m41044("dex_class", (String) null, c1876.f7105, (String) null, (String) null, (String) null)).add(str2, c1876.f7106).add(str, c1876.f7107).add("methodCount", c1876.f7104));
                    str42 = str42;
                }
                str4 = str42;
                str5 = "methodCount";
                jSONObjectAdd7.add(e.m, jSONArrayArray3);
            } else {
                str4 = "resourceName";
                str5 = "methodCount";
                String str51 = str;
                c0434 = c0434M20701;
                if ("resource_table".equals(str35)) {
                    JSONObject jSONObjectAdd8 = jSONObjectAdd3.add("prefix", str34);
                    ArrayList arrayList3 = c0434.f2008;
                    JSONArray jSONArrayArray4 = JSON.array();
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        C17327 c17327 = (C17327) it5.next();
                        Iterator it6 = it5;
                        String str52 = str51;
                        String str53 = str5;
                        String str54 = str48;
                        String str55 = str47;
                        str46 = str46;
                        JSONObject jSONObjectAdd9 = JSON.object().add(str47, C17638.m41044("resource", (String) null, (String) null, (String) null, (String) null, C22703.m50274(c17327.f55129))).add(str3, c17327.f55133).add(str49, c17327.f55132).add(str54, c17327.f55127).add(str46, c17327.f55131);
                        C13531 c13531 = c17327.f55126;
                        if (c13531 == null) {
                            jSONValueAdd = JSON.NULL;
                            str10 = str37;
                            str9 = str38;
                        } else {
                            str9 = str38;
                            str10 = str37;
                            jSONValueAdd = JSON.object().add("variant", c13531.f44678).add("valueKind", c13531.f44684).add("valueSnippet", c13531.f44683).add("styled", c13531.f44672).add(str40, c13531.f44686).add(str39, m29877("zip_entry", c13531.f44679)).add(str10, m29877(str9, c13531.f44675));
                        }
                        String str56 = str36;
                        jSONArrayArray4.add(jSONObjectAdd9.add(str56, jSONValueAdd));
                        str36 = str56;
                        str38 = str9;
                        str37 = str10;
                        str47 = str55;
                        it5 = it6;
                        str51 = str52;
                        str5 = str53;
                        str48 = str54;
                    }
                    str = str51;
                    str6 = str5;
                    str37 = str37;
                    str38 = str38;
                    str48 = str48;
                    str7 = str47;
                    str8 = str36;
                    jSONObjectAdd8.add(e.m, jSONArrayArray4);
                } else {
                    str = str51;
                }
                JSONObject jSONObjectObject2 = JSON.object();
                i2 = c0434.f2005;
                str11 = str8;
                str12 = str37;
                jSONObjectAdd = jSONObjectObject2.add("hasMore", z).add("returnedCount", c0434.f2004).add("limitMax", 1000).add("totalAvailableCount", c0434.f2009);
                if (z) {
                    JSONObject jSONObjectAdd10 = JSON.object().add("offset", c0434.f2013);
                    String str57 = c0434.f2003;
                    int i4 = C17638.f56057;
                    str15 = str46;
                    str14 = str11;
                    str16 = "view";
                    String strM43390 = C18810.m43390("list", str57, str32, i, JSON.object().add("view", str35).add("recommendedLimit", i2).add("limitMax", 1000).add("prefix", str34), jSONObjectAdd10);
                    jSONObjectAdd.add("nextCursor", strM43390);
                    str13 = "nextActions";
                    jSONObjectAdd3.getJSONArray(str13).add(C11320.m28376(C17638.m41034(str33, i2, str32, strM43390), "mt_apk_continue", "continue", "Continue listing next page"));
                } else {
                    str13 = "nextActions";
                    str14 = str11;
                    str15 = str46;
                    str16 = "view";
                }
                jSONObjectAdd3.add("pagination", jSONObjectAdd);
                str17 = null;
                JSONObject jSONObjectAdd11 = JSON.object().add("workspaceId", jSONObjectAdd3.getString("workspaceId", null)).add("editSessionId", jSONObjectAdd3.getString("editSessionId", "")).add(str16, jSONObjectAdd3.getString(str16, null)).add("prefix", jSONObjectAdd3.getString(r8, null));
                jSONArray = jSONObjectAdd3.getJSONArray(e.m);
                jSONArrayArray = JSON.array();
                if (jSONArray != null) {
                    it = jSONArray.iterator();
                    while (it.hasNext()) {
                        jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        jSONValue = jSONObjectAsObject.get(str7);
                        if (jSONValue != null || jSONValue.isNull()) {
                            string = str17;
                        } else if (jSONValue.isString()) {
                            string = C17638.m41108(jSONValue.asString());
                        } else if (jSONValue.isObject()) {
                            string = jSONValue.asObject().getString("kind", str17);
                        } else {
                            string = str17;
                        }
                        if ("zip_entry".equals(string)) {
                            JSONObject jSONObjectAdd12 = JSON.object().add(str7, C10413.m26320(jSONValue)).add(str45, C10413.m26312(jSONObjectAsObject.get(str45)));
                            String str58 = str44;
                            jSONObject2 = jSONObjectAsObject.getJSONObject(str58);
                            if (jSONObject2 == null) {
                                jSONValueAdd3 = JSON.NULL;
                                str18 = str43;
                                str19 = str4;
                            } else {
                                str18 = str43;
                                str19 = str4;
                                jSONValueAdd3 = JSON.object().add(str18, C10413.m26320(jSONObject2.get(str18))).add(str19, jSONObject2.getString(str19, str17));
                            }
                            jSONArrayArray.add(jSONObjectAdd12.add(str58, jSONValueAdd3));
                            str20 = str45;
                            it = it;
                            str44 = str58;
                            str31 = str12;
                            str30 = str39;
                            str29 = str40;
                            str22 = str2;
                            str25 = str6;
                            str26 = str48;
                            str27 = str15;
                            str28 = str14;
                            str24 = str;
                        } else {
                            str18 = str43;
                            str44 = str44;
                            str19 = str4;
                            if ("dex_class".equals(string)) {
                                String str59 = str2;
                                JSONObject jSONObjectAdd13 = JSON.object().add(str7, C10413.m26320(jSONValue)).add(str59, jSONObjectAsObject.getString(str59, null));
                                String str60 = str;
                                str20 = str45;
                                JSONObject jSONObjectAdd14 = jSONObjectAdd13.add(str60, C10413.m26312(jSONObjectAsObject.get(str60)));
                                String str61 = str6;
                                jSONArrayArray.add(jSONObjectAdd14.add(str61, C10413.m26312(jSONObjectAsObject.get(str61))));
                                str25 = str61;
                                str24 = str60;
                                str22 = str59;
                            } else {
                                str20 = str45;
                                str21 = str38;
                                str22 = str2;
                                str23 = str6;
                                str24 = str;
                                if (str21.equals(string)) {
                                    str38 = str21;
                                    it = it;
                                    String str62 = str3;
                                    JSONObject jSONObjectAdd15 = JSON.object().add(str7, C10413.m26320(jSONValue)).add(str62, jSONObjectAsObject.getString(str62, null));
                                    str49 = str49;
                                    JSONObject jSONObjectAdd16 = jSONObjectAdd15.add(str49, jSONObjectAsObject.getString(str49, null));
                                    String str63 = str48;
                                    str25 = str23;
                                    str26 = str63;
                                    str27 = str15;
                                    JSONObject jSONObjectAdd17 = jSONObjectAdd16.add(str63, C10413.m26312(jSONObjectAsObject.get(str63))).add(str27, jSONObjectAsObject.getString(str27, null));
                                    str28 = str14;
                                    jSONObject = jSONObjectAsObject.getJSONObject(str28);
                                    if (jSONObject == null) {
                                        jSONValueAdd2 = JSON.NULL;
                                        str31 = str12;
                                        str30 = str39;
                                        str29 = str40;
                                    } else {
                                        str29 = str40;
                                        str30 = str39;
                                        str31 = str12;
                                        jSONValueAdd2 = JSON.object().add("variant", jSONObject.getString("variant", null)).add("valueKind", jSONObject.getString("valueKind", null)).add("valueSnippet", jSONObject.getString("valueSnippet", null)).add("styled", jSONObject.getBoolean("styled", false)).add(str29, jSONObject.getBoolean(str29, false)).add(str30, C10413.m26320(jSONObject.get(str30))).add(str31, C10413.m26320(jSONObject.get(str31)));
                                    }
                                    jSONArrayArray.add(jSONObjectAdd17.add(str28, jSONValueAdd2));
                                } else {
                                    str38 = str21;
                                    str25 = str23;
                                }
                            }
                            str44 = str44;
                            str31 = str12;
                            str30 = str39;
                            str29 = str40;
                            str26 = str48;
                            str27 = str15;
                            str28 = str14;
                        }
                        str17 = null;
                        str45 = str20;
                        str14 = str28;
                        str12 = str31;
                        str39 = str30;
                        str40 = str29;
                        str43 = str18;
                        str4 = str19;
                        str = str24;
                        str2 = str22;
                        str15 = str27;
                        str48 = str26;
                        str6 = str25;
                        it = it;
                    }
                }
                return new C17669(C0735.m3193(jSONObjectAdd11.add("items", jSONArrayArray).add("pagination", C10413.m26315(jSONObjectAdd3.getJSONObject("pagination"))), jSONObjectAdd3.getJSONArray(str13)));
            }
            str6 = str5;
        }
        str7 = "locator";
        str8 = str36;
        JSONObject jSONObjectObject3 = JSON.object();
        i2 = c0434.f2005;
        str11 = str8;
        str12 = str37;
        jSONObjectAdd = jSONObjectObject3.add("hasMore", z).add("returnedCount", c0434.f2004).add("limitMax", 1000).add("totalAvailableCount", c0434.f2009);
        if (z) {
            JSONObject jSONObjectAdd18 = JSON.object().add("offset", c0434.f2013);
            String str510 = c0434.f2003;
            int i5 = C17638.f56057;
            str15 = str46;
            str14 = str11;
            str16 = "view";
            String strM43391 = C18810.m43390("list", str510, str32, i, JSON.object().add("view", str35).add("recommendedLimit", i2).add("limitMax", 1000).add("prefix", str34), jSONObjectAdd18);
            jSONObjectAdd.add("nextCursor", strM43391);
            str13 = "nextActions";
            jSONObjectAdd3.getJSONArray(str13).add(C11320.m28376(C17638.m41034(str33, i2, str32, strM43391), "mt_apk_continue", "continue", "Continue listing next page"));
        } else {
            str13 = "nextActions";
            str14 = str11;
            str15 = str46;
            str16 = "view";
        }
        jSONObjectAdd3.add("pagination", jSONObjectAdd);
        str17 = null;
        JSONObject jSONObjectAdd19 = JSON.object().add("workspaceId", jSONObjectAdd3.getString("workspaceId", null)).add("editSessionId", jSONObjectAdd3.getString("editSessionId", "")).add(str16, jSONObjectAdd3.getString(str16, null)).add("prefix", jSONObjectAdd3.getString(r8, null));
        jSONArray = jSONObjectAdd3.getJSONArray(e.m);
        jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            it = jSONArray.iterator();
            while (it.hasNext()) {
                jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                jSONValue = jSONObjectAsObject.get(str7);
                if (jSONValue != null) {
                    string = str17;
                } else {
                    string = str17;
                }
                if ("zip_entry".equals(string)) {
                    JSONObject jSONObjectAdd110 = JSON.object().add(str7, C10413.m26320(jSONValue)).add(str45, C10413.m26312(jSONObjectAsObject.get(str45)));
                    String str511 = str44;
                    jSONObject2 = jSONObjectAsObject.getJSONObject(str511);
                    if (jSONObject2 == null) {
                        jSONValueAdd3 = JSON.NULL;
                        str18 = str43;
                        str19 = str4;
                    } else {
                        str18 = str43;
                        str19 = str4;
                        jSONValueAdd3 = JSON.object().add(str18, C10413.m26320(jSONObject2.get(str18))).add(str19, jSONObject2.getString(str19, str17));
                    }
                    jSONArrayArray.add(jSONObjectAdd110.add(str511, jSONValueAdd3));
                    str20 = str45;
                    it = it;
                    str44 = str511;
                    str31 = str12;
                    str30 = str39;
                    str29 = str40;
                    str22 = str2;
                    str25 = str6;
                    str26 = str48;
                    str27 = str15;
                    str28 = str14;
                    str24 = str;
                } else {
                    str18 = str43;
                    str44 = str44;
                    str19 = str4;
                    if ("dex_class".equals(string)) {
                        String str512 = str2;
                        JSONObject jSONObjectAdd111 = JSON.object().add(str7, C10413.m26320(jSONValue)).add(str512, jSONObjectAsObject.getString(str512, null));
                        String str64 = str;
                        str20 = str45;
                        JSONObject jSONObjectAdd112 = jSONObjectAdd111.add(str64, C10413.m26312(jSONObjectAsObject.get(str64)));
                        String str65 = str6;
                        jSONArrayArray.add(jSONObjectAdd112.add(str65, C10413.m26312(jSONObjectAsObject.get(str65))));
                        str25 = str65;
                        str24 = str64;
                        str22 = str512;
                    } else {
                        str20 = str45;
                        str21 = str38;
                        str22 = str2;
                        str23 = str6;
                        str24 = str;
                        if (str21.equals(string)) {
                            str38 = str21;
                            it = it;
                            String str66 = str3;
                            JSONObject jSONObjectAdd113 = JSON.object().add(str7, C10413.m26320(jSONValue)).add(str66, jSONObjectAsObject.getString(str66, null));
                            str49 = str49;
                            JSONObject jSONObjectAdd114 = jSONObjectAdd113.add(str49, jSONObjectAsObject.getString(str49, null));
                            String str67 = str48;
                            str25 = str23;
                            str26 = str67;
                            str27 = str15;
                            JSONObject jSONObjectAdd115 = jSONObjectAdd114.add(str67, C10413.m26312(jSONObjectAsObject.get(str67))).add(str27, jSONObjectAsObject.getString(str27, null));
                            str28 = str14;
                            jSONObject = jSONObjectAsObject.getJSONObject(str28);
                            if (jSONObject == null) {
                                jSONValueAdd2 = JSON.NULL;
                                str31 = str12;
                                str30 = str39;
                                str29 = str40;
                            } else {
                                str29 = str40;
                                str30 = str39;
                                str31 = str12;
                                jSONValueAdd2 = JSON.object().add("variant", jSONObject.getString("variant", null)).add("valueKind", jSONObject.getString("valueKind", null)).add("valueSnippet", jSONObject.getString("valueSnippet", null)).add("styled", jSONObject.getBoolean("styled", false)).add(str29, jSONObject.getBoolean(str29, false)).add(str30, C10413.m26320(jSONObject.get(str30))).add(str31, C10413.m26320(jSONObject.get(str31)));
                            }
                            jSONArrayArray.add(jSONObjectAdd115.add(str28, jSONValueAdd2));
                        } else {
                            str38 = str21;
                            str25 = str23;
                        }
                    }
                    str44 = str44;
                    str31 = str12;
                    str30 = str39;
                    str29 = str40;
                    str26 = str48;
                    str27 = str15;
                    str28 = str14;
                }
                str17 = null;
                str45 = str20;
                str14 = str28;
                str12 = str31;
                str39 = str30;
                str40 = str29;
                str43 = str18;
                str4 = str19;
                str = str24;
                str2 = str22;
                str15 = str27;
                str48 = str26;
                str6 = str25;
                it = it;
            }
        }
        return new C17669(C0735.m3193(jSONObjectAdd19.add("items", jSONArrayArray).add("pagination", C10413.m26315(jSONObjectAdd3.getJSONObject("pagination"))), jSONObjectAdd3.getJSONArray(str13)));
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C0735.m3194(c12731);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONValue m29877(String str, String str2) {
        if (str2 == null) {
            return JSON.NULL;
        }
        return JSON.value(C17638.m41044(str, "zip_entry".equals(str) ? str2 : null, (String) null, (String) null, (String) null, "resource".equals(str) ? str2 : null));
    }
}
