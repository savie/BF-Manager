package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1AA */
/* JADX INFO: loaded from: classes3.dex */
public final class C6127 extends AbstractC18805 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int[] f20897 = new int[2];

    public C6127(C10445 c10445) {
        super(c10445);
        this.f61068.f53629 = EnumC24773.LEFT;
        this.f61071.f53629 = EnumC24773.RIGHT;
        this.f61074 = 0;
    }

    public final String toString() {
        return "HorizontalRun " + this.f61072.m26841();
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ۤ */
    public final void mo10266() {
        this.f61070 = null;
        this.f61068.m39241();
        this.f61071.m39241();
        this.f61069.m39241();
        this.f61073 = false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m17688() {
        this.f61073 = false;
        C16567 c16567 = this.f61068;
        c16567.m39241();
        c16567.f53630 = false;
        C16567 c16568 = this.f61071;
        c16568.m39241();
        c16568.f53630 = false;
        this.f61069.f53630 = false;
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo10267() {
        return this.f61076 != EnumC19396.MATCH_CONSTRAINT || this.f61072.f33206 == 0;
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ۙ */
    public final void mo10265() {
        C10445 c10445;
        C10445 c10446;
        C10445 c10447;
        C10445 c10448;
        C10445 c10449 = this.f61072;
        boolean z = c10449.f33208;
        C17313 c17313 = this.f61069;
        if (z) {
            c17313.mo39242(c10449.m26806());
        }
        boolean z2 = c17313.f53630;
        ArrayList arrayList = c17313.f53634;
        ArrayList arrayList2 = c17313.f53625;
        C16567 c16567 = this.f61071;
        C16567 c16568 = this.f61068;
        if (z2) {
            EnumC19396 enumC19396 = this.f61076;
            EnumC19396 enumC19397 = EnumC19396.MATCH_PARENT;
            if (enumC19396 == enumC19397 && (((c10446 = (c10445 = this.f61072).f33252) != null && c10446.f33210[0] == EnumC19396.FIXED) || c10446.f33210[0] == enumC19397)) {
                AbstractC18805.m43600(c16568, c10446.f33245.f61068, c10445.f33212.m3108());
                AbstractC18805.m43600(c16567, c10446.f33245.f61071, -this.f61072.f33248.m3108());
                return;
            }
        } else {
            C10445 c104410 = this.f61072;
            EnumC19396 enumC19398 = c104410.f33210[0];
            this.f61076 = enumC19398;
            if (enumC19398 != EnumC19396.MATCH_CONSTRAINT) {
                EnumC19396 enumC19399 = EnumC19396.MATCH_PARENT;
                if (enumC19398 == enumC19399 && (((c10448 = c104410.f33252) != null && c10448.f33210[0] == EnumC19396.FIXED) || c10448.f33210[0] == enumC19399)) {
                    int iM26806 = (c10448.m26806() - this.f61072.f33212.m3108()) - this.f61072.f33248.m3108();
                    AbstractC18805.m43600(c16568, c10448.f33245.f61068, this.f61072.f33212.m3108());
                    AbstractC18805.m43600(c16567, c10448.f33245.f61071, -this.f61072.f33248.m3108());
                    c17313.mo39242(iM26806);
                    return;
                }
                if (enumC19398 == EnumC19396.FIXED) {
                    c17313.mo39242(c104410.m26806());
                }
            }
        }
        if (c17313.f53630) {
            C10445 c104411 = this.f61072;
            if (c104411.f33208) {
                C0751[] c0751Arr = c104411.f33190;
                C0751 c0751 = c0751Arr[0];
                C0751 c0752 = c0751.f2744;
                if (c0752 != null && c0751Arr[1].f2744 != null) {
                    if (c104411.m26800()) {
                        c16568.f53628 = this.f61072.f33190[0].m3108();
                        c16567.f53628 = -this.f61072.f33190[1].m3108();
                        return;
                    }
                    C16567 c16567M43598 = AbstractC18805.m43598(this.f61072.f33190[0]);
                    if (c16567M43598 != null) {
                        AbstractC18805.m43600(c16568, c16567M43598, this.f61072.f33190[0].m3108());
                    }
                    C16567 c16567M43599 = AbstractC18805.m43598(this.f61072.f33190[1]);
                    if (c16567M43599 != null) {
                        AbstractC18805.m43600(c16567, c16567M43599, -this.f61072.f33190[1].m3108());
                    }
                    c16568.f53626 = true;
                    c16567.f53626 = true;
                    return;
                }
                if (c0752 != null) {
                    C16567 c16567M435910 = AbstractC18805.m43598(c0751);
                    if (c16567M435910 != null) {
                        AbstractC18805.m43600(c16568, c16567M435910, this.f61072.f33190[0].m3108());
                        AbstractC18805.m43600(c16567, c16568, c17313.f53632);
                        return;
                    }
                    return;
                }
                C0751 c0753 = c0751Arr[1];
                if (c0753.f2744 != null) {
                    C16567 c16567M435911 = AbstractC18805.m43598(c0753);
                    if (c16567M435911 != null) {
                        AbstractC18805.m43600(c16567, c16567M435911, -this.f61072.f33190[1].m3108());
                        AbstractC18805.m43600(c16568, c16567, -c17313.f53632);
                        return;
                    }
                    return;
                }
                if ((c104411 instanceof C14174) || c104411.f33252 == null || c104411.mo20495(EnumC18650.CENTER).f2744 != null) {
                    return;
                }
                C10445 c104412 = this.f61072;
                AbstractC18805.m43600(c16568, c104412.f33252.f33245.f61068, c104412.m26840());
                AbstractC18805.m43600(c16567, c16568, c17313.f53632);
                return;
            }
        }
        if (this.f61076 == EnumC19396.MATCH_CONSTRAINT) {
            C10445 c104413 = this.f61072;
            int i = c104413.f33206;
            if (i == 2) {
                C10445 c104414 = c104413.f33252;
                if (c104414 != null) {
                    C17313 c17314 = c104414.f33195.f61069;
                    arrayList2.add(c17314);
                    c17314.f53634.add(c17313);
                    c17313.f53626 = true;
                    arrayList.add(c16568);
                    arrayList.add(c16567);
                }
            } else if (i == 3) {
                if (c104413.f33209 == 3) {
                    c16568.f53636 = this;
                    c16567.f53636 = this;
                    C14329 c14329 = c104413.f33195;
                    c14329.f61068.f53636 = this;
                    c14329.f61071.f53636 = this;
                    c17313.f53636 = this;
                    if (c104413.m26850()) {
                        arrayList2.add(this.f61072.f33195.f61069);
                        this.f61072.f33195.f61069.f53634.add(c17313);
                        C14329 c143210 = this.f61072.f33195;
                        c143210.f61069.f53636 = this;
                        arrayList2.add(c143210.f61068);
                        arrayList2.add(this.f61072.f33195.f61071);
                        this.f61072.f33195.f61068.f53634.add(c17313);
                        this.f61072.f33195.f61071.f53634.add(c17313);
                    } else if (this.f61072.m26800()) {
                        this.f61072.f33195.f61069.f53625.add(c17313);
                        arrayList.add(this.f61072.f33195.f61069);
                    } else {
                        this.f61072.f33195.f61069.f53625.add(c17313);
                    }
                } else {
                    C17313 c17315 = c104413.f33195.f61069;
                    arrayList2.add(c17315);
                    c17315.f53634.add(c17313);
                    this.f61072.f33195.f61068.f53634.add(c17313);
                    this.f61072.f33195.f61071.f53634.add(c17313);
                    c17313.f53626 = true;
                    arrayList.add(c16568);
                    arrayList.add(c16567);
                    c16568.f53625.add(c17313);
                    c16567.f53625.add(c17313);
                }
            }
        }
        C10445 c104415 = this.f61072;
        C0751[] c0751Arr2 = c104415.f33190;
        C0751 c0754 = c0751Arr2[0];
        C0751 c0755 = c0754.f2744;
        if (c0755 != null && c0751Arr2[1].f2744 != null) {
            if (c104415.m26800()) {
                c16568.f53628 = this.f61072.f33190[0].m3108();
                c16567.f53628 = -this.f61072.f33190[1].m3108();
                return;
            }
            C16567 c16567M435912 = AbstractC18805.m43598(this.f61072.f33190[0]);
            C16567 c16567M435913 = AbstractC18805.m43598(this.f61072.f33190[1]);
            c16567M435912.m39243((AbstractC18805) this);
            c16567M435913.m39243((AbstractC18805) this);
            this.f61077 = EnumC7618.CENTER;
            return;
        }
        if (c0755 != null) {
            C16567 c16567M435914 = AbstractC18805.m43598(c0754);
            if (c16567M435914 != null) {
                AbstractC18805.m43600(c16568, c16567M435914, this.f61072.f33190[0].m3108());
                m43603(c16567, c16568, 1, c17313);
                return;
            }
            return;
        }
        C0751 c0756 = c0751Arr2[1];
        if (c0756.f2744 != null) {
            C16567 c16567M435915 = AbstractC18805.m43598(c0756);
            if (c16567M435915 != null) {
                AbstractC18805.m43600(c16567, c16567M435915, -this.f61072.f33190[1].m3108());
                m43603(c16568, c16567, -1, c17313);
                return;
            }
            return;
        }
        if ((c104415 instanceof C14174) || (c10447 = c104415.f33252) == null) {
            return;
        }
        AbstractC18805.m43600(c16568, c10447.f33245.f61068, c104415.m26840());
        m43603(c16567, c16568, 1, c17313);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17687(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x027b  */
    /* JADX WARN: Code duplicated, block: B:117:0x028a  */
    @Override // l.AbstractC18805, l.InterfaceC1652
    /* JADX INFO: renamed from: ۙ */
    public final void mo5938(InterfaceC1652 interfaceC1652) {
        int iM43601;
        int i;
        int iM43602;
        C10445 c10445;
        int i2;
        float f;
        int i3;
        if (C12092.f38933[this.f61077.ordinal()] == 3) {
            C10445 c10446 = this.f61072;
            m43602(c10446.f33212, c10446.f33248, 0);
            return;
        }
        C17313 c17313 = this.f61069;
        boolean z = c17313.f53630;
        C16567 c16567 = this.f61068;
        C16567 c16568 = this.f61071;
        if (!z && this.f61076 == EnumC19396.MATCH_CONSTRAINT) {
            C10445 c10447 = this.f61072;
            int i4 = c10447.f33206;
            if (i4 == 2) {
                C10445 c10448 = c10447.f33252;
                if (c10448 != null) {
                    C17313 c17314 = c10448.f33245.f61069;
                    if (c17314.f53630) {
                        c17313.mo39242((int) ((c17314.f53632 * c10447.f33238) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i5 = c10447.f33209;
                if (i5 == 0 || i5 == 3) {
                    C14329 c14329 = c10447.f33195;
                    C16567 c16569 = c14329.f61068;
                    C16567 c165610 = c14329.f61071;
                    boolean z2 = c10447.f33212.f2744 != null;
                    boolean z3 = c10447.f33197.f2744 != null;
                    boolean z4 = c10447.f33248.f2744 != null;
                    boolean z5 = c10447.f33216.f2744 != null;
                    int iM26837 = c10447.m26837();
                    if (z2 && z3 && z4 && z5) {
                        float f2 = this.f61072.f33239;
                        boolean z6 = c16569.f53630;
                        ArrayList arrayList = c16569.f53625;
                        int[] iArr = f20897;
                        if (z6 && c165610.f53630) {
                            if (c16567.f53631 && c16568.f53631) {
                                m17687(iArr, ((C16567) c16567.f53625.get(0)).f53632 + c16567.f53628, ((C16567) c16568.f53625.get(0)).f53632 - c16568.f53628, c16569.f53632 + c16569.f53628, c165610.f53632 - c165610.f53628, f2, iM26837);
                                c17313.mo39242(iArr[0]);
                                this.f61072.f33195.f61069.mo39242(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c16567.f53630 && c16568.f53630) {
                            if (!c16569.f53631 || !c165610.f53631) {
                                return;
                            }
                            m17687(iArr, c16567.f53632 + c16567.f53628, c16568.f53632 - c16568.f53628, ((C16567) arrayList.get(0)).f53632 + c16569.f53628, ((C16567) c165610.f53625.get(0)).f53632 - c165610.f53628, f2, iM26837);
                            c17313.mo39242(iArr[0]);
                            this.f61072.f33195.f61069.mo39242(iArr[1]);
                        }
                        if (!c16567.f53631 || !c16568.f53631 || !c16569.f53631 || !c165610.f53631) {
                            return;
                        }
                        m17687(iArr, ((C16567) c16567.f53625.get(0)).f53632 + c16567.f53628, ((C16567) c16568.f53625.get(0)).f53632 - c16568.f53628, ((C16567) arrayList.get(0)).f53632 + c16569.f53628, ((C16567) c165610.f53625.get(0)).f53632 - c165610.f53628, f2, iM26837);
                        c17313.mo39242(iArr[0]);
                        this.f61072.f33195.f61069.mo39242(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c16567.f53631 || !c16568.f53631) {
                            return;
                        }
                        float f3 = this.f61072.f33239;
                        int i6 = ((C16567) c16567.f53625.get(0)).f53632 + c16567.f53628;
                        int i7 = ((C16567) c16568.f53625.get(0)).f53632 - c16568.f53628;
                        if (iM26837 == -1 || iM26837 == 0) {
                            int iM43603 = m43601(i7 - i6, 0);
                            int i8 = (int) ((iM43603 * f3) + 0.5f);
                            int iM43604 = m43601(i8, 1);
                            if (i8 != iM43604) {
                                iM43603 = (int) ((iM43604 / f3) + 0.5f);
                            }
                            c17313.mo39242(iM43603);
                            this.f61072.f33195.f61069.mo39242(iM43604);
                        } else if (iM26837 == 1) {
                            int iM43605 = m43601(i7 - i6, 0);
                            int i9 = (int) ((iM43605 / f3) + 0.5f);
                            int iM43606 = m43601(i9, 1);
                            if (i9 != iM43606) {
                                iM43605 = (int) ((iM43606 * f3) + 0.5f);
                            }
                            c17313.mo39242(iM43605);
                            this.f61072.f33195.f61069.mo39242(iM43606);
                        }
                    } else if (z3 && z5) {
                        if (!c16569.f53631 || !c165610.f53631) {
                            return;
                        }
                        float f4 = this.f61072.f33239;
                        int i10 = ((C16567) c16569.f53625.get(0)).f53632 + c16569.f53628;
                        int i11 = ((C16567) c165610.f53625.get(0)).f53632 - c165610.f53628;
                        if (iM26837 == -1) {
                            iM43601 = m43601(i11 - i10, 1);
                            i = (int) ((iM43601 / f4) + 0.5f);
                            iM43602 = m43601(i, 0);
                            if (i != iM43602) {
                                iM43601 = (int) ((iM43602 * f4) + 0.5f);
                            }
                            c17313.mo39242(iM43602);
                            this.f61072.f33195.f61069.mo39242(iM43601);
                        } else if (iM26837 == 0) {
                            int iM43607 = m43601(i11 - i10, 1);
                            int i12 = (int) ((iM43607 * f4) + 0.5f);
                            int iM43608 = m43601(i12, 0);
                            if (i12 != iM43608) {
                                iM43607 = (int) ((iM43608 / f4) + 0.5f);
                            }
                            c17313.mo39242(iM43608);
                            this.f61072.f33195.f61069.mo39242(iM43607);
                        } else if (iM26837 == 1) {
                            iM43601 = m43601(i11 - i10, 1);
                            i = (int) ((iM43601 / f4) + 0.5f);
                            iM43602 = m43601(i, 0);
                            if (i != iM43602) {
                                iM43601 = (int) ((iM43602 * f4) + 0.5f);
                            }
                            c17313.mo39242(iM43602);
                            this.f61072.f33195.f61069.mo39242(iM43601);
                        }
                    }
                } else {
                    int iM26838 = c10447.m26837();
                    if (iM26838 != -1) {
                        if (iM26838 == 0) {
                            C10445 c10449 = this.f61072;
                            f = c10449.f33195.f61069.f53632 / c10449.f33239;
                            i3 = (int) (f + 0.5f);
                        } else if (iM26838 != 1) {
                            i3 = 0;
                        } else {
                            c10445 = this.f61072;
                            i2 = c10445.f33195.f61069.f53632;
                        }
                        c17313.mo39242(i3);
                    } else {
                        c10445 = this.f61072;
                        i2 = c10445.f33195.f61069.f53632;
                    }
                    f = i2 * c10445.f33239;
                    i3 = (int) (f + 0.5f);
                    c17313.mo39242(i3);
                }
            }
        }
        boolean z7 = c16567.f53631;
        ArrayList arrayList2 = c16567.f53625;
        if (z7) {
            boolean z8 = c16568.f53631;
            ArrayList arrayList3 = c16568.f53625;
            if (z8) {
                if (c16567.f53630 && c16568.f53630 && c17313.f53630) {
                    return;
                }
                if (!c17313.f53630 && this.f61076 == EnumC19396.MATCH_CONSTRAINT) {
                    C10445 c104410 = this.f61072;
                    if (c104410.f33206 == 0 && !c104410.m26800()) {
                        C16567 c165611 = (C16567) arrayList2.get(0);
                        C16567 c165612 = (C16567) arrayList3.get(0);
                        int i13 = c165611.f53632 + c16567.f53628;
                        int i14 = c165612.f53632 + c16568.f53628;
                        c16567.mo39242(i13);
                        c16568.mo39242(i14);
                        c17313.mo39242(i14 - i13);
                        return;
                    }
                }
                if (!c17313.f53630 && this.f61076 == EnumC19396.MATCH_CONSTRAINT && this.f61075 == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C16567) arrayList3.get(0)).f53632 + c16568.f53628) - (((C16567) arrayList2.get(0)).f53632 + c16567.f53628), c17313.f56393);
                    C10445 c104411 = this.f61072;
                    int i15 = c104411.f33201;
                    int iMax = Math.max(c104411.f33215, iMin);
                    if (i15 > 0) {
                        iMax = Math.min(i15, iMax);
                    }
                    c17313.mo39242(iMax);
                }
                if (c17313.f53630) {
                    C16567 c165613 = (C16567) arrayList2.get(0);
                    C16567 c165614 = (C16567) arrayList3.get(0);
                    int i16 = c165613.f53632 + c16567.f53628;
                    int i17 = c165614.f53632 + c16568.f53628;
                    float fM26802 = this.f61072.m26802();
                    if (c165613 == c165614) {
                        i16 = c165613.f53632;
                        i17 = c165614.f53632;
                        fM26802 = 0.5f;
                    }
                    c16567.mo39242((int) ((((i17 - i16) - c17313.f53632) * fM26802) + i16 + 0.5f));
                    c16568.mo39242(c16567.f53632 + c17313.f53632);
                }
            }
        }
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10268() {
        C16567 c16567 = this.f61068;
        if (c16567.f53630) {
            this.f61072.m26855(c16567.f53632);
        }
    }
}
