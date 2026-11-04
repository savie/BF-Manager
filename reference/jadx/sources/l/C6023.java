package l;

import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import java.util.HashMap;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۛ֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBJ7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6023 implements Cloneable {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f20588;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f20589;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String[] f20590;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final String[] f20591;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f20592 = new HashMap();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String[] f20593;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f20594;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f20598;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f20602;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f20597 = true;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f20595 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f20600 = false;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f20596 = false;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f20599 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f20603 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f20601 = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", am.ax, "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", c.c, "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", ErrorBundle.DETAIL_ENTRY, "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        f20589 = new String[]{"object", "base", "font", "tt", am.aC, "b", am.aH, "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", am.av, "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", AnnotatedPrivateKey.LABEL, "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", ErrorBundle.SUMMARY_ENTRY, "command", e.p, "area", "basefont", "bgsound", "menuitem", "param", "source", "track", e.m, "bdi", am.aB, "strike", "nobr"};
        f20588 = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", e.p, "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        f20593 = new String[]{"title", am.av, am.ax, "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", am.aB};
        f20594 = new String[]{"pre", "plaintext", "title", "textarea"};
        f20591 = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        f20590 = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (int i = 0; i < 69; i++) {
            C6023 c6023 = new C6023(strArr[i]);
            f20592.put(c6023.f20598, c6023);
        }
        for (String str : f20589) {
            C6023 c6024 = new C6023(str);
            c6024.f20597 = false;
            c6024.f20595 = false;
            f20592.put(c6024.f20598, c6024);
        }
        for (String str2 : f20588) {
            C6023 c6025 = (C6023) f20592.get(str2);
            C14838.m35754(c6025);
            c6025.f20600 = true;
        }
        for (String str3 : f20593) {
            C6023 c6026 = (C6023) f20592.get(str3);
            C14838.m35754(c6026);
            c6026.f20595 = false;
        }
        for (String str4 : f20594) {
            C6023 c6027 = (C6023) f20592.get(str4);
            C14838.m35754(c6027);
            c6027.f20599 = true;
        }
        for (String str5 : f20591) {
            C6023 c6028 = (C6023) f20592.get(str5);
            C14838.m35754(c6028);
            c6028.f20603 = true;
        }
        for (String str6 : f20590) {
            C6023 c6029 = (C6023) f20592.get(str6);
            C14838.m35754(c6029);
            c6029.f20601 = true;
        }
    }

    public C6023(String str) {
        this.f20598 = str;
        this.f20602 = C15300.m36731(str);
    }

    public final String getName() {
        return this.f20598;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m17493() {
        return this.f20602;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6023 m17487(String str, C20193 c20193) {
        C14838.m35754((Object) str);
        HashMap map = f20592;
        C6023 c6023 = (C6023) map.get(str);
        if (c6023 != null) {
            return c6023;
        }
        String strM46442 = c20193.m46442(str);
        C14838.m35755(strM46442);
        String strM36731 = C15300.m36731(strM46442);
        C6023 c6024 = (C6023) map.get(strM36731);
        if (c6024 == null) {
            C6023 c6025 = new C6023(strM46442);
            c6025.f20597 = false;
            return c6025;
        }
        if (!c20193.m46443() || strM46442.equals(strM36731)) {
            return c6024;
        }
        try {
            C6023 c6026 = (C6023) super.clone();
            c6026.f20598 = strM46442;
            return c6026;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m17497() {
        return this.f20597;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17490() {
        return this.f20595;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m17494() {
        return !this.f20597;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m17492() {
        return this.f20600;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17489() {
        return this.f20600 || this.f20596;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m17491() {
        return f20592.containsKey(this.f20598);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17488(String str) {
        return f20592.containsKey(str);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m17498() {
        return this.f20599;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m17496() {
        return this.f20603;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m17495() {
        this.f20596 = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6023)) {
            return false;
        }
        C6023 c6023 = (C6023) obj;
        return this.f20598.equals(c6023.f20598) && this.f20600 == c6023.f20600 && this.f20595 == c6023.f20595 && this.f20597 == c6023.f20597 && this.f20599 == c6023.f20599 && this.f20596 == c6023.f20596 && this.f20603 == c6023.f20603 && this.f20601 == c6023.f20601;
    }

    public final int hashCode() {
        return (((((((((((((this.f20598.hashCode() * 31) + (this.f20597 ? 1 : 0)) * 31) + (this.f20595 ? 1 : 0)) * 31) + (this.f20600 ? 1 : 0)) * 31) + (this.f20596 ? 1 : 0)) * 31) + (this.f20599 ? 1 : 0)) * 31) + (this.f20603 ? 1 : 0)) * 31) + (this.f20601 ? 1 : 0);
    }

    public final String toString() {
        return this.f20598;
    }

    public final Object clone() {
        try {
            return (C6023) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
