package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۨۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 07OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C11689 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C22978 f39301 = new C22978(EnumC6749.BR_TAG, "<br>");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C22978 f39299 = new C22978(EnumC6749.PARAGRAPH_OPEN_TAG, "<p>");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39302 = Pattern.compile("^<\\w+\\s*/?\\s*>", 2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f39300 = Pattern.compile(" */[*][*]\n *[*] (.*)\n *[*]/");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29181(int i, String str) {
        try {
            AbstractC22433 abstractC22433M14818 = C5338.m14818(str);
            C13100 c13100 = new C13100(i);
            AbstractC16706 abstractC16706ListIterator = abstractC22433M14818.listIterator(0);
            while (abstractC16706ListIterator.hasNext()) {
                C22978 c22978 = (C22978) abstractC16706ListIterator.next();
                int i2 = C13806.f45560[c22978.m50815().ordinal()];
                Pattern pattern = f39302;
                switch (i2) {
                    case 1:
                        c13100.m32339();
                        break;
                    case 2:
                        c13100.m32336();
                        String string = c13100.toString();
                        Matcher matcher = f39300.matcher(string);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            if (strGroup.isEmpty()) {
                                return "/** */";
                            }
                            if (strGroup.length() <= 93 - i && (!strGroup.startsWith("@") || strGroup.equals("@hide"))) {
                                return C16523.m38890("/** ", strGroup, " */");
                            }
                        }
                        return string;
                    case 3:
                        c13100.m32347(c22978);
                        break;
                    case 4:
                        c13100.m32334(c22978);
                        break;
                    case 5:
                        c13100.m32335(c22978);
                        break;
                    case 6:
                        c13100.m32341(c22978);
                        break;
                    case 7:
                        c13100.m32331(c22978);
                        break;
                    case 8:
                        c13100.m32348(c22978);
                        break;
                    case 9:
                        c13100.m32338(c22978);
                        break;
                    case 10:
                        c13100.m32324(c22978);
                        break;
                    case 11:
                        if (pattern.matcher(c22978.m50817()).matches()) {
                            c22978 = f39299;
                        }
                        c13100.m32343(c22978);
                        break;
                    case 12:
                    case 13:
                        c13100.m32340(c22978);
                        break;
                    case 14:
                        c13100.m32344(c22978);
                        break;
                    case 15:
                        c13100.m32333(c22978);
                        break;
                    case 16:
                        c13100.m32330(c22978);
                        break;
                    case 17:
                        c13100.m32326(c22978);
                        break;
                    case 18:
                        c13100.m32345(c22978);
                        break;
                    case 19:
                        c13100.m32332(c22978);
                        break;
                    case 20:
                        c13100.m32329(c22978);
                        break;
                    case 21:
                        c13100.m32342(c22978);
                        break;
                    case 22:
                        c13100.m32327(c22978);
                        break;
                    case 23:
                        if (pattern.matcher(c22978.m50817()).matches()) {
                            c22978 = f39301;
                        }
                        c13100.m32337(c22978);
                        break;
                    case 24:
                        c13100.m32328();
                        break;
                    case 25:
                        c13100.m32325();
                        break;
                    case 26:
                        c13100.m32346(c22978);
                        break;
                    case 27:
                    case 28:
                    case 29:
                        break;
                    default:
                        throw new AssertionError(c22978.m50815());
                }
            }
            throw new AssertionError();
        } catch (C2515 unused) {
            return str;
        }
    }
}
