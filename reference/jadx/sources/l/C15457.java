package l;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܶ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBIX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15457 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String[] f50369 = {",", ">", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "~", " "};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f50370 = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f50371 = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f50372 = Pattern.compile("([+-])?(\\d+)");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50373 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17988 f50374;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f50375;

    public C15457(String str) {
        C5557.m15342(str);
        String strTrim = str.trim();
        this.f50375 = strTrim;
        this.f50374 = new C17988(strTrim);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC4166 m36984(String str) {
        try {
            return new C15457(str).m36992();
        } catch (IllegalArgumentException e) {
            throw new C21806(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4166 m36992() {
        C17988 c17988 = this.f50374;
        c17988.m41890();
        String[] strArr = f50369;
        boolean zM41896 = c17988.m41896(strArr);
        ArrayList arrayList = this.f50373;
        if (zM41896) {
            arrayList.add(new C21100());
            m36985(c17988.m41894());
        } else {
            m36988();
        }
        while (!c17988.m41897()) {
            boolean zM41890 = c17988.m41890();
            if (c17988.m41896(strArr)) {
                m36985(c17988.m41894());
            } else if (zM41890) {
                m36985(' ');
            } else {
                m36988();
            }
        }
        if (arrayList.size() == 1) {
            return (AbstractC4166) arrayList.get(0);
        }
        return new C2070(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0120  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36985(char c) {
        AbstractC4166 c2070;
        boolean z;
        AbstractC4166 abstractC4166;
        C2070 c2071;
        AbstractC3481 abstractC3481;
        C17988 c17988 = this.f50374;
        c17988.m41890();
        StringBuilder sbM11782 = C4145.m11782();
        while (!c17988.m41897()) {
            if (c17988.m41892(MotionUtils.EASING_TYPE_FORMAT_START)) {
                sbM11782.append(MotionUtils.EASING_TYPE_FORMAT_START);
                sbM11782.append(c17988.m41887('(', ')'));
                sbM11782.append(MotionUtils.EASING_TYPE_FORMAT_END);
            } else if (c17988.m41892("[")) {
                sbM11782.append("[");
                sbM11782.append(c17988.m41887('[', ']'));
                sbM11782.append("]");
            } else if (!c17988.m41896(f50369)) {
                sbM11782.append(c17988.m41894());
            } else if (sbM11782.length() > 0) {
                break;
            } else {
                c17988.m41894();
            }
        }
        AbstractC4166 abstractC4166M36984 = m36984(C4145.m11780(sbM11782));
        ArrayList arrayList = this.f50373;
        if (arrayList.size() == 1) {
            c2070 = (AbstractC4166) arrayList.get(0);
            if ((c2070 instanceof C9833) && c != ',') {
                C9833 c9833 = (C9833) c2070;
                int i = c9833.f12777;
                abstractC4166 = i > 0 ? (AbstractC4166) c9833.f12776.get(i - 1) : null;
                z = true;
            }
            arrayList.clear();
            if (c != ' ') {
                C10518 c10518 = new C10518();
                c10518.f52228 = abstractC4166;
                c2071 = new C2070(c10518, abstractC4166M36984);
            } else if (c != '>') {
                C8401 c8401 = new C8401();
                c8401.f52228 = abstractC4166;
                c2071 = new C2070(c8401, abstractC4166M36984);
            } else {
                if (c != '~') {
                    if (c != '+') {
                        C19690 c19690 = new C19690();
                        c19690.f52228 = abstractC4166;
                        c2071 = new C2070(c19690, abstractC4166M36984);
                    } else {
                        if (c == ',') {
                            throw new C21806("Unknown combinator '%s'", Character.valueOf(c));
                        }
                        if (abstractC4166 instanceof C9833) {
                            abstractC3481 = (C9833) abstractC4166;
                        } else {
                            C9833 c9834 = new C9833();
                            ArrayList arrayList2 = c9834.f12776;
                            arrayList2.add(abstractC4166);
                            c9834.f12777 = arrayList2.size();
                            abstractC3481 = c9834;
                        }
                        ArrayList arrayList3 = abstractC3481.f12776;
                        arrayList3.add(abstractC4166M36984);
                        abstractC3481.f12777 = arrayList3.size();
                    }
                    if (z) {
                        C9833 c9835 = (C9833) c2070;
                        c9835.f12776.set(c9835.f12777 - 1, abstractC3481);
                    } else {
                        c2070 = abstractC3481;
                    }
                    arrayList.add(c2070);
                }
                C7695 c7695 = new C7695();
                c7695.f52228 = abstractC4166;
                c2071 = new C2070(c7695, abstractC4166M36984);
            }
            abstractC3481 = c2071;
            if (z) {
                C9833 c9836 = (C9833) c2070;
                c9836.f12776.set(c9836.f12777 - 1, abstractC3481);
            } else {
                c2070 = abstractC3481;
            }
            arrayList.add(c2070);
        }
        c2070 = new C2070(arrayList);
        z = false;
        abstractC4166 = c2070;
        arrayList.clear();
        if (c != ' ') {
            C10518 c10519 = new C10518();
            c10519.f52228 = abstractC4166;
            c2071 = new C2070(c10519, abstractC4166M36984);
        } else if (c != '>') {
            C8401 c8402 = new C8401();
            c8402.f52228 = abstractC4166;
            c2071 = new C2070(c8402, abstractC4166M36984);
        } else {
            if (c != '~') {
                if (c != '+') {
                    C19690 c19691 = new C19690();
                    c19691.f52228 = abstractC4166;
                    c2071 = new C2070(c19691, abstractC4166M36984);
                } else {
                    if (c == ',') {
                        throw new C21806("Unknown combinator '%s'", Character.valueOf(c));
                    }
                    if (abstractC4166 instanceof C9833) {
                        abstractC3481 = (C9833) abstractC4166;
                    } else {
                        C9833 c9837 = new C9833();
                        ArrayList arrayList4 = c9837.f12776;
                        arrayList4.add(abstractC4166);
                        c9837.f12777 = arrayList4.size();
                        abstractC3481 = c9837;
                    }
                    ArrayList arrayList5 = abstractC3481.f12776;
                    arrayList5.add(abstractC4166M36984);
                    abstractC3481.f12777 = arrayList5.size();
                }
                if (z) {
                    C9833 c9838 = (C9833) c2070;
                    c9838.f12776.set(c9838.f12777 - 1, abstractC3481);
                } else {
                    c2070 = abstractC3481;
                }
                arrayList.add(c2070);
            }
            C7695 c7696 = new C7695();
            c7696.f52228 = abstractC4166;
            c2071 = new C2070(c7696, abstractC4166M36984);
        }
        abstractC3481 = c2071;
        if (z) {
            C9833 c9839 = (C9833) c2070;
            c9839.f12776.set(c9839.f12777 - 1, abstractC3481);
        } else {
            c2070 = abstractC3481;
        }
        arrayList.add(c2070);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m36988() {
        C17988 c17988 = this.f50374;
        boolean zM41895 = c17988.m41895("#");
        ArrayList arrayList = this.f50373;
        if (zM41895) {
            String strM41891 = c17988.m41891();
            C5557.m15342(strM41891);
            arrayList.add(new C10393(strM41891));
            return;
        }
        if (c17988.m41895(".")) {
            String strM41892 = c17988.m41891();
            C5557.m15342(strM41892);
            arrayList.add(new C15332(strM41892.trim()));
            return;
        }
        if (c17988.m41884() || c17988.m41892("*|")) {
            String strM4723 = C1323.m4723(c17988.m41885());
            C5557.m15342(strM4723);
            if (!strM4723.startsWith("*|")) {
                if (strM4723.contains("|")) {
                    strM4723 = strM4723.replace("|", ":");
                }
                arrayList.add(new C1344(strM4723));
                return;
            }
            List listAsList = Arrays.asList(new C1344(strM4723.substring(2)), new C13340(strM4723.replace("*|", ":")));
            C9833 c9833 = new C9833();
            int i = c9833.f12777;
            ArrayList arrayList2 = c9833.f12776;
            if (i > 1) {
                arrayList2.add(new C2070(listAsList));
            } else {
                arrayList2.addAll(listAsList);
            }
            c9833.f12777 = arrayList2.size();
            arrayList.add(c9833);
            return;
        }
        boolean zM41892 = c17988.m41892("[");
        String str = this.f50375;
        if (zM41892) {
            C17988 c17989 = new C17988(c17988.m41887('[', ']'));
            String strM41888 = c17989.m41888(f50370);
            C5557.m15342(strM41888);
            c17989.m41890();
            if (c17989.m41897()) {
                if (strM41888.startsWith("^")) {
                    arrayList.add(new C5453(strM41888.substring(1)));
                    return;
                } else {
                    arrayList.add(new C11804(strM41888));
                    return;
                }
            }
            if (c17989.m41895("=")) {
                arrayList.add(new C22387(strM41888, c17989.m41893(), true));
                return;
            }
            if (c17989.m41895("!=")) {
                arrayList.add(new C6864(strM41888, c17989.m41893(), true));
                return;
            }
            if (c17989.m41895("^=")) {
                arrayList.add(new C23093(strM41888, c17989.m41893(), false));
                return;
            }
            if (c17989.m41895("$=")) {
                arrayList.add(new C13215(strM41888, c17989.m41893(), false));
                return;
            }
            if (c17989.m41895("*=")) {
                arrayList.add(new C1219(strM41888, c17989.m41893(), true));
                return;
            }
            if (!c17989.m41895("~=")) {
                throw new C21806("Could not parse attribute query '%s': unexpected token at '%s'", str, c17989.m41893());
            }
            Pattern patternCompile = Pattern.compile(c17989.m41893());
            C4041 c4041 = new C4041();
            c4041.f14937 = C1323.m4723(strM41888);
            c4041.f14938 = patternCompile;
            arrayList.add(c4041);
            return;
        }
        if (c17988.m41895("*")) {
            arrayList.add(new C13921());
            return;
        }
        if (c17988.m41895(":lt(")) {
            arrayList.add(new C20271(m36990()));
            return;
        }
        if (c17988.m41895(":gt(")) {
            arrayList.add(new C16038(m36990()));
            return;
        }
        if (c17988.m41895(":eq(")) {
            arrayList.add(new C7570(m36990()));
            return;
        }
        if (c17988.m41892(":has(")) {
            c17988.m41889(":has");
            String strM41887 = c17988.m41887('(', ')');
            C5557.m15343(strM41887, ":has(selector) sub-select must not be empty");
            arrayList.add(new C18984(m36984(strM41887)));
            return;
        }
        if (c17988.m41892(":contains(")) {
            m36986(false);
            return;
        }
        if (c17988.m41892(":containsOwn(")) {
            m36986(true);
            return;
        }
        if (c17988.m41892(":containsWholeText(")) {
            m36991(false);
            return;
        }
        if (c17988.m41892(":containsWholeOwnText(")) {
            m36991(true);
            return;
        }
        if (c17988.m41892(":containsData(")) {
            c17988.m41889(":containsData");
            String strM41883 = C17988.m41883(c17988.m41887('(', ')'));
            C5557.m15343(strM41883, ":containsData(text) query must not be empty");
            arrayList.add(new C21681(strM41883));
            return;
        }
        if (c17988.m41892(":matches(")) {
            m36989(false);
            return;
        }
        if (c17988.m41892(":matchesOwn(")) {
            m36989(true);
            return;
        }
        if (c17988.m41892(":matchesWholeText(")) {
            m36983(false);
            return;
        }
        if (c17988.m41892(":matchesWholeOwnText(")) {
            m36983(true);
            return;
        }
        if (c17988.m41892(":not(")) {
            c17988.m41889(":not");
            String strM41889 = c17988.m41887('(', ')');
            C5557.m15343(strM41889, ":not(selector) subselect must not be empty");
            AbstractC4166 abstractC4166M36984 = m36984(strM41889);
            C9107 c9107 = new C9107();
            c9107.f52228 = abstractC4166M36984;
            arrayList.add(c9107);
            return;
        }
        if (c17988.m41895(":nth-child(")) {
            m36987(false, false);
            return;
        }
        if (c17988.m41895(":nth-last-child(")) {
            m36987(true, false);
            return;
        }
        if (c17988.m41895(":nth-of-type(")) {
            m36987(false, true);
            return;
        }
        if (c17988.m41895(":nth-last-of-type(")) {
            m36987(true, true);
            return;
        }
        if (c17988.m41895(":first-child")) {
            arrayList.add(new C16743());
            return;
        }
        if (c17988.m41895(":last-child")) {
            arrayList.add(new C17448());
            return;
        }
        if (c17988.m41895(":first-of-type")) {
            arrayList.add(new C12510(0, 1));
            return;
        }
        if (c17988.m41895(":last-of-type")) {
            arrayList.add(new C6159(0, 1));
            return;
        }
        if (c17988.m41895(":only-child")) {
            arrayList.add(new C9688());
            return;
        }
        if (c17988.m41895(":only-of-type")) {
            arrayList.add(new C3336());
            return;
        }
        if (c17988.m41895(":empty")) {
            arrayList.add(new C0514());
        } else if (c17988.m41895(":root")) {
            arrayList.add(new C4872());
        } else {
            if (!c17988.m41895(":matchText")) {
                throw new C21806("Could not parse query '%s': unexpected token at '%s'", str, c17988.m41893());
            }
            arrayList.add(new C14046());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36987(boolean z, boolean z2) {
        String strM4723 = C1323.m4723(this.f50374.m41886());
        Matcher matcher = f50371.matcher(strM4723);
        Matcher matcher2 = f50372.matcher(strM4723);
        int i = 2;
        int i2 = 1;
        if (!"odd".equals(strM4723)) {
            if ("even".equals(strM4723)) {
                i2 = 0;
            } else if (matcher.matches()) {
                int i3 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i2 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i = i3;
            } else if (matcher2.matches()) {
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i = 0;
            } else {
                throw new C21806("Could not parse nth-index '%s': unexpected format", strM4723);
            }
        }
        ArrayList arrayList = this.f50373;
        if (z2) {
            if (z) {
                arrayList.add(new C14627(i, i2));
                return;
            } else {
                arrayList.add(new C1925(i, i2));
                return;
            }
        }
        if (z) {
            arrayList.add(new C23799(i, i2));
        } else {
            arrayList.add(new C11099(i, i2));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m36990() {
        String strTrim = this.f50374.m41886().trim();
        int i = C4145.f15163;
        boolean z = false;
        if (strTrim != null && strTrim.length() != 0) {
            int length = strTrim.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isDigit(strTrim.codePointAt(i2))) {
                }
            }
            z = true;
        }
        if (!z) {
            throw new C22491("Index must be numeric");
        }
        return Integer.parseInt(strTrim);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36986(boolean z) {
        AbstractC4166 c18859;
        String str = z ? ":containsOwn" : ":contains";
        C17988 c17988 = this.f50374;
        c17988.m41889(str);
        String strM41883 = C17988.m41883(c17988.m41887('(', ')'));
        C5557.m15343(strM41883, str.concat("(text) query must not be empty"));
        if (z) {
            c18859 = new C18153(strM41883);
        } else {
            c18859 = new C18859(strM41883);
        }
        this.f50373.add(c18859);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m36991(boolean z) {
        AbstractC4166 c19565;
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        C17988 c17988 = this.f50374;
        c17988.m41889(str);
        String strM41883 = C17988.m41883(c17988.m41887('(', ')'));
        C5557.m15343(strM41883, str.concat("(text) query must not be empty"));
        if (z) {
            c19565 = new C8276(strM41883);
        } else {
            c19565 = new C19565(strM41883);
        }
        this.f50373.add(c19565);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m36989(boolean z) {
        AbstractC4166 c11929;
        String str = z ? ":matchesOwn" : ":matches";
        C17988 c17988 = this.f50374;
        c17988.m41889(str);
        String strM41887 = c17988.m41887('(', ')');
        C5557.m15343(strM41887, str.concat("(regex) query must not be empty"));
        if (z) {
            c11929 = new C2755(Pattern.compile(strM41887));
        } else {
            c11929 = new C11929(Pattern.compile(strM41887));
        }
        this.f50373.add(c11929);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m36983(boolean z) {
        AbstractC4166 c22512;
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        C17988 c17988 = this.f50374;
        c17988.m41889(str);
        String strM41887 = c17988.m41887('(', ')');
        C5557.m15343(strM41887, str.concat("(regex) query must not be empty"));
        if (z) {
            c22512 = new C5578(Pattern.compile(strM41887));
        } else {
            c22512 = new C22512(Pattern.compile(strM41887));
        }
        this.f50373.add(c22512);
    }

    public final String toString() {
        return this.f50375;
    }
}
