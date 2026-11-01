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

/* JADX INFO: renamed from: l.֫۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8SE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1702 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Map f6725;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Map f6727;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6726 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6728 = Pattern.compile("(\\S+?):(\\S+)");

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
        f6725 = C0561.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f6727 = C0561.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12287 m5648(C2460 c2460, ArrayList arrayList) {
        c2460.getClass();
        Charset charset = StandardCharsets.UTF_8;
        String strM7523 = c2460.m7523(charset);
        if (strM7523 != null) {
            Pattern pattern = f6726;
            Matcher matcher = pattern.matcher(strM7523);
            if (matcher.matches()) {
                return m5647(null, matcher, c2460, arrayList);
            }
            String strM7524 = c2460.m7523(charset);
            if (strM7524 != null) {
                Matcher matcher2 = pattern.matcher(strM7524);
                if (matcher2.matches()) {
                    return m5647(strM7523.trim(), matcher2, c2460, arrayList);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20369 m5649(String str) {
        C14404 c14404 = new C14404();
        m5651(str, c14404);
        return c14404.m34671();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SpannedString m5645(String str, String str2, List list) {
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
                            C0303.m1848("ignoring unsupported entity: '&" + strSubstring + ";'");
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
                        C2023.m6507(!strTrim.isEmpty());
                        String str3 = C17983.f57504;
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
                                        C10876 c10876 = (C10876) arrayDeque.pop();
                                        m5650(str, c10876, arrayList, spannableStringBuilder, list);
                                        if (!arrayDeque.isEmpty()) {
                                            arrayList.add(new C5936(c10876, spannableStringBuilder.length()));
                                        } else {
                                            arrayList.clear();
                                        }
                                        if (c10876.f36986.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else {
                                    if (!z2) {
                                        arrayDeque.push(C10876.m27245(spannableStringBuilder.length(), strSubstring2));
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
            m5650(str, (C10876) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m5650(str, C10876.m27244(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12287 m5647(String str, Matcher matcher, C2460 c2460, ArrayList arrayList) {
        C14404 c14404 = new C14404();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c14404.f47228 = C3113.m9341(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c14404.f47224 = C3113.m9341(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m5651(strGroup3, c14404);
            StringBuilder sb = new StringBuilder();
            c2460.getClass();
            while (true) {
                String strM7523 = c2460.m7523(StandardCharsets.UTF_8);
                if (!TextUtils.isEmpty(strM7523)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(strM7523.trim());
                } else {
                    c14404.f47223 = m5645(str, sb.toString(), arrayList);
                    return new C12287(c14404.m34671().m45996(), c14404.f47228, c14404.f47224);
                }
            }
        } catch (IllegalArgumentException unused) {
            C0303.m1848("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5651(String str, C14404 c14404) {
        Matcher matcher = f6728.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m5653(strGroup2, c14404);
                } else {
                    if (!"align".equals(strGroup)) {
                        if (!"position".equals(strGroup)) {
                            if ("size".equals(strGroup)) {
                                c14404.f47221 = C3113.m9338(strGroup2);
                            } else if (!"vertical".equals(strGroup)) {
                                C0303.m1848("Unknown cue setting " + strGroup + ":" + strGroup2);
                            } else {
                                if (strGroup2.equals("lr")) {
                                    i = 2;
                                } else if (!strGroup2.equals("rl")) {
                                    C0303.m1848("Invalid 'vertical' value: ".concat(strGroup2));
                                    i = Integer.MIN_VALUE;
                                }
                                c14404.f47231 = i;
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
                                        C0303.m1848("Invalid anchor value: ".concat(strSubstring));
                                        i = Integer.MIN_VALUE;
                                        break;
                                }
                                c14404.f47230 = i;
                                strGroup2 = strGroup2.substring(0, iIndexOf);
                            }
                            c14404.f47225 = C3113.m9338(strGroup2);
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
                                C0303.m1848("Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        c14404.f47226 = i;
                    }
                }
            } catch (NumberFormatException unused) {
                C0303.m1848("Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m5653(String str, C14404 c14404) {
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
                    C0303.m1848("Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            c14404.f47227 = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c14404.f47229 = C3113.m9338(str);
            c14404.f47222 = 0;
        } else {
            c14404.f47229 = Integer.parseInt(str);
            c14404.f47222 = 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5650(String str, C10876 c10876, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i = c10876.f36985;
        int length = spannableStringBuilder.length();
        String str2 = c10876.f36986;
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
                for (String str3 : c10876.f36984) {
                    Map map = f6725;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = f6727;
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
                spannableStringBuilder.setSpan(new C14725(c10876.f36983), i, length, 33);
                break;
            case "ruby":
                int iM5652 = m5652(list2, str, c10876);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C5936.f20206);
                int i3 = c10876.f36985;
                int i4 = 0;
                int length2 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((C5936) arrayList.get(i4)).f20208.f36986)) {
                        C5936 c5936 = (C5936) arrayList.get(i4);
                        int iM5653 = m5652(list2, str, c5936.f20208);
                        if (iM5653 == i2) {
                            iM5653 = iM5652 != i2 ? iM5652 : 1;
                        }
                        int i5 = c5936.f20208.f36985 - length2;
                        int i6 = c5936.f20207 - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                        spannableStringBuilder.delete(i5, i6);
                        spannableStringBuilder.setSpan(new C11197(charSequenceSubSequence.toString(), iM5653), i3, i5, 33);
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
        ArrayList arrayListM5646 = m5646(list2, str, c10876);
        for (int i7 = 0; i7 < arrayListM5646.size(); i7++) {
            C16520 c16520 = ((C23576) arrayListM5646.get(i7)).f76374;
            if (c16520.m38874() != -1) {
                C23805.m52454(spannableStringBuilder, new StyleSpan(c16520.m38874()), i, length);
            }
            if (c16520.m38883()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (c16520.m38878()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (c16520.m38870()) {
                C23805.m52454(spannableStringBuilder, new ForegroundColorSpan(c16520.m38871()), i, length);
            }
            if (c16520.m38861()) {
                C23805.m52454(spannableStringBuilder, new BackgroundColorSpan(c16520.m38862()), i, length);
            }
            if (c16520.m38858() != null) {
                C23805.m52454(spannableStringBuilder, new TypefaceSpan(c16520.m38858()), i, length);
            }
            int iM38882 = c16520.m38882();
            if (iM38882 == 1) {
                C23805.m52454(spannableStringBuilder, new AbsoluteSizeSpan((int) c16520.m38869(), true), i, length);
            } else if (iM38882 == 2) {
                C23805.m52454(spannableStringBuilder, new RelativeSizeSpan(c16520.m38869()), i, length);
            } else if (iM38882 == 3) {
                C23805.m52454(spannableStringBuilder, new RelativeSizeSpan(c16520.m38869() / 100.0f), i, length);
            }
            if (c16520.m38877()) {
                spannableStringBuilder.setSpan(new C17546(), i, length, 33);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m5652(List list, String str, C10876 c10876) {
        ArrayList arrayListM5646 = m5646(list, str, c10876);
        for (int i = 0; i < arrayListM5646.size(); i++) {
            C16520 c16520 = ((C23576) arrayListM5646.get(i)).f76374;
            if (c16520.m38857() != -1) {
                return c16520.m38857();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5646(List list, String str, C10876 c10876) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C16520 c16520 = (C16520) list.get(i);
            int iM38863 = c16520.m38863(str, c10876.f36986, c10876.f36984, c10876.f36983);
            if (iM38863 > 0) {
                arrayList.add(new C23576(iM38863, c16520));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
