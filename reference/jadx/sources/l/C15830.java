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

/* JADX INFO: renamed from: l.ܺۡ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: V3ZU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15830 extends AbstractC19357 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f51234;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Writer f51237;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC11242 f51239;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f51240;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f51235 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23153 f51236 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f51238 = System.getProperty("line.separator");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m37626() throws IOException {
        for (int i = 0; i < this.f51235; i++) {
            this.f51237.write(" ");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37638(int i, int i2) throws IOException {
        if (i2 < i) {
            this.f51237.write(MotionUtils.EASING_TYPE_FORMAT_START);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37628(int i, int i2) throws IOException {
        if (i2 < i) {
            this.f51237.write(MotionUtils.EASING_TYPE_FORMAT_END);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37630(Object obj) throws IOException {
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
        this.f51237.write(string);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m37635() throws IOException {
        this.f51237.write(this.f51238);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37631(AbstractC8774 abstractC8774, int i) {
        int i2 = this.f51240;
        try {
            try {
                this.f51240 = i;
                if (abstractC8774 == null) {
                    m37630("/*missing*/");
                } else {
                    abstractC8774.mo1802(this);
                }
                this.f51240 = i2;
            } catch (C20768 e) {
                IOException iOException = new IOException(e.getMessage());
                iOException.initCause(e);
                throw iOException;
            }
        } catch (Throwable th) {
            this.f51240 = i2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37634(C21825 c21825, String str) throws IOException {
        if (!c21825.m48595()) {
            return;
        }
        AbstractC8774 abstractC8774 = (AbstractC8774) c21825.f70876;
        while (true) {
            m37631(abstractC8774, 0);
            c21825 = c21825.f70877;
            if (!c21825.m48595()) {
                return;
            }
            m37630(str);
            abstractC8774 = (AbstractC8774) c21825.f70876;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m37627(C21825 c21825) throws IOException {
        m37634(c21825, ", ");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m37636(C21825 c21825) throws IOException {
        while (c21825.m48595()) {
            m37626();
            m37631((AbstractC8774) c21825.f70876, -1);
            m37635();
            c21825 = c21825.f70877;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37629(long j) throws IOException {
        if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & j) != 0) {
            m37630("/*synthetic*/ ");
        }
        long j2 = (-4611677222334361601L) & j;
        int i = C8360.f28995;
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (EnumC18943 enumC18943 : C8360.m21884(j2)) {
            sb.append(str);
            sb.append(enumC18943);
            str = " ";
        }
        m37630(sb.toString().trim());
        if (j2 != 0) {
            m37630(" ");
        }
        if ((j & 8192) != 0) {
            m37630("@");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37633(C21825 c21825) throws IOException {
        while (c21825.m48595()) {
            m37631((AbstractC8774) c21825.f70876, -1);
            m37635();
            m37626();
            c21825 = c21825.f70877;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m37641(C21825 c21825) throws IOException {
        while (c21825.m48595()) {
            m37631((AbstractC8774) c21825.f70876, 0);
            m37630(" ");
            c21825 = c21825.f70877;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37639(AbstractC8774 abstractC8774) throws IOException {
        String strM51144;
        C23153 c23153 = this.f51236;
        if (c23153 == null || (strM51144 = c23153.m51144(abstractC8774)) == null) {
            return;
        }
        m37630("/**");
        m37635();
        int i = 0;
        int iIndexOf = strM51144.indexOf(10, 0);
        if (iIndexOf < 0) {
            iIndexOf = strM51144.length();
        }
        while (i < strM51144.length()) {
            m37626();
            m37630(" *");
            if (i < strM51144.length() && strM51144.charAt(i) > ' ') {
                m37630(" ");
            }
            m37630(strM51144.substring(i, iIndexOf));
            m37635();
            i = iIndexOf + 1;
            iIndexOf = strM51144.indexOf(10, i);
            if (iIndexOf < 0) {
                iIndexOf = strM51144.length();
            }
        }
        m37626();
        m37630(" */");
        m37635();
        m37626();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m37625(C21825 c21825) throws IOException {
        if (c21825.m48595()) {
            m37630("<");
            m37634(c21825, ", ");
            m37630(">");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37640(C21825 c21825) throws IOException {
        m37630("{");
        m37635();
        this.f51235 += 4;
        m37636(c21825);
        this.f51235 -= 4;
        m37626();
        m37630(l.d);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m37637(C21825 c21825) throws IOException {
        m37630("{");
        m37635();
        this.f51235 += 4;
        boolean z = true;
        for (C21825 c21826 = c21825; c21826.m48595(); c21826 = c21826.f70877) {
            AbstractC8774 abstractC8774 = (AbstractC8774) c21826.f70876;
            if (abstractC8774.m22847(EnumC18651.f60554) && (16384 & ((C6656) abstractC8774).f22476.f70567) != 0) {
                if (!z) {
                    m37630(",");
                    m37635();
                }
                m37626();
                m37631((AbstractC8774) c21826.f70876, -1);
                z = false;
            }
        }
        m37630(l.b);
        m37635();
        while (c21825.m48595()) {
            AbstractC8774 abstractC8775 = (AbstractC8774) c21825.f70876;
            if (!abstractC8775.m22847(EnumC18651.f60554) || (((C6656) abstractC8775).f22476.f70567 & 16384) == 0) {
                m37626();
                m37631((AbstractC8774) c21825.f70876, -1);
                m37635();
            }
            c21825 = c21825.f70877;
        }
        this.f51235 -= 4;
        m37626();
        m37630(l.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ۡۡ۟] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.ۡۡ۟] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l.ܰ᩵۟] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ܺۡ۟] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37632(C10164 c10164, C8753 c8753) throws IOException {
        ?? r1;
        this.f51236 = c10164.f34729;
        m37639(c10164);
        boolean z = true;
        for (C21825 c21825 = c10164.f34727; c21825.m48595() && (c8753 == null || ((AbstractC8774) c21825.f70876).m22847(EnumC18651.f60517) || ((AbstractC8774) c21825.f70876).m22847(EnumC18651.f60503)); c21825 = c21825.f70877) {
            if (((AbstractC8774) c21825.f70876).m22847(EnumC18651.f60517)) {
                r1 = (C14023) c21825.f70876;
                AbstractC11242 abstractC11242M9472 = C3128.m9472(r1.f46089);
                if (abstractC11242M9472 != abstractC11242M9472.f38032.f21322.f77589 && c8753 != null) {
                    C7362 c7362 = new C7362(C3128.m9471(r1.f46089));
                    c7362.mo7248(c8753);
                    if (c7362.f24436) {
                    }
                }
                if (z) {
                    m37635();
                    z = false;
                }
            } else {
                r1 = (AbstractC8774) c21825.f70876;
            }
            m37631(r1, -1);
        }
        if (c8753 != null) {
            m37631(c8753, -1);
            m37635();
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3935(C10164 c10164) {
        try {
            m37632(c10164, (C8753) null);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3930(C7672 c7672) {
        try {
            m37639(c7672);
            m37633(c7672.f25386);
            if (c7672.f25385 != null) {
                m37630("package ");
                m37631(c7672.f25385, 0);
                m37630(l.b);
                m37635();
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1981(C18255 c18255) {
        try {
            m37639(c18255);
            C21783 c21783 = c18255.f58252;
            C21825 c21825 = c18255.f58254;
            m37633(c21783.f70566);
            if (c18255.mo11527() == EnumC13195.OPEN) {
                m37630("open ");
            }
            m37630("module ");
            m37631(c18255.f58253, 0);
            if (c21825 == null) {
                m37630(l.b);
            } else {
                m37630(" ");
                m37640(c21825);
            }
            m37635();
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1979(C17219 c17219) {
        try {
            m37630("exports ");
            AbstractC5930 abstractC5930 = c17219.f54878;
            C21825 c21825 = c17219.f54880;
            m37631(abstractC5930, 0);
            if (c21825 != null) {
                m37630(" to ");
                m37634(c21825, ", ");
            }
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1982(C19667 c19667) {
        try {
            m37630("opens ");
            AbstractC5930 abstractC5930 = c19667.f63121;
            C21825 c21825 = c19667.f63123;
            m37631(abstractC5930, 0);
            if (c21825 != null) {
                m37630(" to ");
                m37634(c21825, ", ");
            }
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1980(C17549 c17549) {
        try {
            m37630("provides ");
            m37631(c17549.f55774, 0);
            m37630(" with ");
            m37627(c17549.f55773);
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1978(C6260 c6260) {
        try {
            m37630("requires ");
            if (c6260.f21224) {
                m37630("static ");
            }
            if (c6260.f21221) {
                m37630("transitive ");
            }
            m37631(c6260.f21222, 0);
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1977(C3833 c3833) {
        try {
            m37630("uses ");
            m37631(c3833.f14206, 0);
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3943(C14023 c14023) {
        try {
            m37630("import ");
            if (c14023.f46087) {
                m37630("static ");
            }
            m37631(c14023.f46089, 0);
            m37630(l.b);
            m37635();
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        try {
            m37635();
            m37626();
            m37639(c8753);
            C21783 c21783 = c8753.f30089;
            C21825 c21825 = c8753.f30091;
            m37633(c21783.f70566);
            m37629(c8753.f30089.f70567 & (-513));
            AbstractC11242 abstractC11242 = this.f51239;
            this.f51239 = c8753.f30093;
            long j = c8753.f30089.f70567;
            if ((512 & j) != 0) {
                m37630("interface " + ((Object) c8753.f30093));
                m37625(c8753.f30088);
                if (c8753.f30087.m48595()) {
                    m37630(" extends ");
                    m37627(c8753.f30087);
                }
                if (c21825.m48595()) {
                    m37630(" permits ");
                    m37634(c21825, ", ");
                }
            } else {
                if ((j & 16384) != 0) {
                    m37630("enum " + ((Object) c8753.f30093));
                } else {
                    m37630("class " + ((Object) c8753.f30093));
                }
                m37625(c8753.f30088);
                if (c8753.f30092 != null) {
                    m37630(" extends ");
                    m37631(c8753.f30092, 0);
                }
                if (c8753.f30087.m48595()) {
                    m37630(" implements ");
                    m37627(c8753.f30087);
                }
                if (c21825.m48595()) {
                    m37630(" permits ");
                    m37634(c21825, ", ");
                }
            }
            m37630(" ");
            if ((c8753.f30089.f70567 & 16384) != 0) {
                m37637(c8753.f30090);
            } else {
                m37640(c8753.f30090);
            }
            this.f51239 = abstractC11242;
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        try {
            AbstractC11242 abstractC11242 = c23195.f75272;
            AbstractC8774 abstractC8774 = c23195.f75265;
            if (abstractC11242 == abstractC11242.f38032.f21322.f77632 && this.f51239 == null && this.f51234) {
                return;
            }
            m37635();
            m37626();
            m37639(c23195);
            m37631(c23195.f75267, 0);
            m37625(c23195.f75269);
            if (abstractC11242 == abstractC11242.f38032.f21322.f77632) {
                AbstractC11242 abstractC11243 = this.f51239;
                if (abstractC11243 != null) {
                    abstractC11242 = abstractC11243;
                }
                m37630(abstractC11242);
            } else {
                m37631(c23195.f75266, 0);
                m37630(" " + ((Object) abstractC11242));
            }
            m37630(MotionUtils.EASING_TYPE_FORMAT_START);
            AbstractC8774 abstractC8775 = c23195.f75262;
            if (abstractC8775 != null) {
                m37631(abstractC8775, 0);
                if (c23195.f75270.m48596() > 0) {
                    m37630(", ");
                }
            }
            m37627(c23195.f75270);
            m37630(MotionUtils.EASING_TYPE_FORMAT_END);
            if (c23195.f75264.m48595()) {
                m37630(" throws ");
                m37627(c23195.f75264);
            }
            if (abstractC8774 != null) {
                m37630(" default ");
                m37631(abstractC8774, 0);
            }
            if (c23195.f75268 == null) {
                m37630(l.b);
            } else {
                m37630(" ");
                m37631(c23195.f75268, -1);
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        C21825 c21825;
        try {
            C23153 c23153 = this.f51236;
            if (c23153 != null && c23153.m51146(c6656)) {
                m37635();
                m37626();
            }
            m37639(c6656);
            C21783 c21783 = c6656.f22476;
            Object obj = c6656.f22478;
            if ((c21783.f70567 & 16384) == 0) {
                m37631(c21783, 0);
                if ((c6656.f22476.f70567 & 17179869184L) != 0) {
                    AbstractC5930 abstractC5930 = c6656.f22477;
                    if (abstractC5930 instanceof C2401) {
                        C2401 c2401 = (C2401) abstractC5930;
                        c21825 = c2401.f9658;
                        abstractC5930 = c2401.f9659;
                    } else {
                        c21825 = null;
                    }
                    m37631(((C0990) abstractC5930).f4638, 0);
                    if (c21825 != null) {
                        m37630((Object) ' ');
                        m37641(c21825);
                    }
                    m37630("... " + obj);
                } else {
                    m37631(c6656.f22477, 0);
                    m37630(" " + obj);
                }
                if (c6656.f22481 != null) {
                    m37630(" = ");
                    m37631(c6656.f22481, 0);
                }
                if (this.f51240 == -1) {
                    m37630(l.b);
                    return;
                }
                return;
            }
            m37630("/*public static final*/ ");
            m37630(obj);
            AbstractC5930 abstractC5931 = c6656.f22481;
            if (abstractC5931 != null) {
                if (!abstractC5931.m22847(EnumC18651.f60531)) {
                    m37630(" /* = ");
                    m37631(c6656.f22481, 0);
                    m37630(" */");
                    return;
                }
                C8378 c8378 = (C8378) c6656.f22481;
                if (this.f51234) {
                    m37630(" /*enum*/ ");
                    C21825 c21826 = c8378.f29099;
                    if (c21826 != null && c21826.m48595()) {
                        m37630(MotionUtils.EASING_TYPE_FORMAT_START);
                        m37630(c8378.f29099);
                        m37630(MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    C8753 c8753 = c8378.f29098;
                    if (c8753 == null || c8753.f30090 == null) {
                        return;
                    }
                    m37630(" ");
                    m37640(c8378.f29098.f30090);
                    return;
                }
                m37630(" /* = ");
                m37630("new ");
                C8753 c8754 = c8378.f29098;
                if (c8754 != null && c8754.f30089.f70566.m48595()) {
                    m37641(c8378.f29098.f30089.f70566);
                }
                m37631(c8378.f29095, 0);
                m37630(MotionUtils.EASING_TYPE_FORMAT_START);
                m37627(c8378.f29099);
                m37630(MotionUtils.EASING_TYPE_FORMAT_END);
                m37630(" */");
                m37630(" /*enum*/ ");
                C21825 c21827 = c8378.f29099;
                if (c21827 != null && c21827.m48595()) {
                    m37630(MotionUtils.EASING_TYPE_FORMAT_START);
                    m37627(c8378.f29099);
                    m37630(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                C8753 c8755 = c8378.f29098;
                if (c8755 == null || c8755.f30090 == null) {
                    return;
                }
                m37630(" ");
                m37640(c8378.f29098.f30090);
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3962(C23900 c23900) {
        try {
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3955(C21452 c21452) {
        try {
            m37629(c21452.f69739);
            m37640(c21452.f69737);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3914(C0285 c0285) {
        try {
            m37630("do ");
            m37631(c0285.f1595, -1);
            m37626();
            m37630(" while ");
            if (c0285.f1596.m22847(EnumC18651.f60509)) {
                m37631(c0285.f1596, 0);
            } else {
                m37630(MotionUtils.EASING_TYPE_FORMAT_START);
                m37631(c0285.f1596, 0);
                m37630(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3960(C22885 c22885) {
        try {
            m37630("while ");
            if (c22885.f74426.m22847(EnumC18651.f60509)) {
                m37631(c22885.f74426, 0);
            } else {
                m37630(MotionUtils.EASING_TYPE_FORMAT_START);
                m37631(c22885.f74426, 0);
                m37630(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m37630(" ");
            m37631(c22885.f74425, -1);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3944(C14398 c14398) {
        try {
            m37630("for (");
            if (c14398.f47204.m48595()) {
                if (((AbstractC14728) c14398.f47204.f70876).m22847(EnumC18651.f60554)) {
                    m37631((AbstractC8774) c14398.f47204.f70876, 0);
                    C21825 c21825 = c14398.f47204;
                    while (true) {
                        c21825 = c21825.f70877;
                        if (!c21825.m48595()) {
                            break;
                        }
                        C6656 c6656 = (C6656) c21825.f70876;
                        m37630(", " + ((Object) c6656.f22478));
                        if (c6656.f22481 != null) {
                            m37630(" = ");
                            m37631(c6656.f22481, 0);
                        }
                    }
                } else {
                    m37627(c14398.f47204);
                }
            }
            m37630("; ");
            AbstractC5930 abstractC5930 = c14398.f47207;
            if (abstractC5930 != null) {
                m37631(abstractC5930, 0);
            }
            m37630("; ");
            m37627(c14398.f47205);
            m37630(") ");
            m37631(c14398.f47206, -1);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3950(C16514 c16514) {
        try {
            m37630("for (");
            m37631(c16514.f53042, 0);
            m37630(" : ");
            m37631(c16514.f53044, 0);
            m37630(") ");
            m37631(c16514.f53043, -1);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3920(C2732 c2732) {
        try {
            m37630(((Object) c2732.f10509) + ": ");
            m37631(c2732.f10508, -1);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3918(C2026 c2026) {
        try {
            m37630("switch ");
            if (c2026.f7570.m22847(EnumC18651.f60509)) {
                m37631(c2026.f7570, 0);
            } else {
                m37630(MotionUtils.EASING_TYPE_FORMAT_START);
                m37631(c2026.f7570, 0);
                m37630(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m37630(" {");
            m37635();
            m37636(c2026.f7568);
            m37626();
            m37630(l.d);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3952(C18630 c18630) {
        try {
            if (c18630.f60400.m48596() == 1 && ((AbstractC8047) c18630.f60400.get(0)).m22847(EnumC18651.f60565)) {
                m37630("default");
            } else {
                m37630("case ");
                m37627(c18630.f60400);
            }
            if (c18630.f60402 == C18630.f60397) {
                m37630(":");
                m37635();
                this.f51235 += 4;
                m37636(c18630.f60403);
                this.f51235 -= 4;
                m37626();
                return;
            }
            m37630(" -> ");
            if (c18630.f60403.m48596() == 1) {
                m37631((AbstractC8774) c18630.f60403.f70876, -1);
            } else {
                m37640(c18630.f60403);
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3948(C15809 c15809) {
        try {
            m37630("default");
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3934(C9789 c9789) {
        try {
            m37630("switch ");
            if (c9789.f33504.m22847(EnumC18651.f60509)) {
                m37631(c9789.f33504, 0);
            } else {
                m37630(MotionUtils.EASING_TYPE_FORMAT_START);
                m37631(c9789.f33504, 0);
                m37630(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m37630(" {");
            m37635();
            m37636(c9789.f33505);
            m37626();
            m37630(l.d);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3945(C15103 c15103) {
        try {
            m37631(c15103.f49323, 0);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3949(C16139 c16139) {
        try {
            m37630(MotionUtils.EASING_TYPE_FORMAT_START);
            m37631(c16139.f52149, 0);
            m37630(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3933(C9459 c9459) {
        try {
            m37631(c9459.f32014, 0);
            m37630(" && ");
            m37631(c9459.f32013, 0);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3921(C3437 c3437) {
        try {
            m37630("synchronized ");
            if (c3437.f12663.m22847(EnumC18651.f60509)) {
                m37631(c3437.f12663, 0);
            } else {
                m37630(MotionUtils.EASING_TYPE_FORMAT_START);
                m37631(c3437.f12663, 0);
                m37630(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m37630(" ");
            m37631(c3437.f12662, -1);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3942(C13713 c13713) {
        try {
            m37630("try ");
            if (c13713.f45222.m48595()) {
                m37630(MotionUtils.EASING_TYPE_FORMAT_START);
                boolean z = true;
                for (AbstractC8774 abstractC8774 : c13713.f45222) {
                    if (!z) {
                        m37635();
                        this.f51235 += 4;
                    }
                    m37631(abstractC8774, -1);
                    z = false;
                }
                m37630(") ");
            }
            m37631(c13713.f45220, -1);
            for (C21825 c21825 = c13713.f45221; c21825.m48595(); c21825 = c21825.f70877) {
                m37631((AbstractC8774) c21825.f70876, -1);
            }
            if (c13713.f45218 != null) {
                m37630(" finally ");
                m37631(c13713.f45218, -1);
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3954(C19336 c19336) {
        try {
            m37630(" catch (");
            m37631(c19336.f62363, 0);
            m37630(") ");
            m37631(c19336.f62362, -1);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1263(C7341 c7341) {
        try {
            m37638(this.f51240, 3);
            m37631(c7341.f24394, 4);
            m37630(" ? ");
            m37631(c7341.f24393, 0);
            m37630(" : ");
            m37631(c7341.f24392, 3);
            m37628(this.f51240, 3);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3924(C4849 c4849) {
        try {
            m37630("if ");
            if (c4849.f17076.m22847(EnumC18651.f60509)) {
                m37631(c4849.f17076, 0);
            } else {
                m37630(MotionUtils.EASING_TYPE_FORMAT_START);
                m37631(c4849.f17076, 0);
                m37630(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            m37630(" ");
            m37631(c4849.f17075, -1);
            if (c4849.f17077 != null) {
                m37630(" else ");
                m37631(c4849.f17077, -1);
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3936(C10870 c10870) {
        try {
            m37631(c10870.f36960, 0);
            if (this.f51240 == -1) {
                m37630(l.b);
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1066(C17924 c17924) {
        AbstractC11242 abstractC11242 = c17924.f56926;
        try {
            m37630("break");
            if (abstractC11242 != null) {
                m37630(" " + ((Object) abstractC11242));
            }
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1068(C21473 c21473) {
        try {
            m37630("yield");
            m37630(" ");
            m37631(c21473.f69790, 0);
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1067(C20747 c20747) {
        AbstractC11242 abstractC11242 = c20747.f67504;
        try {
            m37630("continue");
            if (abstractC11242 != null) {
                m37630(" " + ((Object) abstractC11242));
            }
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3294(C11200 c11200) {
        try {
            m37630("return");
            if (c11200.f37914 != null) {
                m37630(" ");
                m37631(c11200.f37914, 0);
            }
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3923(C4539 c4539) {
        try {
            m37630("throw ");
            m37631(c4539.f16146, 0);
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3941(C12986 c12986) {
        try {
            m37630("assert ");
            m37631(c12986.f43312, 0);
            if (c12986.f43313 != null) {
                m37630(" : ");
                m37631(c12986.f43313, 0);
            }
            m37630(l.b);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3947(C15434 c15434) {
        AbstractC5930 abstractC5930;
        try {
            if (!c15434.f50297.isEmpty()) {
                if (c15434.f50296.m22847(EnumC18651.f60473)) {
                    C23570 c23570 = (C23570) c15434.f50296;
                    m37631(c23570.f76357, 0);
                    m37630(".<");
                    m37627(c15434.f50297);
                    m37630(">" + ((Object) c23570.f76356));
                } else {
                    m37630("<");
                    m37627(c15434.f50297);
                    m37630(">");
                    abstractC5930 = c15434.f50296;
                }
                m37630(MotionUtils.EASING_TYPE_FORMAT_START);
                m37627(c15434.f50298);
                m37630(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            abstractC5930 = c15434.f50296;
            m37631(abstractC5930, 0);
            m37630(MotionUtils.EASING_TYPE_FORMAT_START);
            m37627(c15434.f50298);
            m37630(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        try {
            AbstractC5930 abstractC5930 = c8378.f29093;
            C21825 c21825 = c8378.f29096;
            if (abstractC5930 != null) {
                m37631(abstractC5930, 0);
                m37630(".");
            }
            m37630("new ");
            if (!c21825.isEmpty()) {
                m37630("<");
                m37634(c21825, ", ");
                m37630(">");
            }
            C8753 c8753 = c8378.f29098;
            if (c8753 != null && c8753.f30089.f70566.m48595()) {
                m37641(c8378.f29098.f30089.f70566);
            }
            m37631(c8378.f29095, 0);
            m37630(MotionUtils.EASING_TYPE_FORMAT_START);
            m37627(c8378.f29099);
            m37630(MotionUtils.EASING_TYPE_FORMAT_END);
            C8753 c8754 = c8378.f29098;
            if (c8754 != null) {
                AbstractC11242 abstractC11242 = this.f51239;
                AbstractC11242 abstractC11243 = c8754.f30093;
                if (abstractC11243 == null) {
                    AbstractC16579 abstractC16579 = c8378.f30190;
                    if (abstractC16579 != null) {
                        abstractC11243 = abstractC16579.f53222.f77453;
                        if (abstractC11243 == abstractC11243.f38032.f21322.f77594) {
                            abstractC11243 = null;
                        }
                    } else {
                        abstractC11243 = null;
                    }
                }
                this.f51239 = abstractC11243;
                if ((c8754.f30089.f70567 & 16384) != 0) {
                    m37630("/*enum*/");
                }
                m37640(c8378.f29098.f30090);
                this.f51239 = abstractC11242;
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3953(C18961 c18961) {
        try {
            if (c18961.f61402 != null) {
                m37630("new ");
                AbstractC5930 abstractC5930 = c18961.f61402;
                m37631(C3128.m9438((AbstractC8774) abstractC5930, false), 0);
                if (!c18961.f61400.isEmpty()) {
                    m37630((Object) ' ');
                    m37641(c18961.f61400);
                }
                if (c18961.f61399 != null) {
                    m37630("[]");
                }
                C21825 c21825 = c18961.f61401;
                int i = 0;
                for (C21825 c21826 = c18961.f61398; c21826.m48595(); c21826 = c21826.f70877) {
                    if (c21825.m48596() > i && !((C21825) c21825.get(i)).isEmpty()) {
                        m37630((Object) ' ');
                        m37641((C21825) c21825.get(i));
                    }
                    m37630("[");
                    i++;
                    m37631((AbstractC8774) c21826.f70876, 0);
                    m37630("]");
                }
                m37624(abstractC5930);
            }
            if (c18961.f61399 != null) {
                m37630("{");
                m37627(c18961.f61399);
                m37630(l.d);
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        try {
            m37630(MotionUtils.EASING_TYPE_FORMAT_START);
            if (c22489.f73411 == EnumC5555.EXPLICIT) {
                m37627(c22489.f73410);
            } else {
                String str = "";
                for (C6656 c6656 : c22489.f73410) {
                    m37630(str);
                    m37630(c6656.f22478);
                    str = ",";
                }
            }
            m37630(")->");
            m37631(c22489.f73408, 0);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1266(C21077 c21077) {
        try {
            m37630(MotionUtils.EASING_TYPE_FORMAT_START);
            m37631(c21077.f68656, 0);
            m37630(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3922(C3812 c3812) {
        try {
            m37638(this.f51240, 1);
            m37631(c3812.f14145, 2);
            m37630(" = ");
            m37631(c3812.f14146, 1);
            m37628(this.f51240, 1);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37623(EnumC18651 enumC18651) {
        switch (C10185.f34812[enumC18651.ordinal()]) {
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

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3927(C6635 c6635) {
        try {
            m37638(this.f51240, 2);
            m37631(c6635.f22412, 3);
            m37630(" " + m37623(c6635.f35956.m43134()) + "= ");
            m37631(c6635.f22413, 2);
            m37628(this.f51240, 2);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1261(C2422 c2422) {
        try {
            m37638(this.f51240, 14);
            m37630(MotionUtils.EASING_TYPE_FORMAT_START);
            m37631(c2422.f9707, 0);
            m37630(MotionUtils.EASING_TYPE_FORMAT_END);
            m37631(c2422.f9708, 14);
            m37628(this.f51240, 14);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3938(C11906 c11906) {
        try {
            m37638(this.f51240, 10);
            m37631(c11906.f39945, 10);
            m37630(" instanceof ");
            AbstractC8774 abstractC8774 = c11906.f39946;
            if (abstractC8774 instanceof AbstractC20372) {
                m37631(abstractC8774, 0);
            } else {
                if (abstractC8774 instanceof AbstractC20372) {
                    abstractC8774 = abstractC8774.m22847(EnumC18651.f60568) ? ((C15103) c11906.f39946).f49323.f22477 : null;
                }
                m37631(abstractC8774, 11);
            }
            m37628(this.f51240, 10);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3957(C22158 c22158) {
        try {
            m37631(c22158.f72477, 15);
            m37630("[");
            m37631(c22158.f72476, 0);
            m37630("]");
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        try {
            m37631(c23570.f76357, 15);
            m37630("." + ((Object) c23570.f76356));
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3929(C6966 c6966) {
        try {
            AbstractC5930 abstractC5930 = c6966.f23408;
            C21825 c21825 = c6966.f23411;
            m37631(abstractC5930, 0);
            m37630("::");
            if (c21825 != null) {
                m37630("<");
                m37634(c21825, ", ");
                m37630(">");
            }
            m37630(c6966.f23414 == EnumC13901.INVOKE ? c6966.f23413 : "new");
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        try {
            m37630(c3107.f11715);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3917(C1321 c1321) {
        try {
            int[] iArr = C10185.f34811;
            EnumC6617 enumC6617 = c1321.f5611;
            Object obj = c1321.f5612;
            switch (iArr[enumC6617.ordinal()]) {
                case 1:
                    m37630(obj.toString());
                    return;
                case 2:
                    m37630(obj + "L");
                    return;
                case 3:
                    m37630(obj + "F");
                    return;
                case 4:
                    m37630(obj.toString());
                    return;
                case 5:
                    m37630("'" + C17281.m40241(String.valueOf((char) ((Number) obj).intValue())) + "'");
                    return;
                case 6:
                    m37630(((Number) obj).intValue() == 1 ? "true" : "false");
                    return;
                case 7:
                    m37630("null");
                    return;
                default:
                    m37630("\"" + C17281.m40241(obj.toString()) + "\"");
                    return;
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3940(C12611 c12611) {
        try {
            switch (C10185.f34811[c12611.f42127.ordinal()]) {
                case 1:
                    m37630(ClassTransform.INTEGER);
                    return;
                case 2:
                    m37630(ClassTransform.LONG);
                    return;
                case 3:
                    m37630(ClassTransform.FLOAT);
                    return;
                case 4:
                    m37630(ClassTransform.DOUBLE);
                    return;
                case 5:
                    m37630(ClassTransform.CHARACTER);
                    return;
                case 6:
                    m37630(ClassTransform.BOOLEAN);
                    return;
                case 7:
                default:
                    m37630(d.O);
                    return;
                case 8:
                    m37630(ClassTransform.BYTE);
                    return;
                case 9:
                    m37630(ClassTransform.SHORT);
                    return;
                case 10:
                    m37630(ClassTransform.VOID);
                    return;
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3915(C0990 c0990) {
        try {
            m37631(C3128.m9438((AbstractC8774) c0990, false), 0);
            m37624(c0990);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m37624(AbstractC8774 abstractC8774) throws IOException {
        while (true) {
            if (abstractC8774.m22847(EnumC18651.f60535)) {
                C2401 c2401 = (C2401) abstractC8774;
                AbstractC5930 abstractC5930 = c2401.f9659;
                if (abstractC5930.m22847(EnumC18651.f60566)) {
                    m37630((Object) ' ');
                    m37641(c2401.f9658);
                }
                abstractC8774 = abstractC5930;
            }
            if (!abstractC8774.m22847(EnumC18651.f60566)) {
                return;
            }
            m37630("[]");
            abstractC8774 = ((C0990) abstractC8774).f4638;
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3937(C11596 c11596) {
        try {
            m37631(c11596.f38963, 0);
            m37630("<");
            m37627(c11596.f38962);
            m37630(">");
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3916(C1011 c1011) {
        try {
            m37634(c1011.f4699, " | ");
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3926(C5245 c5245) {
        try {
            m37634(c5245.f18177, " & ");
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3958(C22179 c22179) {
        try {
            if (c22179.f72546.m48595()) {
                m37641(c22179.f72546);
            }
            m37630(c22179.f72545);
            if (c22179.f72547.m48595()) {
                m37630(" extends ");
                m37634(c22179.f72547, " & ");
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3946(C15124 c15124) {
        try {
            m37630((Object) c15124.f49399);
            if (c15124.f49399.f28284 != EnumC15395.UNBOUND) {
                m37631(c15124.f49398, 0);
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3931(C8068 c8068) {
        try {
            m37630(String.valueOf(c8068.f28284));
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3939(C12281 c12281) {
        try {
            m37630("(ERROR)");
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3951(C17945 c17945) {
        try {
            m37630("(let " + c17945.f57401 + " in " + c17945.f57402 + MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3956(C21783 c21783) {
        try {
            m37633(c21783.f70566);
            m37629(c21783.f70567);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3925(C5224 c5224) {
        try {
            m37630("@");
            m37631(c5224.f18121, 0);
            if (c5224.f18122.isEmpty()) {
                return;
            }
            m37630(MotionUtils.EASING_TYPE_FORMAT_START);
            m37627(c5224.f18122);
            m37630(MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3919(C2401 c2401) {
        try {
            if (c2401.f9659.m22847(EnumC18651.f60473)) {
                C23570 c23570 = (C23570) c2401.f9659;
                m37631(c23570.f76357, 15);
                m37630(".");
                m37641(c2401.f9658);
                m37630(c23570.f76356);
                return;
            }
            if (c2401.f9659.m22847(EnumC18651.f60566)) {
                m37631(C3128.m9438((AbstractC8774) c2401, false), 0);
                m37624(c2401);
            } else {
                m37641(c2401.f9658);
                m37631(c2401.f9659, 0);
            }
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1264(AbstractC8774 abstractC8774) {
        try {
            m37630("(UNKNOWN: " + abstractC8774.mo1803() + MotionUtils.EASING_TYPE_FORMAT_END);
            m37635();
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1265(C13007 c13007) {
        try {
            int iM9436 = C3128.m9436(c13007.f35956);
            String strM37623 = m37623(c13007.f35956);
            m37638(this.f51240, iM9436);
            if (!c13007.f35956.m43137()) {
                m37630(strM37623);
                m37631(c13007.f43378, iM9436);
            } else {
                m37631(c13007.f43378, iM9436);
                m37630(strM37623);
            }
            m37628(this.f51240, iM9436);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1267(C22864 c22864) {
        try {
            int iM9436 = C3128.m9436(c22864.f35956);
            String strM37623 = m37623(c22864.f35956);
            m37638(this.f51240, iM9436);
            m37631(c22864.f74367, iM9436);
            m37630(" " + strM37623 + " ");
            m37631(c22864.f74368, iM9436 + 1);
            m37628(this.f51240, iM9436);
        } catch (IOException e) {
            throw new C20768(e.getMessage(), e);
        }
    }

    public C15830(Writer writer, boolean z) {
        this.f51237 = writer;
        this.f51234 = z;
    }
}
