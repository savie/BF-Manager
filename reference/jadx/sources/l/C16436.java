package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۚ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 6773 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16436 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m38688(C3557 c3557) {
        String strM43390;
        JSONArray jSONArrayArray = JSON.array();
        int i = c3557.f13099;
        int i2 = c3557.f13100;
        boolean z = i < i2;
        int i3 = c3557.f13102;
        String str = c3557.f13101;
        if (z) {
            strM43390 = C18810.m43390("available_apks", "available_apks", "", 0, JSON.object().add("prefix", str).add("recommendedLimit", i3).add("limitMax", 200), JSON.object().add("offset", i));
            jSONArrayArray.add(C11320.m28376(C3184.m9603("workspaceId", "available_apks", "editSessionId", "").add("nextCursor", strM43390).add("limit", i3), "mt_apk_continue", "continue", "Continue available APK files"));
        } else {
            strM43390 = null;
        }
        JSONObject jSONObjectAdd = JSON.object().add("prefix", str);
        ArrayList<C9909> arrayList = c3557.f13103;
        JSONArray jSONArrayArray2 = JSON.array();
        for (C9909 c9909 : arrayList) {
            JSONObject jSONObjectAdd2 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c9909.f33867).add("size", c9909.f33859).add("lastModified", c9909.f33866).add("appLabel", c9909.f33862).add("packageName", c9909.f33863).add("versionName", c9909.f33861);
            Long l2 = c9909.f33865;
            jSONArrayArray2.add(jSONObjectAdd2.add("versionCode", l2 == null ? JSON.NULL : JSON.value(l2.longValue())).add("manifestAvailable", c9909.f33864).add("manifestError", c9909.f33860));
        }
        return C0735.m3193(jSONObjectAdd.add("items", jSONArrayArray2).add("pagination", JSON.object().add("hasMore", i < i2).add("nextCursor", strM43390 == null ? JSON.NULL : JSON.value(strM43390)).add("returnedCount", arrayList.size()).add("limitMax", 200).add("totalAvailableCount", c3557.f13104)), jSONArrayArray);
    }
}
