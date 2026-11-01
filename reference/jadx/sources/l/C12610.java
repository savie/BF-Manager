package l;

import bin.mt.json.JSONObject;
import com.umeng.analytics.pro.d;
import java.util.Map;

/* JADX INFO: renamed from: l.۫᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7BU */
/* JADX INFO: loaded from: classes3.dex */
public final class C12610 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7768 m31383(Map map) {
        return AbstractC16940.m39639(EnumC10591.OK, "application/json", C13316.m32823(map).toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7768 m31384(EnumC10591 enumC10591, String str) {
        return AbstractC16940.m39639(enumC10591, "application/json", new JSONObject().add(d.O, str).toString());
    }
}
