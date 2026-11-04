package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۠ۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8355 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C15570 f27402 = new C15570(EnumC20046.BR_TAG, "<br>");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C15570 f27404 = new C15570(EnumC20046.PARAGRAPH_OPEN_TAG, "<p>");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f27403 = Pattern.compile("^<\\w+\\s*/?\\s*>", 2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f27401 = Pattern.compile(" */[*][*]\n *[*] (.*)\n *[*]/");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m22488(int i, String str) {
        try {
            AbstractC1928 abstractC1928M33283 = C13575.m33283(str);
            C11095 c11095 = new C11095(i);
            AbstractC14956 abstractC14956ListIterator = abstractC1928M33283.listIterator(0);
            while (abstractC14956ListIterator.hasNext()) {
                C15570 c15570 = (C15570) abstractC14956ListIterator.next();
                int i2 = C2389.f7686[c15570.m37287().ordinal()];
                Pattern pattern = f27403;
                switch (i2) {
                    case 1:
                        c11095.m28034();
                        break;
                    case 2:
                        c11095.m28023();
                        String string = c11095.toString();
                        Matcher matcher = f27401.matcher(string);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            if (strGroup.isEmpty()) {
                                return "/** */";
                            }
                            if (strGroup.length() <= 93 - i && (!strGroup.startsWith("@") || strGroup.equals("@hide"))) {
                                return C14442.m34865("/** ", strGroup, " */");
                            }
                        }
                        return string;
                    case 3:
                        c11095.m28028(c15570);
                        break;
                    case 4:
                        c11095.m28026(c15570);
                        break;
                    case 5:
                        c11095.m28022(c15570);
                        break;
                    case 6:
                        c11095.m28030(c15570);
                        break;
                    case 7:
                        c11095.m28025(c15570);
                        break;
                    case 8:
                        c11095.m28040(c15570);
                        break;
                    case 9:
                        c11095.m28021(c15570);
                        break;
                    case 10:
                        c11095.m28027(c15570);
                        break;
                    case 11:
                        if (pattern.matcher(c15570.m37289()).matches()) {
                            c15570 = f27404;
                        }
                        c11095.m28038(c15570);
                        break;
                    case 12:
                    case 13:
                        c11095.m28035(c15570);
                        break;
                    case 14:
                        c11095.m28033(c15570);
                        break;
                    case 15:
                        c11095.m28017(c15570);
                        break;
                    case 16:
                        c11095.m28032(c15570);
                        break;
                    case 17:
                        c11095.m28037(c15570);
                        break;
                    case 18:
                        c11095.m28018(c15570);
                        break;
                    case 19:
                        c11095.m28039(c15570);
                        break;
                    case 20:
                        c11095.m28020(c15570);
                        break;
                    case 21:
                        c11095.m28029(c15570);
                        break;
                    case 22:
                        c11095.m28016(c15570);
                        break;
                    case 23:
                        if (pattern.matcher(c15570.m37289()).matches()) {
                            c15570 = f27402;
                        }
                        c11095.m28024(c15570);
                        break;
                    case 24:
                        c11095.m28019();
                        break;
                    case 25:
                        c11095.m28036();
                        break;
                    case 26:
                        c11095.m28031(c15570);
                        break;
                    case 27:
                    case 28:
                    case 29:
                        break;
                    default:
                        throw new AssertionError(c15570.m37287());
                }
            }
            throw new AssertionError();
        } catch (C6864 unused) {
            return str;
        }
    }
}
