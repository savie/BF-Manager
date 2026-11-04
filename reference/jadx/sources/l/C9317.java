package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۡۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBJW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9317 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC17589 f30281;

    static {
        C25049 c25049M41247 = AbstractC17589.m41247();
        c25049M41247.mo14569("aliceblue", "#f0f8ff");
        c25049M41247.mo14569("antiquewhite", "#faebd7");
        c25049M41247.mo14569("aqua", "#00ffff");
        c25049M41247.mo14569("aquamarine", "#7fffd4");
        c25049M41247.mo14569("azure", "#f0ffff");
        c25049M41247.mo14569("beige", "#f5f5dc");
        c25049M41247.mo14569("bisque", "#ffe4c4");
        c25049M41247.mo14569("black", "#000000");
        c25049M41247.mo14569("blanchedalmond", "#ffebcd");
        c25049M41247.mo14569("blue", "#0000ff");
        c25049M41247.mo14569("blueviolet", "#8a2be2");
        c25049M41247.mo14569("brown", "#a52a2a");
        c25049M41247.mo14569("burlywood", "#deb887");
        c25049M41247.mo14569("cadetblue", "#5f9ea0");
        c25049M41247.mo14569("chartreuse", "#7fff00");
        c25049M41247.mo14569("chocolate", "#d2691e");
        c25049M41247.mo14569("coral", "#ff7f50");
        c25049M41247.mo14569("cornflowerblue", "#6495ed");
        c25049M41247.mo14569("cornsilk", "#fff8dc");
        c25049M41247.mo14569("crimson", "#dc143c");
        c25049M41247.mo14569("cyan", "#00ffff");
        c25049M41247.mo14569("darkblue", "#00008b");
        c25049M41247.mo14569("darkcyan", "#008b8b");
        c25049M41247.mo14569("darkgoldenrod", "#b8860b");
        c25049M41247.mo14569("darkgray", "#a9a9a9");
        c25049M41247.mo14569("darkgrey", "#a9a9a9");
        c25049M41247.mo14569("darkgreen", "#006400");
        c25049M41247.mo14569("darkkhaki", "#bdb76b");
        c25049M41247.mo14569("darkmagenta", "#8b008b");
        c25049M41247.mo14569("darkolivegreen", "#556b2f");
        c25049M41247.mo14569("darkorange", "#ff8c00");
        c25049M41247.mo14569("darkorchid", "#9932cc");
        c25049M41247.mo14569("darkred", "#8b0000");
        c25049M41247.mo14569("darksalmon", "#e9967a");
        c25049M41247.mo14569("darkseagreen", "#8fbc8f");
        c25049M41247.mo14569("darkslateblue", "#483d8b");
        c25049M41247.mo14569("darkslategray", "#2f4f4f");
        c25049M41247.mo14569("darkslategrey", "#2f4f4f");
        c25049M41247.mo14569("darkturquoise", "#00ced1");
        c25049M41247.mo14569("darkviolet", "#9400d3");
        c25049M41247.mo14569("deeppink", "#ff1493");
        c25049M41247.mo14569("deepskyblue", "#00bfff");
        c25049M41247.mo14569("dimgray", "#696969");
        c25049M41247.mo14569("dimgrey", "#696969");
        c25049M41247.mo14569("dodgerblue", "#1e90ff");
        c25049M41247.mo14569("firebrick", "#b22222");
        c25049M41247.mo14569("floralwhite", "#fffaf0");
        c25049M41247.mo14569("forestgreen", "#228b22");
        c25049M41247.mo14569("fuchsia", "#ff00ff");
        c25049M41247.mo14569("gainsboro", "#dcdcdc");
        c25049M41247.mo14569("ghostwhite", "#f8f8ff");
        c25049M41247.mo14569("gold", "#ffd700");
        c25049M41247.mo14569("goldenrod", "#daa520");
        c25049M41247.mo14569("gray", "#808080");
        c25049M41247.mo14569("grey", "#808080");
        c25049M41247.mo14569("green", "#008000");
        c25049M41247.mo14569("greenyellow", "#adff2f");
        c25049M41247.mo14569("honeydew", "#f0fff0");
        c25049M41247.mo14569("hotpink", "#ff69b4");
        c25049M41247.mo14569("indianred", "#cd5c5c");
        c25049M41247.mo14569("indigo", "#4b0082");
        c25049M41247.mo14569("ivory", "#fffff0");
        c25049M41247.mo14569("khaki", "#f0e68c");
        c25049M41247.mo14569("lavender", "#e6e6fa");
        c25049M41247.mo14569("lavenderblush", "#fff0f5");
        c25049M41247.mo14569("lawngreen", "#7cfc00");
        c25049M41247.mo14569("lemonchiffon", "#fffacd");
        c25049M41247.mo14569("lightblue", "#add8e6");
        c25049M41247.mo14569("lightcoral", "#f08080");
        c25049M41247.mo14569("lightcyan", "#e0ffff");
        c25049M41247.mo14569("lightgoldenrodyellow", "#fafad2");
        c25049M41247.mo14569("lightgray", "#d3d3d3");
        c25049M41247.mo14569("lightgrey", "#d3d3d3");
        c25049M41247.mo14569("lightgreen", "#90ee90");
        c25049M41247.mo14569("lightpink", "#ffb6c1");
        c25049M41247.mo14569("lightsalmon", "#ffa07a");
        c25049M41247.mo14569("lightseagreen", "#20b2aa");
        c25049M41247.mo14569("lightskyblue", "#87cefa");
        c25049M41247.mo14569("lightslategray", "#778899");
        c25049M41247.mo14569("lightslategrey", "#778899");
        c25049M41247.mo14569("lightsteelblue", "#b0c4de");
        c25049M41247.mo14569("lightyellow", "#ffffe0");
        c25049M41247.mo14569("lime", "#00ff00");
        c25049M41247.mo14569("limegreen", "#32cd32");
        c25049M41247.mo14569("linen", "#faf0e6");
        c25049M41247.mo14569("magenta", "#ff00ff");
        c25049M41247.mo14569("maroon", "#800000");
        c25049M41247.mo14569("mediumaquamarine", "#66cdaa");
        c25049M41247.mo14569("mediumblue", "#0000cd");
        c25049M41247.mo14569("mediumorchid", "#ba55d3");
        c25049M41247.mo14569("mediumpurple", "#9370db");
        c25049M41247.mo14569("mediumseagreen", "#3cb371");
        c25049M41247.mo14569("mediumslateblue", "#7b68ee");
        c25049M41247.mo14569("mediumspringgreen", "#00fa9a");
        c25049M41247.mo14569("mediumturquoise", "#48d1cc");
        c25049M41247.mo14569("mediumvioletred", "#c71585");
        c25049M41247.mo14569("midnightblue", "#191970");
        c25049M41247.mo14569("mintcream", "#f5fffa");
        c25049M41247.mo14569("mistyrose", "#ffe4e1");
        c25049M41247.mo14569("moccasin", "#ffe4b5");
        c25049M41247.mo14569("navajowhite", "#ffdead");
        c25049M41247.mo14569("navy", "#000080");
        c25049M41247.mo14569("oldlace", "#fdf5e6");
        c25049M41247.mo14569("olive", "#808000");
        c25049M41247.mo14569("olivedrab", "#6b8e23");
        c25049M41247.mo14569("orange", "#ffa500");
        c25049M41247.mo14569("orangered", "#ff4500");
        c25049M41247.mo14569("orchid", "#da70d6");
        c25049M41247.mo14569("palegoldenrod", "#eee8aa");
        c25049M41247.mo14569("palegreen", "#98fb98");
        c25049M41247.mo14569("paleturquoise", "#afeeee");
        c25049M41247.mo14569("palevioletred", "#db7093");
        c25049M41247.mo14569("papayawhip", "#ffefd5");
        c25049M41247.mo14569("peachpuff", "#ffdab9");
        c25049M41247.mo14569("peru", "#cd853f");
        c25049M41247.mo14569("pink", "#ffc0cb");
        c25049M41247.mo14569("plum", "#dda0dd");
        c25049M41247.mo14569("powderblue", "#b0e0e6");
        c25049M41247.mo14569("purple", "#800080");
        c25049M41247.mo14569("rebeccapurple", "#663399");
        c25049M41247.mo14569("red", "#ff0000");
        c25049M41247.mo14569("rosybrown", "#bc8f8f");
        c25049M41247.mo14569("royalblue", "#4169e1");
        c25049M41247.mo14569("saddlebrown", "#8b4513");
        c25049M41247.mo14569("salmon", "#fa8072");
        c25049M41247.mo14569("sandybrown", "#f4a460");
        c25049M41247.mo14569("seagreen", "#2e8b57");
        c25049M41247.mo14569("seashell", "#fff5ee");
        c25049M41247.mo14569("sienna", "#a0522d");
        c25049M41247.mo14569("silver", "#c0c0c0");
        c25049M41247.mo14569("skyblue", "#87ceeb");
        c25049M41247.mo14569("slateblue", "#6a5acd");
        c25049M41247.mo14569("slategray", "#708090");
        c25049M41247.mo14569("slategrey", "#708090");
        c25049M41247.mo14569("snow", "#fffafa");
        c25049M41247.mo14569("springgreen", "#00ff7f");
        c25049M41247.mo14569("steelblue", "#4682b4");
        c25049M41247.mo14569("tan", "#d2b48c");
        c25049M41247.mo14569("teal", "#008080");
        c25049M41247.mo14569("thistle", "#d8bfd8");
        c25049M41247.mo14569("tomato", "#ff6347");
        c25049M41247.mo14569("turquoise", "#40e0d0");
        c25049M41247.mo14569("violet", "#ee82ee");
        c25049M41247.mo14569("wheat", "#f5deb3");
        c25049M41247.mo14569("white", "#ffffff");
        c25049M41247.mo14569("whitesmoke", "#f5f5f5");
        c25049M41247.mo14569("yellow", "#ffff00");
        c25049M41247.mo14569("yellowgreen", "#9acd32");
        f30281 = c25049M41247.mo14568();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24555(String str) {
        String strTrim = str.trim();
        if (strTrim.startsWith("#")) {
            return strTrim;
        }
        if ("none".equals(strTrim)) {
            return "#00000000";
        }
        if (strTrim.startsWith("rgb(") && strTrim.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
            String[] strArrSplit = strTrim.substring(4, strTrim.length() - 1).split(",");
            if (strArrSplit.length != 3) {
                throw new IllegalArgumentException(str);
            }
            StringBuilder sbM3018 = C0703.m3018(7, "#");
            for (int i = 0; i < 3; i++) {
                sbM3018.append(String.format("%02X", Integer.valueOf(m24554(strArrSplit[i].trim(), str))));
            }
            return sbM3018.toString();
        }
        if (!strTrim.startsWith("rgba(") || !strTrim.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
            return (String) f30281.get(strTrim.toLowerCase(Locale.ENGLISH));
        }
        String[] strArrSplit2 = strTrim.substring(5, strTrim.length() - 1).split(",");
        if (strArrSplit2.length != 4) {
            throw new IllegalArgumentException(str);
        }
        StringBuilder sbM3019 = C0703.m3018(9, "#");
        for (int i2 = 0; i2 < 4; i2++) {
            sbM3019.append(String.format("%02X", Integer.valueOf(m24554(strArrSplit2[(i2 + 3) % 4].trim(), str))));
        }
        return sbM3019.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24554(String str, String str2) {
        try {
            return str.endsWith("%") ? Math.max(0, Math.min(255, Math.round((Float.parseFloat(str.substring(0, str.length() - 1)) * 255.0f) / 100.0f))) : Math.max(0, Math.min(255, Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(str2);
        }
    }
}
