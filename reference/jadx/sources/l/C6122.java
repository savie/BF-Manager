package l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۛۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E8SE */
/* JADX INFO: loaded from: classes3.dex */
public final class C6122 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Map f20890;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Map f20892;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f20889 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f20891 = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f20892 = C4681.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f20890 = C4681.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17308 m17682(C21287 c21287, ArrayList arrayList) {
        c21287.getClass();
        Charset charset = StandardCharsets.UTF_8;
        String strM48515 = c21287.m48515(charset);
        if (strM48515 != null) {
            Pattern pattern = f20889;
            Matcher matcher = pattern.matcher(strM48515);
            if (matcher.matches()) {
                return m17681(null, matcher, c21287, arrayList);
            }
            String strM48516 = c21287.m48515(charset);
            if (strM48516 != null) {
                Matcher matcher2 = pattern.matcher(strM48516);
                if (matcher2.matches()) {
                    return m17681(strM48515.trim(), matcher2, c21287, arrayList);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5866 m17680(String str) {
        C12087 c12087 = new C12087();
        m17684(str, c12087);
        return c12087.m30269();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SpannedString m17678(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            C1896.m6517("ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt == '<') {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim = strSubstring2.trim();
                        C20782.m47565(!strTrim.isEmpty());
                        String str3 = C7116.f23455;
                        String str4 = strTrim.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        C3138 c3138 = (C3138) arrayDeque.pop();
                                        m17683(str, c3138, arrayList, spannableStringBuilder, list);
                                        if (!arrayDeque.isEmpty()) {
                                            arrayList.add(new C23276(c3138, spannableStringBuilder.length()));
                                        } else {
                                            arrayList.clear();
                                        }
                                        if (c3138.f10171.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else {
                                    if (!z2) {
                                        arrayDeque.push(C3138.m10255(spannableStringBuilder.length(), strSubstring2));
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            } else {
                spannableStringBuilder.append(cCharAt);
                i++;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m17683(str, (C3138) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m17683(str, C3138.m10254(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17308 m17681(String str, Matcher matcher, C21287 c21287, ArrayList arrayList) {
        C12087 c12087 = new C12087();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c12087.f38922 = C3884.m12524(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c12087.f38921 = C3884.m12524(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m17684(strGroup3, c12087);
            StringBuilder sb = new StringBuilder();
            c21287.getClass();
            while (true) {
                String strM48515 = c21287.m48515(StandardCharsets.UTF_8);
                if (!TextUtils.isEmpty(strM48515)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(strM48515.trim());
                } else {
                    c12087.f38920 = m17678(str, sb.toString(), arrayList);
                    return new C17308(c12087.m30269().m17073(), c12087.f38922, c12087.f38921);
                }
            }
        } catch (IllegalArgumentException unused) {
            C1896.m6517("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17684(String str, C12087 c12087) {
        Matcher matcher = f20891.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m17686(strGroup2, c12087);
                } else {
                    if (!"align".equals(strGroup)) {
                        if (!"position".equals(strGroup)) {
                            if ("size".equals(strGroup)) {
                                c12087.f38925 = C3884.m12521(strGroup2);
                            } else if (!"vertical".equals(strGroup)) {
                                C1896.m6517("Unknown cue setting " + strGroup + ":" + strGroup2);
                            } else {
                                if (strGroup2.equals("lr")) {
                                    i = 2;
                                } else if (!strGroup2.equals("rl")) {
                                    C1896.m6517("Invalid 'vertical' value: ".concat(strGroup2));
                                    i = Integer.MIN_VALUE;
                                }
                                c12087.f38930 = i;
                            }
                        } else {
                            int iIndexOf = strGroup2.indexOf(44);
                            if (iIndexOf != -1) {
                                String strSubstring = strGroup2.substring(iIndexOf + 1);
                                strSubstring.getClass();
                                switch (strSubstring) {
                                    case "line-left":
                                    case "start":
                                        i = 0;
                                        break;
                                    case "center":
                                    case "middle":
                                        break;
                                    case "line-right":
                                    case "end":
                                        i = 2;
                                        break;
                                    default:
                                        C1896.m6517("Invalid anchor value: ".concat(strSubstring));
                                        i = Integer.MIN_VALUE;
                                        break;
                                }
                                c12087.f38926 = i;
                                strGroup2 = strGroup2.substring(0, iIndexOf);
                            }
                            c12087.f38927 = C3884.m12521(strGroup2);
                        }
                    } else {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                break;
                            default:
                                C1896.m6517("Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        c12087.f38924 = i;
                    }
                }
            } catch (NumberFormatException unused) {
                C1896.m6517("Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m17686(String str, C12087 c12087) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            int i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    C1896.m6517("Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            c12087.f38923 = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c12087.f38928 = C3884.m12521(str);
            c12087.f38929 = 0;
        } else {
            c12087.f38928 = Integer.parseInt(str);
            c12087.f38929 = 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17683(String str, C3138 c3138, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = c3138.f10170;
        int length = spannableStringBuilder.length();
        String str2 = c3138.f10171;
        str2.getClass();
        int i2 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                for (String str3 : c3138.f10169) {
                    Map map = f20892;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = f20890;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new C3628(c3138.f10172), i, length, 33);
                break;
            case "ruby":
                int iM17685 = m17685(list2, str, c3138);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C23276.f75429);
                int i3 = c3138.f10170;
                int i4 = 0;
                int length2 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((C23276) arrayList.get(i4)).f75431.f10171)) {
                        C23276 c23276 = (C23276) arrayList.get(i4);
                        int iM17686 = m17685(list2, str, c23276.f75431);
                        if (iM17686 == i2) {
                            iM17686 = iM17685 != i2 ? iM17685 : 1;
                        }
                        int i5 = c23276.f75431.f10170 - length2;
                        int i6 = c23276.f75430 - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                        spannableStringBuilder.delete(i5, i6);
                        spannableStringBuilder.setSpan(new C16306(charSequenceSubSequence.toString(), iM17686), i3, i5, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i3 = i5;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListM17679 = m17679(list2, str, c3138);
        for (int i7 = 0; i7 < arrayListM17679.size(); i7++) {
            C16562 c16562 = ((C20292) arrayListM17679.get(i7)).f65151;
            if (c16562.m39218() != -1) {
                C8485.m22803(spannableStringBuilder, new StyleSpan(c16562.m39218()), i, length);
            }
            if (c16562.m39236()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (c16562.m39226()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (c16562.m39222()) {
                C8485.m22803(spannableStringBuilder, new ForegroundColorSpan(c16562.m39219()), i, length);
            }
            if (c16562.m39210()) {
                C8485.m22803(spannableStringBuilder, new BackgroundColorSpan(c16562.m39211()), i, length);
            }
            if (c16562.m39232() != null) {
                C8485.m22803(spannableStringBuilder, new TypefaceSpan(c16562.m39232()), i, length);
            }
            int iM39224 = c16562.m39224();
            if (iM39224 == 1) {
                C8485.m22803(spannableStringBuilder, new AbsoluteSizeSpan((int) c16562.m39228(), true), i, length);
            } else if (iM39224 == 2) {
                C8485.m22803(spannableStringBuilder, new RelativeSizeSpan(c16562.m39228()), i, length);
            } else if (iM39224 == 3) {
                C8485.m22803(spannableStringBuilder, new RelativeSizeSpan(c16562.m39228() / 100.0f), i, length);
            }
            if (c16562.m39231()) {
                spannableStringBuilder.setSpan(new C17052(), i, length, 33);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m17685(List list, String str, C3138 c3138) {
        ArrayList arrayListM17679 = m17679(list, str, c3138);
        for (int i = 0; i < arrayListM17679.size(); i++) {
            C16562 c16562 = ((C20292) arrayListM17679.get(i)).f65151;
            if (c16562.m39223() != -1) {
                return c16562.m39223();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m17679(List list, String str, C3138 c3138) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C16562 c16562 = (C16562) list.get(i);
            int iM39212 = c16562.m39212(str, c3138.f10171, c3138.f10169, c3138.f10172);
            if (iM39212 > 0) {
                arrayList.add(new C20292(iM39212, c16562));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
