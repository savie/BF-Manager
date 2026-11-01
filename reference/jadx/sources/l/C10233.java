package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۤۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes3.dex */
public final class C10233 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f34921;

    static {
        HashMap map = new HashMap(9);
        f34921 = map;
        EnumC3135 enumC3135 = EnumC3135.pt;
        map.put("xx-small", new C10502(0.694f, enumC3135));
        map.put("x-small", new C10502(0.833f, enumC3135));
        map.put("small", new C10502(10.0f, enumC3135));
        map.put("medium", new C10502(12.0f, enumC3135));
        map.put("large", new C10502(14.4f, enumC3135));
        map.put("x-large", new C10502(17.3f, enumC3135));
        map.put("xx-large", new C10502(20.7f, enumC3135));
        EnumC3135 enumC3136 = EnumC3135.percent;
        map.put("smaller", new C10502(83.33f, enumC3136));
        map.put("larger", new C10502(120.0f, enumC3136));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10502 m26026(String str) {
        return (C10502) f34921.get(str);
    }
}
