package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public class C0185 extends AbstractC2422 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f1269;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f1272;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f1273;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C12510[] f1274;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25301 f1278;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC17836 f1281;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7926 f1282;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f1285;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC5163 f1283 = EnumC5163.NORMAL;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f1271 = false;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0799 f1280 = new C0799(false);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0799 f1279 = new C0799(false);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C0799 f1277 = new C0799(false);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0799 f1275 = new C0799(true);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0799 f1276 = new C0799(true);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C0799 f1270 = new C0799(true);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C0799 f1284 = new C0799(true);

    @Override // l.AbstractC2422, l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ void mo1509(C10360 c10360) {
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1516(C14835 c14835) {
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1526(C24335 c24335) {
        mo5474((AbstractC8036) c24335.f78930);
        m1535(c24335.f78930);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1525(C23041 c23041) {
        mo5474(c23041.f74776);
        if (C11239.m28360(c23041.f74776)) {
            AbstractC11781 abstractC11781 = c23041.f74775;
            if (abstractC11781.f38066 == EnumC13603.f43205) {
                m1498((InterfaceC5075) c23041, (C5816) abstractC11781);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m1532(AbstractC8036 abstractC8036) {
        if (abstractC8036 != null) {
            super.mo5474(abstractC8036);
            if (this.f1280.m3206()) {
                m1533();
            }
        }
    }

    @Override // l.AbstractC2422
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo1538() {
        boolean z = this.f1271;
        C0799 c0799 = this.f1280;
        if (!z) {
            c0799.m3195(this.f1273, this.f1269);
        } else {
            for (int i = this.f1273; i < this.f1269; i++) {
                C5816 c5816 = this.f1274[i].f40168;
                if (!m1529(c5816) || !c5816.mo7874()) {
                    c0799.m3198(i);
                }
            }
        }
        this.f1279.m3195(this.f1273, this.f1269);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo1537(C5816 c5816) {
        if (c5816.f19997 < this.f1285) {
            return false;
        }
        EnumC13603 enumC13603 = c5816.f38069.f38066;
        return enumC13603 == EnumC13603.f43218 || enumC13603 == EnumC13603.f43205 || m1529(c5816);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1529(C5816 c5816) {
        AbstractC11781 abstractC11781 = c5816.f38069;
        if (abstractC11781.f38066 != EnumC13603.f43213 || (c5816.f38071 & 8590196752L) != 16) {
            return false;
        }
        AbstractC11781 abstractC11782 = this.f1282.f26345;
        C24550 c24550 = (C24550) abstractC11781;
        abstractC11782.getClass();
        while (abstractC11782.f38066 != EnumC13603.f43219) {
            if (abstractC11782 == c24550) {
                return true;
            }
            abstractC11782 = abstractC11782.f38069;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m1531(C12510 c12510) {
        C5816 c5816 = c12510.f40168;
        C12510[] c12510Arr = (C12510[]) C18450.m42989(this.f1269, this.f1274);
        this.f1274 = c12510Arr;
        long j = c5816.f38071;
        if ((16 & j) == 0) {
            c5816.f38071 = j | 2199023255552L;
        }
        int i = this.f1269;
        c5816.f19998 = i;
        c12510Arr[i] = c12510;
        this.f1280.m3194(i);
        this.f1279.m3198(this.f1269);
        this.f1269++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1506(AbstractC8036 abstractC8036, C5816 c5816) {
        int i = c5816.f19998;
        int i2 = this.f1272;
        C25301 c25301 = this.f1278;
        if (i < i2 || !mo1537(c5816)) {
            if ((c5816.f38071 & 16) != 0) {
                C7312 c7312 = c25301.f81714;
                C11040 c11040 = C22843.f74058;
                c7312.m34520(abstractC8036, new C11040("compiler", "var.might.already.be.assigned", c5816));
                return;
            }
            return;
        }
        long j = c5816.f38071;
        long j2 = 2199023255552L & j;
        C0799 c0799 = this.f1279;
        if (j2 != 0) {
            if (!c0799.m3208(c5816.f19998)) {
                c5816.f38071 &= -2199023255553L;
            } else {
                m1530(c5816);
            }
        } else if ((16 & j) != 0) {
            if ((8589934592L & j) != 0) {
                if ((j & 549755813888L) != 0) {
                    C7312 c7313 = c25301.f81714;
                    C11040 c11041 = C22843.f74058;
                    c7313.m34520(abstractC8036, new C11040("compiler", "multicatch.parameter.may.not.be.assigned", c5816));
                } else {
                    C7312 c7314 = c25301.f81714;
                    C11040 c11042 = C22843.f74058;
                    c7314.m34520(abstractC8036, new C11040("compiler", "final.parameter.may.not.be.assigned", c5816));
                }
            } else if (!c0799.m3208(c5816.f19998)) {
                c25301.f81714.m34520(abstractC8036, c25301.f81717.m45973(this.f1283.f18009, c5816));
            } else {
                m1530(c5816);
            }
        }
        this.f1280.m3198(c5816.f19998);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m1530(C5816 c5816) {
        boolean zM3208 = this.f1280.m3208(c5816.f19998);
        C0799 c0799 = this.f1279;
        if (!zM3208) {
            c0799.m3194(c5816.f19998);
            this.f1277.m3194(c5816.f19998);
        } else {
            c0799.m3194(c5816.f19998);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m1539(AbstractC8036 abstractC8036) {
        AbstractC8036 abstractC8036M28345 = C11239.m28345(abstractC8036);
        if (abstractC8036M28345.m21911(EnumC21461.f68523) || abstractC8036M28345.m21911(EnumC21461.f68485)) {
            AbstractC11781 abstractC11781M28352 = C11239.m28352(abstractC8036M28345);
            if (abstractC11781M28352.f38066 == EnumC13603.f43205) {
                m1506(abstractC8036M28345, (C5816) abstractC11781M28352);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1498(InterfaceC5075 interfaceC5075, C5816 c5816) {
        C11040 c11040 = C22843.f74058;
        m1499(interfaceC5075, c5816, new C11040("compiler", "var.might.not.have.been.initialized", c5816));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1499(InterfaceC5075 interfaceC5075, C5816 c5816, C11040 c11040) {
        if ((c5816.f19998 >= this.f1272 || c5816.f38069.f38066 != EnumC13603.f43213) && mo1537(c5816)) {
            int i = c5816.f19998;
            C0799 c0799 = this.f1280;
            if (c0799.m3208(i) || (c5816.f38071 & 4398046511104L) != 0) {
                return;
            }
            this.f1278.f81714.m34520(interfaceC5075, c11040);
            c0799.m3198(c5816.f19998);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1488(C0799... c0799Arr) {
        for (C0799 c0799 : c0799Arr) {
            c0799.m3197();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1528(boolean z) {
        C0799 c0799 = this.f1276;
        C0799 c07910 = this.f1280;
        c0799.m3205(c07910);
        C0799 c07911 = this.f1284;
        C0799 c07912 = this.f1279;
        c07911.m3205(c07912);
        this.f1275.m3205(c07910);
        this.f1270.m3205(c07912);
        if (z) {
            m1488(c07910, c07912);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m1533() {
        C0799 c0799 = this.f1275;
        C0799 c07910 = this.f1276;
        c07910.m3196(c0799);
        this.f1280.m3205(c07910);
        C0799 c07911 = this.f1270;
        C0799 c07912 = this.f1284;
        c07912.m3196(c07911);
        this.f1279.m3205(c07912);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1536(C14769 c14769) {
        if (c14769 != null) {
            while (c14769.m35550()) {
                m1532((AbstractC8036) c14769.f48335);
                c14769 = c14769.f48336;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m1534(AbstractC8036 abstractC8036) {
        boolean zMo40451 = abstractC8036.f26659.mo40451();
        C25301 c25301 = this.f1278;
        C0799 c0799 = this.f1284;
        C0799 c07910 = this.f1276;
        C0799 c07911 = this.f1270;
        C0799 c07912 = this.f1275;
        C0799 c07913 = this.f1279;
        C0799 c07914 = this.f1280;
        if (zMo40451) {
            if (c07914.m3206()) {
                m1533();
            }
            c07912.m3205(c07914);
            c07912.m3195(this.f1272, this.f1269);
            c07911.m3205(c07913);
            c07911.m3195(this.f1272, this.f1269);
            c07910.m3205(c07914);
            c0799.m3205(c07913);
        } else if (!abstractC8036.f26659.mo40453()) {
            super.mo5474(abstractC8036);
            if (!c07914.m3206()) {
                m1528(abstractC8036.f26659 != c25301.f81712.f48248);
            }
        } else {
            if (c07914.m3206()) {
                m1533();
            }
            c07910.m3205(c07914);
            c07910.m3195(this.f1272, this.f1269);
            c0799.m3205(c07913);
            c0799.m3195(this.f1272, this.f1269);
            c07912.m3205(c07914);
            c07911.m3205(c07913);
        }
        if (abstractC8036.f26659 != c25301.f81712.f48248) {
            m1488(c07914, c07913);
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1505(C7926 c7926) {
        if (c7926.f26345 == null) {
            return;
        }
        C25301 c25301 = this.f1278;
        C15400 c15400 = c25301.f81715;
        c25301.f81715 = c25301.f81715.m36876(c7926.f26345);
        try {
            if (c7926.f26345 != null) {
                C7926 c7927 = this.f1282;
                int i = this.f1272;
                int i2 = this.f1269;
                C18499 c18499 = this.f7757;
                this.f7757 = new C18499();
                if (c7926.f26346 != c25301.f81710.f49799) {
                    this.f1272 = this.f1269;
                }
                this.f1282 = c7926;
                try {
                    for (C14769 c14769 = c7926.f26344; c14769.m35550(); c14769 = c14769.f48336) {
                        if (((AbstractC8036) c14769.f48335).m21911(EnumC21461.f68538)) {
                            C12510 c12510 = (C12510) c14769.f48335;
                            if ((8 & c12510.f40170.f15825) != 0 && mo1537(c12510.f40168)) {
                                m1531(c12510);
                            }
                        }
                    }
                    for (C14769 c147610 = c7926.f26344; c147610.m35550(); c147610 = c147610.f48336) {
                        if (!((AbstractC8036) c147610.f48335).m21911(EnumC21461.f68505) && (C11239.m28344((AbstractC8036) c147610.f48335) & 8) != 0) {
                            super.mo5474((AbstractC8036) c147610.f48335);
                            m1489(false);
                        }
                    }
                    for (C14769 c147611 = c7926.f26344; c147611.m35550(); c147611 = c147611.f48336) {
                        if (((AbstractC8036) c147611.f48335).m21911(EnumC21461.f68538)) {
                            C12510 c12511 = (C12510) c147611.f48335;
                            if ((c12511.f40170.f15825 & 8) == 0 && mo1537(c12511.f40168)) {
                                m1531(c12511);
                            }
                        }
                    }
                    for (C14769 c147612 = c7926.f26344; c147612.m35550(); c147612 = c147612.f48336) {
                        if (!((AbstractC8036) c147612.f48335).m21911(EnumC21461.f68505) && (C11239.m28344((AbstractC8036) c147612.f48335) & 8) == 0) {
                            super.mo5474((AbstractC8036) c147612.f48335);
                            m1489(false);
                        }
                    }
                    for (C14769 c147613 = c7926.f26344; c147613.m35550(); c147613 = c147613.f48336) {
                        if (((AbstractC8036) c147613.f48335).m21911(EnumC21461.f68505)) {
                            super.mo5474((AbstractC8036) c147613.f48335);
                        }
                    }
                    this.f7757 = c18499;
                    this.f1269 = i2;
                    this.f1272 = i;
                    this.f1282 = c7927;
                    c25301.f81715 = c15400;
                    return;
                } catch (Throwable th) {
                    this.f7757 = c18499;
                    this.f1269 = i2;
                    this.f1272 = i;
                    this.f1282 = c7927;
                    throw th;
                }
            }
            c25301.f81715 = c15400;
        } catch (Throwable th2) {
            c25301.f81715 = c15400;
            throw th2;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1503(C6633 c6633) throws Throwable {
        C15400 c15400;
        C25301 c25301;
        boolean z;
        C25301 c25302;
        C15400 c15401;
        boolean z2;
        C0799 c0799 = this.f1279;
        C0799 c07910 = this.f1280;
        if (c6633.f22148 != null && (c6633.f22152.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
            C25301 c25303 = this.f1278;
            C15400 c15402 = c25303.f81715;
            c25303.f81715 = c25303.f81715.m36876(c6633.f22152);
            try {
                if (c6633.f22148 == null) {
                    c25303.f81715 = c15402;
                    return;
                }
                if ((c6633.f22152.f38071 & 562949953425408L) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                    c25303.f81715 = c15402;
                    return;
                }
                C0799 c07911 = new C0799(c07910);
                C0799 c07912 = new C0799(c0799);
                int i = this.f1269;
                int i2 = this.f1272;
                int i3 = this.f1273;
                C11972.m30026(this.f7757.isEmpty());
                boolean z3 = this.f1271;
                try {
                    boolean zM28318 = C11239.m28318(c6633);
                    this.f1271 = zM28318;
                    if (!zM28318) {
                        this.f1272 = this.f1269;
                    }
                    for (C14769 c14769 = c6633.f22145; c14769.m35550(); c14769 = c14769.f48336) {
                        C12510 c12510 = (C12510) c14769.f48335;
                        super.mo5474((AbstractC8036) c12510);
                        C11972.m30025("Method parameter without PARAMETER flag", (c12510.f40168.f38071 & 8589934592L) != 0);
                        m1535(c12510);
                    }
                    super.mo5474(c6633.f22148);
                    long j = c6633.f22152.f38071;
                    boolean z4 = (j & 2251799813685248L) != 0;
                    if (this.f1271) {
                        boolean z5 = (j & 68719476736L) != 0;
                        try {
                            int i4 = this.f1272;
                            while (i4 < this.f1269) {
                                C12510 c12511 = this.f1274[i4];
                                C5816 c5816 = c12511.f40168;
                                c25302 = c25303;
                                try {
                                    c15401 = c15402;
                                    try {
                                        if (c5816.f38069 == this.f1282.f26345) {
                                            if (!z5 || z4) {
                                                z5 = z5;
                                                z2 = z3;
                                                if (!z4) {
                                                    m1498(C11239.m28340(c6633.f22148), c5816);
                                                } else if (!c5816.m29558().m54827() || (c5816.f38071 & 2305843009230471186L) == 0 || c5816.mo7874() || c5816.f38069.f38066 != EnumC13603.f43213) {
                                                    m1498(C11239.m28325(c5816, c12511, false), c5816);
                                                } else if (!c07910.m3208(c5816.f19998) && c0799.m3208(c5816.f19998) && c6633.f22153) {
                                                    c5816.f38071 |= 2251799813685248L;
                                                } else {
                                                    m1498(C11239.m28340(c6633.f22148), c5816);
                                                }
                                            } else {
                                                InterfaceC5075 interfaceC5075M28325 = C11239.m28325(c5816, c12511, false);
                                                try {
                                                    C11040 c11040 = C22843.f74058;
                                                    z2 = z3;
                                                    try {
                                                        m1499(interfaceC5075M28325, c5816, new C11040("compiler", "var.not.initialized.in.default.constructor", c5816));
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        c25301 = c25302;
                                                        c15400 = c15401;
                                                        z = z2;
                                                        try {
                                                            c07910.m3205(c07911);
                                                            c0799.m3205(c07912);
                                                            this.f1269 = i;
                                                            this.f1272 = i2;
                                                            this.f1273 = i3;
                                                            this.f1271 = z;
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    z2 = z3;
                                                    c25301 = c25302;
                                                    c15400 = c15401;
                                                    z = z2;
                                                    c07910.m3205(c07911);
                                                    c0799.m3205(c07912);
                                                    this.f1269 = i;
                                                    this.f1272 = i2;
                                                    this.f1273 = i3;
                                                    this.f1271 = z;
                                                    throw th;
                                                }
                                            }
                                            i4++;
                                            c25303 = c25302;
                                            c15402 = c15401;
                                            z5 = z5;
                                            z3 = z2;
                                        } else {
                                            z2 = z3;
                                        }
                                        i4++;
                                        c25303 = c25302;
                                        c15402 = c15401;
                                        z5 = z5;
                                        z3 = z2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    c15401 = c15402;
                                    z2 = z3;
                                    c25301 = c25302;
                                    c15400 = c15401;
                                    z = z2;
                                    c07910.m3205(c07911);
                                    c0799.m3205(c07912);
                                    this.f1269 = i;
                                    this.f1272 = i2;
                                    this.f1273 = i3;
                                    this.f1271 = z;
                                    throw th;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c25302 = c25303;
                        }
                    }
                    c25302 = c25303;
                    c15401 = c15402;
                    z2 = z3;
                    m1489(true);
                    try {
                        c07910.m3205(c07911);
                        c0799.m3205(c07912);
                        this.f1269 = i;
                        this.f1272 = i2;
                        this.f1273 = i3;
                        this.f1271 = z2;
                        c25302.f81715 = c15401;
                        return;
                    } catch (Throwable th7) {
                        th = th7;
                        c25301 = c25302;
                        c15400 = c15401;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c15400 = c15402;
                    c25301 = c25303;
                    z = z3;
                }
            } catch (Throwable th9) {
                th = th9;
                c15400 = c15402;
                c25301 = c25303;
            }
            c25301.f81715 = c15400;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m1489(boolean z) {
        boolean z2;
        C14769 c14769M43093 = this.f7757.m43093();
        this.f7757 = new C18499();
        while (c14769M43093.m35550()) {
            C9133 c9133 = (C9133) c14769M43093.f48335;
            c14769M43093 = c14769M43093.f48336;
            if (z && c9133.f29691.m21911(EnumC21461.f68460)) {
                z2 = true;
            } else {
                C7312 c7312 = this.f1278.f81714;
                AbstractC8036 abstractC8036 = c9133.f29691;
                abstractC8036.getClass();
                if (c7312.m20042(abstractC8036)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            C11972.m30023(c9133.f29691, z2);
            if (z && this.f1271) {
                C11972.m30026(c9133 instanceof C18084);
                this.f1280.m3205(((C18084) c9133).f59184);
                for (int i = this.f1272; i < this.f1269; i++) {
                    AbstractC8036 abstractC8037 = c9133.f29691;
                    abstractC8037.getClass();
                    m1498((InterfaceC5075) abstractC8037, this.f1274[i].f40168);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m1535(C12510 c12510) {
        this.f1280.m3198(c12510.f40168.f19998);
        this.f1279.m3194(c12510.f40168.f19998);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1513(C12510 c12510) {
        EnumC13603 enumC13603;
        C25301 c25301 = this.f1278;
        C15400 c15400 = c25301.f81715;
        c25301.f81715 = c25301.f81715.m36876(c12510.f40168);
        try {
            boolean zMo1537 = mo1537(c12510.f40168);
            if (zMo1537 && ((enumC13603 = c12510.f40168.f38069.f38066) == EnumC13603.f43218 || enumC13603 == EnumC13603.f43205)) {
                m1531(c12510);
            }
            AbstractC22295 abstractC22295 = c12510.f40171;
            if (abstractC22295 != null) {
                m1532(abstractC22295);
                if (zMo1537) {
                    m1506((AbstractC8036) c12510, c12510.f40168);
                }
            }
        } finally {
            c25301.f81715 = c15400;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1496(C4197 c4197) {
        int i = this.f1269;
        m52092(c4197.f15344);
        this.f1269 = i;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1507(C8671 c8671) {
        C0799 c0799;
        C0799 c07910;
        C18499 c18499 = this.f7757;
        EnumC5163 enumC5163 = this.f1283;
        this.f1283 = EnumC5163.NORMAL;
        C0799 c07911 = new C0799(true);
        C0799 c07912 = new C0799(true);
        this.f7757 = new C18499();
        C25301 c25301 = this.f1278;
        int i = c25301.f81714.f24079;
        while (true) {
            c0799 = this.f1279;
            C0799 c07913 = new C0799(c0799);
            c07913.m3204(this.f1269);
            super.mo5474(c8671.f28313);
            m8185(c8671);
            m1534(c8671.f28314);
            if (!this.f1283.m15582()) {
                c07911.m3205(this.f1276);
                c07912.m3205(this.f1284);
            }
            int i2 = c25301.f81714.f24079;
            c07910 = this.f1280;
            if (i2 != i || this.f1283.m15582()) {
                break;
            }
            C0799 c07914 = new C0799(c07913);
            C0799 c07915 = this.f1270;
            c07914.m3199(c07915);
            if (c07914.m3202(this.f1272) == -1) {
                break;
            }
            c07910.m3205(this.f1275);
            c07913.m3196(c07915);
            c0799.m3205(c07913);
            this.f1283 = EnumC5163.SPECULATIVE_LOOP;
        }
        this.f1283 = enumC5163;
        c07910.m3205(c07911);
        c0799.m3205(c07912);
        m8182(c8671, c18499);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1502(C6545 c6545) {
        C0799 c0799;
        C18499 c18499 = this.f7757;
        EnumC5163 enumC5163 = this.f1283;
        this.f1283 = EnumC5163.NORMAL;
        C0799 c07910 = new C0799(true);
        C0799 c07911 = new C0799(true);
        this.f7757 = new C18499();
        C25301 c25301 = this.f1278;
        int i = c25301.f81714.f24079;
        C0799 c07912 = this.f1279;
        C0799 c07913 = new C0799(c07912);
        c07913.m3204(this.f1269);
        while (true) {
            m1534(c6545.f21979);
            if (!this.f1283.m15582()) {
                c07910.m3205(this.f1276);
                c07911.m3205(this.f1284);
            }
            C0799 c07914 = this.f1275;
            c0799 = this.f1280;
            c0799.m3205(c07914);
            c07912.m3205(this.f1270);
            super.mo5474(c6545.f21978);
            m8185(c6545);
            if (c25301.f81714.f24079 != i || this.f1283.m15582()) {
                break;
            }
            C0799 c07915 = new C0799(c07913);
            c07915.m3199(c07912);
            if (c07915.m3202(this.f1272) == -1) {
                break;
            }
            c07913.m3196(c07912);
            c07912.m3205(c07913);
            this.f1283 = EnumC5163.SPECULATIVE_LOOP;
        }
        this.f1283 = enumC5163;
        c0799.m3205(c07910);
        c07912.m3205(c07911);
        m8182(c6545, c18499);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1522(C20057 c20057) {
        C0799 c0799;
        C0799 c07910;
        C18499 c18499 = this.f7757;
        EnumC5163 enumC5163 = this.f1283;
        this.f1283 = EnumC5163.NORMAL;
        int i = this.f1269;
        m52092(c20057.f64457);
        C0799 c07911 = new C0799(true);
        C0799 c07912 = new C0799(true);
        this.f7757 = new C18499();
        C25301 c25301 = this.f1278;
        int i2 = c25301.f81714.f24079;
        while (true) {
            c0799 = this.f1279;
            C0799 c07913 = new C0799(c0799);
            c07913.m3204(this.f1269);
            AbstractC22295 abstractC22295 = c20057.f64458;
            c07910 = this.f1280;
            if (abstractC22295 != null) {
                m1534(abstractC22295);
                if (!this.f1283.m15582()) {
                    c07911.m3205(this.f1276);
                    c07912.m3205(this.f1284);
                }
                c07910.m3205(this.f1275);
                c0799.m3205(this.f1270);
            } else if (!this.f1283.m15582()) {
                c07911.m3205(c07910);
                c07911.m3195(this.f1272, this.f1269);
                c07912.m3205(c0799);
                c07912.m3195(this.f1272, this.f1269);
            }
            super.mo5474(c20057.f64456);
            m8185(c20057);
            m52092(c20057.f64455);
            if (c25301.f81714.f24079 != i2 || this.f1283.m15582()) {
                break;
            }
            C0799 c07914 = new C0799(c07913);
            c07914.m3199(c0799);
            if (c07914.m3202(this.f1272) == -1) {
                break;
            }
            c07913.m3196(c0799);
            c0799.m3205(c07913);
            this.f1283 = EnumC5163.SPECULATIVE_LOOP;
        }
        this.f1283 = enumC5163;
        c07910.m3205(c07911);
        c0799.m3205(c07912);
        m8182(c20057, c18499);
        this.f1269 = i;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1504(C7180 c7180) {
        mo1513(c7180.f23710);
        C18499 c18499 = this.f7757;
        EnumC5163 enumC5163 = this.f1283;
        this.f1283 = EnumC5163.NORMAL;
        int i = this.f1269;
        super.mo5474(c7180.f23711);
        C0799 c0799 = this.f1280;
        C0799 c07910 = new C0799(c0799);
        C0799 c07911 = this.f1279;
        C0799 c07912 = new C0799(c07911);
        m1506((AbstractC8036) c7180, c7180.f23710.f40168);
        this.f7757 = new C18499();
        C25301 c25301 = this.f1278;
        int i2 = c25301.f81714.f24079;
        while (true) {
            C0799 c07913 = new C0799(c07911);
            c07913.m3204(this.f1269);
            super.mo5474(c7180.f23709);
            m8185(c7180);
            if (c25301.f81714.f24079 != i2 || this.f1283.m15582()) {
                break;
            }
            C0799 c07914 = new C0799(c07913);
            c07914.m3199(c07911);
            if (c07914.m3202(this.f1272) == -1) {
                break;
            }
            c07913.m3196(c07911);
            c07911.m3205(c07913);
            this.f1283 = EnumC5163.SPECULATIVE_LOOP;
        }
        this.f1283 = enumC5163;
        c0799.m3205(c07910);
        c07912.m3196(c07911);
        c07911.m3205(c07912);
        m8182(c7180, c18499);
        this.f1269 = i;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1520(C17073 c17073) {
        C18499 c18499 = this.f7757;
        this.f7757 = new C18499();
        super.mo5474(c17073.f55742);
        m8182(c17073, c18499);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1517(C15493 c15493) {
        m1487(c15493, c15493.f50422, c15493.f50421, c15493.f50423);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1514(C13256 c13256) {
        m1487(c13256, c13256.f42352, c13256.f42355, c13256.f42351);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1487(AbstractC8036 abstractC8036, AbstractC22295 abstractC22295, C14769 c14769, boolean z) {
        C18499 c18499 = this.f7757;
        this.f7757 = new C18499();
        int i = this.f1269;
        m1532(abstractC22295);
        C0799 c0799 = this.f1280;
        C0799 c07910 = new C0799(c0799);
        C0799 c07911 = this.f1279;
        C0799 c07912 = new C0799(c07911);
        while (c14769.m35550()) {
            c0799.m3205(c07910);
            c07911.m3196(c07912);
            c07911.m3205(c07911);
            C21351 c21351 = (C21351) c14769.f48335;
            Iterator it = c21351.f68007.iterator();
            while (it.hasNext()) {
                super.mo5474((AbstractC18367) it.next());
                if (c0799.m3206()) {
                    c0799.m3205(this.f1275);
                    c07911.m3205(this.f1270);
                }
            }
            if (((C21351) c14769.f48335).f68009.isEmpty() && c14769.f48336.m35550() && ((C21351) c14769.f48336.f48335).f68007.m35551() == 1 && ((AbstractC18367) ((C21351) c14769.f48336.f48335).f68007.f48335).mo9536() && C11239.m28351((AbstractC8036) ((C21351) c14769.f48336.f48335).f68007.f48335)) {
                c14769 = c14769.f48336;
                c21351 = (C21351) c14769.f48335;
            }
            m52092(c21351.f68009);
            if (c21351.f68010 && c21351.f68011 == C21351.f68005) {
                m8183(abstractC8036, this.f1278.f81713);
            }
            for (C14769 c147610 = c21351.f68009; c147610.m35550(); c147610 = c147610.f48336) {
                AbstractC8036 abstractC8037 = (AbstractC8036) c147610.f48335;
                if (abstractC8037.m21911(EnumC21461.f68538)) {
                    int i2 = ((C12510) abstractC8037).f40168.f19998;
                    c07910.m3194(i2);
                    c07912.m3198(i2);
                }
            }
            c14769 = c14769.f48336;
        }
        if (!z) {
            if (abstractC8036.m21911(EnumC21461.f68531)) {
                mo1538();
            } else {
                c0799.m3205(c07910);
                c07911.m3196(c07912);
                c07911.m3205(c07911);
            }
        }
        if (abstractC8036.m21911(EnumC21461.f68531)) {
            m8186(abstractC8036, c18499);
        } else {
            m8182(abstractC8036, c18499);
        }
        this.f1269 = i;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1511(C11764 c11764) {
        C18499 c18499 = new C18499();
        C0799 c0799 = this.f1277;
        C0799 c07910 = new C0799(c0799);
        C18499 c184910 = this.f7757;
        this.f7757 = new C18499();
        C0799 c07911 = this.f1280;
        C0799 c07912 = new C0799(c07911);
        C0799 c07913 = this.f1279;
        c0799.m3205(c07913);
        for (AbstractC8036 abstractC8036 : c11764.f38023) {
            if (abstractC8036 instanceof C12510) {
                C12510 c12510 = (C12510) abstractC8036;
                mo1513(c12510);
                this.f1281.mo7481(c12510.f40168);
                c18499.m43089(c12510);
            } else {
                if (!(abstractC8036 instanceof AbstractC22295)) {
                    throw new AssertionError(c11764);
                }
                m1532((AbstractC22295) abstractC8036);
            }
        }
        super.mo5474(c11764.f38022);
        c0799.m3196(c07913);
        C0799 c07914 = new C0799(c07911);
        C0799 c07915 = new C0799(c07913);
        int i = this.f1269;
        if (!c18499.isEmpty()) {
            C25301 c25301 = this.f1278;
            if (c25301.f81715.m36878(EnumC19876.TRY)) {
                Iterator it = c18499.iterator();
                while (it.hasNext()) {
                    C12510 c12511 = (C12510) it.next();
                    if (this.f1281.mo7485(c12511.f40168)) {
                        C7312 c7312 = c25301.f81714;
                        EnumC19876 enumC19876 = EnumC19876.TRY;
                        C5816 c5816 = c12511.f40168;
                        C25213 c25213 = C13146.f42046;
                        c7312.m34532(enumC19876, c12511, new C25213("compiler", "try.resource.not.referenced", c5816));
                        this.f1281.mo7479(c12511.f40168);
                    }
                    it = it;
                    c07910 = c07910;
                    c25301 = c25301;
                    c184910 = c184910;
                }
            }
        }
        C0799 c07916 = c07910;
        C18499 c184911 = c184910;
        C0799 c07917 = new C0799(c07912);
        C0799 c07918 = new C0799(c0799);
        for (C14769 c14769 = c11764.f38025; c14769.m35550(); c14769 = c14769.f48336) {
            C12510 c12512 = ((C0468) c14769.f48335).f2080;
            c07911.m3205(c07917);
            c07913.m3205(c07918);
            super.mo5474((AbstractC8036) c12512);
            m1535(c12512);
            super.mo5474(((C0468) c14769.f48335).f2079);
            c07914.m3196(c07911);
            c07915.m3196(c07913);
            this.f1269 = i;
        }
        if (c11764.f38024 != null) {
            c07911.m3205(c07912);
            c07913.m3205(c0799);
            C18499 c184912 = this.f7757;
            this.f7757 = c184911;
            super.mo5474(c11764.f38024);
            if (c11764.f38021) {
                c07913.m3196(c07915);
                while (c184912.m43096()) {
                    C9133 c9133 = (C9133) c184912.m43092();
                    if (c9133 instanceof C18084) {
                        C18084 c18084 = (C18084) c9133;
                        c18084.f59184.m3203(c07911);
                        c18084.f59182.m3196(c07913);
                    }
                    this.f7757.m43089(c9133);
                }
                c07911.m3203(c07914);
            }
        } else {
            c07911.m3205(c07914);
            c07913.m3205(c07915);
            C18499 c184913 = this.f7757;
            this.f7757 = c184911;
            while (c184913.m43096()) {
                this.f7757.m43089((C9133) c184913.m43092());
            }
        }
        c0799.m3196(c07916);
        c0799.m3196(c07913);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1508(C10162 c10162) {
        m1534(c10162.f32546);
        C0799 c0799 = this.f1276;
        C0799 c07910 = new C0799(c0799);
        C0799 c07911 = this.f1284;
        C0799 c07912 = new C0799(c07911);
        C0799 c07913 = this.f1280;
        C0799 c07914 = this.f1275;
        c07913.m3205(c07914);
        C0799 c07915 = this.f1279;
        C0799 c07916 = this.f1270;
        c07915.m3205(c07916);
        AbstractC22664 abstractC22664 = c10162.f32544.f26659;
        EnumC21172 enumC21172 = EnumC21172.BOOLEAN;
        if (abstractC22664.m51067(enumC21172) && c10162.f32545.f26659.m51067(enumC21172)) {
            m1534(c10162.f32544);
            C0799 c07917 = new C0799(c07914);
            C0799 c07918 = new C0799(c0799);
            C0799 c07919 = new C0799(c07916);
            C0799 c07920 = new C0799(c07911);
            c07913.m3205(c07910);
            c07915.m3205(c07912);
            m1534(c10162.f32545);
            c07914.m3196(c07917);
            c0799.m3196(c07918);
            c07916.m3196(c07919);
            c07911.m3196(c07920);
            return;
        }
        m1532(c10162.f32544);
        C0799 c07921 = new C0799(c07913);
        C0799 c07922 = new C0799(c07915);
        c07913.m3205(c07910);
        c07915.m3205(c07912);
        m1532(c10162.f32545);
        c07913.m3196(c07921);
        c07915.m3196(c07922);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1492(C2158 c2158) {
        m1534(c2158.f7114);
        C0799 c0799 = new C0799(this.f1276);
        C0799 c07910 = new C0799(this.f1284);
        C0799 c07911 = this.f1275;
        C0799 c07912 = this.f1280;
        c07912.m3205(c07911);
        C0799 c07913 = this.f1270;
        C0799 c07914 = this.f1279;
        c07914.m3205(c07913);
        super.mo5474(c2158.f7115);
        if (c2158.f7116 != null) {
            C0799 c07915 = new C0799(c07912);
            C0799 c07916 = new C0799(c07914);
            c07912.m3205(c0799);
            c07914.m3205(c07910);
            super.mo5474(c2158.f7116);
            c07912.m3196(c07915);
            c07914.m3196(c07916);
            return;
        }
        c07912.m3196(c0799);
        c07914.m3196(c07910);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1515(C14637 c14637) {
        m8184(new C18084(c14637, this.f1280, this.f1279));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1497(C4307 c4307) {
        C13256 c13256 = (C13256) c4307.f15610;
        if (c13256 != null && c13256.f26659.m51067(EnumC21172.BOOLEAN)) {
            m1534(c4307.f15611);
            C21068 c21068 = new C21068(this, c4307, new C0799(this.f1275), new C0799(this.f1276), new C0799(this.f1270), new C0799(this.f1284));
            m1533();
            m8184(c21068);
            return;
        }
        m1532(c4307.f15611);
        m8184(new C18084(c4307, this.f1280, this.f1279));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1490(C1214 c1214) {
        m8184(new C18084(c1214, this.f1280, this.f1279));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1510(C11018 c11018) {
        m1532(c11018.f34795);
        m8184(new C18084(c11018, this.f1280, this.f1279));
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1491(C2070 c2070) {
        m1532(c2070.f6892);
        mo1538();
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1527(C24533 c24533) {
        m1532(c24533.f79554);
        m1536(c24533.f79555);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1521(C18565 c18565) {
        m1532(c18565.f60321);
        m1536(c18565.f60325);
        super.mo5474(c18565.f60319);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo1518(C16327 c16327) {
        C0799 c0799 = this.f1279;
        C0799 c07910 = new C0799(c0799);
        C0799 c07911 = this.f1280;
        C0799 c07912 = new C0799(c07911);
        int i = this.f1273;
        int i2 = this.f1269;
        C18499 c18499 = this.f7757;
        try {
            this.f1273 = i2;
            this.f7757 = new C18499();
            for (C14769 c14769 = c16327.f52999; c14769.m35550(); c14769 = c14769.f48336) {
                C12510 c12510 = (C12510) c14769.f48335;
                super.mo5474((AbstractC8036) c12510);
                c07911.m3198(c12510.f40168.f19998);
                c0799.m3194(c12510.f40168.f19998);
            }
            if (c16327.m38748() != EnumC25033.EXPRESSION) {
                super.mo5474(c16327.f53001);
            } else {
                m1532(c16327.f53001);
            }
        } finally {
            this.f1273 = i;
            c0799.m3205(c07910);
            c07911.m3205(c07912);
            this.f7757 = c18499;
            this.f1269 = i2;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1524(C21549 c21549) {
        m1536(c21549.f68830);
        m1536(c21549.f68827);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1494(C3451 c3451) {
        C0799 c0799 = this.f1280;
        C0799 c07910 = new C0799(c0799);
        C0799 c07911 = this.f1279;
        C0799 c07912 = new C0799(c07911);
        m1534(c3451.f11254);
        c07912.m3196(this.f1270);
        if (c3451.f11255 != null) {
            c0799.m3205(this.f1276);
            c07911.m3205(this.f1284);
            m1532(c3451.f11255);
        }
        c0799.m3205(c07910);
        c07911.m3205(c07912);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1523(C20605 c20605) {
        if (!C11239.m28359(c20605.f66030)) {
            m1532(c20605.f66030);
        }
        m1532(c20605.f66031);
        m1539(c20605.f66030);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1512(C12400 c12400) {
        m1532(c12400.f39896);
        m1532(c12400.f39895);
        m1539(c12400.f39896);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1495(C3561 c3561) {
        int i = C20322.f65205[c3561.mo2285().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                m1532(c3561.f12203);
                m1539(c3561.f12203);
                return;
            } else {
                m1532(c3561.f12203);
                return;
            }
        }
        m1534(c3561.f12203);
        C0799 c0799 = this.f1276;
        C0799 c07910 = new C0799(c0799);
        C0799 c07911 = this.f1275;
        c0799.m3205(c07911);
        c07911.m3205(c07910);
        C0799 c07912 = this.f1284;
        c07910.m3205(c07912);
        C0799 c07913 = this.f1270;
        c07912.m3205(c07913);
        c07913.m3205(c07910);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1501(C6435 c6435) {
        int i = C20322.f65205[c6435.mo2285().ordinal()];
        C0799 c0799 = this.f1279;
        C0799 c07910 = this.f1280;
        C0799 c07911 = this.f1284;
        C0799 c07912 = this.f1276;
        C0799 c07913 = this.f1270;
        C0799 c07914 = this.f1275;
        if (i == 6) {
            m1534(c6435.f21672);
            C0799 c07915 = new C0799(c07912);
            C0799 c07916 = new C0799(c07911);
            c07910.m3205(c07914);
            c0799.m3205(c07913);
            m1534(c6435.f21671);
            c07912.m3196(c07915);
            c07911.m3196(c07916);
            return;
        }
        if (i == 7) {
            m1534(c6435.f21672);
            C0799 c07917 = new C0799(c07914);
            C0799 c07918 = new C0799(c07913);
            c07910.m3205(c07912);
            c0799.m3205(c07911);
            m1534(c6435.f21671);
            c07914.m3196(c07917);
            c07913.m3196(c07918);
            return;
        }
        m1532(c6435.f21672);
        m1532(c6435.f21671);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1500(C5887 c5887) {
        AbstractC11781 abstractC11781 = c5887.f20170;
        if (abstractC11781.f38066 == EnumC13603.f43205) {
            m1498((InterfaceC5075) c5887, (C5816) abstractC11781);
            this.f1281.mo7479(c5887.f20170);
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1519(C16875 c16875) {
        c16875.f55198.mo2284(this);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[LOOP:1: B:32:0x00c0->B:34:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca A[EDGE_INSN: B:44:0x00ca->B:35:0x00ca BREAK  A[LOOP:1: B:32:0x00c0->B:34:0x00c5], SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1493(C3168 c3168, AbstractC8036 abstractC8036, C15714 c15714) {
        char c;
        char c2;
        int i;
        C12510[] c12510Arr;
        C0799 c0799 = this.f1284;
        C0799 c07910 = this.f1270;
        C0799 c07911 = this.f1276;
        C0799 c07912 = this.f1275;
        C0799 c07913 = this.f1277;
        C0799 c07914 = this.f1279;
        C0799 c07915 = this.f1280;
        C25301 c25301 = this.f1278;
        try {
            abstractC8036.getClass();
            this.f1285 = C11239.m28342(abstractC8036);
            if (this.f1274 == null) {
                this.f1274 = new C12510[32];
                c = 3;
                c2 = 2;
            } else {
                int i2 = 0;
                c = 3;
                while (true) {
                    try {
                        C12510[] c12510Arr2 = this.f1274;
                        c2 = 2;
                        try {
                            if (i2 >= c12510Arr2.length) {
                                break;
                            }
                            c12510Arr2[i2] = null;
                            i2++;
                        } catch (Throwable th) {
                            th = th;
                            this.f1285 = -1;
                            C0799[] c0799Arr = new C0799[7];
                            c0799Arr[0] = c07915;
                            c0799Arr[1] = c07914;
                            c0799Arr[c2] = c07913;
                            c0799Arr[c] = c07912;
                            c0799Arr[4] = c07911;
                            c0799Arr[5] = c07910;
                            c0799Arr[6] = c0799;
                            m1488(c0799Arr);
                            if (this.f1274 != null) {
                                i = 0;
                                while (true) {
                                    c12510Arr = this.f1274;
                                    if (i < c12510Arr.length) {
                                        break;
                                    }
                                    c12510Arr[i] = null;
                                    i++;
                                }
                            }
                            this.f1272 = 0;
                            this.f1269 = 0;
                            c25301.f81713 = null;
                            this.f7757 = null;
                            this.f1282 = null;
                            this.f1281 = null;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c2 = 2;
                        this.f1285 = -1;
                        C0799[] c0799Arr2 = new C0799[7];
                        c0799Arr2[0] = c07915;
                        c0799Arr2[1] = c07914;
                        c0799Arr2[c2] = c07913;
                        c0799Arr2[c] = c07912;
                        c0799Arr2[4] = c07911;
                        c0799Arr2[5] = c07910;
                        c0799Arr2[6] = c0799;
                        m1488(c0799Arr2);
                        if (this.f1274 != null) {
                            i = 0;
                            while (true) {
                                c12510Arr = this.f1274;
                                if (i < c12510Arr.length) {
                                    break;
                                    break;
                                } else {
                                    c12510Arr[i] = null;
                                    i++;
                                }
                            }
                        }
                        this.f1272 = 0;
                        this.f1269 = 0;
                        c25301.f81713 = null;
                        this.f7757 = null;
                        this.f1282 = null;
                        this.f1281 = null;
                        throw th;
                    }
                }
            }
            this.f1272 = 0;
            this.f1269 = 0;
            c25301.f81713 = c15714;
            this.f7757 = new C18499();
            this.f1282 = null;
            this.f1281 = AbstractC17836.m41689(c3168.f10279.f26345);
            super.mo5474(abstractC8036);
            this.f1285 = -1;
            C0799[] c0799Arr3 = new C0799[7];
            c0799Arr3[0] = c07915;
            c0799Arr3[1] = c07914;
            c0799Arr3[c2] = c07913;
            c0799Arr3[c] = c07912;
            c0799Arr3[4] = c07911;
            c0799Arr3[5] = c07910;
            c0799Arr3[6] = c0799;
            m1488(c0799Arr3);
            if (this.f1274 != null) {
                int i3 = 0;
                while (true) {
                    C12510[] c12510Arr3 = this.f1274;
                    if (i3 >= c12510Arr3.length) {
                        break;
                    }
                    c12510Arr3[i3] = null;
                    i3++;
                }
            }
            this.f1272 = 0;
            this.f1269 = 0;
            c25301.f81713 = null;
            this.f7757 = null;
            this.f1282 = null;
            this.f1281 = null;
        } catch (Throwable th3) {
            th = th3;
            c = 3;
        }
    }

    public C0185(C25301 c25301) {
        this.f1278 = c25301;
    }
}
