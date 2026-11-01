package l;

import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.cb;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ۚۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BI9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5247 extends AbstractC19711 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String[] f18187 = {null};

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f18188;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C6262 f18189;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f18190;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f18191;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f18192;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC1719 f18193;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC1719 f18194;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C0617 f18195;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C3876 f18196;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f18197;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f18198;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C0617 f18199;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f18200;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String[] f18180 = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f18183 = {"ol", "ul"};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final String[] f18185 = {"button"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f18179 = {"html", "table"};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String[] f18186 = {"optgroup", "option"};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final String[] f18181 = {"dd", "dt", "li", "optgroup", "option", am.ax, "rb", "rp", "rt", "rtc"};

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String[] f18182 = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", am.ax, "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String[] f18184 = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", ErrorBundle.DETAIL_ENTRY, "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", c.c, "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", am.ax, "param", "plaintext", "pre", "script", "section", "select", "style", ErrorBundle.SUMMARY_ENTRY, "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    @Override // l.AbstractC19711
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4582 mo14492() {
        return C4582.f16236;
    }

    @Override // l.AbstractC19711
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14463(StringReader stringReader, String str, C13756 c13756) {
        super.mo14463(stringReader, str, c13756);
        this.f18194 = EnumC1719.f6821;
        this.f18193 = null;
        this.f18200 = false;
        this.f18199 = null;
        this.f18189 = null;
        this.f18195 = null;
        this.f18197 = new ArrayList();
        this.f18192 = new ArrayList();
        this.f18198 = new ArrayList();
        this.f18196 = new C3876();
        this.f18188 = true;
        this.f18190 = false;
        this.f18191 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    @Override // l.AbstractC19711
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo14460(String str, C0617 c0617, String str2, C13756 c13756) {
        List listM35272;
        this.f18194 = EnumC1719.f6821;
        mo14463(new StringReader(str), str2, c13756);
        this.f18195 = c0617;
        byte b = 1;
        this.f18191 = true;
        if (c0617.m35269() != null) {
            this.f63275.m26635(c0617.m35269().m26642());
        }
        String strM2833 = c0617.m2833();
        strM2833.getClass();
        switch (strM2833.hashCode()) {
            case -1321546630:
                if (!strM2833.equals("template")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1191214428:
                if (!strM2833.equals("iframe")) {
                    b = -1;
                }
                break;
            case -1003243718:
                if (!strM2833.equals("textarea")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -907685685:
                if (!strM2833.equals("script")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 118807:
                if (!strM2833.equals(DocumentReader.RESERVED)) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 109780401:
                if (!strM2833.equals("style")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 110371416:
                if (!strM2833.equals("title")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 1192721831:
                if (!strM2833.equals("noframes")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1551550924:
                if (!strM2833.equals("noscript")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1973234167:
                if (!strM2833.equals("plaintext")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 2115613112:
                if (!strM2833.equals("noembed")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                this.f63280.m21353(EnumC8422.f29249);
                m14494(EnumC1719.f6806);
                break;
            case 1:
            case 4:
            case 5:
            case 7:
            case 10:
                this.f63280.m21353(EnumC8422.f29222);
                break;
            case 2:
            case 6:
                this.f63280.m21353(EnumC8422.f29218);
                break;
            case 3:
                this.f63280.m21353(EnumC8422.f29204);
                break;
            case 8:
                this.f63280.m21353(EnumC8422.f29249);
                break;
            case 9:
                this.f63280.m21353(EnumC8422.f29226);
                break;
            default:
                this.f63280.m21353(EnumC8422.f29249);
                break;
        }
        C0617 c0618 = new C0617(m44835(strM2833, this.f63276), str2, null);
        this.f63275.m2855(c0618);
        this.f63271.add(c0618);
        m14499();
        while (c0617 != null) {
            if (c0617 instanceof C6262) {
                this.f18189 = (C6262) c0617;
                m44840();
                listM35272 = c0618.m35272();
                if (!listM35272.isEmpty()) {
                    c0618.m2840(-1, listM35272);
                }
                return c0618.m35264();
            }
            c0617 = c0617.mo2849();
        }
        m44840();
        listM35272 = c0618.m35272();
        if (!listM35272.isEmpty()) {
            c0618.m2840(-1, listM35272);
        }
        return c0618.m35264();
    }

    @Override // l.AbstractC19711
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo14473(AbstractC21516 abstractC21516) {
        this.f63277 = abstractC21516;
        return this.f18194.mo1923(abstractC21516, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14470(AbstractC21516 abstractC21516, EnumC1719 enumC1719) {
        this.f63277 = abstractC21516;
        enumC1719.mo1923(abstractC21516, this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m14486(EnumC1719 enumC1719) {
        this.f18194 = enumC1719;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final EnumC1719 m14451() {
        return this.f18194;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m14503() {
        this.f18193 = this.f18194;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final EnumC1719 m14504() {
        return this.f18193;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14472(boolean z) {
        this.f18188 = z;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m14458() {
        return this.f18188;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m14477(C0617 c0617) {
        if (this.f18200) {
            return;
        }
        String strMo28141 = c0617.mo28141("href");
        if (strMo28141.length() != 0) {
            this.f63272 = strMo28141;
            this.f18200 = true;
            this.f63275.m35265(strMo28141);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m14502() {
        return this.f18191;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14466(EnumC1719 enumC1719) {
        if (this.f63273.m33516().m9477()) {
            this.f63273.m33516().add(new C9482(this.f63279, "Unexpected %s token [%s] when in state [%s]", this.f63277.getClass().getSimpleName(), this.f63277, enumC1719));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0617 m14462(C6699 c6699) {
        if (c6699.m50749() && !c6699.f74528.isEmpty() && c6699.f74528.m36932(this.f63276) > 0) {
            Object[] objArr = {c6699.f74529};
            C3130 c3130M33516 = this.f63273.m33516();
            if (c3130M33516.m9477()) {
                c3130M33516.add(new C9482(this.f63279, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        if (c6699.f74531) {
            C0617 c0617M14491 = m14491(c6699);
            this.f63271.add(c0617M14491);
            this.f63280.m21353(EnumC8422.f29249);
            C8111 c8111 = this.f63280;
            C3876 c3876 = this.f18196;
            c3876.mo3991();
            c3876.m50744(c0617M14491.m2837());
            c8111.m21361(c3876);
            return c0617M14491;
        }
        C11639 c11639M44835 = m44835(c6699.m50755(), this.f63276);
        C4582 c4582 = this.f63276;
        C15436 c15436 = c6699.f74528;
        c4582.m12727(c15436);
        C0617 c0617 = new C0617(c11639M44835, null, c15436);
        m14449(c0617, c6699);
        this.f63271.add(c0617);
        return c0617;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m14485(C0617 c0617) {
        m14449(c0617, null);
        this.f63271.add(c0617);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0617 m14491(C6699 c6699) {
        C11639 c11639M44835 = m44835(c6699.m50755(), this.f63276);
        C4582 c4582 = this.f63276;
        C15436 c15436 = c6699.f74528;
        c4582.m12727(c15436);
        C0617 c0617 = new C0617(c11639M44835, null, c15436);
        m14449(c0617, c6699);
        if (c6699.f74531) {
            if (c11639M44835.m29054()) {
                if (!c11639M44835.m29048()) {
                    this.f63280.m21358("Tag [%s] cannot be self closing; not a void tag", c11639M44835.m29052());
                    return c0617;
                }
            } else {
                c11639M44835.m29055();
            }
        }
        return c0617;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14468(C6699 c6699, boolean z, boolean z2) {
        C11639 c11639M44835 = m44835(c6699.m50755(), this.f63276);
        C4582 c4582 = this.f63276;
        C15436 c15436 = c6699.f74528;
        c4582.m12727(c15436);
        C6262 c6262 = new C6262(c11639M44835, c15436);
        if (!z2 || !m14508("template")) {
            this.f18189 = c6262;
        }
        m14449(c6262, c6699);
        if (z) {
            this.f63271.add(c6262);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14471(C22222 c22222) {
        m14449(new C18257(c22222.m49335()), c22222);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14467(C5288 c5288) {
        AbstractC14730 c13715;
        C0617 c0617M44834 = m44834();
        String strM2833 = c0617M44834.m2833();
        String strM14653 = c5288.m14653();
        if (c5288 instanceof C2465) {
            c13715 = new C21785(strM14653);
        } else if (mo14496(strM2833)) {
            c13715 = new C18963(strM14653);
        } else {
            c13715 = new C13715(strM14653);
        }
        c0617M44834.m2855(c13715);
        m44837(c13715, c5288);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m14449(AbstractC14730 abstractC14730, AbstractC21516 abstractC21516) {
        C6262 c6262;
        if (this.f63271.isEmpty()) {
            this.f63275.m2855(abstractC14730);
        } else if (this.f18190 && C4145.m11787(m44834().m2833(), C14421.f47264)) {
            m14469(abstractC14730);
        } else {
            m44834().m2855(abstractC14730);
        }
        if (abstractC14730 instanceof C0617) {
            C0617 c0617 = (C0617) abstractC14730;
            if (c0617.m2860().m29051() && (c6262 = this.f18189) != null) {
                c6262.m17322(c0617);
            }
        }
        m44837(abstractC14730, abstractC21516);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m14483() {
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m14511(C0617 c0617) {
        return m14447(this.f63271, c0617);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m14508(String str) {
        return m14453(str) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14447(ArrayList arrayList, C0617 c0617) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (((C0617) arrayList.get(i)) == c0617) {
                return true;
            }
            i--;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C0617 m14453(String str) {
        int size = this.f63271.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            C0617 c0617 = (C0617) this.f63271.get(i);
            if (c0617.m2833().equals(str)) {
                return c0617;
            }
            i--;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m14479(C0617 c0617) {
        int size = this.f63271.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (((C0617) this.f63271.get(size)) != c0617);
        this.f63271.remove(size);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m14501(String str) {
        C0617 c0617;
        int size = this.f63271.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            c0617 = (C0617) this.f63271.get(size);
            this.f63271.remove(size);
        } while (!c0617.m2833().equals(str));
        AbstractC21516 abstractC21516 = this.f63277;
        if (abstractC21516 instanceof C3876) {
            m44836(c0617, abstractC21516);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m14510() {
        m14450("table", "template");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m14475() {
        m14450("tbody", "tfoot", "thead", "template");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m14454() {
        m14450("tr", "template");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m14450(String... strArr) {
        int size = this.f63271.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C0617 c0617 = (C0617) this.f63271.get(size);
            String strM2833 = c0617.m2833();
            int i = C4145.f15163;
            for (String str : strArr) {
                if (str.equals(strM2833)) {
                    return;
                }
            }
            if (c0617.m2833().equals("html")) {
                return;
            } else {
                this.f63271.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0617 m14461(C0617 c0617) {
        int size = this.f63271.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
        } while (((C0617) this.f63271.get(size)) != c0617);
        return (C0617) this.f63271.get(size - 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:104:0x0142  */
    /* JADX WARN: Code duplicated, block: B:107:0x0146  */
    /* JADX WARN: Code duplicated, block: B:111:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0158 A[LOOP:0: B:10:0x0020->B:113:0x0158, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0160 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x0161 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0115  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0126 A[DONT_INVERT] */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m14499() {
        EnumC1719 enumC1719;
        int size = this.f63271.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        EnumC1719 enumC17110 = this.f18194;
        if (this.f63271.size() == 0) {
            this.f18194 = EnumC1719.f6813;
        }
        boolean z = false;
        while (i >= i2) {
            C0617 c0617 = (C0617) this.f63271.get(i);
            if (i == i2) {
                if (this.f18191) {
                    c0617 = this.f18195;
                }
                z = true;
            }
            String strM2833 = c0617 != null ? c0617.m2833() : "";
            strM2833.getClass();
            byte b = -1;
            switch (strM2833) {
                case "frameset":
                    b = 0;
                case "template":
                    b = 1;
                case "select":
                    b = 2;
                case "colgroup":
                    b = 3;
                case "td":
                    b = 4;
                case "th":
                    b = 5;
                case "tr":
                    b = 6;
                case "body":
                    b = 7;
                case "head":
                    b = 8;
                case "html":
                    b = 9;
                case "table":
                    b = 10;
                case "tbody":
                    b = 11;
                case "tfoot":
                    b = 12;
                case "thead":
                    b = cb.k;
                case "caption":
                    b = cb.f77931l;
                default:
                    switch (b) {
                        case 0:
                            enumC1719 = EnumC1719.f6803;
                            this.f18194 = enumC1719;
                            break;
                        case 1:
                            if (this.f18192.size() > 0) {
                                enumC1719 = (EnumC1719) C19084.m43861(this.f18192, 1);
                            } else {
                                enumC1719 = null;
                            }
                            if (enumC1719 == null) {
                                throw new C22491("Bug: no template insertion mode on stack!");
                            }
                            this.f18194 = enumC1719;
                            break;
                        case 2:
                            enumC1719 = EnumC1719.f6804;
                            this.f18194 = enumC1719;
                            break;
                        case 3:
                            enumC1719 = EnumC1719.f6801;
                            this.f18194 = enumC1719;
                            break;
                        case 4:
                        case 5:
                            if (z) {
                                enumC1719 = EnumC1719.f6807;
                            } else if (z) {
                                i--;
                            } else {
                                enumC1719 = EnumC1719.f6813;
                            }
                            this.f18194 = enumC1719;
                            break;
                        case 6:
                            enumC1719 = EnumC1719.f6800;
                            this.f18194 = enumC1719;
                            break;
                        case 7:
                            enumC1719 = EnumC1719.f6813;
                            this.f18194 = enumC1719;
                            break;
                        case 8:
                            if (z) {
                                enumC1719 = EnumC1719.f6812;
                            } else if (z) {
                                i--;
                            } else {
                                enumC1719 = EnumC1719.f6813;
                            }
                            this.f18194 = enumC1719;
                            break;
                        case 9:
                            if (this.f18199 == null) {
                                enumC1719 = EnumC1719.f6805;
                            } else {
                                enumC1719 = EnumC1719.f6817;
                            }
                            this.f18194 = enumC1719;
                            break;
                        case 10:
                            enumC1719 = EnumC1719.f6798;
                            this.f18194 = enumC1719;
                            break;
                        case 11:
                        case 12:
                        case 13:
                            enumC1719 = EnumC1719.f6811;
                            this.f18194 = enumC1719;
                            break;
                        case 14:
                            enumC1719 = EnumC1719.f6799;
                            this.f18194 = enumC1719;
                            break;
                        default:
                            if (z) {
                                i--;
                            } else {
                                enumC1719 = EnumC1719.f6813;
                                this.f18194 = enumC1719;
                            }
                            break;
                    }
            }
            if (this.f18194 != enumC17110) {
                return true;
            }
            return false;
        }
        if (this.f18194 != enumC17110) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14506() {
        if (!m14508("body")) {
            this.f63271.add(this.f63275.m26640());
        }
        this.f18194 = EnumC1719.f6813;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m14459(String str) {
        String[] strArr = this.f18187;
        strArr[0] = str;
        return m14448(strArr, f18180, f18183);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m14480(String str) {
        String[] strArr = this.f18187;
        strArr[0] = str;
        return m14448(strArr, f18180, (String[]) null);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m14490(String str) {
        String[] strArr = this.f18187;
        strArr[0] = str;
        return m14448(strArr, f18180, f18185);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m14498(String str) {
        String[] strArr = this.f18187;
        strArr[0] = str;
        return m14448(strArr, f18179, (String[]) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m14448(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f63271.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            String strM2833 = ((C0617) this.f63271.get(i)).m2833();
            if (!C4145.m11787(strM2833, strArr)) {
                if (C4145.m11787(strM2833, strArr2) || (strArr3 != null && C4145.m11787(strM2833, strArr3))) {
                    break;
                }
                i--;
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14474(String[] strArr) {
        return m14448(strArr, f18180, (String[]) null);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m14514(String str) {
        for (int size = this.f63271.size() - 1; size >= 0; size--) {
            String strM2833 = ((C0617) this.f63271.get(size)).m2833();
            if (strM2833.equals(str)) {
                return true;
            }
            if (!C4145.m11787(strM2833, f18186)) {
                return false;
            }
        }
        throw new C22491("Should not be reachable");
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m14513(C0617 c0617) {
        this.f18199 = c0617;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C0617 m14512() {
        return this.f18199;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m14487(boolean z) {
        this.f18190 = z;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6262 m14478() {
        return this.f18189;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m14505() {
        this.f18189 = null;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m14482() {
        this.f18198 = new ArrayList();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List m14497() {
        return this.f18198;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m14476(String str) {
        while (C4145.m11787(m44834().m2833(), f18181)) {
            if (str != null && m44838(str)) {
                return;
            } else {
                m14483();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14495(boolean z) {
        String[] strArr = z ? f18182 : f18181;
        while (C4145.m11787(m44834().m2833(), strArr)) {
            m14483();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m14488() {
        m14476(am.ax);
        if (!am.ax.equals(m44834().m2833())) {
            m14466(this.f18194);
        }
        m14501(am.ax);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m14452(C0617 c0617) {
        for (int i = 0; i < this.f18197.size(); i++) {
            if (c0617 == this.f18197.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m14489(C0617 c0617) {
        m14493(c0617);
        this.f18197.add(c0617);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14464(C0617 c0617, int i) {
        m14493(c0617);
        try {
            this.f18197.add(i, c0617);
        } catch (IndexOutOfBoundsException unused) {
            this.f18197.add(c0617);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14493(C0617 c0617) {
        int size = this.f18197.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            C0617 c0618 = (C0617) this.f18197.get(i3);
            if (c0618 == null) {
                return;
            }
            if (c0617.m2833().equals(c0618.m2833()) && c0617.mo2839().equals(c0618.mo2839())) {
                i2++;
            }
            if (i2 == 3) {
                this.f18197.remove(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m14481() {
        C5247 c5247;
        if (this.f63271.size() > 256) {
            return;
        }
        boolean z = true;
        C0617 c0617 = this.f18197.size() > 0 ? (C0617) C19084.m43861(this.f18197, 1) : null;
        if (c0617 == null || m14447(this.f63271, c0617)) {
            return;
        }
        int size = this.f18197.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (true) {
            if (i3 == i) {
                c5247 = this;
                break;
            }
            i3--;
            c0617 = (C0617) this.f18197.get(i3);
            if (c0617 == null || m14447(this.f63271, c0617)) {
                c5247 = this;
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i3++;
                c0617 = (C0617) c5247.f18197.get(i3);
            }
            C5557.m15341(c0617);
            C0617 c0618 = new C0617(c5247.m44835(c0617.m2833(), c5247.f63276), null, c0617.mo2839().clone());
            c5247.m14485(c0618);
            c5247.f18197.set(i3, c0618);
            if (i3 == i2) {
                return;
            }
            i2 = i2;
            c5247 = c5247;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m14455() {
        while (!this.f18197.isEmpty()) {
            int size = this.f18197.size();
            if ((size > 0 ? (C0617) this.f18197.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m14457(C0617 c0617) {
        int size = this.f18197.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (((C0617) this.f18197.get(size)) != c0617);
        this.f18197.remove(size);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m14456(C0617 c0617) {
        return m14447(this.f18197, c0617);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C0617 m14509(String str) {
        C0617 c0617;
        int size = this.f18197.size();
        do {
            size--;
            if (size < 0 || (c0617 = (C0617) this.f18197.get(size)) == null) {
                return null;
            }
        } while (!c0617.m2833().equals(str));
        return c0617;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14465(C0617 c0617, C0617 c0618) {
        ArrayList arrayList = this.f18197;
        int iLastIndexOf = arrayList.lastIndexOf(c0617);
        C5557.m15344(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, c0618);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m14507() {
        this.f18197.add(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14469(AbstractC14730 abstractC14730) {
        C0617 c0617M14461;
        C0617 c0617M14453 = m14453("table");
        boolean z = false;
        if (c0617M14453 != null) {
            if (c0617M14453.mo2849() != null) {
                c0617M14461 = c0617M14453.mo2849();
                z = true;
            } else {
                c0617M14461 = m14461(c0617M14453);
            }
        } else {
            c0617M14461 = (C0617) this.f63271.get(0);
        }
        if (z) {
            C5557.m15341(c0617M14453);
            c0617M14453.m2832(abstractC14730);
        } else {
            c0617M14461.m2855(abstractC14730);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14494(EnumC1719 enumC1719) {
        this.f18192.add(enumC1719);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m14484() {
        if (this.f18192.size() > 0) {
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m14500() {
        return this.f18192.size();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f63277);
        String strValueOf2 = String.valueOf(this.f18194);
        return C22697.m50267(C12278.m30515("TreeBuilder{currentToken=", strValueOf, ", state=", strValueOf2, ", currentElement="), String.valueOf(m44834()), l.d);
    }

    @Override // l.AbstractC19711
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo14496(String str) {
        return str.equals("script") || str.equals("style");
    }
}
