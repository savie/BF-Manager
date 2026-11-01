package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ᩹۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E6ZH */
/* JADX INFO: loaded from: classes3.dex */
public final class C11289 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m28273(C13490 c13490) {
        JSONObject jSONObjectObject = JSON.object();
        ArrayList<C4316> arrayList = c13490.f44582;
        JSONArray jSONArrayArray = JSON.array();
        for (C4316 c4316 : arrayList) {
            JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c4316.f15499).add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/" + c4316.f15499).add("sourcePath", c4316.f15492).add("sourceExists", c4316.f15497).add("temporary", false).add("apkFileName", c4316.f15493).add("appLabel", c4316.f15498).add("packageName", c4316.f15490).add("versionName", c4316.f15501);
            Long l2 = c4316.f15495;
            jSONArrayArray.add(jSONObjectAdd.add("versionCode", l2 == null ? JSON.NULL : JSON.value(l2.longValue())).add("createdAt", c4316.f15496).add("lastAccessedAt", c4316.f15491).add("manifestAvailable", c4316.f15494).add("manifestError", c4316.f15500));
        }
        return C0735.m3193(jSONObjectObject.add("items", jSONArrayArray).add("returnedCount", arrayList.size()).add("unavailableCount", c13490.f44583), JSON.array());
    }
}
