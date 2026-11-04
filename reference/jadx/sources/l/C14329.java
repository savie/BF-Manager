package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819P */
/* JADX INFO: loaded from: classes5.dex */
public final class C14329 extends AbstractC18805 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22535 f45204;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16567 f45205;

    public C14329(C10445 c10445) {
        super(c10445);
        C16567 c16567 = new C16567(this);
        this.f45205 = c16567;
        this.f45204 = null;
        this.f61068.f53629 = EnumC24773.TOP;
        this.f61071.f53629 = EnumC24773.BOTTOM;
        c16567.f53629 = EnumC24773.BASELINE;
        this.f61074 = 1;
    }

    public final String toString() {
        return "VerticalRun " + this.f61072.m26841();
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ۤ */
    public final void mo10266() {
        this.f61070 = null;
        this.f61068.m39241();
        this.f61071.m39241();
        this.f45205.m39241();
        this.f61069.m39241();
        this.f61073 = false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m34755() {
        this.f61073 = false;
        C16567 c16567 = this.f61068;
        c16567.m39241();
        c16567.f53630 = false;
        C16567 c16568 = this.f61071;
        c16568.m39241();
        c16568.f53630 = false;
        C16567 c16569 = this.f45205;
        c16569.m39241();
        c16569.f53630 = false;
        this.f61069.f53630 = false;
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo10267() {
        return this.f61076 != EnumC19396.MATCH_CONSTRAINT || this.f61072.f33209 == 0;
    }

    @Override // l.AbstractC18805, l.InterfaceC1652
    /* JADX INFO: renamed from: ۙ */
    public final void mo5938(InterfaceC1652 interfaceC1652) {
        C10445 c10445;
        int i;
        float f;
        int i2;
        if (C3889.f13256[this.f61077.ordinal()] == 3) {
            C10445 c10446 = this.f61072;
            m43602(c10446.f33197, c10446.f33216, 1);
            return;
        }
        C17313 c17313 = this.f61069;
        if (c17313.f53631 && !c17313.f53630 && this.f61076 == EnumC19396.MATCH_CONSTRAINT) {
            C10445 c10447 = this.f61072;
            int i3 = c10447.f33209;
            if (i3 != 2) {
                if (i3 == 3 && c10447.f33245.f61069.f53630) {
                    int iM26837 = c10447.m26837();
                    if (iM26837 == -1) {
                        c10445 = this.f61072;
                        i = c10445.f33245.f61069.f53632;
                    } else {
                        if (iM26837 == 0) {
                            C10445 c10448 = this.f61072;
                            f = c10448.f33245.f61069.f53632 * c10448.f33239;
                            i2 = (int) (f + 0.5f);
                        } else if (iM26837 != 1) {
                            i2 = 0;
                        } else {
                            c10445 = this.f61072;
                            i = c10445.f33245.f61069.f53632;
                        }
                        c17313.mo39242(i2);
                    }
                    f = i / c10445.f33239;
                    i2 = (int) (f + 0.5f);
                    c17313.mo39242(i2);
                }
            } else {
                C10445 c10449 = c10447.f33252;
                if (c10449 != null) {
                    C17313 c17314 = c10449.f33195.f61069;
                    if (c17314.f53630) {
                        c17313.mo39242((int) ((c17314.f53632 * c10447.f33246) + 0.5f));
                    }
                }
            }
        }
        C16567 c16567 = this.f61068;
        boolean z = c16567.f53631;
        ArrayList arrayList = c16567.f53625;
        if (z) {
            C16567 c16568 = this.f61071;
            boolean z2 = c16568.f53631;
            ArrayList arrayList2 = c16568.f53625;
            if (z2) {
                if (c16567.f53630 && c16568.f53630 && c17313.f53630) {
                    return;
                }
                if (!c17313.f53630 && this.f61076 == EnumC19396.MATCH_CONSTRAINT) {
                    C10445 c104410 = this.f61072;
                    if (c104410.f33206 == 0 && !c104410.m26850()) {
                        C16567 c16569 = (C16567) arrayList.get(0);
                        C16567 c165610 = (C16567) arrayList2.get(0);
                        int i4 = c16569.f53632 + c16567.f53628;
                        int i5 = c165610.f53632 + c16568.f53628;
                        c16567.mo39242(i4);
                        c16568.mo39242(i5);
                        c17313.mo39242(i5 - i4);
                        return;
                    }
                }
                if (!c17313.f53630 && this.f61076 == EnumC19396.MATCH_CONSTRAINT && this.f61075 == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C16567 c165611 = (C16567) arrayList.get(0);
                    int i6 = (((C16567) arrayList2.get(0)).f53632 + c16568.f53628) - (c165611.f53632 + c16567.f53628);
                    int i7 = c17313.f56393;
                    if (i6 < i7) {
                        c17313.mo39242(i6);
                    } else {
                        c17313.mo39242(i7);
                    }
                }
                if (c17313.f53630 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C16567 c165612 = (C16567) arrayList.get(0);
                    C16567 c165613 = (C16567) arrayList2.get(0);
                    int i8 = c165612.f53632 + c16567.f53628;
                    int i9 = c165613.f53632 + c16568.f53628;
                    float fM26835 = this.f61072.m26835();
                    if (c165612 == c165613) {
                        i8 = c165612.f53632;
                        i9 = c165613.f53632;
                        fM26835 = 0.5f;
                    }
                    c16567.mo39242((int) ((((i9 - i8) - c17313.f53632) * fM26835) + i8 + 0.5f));
                    c16568.mo39242(c16567.f53632 + c17313.f53632);
                }
            }
        }
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
            c17313.mo39242(c10449.m26823());
        }
        boolean z2 = c17313.f53630;
        ArrayList arrayList = c17313.f53634;
        ArrayList arrayList2 = c17313.f53625;
        C16567 c16567 = this.f61071;
        C16567 c16568 = this.f61068;
        if (!z2) {
            C10445 c104410 = this.f61072;
            this.f61076 = c104410.f33210[1];
            if (c104410.m26849()) {
                this.f45204 = new C22535(this);
            }
            EnumC19396 enumC19396 = this.f61076;
            if (enumC19396 != EnumC19396.MATCH_CONSTRAINT) {
                if (enumC19396 == EnumC19396.MATCH_PARENT && (c10448 = this.f61072.f33252) != null && c10448.f33210[1] == EnumC19396.FIXED) {
                    int iM26823 = (c10448.m26823() - this.f61072.f33197.m3108()) - this.f61072.f33216.m3108();
                    AbstractC18805.m43600(c16568, c10448.f33195.f61068, this.f61072.f33197.m3108());
                    AbstractC18805.m43600(c16567, c10448.f33195.f61071, -this.f61072.f33216.m3108());
                    c17313.mo39242(iM26823);
                    return;
                }
                if (enumC19396 == EnumC19396.FIXED) {
                    c17313.mo39242(this.f61072.m26823());
                }
            }
        } else if (this.f61076 == EnumC19396.MATCH_PARENT && (c10446 = (c10445 = this.f61072).f33252) != null && c10446.f33210[1] == EnumC19396.FIXED) {
            AbstractC18805.m43600(c16568, c10446.f33195.f61068, c10445.f33197.m3108());
            AbstractC18805.m43600(c16567, c10446.f33195.f61071, -this.f61072.f33216.m3108());
            return;
        }
        boolean z3 = c17313.f53630;
        C16567 c16569 = this.f45205;
        if (z3) {
            C10445 c104411 = this.f61072;
            if (c104411.f33208) {
                C0751[] c0751Arr = c104411.f33190;
                C0751 c0751 = c0751Arr[2];
                C0751 c0752 = c0751.f2744;
                if (c0752 != null && c0751Arr[3].f2744 != null) {
                    if (c104411.m26850()) {
                        c16568.f53628 = this.f61072.f33190[2].m3108();
                        c16567.f53628 = -this.f61072.f33190[3].m3108();
                    } else {
                        C16567 c16567M43598 = AbstractC18805.m43598(this.f61072.f33190[2]);
                        if (c16567M43598 != null) {
                            AbstractC18805.m43600(c16568, c16567M43598, this.f61072.f33190[2].m3108());
                        }
                        C16567 c16567M43599 = AbstractC18805.m43598(this.f61072.f33190[3]);
                        if (c16567M43599 != null) {
                            AbstractC18805.m43600(c16567, c16567M43599, -this.f61072.f33190[3].m3108());
                        }
                        c16568.f53626 = true;
                        c16567.f53626 = true;
                    }
                    if (this.f61072.m26849()) {
                        AbstractC18805.m43600(c16569, c16568, this.f61072.m26829());
                        return;
                    }
                    return;
                }
                if (c0752 != null) {
                    C16567 c16567M435910 = AbstractC18805.m43598(c0751);
                    if (c16567M435910 != null) {
                        AbstractC18805.m43600(c16568, c16567M435910, this.f61072.f33190[2].m3108());
                        AbstractC18805.m43600(c16567, c16568, c17313.f53632);
                        if (this.f61072.m26849()) {
                            AbstractC18805.m43600(c16569, c16568, this.f61072.m26829());
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0751 c0753 = c0751Arr[3];
                if (c0753.f2744 != null) {
                    C16567 c16567M435911 = AbstractC18805.m43598(c0753);
                    if (c16567M435911 != null) {
                        AbstractC18805.m43600(c16567, c16567M435911, -this.f61072.f33190[3].m3108());
                        AbstractC18805.m43600(c16568, c16567, -c17313.f53632);
                    }
                    if (this.f61072.m26849()) {
                        AbstractC18805.m43600(c16569, c16568, this.f61072.m26829());
                        return;
                    }
                    return;
                }
                C0751 c0754 = c0751Arr[4];
                if (c0754.f2744 != null) {
                    C16567 c16567M435912 = AbstractC18805.m43598(c0754);
                    if (c16567M435912 != null) {
                        AbstractC18805.m43600(c16569, c16567M435912, 0);
                        AbstractC18805.m43600(c16568, c16569, -this.f61072.m26829());
                        AbstractC18805.m43600(c16567, c16568, c17313.f53632);
                        return;
                    }
                    return;
                }
                if ((c104411 instanceof C14174) || c104411.f33252 == null || c104411.mo20495(EnumC18650.CENTER).f2744 != null) {
                    return;
                }
                C10445 c104412 = this.f61072;
                AbstractC18805.m43600(c16568, c104412.f33252.f33195.f61068, c104412.m26856());
                AbstractC18805.m43600(c16567, c16568, c17313.f53632);
                if (this.f61072.m26849()) {
                    AbstractC18805.m43600(c16569, c16568, this.f61072.m26829());
                    return;
                }
                return;
            }
        }
        if (z3 || this.f61076 != EnumC19396.MATCH_CONSTRAINT) {
            c17313.m39243((AbstractC18805) this);
        } else {
            C10445 c104413 = this.f61072;
            int i = c104413.f33209;
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
            } else if (i == 3 && !c104413.m26850()) {
                C10445 c104415 = this.f61072;
                if (c104415.f33206 != 3) {
                    C17313 c17315 = c104415.f33245.f61069;
                    arrayList2.add(c17315);
                    c17315.f53634.add(c17313);
                    c17313.f53626 = true;
                    arrayList.add(c16568);
                    arrayList.add(c16567);
                }
            }
        }
        C10445 c104416 = this.f61072;
        C0751[] c0751Arr2 = c104416.f33190;
        C0751 c0755 = c0751Arr2[2];
        C0751 c0756 = c0755.f2744;
        if (c0756 != null && c0751Arr2[3].f2744 != null) {
            if (c104416.m26850()) {
                c16568.f53628 = this.f61072.f33190[2].m3108();
                c16567.f53628 = -this.f61072.f33190[3].m3108();
            } else {
                C16567 c16567M435913 = AbstractC18805.m43598(this.f61072.f33190[2]);
                C16567 c16567M435914 = AbstractC18805.m43598(this.f61072.f33190[3]);
                c16567M435913.m39243((AbstractC18805) this);
                c16567M435914.m39243((AbstractC18805) this);
                this.f61077 = EnumC7618.CENTER;
            }
            if (this.f61072.m26849()) {
                m43603(c16569, c16568, 1, this.f45204);
            }
        } else if (c0756 != null) {
            C16567 c16567M435915 = AbstractC18805.m43598(c0755);
            if (c16567M435915 != null) {
                AbstractC18805.m43600(c16568, c16567M435915, this.f61072.f33190[2].m3108());
                m43603(c16567, c16568, 1, c17313);
                if (this.f61072.m26849()) {
                    m43603(c16569, c16568, 1, this.f45204);
                }
                EnumC19396 enumC19397 = this.f61076;
                EnumC19396 enumC19398 = EnumC19396.MATCH_CONSTRAINT;
                if (enumC19397 == enumC19398) {
                    C10445 c104417 = this.f61072;
                    if (c104417.f33239 > 0.0f) {
                        C6127 c6127 = c104417.f33245;
                        if (c6127.f61076 == enumC19398) {
                            c6127.f61069.f53634.add(c17313);
                            arrayList2.add(this.f61072.f33245.f61069);
                            c17313.f53636 = this;
                        }
                    }
                }
            }
        } else {
            C0751 c0757 = c0751Arr2[3];
            if (c0757.f2744 != null) {
                C16567 c16567M435916 = AbstractC18805.m43598(c0757);
                if (c16567M435916 != null) {
                    AbstractC18805.m43600(c16567, c16567M435916, -this.f61072.f33190[3].m3108());
                    m43603(c16568, c16567, -1, c17313);
                    if (this.f61072.m26849()) {
                        m43603(c16569, c16568, 1, this.f45204);
                    }
                }
            } else {
                C0751 c0758 = c0751Arr2[4];
                if (c0758.f2744 != null) {
                    C16567 c16567M435917 = AbstractC18805.m43598(c0758);
                    if (c16567M435917 != null) {
                        AbstractC18805.m43600(c16569, c16567M435917, 0);
                        m43603(c16568, c16569, -1, this.f45204);
                        m43603(c16567, c16568, 1, c17313);
                    }
                } else if (!(c104416 instanceof C14174) && (c10447 = c104416.f33252) != null) {
                    AbstractC18805.m43600(c16568, c10447.f33195.f61068, c104416.m26856());
                    m43603(c16567, c16568, 1, c17313);
                    if (this.f61072.m26849()) {
                        m43603(c16569, c16568, 1, this.f45204);
                    }
                    EnumC19396 enumC19399 = this.f61076;
                    EnumC19396 enumC193910 = EnumC19396.MATCH_CONSTRAINT;
                    if (enumC19399 == enumC193910) {
                        C10445 c104418 = this.f61072;
                        if (c104418.f33239 > 0.0f) {
                            C6127 c6128 = c104418.f33245;
                            if (c6128.f61076 == enumC193910) {
                                c6128.f61069.f53634.add(c17313);
                                arrayList2.add(this.f61072.f33245.f61069);
                                c17313.f53636 = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c17313.f53631 = true;
        }
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10268() {
        C16567 c16567 = this.f61068;
        if (c16567.f53630) {
            this.f61072.m26836(c16567.f53632);
        }
    }
}
