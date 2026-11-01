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

/* JADX INFO: renamed from: l.ۛܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 590I */
/* JADX INFO: loaded from: classes3.dex */
public final class C6205 extends AbstractC12556 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f21094;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f21096;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18906 f21098;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4463 f21099;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Set f21093 = C0561.unmodifiableSet(new HashSet(Arrays.asList(am.av, "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", am.aC, "img", "input", "kbd", AnnotatedPrivateKey.LABEL, "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Set f21092 = C0561.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Set f21091 = C0561.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", c.c, "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", am.ax, "pre", "section", "table", "tfoot", "ul", "video")));

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f21097 = new ArrayList(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16084 f21095 = new C16084("", 0, Collections.EMPTY_MAP, null);

    public C6205(C18906 c18906, C4463 c4463) {
        this.f21098 = c18906;
        this.f21099 = c4463;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17211(C2657 c2657, String str) {
        C20317 c20317;
        int length;
        C20692 c20692 = new C20692(new C12931(str), new C6580(0));
        while (true) {
            AbstractC7286 abstractC7286M46530 = c20692.m46530();
            EnumC10109 enumC10109 = abstractC7286M46530.f24210;
            if (EnumC10109.EOF == enumC10109) {
                return;
            }
            int i = C17494.f55650[enumC10109.ordinal()];
            C18906 c18906 = this.f21098;
            Set set = f21091;
            ArrayList arrayList = this.f21097;
            Set set2 = f21093;
            boolean z = true;
            if (i == 1) {
                C19281 c19281 = (C19281) abstractC7286M46530;
                boolean zContains = set2.contains(c19281.f29922);
                Set set3 = f21092;
                if (zContains) {
                    String str2 = c19281.f29922;
                    C20317 c20318 = new C20317(m17209(c19281), c2657.length(), str2);
                    if (this.f21096) {
                        int length2 = c2657.length();
                        if (length2 > 0 && '\n' != c2657.charAt(length2 - 1)) {
                            AbstractC4088.m11629(c2657, '\n');
                        }
                        this.f21096 = false;
                    }
                    if (set3.contains(str2) || c19281.f29921) {
                        c18906.getClass();
                        String strM43571 = C18906.m43571(c20318);
                        if (strM43571 != null && strM43571.length() > 0) {
                            try {
                                c2657.append((CharSequence) strM43571);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        int length3 = c2657.length();
                        if (!c20318.isClosed()) {
                            c20318.f2342 = length3;
                        }
                    }
                    arrayList.add(c20318);
                } else {
                    String str3 = c19281.f29922;
                    if (am.ax.equals(this.f21095.f2341)) {
                        this.f21095.m38113(c2657.length());
                        AbstractC4088.m11629(c2657, '\n');
                        this.f21095 = this.f21095.f52027;
                    } else if ("li".equals(str3) && "li".equals(this.f21095.f2341)) {
                        this.f21095.m38113(c2657.length());
                        this.f21095 = this.f21095.f52027;
                    }
                    if (set.contains(str3)) {
                        this.f21094 = "pre".equals(str3);
                        int length4 = c2657.length();
                        if (length4 > 0 && '\n' != c2657.charAt(length4 - 1)) {
                            AbstractC4088.m11629(c2657, '\n');
                        }
                    } else if (this.f21096) {
                        int length5 = c2657.length();
                        if (length5 > 0 && '\n' != c2657.charAt(length5 - 1)) {
                            AbstractC4088.m11629(c2657, '\n');
                        }
                        this.f21096 = false;
                    }
                    int length6 = c2657.length();
                    Map mapM17209 = m17209(c19281);
                    C16084 c16084 = this.f21095;
                    C16084 c16085 = new C16084(str3, length6, mapM17209, c16084);
                    if (!set3.contains(str3) && !c19281.f29921) {
                        z = false;
                    }
                    if (z) {
                        c18906.getClass();
                        String strM43572 = C18906.m43571(c16085);
                        if (strM43572 != null && strM43572.length() > 0) {
                            try {
                                c2657.append((CharSequence) strM43572);
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                        c16085.m38113(c2657.length());
                    }
                    ArrayList arrayList2 = c16084.f52026;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(2);
                        c16084.f52026 = arrayList2;
                    }
                    arrayList2.add(c16085);
                    if (!z) {
                        this.f21095 = c16085;
                    }
                }
            } else if (i == 2) {
                C7992 c7992 = (C7992) abstractC7286M46530;
                if (set2.contains(c7992.f29922)) {
                    String str4 = c7992.f29922;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size <= -1) {
                            c20317 = null;
                            break;
                        }
                        c20317 = (C20317) arrayList.get(size);
                        if (str4.equals(c20317.f2341) && c20317.f2342 < 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (c20317 == null) {
                        continue;
                    } else {
                        if (c20317.f2339 == c2657.length()) {
                            c18906.getClass();
                            CharSequence charSequenceM43571 = C18906.m43571(c20317);
                            if (charSequenceM43571 != null) {
                                try {
                                    c2657.append(charSequenceM43571);
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                        }
                        int length7 = c2657.length();
                        if (!c20317.isClosed()) {
                            c20317.f2342 = length7;
                        }
                    }
                } else {
                    String str5 = c7992.f29922;
                    C16084 c16086 = this.f21095;
                    while (c16086 != null && !str5.equals(c16086.f2341) && !c16086.isClosed()) {
                        c16086 = c16086.f52027;
                    }
                    if (c16086 != null) {
                        int i2 = c16086.f2339;
                        if ("pre".equals(str5)) {
                            this.f21094 = false;
                        }
                        if (i2 == c2657.length()) {
                            c18906.getClass();
                            CharSequence charSequenceM43572 = C18906.m43571(c16086);
                            if (charSequenceM43572 != null) {
                                try {
                                    c2657.append(charSequenceM43572);
                                } catch (IOException e4) {
                                    throw new RuntimeException(e4);
                                }
                            }
                        }
                        c16086.m38113(c2657.length());
                        if (i2 != c16086.f2342) {
                            this.f21096 = set.contains(c16086.f2341);
                        }
                        if (am.ax.equals(str5)) {
                            AbstractC4088.m11629(c2657, '\n');
                        }
                        this.f21095 = c16086.f52027;
                    } else {
                        continue;
                    }
                }
            } else if (i != 3) {
                continue;
            } else {
                C15048 c15048 = (C15048) abstractC7286M46530;
                if (this.f21094) {
                    try {
                        c2657.append(c15048.m36032());
                    } catch (IOException e5) {
                        throw new RuntimeException(e5);
                    }
                } else {
                    if (this.f21096) {
                        int length8 = c2657.length();
                        if (length8 > 0 && '\n' != c2657.charAt(length8 - 1)) {
                            AbstractC4088.m11629(c2657, '\n');
                        }
                        this.f21096 = false;
                    }
                    String strM36032 = c15048.m36032();
                    this.f21099.getClass();
                    int length9 = c2657.length();
                    int length10 = strM36032.length();
                    boolean z2 = false;
                    for (int i3 = 0; i3 < length10; i3++) {
                        char cCharAt = strM36032.charAt(i3);
                        if (Character.isWhitespace(cCharAt)) {
                            z2 = true;
                        } else {
                            if (z2 && (length = c2657.length()) > 0 && !Character.isWhitespace(c2657.charAt(length - 1))) {
                                AbstractC4088.m11629(c2657, ' ');
                            }
                            AbstractC4088.m11629(c2657, cCharAt);
                            z2 = false;
                        }
                    }
                    if (z2 && length9 < c2657.length()) {
                        AbstractC4088.m11629(c2657, ' ');
                    }
                }
            }
            abstractC7286M46530.mo19432();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17213(InterfaceC16789 interfaceC16789) {
        ArrayList arrayList = this.f21097;
        if (arrayList.size() > 0) {
            ((C11145) interfaceC16789).m28069(C0561.unmodifiableList(arrayList));
            arrayList.clear();
        } else {
            ((C11145) interfaceC16789).m28069(Collections.EMPTY_LIST);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17212(InterfaceC16789 interfaceC16789) {
        C16084 c16084 = this.f21095;
        while (true) {
            C16084 c16085 = c16084.f52027;
            if (c16085 == null) {
                break;
            } else {
                c16084 = c16085;
            }
        }
        List listMo26355 = c16084.mo26355();
        if (listMo26355.size() > 0) {
            ((C23845) interfaceC16789).m52574(listMo26355);
        } else {
            ((C23845) interfaceC16789).m52574(Collections.EMPTY_LIST);
        }
        this.f21095 = new C16084("", 0, Collections.EMPTY_MAP, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17210() {
        this.f21097.clear();
        this.f21095 = new C16084("", 0, Collections.EMPTY_MAP, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map m17209(C19281 c19281) {
        C22103<C2346> c22103 = c19281.f29926;
        int size = c22103.size();
        if (size > 0) {
            HashMap map = new HashMap(size);
            for (C2346 c2346 : c22103) {
                map.put(c2346.getKey().toLowerCase(Locale.US), c2346.getValue());
            }
            return C0561.unmodifiableMap(map);
        }
        return Collections.EMPTY_MAP;
    }
}
