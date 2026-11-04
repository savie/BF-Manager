package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20426 extends C23174 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12221 f65432;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f65434;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14769 f65433 = C14769.m35543();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f65431 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16327 f65430 = null;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1519(C16875 c16875) {
        this.f65433 = this.f65433.m35552(c16875);
        m46841(c16875, c16875, c16875.f55197);
        m46845();
        super.mo1519(c16875);
    }

    @Override // l.C23174
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5474(AbstractC8036 abstractC8036) {
        this.f65433 = this.f65433.m35552(abstractC8036);
        try {
            super.mo5474(abstractC8036);
        } finally {
            m46845();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m46845() {
        C14769 c14769 = this.f65433;
        this.f65433 = c14769.f48336;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1961(C16239 c16239) {
        m46841(c16239, (AbstractC8036) this.f65433.f48336.f48335, c16239.f52783);
        super.mo1961(c16239);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46842(AbstractC8036 abstractC8036, AbstractC22664 abstractC22664, AbstractC11781 abstractC11781, C5510 c5510) {
        C12221 c12221;
        C14769 c14769Mo29568 = abstractC11781.mo29568();
        C18499 c18499 = new C18499();
        C18499 c184910 = new C18499();
        C18499 c184911 = new C18499();
        Iterator it = c14769Mo29568.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c12221 = this.f65432;
            if (!zHasNext) {
                break;
            }
            C23892 c23892 = (C23892) it.next();
            EnumC15950 enumC15950M30495 = c12221.m30495(c23892, abstractC11781);
            C14769 c14769 = c23892.f77372;
            AbstractC22664 abstractC22665 = c23892.f69124;
            int iOrdinal = enumC15950M30495.ordinal();
            if (iOrdinal == 0) {
                c18499.m43089(c23892);
            } else if (iOrdinal == 1) {
                C24638 c24638 = new C24638(abstractC22665, c14769, c5510);
                c184910.m43089(c24638);
                c184911.m43089(c24638);
            } else if (iOrdinal == 3) {
                c18499.m43089(c23892);
                c184910.m43089(new C24638(abstractC22665, c14769, c5510));
            }
        }
        if (c184910.isEmpty()) {
            return;
        }
        abstractC11781.m29584();
        abstractC11781.m29585(c18499.m43093());
        C14769 c14769M43093 = c184910.m43093();
        if (abstractC22664 == null) {
            m46840(abstractC8036, abstractC11781.mo16951().f38067, c14769M43093, c14769M43093, c5510);
            abstractC11781.m29599(c14769M43093);
            return;
        }
        AbstractC22664 abstractC22664M46840 = m46840(abstractC8036, abstractC22664, c14769M43093, c184911.m43093(), c5510);
        if (abstractC11781.mo9558() == EnumC5296.METHOD) {
            abstractC11781.f38067.mo15883().f75156 = abstractC22664M46840;
        } else if (abstractC11781.mo9558() == EnumC5296.PARAMETER && this.f65430 == null) {
            abstractC11781.f38067 = abstractC22664M46840;
            if (abstractC11781.mo29582().equals(c12221.f39268.f49836)) {
                abstractC11781.f38069.f38067.mo15883().f75158 = abstractC22664M46840;
            } else {
                C23191 c23191Mo15883 = abstractC11781.f38069.f38067.mo15883();
                C14769 c147610 = c23191Mo15883.f75155;
                C18499 c184912 = new C18499();
                for (C14769 c147611 = ((C10377) abstractC11781.f38069).f33013; c147611.m35550(); c147611 = c147611.f48336) {
                    if (c147611.f48335 == abstractC11781) {
                        c184912.m43089(abstractC22664M46840);
                    } else {
                        c184912.m43089((AbstractC22664) c147610.f48335);
                    }
                    c147610 = c147610.f48336;
                }
                c23191Mo15883.f75155 = c184912.m43093();
            }
        } else {
            abstractC11781.f38067 = abstractC22664M46840;
        }
        abstractC11781.m29599(c14769M43093);
        if (abstractC11781.mo9558() == EnumC5296.PARAMETER || abstractC11781.mo9558() == EnumC5296.LOCAL_VARIABLE || abstractC11781.mo9558() == EnumC5296.RESOURCE_VARIABLE || abstractC11781.mo9558() == EnumC5296.EXCEPTION_PARAMETER || abstractC11781.mo9558() == EnumC5296.BINDING_VARIABLE) {
            m46843(abstractC11781, c14769M43093);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46843(AbstractC11781 abstractC11781, C14769 c14769) {
        long jMo29591 = abstractC11781.f38069.mo29591();
        if ((1048576 & jMo29591) != 0) {
            C24550 c24550 = (C24550) abstractC11781.f38069.f38069;
            if ((jMo29591 & 8) != 0) {
                c24550.m29595(c14769);
                return;
            } else {
                c24550.m29578(c14769);
                return;
            }
        }
        abstractC11781.f38069.m29599(c14769);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22664 m46840(AbstractC8036 abstractC8036, AbstractC22664 abstractC22664, C14769 c14769, C14769 c147610, C5510 c5510) {
        C14458 c14458;
        AbstractC22664 abstractC22664Mo4934;
        C7312 c7312 = this.f65432.f39266;
        if (c14769.isEmpty()) {
            return abstractC22664;
        }
        Iterator it = c14769.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            if (((C24638) it.next()).f77371 == c5510) {
                z = true;
            }
            C11972.m30026(z);
        }
        if (abstractC22664.m51067(EnumC21172.ARRAY)) {
            C2832 c2832 = (C2832) abstractC22664;
            C2832 c2833 = new C2832(c2832);
            if (c2832 instanceof C9543) {
                c2833 = c2833.m9327();
            }
            C14769 c14769M35543 = C14769.m35543();
            AbstractC22664 abstractC22665 = c2832.f9333;
            C14769 c14769M35552 = c14769M35543.m35552(C15204.f49630);
            C2832 c2834 = c2833;
            while (true) {
                boolean zM51067 = abstractC22665.m51067(EnumC21172.ARRAY);
                c14458 = abstractC22665.f73595;
                if (!zM51067) {
                    break;
                }
                C2832 c2835 = (C2832) abstractC22665;
                C2832 c2836 = new C2832(c2835);
                c2834.f9333 = c2836;
                abstractC22665 = c2835.f9333;
                c14769M35552 = c14769M35552.m35552(C15204.f49630);
                c2834 = c2836;
            }
            if (c14458 != null) {
                if (!abstractC22665.m51071().isEmpty()) {
                    c14769 = abstractC22665.m51071().m35549(c14769);
                }
                abstractC22664Mo4934 = abstractC22665.mo4934(c14458.m34925(EnumC24156.ANNOTATIONS).m34924(new C6256(c14769)));
            } else {
                abstractC22664Mo4934 = abstractC22665.mo4934(new C14458(new C6256(c14769)));
            }
            c2834.f9333 = abstractC22664Mo4934;
            c5510.f19184 = c14769M35552;
            return c2833;
        }
        if (abstractC22664.m51067(EnumC21172.TYPEVAR)) {
            return abstractC22664.mo9927(c147610);
        }
        if (abstractC22664.mo5501() == EnumC18720.UNION) {
            AbstractC22295 abstractC22295 = (AbstractC22295) ((C23699) abstractC8036).f76826.get(0);
            abstractC22295.f26659 = m46840(abstractC22295, abstractC22295.f26659, c14769, c147610, c5510);
            return abstractC22664;
        }
        InterfaceC12753 interfaceC12753Mo51070 = abstractC22664.mo51070();
        AbstractC8036 abstractC8037 = abstractC8036;
        AbstractC22664 abstractC22664Mo23449 = abstractC22664;
        while (interfaceC12753Mo51070 != null && interfaceC12753Mo51070.mo9558() != EnumC5296.PACKAGE && abstractC22664Mo23449 != null && abstractC22664Mo23449.mo5501() != EnumC18720.NONE && abstractC22664Mo23449.mo5501() != EnumC18720.ERROR) {
            EnumC22621 enumC22621Mo2283 = abstractC8037.mo2283();
            EnumC22621 enumC22621 = EnumC22621.MEMBER_SELECT;
            if (enumC22621Mo2283 != enumC22621 && abstractC8037.mo2283() != EnumC22621.PARAMETERIZED_TYPE && abstractC8037.mo2283() != EnumC22621.ANNOTATED_TYPE) {
                break;
            }
            if (abstractC8037.mo2283() == enumC22621) {
                abstractC22664Mo23449 = abstractC22664Mo23449.mo23449();
                interfaceC12753Mo51070 = interfaceC12753Mo51070.mo16951();
                abstractC8037 = ((C23041) abstractC8037).f74776;
            } else {
                abstractC8037 = abstractC8037.mo2283() == EnumC22621.PARAMETERIZED_TYPE ? ((C25191) abstractC8037).f81425 : ((C16875) abstractC8037).f55198;
            }
        }
        if (abstractC22664Mo23449 != null && abstractC22664Mo23449.m51067(EnumC21172.NONE)) {
            int iM35551 = c147610.m35551();
            if (iM35551 != 0) {
                if (iM35551 != 1) {
                    abstractC8036.getClass();
                    C11040 c11040 = C22843.f74058;
                    c7312.m34520(abstractC8036, new C11040("compiler", "cant.type.annotate.scoping", c147610));
                    return abstractC22664;
                }
                abstractC8036.getClass();
                C23892 c23892 = (C23892) c147610.f48335;
                C11040 c11041 = C22843.f74058;
                c7312.m34520(abstractC8036, new C11040("compiler", "cant.type.annotate.scoping.1", c23892));
            }
            return abstractC22664;
        }
        C18499 c18499 = new C18499();
        AbstractC22664 abstractC22664Mo234410 = abstractC22664Mo23449;
        while (interfaceC12753Mo51070 != null && interfaceC12753Mo51070.mo9558() != EnumC5296.PACKAGE && abstractC22664Mo234410 != null) {
            EnumC18720 enumC18720Mo5501 = abstractC22664Mo234410.mo5501();
            EnumC18720 enumC18720 = EnumC18720.NONE;
            if (enumC18720Mo5501 == enumC18720 || abstractC22664Mo234410.mo5501() == EnumC18720.ERROR) {
                break;
            }
            abstractC22664Mo234410 = abstractC22664Mo234410.mo23449();
            interfaceC12753Mo51070 = interfaceC12753Mo51070.mo16951();
            if (abstractC22664Mo234410 != null && abstractC22664Mo234410.mo5501() != enumC18720) {
                c18499.m43089(C15204.f49632);
            }
        }
        if (c18499.m43096()) {
            C14769 c147611 = c5510.f19184;
            C14769 c14769M43093 = c18499.m43093();
            c147611.getClass();
            c5510.f19184 = c14769M43093.m35549(c147611);
        }
        AbstractC22664 abstractC22666 = (AbstractC22664) abstractC22664.mo9324(new C3272(abstractC22664Mo23449), c14769);
        abstractC8036.f26659 = abstractC22666;
        return abstractC22666;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5510 m46838(AbstractC8036 abstractC8036, AbstractC8036 abstractC8037, C14769 c14769, C16327 c16327, int i, C18499 c18499) {
        AbstractC22664 abstractC22664;
        int iIndexOf;
        int iIndexOf2;
        EnumC21461 enumC21461;
        int iIndexOf3;
        C14769 c147610 = c14769;
        switch (C17442.f56732[abstractC8037.mo2283().ordinal()]) {
            case 1:
                return C5510.m16385(c18499.m43093(), c16327, i, abstractC8037.f26658);
            case 2:
                return C5510.m16404(c18499.m43093(), c16327, abstractC8037.f26658);
            case 3:
                C18565 c18565 = (C18565) abstractC8037;
                C14769 c147611 = c18565.f60320;
                C7926 c7926 = c18565.f60319;
                if (c7926 != null) {
                    if (c7926.f26347.contains(abstractC8036)) {
                        return C5510.m16387(c18499.m43093(), c16327, c7926.f26347.indexOf(abstractC8036), abstractC8037.f26658);
                    }
                    return C5510.m16387(c18499.m43093(), c16327, 65535, abstractC8037.f26658);
                }
                if (c147611.contains(abstractC8036)) {
                    return C5510.m16402(c18499.m43093(), c16327, c147611.indexOf(abstractC8036), abstractC8037.f26658);
                }
                return C5510.m16384(c18499.m43093(), c16327, abstractC8037.f26658);
            case 4:
                return C5510.m16384(c18499.m43093(), c16327, abstractC8037.f26658);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                C7926 c7927 = (C7926) abstractC8037;
                if (c7927.f26348 != abstractC8036) {
                    if (c7927.f26347.contains(abstractC8036)) {
                        return C5510.m16387(c18499.m43093(), c16327, c7927.f26347.indexOf(abstractC8036), abstractC8037.f26658);
                    }
                    if (c7927.f26343.contains(abstractC8036)) {
                        return C5510.m16394(c18499.m43093(), c16327, c7927.f26343.indexOf(abstractC8036), abstractC8037.f26658);
                    }
                    throw new AssertionError("Could not determine position of tree " + abstractC8036 + " within frame " + abstractC8037);
                }
                return C5510.m16387(c18499.m43093(), c16327, 65535, abstractC8037.f26658);
            case 10:
                C6633 c6633 = (C6633) abstractC8037;
                if (c6633.f22146.contains(abstractC8036)) {
                    return C5510.m16396(c18499.m43093(), c16327, c6633.f22146.indexOf(abstractC8036), abstractC8037.f26658);
                }
                if (c6633.f22147 == abstractC8036) {
                    return C5510.m16389(c18499.m43093(), c16327, abstractC8037.f26658);
                }
                if (c6633.f22154.contains(abstractC8036)) {
                    return C5510.m16390(c18499.m43093(), c16327, c6633.f22154.indexOf(abstractC8036), abstractC8037.f26658);
                }
                throw new AssertionError("Could not determine position of tree " + abstractC8036 + " within frame " + abstractC8037);
            case 11:
                C14769 c147612 = c147610.f48336;
                C25191 c25191 = (C25191) abstractC8037;
                if (c25191.f81425 != abstractC8036) {
                    if (c25191.f81424.contains(abstractC8036)) {
                        c18499.m43095(new C15204(EnumC12967.TYPE_ARGUMENT, c25191.f81424.indexOf(abstractC8036)));
                        C14769 c147613 = c147612.f48336;
                        if (c147613 != null && ((AbstractC8036) c147613.f48335).m21911(EnumC21461.f68518)) {
                            abstractC22664 = ((AbstractC8036) c147612.f48336.f48335).f26659;
                        } else {
                            abstractC22664 = c25191.f26659;
                        }
                        m46839(abstractC22664, c18499);
                    } else {
                        throw new AssertionError("Could not determine type argument position of tree " + abstractC8036 + " within frame " + abstractC8037);
                    }
                }
                return m46838((AbstractC8036) c147612.f48335, (AbstractC8036) c147612.f48336.f48335, c147612, c16327, i, c18499);
            case 12:
                C12598 c12598 = (C12598) abstractC8037;
                C14769 c147614 = c12598.f40437;
                EnumC16081 enumC16081 = c12598.f40435;
                if (c12598.f40436 == abstractC8036) {
                    int i2 = C17442.f56730[enumC16081.ordinal()];
                    if (i2 == 1) {
                        return C5510.m16395(c18499.m43093(), c16327, abstractC8037.f26658);
                    }
                    if (i2 == 2) {
                        return C5510.m16386(c18499.m43093(), c16327, abstractC8037.f26658);
                    }
                    throw new AssertionError("Unknown method reference mode " + enumC16081 + " for tree " + abstractC8036 + " within frame " + abstractC8037);
                }
                if (c147614 != null && c147614.contains(abstractC8036)) {
                    int iIndexOf4 = c147614.indexOf(abstractC8036);
                    int i3 = C17442.f56730[enumC16081.ordinal()];
                    if (i3 == 1) {
                        return C5510.m16398(c18499.m43093(), c16327, iIndexOf4, abstractC8037.f26658);
                    }
                    if (i3 == 2) {
                        return C5510.m16392(c18499.m43093(), c16327, iIndexOf4, abstractC8037.f26658);
                    }
                    throw new AssertionError("Unknown method reference mode " + enumC16081 + " for tree " + abstractC8036 + " within frame " + abstractC8037);
                }
                throw new AssertionError("Could not determine type argument position of tree " + abstractC8036 + " within frame " + abstractC8037);
            case 13:
                c18499.m43095(C15204.f49630);
                C14769 c147615 = c147610.f48336;
                while (true) {
                    AbstractC8036 abstractC8038 = (AbstractC8036) c147615.f48336.f48335;
                    if (abstractC8038.m21911(EnumC21461.f68553)) {
                        c147615 = c147615.f48336;
                        c18499.m43095(C15204.f49630);
                    } else if (abstractC8038.m21911(EnumC21461.f68448)) {
                        c147615 = c147615.f48336;
                    } else {
                        return m46838((AbstractC8036) c147615.f48335, (AbstractC8036) c147615.f48336.f48335, c147615, c16327, i, c18499);
                    }
                }
                break;
            case 14:
                if (((AbstractC8036) c147610.f48336.f48336.f48335).m21911(EnumC21461.f68501)) {
                    C14769 c147616 = c147610.f48336;
                    int iIndexOf5 = ((C7926) c147616.f48336.f48335).f26343.indexOf(c147616.f48335);
                    C16239 c16239 = (C16239) abstractC8037;
                    if (((AbstractC22295) c16239.f52785.get(0)).f26659.mo31586()) {
                        iIndexOf2 = c16239.f52785.indexOf(abstractC8036) + 1;
                    } else {
                        iIndexOf2 = c16239.f52785.indexOf(abstractC8036);
                    }
                    return C5510.m16403(c18499.m43093(), c16327, iIndexOf5, iIndexOf2, abstractC8037.f26658);
                }
                if (((AbstractC8036) c147610.f48336.f48336.f48335).m21911(EnumC21461.f68505)) {
                    C14769 c147617 = c147610.f48336;
                    int iIndexOf6 = ((C6633) c147617.f48336.f48335).f22154.indexOf(c147617.f48335);
                    C16239 c162310 = (C16239) abstractC8037;
                    if (((AbstractC22295) c162310.f52785.get(0)).f26659.mo31586()) {
                        iIndexOf = c162310.f52785.indexOf(abstractC8036) + 1;
                    } else {
                        iIndexOf = c162310.f52785.indexOf(abstractC8036);
                    }
                    return C5510.m16388(c18499.m43093(), c16327, iIndexOf6, iIndexOf, abstractC8037.f26658);
                }
                throw new AssertionError("Could not determine position of tree " + abstractC8036 + " within frame " + abstractC8037);
            case 15:
                C5816 c5816 = ((C12510) abstractC8037).f40168;
                if (c5816.mo9558() != EnumC5296.FIELD) {
                    m46843(c5816, c5816.mo29597());
                }
                switch (C17442.f56731[c5816.mo9558().ordinal()]) {
                    case 1:
                    case 2:
                        return C5510.m16399(c18499.m43093(), c16327, abstractC8037.f26658);
                    case 3:
                        return C5510.m16391(c18499.m43093(), c16327, abstractC8037.f26658);
                    case 4:
                        if (c5816.f38072.equals(this.f65432.f39268.f49836)) {
                            return C5510.m16397(c18499.m43093(), c16327, abstractC8037.f26658);
                        }
                        while (true) {
                            EnumC21461 enumC21461Mo2285 = ((AbstractC8036) c147610.f48335).mo2285();
                            enumC21461 = EnumC21461.f68505;
                            if (enumC21461Mo2285 != enumC21461 && ((AbstractC8036) c147610.f48335).mo2285() != EnumC21461.f68453) {
                                c147610 = c147610.f48336;
                            }
                        }
                        if (((AbstractC8036) c147610.f48335).mo2285() == enumC21461) {
                            iIndexOf3 = ((C6633) c147610.f48335).f22145.indexOf(abstractC8037);
                        } else if (((AbstractC8036) c147610.f48335).mo2285() == EnumC21461.f68453) {
                            iIndexOf3 = ((C16327) c147610.f48335).f52999.indexOf(abstractC8037);
                        } else {
                            C11972.m30024("methodParamIndex expected to find method or lambda for param: " + abstractC8037);
                            throw null;
                        }
                        return C5510.m16400(c18499.m43093(), c16327, iIndexOf3, abstractC8037.f26658);
                    case 5:
                        return C5510.m16401(c18499.m43093(), c16327, abstractC8037.f26658);
                    case 6:
                        return C5510.m16393(c18499.m43093(), c16327, abstractC8037.f26658);
                    default:
                        throw new AssertionError("Found unexpected type annotation for variable: " + c5816 + " with kind: " + c5816.mo9558());
                }
            case 16:
                if (abstractC8037 == abstractC8036) {
                    AbstractC22664 abstractC22665 = ((C16875) abstractC8037).f55198.f26659;
                    C11972.m30021(abstractC22665);
                    if (!abstractC22665.f73596.mo9558().equals(EnumC5296.TYPE_PARAMETER) && !abstractC22665.mo5501().equals(EnumC18720.WILDCARD) && !abstractC22665.mo5501().equals(EnumC18720.ARRAY)) {
                        m46839(abstractC22665, c18499);
                    }
                }
                C14769 c147618 = c147610.f48336;
                return m46838((AbstractC8036) c147618.f48335, (AbstractC8036) c147618.f48336.f48335, c147618, c16327, i, c18499);
            case 17:
                C14769 c147619 = c147610.f48336;
                return m46838((AbstractC8036) c147619.f48335, (AbstractC8036) c147619.f48336.f48335, c147619, c16327, i, c18499);
            case 18:
                C14769 c147620 = c147610.f48336;
                return m46838((AbstractC8036) c147620.f48335, (AbstractC8036) c147620.f48336.f48335, c147620, c16327, ((C17731) abstractC8037).f58264.indexOf(abstractC8036), c18499);
            case 19:
                C24533 c24533 = (C24533) abstractC8037;
                if (!c24533.f79552.contains(abstractC8036)) {
                    return C5510.f19172;
                }
                C10377 c10377 = (C10377) C11239.m28352(c24533.f79554);
                int iIndexOf7 = c24533.f79552.indexOf(abstractC8036);
                if (c10377 == null) {
                    throw new AssertionError("could not determine symbol for {" + c24533 + l.d);
                }
                if (c10377.m29570()) {
                    return C5510.m16402(c18499.m43093(), c16327, iIndexOf7, c24533.f26658);
                }
                return C5510.m16405(c18499.m43093(), c16327, iIndexOf7, c24533.f26658);
            case 20:
            case 21:
                C14769 c147621 = c147610.f48336;
                AbstractC8036 abstractC8039 = (AbstractC8036) c147621.f48335;
                AbstractC8036 abstractC80310 = (AbstractC8036) c147621.f48336.f48335;
                c18499.m43095(C15204.f49631);
                return m46838(abstractC8039, abstractC80310, c147621, c16327, i, c18499);
            case 22:
                C14769 c147622 = c147610.f48336;
                return m46838((AbstractC8036) c147622.f48335, (AbstractC8036) c147622.f48336.f48335, c147622, c16327, i, c18499);
            default:
                throw new AssertionError("Unresolved frame: " + abstractC8037 + " of kind: " + abstractC8037.mo2283() + "\n    Looking for tree: " + abstractC8036);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18499 m46839(AbstractC22664 abstractC22664, C18499 c18499) {
        for (AbstractC22664 abstractC22664Mo23449 = abstractC22664.mo23449(); abstractC22664Mo23449 != null && abstractC22664Mo23449.mo5501() != EnumC18720.NONE && abstractC22664Mo23449.mo5501() != EnumC18720.ERROR; abstractC22664Mo23449 = abstractC22664Mo23449.mo23449()) {
            c18499.m43095(C15204.f49632);
        }
        return c18499;
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1505(C7926 c7926) {
        if (this.f65431) {
            return;
        }
        this.f65431 = true;
        if (this.f65434) {
            mo5474(c7926.f26341);
            m52092(c7926.f26343);
            mo5474(c7926.f26348);
            m52092(c7926.f26347);
        }
        m52092(c7926.f26344);
        if (c7926.f26345.m54827()) {
            C1170.stream(c7926.f26345.m54835()).forEach(new Consumer() { // from class: l.᩹۟᩺
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C20426 c20426 = this.f75778;
                    c20426.getClass();
                    c20426.mo5474(((C22224) obj).f71603);
                }
            });
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        if (c6633.f22152 == null) {
            C11972.m30024("Visiting tree node before memberEnter");
            throw null;
        }
        boolean z = this.f65434;
        if (z) {
            if (!c6633.f22144.f15824.isEmpty()) {
                if (c6633.f22152.m29570()) {
                    m46842(c6633, null, c6633.f22152, C5510.m16389(C5510.f19173, null, c6633.f26658));
                } else {
                    m46842(c6633.f22147, c6633.f22152.f38067.mo31585(), c6633.f22152, C5510.m16389(C5510.f19173, null, c6633.f22147.f26658));
                }
            }
            C12510 c12510 = c6633.f22149;
            if (c12510 != null && c12510.f40168 != null && !c12510.f40170.f15824.isEmpty()) {
                C5510 c5510M16397 = C5510.m16397(C5510.f19173, null, c6633.f22149.f40166.f26658);
                this.f65433 = this.f65433.m35552(c6633.f22149);
                try {
                    C12510 c12511 = c6633.f22149;
                    AbstractC22295 abstractC22295 = c12511.f40166;
                    C5816 c5816 = c12511.f40168;
                    m46842(abstractC22295, c5816.f38067, c5816, c5510M16397);
                    m46845();
                } catch (Throwable th) {
                    m46845();
                    throw th;
                }
            }
            int i = 0;
            for (C12510 c12512 : c6633.f22145) {
                if (!c12512.f40170.f15824.isEmpty()) {
                    C5510 c5510M16400 = C5510.m16400(C5510.f19173, null, i, c12512.f40166.f26658);
                    this.f65433 = this.f65433.m35552(c12512);
                    try {
                        AbstractC22295 abstractC22296 = c12512.f40166;
                        C5816 c5817 = c12512.f40168;
                        m46842(abstractC22296, c5817.f38067, c5817, c5510M16400);
                        m46845();
                    } catch (Throwable th2) {
                        m46845();
                        throw th2;
                    }
                }
                i++;
            }
        }
        if (z) {
            mo5474(c6633.f22144);
            mo5474(c6633.f22147);
            m52092(c6633.f22154);
            mo5474(c6633.f22149);
            m52092(c6633.f22145);
            m52092(c6633.f22146);
            return;
        }
        mo5474(c6633.f22151);
        mo5474(c6633.f22148);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1518(C16327 c16327) {
        C16327 c16328 = this.f65430;
        try {
            this.f65430 = c16327;
            int i = 0;
            for (C12510 c12510 : c16327.f52999) {
                if (!c12510.f40170.f15824.isEmpty()) {
                    C5510 c5510M16400 = C5510.m16400(C5510.f19173, c16327, i, c12510.f40166.f26658);
                    this.f65433 = this.f65433.m35552(c12510);
                    try {
                        if (!c12510.m31066()) {
                            AbstractC22295 abstractC22295 = c12510.f40166;
                            C5816 c5816 = c12510.f40168;
                            m46842(abstractC22295, c5816.f38067, c5816, c5510M16400);
                        }
                        m46845();
                    } catch (Throwable th) {
                        m46845();
                        throw th;
                    }
                }
                i++;
            }
            mo5474(c16327.f53001);
            m52092(c16327.f52999);
            this.f65430 = c16328;
        } catch (Throwable th2) {
            this.f65430 = c16328;
            throw th2;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        C5816 c5816;
        boolean zIsEmpty = c12510.f40170.f15824.isEmpty();
        boolean z = this.f65434;
        if (!zIsEmpty) {
            C5816 c5817 = c12510.f40168;
            if (c5817 == null) {
                C11972.m30024("Visiting tree node before memberEnter");
                throw null;
            }
            if (c5817.mo9558() != EnumC5296.PARAMETER) {
                if (c12510.f40168.mo9558() == EnumC5296.FIELD) {
                    if (z) {
                        C5510 c5510M16391 = C5510.m16391(C5510.f19173, null, c12510.f26658);
                        AbstractC22295 abstractC22295 = c12510.f40166;
                        C5816 c5818 = c12510.f40168;
                        m46842(abstractC22295, c5818.f38067, c5818, c5510M16391);
                    }
                } else if (c12510.f40168.mo9558() == EnumC5296.LOCAL_VARIABLE) {
                    C5510 c5510M16399 = C5510.m16399(C5510.f19173, this.f65430, c12510.f26658);
                    if (!c12510.m31066()) {
                        AbstractC22295 abstractC22296 = c12510.f40166;
                        C5816 c5819 = c12510.f40168;
                        m46842(abstractC22296, c5819.f38067, c5819, c5510M16399);
                    }
                } else if (c12510.f40168.mo9558() == EnumC5296.BINDING_VARIABLE) {
                    C5510 c5510M163910 = C5510.m16399(C5510.f19173, this.f65430, c12510.f26658);
                    AbstractC22295 abstractC22297 = c12510.f40166;
                    C5816 c58110 = c12510.f40168;
                    m46842(abstractC22297, c58110.f38067, c58110, c5510M163910);
                } else if (c12510.f40168.mo9558() == EnumC5296.EXCEPTION_PARAMETER) {
                    C5510 c5510M16401 = C5510.m16401(C5510.f19173, this.f65430, c12510.f26658);
                    AbstractC22295 abstractC22298 = c12510.f40166;
                    C5816 c58111 = c12510.f40168;
                    m46842(abstractC22298, c58111.f38067, c58111, c5510M16401);
                } else if (c12510.f40168.mo9558() == EnumC5296.RESOURCE_VARIABLE) {
                    C5510 c5510M16393 = C5510.m16393(C5510.f19173, this.f65430, c12510.f26658);
                    AbstractC22295 abstractC22299 = c12510.f40166;
                    C5816 c58112 = c12510.f40168;
                    m46842(abstractC22299, c58112.f38067, c58112, c5510M16393);
                } else if (c12510.f40168.mo9558() != EnumC5296.ENUM_CONSTANT) {
                    C11972.m30024("Unhandled variable kind: " + c12510.f40168.mo9558());
                    throw null;
                }
            }
        }
        mo5474(c12510.f40170);
        mo5474(c12510.f40166);
        if (!z) {
            mo5474(c12510.f40171);
        }
        if (z && (c5816 = c12510.f40168) != null && c5816.mo9558() == EnumC5296.FIELD) {
            C5816 c58113 = c12510.f40168;
            if ((c58113.f38071 & 2305843009213693952L) != 0) {
                C22224 c22224M54828 = ((C24550) c58113.f38069).m54828(c58113);
                c22224M54828.m29569(c12510.f40168.mo29597());
                c22224M54828.f38067 = c12510.f40168.f38067;
            }
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1496(C4197 c4197) {
        if (this.f65434) {
            return;
        }
        m52092(c4197.f15344);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        C24550 c24550;
        C7926 c7926 = c18565.f60319;
        if (c7926 != null && (c24550 = c7926.f26345) != null) {
            AbstractC22664 abstractC22664 = c24550.f38069.m29558().f38067;
            C18499 c18499 = new C18499();
            m46839(abstractC22664, c18499);
            c18499.m43089(C15204.f49632);
            C5510 c5510M16384 = C5510.m16384(c18499.m43093(), null, c18565.f26658);
            C18499 c184910 = new C18499();
            AbstractC22664 abstractC22665 = c18565.f60323.f26659;
            C18499 c184911 = new C18499();
            m46839(abstractC22665, c184911);
            C14769 c14769M43093 = c184911.m43093();
            for (C24638 c24638 : c24550.mo29597()) {
                if (c24638.f77371.f19184.equals(c14769M43093)) {
                    c184910.m43089(new C24638(c24638.f69124, c24638.f77372, c5510M16384));
                }
            }
            c24550.f38069.m29599(c184910.m43093());
        }
        mo5474(c18565.f60321);
        m52092(c18565.f60320);
        if (c18565.f60319 == null) {
            mo5474(c18565.f60323);
        }
        m52092(c18565.f60325);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1524(C21549 c21549) {
        m46841(c21549, c21549, c21549.f68828);
        int iM35551 = c21549.f68831.m35551();
        C18499 c18499 = new C18499();
        for (int i = 0; i < iM35551; i++) {
            C18499 c184910 = new C18499();
            if (i != 0) {
                c18499.m43089(C15204.f49630);
                c184910.m43090(c18499.m43093());
            }
            m46844((C14769) c21549.f68831.get(i), C5510.m16384(c184910.m43093(), this.f65430, c21549.f26658));
        }
        AbstractC22295 abstractC22295 = c21549.f68829;
        c18499.m43089(C15204.f49630);
        while (abstractC22295 != null) {
            if (abstractC22295.m21911(EnumC21461.f68448)) {
                C16875 c16875 = (C16875) abstractC22295;
                AbstractC22664 abstractC22664 = abstractC22295.f26659;
                C18499 c184911 = new C18499();
                m46839(abstractC22664, c184911);
                m46844(c16875.f55197, C5510.m16384(c184911.m43093().m35549(c18499.m43093()), this.f65430, c21549.f26658));
                abstractC22295 = c16875.f55198;
            } else if (abstractC22295.m21911(EnumC21461.f68553)) {
                c18499.m43089(C15204.f49630);
                abstractC22295 = ((C23589) abstractC22295).f76594;
            } else if (!abstractC22295.m21911(EnumC21461.f68485)) {
                break;
            } else {
                abstractC22295 = ((C23041) abstractC22295).f74776;
            }
        }
        m52092(c21549.f68827);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46841(AbstractC8036 abstractC8036, AbstractC8036 abstractC8037, C14769 c14769) {
        if (c14769.isEmpty()) {
            return;
        }
        m46844(c14769, m46838(abstractC8036, abstractC8037, this.f65433, this.f65430, 0, new C18499()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46844(C14769 c14769, C5510 c5510) {
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C23892 c23892 = ((C17621) it.next()).f57963;
            if (c23892 != null) {
                ((C24638) c23892).f77371 = c5510;
            }
        }
    }

    public final String toString() {
        return super.toString() + ": sigOnly: " + this.f65434;
    }

    public C20426(C12221 c12221, boolean z) {
        this.f65432 = c12221;
        this.f65434 = z;
    }
}
