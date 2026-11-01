package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J16Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C1356 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1668 f5689 = new C1668();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4794(C20719 c20719, InterfaceC9431 interfaceC9431, boolean z) {
        C8725 c8725;
        C8725 c8726;
        C8725 c8727;
        C8725 c8728;
        C8725 c8729;
        if (!(c20719 instanceof C15781) && c20719.m46613() && m4795(c20719)) {
            C15781.m37521(c20719, interfaceC9431, new C1668());
        }
        C8725 c8725Mo30461 = c20719.mo30461(EnumC19308.LEFT);
        C8725 c8725Mo30462 = c20719.mo30461(EnumC19308.RIGHT);
        int iM22579 = c8725Mo30461.m22579();
        int iM225710 = c8725Mo30462.m22579();
        char c = 0;
        if (c8725Mo30461.m22569() != null && c8725Mo30461.m22578()) {
            for (C8725 c87210 : c8725Mo30461.m22569()) {
                C20719 c207110 = c87210.f29983;
                boolean zM4795 = m4795(c207110);
                C8725 c87211 = c207110.f67385;
                C8725 c87212 = c207110.f67421;
                if (c207110.m46613() && zM4795) {
                    C15781.m37521(c207110, interfaceC9431, new C1668());
                }
                EnumC7313 enumC7313 = c207110.f67434[c];
                EnumC7313 enumC7314 = EnumC7313.MATCH_CONSTRAINT;
                if (enumC7313 != enumC7314 || zM4795) {
                    if (!c207110.m46613()) {
                        if (c87210 == c87211 && c87212.f29981 == null) {
                            int iM22577 = c87211.m22577() + iM22579;
                            c207110.m46586(iM22577, c207110.m46640() + iM22577);
                            m4794(c207110, interfaceC9431, z);
                        } else if (c87210 == c87212 && c87211.f29981 == null) {
                            int iM22578 = iM22579 - c87212.m22577();
                            c207110.m46586(iM22578 - c207110.m46640(), iM22578);
                            m4794(c207110, interfaceC9431, z);
                        } else if (c87210 == c87211 && (c8727 = c87212.f29981) != null && c8727.m22578() && !c207110.m46631()) {
                            m4797(c207110, interfaceC9431, z);
                        }
                    }
                } else if (enumC7313 == enumC7314 && c207110.f67382 >= 0 && c207110.f67401 >= 0 && ((c207110.m46606() == 8 || (c207110.f67395 == 0 && c207110.f67422 == 0.0f)) && !c207110.m46631() && !c207110.m46603() && (((c87210 == c87211 && (c8729 = c87212.f29981) != null && c8729.m22578()) || (c87210 == c87212 && (c8728 = c87211.f29981) != null && c8728.m22578())) && !c207110.m46631()))) {
                    m4793(c20719, interfaceC9431, c207110, z);
                }
                c = 0;
            }
        }
        if ((c20719 instanceof C12253) || c8725Mo30462.m22569() == null || !c8725Mo30462.m22578()) {
            return;
        }
        for (C8725 c87213 : c8725Mo30462.m22569()) {
            C20719 c207111 = c87213.f29983;
            boolean zM4796 = m4795(c207111);
            C8725 c87214 = c207111.f67385;
            C8725 c87215 = c207111.f67421;
            if (c207111.m46613() && zM4796) {
                C15781.m37521(c207111, interfaceC9431, new C1668());
            }
            boolean z2 = (c87213 == c87214 && (c8726 = c87215.f29981) != null && c8726.m22578()) || (c87213 == c87215 && (c8725 = c87214.f29981) != null && c8725.m22578());
            EnumC7313 enumC7315 = c207111.f67434[0];
            EnumC7313 enumC7316 = EnumC7313.MATCH_CONSTRAINT;
            if (enumC7315 != enumC7316 || zM4796) {
                if (!c207111.m46613()) {
                    if (c87213 == c87214 && c87215.f29981 == null) {
                        int iM225711 = c87214.m22577() + iM225710;
                        c207111.m46586(iM225711, c207111.m46640() + iM225711);
                        m4794(c207111, interfaceC9431, z);
                    } else if (c87213 == c87215 && c87214.f29981 == null) {
                        int iM225712 = iM225710 - c87215.m22577();
                        c207111.m46586(iM225712 - c207111.m46640(), iM225712);
                        m4794(c207111, interfaceC9431, z);
                    } else if (z2 && !c207111.m46631()) {
                        m4797(c207111, interfaceC9431, z);
                    }
                }
            } else if (enumC7315 == enumC7316 && c207111.f67382 >= 0 && c207111.f67401 >= 0 && (c207111.m46606() == 8 || (c207111.f67395 == 0 && c207111.f67422 == 0.0f))) {
                if (!c207111.m46631() && !c207111.m46603() && z2 && !c207111.m46631()) {
                    m4793(c20719, interfaceC9431, c207111, z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m4796(C20719 c20719, InterfaceC9431 interfaceC9431) {
        C8725 c8725;
        C8725 c8726;
        C8725 c8727;
        C8725 c8728;
        C8725 c8729;
        if (!(c20719 instanceof C15781) && c20719.m46613() && m4795(c20719)) {
            C15781.m37521(c20719, interfaceC9431, new C1668());
        }
        C8725 c8725Mo30461 = c20719.mo30461(EnumC19308.TOP);
        C8725 c8725Mo30462 = c20719.mo30461(EnumC19308.BOTTOM);
        int iM22579 = c8725Mo30461.m22579();
        int iM225710 = c8725Mo30462.m22579();
        if (c8725Mo30461.m22569() != null && c8725Mo30461.m22578()) {
            for (C8725 c87210 : c8725Mo30461.m22569()) {
                C20719 c207110 = c87210.f29983;
                boolean zM4795 = m4795(c207110);
                C8725 c87211 = c207110.f67392;
                C8725 c87212 = c207110.f67387;
                if (c207110.m46613() && zM4795) {
                    C15781.m37521(c207110, interfaceC9431, new C1668());
                }
                EnumC7313 enumC7313 = c207110.f67434[1];
                EnumC7313 enumC7314 = EnumC7313.MATCH_CONSTRAINT;
                if (enumC7313 != enumC7314 || zM4795) {
                    if (!c207110.m46613()) {
                        if (c87210 == c87211 && c87212.f29981 == null) {
                            int iM22577 = c87211.m22577() + iM22579;
                            c207110.m46624(iM22577, c207110.m46619() + iM22577);
                            m4796(c207110, interfaceC9431);
                        } else if (c87210 == c87212 && c87212.f29981 == null) {
                            int iM22578 = iM22579 - c87212.m22577();
                            c207110.m46624(iM22578 - c207110.m46619(), iM22578);
                            m4796(c207110, interfaceC9431);
                        } else if (c87210 == c87211 && (c8727 = c87212.f29981) != null && c8727.m22578()) {
                            m4791(c207110, interfaceC9431);
                        }
                    }
                } else if (enumC7313 == enumC7314 && c207110.f67378 >= 0 && c207110.f67407 >= 0 && (c207110.m46606() == 8 || (c207110.f67375 == 0 && c207110.f67422 == 0.0f))) {
                    if (!c207110.m46632() && !c207110.m46603() && ((c87210 == c87211 && (c8729 = c87212.f29981) != null && c8729.m22578()) || (c87210 == c87212 && (c8728 = c87211.f29981) != null && c8728.m22578()))) {
                        if (!c207110.m46632()) {
                            m4792(c20719, interfaceC9431, c207110);
                        }
                    }
                }
            }
        }
        if (c20719 instanceof C12253) {
            return;
        }
        if (c8725Mo30462.m22569() != null && c8725Mo30462.m22578()) {
            for (C8725 c87213 : c8725Mo30462.m22569()) {
                C20719 c207111 = c87213.f29983;
                boolean zM4796 = m4795(c207111);
                C8725 c87214 = c207111.f67392;
                C8725 c87215 = c207111.f67387;
                if (c207111.m46613() && zM4796) {
                    C15781.m37521(c207111, interfaceC9431, new C1668());
                }
                boolean z = (c87213 == c87214 && (c8726 = c87215.f29981) != null && c8726.m22578()) || (c87213 == c87215 && (c8725 = c87214.f29981) != null && c8725.m22578());
                EnumC7313 enumC7315 = c207111.f67434[1];
                EnumC7313 enumC7316 = EnumC7313.MATCH_CONSTRAINT;
                if (enumC7315 != enumC7316 || zM4796) {
                    if (!c207111.m46613()) {
                        if (c87213 == c87214 && c87215.f29981 == null) {
                            int iM225711 = c87214.m22577() + iM225710;
                            c207111.m46624(iM225711, c207111.m46619() + iM225711);
                            m4796(c207111, interfaceC9431);
                        } else if (c87213 == c87215 && c87214.f29981 == null) {
                            int iM225712 = iM225710 - c87215.m22577();
                            c207111.m46624(iM225712 - c207111.m46619(), iM225712);
                            m4796(c207111, interfaceC9431);
                        } else if (z && !c207111.m46632()) {
                            m4791(c207111, interfaceC9431);
                        }
                    }
                } else if (enumC7315 == enumC7316 && c207111.f67378 >= 0 && c207111.f67407 >= 0 && (c207111.m46606() == 8 || (c207111.f67375 == 0 && c207111.f67422 == 0.0f))) {
                    if (!c207111.m46632() && !c207111.m46603() && z && !c207111.m46632()) {
                        m4792(c20719, interfaceC9431, c207111);
                    }
                }
            }
        }
        C8725 c8725Mo30463 = c20719.mo30461(EnumC19308.BASELINE);
        if (c8725Mo30463.m22569() == null || !c8725Mo30463.m22578()) {
            return;
        }
        int iM225713 = c8725Mo30463.m22579();
        for (C8725 c87216 : c8725Mo30463.m22569()) {
            C20719 c207112 = c87216.f29983;
            boolean zM4797 = m4795(c207112);
            if (c207112.m46613() && zM4797) {
                C15781.m37521(c207112, interfaceC9431, new C1668());
            }
            if (c207112.f67434[1] != EnumC7313.MATCH_CONSTRAINT || zM4797) {
                if (!c207112.m46613() && c87216 == c207112.f67404) {
                    c207112.m46576(iM225713);
                    m4796(c207112, interfaceC9431);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m4797(C20719 c20719, InterfaceC9431 interfaceC9431, boolean z) {
        float fM46582 = c20719.m46582();
        C8725 c8725 = c20719.f67385;
        int iM22579 = c8725.f29981.m22579();
        C8725 c8726 = c20719.f67421;
        int iM225710 = c8726.f29981.m22579();
        int iM22577 = c8725.m22577() + iM22579;
        int iM22578 = iM225710 - c8726.m22577();
        if (iM22579 == iM225710) {
            fM46582 = 0.5f;
        } else {
            iM22579 = iM22577;
            iM225710 = iM22578;
        }
        int iM46640 = c20719.m46640();
        int i = (iM225710 - iM22579) - iM46640;
        if (iM22579 > iM225710) {
            i = (iM22579 - iM225710) - iM46640;
        }
        int i2 = ((int) ((fM46582 * i) + 0.5f)) + iM22579;
        int i3 = i2 + iM46640;
        if (iM22579 > iM225710) {
            i3 = i2 - iM46640;
        }
        c20719.m46586(i2, i3);
        m4794(c20719, interfaceC9431, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4791(C20719 c20719, InterfaceC9431 interfaceC9431) {
        float fM46609 = c20719.m46609();
        C8725 c8725 = c20719.f67392;
        int iM22579 = c8725.f29981.m22579();
        C8725 c8726 = c20719.f67387;
        int iM225710 = c8726.f29981.m22579();
        int iM22577 = c8725.m22577() + iM22579;
        int iM22578 = iM225710 - c8726.m22577();
        if (iM22579 == iM225710) {
            fM46609 = 0.5f;
        } else {
            iM22579 = iM22577;
            iM225710 = iM22578;
        }
        int iM46619 = c20719.m46619();
        int i = (iM225710 - iM22579) - iM46619;
        if (iM22579 > iM225710) {
            i = (iM22579 - iM225710) - iM46619;
        }
        int i2 = (int) ((fM46609 * i) + 0.5f);
        int i3 = iM22579 + i2;
        int i4 = i3 + iM46619;
        if (iM22579 > iM225710) {
            i3 = iM22579 - i2;
            i4 = i3 - iM46619;
        }
        c20719.m46624(i3, i4);
        m4796(c20719, interfaceC9431);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4793(C20719 c20719, InterfaceC9431 interfaceC9431, C20719 c207110, boolean z) {
        int iM46640;
        float fM46582 = c207110.m46582();
        C8725 c8725 = c207110.f67385;
        int iM22577 = c8725.m22577() + c8725.f29981.m22579();
        C8725 c8726 = c207110.f67421;
        int iM22579 = c8726.f29981.m22579() - c8726.m22577();
        if (iM22579 >= iM22577) {
            int iM46641 = c207110.m46640();
            if (c207110.m46606() != 8) {
                int i = c207110.f67395;
                if (i == 2) {
                    if (c20719 instanceof C15781) {
                        iM46640 = c20719.m46640();
                    } else {
                        iM46640 = c20719.f67433.m46640();
                    }
                    iM46641 = (int) (c207110.m46582() * 0.5f * iM46640);
                } else if (i == 0) {
                    iM46641 = iM22579 - iM22577;
                }
                iM46641 = Math.max(c207110.f67401, iM46641);
                int i2 = c207110.f67382;
                if (i2 > 0) {
                    iM46641 = Math.min(i2, iM46641);
                }
            }
            int i3 = iM22577 + ((int) ((fM46582 * ((iM22579 - iM22577) - iM46641)) + 0.5f));
            c207110.m46586(i3, iM46641 + i3);
            m4794(c207110, interfaceC9431, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4792(C20719 c20719, InterfaceC9431 interfaceC9431, C20719 c207110) {
        int iM46619;
        float fM46609 = c207110.m46609();
        C8725 c8725 = c207110.f67392;
        int iM22577 = c8725.m22577() + c8725.f29981.m22579();
        C8725 c8726 = c207110.f67387;
        int iM22579 = c8726.f29981.m22579() - c8726.m22577();
        if (iM22579 >= iM22577) {
            int iM466110 = c207110.m46619();
            if (c207110.m46606() != 8) {
                int i = c207110.f67375;
                if (i == 2) {
                    if (c20719 instanceof C15781) {
                        iM46619 = c20719.m46619();
                    } else {
                        iM46619 = c20719.f67433.m46619();
                    }
                    iM466110 = (int) (fM46609 * 0.5f * iM46619);
                } else if (i == 0) {
                    iM466110 = iM22579 - iM22577;
                }
                iM466110 = Math.max(c207110.f67407, iM466110);
                int i2 = c207110.f67378;
                if (i2 > 0) {
                    iM466110 = Math.min(i2, iM466110);
                }
            }
            int i3 = iM22577 + ((int) ((fM46609 * ((iM22579 - iM22577) - iM466110)) + 0.5f));
            c207110.m46624(i3, iM466110 + i3);
            m4796(c207110, interfaceC9431);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4790(C15781 c15781, InterfaceC9431 interfaceC9431) {
        EnumC7313[] enumC7313Arr = c15781.f67434;
        EnumC7313 enumC7313 = enumC7313Arr[0];
        EnumC7313 enumC7314 = enumC7313Arr[1];
        c15781.m46581();
        ArrayList arrayList = c15781.f76249;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C20719) arrayList.get(i)).m46581();
        }
        boolean zM37538 = c15781.m37538();
        if (enumC7313 == EnumC7313.FIXED) {
            c15781.m46586(0, c15781.m46640());
        } else {
            c15781.m46599();
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C20719 c20719 = (C20719) arrayList.get(i2);
            if (c20719 instanceof C12253) {
                C12253 c12253 = (C12253) c20719;
                if (c12253.m30459() == 1) {
                    if (c12253.m30467() != -1) {
                        c12253.m30465(c12253.m30467());
                    } else if (c12253.m30460() != -1 && c15781.mo30473()) {
                        c12253.m30465(c15781.m46640() - c12253.m30460());
                    } else if (c15781.mo30473()) {
                        c12253.m30465((int) ((c12253.m30463() * c15781.m46640()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((c20719 instanceof C21424) && ((C21424) c20719).m47999() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C20719 c207110 = (C20719) arrayList.get(i3);
                if (c207110 instanceof C12253) {
                    C12253 c12254 = (C12253) c207110;
                    if (c12254.m30459() == 1) {
                        m4794(c12254, interfaceC9431, zM37538);
                    }
                }
            }
        }
        m4794(c15781, interfaceC9431, zM37538);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C20719 c207111 = (C20719) arrayList.get(i4);
                if (c207111 instanceof C21424) {
                    C21424 c21424 = (C21424) c207111;
                    if (c21424.m47999() == 0 && c21424.m47997()) {
                        m4794(c21424, interfaceC9431, zM37538);
                    }
                }
            }
        }
        if (enumC7314 == EnumC7313.FIXED) {
            c15781.m46624(0, c15781.m46619());
        } else {
            c15781.m46627();
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C20719 c207112 = (C20719) arrayList.get(i5);
            if (c207112 instanceof C12253) {
                C12253 c12255 = (C12253) c207112;
                if (c12255.m30459() == 0) {
                    if (c12255.m30467() != -1) {
                        c12255.m30465(c12255.m30467());
                    } else if (c12255.m30460() != -1 && c15781.mo30469()) {
                        c12255.m30465(c15781.m46619() - c12255.m30460());
                    } else if (c15781.mo30469()) {
                        c12255.m30465((int) ((c12255.m30463() * c15781.m46619()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((c207112 instanceof C21424) && ((C21424) c207112).m47999() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C20719 c207113 = (C20719) arrayList.get(i6);
                if (c207113 instanceof C12253) {
                    C12253 c12256 = (C12253) c207113;
                    if (c12256.m30459() == 0) {
                        m4796(c12256, interfaceC9431);
                    }
                }
            }
        }
        m4796(c15781, interfaceC9431);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                C20719 c207114 = (C20719) arrayList.get(i7);
                if (c207114 instanceof C21424) {
                    C21424 c21425 = (C21424) c207114;
                    if (c21425.m47999() == 1 && c21425.m47997()) {
                        m4796(c21425, interfaceC9431);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C20719 c207115 = (C20719) arrayList.get(i8);
            if (c207115.m46613() && m4795(c207115)) {
                C15781.m37521(c207115, interfaceC9431, f5689);
                m4794(c207115, interfaceC9431, zM37538);
                m4796(c207115, interfaceC9431);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4795(C20719 c20719) {
        EnumC7313[] enumC7313Arr = c20719.f67434;
        EnumC7313 enumC7313 = enumC7313Arr[0];
        EnumC7313 enumC7314 = enumC7313Arr[1];
        C20719 c207110 = c20719.f67433;
        C15781 c15781 = c207110 != null ? (C15781) c207110 : null;
        if (c15781 != null) {
            EnumC7313 enumC7315 = c15781.f67434[0];
            EnumC7313 enumC7316 = EnumC7313.FIXED;
        }
        if (c15781 != null) {
            EnumC7313 enumC7317 = c15781.f67434[1];
            EnumC7313 enumC7318 = EnumC7313.FIXED;
        }
        EnumC7313 enumC7319 = EnumC7313.FIXED;
        boolean z = enumC7313 == enumC7319 || enumC7313 == EnumC7313.WRAP_CONTENT || (enumC7313 == EnumC7313.MATCH_CONSTRAINT && c20719.f67395 == 0 && c20719.f67422 == 0.0f && c20719.m46601(0)) || c20719.mo30473();
        boolean z2 = enumC7314 == enumC7319 || enumC7314 == EnumC7313.WRAP_CONTENT || (enumC7314 == EnumC7313.MATCH_CONSTRAINT && c20719.f67375 == 0 && c20719.f67422 == 0.0f && c20719.m46601(1)) || c20719.mo30469();
        return (c20719.f67422 > 0.0f && (z || z2)) || (z && z2);
    }
}
