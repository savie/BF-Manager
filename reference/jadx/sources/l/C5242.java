package l;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۚۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 096Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5242 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f18173;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18172 = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18174 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f18175 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap map = new HashMap();
        f18173 = map;
        C6009.m16314(-984833, map, "aliceblue", -332841, "antiquewhite");
        C15037.m36025(map, "aqua", -16711681, -8388652, "aquamarine");
        C6009.m16314(-983041, map, "azure", -657956, "beige");
        C6009.m16314(-6972, map, "bisque", -16777216, "black");
        C6009.m16314(-5171, map, "blanchedalmond", -16776961, "blue");
        C6009.m16314(-7722014, map, "blueviolet", -5952982, "brown");
        C6009.m16314(-2180985, map, "burlywood", -10510688, "cadetblue");
        C6009.m16314(-8388864, map, "chartreuse", -2987746, "chocolate");
        C6009.m16314(-32944, map, "coral", -10185235, "cornflowerblue");
        C6009.m16314(-1828, map, "cornsilk", -2354116, "crimson");
        C15037.m36025(map, "cyan", -16711681, -16777077, "darkblue");
        C6009.m16314(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        C15037.m36025(map, "darkgray", -5658199, -16751616, "darkgreen");
        C15037.m36025(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        C6009.m16314(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        C6009.m16314(-29696, map, "darkorange", -6737204, "darkorchid");
        C6009.m16314(-7667712, map, "darkred", -1468806, "darksalmon");
        C6009.m16314(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        C15037.m36025(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        C6009.m16314(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        C15037.m36025(map, "dodgerblue", -14774017, -5103070, "firebrick");
        C6009.m16314(-1296, map, "floralwhite", -14513374, "forestgreen");
        C15037.m36025(map, "fuchsia", -65281, -2302756, "gainsboro");
        C6009.m16314(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        C6009.m16314(-16744448, map, "green", -5374161, "greenyellow");
        C15037.m36025(map, "grey", -8355712, -983056, "honeydew");
        C6009.m16314(-38476, map, "hotpink", -3318692, "indianred");
        C6009.m16314(-11861886, map, "indigo", -16, "ivory");
        C6009.m16314(-989556, map, "khaki", -1644806, "lavender");
        C6009.m16314(-3851, map, "lavenderblush", -8586240, "lawngreen");
        C6009.m16314(-1331, map, "lemonchiffon", -5383962, "lightblue");
        C6009.m16314(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        C6009.m16314(-18751, map, "lightpink", -24454, "lightsalmon");
        C6009.m16314(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        C15037.m36025(map, "lightsteelblue", -5192482, -32, "lightyellow");
        C6009.m16314(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        C6009.m16314(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        C6009.m16314(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        C6009.m16314(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        C6009.m16314(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        C6009.m16314(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        C6009.m16314(-15132304, map, "midnightblue", -655366, "mintcream");
        C6009.m16314(-6943, map, "mistyrose", -6987, "moccasin");
        C6009.m16314(-8531, map, "navajowhite", -16777088, "navy");
        C6009.m16314(-133658, map, "oldlace", -8355840, "olive");
        C6009.m16314(-9728477, map, "olivedrab", -23296, "orange");
        C6009.m16314(-47872, map, "orangered", -2461482, "orchid");
        C6009.m16314(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        C6009.m16314(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        C6009.m16314(-4139, map, "papayawhip", -9543, "peachpuff");
        C6009.m16314(-3308225, map, "peru", -16181, "pink");
        C6009.m16314(-2252579, map, "plum", -5185306, "powderblue");
        C6009.m16314(-8388480, map, "purple", -10079335, "rebeccapurple");
        C6009.m16314(-65536, map, "red", -4419697, "rosybrown");
        C6009.m16314(-12490271, map, "royalblue", -7650029, "saddlebrown");
        C6009.m16314(-360334, map, "salmon", -744352, "sandybrown");
        C6009.m16314(-13726889, map, "seagreen", -2578, "seashell");
        C6009.m16314(-6270419, map, "sienna", -4144960, "silver");
        C6009.m16314(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        C15037.m36025(map, "snow", -1286, -16711809, "springgreen");
        C6009.m16314(-12156236, map, "steelblue", -2968436, "tan");
        C6009.m16314(-16744320, map, "teal", -2572328, "thistle");
        C6009.m16314(-40121, map, "tomato", 0, "transparent");
        C6009.m16314(-12525360, map, "turquoise", -1146130, "violet");
        C6009.m16314(-663885, map, "wheat", -1, "white");
        C6009.m16314(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m14437(String str) {
        return m14436(str, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m14435(String str) {
        return m14436(str, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m14436(String str, boolean z) {
        int i;
        C2023.m6507(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? f18175 : f18174).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f18172.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f18173.get(C20733.m46672(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
