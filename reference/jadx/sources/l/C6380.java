package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۛ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E79L */
/* JADX INFO: loaded from: classes2.dex */
public final class C6380 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f21683 = new LinkedHashMap();

    public C6380(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC16964 abstractC16964 = (AbstractC16964) it.next();
            LinkedHashMap linkedHashMap = this.f21683;
            if (linkedHashMap.containsKey(abstractC16964.mo1545())) {
                throw new IllegalArgumentException("Duplicate MCP tool: ".concat(abstractC16964.mo1545()));
            }
            linkedHashMap.put(abstractC16964.mo1545(), abstractC16964);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONArray m17516() {
        JSONArray jSONArrayArray = JSON.array();
        for (AbstractC16964 abstractC16964 : this.f21683.values()) {
            abstractC16964.getClass();
            JSONObject jSONObjectAdd = JSON.object().add("name", abstractC16964.mo1545()).add("title", abstractC16964.mo1552()).add("description", abstractC16964.mo1551()).add("annotations", abstractC16964.mo1546()).add("inputSchema", abstractC16964.mo1550());
            JSONObject jSONObjectMo1549 = abstractC16964.mo1549();
            if (jSONObjectMo1549 != null) {
                jSONObjectAdd.add("outputSchema", jSONObjectMo1549);
            }
            jSONArrayArray.add(jSONObjectAdd);
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m17517(JSONObject jSONObject, String str) throws C12731 {
        AbstractC16964 abstractC16964 = (AbstractC16964) this.f21683.get(str);
        if (abstractC16964 == null) {
            throw C12731.m31626("Unknown tool", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        try {
            return C11320.m28378(abstractC16964.mo1548(jSONObject));
        } catch (C12731 e) {
            return C11320.m28375(abstractC16964.mo1547(e));
        }
    }
}
