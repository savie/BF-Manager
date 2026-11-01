package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖ۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2383 extends C22220 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f8409;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5206 f8411;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21825 f8413 = C21825.m48588();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f8412 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22489 f8410 = null;

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3919(C2401 c2401) {
        this.f8413 = this.f8413.m48597(c2401);
        m7243(c2401, c2401, c2401.f9658);
        m7247();
        super.mo3919(c2401);
    }

    @Override // l.C22220
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo7248(AbstractC8774 abstractC8774) {
        this.f8413 = this.f8413.m48597(abstractC8774);
        try {
            super.mo7248(abstractC8774);
        } finally {
            m7247();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m7247() {
        C21825 c21825 = this.f8413;
        this.f8413 = c21825.f70877;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3958(C22179 c22179) {
        m7243(c22179, (AbstractC8774) this.f8413.f70877.f70876, c22179.f72546);
        super.mo3958(c22179);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7244(AbstractC8774 abstractC8774, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903, C10935 c10935) {
        C5206 c5206;
        C21825 c21825Mo20271 = abstractC23903.mo20271();
        C19003 c19003 = new C19003();
        C19003 c19004 = new C19003();
        C19003 c19005 = new C19003();
        Iterator it = c21825Mo20271.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c5206 = this.f8411;
            if (!zHasNext) {
                break;
            }
            C11867 c11867 = (C11867) it.next();
            EnumC4500 enumC4500M14387 = c5206.m14387(c11867, abstractC23903);
            C21825 c21825 = c11867.f39809;
            AbstractC16579 abstractC165710 = c11867.f75167;
            int iOrdinal = enumC4500M14387.ordinal();
            if (iOrdinal == 0) {
                c19003.m43723(c11867);
            } else if (iOrdinal == 1) {
                C13278 c13278 = new C13278(abstractC165710, c21825, c10935);
                c19004.m43723(c13278);
                c19005.m43723(c13278);
            } else if (iOrdinal == 3) {
                c19003.m43723(c11867);
                c19004.m43723(new C13278(abstractC165710, c21825, c10935));
            }
        }
        if (c19004.isEmpty()) {
            return;
        }
        abstractC23903.m52719();
        abstractC23903.m52726(c19003.m43726());
        C21825 c21825M43726 = c19004.m43726();
        if (abstractC16579 == null) {
            m7241(abstractC8774, abstractC23903.mo2880().f77449, c21825M43726, c21825M43726, c10935);
            abstractC23903.m52699(c21825M43726);
            return;
        }
        AbstractC16579 abstractC16579M7241 = m7241(abstractC8774, abstractC16579, c21825M43726, c19005.m43726(), c10935);
        if (abstractC23903.mo17325() == EnumC1923.METHOD) {
            abstractC23903.f77449.mo27295().f45368 = abstractC16579M7241;
        } else if (abstractC23903.mo17325() == EnumC1923.PARAMETER && this.f8410 == null) {
            abstractC23903.f77449 = abstractC16579M7241;
            if (abstractC23903.mo20270().equals(c5206.f18043.f77533)) {
                abstractC23903.f77448.f77449.mo27295().f45369 = abstractC16579M7241;
            } else {
                C13757 c13757Mo27295 = abstractC23903.f77448.f77449.mo27295();
                C21825 c21826 = c13757Mo27295.f45367;
                C19003 c19006 = new C19003();
                for (C21825 c21827 = ((C18258) abstractC23903.f77448).f58259; c21827.m48595(); c21827 = c21827.f70877) {
                    if (c21827.f70876 == abstractC23903) {
                        c19006.m43723(abstractC16579M7241);
                    } else {
                        c19006.m43723((AbstractC16579) c21826.f70876);
                    }
                    c21826 = c21826.f70877;
                }
                c13757Mo27295.f45367 = c19006.m43726();
            }
        } else {
            abstractC23903.f77449 = abstractC16579M7241;
        }
        abstractC23903.m52699(c21825M43726);
        if (abstractC23903.mo17325() == EnumC1923.PARAMETER || abstractC23903.mo17325() == EnumC1923.LOCAL_VARIABLE || abstractC23903.mo17325() == EnumC1923.RESOURCE_VARIABLE || abstractC23903.mo17325() == EnumC1923.EXCEPTION_PARAMETER || abstractC23903.mo17325() == EnumC1923.BINDING_VARIABLE) {
            m7246(abstractC23903, c21825M43726);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7246(AbstractC23903 abstractC23903, C21825 c21825) {
        long jMo20276 = abstractC23903.f77448.mo20276();
        if ((1048576 & jMo20276) != 0) {
            C22492 c22492 = (C22492) abstractC23903.f77448.f77448;
            if ((jMo20276 & 8) != 0) {
                c22492.m52715(c21825);
                return;
            } else {
                c22492.m52710(c21825);
                return;
            }
        }
        abstractC23903.f77448.m52699(c21825);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC16579 m7241(AbstractC8774 abstractC8774, AbstractC16579 abstractC16579, C21825 c21825, C21825 c21826, C10935 c10935) {
        C3794 c3794;
        AbstractC16579 abstractC16579Mo1929;
        C20414 c20414 = this.f8411.f18045;
        if (c21825.isEmpty()) {
            return abstractC16579;
        }
        Iterator it = c21825.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            if (((C13278) it.next()).f39811 == c10935) {
                z = true;
            }
            C6171.m17176(z);
        }
        if (abstractC16579.m39001(EnumC6617.ARRAY)) {
            C8777 c8777 = (C8777) abstractC16579;
            C8777 c8778 = new C8777(c8777);
            if (c8777 instanceof C19360) {
                c8778 = c8778.m22849();
            }
            C21825 c21825M48588 = C21825.m48588();
            AbstractC16579 abstractC165710 = c8777.f30194;
            C21825 c21825M48597 = c21825M48588.m48597(C17284.f55038);
            C8777 c8779 = c8778;
            while (true) {
                boolean zM39001 = abstractC165710.m39001(EnumC6617.ARRAY);
                c3794 = abstractC165710.f53221;
                if (!zM39001) {
                    break;
                }
                C8777 c87710 = (C8777) abstractC165710;
                C8777 c87711 = new C8777(c87710);
                c8779.f30194 = c87711;
                abstractC165710 = c87710.f30194;
                c21825M48597 = c21825M48597.m48597(C17284.f55038);
                c8779 = c87711;
            }
            if (c3794 != null) {
                if (!abstractC165710.m39008().isEmpty()) {
                    c21825 = abstractC165710.m39008().m48594(c21825);
                }
                abstractC16579Mo1929 = abstractC165710.mo1929(c3794.m11038(EnumC0972.ANNOTATIONS).m11036(new C22140(c21825)));
            } else {
                abstractC16579Mo1929 = abstractC165710.mo1929(new C3794(new C22140(c21825)));
            }
            c8779.f30194 = abstractC16579Mo1929;
            c10935.f37184 = c21825M48597;
            return c8778;
        }
        if (abstractC16579.m39001(EnumC6617.TYPEVAR)) {
            return abstractC16579.mo29058(c21826);
        }
        if (abstractC16579.mo1931() == EnumC19688.UNION) {
            AbstractC5930 abstractC5930 = (AbstractC5930) ((C1011) abstractC8774).f4699.get(0);
            abstractC5930.f30190 = m7241(abstractC5930, abstractC5930.f30190, c21825, c21826, c10935);
            return abstractC16579;
        }
        InterfaceC14625 interfaceC14625Mo33525 = abstractC16579.mo33525();
        AbstractC8774 abstractC8775 = abstractC8774;
        AbstractC16579 abstractC16579Mo1934 = abstractC16579;
        while (interfaceC14625Mo33525 != null && interfaceC14625Mo33525.mo17325() != EnumC1923.PACKAGE && abstractC16579Mo1934 != null && abstractC16579Mo1934.mo1931() != EnumC19688.NONE && abstractC16579Mo1934.mo1931() != EnumC19688.ERROR) {
            EnumC12490 enumC12490Mo1801 = abstractC8775.mo1801();
            EnumC12490 enumC12490 = EnumC12490.MEMBER_SELECT;
            if (enumC12490Mo1801 != enumC12490 && abstractC8775.mo1801() != EnumC12490.PARAMETERIZED_TYPE && abstractC8775.mo1801() != EnumC12490.ANNOTATED_TYPE) {
                break;
            }
            if (abstractC8775.mo1801() == enumC12490) {
                abstractC16579Mo1934 = abstractC16579Mo1934.mo1934();
                interfaceC14625Mo33525 = interfaceC14625Mo33525.mo2880();
                abstractC8775 = ((C23570) abstractC8775).f76357;
            } else {
                abstractC8775 = abstractC8775.mo1801() == EnumC12490.PARAMETERIZED_TYPE ? ((C11596) abstractC8775).f38963 : ((C2401) abstractC8775).f9659;
            }
        }
        if (abstractC16579Mo1934 != null && abstractC16579Mo1934.m39001(EnumC6617.NONE)) {
            int iM48596 = c21826.m48596();
            if (iM48596 != 0) {
                if (iM48596 != 1) {
                    abstractC8774.getClass();
                    C5909 c5909 = C23879.f77204;
                    c20414.m48199(abstractC8774, new C5909("compiler", "cant.type.annotate.scoping", c21826));
                    return abstractC16579;
                }
                abstractC8774.getClass();
                C11867 c11867 = (C11867) c21826.f70876;
                C5909 c59010 = C23879.f77204;
                c20414.m48199(abstractC8774, new C5909("compiler", "cant.type.annotate.scoping.1", c11867));
            }
            return abstractC16579;
        }
        C19003 c19003 = new C19003();
        AbstractC16579 abstractC16579Mo1935 = abstractC16579Mo1934;
        while (interfaceC14625Mo33525 != null && interfaceC14625Mo33525.mo17325() != EnumC1923.PACKAGE && abstractC16579Mo1935 != null) {
            EnumC19688 enumC19688Mo1931 = abstractC16579Mo1935.mo1931();
            EnumC19688 enumC19688 = EnumC19688.NONE;
            if (enumC19688Mo1931 == enumC19688 || abstractC16579Mo1935.mo1931() == EnumC19688.ERROR) {
                break;
            }
            abstractC16579Mo1935 = abstractC16579Mo1935.mo1934();
            interfaceC14625Mo33525 = interfaceC14625Mo33525.mo2880();
            if (abstractC16579Mo1935 != null && abstractC16579Mo1935.mo1931() != enumC19688) {
                c19003.m43723(C17284.f55036);
            }
        }
        if (c19003.m43722()) {
            C21825 c21827 = c10935.f37184;
            C21825 c21825M43726 = c19003.m43726();
            c21827.getClass();
            c10935.f37184 = c21825M43726.m48594(c21827);
        }
        AbstractC16579 abstractC165711 = (AbstractC16579) abstractC16579.mo1928(new C11557(abstractC16579Mo1934), c21825);
        abstractC8774.f30190 = abstractC165711;
        return abstractC165711;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C10935 m7240(AbstractC8774 abstractC8774, AbstractC8774 abstractC8775, C21825 c21825, C22489 c22489, int i, C19003 c19003) {
        AbstractC16579 abstractC16579;
        int iIndexOf;
        int iIndexOf2;
        EnumC18651 enumC18651;
        int iIndexOf3;
        C21825 c21826 = c21825;
        switch (C3172.f11932[abstractC8775.mo1801().ordinal()]) {
            case 1:
                return C10935.m27427(c19003.m43726(), c22489, i, abstractC8775.f30189);
            case 2:
                return C10935.m27424(c19003.m43726(), c22489, abstractC8775.f30189);
            case 3:
                C8378 c8378 = (C8378) abstractC8775;
                C21825 c21827 = c8378.f29096;
                C8753 c8753 = c8378.f29098;
                if (c8753 != null) {
                    if (c8753.f30087.contains(abstractC8774)) {
                        return C10935.m27429(c19003.m43726(), c22489, c8753.f30087.indexOf(abstractC8774), abstractC8775.f30189);
                    }
                    return C10935.m27429(c19003.m43726(), c22489, 65535, abstractC8775.f30189);
                }
                if (c21827.contains(abstractC8774)) {
                    return C10935.m27440(c19003.m43726(), c22489, c21827.indexOf(abstractC8774), abstractC8775.f30189);
                }
                return C10935.m27426(c19003.m43726(), c22489, abstractC8775.f30189);
            case 4:
                return C10935.m27426(c19003.m43726(), c22489, abstractC8775.f30189);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                C8753 c8754 = (C8753) abstractC8775;
                if (c8754.f30092 != abstractC8774) {
                    if (c8754.f30087.contains(abstractC8774)) {
                        return C10935.m27429(c19003.m43726(), c22489, c8754.f30087.indexOf(abstractC8774), abstractC8775.f30189);
                    }
                    if (c8754.f30088.contains(abstractC8774)) {
                        return C10935.m27434(c19003.m43726(), c22489, c8754.f30088.indexOf(abstractC8774), abstractC8775.f30189);
                    }
                    throw new AssertionError("Could not determine position of tree " + abstractC8774 + " within frame " + abstractC8775);
                }
                return C10935.m27429(c19003.m43726(), c22489, 65535, abstractC8775.f30189);
            case 10:
                C23195 c23195 = (C23195) abstractC8775;
                if (c23195.f75264.contains(abstractC8774)) {
                    return C10935.m27423(c19003.m43726(), c22489, c23195.f75264.indexOf(abstractC8774), abstractC8775.f30189);
                }
                if (c23195.f75266 == abstractC8774) {
                    return C10935.m27437(c19003.m43726(), c22489, abstractC8775.f30189);
                }
                if (c23195.f75269.contains(abstractC8774)) {
                    return C10935.m27438(c19003.m43726(), c22489, c23195.f75269.indexOf(abstractC8774), abstractC8775.f30189);
                }
                throw new AssertionError("Could not determine position of tree " + abstractC8774 + " within frame " + abstractC8775);
            case 11:
                C21825 c21828 = c21826.f70877;
                C11596 c11596 = (C11596) abstractC8775;
                if (c11596.f38963 != abstractC8774) {
                    if (c11596.f38962.contains(abstractC8774)) {
                        c19003.m43729(new C17284(EnumC5995.TYPE_ARGUMENT, c11596.f38962.indexOf(abstractC8774)));
                        C21825 c21829 = c21828.f70877;
                        if (c21829 != null && ((AbstractC8774) c21829.f70876).m22847(EnumC18651.f60531)) {
                            abstractC16579 = ((AbstractC8774) c21828.f70877.f70876).f30190;
                        } else {
                            abstractC16579 = c11596.f30190;
                        }
                        m7242(abstractC16579, c19003);
                    } else {
                        throw new AssertionError("Could not determine type argument position of tree " + abstractC8774 + " within frame " + abstractC8775);
                    }
                }
                return m7240((AbstractC8774) c21828.f70876, (AbstractC8774) c21828.f70877.f70876, c21828, c22489, i, c19003);
            case 12:
                C6966 c6966 = (C6966) abstractC8775;
                C21825 c218210 = c6966.f23411;
                EnumC13901 enumC13901 = c6966.f23414;
                if (c6966.f23408 == abstractC8774) {
                    int i2 = C3172.f11930[enumC13901.ordinal()];
                    if (i2 == 1) {
                        return C10935.m27422(c19003.m43726(), c22489, abstractC8775.f30189);
                    }
                    if (i2 == 2) {
                        return C10935.m27428(c19003.m43726(), c22489, abstractC8775.f30189);
                    }
                    throw new AssertionError("Unknown method reference mode " + enumC13901 + " for tree " + abstractC8774 + " within frame " + abstractC8775);
                }
                if (c218210 != null && c218210.contains(abstractC8774)) {
                    int iIndexOf4 = c218210.indexOf(abstractC8774);
                    int i3 = C3172.f11930[enumC13901.ordinal()];
                    if (i3 == 1) {
                        return C10935.m27443(c19003.m43726(), c22489, iIndexOf4, abstractC8775.f30189);
                    }
                    if (i3 == 2) {
                        return C10935.m27436(c19003.m43726(), c22489, iIndexOf4, abstractC8775.f30189);
                    }
                    throw new AssertionError("Unknown method reference mode " + enumC13901 + " for tree " + abstractC8774 + " within frame " + abstractC8775);
                }
                throw new AssertionError("Could not determine type argument position of tree " + abstractC8774 + " within frame " + abstractC8775);
            case 13:
                c19003.m43729(C17284.f55038);
                C21825 c218211 = c21826.f70877;
                while (true) {
                    AbstractC8774 abstractC8776 = (AbstractC8774) c218211.f70877.f70876;
                    if (abstractC8776.m22847(EnumC18651.f60566)) {
                        c218211 = c218211.f70877;
                        c19003.m43729(C17284.f55038);
                    } else if (abstractC8776.m22847(EnumC18651.f60535)) {
                        c218211 = c218211.f70877;
                    } else {
                        return m7240((AbstractC8774) c218211.f70876, (AbstractC8774) c218211.f70877.f70876, c218211, c22489, i, c19003);
                    }
                }
                break;
            case 14:
                if (((AbstractC8774) c21826.f70877.f70877.f70876).m22847(EnumC18651.f60468)) {
                    C21825 c218212 = c21826.f70877;
                    int iIndexOf5 = ((C8753) c218212.f70877.f70876).f30088.indexOf(c218212.f70876);
                    C22179 c22179 = (C22179) abstractC8775;
                    if (((AbstractC5930) c22179.f72547.get(0)).f30190.mo16236()) {
                        iIndexOf2 = c22179.f72547.indexOf(abstractC8774) + 1;
                    } else {
                        iIndexOf2 = c22179.f72547.indexOf(abstractC8774);
                    }
                    return C10935.m27441(c19003.m43726(), c22489, iIndexOf5, iIndexOf2, abstractC8775.f30189);
                }
                if (((AbstractC8774) c21826.f70877.f70877.f70876).m22847(EnumC18651.f60478)) {
                    C21825 c218213 = c21826.f70877;
                    int iIndexOf6 = ((C23195) c218213.f70877.f70876).f75269.indexOf(c218213.f70876);
                    C22179 c221710 = (C22179) abstractC8775;
                    if (((AbstractC5930) c221710.f72547.get(0)).f30190.mo16236()) {
                        iIndexOf = c221710.f72547.indexOf(abstractC8774) + 1;
                    } else {
                        iIndexOf = c221710.f72547.indexOf(abstractC8774);
                    }
                    return C10935.m27430(c19003.m43726(), c22489, iIndexOf6, iIndexOf, abstractC8775.f30189);
                }
                throw new AssertionError("Could not determine position of tree " + abstractC8774 + " within frame " + abstractC8775);
            case 15:
                C6263 c6263 = ((C6656) abstractC8775).f22475;
                if (c6263.mo17325() != EnumC1923.FIELD) {
                    m7246(c6263, c6263.mo50009());
                }
                switch (C3172.f11931[c6263.mo17325().ordinal()]) {
                    case 1:
                    case 2:
                        return C10935.m27431(c19003.m43726(), c22489, abstractC8775.f30189);
                    case 3:
                        return C10935.m27435(c19003.m43726(), c22489, abstractC8775.f30189);
                    case 4:
                        if (c6263.f77453.equals(this.f8411.f18043.f77533)) {
                            return C10935.m27442(c19003.m43726(), c22489, abstractC8775.f30189);
                        }
                        while (true) {
                            EnumC18651 enumC18651Mo1803 = ((AbstractC8774) c21826.f70876).mo1803();
                            enumC18651 = EnumC18651.f60478;
                            if (enumC18651Mo1803 != enumC18651 && ((AbstractC8774) c21826.f70876).mo1803() != EnumC18651.f60511) {
                                c21826 = c21826.f70877;
                            }
                        }
                        if (((AbstractC8774) c21826.f70876).mo1803() == enumC18651) {
                            iIndexOf3 = ((C23195) c21826.f70876).f75270.indexOf(abstractC8775);
                        } else if (((AbstractC8774) c21826.f70876).mo1803() == EnumC18651.f60511) {
                            iIndexOf3 = ((C22489) c21826.f70876).f73410.indexOf(abstractC8775);
                        } else {
                            C6171.m17174("methodParamIndex expected to find method or lambda for param: " + abstractC8775);
                            throw null;
                        }
                        return C10935.m27432(c19003.m43726(), c22489, iIndexOf3, abstractC8775.f30189);
                    case 5:
                        return C10935.m27439(c19003.m43726(), c22489, abstractC8775.f30189);
                    case 6:
                        return C10935.m27433(c19003.m43726(), c22489, abstractC8775.f30189);
                    default:
                        throw new AssertionError("Found unexpected type annotation for variable: " + c6263 + " with kind: " + c6263.mo17325());
                }
            case 16:
                if (abstractC8775 == abstractC8774) {
                    AbstractC16579 abstractC165710 = ((C2401) abstractC8775).f9659.f30190;
                    C6171.m17171(abstractC165710);
                    if (!abstractC165710.f53222.mo17325().equals(EnumC1923.TYPE_PARAMETER) && !abstractC165710.mo1931().equals(EnumC19688.WILDCARD) && !abstractC165710.mo1931().equals(EnumC19688.ARRAY)) {
                        m7242(abstractC165710, c19003);
                    }
                }
                C21825 c218214 = c21826.f70877;
                return m7240((AbstractC8774) c218214.f70876, (AbstractC8774) c218214.f70877.f70876, c218214, c22489, i, c19003);
            case 17:
                C21825 c218215 = c21826.f70877;
                return m7240((AbstractC8774) c218215.f70876, (AbstractC8774) c218215.f70877.f70876, c218215, c22489, i, c19003);
            case 18:
                C21825 c218216 = c21826.f70877;
                return m7240((AbstractC8774) c218216.f70876, (AbstractC8774) c218216.f70877.f70876, c218216, c22489, ((C5245) abstractC8775).f18177.indexOf(abstractC8774), c19003);
            case 19:
                C15434 c15434 = (C15434) abstractC8775;
                if (!c15434.f50297.contains(abstractC8774)) {
                    return C10935.f37178;
                }
                C18258 c18258 = (C18258) C3128.m9471(c15434.f50296);
                int iIndexOf7 = c15434.f50297.indexOf(abstractC8774);
                if (c18258 == null) {
                    throw new AssertionError("could not determine symbol for {" + c15434 + l.d);
                }
                if (c18258.m52713()) {
                    return C10935.m27440(c19003.m43726(), c22489, iIndexOf7, c15434.f30189);
                }
                return C10935.m27425(c19003.m43726(), c22489, iIndexOf7, c15434.f30189);
            case 20:
            case 21:
                C21825 c218217 = c21826.f70877;
                AbstractC8774 abstractC8777 = (AbstractC8774) c218217.f70876;
                AbstractC8774 abstractC8778 = (AbstractC8774) c218217.f70877.f70876;
                c19003.m43729(C17284.f55037);
                return m7240(abstractC8777, abstractC8778, c218217, c22489, i, c19003);
            case 22:
                C21825 c218218 = c21826.f70877;
                return m7240((AbstractC8774) c218218.f70876, (AbstractC8774) c218218.f70877.f70876, c218218, c22489, i, c19003);
            default:
                throw new AssertionError("Unresolved frame: " + abstractC8775 + " of kind: " + abstractC8775.mo1801() + "\n    Looking for tree: " + abstractC8774);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19003 m7242(AbstractC16579 abstractC16579, C19003 c19003) {
        for (AbstractC16579 abstractC16579Mo1934 = abstractC16579.mo1934(); abstractC16579Mo1934 != null && abstractC16579Mo1934.mo1931() != EnumC19688.NONE && abstractC16579Mo1934.mo1931() != EnumC19688.ERROR; abstractC16579Mo1934 = abstractC16579Mo1934.mo1934()) {
            c19003.m43729(C17284.f55036);
        }
        return c19003;
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) {
        if (this.f8412) {
            return;
        }
        this.f8412 = true;
        if (this.f8409) {
            mo7248(c8753.f30089);
            m49334(c8753.f30088);
            mo7248(c8753.f30092);
            m49334(c8753.f30087);
        }
        m49334(c8753.f30090);
        if (c8753.f30086.m50010()) {
            C9030.stream(c8753.f30086.m50004()).forEach(new Consumer() { // from class: l.ܰ۟ۤ
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C1455.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C2383 c2383 = this.f45092;
                    c2383.getClass();
                    c2383.mo7248(((C16142) obj).f52151);
                }
            });
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        if (c23195.f75263 == null) {
            C6171.m17174("Visiting tree node before memberEnter");
            throw null;
        }
        boolean z = this.f8409;
        if (z) {
            if (!c23195.f75267.f70566.isEmpty()) {
                if (c23195.f75263.m52713()) {
                    m7244(c23195, null, c23195.f75263, C10935.m27437(C10935.f37179, null, c23195.f30189));
                } else {
                    m7244(c23195.f75266, c23195.f75263.f77449.mo16235(), c23195.f75263, C10935.m27437(C10935.f37179, null, c23195.f75266.f30189));
                }
            }
            C6656 c6656 = c23195.f75262;
            if (c6656 != null && c6656.f22475 != null && !c6656.f22476.f70566.isEmpty()) {
                C10935 c10935M27442 = C10935.m27442(C10935.f37179, null, c23195.f75262.f22477.f30189);
                this.f8413 = this.f8413.m48597(c23195.f75262);
                try {
                    C6656 c6657 = c23195.f75262;
                    AbstractC5930 abstractC5930 = c6657.f22477;
                    C6263 c6263 = c6657.f22475;
                    m7244(abstractC5930, c6263.f77449, c6263, c10935M27442);
                    m7247();
                } catch (Throwable th) {
                    m7247();
                    throw th;
                }
            }
            int i = 0;
            for (C6656 c6658 : c23195.f75270) {
                if (!c6658.f22476.f70566.isEmpty()) {
                    C10935 c10935M27432 = C10935.m27432(C10935.f37179, null, i, c6658.f22477.f30189);
                    this.f8413 = this.f8413.m48597(c6658);
                    try {
                        AbstractC5930 abstractC5931 = c6658.f22477;
                        C6263 c6264 = c6658.f22475;
                        m7244(abstractC5931, c6264.f77449, c6264, c10935M27432);
                        m7247();
                    } catch (Throwable th2) {
                        m7247();
                        throw th2;
                    }
                }
                i++;
            }
        }
        if (z) {
            mo7248(c23195.f75267);
            mo7248(c23195.f75266);
            m49334(c23195.f75269);
            mo7248(c23195.f75262);
            m49334(c23195.f75270);
            m49334(c23195.f75264);
            return;
        }
        mo7248(c23195.f75265);
        mo7248(c23195.f75268);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        C22489 c224810 = this.f8410;
        try {
            this.f8410 = c22489;
            int i = 0;
            for (C6656 c6656 : c22489.f73410) {
                if (!c6656.f22476.f70566.isEmpty()) {
                    C10935 c10935M27432 = C10935.m27432(C10935.f37179, c22489, i, c6656.f22477.f30189);
                    this.f8413 = this.f8413.m48597(c6656);
                    try {
                        if (!c6656.m18038()) {
                            AbstractC5930 abstractC5930 = c6656.f22477;
                            C6263 c6263 = c6656.f22475;
                            m7244(abstractC5930, c6263.f77449, c6263, c10935M27432);
                        }
                        m7247();
                    } catch (Throwable th) {
                        m7247();
                        throw th;
                    }
                }
                i++;
            }
            mo7248(c22489.f73408);
            m49334(c22489.f73410);
            this.f8410 = c224810;
        } catch (Throwable th2) {
            this.f8410 = c224810;
            throw th2;
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        C6263 c6263;
        boolean zIsEmpty = c6656.f22476.f70566.isEmpty();
        boolean z = this.f8409;
        if (!zIsEmpty) {
            C6263 c6264 = c6656.f22475;
            if (c6264 == null) {
                C6171.m17174("Visiting tree node before memberEnter");
                throw null;
            }
            if (c6264.mo17325() != EnumC1923.PARAMETER) {
                if (c6656.f22475.mo17325() == EnumC1923.FIELD) {
                    if (z) {
                        C10935 c10935M27435 = C10935.m27435(C10935.f37179, null, c6656.f30189);
                        AbstractC5930 abstractC5930 = c6656.f22477;
                        C6263 c6265 = c6656.f22475;
                        m7244(abstractC5930, c6265.f77449, c6265, c10935M27435);
                    }
                } else if (c6656.f22475.mo17325() == EnumC1923.LOCAL_VARIABLE) {
                    C10935 c10935M27431 = C10935.m27431(C10935.f37179, this.f8410, c6656.f30189);
                    if (!c6656.m18038()) {
                        AbstractC5930 abstractC5931 = c6656.f22477;
                        C6263 c6266 = c6656.f22475;
                        m7244(abstractC5931, c6266.f77449, c6266, c10935M27431);
                    }
                } else if (c6656.f22475.mo17325() == EnumC1923.BINDING_VARIABLE) {
                    C10935 c10935M27432 = C10935.m27431(C10935.f37179, this.f8410, c6656.f30189);
                    AbstractC5930 abstractC5932 = c6656.f22477;
                    C6263 c6267 = c6656.f22475;
                    m7244(abstractC5932, c6267.f77449, c6267, c10935M27432);
                } else if (c6656.f22475.mo17325() == EnumC1923.EXCEPTION_PARAMETER) {
                    C10935 c10935M27439 = C10935.m27439(C10935.f37179, this.f8410, c6656.f30189);
                    AbstractC5930 abstractC5933 = c6656.f22477;
                    C6263 c6268 = c6656.f22475;
                    m7244(abstractC5933, c6268.f77449, c6268, c10935M27439);
                } else if (c6656.f22475.mo17325() == EnumC1923.RESOURCE_VARIABLE) {
                    C10935 c10935M27433 = C10935.m27433(C10935.f37179, this.f8410, c6656.f30189);
                    AbstractC5930 abstractC5934 = c6656.f22477;
                    C6263 c6269 = c6656.f22475;
                    m7244(abstractC5934, c6269.f77449, c6269, c10935M27433);
                } else if (c6656.f22475.mo17325() != EnumC1923.ENUM_CONSTANT) {
                    C6171.m17174("Unhandled variable kind: " + c6656.f22475.mo17325());
                    throw null;
                }
            }
        }
        mo7248(c6656.f22476);
        mo7248(c6656.f22477);
        if (!z) {
            mo7248(c6656.f22481);
        }
        if (z && (c6263 = c6656.f22475) != null && c6263.mo17325() == EnumC1923.FIELD) {
            C6263 c62610 = c6656.f22475;
            if ((c62610.f77447 & 2305843009213693952L) != 0) {
                C16142 c16142M49998 = ((C22492) c62610.f77448).m49998(c62610);
                c16142M49998.m52712(c6656.f22475.mo50009());
                c16142M49998.f77449 = c6656.f22475.f77449;
            }
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3955(C21452 c21452) {
        if (this.f8409) {
            return;
        }
        m49334(c21452.f69737);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        C22492 c22492;
        C8753 c8753 = c8378.f29098;
        if (c8753 != null && (c22492 = c8753.f30086) != null) {
            AbstractC16579 abstractC16579 = c22492.f77448.m52720().f77449;
            C19003 c19003 = new C19003();
            m7242(abstractC16579, c19003);
            c19003.m43723(C17284.f55036);
            C10935 c10935M27426 = C10935.m27426(c19003.m43726(), null, c8378.f30189);
            C19003 c19004 = new C19003();
            AbstractC16579 abstractC165710 = c8378.f29095.f30190;
            C19003 c19005 = new C19003();
            m7242(abstractC165710, c19005);
            C21825 c21825M43726 = c19005.m43726();
            for (C13278 c13278 : c22492.mo50009()) {
                if (c13278.f39811.f37184.equals(c21825M43726)) {
                    c19004.m43723(new C13278(c13278.f75167, c13278.f39809, c10935M27426));
                }
            }
            c22492.f77448.m52699(c19004.m43726());
        }
        mo7248(c8378.f29093);
        m49334(c8378.f29096);
        if (c8378.f29098 == null) {
            mo7248(c8378.f29095);
        }
        m49334(c8378.f29099);
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3953(C18961 c18961) {
        m7243(c18961, c18961, c18961.f61400);
        int iM48596 = c18961.f61401.m48596();
        C19003 c19003 = new C19003();
        for (int i = 0; i < iM48596; i++) {
            C19003 c19004 = new C19003();
            if (i != 0) {
                c19003.m43723(C17284.f55038);
                c19004.m43725(c19003.m43726());
            }
            m7245((C21825) c18961.f61401.get(i), C10935.m27426(c19004.m43726(), this.f8410, c18961.f30189));
        }
        AbstractC5930 abstractC5930 = c18961.f61402;
        c19003.m43723(C17284.f55038);
        while (abstractC5930 != null) {
            if (abstractC5930.m22847(EnumC18651.f60535)) {
                C2401 c2401 = (C2401) abstractC5930;
                AbstractC16579 abstractC16579 = abstractC5930.f30190;
                C19003 c19005 = new C19003();
                m7242(abstractC16579, c19005);
                m7245(c2401.f9658, C10935.m27426(c19005.m43726().m48594(c19003.m43726()), this.f8410, c18961.f30189));
                abstractC5930 = c2401.f9659;
            } else if (abstractC5930.m22847(EnumC18651.f60566)) {
                c19003.m43723(C17284.f55038);
                abstractC5930 = ((C0990) abstractC5930).f4638;
            } else if (!abstractC5930.m22847(EnumC18651.f60473)) {
                break;
            } else {
                abstractC5930 = ((C23570) abstractC5930).f76357;
            }
        }
        m49334(c18961.f61399);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m7243(AbstractC8774 abstractC8774, AbstractC8774 abstractC8775, C21825 c21825) {
        if (c21825.isEmpty()) {
            return;
        }
        m7245(c21825, m7240(abstractC8774, abstractC8775, this.f8413, this.f8410, 0, new C19003()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7245(C21825 c21825, C10935 c10935) {
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C11867 c11867 = ((C5224) it.next()).f18119;
            if (c11867 != null) {
                ((C13278) c11867).f39811 = c10935;
            }
        }
    }

    public final String toString() {
        return super.toString() + ": sigOnly: " + this.f8409;
    }

    public C2383(C5206 c5206, boolean z) {
        this.f8411 = c5206;
        this.f8409 = z;
    }
}
