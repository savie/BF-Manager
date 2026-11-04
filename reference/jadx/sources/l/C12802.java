package l;

import bin.mt.json.JSONObject;
import com.umeng.analytics.pro.d;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7BU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12802 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18683 m31750(Map map) {
        return AbstractC1530.m5422(EnumC21667.OK, "application/json", C21203.m48361(map).toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18683 m31751(EnumC21667 enumC21667, String str) {
        return AbstractC1530.m5422(enumC21667, "application/json", new JSONObject().add(d.O, str).toString());
    }
}
