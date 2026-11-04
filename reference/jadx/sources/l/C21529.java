package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6ZH */
/* JADX INFO: loaded from: classes.dex */
public final class C21529 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m48973(C9594 c9594) {
        JSONObject jSONObjectObject = JSON.object();
        ArrayList<C1392> arrayList = c9594.f31059;
        JSONArray jSONArrayArray = JSON.array();
        for (C1392 c1392 : arrayList) {
            JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c1392.f4951).add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/" + c1392.f4951).add("sourcePath", c1392.f4944).add("sourceExists", c1392.f4946).add("temporary", false).add("apkFileName", c1392.f4945).add("appLabel", c1392.f4953).add("packageName", c1392.f4949).add("versionName", c1392.f4955);
            Long l2 = c1392.f4948;
            jSONArrayArray.add(jSONObjectAdd.add("versionCode", l2 == null ? JSON.NULL : JSON.value(l2.longValue())).add("createdAt", c1392.f4947).add("lastAccessedAt", c1392.f4954).add("manifestAvailable", c1392.f4952).add("manifestError", c1392.f4950));
        }
        return C15300.m36728(jSONObjectObject.add("items", jSONArrayArray).add("returnedCount", arrayList.size()).add("unavailableCount", c9594.f31060), JSON.array());
    }
}
