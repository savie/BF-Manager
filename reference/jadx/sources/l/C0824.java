package l;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֨֨ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBIX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0824 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f3114 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9005 f3115;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f3116;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final String[] f3110 = {",", ">", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "~", " "};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String[] f3113 = {"=", "!=", "^=", "$=", "*=", "~="};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f3112 = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f3111 = Pattern.compile("([+-])?(\\d+)");

    public C0824(String str) {
        C14838.m35755(str);
        String strTrim = str.trim();
        this.f3116 = strTrim;
        this.f3115 = new C9005(strTrim);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0078 m3306(String str) {
        try {
            return new C0824(str).m3315();
        } catch (IllegalArgumentException e) {
            throw new C9027(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0078 m3315() {
        C9005 c9005 = this.f3115;
        c9005.m24035();
        String[] strArr = f3110;
        boolean zM24038 = c9005.m24038(strArr);
        ArrayList arrayList = this.f3114;
        if (zM24038) {
            arrayList.add(new C22693());
            m3307(c9005.m24036());
        } else {
            m3310();
        }
        while (!c9005.m24034()) {
            boolean zM24035 = c9005.m24035();
            if (c9005.m24038(strArr)) {
                m3307(c9005.m24036());
            } else if (zM24035) {
                m3307(' ');
            } else {
                m3310();
            }
        }
        if (arrayList.size() == 1) {
            return (AbstractC0078) arrayList.get(0);
        }
        return new C16001(arrayList);
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
    private void m3307(char c) {
        AbstractC0078 c16001;
        boolean z;
        AbstractC0078 abstractC0078;
        C16001 c16002;
        AbstractC3323 abstractC3323;
        C9005 c9005 = this.f3115;
        c9005.m24035();
        StringBuilder sbM2898 = C0669.m2898();
        while (!c9005.m24034()) {
            if (c9005.m24032(MotionUtils.EASING_TYPE_FORMAT_START)) {
                sbM2898.append(MotionUtils.EASING_TYPE_FORMAT_START);
                sbM2898.append(c9005.m24027('(', ')'));
                sbM2898.append(MotionUtils.EASING_TYPE_FORMAT_END);
            } else if (c9005.m24032("[")) {
                sbM2898.append("[");
                sbM2898.append(c9005.m24027('[', ']'));
                sbM2898.append("]");
            } else if (!c9005.m24038(f3110)) {
                sbM2898.append(c9005.m24036());
            } else if (sbM2898.length() > 0) {
                break;
            } else {
                c9005.m24036();
            }
        }
        AbstractC0078 abstractC0078M3306 = m3306(C0669.m2896(sbM2898));
        ArrayList arrayList = this.f3114;
        if (arrayList.size() == 1) {
            c16001 = (AbstractC0078) arrayList.get(0);
            if ((c16001 instanceof C23461) && c != ',') {
                C23461 c23461 = (C23461) c16001;
                int i = c23461.f10868;
                abstractC0078 = i > 0 ? (AbstractC0078) c23461.f10867.get(i - 1) : null;
                z = true;
            }
            arrayList.clear();
            if (c != ' ') {
                C21947 c21947 = new C21947();
                c21947.f63447 = abstractC0078;
                c16002 = new C16001(c21947, abstractC0078M3306);
            } else if (c != '>') {
                C6791 c6791 = new C6791();
                c6791.f63447 = abstractC0078;
                c16002 = new C16001(c6791, abstractC0078M3306);
            } else {
                if (c != '~') {
                    if (c != '+') {
                        C13502 c13502 = new C13502();
                        c13502.f63447 = abstractC0078;
                        c16002 = new C16001(c13502, abstractC0078M3306);
                    } else {
                        if (c == ',') {
                            throw new C9027("Unknown combinator '%s'", Character.valueOf(c));
                        }
                        if (abstractC0078 instanceof C23461) {
                            abstractC3323 = (C23461) abstractC0078;
                        } else {
                            C23461 c23462 = new C23461();
                            ArrayList arrayList2 = c23462.f10867;
                            arrayList2.add(abstractC0078);
                            c23462.f10868 = arrayList2.size();
                            abstractC3323 = c23462;
                        }
                        ArrayList arrayList3 = abstractC3323.f10867;
                        arrayList3.add(abstractC0078M3306);
                        abstractC3323.f10868 = arrayList3.size();
                    }
                    if (z) {
                        C23461 c23463 = (C23461) c16001;
                        c23463.f10867.set(c23463.f10868 - 1, abstractC3323);
                    } else {
                        c16001 = abstractC3323;
                    }
                    arrayList.add(c16001);
                }
                C10758 c10758 = new C10758();
                c10758.f63447 = abstractC0078;
                c16002 = new C16001(c10758, abstractC0078M3306);
            }
            abstractC3323 = c16002;
            if (z) {
                C23461 c23464 = (C23461) c16001;
                c23464.f10867.set(c23464.f10868 - 1, abstractC3323);
            } else {
                c16001 = abstractC3323;
            }
            arrayList.add(c16001);
        }
        c16001 = new C16001(arrayList);
        z = false;
        abstractC0078 = c16001;
        arrayList.clear();
        if (c != ' ') {
            C21947 c21948 = new C21947();
            c21948.f63447 = abstractC0078;
            c16002 = new C16001(c21948, abstractC0078M3306);
        } else if (c != '>') {
            C6791 c6792 = new C6791();
            c6792.f63447 = abstractC0078;
            c16002 = new C16001(c6792, abstractC0078M3306);
        } else {
            if (c != '~') {
                if (c != '+') {
                    C13502 c13503 = new C13502();
                    c13503.f63447 = abstractC0078;
                    c16002 = new C16001(c13503, abstractC0078M3306);
                } else {
                    if (c == ',') {
                        throw new C9027("Unknown combinator '%s'", Character.valueOf(c));
                    }
                    if (abstractC0078 instanceof C23461) {
                        abstractC3323 = (C23461) abstractC0078;
                    } else {
                        C23461 c23465 = new C23461();
                        ArrayList arrayList4 = c23465.f10867;
                        arrayList4.add(abstractC0078);
                        c23465.f10868 = arrayList4.size();
                        abstractC3323 = c23465;
                    }
                    ArrayList arrayList5 = abstractC3323.f10867;
                    arrayList5.add(abstractC0078M3306);
                    abstractC3323.f10868 = arrayList5.size();
                }
                if (z) {
                    C23461 c23466 = (C23461) c16001;
                    c23466.f10867.set(c23466.f10868 - 1, abstractC3323);
                } else {
                    c16001 = abstractC3323;
                }
                arrayList.add(c16001);
            }
            C10758 c10759 = new C10758();
            c10759.f63447 = abstractC0078;
            c16002 = new C16001(c10759, abstractC0078M3306);
        }
        abstractC3323 = c16002;
        if (z) {
            C23461 c23467 = (C23461) c16001;
            c23467.f10867.set(c23467.f10868 - 1, abstractC3323);
        } else {
            c16001 = abstractC3323;
        }
        arrayList.add(c16001);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m3310() {
        C9005 c9005 = this.f3115;
        boolean zM24037 = c9005.m24037("#");
        ArrayList arrayList = this.f3114;
        if (zM24037) {
            String strM24031 = c9005.m24031();
            C14838.m35755(strM24031);
            arrayList.add(new C4553(strM24031));
            return;
        }
        if (c9005.m24037(".")) {
            String strM24032 = c9005.m24031();
            C14838.m35755(strM24032);
            arrayList.add(new C10034(strM24032.trim()));
            return;
        }
        if (c9005.m24033() || c9005.m24032("*|")) {
            String strM36733 = C15300.m36733(c9005.m24039());
            C14838.m35755(strM36733);
            if (!strM36733.startsWith("*|")) {
                if (strM36733.contains("|")) {
                    strM36733 = strM36733.replace("|", ":");
                }
                arrayList.add(new C20961(strM36733));
                return;
            }
            List listAsList = Arrays.asList(new C20961(strM36733.substring(2)), new C17977(strM36733.replace("*|", ":")));
            C23461 c23461 = new C23461();
            int i = c23461.f10868;
            ArrayList arrayList2 = c23461.f10867;
            if (i > 1) {
                arrayList2.add(new C16001(listAsList));
            } else {
                arrayList2.addAll(listAsList);
            }
            c23461.f10868 = arrayList2.size();
            arrayList.add(c23461);
            return;
        }
        boolean zM24032 = c9005.m24032("[");
        String str = this.f3116;
        if (zM24032) {
            C9005 c9006 = new C9005(c9005.m24027('[', ']'));
            String strM24028 = c9006.m24028(f3113);
            C14838.m35755(strM24028);
            c9006.m24035();
            if (c9006.m24034()) {
                if (strM24028.startsWith("^")) {
                    arrayList.add(new C4069(strM24028.substring(1)));
                    return;
                } else {
                    arrayList.add(new C6307(strM24028));
                    return;
                }
            }
            if (c9006.m24037("=")) {
                arrayList.add(new C14509(strM24028, c9006.m24030(), true));
                return;
            }
            if (c9006.m24037("!=")) {
                arrayList.add(new C7798(strM24028, c9006.m24030(), true));
                return;
            }
            if (c9006.m24037("^=")) {
                arrayList.add(new C18985(strM24028, c9006.m24030(), false));
                return;
            }
            if (c9006.m24037("$=")) {
                arrayList.add(new C18239(strM24028, c9006.m24030(), false));
                return;
            }
            if (c9006.m24037("*=")) {
                arrayList.add(new C21223(strM24028, c9006.m24030(), true));
                return;
            }
            if (!c9006.m24037("~=")) {
                throw new C9027("Could not parse attribute query '%s': unexpected token at '%s'", str, c9006.m24030());
            }
            Pattern patternCompile = Pattern.compile(c9006.m24030());
            C0340 c0340 = new C0340();
            c0340.f1830 = C15300.m36733(strM24028);
            c0340.f1831 = patternCompile;
            arrayList.add(c0340);
            return;
        }
        if (c9005.m24037("*")) {
            arrayList.add(new C12272());
            return;
        }
        if (c9005.m24037(":lt(")) {
            arrayList.add(new C19469(m3312()));
            return;
        }
        if (c9005.m24037(":gt(")) {
            arrayList.add(new C22453(m3312()));
            return;
        }
        if (c9005.m24037(":eq(")) {
            arrayList.add(new C21707(m3312()));
            return;
        }
        if (c9005.m24032(":has(")) {
            c9005.m24029(":has");
            String strM24027 = c9005.m24027('(', ')');
            C14838.m35756(strM24027, ":has(selector) sub-select must not be empty");
            arrayList.add(new C8282(m3306(strM24027)));
            return;
        }
        if (c9005.m24032(":contains(")) {
            m3308(false);
            return;
        }
        if (c9005.m24032(":containsOwn(")) {
            m3308(true);
            return;
        }
        if (c9005.m24032(":containsWholeText(")) {
            m3313(false);
            return;
        }
        if (c9005.m24032(":containsWholeOwnText(")) {
            m3313(true);
            return;
        }
        if (c9005.m24032(":containsData(")) {
            c9005.m24029(":containsData");
            String strM24025 = C9005.m24025(c9005.m24027('(', ')'));
            C14838.m35756(strM24025, ":containsData(text) query must not be empty");
            arrayList.add(new C1086(strM24025));
            return;
        }
        if (c9005.m24032(":matches(")) {
            m3311(false);
            return;
        }
        if (c9005.m24032(":matchesOwn(")) {
            m3311(true);
            return;
        }
        if (c9005.m24032(":matchesWholeText(")) {
            m3314(false);
            return;
        }
        if (c9005.m24032(":matchesWholeOwnText(")) {
            m3314(true);
            return;
        }
        if (c9005.m24032(":not(")) {
            c9005.m24029(":not");
            String strM24029 = c9005.m24027('(', ')');
            C14838.m35756(strM24029, ":not(selector) subselect must not be empty");
            AbstractC0078 abstractC0078M3306 = m3306(strM24029);
            C4793 c4793 = new C4793();
            c4793.f63447 = abstractC0078M3306;
            arrayList.add(c4793);
            return;
        }
        if (c9005.m24037(":nth-child(")) {
            m3309(false, false);
            return;
        }
        if (c9005.m24037(":nth-last-child(")) {
            m3309(true, false);
            return;
        }
        if (c9005.m24037(":nth-of-type(")) {
            m3309(false, true);
            return;
        }
        if (c9005.m24037(":nth-last-of-type(")) {
            m3309(true, true);
            return;
        }
        if (c9005.m24037(":first-child")) {
            arrayList.add(new C12756());
            return;
        }
        if (c9005.m24037(":last-child")) {
            arrayList.add(new C1570());
            return;
        }
        if (c9005.m24037(":first-of-type")) {
            arrayList.add(new C5299(0, 1));
            return;
        }
        if (c9005.m24037(":last-of-type")) {
            arrayList.add(new C11264(0, 1));
            return;
        }
        if (c9005.m24037(":only-child")) {
            arrayList.add(new C23199());
            return;
        }
        if (c9005.m24037(":only-of-type")) {
            arrayList.add(new C3061());
            return;
        }
        if (c9005.m24037(":empty")) {
            arrayList.add(new C14993());
        } else if (c9005.m24037(":root")) {
            arrayList.add(new C20215());
        } else {
            if (!c9005.m24037(":matchText")) {
                throw new C9027("Could not parse query '%s': unexpected token at '%s'", str, c9005.m24030());
            }
            arrayList.add(new C12010());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3309(boolean z, boolean z2) {
        String strM36733 = C15300.m36733(this.f3115.m24026());
        Matcher matcher = f3112.matcher(strM36733);
        Matcher matcher2 = f3111.matcher(strM36733);
        int i = 2;
        int i2 = 1;
        if (!"odd".equals(strM36733)) {
            if ("even".equals(strM36733)) {
                i2 = 0;
            } else if (matcher.matches()) {
                int i3 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                i2 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
                i = i3;
            } else if (matcher2.matches()) {
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i = 0;
            } else {
                throw new C9027("Could not parse nth-index '%s': unexpected format", strM36733);
            }
        }
        ArrayList arrayList = this.f3114;
        if (z2) {
            if (z) {
                arrayList.add(new C17231(i, i2));
                return;
            } else {
                arrayList.add(new C15739(i, i2));
                return;
            }
        }
        if (z) {
            arrayList.add(new C16485(i, i2));
        } else {
            arrayList.add(new C24691(i, i2));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m3312() {
        String strTrim = this.f3115.m24026().trim();
        int i = C0669.f2538;
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
            throw new C21552("Index must be numeric");
        }
        return Integer.parseInt(strTrim);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3308(boolean z) {
        Object c2577;
        String str = z ? ":containsOwn" : ":contains";
        C9005 c9005 = this.f3115;
        c9005.m24029(str);
        String strM24025 = C9005.m24025(c9005.m24027('(', ')'));
        C14838.m35756(strM24025, str.concat("(text) query must not be empty"));
        if (z) {
            c2577 = new C9288(strM24025);
        } else {
            c2577 = new C2577(strM24025);
        }
        this.f3114.add(c2577);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m3313(boolean z) {
        Object c7052;
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        C9005 c9005 = this.f3115;
        c9005.m24029(str);
        String strM24025 = C9005.m24025(c9005.m24027('(', ')'));
        C14838.m35756(strM24025, str.concat("(text) query must not be empty"));
        if (z) {
            c7052 = new C8543(strM24025);
        } else {
            c7052 = new C7052(strM24025);
        }
        this.f3114.add(c7052);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m3311(boolean z) {
        Object c6045;
        String str = z ? ":matchesOwn" : ":matches";
        C9005 c9005 = this.f3115;
        c9005.m24029(str);
        String strM24027 = c9005.m24027('(', ')');
        C14838.m35756(strM24027, str.concat("(regex) query must not be empty"));
        if (z) {
            c6045 = new C23945(Pattern.compile(strM24027));
        } else {
            c6045 = new C6045(Pattern.compile(strM24027));
        }
        this.f3114.add(c6045);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m3314(boolean z) {
        Object c14247;
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        C9005 c9005 = this.f3115;
        c9005.m24029(str);
        String strM24027 = c9005.m24027('(', ')');
        C14838.m35756(strM24027, str.concat("(regex) query must not be empty"));
        if (z) {
            c14247 = new C3807(Pattern.compile(strM24027));
        } else {
            c14247 = new C14247(Pattern.compile(strM24027));
        }
        this.f3114.add(c14247);
    }

    public final String toString() {
        return this.f3116;
    }
}
