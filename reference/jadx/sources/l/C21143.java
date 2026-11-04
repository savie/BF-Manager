package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩶ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes5.dex */
public final class C21143 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f67529;

    static {
        HashMap map = new HashMap(10);
        f67529 = map;
        map.put("none", EnumC19520.none);
        map.put("xMinYMin", EnumC19520.xMinYMin);
        map.put("xMidYMin", EnumC19520.xMidYMin);
        map.put("xMaxYMin", EnumC19520.xMaxYMin);
        map.put("xMinYMid", EnumC19520.xMinYMid);
        map.put("xMidYMid", EnumC19520.xMidYMid);
        map.put("xMaxYMid", EnumC19520.xMaxYMid);
        map.put("xMinYMax", EnumC19520.xMinYMax);
        map.put("xMidYMax", EnumC19520.xMidYMax);
        map.put("xMaxYMax", EnumC19520.xMaxYMax);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC19520 m48246(String str) {
        return (EnumC19520) f67529.get(str);
    }
}
