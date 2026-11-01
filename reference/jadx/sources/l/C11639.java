package l;

import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import java.util.HashMap;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۨۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBJ7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11639 implements Cloneable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f39094;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String[] f39095;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f39096;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String[] f39097;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f39098 = new HashMap();

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f39099;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String[] f39100;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f39107;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f39109;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f39104 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f39106 = true;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f39105 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f39103 = false;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f39102 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f39108 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f39101 = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", am.ax, "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", c.c, "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", ErrorBundle.DETAIL_ENTRY, "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        f39096 = new String[]{"object", "base", "font", "tt", am.aC, "b", am.aH, "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", am.av, "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", AnnotatedPrivateKey.LABEL, "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", ErrorBundle.SUMMARY_ENTRY, "command", e.p, "area", "basefont", "bgsound", "menuitem", "param", "source", "track", e.m, "bdi", am.aB, "strike", "nobr"};
        f39100 = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", e.p, "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        f39095 = new String[]{"title", am.av, am.ax, "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", am.aB};
        f39099 = new String[]{"pre", "plaintext", "title", "textarea"};
        f39094 = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        f39097 = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (int i = 0; i < 69; i++) {
            C11639 c11639 = new C11639(strArr[i]);
            f39098.put(c11639.f39109, c11639);
        }
        for (String str : f39096) {
            C11639 c116310 = new C11639(str);
            c116310.f39104 = false;
            c116310.f39106 = false;
            f39098.put(c116310.f39109, c116310);
        }
        for (String str2 : f39100) {
            C11639 c116311 = (C11639) f39098.get(str2);
            C5557.m15341(c116311);
            c116311.f39105 = true;
        }
        for (String str3 : f39095) {
            C11639 c116312 = (C11639) f39098.get(str3);
            C5557.m15341(c116312);
            c116312.f39106 = false;
        }
        for (String str4 : f39099) {
            C11639 c116313 = (C11639) f39098.get(str4);
            C5557.m15341(c116313);
            c116313.f39102 = true;
        }
        for (String str5 : f39094) {
            C11639 c116314 = (C11639) f39098.get(str5);
            C5557.m15341(c116314);
            c116314.f39108 = true;
        }
        for (String str6 : f39097) {
            C11639 c116315 = (C11639) f39098.get(str6);
            C5557.m15341(c116315);
            c116315.f39101 = true;
        }
    }

    public C11639(String str) {
        this.f39109 = str;
        this.f39107 = C1323.m4722(str);
    }

    public final String getName() {
        return this.f39109;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m29052() {
        return this.f39107;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11639 m29046(String str, C4582 c4582) {
        C5557.m15341((Object) str);
        HashMap map = f39098;
        C11639 c11639 = (C11639) map.get(str);
        if (c11639 != null) {
            return c11639;
        }
        String strM12729 = c4582.m12729(str);
        C5557.m15342(strM12729);
        String strM4722 = C1323.m4722(strM12729);
        C11639 c116310 = (C11639) map.get(strM4722);
        if (c116310 == null) {
            C11639 c116311 = new C11639(strM12729);
            c116311.f39104 = false;
            return c116311;
        }
        if (!c4582.m12730() || strM12729.equals(strM4722)) {
            return c116310;
        }
        try {
            C11639 c116312 = (C11639) super.clone();
            c116312.f39109 = strM12729;
            return c116312;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m29053() {
        return this.f39104;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29050() {
        return this.f39106;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m29056() {
        return !this.f39104;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m29048() {
        return this.f39105;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m29049() {
        return this.f39105 || this.f39103;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m29054() {
        return f39098.containsKey(this.f39109);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29047(String str) {
        return f39098.containsKey(str);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m29057() {
        return this.f39102;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m29051() {
        return this.f39108;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m29055() {
        this.f39103 = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11639)) {
            return false;
        }
        C11639 c11639 = (C11639) obj;
        return this.f39109.equals(c11639.f39109) && this.f39105 == c11639.f39105 && this.f39106 == c11639.f39106 && this.f39104 == c11639.f39104 && this.f39102 == c11639.f39102 && this.f39103 == c11639.f39103 && this.f39108 == c11639.f39108 && this.f39101 == c11639.f39101;
    }

    public final int hashCode() {
        return (((((((((((((this.f39109.hashCode() * 31) + (this.f39104 ? 1 : 0)) * 31) + (this.f39106 ? 1 : 0)) * 31) + (this.f39105 ? 1 : 0)) * 31) + (this.f39103 ? 1 : 0)) * 31) + (this.f39102 ? 1 : 0)) * 31) + (this.f39108 ? 1 : 0)) * 31) + (this.f39101 ? 1 : 0);
    }

    public final String toString() {
        return this.f39109;
    }

    public final Object clone() {
        try {
            return (C11639) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
