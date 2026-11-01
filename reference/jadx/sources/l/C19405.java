package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes4.dex */
public final class C19405 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f62554;

    static {
        HashMap map = new HashMap(10);
        f62554 = map;
        map.put("none", EnumC4856.none);
        map.put("xMinYMin", EnumC4856.xMinYMin);
        map.put("xMidYMin", EnumC4856.xMidYMin);
        map.put("xMaxYMin", EnumC4856.xMaxYMin);
        map.put("xMinYMid", EnumC4856.xMinYMid);
        map.put("xMidYMid", EnumC4856.xMidYMid);
        map.put("xMaxYMid", EnumC4856.xMaxYMid);
        map.put("xMinYMax", EnumC4856.xMinYMax);
        map.put("xMidYMax", EnumC4856.xMidYMax);
        map.put("xMaxYMax", EnumC4856.xMaxYMax);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4856 m44456(String str) {
        return (EnumC4856) f62554.get(str);
    }
}
