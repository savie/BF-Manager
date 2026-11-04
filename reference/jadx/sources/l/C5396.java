package l;

import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import bin.mt.json.JSONValue;
import com.umeng.analytics.pro.am;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6G1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5396 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f18888 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f18887 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5396 m16075() {
        C5396 c5396 = new C5396();
        String string = ApplicationC17729.f58258.getString("omuc", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (jSONObject.getInt(am.aE, 0) == 2) {
                    c5396.f18888.putAll(m16074(jSONObject.get("purposes")));
                    JSONValue jSONValue = jSONObject.get("formats");
                    if (jSONValue != null && jSONValue.isObject()) {
                        for (JSONObject.Member member : jSONValue.asObject()) {
                            c5396.f18887.put(member.getName(), m16074(member.getValue()));
                        }
                    }
                }
            } catch (JSONParseException | NumberFormatException | UnsupportedOperationException unused) {
            }
        }
        return c5396;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m16078(C12853 c12853, InterfaceC16648 interfaceC16648) {
        Map map = (Map) this.f18887.get(c12853.f41155);
        String str = c12853.f41156;
        String strFlattenToString = ((C17328) interfaceC16648).mo39358().flattenToString();
        Map map2 = map == null ? null : (Map) map.get(str);
        Integer num = map2 != null ? (Integer) map2.get(strFlattenToString) : null;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m16079(C12853 c12853, InterfaceC16648 interfaceC16648) {
        if (c12853.f41156.isEmpty()) {
            return 0;
        }
        String str = c12853.f41156;
        String strFlattenToString = ((C17328) interfaceC16648).mo39358().flattenToString();
        HashMap map = this.f18888;
        Map map2 = map == null ? null : (Map) map.get(str);
        Integer num = map2 != null ? (Integer) map2.get(strFlattenToString) : null;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m16077(C12853 c12853, InterfaceC16648 interfaceC16648) {
        boolean zM16076;
        C5396 c5396M16075 = m16075();
        HashMap map = c5396M16075.f18888;
        HashMap map2 = c5396M16075.f18887;
        String strFlattenToString = interfaceC16648.mo39358().flattenToString();
        String str = c12853.f41155;
        String str2 = c12853.f41156;
        if (str.isEmpty()) {
            zM16076 = false;
        } else {
            Map map3 = (Map) map2.get(str);
            if (map3 == null) {
                map3 = new HashMap();
                map2.put(str, map3);
            }
            zM16076 = m16076(str2, strFlattenToString, map3);
        }
        if (!str2.isEmpty()) {
            zM16076 |= m16076(str2, strFlattenToString, map);
        }
        if (zM16076) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map2.entrySet()) {
                jSONObject.add((String) entry.getKey(), m16073((Map) entry.getValue()));
            }
            ApplicationC17729.f58258.edit().putString("omuc", new JSONObject().add(am.aE, 2).add("purposes", m16073(map)).add("formats", jSONObject).toString()).apply();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16076(String str, String str2, Map map) {
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        Integer num = (Integer) map2.get(str2);
        int iIntValue = num == null ? 0 : num.intValue();
        if (iIntValue == Integer.MAX_VALUE) {
            return false;
        }
        map2.put(str2, Integer.valueOf(iIntValue + 1));
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m16074(JSONValue jSONValue) {
        HashMap map = new HashMap();
        if (jSONValue != null && jSONValue.isObject()) {
            for (JSONObject.Member member : jSONValue.asObject()) {
                if (member.getValue().isObject()) {
                    HashMap map2 = new HashMap();
                    for (JSONObject.Member member2 : member.getValue().asObject()) {
                        if (member2.getValue().isNumber()) {
                            try {
                                map2.put(member2.getName(), Integer.valueOf(Math.max(0, member2.getValue().asInt())));
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    map.put(member.getName(), map2);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m16073(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                jSONObject2.add((String) entry2.getKey(), ((Integer) entry2.getValue()).intValue());
            }
            jSONObject.add((String) entry.getKey(), jSONObject2);
        }
        return jSONObject;
    }
}
