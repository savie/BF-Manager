package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۟ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes3.dex */
public final class C7410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f24687;

    static {
        HashMap map = new HashMap(13);
        f24687 = map;
        map.put("normal", 400);
        map.put("bold", 700);
        C6009.m16314(1, map, "bolder", -1, "lighter");
        C6009.m16314(100, map, "100", 200, "200");
        map.put("300", 300);
        map.put("400", 400);
        C6009.m16314(500, map, "500", 600, "600");
        C15037.m36025(map, "700", 700, 800, "800");
        map.put("900", Integer.valueOf(EnumC12167.f40710));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m19836(String str) {
        return (Integer) f24687.get(str);
    }
}
