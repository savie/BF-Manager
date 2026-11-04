package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J16Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C15821 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19551 f51459 = new C19551();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37748(C10445 c10445, InterfaceC15075 interfaceC15075, boolean z) {
        C0751 c0751;
        C0751 c0752;
        C0751 c0753;
        C0751 c0754;
        C0751 c0755;
        if (!(c10445 instanceof C1497) && c10445.m26801() && m37749(c10445)) {
            C1497.m5330(c10445, interfaceC15075, new C19551());
        }
        C0751 c0751Mo20495 = c10445.mo20495(EnumC18650.LEFT);
        C0751 c0751Mo20496 = c10445.mo20495(EnumC18650.RIGHT);
        int iM3114 = c0751Mo20495.m3114();
        int iM3115 = c0751Mo20496.m3114();
        char c = 0;
        if (c0751Mo20495.m3101() != null && c0751Mo20495.m3107()) {
            for (C0751 c0756 : c0751Mo20495.m3101()) {
                C10445 c10446 = c0756.f2747;
                boolean zM37749 = m37749(c10446);
                C0751 c0757 = c10446.f33212;
                C0751 c0758 = c10446.f33248;
                if (c10446.m26801() && zM37749) {
                    C1497.m5330(c10446, interfaceC15075, new C19551());
                }
                EnumC19396 enumC19396 = c10446.f33210[c];
                EnumC19396 enumC19397 = EnumC19396.MATCH_CONSTRAINT;
                if (enumC19396 != enumC19397 || zM37749) {
                    if (!c10446.m26801()) {
                        if (c0756 == c0757 && c0758.f2744 == null) {
                            int iM3108 = c0757.m3108() + iM3114;
                            c10446.m26809(iM3108, c10446.m26806() + iM3108);
                            m37748(c10446, interfaceC15075, z);
                        } else if (c0756 == c0758 && c0757.f2744 == null) {
                            int iM3109 = iM3114 - c0758.m3108();
                            c10446.m26809(iM3109 - c10446.m26806(), iM3109);
                            m37748(c10446, interfaceC15075, z);
                        } else if (c0756 == c0757 && (c0753 = c0758.f2744) != null && c0753.m3107() && !c10446.m26800()) {
                            m37751(c10446, interfaceC15075, z);
                        }
                    }
                } else if (enumC19396 == enumC19397 && c10446.f33201 >= 0 && c10446.f33215 >= 0 && ((c10446.m26870() == 8 || (c10446.f33206 == 0 && c10446.f33239 == 0.0f)) && !c10446.m26800() && !c10446.m26828() && (((c0756 == c0757 && (c0755 = c0758.f2744) != null && c0755.m3107()) || (c0756 == c0758 && (c0754 = c0757.f2744) != null && c0754.m3107())) && !c10446.m26800()))) {
                    m37747(c10445, interfaceC15075, c10446, z);
                }
                c = 0;
            }
        }
        if ((c10445 instanceof C7463) || c0751Mo20496.m3101() == null || !c0751Mo20496.m3107()) {
            return;
        }
        for (C0751 c0759 : c0751Mo20496.m3101()) {
            C10445 c10447 = c0759.f2747;
            boolean zM377410 = m37749(c10447);
            C0751 c07510 = c10447.f33212;
            C0751 c07511 = c10447.f33248;
            if (c10447.m26801() && zM377410) {
                C1497.m5330(c10447, interfaceC15075, new C19551());
            }
            boolean z2 = (c0759 == c07510 && (c0752 = c07511.f2744) != null && c0752.m3107()) || (c0759 == c07511 && (c0751 = c07510.f2744) != null && c0751.m3107());
            EnumC19396 enumC19398 = c10447.f33210[0];
            EnumC19396 enumC19399 = EnumC19396.MATCH_CONSTRAINT;
            if (enumC19398 != enumC19399 || zM377410) {
                if (!c10447.m26801()) {
                    if (c0759 == c07510 && c07511.f2744 == null) {
                        int iM31010 = c07510.m3108() + iM3115;
                        c10447.m26809(iM31010, c10447.m26806() + iM31010);
                        m37748(c10447, interfaceC15075, z);
                    } else if (c0759 == c07511 && c07510.f2744 == null) {
                        int iM31011 = iM3115 - c07511.m3108();
                        c10447.m26809(iM31011 - c10447.m26806(), iM31011);
                        m37748(c10447, interfaceC15075, z);
                    } else if (z2 && !c10447.m26800()) {
                        m37751(c10447, interfaceC15075, z);
                    }
                }
            } else if (enumC19398 == enumC19399 && c10447.f33201 >= 0 && c10447.f33215 >= 0 && (c10447.m26870() == 8 || (c10447.f33206 == 0 && c10447.f33239 == 0.0f))) {
                if (!c10447.m26800() && !c10447.m26828() && z2 && !c10447.m26800()) {
                    m37747(c10445, interfaceC15075, c10447, z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37750(C10445 c10445, InterfaceC15075 interfaceC15075) {
        C0751 c0751;
        C0751 c0752;
        C0751 c0753;
        C0751 c0754;
        C0751 c0755;
        if (!(c10445 instanceof C1497) && c10445.m26801() && m37749(c10445)) {
            C1497.m5330(c10445, interfaceC15075, new C19551());
        }
        C0751 c0751Mo20495 = c10445.mo20495(EnumC18650.TOP);
        C0751 c0751Mo20496 = c10445.mo20495(EnumC18650.BOTTOM);
        int iM3114 = c0751Mo20495.m3114();
        int iM3115 = c0751Mo20496.m3114();
        if (c0751Mo20495.m3101() != null && c0751Mo20495.m3107()) {
            for (C0751 c0756 : c0751Mo20495.m3101()) {
                C10445 c10446 = c0756.f2747;
                boolean zM37749 = m37749(c10446);
                C0751 c0757 = c10446.f33197;
                C0751 c0758 = c10446.f33216;
                if (c10446.m26801() && zM37749) {
                    C1497.m5330(c10446, interfaceC15075, new C19551());
                }
                EnumC19396 enumC19396 = c10446.f33210[1];
                EnumC19396 enumC19397 = EnumC19396.MATCH_CONSTRAINT;
                if (enumC19396 != enumC19397 || zM37749) {
                    if (!c10446.m26801()) {
                        if (c0756 == c0757 && c0758.f2744 == null) {
                            int iM3108 = c0757.m3108() + iM3114;
                            c10446.m26860(iM3108, c10446.m26823() + iM3108);
                            m37750(c10446, interfaceC15075);
                        } else if (c0756 == c0758 && c0758.f2744 == null) {
                            int iM3109 = iM3114 - c0758.m3108();
                            c10446.m26860(iM3109 - c10446.m26823(), iM3109);
                            m37750(c10446, interfaceC15075);
                        } else if (c0756 == c0757 && (c0753 = c0758.f2744) != null && c0753.m3107()) {
                            m37745(c10446, interfaceC15075);
                        }
                    }
                } else if (enumC19396 == enumC19397 && c10446.f33222 >= 0 && c10446.f33244 >= 0 && (c10446.m26870() == 8 || (c10446.f33209 == 0 && c10446.f33239 == 0.0f))) {
                    if (!c10446.m26850() && !c10446.m26828() && ((c0756 == c0757 && (c0755 = c0758.f2744) != null && c0755.m3107()) || (c0756 == c0758 && (c0754 = c0757.f2744) != null && c0754.m3107()))) {
                        if (!c10446.m26850()) {
                            m37746(c10445, interfaceC15075, c10446);
                        }
                    }
                }
            }
        }
        if (c10445 instanceof C7463) {
            return;
        }
        if (c0751Mo20496.m3101() != null && c0751Mo20496.m3107()) {
            for (C0751 c0759 : c0751Mo20496.m3101()) {
                C10445 c10447 = c0759.f2747;
                boolean zM377410 = m37749(c10447);
                C0751 c07510 = c10447.f33197;
                C0751 c07511 = c10447.f33216;
                if (c10447.m26801() && zM377410) {
                    C1497.m5330(c10447, interfaceC15075, new C19551());
                }
                boolean z = (c0759 == c07510 && (c0752 = c07511.f2744) != null && c0752.m3107()) || (c0759 == c07511 && (c0751 = c07510.f2744) != null && c0751.m3107());
                EnumC19396 enumC19398 = c10447.f33210[1];
                EnumC19396 enumC19399 = EnumC19396.MATCH_CONSTRAINT;
                if (enumC19398 != enumC19399 || zM377410) {
                    if (!c10447.m26801()) {
                        if (c0759 == c07510 && c07511.f2744 == null) {
                            int iM31010 = c07510.m3108() + iM3115;
                            c10447.m26860(iM31010, c10447.m26823() + iM31010);
                            m37750(c10447, interfaceC15075);
                        } else if (c0759 == c07511 && c07510.f2744 == null) {
                            int iM31011 = iM3115 - c07511.m3108();
                            c10447.m26860(iM31011 - c10447.m26823(), iM31011);
                            m37750(c10447, interfaceC15075);
                        } else if (z && !c10447.m26850()) {
                            m37745(c10447, interfaceC15075);
                        }
                    }
                } else if (enumC19398 == enumC19399 && c10447.f33222 >= 0 && c10447.f33244 >= 0 && (c10447.m26870() == 8 || (c10447.f33209 == 0 && c10447.f33239 == 0.0f))) {
                    if (!c10447.m26850() && !c10447.m26828() && z && !c10447.m26850()) {
                        m37746(c10445, interfaceC15075, c10447);
                    }
                }
            }
        }
        C0751 c0751Mo20497 = c10445.mo20495(EnumC18650.BASELINE);
        if (c0751Mo20497.m3101() == null || !c0751Mo20497.m3107()) {
            return;
        }
        int iM3116 = c0751Mo20497.m3114();
        for (C0751 c07512 : c0751Mo20497.m3101()) {
            C10445 c10448 = c07512.f2747;
            boolean zM377411 = m37749(c10448);
            if (c10448.m26801() && zM377411) {
                C1497.m5330(c10448, interfaceC15075, new C19551());
            }
            if (c10448.f33210[1] != EnumC19396.MATCH_CONSTRAINT || zM377411) {
                if (!c10448.m26801() && c07512 == c10448.f33202) {
                    c10448.m26838(iM3116);
                    m37750(c10448, interfaceC15075);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m37751(C10445 c10445, InterfaceC15075 interfaceC15075, boolean z) {
        float fM26802 = c10445.m26802();
        C0751 c0751 = c10445.f33212;
        int iM3114 = c0751.f2744.m3114();
        C0751 c0752 = c10445.f33248;
        int iM3115 = c0752.f2744.m3114();
        int iM3108 = c0751.m3108() + iM3114;
        int iM3109 = iM3115 - c0752.m3108();
        if (iM3114 == iM3115) {
            fM26802 = 0.5f;
        } else {
            iM3114 = iM3108;
            iM3115 = iM3109;
        }
        int iM26806 = c10445.m26806();
        int i = (iM3115 - iM3114) - iM26806;
        if (iM3114 > iM3115) {
            i = (iM3114 - iM3115) - iM26806;
        }
        int i2 = ((int) ((fM26802 * i) + 0.5f)) + iM3114;
        int i3 = i2 + iM26806;
        if (iM3114 > iM3115) {
            i3 = i2 - iM26806;
        }
        c10445.m26809(i2, i3);
        m37748(c10445, interfaceC15075, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37745(C10445 c10445, InterfaceC15075 interfaceC15075) {
        float fM26835 = c10445.m26835();
        C0751 c0751 = c10445.f33197;
        int iM3114 = c0751.f2744.m3114();
        C0751 c0752 = c10445.f33216;
        int iM3115 = c0752.f2744.m3114();
        int iM3108 = c0751.m3108() + iM3114;
        int iM3109 = iM3115 - c0752.m3108();
        if (iM3114 == iM3115) {
            fM26835 = 0.5f;
        } else {
            iM3114 = iM3108;
            iM3115 = iM3109;
        }
        int iM26823 = c10445.m26823();
        int i = (iM3115 - iM3114) - iM26823;
        if (iM3114 > iM3115) {
            i = (iM3114 - iM3115) - iM26823;
        }
        int i2 = (int) ((fM26835 * i) + 0.5f);
        int i3 = iM3114 + i2;
        int i4 = i3 + iM26823;
        if (iM3114 > iM3115) {
            i3 = iM3114 - i2;
            i4 = i3 - iM26823;
        }
        c10445.m26860(i3, i4);
        m37750(c10445, interfaceC15075);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37747(C10445 c10445, InterfaceC15075 interfaceC15075, C10445 c10446, boolean z) {
        int iM26806;
        float fM26802 = c10446.m26802();
        C0751 c0751 = c10446.f33212;
        int iM3108 = c0751.m3108() + c0751.f2744.m3114();
        C0751 c0752 = c10446.f33248;
        int iM3114 = c0752.f2744.m3114() - c0752.m3108();
        if (iM3114 >= iM3108) {
            int iM26807 = c10446.m26806();
            if (c10446.m26870() != 8) {
                int i = c10446.f33206;
                if (i == 2) {
                    if (c10445 instanceof C1497) {
                        iM26806 = c10445.m26806();
                    } else {
                        iM26806 = c10445.f33252.m26806();
                    }
                    iM26807 = (int) (c10446.m26802() * 0.5f * iM26806);
                } else if (i == 0) {
                    iM26807 = iM3114 - iM3108;
                }
                iM26807 = Math.max(c10446.f33215, iM26807);
                int i2 = c10446.f33201;
                if (i2 > 0) {
                    iM26807 = Math.min(i2, iM26807);
                }
            }
            int i3 = iM3108 + ((int) ((fM26802 * ((iM3114 - iM3108) - iM26807)) + 0.5f));
            c10446.m26809(i3, iM26807 + i3);
            m37748(c10446, interfaceC15075, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37746(C10445 c10445, InterfaceC15075 interfaceC15075, C10445 c10446) {
        int iM26823;
        float fM26835 = c10446.m26835();
        C0751 c0751 = c10446.f33197;
        int iM3108 = c0751.m3108() + c0751.f2744.m3114();
        C0751 c0752 = c10446.f33216;
        int iM3114 = c0752.f2744.m3114() - c0752.m3108();
        if (iM3114 >= iM3108) {
            int iM26824 = c10446.m26823();
            if (c10446.m26870() != 8) {
                int i = c10446.f33209;
                if (i == 2) {
                    if (c10445 instanceof C1497) {
                        iM26823 = c10445.m26823();
                    } else {
                        iM26823 = c10445.f33252.m26823();
                    }
                    iM26824 = (int) (fM26835 * 0.5f * iM26823);
                } else if (i == 0) {
                    iM26824 = iM3114 - iM3108;
                }
                iM26824 = Math.max(c10446.f33244, iM26824);
                int i2 = c10446.f33222;
                if (i2 > 0) {
                    iM26824 = Math.min(i2, iM26824);
                }
            }
            int i3 = iM3108 + ((int) ((fM26835 * ((iM3114 - iM3108) - iM26824)) + 0.5f));
            c10446.m26860(i3, iM26824 + i3);
            m37750(c10446, interfaceC15075);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37744(C1497 c1497, InterfaceC15075 interfaceC15075) {
        EnumC19396[] enumC19396Arr = c1497.f33210;
        EnumC19396 enumC19396 = enumC19396Arr[0];
        EnumC19396 enumC19397 = enumC19396Arr[1];
        c1497.m26839();
        ArrayList arrayList = c1497.f33652;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C10445) arrayList.get(i)).m26839();
        }
        boolean zM5345 = c1497.m5345();
        if (enumC19396 == EnumC19396.FIXED) {
            c1497.m26809(0, c1497.m26806());
        } else {
            c1497.m26822();
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C10445 c10445 = (C10445) arrayList.get(i2);
            if (c10445 instanceof C7463) {
                C7463 c7463 = (C7463) c10445;
                if (c7463.m20502() == 1) {
                    if (c7463.m20497() != -1) {
                        c7463.m20498(c7463.m20497());
                    } else if (c7463.m20492() != -1 && c1497.mo20499()) {
                        c7463.m20498(c1497.m26806() - c7463.m20492());
                    } else if (c1497.mo20499()) {
                        c7463.m20498((int) ((c7463.m20501() * c1497.m26806()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((c10445 instanceof C24618) && ((C24618) c10445).m54950() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C10445 c10446 = (C10445) arrayList.get(i3);
                if (c10446 instanceof C7463) {
                    C7463 c7464 = (C7463) c10446;
                    if (c7464.m20502() == 1) {
                        m37748(c7464, interfaceC15075, zM5345);
                    }
                }
            }
        }
        m37748(c1497, interfaceC15075, zM5345);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C10445 c10447 = (C10445) arrayList.get(i4);
                if (c10447 instanceof C24618) {
                    C24618 c24618 = (C24618) c10447;
                    if (c24618.m54950() == 0 && c24618.m54947()) {
                        m37748(c24618, interfaceC15075, zM5345);
                    }
                }
            }
        }
        if (enumC19397 == EnumC19396.FIXED) {
            c1497.m26860(0, c1497.m26823());
        } else {
            c1497.m26863();
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C10445 c10448 = (C10445) arrayList.get(i5);
            if (c10448 instanceof C7463) {
                C7463 c7465 = (C7463) c10448;
                if (c7465.m20502() == 0) {
                    if (c7465.m20497() != -1) {
                        c7465.m20498(c7465.m20497());
                    } else if (c7465.m20492() != -1 && c1497.mo20493()) {
                        c7465.m20498(c1497.m26823() - c7465.m20492());
                    } else if (c1497.mo20493()) {
                        c7465.m20498((int) ((c7465.m20501() * c1497.m26823()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((c10448 instanceof C24618) && ((C24618) c10448).m54950() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C10445 c10449 = (C10445) arrayList.get(i6);
                if (c10449 instanceof C7463) {
                    C7463 c7466 = (C7463) c10449;
                    if (c7466.m20502() == 0) {
                        m37750(c7466, interfaceC15075);
                    }
                }
            }
        }
        m37750(c1497, interfaceC15075);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                C10445 c104410 = (C10445) arrayList.get(i7);
                if (c104410 instanceof C24618) {
                    C24618 c24619 = (C24618) c104410;
                    if (c24619.m54950() == 1 && c24619.m54947()) {
                        m37750(c24619, interfaceC15075);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C10445 c104411 = (C10445) arrayList.get(i8);
            if (c104411.m26801() && m37749(c104411)) {
                C1497.m5330(c104411, interfaceC15075, f51459);
                m37748(c104411, interfaceC15075, zM5345);
                m37750(c104411, interfaceC15075);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37749(C10445 c10445) {
        EnumC19396[] enumC19396Arr = c10445.f33210;
        EnumC19396 enumC19396 = enumC19396Arr[0];
        EnumC19396 enumC19397 = enumC19396Arr[1];
        C10445 c10446 = c10445.f33252;
        C1497 c1497 = c10446 != null ? (C1497) c10446 : null;
        if (c1497 != null) {
            EnumC19396 enumC19398 = c1497.f33210[0];
            EnumC19396 enumC19399 = EnumC19396.FIXED;
        }
        if (c1497 != null) {
            EnumC19396 enumC193910 = c1497.f33210[1];
            EnumC19396 enumC193911 = EnumC19396.FIXED;
        }
        EnumC19396 enumC193912 = EnumC19396.FIXED;
        boolean z = enumC19396 == enumC193912 || enumC19396 == EnumC19396.WRAP_CONTENT || (enumC19396 == EnumC19396.MATCH_CONSTRAINT && c10445.f33206 == 0 && c10445.f33239 == 0.0f && c10445.m26852(0)) || c10445.mo20499();
        boolean z2 = enumC19397 == enumC193912 || enumC19397 == EnumC19396.WRAP_CONTENT || (enumC19397 == EnumC19396.MATCH_CONSTRAINT && c10445.f33209 == 0 && c10445.f33239 == 0.0f && c10445.m26852(1)) || c10445.mo20493();
        return (c10445.f33239 > 0.0f && (z || z2)) || (z && z2);
    }
}
