package l;

/* JADX INFO: renamed from: l.᩶᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes.dex */
public final class C21593 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 f68983;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12598 f68984;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18609 f68985;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12642 f68987;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18499 f68982 = new C18499();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18499 f68988 = new C18499();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC22295 f68986 = null;

    public C21593(C18609 c18609, C12598 c12598, C12642 c12642, AbstractC11781 abstractC11781) {
        this.f68985 = c18609;
        this.f68984 = c12598;
        this.f68987 = c12642;
        this.f68983 = abstractC11781;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16327 m49126() {
        AbstractC22295 abstractC22295M49124;
        C12598 c12598 = this.f68984;
        C18609 c18609 = this.f68985;
        int i = c18609.f60514.f51040;
        try {
            c18609.f60514.m37552((InterfaceC5075) c12598);
            C5816 c5816M49125 = m49125();
            if (c12598.f40435 == EnumC16081.INVOKE) {
                abstractC22295M49124 = m49123(c5816M49125);
            } else {
                abstractC22295M49124 = m49124();
            }
            C16327 c16327M37571 = c18609.f60514.m37571((AbstractC8036) abstractC22295M49124, this.f68988.m43093());
            c16327M37571.f50682 = c12598.f50682;
            c16327M37571.f26659 = c12598.f26659;
            c16327M37571.f26658 = c12598.f26658;
            return c16327M37571;
        } finally {
            c18609.f60514.f51040 = i;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m49127() {
        return this.f68986;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22295 m49123(C5816 c5816) {
        AbstractC22295 abstractC22295M37508;
        C12598 c12598 = this.f68984;
        C18609 c18609 = this.f68985;
        if (c5816 != null) {
            abstractC22295M37508 = c18609.f60514.m37508((AbstractC11781) c5816);
            AbstractC22664 abstractC22664 = (!c12598.f40433 || C18609.m43286(c18609, c12598.f40439, this.f68983)) ? c12598.f40436.f26659 : c12598.f40439.m29558().f38067;
            if (abstractC22664 == c18609.f60515.f48271.f38067) {
                abstractC22664 = c12598.f40436.f26659;
            }
            if (!c5816.f38067.f73596.mo29596((AbstractC11781) abstractC22664.f73596, c18609.f60504)) {
                abstractC22295M37508 = c18609.f60514.m37533((AbstractC8036) c18609.f60514.m37557(abstractC22664), abstractC22295M37508);
                abstractC22295M37508.f26659 = abstractC22664;
            }
        } else {
            abstractC22295M37508 = c12598.f40436;
        }
        C23041 c23041M37544 = c18609.f60514.m37544(abstractC22295M37508, c12598.f40439.f38072);
        AbstractC11781 abstractC11781 = c12598.f40439;
        c23041M37544.f74775 = abstractC11781;
        c23041M37544.f26659 = abstractC11781.mo29576(c18609.f60504);
        C15714 c15714 = c18609.f60514;
        C14769 c14769M35543 = C14769.m35543();
        AbstractC11781 abstractC11782 = c12598.f40439;
        C14769 c14769M43093 = this.f68982.m43093();
        C18609.m43284(c18609, abstractC11782, c14769M43093, c12598.f40440);
        C24533 c24533M37550 = c15714.m37550(c23041M37544, c14769M35543, c14769M43093);
        c24533M37550.f26659 = c12598.f40439.mo29576(c18609.f60504).mo31585();
        AbstractC22295 abstractC22295M38200 = c18609.f60497.m38200(c18609.f60504.m55132(((C12598) this.f68987.f79657).f40432.mo31585()), c18609.f60513, c24533M37550);
        C18609.m43297(c12598.f40440, abstractC22295M38200);
        return abstractC22295M38200;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private AbstractC22295 m49124() {
        C12598 c12598 = this.f68984;
        EnumC20803 enumC20803 = c12598.f40430;
        EnumC20803 enumC20804 = EnumC20803.f66611;
        C18609 c18609 = this.f68985;
        if (enumC20803 == enumC20804) {
            C15714 c15714 = c18609.f60514;
            AbstractC22295 abstractC22295M37557 = c18609.f60514.m37557(c18609.f60504.m55120(c12598.f40436.f26659));
            C15714 c15715 = c18609.f60514;
            C12510 c12510 = (C12510) this.f68988.first();
            c15715.getClass();
            C21549 c21549M37573 = c15714.m37573(abstractC22295M37557, C14769.of((Object) c15715.m37508((AbstractC11781) c12510.f40168)), null);
            c21549M37573.f26659 = c12598.f40436.f26659;
            return c21549M37573;
        }
        C15714 c15716 = c18609.f60514;
        C14769 c14769M35543 = C14769.m35543();
        AbstractC22295 abstractC22295M37558 = c18609.f60514.m37557(c12598.f40436.f26659);
        AbstractC11781 abstractC11781 = c12598.f40439;
        C14769 c14769M43093 = this.f68982.m43093();
        C18609.m43284(c18609, abstractC11781, c14769M43093, c12598.f40440);
        C18565 c18565M37539 = c15716.m37539((AbstractC22295) null, c14769M35543, abstractC22295M37558, c14769M43093, (C7926) null, false);
        AbstractC11781 abstractC11782 = c12598.f40439;
        c18565M37539.f60318 = abstractC11782;
        c18565M37539.f60322 = abstractC11782.mo29576(c18609.f60504);
        c18565M37539.f26659 = c12598.f40436.f26659;
        C18609.m43297(c12598.f40440, c18565M37539);
        return c18565M37539;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5816 m49122(String str, AbstractC22664 abstractC22664, boolean z) {
        C18609 c18609 = this.f68985;
        C5816 c5816 = new C5816(8589938688L, c18609.f60496.f49864.m51194(str), abstractC22664, this.f68983);
        c5816.f19997 = this.f68984.f26658;
        this.f68988.m43089(c18609.f60514.m37523(c5816, (AbstractC22295) null));
        if (z) {
            this.f68982.m43089(c18609.f60514.m37508((AbstractC11781) c5816));
        }
        return c5816;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5816 m49125() {
        C5816 c5816M49122;
        C12642 c12642 = this.f68987;
        C18609 c18609 = c12642.f40556.f15895;
        C24705 c24705 = c18609.f60504;
        C24705 c24706 = c18609.f60504;
        AbstractC15581 abstractC15581 = c12642.f79657;
        AbstractC22664 abstractC22664M55132 = c24705.m55132(c24706.m55092(((C12598) abstractC15581).f50682.f73596).f38067);
        C14769 c14769Mo50621 = abstractC22664M55132.mo50621();
        C18609 c186010 = this.f68985;
        C24705 c24707 = c186010.f60504;
        C12598 c12598 = this.f68984;
        C14769 c14769Mo50622 = c12598.m37319(c24707).mo50621();
        int i = C23085.f74868[c12598.f40430.ordinal()];
        if (i == 3) {
            c5816M49122 = m49122("rec$", c12598.f40436.f26659, false);
            this.f68986 = c186010.f60500.m1931(c12598.f40436);
        } else if (i != 4) {
            c5816M49122 = null;
        } else {
            c5816M49122 = m49122("rec$", (AbstractC22664) abstractC22664M55132.mo50621().f48335, false);
            c14769Mo50621 = c14769Mo50621.f48336;
            c14769Mo50622 = c14769Mo50622.f48336;
        }
        C14769 c14769Mo50623 = c12598.f40439.f38067.mo50621();
        int iM35551 = c14769Mo50623.m35551();
        int iM35552 = c14769Mo50621.m35551();
        int i2 = ((C12598) abstractC15581).f40440 != null ? iM35551 - 1 : iM35551;
        boolean z = c12598.f40440 != null || iM35551 == c14769Mo50622.m35551();
        for (int i3 = 0; c14769Mo50623.m35550() && i3 < i2; i3++) {
            AbstractC22664 abstractC22664 = (AbstractC22664) c14769Mo50623.f48335;
            if (z) {
                EnumC18720 enumC18720Mo5501 = ((AbstractC22664) c14769Mo50622.f48335).mo5501();
                EnumC18720 enumC18720 = EnumC18720.INTERSECTION;
                if (enumC18720Mo5501 == enumC18720) {
                    abstractC22664 = (AbstractC22664) c14769Mo50621.f48335;
                }
                if (((AbstractC22664) c14769Mo50622.f48335).mo5501() == EnumC18720.TYPEVAR && ((C17969) c14769Mo50622.f48335).mo19992().mo5501() == enumC18720) {
                    abstractC22664 = (AbstractC22664) c14769Mo50621.f48335;
                }
            }
            m49122(C13645.m33382(i3, "x$"), abstractC22664, true);
            c14769Mo50623 = c14769Mo50623.f48336;
            c14769Mo50621 = c14769Mo50621.f48336;
            c14769Mo50622 = c14769Mo50622.f48336;
        }
        while (i2 < iM35552) {
            m49122(C13645.m33382(i2, "xva$"), c12598.f40440, true);
            i2++;
        }
        return c5816M49122;
    }
}
