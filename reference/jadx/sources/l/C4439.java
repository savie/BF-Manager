package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4439 extends C3036 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C14769 f15893;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14769 f15894;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18609 f15895;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HashMap f15897;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f15899 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6677 f15896 = new C6677();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Map f15898 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7926 m14103(C4439 c4439, C7926 c7926) {
        c4439.getClass();
        c4439.f15894 = C14769.m35543();
        c4439.f15893 = C14769.m35543();
        c4439.f15897 = new HashMap();
        return (C7926) c4439.mo8479(c7926);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1527(C24533 c24533) {
        C18609 c18609 = this.f15895;
        C14769 c14769 = this.f15893;
        try {
            AbstractC19728 abstractC19728M28319 = C11239.m28319(c24533.f79554);
            if (abstractC19728M28319 == c18609.f60496.f49836 || abstractC19728M28319 == c18609.f60496.f49851) {
                this.f15893 = this.f15893.m35552(m14120());
            }
            super.mo1527(c24533);
        } finally {
            this.f15893 = c14769;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C24550 m14120() {
        for (C11896 c11896 : this.f15894) {
            if (c11896.f38321.m21911(EnumC21461.f68501)) {
                return ((C7926) c11896.f38321).f26345;
            }
        }
        return null;
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1496(C4197 c4197) {
        C14769 c14769 = this.f15894;
        try {
            if (c14769.m35550() && ((C11896) this.f15894.f48335).f38321.m21911(EnumC21461.f68501)) {
                this.f15894 = this.f15894.m35552(new C11896(c4197));
            }
            super.mo1496(c4197);
        } finally {
            this.f15894 = c14769;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) throws Throwable {
        C14769 c14769 = this.f15894;
        int i = this.f15899;
        C6677 c6677 = this.f15896;
        Map map = this.f15898;
        C18609 c18609 = this.f15895;
        C23393 c23393M34514 = c18609.f60508.m34514();
        try {
            c18609.f60508.m34530(c7926.f26345.f79584);
            this.f15899 = 0;
            this.f15896 = new C6677();
            HashMap map2 = new HashMap();
            try {
                C24550 c24550 = c7926.f26345;
                if (c24550.f38069.f38066 == EnumC13603.f43218) {
                    this.f15897.put(c24550, c7926);
                }
                if (m14118() != null) {
                    c7926.f26345.f38069 = m14107(false);
                    if (c7926.f26345.m29586()) {
                        AbstractC22970 abstractC22970 = c7926.f26345.f38067.mo23449().f73596;
                        for (AbstractC24577 abstractC24577M14124 = m14124(); abstractC24577M14124 != null && !abstractC24577M14124.f79656.mo7874(); abstractC24577M14124 = abstractC24577M14124.f79660) {
                            if (abstractC24577M14124.f79657.m21911(EnumC21461.f68453)) {
                                if (m14104(abstractC24577M14124.f79659, abstractC22970) == null) {
                                    break;
                                } else {
                                    ((C20847) abstractC24577M14124).m47674(abstractC22970, EnumC14879.CAPTURED_THIS);
                                }
                            }
                        }
                    }
                }
                this.f15894 = this.f15894.m35552(new C11896(c7926));
                super.mo1505(c7926);
                c18609.f60508.m34530(c23393M34514.m52573());
                this.f15894 = c14769;
                this.f15899 = i;
                this.f15896 = c6677;
                this.f15898 = map2;
            } catch (Throwable th) {
                th = th;
                map = map2;
                c18609.f60508.m34530(c23393M34514.m52573());
                this.f15894 = c14769;
                this.f15899 = i;
                this.f15896 = c6677;
                this.f15898 = map;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        if (m14124() != null && m14113(c5887.f20170)) {
            AbstractC11781 abstractC11781 = c5887.f20170;
            if (abstractC11781.f38066 == EnumC13603.f43205 && abstractC11781.f38069.f38066 == EnumC13603.f43218 && c5887.f26659.mo39105() == null) {
                for (AbstractC24577 abstractC24577M14124 = m14124(); abstractC24577M14124 != null; abstractC24577M14124 = abstractC24577M14124.f79660) {
                    if (abstractC24577M14124.f79657.mo2285() == EnumC21461.f68453) {
                        if (m14104(abstractC24577M14124.f79659, c5887.f20170) == null) {
                            break;
                        } else {
                            ((C20847) abstractC24577M14124).m47674(c5887.f20170, EnumC14879.CAPTURED_VAR);
                        }
                    }
                }
            } else if (c5887.f20170.f38069.f38066 == EnumC13603.f43213) {
                for (AbstractC24577 abstractC24577M14125 = m14124(); abstractC24577M14125 != null && !abstractC24577M14125.f79656.mo7874(); abstractC24577M14125 = abstractC24577M14125.f79660) {
                    if (abstractC24577M14125.f79657.m21911(EnumC21461.f68453)) {
                        AbstractC8036 abstractC8036M14104 = m14104(abstractC24577M14125.f79659, c5887.f20170);
                        if (abstractC8036M14104 == null) {
                            break;
                        }
                        if (C23085.f74870[abstractC8036M14104.mo2285().ordinal()] == 4) {
                            ((C20847) abstractC24577M14125).m47674(((C7926) abstractC8036M14104).f26345, EnumC14879.CAPTURED_THIS);
                        } else {
                            C11972.m30024("bad block kind");
                            throw null;
                        }
                    }
                }
            }
        }
        super.mo1500(c5887);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        m14109(c16327, "lambda.stat");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C20847 m14109(C16327 c16327, String str) {
        C18609 c18609 = this.f15895;
        C14769 c14769 = this.f15894;
        try {
            C20847 c20847 = new C20847(this, c16327);
            this.f15894 = this.f15894.m35552(new C11896(c16327));
            for (C12510 c12510 : c16327.f52999) {
                c20847.m47674(c12510.f40168, EnumC14879.PARAM);
                C11896 c11896 = (C11896) this.f15894.f48335;
                C5816 c5816 = c12510.f40168;
                if (c11896.f38320 == null) {
                    c11896.f38320 = C14769.m35543();
                }
                c11896.f38320 = c11896.f38320.m35552(c5816);
            }
            c18609.f60505.put(c16327, c20847);
            super.mo1518(c16327);
            c20847.m47676();
            if (c18609.f60501) {
                c18609.f60508.m34524(c16327, c18609.f60495.m45979(str, Boolean.valueOf(c20847.m54895()), c20847.f66749));
            }
            return c20847;
        } finally {
            this.f15894 = c14769;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        C14769 c14769 = this.f15894;
        try {
            this.f15894 = c14769.m35552(new C11896(c6633));
            super.mo1503(c6633);
        } finally {
            this.f15894 = c14769;
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        boolean z;
        AbstractC22970 abstractC22970 = c18565.f26659.f73596;
        Iterator it = this.f15894.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C11896 c11896 = (C11896) it.next();
            if (c11896.f38321.m21911(EnumC21461.f68501) && ((C7926) c11896.f38321).f26345 == abstractC22970) {
                z = true;
                break;
            }
        }
        boolean zM29602 = abstractC22970.m29602();
        if ((z && zM29602) || m14114(m14124(), c18565)) {
            AbstractC22970 abstractC22971 = c18565.f26659.mo23449().f73596;
            for (AbstractC24577 abstractC24577M14124 = m14124(); abstractC24577M14124 != null && !abstractC24577M14124.f79656.mo7874(); abstractC24577M14124 = abstractC24577M14124.f79660) {
                if (abstractC24577M14124.f79657.m21911(EnumC21461.f68453)) {
                    if (abstractC22971 != null && m14104(abstractC24577M14124.f79659, abstractC22971) == null) {
                        break;
                    } else {
                        ((C20847) abstractC24577M14124).m47674(abstractC22971, EnumC14879.CAPTURED_THIS);
                    }
                }
            }
        }
        super.mo1521(c18565);
        if (m14124() == null || z || !zM29602) {
            return;
        }
        m14125(abstractC22970, (C20847) m14124());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14125(AbstractC11781 abstractC11781, C20847 c20847) {
        C7926 c7926 = (C7926) this.f15897.get(abstractC11781);
        if (c7926 == null || !c20847.f66744.add(abstractC11781)) {
            return;
        }
        C25235 c25235 = this.f15895.f60506;
        C17359.requireNonNull(c25235);
        new C2202(this, c25235, c20847).mo1505(c7926);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1954(C12598 c12598) {
        boolean z;
        C12642 c12642 = new C12642(this, c12598);
        C18609 c18609 = this.f15895;
        c18609.f60505.put(c12598, c12642);
        C14769 c14769Mo50621 = c12598.m37319(c18609.f60504).mo50621();
        if ((c14769Mo50621.m35550() ? C12642.m31427((AbstractC22664) c14769Mo50621.f48335) : false) || c12642.f40557) {
            z = true;
        } else {
            if (c12598.f40440 != null) {
                z = true;
            } else {
                if (c12598.f40439.f38069 == c18609.f60515.f48271) {
                    z = true;
                } else {
                    boolean z2 = c18609.f60510;
                    AbstractC11781 abstractC11781 = c12642.f79656;
                    if (!z2) {
                        if (((c12598.f40439.mo29591() & 2) == 0 || c18609.f60504.m55149(c18609.f60504.m55132(c12598.f40439.m29558().f38067), c18609.f60504.m55132(abstractC11781.m29558().f38067))) ? false : true) {
                            z = true;
                        } else if (C18609.m43286(c18609, c12598.f40439, abstractC11781)) {
                            z = true;
                        } else {
                            z = true;
                        }
                    } else if (C18609.m43286(c18609, c12598.f40439, abstractC11781) || !c12598.f40433 || (c12598.f40435 == EnumC16081.NEW && c12598.f40430 != EnumC20803.f66611 && (c12598.f40439.f38069.m29602() || c12598.f40439.f38069.m29589()))) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (z) {
            C21593 c21593 = new C21593(c18609, c12598, c12642, m14107(false));
            C16327 c16327M49126 = c21593.m49126();
            AbstractC22295 abstractC22295 = (AbstractC22295) mo8479(c21593.m49127());
            C20847 c20847M14109 = m14109(c16327M49126, "mref.stat.1");
            if (abstractC22295 != null) {
                c20847M14109.f66743 = abstractC22295;
                return;
            }
            return;
        }
        super.mo1954(c12598);
        if (c18609.f60501) {
            C7312 c7312 = c18609.f60508;
            boolean zM54895 = c12642.m54895();
            C5821 c5821 = C15383.f50165;
            c7312.m34524(c12598, new C5821("compiler", "mref.stat", Boolean.valueOf(zM54895), null));
        }
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        if (m14124() != null) {
            AbstractC11781 abstractC11781 = c23041.f74775;
            if (abstractC11781.f38066 == EnumC13603.f43205) {
                AbstractC19728 abstractC19728 = abstractC11781.f38072;
                C18609 c18609 = this.f15895;
                if (abstractC19728 == c18609.f60496.f49836 || c23041.f74775.f38072 == c18609.f60496.f49851) {
                    for (AbstractC24577 abstractC24577M14124 = m14124(); abstractC24577M14124 != null && !abstractC24577M14124.f79656.mo7874(); abstractC24577M14124 = abstractC24577M14124.f79660) {
                        if (abstractC24577M14124.f79657.m21911(EnumC21461.f68453)) {
                            C7926 c7926 = (C7926) m14104(abstractC24577M14124.f79659, c23041.f74775);
                            if (c7926 == null) {
                                break;
                            } else {
                                ((C20847) abstractC24577M14124).m47674(c7926.f26345, EnumC14879.CAPTURED_THIS);
                            }
                        }
                    }
                }
            }
        }
        super.mo1525(c23041);
    }

    @Override // l.C3036, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        AbstractC24577 abstractC24577M14124 = m14124();
        if (abstractC24577M14124 != null && (abstractC24577M14124 instanceof C20847)) {
            C20847 c20847 = (C20847) abstractC24577M14124;
            for (C11896 c11896 : this.f15894) {
                if (!c11896.f38321.m21911(EnumC21461.f68538)) {
                    if (!c11896.f38321.m21911(EnumC21461.f68453)) {
                        break;
                    } else {
                        c20847.m47674(c12510.f40168, EnumC14879.LOCAL_VAR);
                    }
                }
            }
            c12510.f40168.getClass();
        }
        C14769 c14769 = this.f15894;
        try {
            C5816 c5816 = c12510.f40168;
            if (c5816.f38069.f38066 == EnumC13603.f43218) {
                C11896 c11897 = (C11896) c14769.f48335;
                if (c11897.f38320 == null) {
                    c11897.f38320 = C14769.m35543();
                }
                c11897.f38320 = c11897.f38320.m35552(c5816);
            }
            this.f15894 = this.f15894.m35552(new C11896(c12510));
            super.mo1513(c12510);
        } finally {
            this.f15894 = c14769;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC11781 m14107(boolean z) {
        C14769 c14769 = this.f15894;
        while (c14769.m35550()) {
            switch (C23085.f74870[((C11896) c14769.f48335).f38321.mo2285().ordinal()]) {
                case 4:
                    return ((C7926) ((C11896) c14769.f48335).f38321).f26345;
                case 5:
                    if (((C12510) ((C11896) c14769.f48335).f38321).f40168.m29602()) {
                        c14769 = c14769.f48336;
                        continue;
                    } else {
                        return m14106(((C7926) ((C11896) c14769.f48336.f48335).f38321).f26345, ((C12510) ((C11896) c14769.f48335).f38321).f40168.f38071 & 8);
                    }
                    break;
                case 6:
                    return m14106(((C7926) ((C11896) c14769.f48336.f48335).f38321).f26345, ((C4197) ((C11896) c14769.f48335).f38321).f15345 & 8);
                case 7:
                    return ((C6633) ((C11896) c14769.f48335).f38321).f22152;
                case 8:
                    if (!z) {
                        return ((C20847) this.f15895.f60505.get(((C11896) c14769.f48335).f38321)).f66749;
                    }
                    break;
            }
            c14769 = c14769.f48336;
        }
        C11972.m30019();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC11781 m14106(C24550 c24550, long j) {
        long j2 = j & 8;
        C18609 c18609 = this.f15895;
        if (j2 != 0) {
            C10377 c10377M1979 = c18609.f60500.m1979(c24550);
            if (c10377M1979 != null) {
                this.f15898.put(c24550, c10377M1979);
                return c10377M1979;
            }
            C10377 c10377 = (C10377) this.f15898.get(c24550);
            if (c10377 != null) {
                return c10377;
            }
            C10377 c10378 = new C10377(4106L, c18609.f60496.f49758, new C23191(C14769.m35543(), c18609.f60515.f48251, C14769.m35543(), c18609.f60515.f48275), c24550);
            this.f15898.put(c24550, c10378);
            return c10378;
        }
        Iterator it = c24550.f79576.m38842(c18609.f60496.f49865).iterator();
        if (it.hasNext()) {
            return (AbstractC11781) it.next();
        }
        C11972.m30024("init not found");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC8036 m14118() {
        if (!this.f15894.isEmpty()) {
            for (C14769 c14769 = this.f15894; c14769.m35550(); c14769 = c14769.f48336) {
                int i = C23085.f74870[((C11896) c14769.f48335).f38321.mo2285().ordinal()];
                if (i != 4 && i != 7) {
                    if (i == 8) {
                        return ((C11896) c14769.f48335).f38321;
                    }
                }
            }
            C11972.m30019();
            throw null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC8036 m14104(int i, AbstractC11781 abstractC11781) {
        C14769 c14769;
        int iM35551 = this.f15894.m35551() - 1;
        for (C11896 c11896 : this.f15894) {
            int[] iArr = C23085.f74870;
            AbstractC8036 abstractC8036 = c11896.f38321;
            AbstractC8036 abstractC8037 = c11896.f38321;
            switch (iArr[abstractC8036.mo2285().ordinal()]) {
                case 4:
                    C24550 c24550 = ((C7926) abstractC8037).f26345;
                    C18609 c18609 = this.f15895;
                    if (c24550.mo29596(abstractC11781, c18609.f60504) || abstractC11781.m29567((AbstractC22970) c24550, c18609.f60504)) {
                        if (iM35551 > i) {
                            return null;
                        }
                        return abstractC8037;
                    }
                    break;
                case 5:
                    if ((((C12510) abstractC8037).f40168 == abstractC11781 && abstractC11781.f38069.f38066 == EnumC13603.f43218) || ((c14769 = c11896.f38320) != null && c14769.contains(abstractC11781))) {
                        if (iM35551 > i) {
                            return null;
                        }
                        return abstractC8037;
                    }
                    break;
                    break;
                case 6:
                case 7:
                case 8:
                    C14769 c147610 = c11896.f38320;
                    if (c147610 != null && c147610.contains(abstractC11781)) {
                        if (iM35551 > i) {
                            return null;
                        }
                        return abstractC8037;
                    }
                    break;
                    break;
                default:
                    C11972.m30024("bad decl kind " + abstractC8037.mo2285());
                    throw null;
            }
            iM35551--;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC24577 m14124() {
        Iterator it = this.f15894.iterator();
        while (it.hasNext()) {
            AbstractC24577 abstractC24577 = (AbstractC24577) this.f15895.f60505.get(((C11896) it.next()).f38321);
            if (abstractC24577 != null) {
                return abstractC24577;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m14113(AbstractC11781 abstractC11781) {
        EnumC13603 enumC13603 = abstractC11781.f38066;
        return ((enumC13603 != EnumC13603.f43205 && enumC13603 != EnumC13603.f43218) || abstractC11781.mo7874() || abstractC11781.f38072 == this.f15895.f60496.f49865) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m14114(AbstractC24577 abstractC24577, C18565 c18565) {
        if (abstractC24577 == null || c18565.f60321 != null || c18565.f60319 != null || c18565.f26659.mo23449().m51067(EnumC21172.NONE)) {
            return false;
        }
        AbstractC22664 abstractC22664Mo23449 = c18565.f26659.mo23449();
        for (AbstractC22664 abstractC22664Mo234410 = abstractC24577.f79656.m29558().f38067; !abstractC22664Mo234410.m51067(EnumC21172.NONE); abstractC22664Mo234410 = abstractC22664Mo234410.mo23449()) {
            if (abstractC22664Mo234410.f73596.mo29596((AbstractC11781) abstractC22664Mo23449.f73596, this.f15895.f60504)) {
                return true;
            }
        }
        return false;
    }

    public C4439(C18609 c18609) {
        this.f15895 = c18609;
    }
}
