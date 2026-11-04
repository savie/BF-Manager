package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܳ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0IS3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15561 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m37285(C15892 c15892) {
        return C15300.m36728(JSON.object().add("workspaceId", c15892.f51655).add("editSessionId", c15892.f51657).add("deletedResourceCount", c15892.f51653).add("deletedValueCount", c15892.f51654).add("deletedTypeVariantCount", c15892.f51656), JSON.array());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37286(C10186 c10186, C24272 c24272, int i) {
        JSONObject jSONObject = c10186.f32602;
        String str = c24272.f78582;
        ArrayList arrayList = c24272.f78581;
        jSONObject.put("workspaceId", str).put("editSessionId", c24272.f78583);
        if (i >= 0 && i < arrayList.size()) {
            JSONObject jSONObjectPut = jSONObject.put("failedDeleteIndex", i);
            C6372 c6372 = (C6372) arrayList.get(i);
            boolean zEquals = "type_variant".equals(c6372.f21518);
            JSONObject jSONObjectAdd = JSON.object().add("kind", c6372.f21518);
            String str2 = c6372.f21519;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("locator", str2 == null ? JSON.NULL : JSON.value("resource:".concat(str2))).add("packageId", zEquals ? JSON.value(String.format(Locale.ROOT, "0x%02x", Integer.valueOf(c6372.f21521))) : JSON.NULL).add("typeId", zEquals ? JSON.value(String.format(Locale.ROOT, "0x%02x", Integer.valueOf(c6372.f21522))) : JSON.NULL);
            String str3 = c6372.f21520;
            jSONObjectPut.put("deleteTarget", jSONObjectAdd2.add("variant", str3 == null ? JSON.NULL : JSON.value(str3)));
            return;
        }
        if (jSONObject.get("failedDeleteIndex") == null) {
            jSONObject.put("failedDeleteIndex", JSON.NULL);
        }
        if (jSONObject.get("deleteTarget") == null) {
            jSONObject.put("deleteTarget", JSON.NULL);
        }
    }
}
