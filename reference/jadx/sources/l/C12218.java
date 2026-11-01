package l;

import com.alipay.sdk.m.n.c;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: renamed from: l.۫ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6OC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12218 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Set f40840;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Set f40841;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Set f40842;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Set f40843;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Set f40844;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Set f40845;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Set f40846;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Set f40847;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40848 = new ArrayList();

    static {
        String[] strArr = {"area", "base", "br", "col", "embed", "hr", "img", "input", "link", "meta", "param", "source", "track", "wbr"};
        HashSet hashSet = new HashSet(14);
        for (int i = 0; i < 14; i++) {
            String str = strArr[i];
            C13638.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f40842 = C0561.unmodifiableSet(hashSet);
        Object[] objArr = {"pre", "textarea", "title", "xmp", "iframe", "noembed", "noframes", "noscript", "plaintext"};
        HashSet hashSet2 = new HashSet(9);
        for (int i2 = 0; i2 < 9; i2++) {
            Object obj = objArr[i2];
            C13638.requireNonNull(obj);
            if (!hashSet2.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        f40841 = C0561.unmodifiableSet(hashSet2);
        String[] strArr2 = {"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", am.aC, "img", "li", "listing", "menu", "meta", "nobr", "ol", am.ax, "pre", "ruby", am.aB, "small", "span", "strong", "strike", "sub", "sup", "table", "tt", am.aH, "ul", "var"};
        HashSet hashSet3 = new HashSet(44);
        for (int i3 = 0; i3 < 44; i3++) {
            String str2 = strArr2[i3];
            C13638.requireNonNull(str2);
            if (!hashSet3.add(str2)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str2));
            }
        }
        f40846 = C0561.unmodifiableSet(hashSet3);
        String[] strArr3 = {"address", "article", "aside", "blockquote", "center", ErrorBundle.DETAIL_ENTRY, "dialog", "dir", "div", "dl", "dt", "dd", "fieldset", "figcaption", "figure", "footer", c.c, "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "listing", "main", "menu", "nav", "ol", am.ax, "plaintext", "pre", "search", "section", ErrorBundle.SUMMARY_ENTRY, "table", "ul", "xmp"};
        HashSet hashSet4 = new HashSet(41);
        for (int i4 = 0; i4 < 41; i4++) {
            String str3 = strArr3[i4];
            C13638.requireNonNull(str3);
            if (!hashSet4.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        f40843 = C0561.unmodifiableSet(hashSet4);
        Object[] objArr2 = {"applet", "caption", "html", "table", "td", "th", "marquee", "object", "template"};
        HashSet hashSet5 = new HashSet(9);
        for (int i5 = 0; i5 < 9; i5++) {
            Object obj2 = objArr2[i5];
            C13638.requireNonNull(obj2);
            if (!hashSet5.add(obj2)) {
                throw new IllegalArgumentException(C9023.m23354(obj2, "duplicate element: "));
            }
        }
        f40847 = C0561.unmodifiableSet(hashSet5);
        String[] strArr4 = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "dd", ErrorBundle.DETAIL_ENTRY, "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", c.c, "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "keygen", "li", "link", "listing", "main", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", am.ax, "param", "plaintext", "pre", "script", "search", "section", "select", "source", "style", ErrorBundle.SUMMARY_ENTRY, "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "title", "tr", "track", "ul", "wbr", "xmp"};
        HashSet hashSet6 = new HashSet(83);
        for (int i6 = 0; i6 < 83; i6++) {
            String str4 = strArr4[i6];
            C13638.requireNonNull(str4);
            if (!hashSet6.add(str4)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str4));
            }
        }
        f40845 = C0561.unmodifiableSet(hashSet6);
        Object[] objArr3 = {"td", "th"};
        HashSet hashSet7 = new HashSet(2);
        for (int i7 = 0; i7 < 2; i7++) {
            Object obj3 = objArr3[i7];
            C13638.requireNonNull(obj3);
            if (!hashSet7.add(obj3)) {
                throw new IllegalArgumentException(C9023.m23354(obj3, "duplicate element: "));
            }
        }
        f40844 = C0561.unmodifiableSet(hashSet7);
        Object[] objArr4 = {"thead", "tbody", "tfoot"};
        HashSet hashSet8 = new HashSet(3);
        for (int i8 = 0; i8 < 3; i8++) {
            Object obj4 = objArr4[i8];
            C13638.requireNonNull(obj4);
            if (!hashSet8.add(obj4)) {
                throw new IllegalArgumentException(C9023.m23354(obj4, "duplicate element: "));
            }
        }
        f40840 = C0561.unmodifiableSet(hashSet8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16451 m30329() {
        ArrayList arrayList = this.f40848;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C16451) C19084.m43861(arrayList, 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m30332() {
        return this.f40848.size();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0214  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:153:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c1 A[LOOP:2: B:142:0x029d->B:156:0x02c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:207:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:224:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01d2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16451 m30331(String str, Map map, boolean z, Object obj) {
        int i;
        char c;
        int i2;
        boolean z2;
        char c2;
        char c3;
        char c4;
        boolean z3;
        char c5;
        String str2;
        boolean z4;
        char c6;
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int iDigit;
        C16451 c16451M30329 = m30329();
        if (c16451M30329 == null || (i = c16451M30329.f52898) == 0 || c16451M30329.f52901 || ((c16451M30329.f52899 && !str.equals("mglyph") && !str.equals("malignmark")) || (i == 2 && c16451M30329.f52896.equals("annotation-xml") && str.equals("svg")))) {
            i = 0;
        }
        if (i != 0 && (f40846.contains(str) || (str.equals("font") && (map.containsKey(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR) || map.containsKey("face") || map.containsKey("size"))))) {
            m30328();
            i = 0;
        }
        if (i != 0) {
            c = 0;
            i2 = i;
        } else {
            if (f40843.contains(str)) {
                Object[] objArr = {am.ax};
                HashSet hashSet = new HashSet(1);
                Object obj2 = objArr[0];
                C13638.requireNonNull(obj2);
                if (!hashSet.add(obj2)) {
                    throw new IllegalArgumentException(C9023.m23354(obj2, "duplicate element: "));
                }
                m30327(0, C0561.unmodifiableSet(hashSet));
            }
            if (str.equals("li")) {
                HashSet hashSet2 = new HashSet(1);
                Object obj3 = new Object[]{"li"}[0];
                C13638.requireNonNull(obj3);
                if (!hashSet2.add(obj3)) {
                    throw new IllegalArgumentException(C9023.m23354(obj3, "duplicate element: "));
                }
                m30327(1, C0561.unmodifiableSet(hashSet2));
            } else if (str.equals("dt") || str.equals("dd")) {
                Object[] objArr2 = {"dt", "dd"};
                HashSet hashSet3 = new HashSet(2);
                for (int i6 = 0; i6 < 2; i6++) {
                    Object obj4 = objArr2[i6];
                    C13638.requireNonNull(obj4);
                    if (!hashSet3.add(obj4)) {
                        throw new IllegalArgumentException(C9023.m23354(obj4, "duplicate element: "));
                    }
                }
                m30327(1, C0561.unmodifiableSet(hashSet3));
            } else if (str.equals("tr")) {
                HashSet hashSet4 = new HashSet(1);
                Object obj5 = new Object[]{"tr"}[0];
                C13638.requireNonNull(obj5);
                if (!hashSet4.add(obj5)) {
                    throw new IllegalArgumentException(C9023.m23354(obj5, "duplicate element: "));
                }
                m30327(2, C0561.unmodifiableSet(hashSet4));
            } else {
                Set set = f40844;
                if (set.contains(str)) {
                    m30327(3, set);
                } else {
                    Set set2 = f40840;
                    if (set2.contains(str)) {
                        m30327(2, set2);
                    } else if (str.equals("option") || str.equals("optgroup")) {
                        HashSet hashSet5 = new HashSet(1);
                        Object obj6 = new Object[]{"option"}[0];
                        C13638.requireNonNull(obj6);
                        if (!hashSet5.add(obj6)) {
                            throw new IllegalArgumentException(C9023.m23354(obj6, "duplicate element: "));
                        }
                        m30327(4, C0561.unmodifiableSet(hashSet5));
                        if (str.equals("optgroup")) {
                            HashSet hashSet6 = new HashSet(1);
                            Object obj7 = new Object[]{"optgroup"}[0];
                            C13638.requireNonNull(obj7);
                            if (!hashSet6.add(obj7)) {
                                throw new IllegalArgumentException(C9023.m23354(obj7, "duplicate element: "));
                            }
                            m30327(4, C0561.unmodifiableSet(hashSet6));
                        }
                    }
                }
            }
            if (str.equals("svg")) {
                c = 0;
                i2 = 1;
            } else if (str.equals("math")) {
                c = 0;
                i2 = 2;
            } else {
                c = 0;
                i2 = i;
            }
        }
        C16451 c16451M303210 = m30329();
        if (i2 == 1) {
            Object[] objArr3 = new Object[3];
            objArr3[c] = "foreignobject";
            objArr3[1] = "desc";
            objArr3[2] = "title";
            HashSet hashSet7 = new HashSet(3);
            for (int i7 = 0; i7 < 3; i7++) {
                Object obj8 = objArr3[i7];
                C13638.requireNonNull(obj8);
                if (!hashSet7.add(obj8)) {
                    throw new IllegalArgumentException(C9023.m23354(obj8, "duplicate element: "));
                }
            }
            if (C0561.unmodifiableSet(hashSet7).contains(str)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        char c7 = '&';
        if (i2 == 2 && str.equals("annotation-xml")) {
            String strM16076 = "";
            String str3 = (String) C9735.getOrDefault(map, "encoding", "");
            StringBuilder sb = new StringBuilder(str3.length());
            int i8 = 0;
            while (true) {
                if (i8 < str3.length()) {
                    if ((i8 & 1023) == 0) {
                        C3894.m11326();
                    }
                    char cCharAt2 = str3.charAt(i8);
                    if (cCharAt2 != c7) {
                        sb.append(cCharAt2);
                    } else if (str3.startsWith("&sol;", i8)) {
                        sb.append('/');
                        i8 += 4;
                    } else if (str3.startsWith("&plus;", i8)) {
                        sb.append('+');
                        i8 += 5;
                    } else {
                        if (str3.startsWith("&#", i8)) {
                            int i9 = i8 + 2;
                            if (i9 < str3.length()) {
                                c6 = 3;
                                if (str3.charAt(i9) == 'x' || str3.charAt(i9) == 'X') {
                                    i9 = i8 + 3;
                                    i3 = 16;
                                }
                                i4 = 0;
                                i5 = i9;
                                while (true) {
                                    if (i5 >= str3.length()) {
                                        if ((i5 & 1023) == 0) {
                                            C3894.m11326();
                                        }
                                        cCharAt = str3.charAt(i5);
                                        if (cCharAt <= 127) {
                                            iDigit = Character.digit(cCharAt, i3);
                                        } else {
                                            iDigit = -1;
                                        }
                                        if (iDigit < 0) {
                                            i4 = (i4 * i3) + iDigit;
                                            if (i4 > 127) {
                                                i5++;
                                            }
                                        }
                                        c3 = c6;
                                        c5 = 0;
                                    }
                                    if (i5 == i9) {
                                        c3 = c6;
                                        c5 = 0;
                                    } else {
                                        sb.append((char) i4);
                                        if (i5 < str3.length() && str3.charAt(i5) == ';') {
                                            i5++;
                                        }
                                        i8 = i5 - 1;
                                    }
                                }
                            } else {
                                c6 = 3;
                            }
                            i3 = 10;
                            i4 = 0;
                            i5 = i9;
                            while (true) {
                                if (i5 >= str3.length()) {
                                    if ((i5 & 1023) == 0) {
                                        C3894.m11326();
                                    }
                                    cCharAt = str3.charAt(i5);
                                    if (cCharAt <= 127) {
                                        iDigit = Character.digit(cCharAt, i3);
                                    } else {
                                        iDigit = -1;
                                    }
                                    if (iDigit < 0) {
                                        i4 = (i4 * i3) + iDigit;
                                        if (i4 > 127) {
                                            i5++;
                                        }
                                    }
                                    c3 = c6;
                                    c5 = 0;
                                }
                                if (i5 == i9) {
                                    c3 = c6;
                                    c5 = 0;
                                } else {
                                    sb.append((char) i4);
                                    if (i5 < str3.length()) {
                                        i5++;
                                    }
                                    i8 = i5 - 1;
                                }
                            }
                        } else {
                            c5 = 0;
                            c3 = 3;
                        }
                        c4 = 1;
                    }
                    i8++;
                    c7 = '&';
                } else {
                    c5 = 0;
                    c4 = 1;
                    strM16076 = AbstractC5867.m16076(sb.toString());
                    c3 = 3;
                }
                z3 = strM16076.equals("text/html") || strM16076.equals("application/xhtml+xml");
                c2 = 4;
            }
        } else {
            c2 = 4;
            c3 = 3;
            c4 = 1;
            z3 = z2;
            c5 = 0;
        }
        boolean z5 = (c16451M303210 != null && c16451M303210.f52895) || i2 != 0 || f40841.contains(str) || "preserve".equals(map.get("xml:space")) || ((str2 = (String) map.get("style")) != null && (str2.indexOf(92) >= 0 || str2.indexOf(38) >= 0 || AbstractC5867.m16076(str2).contains("white-space")));
        if (i2 == 2) {
            Object[] objArr4 = new Object[5];
            objArr4[c5] = "mi";
            objArr4[c4] = "mo";
            objArr4[2] = "mn";
            objArr4[c3] = "ms";
            objArr4[c2] = "mtext";
            HashSet hashSet8 = new HashSet(5);
            for (int i10 = 0; i10 < 5; i10++) {
                Object obj9 = objArr4[i10];
                C13638.requireNonNull(obj9);
                if (!hashSet8.add(obj9)) {
                    throw new IllegalArgumentException(C9023.m23354(obj9, "duplicate element: "));
                }
            }
            if (C0561.unmodifiableSet(hashSet8).contains(str)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        ArrayList arrayList = this.f40848;
        C16451 c16451 = new C16451(str, i2, z3, z4, z5, c16451M303210, arrayList.size(), obj);
        if (i2 != 0 ? z : f40842.contains(str)) {
            return c16451;
        }
        if (arrayList.size() >= 512) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit");
        }
        arrayList.add(c16451);
        return c16451;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16451 m30330(String str) {
        boolean z;
        char c;
        char c2;
        C16451 c16451M30329 = m30329();
        ArrayList arrayList = this.f40848;
        char c3 = 1;
        if (c16451M30329 != null && c16451M30329.f52898 != 0) {
            if (str.equals(am.ax) || str.equals("br")) {
                m30328();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C16451 c16451 = (C16451) arrayList.get(size);
                    if (c16451.f52898 == 0) {
                        break;
                    }
                    if (c16451.f52896.equals(str)) {
                        return m30326(size);
                    }
                }
            }
        }
        char c4 = 0;
        boolean z2 = str.equals("table") || str.equals("tr") || f40844.contains(str) || f40840.contains(str);
        int i = 3;
        if (z2 || f40843.contains(str)) {
            z = true;
        } else {
            Object[] objArr = {"button", "applet", "object", "marquee", "template"};
            HashSet hashSet = new HashSet(5);
            for (int i2 = 0; i2 < 5; i2++) {
                Object obj = objArr[i2];
                C13638.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
                }
            }
            if (C0561.unmodifiableSet(hashSet).contains(str)) {
                z = true;
            } else {
                z = false;
            }
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            C16451 c16452 = (C16451) arrayList.get(size2);
            int i3 = c16452.f52898;
            String str2 = c16452.f52896;
            if (i3 == 0 && str2.equals(str)) {
                return m30326(size2);
            }
            if (c16452.f52898 != 0) {
                if (c16452.f52901 || c16452.f52899) {
                    return null;
                }
            } else if (z) {
                if (z2) {
                    Object[] objArr2 = new Object[i];
                    objArr2[c4] = "html";
                    objArr2[c3] = "table";
                    objArr2[2] = "template";
                    HashSet hashSet2 = new HashSet(i);
                    int i4 = 0;
                    c = 1;
                    while (true) {
                        c2 = 0;
                        if (i4 >= i) {
                            if (!C0561.unmodifiableSet(hashSet2).contains(str2)) {
                                break;
                            }
                            return null;
                        }
                        Object obj2 = objArr2[i4];
                        C13638.requireNonNull(obj2);
                        if (!hashSet2.add(obj2)) {
                            throw new IllegalArgumentException(C9023.m23354(obj2, "duplicate element: "));
                        }
                        i4++;
                        i = 3;
                    }
                } else {
                    c = 1;
                    c2 = 0;
                    if (f40847.contains(str2)) {
                        return null;
                    }
                }
                if (str.equals("li")) {
                    Object[] objArr3 = new Object[2];
                    objArr3[c2] = "ul";
                    objArr3[c] = "ol";
                    HashSet hashSet3 = new HashSet(2);
                    for (int i5 = 0; i5 < 2; i5++) {
                        Object obj3 = objArr3[i5];
                        C13638.requireNonNull(obj3);
                        if (!hashSet3.add(obj3)) {
                            throw new IllegalArgumentException(C9023.m23354(obj3, "duplicate element: "));
                        }
                    }
                    if (C0561.unmodifiableSet(hashSet3).contains(str2)) {
                        return null;
                    }
                } else {
                    continue;
                }
            } else if (f40845.contains(str2)) {
                return null;
            }
            size2--;
            c3 = 1;
            c4 = 0;
            i = 3;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30327(int i, Set set) {
        ArrayList arrayList = this.f40848;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C16451 c16451 = (C16451) arrayList.get(size);
            if (c16451.f52898 != 0) {
                return;
            }
            String str = c16451.f52896;
            if (set.contains(str)) {
                m30326(size);
                return;
            }
            boolean zContains = false;
            zContains = false;
            zContains = false;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        Object[] objArr = {"html", "table", "template"};
                        HashSet hashSet = new HashSet(3);
                        for (int i2 = 0; i2 < 3; i2++) {
                            Object obj = objArr[i2];
                            C13638.requireNonNull(obj);
                            if (!hashSet.add(obj)) {
                                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
                            }
                        }
                        zContains = C0561.unmodifiableSet(hashSet).contains(str);
                    } else if (i != 3) {
                        Object[] objArr2 = {"html", "select", "datalist", "template", "optgroup"};
                        HashSet hashSet2 = new HashSet(5);
                        for (int i3 = 0; i3 < 5; i3++) {
                            Object obj2 = objArr2[i3];
                            C13638.requireNonNull(obj2);
                            if (!hashSet2.add(obj2)) {
                                throw new IllegalArgumentException(C9023.m23354(obj2, "duplicate element: "));
                            }
                        }
                        zContains = C0561.unmodifiableSet(hashSet2).contains(str);
                    } else {
                        Object[] objArr3 = {"html", "table", "template", "tr"};
                        HashSet hashSet3 = new HashSet(4);
                        for (int i4 = 0; i4 < 4; i4++) {
                            Object obj3 = objArr3[i4];
                            C13638.requireNonNull(obj3);
                            if (!hashSet3.add(obj3)) {
                                throw new IllegalArgumentException(C9023.m23354(obj3, "duplicate element: "));
                            }
                        }
                        zContains = C0561.unmodifiableSet(hashSet3).contains(str);
                    }
                } else if (f40845.contains(str)) {
                    Object[] objArr4 = {"address", "div", am.ax};
                    HashSet hashSet4 = new HashSet(3);
                    for (int i5 = 0; i5 < 3; i5++) {
                        Object obj4 = objArr4[i5];
                        C13638.requireNonNull(obj4);
                        if (!hashSet4.add(obj4)) {
                            throw new IllegalArgumentException(C9023.m23354(obj4, "duplicate element: "));
                        }
                    }
                    if (!C0561.unmodifiableSet(hashSet4).contains(str)) {
                        zContains = true;
                    }
                }
            } else if (f40847.contains(str) || str.equals("button")) {
                zContains = true;
            }
            if (zContains) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C16451 m30326(int i) {
        ArrayList arrayList = this.f40848;
        C16451 c16451 = (C16451) arrayList.get(i);
        arrayList.subList(i, arrayList.size()).clear();
        return c16451;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m30328() {
        while (m30329() != null) {
            C16451 c16451M30329 = m30329();
            if (c16451M30329.f52898 == 0 || c16451M30329.f52901 || c16451M30329.f52899) {
                return;
            } else {
                C19028.m43762(this.f40848, 1);
            }
        }
    }
}
