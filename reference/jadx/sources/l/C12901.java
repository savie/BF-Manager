package l;

import com.alipay.sdk.m.n.c;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.۫ۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 590I */
/* JADX INFO: loaded from: classes4.dex */
public final class C12901 extends AbstractC19614 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15884 f41256;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f41257;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10135 f41258;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f41259;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Set f41252 = C4681.unmodifiableSet(new HashSet(Arrays.asList(am.av, "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", am.aC, "img", "input", "kbd", AnnotatedPrivateKey.LABEL, "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Set f41251 = C4681.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Set f41253 = C4681.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", c.c, "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", am.ax, "pre", "section", "table", "tfoot", "ul", "video")));

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f41255 = new ArrayList(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4698 f41254 = new C4698("", 0, Collections.EMPTY_MAP, null);

    public C12901(C10135 c10135, C15884 c15884) {
        this.f41258 = c10135;
        this.f41256 = c15884;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31940(C20775 c20775, String str) {
        C21852 c21852;
        int length;
        C13646 c13646 = new C13646(new C3952(str), new C21106(0));
        while (true) {
            AbstractC6935 abstractC6935M33395 = c13646.m33395();
            EnumC8426 enumC8426 = abstractC6935M33395.f22942;
            if (EnumC8426.EOF == enumC8426) {
                return;
            }
            int i = C15138.f49389[enumC8426.ordinal()];
            C10135 c10135 = this.f41258;
            Set set = f41253;
            ArrayList arrayList = this.f41255;
            Set set2 = f41252;
            boolean z = true;
            if (i == 1) {
                C9171 c9171 = (C9171) abstractC6935M33395;
                boolean zContains = set2.contains(c9171.f7904);
                Set set3 = f41251;
                if (zContains) {
                    String str2 = c9171.f7904;
                    C21852 c21853 = new C21852(m31938(c9171), c20775.length(), str2);
                    if (this.f41257) {
                        int length2 = c20775.length();
                        if (length2 > 0 && '\n' != c20775.charAt(length2 - 1)) {
                            AbstractC14610.m35251(c20775, '\n');
                        }
                        this.f41257 = false;
                    }
                    if (set3.contains(str2) || c9171.f7898) {
                        c10135.getClass();
                        String strM26147 = C10135.m26147(c21853);
                        if (strM26147 != null && strM26147.length() > 0) {
                            try {
                                c20775.append((CharSequence) strM26147);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        int length3 = c20775.length();
                        if (!c21853.isClosed()) {
                            c21853.f33824 = length3;
                        }
                    }
                    arrayList.add(c21853);
                } else {
                    String str3 = c9171.f7904;
                    if (am.ax.equals(this.f41254.f33823)) {
                        this.f41254.m14575(c20775.length());
                        AbstractC14610.m35251(c20775, '\n');
                        this.f41254 = this.f41254.f16584;
                    } else if ("li".equals(str3) && "li".equals(this.f41254.f33823)) {
                        this.f41254.m14575(c20775.length());
                        this.f41254 = this.f41254.f16584;
                    }
                    if (set.contains(str3)) {
                        this.f41259 = "pre".equals(str3);
                        int length4 = c20775.length();
                        if (length4 > 0 && '\n' != c20775.charAt(length4 - 1)) {
                            AbstractC14610.m35251(c20775, '\n');
                        }
                    } else if (this.f41257) {
                        int length5 = c20775.length();
                        if (length5 > 0 && '\n' != c20775.charAt(length5 - 1)) {
                            AbstractC14610.m35251(c20775, '\n');
                        }
                        this.f41257 = false;
                    }
                    int length6 = c20775.length();
                    Map mapM31938 = m31938(c9171);
                    C4698 c4698 = this.f41254;
                    C4698 c4699 = new C4698(str3, length6, mapM31938, c4698);
                    if (!set3.contains(str3) && !c9171.f7898) {
                        z = false;
                    }
                    if (z) {
                        c10135.getClass();
                        String strM26148 = C10135.m26147(c4699);
                        if (strM26148 != null && strM26148.length() > 0) {
                            try {
                                c20775.append((CharSequence) strM26148);
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                        c4699.m14575(c20775.length());
                    }
                    ArrayList arrayList2 = c4698.f16585;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(2);
                        c4698.f16585 = arrayList2;
                    }
                    arrayList2.add(c4699);
                    if (!z) {
                        this.f41254 = c4699;
                    }
                }
            } else if (i == 2) {
                C0969 c0969 = (C0969) abstractC6935M33395;
                if (set2.contains(c0969.f7904)) {
                    String str4 = c0969.f7904;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size <= -1) {
                            c21852 = null;
                            break;
                        }
                        c21852 = (C21852) arrayList.get(size);
                        if (str4.equals(c21852.f33823) && c21852.f33824 < 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (c21852 == null) {
                        continue;
                    } else {
                        if (c21852.f33825 == c20775.length()) {
                            c10135.getClass();
                            CharSequence charSequenceM26147 = C10135.m26147(c21852);
                            if (charSequenceM26147 != null) {
                                try {
                                    c20775.append(charSequenceM26147);
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                        }
                        int length7 = c20775.length();
                        if (!c21852.isClosed()) {
                            c21852.f33824 = length7;
                        }
                    }
                } else {
                    String str5 = c0969.f7904;
                    C4698 c46910 = this.f41254;
                    while (c46910 != null && !str5.equals(c46910.f33823) && !c46910.isClosed()) {
                        c46910 = c46910.f16584;
                    }
                    if (c46910 != null) {
                        int i2 = c46910.f33825;
                        if ("pre".equals(str5)) {
                            this.f41259 = false;
                        }
                        if (i2 == c20775.length()) {
                            c10135.getClass();
                            CharSequence charSequenceM26148 = C10135.m26147(c46910);
                            if (charSequenceM26148 != null) {
                                try {
                                    c20775.append(charSequenceM26148);
                                } catch (IOException e4) {
                                    throw new RuntimeException(e4);
                                }
                            }
                        }
                        c46910.m14575(c20775.length());
                        if (i2 != c46910.f33824) {
                            this.f41257 = set.contains(c46910.f33823);
                        }
                        if (am.ax.equals(str5)) {
                            AbstractC14610.m35251(c20775, '\n');
                        }
                        this.f41254 = c46910.f16584;
                    } else {
                        continue;
                    }
                }
            } else if (i != 3) {
                continue;
            } else {
                C0223 c0223 = (C0223) abstractC6935M33395;
                if (this.f41259) {
                    try {
                        c20775.append(c0223.m1680());
                    } catch (IOException e5) {
                        throw new RuntimeException(e5);
                    }
                } else {
                    if (this.f41257) {
                        int length8 = c20775.length();
                        if (length8 > 0 && '\n' != c20775.charAt(length8 - 1)) {
                            AbstractC14610.m35251(c20775, '\n');
                        }
                        this.f41257 = false;
                    }
                    String strM1680 = c0223.m1680();
                    this.f41256.getClass();
                    int length9 = c20775.length();
                    int length10 = strM1680.length();
                    boolean z2 = false;
                    for (int i3 = 0; i3 < length10; i3++) {
                        char cCharAt = strM1680.charAt(i3);
                        if (Character.isWhitespace(cCharAt)) {
                            z2 = true;
                        } else {
                            if (z2 && (length = c20775.length()) > 0 && !Character.isWhitespace(c20775.charAt(length - 1))) {
                                AbstractC14610.m35251(c20775, ' ');
                            }
                            AbstractC14610.m35251(c20775, cCharAt);
                            z2 = false;
                        }
                    }
                    if (z2 && length9 < c20775.length()) {
                        AbstractC14610.m35251(c20775, ' ');
                    }
                }
            }
            abstractC6935M33395.mo1678();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31942(InterfaceC22598 interfaceC22598) {
        ArrayList arrayList = this.f41255;
        if (arrayList.size() > 0) {
            ((C5444) interfaceC22598).m16273(C4681.unmodifiableList(arrayList));
            arrayList.clear();
        } else {
            ((C5444) interfaceC22598).m16273(Collections.EMPTY_LIST);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31941(InterfaceC22598 interfaceC22598) {
        C4698 c4698 = this.f41254;
        while (true) {
            C4698 c4699 = c4698.f16584;
            if (c4699 == null) {
                break;
            } else {
                c4698 = c4699;
            }
        }
        List listMo14578 = c4698.mo14578();
        if (listMo14578.size() > 0) {
            ((C1715) interfaceC22598).m6083(listMo14578);
        } else {
            ((C1715) interfaceC22598).m6083(Collections.EMPTY_LIST);
        }
        this.f41254 = new C4698("", 0, Collections.EMPTY_MAP, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31939() {
        this.f41255.clear();
        this.f41254 = new C4698("", 0, Collections.EMPTY_MAP, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map m31938(C9171 c9171) {
        C6190<C20360> c6190 = c9171.f7905;
        int size = c6190.size();
        if (size > 0) {
            HashMap map = new HashMap(size);
            for (C20360 c20360 : c6190) {
                map.put(c20360.getKey().toLowerCase(Locale.US), c20360.getValue());
            }
            return C4681.unmodifiableMap(map);
        }
        return Collections.EMPTY_MAP;
    }
}
