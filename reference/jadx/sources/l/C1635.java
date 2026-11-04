package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6773 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1635 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m5794(C22056 c22056) {
        String strM42757;
        JSONArray jSONArrayArray = JSON.array();
        int i = c22056.f71129;
        int i2 = c22056.f71124;
        boolean z = i < i2;
        int i3 = c22056.f71125;
        String str = c22056.f71127;
        if (z) {
            strM42757 = C18326.m42757("available_apks", "available_apks", "", 0, JSON.object().add("prefix", str).add("recommendedLimit", i3).add("limitMax", 200), JSON.object().add("offset", i));
            jSONArrayArray.add(C2729.m9064(C22121.m50076("workspaceId", "available_apks", "editSessionId", "").add("nextCursor", strM42757).add("limit", i3), "mt_apk_continue", "continue", "Continue available APK files"));
        } else {
            strM42757 = null;
        }
        JSONObject jSONObjectAdd = JSON.object().add("prefix", str);
        ArrayList<C4902> arrayList = c22056.f71128;
        JSONArray jSONArrayArray2 = JSON.array();
        for (C4902 c4902 : arrayList) {
            JSONObject jSONObjectAdd2 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c4902.f17129).add("size", c4902.f17128).add("lastModified", c4902.f17131).add("appLabel", c4902.f17125).add("packageName", c4902.f17130).add("versionName", c4902.f17124);
            Long l2 = c4902.f17126;
            jSONArrayArray2.add(jSONObjectAdd2.add("versionCode", l2 == null ? JSON.NULL : JSON.value(l2.longValue())).add("manifestAvailable", c4902.f17127).add("manifestError", c4902.f17132));
        }
        return C15300.m36728(jSONObjectAdd.add("items", jSONArrayArray2).add("pagination", JSON.object().add("hasMore", i < i2).add("nextCursor", strM42757 == null ? JSON.NULL : JSON.value(strM42757)).add("returnedCount", arrayList.size()).add("limitMax", 200).add("totalAvailableCount", c22056.f71126)), jSONArrayArray);
    }
}
