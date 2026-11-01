package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KB7N */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20111 {
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


    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Map f65308 = new HashMap();

    static {
        for (EnumC20111 enumC20111 : values()) {
            if (enumC20111 == SWITCH) {
                f65308.put("switch", enumC20111);
            } else if (enumC20111 != UNSUPPORTED) {
                f65308.put(enumC20111.name(), enumC20111);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20111 m45474(String str) {
        EnumC20111 enumC20111 = (EnumC20111) f65308.get(str);
        return enumC20111 != null ? enumC20111 : UNSUPPORTED;
    }
}
