package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۟ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes3.dex */
public final class C7718 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f25440;

    static {
        HashMap map = new HashMap(13);
        f25440 = map;
        map.put("normal", 400);
        map.put("bold", 700);
        C1402.m5129(1, map, "bolder", -1, "lighter");
        C1402.m5129(100, map, "100", 200, "200");
        map.put("300", 300);
        map.put("400", 400);
        C1402.m5129(500, map, "500", 600, "600");
        C11958.m29934(map, "700", (Integer) 700, 800, "800");
        map.put("900", Integer.valueOf(EnumC5810.f19974));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m21001(String str) {
        return (Integer) f25440.get(str);
    }
}
