package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.Writer;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۡܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V3ZU */
/* JADX INFO: loaded from: classes4.dex */
public final class C9526 extends AbstractC0578 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f30853;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f30854;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Writer f30855;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC19728 f30856;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30857 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24621 f30851 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f30852 = System.getProperty("line.separator");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m24940() throws IOException {
        for (int i = 0; i < this.f30857; i++) {
            this.f30855.write(" ");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24937(int i, int i2) throws IOException {
        if (i2 < i) {
            this.f30855.write(MotionUtils.EASING_TYPE_FORMAT_START);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24925(int i, int i2) throws IOException {
        if (i2 < i) {
            this.f30855.write(MotionUtils.EASING_TYPE_FORMAT_END);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24927(Object obj) throws IOException {
        String string = obj.toString();
        int length = string.length();
        int i = 0;
        while (i < length) {
            if (string.charAt(i) > 255) {
                StringBuilder sb = new StringBuilder();
                sb.append(string.substring(0, i));
                while (i < length) {
                    char cCharAt = string.charAt(i);
                    if (cCharAt > 255) {
                        sb.append("\\u");
                        sb.append(Character.forDigit((cCharAt >> '\f') % 16, 16));
                        sb.append(Character.forDigit((cCharAt >> '\b') % 16, 16));
                        sb.append(Character.forDigit((cCharAt >> 4) % 16, 16));
                        sb.append(Character.forDigit(cCharAt % 16, 16));
                    } else {
                        sb.append(cCharAt);
                    }
                    i++;
                }
                string = sb.toString();
            } else {
                i++;
            }
        }
        this.f30855.write(string);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m24935() throws IOException {
        this.f30855.write(this.f30852);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24928(AbstractC8036 abstractC8036, int i) {
        int i2 = this.f30854;
        try {
            try {
                this.f30854 = i;
                if (abstractC8036 == null) {
                    m24927("/*missing*/");
                } else {
                    abstractC8036.mo2284(this);
                }
                this.f30854 = i2;
            } catch (C1324 e) {
                IOException iOException = new IOException(e.getMessage());
                iOException.initCause(e);
                throw iOException;
            }
        } catch (Throwable th) {
            this.f30854 = i2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24930(C14769 c14769, String str) throws IOException {
        if (!c14769.m35550()) {
            return;
        }
        AbstractC8036 abstractC8036 = (AbstractC8036) c14769.f48335;
        while (true) {
            m24928(abstractC8036, 0);
            c14769 = c14769.f48336;
            if (!c14769.m35550()) {
                return;
            }
            m24927(str);
            abstractC8036 = (AbstractC8036) c14769.f48335;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m24941(C14769 c14769) throws IOException {
        m24930(c14769, ", ");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m24936(C14769 c14769) throws IOException {
        while (c14769.m35550()) {
            m24940();
            m24928((AbstractC8036) c14769.f48335, -1);
            m24935();
            c14769 = c14769.f48336;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24926(long j) throws IOException {
        if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & j) != 0) {
            m24927("/*synthetic*/ ");
        }
        long j2 = (-4611677222334361601L) & j;
        int i = C2417.f7744;
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (EnumC9128 enumC9128 : C2417.m8159(j2)) {
            sb.append(str);
            sb.append(enumC9128);
            str = " ";
        }
        m24927(sb.toString().trim());
        if (j2 != 0) {
            m24927(" ");
        }
        if ((j & 8192) != 0) {
            m24927("@");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24929(C14769 c14769) throws IOException {
        while (c14769.m35550()) {
            m24928((AbstractC8036) c14769.f48335, -1);
            m24935();
            m24940();
            c14769 = c14769.f48336;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m24934(C14769 c14769) throws IOException {
        while (c14769.m35550()) {
            m24928((AbstractC8036) c14769.f48335, 0);
            m24927(" ");
            c14769 = c14769.f48336;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24938(AbstractC8036 abstractC8036) throws IOException {
        String strM54955;
        C24621 c24621 = this.f30851;
        if (c24621 == null || (strM54955 = c24621.m54955(abstractC8036)) == null) {
            return;
        }
        m24927("/**");
        m24935();
        int i = 0;
        int iIndexOf = strM54955.indexOf(10, 0);
        if (iIndexOf < 0) {
            iIndexOf = strM54955.length();
        }
        while (i < strM54955.length()) {
            m24940();
            m24927(" *");
            if (i < strM54955.length() && strM54955.charAt(i) > ' ') {
                m24927(" ");
            }
            m24927(strM54955.substring(i, iIndexOf));
            m24935();
            i = iIndexOf + 1;
            iIndexOf = strM54955.indexOf(10, i);
            if (iIndexOf < 0) {
                iIndexOf = strM54955.length();
            }
        }
        m24940();
        m24927(" */");
        m24935();
        m24940();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m24933(C14769 c14769) throws IOException {
        if (c14769.m35550()) {
            m24927("<");
            m24930(c14769, ", ");
            m24927(">");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24939(C14769 c14769) throws IOException {
        m24927("{");
        m24935();
        this.f30857 += 4;
        m24936(c14769);
        this.f30857 -= 4;
        m24940();
        m24927(l.d);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m24932(C14769 c14769) throws IOException {
        m24927("{");
        m24935();
        this.f30857 += 4;
        boolean z = true;
        for (C14769 c147610 = c14769; c147610.m35550(); c147610 = c147610.f48336) {
            AbstractC8036 abstractC8036 = (AbstractC8036) c147610.f48335;
            if (abstractC8036.m21911(EnumC21461.f68538) && (16384 & ((C12510) abstractC8036).f40170.f15825) != 0) {
                if (!z) {
                    m24927(",");
                    m24935();
                }
                m24940();
                m24928((AbstractC8036) c147610.f48335, -1);
                z = false;
            }
        }
        m24927(l.b);
        m24935();
        while (c14769.m35550()) {
            AbstractC8036 abstractC8037 = (AbstractC8036) c14769.f48335;
            if (!abstractC8037.m21911(EnumC21461.f68538) || (((C12510) abstractC8037).f40170.f15825 & 16384) == 0) {
                m24940();
                m24928((AbstractC8036) c14769.f48335, -1);
                m24935();
            }
            c14769 = c14769.f48336;
        }
        this.f30857 -= 4;
        m24940();
        m24927(l.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.۟ܿۘ] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.۟ܿۘ] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.ۧ᩶ۘ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ۡܿۘ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24931(C19113 c19113, C7926 c7926) throws IOException {
        ?? r1;
        this.f30851 = c19113.f61862;
        m24938(c19113);
        boolean z = true;
        for (C14769 c14769 = c19113.f61857; c14769.m35550() && (c7926 == null || ((AbstractC8036) c14769.f48335).m21911(EnumC21461.f68480) || ((AbstractC8036) c14769.f48335).m21911(EnumC21461.f68500)); c14769 = c14769.f48336) {
            if (((AbstractC8036) c14769.f48335).m21911(EnumC21461.f68480)) {
                r1 = (C11852) c14769.f48335;
                AbstractC19728 abstractC19728M28319 = C11239.m28319(r1.f38181);
                if (abstractC19728M28319 != abstractC19728M28319.f63499.f73707.f49751 && c7926 != null) {
                    C10272 c10272 = new C10272(C11239.m28352(r1.f38181));
                    c10272.mo5474(c7926);
                    if (c10272.f32804) {
                    }
                }
                if (z) {
                    m24935();
                    z = false;
                }
            } else {
                r1 = (AbstractC8036) c14769.f48335;
            }
            m24928(r1, -1);
        }
        if (c7926 != null) {
            m24928(c7926, -1);
            m24935();
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2609(C19113 c19113) {
        try {
            m24931(c19113, (C7926) null);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1509(C10360 c10360) {
        try {
            m24938(c10360);
            m24929(c10360.f32979);
            if (c10360.f32980 != null) {
                m24927("package ");
                m24928(c10360.f32980, 0);
                m24927(l.b);
                m24935();
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1516(C14835 c14835) {
        try {
            m24938(c14835);
            C4395 c4395 = c14835.f48525;
            C14769 c14769 = c14835.f48523;
            m24929(c4395.f15824);
            if (c14835.mo13304() == EnumC24287.OPEN) {
                m24927("open ");
            }
            m24927("module ");
            m24928(c14835.f48522, 0);
            if (c14769 == null) {
                m24927(l.b);
            } else {
                m24927(" ");
                m24939(c14769);
            }
            m24935();
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2605(C5141 c5141) {
        try {
            m24927("exports ");
            AbstractC22295 abstractC22295 = c5141.f17908;
            C14769 c14769 = c5141.f17909;
            m24928(abstractC22295, 0);
            if (c14769 != null) {
                m24927(" to ");
                m24930(c14769, ", ");
            }
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2602(C0666 c0666) {
        try {
            m24927("opens ");
            AbstractC22295 abstractC22295 = c0666.f2536;
            C14769 c14769 = c0666.f2537;
            m24928(abstractC22295, 0);
            if (c14769 != null) {
                m24927(" to ");
                m24930(c14769, ", ");
            }
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2604(C5053 c5053) {
        try {
            m24927("provides ");
            m24928(c5053.f17632, 0);
            m24927(" with ");
            m24941(c5053.f17631);
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2612(C22207 c22207) {
        try {
            m24927("requires ");
            if (c22207.f71543) {
                m24927("static ");
            }
            if (c22207.f71542) {
                m24927("transitive ");
            }
            m24928(c22207.f71540, 0);
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2610(C20715 c20715) {
        try {
            m24927("uses ");
            m24928(c20715.f66388, 0);
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1953(C11852 c11852) {
        try {
            m24927("import ");
            if (c11852.f38180) {
                m24927("static ");
            }
            m24928(c11852.f38181, 0);
            m24927(l.b);
            m24935();
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        try {
            m24935();
            m24940();
            m24938(c7926);
            C4395 c4395 = c7926.f26341;
            C14769 c14769 = c7926.f26342;
            m24929(c4395.f15824);
            m24926(c7926.f26341.f15825 & (-513));
            AbstractC19728 abstractC19728 = this.f30856;
            this.f30856 = c7926.f26346;
            long j = c7926.f26341.f15825;
            if ((512 & j) != 0) {
                m24927("interface " + ((Object) c7926.f26346));
                m24933(c7926.f26343);
                if (c7926.f26347.m35550()) {
                    m24927(" extends ");
                    m24941(c7926.f26347);
                }
                if (c14769.m35550()) {
                    m24927(" permits ");
                    m24930(c14769, ", ");
                }
            } else {
                if ((j & 16384) != 0) {
                    m24927("enum " + ((Object) c7926.f26346));
                } else {
                    m24927("class " + ((Object) c7926.f26346));
                }
                m24933(c7926.f26343);
                if (c7926.f26348 != null) {
                    m24927(" extends ");
                    m24928(c7926.f26348, 0);
                }
                if (c7926.f26347.m35550()) {
                    m24927(" implements ");
                    m24941(c7926.f26347);
                }
                if (c14769.m35550()) {
                    m24927(" permits ");
                    m24930(c14769, ", ");
                }
            }
            m24927(" ");
            if ((c7926.f26341.f15825 & 16384) != 0) {
                m24932(c7926.f26344);
            } else {
                m24939(c7926.f26344);
            }
            this.f30856 = abstractC19728;
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        try {
            AbstractC19728 abstractC19728 = c6633.f22150;
            AbstractC8036 abstractC8036 = c6633.f22151;
            if (abstractC19728 == abstractC19728.f63499.f73707.f49865 && this.f30856 == null && this.f30853) {
                return;
            }
            m24935();
            m24940();
            m24938(c6633);
            m24928(c6633.f22144, 0);
            m24933(c6633.f22154);
            if (abstractC19728 == abstractC19728.f63499.f73707.f49865) {
                AbstractC19728 abstractC19729 = this.f30856;
                if (abstractC19729 != null) {
                    abstractC19728 = abstractC19729;
                }
                m24927(abstractC19728);
            } else {
                m24928(c6633.f22147, 0);
                m24927(" " + ((Object) abstractC19728));
            }
            m24927(MotionUtils.EASING_TYPE_FORMAT_START);
            AbstractC8036 abstractC8037 = c6633.f22149;
            if (abstractC8037 != null) {
                m24928(abstractC8037, 0);
                if (c6633.f22145.m35551() > 0) {
                    m24927(", ");
                }
            }
            m24941(c6633.f22145);
            m24927(MotionUtils.EASING_TYPE_FORMAT_END);
            if (c6633.f22146.m35550()) {
                m24927(" throws ");
                m24941(c6633.f22146);
            }
            if (abstractC8036 != null) {
                m24927(" default ");
                m24928(abstractC8036, 0);
            }
            if (c6633.f22148 == null) {
                m24927(l.b);
            } else {
                m24927(" ");
                m24928(c6633.f22148, -1);
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        C14769 c14769;
        try {
            C24621 c24621 = this.f30851;
            if (c24621 != null && c24621.m54957(c12510)) {
                m24935();
                m24940();
            }
            m24938(c12510);
            C4395 c4395 = c12510.f40170;
            Object obj = c12510.f40164;
            if ((c4395.f15825 & 16384) == 0) {
                m24928(c4395, 0);
                if ((c12510.f40170.f15825 & 17179869184L) != 0) {
                    AbstractC22295 abstractC22295 = c12510.f40166;
                    if (abstractC22295 instanceof C16875) {
                        C16875 c16875 = (C16875) abstractC22295;
                        c14769 = c16875.f55197;
                        abstractC22295 = c16875.f55198;
                    } else {
                        c14769 = null;
                    }
                    m24928(((C23589) abstractC22295).f76594, 0);
                    if (c14769 != null) {
                        m24927((Object) ' ');
                        m24934(c14769);
                    }
                    m24927("... " + obj);
                } else {
                    m24928(c12510.f40166, 0);
                    m24927(" " + obj);
                }
                if (c12510.f40171 != null) {
                    m24927(" = ");
                    m24928(c12510.f40171, 0);
                }
                if (this.f30854 == -1) {
                    m24927(l.b);
                    return;
                }
                return;
            }
            m24927("/*public static final*/ ");
            m24927(obj);
            AbstractC22295 abstractC22296 = c12510.f40171;
            if (abstractC22296 != null) {
                if (!abstractC22296.m21911(EnumC21461.f68518)) {
                    m24927(" /* = ");
                    m24928(c12510.f40171, 0);
                    m24927(" */");
                    return;
                }
                C18565 c18565 = (C18565) c12510.f40171;
                if (this.f30853) {
                    m24927(" /*enum*/ ");
                    C14769 c147610 = c18565.f60325;
                    if (c147610 != null && c147610.m35550()) {
                        m24927(MotionUtils.EASING_TYPE_FORMAT_START);
                        m24927(c18565.f60325);
                        m24927(MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    C7926 c7926 = c18565.f60319;
                    if (c7926 == null || c7926.f26344 == null) {
                        return;
                    }
                    m24927(" ");
                    m24939(c18565.f60319.f26344);
                    return;
                }
                m24927(" /* = ");
                m24927("new ");
                C7926 c7927 = c18565.f60319;
                if (c7927 != null && c7927.f26341.f15824.m35550()) {
                    m24934(c18565.f60319.f26341.f15824);
                }
                m24928(c18565.f60323, 0);
                m24927(MotionUtils.EASING_TYPE_FORMAT_START);
                m24941(c18565.f60325);
                m24927(MotionUtils.EASING_TYPE_FORMAT_END);
                m24927(" */");
                m24927(" /*enum*/ ");
                C14769 c147611 = c18565.f60325;
                if (c147611 != null && c147611.m35550()) {
                    m24927(MotionUtils.EASING_TYPE_FORMAT_START);
                    m24941(c18565.f60325);
                    m24927(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                C7926 c7928 = c18565.f60319;
                if (c7928 == null || c7928.f26344 == null) {
                    return;
                }
                m24927(" ");
                m24939(c18565.f60319.f26344);
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1967(C22953 c22953) {
        try {
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1496(C4197 c4197) {
        try {
            m24926(c4197.f15345);
            m24939(c4197.f15344);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1507(C8671 c8671) {
        try {
            m24927("do ");
            m24928(c8671.f28313, -1);
            m24940();
            m24927(" while ");
            if (c8671.f28314.m21911(EnumC21461.f68475)) {
                m24928(c8671.f28314, 0);
            } else {
                m24927(MotionUtils.EASING_TYPE_FORMAT_START);
                m24928(c8671.f28314, 0);
                m24927(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1502(C6545 c6545) {
        try {
            m24927("while ");
            if (c6545.f21979.m21911(EnumC21461.f68475)) {
                m24928(c6545.f21979, 0);
            } else {
                m24927(MotionUtils.EASING_TYPE_FORMAT_START);
                m24928(c6545.f21979, 0);
                m24927(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m24927(" ");
            m24928(c6545.f21978, -1);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1522(C20057 c20057) {
        try {
            m24927("for (");
            if (c20057.f64457.m35550()) {
                if (((AbstractC19969) c20057.f64457.f48335).m21911(EnumC21461.f68538)) {
                    m24928((AbstractC8036) c20057.f64457.f48335, 0);
                    C14769 c14769 = c20057.f64457;
                    while (true) {
                        c14769 = c14769.f48336;
                        if (!c14769.m35550()) {
                            break;
                        }
                        C12510 c12510 = (C12510) c14769.f48335;
                        m24927(", " + ((Object) c12510.f40164));
                        if (c12510.f40171 != null) {
                            m24927(" = ");
                            m24928(c12510.f40171, 0);
                        }
                    }
                } else {
                    m24941(c20057.f64457);
                }
            }
            m24927("; ");
            AbstractC22295 abstractC22295 = c20057.f64458;
            if (abstractC22295 != null) {
                m24928(abstractC22295, 0);
            }
            m24927("; ");
            m24941(c20057.f64455);
            m24927(") ");
            m24928(c20057.f64456, -1);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1504(C7180 c7180) {
        try {
            m24927("for (");
            m24928(c7180.f23710, 0);
            m24927(" : ");
            m24928(c7180.f23711, 0);
            m24927(") ");
            m24928(c7180.f23709, -1);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1520(C17073 c17073) {
        try {
            m24927(((Object) c17073.f55743) + ": ");
            m24928(c17073.f55742, -1);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1517(C15493 c15493) {
        try {
            m24927("switch ");
            if (c15493.f50422.m21911(EnumC21461.f68475)) {
                m24928(c15493.f50422, 0);
            } else {
                m24927(MotionUtils.EASING_TYPE_FORMAT_START);
                m24928(c15493.f50422, 0);
                m24927(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m24927(" {");
            m24935();
            m24936(c15493.f50421);
            m24940();
            m24927(l.d);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2611(C21351 c21351) {
        try {
            if (c21351.f68007.m35551() == 1 && ((AbstractC18367) c21351.f68007.get(0)).m21911(EnumC21461.f68552)) {
                m24927("default");
            } else {
                m24927("case ");
                m24941(c21351.f68007);
            }
            if (c21351.f68011 == C21351.f68006) {
                m24927(":");
                m24935();
                this.f30857 += 4;
                m24936(c21351.f68009);
                this.f30857 -= 4;
                m24940();
                return;
            }
            m24927(" -> ");
            if (c21351.f68009.m35551() == 1) {
                m24928((AbstractC8036) c21351.f68009.f48335, -1);
            } else {
                m24939(c21351.f68009);
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2606(C9416 c9416) {
        try {
            m24927("default");
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1514(C13256 c13256) {
        try {
            m24927("switch ");
            if (c13256.f42352.m21911(EnumC21461.f68475)) {
                m24928(c13256.f42352, 0);
            } else {
                m24927(MotionUtils.EASING_TYPE_FORMAT_START);
                m24928(c13256.f42352, 0);
                m24927(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m24927(" {");
            m24935();
            m24936(c13256.f42355);
            m24940();
            m24927(l.d);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1526(C24335 c24335) {
        try {
            m24928(c24335.f78930, 0);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1951(C9614 c9614) {
        try {
            m24927(MotionUtils.EASING_TYPE_FORMAT_START);
            m24928(c9614.f31095, 0);
            m24927(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1956(C13344 c13344) {
        try {
            m24928(c13344.f42553, 0);
            m24927(" && ");
            m24928(c13344.f42552, 0);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1948(C5799 c5799) {
        try {
            m24927("synchronized ");
            if (c5799.f19919.m21911(EnumC21461.f68475)) {
                m24928(c5799.f19919, 0);
            } else {
                m24927(MotionUtils.EASING_TYPE_FORMAT_START);
                m24928(c5799.f19919, 0);
                m24927(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m24927(" ");
            m24928(c5799.f19918, -1);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1511(C11764 c11764) {
        try {
            m24927("try ");
            if (c11764.f38023.m35550()) {
                m24927(MotionUtils.EASING_TYPE_FORMAT_START);
                boolean z = true;
                for (AbstractC8036 abstractC8036 : c11764.f38023) {
                    if (!z) {
                        m24935();
                        this.f30857 += 4;
                    }
                    m24928(abstractC8036, -1);
                    z = false;
                }
                m24927(") ");
            }
            m24928(c11764.f38022, -1);
            for (C14769 c14769 = c11764.f38025; c14769.m35550(); c14769 = c14769.f48336) {
                m24928((AbstractC8036) c14769.f48335, -1);
            }
            if (c11764.f38024 != null) {
                m24927(" finally ");
                m24928(c11764.f38024, -1);
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2601(C0468 c0468) {
        try {
            m24927(" catch (");
            m24928(c0468.f2080, 0);
            m24927(") ");
            m24928(c0468.f2079, -1);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1508(C10162 c10162) {
        try {
            m24937(this.f30854, 3);
            m24928(c10162.f32546, 4);
            m24927(" ? ");
            m24928(c10162.f32544, 0);
            m24927(" : ");
            m24928(c10162.f32545, 3);
            m24925(this.f30854, 3);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1492(C2158 c2158) {
        try {
            m24927("if ");
            if (c2158.f7114.m21911(EnumC21461.f68475)) {
                m24928(c2158.f7114, 0);
            } else {
                m24927(MotionUtils.EASING_TYPE_FORMAT_START);
                m24928(c2158.f7114, 0);
                m24927(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m24927(" ");
            m24928(c2158.f7115, -1);
            if (c2158.f7116 != null) {
                m24927(" else ");
                m24928(c2158.f7116, -1);
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1952(C11106 c11106) {
        try {
            m24928(c11106.f35018, 0);
            if (this.f30854 == -1) {
                m24927(l.b);
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1515(C14637 c14637) {
        AbstractC19728 abstractC19728 = c14637.f47895;
        try {
            m24927("break");
            if (abstractC19728 != null) {
                m24927(" " + ((Object) abstractC19728));
            }
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1497(C4307 c4307) {
        try {
            m24927("yield");
            m24927(" ");
            m24928(c4307.f15611, 0);
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1490(C1214 c1214) {
        AbstractC19728 abstractC19728 = c1214.f4446;
        try {
            m24927("continue");
            if (abstractC19728 != null) {
                m24927(" " + ((Object) abstractC19728));
            }
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1510(C11018 c11018) {
        try {
            m24927("return");
            if (c11018.f34795 != null) {
                m24927(" ");
                m24928(c11018.f34795, 0);
            }
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1491(C2070 c2070) {
        try {
            m24927("throw ");
            m24928(c2070.f6892, 0);
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1494(C3451 c3451) {
        try {
            m24927("assert ");
            m24928(c3451.f11254, 0);
            if (c3451.f11255 != null) {
                m24927(" : ");
                m24928(c3451.f11255, 0);
            }
            m24927(l.b);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1527(C24533 c24533) {
        AbstractC22295 abstractC22295;
        try {
            if (!c24533.f79552.isEmpty()) {
                if (c24533.f79554.m21911(EnumC21461.f68485)) {
                    C23041 c23041 = (C23041) c24533.f79554;
                    m24928(c23041.f74776, 0);
                    m24927(".<");
                    m24941(c24533.f79552);
                    m24927(">" + ((Object) c23041.f74774));
                } else {
                    m24927("<");
                    m24941(c24533.f79552);
                    m24927(">");
                    abstractC22295 = c24533.f79554;
                }
                m24927(MotionUtils.EASING_TYPE_FORMAT_START);
                m24941(c24533.f79555);
                m24927(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            abstractC22295 = c24533.f79554;
            m24928(abstractC22295, 0);
            m24927(MotionUtils.EASING_TYPE_FORMAT_START);
            m24941(c24533.f79555);
            m24927(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        try {
            AbstractC22295 abstractC22295 = c18565.f60321;
            C14769 c14769 = c18565.f60320;
            if (abstractC22295 != null) {
                m24928(abstractC22295, 0);
                m24927(".");
            }
            m24927("new ");
            if (!c14769.isEmpty()) {
                m24927("<");
                m24930(c14769, ", ");
                m24927(">");
            }
            C7926 c7926 = c18565.f60319;
            if (c7926 != null && c7926.f26341.f15824.m35550()) {
                m24934(c18565.f60319.f26341.f15824);
            }
            m24928(c18565.f60323, 0);
            m24927(MotionUtils.EASING_TYPE_FORMAT_START);
            m24941(c18565.f60325);
            m24927(MotionUtils.EASING_TYPE_FORMAT_END);
            C7926 c7927 = c18565.f60319;
            if (c7927 != null) {
                AbstractC19728 abstractC19728 = this.f30856;
                AbstractC19728 abstractC19729 = c7927.f26346;
                if (abstractC19729 == null) {
                    AbstractC22664 abstractC22664 = c18565.f26659;
                    if (abstractC22664 != null) {
                        abstractC19729 = abstractC22664.f73596.f38072;
                        if (abstractC19729 == abstractC19729.f63499.f73707.f49799) {
                            abstractC19729 = null;
                        }
                    } else {
                        abstractC19729 = null;
                    }
                }
                this.f30856 = abstractC19729;
                if ((c7927.f26341.f15825 & 16384) != 0) {
                    m24927("/*enum*/");
                }
                m24939(c18565.f60319.f26344);
                this.f30856 = abstractC19728;
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1524(C21549 c21549) {
        try {
            if (c21549.f68829 != null) {
                m24927("new ");
                AbstractC22295 abstractC22295 = c21549.f68829;
                m24928(C11239.m28323((AbstractC8036) abstractC22295, false), 0);
                if (!c21549.f68828.isEmpty()) {
                    m24927((Object) ' ');
                    m24934(c21549.f68828);
                }
                if (c21549.f68827 != null) {
                    m24927("[]");
                }
                C14769 c14769 = c21549.f68831;
                int i = 0;
                for (C14769 c147610 = c21549.f68830; c147610.m35550(); c147610 = c147610.f48336) {
                    if (c14769.m35551() > i && !((C14769) c14769.get(i)).isEmpty()) {
                        m24927((Object) ' ');
                        m24934((C14769) c14769.get(i));
                    }
                    m24927("[");
                    i++;
                    m24928((AbstractC8036) c147610.f48335, 0);
                    m24927("]");
                }
                m24924(abstractC22295);
            }
            if (c21549.f68827 != null) {
                m24927("{");
                m24941(c21549.f68827);
                m24927(l.d);
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        try {
            m24927(MotionUtils.EASING_TYPE_FORMAT_START);
            if (c16327.f53000 == EnumC17819.EXPLICIT) {
                m24941(c16327.f52999);
            } else {
                String str = "";
                for (C12510 c12510 : c16327.f52999) {
                    m24927(str);
                    m24927(c12510.f40164);
                    str = ",";
                }
            }
            m24927(")->");
            m24928(c16327.f53001, 0);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1945(C1412 c1412) {
        try {
            m24927(MotionUtils.EASING_TYPE_FORMAT_START);
            m24928(c1412.f4986, 0);
            m24927(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1523(C20605 c20605) {
        try {
            m24937(this.f30854, 1);
            m24928(c20605.f66030, 2);
            m24927(" = ");
            m24928(c20605.f66031, 1);
            m24925(this.f30854, 1);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24923(EnumC21461 enumC21461) {
        switch (C19223.f62174[enumC21461.ordinal()]) {
            case 1:
            case 24:
                return BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX;
            case 2:
            case 25:
                return "-";
            case 3:
                return "!";
            case 4:
                return "~";
            case 5:
            case 7:
                return "++";
            case 6:
            case 8:
                return "--";
            case 9:
                return "<*nullchk*>";
            case 10:
                return "||";
            case 11:
                return "&&";
            case 12:
                return "==";
            case 13:
                return "!=";
            case 14:
                return "<";
            case 15:
                return ">";
            case 16:
                return "<=";
            case 17:
                return ">=";
            case 18:
                return "|";
            case 19:
                return "^";
            case 20:
                return a.p;
            case 21:
                return "<<";
            case 22:
                return ">>";
            case 23:
                return ">>>";
            case 26:
                return "*";
            case 27:
                return "/";
            case 28:
                return "%";
            default:
                throw new Error();
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1512(C12400 c12400) {
        try {
            m24937(this.f30854, 2);
            m24928(c12400.f39896, 3);
            m24927(" " + m24923(c12400.f62401.m48823()) + "= ");
            m24928(c12400.f39895, 2);
            m24925(this.f30854, 2);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1963(C16985 c16985) {
        try {
            m24937(this.f30854, 14);
            m24927(MotionUtils.EASING_TYPE_FORMAT_START);
            m24928(c16985.f55514, 0);
            m24927(MotionUtils.EASING_TYPE_FORMAT_END);
            m24928(c16985.f55515, 14);
            m24925(this.f30854, 14);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1974(C25279 c25279) {
        try {
            m24937(this.f30854, 10);
            m24928(c25279.f81646, 10);
            m24927(" instanceof ");
            AbstractC8036 abstractC8036 = c25279.f81647;
            if (abstractC8036 instanceof AbstractC2903) {
                m24928(abstractC8036, 0);
            } else {
                if (abstractC8036 instanceof AbstractC2903) {
                    abstractC8036 = abstractC8036.m21911(EnumC21461.f68486) ? ((C24335) c25279.f81647).f78930.f40166 : null;
                }
                m24928(abstractC8036, 11);
            }
            m24925(this.f30854, 10);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1960(C16129 c16129) {
        try {
            m24928(c16129.f52413, 15);
            m24927("[");
            m24928(c16129.f52412, 0);
            m24927("]");
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        try {
            m24928(c23041.f74776, 15);
            m24927("." + ((Object) c23041.f74774));
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1954(C12598 c12598) {
        try {
            AbstractC22295 abstractC22295 = c12598.f40436;
            C14769 c14769 = c12598.f40437;
            m24928(abstractC22295, 0);
            m24927("::");
            if (c14769 != null) {
                m24927("<");
                m24930(c14769, ", ");
                m24927(">");
            }
            m24927(c12598.f40435 == EnumC16081.INVOKE ? c12598.f40431 : "new");
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        try {
            m24927(c5887.f20169);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1970(C23787 c23787) {
        try {
            int[] iArr = C19223.f62173;
            EnumC21172 enumC21172 = c23787.f77042;
            Object obj = c23787.f77043;
            switch (iArr[enumC21172.ordinal()]) {
                case 1:
                    m24927(obj.toString());
                    return;
                case 2:
                    m24927(obj + "L");
                    return;
                case 3:
                    m24927(obj + "F");
                    return;
                case 4:
                    m24927(obj.toString());
                    return;
                case 5:
                    m24927("'" + C21901.m49592(String.valueOf((char) ((Number) obj).intValue())) + "'");
                    return;
                case 6:
                    m24927(((Number) obj).intValue() == 1 ? "true" : "false");
                    return;
                case 7:
                    m24927("null");
                    return;
                default:
                    m24927("\"" + C21901.m49592(obj.toString()) + "\"");
                    return;
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1958(C14089 c14089) {
        try {
            switch (C19223.f62173[c14089.f44595.ordinal()]) {
                case 1:
                    m24927(ClassTransform.INTEGER);
                    return;
                case 2:
                    m24927(ClassTransform.LONG);
                    return;
                case 3:
                    m24927(ClassTransform.FLOAT);
                    return;
                case 4:
                    m24927(ClassTransform.DOUBLE);
                    return;
                case 5:
                    m24927(ClassTransform.CHARACTER);
                    return;
                case 6:
                    m24927(ClassTransform.BOOLEAN);
                    return;
                case 7:
                default:
                    m24927(d.O);
                    return;
                case 8:
                    m24927(ClassTransform.BYTE);
                    return;
                case 9:
                    m24927(ClassTransform.SHORT);
                    return;
                case 10:
                    m24927(ClassTransform.VOID);
                    return;
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1968(C23589 c23589) {
        try {
            m24928(C11239.m28323((AbstractC8036) c23589, false), 0);
            m24924(c23589);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m24924(AbstractC8036 abstractC8036) throws IOException {
        while (true) {
            if (abstractC8036.m21911(EnumC21461.f68448)) {
                C16875 c16875 = (C16875) abstractC8036;
                AbstractC22295 abstractC22295 = c16875.f55198;
                if (abstractC22295.m21911(EnumC21461.f68553)) {
                    m24927((Object) ' ');
                    m24934(c16875.f55197);
                }
                abstractC8036 = abstractC22295;
            }
            if (!abstractC8036.m21911(EnumC21461.f68553)) {
                return;
            }
            m24927("[]");
            abstractC8036 = ((C23589) abstractC8036).f76594;
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1973(C25191 c25191) {
        try {
            m24928(c25191.f81425, 0);
            m24927("<");
            m24941(c25191.f81424);
            m24927(">");
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1969(C23699 c23699) {
        try {
            m24930(c23699.f76826, " | ");
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1965(C17731 c17731) {
        try {
            m24930(c17731.f58264, " & ");
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1961(C16239 c16239) {
        try {
            if (c16239.f52783.m35550()) {
                m24934(c16239.f52783);
            }
            m24927(c16239.f52784);
            if (c16239.f52785.m35550()) {
                m24927(" extends ");
                m24930(c16239.f52785, " & ");
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1971(C24445 c24445) {
        try {
            m24927((Object) c24445.f79358);
            if (c24445.f79358.f60145 != EnumC18670.UNBOUND) {
                m24928(c24445.f79357, 0);
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2608(C18477 c18477) {
        try {
            m24927(String.valueOf(c18477.f60145));
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1957(C13891 c13891) {
        try {
            m24927("(ERROR)");
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2607(C14747 c14747) {
        try {
            m24927("(let " + c14747.f48161 + " in " + c14747.f48163 + MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo2603(C4395 c4395) {
        try {
            m24929(c4395.f15824);
            m24926(c4395.f15825);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1964(C17621 c17621) {
        try {
            m24927("@");
            m24928(c17621.f57962, 0);
            if (c17621.f57964.isEmpty()) {
                return;
            }
            m24927(MotionUtils.EASING_TYPE_FORMAT_START);
            m24941(c17621.f57964);
            m24927(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1519(C16875 c16875) {
        try {
            if (c16875.f55198.m21911(EnumC21461.f68485)) {
                C23041 c23041 = (C23041) c16875.f55198;
                m24928(c23041.f74776, 15);
                m24927(".");
                m24934(c16875.f55197);
                m24927(c23041.f74774);
                return;
            }
            if (c16875.f55198.m21911(EnumC21461.f68553)) {
                m24928(C11239.m28323((AbstractC8036) c16875, false), 0);
                m24924(c16875);
            } else {
                m24934(c16875.f55197);
                m24928(c16875.f55198, 0);
            }
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1949(AbstractC8036 abstractC8036) {
        try {
            m24927("(UNKNOWN: " + abstractC8036.mo2285() + MotionUtils.EASING_TYPE_FORMAT_END);
            m24935();
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1495(C3561 c3561) {
        try {
            int iM28322 = C11239.m28322(c3561.f62401);
            String strM24923 = m24923(c3561.f62401);
            m24937(this.f30854, iM28322);
            if (!c3561.f62401.m48824()) {
                m24927(strM24923);
                m24928(c3561.f12203, iM28322);
            } else {
                m24928(c3561.f12203, iM28322);
                m24927(strM24923);
            }
            m24925(this.f30854, iM28322);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1501(C6435 c6435) {
        try {
            int iM28322 = C11239.m28322(c6435.f62401);
            String strM24923 = m24923(c6435.f62401);
            m24937(this.f30854, iM28322);
            m24928(c6435.f21672, iM28322);
            m24927(" " + strM24923 + " ");
            m24928(c6435.f21671, iM28322 + 1);
            m24925(this.f30854, iM28322);
        } catch (IOException e) {
            throw new C1324(e.getMessage(), e);
        }
    }

    public C9526(Writer writer, boolean z) {
        this.f30855 = writer;
        this.f30853 = z;
    }
}
