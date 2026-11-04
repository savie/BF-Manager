package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֡ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes2.dex */
public final class C0260 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f1550;

    static {
        HashMap map = new HashMap(9);
        f1550 = map;
        EnumC15175 enumC15175 = EnumC15175.pt;
        map.put("xx-small", new C18028(0.694f, enumC15175));
        map.put("x-small", new C18028(0.833f, enumC15175));
        map.put("small", new C18028(10.0f, enumC15175));
        map.put("medium", new C18028(12.0f, enumC15175));
        map.put("large", new C18028(14.4f, enumC15175));
        map.put("x-large", new C18028(17.3f, enumC15175));
        map.put("xx-large", new C18028(20.7f, enumC15175));
        EnumC15175 enumC15176 = EnumC15175.percent;
        map.put("smaller", new C18028(83.33f, enumC15176));
        map.put("larger", new C18028(120.0f, enumC15176));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18028 m1757(String str) {
        return (C18028) f1550.get(str);
    }
}
