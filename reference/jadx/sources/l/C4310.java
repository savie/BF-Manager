package l;

import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ۘܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BI9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4310 extends AbstractC7315 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC15717 f15622;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C11767 f15623;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C15496 f15624;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f15625;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ArrayList f15626;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f15627;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC15717 f15628;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C15496 f15629;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f15630;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String[] f15631 = {null};

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f15632;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f15633;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C0056 f15634;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f15635;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String[] f15620 = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String[] f15614 = {"ol", "ul"};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f15621 = {"button"};

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final String[] f15617 = {"html", "table"};

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String[] f15618 = {"optgroup", "option"};

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String[] f15619 = {"dd", "dt", "li", "optgroup", "option", am.ax, "rb", "rp", "rt", "rtc"};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String[] f15616 = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", am.ax, "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f15615 = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", ErrorBundle.DETAIL_ENTRY, "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", c.c, "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", am.ax, "param", "plaintext", "pre", "script", "section", "select", "style", ErrorBundle.SUMMARY_ENTRY, "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    @Override // l.AbstractC7315
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20193 mo13791() {
        return C20193.f64825;
    }

    @Override // l.AbstractC7315
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo13748(StringReader stringReader, String str, C11988 c11988) {
        super.mo13748(stringReader, str, c11988);
        this.f15622 = EnumC15717.f51075;
        this.f15628 = null;
        this.f15630 = false;
        this.f15624 = null;
        this.f15623 = null;
        this.f15629 = null;
        this.f15632 = new ArrayList();
        this.f15626 = new ArrayList();
        this.f15633 = new ArrayList();
        this.f15634 = new C0056();
        this.f15635 = true;
        this.f15627 = false;
        this.f15625 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    @Override // l.AbstractC7315
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List mo13745(String str, C15496 c15496, String str2, C11988 c11988) {
        List listM41525;
        this.f15622 = EnumC15717.f51075;
        mo13748(new StringReader(str), str2, c11988);
        this.f15629 = c15496;
        byte b = 1;
        this.f15625 = true;
        if (c15496.m41533() != null) {
            this.f24096.m15295(c15496.m41533().m15293());
        }
        String strM37100 = c15496.m37100();
        strM37100.getClass();
        switch (strM37100.hashCode()) {
            case -1321546630:
                if (!strM37100.equals("template")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1191214428:
                if (!strM37100.equals("iframe")) {
                    b = -1;
                }
                break;
            case -1003243718:
                if (!strM37100.equals("textarea")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -907685685:
                if (!strM37100.equals("script")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 118807:
                if (!strM37100.equals(DocumentReader.RESERVED)) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 109780401:
                if (!strM37100.equals("style")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 110371416:
                if (!strM37100.equals("title")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 1192721831:
                if (!strM37100.equals("noframes")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1551550924:
                if (!strM37100.equals("noscript")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1973234167:
                if (!strM37100.equals("plaintext")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 2115613112:
                if (!strM37100.equals("noembed")) {
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
                this.f24104.m22269(EnumC8806.f28749);
                m13793(EnumC15717.f51062);
                break;
            case 1:
            case 4:
            case 5:
            case 7:
            case 10:
                this.f24104.m22269(EnumC8806.f28694);
                break;
            case 2:
            case 6:
                this.f24104.m22269(EnumC8806.f28710);
                break;
            case 3:
                this.f24104.m22269(EnumC8806.f28704);
                break;
            case 8:
                this.f24104.m22269(EnumC8806.f28749);
                break;
            case 9:
                this.f24104.m22269(EnumC8806.f28712);
                break;
            default:
                this.f24104.m22269(EnumC8806.f28749);
                break;
        }
        C15496 c15497 = new C15496(m20059(strM37100, this.f24095), str2, null);
        this.f24096.m37084(c15497);
        this.f24093.add(c15497);
        m13774();
        while (c15496 != null) {
            if (c15496 instanceof C11767) {
                this.f15623 = (C11767) c15496;
                m20065();
                listM41525 = c15497.m41525();
                if (!listM41525.isEmpty()) {
                    c15497.m37071(-1, listM41525);
                }
                return c15497.m41534();
            }
            c15496 = c15496.mo37068();
        }
        m20065();
        listM41525 = c15497.m41525();
        if (!listM41525.isEmpty()) {
            c15497.m37071(-1, listM41525);
        }
        return c15497.m41534();
    }

    @Override // l.AbstractC7315
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo13758(AbstractC0802 abstractC0802) {
        this.f24102 = abstractC0802;
        return this.f15622.mo2666(abstractC0802, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13749(AbstractC0802 abstractC0802, EnumC15717 enumC15717) {
        this.f24102 = abstractC0802;
        enumC15717.mo2666(abstractC0802, this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13765(EnumC15717 enumC15717) {
        this.f15622 = enumC15717;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC15717 m13784() {
        return this.f15622;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m13798() {
        this.f15628 = this.f15622;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final EnumC15717 m13788() {
        return this.f15628;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13757(boolean z) {
        this.f15635 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13741() {
        return this.f15635;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m13787(C15496 c15496) {
        if (this.f15630) {
            return;
        }
        String strMo41526 = c15496.mo41526("href");
        if (strMo41526.length() != 0) {
            this.f24094 = strMo41526;
            this.f15630 = true;
            this.f24096.m41535(strMo41526);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m13779() {
        return this.f15625;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13755(EnumC15717 enumC15717) {
        if (this.f24101.m30119().m9877()) {
            this.f24101.m30119().add(new C23177(this.f24099, "Unexpected %s token [%s] when in state [%s]", this.f24102.getClass().getSimpleName(), this.f24102, enumC15717));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15496 m13746(C7514 c7514) {
        if (c7514.m43492() && !c7514.f60782.isEmpty() && c7514.f60782.m26648(this.f24095) > 0) {
            Object[] objArr = {c7514.f60787};
            C3039 c3039M30119 = this.f24101.m30119();
            if (c3039M30119.m9877()) {
                c3039M30119.add(new C23177(this.f24099, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        if (c7514.f60788) {
            C15496 c15496M13790 = m13790(c7514);
            this.f24093.add(c15496M13790);
            this.f24104.m22269(EnumC8806.f28749);
            C8260 c8260 = this.f24104;
            C0056 c0056 = this.f15634;
            c0056.mo3216();
            c0056.m43497(c15496M13790.m37066());
            c8260.m22257(c0056);
            return c15496M13790;
        }
        C6023 c6023M20059 = m20059(c7514.m43498(), this.f24095);
        C20193 c20193 = this.f24095;
        C10363 c10363 = c7514.f60782;
        c20193.m46440(c10363);
        C15496 c15496 = new C15496(c6023M20059, null, c10363);
        m13737(c15496, c7514);
        this.f24093.add(c15496);
        return c15496;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13764(C15496 c15496) {
        m13737(c15496, null);
        this.f24093.add(c15496);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15496 m13790(C7514 c7514) {
        C6023 c6023M20059 = m20059(c7514.m43498(), this.f24095);
        C20193 c20193 = this.f24095;
        C10363 c10363 = c7514.f60782;
        c20193.m46440(c10363);
        C15496 c15496 = new C15496(c6023M20059, null, c10363);
        m13737(c15496, c7514);
        if (c7514.f60788) {
            if (c6023M20059.m17491()) {
                if (!c6023M20059.m17492()) {
                    this.f24104.m22255("Tag [%s] cannot be self closing; not a void tag", c6023M20059.m17493());
                    return c15496;
                }
            } else {
                c6023M20059.m17495();
            }
        }
        return c15496;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13751(C7514 c7514, boolean z, boolean z2) {
        C6023 c6023M20059 = m20059(c7514.m43498(), this.f24095);
        C20193 c20193 = this.f24095;
        C10363 c10363 = c7514.f60782;
        c20193.m46440(c10363);
        C11767 c11767 = new C11767(c6023M20059, c10363);
        if (!z2 || !m13783("template")) {
            this.f15623 = c11767;
        }
        m13737(c11767, c7514);
        if (z) {
            this.f24093.add(c11767);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13752(C14225 c14225) {
        m13737(new C9617(c14225.m34533()), c14225);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13750(C3785 c3785) {
        AbstractC17734 c12513;
        C15496 c15496M20060 = m20060();
        String strM37100 = c15496M20060.m37100();
        String strM12293 = c3785.m12293();
        if (c3785 instanceof C23923) {
            c12513 = new C1415(strM12293);
        } else if (mo13795(strM37100)) {
            c12513 = new C2906(strM12293);
        } else {
            c12513 = new C12513(strM12293);
        }
        c15496M20060.m37084(c12513);
        m20062(c12513, c3785);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m13737(AbstractC17734 abstractC17734, AbstractC0802 abstractC0802) {
        C11767 c11767;
        if (this.f24093.isEmpty()) {
            this.f24096.m37084(abstractC17734);
        } else if (this.f15627 && C0669.m2903(m20060().m37100(), C17209.f56085)) {
            m13756(abstractC17734);
        } else {
            m20060().m37084(abstractC17734);
        }
        if (abstractC17734 instanceof C15496) {
            C15496 c15496 = (C15496) abstractC17734;
            if (c15496.m37077().m17496() && (c11767 = this.f15623) != null) {
                c11767.m29542(c15496);
            }
        }
        m20062(abstractC17734, abstractC0802);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m13770() {
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m13777(C15496 c15496) {
        return m13735(this.f24093, c15496);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m13783(String str) {
        return m13772(str) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m13735(ArrayList arrayList, C15496 c15496) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (((C15496) arrayList.get(i)) == c15496) {
                return true;
            }
            i--;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15496 m13772(String str) {
        int size = this.f24093.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            C15496 c15496 = (C15496) this.f24093.get(i);
            if (c15496.m37100().equals(str)) {
                return c15496;
            }
            i--;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13768(C15496 c15496) {
        int size = this.f24093.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (((C15496) this.f24093.get(size)) != c15496);
        this.f24093.remove(size);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m13778(String str) {
        C15496 c15496;
        int size = this.f24093.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            c15496 = (C15496) this.f24093.get(size);
            this.f24093.remove(size);
        } while (!c15496.m37100().equals(str));
        AbstractC0802 abstractC0802 = this.f24102;
        if (abstractC0802 instanceof C0056) {
            m20061(c15496, abstractC0802);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m13776() {
        m13738("table", "template");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m13785() {
        m13738("tbody", "tfoot", "thead", "template");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m13773() {
        m13738("tr", "template");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m13738(String... strArr) {
        int size = this.f24093.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C15496 c15496 = (C15496) this.f24093.get(size);
            String strM37100 = c15496.m37100();
            int i = C0669.f2538;
            for (String str : strArr) {
                if (str.equals(strM37100)) {
                    return;
                }
            }
            if (c15496.m37100().equals("html")) {
                return;
            } else {
                this.f24093.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15496 m13747(C15496 c15496) {
        int size = this.f24093.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
        } while (((C15496) this.f24093.get(size)) != c15496);
        return (C15496) this.f24093.get(size - 1);
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m13774() {
        EnumC15717 enumC15717;
        int size = this.f24093.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        EnumC15717 enumC15718 = this.f15622;
        if (this.f24093.size() == 0) {
            this.f15622 = EnumC15717.f51053;
        }
        boolean z = false;
        while (i >= i2) {
            C15496 c15496 = (C15496) this.f24093.get(i);
            if (i == i2) {
                if (this.f15625) {
                    c15496 = this.f15629;
                }
                z = true;
            }
            String strM37100 = c15496 != null ? c15496.m37100() : "";
            strM37100.getClass();
            byte b = -1;
            switch (strM37100) {
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
                    b = cb.f82047l;
                default:
                    switch (b) {
                        case 0:
                            enumC15717 = EnumC15717.f51054;
                            this.f15622 = enumC15717;
                            break;
                        case 1:
                            if (this.f15626.size() > 0) {
                                enumC15717 = (EnumC15717) j$$ExternalSyntheticOutline0.m(this.f15626, 1);
                            } else {
                                enumC15717 = null;
                            }
                            if (enumC15717 == null) {
                                throw new C21552("Bug: no template insertion mode on stack!");
                            }
                            this.f15622 = enumC15717;
                            break;
                        case 2:
                            enumC15717 = EnumC15717.f51071;
                            this.f15622 = enumC15717;
                            break;
                        case 3:
                            enumC15717 = EnumC15717.f51064;
                            this.f15622 = enumC15717;
                            break;
                        case 4:
                        case 5:
                            if (z) {
                                enumC15717 = EnumC15717.f51056;
                            } else if (z) {
                                i--;
                            } else {
                                enumC15717 = EnumC15717.f51053;
                            }
                            this.f15622 = enumC15717;
                            break;
                        case 6:
                            enumC15717 = EnumC15717.f51074;
                            this.f15622 = enumC15717;
                            break;
                        case 7:
                            enumC15717 = EnumC15717.f51053;
                            this.f15622 = enumC15717;
                            break;
                        case 8:
                            if (z) {
                                enumC15717 = EnumC15717.f51073;
                            } else if (z) {
                                i--;
                            } else {
                                enumC15717 = EnumC15717.f51053;
                            }
                            this.f15622 = enumC15717;
                            break;
                        case 9:
                            if (this.f15624 == null) {
                                enumC15717 = EnumC15717.f51060;
                            } else {
                                enumC15717 = EnumC15717.f51070;
                            }
                            this.f15622 = enumC15717;
                            break;
                        case 10:
                            enumC15717 = EnumC15717.f51063;
                            this.f15622 = enumC15717;
                            break;
                        case 11:
                        case 12:
                        case 13:
                            enumC15717 = EnumC15717.f51055;
                            this.f15622 = enumC15717;
                            break;
                        case 14:
                            enumC15717 = EnumC15717.f51058;
                            this.f15622 = enumC15717;
                            break;
                        default:
                            if (z) {
                                i--;
                            } else {
                                enumC15717 = EnumC15717.f51053;
                                this.f15622 = enumC15717;
                            }
                            break;
                    }
            }
            if (this.f15622 != enumC15718) {
                return true;
            }
            return false;
        }
        if (this.f15622 != enumC15718) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m13744() {
        if (!m13783("body")) {
            this.f24093.add(this.f24096.m15302());
        }
        this.f15622 = EnumC15717.f51053;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13742(String str) {
        String[] strArr = this.f15631;
        strArr[0] = str;
        return m13736(strArr, f15620, f15614);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m13762(String str) {
        String[] strArr = this.f15631;
        strArr[0] = str;
        return m13736(strArr, f15620, f15621);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m13769(String str) {
        String[] strArr = this.f15631;
        strArr[0] = str;
        return m13736(strArr, f15620, (String[]) null);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m13781(String str) {
        String[] strArr = this.f15631;
        strArr[0] = str;
        return m13736(strArr, f15617, (String[]) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m13736(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f24093.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            String strM37100 = ((C15496) this.f24093.get(i)).m37100();
            if (!C0669.m2903(strM37100, strArr)) {
                if (C0669.m2903(strM37100, strArr2) || (strArr3 != null && C0669.m2903(strM37100, strArr3))) {
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
    public final boolean m13759(String[] strArr) {
        return m13736(strArr, f15620, (String[]) null);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m13802(String str) {
        for (int size = this.f24093.size() - 1; size >= 0; size--) {
            String strM37100 = ((C15496) this.f24093.get(size)).m37100();
            if (strM37100.equals(str)) {
                return true;
            }
            if (!C0669.m2903(strM37100, f15618)) {
                return false;
            }
        }
        throw new C21552("Should not be reachable");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m13801(C15496 c15496) {
        this.f15624 = c15496;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15496 m13800() {
        return this.f15624;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m13766(boolean z) {
        this.f15627 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11767 m13767() {
        return this.f15623;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m13789() {
        this.f15623 = null;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m13743() {
        this.f15633 = new ArrayList();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List m13780() {
        return this.f15633;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m13786(String str) {
        while (C0669.m2903(m20060().m37100(), f15619)) {
            if (str != null && m20063(str)) {
                return;
            } else {
                m13770();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13794(boolean z) {
        String[] strArr = z ? f15616 : f15619;
        while (C0669.m2903(m20060().m37100(), strArr)) {
            m13770();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13760() {
        m13786(am.ax);
        if (!am.ax.equals(m20060().m37100())) {
            m13755(this.f15622);
        }
        m13778(am.ax);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m13771(C15496 c15496) {
        for (int i = 0; i < this.f15632.size(); i++) {
            if (c15496 == this.f15632.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m13761(C15496 c15496) {
        m13792(c15496);
        this.f15632.add(c15496);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13753(C15496 c15496, int i) {
        m13792(c15496);
        try {
            this.f15632.add(i, c15496);
        } catch (IndexOutOfBoundsException unused) {
            this.f15632.add(c15496);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13792(C15496 c15496) {
        int size = this.f15632.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            C15496 c15497 = (C15496) this.f15632.get(i3);
            if (c15497 == null) {
                return;
            }
            if (c15496.m37100().equals(c15497.m37100()) && c15496.mo37069().equals(c15497.mo37069())) {
                i2++;
            }
            if (i2 == 3) {
                this.f15632.remove(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m13799() {
        C4310 c4310;
        if (this.f24093.size() > 256) {
            return;
        }
        boolean z = true;
        C15496 c15496 = this.f15632.size() > 0 ? (C15496) j$$ExternalSyntheticOutline0.m(this.f15632, 1) : null;
        if (c15496 == null || m13735(this.f24093, c15496)) {
            return;
        }
        int size = this.f15632.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (true) {
            if (i3 == i) {
                c4310 = this;
                break;
            }
            i3--;
            c15496 = (C15496) this.f15632.get(i3);
            if (c15496 == null || m13735(this.f24093, c15496)) {
                c4310 = this;
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i3++;
                c15496 = (C15496) c4310.f15632.get(i3);
            }
            C14838.m35754(c15496);
            C15496 c15497 = new C15496(c4310.m20059(c15496.m37100(), c4310.f24095), null, c15496.mo37069().clone());
            c4310.m13764(c15497);
            c4310.f15632.set(i3, c15497);
            if (i3 == i2) {
                return;
            }
            i2 = i2;
            c4310 = c4310;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m13796() {
        while (!this.f15632.isEmpty()) {
            int size = this.f15632.size();
            if ((size > 0 ? (C15496) this.f15632.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13740(C15496 c15496) {
        int size = this.f15632.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (((C15496) this.f15632.get(size)) != c15496);
        this.f15632.remove(size);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m13797(C15496 c15496) {
        return m13735(this.f15632, c15496);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15496 m13775(String str) {
        C15496 c15496;
        int size = this.f15632.size();
        do {
            size--;
            if (size < 0 || (c15496 = (C15496) this.f15632.get(size)) == null) {
                return null;
            }
        } while (!c15496.m37100().equals(str));
        return c15496;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13754(C15496 c15496, C15496 c15497) {
        ArrayList arrayList = this.f15632;
        int iLastIndexOf = arrayList.lastIndexOf(c15496);
        C14838.m35757(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, c15497);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m13782() {
        this.f15632.add(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13756(AbstractC17734 abstractC17734) {
        C15496 c15496M13747;
        C15496 c15496M13772 = m13772("table");
        boolean z = false;
        if (c15496M13772 != null) {
            if (c15496M13772.mo37068() != null) {
                c15496M13747 = c15496M13772.mo37068();
                z = true;
            } else {
                c15496M13747 = m13747(c15496M13772);
            }
        } else {
            c15496M13747 = (C15496) this.f24093.get(0);
        }
        if (z) {
            C14838.m35754(c15496M13772);
            c15496M13772.m37099(abstractC17734);
        } else {
            c15496M13747.m37084(abstractC17734);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13793(EnumC15717 enumC15717) {
        this.f15626.add(enumC15717);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m13763() {
        if (this.f15626.size() > 0) {
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m13739() {
        return this.f15626.size();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f24102);
        String strValueOf2 = String.valueOf(this.f15622);
        return C8947.m23910(C3188.m10406("TreeBuilder{currentToken=", strValueOf, ", state=", strValueOf2, ", currentElement="), String.valueOf(m20060()), l.d);
    }

    @Override // l.AbstractC7315
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo13795(String str) {
        return str.equals("script") || str.equals("style");
    }
}
