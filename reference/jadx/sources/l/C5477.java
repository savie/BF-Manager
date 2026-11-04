package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۚۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C5477 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19075 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final HashMap f19076;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16303(String str) {
        Integer num = (Integer) f19076.get(str);
        if (num == null) {
            throw new C23044(null, "Invalid verification error: %s", str);
        }
        return num.intValue();
    }

    static {
        HashMap map = new HashMap();
        f19076 = map;
        C1402.m5129(1, map, "generic-error", 2, "no-such-class");
        C1402.m5129(3, map, "no-such-field", 4, "no-such-method");
        C1402.m5129(5, map, "illegal-class-access", 6, "illegal-field-access");
        C1402.m5129(7, map, "illegal-method-access", 8, "class-change-error");
        map.put("instantiation-error", 9);
    }
}
