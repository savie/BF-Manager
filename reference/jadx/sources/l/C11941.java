package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B19P */
/* JADX INFO: loaded from: classes3.dex */
public final class C11941 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C1668 f40047;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15781 f40048;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC9431 f40049;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f40050;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15781 f40052;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f40053 = true;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f40046 = true;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f40051 = new ArrayList();

    public C11941(C15781 c15781) {
        new ArrayList();
        this.f40049 = null;
        this.f40047 = new C1668();
        this.f40050 = new ArrayList();
        this.f40048 = c15781;
        this.f40052 = c15781;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29740(InterfaceC9431 interfaceC9431) {
        this.f40049 = interfaceC9431;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m29733(C15781 c15781, int i) {
        ArrayList arrayList = this.f40050;
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, ((C21818) arrayList.get(i2)).m48582(c15781, i));
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29742(boolean z) {
        boolean z2;
        boolean z3 = this.f40053;
        boolean z4 = false;
        C15781 c15781 = this.f40048;
        if (z3 || this.f40046) {
            for (C20719 c20719 : c15781.f76249) {
                c20719.m46622();
                c20719.f67403 = false;
                c20719.f67376.m37001();
                c20719.f67409.m43699();
            }
            c15781.m46622();
            c15781.f67403 = false;
            c15781.f67376.m37001();
            c15781.f67409.m43699();
            this.f40046 = false;
        }
        m29736(this.f40052);
        c15781.m46638(0);
        c15781.m46610(0);
        EnumC7313 enumC7313M46621 = c15781.m46621(0);
        EnumC7313 enumC7313M46622 = c15781.m46621(1);
        if (this.f40053) {
            m29739();
        }
        int iM46630 = c15781.m46630();
        int iM46639 = c15781.m46639();
        c15781.f67376.f25501.mo15463(iM46630);
        c15781.f67409.f25501.mo15463(iM46639);
        m29743();
        EnumC7313 enumC7313 = EnumC7313.WRAP_CONTENT;
        ArrayList<AbstractC7707> arrayList = this.f40051;
        if (enumC7313M46621 == enumC7313 || enumC7313M46622 == enumC7313) {
            if (z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((AbstractC7707) it.next()).mo11825()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && enumC7313M46621 == EnumC7313.WRAP_CONTENT) {
                c15781.m46591(EnumC7313.FIXED);
                c15781.m46608(m29733(c15781, 0));
                c15781.f67376.f25502.mo15463(c15781.m46640());
            }
            if (z && enumC7313M46622 == EnumC7313.WRAP_CONTENT) {
                c15781.m46626(EnumC7313.FIXED);
                c15781.m46620(m29733(c15781, 1));
                c15781.f67409.f25502.mo15463(c15781.m46619());
            }
        }
        EnumC7313 enumC7314 = c15781.f67434[0];
        EnumC7313 enumC7315 = EnumC7313.FIXED;
        if (enumC7314 == enumC7315 || enumC7314 == EnumC7313.MATCH_PARENT) {
            int iM46640 = c15781.m46640() + iM46630;
            c15781.f67376.f25505.mo15463(iM46640);
            c15781.f67376.f25502.mo15463(iM46640 - iM46630);
            m29743();
            EnumC7313 enumC7316 = c15781.f67434[1];
            if (enumC7316 == enumC7315 || enumC7316 == EnumC7313.MATCH_PARENT) {
                int iM46619 = c15781.m46619() + iM46639;
                c15781.f67409.f25505.mo15463(iM46619);
                c15781.f67409.f25502.mo15463(iM46619 - iM46639);
            }
            m29743();
            z2 = true;
        } else {
            z2 = false;
        }
        for (AbstractC7707 abstractC7707 : arrayList) {
            if (abstractC7707.f25504 != c15781 || abstractC7707.f25499) {
                abstractC7707.mo11824();
            }
        }
        for (AbstractC7707 abstractC7708 : arrayList) {
            if (z2 || abstractC7708.f25504 != c15781) {
                if (!abstractC7708.f25501.f19187 || ((!abstractC7708.f25505.f19187 && !(abstractC7708 instanceof C4178)) || (!abstractC7708.f25502.f19187 && !(abstractC7708 instanceof C4884) && !(abstractC7708 instanceof C4178)))) {
                    c15781.m46591(enumC7313M46621);
                    c15781.m46626(enumC7313M46622);
                    return z4;
                }
            }
        }
        z4 = true;
        c15781.m46591(enumC7313M46621);
        c15781.m46626(enumC7313M46622);
        return z4;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29745() {
        boolean z = this.f40053;
        C15781 c15781 = this.f40048;
        if (z) {
            for (C20719 c20719 : c15781.f76249) {
                c20719.m46622();
                c20719.f67403 = false;
                C15469 c15469 = c20719.f67376;
                c15469.f25502.f19187 = false;
                c15469.f25499 = false;
                c15469.m37001();
                C18996 c18996 = c20719.f67409;
                c18996.f25502.f19187 = false;
                c18996.f25499 = false;
                c18996.m43699();
            }
            c15781.m46622();
            c15781.f67403 = false;
            C15469 c154610 = c15781.f67376;
            c154610.f25502.f19187 = false;
            c154610.f25499 = false;
            c154610.m37001();
            C18996 c18997 = c15781.f67409;
            c18997.f25502.f19187 = false;
            c18997.f25499 = false;
            c18997.m43699();
            m29739();
        }
        m29736(this.f40052);
        c15781.m46638(0);
        c15781.m46610(0);
        c15781.f67376.f25501.mo15463(0);
        c15781.f67409.f25501.mo15463(0);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29741(int i, boolean z) {
        boolean z2;
        EnumC7313 enumC7313;
        C15781 c15781 = this.f40048;
        boolean z3 = false;
        EnumC7313 enumC7313M46621 = c15781.m46621(0);
        EnumC7313 enumC7313M46622 = c15781.m46621(1);
        int iM46630 = c15781.m46630();
        int iM46639 = c15781.m46639();
        ArrayList<AbstractC7707> arrayList = this.f40051;
        if (z && (enumC7313M46621 == (enumC7313 = EnumC7313.WRAP_CONTENT) || enumC7313M46622 == enumC7313)) {
            for (AbstractC7707 abstractC7707 : arrayList) {
                if (abstractC7707.f25508 == i && !abstractC7707.mo11825()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && enumC7313M46621 == EnumC7313.WRAP_CONTENT) {
                    c15781.m46591(EnumC7313.FIXED);
                    c15781.m46608(m29733(c15781, 0));
                    c15781.f67376.f25502.mo15463(c15781.m46640());
                }
            } else if (z && enumC7313M46622 == EnumC7313.WRAP_CONTENT) {
                c15781.m46626(EnumC7313.FIXED);
                c15781.m46620(m29733(c15781, 1));
                c15781.f67409.f25502.mo15463(c15781.m46619());
            }
        }
        if (i == 0) {
            EnumC7313 enumC7314 = c15781.f67434[0];
            if (enumC7314 == EnumC7313.FIXED || enumC7314 == EnumC7313.MATCH_PARENT) {
                int iM46640 = c15781.m46640() + iM46630;
                c15781.f67376.f25505.mo15463(iM46640);
                c15781.f67376.f25502.mo15463(iM46640 - iM46630);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            EnumC7313 enumC7315 = c15781.f67434[1];
            if (enumC7315 == EnumC7313.FIXED || enumC7315 == EnumC7313.MATCH_PARENT) {
                int iM46619 = c15781.m46619() + iM46639;
                c15781.f67409.f25505.mo15463(iM46619);
                c15781.f67409.f25502.mo15463(iM46619 - iM46639);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        m29743();
        for (AbstractC7707 abstractC7708 : arrayList) {
            if (abstractC7708.f25508 == i && (abstractC7708.f25504 != c15781 || abstractC7708.f25499)) {
                abstractC7708.mo11824();
            }
        }
        for (AbstractC7707 abstractC7709 : arrayList) {
            if (abstractC7709.f25508 == i && (z2 || abstractC7709.f25504 != c15781)) {
                if (!abstractC7709.f25501.f19187 || !abstractC7709.f25505.f19187 || (!(abstractC7709 instanceof C4884) && !abstractC7709.f25502.f19187)) {
                    c15781.m46591(enumC7313M46621);
                    c15781.m46626(enumC7313M46622);
                    return z3;
                }
            }
        }
        z3 = true;
        c15781.m46591(enumC7313M46621);
        c15781.m46626(enumC7313M46622);
        return z3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29737(C20719 c20719, EnumC7313 enumC7313, int i, EnumC7313 enumC7314, int i2) {
        C1668 c1668 = this.f40047;
        c1668.f6645 = enumC7313;
        c1668.f6644 = enumC7314;
        c1668.f6650 = i;
        c1668.f6647 = i2;
        this.f40049.mo8094(c20719, c1668);
        c20719.m46608(c1668.f6649);
        c20719.m46620(c1668.f6651);
        c20719.m46598(c1668.f6646);
        c20719.m46644(c1668.f6643);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0283  */
    /* JADX WARN: Code duplicated, block: B:125:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x028a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ac  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29736(C15781 c15781) {
        char c;
        EnumC7313 enumC7313;
        int iM46619;
        EnumC7313 enumC7314;
        EnumC7313[] enumC7313Arr;
        EnumC7313 enumC7315;
        EnumC7313 enumC7316;
        EnumC7313 enumC7317;
        EnumC7313 enumC7318;
        EnumC7313 enumC7319;
        Iterator it = c15781.f76249.iterator();
        while (it.hasNext()) {
            C20719 c20719 = (C20719) it.next();
            EnumC7313[] enumC7313Arr2 = c20719.f67434;
            C8725[] c8725Arr = c20719.f67398;
            C8725 c8725 = c20719.f67387;
            C8725 c8726 = c20719.f67392;
            C8725 c8727 = c20719.f67421;
            C8725 c8728 = c20719.f67385;
            EnumC7313 enumC73110 = enumC7313Arr2[0];
            EnumC7313 enumC73111 = enumC7313Arr2[1];
            if (c20719.m46606() == 8) {
                c20719.f67403 = true;
            } else {
                float f = c20719.f67384;
                if (f < 1.0f && enumC73110 == EnumC7313.MATCH_CONSTRAINT) {
                    c20719.f67395 = 2;
                }
                float f2 = c20719.f67377;
                if (f2 < 1.0f) {
                    c = 0;
                    if (enumC73111 == EnumC7313.MATCH_CONSTRAINT) {
                        c20719.f67375 = 2;
                    }
                } else {
                    c = 0;
                }
                if (c20719.f67422 > 0.0f) {
                    EnumC7313 enumC73112 = EnumC7313.MATCH_CONSTRAINT;
                    if (enumC73110 == enumC73112 && (enumC73111 == EnumC7313.WRAP_CONTENT || enumC73111 == EnumC7313.FIXED)) {
                        c20719.f67395 = 3;
                    } else if (enumC73111 == enumC73112 && (enumC73110 == EnumC7313.WRAP_CONTENT || enumC73110 == EnumC7313.FIXED)) {
                        c20719.f67375 = 3;
                    } else if (enumC73110 == enumC73112 && enumC73111 == enumC73112) {
                        if (c20719.f67395 == 0) {
                            c20719.f67395 = 3;
                        }
                        if (c20719.f67375 == 0) {
                            c20719.f67375 = 3;
                        }
                    }
                }
                EnumC7313 enumC73113 = EnumC7313.MATCH_CONSTRAINT;
                if (enumC73110 == enumC73113 && c20719.f67395 == 1 && (c8728.f29981 == null || c8727.f29981 == null)) {
                    enumC73110 = EnumC7313.WRAP_CONTENT;
                }
                if (enumC73111 == enumC73113 && c20719.f67375 == 1 && (c8726.f29981 == null || c8725.f29981 == null)) {
                    enumC73111 = EnumC7313.WRAP_CONTENT;
                }
                EnumC7313 enumC73114 = enumC73111;
                C15469 c15469 = c20719.f67376;
                c15469.f25507 = enumC73110;
                int i = c20719.f67395;
                c15469.f25503 = i;
                C18996 c18996 = c20719.f67409;
                c18996.f25507 = enumC73114;
                Iterator it2 = it;
                int i2 = c20719.f67375;
                c18996.f25503 = i2;
                EnumC7313 enumC73115 = EnumC7313.MATCH_PARENT;
                if ((enumC73110 == enumC73115 || enumC73110 == EnumC7313.FIXED || enumC73110 == EnumC7313.WRAP_CONTENT) && (enumC73114 == enumC73115 || enumC73114 == EnumC7313.FIXED || enumC73114 == EnumC7313.WRAP_CONTENT)) {
                    int iM46640 = c20719.m46640();
                    if (enumC73110 == enumC73115) {
                        iM46640 = (c15781.m46640() - c8728.f29979) - c8727.f29979;
                        enumC7313 = EnumC7313.FIXED;
                    } else {
                        enumC7313 = enumC73110;
                    }
                    int iM466110 = c20719.m46619();
                    if (enumC73114 == enumC73115) {
                        iM46619 = (c15781.m46619() - c8726.f29979) - c8725.f29979;
                        enumC7314 = EnumC7313.FIXED;
                    } else {
                        iM46619 = iM466110;
                        enumC7314 = enumC73114;
                    }
                    m29737(c20719, enumC7313, iM46640, enumC7314, iM46619);
                    c20719.f67376.f25502.mo15463(c20719.m46640());
                    c20719.f67409.f25502.mo15463(c20719.m46619());
                    c20719.f67403 = true;
                } else if (enumC73110 == enumC73113 && (enumC73114 == (enumC7319 = EnumC7313.WRAP_CONTENT) || enumC73114 == EnumC7313.FIXED)) {
                    if (i == 3) {
                        if (enumC73114 == enumC7319) {
                            m29737(c20719, enumC7319, 0, enumC7319, 0);
                        }
                        int iM466111 = c20719.m46619();
                        int i3 = (int) ((iM466111 * c20719.f67422) + 0.5f);
                        EnumC7313 enumC73116 = EnumC7313.FIXED;
                        m29737(c20719, enumC73116, i3, enumC73116, iM466111);
                        c20719.f67376.f25502.mo15463(c20719.m46640());
                        c20719.f67409.f25502.mo15463(c20719.m46619());
                        c20719.f67403 = true;
                    } else if (i == 1) {
                        m29737(c20719, enumC7319, 0, enumC73114, 0);
                        c20719.f67376.f25502.f73492 = c20719.m46640();
                    } else if (i == 2) {
                        EnumC7313 enumC73117 = c15781.f67434[c];
                        EnumC7313 enumC73118 = EnumC7313.FIXED;
                        if (enumC73117 == enumC73118 || enumC73117 == enumC73115) {
                            m29737(c20719, enumC73118, (int) ((f * c15781.m46640()) + 0.5f), enumC73114, c20719.m46619());
                            c20719.f67376.f25502.mo15463(c20719.m46640());
                            c20719.f67409.f25502.mo15463(c20719.m46619());
                            c20719.f67403 = true;
                        } else if (enumC73114 == enumC73113) {
                            if (enumC73110 == enumC73113) {
                                if (i != 1) {
                                    EnumC7313 enumC73119 = EnumC7313.WRAP_CONTENT;
                                    m29737(c20719, enumC73119, 0, enumC73119, 0);
                                    c20719.f67376.f25502.f73492 = c20719.m46640();
                                    c20719.f67409.f25502.f73492 = c20719.m46619();
                                } else {
                                    EnumC7313 enumC731110 = EnumC7313.WRAP_CONTENT;
                                    m29737(c20719, enumC731110, 0, enumC731110, 0);
                                    c20719.f67376.f25502.f73492 = c20719.m46640();
                                    c20719.f67409.f25502.f73492 = c20719.m46619();
                                }
                            }
                        } else if (enumC73110 == enumC73113) {
                            if (i != 1) {
                                EnumC7313 enumC731111 = EnumC7313.WRAP_CONTENT;
                                m29737(c20719, enumC731111, 0, enumC731111, 0);
                                c20719.f67376.f25502.f73492 = c20719.m46640();
                                c20719.f67409.f25502.f73492 = c20719.m46619();
                            } else {
                                EnumC7313 enumC731112 = EnumC7313.WRAP_CONTENT;
                                m29737(c20719, enumC731112, 0, enumC731112, 0);
                                c20719.f67376.f25502.f73492 = c20719.m46640();
                                c20719.f67409.f25502.f73492 = c20719.m46619();
                            }
                        }
                    } else if (c8725Arr[c].f29981 == null || c8725Arr[1].f29981 == null) {
                        m29737(c20719, enumC7319, 0, enumC73114, 0);
                        c20719.f67376.f25502.mo15463(c20719.m46640());
                        c20719.f67409.f25502.mo15463(c20719.m46619());
                        c20719.f67403 = true;
                    } else if (enumC73114 == enumC73113) {
                        if (enumC73110 == enumC73113) {
                            if (i != 1) {
                                EnumC7313 enumC731113 = EnumC7313.WRAP_CONTENT;
                                m29737(c20719, enumC731113, 0, enumC731113, 0);
                                c20719.f67376.f25502.f73492 = c20719.m46640();
                                c20719.f67409.f25502.f73492 = c20719.m46619();
                            } else {
                                EnumC7313 enumC731114 = EnumC7313.WRAP_CONTENT;
                                m29737(c20719, enumC731114, 0, enumC731114, 0);
                                c20719.f67376.f25502.f73492 = c20719.m46640();
                                c20719.f67409.f25502.f73492 = c20719.m46619();
                            }
                        }
                    } else if (enumC73110 == enumC73113) {
                        if (i != 1) {
                            EnumC7313 enumC731115 = EnumC7313.WRAP_CONTENT;
                            m29737(c20719, enumC731115, 0, enumC731115, 0);
                            c20719.f67376.f25502.f73492 = c20719.m46640();
                            c20719.f67409.f25502.f73492 = c20719.m46619();
                        } else {
                            EnumC7313 enumC731116 = EnumC7313.WRAP_CONTENT;
                            m29737(c20719, enumC731116, 0, enumC731116, 0);
                            c20719.f67376.f25502.f73492 = c20719.m46640();
                            c20719.f67409.f25502.f73492 = c20719.m46619();
                        }
                    }
                } else if (enumC73114 == enumC73113 || !(enumC73110 == (enumC7318 = EnumC7313.WRAP_CONTENT) || enumC73110 == EnumC7313.FIXED)) {
                    if (enumC73110 == enumC73113 && enumC73114 == enumC73113) {
                        if (i != 1 || i2 == 1) {
                            EnumC7313 enumC731117 = EnumC7313.WRAP_CONTENT;
                            m29737(c20719, enumC731117, 0, enumC731117, 0);
                            c20719.f67376.f25502.f73492 = c20719.m46640();
                            c20719.f67409.f25502.f73492 = c20719.m46619();
                        } else if (i2 == 2 && i == 2 && (((enumC7315 = (enumC7313Arr = c15781.f67434)[c]) == (enumC7316 = EnumC7313.FIXED) || enumC7315 == enumC7316) && ((enumC7317 = enumC7313Arr[1]) == enumC7316 || enumC7317 == enumC7316))) {
                            m29737(c20719, enumC7316, (int) ((f * c15781.m46640()) + 0.5f), enumC7316, (int) ((f2 * c15781.m46619()) + 0.5f));
                            c20719.f67376.f25502.mo15463(c20719.m46640());
                            c20719.f67409.f25502.mo15463(c20719.m46619());
                            c20719.f67403 = true;
                        }
                    }
                } else if (i2 == 3) {
                    if (enumC73110 == enumC7318) {
                        m29737(c20719, enumC7318, 0, enumC7318, 0);
                    }
                    int iM46641 = c20719.m46640();
                    float f3 = c20719.f67422;
                    if (c20719.m46575() == -1) {
                        f3 = 1.0f / f3;
                    }
                    EnumC7313 enumC73120 = EnumC7313.FIXED;
                    m29737(c20719, enumC73120, iM46641, enumC73120, (int) ((iM46641 * f3) + 0.5f));
                    c20719.f67376.f25502.mo15463(c20719.m46640());
                    c20719.f67409.f25502.mo15463(c20719.m46619());
                    c20719.f67403 = true;
                } else if (i2 == 1) {
                    m29737(c20719, enumC73110, 0, enumC7318, 0);
                    c20719.f67409.f25502.f73492 = c20719.m46619();
                } else if (i2 == 2) {
                    EnumC7313 enumC73121 = c15781.f67434[1];
                    EnumC7313 enumC73122 = EnumC7313.FIXED;
                    if (enumC73121 == enumC73122 || enumC73121 == enumC73115) {
                        m29737(c20719, enumC73110, c20719.m46640(), enumC73122, (int) ((f2 * c15781.m46619()) + 0.5f));
                        c20719.f67376.f25502.mo15463(c20719.m46640());
                        c20719.f67409.f25502.mo15463(c20719.m46619());
                        c20719.f67403 = true;
                    } else if (enumC73110 == enumC73113) {
                        if (i != 1) {
                            EnumC7313 enumC731118 = EnumC7313.WRAP_CONTENT;
                            m29737(c20719, enumC731118, 0, enumC731118, 0);
                            c20719.f67376.f25502.f73492 = c20719.m46640();
                            c20719.f67409.f25502.f73492 = c20719.m46619();
                        } else {
                            EnumC7313 enumC731119 = EnumC7313.WRAP_CONTENT;
                            m29737(c20719, enumC731119, 0, enumC731119, 0);
                            c20719.f67376.f25502.f73492 = c20719.m46640();
                            c20719.f67409.f25502.f73492 = c20719.m46619();
                        }
                    }
                } else if (c8725Arr[2].f29981 == null || c8725Arr[3].f29981 == null) {
                    m29737(c20719, enumC7318, 0, enumC73114, 0);
                    c20719.f67376.f25502.mo15463(c20719.m46640());
                    c20719.f67409.f25502.mo15463(c20719.m46619());
                    c20719.f67403 = true;
                } else if (enumC73110 == enumC73113) {
                    if (i != 1) {
                        EnumC7313 enumC7311110 = EnumC7313.WRAP_CONTENT;
                        m29737(c20719, enumC7311110, 0, enumC7311110, 0);
                        c20719.f67376.f25502.f73492 = c20719.m46640();
                        c20719.f67409.f25502.f73492 = c20719.m46619();
                    } else {
                        EnumC7313 enumC7311111 = EnumC7313.WRAP_CONTENT;
                        m29737(c20719, enumC7311111, 0, enumC7311111, 0);
                        c20719.f67376.f25502.f73492 = c20719.m46640();
                        c20719.f67409.f25502.f73492 = c20719.m46619();
                    }
                }
                it = it2;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m29743() {
        C14370 c14370;
        for (C20719 c20719 : this.f40048.f76249) {
            if (!c20719.f67403) {
                EnumC7313[] enumC7313Arr = c20719.f67434;
                boolean z = false;
                EnumC7313 enumC7313 = enumC7313Arr[0];
                EnumC7313 enumC7314 = enumC7313Arr[1];
                int i = c20719.f67395;
                int i2 = c20719.f67375;
                EnumC7313 enumC7315 = EnumC7313.WRAP_CONTENT;
                boolean z2 = enumC7313 == enumC7315 || (enumC7313 == EnumC7313.MATCH_CONSTRAINT && i == 1);
                if (enumC7314 == enumC7315 || (enumC7314 == EnumC7313.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C22524 c22524 = c20719.f67376.f25502;
                boolean z3 = c22524.f19187;
                C22524 c22525 = c20719.f67409.f25502;
                boolean z4 = c22525.f19187;
                if (z3 && z4) {
                    EnumC7313 enumC7316 = EnumC7313.FIXED;
                    m29737(c20719, enumC7316, c22524.f19196, enumC7316, c22525.f19196);
                    c20719.f67403 = true;
                } else if (z3 && z) {
                    m29737(c20719, EnumC7313.FIXED, c22524.f19196, enumC7315, c22525.f19196);
                    if (enumC7314 == EnumC7313.MATCH_CONSTRAINT) {
                        c20719.f67409.f25502.f73492 = c20719.m46619();
                    } else {
                        c20719.f67409.f25502.mo15463(c20719.m46619());
                        c20719.f67403 = true;
                    }
                } else if (z4 && z2) {
                    m29737(c20719, enumC7315, c22524.f19196, EnumC7313.FIXED, c22525.f19196);
                    if (enumC7313 == EnumC7313.MATCH_CONSTRAINT) {
                        c20719.f67376.f25502.f73492 = c20719.m46640();
                    } else {
                        c20719.f67376.f25502.mo15463(c20719.m46640());
                        c20719.f67403 = true;
                    }
                }
                if (c20719.f67403 && (c14370 = c20719.f67409.f61487) != null) {
                    c14370.mo15463(c20719.m46614());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m29744() {
        this.f40053 = true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m29738() {
        this.f40046 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29739() {
        ArrayList<AbstractC7707> arrayList = this.f40051;
        arrayList.clear();
        C15781 c15781 = this.f40052;
        c15781.f67376.mo11823();
        c15781.f67409.mo11823();
        arrayList.add(c15781.f67376);
        arrayList.add(c15781.f67409);
        HashSet hashSet = null;
        for (C20719 c20719 : c15781.f76249) {
            if (c20719 instanceof C12253) {
                C4178 c4178 = new C4178(c20719);
                c20719.f67376.mo11823();
                c20719.f67409.mo11823();
                c4178.f25508 = ((C12253) c20719).m30459();
                arrayList.add(c4178);
            } else {
                if (c20719.m46631()) {
                    if (c20719.f67406 == null) {
                        c20719.f67406 = new C4884(c20719, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c20719.f67406);
                } else {
                    arrayList.add(c20719.f67376);
                }
                if (c20719.m46632()) {
                    if (c20719.f67399 == null) {
                        c20719.f67399 = new C4884(c20719, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c20719.f67399);
                } else {
                    arrayList.add(c20719.f67409);
                }
                if (c20719 instanceof C17191) {
                    arrayList.add(new C7001(c20719));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC7707) it.next()).mo11823();
        }
        for (AbstractC7707 abstractC7707 : arrayList) {
            if (abstractC7707.f25504 != c15781) {
                abstractC7707.mo11821();
            }
        }
        ArrayList arrayList2 = this.f40050;
        arrayList2.clear();
        C15781 c15782 = this.f40048;
        m29735(c15782.f67376, 0, arrayList2);
        m29735(c15782.f67409, 1, arrayList2);
        this.f40053 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29734(C5590 c5590, int i, ArrayList arrayList, C21818 c21818) {
        AbstractC7707 abstractC7707 = c5590.f19194;
        C21818 c21819 = abstractC7707.f25506;
        C5590 c5591 = abstractC7707.f25505;
        C5590 c5592 = abstractC7707.f25501;
        if (c21819 == null) {
            C15781 c15781 = this.f40048;
            if (abstractC7707 == c15781.f67376 || abstractC7707 == c15781.f67409) {
                return;
            }
            if (c21818 == null) {
                c21818 = new C21818();
                c21818.f70868 = null;
                c21818.f70869 = new ArrayList();
                c21818.f70868 = abstractC7707;
                arrayList.add(c21818);
            }
            abstractC7707.f25506 = c21818;
            c21818.f70869.add(abstractC7707);
            for (InterfaceC14058 interfaceC14058 : c5592.f19195) {
                if (interfaceC14058 instanceof C5590) {
                    m29734((C5590) interfaceC14058, i, arrayList, c21818);
                }
            }
            for (InterfaceC14058 interfaceC14059 : c5591.f19195) {
                if (interfaceC14059 instanceof C5590) {
                    m29734((C5590) interfaceC14059, i, arrayList, c21818);
                }
            }
            if (i == 1 && (abstractC7707 instanceof C18996)) {
                for (InterfaceC14058 interfaceC140510 : ((C18996) abstractC7707).f61488.f19195) {
                    if (interfaceC140510 instanceof C5590) {
                        m29734((C5590) interfaceC140510, i, arrayList, c21818);
                    }
                }
            }
            Iterator it = c5592.f19189.iterator();
            while (it.hasNext()) {
                m29734((C5590) it.next(), i, arrayList, c21818);
            }
            Iterator it2 = c5591.f19189.iterator();
            while (it2.hasNext()) {
                m29734((C5590) it2.next(), i, arrayList, c21818);
            }
            if (i == 1 && (abstractC7707 instanceof C18996)) {
                Iterator it3 = ((C18996) abstractC7707).f61488.f19189.iterator();
                while (it3.hasNext()) {
                    m29734((C5590) it3.next(), i, arrayList, c21818);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29735(AbstractC7707 abstractC7707, int i, ArrayList arrayList) {
        C5590 c5590 = abstractC7707.f25501;
        C5590 c5591 = abstractC7707.f25505;
        for (InterfaceC14058 interfaceC14058 : c5590.f19195) {
            if (interfaceC14058 instanceof C5590) {
                m29734((C5590) interfaceC14058, i, arrayList, null);
            } else if (interfaceC14058 instanceof AbstractC7707) {
                m29734(((AbstractC7707) interfaceC14058).f25501, i, arrayList, null);
            }
        }
        for (InterfaceC14058 interfaceC14059 : c5591.f19195) {
            if (interfaceC14059 instanceof C5590) {
                m29734((C5590) interfaceC14059, i, arrayList, null);
            } else if (interfaceC14059 instanceof AbstractC7707) {
                m29734(((AbstractC7707) interfaceC14059).f25505, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC14058 interfaceC140510 : ((C18996) abstractC7707).f61488.f19195) {
                if (interfaceC140510 instanceof C5590) {
                    m29734((C5590) interfaceC140510, i, arrayList, null);
                }
            }
        }
    }
}
