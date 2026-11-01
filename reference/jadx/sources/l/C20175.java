package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C20175 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65488 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f65489;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45602(String str) {
        Integer num = (Integer) f65489.get(str);
        if (num == null) {
            throw new C20749(null, "Invalid verification error: %s", str);
        }
        return num.intValue();
    }

    static {
        HashMap map = new HashMap();
        f65489 = map;
        C6009.m16314(1, map, "generic-error", 2, "no-such-class");
        C6009.m16314(3, map, "no-such-field", 4, "no-such-method");
        C6009.m16314(5, map, "illegal-class-access", 6, "illegal-field-access");
        C6009.m16314(7, map, "illegal-method-access", 8, "class-change-error");
        map.put("instantiation-error", 9);
    }
}
