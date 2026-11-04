package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֨ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1006 {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;


    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Map f3627 = new HashMap();

    static {
        for (EnumC1006 enumC1006 : values()) {
            if (enumC1006 == SWITCH) {
                f3627.put("switch", enumC1006);
            } else if (enumC1006 != UNSUPPORTED) {
                f3627.put(enumC1006.name(), enumC1006);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC1006 m3886(String str) {
        EnumC1006 enumC1006 = (EnumC1006) f3627.get(str);
        return enumC1006 != null ? enumC1006 : UNSUPPORTED;
    }
}
